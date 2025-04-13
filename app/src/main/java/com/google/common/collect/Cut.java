package com.google.common.collect;

import androidx.room.util.C0576a;
import com.google.common.annotations.GwtCompatible;
import com.google.common.primitives.Booleans;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
abstract class Cut<C extends Comparable> implements Comparable<Cut<C>>, Serializable {

    /* renamed from: b */
    @NullableDecl
    public final C f20940b;

    /* renamed from: com.google.common.collect.Cut$1 */
    public static /* synthetic */ class C16371 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20941a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f20941a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20941a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final class AboveAll extends Cut<Comparable<?>> {

        /* renamed from: c */
        public static final AboveAll f20942c = new AboveAll();

        public AboveAll() {
            super(null);
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(Cut<Comparable<?>> cut) {
            return cut == this ? 0 : 1;
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: c */
        public void mo11507c(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: d */
        public void mo11508d(StringBuilder sb) {
            sb.append("+∞)");
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: e */
        public Comparable<?> mo11509e() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: f */
        public Comparable<?> mo11510f(DiscreteDomain<Comparable<?>> discreteDomain) {
            return discreteDomain.mo11538b();
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: h */
        public boolean mo11511h(Comparable<?> comparable) {
            return false;
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: i */
        public Comparable<?> mo11512i(DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: j */
        public BoundType mo11513j() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: k */
        public BoundType mo11514k() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: l */
        public Cut<Comparable<?>> mo11515l(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: m */
        public Cut<Comparable<?>> mo11516m(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new IllegalStateException();
        }

        public String toString() {
            return "+∞";
        }
    }

    public static final class AboveValue<C extends Comparable> extends Cut<C> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AboveValue(C c2) {
            super(c2);
            Objects.requireNonNull(c2);
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: a */
        public Cut<C> mo11505a(DiscreteDomain<C> discreteDomain) {
            C mo11540d = discreteDomain.mo11540d(this.f20940b);
            return mo11540d != null ? new BelowValue(mo11540d) : AboveAll.f20942c;
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: c */
        public void mo11507c(StringBuilder sb) {
            sb.append('(');
            sb.append(this.f20940b);
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return compareTo((Cut) obj);
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: d */
        public void mo11508d(StringBuilder sb) {
            sb.append(this.f20940b);
            sb.append(']');
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: f */
        public C mo11510f(DiscreteDomain<C> discreteDomain) {
            return this.f20940b;
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: h */
        public boolean mo11511h(C c2) {
            C c3 = this.f20940b;
            Range<Comparable> range = Range.f21403d;
            return c3.compareTo(c2) < 0;
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return ~this.f20940b.hashCode();
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: i */
        public C mo11512i(DiscreteDomain<C> discreteDomain) {
            return discreteDomain.mo11540d(this.f20940b);
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: j */
        public BoundType mo11513j() {
            return BoundType.OPEN;
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: k */
        public BoundType mo11514k() {
            return BoundType.CLOSED;
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: l */
        public Cut<C> mo11515l(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int ordinal = boundType.ordinal();
            if (ordinal == 0) {
                return this;
            }
            if (ordinal != 1) {
                throw new AssertionError();
            }
            C mo11540d = discreteDomain.mo11540d(this.f20940b);
            return mo11540d == null ? BelowAll.f20943c : new BelowValue(mo11540d);
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: m */
        public Cut<C> mo11516m(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int ordinal = boundType.ordinal();
            if (ordinal == 0) {
                C mo11540d = discreteDomain.mo11540d(this.f20940b);
                return mo11540d == null ? AboveAll.f20942c : new BelowValue(mo11540d);
            }
            if (ordinal == 1) {
                return this;
            }
            throw new AssertionError();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f20940b);
            return C0576a.m4115n(valueOf.length() + 2, "/", valueOf, "\\");
        }
    }

    public static final class BelowAll extends Cut<Comparable<?>> {

        /* renamed from: c */
        public static final BelowAll f20943c = new BelowAll();

        public BelowAll() {
            super(null);
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: a */
        public Cut<Comparable<?>> mo11505a(DiscreteDomain<Comparable<?>> discreteDomain) {
            try {
                return new BelowValue(discreteDomain.mo11539c());
            } catch (NoSuchElementException unused) {
                return this;
            }
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        /* renamed from: b */
        public int compareTo(Cut<Comparable<?>> cut) {
            return cut == this ? 0 : -1;
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: c */
        public void mo11507c(StringBuilder sb) {
            sb.append("(-∞");
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: d */
        public void mo11508d(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: e */
        public Comparable<?> mo11509e() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: f */
        public Comparable<?> mo11510f(DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: h */
        public boolean mo11511h(Comparable<?> comparable) {
            return true;
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: i */
        public Comparable<?> mo11512i(DiscreteDomain<Comparable<?>> discreteDomain) {
            return discreteDomain.mo11539c();
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: j */
        public BoundType mo11513j() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: k */
        public BoundType mo11514k() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: l */
        public Cut<Comparable<?>> mo11515l(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: m */
        public Cut<Comparable<?>> mo11516m(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError("this statement should be unreachable");
        }

        public String toString() {
            return "-∞";
        }
    }

    public static final class BelowValue<C extends Comparable> extends Cut<C> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BelowValue(C c2) {
            super(c2);
            Objects.requireNonNull(c2);
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: c */
        public void mo11507c(StringBuilder sb) {
            sb.append('[');
            sb.append(this.f20940b);
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return compareTo((Cut) obj);
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: d */
        public void mo11508d(StringBuilder sb) {
            sb.append(this.f20940b);
            sb.append(')');
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: f */
        public C mo11510f(DiscreteDomain<C> discreteDomain) {
            return discreteDomain.mo11542f(this.f20940b);
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: h */
        public boolean mo11511h(C c2) {
            C c3 = this.f20940b;
            Range<Comparable> range = Range.f21403d;
            return c3.compareTo(c2) <= 0;
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return this.f20940b.hashCode();
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: i */
        public C mo11512i(DiscreteDomain<C> discreteDomain) {
            return this.f20940b;
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: j */
        public BoundType mo11513j() {
            return BoundType.CLOSED;
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: k */
        public BoundType mo11514k() {
            return BoundType.OPEN;
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: l */
        public Cut<C> mo11515l(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int ordinal = boundType.ordinal();
            if (ordinal == 0) {
                C mo11542f = discreteDomain.mo11542f(this.f20940b);
                return mo11542f == null ? BelowAll.f20943c : new AboveValue(mo11542f);
            }
            if (ordinal == 1) {
                return this;
            }
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        /* renamed from: m */
        public Cut<C> mo11516m(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int ordinal = boundType.ordinal();
            if (ordinal == 0) {
                return this;
            }
            if (ordinal != 1) {
                throw new AssertionError();
            }
            C mo11542f = discreteDomain.mo11542f(this.f20940b);
            return mo11542f == null ? AboveAll.f20942c : new AboveValue(mo11542f);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f20940b);
            return C0576a.m4115n(valueOf.length() + 2, "\\", valueOf, "/");
        }
    }

    public Cut(@NullableDecl C c2) {
        this.f20940b = c2;
    }

    /* renamed from: a */
    public Cut<C> mo11505a(DiscreteDomain<C> discreteDomain) {
        return this;
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(Cut<C> cut) {
        if (cut == BelowAll.f20943c) {
            return 1;
        }
        if (cut == AboveAll.f20942c) {
            return -1;
        }
        C c2 = this.f20940b;
        C c3 = cut.f20940b;
        Range<Comparable> range = Range.f21403d;
        int compareTo = c2.compareTo(c3);
        return compareTo != 0 ? compareTo : Booleans.m12071a(this instanceof AboveValue, cut instanceof AboveValue);
    }

    /* renamed from: c */
    public abstract void mo11507c(StringBuilder sb);

    /* renamed from: d */
    public abstract void mo11508d(StringBuilder sb);

    /* renamed from: e */
    public C mo11509e() {
        return this.f20940b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Cut)) {
            return false;
        }
        try {
            return compareTo((Cut) obj) == 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    /* renamed from: f */
    public abstract C mo11510f(DiscreteDomain<C> discreteDomain);

    /* renamed from: h */
    public abstract boolean mo11511h(C c2);

    public abstract int hashCode();

    /* renamed from: i */
    public abstract C mo11512i(DiscreteDomain<C> discreteDomain);

    /* renamed from: j */
    public abstract BoundType mo11513j();

    /* renamed from: k */
    public abstract BoundType mo11514k();

    /* renamed from: l */
    public abstract Cut<C> mo11515l(BoundType boundType, DiscreteDomain<C> discreteDomain);

    /* renamed from: m */
    public abstract Cut<C> mo11516m(BoundType boundType, DiscreteDomain<C> discreteDomain);
}
