package com.yandex.mobile.ads.embedded.guava.collect;

import java.io.Serializable;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.c0 */
/* loaded from: classes2.dex */
final class C4673c0 extends AbstractC4675d0<Comparable<?>> implements Serializable {

    /* renamed from: a */
    public static final C4673c0 f47821a = new C4673c0();
    private static final long serialVersionUID = 0;

    private C4673c0() {
    }

    private Object readResolve() {
        return f47821a;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4675d0
    /* renamed from: b */
    public final <S extends Comparable<?>> AbstractC4675d0<S> mo21983b() {
        return C4685i0.f47884a;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4675d0, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        Objects.requireNonNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
