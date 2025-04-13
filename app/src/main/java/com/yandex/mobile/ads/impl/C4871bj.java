package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC5029ej;
import com.yandex.mobile.ads.impl.p80;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.bj */
/* loaded from: classes3.dex */
public final class C4871bj implements InterfaceC6125zi, p80.InterfaceC5570a {

    /* renamed from: i */
    @Deprecated
    @NotNull
    private static final Object f48894i = new Object();

    /* renamed from: b */
    @NotNull
    private final w71 f48895b;

    /* renamed from: c */
    @NotNull
    private final w71 f48896c;

    /* renamed from: d */
    @Nullable
    private String f48897d;

    /* renamed from: e */
    @Nullable
    private String f48898e;

    /* renamed from: f */
    private boolean f48899f;

    /* renamed from: g */
    @Nullable
    private String f48900g;

    /* renamed from: h */
    @Nullable
    private String f48901h;

    public C4871bj(@NotNull C4927cj cmpV1, @NotNull C4973dj cmpV2, @NotNull p80 preferences) {
        Intrinsics.m32179h(cmpV1, "cmpV1");
        Intrinsics.m32179h(cmpV2, "cmpV2");
        Intrinsics.m32179h(preferences, "preferences");
        this.f48895b = cmpV1;
        this.f48896c = cmpV2;
        for (EnumC6028xi enumC6028xi : EnumC6028xi.values()) {
            m22841a(preferences, enumC6028xi);
        }
        preferences.mo27187a(this);
    }

    /* renamed from: a */
    public final boolean m22843a() {
        boolean z;
        synchronized (f48894i) {
            z = this.f48899f;
        }
        return z;
    }

    @Nullable
    /* renamed from: b */
    public final String m22844b() {
        String str;
        synchronized (f48894i) {
            str = this.f48897d;
        }
        return str;
    }

    @Nullable
    /* renamed from: c */
    public final String m22845c() {
        String str;
        synchronized (f48894i) {
            str = this.f48898e;
        }
        return str;
    }

    @Nullable
    /* renamed from: d */
    public final String m22846d() {
        String str;
        synchronized (f48894i) {
            str = this.f48900g;
        }
        return str;
    }

    @Nullable
    /* renamed from: e */
    public final String m22847e() {
        String str;
        synchronized (f48894i) {
            str = this.f48901h;
        }
        return str;
    }

    @Override // com.yandex.mobile.ads.impl.p80.InterfaceC5570a
    /* renamed from: a */
    public final void mo22842a(@NotNull p80 localStorage, @NotNull String key) {
        Intrinsics.m32179h(localStorage, "localStorage");
        Intrinsics.m32179h(key, "key");
        synchronized (f48894i) {
            AbstractC5029ej mo23292a = this.f48896c.mo23292a(localStorage, key);
            if (mo23292a == null) {
                mo23292a = this.f48895b.mo23292a(localStorage, key);
            }
            if (mo23292a != null) {
                m22840a(mo23292a);
            }
        }
    }

    /* renamed from: a */
    private final void m22841a(p80 p80Var, EnumC6028xi enumC6028xi) {
        AbstractC5029ej mo23291a = this.f48896c.mo23291a(p80Var, enumC6028xi);
        if (mo23291a == null) {
            mo23291a = this.f48895b.mo23291a(p80Var, enumC6028xi);
        }
        m22840a(mo23291a);
    }

    /* renamed from: a */
    private final void m22840a(AbstractC5029ej abstractC5029ej) {
        if (abstractC5029ej instanceof AbstractC5029ej.a) {
            this.f48899f = ((AbstractC5029ej.a) abstractC5029ej).m24178a();
            return;
        }
        if (abstractC5029ej instanceof AbstractC5029ej.b) {
            this.f48897d = ((AbstractC5029ej.b) abstractC5029ej).m24179a();
            return;
        }
        if (abstractC5029ej instanceof AbstractC5029ej.c) {
            this.f48898e = ((AbstractC5029ej.c) abstractC5029ej).m24180a();
        } else if (abstractC5029ej instanceof AbstractC5029ej.d) {
            this.f48900g = ((AbstractC5029ej.d) abstractC5029ej).m24181a();
        } else if (abstractC5029ej instanceof AbstractC5029ej.e) {
            this.f48901h = ((AbstractC5029ej.e) abstractC5029ej).m24182a();
        }
    }
}
