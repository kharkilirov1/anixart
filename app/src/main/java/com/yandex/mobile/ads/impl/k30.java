package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.q40;

/* loaded from: classes3.dex */
public final class k30 {

    /* renamed from: a */
    @NonNull
    private final h50 f51829a;

    public k30(@NonNull h50 h50Var) {
        this.f51829a = h50Var;
    }

    @NonNull
    /* renamed from: a */
    public final q40 m26016a(@NonNull ub1 ub1Var, @NonNull q40 q40Var) {
        boolean z = this.f51829a.getVolume() == 0.0f;
        View m28940l = ub1Var.m28940l();
        Float f2 = null;
        Boolean valueOf = m28940l != null ? Boolean.valueOf(m28940l.isEnabled()) : null;
        ProgressBar m28938j = ub1Var.m28938j();
        if (m28938j != null) {
            int progress = m28938j.getProgress();
            int max = m28938j.getMax();
            if (max != 0) {
                f2 = Float.valueOf(progress / max);
            }
        }
        q40.C5619a c5619a = new q40.C5619a();
        c5619a.m27623b(z);
        if (valueOf != null) {
            c5619a.m27622a(valueOf.booleanValue());
        }
        if (f2 != null) {
            c5619a.m27624b(f2.floatValue());
        }
        c5619a.m27620a(q40Var.m27612a());
        return c5619a.m27621a();
    }
}
