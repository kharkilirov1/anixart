package com.google.android.exoplayer2.source.dash.manifest;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Util;
import com.google.common.math.BigIntegerMath;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* loaded from: classes.dex */
public abstract class SegmentBase {

    /* renamed from: a */
    @Nullable
    public final RangedUri f12985a;

    /* renamed from: b */
    public final long f12986b;

    /* renamed from: c */
    public final long f12987c;

    public static abstract class MultiSegmentBase extends SegmentBase {

        /* renamed from: d */
        public final long f12988d;

        /* renamed from: e */
        public final long f12989e;

        /* renamed from: f */
        @Nullable
        public final List<SegmentTimelineElement> f12990f;

        /* renamed from: g */
        public final long f12991g;

        /* renamed from: h */
        public final long f12992h;

        /* renamed from: i */
        @VisibleForTesting
        public final long f12993i;

        public MultiSegmentBase(@Nullable RangedUri rangedUri, long j2, long j3, long j4, long j5, @Nullable List<SegmentTimelineElement> list, long j6, long j7, long j8) {
            super(rangedUri, j2, j3);
            this.f12988d = j4;
            this.f12989e = j5;
            this.f12990f = list;
            this.f12993i = j6;
            this.f12991g = j7;
            this.f12992h = j8;
        }

        /* renamed from: b */
        public long m7073b(long j2, long j3) {
            long mo7075d = mo7075d(j2);
            return mo7075d != -1 ? mo7075d : (int) (m7077f((j3 - this.f12992h) + this.f12993i, j2) - m7074c(j2, j3));
        }

        /* renamed from: c */
        public long m7074c(long j2, long j3) {
            if (mo7075d(j2) == -1) {
                long j4 = this.f12991g;
                if (j4 != -9223372036854775807L) {
                    return Math.max(this.f12988d, m7077f((j3 - this.f12992h) - j4, j2));
                }
            }
            return this.f12988d;
        }

        /* renamed from: d */
        public abstract long mo7075d(long j2);

        /* renamed from: e */
        public final long m7076e(long j2, long j3) {
            List<SegmentTimelineElement> list = this.f12990f;
            if (list != null) {
                return (list.get((int) (j2 - this.f12988d)).f12999b * 1000000) / this.f12986b;
            }
            long mo7075d = mo7075d(j3);
            return (mo7075d == -1 || j2 != (this.f12988d + mo7075d) - 1) ? (this.f12989e * 1000000) / this.f12986b : j3 - m7078g(j2);
        }

        /* renamed from: f */
        public long m7077f(long j2, long j3) {
            long j4 = this.f12988d;
            long mo7075d = mo7075d(j3);
            if (mo7075d == 0) {
                return j4;
            }
            if (this.f12990f == null) {
                long j5 = (j2 / ((this.f12989e * 1000000) / this.f12986b)) + this.f12988d;
                return j5 < j4 ? j4 : mo7075d == -1 ? j5 : Math.min(j5, (j4 + mo7075d) - 1);
            }
            long j6 = (mo7075d + j4) - 1;
            long j7 = j4;
            while (j7 <= j6) {
                long j8 = ((j6 - j7) / 2) + j7;
                long m7078g = m7078g(j8);
                if (m7078g < j2) {
                    j7 = j8 + 1;
                } else {
                    if (m7078g <= j2) {
                        return j8;
                    }
                    j6 = j8 - 1;
                }
            }
            return j7 == j4 ? j7 : j6;
        }

        /* renamed from: g */
        public final long m7078g(long j2) {
            List<SegmentTimelineElement> list = this.f12990f;
            return Util.m7723V(list != null ? list.get((int) (j2 - this.f12988d)).f12998a - this.f12987c : (j2 - this.f12988d) * this.f12989e, 1000000L, this.f12986b);
        }

        /* renamed from: h */
        public abstract RangedUri mo7079h(Representation representation, long j2);

        /* renamed from: i */
        public boolean mo7080i() {
            return this.f12990f != null;
        }
    }

    public static final class SegmentList extends MultiSegmentBase {

        /* renamed from: j */
        @Nullable
        public final List<RangedUri> f12994j;

