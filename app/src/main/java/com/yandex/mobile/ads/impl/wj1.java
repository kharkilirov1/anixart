package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import com.yandex.mobile.ads.impl.ze0;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
final class wj1 {

    /* renamed from: a */
    private static final String[] f56149a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b */
    private static final String[] f56150b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c */
    private static final String[] f56151c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    @Nullable
    /* renamed from: a */
    public static ze0 m29491a(String str) throws IOException {
        try {
            return m29492b(str);
        } catch (ep0 | NumberFormatException | XmlPullParserException unused) {
            d90.m23842d("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (java.lang.Integer.parseInt(r10) == 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r7 == (-1)) goto L27;
     */
    @androidx.annotation.Nullable
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.yandex.mobile.ads.impl.ze0 m29492b(java.lang.String r21) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()
            java.io.StringReader r1 = new java.io.StringReader
            r2 = r21
            r1.<init>(r2)
            r0.setInput(r1)
            r0.next()
            java.lang.String r1 = "x:xmpmeta"
            boolean r2 = com.yandex.mobile.ads.impl.vj1.m29230c(r0, r1)
            r3 = 0
            if (r2 == 0) goto Ld6
            com.yandex.mobile.ads.embedded.guava.collect.p r2 = com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p.m22055i()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r4
        L28:
            r0.next()
            java.lang.String r8 = "rdf:Description"
            boolean r8 = com.yandex.mobile.ads.impl.vj1.m29230c(r0, r8)
            if (r8 == 0) goto La2
            java.lang.String[] r2 = com.yandex.mobile.ads.impl.wj1.f56149a
            r6 = 0
            r7 = 0
        L37:
            r8 = 4
            r9 = 1
            if (r7 >= r8) goto L4d
            r10 = r2[r7]
            java.lang.String r10 = com.yandex.mobile.ads.impl.vj1.m29228a(r0, r10)
            if (r10 == 0) goto L4a
            int r2 = java.lang.Integer.parseInt(r10)
            if (r2 != r9) goto L4d
            goto L4e
        L4a:
            int r7 = r7 + 1
            goto L37
        L4d:
            r9 = 0
        L4e:
            if (r9 != 0) goto L51
            return r3
        L51:
            java.lang.String[] r2 = com.yandex.mobile.ads.impl.wj1.f56150b
            r7 = 0
        L54:
            if (r7 >= r8) goto L6c
            r9 = r2[r7]
            java.lang.String r9 = com.yandex.mobile.ads.impl.vj1.m29228a(r0, r9)
            if (r9 == 0) goto L69
            long r7 = java.lang.Long.parseLong(r9)
            r9 = -1
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L6d
            goto L6c
        L69:
            int r7 = r7 + 1
            goto L54
        L6c:
            r7 = r4
        L6d:
            java.lang.String[] r2 = com.yandex.mobile.ads.impl.wj1.f56151c
            r9 = 2
        L70:
            if (r6 >= r9) goto L9c
            r10 = r2[r6]
            java.lang.String r10 = com.yandex.mobile.ads.impl.vj1.m29228a(r0, r10)
            if (r10 == 0) goto L99
            long r13 = java.lang.Long.parseLong(r10)
            com.yandex.mobile.ads.impl.ze0$a r2 = new com.yandex.mobile.ads.impl.ze0$a
            r17 = 0
            r19 = 0
            java.lang.String r16 = "image/jpeg"
            r15 = r2
            r15.<init>(r16, r17, r19)
            com.yandex.mobile.ads.impl.ze0$a r6 = new com.yandex.mobile.ads.impl.ze0$a
            r15 = 0
            java.lang.String r12 = "video/mp4"
            r11 = r6
            r11.<init>(r12, r13, r15)
            com.yandex.mobile.ads.embedded.guava.collect.p r2 = com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p.m22049a(r2, r6)
            goto La0
        L99:
            int r6 = r6 + 1
            goto L70
        L9c:
            com.yandex.mobile.ads.embedded.guava.collect.p r2 = com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p.m22055i()
        La0:
            r6 = r7
            goto Lc3
        La2:
            java.lang.String r8 = "Container:Directory"
            boolean r8 = com.yandex.mobile.ads.impl.vj1.m29230c(r0, r8)
            if (r8 == 0) goto Lb3
            java.lang.String r2 = "Container"
            java.lang.String r8 = "Item"
            com.yandex.mobile.ads.embedded.guava.collect.p r2 = m29490a(r0, r2, r8)
            goto Lc3
        Lb3:
            java.lang.String r8 = "GContainer:Directory"
            boolean r8 = com.yandex.mobile.ads.impl.vj1.m29230c(r0, r8)
            if (r8 == 0) goto Lc3
            java.lang.String r2 = "GContainer"
            java.lang.String r8 = "GContainerItem"
            com.yandex.mobile.ads.embedded.guava.collect.p r2 = m29490a(r0, r2, r8)
        Lc3:
            boolean r8 = com.yandex.mobile.ads.impl.vj1.m29229b(r0, r1)
            if (r8 == 0) goto L28
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Ld0
            return r3
        Ld0:
            com.yandex.mobile.ads.impl.ze0 r0 = new com.yandex.mobile.ads.impl.ze0
            r0.<init>(r6, r2)
            return r0
        Ld6:
            java.lang.String r0 = "Couldn't find xmp metadata"
            com.yandex.mobile.ads.impl.ep0 r0 = com.yandex.mobile.ads.impl.ep0.m24225a(r0, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.wj1.m29492b(java.lang.String):com.yandex.mobile.ads.impl.ze0");
    }

    /* renamed from: a */
    private static AbstractC4698p<ze0.C6119a> m29490a(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        int i2 = AbstractC4698p.f47900c;
        AbstractC4698p.a aVar = new AbstractC4698p.a();
        String m29049a = um1.m29049a(str, ":Item");
        String m29049a2 = um1.m29049a(str, ":Directory");
        do {
            xmlPullParser.next();
            if (vj1.m29230c(xmlPullParser, m29049a)) {
                String m29049a3 = um1.m29049a(str2, ":Mime");
                String m29049a4 = um1.m29049a(str2, ":Semantic");
                String m29049a5 = um1.m29049a(str2, ":Length");
                String m29049a6 = um1.m29049a(str2, ":Padding");
                String m29228a = vj1.m29228a(xmlPullParser, m29049a3);
                String m29228a2 = vj1.m29228a(xmlPullParser, m29049a4);
                String m29228a3 = vj1.m29228a(xmlPullParser, m29049a5);
                String m29228a4 = vj1.m29228a(xmlPullParser, m29049a6);
                if (m29228a != null && m29228a2 != null) {
                    aVar.m22060b(new ze0.C6119a(m29228a, m29228a3 != null ? Long.parseLong(m29228a3) : 0L, m29228a4 != null ? Long.parseLong(m29228a4) : 0L));
                } else {
                    return AbstractC4698p.m22055i();
                }
            }
        } while (!vj1.m29229b(xmlPullParser, m29049a2));
        return aVar.m22058a();
    }
}
