package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.MediaView;
import java.util.List;

/* loaded from: classes3.dex */
public final class yk1 implements pc0 {

    /* renamed from: a */
    @NonNull
    private final tc0 f56876a;

    /* renamed from: b */
    @NonNull
    private final qc0 f56877b = new qc0();

    /* renamed from: c */
    @NonNull
    private final sc0 f56878c = new sc0();

    /* renamed from: d */
    @NonNull
    private final rc0 f56879d = new rc0();

    public yk1(@NonNull AdResponse<?> adResponse) {
        this.f56876a = new tc0(adResponse);
    }

    @Override // com.yandex.mobile.ads.impl.pc0
    @Nullable
    /* renamed from: a */
    public final nc0 mo25870a(@NonNull MediaView mediaView, @NonNull C5101g2 c5101g2, @NonNull w10 w10Var, @NonNull l20 l20Var, @NonNull zj0 zj0Var, @NonNull nj0 nj0Var, @Nullable s01 s01Var, @Nullable jc0 jc0Var) {
        cl0 m30196a = zj0Var.m30196a();
        bm0 m30197b = zj0Var.m30197b();
        nc0 nc0Var = null;
        if (jc0Var == null) {
            return null;
        }
        List<z10> m25863a = jc0Var.m25863a();
        ka0 m25864b = jc0Var.m25864b();
        Context context = mediaView.getContext();
        if (m30196a != null) {
            nc0Var = this.f56876a.m28593a(mediaView, c5101g2, l20Var, m30196a, nj0Var);
        } else if (m30197b != null && m25864b != null && C5427m6.m26578a(context)) {
            try {
                nc0Var = this.f56879d.m27905a(mediaView, m25864b, l20Var, m30197b, c5101g2);
            } catch (mi1 unused) {
            }
        }
        if (nc0Var != null || m25863a == null || m25863a.isEmpty()) {
            return nc0Var;
        }
        if (m25863a.size() == 1) {
            return this.f56877b.m27670a(mediaView, w10Var, c5101g2);
        }
        try {
            return this.f56878c.m28205a(mediaView, w10Var, m25863a, c5101g2, s01Var);
        } catch (Throwable unused2) {
            return this.f56877b.m27670a(mediaView, w10Var, c5101g2);
        }
    }
}
