package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.instream.player.p025ad.error.InstreamAdPlayerError;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class tq0 {

    /* renamed from: a */
    @NonNull
    private final C4794a6 f55188a;

    /* renamed from: b */
    @NonNull
    private final C5003e4 f55189b;

    /* renamed from: c */
    @NonNull
    private final C6108z6 f55190c = new C6108z6();

    public tq0(@NonNull C4794a6 c4794a6, @NonNull C5003e4 c5003e4) {
        this.f55188a = c4794a6;
        this.f55189b = c5003e4;
    }

    /* renamed from: a */
    public final void m28698a(@Nullable Exception exc) {
        InstreamAdPlayerError instreamAdPlayerError;
        dr0 m22384b = this.f55188a.m22384b();
        if (m22384b == null) {
            return;
        }
        VideoAd m23928b = m22384b.m23928b();
        if (d40.f49559a.equals(this.f55188a.m22380a(m23928b))) {
            return;
        }
        if (exc != null) {
            Objects.requireNonNull(this.f55190c);
            instreamAdPlayerError = C6108z6.m30065c(exc);
        } else {
            instreamAdPlayerError = new InstreamAdPlayerError(InstreamAdPlayerError.Reason.UNKNOWN, new C5350ko());
        }
        this.f55189b.onError(m23928b, instreamAdPlayerError);
    }
}
