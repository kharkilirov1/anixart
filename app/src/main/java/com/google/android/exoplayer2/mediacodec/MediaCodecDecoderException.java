package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.decoder.DecoderException;

/* loaded from: classes.dex */
public class MediaCodecDecoderException extends DecoderException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MediaCodecDecoderException(java.lang.Throwable r3, @androidx.annotation.Nullable com.google.android.exoplayer2.mediacodec.MediaCodecInfo r4) {
        /*
            r2 = this;
            if (r4 != 0) goto L4
            r4 = 0
            goto L6
        L4:
            java.lang.String r4 = r4.f11880a
        L6:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r0 = r4.length()
            java.lang.String r1 = "Decoder failed: "
            if (r0 == 0) goto L17
            java.lang.String r4 = r1.concat(r4)
            goto L1c
        L17:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1)
        L1c:
            r2.<init>(r4, r3)
            int r4 = com.google.android.exoplayer2.util.Util.f14736a
            r0 = 21
            if (r4 < r0) goto L2e
            boolean r4 = r3 instanceof android.media.MediaCodec.CodecException
            if (r4 == 0) goto L2e
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3
            r3.getDiagnosticInfo()
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException.<init>(java.lang.Throwable, com.google.android.exoplayer2.mediacodec.MediaCodecInfo):void");
    }
}
