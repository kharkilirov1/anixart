package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class BinarySearchSeeker {

    /* renamed from: a */
    public final BinarySearchSeekMap f10795a;

    /* renamed from: b */
    public final TimestampSeeker f10796b;

    /* renamed from: c */
    @Nullable
    public SeekOperationParams f10797c;

    /* renamed from: d */
    public final int f10798d;

    public static class BinarySearchSeekMap implements SeekMap {

        /* renamed from: a */
        public final SeekTimestampConverter f10799a;

        /* renamed from: b */
        public final long f10800b;

        /* renamed from: c */
        public final long f10801c;

        /* renamed from: d */
        public final long f10802d;

        /* renamed from: e */
        public final long f10803e;

        /* renamed from: f */
        public final long f10804f;

        /* renamed from: g */
        public final long f10805g;

        public BinarySearchSeekMap(SeekTimestampConverter seekTimestampConverter, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f10799a = seekTimestampConverter;
            this.f10800b = j2;
            this.f10801c = j3;
            this.f10802d = j4;
            this.f10803e = j5;
            this.f10804f = j6;
            this.f10805g = j7;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        /* renamed from: f */
        public boolean mo6363f() {
            return true;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        /* renamed from: h */
        public SeekMap.SeekPoints mo6364h(long j2) {
            return new SeekMap.SeekPoints(new SeekPoint(j2, SeekOperationParams.m6366a(this.f10799a.mo2563c(j2), this.f10801c, this.f10802d, this.f10803e, this.f10804f, this.f10805g)));
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        /* renamed from: i */
        public long mo6365i() {
            return this.f10800b;
        }
    }

    public static final class DefaultSeekTimestampConverter implements SeekTimestampConverter {
        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekTimestampConverter
        /* renamed from: c */
        public long mo2563c(long j2) {
            return j2;
        }
    }

    public static class SeekOperationParams {

        /* renamed from: a */
        public final long f10806a;

        /* renamed from: b */
        public final long f10807b;

        /* renamed from: c */
        public final long f10808c;

        /* renamed from: d */
        public long f10809d;

        /* renamed from: e */
        public long f10810e;

        /* renamed from: f */
        public long f10811f;

        /* renamed from: g */
        public long f10812g;

        /* renamed from: h */
        public long f10813h;

        public SeekOperationParams(long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
            this.f10806a = j2;
            this.f10807b = j3;
            this.f10809d = j4;
            this.f10810e = j5;
            this.f10811f = j6;
            this.f10812g = j7;
            this.f10808c = j8;
            this.f10813h = m6366a(j3, j4, j5, j6, j7, j8);
        }

        /* renamed from: a */
        public static long m6366a(long j2, long j3, long j4, long j5, long j6, long j7) {
            if (j5 + 1 >= j6 || j3 + 1 >= j4) {
                return j5;
            }
            long j8 = (long) ((j2 - j3) * ((j6 - j5) / (j4 - j3)));
            return Util.m7742k(((j8 + j5) - j7) - (j8 / 20), j5, j6 - 1);
        }
    }

    public interface SeekTimestampConverter {
        /* renamed from: c */
        long mo2563c(long j2);
    }

    public static final class TimestampSearchResult {

        /* renamed from: d */
        public static final TimestampSearchResult f10814d = new TimestampSearchResult(-3, -9223372036854775807L, -1);

        /* renamed from: a */
        public final int f10815a;

        /* renamed from: b */
        public final long f10816b;

        /* renamed from: c */
        public final long f10817c;

        public TimestampSearchResult(int i2, long j2, long j3) {
            this.f10815a = i2;
            this.f10816b = j2;
            this.f10817c = j3;
        }

        /* renamed from: a */
        public static TimestampSearchResult m6367a(long j2, long j3) {
            return new TimestampSearchResult(-1, j2, j3);
        }

        /* renamed from: b */
        public static TimestampSearchResult m6368b(long j2) {
            return new TimestampSearchResult(0, -9223372036854775807L, j2);
        }

        /* renamed from: c */
        public static TimestampSearchResult m6369c(long j2, long j3) {
            return new TimestampSearchResult(-2, j2, j3);
        }
    }

    public interface TimestampSeeker {
        /* renamed from: a */
        void mo6370a();

        /* renamed from: b */
        TimestampSearchResult mo6371b(ExtractorInput extractorInput, long j2) throws IOException;
    }

    public BinarySearchSeeker(SeekTimestampConverter seekTimestampConverter, TimestampSeeker timestampSeeker, long j2, long j3, long j4, long j5, long j6, long j7, int i2) {
        this.f10796b = timestampSeeker;
        this.f10798d = i2;
        this.f10795a = new BinarySearchSeekMap(seekTimestampConverter, j2, j3, j4, j5, j6, j7);
    }

    /* renamed from: a */
    public int m6357a(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        while (true) {
            SeekOperationParams seekOperationParams = this.f10797c;
            Assertions.m7518f(seekOperationParams);
            long j2 = seekOperationParams.f10811f;
            long j3 = seekOperationParams.f10812g;
            long j4 = seekOperationParams.f10813h;
            if (j3 - j2 <= this.f10798d) {
                m6359c(false, j2);
                return m6360d(extractorInput, j2, positionHolder);
            }
            if (!m6362f(extractorInput, j4)) {
                return m6360d(extractorInput, j4, positionHolder);
            }
            extractorInput.mo6383j();
            TimestampSearchResult mo6371b = this.f10796b.mo6371b(extractorInput, seekOperationParams.f10807b);
            int i2 = mo6371b.f10815a;
            if (i2 == -3) {
                m6359c(false, j4);
                return m6360d(extractorInput, j4, positionHolder);
            }
            if (i2 == -2) {
                long j5 = mo6371b.f10816b;
                long j6 = mo6371b.f10817c;
                seekOperationParams.f10809d = j5;
                seekOperationParams.f10811f = j6;
                seekOperationParams.f10813h = SeekOperationParams.m6366a(seekOperationParams.f10807b, j5, seekOperationParams.f10810e, j6, seekOperationParams.f10812g, seekOperationParams.f10808c);
            } else {
                if (i2 != -1) {
                    if (i2 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    m6362f(extractorInput, mo6371b.f10817c);
                    m6359c(true, mo6371b.f10817c);
                    return m6360d(extractorInput, mo6371b.f10817c, positionHolder);
                }
                long j7 = mo6371b.f10816b;
                long j8 = mo6371b.f10817c;
                seekOperationParams.f10810e = j7;
                seekOperationParams.f10812g = j8;
                seekOperationParams.f10813h = SeekOperationParams.m6366a(seekOperationParams.f10807b, seekOperationParams.f10809d, j7, seekOperationParams.f10811f, j8, seekOperationParams.f10808c);
            }
        }
    }

    /* renamed from: b */
    public final boolean m6358b() {
        return this.f10797c != null;
    }

    /* renamed from: c */
    public final void m6359c(boolean z, long j2) {
        this.f10797c = null;
        this.f10796b.mo6370a();
    }

    /* renamed from: d */
    public final int m6360d(ExtractorInput extractorInput, long j2, PositionHolder positionHolder) {
        if (j2 == extractorInput.getPosition()) {
            return 0;
        }
        positionHolder.f10871a = j2;
        return 1;
    }

    /* renamed from: e */
    public final void m6361e(long j2) {
        SeekOperationParams seekOperationParams = this.f10797c;
        if (seekOperationParams == null || seekOperationParams.f10806a != j2) {
            long mo2563c = this.f10795a.f10799a.mo2563c(j2);
            BinarySearchSeekMap binarySearchSeekMap = this.f10795a;
            this.f10797c = new SeekOperationParams(j2, mo2563c, binarySearchSeekMap.f10801c, binarySearchSeekMap.f10802d, binarySearchSeekMap.f10803e, binarySearchSeekMap.f10804f, binarySearchSeekMap.f10805g);
        }
    }

    /* renamed from: f */
    public final boolean m6362f(ExtractorInput extractorInput, long j2) throws IOException {
        long position = j2 - extractorInput.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        extractorInput.mo6384k((int) position);
        return true;
    }
}
