package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
final class AudioTrackPositionTracker {

    /* renamed from: A */
    public long f10323A;

    /* renamed from: B */
    public long f10324B;

    /* renamed from: C */
    public long f10325C;

    /* renamed from: D */
    public boolean f10326D;

    /* renamed from: E */
    public long f10327E;

    /* renamed from: F */
    public long f10328F;

    /* renamed from: a */
    public final Listener f10329a;

    /* renamed from: b */
    public final long[] f10330b;

    /* renamed from: c */
    @Nullable
    public AudioTrack f10331c;

    /* renamed from: d */
    public int f10332d;

    /* renamed from: e */
    public int f10333e;

    /* renamed from: f */
    @Nullable
    public AudioTimestampPoller f10334f;

    /* renamed from: g */
    public int f10335g;

    /* renamed from: h */
    public boolean f10336h;

    /* renamed from: i */
    public long f10337i;

    /* renamed from: j */
    public float f10338j;

    /* renamed from: k */
    public boolean f10339k;

    /* renamed from: l */
    public long f10340l;

    /* renamed from: m */
    public long f10341m;

    /* renamed from: n */
    @Nullable
    public Method f10342n;

    /* renamed from: o */
    public long f10343o;

    /* renamed from: p */
    public boolean f10344p;

    /* renamed from: q */
    public boolean f10345q;

    /* renamed from: r */
    public long f10346r;

    /* renamed from: s */
    public long f10347s;

    /* renamed from: t */
    public long f10348t;

    /* renamed from: u */
    public long f10349u;

    /* renamed from: v */
    public int f10350v;

    /* renamed from: w */
    public int f10351w;

    /* renamed from: x */
    public long f10352x;

    /* renamed from: y */
    public long f10353y;

    /* renamed from: z */
    public long f10354z;

    public interface Listener {
        /* renamed from: a */
        void mo6152a(long j2);

        /* renamed from: b */
        void mo6153b(int i2, long j2);

        /* renamed from: c */
        void mo6154c(long j2);

        /* renamed from: d */
        void mo6155d(long j2, long j3, long j4, long j5);

        /* renamed from: e */
        void mo6156e(long j2, long j3, long j4, long j5);
    }

    public AudioTrackPositionTracker(Listener listener) {
        this.f10329a = listener;
        if (Util.f14736a >= 18) {
            try {
                this.f10342n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f10330b = new long[10];
    }

    /* renamed from: a */
    public final long m6147a(long j2) {
        return (j2 * 1000000) / this.f10335g;
    }

    /* renamed from: b */
    public final long m6148b() {
        AudioTrack audioTrack = this.f10331c;
        Objects.requireNonNull(audioTrack);
        if (this.f10352x != -9223372036854775807L) {
            return Math.min(this.f10323A, this.f10354z + ((((SystemClock.elapsedRealtime() * 1000) - this.f10352x) * this.f10335g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & audioTrack.getPlaybackHeadPosition();
        if (this.f10336h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f10349u = this.f10347s;
            }
            playbackHeadPosition += this.f10349u;
        }
        if (Util.f14736a <= 29) {
            if (playbackHeadPosition == 0 && this.f10347s > 0 && playState == 3) {
                if (this.f10353y == -9223372036854775807L) {
                    this.f10353y = SystemClock.elapsedRealtime();
                }
                return this.f10347s;
            }
            this.f10353y = -9223372036854775807L;
        }
        if (this.f10347s > playbackHeadPosition) {
            this.f10348t++;
        }
        this.f10347s = playbackHeadPosition;
        return playbackHeadPosition + (this.f10348t << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m6149c(long r6) {
        /*
            r5 = this;
            long r0 = r5.m6148b()
            r2 = 0
            r3 = 1
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 > 0) goto L29
            boolean r6 = r5.f10336h
            if (r6 == 0) goto L26
            android.media.AudioTrack r6 = r5.f10331c
            java.util.Objects.requireNonNull(r6)
            int r6 = r6.getPlayState()
            r7 = 2
            if (r6 != r7) goto L26
            long r6 = r5.m6148b()
            r0 = 0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 != 0) goto L26
            r6 = 1
            goto L27
        L26:
            r6 = 0
        L27:
            if (r6 == 0) goto L2a
        L29:
            r2 = 1
        L2a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioTrackPositionTracker.m6149c(long):boolean");
    }

    /* renamed from: d */
    public void m6150d() {
        this.f10340l = 0L;
        this.f10351w = 0;
        this.f10350v = 0;
        this.f10341m = 0L;
        this.f10325C = 0L;
        this.f10328F = 0L;
        this.f10339k = false;
        this.f10331c = null;
        this.f10334f = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if ((com.google.android.exoplayer2.util.Util.f14736a < 23 && (r5 == 5 || r5 == 6)) != false) goto L15;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m6151e(android.media.AudioTrack r3, boolean r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            r2.f10331c = r3
            r2.f10332d = r6
            r2.f10333e = r7
            com.google.android.exoplayer2.audio.AudioTimestampPoller r0 = new com.google.android.exoplayer2.audio.AudioTimestampPoller
            r0.<init>(r3)
            r2.f10334f = r0
            int r3 = r3.getSampleRate()
            r2.f10335g = r3
            r3 = 1
            r0 = 0
            if (r4 == 0) goto L29
            int r4 = com.google.android.exoplayer2.util.Util.f14736a
            r1 = 23
            if (r4 >= r1) goto L25
            r4 = 5
            if (r5 == r4) goto L23
            r4 = 6
            if (r5 != r4) goto L25
        L23:
            r4 = 1
            goto L26
        L25:
            r4 = 0
        L26:
            if (r4 == 0) goto L29
            goto L2a
        L29:
            r3 = 0
        L2a:
            r2.f10336h = r3
            boolean r3 = com.google.android.exoplayer2.util.Util.m7713L(r5)
            r2.f10345q = r3
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L40
            int r7 = r7 / r6
            long r6 = (long) r7
            long r6 = r2.m6147a(r6)
            goto L41
        L40:
            r6 = r4
        L41:
            r2.f10337i = r6
            r6 = 0
            r2.f10347s = r6
            r2.f10348t = r6
            r2.f10349u = r6
            r2.f10344p = r0
            r2.f10352x = r4
            r2.f10353y = r4
            r2.f10346r = r6
            r2.f10343o = r6
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.f10338j = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioTrackPositionTracker.m6151e(android.media.AudioTrack, boolean, int, int, int):void");
    }
}
