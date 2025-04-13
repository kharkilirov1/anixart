package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.Objects;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class q70<V extends ViewGroup> {

    /* renamed from: a */
    @NonNull
    private final qy0<V> f53955a = new qy0<>();

    @Nullable
    /* renamed from: a */
    public final V m27649a(@NonNull ViewGroup viewGroup, @NonNull o70<V> o70Var) {
        Context context = viewGroup.getContext();
        int m27013c = o70Var.m27013c();
        Class<V> m27014d = o70Var.m27014d();
        Objects.requireNonNull(this.f53955a);
        return (V) qy0.m27797a(context, m27014d, m27013c, viewGroup);
    }
}
