package com.google.android.exoplayer2.text.ttml;

import android.text.Layout;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.XmlPullParserUtil;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public final class TtmlDecoder extends SimpleSubtitleDecoder {

    /* renamed from: p */
    public static final Pattern f13726p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: q */
    public static final Pattern f13727q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: r */
    public static final Pattern f13728r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: s */
    public static final Pattern f13729s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: t */
    public static final Pattern f13730t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: u */
    public static final Pattern f13731u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: v */
    public static final Pattern f13732v = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: w */
    public static final FrameAndTickRate f13733w = new FrameAndTickRate(30.0f, 1, 1);

    /* renamed from: x */
    public static final CellResolution f13734x = new CellResolution(32, 15);

    /* renamed from: o */
    public final XmlPullParserFactory f13735o;

    public static final class CellResolution {

        /* renamed from: a */
        public final int f13736a;

        public CellResolution(int i2, int i3) {
            this.f13736a = i3;
        }
    }

    public static final class FrameAndTickRate {

        /* renamed from: a */
        public final float f13737a;

        /* renamed from: b */
        public final int f13738b;

        /* renamed from: c */
        public final int f13739c;

        public FrameAndTickRate(float f2, int i2, int i3) {
            this.f13737a = f2;
            this.f13738b = i2;
            this.f13739c = i3;
        }
    }

    public static final class TtsExtent {

        /* renamed from: a */
        public final int f13740a;

        /* renamed from: b */
        public final int f13741b;

        public TtsExtent(int i2, int i3) {
            this.f13740a = i2;
            this.f13741b = i3;
        }
    }

    public TtmlDecoder() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f13735o = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    /* renamed from: m */
    public static TtmlStyle m7242m(@Nullable TtmlStyle ttmlStyle) {
        return ttmlStyle == null ? new TtmlStyle() : ttmlStyle;
    }

    /* renamed from: n */
    public static boolean m7243n(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    @Nullable
    /* renamed from: o */
    public static Layout.Alignment m7244o(String str) {
        String m11123c = Ascii.m11123c(str);
        Objects.requireNonNull(m11123c);
        switch (m11123c) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    /* renamed from: p */
    public static CellResolution m7245p(XmlPullParser xmlPullParser, CellResolution cellResolution) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return cellResolution;
        }
        Matcher matcher = f13732v.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w("TtmlDecoder", attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return cellResolution;
        }
        try {
            String group = matcher.group(1);
            Objects.requireNonNull(group);
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            Objects.requireNonNull(group2);
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt != 0 && parseInt2 != 0) {
                return new CellResolution(parseInt, parseInt2);
            }
            StringBuilder sb = new StringBuilder(47);
            sb.append("Invalid cell resolution ");
            sb.append(parseInt);
            sb.append(" ");
            sb.append(parseInt2);
            throw new SubtitleDecoderException(sb.toString());
        } catch (NumberFormatException unused) {
            Log.w("TtmlDecoder", attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return cellResolution;
        }
    }

    /* renamed from: q */
    public static void m7246q(String str, TtmlStyle ttmlStyle) throws SubtitleDecoderException {
        Matcher matcher;
        String group;
        int i2 = Util.f14736a;
        String[] split = str.split("\\s+", -1);
        if (split.length == 1) {
            matcher = f13728r.matcher(str);
        } else {
            if (split.length != 2) {
                int length = split.length;
                StringBuilder sb = new StringBuilder(52);
                sb.append("Invalid number of entries for fontSize: ");
                sb.append(length);
                sb.append(".");
                throw new SubtitleDecoderException(sb.toString());
            }
            matcher = f13728r.matcher(split[1]);
            Log.w("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException(C0576a.m4115n(str.length() + 36, "Invalid expression for fontSize: '", str, "'."));
        }
        group = matcher.group(3);
        Objects.requireNonNull(group);
        group.hashCode();
        switch (group) {
            case "%":
                ttmlStyle.f13774j = 3;
                break;
            case "em":
                ttmlStyle.f13774j = 2;
                break;
            case "px":
                ttmlStyle.f13774j = 1;
                break;
            default:
                throw new SubtitleDecoderException(C0576a.m4115n(group.length() + 30, "Invalid unit for fontSize: '", group, "'."));
        }
        String group2 = matcher.group(1);
        Objects.requireNonNull(group2);
        ttmlStyle.f13775k = Float.parseFloat(group2);
    }

    /* renamed from: r */
    public static FrameAndTickRate m7247r(XmlPullParser xmlPullParser) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f2 = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i2 = Util.f14736a;
            if (attributeValue2.split(" ", -1).length != 2) {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            f2 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        }
        FrameAndTickRate frameAndTickRate = f13733w;
        int i3 = frameAndTickRate.f13738b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i3 = Integer.parseInt(attributeValue3);
        }
        int i4 = frameAndTickRate.f13739c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i4 = Integer.parseInt(attributeValue4);
        }
        return new FrameAndTickRate(parseInt * f2, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x026b  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlStyle> m7248s(org.xmlpull.v1.XmlPullParser r18, java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlStyle> r19, com.google.android.exoplayer2.text.ttml.TtmlDecoder.CellResolution r20, @androidx.annotation.Nullable com.google.android.exoplayer2.text.ttml.TtmlDecoder.TtsExtent r21, java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlRegion> r22, java.util.Map<java.lang.String, java.lang.String> r23) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            Method dump skipped, instructions count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.TtmlDecoder.m7248s(org.xmlpull.v1.XmlPullParser, java.util.Map, com.google.android.exoplayer2.text.ttml.TtmlDecoder$CellResolution, com.google.android.exoplayer2.text.ttml.TtmlDecoder$TtsExtent, java.util.Map, java.util.Map):java.util.Map");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: t */
    public static TtmlNode m7249t(XmlPullParser xmlPullParser, @Nullable TtmlNode ttmlNode, Map<String, TtmlRegion> map, FrameAndTickRate frameAndTickRate) throws SubtitleDecoderException {
        long j2;
        long j3;
        char c2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int attributeCount = xmlPullParser.getAttributeCount();
        TtmlStyle m7250u = m7250u(xmlPullParser2, null);
        String str = null;
        String str2 = "";
        long j4 = -9223372036854775807L;
        long j5 = -9223372036854775807L;
        long j6 = -9223372036854775807L;
        String[] strArr = null;
        int i2 = 0;
        while (i2 < attributeCount) {
            String attributeName = xmlPullParser2.getAttributeName(i2);
            String attributeValue = xmlPullParser2.getAttributeValue(i2);
            Objects.requireNonNull(attributeName);
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            if (c2 != 0) {
                if (c2 == 1) {
                    j6 = m7252w(attributeValue, frameAndTickRate);
                } else if (c2 == 2) {
                    j5 = m7252w(attributeValue, frameAndTickRate);
                } else if (c2 == 3) {
                    j4 = m7252w(attributeValue, frameAndTickRate);
                } else if (c2 == 4) {
                    String[] m7251v = m7251v(attributeValue);
                    if (m7251v.length > 0) {
                        strArr = m7251v;
                    }
                } else if (c2 == 5 && attributeValue.startsWith("#")) {
                    str = attributeValue.substring(1);
                }
            } else if (map.containsKey(attributeValue)) {
                str2 = attributeValue;
            }
            i2++;
            xmlPullParser2 = xmlPullParser;
        }
        if (ttmlNode != null) {
            long j7 = ttmlNode.f13745d;
            j2 = -9223372036854775807L;
            if (j7 != -9223372036854775807L) {
                if (j4 != -9223372036854775807L) {
                    j4 += j7;
                }
                if (j5 != -9223372036854775807L) {
                    j5 += j7;
                }
            }
        } else {
            j2 = -9223372036854775807L;
        }
        if (j5 == j2) {
            if (j6 != j2) {
                j3 = j4 + j6;
            } else if (ttmlNode != null) {
                long j8 = ttmlNode.f13746e;
                if (j8 != j2) {
                    j3 = j8;
                }
            }
            return new TtmlNode(xmlPullParser.getName(), null, j4, j3, m7250u, strArr, str2, str, ttmlNode);
        }
        j3 = j5;
        return new TtmlNode(xmlPullParser.getName(), null, j4, j3, m7250u, strArr, str2, str, ttmlNode);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01e7, code lost:
    
        if (r5.equals("auto") != false) goto L129;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x027c  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.text.ttml.TtmlStyle m7250u(org.xmlpull.v1.XmlPullParser r16, com.google.android.exoplayer2.text.ttml.TtmlStyle r17) {
        /*
            Method dump skipped, instructions count: 1314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.TtmlDecoder.m7250u(org.xmlpull.v1.XmlPullParser, com.google.android.exoplayer2.text.ttml.TtmlStyle):com.google.android.exoplayer2.text.ttml.TtmlStyle");
    }

    /* renamed from: v */
    public static String[] m7251v(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        int i2 = Util.f14736a;
        return trim.split("\\s+", -1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ad, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long m7252w(java.lang.String r13, com.google.android.exoplayer2.text.ttml.TtmlDecoder.FrameAndTickRate r14) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.TtmlDecoder.m7252w(java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlDecoder$FrameAndTickRate):long");
    }

    @Nullable
    /* renamed from: x */
    public static TtsExtent m7253x(XmlPullParser xmlPullParser) {
        String m7758a = XmlPullParserUtil.m7758a(xmlPullParser, "extent");
        if (m7758a == null) {
            return null;
        }
        Matcher matcher = f13731u.matcher(m7758a);
        if (!matcher.matches()) {
            Log.w("TtmlDecoder", m7758a.length() != 0 ? "Ignoring non-pixel tts extent: ".concat(m7758a) : new String("Ignoring non-pixel tts extent: "));
            return null;
        }
        try {
            String group = matcher.group(1);
            Objects.requireNonNull(group);
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            Objects.requireNonNull(group2);
            return new TtsExtent(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            Log.w("TtmlDecoder", m7758a.length() != 0 ? "Ignoring malformed tts extent: ".concat(m7758a) : new String("Ignoring malformed tts extent: "));
            return null;
        }
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    /* renamed from: l */
    public Subtitle mo7185l(byte[] bArr, int i2, boolean z) throws SubtitleDecoderException {
        FrameAndTickRate frameAndTickRate;
        try {
            XmlPullParser newPullParser = this.f13735o.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new TtmlRegion("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            TtsExtent ttsExtent = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            FrameAndTickRate frameAndTickRate2 = f13733w;
            CellResolution cellResolution = f13734x;
            TtmlSubtitle ttmlSubtitle = null;
            int i3 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                TtmlNode ttmlNode = (TtmlNode) arrayDeque.peek();
                if (i3 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            frameAndTickRate2 = m7247r(newPullParser);
                            cellResolution = m7245p(newPullParser, f13734x);
                            ttsExtent = m7253x(newPullParser);
                        }
                        TtsExtent ttsExtent2 = ttsExtent;
                        FrameAndTickRate frameAndTickRate3 = frameAndTickRate2;
                        CellResolution cellResolution2 = cellResolution;
                        if (!m7243n(name)) {
                            String valueOf = String.valueOf(newPullParser.getName());
                            Log.i("TtmlDecoder", valueOf.length() != 0 ? "Ignoring unsupported tag: ".concat(valueOf) : new String("Ignoring unsupported tag: "));
                            i3++;
                            frameAndTickRate = frameAndTickRate3;
                        } else if ("head".equals(name)) {
                            frameAndTickRate = frameAndTickRate3;
                            m7248s(newPullParser, hashMap, cellResolution2, ttsExtent2, hashMap2, hashMap3);
                        } else {
                            frameAndTickRate = frameAndTickRate3;
                            try {
                                TtmlNode m7249t = m7249t(newPullParser, ttmlNode, hashMap2, frameAndTickRate);
                                arrayDeque.push(m7249t);
                                if (ttmlNode != null) {
                                    ttmlNode.m7256a(m7249t);
                                }
                            } catch (SubtitleDecoderException e2) {
                                com.google.android.exoplayer2.util.Log.m7588e("TtmlDecoder", "Suppressing parser error", e2);
                                i3++;
                            }
                        }
                        frameAndTickRate2 = frameAndTickRate;
                        ttsExtent = ttsExtent2;
                        cellResolution = cellResolution2;
                    } else if (eventType == 4) {
                        Objects.requireNonNull(ttmlNode);
                        TtmlNode m7254b = TtmlNode.m7254b(newPullParser.getText());
                        if (ttmlNode.f13754m == null) {
                            ttmlNode.f13754m = new ArrayList();
                        }
                        ttmlNode.f13754m.add(m7254b);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            TtmlNode ttmlNode2 = (TtmlNode) arrayDeque.peek();
                            Objects.requireNonNull(ttmlNode2);
                            ttmlSubtitle = new TtmlSubtitle(ttmlNode2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i3++;
                } else if (eventType == 3) {
                    i3--;
                }
                newPullParser.next();
            }
            if (ttmlSubtitle != null) {
                return ttmlSubtitle;
            }
            throw new SubtitleDecoderException("No TTML subtitles found");
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        } catch (XmlPullParserException e4) {
            throw new SubtitleDecoderException("Unable to decode source", e4);
        }
    }
}
