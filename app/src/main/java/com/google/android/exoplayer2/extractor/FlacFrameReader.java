package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: classes.dex */
public final class FlacFrameReader {

    public static final class SampleNumberHolder {

        /* renamed from: a */
        public long f10844a;
    }

    /* renamed from: a */
    public static boolean m6408a(ParsableByteArray parsableByteArray, FlacStreamMetadata flacStreamMetadata, boolean z, SampleNumberHolder sampleNumberHolder) {
        try {
            long m7630A = parsableByteArray.m7630A();
            if (!z) {
                m7630A *= flacStreamMetadata.f10849b;
            }
            sampleNumberHolder.f10844a = m7630A;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
    
        if (r7 == r18.f10853f) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009b, code lost:
    
        if ((r17.m7657u() * 1000) == r3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00aa, code lost:
    
        if (r4 == r3) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m6409b(com.google.android.exoplayer2.util.ParsableByteArray r17, com.google.android.exoplayer2.extractor.FlacStreamMetadata r18, int r19, com.google.android.exoplayer2.extractor.FlacFrameReader.SampleNumberHolder r20) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.FlacFrameReader.m6409b(com.google.android.exoplayer2.util.ParsableByteArray, com.google.android.exoplayer2.extractor.FlacStreamMetadata, int, com.google.android.exoplayer2.extractor.FlacFrameReader$SampleNumberHolder):boolean");
    }

    /* renamed from: c */
    public static int m6410c(ParsableByteArray parsableByteArray, int i2) {
        switch (i2) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i2 - 2);
            case 6:
                return parsableByteArray.m7657u() + 1;
            case 7:
                return parsableByteArray.m7662z() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i2 - 8);
            default:
                return -1;
        }
    }
}
