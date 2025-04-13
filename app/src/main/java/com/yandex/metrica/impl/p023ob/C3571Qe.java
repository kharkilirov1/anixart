package com.yandex.metrica.impl.p023ob;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.Qe */
/* loaded from: classes2.dex */
public class C3571Qe implements InterfaceC4133mf {

    /* renamed from: a */
    @NonNull
    private final C4115ln f43705a;

    public C3571Qe() {
        this(new C4115ln());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4133mf
    @NonNull
    /* renamed from: a */
    public byte[] mo18816a(@NonNull C3745Xe c3745Xe, @NonNull C4057jh c4057jh) {
        byte[] bArr = new byte[0];
        String str = c3745Xe.f44480b;
        if (str != null) {
            try {
                bArr = Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        return this.f43705a.m20391a(c3745Xe.f44496r).mo19918a(bArr);
    }

    @VisibleForTesting
    public C3571Qe(@NonNull C4115ln c4115ln) {
        this.f43705a = c4115ln;
    }
}
