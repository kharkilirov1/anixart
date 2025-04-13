package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.wu0;
import java.util.List;

/* loaded from: classes3.dex */
public final class zu0 implements wu0.InterfaceC5992b {

    /* renamed from: a */
    @NonNull
    private final yu0 f57321a;

    /* renamed from: b */
    @NonNull
    private final wu0 f57322b;

    /* renamed from: c */
    @NonNull
    private final C5211i3 f57323c;

    /* renamed from: d */
    @NonNull
    private final gv0 f57324d;

    /* renamed from: e */
    @Nullable
    private final bv0 f57325e;

    /* renamed from: f */
    private boolean f57326f;

    public zu0(@NonNull Context context, @NonNull C5425m4 c5425m4, @NonNull AdResponse adResponse, @NonNull C5101g2 c5101g2, @NonNull C5211i3 c5211i3, @NonNull l20 l20Var, @Nullable bv0 bv0Var, @Nullable List list) {
        this.f57323c = c5211i3;
        this.f57324d = l20Var;
        this.f57325e = bv0Var;
        this.f57321a = new yu0(context, adResponse, c5101g2, list);
        this.f57322b = new wu0(c5425m4, this);
    }

    /* renamed from: a */
    public final void m30302a(@NonNull ek0 ek0Var) {
        this.f57321a.m29974a(ek0Var);
    }

    /* renamed from: b */
    public final void m30303b() {
        if (this.f57326f) {
            return;
        }
        this.f57326f = true;
        this.f57322b.m29571a();
    }

    /* renamed from: c */
    public final void m30304c() {
        this.f57326f = false;
        this.f57322b.m29572b();
    }

    /* renamed from: a */
    public final void m30301a() {
        bv0 bv0Var = this.f57325e;
        if (bv0Var != null) {
            bv0Var.m22939b();
        }
        this.f57321a.m29973a();
        this.f57323c.m25431b();
        this.f57324d.mo24988e();
    }
}
