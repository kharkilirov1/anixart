package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class qy0<T extends View> {
    @Nullable
    /* renamed from: a */
    public static View m27797a(@NonNull Context context, @NonNull Class cls, @LayoutRes int i2, @Nullable ViewGroup viewGroup) {
        try {
            return (View) cls.cast(LayoutInflater.from(context).inflate(i2, viewGroup, false));
        } catch (Exception e2) {
            n60.m26810c("Failed to inflate layout", e2);
            return null;
        }
    }
}
