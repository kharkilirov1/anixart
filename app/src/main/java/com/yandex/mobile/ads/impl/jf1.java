package com.yandex.mobile.ads.impl;

import android.graphics.Matrix;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class jf1 {

    /* renamed from: a */
    @NonNull
    private final m11 f51595a;

    /* renamed from: b */
    @NonNull
    private final m11 f51596b;

    public jf1(@NonNull m11 m11Var, @NonNull m11 m11Var2) {
        this.f51595a = m11Var;
        this.f51596b = m11Var2;
    }

    @Nullable
    /* renamed from: a */
    public final Matrix m25886a(@NonNull int i2) {
        m11 m11Var = this.f51596b;
        boolean z = false;
        if (!(m11Var.m26557b() > 0 && m11Var.m26556a() > 0)) {
            return null;
        }
        m11 m11Var2 = this.f51595a;
        if (m11Var2.m26557b() > 0 && m11Var2.m26556a() > 0) {
            z = true;
        }
        if (!z) {
            return null;
        }
        if (i2 == 0) {
            throw null;
        }
        int i3 = i2 - 1;
        if (i3 == 0) {
            return m25885a(1.0f, 1.0f, 1);
        }
        if (i3 == 1) {
            float m26557b = this.f51595a.m26557b() / this.f51596b.m26557b();
            float m26556a = this.f51595a.m26556a() / this.f51596b.m26556a();
            float min = Math.min(m26557b, m26556a);
            return m25885a(min / m26557b, min / m26556a, 2);
        }
        if (i3 != 2) {
            return null;
        }
        float m26557b2 = this.f51595a.m26557b() / this.f51596b.m26557b();
        float m26556a2 = this.f51595a.m26556a() / this.f51596b.m26556a();
        float max = Math.max(m26557b2, m26556a2);
        return m25885a(max / m26557b2, max / m26556a2, 2);
    }

    @Nullable
    /* renamed from: a */
    private Matrix m25885a(float f2, float f3, int i2) {
        if (i2 == 0) {
            throw null;
        }
        int i3 = i2 - 1;
        if (i3 == 0) {
            Matrix matrix = new Matrix();
            matrix.setScale(f2, f3, 0.0f, 0.0f);
            return matrix;
        }
        if (i3 != 1) {
            return null;
        }
        Matrix matrix2 = new Matrix();
        matrix2.setScale(f2, f3, this.f51595a.m26557b() / 2.0f, this.f51595a.m26556a() / 2.0f);
        return matrix2;
    }
}
