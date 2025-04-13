package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class b51 extends AbstractC5809tm implements w41 {

    /* renamed from: c */
    @Nullable
    private w41 f48764c;

    /* renamed from: d */
    private long f48765d;

    /* renamed from: a */
    public final void m22725a(long j2, w41 w41Var, long j3) {
        this.f55152b = j2;
        this.f48764c = w41Var;
        if (j3 != Long.MAX_VALUE) {
            j2 = j3;
        }
        this.f48765d = j2;
    }

    @Override // com.yandex.mobile.ads.impl.w41
    /* renamed from: b */
    public final List<C5751sl> mo22726b(long j2) {
        w41 w41Var = this.f48764c;
        Objects.requireNonNull(w41Var);
        return w41Var.mo22726b(j2 - this.f48765d);
    }

    @Override // com.yandex.mobile.ads.impl.w41
    /* renamed from: a */
    public final int mo22722a() {
        w41 w41Var = this.f48764c;
        Objects.requireNonNull(w41Var);
        return w41Var.mo22722a();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5438mf
    /* renamed from: b */
    public final void mo22727b() {
        super.mo22727b();
        this.f48764c = null;
    }

    @Override // com.yandex.mobile.ads.impl.w41
    /* renamed from: a */
    public final long mo22724a(int i2) {
        w41 w41Var = this.f48764c;
        Objects.requireNonNull(w41Var);
        return w41Var.mo22724a(i2) + this.f48765d;
    }

    @Override // com.yandex.mobile.ads.impl.w41
    /* renamed from: a */
    public final int mo22723a(long j2) {
        w41 w41Var = this.f48764c;
        Objects.requireNonNull(w41Var);
        return w41Var.mo22723a(j2 - this.f48765d);
    }
}
