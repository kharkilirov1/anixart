package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MediaClock;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class BaseRenderer implements Renderer, RendererCapabilities {

    /* renamed from: b */
    public final int f9443b;

    /* renamed from: d */
    @Nullable
    public RendererConfiguration f9445d;

    /* renamed from: e */
    public int f9446e;

    /* renamed from: f */
    public int f9447f;

    /* renamed from: g */
    @Nullable
    public SampleStream f9448g;

    /* renamed from: h */
    @Nullable
    public Format[] f9449h;

    /* renamed from: i */
    public long f9450i;

    /* renamed from: k */
    public boolean f9452k;

    /* renamed from: l */
    public boolean f9453l;

    /* renamed from: c */
    public final FormatHolder f9444c = new FormatHolder();

    /* renamed from: j */
    public long f9451j = Long.MIN_VALUE;

    public BaseRenderer(int i2) {
        this.f9443b = i2;
    }

    /* renamed from: A */
    public final boolean m5650A() {
        if (mo5662h()) {
            return this.f9452k;
        }
        SampleStream sampleStream = this.f9448g;
        Objects.requireNonNull(sampleStream);
        return sampleStream.mo6792b();
    }

    /* renamed from: B */
    public void mo5651B() {
    }

    /* renamed from: C */
    public void mo5652C(boolean z, boolean z2) throws ExoPlaybackException {
    }

    /* renamed from: D */
    public void mo5653D(long j2, boolean z) throws ExoPlaybackException {
    }

    /* renamed from: E */
    public void mo5654E() {
    }

    /* renamed from: F */
    public void mo5655F() throws ExoPlaybackException {
    }

    /* renamed from: G */
    public void mo5656G() {
    }

    /* renamed from: H */
    public void mo5657H(Format[] formatArr, long j2, long j3) throws ExoPlaybackException {
    }

    /* renamed from: I */
    public final int m5658I(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
        SampleStream sampleStream = this.f9448g;
        Objects.requireNonNull(sampleStream);
        int mo6793d = sampleStream.mo6793d(formatHolder, decoderInputBuffer, i2);
        if (mo6793d == -4) {
            if (decoderInputBuffer.m6242j()) {
                this.f9451j = Long.MIN_VALUE;
                return this.f9452k ? -4 : -3;
            }
            long j2 = decoderInputBuffer.f10607f + this.f9450i;
            decoderInputBuffer.f10607f = j2;
            this.f9451j = Math.max(this.f9451j, j2);
        } else if (mo6793d == -5) {
            Format format = formatHolder.f9704b;
            Objects.requireNonNull(format);
            if (format.f9663q != Long.MAX_VALUE) {
                Format.Builder m5829b = format.m5829b();
                m5829b.f9691o = format.f9663q + this.f9450i;
                formatHolder.f9704b = m5829b.m5833a();
            }
        }
        return mo6793d;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: e */
    public final void mo5659e(int i2) {
        this.f9446e = i2;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: f */
    public final void mo5660f() {
        Assertions.m7516d(this.f9447f == 1);
        this.f9444c.m5835a();
        this.f9447f = 0;
        this.f9448g = null;
        this.f9449h = null;
        this.f9452k = false;
        mo5651B();
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    /* renamed from: g */
    public final int mo5661g() {
        return this.f9443b;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final int getState() {
        return this.f9447f;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: h */
    public final boolean mo5662h() {
        return this.f9451j == Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: i */
    public final void mo5663i(Format[] formatArr, SampleStream sampleStream, long j2, long j3) throws ExoPlaybackException {
        Assertions.m7516d(!this.f9452k);
        this.f9448g = sampleStream;
        if (this.f9451j == Long.MIN_VALUE) {
            this.f9451j = j2;
        }
        this.f9449h = formatArr;
        this.f9450i = j3;
        mo5657H(formatArr, j2, j3);
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: j */
    public final void mo5664j() {
        this.f9452k = true;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: k */
    public final RendererCapabilities mo5665k() {
        return this;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: m */
    public /* synthetic */ void mo5666m(float f2, float f3) {
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: n */
    public final void mo5667n(RendererConfiguration rendererConfiguration, Format[] formatArr, SampleStream sampleStream, long j2, boolean z, boolean z2, long j3, long j4) throws ExoPlaybackException {
        Assertions.m7516d(this.f9447f == 0);
        this.f9445d = rendererConfiguration;
        this.f9447f = 1;
        mo5652C(z, z2);
        mo5663i(formatArr, sampleStream, j3, j4);
        mo5653D(j2, z);
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    /* renamed from: o */
    public int mo5668o() throws ExoPlaybackException {
        return 0;
    }

    @Override // com.google.android.exoplayer2.PlayerMessage.Target
    /* renamed from: q */
    public void mo5669q(int i2, @Nullable Object obj) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.Renderer
    @Nullable
    /* renamed from: r */
    public final SampleStream mo5670r() {
        return this.f9448g;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void reset() {
        Assertions.m7516d(this.f9447f == 0);
        this.f9444c.m5835a();
        mo5654E();
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: s */
    public final void mo5671s() throws IOException {
        SampleStream sampleStream = this.f9448g;
        Objects.requireNonNull(sampleStream);
        sampleStream.mo6791a();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void start() throws ExoPlaybackException {
        Assertions.m7516d(this.f9447f == 1);
        this.f9447f = 2;
        mo5655F();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void stop() {
        Assertions.m7516d(this.f9447f == 2);
        this.f9447f = 1;
        mo5656G();
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: t */
    public final long mo5672t() {
        return this.f9451j;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: u */
    public final void mo5673u(long j2) throws ExoPlaybackException {
        this.f9452k = false;
        this.f9451j = j2;
        mo5653D(j2, false);
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: v */
    public final boolean mo5674v() {
        return this.f9452k;
    }

    @Override // com.google.android.exoplayer2.Renderer
    @Nullable
    /* renamed from: w */
    public MediaClock mo5675w() {
        return null;
    }

    /* renamed from: x */
    public final ExoPlaybackException m5676x(Throwable th, @Nullable Format format, int i2) {
        return m5677y(th, format, false, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.exoplayer2.ExoPlaybackException m5677y(java.lang.Throwable r14, @androidx.annotation.Nullable com.google.android.exoplayer2.Format r15, boolean r16, int r17) {
        /*
            r13 = this;
            r1 = r13
            r0 = r15
            r2 = 4
            if (r0 == 0) goto L1d
            boolean r3 = r1.f9453l
            if (r3 != 0) goto L1d
            r3 = 1
            r1.f9453l = r3
            r3 = 0
            int r4 = r13.mo5904a(r15)     // Catch: java.lang.Throwable -> L16 com.google.android.exoplayer2.ExoPlaybackException -> L1b
            r4 = r4 & 7
            r1.f9453l = r3
            goto L1e
        L16:
            r0 = move-exception
            r2 = r0
            r1.f9453l = r3
            throw r2
        L1b:
            r1.f9453l = r3
        L1d:
            r4 = 4
        L1e:
            java.lang.String r7 = r13.getName()
            int r8 = r1.f9446e
            com.google.android.exoplayer2.ExoPlaybackException r12 = new com.google.android.exoplayer2.ExoPlaybackException
            if (r0 != 0) goto L2a
            r10 = 4
            goto L2b
        L2a:
            r10 = r4
        L2b:
            r3 = 1
            r5 = 0
            r2 = r12
            r4 = r14
            r6 = r17
            r9 = r15
            r11 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.BaseRenderer.m5677y(java.lang.Throwable, com.google.android.exoplayer2.Format, boolean, int):com.google.android.exoplayer2.ExoPlaybackException");
    }

    /* renamed from: z */
    public final FormatHolder m5678z() {
        this.f9444c.m5835a();
        return this.f9444c;
    }
}
