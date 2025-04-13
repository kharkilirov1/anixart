package com.yandex.metrica.impl.p023ob;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.ho */
/* loaded from: classes2.dex */
public class C4012ho<T> implements Comparator<Collection<T>> {

    /* renamed from: a */
    private final InterfaceC3934eo<T> f45305a;

    /* renamed from: b */
    private final Comparator<T> f45306b;

    public C4012ho(InterfaceC3934eo<T> interfaceC3934eo, Comparator<T> comparator) {
        this.f45305a = interfaceC3934eo;
        this.f45306b = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        Collection collection = (Collection) obj;
        Collection collection2 = (Collection) obj2;
        if (!((collection2 == null) ^ (collection == null))) {
            if (collection == collection2) {
                return 0;
            }
            if (collection.size() == collection2.size()) {
                HashMap hashMap = new HashMap();
                for (Object obj3 : collection) {
                    hashMap.put(this.f45305a.mo19489a(obj3), obj3);
                }
                for (Object obj4 : collection2) {
                    Object obj5 = hashMap.get(this.f45305a.mo19489a(obj4));
                    if (obj5 != null && this.f45306b.compare(obj5, obj4) == 0) {
                    }
                }
                return 0;
            }
        }
        return 10;
    }
}
