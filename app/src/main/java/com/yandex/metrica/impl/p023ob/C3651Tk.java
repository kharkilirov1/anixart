package com.yandex.metrica.impl.p023ob;

import android.util.SparseIntArray;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.Tk */
/* loaded from: classes2.dex */
public class C3651Tk implements InterfaceC4295sl {

    /* renamed from: a */
    private final SparseIntArray f44106a = new SparseIntArray();

    /* renamed from: b */
    private final int f44107b;

    public C3651Tk(int i2) {
        this.f44107b = i2;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4295sl
    /* renamed from: a */
    public void mo18926a(@NonNull C3727Wl c3727Wl) {
        SparseIntArray sparseIntArray = this.f44106a;
        int i2 = c3727Wl.f44403d;
        sparseIntArray.put(i2, sparseIntArray.get(i2) + 1);
    }

    /* renamed from: a */
    public int m19168a(int i2) {
        int i3 = this.f44107b;
        Integer valueOf = Integer.valueOf(this.f44106a.get(i2));
        if (valueOf == null) {
            valueOf = 0;
        }
        return i3 - valueOf.intValue();
    }
}
