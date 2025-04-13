package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C4064jo;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.bo */
/* loaded from: classes2.dex */
public class C3856bo<T, R> implements InterfaceC3960fo<T, R> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3960fo
    @NonNull
    /* renamed from: a */
    public C4064jo<Map<T, R>> mo19593a(@NonNull Map<T, R> map) {
        return new C4064jo<>(C4064jo.a.NEW, map);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3986go
    @NonNull
    public C4064jo get(@NonNull Object obj) {
        return new C4064jo(C4064jo.a.NEW, (Map) obj);
    }
}
