package com.yandex.mobile.ads.embedded.guava.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Comparator;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.d0 */
/* loaded from: classes2.dex */
public abstract class AbstractC4675d0<T> implements Comparator<T> {
    /* renamed from: a */
    public static <C extends Comparable> AbstractC4675d0<C> m21985a() {
        return C4673c0.f47821a;
    }

    /* renamed from: b */
    public <S extends T> AbstractC4675d0<S> mo21983b() {
        return new C4687j0(this);
    }

    @Override // java.util.Comparator
    @CanIgnoreReturnValue
    public abstract int compare(T t, T t2);

    /* renamed from: a */
    public static <T> AbstractC4675d0<T> m21986a(Comparator<T> comparator) {
        return comparator instanceof AbstractC4675d0 ? (AbstractC4675d0) comparator : new C4686j(comparator);
    }
}
