package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MediaClock;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class NoSampleRenderer implements Renderer, RendererCapabilities {

    /* renamed from: b */
    public int f9919b;

    /* renamed from: c */
    @Nullable
    public SampleStream f9920c;

    /* renamed from: d */
    public boolean f9921d;

    @Override // com.google.android.exoplayer2.RendererCapabilities
    /* renamed from: a */
    public int mo5904a(Format format) throws ExoPlaybackException {
        return 0;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: b */
    public boolean mo5905b() {
        return true;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: c */
    public boolean mo5906c() {
        return true;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: e */
    public final void mo5659e(int i2) {
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: f */
    public final void mo5660f() {
        Assertions.m7516d(this.f9919b == 1);
        this.f9919b = 0;
        this.f9920c = null;
        this.f9921d = false;
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    /* renamed from: g */
    public final int mo5661g() {
        return -2;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final int getState() {
        return this.f9919b;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: h */
    public final boolean mo5662h() {
        return true;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: i */
    public final void mo5663i(Format[] formatArr, SampleStream sampleStream, long j2, long j3) throws ExoPlaybackException {
        Assertions.m7516d(!this.f9921d);
        this.f9920c = sampleStream;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: j */
    public final void mo5664j() {
        this.f9921d = true;
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
        Assertions.m7516d(this.f9919b == 0);
        this.f9919b = 1;
        Assertions.m7516d(!this.f9921d);
        this.f9920c = sampleStream;
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
        return this.f9920c;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void reset() {
        Assertions.m7516d(this.f9919b == 0);
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: s */
    public final void mo5671s() throws IOException {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void start() throws ExoPlaybackException {
        Assertions.m7516d(this.f9919b == 1);
        this.f9919b = 2;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void stop() {
        Assertions.m7516d(this.f9919b == 2);
        this.f9919b = 1;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: t */
    public long mo5672t() {
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: u */
    public final void mo5673u(long j2) throws ExoPlaybackException {
        this.f9921d = false;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: v */
    public final boolean mo5674v() {
        return this.f9921d;
    }

    @Override // com.google.android.exoplayer2.Renderer
    @Nullable
    /* renamed from: w */
    public MediaClock mo5675w() {
        return null;
    }
}
