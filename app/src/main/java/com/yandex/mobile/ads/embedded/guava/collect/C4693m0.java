package com.yandex.mobile.ads.embedded.guava.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.yandex.mobile.ads.impl.ur0;
import com.yandex.mobile.ads.impl.vr0;
import com.yandex.mobile.ads.impl.wg0;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.m0 */
/* loaded from: classes2.dex */
public final class C4693m0 {

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.m0$a */
    public static class a<E> extends C4684i<E> implements Set<E> {
        public a(Set<E> set, ur0<? super E> ur0Var) {
            super(set, ur0Var);
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(@CheckForNull Object obj) {
            return C4693m0.m22043a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return C4693m0.m22039a(this);
        }
    }

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.m0$b */
    public static class b<E> extends a<E> implements SortedSet<E> {
        public b(SortedSet<E> sortedSet, ur0<? super E> ur0Var) {
            super(sortedSet, ur0Var);
        }

        @Override // java.util.SortedSet
        @CheckForNull
        public final Comparator<? super E> comparator() {
            return ((SortedSet) this.f47882a).comparator();
        }

        @Override // java.util.SortedSet
        public final E first() {
            Iterator<E> it = this.f47882a.iterator();
            ur0<? super E> ur0Var = this.f47883b;
            Objects.requireNonNull(it);
            Objects.requireNonNull(ur0Var);
            while (it.hasNext()) {
                E next = it.next();
                if (ur0Var.apply(next)) {
                    return next;
                }
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> headSet(E e2) {
            return new b(((SortedSet) this.f47882a).headSet(e2), this.f47883b);
        }

        @Override // java.util.SortedSet
        public final E last() {
            SortedSet sortedSet = (SortedSet) this.f47882a;
            while (true) {
                E e2 = (Object) sortedSet.last();
                if (this.f47883b.apply(e2)) {
                    return e2;
                }
                sortedSet = sortedSet.headSet(e2);
            }
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> subSet(E e2, E e3) {
            return new b(((SortedSet) this.f47882a).subSet(e2, e3), this.f47883b);
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> tailSet(E e2) {
            return new b(((SortedSet) this.f47882a).tailSet(e2), this.f47883b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.m0$c */
    public static abstract class c<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            Objects.requireNonNull(collection);
            if (collection instanceof wg0) {
                collection = ((wg0) collection).m29481a();
            }
            return (!(collection instanceof Set) || collection.size() <= size()) ? C4693m0.m22044a((Set<?>) this, collection.iterator()) : C4705u.m22077a(collection, iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            Objects.requireNonNull(collection);
            return super.retainAll(collection);
        }
    }

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.m0$d */
    public static abstract class d<E> extends AbstractSet<E> {
        public /* synthetic */ d(int i2) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall
        @Deprecated
        public final boolean add(E e2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @DoNotCall
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall
        @Deprecated
        public final boolean remove(@CheckForNull Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        private d() {
        }
    }

    /* renamed from: a */
    public static <E> Set<E> m22041a() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }

    /* renamed from: a */
    public static d m22040a(AbstractC4702r abstractC4702r, AbstractC4702r abstractC4702r2) {
        Objects.requireNonNull(abstractC4702r, "set1");
        Objects.requireNonNull(abstractC4702r2, "set2");
        return new C4691l0(abstractC4702r, abstractC4702r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static <E> Set<E> m22042a(Set<E> set, ur0<? super E> ur0Var) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof a) {
                a aVar = (a) sortedSet;
                return new b((SortedSet) aVar.f47882a, vr0.m29260a(aVar.f47883b, ur0Var));
            }
            Objects.requireNonNull(sortedSet);
            Objects.requireNonNull(ur0Var);
            return new b(sortedSet, ur0Var);
        }
        if (set instanceof a) {
            a aVar2 = (a) set;
            return new a((Set) aVar2.f47882a, vr0.m29260a(aVar2.f47883b, ur0Var));
        }
        Objects.requireNonNull(set);
        Objects.requireNonNull(ur0Var);
        return new a(set, ur0Var);
    }

    /* renamed from: a */
    public static int m22039a(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i2 = ~(~(i2 + (next != null ? next.hashCode() : 0)));
        }
        return i2;
    }

    /* renamed from: a */
    public static boolean m22043a(Set<?> set, @CheckForNull Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m22044a(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
