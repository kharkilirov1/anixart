package com.yandex.metrica.push.impl;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.push.impl.V0 */
/* loaded from: classes2.dex */
public class C4553V0 {

    /* renamed from: c */
    @SuppressLint
    private static volatile C4553V0 f47317c;

    /* renamed from: d */
    private static final Object f47318d = new Object();

    /* renamed from: a */
    private final Object f47319a = new Object();

    /* renamed from: b */
    @Nullable
    private volatile C4551U0 f47320b;

    @NonNull
    /* renamed from: b */
    public static C4553V0 m21478b() {
        if (f47317c == null) {
            synchronized (f47318d) {
                if (f47317c == null) {
                    f47317c = new C4553V0();
                }
            }
        }
        return f47317c;
    }

    @NonNull
    /* renamed from: a */
    public C4551U0 m21479a() {
        if (this.f47320b == null) {
            synchronized (this.f47319a) {
                if (this.f47320b == null) {
                    this.f47320b = new C4551U0("AppMetricaPushCommon");
                }
            }
        }
        return this.f47320b;
    }
}
