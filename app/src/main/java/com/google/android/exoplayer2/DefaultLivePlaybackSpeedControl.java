package com.google.android.exoplayer2;

import android.os.SystemClock;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
public final class DefaultLivePlaybackSpeedControl implements LivePlaybackSpeedControl {

    /* renamed from: a */
    public final float f9461a;

    /* renamed from: b */
    public final float f9462b;

    /* renamed from: c */
    public final long f9463c;

    /* renamed from: d */
    public final float f9464d;

    /* renamed from: e */
    public final long f9465e;

    /* renamed from: f */
    public final long f9466f;

    /* renamed from: g */
    public final float f9467g;

    /* renamed from: n */
    public float f9474n;

    /* renamed from: o */
    public float f9475o;

    /* renamed from: h */
    public long f9468h = -9223372036854775807L;

    /* renamed from: i */
    public long f9469i = -9223372036854775807L;

    /* renamed from: k */
    public long f9471k = -9223372036854775807L;

    /* renamed from: l */
    public long f9472l = -9223372036854775807L;

    /* renamed from: p */
    public float f9476p = 1.0f;

    /* renamed from: q */
    public long f9477q = -9223372036854775807L;

    /* renamed from: j */
    public long f9470j = -9223372036854775807L;

    /* renamed from: m */
    public long f9473m = -9223372036854775807L;

    /* renamed from: r */
    public long f9478r = -9223372036854775807L;

    /* renamed from: s */
    public long f9479s = -9223372036854775807L;

    public static final class Builder {

        /* renamed from: a */
        public long f9480a = Util.m7717P(20);

        /* renamed from: b */
        public long f9481b = Util.m7717P(500);

        /* renamed from: c */
        public float f9482c = 0.999f;
    }

    public DefaultLivePlaybackSpeedControl(float f2, float f3, long j2, float f4, long j3, long j4, float f5, C09331 c09331) {
        this.f9461a = f2;
        this.f9462b = f3;
        this.f9463c = j2;
        this.f9464d = f4;
        this.f9465e = j3;
        this.f9466f = j4;
        this.f9467g = f5;
        this.f9475o = f2;
        this.f9474n = f3;
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    /* renamed from: a */
    public void mo5680a(MediaItem.LiveConfiguration liveConfiguration) {
        this.f9468h = Util.m7717P(liveConfiguration.f9760b);
        this.f9471k = Util.m7717P(liveConfiguration.f9761c);
        this.f9472l = Util.m7717P(liveConfiguration.f9762d);
        float f2 = liveConfiguration.f9763e;
        if (f2 == -3.4028235E38f) {
            f2 = this.f9461a;
        }
        this.f9475o = f2;
        float f3 = liveConfiguration.f9764f;
        if (f3 == -3.4028235E38f) {
            f3 = this.f9462b;
        }
        this.f9474n = f3;
        m5685f();
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    /* renamed from: b */
    public float mo5681b(long j2, long j3) {
        if (this.f9468h == -9223372036854775807L) {
            return 1.0f;
        }
        long j4 = j2 - j3;
        long j5 = this.f9478r;
        if (j5 == -9223372036854775807L) {
            this.f9478r = j4;
            this.f9479s = 0L;
        } else {
            float f2 = this.f9467g;
            long max = Math.max(j4, (long) (((1.0f - f2) * j4) + (j5 * f2)));
            this.f9478r = max;
            long abs = Math.abs(j4 - max);
            long j6 = this.f9479s;
            float f3 = this.f9467g;
            this.f9479s = (long) (((1.0f - f3) * abs) + (j6 * f3));
        }
        if (this.f9477q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f9477q < this.f9463c) {
            return this.f9476p;
        }
        this.f9477q = SystemClock.elapsedRealtime();
        long j7 = (this.f9479s * 3) + this.f9478r;
        if (this.f9473m > j7) {
            float m7717P = Util.m7717P(this.f9463c);
            long[] jArr = {j7, this.f9470j, this.f9473m - (((long) ((this.f9476p - 1.0f) * m7717P)) + ((long) ((this.f9474n - 1.0f) * m7717P)))};
            long j8 = jArr[0];
            for (int i2 = 1; i2 < 3; i2++) {
                if (jArr[i2] > j8) {
                    j8 = jArr[i2];
                }
            }
            this.f9473m = j8;
        } else {
            long m7742k = Util.m7742k(j2 - ((long) (Math.max(0.0f, this.f9476p - 1.0f) / this.f9464d)), this.f9473m, j7);
            this.f9473m = m7742k;
            long j9 = this.f9472l;
            if (j9 != -9223372036854775807L && m7742k > j9) {
                this.f9473m = j9;
            }
        }
        long j10 = j2 - this.f9473m;
        if (Math.abs(j10) < this.f9465e) {
            this.f9476p = 1.0f;
        } else {
            this.f9476p = Util.m7740i((this.f9464d * j10) + 1.0f, this.f9475o, this.f9474n);
        }
        return this.f9476p;
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    /* renamed from: c */
    public long mo5682c() {
        return this.f9473m;
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    /* renamed from: d */
    public void mo5683d() {
        long j2 = this.f9473m;
        if (j2 == -9223372036854775807L) {
            return;
        }
        long j3 = j2 + this.f9466f;
        this.f9473m = j3;
        long j4 = this.f9472l;
        if (j4 != -9223372036854775807L && j3 > j4) {
            this.f9473m = j4;
        }
        this.f9477q = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    /* renamed from: e */
    public void mo5684e(long j2) {
        this.f9469i = j2;
        m5685f();
    }

    /* renamed from: f */
    public final void m5685f() {
        long j2 = this.f9468h;
        if (j2 != -9223372036854775807L) {
            long j3 = this.f9469i;
            if (j3 != -9223372036854775807L) {
                j2 = j3;
            }
            long j4 = this.f9471k;
            if (j4 != -9223372036854775807L && j2 < j4) {
                j2 = j4;
            }
            long j5 = this.f9472l;
            if (j5 != -9223372036854775807L && j2 > j5) {
                j2 = j5;
            }
        } else {
            j2 = -9223372036854775807L;
        }
        if (this.f9470j == j2) {
            return;
        }
        this.f9470j = j2;
        this.f9473m = j2;
        this.f9478r = -9223372036854775807L;
        this.f9479s = -9223372036854775807L;
        this.f9477q = -9223372036854775807L;
    }
}
