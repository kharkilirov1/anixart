package com.yandex.mobile.ads.embedded.guava.collect;

import java.io.Serializable;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.i0 */
/* loaded from: classes2.dex */
final class C4685i0 extends AbstractC4675d0<Comparable<?>> implements Serializable {

    /* renamed from: a */
    public static final C4685i0 f47884a = new C4685i0();
    private static final long serialVersionUID = 0;

    private C4685i0() {
    }

    private Object readResolve() {
        return f47884a;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4675d0
    /* renamed from: b */
    public final <S extends Comparable<?>> AbstractC4675d0<S> mo21983b() {
        return C4673c0.f47821a;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4675d0, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
