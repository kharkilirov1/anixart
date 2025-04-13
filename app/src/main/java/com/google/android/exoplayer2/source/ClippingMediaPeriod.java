package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.ClippingMediaSource;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ClippingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {

    /* renamed from: b */
    public final MediaPeriod f12237b;

    /* renamed from: c */
    @Nullable
    public MediaPeriod.Callback f12238c;

    /* renamed from: d */
    public ClippingSampleStream[] f12239d = new ClippingSampleStream[0];

    /* renamed from: e */
    public long f12240e;

    /* renamed from: f */
    public long f12241f;

    /* renamed from: g */
    public long f12242g;

    /* renamed from: h */
    @Nullable
    public ClippingMediaSource.IllegalClippingException f12243h;

    public final class ClippingSampleStream implements SampleStream {

        /* renamed from: b */
        public final SampleStream f12244b;

        /* renamed from: c */
        public boolean f12245c;

        public ClippingSampleStream(SampleStream sampleStream) {
            this.f12244b = sampleStream;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: a */
        public void mo6791a() throws IOException {
            this.f12244b.mo6791a();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: b */
        public boolean mo6792b() {
            return !ClippingMediaPeriod.this.m6787b() && this.f12244b.mo6792b();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: d */
        public int mo6793d(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
            if (ClippingMediaPeriod.this.m6787b()) {
                return -3;
            }
            if (this.f12245c) {
                decoderInputBuffer.f10580b = 4;
                return -4;
            }
            int mo6793d = this.f12244b.mo6793d(formatHolder, decoderInputBuffer, i2);
            if (mo6793d != -5) {
                ClippingMediaPeriod clippingMediaPeriod = ClippingMediaPeriod.this;
                long j2 = clippingMediaPeriod.f12242g;
                if (j2 == Long.MIN_VALUE || ((mo6793d != -4 || decoderInputBuffer.f10607f < j2) && !(mo6793d == -3 && clippingMediaPeriod.getBufferedPositionUs() == Long.MIN_VALUE && !decoderInputBuffer.f10606e))) {
                    return mo6793d;
                }
                decoderInputBuffer.mo6248l();
                decoderInputBuffer.f10580b = 4;
                this.f12245c = true;
                return -4;
            }
            Format format = formatHolder.f9704b;
            Objects.requireNonNull(format);
            int i3 = format.f9643C;
            if (i3 != 0 || format.f9644D != 0) {
                ClippingMediaPeriod clippingMediaPeriod2 = ClippingMediaPeriod.this;
                if (clippingMediaPeriod2.f12241f != 0) {
                    i3 = 0;
                }
                int i4 = clippingMediaPeriod2.f12242g == Long.MIN_VALUE ? format.f9644D : 0;
                Format.Builder m5829b = format.m5829b();
                m5829b.f9673A = i3;
                m5829b.f9674B = i4;
                formatHolder.f9704b = m5829b.m5833a();
            }
            return -5;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: h */
        public int mo6794h(long j2) {
            if (ClippingMediaPeriod.this.m6787b()) {
                return -3;
            }
            return this.f12244b.mo6794h(j2);
        }
    }

    public ClippingMediaPeriod(MediaPeriod mediaPeriod, boolean z, long j2, long j3) {
        this.f12237b = mediaPeriod;
        this.f12240e = z ? j2 : -9223372036854775807L;
        this.f12241f = j2;
        this.f12242g = j3;
    }

    /* renamed from: b */
    public boolean m6787b() {
        return this.f12240e != -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    /* renamed from: c */
    public long mo6788c(long j2, SeekParameters seekParameters) {
        long j3 = this.f12241f;
        if (j2 == j3) {
            return j3;
        }
        long m7742k = Util.m7742k(seekParameters.f9987a, 0L, j2 - j3);
        long j4 = seekParameters.f9988b;
        long j5 = this.f12242g;
        long m7742k2 = Util.m7742k(j4, 0L, j5 == Long.MIN_VALUE ? Long.MAX_VALUE : j5 - j2);
        if (m7742k != seekParameters.f9987a || m7742k2 != seekParameters.f9988b) {
            seekParameters = new SeekParameters(m7742k, m7742k2);
        }
        return this.f12237b.mo6788c(j2, seekParameters);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j2) {
        return this.f12237b.continueLoading(j2);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long j2, boolean z) {
        this.f12237b.discardBuffer(j2, z);
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    /* renamed from: e */
    public void mo5784e(MediaPeriod mediaPeriod) {
        MediaPeriod.Callback callback = this.f12238c;
        Objects.requireNonNull(callback);
        callback.mo5784e(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    /* renamed from: g */
    public void mo5787g(MediaPeriod mediaPeriod) {
        if (this.f12243h != null) {
            return;
        }
        MediaPeriod.Callback callback = this.f12238c;
        Objects.requireNonNull(callback);
        callback.mo5787g(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.f12237b.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j2 = this.f12242g;
            if (j2 == Long.MIN_VALUE || bufferedPositionUs < j2) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f12237b.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j2 = this.f12242g;
            if (j2 == Long.MIN_VALUE || nextLoadPositionUs < j2) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return this.f12237b.getTrackGroups();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    /* renamed from: i */
    public void mo6789i(MediaPeriod.Callback callback, long j2) {
        this.f12238c = callback;
        this.f12237b.mo6789i(this, j2);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return this.f12237b.isLoading();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
    
        if (r1 > r5) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f  */
    @Override // com.google.android.exoplayer2.source.MediaPeriod
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo6790j(com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r16, boolean[] r17, com.google.android.exoplayer2.source.SampleStream[] r18, boolean[] r19, long r20) {
        /*
            r15 = this;
            r0 = r15
            r8 = r16
            r9 = r18
            int r1 = r9.length
            com.google.android.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream[] r1 = new com.google.android.exoplayer2.source.ClippingMediaPeriod.ClippingSampleStream[r1]
            r0.f12239d = r1
            int r1 = r9.length
            com.google.android.exoplayer2.source.SampleStream[] r10 = new com.google.android.exoplayer2.source.SampleStream[r1]
            r11 = 0
            r1 = 0
        Lf:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L28
            com.google.android.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream[] r2 = r0.f12239d
            r3 = r9[r1]
            com.google.android.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream r3 = (com.google.android.exoplayer2.source.ClippingMediaPeriod.ClippingSampleStream) r3
            r2[r1] = r3
            r3 = r2[r1]
            if (r3 == 0) goto L23
            r2 = r2[r1]
            com.google.android.exoplayer2.source.SampleStream r12 = r2.f12244b
        L23:
            r10[r1] = r12
            int r1 = r1 + 1
            goto Lf
        L28:
            com.google.android.exoplayer2.source.MediaPeriod r1 = r0.f12237b
            r2 = r16
            r3 = r17
            r4 = r10
            r5 = r19
            r6 = r20
            long r1 = r1.mo6790j(r2, r3, r4, r5, r6)
            boolean r3 = r15.m6787b()
            r4 = 1
            if (r3 == 0) goto L6a
            long r5 = r0.f12241f
            int r3 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r3 != 0) goto L6a
            r13 = 0
            int r3 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r3 == 0) goto L65
            int r3 = r8.length
            r5 = 0
        L4c:
            if (r5 >= r3) goto L65
            r6 = r8[r5]
            if (r6 == 0) goto L62
            com.google.android.exoplayer2.Format r6 = r6.mo7303o()
            java.lang.String r7 = r6.f9659m
            java.lang.String r6 = r6.f9656j
            boolean r6 = com.google.android.exoplayer2.util.MimeTypes.m7593a(r7, r6)
            if (r6 != 0) goto L62
            r3 = 1
            goto L66
        L62:
            int r5 = r5 + 1
            goto L4c
        L65:
            r3 = 0
        L66:
            if (r3 == 0) goto L6a
            r5 = r1
            goto L6f
        L6a:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L6f:
            r0.f12240e = r5
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r3 == 0) goto L89
            long r5 = r0.f12241f
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L88
            long r5 = r0.f12242g
            r7 = -9223372036854775808
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L89
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 > 0) goto L88
            goto L89
        L88:
            r4 = 0
        L89:
            com.google.android.exoplayer2.util.Assertions.m7516d(r4)
        L8c:
            int r3 = r9.length
            if (r11 >= r3) goto Lb8
            r3 = r10[r11]
            if (r3 != 0) goto L98
            com.google.android.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream[] r3 = r0.f12239d
            r3[r11] = r12
            goto Laf
        L98:
            com.google.android.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream[] r3 = r0.f12239d
            r4 = r3[r11]
            if (r4 == 0) goto La6
            r4 = r3[r11]
            com.google.android.exoplayer2.source.SampleStream r4 = r4.f12244b
            r5 = r10[r11]
            if (r4 == r5) goto Laf
        La6:
            com.google.android.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream r4 = new com.google.android.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream
            r5 = r10[r11]
            r4.<init>(r5)
            r3[r11] = r4
        Laf:
            com.google.android.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream[] r3 = r0.f12239d
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L8c
        Lb8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.ClippingMediaPeriod.mo6790j(com.google.android.exoplayer2.trackselection.ExoTrackSelection[], boolean[], com.google.android.exoplayer2.source.SampleStream[], boolean[], long):long");
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.f12243h;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.f12237b.maybeThrowPrepareError();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        if (m6787b()) {
            long j2 = this.f12240e;
            this.f12240e = -9223372036854775807L;
            long readDiscontinuity = readDiscontinuity();
            return readDiscontinuity != -9223372036854775807L ? readDiscontinuity : j2;
        }
        long readDiscontinuity2 = this.f12237b.readDiscontinuity();
        if (readDiscontinuity2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        Assertions.m7516d(readDiscontinuity2 >= this.f12241f);
        long j3 = this.f12242g;
        if (j3 != Long.MIN_VALUE && readDiscontinuity2 > j3) {
            z = false;
        }
        Assertions.m7516d(z);
        return readDiscontinuity2;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j2) {
        this.f12237b.reevaluateBuffer(j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r0 > r7) goto L17;
     */
    @Override // com.google.android.exoplayer2.source.MediaPeriod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long seekToUs(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f12240e = r0
            com.google.android.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream[] r0 = r6.f12239d
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f12245c = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            com.google.android.exoplayer2.source.MediaPeriod r0 = r6.f12237b
            long r0 = r0.seekToUs(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L33
            long r7 = r6.f12241f
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L34
            long r7 = r6.f12242g
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L33
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L34
        L33:
            r2 = 1
        L34:
            com.google.android.exoplayer2.util.Assertions.m7516d(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.ClippingMediaPeriod.seekToUs(long):long");
    }
}
