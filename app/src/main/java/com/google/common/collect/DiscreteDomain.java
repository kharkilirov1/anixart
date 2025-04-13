package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.lang.Comparable;
import java.math.BigInteger;
import java.util.NoSuchElementException;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class DiscreteDomain<C extends Comparable> {

    /* renamed from: b */
    public final boolean f20956b;

    public static final class BigIntegerDomain extends DiscreteDomain<BigInteger> implements Serializable {

        /* renamed from: c */
        public static final BigInteger f20957c = BigInteger.valueOf(Long.MIN_VALUE);

        /* renamed from: d */
        public static final BigInteger f20958d = BigInteger.valueOf(Long.MAX_VALUE);

        public BigIntegerDomain() {
            super(true, null);
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* renamed from: a */
        public long mo11537a(BigInteger bigInteger, BigInteger bigInteger2) {
            return bigInteger2.subtract(bigInteger).max(f20957c).min(f20958d).longValue();
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* renamed from: d */
        public BigInteger mo11540d(BigInteger bigInteger) {
            return bigInteger.add(BigInteger.ONE);
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* renamed from: e */
        public BigInteger mo11541e(BigInteger bigInteger, long j2) {
            CollectPreconditions.m11428c(j2, "distance");
            return bigInteger.add(BigInteger.valueOf(j2));
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* renamed from: f */
        public BigInteger mo11542f(BigInteger bigInteger) {
            return bigInteger.subtract(BigInteger.ONE);
        }

        public String toString() {
            return "DiscreteDomain.bigIntegers()";
        }
    }

    public static final class IntegerDomain extends DiscreteDomain<Integer> implements Serializable {
        public IntegerDomain() {
            super(true, null);
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* renamed from: a */
        public long mo11537a(Integer num, Integer num2) {
            return num2.intValue() - num.intValue();
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* renamed from: b */
        public Integer mo11538b() {
            return Integer.MAX_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* renamed from: c */
        public Integer mo11539c() {
            return Integer.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* renamed from: d */
        public Integer mo11540d(Integer num) {
            int intValue = num.intValue();
            if (intValue == Integer.MAX_VALUE) {
                return null;
            }
            return Integer.valueOf(intValue + 1);
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* renamed from: e */
        public Integer mo11541e(Integer num, long j2) {
            CollectPreconditions.m11428c(j2, "distance");
            return Integer.valueOf(Ints.m12080b(num.longValue() + j2));
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* renamed from: f */
        public Integer mo11542f(Integer num) {
            int intValue = num.intValue();
            if (intValue == Integer.MIN_VALUE) {
                return null;
            }
            return Integer.valueOf(intValue - 1);
        }

        public String toString() {
            return "DiscreteDomain.integers()";
        }
    }

    public static final class LongDomain extends DiscreteDomain<Long> implements Serializable {
        public LongDomain() {
            super(true, null);
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* renamed from: a */
        public long mo11537a(Long l2, Long l3) {
            Long l4 = l2;
            Long l5 = l3;
            long longValue = l5.longValue() - l4.longValue();
            if (l5.longValue() > l4.longValue() && longValue < 0) {
                return Long.MAX_VALUE;
            }
            if (l5.longValue() >= l4.longValue() || longValue <= 0) {
                return longValue;
            }
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* renamed from: b */
        public Long mo11538b() {
            return Long.MAX_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* renamed from: c */
        public Long mo11539c() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* renamed from: d */
        public Long mo11540d(Long l2) {
            long longValue = l2.longValue();
            if (longValue == Long.MAX_VALUE) {
                return null;
            }
            return Long.valueOf(longValue + 1);
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* renamed from: e */
        public Long mo11541e(Long l2, long j2) {
            Long l3 = l2;
            CollectPreconditions.m11428c(j2, "distance");
            long longValue = l3.longValue() + j2;
            if (longValue < 0) {
                Preconditions.m11179c(l3.longValue() < 0, "overflow");
            }
            return Long.valueOf(longValue);
        }

        @Override // com.google.common.collect.DiscreteDomain
        /* renamed from: f */
        public Long mo11542f(Long l2) {
            long longValue = l2.longValue();
            if (longValue == Long.MIN_VALUE) {
                return null;
            }
            return Long.valueOf(longValue - 1);
        }

        public String toString() {
            return "DiscreteDomain.longs()";
        }
    }

    public DiscreteDomain() {
        this.f20956b = false;
    }

    /* renamed from: a */
    public abstract long mo11537a(C c2, C c3);

    @CanIgnoreReturnValue
    /* renamed from: b */
    public C mo11538b() {
        throw new NoSuchElementException();
    }

    @CanIgnoreReturnValue
    /* renamed from: c */
    public C mo11539c() {
        throw new NoSuchElementException();
    }

    /* renamed from: d */
    public abstract C mo11540d(C c2);

    /* renamed from: e */
    public C mo11541e(C c2, long j2) {
        CollectPreconditions.m11428c(j2, "distance");
        for (long j3 = 0; j3 < j2; j3++) {
            c2 = mo11540d(c2);
        }
        return c2;
    }

    /* renamed from: f */
    public abstract C mo11542f(C c2);

    public DiscreteDomain(boolean z, C16401 c16401) {
        this.f20956b = z;
    }
}
