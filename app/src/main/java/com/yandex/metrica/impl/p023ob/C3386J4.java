package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.J4 */
/* loaded from: classes2.dex */
public class C3386J4 {

    /* renamed from: a */
    private final HashMap<String, C4252r4> f43184a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<String, C3784Z3> f43185b = new HashMap<>();

    /* renamed from: c */
    private final Context f43186c;

    public C3386J4(@NonNull Context context) {
        this.f43186c = context.getApplicationContext();
    }

    @Nullable
    /* renamed from: a */
    public synchronized C4252r4 m18385a(@NonNull C3862c4 c3862c4) {
        return this.f43184a.get(c3862c4.toString());
    }

    @NonNull
    /* renamed from: b */
    public synchronized C4252r4 m18386b(@NonNull C3862c4 c3862c4, @NonNull C3734X3 c3734x3, @NonNull InterfaceC3992h4<C4252r4> interfaceC3992h4) {
        return (C4252r4) m18383a(c3862c4, c3734x3, interfaceC3992h4, this.f43184a);
    }

    @NonNull
    /* renamed from: a */
    public synchronized C3784Z3 m18384a(@NonNull C3862c4 c3862c4, @NonNull C3734X3 c3734x3, @NonNull InterfaceC3992h4<C3784Z3> interfaceC3992h4) {
        return (C3784Z3) m18383a(c3862c4, c3734x3, interfaceC3992h4, this.f43185b);
    }

    @NonNull
    /* renamed from: a */
    private <T extends InterfaceC4096l4> T m18383a(@NonNull C3862c4 c3862c4, @NonNull C3734X3 c3734x3, @NonNull InterfaceC3992h4<T> interfaceC3992h4, @NonNull Map<String, T> map) {
        T t = map.get(c3862c4.toString());
        if (t == null) {
            T mo19568a = interfaceC3992h4.mo19568a(this.f43186c, c3862c4, c3734x3);
            map.put(c3862c4.toString(), mo19568a);
            return mo19568a;
        }
        t.mo19499a(c3734x3);
        return t;
    }
}
