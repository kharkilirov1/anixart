package com.google.android.exoplayer2.trackselection;

import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;
import com.google.common.collect.UnmodifiableListIterator;
import com.yandex.metrica.YandexMetricaDefaultValues;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class AdaptiveTrackSelection extends BaseTrackSelection {

    /* renamed from: g */
    public final BandwidthMeter f13856g;

    /* renamed from: h */
    public final long f13857h;

    /* renamed from: i */
    public final long f13858i;

    /* renamed from: j */
    public final long f13859j;

    /* renamed from: k */
    public final int f13860k;

    /* renamed from: l */
    public final int f13861l;

    /* renamed from: m */
    public final float f13862m;

    /* renamed from: n */
    public final float f13863n;

    /* renamed from: o */
    public final ImmutableList<AdaptationCheckpoint> f13864o;

    /* renamed from: p */
    public final Clock f13865p;

    /* renamed from: q */
    public float f13866q;

    /* renamed from: r */
    public int f13867r;

    /* renamed from: s */
    public int f13868s;

    /* renamed from: t */
    public long f13869t;

    /* renamed from: u */
    @Nullable
    public MediaChunk f13870u;

    public static final class AdaptationCheckpoint {

        /* renamed from: a */
        public final long f13871a;

        /* renamed from: b */
        public final long f13872b;

        public AdaptationCheckpoint(long j2, long j3) {
            this.f13871a = j2;
            this.f13872b = j3;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdaptationCheckpoint)) {
                return false;
            }
            AdaptationCheckpoint adaptationCheckpoint = (AdaptationCheckpoint) obj;
            return this.f13871a == adaptationCheckpoint.f13871a && this.f13872b == adaptationCheckpoint.f13872b;
        }

        public int hashCode() {
            return (((int) this.f13871a) * 31) + ((int) this.f13872b);
        }
    }

    public static class Factory implements ExoTrackSelection.Factory {

        /* renamed from: a */
        public final int f13873a;

        /* renamed from: b */
        public final int f13874b;

        /* renamed from: c */
        public final int f13875c;

        /* renamed from: d */
        public final int f13876d;

        /* renamed from: e */
        public final int f13877e;

        /* renamed from: f */
        public final float f13878f;

        /* renamed from: g */
        public final float f13879g;

        /* renamed from: h */
        public final Clock f13880h;

        public Factory() {
            Clock clock = Clock.f14615a;
            this.f13873a = YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
            this.f13874b = 25000;
            this.f13875c = 25000;
            this.f13876d = 1279;
            this.f13877e = 719;
            this.f13878f = 0.7f;
            this.f13879g = 0.75f;
            this.f13880h = clock;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory
        /* renamed from: a */
        public final ExoTrackSelection[] mo6740a(ExoTrackSelection.Definition[] definitionArr, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
            int i2;
            double d;
            int[] iArr;
            int[] iArr2;
            ArrayList arrayList = new ArrayList();
            char c2 = 0;
            int i3 = 0;
            while (true) {
                i2 = 1;
                if (i3 >= definitionArr.length) {
                    break;
                }
                if (definitionArr[i3] == null || definitionArr[i3].f13956b.length <= 1) {
                    arrayList.add(null);
                } else {
                    UnmodifiableListIterator<Object> unmodifiableListIterator = ImmutableList.f21033c;
                    ImmutableList.Builder builder = new ImmutableList.Builder();
                    builder.m11640d(new AdaptationCheckpoint(0L, 0L));
                    arrayList.add(builder);
                }
                i3++;
            }
            int length = definitionArr.length;
            long[][] jArr = new long[length][];
            for (int i4 = 0; i4 < definitionArr.length; i4++) {
                ExoTrackSelection.Definition definition = definitionArr[i4];
                if (definition == null) {
                    jArr[i4] = new long[0];
                } else {
                    jArr[i4] = new long[definition.f13956b.length];
                    int i5 = 0;
                    while (true) {
                        if (i5 >= definition.f13956b.length) {
                            break;
                        }
                        jArr[i4][i5] = definition.f13955a.f12590c[r12[i5]].f9655i;
                        i5++;
                    }
                    Arrays.sort(jArr[i4]);
                }
            }
            int[] iArr3 = new int[length];
            long[] jArr2 = new long[length];
            for (int i6 = 0; i6 < length; i6++) {
                jArr2[i6] = jArr[i6].length == 0 ? 0L : jArr[i6][0];
            }
            AdaptiveTrackSelection.m7287v(arrayList, jArr2);
            Multimap mo11814c = MultimapBuilder.m11812b().m11815a().mo11814c();
            int i7 = 0;
            while (i7 < length) {
                if (jArr[i7].length <= i2) {
                    iArr = iArr3;
                } else {
                    int length2 = jArr[i7].length;
                    double[] dArr = new double[length2];
                    int i8 = 0;
                    while (true) {
                        d = 0.0d;
                        if (i8 >= jArr[i7].length) {
                            break;
                        }
                        if (jArr[i7][i8] == -1) {
                            iArr2 = iArr3;
                        } else {
                            iArr2 = iArr3;
                            d = Math.log(jArr[i7][i8]);
                        }
                        dArr[i8] = d;
                        i8++;
                        iArr3 = iArr2;
                    }
                    iArr = iArr3;
                    int i9 = length2 - 1;
                    double d2 = dArr[i9] - dArr[0];
                    int i10 = 0;
                    while (i10 < i9) {
                        double d3 = dArr[i10];
                        i10++;
                        mo11814c.put(Double.valueOf(d2 == d ? 1.0d : (((d3 + dArr[i10]) * 0.5d) - dArr[0]) / d2), Integer.valueOf(i7));
                        d = 0.0d;
                    }
                }
                i7++;
                iArr3 = iArr;
                i2 = 1;
            }
            int[] iArr4 = iArr3;
            ImmutableList m11634y = ImmutableList.m11634y(mo11814c.values());
            for (int i11 = 0; i11 < m11634y.size(); i11++) {
                int intValue = ((Integer) m11634y.get(i11)).intValue();
                int i12 = iArr4[intValue] + 1;
                iArr4[intValue] = i12;
                jArr2[intValue] = jArr[intValue][i12];
                AdaptiveTrackSelection.m7287v(arrayList, jArr2);
            }
            for (int i13 = 0; i13 < definitionArr.length; i13++) {
                if (arrayList.get(i13) != null) {
                    jArr2[i13] = jArr2[i13] * 2;
                }
            }
            AdaptiveTrackSelection.m7287v(arrayList, jArr2);
            ImmutableList.Builder builder2 = new ImmutableList.Builder();
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                ImmutableList.Builder builder3 = (ImmutableList.Builder) arrayList.get(i14);
                builder2.m11640d(builder3 == null ? ImmutableList.m11627D() : builder3.m11641e());
            }
            ImmutableList m11641e = builder2.m11641e();
            ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitionArr.length];
            int i15 = 0;
            while (i15 < definitionArr.length) {
                ExoTrackSelection.Definition definition2 = definitionArr[i15];
                if (definition2 != null) {
                    int[] iArr5 = definition2.f13956b;
                    if (iArr5.length != 0) {
                        exoTrackSelectionArr[i15] = iArr5.length == 1 ? new FixedTrackSelection(definition2.f13955a, iArr5[c2], definition2.f13957c) : new AdaptiveTrackSelection(definition2.f13955a, iArr5, definition2.f13957c, bandwidthMeter, this.f13873a, this.f13874b, this.f13875c, this.f13876d, this.f13877e, this.f13878f, this.f13879g, (ImmutableList) m11641e.get(i15), this.f13880h);
                        i15++;
                        c2 = 0;
                    }
                }
                i15++;
                c2 = 0;
            }
            return exoTrackSelectionArr;
        }
    }

    public AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, int i2, BandwidthMeter bandwidthMeter, long j2, long j3, long j4, int i3, int i4, float f2, float f3, List<AdaptationCheckpoint> list, Clock clock) {
        super(trackGroup, iArr, i2);
        BandwidthMeter bandwidthMeter2;
        long j5;
        if (j4 < j2) {
            Log.w("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            bandwidthMeter2 = bandwidthMeter;
            j5 = j2;
        } else {
            bandwidthMeter2 = bandwidthMeter;
            j5 = j4;
        }
        this.f13856g = bandwidthMeter2;
        this.f13857h = j2 * 1000;
        this.f13858i = j3 * 1000;
        this.f13859j = j5 * 1000;
        this.f13860k = i3;
        this.f13861l = i4;
        this.f13862m = f2;
        this.f13863n = f3;
        this.f13864o = ImmutableList.m11634y(list);
        this.f13865p = clock;
        this.f13866q = 1.0f;
        this.f13868s = 0;
        this.f13869t = -9223372036854775807L;
    }

    /* renamed from: v */
    public static void m7287v(List<ImmutableList.Builder<AdaptationCheckpoint>> list, long[] jArr) {
        long j2 = 0;
        for (long j3 : jArr) {
            j2 += j3;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ImmutableList.Builder<AdaptationCheckpoint> builder = list.get(i2);
            if (builder != null) {
                builder.m11640d(new AdaptationCheckpoint(j2, jArr[i2]));
            }
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    /* renamed from: b */
    public int mo6736b() {
        return this.f13867r;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    @CallSuper
    /* renamed from: f */
    public void mo7288f() {
        this.f13870u = null;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    @CallSuper
    /* renamed from: i */
    public void mo7289i() {
        this.f13869t = -9223372036854775807L;
        this.f13870u = null;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    /* renamed from: k */
    public int mo7290k(long j2, List<? extends MediaChunk> list) {
        int i2;
        int i3;
        long mo7527a = this.f13865p.mo7527a();
        long j3 = this.f13869t;
        if (!(j3 == -9223372036854775807L || mo7527a - j3 >= 1000 || !(list.isEmpty() || ((MediaChunk) Iterables.m11700e(list)).equals(this.f13870u)))) {
            return list.size();
        }
        this.f13869t = mo7527a;
        this.f13870u = list.isEmpty() ? null : (MediaChunk) Iterables.m11700e(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long m7704C = Util.m7704C(list.get(size - 1).f12704g - j2, this.f13866q);
        long j4 = this.f13859j;
        if (m7704C < j4) {
            return size;
        }
        Format format = this.f13884d[m7292w(mo7527a, m7293x(list))];
        for (int i4 = 0; i4 < size; i4++) {
            MediaChunk mediaChunk = list.get(i4);
            Format format2 = mediaChunk.f12701d;
            if (Util.m7704C(mediaChunk.f12704g - j2, this.f13866q) >= j4 && format2.f9655i < format.f9655i && (i2 = format2.f9665s) != -1 && i2 <= this.f13861l && (i3 = format2.f9664r) != -1 && i3 <= this.f13860k && i2 < format.f9665s) {
                return i4;
            }
        }
        return size;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a1, code lost:
    
        if (r10 < (r2 ? (long) (r12 * r7.f13863n) : r7.f13857h)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ac, code lost:
    
        r14 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
    
        if (r10 >= r7.f13858i) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0043  */
    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo6737m(long r8, long r10, long r12, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> r14, com.google.android.exoplayer2.source.chunk.MediaChunkIterator[] r15) {
        /*
            r7 = this;
            com.google.android.exoplayer2.util.Clock r8 = r7.f13865p
            long r8 = r8.mo7527a()
            int r0 = r7.f13867r
            int r1 = r15.length
            r2 = 0
            if (r0 >= r1) goto L21
            r0 = r15[r0]
            boolean r0 = r0.next()
            if (r0 == 0) goto L21
            int r0 = r7.f13867r
            r15 = r15[r0]
            long r0 = r15.mo6987b()
            long r3 = r15.mo6986a()
            goto L35
        L21:
            int r0 = r15.length
            r1 = 0
        L23:
            if (r1 >= r0) goto L3a
            r3 = r15[r1]
            boolean r4 = r3.next()
            if (r4 == 0) goto L37
            long r0 = r3.mo6987b()
            long r3 = r3.mo6986a()
        L35:
            long r0 = r0 - r3
            goto L3e
        L37:
            int r1 = r1 + 1
            goto L23
        L3a:
            long r0 = r7.m7293x(r14)
        L3e:
            int r15 = r7.f13868s
            r3 = 1
            if (r15 != 0) goto L4c
            r7.f13868s = r3
            int r8 = r7.m7292w(r8, r0)
            r7.f13867r = r8
            return
        L4c:
            int r4 = r7.f13867r
            boolean r5 = r14.isEmpty()
            r6 = -1
            if (r5 == 0) goto L57
            r5 = -1
            goto L63
        L57:
            java.lang.Object r5 = com.google.common.collect.Iterables.m11700e(r14)
            com.google.android.exoplayer2.source.chunk.MediaChunk r5 = (com.google.android.exoplayer2.source.chunk.MediaChunk) r5
            com.google.android.exoplayer2.Format r5 = r5.f12701d
            int r5 = r7.mo7301l(r5)
        L63:
            if (r5 == r6) goto L6e
            java.lang.Object r14 = com.google.common.collect.Iterables.m11700e(r14)
            com.google.android.exoplayer2.source.chunk.MediaChunk r14 = (com.google.android.exoplayer2.source.chunk.MediaChunk) r14
            int r15 = r14.f12702e
            r4 = r5
        L6e:
            int r14 = r7.m7292w(r8, r0)
            boolean r8 = r7.mo7296d(r4, r8)
            if (r8 != 0) goto Lad
            com.google.android.exoplayer2.Format[] r8 = r7.f13884d
            r9 = r8[r4]
            r8 = r8[r14]
            int r8 = r8.f9655i
            int r9 = r9.f9655i
            if (r8 <= r9) goto La4
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 == 0) goto L94
            long r0 = r7.f13857h
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 > 0) goto L94
            r2 = 1
        L94:
            if (r2 == 0) goto L9d
            float r12 = (float) r12
            float r13 = r7.f13863n
            float r12 = r12 * r13
            long r12 = (long) r12
            goto L9f
        L9d:
            long r12 = r7.f13857h
        L9f:
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 >= 0) goto La4
            goto Lac
        La4:
            if (r8 >= r9) goto Lad
            long r8 = r7.f13858i
            int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r12 < 0) goto Lad
        Lac:
            r14 = r4
        Lad:
            if (r14 != r4) goto Lb0
            goto Lb1
        Lb0:
            r15 = 3
        Lb1:
            r7.f13868s = r15
            r7.f13867r = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.mo6737m(long, long, long, java.util.List, com.google.android.exoplayer2.source.chunk.MediaChunkIterator[]):void");
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    /* renamed from: p */
    public int mo6738p() {
        return this.f13868s;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    /* renamed from: q */
    public void mo7291q(float f2) {
        this.f13866q = f2;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    @Nullable
    /* renamed from: r */
    public Object mo6739r() {
        return null;
    }

    /* renamed from: w */
    public final int m7292w(long j2, long j3) {
        long j4;
        long mo6744f = (long) (this.f13856g.mo6744f() * this.f13862m);
        long mo6741a = this.f13856g.mo6741a();
        if (mo6741a == -9223372036854775807L || j3 == -9223372036854775807L) {
            j4 = (long) (mo6744f / this.f13866q);
        } else {
            float f2 = j3;
            j4 = (long) ((mo6744f * Math.max((f2 / this.f13866q) - mo6741a, 0.0f)) / f2);
        }
        if (!this.f13864o.isEmpty()) {
            int i2 = 1;
            while (i2 < this.f13864o.size() - 1 && this.f13864o.get(i2).f13871a < j4) {
                i2++;
            }
            AdaptationCheckpoint adaptationCheckpoint = this.f13864o.get(i2 - 1);
            AdaptationCheckpoint adaptationCheckpoint2 = this.f13864o.get(i2);
            long j5 = adaptationCheckpoint.f13871a;
            long j6 = adaptationCheckpoint.f13872b;
            j4 = ((long) (((j4 - j5) / (adaptationCheckpoint2.f13871a - j5)) * (adaptationCheckpoint2.f13872b - j6))) + j6;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f13882b; i4++) {
            if (j2 == Long.MIN_VALUE || !mo7296d(i4, j2)) {
                if (((long) this.f13884d[i4].f9655i) <= j4) {
                    return i4;
                }
                i3 = i4;
            }
        }
        return i3;
    }

    /* renamed from: x */
    public final long m7293x(List<? extends MediaChunk> list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        MediaChunk mediaChunk = (MediaChunk) Iterables.m11700e(list);
        long j2 = mediaChunk.f12704g;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j3 = mediaChunk.f12705h;
        if (j3 != -9223372036854775807L) {
            return j3 - j2;
        }
        return -9223372036854775807L;
    }
}
