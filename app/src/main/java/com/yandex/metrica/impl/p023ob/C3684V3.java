package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3156A;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.V3 */
/* loaded from: classes2.dex */
class C3684V3 {

    /* renamed from: a */
    private final HashMap<String, C3156A> f44200a = new HashMap<>();

    /* renamed from: a */
    public synchronized C3156A m19268a(@NonNull C3862c4 c3862c4, @NonNull C3379Im c3379Im, @NonNull C3316G9 c3316g9) {
        C3156A c3156a;
        c3156a = this.f44200a.get(c3862c4.toString());
        if (c3156a == null) {
            C3156A.a m18139e = c3316g9.m18139e();
            c3156a = new C3156A(m18139e.f42518a, m18139e.f42519b, c3379Im);
            this.f44200a.put(c3862c4.toString(), c3156a);
        }
        return c3156a;
    }
}
