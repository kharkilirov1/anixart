package com.yandex.metrica.impl.p023ob;

import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.metrica.impl.ob.D0 */
/* loaded from: classes2.dex */
public abstract class AbstractC3232D0<T> {

    /* renamed from: a */
    @NotNull
    private final C3304Fm<EnumC3257E0, Integer> f42684a;

    public AbstractC3232D0() {
        C3304Fm<EnumC3257E0, Integer> c3304Fm = new C3304Fm<>(0);
        c3304Fm.m18115a(EnumC3257E0.UNDEFINED, 0);
        c3304Fm.m18115a(EnumC3257E0.APP, 1);
        c3304Fm.m18115a(EnumC3257E0.SATELLITE, 2);
        c3304Fm.m18115a(EnumC3257E0.RETAIL, 3);
        this.f42684a = c3304Fm;
    }

    @NotNull
    /* renamed from: a */
    public final C3304Fm<EnumC3257E0, Integer> m17944a() {
        return this.f42684a;
    }

    /* renamed from: a */
    public abstract boolean mo17945a(T t, T t2);
}
