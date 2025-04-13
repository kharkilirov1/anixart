package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.primitives.Booleans;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class ComparisonChain {

    /* renamed from: a */
    public static final ComparisonChain f20928a = new C16331();

    /* renamed from: b */
    public static final ComparisonChain f20929b = new InactiveComparisonChain(-1);

    /* renamed from: c */
    public static final ComparisonChain f20930c = new InactiveComparisonChain(1);

    /* renamed from: com.google.common.collect.ComparisonChain$1 */
    public class C16331 extends ComparisonChain {
        public C16331() {
            super(null);
        }

        @Override // com.google.common.collect.ComparisonChain
        /* renamed from: a */
        public ComparisonChain mo11479a(int i2, int i3) {
            return m11486h(Ints.m12081c(i2, i3));
        }

        @Override // com.google.common.collect.ComparisonChain
        /* renamed from: b */
        public ComparisonChain mo11480b(long j2, long j3) {
            return m11486h(Longs.m12086a(j2, j3));
        }

        @Override // com.google.common.collect.ComparisonChain
        /* renamed from: c */
        public ComparisonChain mo11481c(Comparable comparable, Comparable comparable2) {
            return m11486h(comparable.compareTo(comparable2));
        }

        @Override // com.google.common.collect.ComparisonChain
        /* renamed from: d */
        public <T> ComparisonChain mo11482d(@NullableDecl T t, @NullableDecl T t2, Comparator<T> comparator) {
            return m11486h(comparator.compare(t, t2));
        }

        @Override // com.google.common.collect.ComparisonChain
        /* renamed from: e */
        public ComparisonChain mo11483e(boolean z, boolean z2) {
            return m11486h(Booleans.m12071a(z, z2));
        }

        @Override // com.google.common.collect.ComparisonChain
        /* renamed from: f */
        public ComparisonChain mo11484f(boolean z, boolean z2) {
            return m11486h(Booleans.m12071a(z2, z));
        }

        @Override // com.google.common.collect.ComparisonChain
        /* renamed from: g */
        public int mo11485g() {
            return 0;
        }

        /* renamed from: h */
        public ComparisonChain m11486h(int i2) {
            return i2 < 0 ? ComparisonChain.f20929b : i2 > 0 ? ComparisonChain.f20930c : ComparisonChain.f20928a;
        }
    }

    public static final class InactiveComparisonChain extends ComparisonChain {

        /* renamed from: d */
        public final int f20931d;

        public InactiveComparisonChain(int i2) {
            super(null);
            this.f20931d = i2;
        }

        @Override // com.google.common.collect.ComparisonChain
        /* renamed from: a */
        public ComparisonChain mo11479a(int i2, int i3) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        /* renamed from: b */
        public ComparisonChain mo11480b(long j2, long j3) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        /* renamed from: c */
        public ComparisonChain mo11481c(@NullableDecl Comparable comparable, @NullableDecl Comparable comparable2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        /* renamed from: d */
        public <T> ComparisonChain mo11482d(@NullableDecl T t, @NullableDecl T t2, @NullableDecl Comparator<T> comparator) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        /* renamed from: e */
        public ComparisonChain mo11483e(boolean z, boolean z2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        /* renamed from: f */
        public ComparisonChain mo11484f(boolean z, boolean z2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        /* renamed from: g */
        public int mo11485g() {
            return this.f20931d;
        }
    }

    public ComparisonChain() {
    }

    /* renamed from: a */
    public abstract ComparisonChain mo11479a(int i2, int i3);

    /* renamed from: b */
    public abstract ComparisonChain mo11480b(long j2, long j3);

    /* renamed from: c */
    public abstract ComparisonChain mo11481c(Comparable<?> comparable, Comparable<?> comparable2);

    /* renamed from: d */
    public abstract <T> ComparisonChain mo11482d(@NullableDecl T t, @NullableDecl T t2, Comparator<T> comparator);

    /* renamed from: e */
    public abstract ComparisonChain mo11483e(boolean z, boolean z2);

    /* renamed from: f */
    public abstract ComparisonChain mo11484f(boolean z, boolean z2);

    /* renamed from: g */
    public abstract int mo11485g();

    public ComparisonChain(C16331 c16331) {
    }
}
