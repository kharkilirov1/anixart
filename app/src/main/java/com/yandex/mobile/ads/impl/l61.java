package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Util;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class l61 {

    /* renamed from: a */
    @NonNull
    private final C6104z3 f52266a;

    /* renamed from: b */
    @NonNull
    private final zq0 f52267b;

    /* renamed from: c */
    @NonNull
    private final C4795a7 f52268c;

    /* renamed from: d */
    @NonNull
    private final je1 f52269d;

    /* renamed from: e */
    @NonNull
    private final fq0 f52270e;

    /* renamed from: f */
    @NonNull
    private final b91 f52271f = new b91();

    public l61(@NonNull C6104z3 c6104z3, @NonNull yq0 yq0Var, @NonNull C4795a7 c4795a7, @NonNull fq0 fq0Var) {
        this.f52266a = c6104z3;
        this.f52268c = c4795a7;
        this.f52267b = yq0Var.m29965d();
        this.f52269d = yq0Var.m29962a();
        this.f52270e = fq0Var;
    }

    /* renamed from: a */
    public final void m26357a(@NonNull Timeline timeline) {
        if (timeline.m5991s()) {
            return;
        }
        if (timeline.mo5936k() != 1) {
            n60.m26810c("Timeline contains more than one period", new Object[0]);
        }
        this.f52267b.m30281a(timeline);
        long j2 = timeline.m5987h(0, this.f52267b.m30280a()).f10052e;
        this.f52269d.m25879a(Util.m7735d0(j2));
        if (j2 != -9223372036854775807L) {
            AdPlaybackState m30045a = this.f52266a.m30045a();
            Objects.requireNonNull(this.f52271f);
            this.f52266a.m30046a(b91.m22752a(m30045a, j2));
        }
        if (!this.f52268c.m22391b()) {
            this.f52268c.m22390a();
        }
        this.f52270e.m24723a();
    }
}
