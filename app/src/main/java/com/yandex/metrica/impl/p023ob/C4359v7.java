package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.v7 */
/* loaded from: classes2.dex */
public class C4359v7 implements InterfaceC3920ea<C4203p7, byte[]> {

    /* renamed from: a */
    @NonNull
    private final C4385w7<C4203p7> f46683a;

    public C4359v7() {
        this(new C4385w7(new C3289F7()));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a */
    public C4203p7 mo17817a(@NonNull byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: b */
    public byte[] mo17818b(@NonNull C4203p7 c4203p7) {
        return this.f46683a.m21093a(c4203p7);
    }

    @VisibleForTesting
    public C4359v7(@NonNull C4385w7<C4203p7> c4385w7) {
        this.f46683a = c4385w7;
    }

    @NonNull
    /* renamed from: a */
    public byte[] m20925a(@NonNull C4203p7 c4203p7) {
        return this.f46683a.m21093a(c4203p7);
    }
}
