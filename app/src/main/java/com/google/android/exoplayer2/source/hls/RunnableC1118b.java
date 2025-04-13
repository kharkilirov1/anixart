package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.source.hls.b */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1118b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f13243b;

    /* renamed from: c */
    public final /* synthetic */ Object f13244c;

    public /* synthetic */ RunnableC1118b(Object obj, int i2) {
        this.f13243b = i2;
        this.f13244c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13243b) {
            case 0:
                HlsSampleStreamWrapper hlsSampleStreamWrapper = (HlsSampleStreamWrapper) this.f13244c;
                Set<Integer> set = HlsSampleStreamWrapper.f13155Y;
                hlsSampleStreamWrapper.m7118t();
                break;
            case 1:
                HlsSampleStreamWrapper hlsSampleStreamWrapper2 = (HlsSampleStreamWrapper) this.f13244c;
                hlsSampleStreamWrapper2.f13158C = true;
                hlsSampleStreamWrapper2.m7118t();
                break;
            default:
                ((HlsSampleStreamWrapper.Callback) this.f13244c).mo7099a();
                break;
        }
    }
}
