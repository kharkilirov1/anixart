package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.mp4.C1062a;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class BaseTrackSelection implements ExoTrackSelection {

    /* renamed from: a */
    public final TrackGroup f13881a;

    /* renamed from: b */
    public final int f13882b;

    /* renamed from: c */
    public final int[] f13883c;

    /* renamed from: d */
    public final Format[] f13884d;

    /* renamed from: e */
    public final long[] f13885e;

    /* renamed from: f */
    public int f13886f;

    public BaseTrackSelection(TrackGroup trackGroup, int[] iArr, int i2) {
        int i3 = 0;
        Assertions.m7516d(iArr.length > 0);
        Objects.requireNonNull(trackGroup);
        this.f13881a = trackGroup;
        int length = iArr.length;
        this.f13882b = length;
        this.f13884d = new Format[length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            this.f13884d[i4] = trackGroup.f12590c[iArr[i4]];
        }
        Arrays.sort(this.f13884d, C1062a.f12092d);
        this.f13883c = new int[this.f13882b];
        while (true) {
            int i5 = this.f13882b;
            if (i3 >= i5) {
                this.f13885e = new long[i5];
                return;
            } else {
                this.f13883c[i3] = trackGroup.m6922b(this.f13884d[i3]);
                i3++;
            }
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    /* renamed from: a */
    public final TrackGroup mo7294a() {
        return this.f13881a;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    /* renamed from: c */
    public boolean mo7295c(int i2, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean mo7296d = mo7296d(i2, elapsedRealtime);
        int i3 = 0;
        while (i3 < this.f13882b && !mo7296d) {
            mo7296d = (i3 == i2 || mo7296d(i3, elapsedRealtime)) ? false : true;
            i3++;
        }
        if (!mo7296d) {
            return false;
        }
        long[] jArr = this.f13885e;
        long j3 = jArr[i2];
        int i4 = Util.f14736a;
        long j4 = elapsedRealtime + j2;
        jArr[i2] = Math.max(j3, ((j2 ^ j4) & (elapsedRealtime ^ j4)) >= 0 ? j4 : Long.MAX_VALUE);
        return true;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    /* renamed from: d */
    public boolean mo7296d(int i2, long j2) {
        return this.f13885e[i2] > j2;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    /* renamed from: e */
    public /* synthetic */ boolean mo7297e(long j2, Chunk chunk, List list) {
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseTrackSelection baseTrackSelection = (BaseTrackSelection) obj;
        return this.f13881a == baseTrackSelection.f13881a && Arrays.equals(this.f13883c, baseTrackSelection.f13883c);
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    /* renamed from: f */
    public void mo7288f() {
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    /* renamed from: g */
    public /* synthetic */ void mo7298g(boolean z) {
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    /* renamed from: h */
    public final Format mo7299h(int i2) {
        return this.f13884d[i2];
    }

    public int hashCode() {
        if (this.f13886f == 0) {
            this.f13886f = Arrays.hashCode(this.f13883c) + (System.identityHashCode(this.f13881a) * 31);
        }
        return this.f13886f;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    /* renamed from: i */
    public void mo7289i() {
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    /* renamed from: j */
    public final int mo7300j(int i2) {
        return this.f13883c[i2];
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    /* renamed from: k */
    public int mo7290k(long j2, List<? extends MediaChunk> list) {
        return list.size();
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    /* renamed from: l */
    public final int mo7301l(Format format) {
        for (int i2 = 0; i2 < this.f13882b; i2++) {
            if (this.f13884d[i2] == format) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int length() {
        return this.f13883c.length;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    /* renamed from: n */
    public final int mo7302n() {
        return this.f13883c[mo6736b()];
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    /* renamed from: o */
    public final Format mo7303o() {
        return this.f13884d[mo6736b()];
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    /* renamed from: q */
    public void mo7291q(float f2) {
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    /* renamed from: s */
    public /* synthetic */ void mo7304s() {
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    /* renamed from: t */
    public /* synthetic */ void mo7305t() {
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    /* renamed from: u */
    public final int mo7306u(int i2) {
        for (int i3 = 0; i3 < this.f13882b; i3++) {
            if (this.f13883c[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }
}
