package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.util.regex.Pattern;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.mediacodec.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C1035d implements MediaCodecUtil.ScoreProvider {

    /* renamed from: a */
    public final /* synthetic */ Format f11981a;

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider
    /* renamed from: a */
    public final int mo6692a(Object obj) {
        Format format = this.f11981a;
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) obj;
        Pattern pattern = MediaCodecUtil.f11962a;
        try {
            return mediaCodecInfo.m6643e(format) ? 1 : 0;
        } catch (MediaCodecUtil.DecoderQueryException unused) {
            return -1;
        }
    }
}
