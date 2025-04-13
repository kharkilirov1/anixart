package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.lf */
/* loaded from: classes2.dex */
public class C4107lf implements InterfaceC4133mf {

    /* renamed from: a */
    @NonNull
    private final C4115ln f45884a;

    public C4107lf() {
        this(new C4115ln());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4133mf
    @NonNull
    /* renamed from: a */
    public byte[] mo18816a(@NonNull C3745Xe c3745Xe, @NonNull C4057jh c4057jh) {
        byte[] bArr = new byte[0];
        try {
            bArr = C3681V0.m19266a(c3745Xe.f44480b);
        } catch (Throwable unused) {
        }
        byte[] mo19918a = this.f45884a.m20391a(c3745Xe.f44496r).mo19918a(bArr);
        return mo19918a == null ? new byte[0] : mo19918a;
    }

    @VisibleForTesting
    public C4107lf(@NonNull C4115ln c4115ln) {
        this.f45884a = c4115ln;
    }
}
