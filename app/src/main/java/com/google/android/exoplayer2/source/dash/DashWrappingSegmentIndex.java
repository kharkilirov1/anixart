package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
public final class DashWrappingSegmentIndex implements DashSegmentIndex {

    /* renamed from: a */
    public final ChunkIndex f12864a;

    /* renamed from: b */
    public final long f12865b;

    public DashWrappingSegmentIndex(ChunkIndex chunkIndex, long j2) {
        this.f12864a = chunkIndex;
        this.f12865b = j2;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    /* renamed from: a */
    public long mo7014a(long j2) {
        return this.f12864a.f10822e[(int) j2] - this.f12865b;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    /* renamed from: b */
    public long mo7015b(long j2, long j3) {
        return this.f12864a.f10821d[(int) j2];
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
        return new RangedUri(null, this.f12864a.f10820c[(int) j2], r0.f10819b[r9]);
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    /* renamed from: f */
    public long mo7019f(long j2, long j3) {
        ChunkIndex chunkIndex = this.f12864a;
        return Util.m7737f(chunkIndex.f10822e, j2 + this.f12865b, true, true);
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
        return this.f12864a.f10818a;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    /* renamed from: j */
    public long mo7023j(long j2, long j3) {
        return this.f12864a.f10818a;
    }
}
