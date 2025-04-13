package com.google.common.collect;

import androidx.emoji2.text.flatbuffer.C0321a;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class FluentIterable<E> implements Iterable<E> {

    /* renamed from: b */
    public final Optional<Iterable<E>> f20980b;

    /* renamed from: com.google.common.collect.FluentIterable$2 */
    class C16472 extends FluentIterable<Object> {
        @Override // java.lang.Iterable
        public Iterator<Object> iterator() {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.FluentIterable$3 */
    class C16483 extends FluentIterable<Object> {

        /* renamed from: c */
        public final /* synthetic */ Iterable[] f20982c;

        @Override // java.lang.Iterable
        public Iterator<Object> iterator() {
            return new Iterators.ConcatenatedIterator(new AbstractIndexedListIterator<Iterator<Object>>(this.f20982c.length) { // from class: com.google.common.collect.FluentIterable.3.1
                @Override // com.google.common.collect.AbstractIndexedListIterator
                /* renamed from: a */
                public Iterator<Object> mo11331a(int i2) {
                    return C16483.this.f20982c[i2].iterator();
                }
            });
        }
    }

    public static class FromIterableFunction<E> implements Function<Iterable<E>, FluentIterable<E>> {
        @Override // com.google.common.base.Function
        public Object apply(Object obj) {
            return FluentIterable.m11553b((Iterable) obj);
        }
    }

    public FluentIterable() {
        this.f20980b = Optional.m11174a();
    }

    /* renamed from: b */
    public static <E> FluentIterable<E> m11553b(final Iterable<E> iterable) {
        return iterable instanceof FluentIterable ? (FluentIterable) iterable : new FluentIterable<E>(iterable) { // from class: com.google.common.collect.FluentIterable.1
            @Override // java.lang.Iterable
            public Iterator<E> iterator() {
                return iterable.iterator();
            }
        };
    }

    @GwtIncompatible
    /* renamed from: a */
    public final <T> FluentIterable<T> m11554a(Class<T> cls) {
        Iterable<E> m11555d = m11555d();
        Objects.requireNonNull(m11555d);
        Objects.requireNonNull(cls);
        return m11553b(new Iterables.C16744(m11555d, Predicates.m11202g(cls)));
    }

    /* renamed from: d */
    public final Iterable<E> m11555d() {
        return this.f20980b.mo11118e(this);
    }

    /* renamed from: e */
    public final ImmutableSet<E> m11556e() {
        Iterable<E> m11555d = m11555d();
        int i2 = ImmutableSet.f21087d;
        if (m11555d instanceof Collection) {
            return ImmutableSet.m11676x((Collection) m11555d);
        }
        Iterator<E> it = m11555d.iterator();
        if (!it.hasNext()) {
            return RegularImmutableSet.f21445j;
        }
        E next = it.next();
        if (!it.hasNext()) {
            return new SingletonImmutableSet(next);
        }
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        builder.mo11678d(next);
        builder.mo11679e(it);
        return builder.mo11680f();
    }

    public String toString() {
        Iterator<E> it = m11555d().iterator();
        StringBuilder m2872a = C0321a.m2872a('[');
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                m2872a.append(", ");
            }
            z = false;
            m2872a.append(it.next());
        }
        m2872a.append(']');
        return m2872a.toString();
    }

    public FluentIterable(Iterable<E> iterable) {
        Objects.requireNonNull(iterable);
        this.f20980b = Optional.m11175b(this == iterable ? null : iterable);
    }
}
