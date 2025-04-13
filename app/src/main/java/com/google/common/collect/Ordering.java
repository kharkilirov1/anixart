package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Comparator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class Ordering<T> implements Comparator<T> {

    @VisibleForTesting
    public static class ArbitraryOrdering extends Ordering<Object> {

        /* renamed from: b */
        public final AtomicInteger f21401b = new AtomicInteger(0);

        /* renamed from: c */
        public final ConcurrentMap<Object, Integer> f21402c;

        public ArbitraryOrdering() {
            MapMaker mapMaker = new MapMaker();
            mapMaker.m11749d();
            this.f21402c = mapMaker.m11748c();
        }

        @Override // com.google.common.collect.Ordering, java.util.Comparator
        public int compare(Object obj, Object obj2) {
            if (obj == obj2) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            int identityHashCode = System.identityHashCode(obj);
            int identityHashCode2 = System.identityHashCode(obj2);
            if (identityHashCode != identityHashCode2) {
                return identityHashCode < identityHashCode2 ? -1 : 1;
            }
            int compareTo = m11859i(obj).compareTo(m11859i(obj2));
            if (compareTo != 0) {
                return compareTo;
            }
            throw new AssertionError();
        }

        /* renamed from: i */
        public final Integer m11859i(Object obj) {
            Integer num = this.f21402c.get(obj);
            if (num != null) {
                return num;
            }
            Integer valueOf = Integer.valueOf(this.f21401b.getAndIncrement());
            Integer putIfAbsent = this.f21402c.putIfAbsent(obj, valueOf);
            return putIfAbsent != null ? putIfAbsent : valueOf;
        }

        public String toString() {
            return "Ordering.arbitrary()";
        }
    }

    public static class ArbitraryOrderingHolder {
        static {
            new ArbitraryOrdering();
        }
    }

    @VisibleForTesting
    public static class IncomparableValueException extends ClassCastException {
    }

    @GwtCompatible
    /* renamed from: a */
    public static <T> Ordering<T> m11854a(Comparator<T> comparator) {
        return comparator instanceof Ordering ? (Ordering) comparator : new ComparatorOrdering(comparator);
    }

    @GwtCompatible
    /* renamed from: d */
    public static <C extends Comparable> Ordering<C> m11855d() {
        return NaturalOrdering.f21382d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public <E extends T> E mo11856b(@NullableDecl E e2, @NullableDecl E e3) {
        return compare(e2, e3) >= 0 ? e2 : e3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public <E extends T> E mo11857c(@NullableDecl E e2, @NullableDecl E e3) {
        return compare(e2, e3) <= 0 ? e2 : e3;
    }

    @Override // java.util.Comparator
    @CanIgnoreReturnValue
    public abstract int compare(@NullableDecl T t, @NullableDecl T t2);

    @GwtCompatible
    /* renamed from: e */
    public <S extends T> Ordering<S> mo11825e() {
        return new NullsFirstOrdering(this);
    }

    @GwtCompatible
    /* renamed from: f */
    public <S extends T> Ordering<S> mo11826f() {
        return new NullsLastOrdering(this);
    }

    @GwtCompatible
    /* renamed from: g */
    public <F> Ordering<F> m11858g(Function<F, ? extends T> function) {
        return new ByFunctionOrdering(function, this);
    }

    @GwtCompatible
    /* renamed from: h */
    public <S extends T> Ordering<S> mo11416h() {
        return new ReverseOrdering(this);
    }
}
