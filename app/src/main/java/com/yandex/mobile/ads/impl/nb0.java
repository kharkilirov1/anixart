package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class nb0 {

    /* renamed from: a */
    @NonNull
    private final lb0 f52906a;

    /* renamed from: b */
    @NonNull
    private final C4969df f52907b;

    public nb0(@NonNull Context context) {
        lb0 m29139a = new uu0(context).m29139a();
        this.f52906a = m29139a;
        this.f52907b = new C4969df(m29139a);
    }

    @Nullable
    /* renamed from: a */
    public final jb0 m26840a(@NonNull C5083fl c5083fl) {
        double d = -1.0d;
        jb0 jb0Var = null;
        for (jb0 jb0Var2 : c5083fl.m24616f()) {
            double d2 = "video/mp4".equals(jb0Var2.m25840c()) ? 1.5d : 1.0d;
            int m23879a = this.f52907b.m23879a(jb0Var2);
            int m26421a = this.f52906a.m26421a();
            double abs = d2 / ((Math.max(0, m23879a) < 100 ? 10.0d : Math.abs(m26421a - r4) / m26421a) + 1.0d);
            if (abs > d) {
                jb0Var = jb0Var2;
                d = abs;
            }
        }
        return jb0Var;
    }
}
