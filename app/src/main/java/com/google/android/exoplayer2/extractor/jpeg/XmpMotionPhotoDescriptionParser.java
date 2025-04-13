package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription;
import com.google.android.exoplayer2.util.XmlPullParserUtil;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
final class XmpMotionPhotoDescriptionParser {

    /* renamed from: a */
    public static final String[] f10990a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b */
    public static final String[] f10991b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c */
    public static final String[] f10992c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r10 == (-1)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r10 = -9223372036854775807L;
     */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription m6453a(java.lang.String r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.jpeg.XmpMotionPhotoDescriptionParser.m6453a(java.lang.String):com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription");
    }

    /* renamed from: b */
    public static ImmutableList<MotionPhotoDescription.ContainerItem> m6454b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        UnmodifiableListIterator<Object> unmodifiableListIterator = ImmutableList.f21033c;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.m7761d(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String m7758a = XmlPullParserUtil.m7758a(xmlPullParser, concat3);
                String m7758a2 = XmlPullParserUtil.m7758a(xmlPullParser, concat4);
                String m7758a3 = XmlPullParserUtil.m7758a(xmlPullParser, concat5);
                String m7758a4 = XmlPullParserUtil.m7758a(xmlPullParser, concat6);
                if (m7758a == null || m7758a2 == null) {
                    return ImmutableList.m11627D();
                }
                builder.m11640d(new MotionPhotoDescription.ContainerItem(m7758a, m7758a2, m7758a3 != null ? Long.parseLong(m7758a3) : 0L, m7758a4 != null ? Long.parseLong(m7758a4) : 0L));
            }
        } while (!XmlPullParserUtil.m7759b(xmlPullParser, concat2));
        return builder.m11641e();
    }
}
