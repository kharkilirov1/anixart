package com.google.common.base;

import androidx.room.util.C0576a;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public final class Suppliers {

    @VisibleForTesting
    public static class ExpiringMemoizingSupplier<T> implements Supplier<T>, Serializable {
        @Override // com.google.common.base.Supplier
        public T get() {
            PatternCompiler patternCompiler = Platform.f20534a;
            System.nanoTime();
            synchronized (this) {
                throw null;
            }
        }

        public String toString() {
            return "Suppliers.memoizeWithExpiration(null, 0, NANOS)";
        }
    }

    @VisibleForTesting
    public static class MemoizingSupplier<T> implements Supplier<T>, Serializable {
        @Override // com.google.common.base.Supplier
        public T get() {
            synchronized (this) {
                throw null;
            }
        }

        public String toString() {
            String valueOf = String.valueOf((Object) null);
            return C0576a.m4115n(valueOf.length() + 19, "Suppliers.memoize(", valueOf, ")");
        }
    }

    @VisibleForTesting
    public static class NonSerializableMemoizingSupplier<T> implements Supplier<T> {

        /* renamed from: b */
        public volatile boolean f20600b;

        /* renamed from: c */
        @NullableDecl
        public T f20601c;

        @Override // com.google.common.base.Supplier
        public T get() {
            if (!this.f20600b) {
                synchronized (this) {
                    if (!this.f20600b) {
                        throw null;
                    }
                }
            }
            return this.f20601c;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f20601c);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            String valueOf2 = String.valueOf(sb.toString());
            return C0576a.m4115n(valueOf2.length() + 19, "Suppliers.memoize(", valueOf2, ")");
        }
    }

    public static class SupplierComposition<F, T> implements Supplier<T>, Serializable {
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof SupplierComposition)) {
                return false;
            }
            java.util.Objects.requireNonNull((SupplierComposition) obj);
            throw null;
        }

        @Override // com.google.common.base.Supplier
        public T get() {
            throw null;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{null, null});
        }

        public String toString() {
            return "Suppliers.compose(null, null)";
        }
    }

    public interface SupplierFunction<T> extends Function<Supplier<T>, T> {
    }

    public enum SupplierFunctionImpl implements SupplierFunction<Object> {
        INSTANCE;

        @Override // com.google.common.base.Function
        public Object apply(Object obj) {
            return ((Supplier) obj).get();
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Suppliers.supplierFunction()";
        }
    }

    public static class SupplierOfInstance<T> implements Supplier<T>, Serializable {

        /* renamed from: b */
        @NullableDecl
        public final T f20604b;

        public SupplierOfInstance(@NullableDecl T t) {
            this.f20604b = t;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof SupplierOfInstance) {
                return Objects.m11173a(this.f20604b, ((SupplierOfInstance) obj).f20604b);
            }
            return false;
        }

        @Override // com.google.common.base.Supplier
        public T get() {
            return this.f20604b;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f20604b});
        }

        public String toString() {
            String valueOf = String.valueOf(this.f20604b);
            return C0576a.m4115n(valueOf.length() + 22, "Suppliers.ofInstance(", valueOf, ")");
        }
    }

    public static class ThreadSafeSupplier<T> implements Supplier<T>, Serializable {
        @Override // com.google.common.base.Supplier
        public T get() {
            throw null;
        }

        public String toString() {
            return "Suppliers.synchronizedSupplier(null)";
        }
    }

    /* renamed from: a */
    public static <T> Supplier<T> m11219a(@NullableDecl T t) {
        return new SupplierOfInstance(t);
    }
}
