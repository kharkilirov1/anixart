package kotlin.reflect.jvm.internal.impl.storage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class LockBasedStorageManager implements StorageManager {

    /* renamed from: d */
    public static final String f66254d = StringsKt.m33906f0(LockBasedStorageManager.class.getCanonicalName(), ".", "");

    /* renamed from: e */
    public static final StorageManager f66255e = new LockBasedStorageManager("NO_LOCKS", ExceptionHandlingStrategy.f66262a, NoLock.f66277b) { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.1
        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager
        @NotNull
        /* renamed from: i */
        public <T> RecursionDetectedResult<T> mo33628i() {
            return new RecursionDetectedResult<>(null, true);
        }
    };

    /* renamed from: a */
    public final Lock f66256a;

    /* renamed from: b */
    public final ExceptionHandlingStrategy f66257b;

    /* renamed from: c */
    public final String f66258c;

    public static class CacheWithNotNullValuesBasedOnMemoizedFunction<K, V> extends CacheWithNullableValuesBasedOnMemoizedFunction<K, V> implements CacheWithNotNullValues<K, V> {
        public CacheWithNotNullValuesBasedOnMemoizedFunction(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap concurrentMap, C67341 c67341) {
            super(lockBasedStorageManager, concurrentMap, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues
        @NotNull
        /* renamed from: a */
        public V mo33618a(K k2, @NotNull Function0<? extends V> function0) {
            return invoke(new KeyWithComputation(k2, function0));
        }
    }

    public static class CacheWithNullableValuesBasedOnMemoizedFunction<K, V> extends MapBasedMemoizedFunction<KeyWithComputation<K, V>, V> {
        public CacheWithNullableValuesBasedOnMemoizedFunction(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap concurrentMap, C67341 c67341) {
            super(lockBasedStorageManager, concurrentMap, new Function1<KeyWithComputation<Object, Object>, Object>() { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.CacheWithNullableValuesBasedOnMemoizedFunction.1
                @Override // kotlin.jvm.functions.Function1
                public Object invoke(KeyWithComputation<Object, Object> keyWithComputation) {
                    return keyWithComputation.f66264b.invoke();
                }
            });
        }
    }

    public interface ExceptionHandlingStrategy {

        /* renamed from: a */
        public static final ExceptionHandlingStrategy f66262a = new ExceptionHandlingStrategy() { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy.1
            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy
            @NotNull
            /* renamed from: a */
            public RuntimeException mo33631a(@NotNull Throwable th) {
                throw th;
            }
        };

        @NotNull
        /* renamed from: a */
        RuntimeException mo33631a(@NotNull Throwable th);
    }

    public static class KeyWithComputation<K, V> {

        /* renamed from: a */
        public final K f66263a;

        /* renamed from: b */
        public final Function0<? extends V> f66264b;

        public KeyWithComputation(K k2, Function0<? extends V> function0) {
            this.f66263a = k2;
            this.f66264b = function0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f66263a.equals(((KeyWithComputation) obj).f66263a);
        }

        public int hashCode() {
            return this.f66263a.hashCode();
        }
    }

    public static class LockBasedLazyValue<T> implements NullableLazyValue<T> {

        /* renamed from: b */
        public final LockBasedStorageManager f66265b;

        /* renamed from: c */
        public final Function0<? extends T> f66266c;

        /* renamed from: d */
        @Nullable
        public volatile Object f66267d = NotValue.NOT_COMPUTED;

        public LockBasedLazyValue(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            this.f66265b = lockBasedStorageManager;
            this.f66266c = function0;
        }

        /* renamed from: a */
        public void mo33630a(T t) {
        }

        @NotNull
        /* renamed from: b */
        public RecursionDetectedResult<T> mo33629b(boolean z) {
            return this.f66265b.mo33628i();
        }

        /* renamed from: i */
        public boolean m33632i() {
            return (this.f66267d == NotValue.NOT_COMPUTED || this.f66267d == NotValue.COMPUTING) ? false : true;
        }

        @Override // kotlin.jvm.functions.Function0
        public T invoke() {
            T invoke;
            NotValue notValue = NotValue.RECURSION_WAS_DETECTED;
            NotValue notValue2 = NotValue.COMPUTING;
            T t = (T) this.f66267d;
            if (!(t instanceof NotValue)) {
                WrappedValues.m33788b(t);
                return t;
            }
            this.f66265b.f66256a.lock();
            try {
                T t2 = (T) this.f66267d;
                if (!(t2 instanceof NotValue)) {
                    WrappedValues.m33788b(t2);
                    return t2;
                }
                try {
                    if (t2 == notValue2) {
                        this.f66267d = notValue;
                        RecursionDetectedResult<T> mo33629b = mo33629b(true);
                        if (!mo33629b.f66276b) {
                            invoke = mo33629b.f66275a;
                            return invoke;
                        }
                    }
                    if (t2 == notValue) {
                        RecursionDetectedResult<T> mo33629b2 = mo33629b(false);
                        if (!mo33629b2.f66276b) {
                            invoke = mo33629b2.f66275a;
                            return invoke;
                        }
                    }
                    invoke = this.f66266c.invoke();
                    this.f66267d = invoke;
                    mo33630a(invoke);
                    return invoke;
                } catch (Throwable th) {
                    if (ExceptionUtilsKt.m33778a(th)) {
                        this.f66267d = NotValue.NOT_COMPUTED;
                        throw th;
                    }
                    if (this.f66267d == notValue2) {
                        this.f66267d = WrappedValues.m33787a(th);
                    }
                    throw this.f66265b.f66257b.mo33631a(th);
                }
                this.f66267d = notValue2;
            } finally {
                this.f66265b.f66256a.unlock();
            }
        }
    }

    public static class LockBasedNotNullLazyValue<T> extends LockBasedLazyValue<T> implements NotNullLazyValue<T> {
        public LockBasedNotNullLazyValue(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue, kotlin.jvm.functions.Function0
        @NotNull
        public T invoke() {
            return (T) super.invoke();
        }
    }

    public static class MapBasedMemoizedFunction<K, V> implements MemoizedFunctionToNullable<K, V> {

        /* renamed from: b */
        public final LockBasedStorageManager f66268b;

        /* renamed from: c */
        public final ConcurrentMap<K, Object> f66269c;

        /* renamed from: d */
        public final Function1<? super K, ? extends V> f66270d;

        public MapBasedMemoizedFunction(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<K, Object> concurrentMap, @NotNull Function1<? super K, ? extends V> function1) {
            this.f66268b = lockBasedStorageManager;
            this.f66269c = concurrentMap;
            this.f66270d = function1;
        }

        @NotNull
        /* renamed from: b */
        public final AssertionError m33633b(K k2, Object obj) {
            AssertionError assertionError = new AssertionError("Race condition detected on input " + k2 + ". Old value is " + obj + " under " + this.f66268b);
            LockBasedStorageManager.m33620j(assertionError);
            return assertionError;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public V invoke(K k2) {
            NotValue notValue = NotValue.COMPUTING;
            V v = (V) this.f66269c.get(k2);
            RuntimeException runtimeException = (V) null;
            if (v != null && v != notValue) {
                WrappedValues.m33788b(v);
                if (v == WrappedValues.f66518a) {
                    return null;
                }
                return v;
            }
            this.f66268b.f66256a.lock();
            try {
                Object obj = this.f66269c.get(k2);
                if (obj == notValue) {
                    AssertionError assertionError = new AssertionError("Recursion detected on input: " + k2 + " under " + this.f66268b);
                    LockBasedStorageManager.m33620j(assertionError);
                    throw assertionError;
                }
                if (obj != null) {
                    WrappedValues.m33788b(obj);
                    Object obj2 = runtimeException;
                    if (obj != WrappedValues.f66518a) {
                        obj2 = (V) obj;
                    }
                    return (V) obj2;
                }
                try {
                    this.f66269c.put(k2, notValue);
                    V invoke = this.f66270d.invoke(k2);
                    Object put = this.f66269c.put(k2, invoke == null ? WrappedValues.f66518a : invoke);
                    if (put == notValue) {
                        return invoke;
                    }
                    runtimeException = (V) m33633b(k2, put);
                    throw runtimeException;
                } catch (Throwable th) {
                    if (ExceptionUtilsKt.m33778a(th)) {
                        this.f66269c.remove(k2);
                        throw th;
                    }
                    if (th == runtimeException) {
                        throw this.f66268b.f66257b.mo33631a(th);
                    }
                    Object put2 = this.f66269c.put(k2, WrappedValues.m33787a(th));
                    if (put2 != notValue) {
                        throw m33633b(k2, put2);
                    }
                    throw this.f66268b.f66257b.mo33631a(th);
                }
            } finally {
                this.f66268b.f66256a.unlock();
            }
        }
    }

    public static class MapBasedMemoizedFunctionToNotNull<K, V> extends MapBasedMemoizedFunction<K, V> implements MemoizedFunctionToNotNull<K, V> {
        public MapBasedMemoizedFunctionToNotNull(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<K, Object> concurrentMap, @NotNull Function1<? super K, ? extends V> function1) {
            super(lockBasedStorageManager, concurrentMap, function1);
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.MapBasedMemoizedFunction, kotlin.jvm.functions.Function1
        @NotNull
        public V invoke(K k2) {
            return (V) super.invoke(k2);
        }
    }

    public enum NotValue {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    public static class RecursionDetectedResult<T> {

        /* renamed from: a */
        public final T f66275a;

        /* renamed from: b */
        public final boolean f66276b;

        public RecursionDetectedResult(T t, boolean z) {
            this.f66275a = t;
            this.f66276b = z;
        }

        public String toString() {
            return this.f66276b ? "FALL_THROUGH" : String.valueOf(this.f66275a);
        }
    }

    public LockBasedStorageManager(String str, ExceptionHandlingStrategy exceptionHandlingStrategy, Lock lock, C67341 c67341) {
        this.f66256a = lock;
        this.f66257b = exceptionHandlingStrategy;
        this.f66258c = str;
    }

    @NotNull
    /* renamed from: h */
    public static <K> ConcurrentMap<K, Object> m33619h() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    @NotNull
    /* renamed from: j */
    public static <T extends Throwable> T m33620j(@NotNull T t) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (!stackTrace[i2].getClassName().startsWith(f66254d)) {
                break;
            }
            i2++;
        }
        List subList = Arrays.asList(stackTrace).subList(i2, length);
        t.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
        return t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    /* renamed from: a */
    public <K, V> CacheWithNotNullValues<K, V> mo33621a() {
        return new CacheWithNotNullValuesBasedOnMemoizedFunction(this, m33619h(), null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    /* renamed from: b */
    public <T> NotNullLazyValue<T> mo33622b(@NotNull Function0<? extends T> function0, @NotNull final T t) {
        return new LockBasedNotNullLazyValue<T>(this, this, function0) { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.2
            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue
            @NotNull
            /* renamed from: b */
            public RecursionDetectedResult<T> mo33629b(boolean z) {
                return new RecursionDetectedResult<>(t, false);
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    /* renamed from: c */
    public <T> NotNullLazyValue<T> mo33623c(@NotNull Function0<? extends T> function0) {
        return new LockBasedNotNullLazyValue(this, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    /* renamed from: d */
    public <T> NullableLazyValue<T> mo33624d(@NotNull Function0<? extends T> function0) {
        return new LockBasedLazyValue(this, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    /* renamed from: e */
    public <T> NotNullLazyValue<T> mo33625e(@NotNull Function0<? extends T> function0, final Function1<? super Boolean, ? extends T> function1, @NotNull final Function1<? super T, Unit> function12) {
        return new LockBasedNotNullLazyValue<T>(this, this, function0) { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.3
            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue
            /* renamed from: a */
            public void mo33630a(@NotNull T t) {
                function12.invoke(t);
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue
            @NotNull
            /* renamed from: b */
            public RecursionDetectedResult<T> mo33629b(boolean z) {
                Function1 function13 = function1;
                return function13 == null ? this.f66265b.mo33628i() : new RecursionDetectedResult<>(function13.invoke(Boolean.valueOf(z)), false);
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    /* renamed from: f */
    public <K, V> MemoizedFunctionToNotNull<K, V> mo33626f(@NotNull Function1<? super K, ? extends V> function1) {
        return new MapBasedMemoizedFunctionToNotNull(this, m33619h(), function1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    /* renamed from: g */
    public <K, V> MemoizedFunctionToNullable<K, V> mo33627g(@NotNull Function1<? super K, ? extends V> function1) {
        return new MapBasedMemoizedFunction(this, m33619h(), function1);
    }

    @NotNull
    /* renamed from: i */
    public <T> RecursionDetectedResult<T> mo33628i() {
        IllegalStateException illegalStateException = new IllegalStateException("Recursive call in a lazy value under " + this);
        m33620j(illegalStateException);
        throw illegalStateException;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return C0000a.m20q(sb, this.f66258c, ")");
    }

    public LockBasedStorageManager() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.f66262a;
        this.f66256a = new ReentrantLock();
        this.f66257b = exceptionHandlingStrategy;
        this.f66258c = "<unknown creating class>";
    }
}
