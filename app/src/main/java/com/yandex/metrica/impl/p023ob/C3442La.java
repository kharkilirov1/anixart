package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3978gg;

/* renamed from: com.yandex.metrica.impl.ob.La */
/* loaded from: classes2.dex */
public class C3442La {

    /* renamed from: a */
    private C3907dn f43315a;

    @VisibleForTesting
    public C3442La(C3907dn c3907dn) {
        this.f43315a = c3907dn;
    }

    @NonNull
    /* renamed from: a */
    public InterfaceC3541P9<C3848bg> m18484a() {
        return new C3491N9(new C3416K9(), new C3933en("AES/CBC/PKCS5Padding", this.f43315a.m19775b(), this.f43315a.m19774a()));
    }

    @NonNull
    /* renamed from: b */
    public InterfaceC3541P9<C3874cg> m18485b() {
        return new C3491N9(new C4303t3(), new C3933en("AES/CBC/PKCS5Padding", this.f43315a.m19775b(), this.f43315a.m19774a()));
    }

    @NonNull
    /* renamed from: c */
    public InterfaceC3541P9<C3900dg> m18486c() {
        return new C3491N9(new C3466M9(), new C3933en("AES/CBC/PKCS5Padding", this.f43315a.m19775b(), this.f43315a.m19774a()));
    }

    @NonNull
    /* renamed from: d */
    public InterfaceC3541P9<C3952fg> m18487d() {
        return new C3491N9(new C3516O9(), new C3933en("AES/CBC/PKCS5Padding", this.f43315a.m19775b(), this.f43315a.m19774a()));
    }

    @NonNull
    /* renamed from: e */
    public InterfaceC3541P9<C3978gg> m18488e() {
        return new C3491N9(new C3321Ge(), new C3933en("AES/CBC/PKCS5Padding", this.f43315a.m19775b(), this.f43315a.m19774a()));
    }

    @NonNull
    @Deprecated
    /* renamed from: f */
    public InterfaceC3541P9<C3978gg.a> m18489f() {
        return new C3491N9(new C3521Oe(), new C3933en("AES/CBC/PKCS5Padding", this.f43315a.m19775b(), this.f43315a.m19774a()));
    }

    /* renamed from: g */
    public InterfaceC3541P9<C4004hg> m18490g() {
        return new C3491N9(new C3590R9(), new C3933en("AES/CBC/PKCS5Padding", this.f43315a.m19775b(), this.f43315a.m19774a()));
    }

    @NonNull
    /* renamed from: h */
    public InterfaceC3541P9<C4056jg> m18491h() {
        return new C3491N9(new C3640T9(), new C3933en("AES/CBC/PKCS5Padding", this.f43315a.m19775b(), this.f43315a.m19774a()));
    }

    /* renamed from: i */
    public InterfaceC3541P9<C4082kg> m18492i() {
        return new C3491N9(new C3665U9(), new C3933en("AES/CBC/PKCS5Padding", this.f43315a.m19775b(), this.f43315a.m19774a()));
    }
}
