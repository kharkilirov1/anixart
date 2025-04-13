package com.yandex.mobile.ads.impl;

import android.text.Layout;
import androidx.annotation.Nullable;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class k81 extends i11 {

    /* renamed from: n */
    private static final Pattern f51891n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: o */
    private static final Pattern f51892o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: p */
    private static final Pattern f51893p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: q */
    public static final Pattern f51894q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: r */
    public static final Pattern f51895r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: s */
    private static final Pattern f51896s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: t */
    private static final Pattern f51897t = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: u */
    private static final C5327b f51898u = new C5327b(30.0f, 1, 1);

    /* renamed from: v */
    private static final C5326a f51899v = new C5326a(15);

    /* renamed from: m */
    private final XmlPullParserFactory f51900m;

    /* renamed from: com.yandex.mobile.ads.impl.k81$a */
    public static final class C5326a {

        /* renamed from: a */
        public final int f51901a;

        public C5326a(int i2) {
            this.f51901a = i2;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k81$b */
    public static final class C5327b {

        /* renamed from: a */
        public final float f51902a;

        /* renamed from: b */
        public final int f51903b;

        /* renamed from: c */
        public final int f51904c;

        public C5327b(float f2, int i2, int i3) {
            this.f51902a = f2;
            this.f51903b = i2;
            this.f51904c = i3;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k81$c */
    public static final class C5328c {

        /* renamed from: a */
        public final int f51905a;

        /* renamed from: b */
        public final int f51906b;

        public C5328c(int i2, int i3) {
            this.f51905a = i2;
            this.f51906b = i3;
        }
    }

    public k81() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f51900m = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    @Nullable
    /* renamed from: b */
    private static C5328c m26081b(XmlPullParser xmlPullParser) {
        String m29228a = vj1.m29228a(xmlPullParser, "extent");
        if (m29228a == null) {
            return null;
        }
        Matcher matcher = f51896s.matcher(m29228a);
        if (!matcher.matches()) {
            ai1.m22527a("Ignoring non-pixel tts extent: ", m29228a, "TtmlDecoder");
            return null;
        }
        try {
            String group = matcher.group(1);
            Objects.requireNonNull(group);
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            Objects.requireNonNull(group2);
            return new C5328c(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            ai1.m22527a("Ignoring malformed tts extent: ", m29228a, "TtmlDecoder");
            return null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.i11
    /* renamed from: a */
    public final w41 mo23247a(byte[] bArr, int i2, boolean z) throws y41 {
        C5327b c5327b;
        try {
            XmlPullParser newPullParser = this.f51900m.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new m81("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            C5328c c5328c = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C5327b c5327b2 = f51898u;
            C5326a c5326a = f51899v;
            p81 p81Var = null;
            int i3 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                l81 l81Var = (l81) arrayDeque.peek();
                if (i3 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            c5327b2 = m26073a(newPullParser);
                            c5326a = m26072a(newPullParser, f51899v);
                            c5328c = m26081b(newPullParser);
                        }
                        C5328c c5328c2 = c5328c;
                        C5327b c5327b3 = c5327b2;
                        C5326a c5326a2 = c5326a;
                        if (m26079a(name)) {
                            if ("head".equals(name)) {
                                c5327b = c5327b3;
                                m26078a(newPullParser, hashMap, c5326a2, c5328c2, hashMap2, hashMap3);
                            } else {
                                c5327b = c5327b3;
                                try {
                                    l81 m26074a = m26074a(newPullParser, l81Var, hashMap2, c5327b);
                                    arrayDeque.push(m26074a);
                                    if (l81Var != null) {
                                        l81Var.m26393a(m26074a);
                                    }
                                } catch (y41 e2) {
                                    d90.m23840b("TtmlDecoder", "Suppressing parser error", e2);
                                }
                            }
                            c5327b2 = c5327b;
                            c5328c = c5328c2;
                            c5326a = c5326a2;
                        } else {
                            d90.m23841c("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            c5327b = c5327b3;
                        }
                        c5327b2 = c5327b;
                        c5328c = c5328c2;
                        c5326a = c5326a2;
                        i3++;
                    } else if (eventType == 4) {
                        Objects.requireNonNull(l81Var);
                        l81Var.m26393a(l81.m26384a(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            l81 l81Var2 = (l81) arrayDeque.peek();
                            Objects.requireNonNull(l81Var2);
                            p81Var = new p81(l81Var2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                    newPullParser.next();
                } else {
                    if (eventType != 2) {
                        if (eventType == 3) {
                            i3--;
                        }
                        newPullParser.next();
                    }
                    i3++;
                    newPullParser.next();
                }
            }
            if (p81Var != null) {
                return p81Var;
            }
            throw new y41("No TTML subtitles found");
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        } catch (XmlPullParserException e4) {
            throw new y41("Unable to decode source", e4);
        }
    }

    @Nullable
    /* renamed from: b */
    private static Layout.Alignment m26080b(String str) {
        String m24832b = C5114ga.m24832b(str);
        Objects.requireNonNull(m24832b);
        switch (m24832b) {
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

    /* renamed from: a */
    private static C5327b m26073a(XmlPullParser xmlPullParser) throws y41 {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f2 = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i2 = s91.f54530a;
            if (attributeValue2.split(" ", -1).length == 2) {
                f2 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
            } else {
                throw new y41("frameRateMultiplier doesn't have 2 parts");
            }
        }
        C5327b c5327b = f51898u;
        int i3 = c5327b.f51903b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i3 = Integer.parseInt(attributeValue3);
        }
        int i4 = c5327b.f51904c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i4 = Integer.parseInt(attributeValue4);
        }
        return new C5327b(parseInt * f2, i3, i4);
    }

    /* renamed from: a */
    private static C5326a m26072a(XmlPullParser xmlPullParser, C5326a c5326a) throws y41 {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return c5326a;
        }
        Matcher matcher = f51897t.matcher(attributeValue);
        if (!matcher.matches()) {
            ai1.m22527a("Ignoring malformed cell resolution: ", attributeValue, "TtmlDecoder");
            return c5326a;
        }
        try {
            String group = matcher.group(1);
            Objects.requireNonNull(group);
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            Objects.requireNonNull(group2);
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt != 0 && parseInt2 != 0) {
                return new C5326a(parseInt2);
            }
            throw new y41("Invalid cell resolution " + parseInt + " " + parseInt2);
        } catch (NumberFormatException unused) {
            ai1.m22527a("Ignoring malformed cell resolution: ", attributeValue, "TtmlDecoder");
            return c5326a;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0188  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m26078a(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, com.yandex.mobile.ads.impl.k81.C5326a r22, @androidx.annotation.Nullable com.yandex.mobile.ads.impl.k81.C5328c r23, java.util.HashMap r24, java.util.HashMap r25) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            Method dump skipped, instructions count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.k81.m26078a(org.xmlpull.v1.XmlPullParser, java.util.HashMap, com.yandex.mobile.ads.impl.k81$a, com.yandex.mobile.ads.impl.k81$c, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01f1, code lost:
    
        if (r3.equals("text") == false) goto L107;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.yandex.mobile.ads.impl.o81 m26076a(org.xmlpull.v1.XmlPullParser r12, com.yandex.mobile.ads.impl.o81 r13) {
        /*
            Method dump skipped, instructions count: 944
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.k81.m26076a(org.xmlpull.v1.XmlPullParser, com.yandex.mobile.ads.impl.o81):com.yandex.mobile.ads.impl.o81");
    }

    /* renamed from: a */
    private static o81 m26075a(@Nullable o81 o81Var) {
        return o81Var == null ? new o81() : o81Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private static l81 m26074a(XmlPullParser xmlPullParser, @Nullable l81 l81Var, HashMap hashMap, C5327b c5327b) throws y41 {
        long j2;
        long j3;
        char c2;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        o81 m26076a = m26076a(xmlPullParser, (o81) null);
        String str = null;
        String str2 = "";
        long j4 = -9223372036854775807L;
        long j5 = -9223372036854775807L;
        long j6 = -9223372036854775807L;
        String[] strArr = null;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeName = xmlPullParser.getAttributeName(i2);
            String attributeValue = xmlPullParser.getAttributeValue(i2);
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
            switch (c2) {
                case 0:
                    if (!hashMap.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j6 = m26071a(attributeValue, c5327b);
                    break;
                case 2:
                    j5 = m26071a(attributeValue, c5327b);
                    break;
                case 3:
                    j4 = m26071a(attributeValue, c5327b);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        int i3 = s91.f54530a;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length > 0) {
                        strArr = split;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (l81Var != null) {
            long j7 = l81Var.f52303d;
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
        long j8 = j4;
        if (j5 == j2) {
            if (j6 != j2) {
                j3 = j8 + j6;
            } else if (l81Var != null) {
                long j9 = l81Var.f52304e;
                if (j9 != j2) {
                    j3 = j9;
                }
            }
            return l81.m26385a(xmlPullParser.getName(), j8, j3, m26076a, strArr, str2, str, l81Var);
        }
        j3 = j5;
        return l81.m26385a(xmlPullParser.getName(), j8, j3, m26076a, strArr, str2, str, l81Var);
    }

    /* renamed from: a */
    private static boolean m26079a(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    /* renamed from: a */
    private static void m26077a(String str, o81 o81Var) throws y41 {
        Matcher matcher;
        String group;
        int i2 = s91.f54530a;
        String[] split = str.split("\\s+", -1);
        if (split.length == 1) {
            matcher = f51893p.matcher(str);
        } else if (split.length == 2) {
            matcher = f51893p.matcher(split[1]);
            d90.m23842d("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new y41(C0000a.m18o(l60.m26356a("Invalid number of entries for fontSize: "), split.length, "."));
        }
        if (matcher.matches()) {
            group = matcher.group(3);
            Objects.requireNonNull(group);
            group.hashCode();
            switch (group) {
                case "%":
                    o81Var.m27036c(3);
                    break;
                case "em":
                    o81Var.m27036c(2);
                    break;
                case "px":
                    o81Var.m27036c(1);
                    break;
                default:
                    throw new y41(C0000a.m16m("Invalid unit for fontSize: '", group, "'."));
            }
            String group2 = matcher.group(1);
            Objects.requireNonNull(group2);
            o81Var.m27026a(Float.parseFloat(group2));
            return;
        }
        throw new y41(C0000a.m16m("Invalid expression for fontSize: '", str, "'."));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ad, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long m26071a(java.lang.String r13, com.yandex.mobile.ads.impl.k81.C5327b r14) throws com.yandex.mobile.ads.impl.y41 {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.k81.m26071a(java.lang.String, com.yandex.mobile.ads.impl.k81$b):long");
    }
}
