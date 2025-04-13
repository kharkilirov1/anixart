package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public final class Iterators {

    /* renamed from: com.google.common.collect.Iterators$10 */
    class C168110 extends UnmodifiableIterator<Object> {
        @Override // java.util.Iterator
        public boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.Iterators$11 */
    class C168211 implements Enumeration<Object> {
        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            throw null;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.Iterators$2 */
    class C16832 implements Iterator<Object> {

        /* renamed from: b */
        public Iterator<Object> f21117b;

        /* renamed from: c */
        public final /* synthetic */ Iterable f21118c;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21117b.hasNext() || this.f21118c.iterator().hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f21117b.hasNext()) {
                Iterator<Object> it = this.f21118c.iterator();
                this.f21117b = it;
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
            }
            return this.f21117b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f21117b.remove();
        }
    }

    /* renamed from: com.google.common.collect.Iterators$4 */
    class C16854 extends UnmodifiableIterator<List<Object>> {

        /* renamed from: b */
        public final /* synthetic */ Iterator f21121b;

        /* renamed from: c */
        public final /* synthetic */ int f21122c;

        /* renamed from: d */
        public final /* synthetic */ boolean f21123d;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21121b.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object[] objArr = new Object[this.f21122c];
            int i2 = 0;
            while (i2 < this.f21122c && this.f21121b.hasNext()) {
                objArr[i2] = this.f21121b.next();
                i2++;
            }
            for (int i3 = i2; i3 < this.f21122c; i3++) {
                objArr[i3] = null;
            }
            List unmodifiableList = Collections.unmodifiableList(Arrays.asList(objArr));
            return (this.f21123d || i2 == this.f21122c) ? unmodifiableList : unmodifiableList.subList(0, i2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, F] */
    /* renamed from: com.google.common.collect.Iterators$6 */
    public class C16876<F, T> extends TransformedIterator<F, T> {

        /* renamed from: c */
        public final /* synthetic */ Function f21126c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16876(Iterator it, Function function) {
            super(it);
            this.f21126c = function;
        }

        @Override // com.google.common.collect.TransformedIterator
        /* renamed from: a */
        public T mo11415a(F f2) {
            return (T) this.f21126c.apply(f2);
        }
    }

    /* renamed from: com.google.common.collect.Iterators$7 */
    class C16887 implements Iterator<Object> {

        /* renamed from: b */
        public int f21127b;

        /* renamed from: c */
        public final /* synthetic */ int f21128c;

        /* renamed from: d */
        public final /* synthetic */ Iterator f21129d;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21127b < this.f21128c && this.f21129d.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f21127b++;
            return this.f21129d.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f21129d.remove();
        }
    }

    /* renamed from: com.google.common.collect.Iterators$8 */
    class C16898 extends UnmodifiableIterator<Object> {

        /* renamed from: b */
        public final /* synthetic */ Iterator f21130b;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21130b.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            Object next = this.f21130b.next();
            this.f21130b.remove();
            return next;
        }

        public String toString() {
            return "Iterators.consumingIterator(...)";
        }
    }

    public static final class ArrayItr<T> extends AbstractIndexedListIterator<T> {

        /* renamed from: f */
        public static final UnmodifiableListIterator<Object> f21133f = new ArrayItr(new Object[0], 0, 0, 0);

        /* renamed from: d */
        public final T[] f21134d;

        /* renamed from: e */
        public final int f21135e;

        public ArrayItr(T[] tArr, int i2, int i3, int i4) {
            super(i3, i4);
            this.f21134d = tArr;
            this.f21135e = i2;
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        /* renamed from: a */
        public T mo11331a(int i2) {
            return this.f21134d[this.f21135e + i2];
        }
    }

    public static class ConcatenatedIterator<T> implements Iterator<T> {

        /* renamed from: b */
        @NullableDecl
        public Iterator<? extends T> f21136b;

        /* renamed from: c */
        public Iterator<? extends T> f21137c = ArrayItr.f21133f;

        /* renamed from: d */
        public Iterator<? extends Iterator<? extends T>> f21138d;

        /* renamed from: e */
        @NullableDecl
        public Deque<Iterator<? extends Iterator<? extends T>>> f21139e;

        public ConcatenatedIterator(Iterator<? extends Iterator<? extends T>> it) {
            Objects.requireNonNull(it);
            this.f21138d = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Iterator<? extends Iterator<? extends T>> it;
            while (true) {
                Iterator<? extends T> it2 = this.f21137c;
                Objects.requireNonNull(it2);
                if (it2.hasNext()) {
                    return true;
                }
                while (true) {
                    Iterator<? extends Iterator<? extends T>> it3 = this.f21138d;
                    if (it3 != null && it3.hasNext()) {
                        it = this.f21138d;
                        break;
                    }
                    Deque<Iterator<? extends Iterator<? extends T>>> deque = this.f21139e;
                    if (deque == null || deque.isEmpty()) {
                        break;
                    }
                    this.f21138d = this.f21139e.removeFirst();
                }
                it = null;
                this.f21138d = it;
                if (it == null) {
                    return false;
                }
                Iterator<? extends T> next = it.next();
                this.f21137c = next;
                if (next instanceof ConcatenatedIterator) {
                    ConcatenatedIterator concatenatedIterator = (ConcatenatedIterator) next;
                    this.f21137c = concatenatedIterator.f21137c;
                    if (this.f21139e == null) {
                        this.f21139e = new ArrayDeque();
                    }
                    this.f21139e.addFirst(this.f21138d);
                    if (concatenatedIterator.f21139e != null) {
                        while (!concatenatedIterator.f21139e.isEmpty()) {
                            this.f21139e.addFirst(concatenatedIterator.f21139e.removeLast());
                        }
                    }
                    this.f21138d = concatenatedIterator.f21138d;
                }
            }
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator<? extends T> it = this.f21137c;
            this.f21136b = it;
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            Preconditions.m11192p(this.f21136b != null, "no calls to next() since the last call to remove()");
            this.f21136b.remove();
            this.f21136b = null;
        }
    }

    public enum EmptyModifiableIterator implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            Preconditions.m11192p(false, "no calls to next() since the last call to remove()");
        }
    }

    public static class MergingIterator<T> extends UnmodifiableIterator<T> {

        /* renamed from: b */
        public final Queue<PeekingIterator<T>> f21142b;

        /* renamed from: com.google.common.collect.Iterators$MergingIterator$1 */
        class C16911 implements Comparator<PeekingIterator<Object>> {

            /* renamed from: b */
            public final /* synthetic */ Comparator f21143b;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public int compare(PeekingIterator<Object> peekingIterator, PeekingIterator<Object> peekingIterator2) {
                return this.f21143b.compare(peekingIterator.peek(), peekingIterator2.peek());
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f21142b.isEmpty();
        }

        @Override // java.util.Iterator
        public T next() {
            PeekingIterator<T> remove = this.f21142b.remove();
            T next = remove.next();
            if (remove.hasNext()) {
                this.f21142b.add(remove);
            }
            return next;
        }
    }

    public static class PeekingImpl<E> implements PeekingIterator<E> {

        /* renamed from: b */
        public final Iterator<? extends E> f21144b;

        /* renamed from: c */
        public boolean f21145c;

        /* renamed from: d */
        @NullableDecl
        public E f21146d;

        public PeekingImpl(Iterator<? extends E> it) {
            Objects.requireNonNull(it);
            this.f21144b = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21145c || this.f21144b.hasNext();
        }

        @Override // com.google.common.collect.PeekingIterator, java.util.Iterator
        public E next() {
            if (!this.f21145c) {
                return this.f21144b.next();
            }
            E e2 = this.f21146d;
            this.f21145c = false;
            this.f21146d = null;
            return e2;
        }

        @Override // com.google.common.collect.PeekingIterator
        public E peek() {
            if (!this.f21145c) {
                this.f21146d = this.f21144b.next();
                this.f21145c = true;
            }
            return this.f21146d;
        }

        @Override // java.util.Iterator
        public void remove() {
            Preconditions.m11192p(!this.f21145c, "Can't remove after you've peeked at next");
            this.f21144b.remove();
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: a */
    public static <T> boolean m11706a(Collection<T> collection, Iterator<? extends T> it) {
        Objects.requireNonNull(collection);
        Objects.requireNonNull(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    /* renamed from: b */
    public static void m11707b(Iterator<?> it) {
        Objects.requireNonNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* renamed from: c */
    public static <T> Iterator<T> m11708c(Iterator<? extends T> it, Iterator<? extends T> it2) {
        final Iterator[] itArr = {it, it2};
        return new ConcatenatedIterator(new UnmodifiableIterator<Object>() { // from class: com.google.common.collect.Iterators.3

            /* renamed from: b */
            public int f21119b = 0;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f21119b < itArr.length;
            }

            @Override // java.util.Iterator
            public Object next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = itArr;
                int i2 = this.f21119b;
                Object obj = objArr[i2];
                objArr[i2] = null;
                this.f21119b = i2 + 1;
                return obj;
            }
        });
    }

    /* renamed from: d */
    public static boolean m11709d(Iterator<?> it, @NullableDecl Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static <T> UnmodifiableIterator<T> m11710e(final Iterator<T> it, final Predicate<? super T> predicate) {
        Objects.requireNonNull(it);
        Objects.requireNonNull(predicate);
        return new AbstractIterator<T>() { // from class: com.google.common.collect.Iterators.5
            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: a */
            public T mo11332a() {
                while (it.hasNext()) {
                    T t = (T) it.next();
                    if (predicate.apply(t)) {
                        return t;
                    }
                }
                m11333b();
                return null;
            }
        };
    }

    /* renamed from: f */
    public static <T> T m11711f(Iterator<T> it, Predicate<? super T> predicate) {
        Objects.requireNonNull(it);
        Objects.requireNonNull(predicate);
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @NullableDecl
    /* renamed from: g */
    public static <T> T m11712g(Iterator<? extends T> it, Predicate<? super T> predicate, @NullableDecl T t) {
        Objects.requireNonNull(it);
        Objects.requireNonNull(predicate);
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        return t;
    }

    @SafeVarargs
    /* renamed from: h */
    public static <T> UnmodifiableIterator<T> m11713h(T... tArr) {
        int length = tArr.length;
        Preconditions.m11178b(length >= 0);
        Preconditions.m11190n(0, length + 0, tArr.length);
        Preconditions.m11189m(0, length);
        return length == 0 ? ArrayItr.f21133f : new ArrayItr(tArr, 0, length, 0);
    }

    @NullableDecl
    /* renamed from: i */
    public static <T> T m11714i(Iterator<? extends T> it, @NullableDecl T t) {
        return it.hasNext() ? it.next() : t;
    }

    /* renamed from: j */
    public static <T> PeekingIterator<T> m11715j(Iterator<? extends T> it) {
        return it instanceof PeekingImpl ? (PeekingImpl) it : new PeekingImpl(it);
    }

    @NullableDecl
    /* renamed from: k */
    public static <T> T m11716k(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    @CanIgnoreReturnValue
    /* renamed from: l */
    public static boolean m11717l(Iterator<?> it, Collection<?> collection) {
        Objects.requireNonNull(collection);
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
    /* renamed from: m */
    public static boolean m11718m(Iterator<?> it, Collection<?> collection) {
        Objects.requireNonNull(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: n */
    public static int m11719n(Iterator<?> it) {
        long j2 = 0;
        while (it.hasNext()) {
            it.next();
            j2++;
        }
        return Ints.m12084f(j2);
    }

    /* renamed from: o */
    public static <F, T> Iterator<T> m11720o(Iterator<F> it, Function<? super F, ? extends T> function) {
        Objects.requireNonNull(function);
        return new C16876(it, function);
    }

    /* renamed from: p */
    public static <T> UnmodifiableIterator<T> m11721p(final Iterator<? extends T> it) {
        Objects.requireNonNull(it);
        return it instanceof UnmodifiableIterator ? (UnmodifiableIterator) it : new UnmodifiableIterator<T>() { // from class: com.google.common.collect.Iterators.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public T next() {
                return (T) it.next();
            }
        };
    }
}
