package com.google.common.collect;

import android.R;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public final class Iterables {

    /* renamed from: com.google.common.collect.Iterables$1 */
    class C16701 extends FluentIterable<Object> {
        @Override // java.lang.Iterable
        public Iterator<Object> iterator() {
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // com.google.common.collect.FluentIterable
        public String toString() {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.Iterables$2 */
    class C16722 extends FluentIterable<List<Object>> {
        @Override // java.lang.Iterable
        public Iterator<List<Object>> iterator() {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.Iterables$3 */
    class C16733 extends FluentIterable<List<Object>> {
        @Override // java.lang.Iterable
        public Iterator<List<Object>> iterator() {
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.Iterables$4 */
    public class C16744<T> extends FluentIterable<T> {

        /* renamed from: c */
        public final /* synthetic */ Iterable f21108c;

        /* renamed from: d */
        public final /* synthetic */ Predicate f21109d;

        public C16744(Iterable iterable, Predicate predicate) {
            this.f21108c = iterable;
            this.f21109d = predicate;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.m11710e(this.f21108c.iterator(), this.f21109d);
        }
    }

    /* renamed from: com.google.common.collect.Iterables$7 */
    class C16777 extends FluentIterable<Object> {
        @Override // java.lang.Iterable
        public Iterator<Object> iterator() {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.Iterables$8 */
    class C16788 extends FluentIterable<Object> {
        @Override // java.lang.Iterable
        public Iterator<Object> iterator() {
            throw null;
        }

        @Override // com.google.common.collect.FluentIterable
        public String toString() {
            return "Iterables.consumingIterable(...)";
        }
    }

    /* renamed from: com.google.common.collect.Iterables$9 */
    class C16799 extends FluentIterable<Object> {
        @Override // java.lang.Iterable
        public Iterator<Object> iterator() {
            Iterables.m11705j(null, new Function<Iterable<Object>, Iterator<Object>>() { // from class: com.google.common.collect.Iterables.10
                @Override // com.google.common.base.Function
                public Iterator<Object> apply(Iterable<Object> iterable) {
                    return iterable.iterator();
                }
            });
            throw null;
        }
    }

    public static final class UnmodifiableIterable<T> extends FluentIterable<T> {
        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            throw null;
        }

        @Override // com.google.common.collect.FluentIterable
        public String toString() {
            throw null;
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: a */
    public static <T> boolean m11696a(Collection<T> collection, Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        Objects.requireNonNull(iterable);
        return Iterators.m11706a(collection, iterable.iterator());
    }

    /* renamed from: b */
    public static <T> boolean m11697b(Iterable<T> iterable, Predicate<? super T> predicate) {
        Iterator<T> it = iterable.iterator();
        Preconditions.m11187k(predicate, "predicate");
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (predicate.apply(it.next())) {
                break;
            }
            i2++;
        }
        return i2 != -1;
    }

    /* renamed from: c */
    public static <T> Iterable<T> m11698c(Iterable<T> iterable, Predicate<? super T> predicate) {
        Objects.requireNonNull(iterable);
        Objects.requireNonNull(predicate);
        return new C16744(iterable, predicate);
    }

    @NullableDecl
    /* renamed from: d */
    public static <T> T m11699d(Iterable<? extends T> iterable, @NullableDecl T t) {
        return (T) Iterators.m11714i(iterable.iterator(), null);
    }

    /* renamed from: e */
    public static <T> T m11700e(Iterable<T> iterable) {
        T next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return (T) list.get(list.size() - 1);
        }
        Iterator<T> it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    @NullableDecl
    /* renamed from: f */
    public static <T> T m11701f(Iterable<? extends T> iterable, @NullableDecl T t) {
        T t2 = null;
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return null;
            }
            if (iterable instanceof List) {
                return (T) ((List) iterable).get(r1.size() - 1);
            }
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            do {
                t2 = it.next();
            } while (it.hasNext());
        }
        return t2;
    }

    @NullableDecl
    /* renamed from: g */
    public static <T> T m11702g(Iterable<T> iterable, Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    @CanIgnoreReturnValue
    /* renamed from: h */
    public static <T> boolean m11703h(Iterable<T> iterable, Predicate<? super T> predicate) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            Iterator<T> it = iterable.iterator();
            Objects.requireNonNull(predicate);
            while (it.hasNext()) {
                if (predicate.apply(it.next())) {
                    it.remove();
                    r1 = true;
                }
            }
            return r1;
        }
        List list = (List) iterable;
        Objects.requireNonNull(predicate);
        int i2 = 0;
        int i3 = 0;
        while (i2 < list.size()) {
            R.attr attrVar = (Object) list.get(i2);
            if (!predicate.apply(attrVar)) {
                if (i2 > i3) {
                    try {
                        list.set(i3, attrVar);
                    } catch (IllegalArgumentException unused) {
                        m11704i(list, predicate, i3, i2);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        m11704i(list, predicate, i3, i2);
                        return true;
                    }
                }
                i3++;
            }
            i2++;
        }
        list.subList(i3, list.size()).clear();
        return i2 != i3;
    }

    /* renamed from: i */
    public static <T> void m11704i(List<T> list, Predicate<? super T> predicate, int i2, int i3) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i3) {
                break;
            } else if (predicate.apply(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i3--;
            if (i3 < i2) {
                return;
            } else {
                list.remove(i3);
            }
        }
    }

    /* renamed from: j */
    public static <F, T> Iterable<T> m11705j(final Iterable<F> iterable, final Function<? super F, ? extends T> function) {
        Objects.requireNonNull(iterable);
        return new FluentIterable<T>() { // from class: com.google.common.collect.Iterables.5
            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return Iterators.m11720o(iterable.iterator(), function);
            }
        };
    }
}
