package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class WrappedValues {

    /* renamed from: a */
    public static final Object f66518a = new Object() { // from class: kotlin.reflect.jvm.internal.impl.utils.WrappedValues.1
        public String toString() {
            return "NULL_VALUE";
        }
    };

    public static final class ThrowableWrapper {

        /* renamed from: a */
        public final Throwable f66519a;

        public ThrowableWrapper(Throwable th, C67601 c67601) {
            this.f66519a = th;
        }

        public String toString() {
            return this.f66519a.toString();
        }
    }

    public static class WrappedProcessCanceledException extends RuntimeException {
    }

    @NotNull
    /* renamed from: a */
    public static Object m33787a(@NotNull Throwable th) {
        return new ThrowableWrapper(th, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* renamed from: b */
    public static <V> V m33788b(@Nullable Object obj) {
        if (!(obj instanceof ThrowableWrapper)) {
            return obj;
        }
        Throwable e2 = ((ThrowableWrapper) obj).f66519a;
        Intrinsics.m32180i(e2, "e");
        throw e2;
    }
}
