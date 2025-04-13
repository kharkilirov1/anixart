package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes3.dex */
final class a90 {

    /* renamed from: a */
    @NonNull
    private final Context f48334a;

    /* renamed from: b */
    @NonNull
    private final String f48335b;

    /* renamed from: c */
    @NonNull
    private final vu0 f48336c = new vu0();

    public a90(@NonNull Context context, @NonNull String str) {
        this.f48334a = context.getApplicationContext();
        this.f48335b = str;
    }

    @Nullable
    /* renamed from: a */
    public final C5514nx m22408a() {
        Class<?> cls;
        vu0 vu0Var = this.f48336c;
        String str = this.f48335b;
        Objects.requireNonNull(vu0Var);
        try {
            cls = Class.forName(str);
        } catch (Throwable th) {
            n60.m26808a(th, "Cannot found class for name %s", str);
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        vu0 vu0Var2 = this.f48336c;
        Object[] objArr = {this.f48334a};
        Objects.requireNonNull(vu0Var2);
        Object m29276a = vu0.m29276a((Class) cls, "getFusedLocationProviderClient", objArr);
        if (m29276a != null) {
            return new C5514nx(m29276a);
        }
        return null;
    }
}
