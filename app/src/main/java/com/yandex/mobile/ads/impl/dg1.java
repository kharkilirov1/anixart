package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public abstract class dg1<V extends View, T> {

    /* renamed from: a */
    @NonNull
    private final WeakReference<V> f49648a;

    public dg1(@NonNull V v) {
        this.f49648a = new WeakReference<>(v);
    }

    /* renamed from: a */
    public void mo23312a() {
    }

    @SuppressLint
    /* renamed from: a */
    public void mo22387a(@NonNull V v) {
        v.setVisibility(8);
        v.setOnClickListener(null);
        v.setOnTouchListener(null);
        v.setSelected(false);
    }

    /* renamed from: a */
    public abstract boolean mo22388a(@NonNull V v, @NonNull T t);

    @Nullable
    /* renamed from: b */
    public final V m23881b() {
        return this.f49648a.get();
    }

    /* renamed from: b */
    public abstract void mo22389b(@NonNull V v, @NonNull T t);

    /* renamed from: a */
    public void mo22499a(@NonNull C5276ja c5276ja, @NonNull gg1 gg1Var, @Nullable T t) {
        V m23881b = m23881b();
        if (m23881b != null) {
            gg1Var.mo24889a(m23881b, c5276ja);
            gg1Var.mo24890a(c5276ja, new fg1(m23881b));
        }
    }
}
