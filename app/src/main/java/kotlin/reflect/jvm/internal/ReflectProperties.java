package kotlin.reflect.jvm.internal;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class ReflectProperties {

    public static class LazySoftVal<T> extends Val<T> {

        /* renamed from: b */
        public final Function0<T> f63629b;

        /* renamed from: c */
        public SoftReference<Object> f63630c;

        public LazySoftVal(@Nullable T t, @NotNull Function0<T> function0) {
            this.f63630c = null;
            this.f63629b = function0;
            if (t != null) {
                this.f63630c = new SoftReference<>(t);
            }
        }

        /* renamed from: a */
        public T m32305a() {
            T t;
            SoftReference<Object> softReference = this.f63630c;
            if (softReference == null || (t = (T) softReference.get()) == null) {
                T invoke = this.f63629b.invoke();
                this.f63630c = new SoftReference<>(invoke == null ? Val.f63633a : invoke);
                return invoke;
            }
            if (t == Val.f63633a) {
                return null;
            }
            return t;
        }
    }

    public static class LazyVal<T> extends Val<T> {

        /* renamed from: b */
        public final Function0<T> f63631b;

        /* renamed from: c */
        public Object f63632c = null;

        public LazyVal(@NotNull Function0<T> function0) {
            this.f63631b = function0;
        }

        /* renamed from: a */
        public T m32306a() {
            T t = (T) this.f63632c;
            if (t != null) {
                if (t == Val.f63633a) {
                    return null;
                }
                return t;
            }
            T invoke = this.f63631b.invoke();
            this.f63632c = invoke == null ? Val.f63633a : invoke;
            return invoke;
        }
    }

    public static abstract class Val<T> {

        /* renamed from: a */
        public static final Object f63633a = new Object() { // from class: kotlin.reflect.jvm.internal.ReflectProperties.Val.1
        };
    }

    @NotNull
    /* renamed from: a */
    public static <T> LazySoftVal<T> m32304a(@NotNull Function0<T> function0) {
        return new LazySoftVal<>(null, function0);
    }
}
