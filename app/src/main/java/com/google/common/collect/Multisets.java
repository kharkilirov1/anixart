package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public final class Multisets {

    /* renamed from: com.google.common.collect.Multisets$1 */
    class C17391 extends ViewMultiset<Object> {

        /* renamed from: com.google.common.collect.Multisets$1$1, reason: invalid class name */
        public class AnonymousClass1 extends AbstractIterator<Multiset.Entry<Object>> {

            /* renamed from: d */
            public final /* synthetic */ Iterator f21356d;

            /* renamed from: e */
            public final /* synthetic */ Iterator f21357e;

            /* renamed from: f */
            public final /* synthetic */ C17391 f21358f;

            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: a */
            public Multiset.Entry<Object> mo11332a() {
                if (this.f21356d.hasNext()) {
                    Multiset.Entry entry = (Multiset.Entry) this.f21356d.next();
                    entry.mo11547b();
                    entry.getCount();
                    Objects.requireNonNull(this.f21358f);
                    throw null;
                }
                if (!this.f21357e.hasNext()) {
                    m11333b();
                    return null;
                }
                ((Multiset.Entry) this.f21357e.next()).mo11547b();
                Objects.requireNonNull(this.f21358f);
                throw null;
            }
        }

        @Override // com.google.common.collect.AbstractMultiset
        /* renamed from: b */
        public Set<Object> mo11387b() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public boolean contains(@NullableDecl Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        /* renamed from: f */
        public Iterator<Object> mo11379f() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset
        /* renamed from: g */
        public Iterator<Multiset.Entry<Object>> mo11380g() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            throw null;
        }

        @Override // com.google.common.collect.Multiset
        /* renamed from: s0 */
        public int mo11383s0(Object obj) {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.Multisets$2 */
    class C17402 extends ViewMultiset<Object> {

        /* renamed from: com.google.common.collect.Multisets$2$1, reason: invalid class name */
        public class AnonymousClass1 extends AbstractIterator<Multiset.Entry<Object>> {

            /* renamed from: d */
            public final /* synthetic */ Iterator f21359d;

            /* renamed from: e */
            public final /* synthetic */ C17402 f21360e;

            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: a */
            public Multiset.Entry<Object> mo11332a() {
                if (!this.f21359d.hasNext()) {
                    m11333b();
                    return null;
                }
                Multiset.Entry entry = (Multiset.Entry) this.f21359d.next();
                entry.mo11547b();
                entry.getCount();
                Objects.requireNonNull(this.f21360e);
                throw null;
            }
        }

        @Override // com.google.common.collect.AbstractMultiset
        /* renamed from: b */
        public Set<Object> mo11387b() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        /* renamed from: f */
        public Iterator<Object> mo11379f() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset
        /* renamed from: g */
        public Iterator<Multiset.Entry<Object>> mo11380g() {
            throw null;
        }

        @Override // com.google.common.collect.Multiset
        /* renamed from: s0 */
        public int mo11383s0(Object obj) {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.Multisets$3 */
    class C17413 extends ViewMultiset<Object> {

        /* renamed from: com.google.common.collect.Multisets$3$1, reason: invalid class name */
        public class AnonymousClass1 extends AbstractIterator<Multiset.Entry<Object>> {

            /* renamed from: d */
            public final /* synthetic */ Iterator f21361d;

            /* renamed from: e */
            public final /* synthetic */ Iterator f21362e;

            /* renamed from: f */
            public final /* synthetic */ C17413 f21363f;

            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: a */
            public Multiset.Entry<Object> mo11332a() {
                if (this.f21361d.hasNext()) {
                    Multiset.Entry entry = (Multiset.Entry) this.f21361d.next();
                    entry.mo11547b();
                    entry.getCount();
                    Objects.requireNonNull(this.f21363f);
                    throw null;
                }
                if (!this.f21362e.hasNext()) {
                    m11333b();
                    return null;
                }
                ((Multiset.Entry) this.f21362e.next()).mo11547b();
                Objects.requireNonNull(this.f21363f);
                throw null;
            }
        }

        @Override // com.google.common.collect.AbstractMultiset
        /* renamed from: b */
        public Set<Object> mo11387b() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public boolean contains(@NullableDecl Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        /* renamed from: f */
        public Iterator<Object> mo11379f() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset
        /* renamed from: g */
        public Iterator<Multiset.Entry<Object>> mo11380g() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            throw null;
        }

        @Override // com.google.common.collect.Multiset
        /* renamed from: s0 */
        public int mo11383s0(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.Multisets$4 */
    class C17424 extends ViewMultiset<Object> {

        /* renamed from: com.google.common.collect.Multisets$4$1, reason: invalid class name */
        public class AnonymousClass1 extends AbstractIterator<Object> {

            /* renamed from: d */
            public final /* synthetic */ Iterator f21364d;

            /* renamed from: e */
            public final /* synthetic */ C17424 f21365e;

            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: a */
            public Object mo11332a() {
                if (!this.f21364d.hasNext()) {
                    m11333b();
                    return null;
                }
                Multiset.Entry entry = (Multiset.Entry) this.f21364d.next();
                entry.mo11547b();
                entry.getCount();
                Objects.requireNonNull(this.f21365e);
                throw null;
            }
        }

        /* renamed from: com.google.common.collect.Multisets$4$2, reason: invalid class name */
        public class AnonymousClass2 extends AbstractIterator<Multiset.Entry<Object>> {

            /* renamed from: d */
            public final /* synthetic */ Iterator f21366d;

            /* renamed from: e */
            public final /* synthetic */ C17424 f21367e;

            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: a */
            public Multiset.Entry<Object> mo11332a() {
                if (!this.f21366d.hasNext()) {
                    m11333b();
                    return null;
                }
                Multiset.Entry entry = (Multiset.Entry) this.f21366d.next();
                entry.mo11547b();
                entry.getCount();
                Objects.requireNonNull(this.f21367e);
                throw null;
            }
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, com.google.common.collect.AbstractMultiset
        /* renamed from: e */
        public int mo11378e() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        /* renamed from: f */
        public Iterator<Object> mo11379f() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        /* renamed from: g */
        public Iterator<Multiset.Entry<Object>> mo11380g() {
            throw null;
        }

        @Override // com.google.common.collect.Multiset
        /* renamed from: s0 */
        public int mo11383s0(@NullableDecl Object obj) {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.Multisets$5 */
    class C17435 extends TransformedIterator<Multiset.Entry<Object>, Object> {
        public C17435(Iterator it) {
            super(it);
        }

        @Override // com.google.common.collect.TransformedIterator
        /* renamed from: a */
        public Object mo11415a(Multiset.Entry<Object> entry) {
            return entry.mo11547b();
        }
    }

    public static abstract class AbstractEntry<E> implements Multiset.Entry<E> {
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            return getCount() == entry.getCount() && com.google.common.base.Objects.m11173a(mo11547b(), entry.mo11547b());
        }

        public int hashCode() {
            E mo11547b = mo11547b();
            return (mo11547b == null ? 0 : mo11547b.hashCode()) ^ getCount();
        }

        public String toString() {
            String valueOf = String.valueOf(mo11547b());
            int count = getCount();
            if (count == 1) {
                return valueOf;
            }
            StringBuilder sb = new StringBuilder(valueOf.length() + 14);
            sb.append(valueOf);
            sb.append(" x ");
            sb.append(count);
            return sb.toString();
        }
    }

    public static final class DecreasingCount implements Comparator<Multiset.Entry<?>> {
        @Override // java.util.Comparator
        public int compare(Multiset.Entry<?> entry, Multiset.Entry<?> entry2) {
            return entry2.getCount() - entry.getCount();
        }
    }

    public static abstract class ElementSet<E> extends Sets.ImprovedAbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo11390e().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return mo11390e().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return mo11390e().containsAll(collection);
        }

        /* renamed from: e */
        public abstract Multiset<E> mo11390e();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return mo11390e().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return mo11390e().mo11381o(obj, Integer.MAX_VALUE) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return mo11390e().entrySet().size();
        }
    }

    public static abstract class EntrySet<E> extends Sets.ImprovedAbstractSet<Multiset.Entry<E>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo11391e().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            return entry.getCount() > 0 && mo11391e().mo11383s0(entry.mo11547b()) == entry.getCount();
        }

        /* renamed from: e */
        public abstract Multiset<E> mo11391e();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof Multiset.Entry) {
                Multiset.Entry entry = (Multiset.Entry) obj;
                Object mo11547b = entry.mo11547b();
                int count = entry.getCount();
                if (count != 0) {
                    return mo11391e().mo11377d0(mo11547b, count, 0);
                }
            }
            return false;
        }
    }

    public static final class FilteredMultiset<E> extends ViewMultiset<E> {

        /* renamed from: com.google.common.collect.Multisets$FilteredMultiset$1 */
        public class C17441 implements Predicate<Multiset.Entry<E>> {

            /* renamed from: b */
            public final /* synthetic */ FilteredMultiset f21368b;

            @Override // com.google.common.base.Predicate
            public boolean apply(Object obj) {
                Objects.requireNonNull(this.f21368b);
                ((Multiset.Entry) obj).mo11547b();
                throw null;
            }
        }

        @Override // com.google.common.collect.AbstractMultiset
        /* renamed from: b */
        public Set<E> mo11387b() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        /* renamed from: d */
        public Set<Multiset.Entry<E>> mo11388d() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        /* renamed from: f */
        public Iterator<E> mo11379f() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset
        /* renamed from: g */
        public Iterator<Multiset.Entry<E>> mo11380g() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public Iterator iterator() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        /* renamed from: o */
        public int mo11381o(@NullableDecl Object obj, int i2) {
            CollectPreconditions.m11427b(i2, "occurrences");
            if (i2 == 0) {
                throw null;
            }
            mo11383s0(obj);
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        /* renamed from: p */
        public int mo11382p(@NullableDecl E e2, int i2) {
            throw null;
        }

        @Override // com.google.common.collect.Multiset
        /* renamed from: s0 */
        public int mo11383s0(@NullableDecl Object obj) {
            throw null;
        }
    }

    public static class ImmutableEntry<E> extends AbstractEntry<E> implements Serializable {

        /* renamed from: b */
        @NullableDecl
        public final E f21369b;

        /* renamed from: c */
        public final int f21370c;

        public ImmutableEntry(@NullableDecl E e2, int i2) {
            this.f21369b = e2;
            this.f21370c = i2;
            CollectPreconditions.m11427b(i2, "count");
        }

        @Override // com.google.common.collect.Multiset.Entry
        @NullableDecl
        /* renamed from: b */
        public final E mo11547b() {
            return this.f21369b;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final int getCount() {
            return this.f21370c;
        }
    }

    public static final class MultisetIteratorImpl<E> implements Iterator<E> {

        /* renamed from: b */
        public final Multiset<E> f21371b;

        /* renamed from: c */
        public final Iterator<Multiset.Entry<E>> f21372c;

        /* renamed from: d */
        @NullableDecl
        public Multiset.Entry<E> f21373d;

        /* renamed from: e */
        public int f21374e;

        /* renamed from: f */
        public int f21375f;

        /* renamed from: g */
        public boolean f21376g;

        public MultisetIteratorImpl(Multiset<E> multiset, Iterator<Multiset.Entry<E>> it) {
            this.f21371b = multiset;
            this.f21372c = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21374e > 0 || this.f21372c.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if (this.f21374e == 0) {
                Multiset.Entry<E> next = this.f21372c.next();
                this.f21373d = next;
                int count = next.getCount();
                this.f21374e = count;
                this.f21375f = count;
            }
            this.f21374e--;
            this.f21376g = true;
            return this.f21373d.mo11547b();
        }

        @Override // java.util.Iterator
        public void remove() {
            Preconditions.m11192p(this.f21376g, "no calls to next() since the last call to remove()");
            if (this.f21375f == 1) {
                this.f21372c.remove();
            } else {
                this.f21371b.remove(this.f21373d.mo11547b());
            }
            this.f21375f--;
            this.f21376g = false;
        }
    }

    public static class UnmodifiableMultiset<E> extends ForwardingMultiset<E> implements Serializable {

        /* renamed from: b */
        public final Multiset<? extends E> f21377b;

        /* renamed from: c */
        @NullableDecl
        public transient Set<E> f21378c;

        /* renamed from: d */
        @NullableDecl
        public transient Set<Multiset.Entry<E>> f21379d;

        public UnmodifiableMultiset(Multiset<? extends E> multiset) {
            this.f21377b = multiset;
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection
        /* renamed from: K, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public Multiset<E> mo11329H() {
            return this.f21377b;
        }

        /* renamed from: L */
        public Set<E> mo11823L() {
            return Collections.unmodifiableSet(this.f21377b.mo11389l());
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        /* renamed from: X */
        public int mo11376X(E e2, int i2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(E e2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        /* renamed from: d0 */
        public boolean mo11377d0(E e2, int i2, int i3) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public Set<Multiset.Entry<E>> entrySet() {
            Set<Multiset.Entry<E>> set = this.f21379d;
            if (set != null) {
                return set;
            }
            Set<Multiset.Entry<E>> unmodifiableSet = Collections.unmodifiableSet(this.f21377b.entrySet());
            this.f21379d = unmodifiableSet;
            return unmodifiableSet;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return Iterators.m11721p(this.f21377b.iterator());
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        /* renamed from: l */
        public Set<E> mo11389l() {
            Set<E> set = this.f21378c;
            if (set != null) {
                return set;
            }
            Set<E> mo11823L = mo11823L();
            this.f21378c = mo11823L;
            return mo11823L;
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        /* renamed from: o */
        public int mo11381o(Object obj, int i2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        /* renamed from: p */
        public int mo11382p(E e2, int i2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
    }

    public static abstract class ViewMultiset<E> extends AbstractMultiset<E> {
        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            mo11389l().clear();
        }

        @Override // com.google.common.collect.AbstractMultiset
        /* renamed from: e */
        public int mo11378e() {
            return mo11389l().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public Iterator<E> iterator() {
            return new MultisetIteratorImpl(this, entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
            long j2 = 0;
            while (entrySet().iterator().hasNext()) {
                j2 += r0.next().getCount();
            }
            return Ints.m12084f(j2);
        }
    }

    /* renamed from: a */
    public static boolean m11821a(Multiset<?> multiset, @NullableDecl Object obj) {
        if (obj == multiset) {
            return true;
        }
        if (obj instanceof Multiset) {
            Multiset multiset2 = (Multiset) obj;
            if (multiset.size() == multiset2.size() && multiset.entrySet().size() == multiset2.entrySet().size()) {
                for (Multiset.Entry entry : multiset2.entrySet()) {
                    if (multiset.mo11383s0(entry.mo11547b()) != entry.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Beta
    /* renamed from: b */
    public static <E> SortedMultiset<E> m11822b(SortedMultiset<E> sortedMultiset) {
        Objects.requireNonNull(sortedMultiset);
        return new UnmodifiableSortedMultiset(sortedMultiset);
    }
}
