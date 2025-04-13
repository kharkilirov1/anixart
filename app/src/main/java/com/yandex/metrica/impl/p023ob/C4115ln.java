package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.ln */
/* loaded from: classes2.dex */
public class C4115ln {

    /* renamed from: a */
    @NonNull
    private final C3304Fm<EnumC4141mn, InterfaceC4089kn> f45924a;

    /* renamed from: b */
    @NonNull
    private final C3304Fm<EnumC4067k1, InterfaceC4089kn> f45925b;

    public C4115ln() {
        this(new C4037in(), new C4167nn(), new C3959fn());
    }

    @NonNull
    /* renamed from: a */
    public InterfaceC4089kn m20391a(EnumC4141mn enumC4141mn) {
        return this.f45924a.m18113a(enumC4141mn);
    }

    public C4115ln(@NonNull InterfaceC4089kn interfaceC4089kn, @NonNull InterfaceC4089kn interfaceC4089kn2, @NonNull InterfaceC4089kn interfaceC4089kn3) {
        C3304Fm<EnumC4141mn, InterfaceC4089kn> c3304Fm = new C3304Fm<>(interfaceC4089kn);
        this.f45924a = c3304Fm;
        c3304Fm.m18115a(EnumC4141mn.NONE, interfaceC4089kn);
        c3304Fm.m18115a(EnumC4141mn.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, interfaceC4089kn2);
        c3304Fm.m18115a(EnumC4141mn.AES_VALUE_ENCRYPTION, interfaceC4089kn3);
        C3304Fm<EnumC4067k1, InterfaceC4089kn> c3304Fm2 = new C3304Fm<>(interfaceC4089kn);
        this.f45925b = c3304Fm2;
        c3304Fm2.m18115a(EnumC4067k1.EVENT_TYPE_IDENTITY, interfaceC4089kn3);
    }

    @NonNull
    /* renamed from: a */
    public InterfaceC4089kn m20390a(@NonNull C4066k0 c4066k0) {
        return this.f45925b.m18113a(EnumC4067k1.m20216a(c4066k0.m20212n()));
    }
}
