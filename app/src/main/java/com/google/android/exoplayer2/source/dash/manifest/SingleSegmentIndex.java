package com.google.android.exoplayer2.source.dash.manifest;

import com.google.android.exoplayer2.source.dash.DashSegmentIndex;

/* loaded from: classes.dex */
final class SingleSegmentIndex implements DashSegmentIndex {

    /* renamed from: a */
    public final RangedUri f13007a;

    public SingleSegmentIndex(RangedUri rangedUri) {
        this.f13007a = rangedUri;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    /* renamed from: a */
    public long mo7014a(long j2) {
        return 0L;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    /* renamed from: b */
    public long mo7015b(long j2, long j3) {
        return j3;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    /* renamed from: c */
    public long mo7016c(long j2, long j3) {
        return 0L;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    /* renamed from: d */
    public long mo7017d(long j2, long j3) {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    /* renamed from: e */
    public RangedUri mo7018e(long j2) {
        return this.f13007a;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    /* renamed from: f */
    public long mo7019f(long j2, long j3) {
        return 0L;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    /* renamed from: g */
    public boolean mo7020g() {
        return true;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    /* renamed from: h */
    public long mo7021h() {
        return 0L;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    /* renamed from: i */
    public long mo7022i(long j2) {
        return 1L;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    /* renamed from: j */
    public long mo7023j(long j2, long j3) {
        return 1L;
    }
}