        public SegmentList(RangedUri rangedUri, long j2, long j3, long j4, long j5, @Nullable List<SegmentTimelineElement> list, long j6, @Nullable List<RangedUri> list2, long j7, long j8) {
            super(rangedUri, j2, j3, j4, j5, list, j6, j7, j8);
            this.f12994j = list2;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        /* renamed from: d */
        public long mo7075d(long j2) {
            return this.f12994j.size();
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        /* renamed from: h */
        public RangedUri mo7079h(Representation representation, long j2) {
            return this.f12994j.get((int) (j2 - this.f12988d));
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        /* renamed from: i */
        public boolean mo7080i() {
            return true;
        }
    }

    public static final class SegmentTemplate extends MultiSegmentBase {

        /* renamed from: j */
        @Nullable
        public final UrlTemplate f12995j;

        /* renamed from: k */
        @Nullable
        public final UrlTemplate f12996k;

        /* renamed from: l */
        public final long f12997l;

        public SegmentTemplate(RangedUri rangedUri, long j2, long j3, long j4, long j5, long j6, @Nullable List<SegmentTimelineElement> list, long j7, @Nullable UrlTemplate urlTemplate, @Nullable UrlTemplate urlTemplate2, long j8, long j9) {
            super(rangedUri, j2, j3, j4, j6, list, j7, j8, j9);
            this.f12995j = urlTemplate;
            this.f12996k = urlTemplate2;
            this.f12997l = j5;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase
        @Nullable
        /* renamed from: a */
        public RangedUri mo7072a(Representation representation) {
            UrlTemplate urlTemplate = this.f12995j;
            if (urlTemplate == null) {
                return this.f12985a;
            }
            Format format = representation.f12974a;
            return new RangedUri(urlTemplate.m7081a(format.f9648b, 0L, format.f9655i, 0L), 0L, -1L);
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        /* renamed from: d */
        public long mo7075d(long j2) {
            if (this.f12990f != null) {
                return r0.size();
            }
            long j3 = this.f12997l;
            if (j3 != -1) {
                return (j3 - this.f12988d) + 1;
            }
            if (j2 == -9223372036854775807L) {
                return -1L;
            }
            BigInteger multiply = BigInteger.valueOf(j2).multiply(BigInteger.valueOf(this.f12986b));
            BigInteger multiply2 = BigInteger.valueOf(this.f12989e).multiply(BigInteger.valueOf(1000000L));
            RoundingMode roundingMode = RoundingMode.CEILING;
            int i2 = BigIntegerMath.f21879a;
            return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        /* renamed from: h */
        public RangedUri mo7079h(Representation representation, long j2) {
            List<SegmentTimelineElement> list = this.f12990f;
            long j3 = list != null ? list.get((int) (j2 - this.f12988d)).f12998a : (j2 - this.f12988d) * this.f12989e;
            UrlTemplate urlTemplate = this.f12996k;
            Format format = representation.f12974a;
            return new RangedUri(urlTemplate.m7081a(format.f9648b, j2, format.f9655i, j3), 0L, -1L);
        }
    }

    public static final class SegmentTimelineElement {

        /* renamed from: a */
        public final long f12998a;

        /* renamed from: b */
        public final long f12999b;

        public SegmentTimelineElement(long j2, long j3) {
            this.f12998a = j2;
            this.f12999b = j3;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SegmentTimelineElement.class != obj.getClass()) {
                return false;
            }
            SegmentTimelineElement segmentTimelineElement = (SegmentTimelineElement) obj;
            return this.f12998a == segmentTimelineElement.f12998a && this.f12999b == segmentTimelineElement.f12999b;
        }

        public int hashCode() {
            return (((int) this.f12998a) * 31) + ((int) this.f12999b);
        }
    }

    public SegmentBase(@Nullable RangedUri rangedUri, long j2, long j3) {
        this.f12985a = rangedUri;
        this.f12986b = j2;
        this.f12987c = j3;
    }

    @Nullable
    /* renamed from: a */
    public RangedUri mo7072a(Representation representation) {
        return this.f12985a;
    }

    public static class SingleSegmentBase extends SegmentBase {

        /* renamed from: d */
        public final long f13000d;

        /* renamed from: e */
        public final long f13001e;

        public SingleSegmentBase() {
            super(null, 1L, 0L);
            this.f13000d = 0L;
            this.f13001e = 0L;
        }

        public SingleSegmentBase(@Nullable RangedUri rangedUri, long j2, long j3, long j4, long j5) {
            super(rangedUri, j2, j3);
            this.f13000d = j4;
            this.f13001e = j5;
        }
    }
}
