package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes3.dex */
public final class r70<V extends ViewGroup> {

    /* renamed from: a */
    @NonNull
    private final List<o70<V>> f54218a;

    public r70(@NonNull List<o70<V>> list) {
        this.f54218a = list;
    }

    @Nullable
    /* renamed from: a */
    public final o70<V> m27856a(@NonNull Context context) {
        for (o70<V> o70Var : this.f54218a) {
            if (o70Var.m27012b().mo27335a(context)) {
                return o70Var;
            }
        }
        return null;
    }
}
