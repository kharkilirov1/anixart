package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Cut;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public final class Range<C extends Comparable> extends RangeGwtSerializationDependencies implements Predicate<C> {

    /* renamed from: d */
    public static final Range<Comparable> f21403d = new Range<>(Cut.BelowAll.f20943c, Cut.AboveAll.f20942c);

    /* renamed from: b */
    public final Cut<C> f21404b;

    /* renamed from: c */
    public final Cut<C> f21405c;

    /* renamed from: com.google.common.collect.Range$1 */
    public static /* synthetic */ class C17471 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21406a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f21406a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21406a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class LowerBoundFn implements Function<Range, Cut> {

        /* renamed from: b */
        public static final LowerBoundFn f21407b = new LowerBoundFn();

        @Override // com.google.common.base.Function
        public Cut apply(Range range) {
            return range.f21404b;
        }
    }

    public static class RangeLexOrdering extends Ordering<Range<?>> implements Serializable {

        /* renamed from: b */
        public static final Ordering<Range<?>> f21408b = new RangeLexOrdering();

        @Override // com.google.common.collect.Ordering, java.util.Comparator
        public int compare(Object obj, Object obj2) {
            Range range = (Range) obj;
            Range range2 = (Range) obj2;
            return ((ComparisonChain.C16331) ComparisonChain.f20928a).m11486h(range.f21404b.compareTo(range2.f21404b)).mo11481c(range.f21405c, range2.f21405c).mo11485g();
        }
    }

    public static class UpperBoundFn implements Function<Range, Cut> {

        /* renamed from: b */
        public static final UpperBoundFn f21409b = new UpperBoundFn();

        @Override // com.google.common.base.Function
        public Cut apply(Range range) {
            return range.f21405c;
        }
    }

    public Range(Cut<C> cut, Cut<C> cut2) {
        Objects.requireNonNull(cut);
        this.f21404b = cut;
        Objects.requireNonNull(cut2);
        this.f21405c = cut2;
        if (cut.compareTo(cut2) > 0 || cut == Cut.AboveAll.f20942c || cut2 == Cut.BelowAll.f20943c) {
            StringBuilder sb = new StringBuilder(16);
            cut.mo11507c(sb);
            sb.append("..");
            cut2.mo11508d(sb);
            String valueOf = String.valueOf(sb.toString());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid range: ".concat(valueOf) : new String("Invalid range: "));
        }
    }

    /* renamed from: b */
    public static <C extends Comparable<?>> Range<C> m11860b(C c2, BoundType boundType) {
        int ordinal = boundType.ordinal();
        if (ordinal == 0) {
            return new Range<>(new Cut.AboveValue(c2), Cut.AboveAll.f20942c);
        }
        if (ordinal == 1) {
            return new Range<>(new Cut.BelowValue(c2), Cut.AboveAll.f20942c);
        }
        throw new AssertionError();
    }

    /* renamed from: j */
    public static <C extends Comparable<?>> Range<C> m11861j(C c2, BoundType boundType, C c3, BoundType boundType2) {
        BoundType boundType3 = BoundType.OPEN;
        return new Range<>(boundType == boundType3 ? new Cut.AboveValue(c2) : new Cut.BelowValue(c2), boundType2 == boundType3 ? new Cut.BelowValue(c3) : new Cut.AboveValue(c3));
    }

    /* renamed from: k */
    public static <C extends Comparable<?>> Range<C> m11862k(C c2, BoundType boundType) {
        int ordinal = boundType.ordinal();
        if (ordinal == 0) {
            return new Range<>(Cut.BelowAll.f20943c, new Cut.BelowValue(c2));
        }
        if (ordinal == 1) {
            return new Range<>(Cut.BelowAll.f20943c, new Cut.AboveValue(c2));
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public boolean m11863a(C c2) {
        Objects.requireNonNull(c2);
        return this.f21404b.mo11511h(c2) && !this.f21405c.mo11511h(c2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.base.Predicate
    @Deprecated
    public boolean apply(Object obj) {
        return m11863a((Comparable) obj);
    }

    /* renamed from: c */
    public boolean m11864c(Range<C> range) {
        return this.f21404b.compareTo(range.f21404b) <= 0 && this.f21405c.compareTo(range.f21405c) >= 0;
    }

    /* renamed from: d */
    public boolean m11865d() {
        return this.f21404b != Cut.BelowAll.f20943c;
    }

    /* renamed from: e */
    public boolean m11866e() {
        return this.f21405c != Cut.AboveAll.f20942c;
    }

    @Override // com.google.common.base.Predicate
    public boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof Range)) {
            return false;
        }
        Range range = (Range) obj;
        return this.f21404b.equals(range.f21404b) && this.f21405c.equals(range.f21405c);
    }

    /* renamed from: f */
    public Range<C> m11867f(Range<C> range) {
        int compareTo = this.f21404b.compareTo(range.f21404b);
        int compareTo2 = this.f21405c.compareTo(range.f21405c);
        if (compareTo >= 0 && compareTo2 <= 0) {
            return this;
        }
        if (compareTo > 0 || compareTo2 < 0) {
            return new Range<>(compareTo >= 0 ? this.f21404b : range.f21404b, compareTo2 <= 0 ? this.f21405c : range.f21405c);
        }
        return range;
    }

    /* renamed from: g */
    public boolean m11868g(Range<C> range) {
        return this.f21404b.compareTo(range.f21405c) <= 0 && range.f21404b.compareTo(this.f21405c) <= 0;
    }

    /* renamed from: h */
    public boolean m11869h() {
        return this.f21404b.equals(this.f21405c);
    }

    public int hashCode() {
        return (this.f21404b.hashCode() * 31) + this.f21405c.hashCode();
    }

    /* renamed from: i */
    public C m11870i() {
        return this.f21404b.mo11509e();
    }

    public String toString() {
        Cut<C> cut = this.f21404b;
        Cut<C> cut2 = this.f21405c;
        StringBuilder sb = new StringBuilder(16);
        cut.mo11507c(sb);
        sb.append("..");
        cut2.mo11508d(sb);
        return sb.toString();
    }
}
