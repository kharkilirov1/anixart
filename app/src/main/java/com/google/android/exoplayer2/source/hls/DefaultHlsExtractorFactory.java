package com.google.android.exoplayer2.source.hls;

import java.util.List;

/* loaded from: classes.dex */
public final class DefaultHlsExtractorFactory implements HlsExtractorFactory {

    /* renamed from: d */
    public static final int[] f13042d = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: b */
    public final int f13043b = 0;

    /* renamed from: c */
    public final boolean f13044c = true;

    /* renamed from: b */
    public static void m7089b(int i2, List<Integer> list) {
        int[] iArr = f13042d;
        int length = iArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            } else if (iArr[i3] == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 == -1 || list.contains(Integer.valueOf(i2))) {
            return;
        }
        list.add(Integer.valueOf(i2));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:8|(2:10|(2:12|(2:14|(7:16|(2:(2:19|(1:21)(1:50))(5:53|(1:55)(1:(1:72)(1:73))|56|(6:58|(1:60)(1:69)|(1:62)|63|(1:65)(1:68)|(1:67))|70)|51)(7:74|(6:76|(2:77|(2:79|(2:82|83)(1:81))(1:92))|(1:85)(1:91)|86|(1:88)(1:90)|89)(0)|93|(0)(0)|86|(0)(0)|89)|22|23|24|25|(3:41|42|43)(2:(2:39|40)|35))(1:94))(1:95))(1:96))(1:97)|52|22|23|24|25|(0)(0)|6) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0165, code lost:
    
        r15.f10836f = 0;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x015f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0160, code lost:
    
        r15.f10836f = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0164, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0103  */
    @Override // com.google.android.exoplayer2.source.hls.HlsExtractorFactory
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor mo6096a(android.net.Uri r21, com.google.android.exoplayer2.Format r22, @androidx.annotation.Nullable java.util.List r23, com.google.android.exoplayer2.util.TimestampAdjuster r24, java.util.Map r25, com.google.android.exoplayer2.extractor.ExtractorInput r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.DefaultHlsExtractorFactory.mo6096a(android.net.Uri, com.google.android.exoplayer2.Format, java.util.List, com.google.android.exoplayer2.util.TimestampAdjuster, java.util.Map, com.google.android.exoplayer2.extractor.ExtractorInput):com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor");
    }
}
