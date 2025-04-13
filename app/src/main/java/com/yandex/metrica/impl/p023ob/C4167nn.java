package com.yandex.metrica.impl.p023ob;

import android.util.Base64;

/* renamed from: com.yandex.metrica.impl.ob.nn */
/* loaded from: classes2.dex */
public class C4167nn implements InterfaceC4089kn {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4089kn
    /* renamed from: a */
    public C4063jn mo19917a(C4066k0 c4066k0) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4089kn
    /* renamed from: a */
    public byte[] mo19918a(byte[] bArr) {
        try {
            return Base64.decode(bArr, 0);
        } catch (Throwable unused) {
            return new byte[0];
        }
    }
}
