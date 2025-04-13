package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.source.dash.manifest.SegmentBase;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.XmlPullParserUtil;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public class DashManifestParser extends DefaultHandler implements ParsingLoadable.Parser<DashManifest> {

    /* renamed from: b */
    public static final Pattern f12940b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c */
    public static final Pattern f12941c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d */
    public static final Pattern f12942d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e */
    public static final int[] f12943e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a */
    public final XmlPullParserFactory f12944a;

    public static final class RepresentationInfo {

        /* renamed from: a */
        public final Format f12945a;

        /* renamed from: b */
        public final ImmutableList<BaseUrl> f12946b;

        /* renamed from: c */
        public final SegmentBase f12947c;

        /* renamed from: d */
        @Nullable
        public final String f12948d;

        /* renamed from: e */
        public final ArrayList<DrmInitData.SchemeData> f12949e;

        /* renamed from: f */
        public final ArrayList<Descriptor> f12950f;

        /* renamed from: g */
        public final long f12951g;

        /* renamed from: h */
        public final List<Descriptor> f12952h;

        /* renamed from: i */
        public final List<Descriptor> f12953i;

        public RepresentationInfo(Format format, List<BaseUrl> list, SegmentBase segmentBase, @Nullable String str, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<Descriptor> arrayList2, List<Descriptor> list2, List<Descriptor> list3, long j2) {
            this.f12945a = format;
            this.f12946b = ImmutableList.m11634y(list);
            this.f12947c = segmentBase;
            this.f12948d = str;
            this.f12949e = arrayList;
            this.f12950f = arrayList2;
            this.f12952h = list2;
            this.f12953i = list3;
            this.f12951g = j2;
        }
    }

    public DashManifestParser() {
        try {
            this.f12944a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    /* renamed from: c */
    public static int m7043c(int i2, int i3) {
        if (i2 == -1) {
            return i3;
        }
        if (i3 == -1) {
            return i2;
        }
        Assertions.m7516d(i2 == i3);
        return i2;
    }

    /* renamed from: d */
    public static long m7044d(long j2, long j3) {
        if (j3 != -9223372036854775807L) {
            j2 = j3;
        }
        if (j2 == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j2;
    }

    /* renamed from: e */
    public static void m7045e(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        if (XmlPullParserUtil.m7760c(xmlPullParser)) {
            int i2 = 1;
            while (i2 != 0) {
                xmlPullParser.next();
                if (XmlPullParserUtil.m7760c(xmlPullParser)) {
                    i2++;
                } else {
                    if (xmlPullParser.getEventType() == 3) {
                        i2--;
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public static Descriptor m7046k(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!XmlPullParserUtil.m7759b(xmlPullParser, str));
        return new Descriptor(attributeValue, attributeValue2, str2);
    }

    /* renamed from: l */
    public static long m7047l(XmlPullParser xmlPullParser, String str, long j2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j2;
        }
        Matcher matcher = Util.f14743h.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        long parseDouble6 = (long) ((parseDouble5 + (group6 != null ? Double.parseDouble(group6) : 0.0d)) * 1000.0d);
        return isEmpty ? -parseDouble6 : parseDouble6;
    }

    /* renamed from: m */
    public static float m7048m(XmlPullParser xmlPullParser, float f2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f2;
        }
        Matcher matcher = f12940b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f2;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        return !TextUtils.isEmpty(matcher.group(2)) ? parseInt / Integer.parseInt(r2) : parseInt;
    }

    /* renamed from: n */
    public static int m7049n(XmlPullParser xmlPullParser, String str, int i2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i2 : Integer.parseInt(attributeValue);
    }

    /* renamed from: o */
    public static long m7050o(XmlPullParser xmlPullParser, String str, long j2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j2 : Long.parseLong(attributeValue);
    }

    /* renamed from: x */
    public static String m7051x(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                m7045e(xmlPullParser);
            }
        } while (!XmlPullParserUtil.m7759b(xmlPullParser, str));
        return str2;
    }

    @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
    /* renamed from: a */
    public DashManifest mo6752a(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser newPullParser = this.f12944a.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return m7058p(newPullParser, new BaseUrl(uri.toString()));
            }
            throw ParserException.m5908b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e2) {
            throw ParserException.m5908b(null, e2);
        }
    }

    /* renamed from: b */
    public final long m7052b(List<SegmentBase.SegmentTimelineElement> list, long j2, long j3, int i2, long j4) {
        int i3;
        if (i2 >= 0) {
            i3 = i2 + 1;
        } else {
            int i4 = Util.f14736a;
            i3 = (int) ((((j4 - j2) + j3) - 1) / j3);
        }
        for (int i5 = 0; i5 < i3; i5++) {
            list.add(new SegmentBase.SegmentTimelineElement(j2, j3));
            j2 += j3;
        }
        return j2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (r1 != 3) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009e, code lost:
    
        if (r0.equals("4000") == false) goto L56;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m7053f(org.xmlpull.v1.XmlPullParser r9) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.m7053f(org.xmlpull.v1.XmlPullParser):int");
    }

    /* renamed from: g */
    public long m7054g(XmlPullParser xmlPullParser, long j2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j2;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    /* renamed from: h */
    public List<BaseUrl> m7055h(XmlPullParser xmlPullParser, List<BaseUrl> list) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 1;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String m7051x = m7051x(xmlPullParser, "BaseURL");
        if (attributeValue3 == null) {
            attributeValue3 = m7051x;
        }
        if ((m7051x == null || UriUtil.m7698a(m7051x)[0] == -1) ? false : true) {
            return Lists.m11737d(new BaseUrl(m7051x, attributeValue3, parseInt, parseInt2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            BaseUrl baseUrl = list.get(i2);
            arrayList.add(new BaseUrl(UriUtil.m7700c(baseUrl.f12923a, m7051x), baseUrl.f12924b, baseUrl.f12925c, baseUrl.f12926d));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b3  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair<java.lang.String, com.google.android.exoplayer2.drm.DrmInitData.SchemeData> m7056i(org.xmlpull.v1.XmlPullParser r14) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.m7056i(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* renamed from: j */
    public int m7057j(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (!TextUtils.isEmpty(attributeValue)) {
            if ("audio".equals(attributeValue)) {
                return 1;
            }
            if ("video".equals(attributeValue)) {
                return 2;
            }
            if ("text".equals(attributeValue)) {
                return 3;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0870, code lost:
    
        if ("audio/eac3-joc".equals(r0) == false) goto L260;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x10fc A[LOOP:3: B:110:0x026c->B:118:0x10fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x1095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0d93 A[LOOP:4: B:141:0x037c->B:149:0x0d93, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0c8b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0ae9 A[LOOP:8: B:251:0x0585->B:260:0x0ae9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x07be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x1176 A[LOOP:0: B:20:0x009b->B:28:0x1176, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x08af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x1143 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0aa3  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0ab5  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0ab8  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0aa6  */
    /* JADX WARN: Type inference failed for: r3v68, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r3v73 */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.source.dash.manifest.DashManifest m7058p(org.xmlpull.v1.XmlPullParser r146, com.google.android.exoplayer2.source.dash.manifest.BaseUrl r147) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 4528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.m7058p(org.xmlpull.v1.XmlPullParser, com.google.android.exoplayer2.source.dash.manifest.BaseUrl):com.google.android.exoplayer2.source.dash.manifest.DashManifest");
    }

    /* renamed from: q */
    public RangedUri m7059q(XmlPullParser xmlPullParser, String str, String str2) {
        long j2;
        long j3;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j2 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j3 = (Long.parseLong(split[1]) - j2) + 1;
                return new RangedUri(attributeValue, j2, j3);
            }
        } else {
            j2 = 0;
        }
        j3 = -1;
        return new RangedUri(attributeValue, j2, j3);
    }

    /* renamed from: r */
    public int m7060r(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* renamed from: s */
    public int m7061s(List<Descriptor> list) {
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (Ascii.m11121a("http://dashif.org/guidelines/trickmode", list.get(i3).f12954a)) {
                i2 |= 16384;
            }
        }
        return i2;
    }

    /* renamed from: t */
    public SegmentBase.SingleSegmentBase m7062t(XmlPullParser xmlPullParser, @Nullable SegmentBase.SingleSegmentBase singleSegmentBase) throws XmlPullParserException, IOException {
        long j2;
        long j3;
        long m7050o = m7050o(xmlPullParser, "timescale", singleSegmentBase != null ? singleSegmentBase.f12986b : 1L);
        long m7050o2 = m7050o(xmlPullParser, "presentationTimeOffset", singleSegmentBase != null ? singleSegmentBase.f12987c : 0L);
        long j4 = singleSegmentBase != null ? singleSegmentBase.f13000d : 0L;
        long j5 = singleSegmentBase != null ? singleSegmentBase.f13001e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong = Long.parseLong(split[0]);
            j2 = (Long.parseLong(split[1]) - parseLong) + 1;
            j3 = parseLong;
        } else {
            j2 = j5;
            j3 = j4;
        }
        RangedUri rangedUri = singleSegmentBase != null ? singleSegmentBase.f12985a : null;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.m7761d(xmlPullParser, "Initialization")) {
                rangedUri = m7059q(xmlPullParser, "sourceURL", "range");
            } else {
                m7045e(xmlPullParser);
            }
        } while (!XmlPullParserUtil.m7759b(xmlPullParser, "SegmentBase"));
        return new SegmentBase.SingleSegmentBase(rangedUri, m7050o, m7050o2, j3, j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    public SegmentBase.SegmentList m7063u(XmlPullParser xmlPullParser, @Nullable SegmentBase.SegmentList segmentList, long j2, long j3, long j4, long j5, long j6) throws XmlPullParserException, IOException {
        RangedUri rangedUri;
        List list;
        List<SegmentBase.SegmentTimelineElement> list2;
        long m7050o = m7050o(xmlPullParser, "timescale", segmentList != null ? segmentList.f12986b : 1L);
        long m7050o2 = m7050o(xmlPullParser, "presentationTimeOffset", segmentList != null ? segmentList.f12987c : 0L);
        long m7050o3 = m7050o(xmlPullParser, "duration", segmentList != null ? segmentList.f12989e : -9223372036854775807L);
        long m7050o4 = m7050o(xmlPullParser, "startNumber", segmentList != null ? segmentList.f12988d : 1L);
        long m7044d = m7044d(j4, j5);
        List<SegmentBase.SegmentTimelineElement> list3 = null;
        List list4 = null;
        RangedUri rangedUri2 = null;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.m7761d(xmlPullParser, "Initialization")) {
                rangedUri2 = m7059q(xmlPullParser, "sourceURL", "range");
            } else if (XmlPullParserUtil.m7761d(xmlPullParser, "SegmentTimeline")) {
                list3 = m7065w(xmlPullParser, m7050o, j3);
            } else if (XmlPullParserUtil.m7761d(xmlPullParser, "SegmentURL")) {
                if (list4 == null) {
                    list4 = new ArrayList();
                }
                List list5 = list4;
                list5.add(m7059q(xmlPullParser, "media", "mediaRange"));
                list4 = list5;
            } else {
                m7045e(xmlPullParser);
            }
        } while (!XmlPullParserUtil.m7759b(xmlPullParser, "SegmentList"));
        if (segmentList != null) {
            if (rangedUri2 == null) {
                rangedUri2 = segmentList.f12985a;
            }
            if (list3 == null) {
                list3 = segmentList.f12990f;
            }
            if (list4 == null) {
                list2 = list3;
                rangedUri = rangedUri2;
                list = segmentList.f12994j;
                return new SegmentBase.SegmentList(rangedUri, m7050o, m7050o2, m7050o4, m7050o3, list2, m7044d, list, Util.m7717P(j6), Util.m7717P(j2));
            }
        }
        rangedUri = rangedUri2;
        list = list4;
        list2 = list3;
        return new SegmentBase.SegmentList(rangedUri, m7050o, m7050o2, m7050o4, m7050o3, list2, m7044d, list, Util.m7717P(j6), Util.m7717P(j2));
    }

    /* renamed from: v */
    public SegmentBase.SegmentTemplate m7064v(XmlPullParser xmlPullParser, @Nullable SegmentBase.SegmentTemplate segmentTemplate, List<Descriptor> list, long j2, long j3, long j4, long j5, long j6) throws XmlPullParserException, IOException {
        long j7;
        long m7050o = m7050o(xmlPullParser, "timescale", segmentTemplate != null ? segmentTemplate.f12986b : 1L);
        long m7050o2 = m7050o(xmlPullParser, "presentationTimeOffset", segmentTemplate != null ? segmentTemplate.f12987c : 0L);
        long m7050o3 = m7050o(xmlPullParser, "duration", segmentTemplate != null ? segmentTemplate.f12989e : -9223372036854775807L);
        long m7050o4 = m7050o(xmlPullParser, "startNumber", segmentTemplate != null ? segmentTemplate.f12988d : 1L);
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                j7 = -1;
                break;
            }
            Descriptor descriptor = list.get(i2);
            if (Ascii.m11121a("http://dashif.org/guidelines/last-segment-number", descriptor.f12954a)) {
                j7 = Long.parseLong(descriptor.f12955b);
                break;
            }
            i2++;
        }
        long j8 = j7;
        long m7044d = m7044d(j4, j5);
        List<SegmentBase.SegmentTimelineElement> list2 = null;
        UrlTemplate m7066y = m7066y(xmlPullParser, "media", segmentTemplate != null ? segmentTemplate.f12996k : null);
        UrlTemplate m7066y2 = m7066y(xmlPullParser, "initialization", segmentTemplate != null ? segmentTemplate.f12995j : null);
        RangedUri rangedUri = null;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.m7761d(xmlPullParser, "Initialization")) {
                rangedUri = m7059q(xmlPullParser, "sourceURL", "range");
            } else if (XmlPullParserUtil.m7761d(xmlPullParser, "SegmentTimeline")) {
                list2 = m7065w(xmlPullParser, m7050o, j3);
            } else {
                m7045e(xmlPullParser);
            }
        } while (!XmlPullParserUtil.m7759b(xmlPullParser, "SegmentTemplate"));
        if (segmentTemplate != null) {
            if (rangedUri == null) {
                rangedUri = segmentTemplate.f12985a;
            }
            if (list2 == null) {
                list2 = segmentTemplate.f12990f;
            }
        }
        return new SegmentBase.SegmentTemplate(rangedUri, m7050o, m7050o2, m7050o4, j8, m7050o3, list2, m7044d, m7066y2, m7066y, Util.m7717P(j6), Util.m7717P(j2));
    }

    /* renamed from: w */
    public List<SegmentBase.SegmentTimelineElement> m7065w(XmlPullParser xmlPullParser, long j2, long j3) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long j4 = 0;
        long j5 = -9223372036854775807L;
        boolean z = false;
        int i2 = 0;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.m7761d(xmlPullParser, "S")) {
                long m7050o = m7050o(xmlPullParser, "t", -9223372036854775807L);
                if (z) {
                    j4 = m7052b(arrayList, j4, j5, i2, m7050o);
                }
                if (m7050o == -9223372036854775807L) {
                    m7050o = j4;
                }
                j5 = m7050o(xmlPullParser, "d", -9223372036854775807L);
                i2 = m7049n(xmlPullParser, "r", 0);
                j4 = m7050o;
                z = true;
            } else {
                m7045e(xmlPullParser);
            }
        } while (!XmlPullParserUtil.m7759b(xmlPullParser, "SegmentTimeline"));
        if (z) {
            m7052b(arrayList, j4, j5, i2, Util.m7723V(j3, j2, 1000L));
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: y */
    public UrlTemplate m7066y(XmlPullParser xmlPullParser, String str, @Nullable UrlTemplate urlTemplate) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return urlTemplate;
        }
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        strArr[0] = "";
        int i2 = 0;
        int i3 = 0;
        while (i2 < attributeValue.length()) {
            int indexOf = attributeValue.indexOf("$", i2);
            if (indexOf == -1) {
                String valueOf = String.valueOf(strArr[i3]);
                String valueOf2 = String.valueOf(attributeValue.substring(i2));
                strArr[i3] = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                i2 = attributeValue.length();
            } else if (indexOf != i2) {
                String valueOf3 = String.valueOf(strArr[i3]);
                String valueOf4 = String.valueOf(attributeValue.substring(i2, indexOf));
                strArr[i3] = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                i2 = indexOf;
            } else if (attributeValue.startsWith("$$", i2)) {
                strArr[i3] = String.valueOf(strArr[i3]).concat("$");
                i2 += 2;
            } else {
                int i4 = i2 + 1;
                int indexOf2 = attributeValue.indexOf("$", i4);
                String substring = attributeValue.substring(i4, indexOf2);
                if (substring.equals("RepresentationID")) {
                    iArr[i3] = 1;
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d") && !str2.endsWith("x")) {
                            str2 = str2.concat("d");
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    Objects.requireNonNull(substring);
                    switch (substring) {
                        case "Number":
                            iArr[i3] = 2;
                            break;
                        case "Time":
                            iArr[i3] = 4;
                            break;
                        case "Bandwidth":
                            iArr[i3] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException(attributeValue.length() != 0 ? "Invalid template: ".concat(attributeValue) : new String("Invalid template: "));
                    }
                    strArr2[i3] = str2;
                }
                i3++;
                strArr[i3] = "";
                i2 = indexOf2 + 1;
            }
        }
        return new UrlTemplate(strArr, iArr, strArr2, i3);
    }
}
