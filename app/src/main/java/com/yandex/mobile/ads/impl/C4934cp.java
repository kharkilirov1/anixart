package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.core.DivConfiguration;

/* renamed from: com.yandex.mobile.ads.impl.cp */
/* loaded from: classes3.dex */
public final class C4934cp {

    /* renamed from: b */
    private static final Object f49331b = new Object();

    /* renamed from: c */
    @Nullable
    private static volatile C4934cp f49332c;

    /* renamed from: a */
    @Nullable
    private DivConfiguration f49333a;

    private C4934cp() {
    }

    @NonNull
    /* renamed from: a */
    public static C4934cp m23505a() {
        if (f49332c == null) {
            synchronized (f49331b) {
                if (f49332c == null) {
                    f49332c = new C4934cp();
                }
            }
        }
        return f49332c;
    }

    @NonNull
    /* renamed from: a */
    public final DivConfiguration m23506a(@NonNull Context context) {
        synchronized (f49331b) {
            if (this.f49333a == null) {
                this.f49333a = C5546op.m27097a(context);
            }
        }
        return this.f49333a;
    }
}
