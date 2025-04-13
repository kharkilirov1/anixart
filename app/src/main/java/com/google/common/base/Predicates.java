package com.google.common.base;

import androidx.room.util.C0576a;
import com.google.android.exoplayer2.extractor.C1008a;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public final class Predicates {

    public static class AndPredicate<T> implements Predicate<T>, Serializable {

        /* renamed from: b */
        public final List<? extends Predicate<? super T>> f20535b;

        public AndPredicate(List list, C15671 c15671) {
            this.f20535b = list;
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@NullableDecl T t) {
            for (int i2 = 0; i2 < this.f20535b.size(); i2++) {
                if (!this.f20535b.get(i2).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof AndPredicate) {
                return this.f20535b.equals(((AndPredicate) obj).f20535b);
            }
            return false;
        }

        public int hashCode() {
            return this.f20535b.hashCode() + 306654252;
        }

        public String toString() {
            return Predicates.m11196a("and", this.f20535b);
        }
    }

    public static class CompositionPredicate<A, B> implements Predicate<A>, Serializable {

        /* renamed from: b */
        public final Predicate<B> f20536b;

        /* renamed from: c */
        public final Function<A, ? extends B> f20537c;

        public CompositionPredicate(Predicate predicate, Function function, C15671 c15671) {
            java.util.Objects.requireNonNull(predicate);
            this.f20536b = predicate;
            java.util.Objects.requireNonNull(function);
            this.f20537c = function;
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@NullableDecl A a2) {
            return this.f20536b.apply(this.f20537c.apply(a2));
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof CompositionPredicate)) {
                return false;
            }
            CompositionPredicate compositionPredicate = (CompositionPredicate) obj;
            return this.f20537c.equals(compositionPredicate.f20537c) && this.f20536b.equals(compositionPredicate.f20536b);
        }

        public int hashCode() {
            return this.f20537c.hashCode() ^ this.f20536b.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f20536b);
            String valueOf2 = String.valueOf(this.f20537c);
            return C1008a.m6437d(valueOf2.length() + valueOf.length() + 2, valueOf, "(", valueOf2, ")");
        }
    }

    @GwtIncompatible
    public static class ContainsPatternFromStringPredicate extends ContainsPatternPredicate {
        @Override // com.google.common.base.Predicates.ContainsPatternPredicate
        public String toString() {
            throw null;
        }
    }

    @GwtIncompatible
    public static class ContainsPatternPredicate implements Predicate<CharSequence>, Serializable {
        @Override // com.google.common.base.Predicate
        public boolean apply(CharSequence charSequence) {
            throw null;
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof ContainsPatternPredicate)) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            MoreObjects.m11166b(null);
            throw null;
        }
    }

    public static class InPredicate<T> implements Predicate<T>, Serializable {

        /* renamed from: b */
        public final Collection<?> f20538b;

        public InPredicate(Collection collection, C15671 c15671) {
            java.util.Objects.requireNonNull(collection);
            this.f20538b = collection;
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@NullableDecl T t) {
            try {
                return this.f20538b.contains(t);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof InPredicate) {
                return this.f20538b.equals(((InPredicate) obj).f20538b);
            }
            return false;
        }

        public int hashCode() {
            return this.f20538b.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f20538b);
            return C0576a.m4115n(valueOf.length() + 15, "Predicates.in(", valueOf, ")");
        }
    }

    @GwtIncompatible
    public static class InstanceOfPredicate implements Predicate<Object>, Serializable {

        /* renamed from: b */
        public final Class<?> f20539b;

        public InstanceOfPredicate(Class cls, C15671 c15671) {
            java.util.Objects.requireNonNull(cls);
            this.f20539b = cls;
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@NullableDecl Object obj) {
            return this.f20539b.isInstance(obj);
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            return (obj instanceof InstanceOfPredicate) && this.f20539b == ((InstanceOfPredicate) obj).f20539b;
        }

        public int hashCode() {
            return this.f20539b.hashCode();
        }

        public String toString() {
            String name = this.f20539b.getName();
            return C0576a.m4115n(name.length() + 23, "Predicates.instanceOf(", name, ")");
        }
    }

    public static class IsEqualToPredicate<T> implements Predicate<T>, Serializable {

        /* renamed from: b */
        public final T f20540b;

        /* JADX WARN: Multi-variable type inference failed */
        public IsEqualToPredicate(Object obj, C15671 c15671) {
            this.f20540b = obj;
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(T t) {
            return this.f20540b.equals(t);
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof IsEqualToPredicate) {
                return this.f20540b.equals(((IsEqualToPredicate) obj).f20540b);
            }
            return false;
        }

        public int hashCode() {
            return this.f20540b.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f20540b);
            return C0576a.m4115n(valueOf.length() + 20, "Predicates.equalTo(", valueOf, ")");
        }
    }

    public static class NotPredicate<T> implements Predicate<T>, Serializable {

        /* renamed from: b */
        public final Predicate<T> f20541b;

        public NotPredicate(Predicate<T> predicate) {
            java.util.Objects.requireNonNull(predicate);
            this.f20541b = predicate;
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@NullableDecl T t) {
            return !this.f20541b.apply(t);
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof NotPredicate) {
                return this.f20541b.equals(((NotPredicate) obj).f20541b);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f20541b.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f20541b);
            return C0576a.m4115n(valueOf.length() + 16, "Predicates.not(", valueOf, ")");
        }
    }

    public enum ObjectPredicate implements Predicate<Object> {
        ALWAYS_TRUE { // from class: com.google.common.base.Predicates.ObjectPredicate.1
            @Override // com.google.common.base.Predicate
            public boolean apply(@NullableDecl Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        ALWAYS_FALSE { // from class: com.google.common.base.Predicates.ObjectPredicate.2
            @Override // com.google.common.base.Predicate
            public boolean apply(@NullableDecl Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        IS_NULL { // from class: com.google.common.base.Predicates.ObjectPredicate.3
            @Override // com.google.common.base.Predicate
            public boolean apply(@NullableDecl Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.isNull()";
            }
        },
        NOT_NULL { // from class: com.google.common.base.Predicates.ObjectPredicate.4
            @Override // com.google.common.base.Predicate
            public boolean apply(@NullableDecl Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.notNull()";
            }
        };

        ObjectPredicate(C15671 c15671) {
        }
    }

    public static class OrPredicate<T> implements Predicate<T>, Serializable {
        @Override // com.google.common.base.Predicate
        public boolean apply(@NullableDecl T t) {
            throw null;
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof OrPredicate)) {
                return false;
            }
            java.util.Objects.requireNonNull((OrPredicate) obj);
            throw null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            return Predicates.m11196a("or", null);
        }
    }

    @GwtIncompatible
    public static class SubtypeOfPredicate implements Predicate<Class<?>>, Serializable {
        @Override // com.google.common.base.Predicate
        public boolean apply(Class<?> cls) {
            throw null;
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof SubtypeOfPredicate)) {
                return false;
            }
            java.util.Objects.requireNonNull((SubtypeOfPredicate) obj);
            return true;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            throw null;
        }
    }

    /* renamed from: a */
    public static String m11196a(String str, Iterable iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z = true;
        for (Object obj : iterable) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @GwtCompatible
    /* renamed from: b */
    public static <T> Predicate<T> m11197b() {
        return ObjectPredicate.ALWAYS_TRUE;
    }

    /* renamed from: c */
    public static <T> Predicate<T> m11198c(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        java.util.Objects.requireNonNull(predicate);
        java.util.Objects.requireNonNull(predicate2);
        return new AndPredicate(Arrays.asList(predicate, predicate2), null);
    }

    /* renamed from: d */
    public static <A, B> Predicate<A> m11199d(Predicate<B> predicate, Function<A, ? extends B> function) {
        return new CompositionPredicate(predicate, function, null);
    }

    /* renamed from: e */
    public static <T> Predicate<T> m11200e(@NullableDecl T t) {
        return new IsEqualToPredicate(t, null);
    }

    /* renamed from: f */
    public static <T> Predicate<T> m11201f(Collection<? extends T> collection) {
        return new InPredicate(collection, null);
    }

    @GwtIncompatible
    /* renamed from: g */
    public static Predicate<Object> m11202g(Class<?> cls) {
        return new InstanceOfPredicate(cls, null);
    }

    /* renamed from: h */
    public static <T> Predicate<T> m11203h(Predicate<T> predicate) {
        return new NotPredicate(predicate);
    }
}
