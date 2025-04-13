package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.billing_interface.C3115a;
import com.yandex.metrica.billing_interface.C3121g;
import com.yandex.metrica.billing_interface.EnumC3119e;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.k */
/* loaded from: classes2.dex */
public class C4065k implements InterfaceC4351v {

    /* renamed from: a */
    @NonNull
    private final C3121g f45519a;

    public C4065k() {
        this(new C3121g());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4351v
    @NonNull
    /* renamed from: a */
    public Map<String, C3115a> mo20174a(@NonNull C4195p c4195p, @NonNull Map<String, C3115a> map, @NonNull InterfaceC4273s interfaceC4273s) {
        C3115a mo20069a;
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            C3115a c3115a = map.get(str);
            Objects.requireNonNull(this.f45519a);
            long currentTimeMillis = System.currentTimeMillis();
            if (c3115a.f42392a != EnumC3119e.INAPP || interfaceC4273s.mo20071a() ? !((mo20069a = interfaceC4273s.mo20069a(c3115a.f42393b)) != null && mo20069a.f42394c.equals(c3115a.f42394c) && (c3115a.f42392a != EnumC3119e.SUBS || currentTimeMillis - mo20069a.f42396e < TimeUnit.SECONDS.toMillis((long) c4195p.f46090a))) : currentTimeMillis - c3115a.f42395d <= TimeUnit.SECONDS.toMillis((long) c4195p.f46091b)) {
                hashMap.put(str, c3115a);
            }
        }
        return hashMap;
    }

    public C4065k(@NonNull C3121g c3121g) {
        this.f45519a = c3121g;
    }
}
