package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.util.Util;
import java.util.regex.Pattern;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.mediacodec.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C1036e implements MediaCodecUtil.ScoreProvider {

    /* renamed from: b */
    public static final /* synthetic */ C1036e f11982b = new C1036e(0);

    /* renamed from: c */
    public static final /* synthetic */ C1036e f11983c = new C1036e(1);

    /* renamed from: a */
    public final /* synthetic */ int f11984a;

    public /* synthetic */ C1036e(int i2) {
        this.f11984a = i2;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider
    /* renamed from: a */
    public final int mo6692a(Object obj) {
        switch (this.f11984a) {
            case 0:
                Pattern pattern = MediaCodecUtil.f11962a;
                String str = ((MediaCodecInfo) obj).f11880a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (Util.f14736a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            default:
                Pattern pattern2 = MediaCodecUtil.f11962a;
                return ((MediaCodecInfo) obj).f11880a.startsWith("OMX.google") ? 1 : 0;
        }
    }
}
