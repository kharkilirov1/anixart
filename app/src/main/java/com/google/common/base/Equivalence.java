package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.ForOverride;
import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class Equivalence<T> {

    public static final class Equals extends Equivalence<Object> implements Serializable {

        /* renamed from: b */
        public static final Equals f20509b = new Equals();

        @Override // com.google.common.base.Equivalence
        /* renamed from: a */
        public boolean mo11151a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.google.common.base.Equivalence
        /* renamed from: b */
        public int mo11152b(Object obj) {
            return obj.hashCode();
        }
    }

    public static final class EquivalentToPredicate<T> implements Predicate<T>, Serializable {
        @Override // com.google.common.base.Predicate
        public boolean apply(@NullableDecl T t) {
            throw null;
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EquivalentToPredicate)) {
                return false;
            }
            java.util.Objects.requireNonNull((EquivalentToPredicate) obj);
            throw null;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{null, null});
        }

        public String toString() {
            return "null.equivalentTo(null)";
        }
    }

    public static final class Identity extends Equivalence<Object> implements Serializable {

        /* renamed from: b */
        public static final Identity f20510b = new Identity();

        @Override // com.google.common.base.Equivalence
        /* renamed from: a */
        public boolean mo11151a(Object obj, Object obj2) {
            return false;
        }

        @Override // com.google.common.base.Equivalence
        /* renamed from: b */
        public int mo11152b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public static final class Wrapper<T> implements Serializable {
        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Wrapper)) {
                return false;
            }
            java.util.Objects.requireNonNull((Wrapper) obj);
            throw null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            return "null.wrap(null)";
        }
    }

    /* renamed from: c */
    public static Equivalence<Object> m11149c() {
        return Equals.f20509b;
    }

    /* renamed from: f */
    public static Equivalence<Object> m11150f() {
        return Identity.f20510b;
    }

    @ForOverride
    /* renamed from: a */
    public abstract boolean mo11151a(T t, T t2);

    @ForOverride
    /* renamed from: b */
    public abstract int mo11152b(T t);

    /* renamed from: d */
    public final boolean m11153d(@NullableDecl T t, @NullableDecl T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return mo11151a(t, t2);
    }

    /* renamed from: e */
    public final int m11154e(@NullableDecl T t) {
        if (t == null) {
            return 0;
        }
        return mo11152b(t);
    }
}
