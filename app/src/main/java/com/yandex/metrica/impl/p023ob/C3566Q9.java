package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.Q9 */
/* loaded from: classes2.dex */
public class C3566Q9 {

    /* renamed from: a */
    @NonNull
    private final String f43666a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC4438y8 f43667b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC3541P9<AbstractC3909e> f43668c;

    /* renamed from: d */
    @NonNull
    private final InterfaceC3920ea<Object, AbstractC3909e> f43669d;

    public C3566Q9(@NonNull String str, @NonNull InterfaceC4438y8 interfaceC4438y8, @NonNull InterfaceC3541P9<AbstractC3909e> interfaceC3541P9, @NonNull InterfaceC3920ea<Object, AbstractC3909e> interfaceC3920ea) {
        this.f43666a = str;
        this.f43667b = interfaceC4438y8;
        this.f43668c = interfaceC3541P9;
        this.f43669d = interfaceC3920ea;
    }

    /* renamed from: a */
    public void m18781a(@NonNull Object obj) {
        this.f43667b.mo18664a(this.f43666a, this.f43668c.mo18483a((InterfaceC3541P9<AbstractC3909e>) this.f43669d.mo17818b(obj)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    /* renamed from: b */
    public Object m18782b() {
        try {
            byte[] mo18665a = this.f43667b.mo18665a(this.f43666a);
            return C3658U2.m19214a(mo18665a) ? this.f43669d.mo17817a(this.f43668c.mo18164a()) : this.f43669d.mo17817a(this.f43668c.mo18165a(mo18665a));
        } catch (Throwable unused) {
            return this.f43669d.mo17817a(this.f43668c.mo18164a());
        }
    }

    /* renamed from: a */
    public void m18780a() {
        this.f43667b.mo18666b(this.f43666a);
    }
}
