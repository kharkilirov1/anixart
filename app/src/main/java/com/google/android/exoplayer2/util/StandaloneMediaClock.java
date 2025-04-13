package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.PlaybackParameters;

/* loaded from: classes.dex */
public final class StandaloneMediaClock implements MediaClock {

    /* renamed from: b */
    public final Clock f14720b;

    /* renamed from: c */
    public boolean f14721c;

    /* renamed from: d */
    public long f14722d;

    /* renamed from: e */
    public long f14723e;

    /* renamed from: f */
    public PlaybackParameters f14724f = PlaybackParameters.f9948e;

    public StandaloneMediaClock(Clock clock) {
        this.f14720b = clock;
    }

    /* renamed from: a */
    public void m7681a(long j2) {
        this.f14722d = j2;
        if (this.f14721c) {
            this.f14723e = this.f14720b.mo7527a();
        }
    }

    /* renamed from: b */
    public void m7682b() {
        if (this.f14721c) {
            return;
        }
        this.f14723e = this.f14720b.mo7527a();
        this.f14721c = true;
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    /* renamed from: d */
    public void mo5697d(PlaybackParameters playbackParameters) {
        if (this.f14721c) {
            m7681a(mo5698l());
        }
        this.f14724f = playbackParameters;
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public PlaybackParameters getPlaybackParameters() {
        return this.f14724f;
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    /* renamed from: l */
    public long mo5698l() {
        long j2 = this.f14722d;
        if (!this.f14721c) {
            return j2;
        }
        long mo7527a = this.f14720b.mo7527a() - this.f14723e;
        return this.f14724f.f9949b == 1.0f ? j2 + Util.m7717P(mo7527a) : j2 + (mo7527a * r4.f9951d);
    }
}
