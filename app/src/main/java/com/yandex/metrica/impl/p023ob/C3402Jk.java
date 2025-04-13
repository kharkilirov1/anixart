package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3727Wl;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Jk */
/* loaded from: classes2.dex */
class C3402Jk {

    /* renamed from: a */
    @NonNull
    private final List<Object> f43251a;

    public C3402Jk(@NonNull List<Object> list) {
        this.f43251a = list;
    }

    @Nullable
    /* renamed from: a */
    public C3727Wl.b m18414a(@NonNull String str) {
        Iterator<Object> it = this.f43251a.iterator();
        while (it.hasNext()) {
            InterfaceC4010hm interfaceC4010hm = (InterfaceC4010hm) it.next();
            if (interfaceC4010hm.mo17941a(str)) {
                return interfaceC4010hm.mo17940a();
            }
        }
        return null;
    }
}
