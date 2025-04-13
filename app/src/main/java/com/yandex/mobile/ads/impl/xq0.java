package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes3.dex */
public final class xq0 {

    /* renamed from: a */
    @NonNull
    private final C4794a6 f56523a;

    /* renamed from: b */
    @NonNull
    private final C5054f2 f56524b;

    /* renamed from: c */
    @NonNull
    private final he1 f56525c;

    /* renamed from: d */
    @NonNull
    private final C5003e4 f56526d;

    /* renamed from: e */
    private boolean f56527e = false;

    public xq0(@NonNull C4794a6 c4794a6, @NonNull C5054f2 c5054f2, @NonNull he1 he1Var, @NonNull C5003e4 c5003e4) {
        this.f56523a = c4794a6;
        this.f56524b = c5054f2;
        this.f56525c = he1Var;
        this.f56526d = c5003e4;
    }

    /* renamed from: a */
    public final void m29782a(boolean z, int i2) {
        dr0 m22384b = this.f56523a.m22384b();
        if (m22384b == null) {
            return;
        }
        VideoAd m23928b = m22384b.m23928b();
        C5264j3 m23927a = m22384b.m23927a();
        if (d40.f49559a.equals(this.f56523a.m22380a(m23928b))) {
            if (z && i2 == 2) {
                this.f56525c.m25147c();
                return;
            }
            return;
        }
        if (i2 == 2) {
            this.f56527e = true;
            this.f56526d.onAdBufferingStarted(m23928b);
        } else if (i2 == 3 && this.f56527e) {
            this.f56527e = false;
            this.f56526d.onAdBufferingFinished(m23928b);
        } else if (i2 == 4) {
            this.f56524b.m24292a(m23927a, m23928b);
        }
    }
}
