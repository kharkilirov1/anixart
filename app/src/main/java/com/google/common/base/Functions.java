package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public final class Functions {

    public static class ConstantFunction<E> implements Function<Object, E>, Serializable {
        @Override // com.google.common.base.Function
        public E apply(@NullableDecl Object obj) {
            return null;
        }

        @Override // com.google.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof ConstantFunction)) {
                return false;
            }
            java.util.Objects.requireNonNull((ConstantFunction) obj);
            return Objects.m11173a(null, null);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Functions.constant(null)";
        }
    }

    public static class ForMapWithDefault<K, V> implements Function<K, V>, Serializable {
        @Override // com.google.common.base.Function
        public V apply(@NullableDecl K k2) {
            throw null;
        }

        @Override // com.google.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof ForMapWithDefault)) {
                return false;
            }
            java.util.Objects.requireNonNull((ForMapWithDefault) obj);
            throw null;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{null, null});
        }

        public String toString() {
            return "Functions.forMap(null, defaultValue=null)";
        }
    }

    public static class FunctionComposition<A, B, C> implements Function<A, C>, Serializable {
        @Override // com.google.common.base.Function
        public C apply(@NullableDecl A a2) {
            throw null;
        }

        @Override // com.google.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof FunctionComposition)) {
                return false;
            }
            java.util.Objects.requireNonNull((FunctionComposition) obj);
            throw null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            return "null(null)";
        }
    }

    public static class FunctionForMapNoDefault<K, V> implements Function<K, V>, Serializable {
        @Override // com.google.common.base.Function
        public V apply(@NullableDecl K k2) {
            throw null;
        }

        @Override // com.google.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof FunctionForMapNoDefault)) {
                return false;
            }
            java.util.Objects.requireNonNull((FunctionForMapNoDefault) obj);
            throw null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            return "Functions.forMap(null)";
        }
    }

    public enum IdentityFunction implements Function<Object, Object> {
        INSTANCE;

        @Override // com.google.common.base.Function
        @NullableDecl
        public Object apply(@NullableDecl Object obj) {
            return obj;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Functions.identity()";
        }
    }

    public static class PredicateFunction<T> implements Function<T, Boolean>, Serializable {
        @Override // com.google.common.base.Function
        public Boolean apply(@NullableDecl Object obj) {
            throw null;
        }

        @Override // com.google.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof PredicateFunction)) {
                return false;
            }
            java.util.Objects.requireNonNull((PredicateFunction) obj);
            throw null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            return "Functions.forPredicate(null)";
        }
    }

    public static class SupplierFunction<T> implements Function<Object, T>, Serializable {
        @Override // com.google.common.base.Function
        public T apply(@NullableDecl Object obj) {
            throw null;
        }

        @Override // com.google.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof SupplierFunction)) {
                return false;
            }
            java.util.Objects.requireNonNull((SupplierFunction) obj);
            throw null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            return "Functions.forSupplier(null)";
        }
    }

    public enum ToStringFunction implements Function<Object, String> {
        INSTANCE;

        @Override // com.google.common.base.Function
        public String apply(Object obj) {
            java.util.Objects.requireNonNull(obj);
            return obj.toString();
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Functions.toStringFunction()";
        }
    }
}
