package com.google.android.exoplayer2.analytics;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class PlaybackStats {

    /* renamed from: A */
    public final int f10130A;

    /* renamed from: B */
    public final long f10131B;

    /* renamed from: C */
    public final int f10132C;

    /* renamed from: D */
    public final long f10133D;

    /* renamed from: E */
    public final long f10134E;

    /* renamed from: F */
    public final long f10135F;

    /* renamed from: G */
    public final long f10136G;

    /* renamed from: H */
    public final long f10137H;

    /* renamed from: I */
    public final int f10138I;

    /* renamed from: J */
    public final int f10139J;

    /* renamed from: K */
    public final int f10140K;

    /* renamed from: L */
    public final List<EventTimeAndException> f10141L;

    /* renamed from: M */
    public final List<EventTimeAndException> f10142M;

    /* renamed from: N */
    public final long[] f10143N;

    /* renamed from: a */
    public final int f10144a;

    /* renamed from: b */
    public final List<EventTimeAndPlaybackState> f10145b;

    /* renamed from: c */
    public final List<long[]> f10146c;

    /* renamed from: d */
    public final long f10147d;

    /* renamed from: e */
    public final int f10148e;

    /* renamed from: f */
    public final int f10149f;

    /* renamed from: g */
    public final int f10150g;

    /* renamed from: h */
    public final int f10151h;

    /* renamed from: i */
    public final long f10152i;

    /* renamed from: j */
    public final int f10153j;

    /* renamed from: k */
    public final int f10154k;

    /* renamed from: l */
    public final int f10155l;

    /* renamed from: m */
    public final int f10156m;

    /* renamed from: n */
    public final int f10157n;

    /* renamed from: o */
    public final long f10158o;

    /* renamed from: p */
    public final int f10159p;

    /* renamed from: q */
    public final List<EventTimeAndFormat> f10160q;

    /* renamed from: r */
    public final List<EventTimeAndFormat> f10161r;

    /* renamed from: s */
    public final long f10162s;

    /* renamed from: t */
    public final long f10163t;

    /* renamed from: u */
    public final long f10164u;

    /* renamed from: v */
    public final long f10165v;

    /* renamed from: w */
    public final long f10166w;

    /* renamed from: x */
    public final long f10167x;

    /* renamed from: y */
    public final int f10168y;

    /* renamed from: z */
    public final int f10169z;

    public static final class EventTimeAndException {

        /* renamed from: a */
        public final AnalyticsListener.EventTime f10170a;

        /* renamed from: b */
        public final Exception f10171b;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTimeAndException.class != obj.getClass()) {
                return false;
            }
            EventTimeAndException eventTimeAndException = (EventTimeAndException) obj;
            if (this.f10170a.equals(eventTimeAndException.f10170a)) {
                return this.f10171b.equals(eventTimeAndException.f10171b);
            }
            return false;
        }

        public int hashCode() {
            return this.f10171b.hashCode() + (this.f10170a.hashCode() * 31);
        }
    }

    public static final class EventTimeAndFormat {

        /* renamed from: a */
        public final AnalyticsListener.EventTime f10172a;

        /* renamed from: b */
        @Nullable
        public final Format f10173b;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTimeAndFormat.class != obj.getClass()) {
                return false;
            }
            EventTimeAndFormat eventTimeAndFormat = (EventTimeAndFormat) obj;
            if (!this.f10172a.equals(eventTimeAndFormat.f10172a)) {
                return false;
            }
            Format format = this.f10173b;
            Format format2 = eventTimeAndFormat.f10173b;
            return format != null ? format.equals(format2) : format2 == null;
        }

        public int hashCode() {
            int hashCode = this.f10172a.hashCode() * 31;
            Format format = this.f10173b;
            return hashCode + (format != null ? format.hashCode() : 0);
        }
    }

    public static final class EventTimeAndPlaybackState {

        /* renamed from: a */
        public final AnalyticsListener.EventTime f10174a;

        /* renamed from: b */
        public final int f10175b;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTimeAndPlaybackState.class != obj.getClass()) {
                return false;
            }
            EventTimeAndPlaybackState eventTimeAndPlaybackState = (EventTimeAndPlaybackState) obj;
            if (this.f10175b != eventTimeAndPlaybackState.f10175b) {
                return false;
            }
            return this.f10174a.equals(eventTimeAndPlaybackState.f10174a);
        }

        public int hashCode() {
            return (this.f10174a.hashCode() * 31) + this.f10175b;
        }
    }

    static {
        m6095a(new PlaybackStats[0]);
    }

    public PlaybackStats(int i2, long[] jArr, List<EventTimeAndPlaybackState> list, List<long[]> list2, long j2, int i3, int i4, int i5, int i6, long j3, int i7, int i8, int i9, int i10, int i11, long j4, int i12, List<EventTimeAndFormat> list3, List<EventTimeAndFormat> list4, long j5, long j6, long j7, long j8, long j9, long j10, int i13, int i14, int i15, long j11, int i16, long j12, long j13, long j14, long j15, long j16, int i17, int i18, int i19, List<EventTimeAndException> list5, List<EventTimeAndException> list6) {
        this.f10144a = i2;
        this.f10143N = jArr;
        this.f10145b = Collections.unmodifiableList(list);
        this.f10146c = Collections.unmodifiableList(list2);
        this.f10147d = j2;
        this.f10148e = i3;
        this.f10149f = i4;
        this.f10150g = i5;
        this.f10151h = i6;
        this.f10152i = j3;
        this.f10153j = i7;
        this.f10154k = i8;
        this.f10155l = i9;
        this.f10156m = i10;
        this.f10157n = i11;
        this.f10158o = j4;
        this.f10159p = i12;
        this.f10160q = Collections.unmodifiableList(list3);
        this.f10161r = Collections.unmodifiableList(list4);
        this.f10162s = j5;
        this.f10163t = j6;
        this.f10164u = j7;
        this.f10165v = j8;
        this.f10166w = j9;
        this.f10167x = j10;
        this.f10168y = i13;
        this.f10169z = i14;
        this.f10130A = i15;
        this.f10131B = j11;
        this.f10132C = i16;
        this.f10133D = j12;
        this.f10134E = j13;
        this.f10135F = j14;
        this.f10136G = j15;
        this.f10137H = j16;
        this.f10138I = i17;
        this.f10139J = i18;
        this.f10140K = i19;
        this.f10141L = Collections.unmodifiableList(list5);
        this.f10142M = Collections.unmodifiableList(list6);
    }

    /* renamed from: a */
    public static PlaybackStats m6095a(PlaybackStats... playbackStatsArr) {
        int i2;
        long j2;
        PlaybackStats[] playbackStatsArr2 = playbackStatsArr;
        int i3 = 16;
        long[] jArr = new long[16];
        int length = playbackStatsArr2.length;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        int i4 = -1;
        long j13 = -9223372036854775807L;
        int i5 = 0;
        int i6 = 0;
        long j14 = -9223372036854775807L;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        long j15 = -9223372036854775807L;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        long j16 = -1;
        int i19 = 0;
        long j17 = -1;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        while (i5 < length) {
            PlaybackStats playbackStats = playbackStatsArr2[i5];
            int i23 = i6 + playbackStats.f10144a;
            int i24 = 0;
            while (i24 < i3) {
                jArr[i24] = jArr[i24] + playbackStats.f10143N[i24];
                i24++;
                i3 = 16;
            }
            if (j14 == -9223372036854775807L) {
                j14 = playbackStats.f10147d;
            } else {
                long j18 = playbackStats.f10147d;
                if (j18 != -9223372036854775807L) {
                    j14 = Math.min(j14, j18);
                }
            }
            i7 += playbackStats.f10148e;
            i8 += playbackStats.f10149f;
            i9 += playbackStats.f10150g;
            i10 += playbackStats.f10151h;
            if (j15 == -9223372036854775807L) {
                j15 = playbackStats.f10152i;
            } else {
                long j19 = playbackStats.f10152i;
                if (j19 != -9223372036854775807L) {
                    j15 += j19;
                }
            }
            i11 += playbackStats.f10153j;
            i12 += playbackStats.f10154k;
            i13 += playbackStats.f10155l;
            i14 += playbackStats.f10156m;
            i15 += playbackStats.f10157n;
            if (j13 == -9223372036854775807L) {
                j13 = playbackStats.f10158o;
                i2 = i23;
                j2 = j14;
            } else {
                i2 = i23;
                j2 = j14;
                long j20 = playbackStats.f10158o;
                if (j20 != -9223372036854775807L) {
                    j13 = Math.max(j13, j20);
                }
            }
            i16 += playbackStats.f10159p;
            j3 += playbackStats.f10162s;
            j4 += playbackStats.f10163t;
            j5 += playbackStats.f10164u;
            j6 += playbackStats.f10165v;
            j7 += playbackStats.f10166w;
            j8 += playbackStats.f10167x;
            i17 += playbackStats.f10168y;
            i18 += playbackStats.f10169z;
            if (i4 == -1) {
                i4 = playbackStats.f10130A;
            } else {
                int i25 = playbackStats.f10130A;
                if (i25 != -1) {
                    i4 += i25;
                }
            }
            if (j16 == -1) {
                j16 = playbackStats.f10131B;
            } else {
                long j21 = playbackStats.f10131B;
                if (j21 != -1) {
                    j16 += j21;
                }
            }
            i19 += playbackStats.f10132C;
            if (j17 == -1) {
                j17 = playbackStats.f10133D;
            } else {
                long j22 = playbackStats.f10133D;
                if (j22 != -1) {
                    j17 += j22;
                }
            }
            j9 += playbackStats.f10134E;
            j10 += playbackStats.f10135F;
            j11 += playbackStats.f10136G;
            j12 += playbackStats.f10137H;
            i20 += playbackStats.f10138I;
            i21 += playbackStats.f10139J;
            i22 += playbackStats.f10140K;
            i5++;
            playbackStatsArr2 = playbackStatsArr;
            i6 = i2;
            j14 = j2;
            i3 = 16;
        }
        return new PlaybackStats(i6, jArr, Collections.emptyList(), Collections.emptyList(), j14, i7, i8, i9, i10, j15, i11, i12, i13, i14, i15, j13, i16, Collections.emptyList(), Collections.emptyList(), j3, j4, j5, j6, j7, j8, i17, i18, i4, j16, i19, j17, j9, j10, j11, j12, i20, i21, i22, Collections.emptyList(), Collections.emptyList());
    }
}
