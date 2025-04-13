package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C4064jo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ao */
/* loaded from: classes2.dex */
public class C3830ao<T, R> implements InterfaceC3960fo<T, R> {

    /* renamed from: a */
    @NonNull
    private final Map<T, InterfaceC3986go<R>> f44767a;

    public C3830ao(@NonNull Map<T, InterfaceC3986go<R>> map) {
        this.f44767a = Collections.unmodifiableMap(map);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3986go
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4064jo<Map<T, R>> get(@NonNull Map<T, R> map) {
        C4064jo.a.values();
        int[] iArr = new int[3];
        HashMap hashMap = new HashMap();
        for (Map.Entry<T, R> entry : map.entrySet()) {
            InterfaceC3986go<R> interfaceC3986go = this.f44767a.get(entry.getKey());
            if (interfaceC3986go != null) {
                C4064jo<R> c4064jo = interfaceC3986go.get(entry.getValue());
                int ordinal = c4064jo.f45513a.ordinal();
                iArr[ordinal] = iArr[ordinal] + 1;
                hashMap.put(entry.getKey(), c4064jo.f45514b);
            }
        }
        C4064jo.a aVar = C4064jo.a.NEW;
        if (iArr[0] > 0) {
            return new C4064jo<>(aVar, hashMap);
        }
        return iArr[2] > 0 ? new C4064jo<>(C4064jo.a.REFRESH, hashMap) : new C4064jo<>(C4064jo.a.NOT_CHANGED, hashMap);
    }
}
