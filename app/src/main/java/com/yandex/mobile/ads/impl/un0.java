package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class un0 {

    /* renamed from: c */
    @NonNull
    private static final Object f55587c = new Object();

    /* renamed from: d */
    @Nullable
    private static volatile un0 f55588d;

    /* renamed from: a */
    @NonNull
    private final go0 f55589a = new go0();

    /* renamed from: b */
    private boolean f55590b;

    private un0() {
    }

    @NonNull
    /* renamed from: a */
    public static un0 m29057a() {
        if (f55588d == null) {
            synchronized (f55587c) {
                if (f55588d == null) {
                    f55588d = new un0();
                }
            }
        }
        un0 un0Var = f55588d;
        Objects.requireNonNull(un0Var);
        return un0Var;
    }

    /* renamed from: a */
    public final void m29058a(@NonNull Context context) {
        synchronized (f55587c) {
            if (this.f55589a.m24950b(context) && !this.f55590b) {
                jo0.m25916a(context);
                this.f55590b = true;
            }
        }
    }
}
