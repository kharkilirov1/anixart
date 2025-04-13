package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.Ij */
/* loaded from: classes2.dex */
public class C3376Ij implements InterfaceC3226Cj {

    /* renamed from: a */
    @NonNull
    private final C3291F9 f43138a;

    public C3376Ij(@NonNull C3291F9 c3291f9) {
        this.f43138a = c3291f9;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3226Cj
    @Nullable
    /* renamed from: a */
    public String mo17939a() {
        C3963g1 m18093t = this.f43138a.m18093t();
        String str = !TextUtils.isEmpty(m18093t.f45155a) ? m18093t.f45155a : null;
        if (str != null) {
            return str;
        }
        String m18080m = this.f43138a.m18080m(null);
        return !TextUtils.isEmpty(m18080m) ? m18080m : str;
    }
}
