package com.yandex.mobile.ads.embedded.guava.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.yandex.mobile.ads.impl.tr0;
import com.yandex.mobile.ads.impl.ur0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.u */
/* loaded from: classes2.dex */
public final class C4705u {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.u$a */
    public static final class a implements Iterator<Object> {

        /* renamed from: a */
        public static final a f47919a;

        /* renamed from: b */
        private static final /* synthetic */ a[] f47920b;

        static {
            a aVar = new a();
            f47919a = aVar;
            f47920b = new a[]{aVar};
        }

        private a() {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f47920b.clone();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            tr0.m28731a("no calls to next() since the last call to remove()", false);
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: a */
    public static boolean m22077a(Collection collection, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @CanIgnoreReturnValue
    /* renamed from: a */
    public static void m22076a(ArrayList arrayList, Iterator it) {
        while (true) {
            AbstractC4670b abstractC4670b = (AbstractC4670b) it;
            if (!abstractC4670b.hasNext()) {
                return;
            } else {
                arrayList.add(abstractC4670b.next());
            }
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: a */
    public static <T> boolean m22078a(Iterator<T> it, ur0<? super T> ur0Var) {
        Objects.requireNonNull(ur0Var);
        boolean z = false;
        while (it.hasNext()) {
            if (ur0Var.apply(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
