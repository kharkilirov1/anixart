package io.reactivex.internal.functions;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function4;
import io.reactivex.functions.Function6;
import io.reactivex.functions.LongConsumer;
import io.reactivex.functions.Predicate;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Timed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscription;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class Functions {

    /* renamed from: a */
    public static final Runnable f59620a = new EmptyRunnable();

    /* renamed from: b */
    public static final Action f59621b = new EmptyAction();

    /* renamed from: c */
    public static final Consumer<Object> f59622c = new EmptyConsumer();

    /* renamed from: d */
    public static final Consumer<Throwable> f59623d = new OnErrorMissingConsumer();

    public static final class ActionConsumer<T> implements Consumer<T> {

        /* renamed from: b */
        public final Action f59624b;

        public ActionConsumer(Action action) {
            this.f59624b = action;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(T t) throws Exception {
            this.f59624b.run();
        }
    }

    public static final class Array2Func<T1, T2, R> implements Function<Object[], R> {

        /* renamed from: b */
        public final BiFunction<? super T1, ? super T2, ? extends R> f59625b;

        public Array2Func(BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
            this.f59625b = biFunction;
        }

        @Override // io.reactivex.functions.Function
        public Object apply(Object[] objArr) throws Exception {
            Object[] objArr2 = objArr;
            if (objArr2.length == 2) {
                return this.f59625b.apply(objArr2[0], objArr2[1]);
            }
            StringBuilder m24u = C0000a.m24u("Array of size 2 expected but got ");
            m24u.append(objArr2.length);
            throw new IllegalArgumentException(m24u.toString());
        }
    }

    public static final class Array3Func<T1, T2, T3, R> implements Function<Object[], R> {
        @Override // io.reactivex.functions.Function
        public Object apply(Object[] objArr) throws Exception {
            Object[] objArr2 = objArr;
            if (objArr2.length != 3) {
                StringBuilder m24u = C0000a.m24u("Array of size 3 expected but got ");
                m24u.append(objArr2.length);
                throw new IllegalArgumentException(m24u.toString());
            }
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            Object obj3 = objArr2[2];
            throw null;
        }
    }

    public static final class Array4Func<T1, T2, T3, T4, R> implements Function<Object[], R> {

        /* renamed from: b */
        public final Function4<T1, T2, T3, T4, R> f59626b;

        public Array4Func(Function4<T1, T2, T3, T4, R> function4) {
            this.f59626b = function4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.Function
        public Object apply(Object[] objArr) throws Exception {
            Object[] objArr2 = objArr;
            if (objArr2.length == 4) {
                return this.f59626b.mo14893a(objArr2[0], objArr2[1], objArr2[2], objArr2[3]);
            }
            StringBuilder m24u = C0000a.m24u("Array of size 4 expected but got ");
            m24u.append(objArr2.length);
            throw new IllegalArgumentException(m24u.toString());
        }
    }

    public static final class Array5Func<T1, T2, T3, T4, T5, R> implements Function<Object[], R> {
        @Override // io.reactivex.functions.Function
        public Object apply(Object[] objArr) throws Exception {
            Object[] objArr2 = objArr;
            if (objArr2.length != 5) {
                StringBuilder m24u = C0000a.m24u("Array of size 5 expected but got ");
                m24u.append(objArr2.length);
                throw new IllegalArgumentException(m24u.toString());
            }
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            Object obj3 = objArr2[2];
            Object obj4 = objArr2[3];
            Object obj5 = objArr2[4];
            throw null;
        }
    }

    public static final class Array6Func<T1, T2, T3, T4, T5, T6, R> implements Function<Object[], R> {

        /* renamed from: b */
        public final Function6<T1, T2, T3, T4, T5, T6, R> f59627b;

        public Array6Func(Function6<T1, T2, T3, T4, T5, T6, R> function6) {
            this.f59627b = function6;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.Function
        public Object apply(Object[] objArr) throws Exception {
            Object[] objArr2 = objArr;
            if (objArr2.length == 6) {
                return this.f59627b.mo14545a(objArr2[0], objArr2[1], objArr2[2], objArr2[3], objArr2[4], objArr2[5]);
            }
            StringBuilder m24u = C0000a.m24u("Array of size 6 expected but got ");
            m24u.append(objArr2.length);
            throw new IllegalArgumentException(m24u.toString());
        }
    }

    public static final class Array7Func<T1, T2, T3, T4, T5, T6, T7, R> implements Function<Object[], R> {
        @Override // io.reactivex.functions.Function
        public Object apply(Object[] objArr) throws Exception {
            Object[] objArr2 = objArr;
            if (objArr2.length != 7) {
                StringBuilder m24u = C0000a.m24u("Array of size 7 expected but got ");
                m24u.append(objArr2.length);
                throw new IllegalArgumentException(m24u.toString());
            }
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            Object obj3 = objArr2[2];
            Object obj4 = objArr2[3];
            Object obj5 = objArr2[4];
            Object obj6 = objArr2[5];
            Object obj7 = objArr2[6];
            throw null;
        }
    }

    public static final class Array8Func<T1, T2, T3, T4, T5, T6, T7, T8, R> implements Function<Object[], R> {
        @Override // io.reactivex.functions.Function
        public Object apply(Object[] objArr) throws Exception {
            Object[] objArr2 = objArr;
            if (objArr2.length != 8) {
                StringBuilder m24u = C0000a.m24u("Array of size 8 expected but got ");
                m24u.append(objArr2.length);
                throw new IllegalArgumentException(m24u.toString());
            }
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            Object obj3 = objArr2[2];
            Object obj4 = objArr2[3];
            Object obj5 = objArr2[4];
            Object obj6 = objArr2[5];
            Object obj7 = objArr2[6];
            Object obj8 = objArr2[7];
            throw null;
        }
    }

    public static final class Array9Func<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements Function<Object[], R> {
        @Override // io.reactivex.functions.Function
        public Object apply(Object[] objArr) throws Exception {
            Object[] objArr2 = objArr;
            if (objArr2.length != 9) {
                StringBuilder m24u = C0000a.m24u("Array of size 9 expected but got ");
                m24u.append(objArr2.length);
                throw new IllegalArgumentException(m24u.toString());
            }
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            Object obj3 = objArr2[2];
            Object obj4 = objArr2[3];
            Object obj5 = objArr2[4];
            Object obj6 = objArr2[5];
            Object obj7 = objArr2[6];
            Object obj8 = objArr2[7];
            Object obj9 = objArr2[8];
            throw null;
        }
    }

    public static final class ArrayListCapacityCallable<T> implements Callable<List<T>> {
        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            return new ArrayList(0);
        }
    }

    public static final class BooleanSupplierPredicateReverse<T> implements Predicate<T> {
        @Override // io.reactivex.functions.Predicate
        /* renamed from: b */
        public boolean mo31407b(T t) throws Exception {
            throw null;
        }
    }

    public static class BoundedConsumer implements Consumer<Subscription> {
        @Override // io.reactivex.functions.Consumer
        public void accept(Subscription subscription) throws Exception {
            subscription.request(0);
        }
    }

    public static final class CastToClass<T, U> implements Function<T, U> {
        @Override // io.reactivex.functions.Function
        public U apply(T t) throws Exception {
            throw null;
        }
    }

    public static final class ClassFilter<T, U> implements Predicate<T> {
        @Override // io.reactivex.functions.Predicate
        /* renamed from: b */
        public boolean mo31407b(T t) throws Exception {
            throw null;
        }
    }

    public static final class EmptyAction implements Action {
        @Override // io.reactivex.functions.Action
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    public static final class EmptyConsumer implements Consumer<Object> {
        @Override // io.reactivex.functions.Consumer
        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    public static final class EmptyLongConsumer implements LongConsumer {
        @Override // io.reactivex.functions.LongConsumer
        /* renamed from: a */
        public void mo31406a(long j2) {
        }
    }

    public static final class EmptyRunnable implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    public static final class EqualsPredicate<T> implements Predicate<T> {
        @Override // io.reactivex.functions.Predicate
        /* renamed from: b */
        public boolean mo31407b(T t) throws Exception {
            return ObjectHelper.m31426b(t, null);
        }
    }

    public static final class ErrorConsumer implements Consumer<Throwable> {
        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th) throws Exception {
            RxJavaPlugins.m31848b(th);
        }
    }

    public static final class FalsePredicate implements Predicate<Object> {
        @Override // io.reactivex.functions.Predicate
        /* renamed from: b */
        public boolean mo31407b(Object obj) {
            return false;
        }
    }

    public static final class FutureAction implements Action {
        @Override // io.reactivex.functions.Action
        public void run() throws Exception {
            throw null;
        }
    }

    public enum HashSetCallable implements Callable<Set<Object>> {
        /* JADX INFO: Fake field, exist only in values array */
        INSTANCE;

        @Override // java.util.concurrent.Callable
        public Set<Object> call() throws Exception {
            return new HashSet();
        }
    }

    public static final class Identity implements Function<Object, Object> {
        @Override // io.reactivex.functions.Function
        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    public static final class JustValue<T, U> implements Callable<U>, Function<T, U> {

        /* renamed from: b */
        public final U f59629b;

        @Override // io.reactivex.functions.Function
        public U apply(T t) throws Exception {
            return this.f59629b;
        }

        @Override // java.util.concurrent.Callable
        public U call() throws Exception {
            return this.f59629b;
        }
    }

    public static final class ListSorter<T> implements Function<List<T>, List<T>> {
        @Override // io.reactivex.functions.Function
        public Object apply(Object obj) throws Exception {
            List list = (List) obj;
            Collections.sort(list, null);
            return list;
        }
    }

    public static final class MaxRequestSubscription implements Consumer<Subscription> {
        @Override // io.reactivex.functions.Consumer
        public void accept(Subscription subscription) throws Exception {
            subscription.request(Long.MAX_VALUE);
        }
    }

    public enum NaturalComparator implements Comparator<Object> {
        /* JADX INFO: Fake field, exist only in values array */
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    public static final class NaturalObjectComparator implements Comparator<Object> {
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    public static final class NotificationOnComplete<T> implements Action {
        @Override // io.reactivex.functions.Action
        public void run() throws Exception {
            throw null;
        }
    }

    public static final class NotificationOnError<T> implements Consumer<Throwable> {
        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th) throws Exception {
            Objects.requireNonNull(th, "error is null");
            throw null;
        }
    }

    public static final class NotificationOnNext<T> implements Consumer<T> {
        @Override // io.reactivex.functions.Consumer
        public void accept(T t) throws Exception {
            Objects.requireNonNull(t, "value is null");
            throw null;
        }
    }

    public static final class NullCallable implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public Object call() {
            return null;
        }
    }

    public static final class OnErrorMissingConsumer implements Consumer<Throwable> {
        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th) throws Exception {
            RxJavaPlugins.m31848b(new OnErrorNotImplementedException(th));
        }
    }

    public static final class TimestampFunction<T> implements Function<T, Timed<T>> {
        @Override // io.reactivex.functions.Function
        public Object apply(Object obj) throws Exception {
            throw null;
        }
    }

    public static final class ToMapKeySelector<K, T> implements BiConsumer<Map<K, T>, T> {
        @Override // io.reactivex.functions.BiConsumer
        /* renamed from: a */
        public void mo31403a(Object obj, Object obj2) throws Exception {
            throw null;
        }
    }

    public static final class ToMapKeyValueSelector<K, V, T> implements BiConsumer<Map<K, V>, T> {
        @Override // io.reactivex.functions.BiConsumer
        /* renamed from: a */
        public void mo31403a(Object obj, Object obj2) throws Exception {
            throw null;
        }
    }

    public static final class ToMultimapKeyValueSelector<K, V, T> implements BiConsumer<Map<K, Collection<V>>, T> {
        @Override // io.reactivex.functions.BiConsumer
        /* renamed from: a */
        public void mo31403a(Object obj, Object obj2) throws Exception {
            throw null;
        }
    }

    public static final class TruePredicate implements Predicate<Object> {
        @Override // io.reactivex.functions.Predicate
        /* renamed from: b */
        public boolean mo31407b(Object obj) {
            return true;
        }
    }

    public Functions() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static <T> Consumer<T> m31421a(Action action) {
        return new ActionConsumer(action);
    }

    /* renamed from: b */
    public static <T1, T2, R> Function<Object[], R> m31422b(BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        Objects.requireNonNull(biFunction, "f is null");
        return new Array2Func(biFunction);
    }

    /* renamed from: c */
    public static <T1, T2, T3, T4, R> Function<Object[], R> m31423c(Function4<T1, T2, T3, T4, R> function4) {
        Objects.requireNonNull(function4, "f is null");
        return new Array4Func(function4);
    }

    /* renamed from: d */
    public static <T1, T2, T3, T4, T5, T6, R> Function<Object[], R> m31424d(Function6<T1, T2, T3, T4, T5, T6, R> function6) {
        Objects.requireNonNull(function6, "f is null");
        return new Array6Func(function6);
    }
}
