package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.We */
/* loaded from: classes2.dex */
public class C3720We implements InterfaceC4133mf {

    /* renamed from: a */
    @NonNull
    private final C4115ln f44384a;

    public C3720We() {
        this(new C4115ln());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4133mf
    @NonNull
    /* renamed from: a */
    public byte[] mo18816a(@NonNull C3745Xe c3745Xe, @NonNull C4057jh c4057jh) {
        String str = c3745Xe.f44480b;
        return this.f44384a.m20391a(c3745Xe.f44496r).mo19918a(str != null ? C3509O2.m18658c(str) : new byte[0]);
    }

    @VisibleForTesting
    public C3720We(@NonNull C4115ln c4115ln) {
        this.f44384a = c4115ln;
    }
}
