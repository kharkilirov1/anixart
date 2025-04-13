package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.rs */
/* loaded from: classes3.dex */
public final class C5709rs {

    /* renamed from: c */
    @NonNull
    private static final Object f54409c = new Object();

    /* renamed from: d */
    private static volatile C5709rs f54410d;

    /* renamed from: a */
    @NonNull
    private final C5655qs f54411a = new C5655qs();

    /* renamed from: b */
    @Nullable
    private b11 f54412b;

    private C5709rs() {
    }

    @NonNull
    /* renamed from: a */
    public static C5709rs m27980a() {
        if (f54410d == null) {
            synchronized (f54409c) {
                if (f54410d == null) {
                    f54410d = new C5709rs();
                }
            }
        }
        return f54410d;
    }

    @NonNull
    /* renamed from: a */
    public final InterfaceC5970wf m27981a(@NonNull Context context) {
        b11 b11Var;
        synchronized (f54409c) {
            if (this.f54412b == null) {
                this.f54412b = this.f54411a.m27784a(context);
            }
            b11Var = this.f54412b;
        }
        return b11Var;
    }
}
