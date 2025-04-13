package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import java.io.Serializable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class Converter<A, B> implements Function<A, B> {

    /* renamed from: b */
    public final boolean f20507b = true;

    /* renamed from: com.google.common.base.Converter$1 */
    class C15581 implements Iterable<Object> {
        @Override // java.lang.Iterable
        public Iterator<Object> iterator() {
            new Iterator<Object>() { // from class: com.google.common.base.Converter.1.1
                {
                    throw null;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    throw null;
                }

                @Override // java.util.Iterator
                public Object next() {
                    java.util.Objects.requireNonNull(C15581.this);
                    throw null;
                }

                @Override // java.util.Iterator
                public void remove() {
                    throw null;
                }
            };
            throw null;
        }
    }

    public static final class ConverterComposition<A, B, C> extends Converter<A, C> implements Serializable {
        @Override // com.google.common.base.Converter
        @NullableDecl
        /* renamed from: a */
        public C mo11148a(@NullableDecl A a2) {
            throw null;
        }

        @Override // com.google.common.base.Converter
        /* renamed from: b */
        public C mo11126b(A a2) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof ConverterComposition)) {
                return false;
            }
            java.util.Objects.requireNonNull((ConverterComposition) obj);
            throw null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            return "null.andThen(null)";
        }
    }

    public static final class FunctionBasedConverter<A, B> extends Converter<A, B> implements Serializable {
        @Override // com.google.common.base.Converter
        /* renamed from: b */
        public B mo11126b(A a2) {
            throw null;
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof FunctionBasedConverter)) {
                return false;
            }
            java.util.Objects.requireNonNull((FunctionBasedConverter) obj);
            throw null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            return "Converter.from(null, null)";
        }
    }

    public static final class IdentityConverter<T> extends Converter<T, T> implements Serializable {
        @Override // com.google.common.base.Converter
        /* renamed from: b */
        public T mo11126b(T t) {
            return t;
        }

        public String toString() {
            return "Converter.identity()";
        }
    }

    public static final class ReverseConverter<A, B> extends Converter<B, A> implements Serializable {
        @Override // com.google.common.base.Converter
        @NullableDecl
        /* renamed from: a */
        public A mo11148a(@NullableDecl B b) {
            throw null;
        }

        @Override // com.google.common.base.Converter
        /* renamed from: b */
        public A mo11126b(B b) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof ReverseConverter)) {
                return false;
            }
            java.util.Objects.requireNonNull((ReverseConverter) obj);
            throw null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            return "null.reverse()";
        }
    }

    @NullableDecl
    /* renamed from: a */
    public B mo11148a(@NullableDecl A a2) {
        if (!this.f20507b) {
            return mo11126b(a2);
        }
        if (a2 == null) {
            return null;
        }
        B mo11126b = mo11126b(a2);
        java.util.Objects.requireNonNull(mo11126b);
        return mo11126b;
    }

    @Override // com.google.common.base.Function
    @CanIgnoreReturnValue
    @NullableDecl
    @Deprecated
    public final B apply(@NullableDecl A a2) {
        return mo11148a(a2);
    }

    @ForOverride
    /* renamed from: b */
    public abstract B mo11126b(A a2);

    @Override // com.google.common.base.Function
    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }
}
