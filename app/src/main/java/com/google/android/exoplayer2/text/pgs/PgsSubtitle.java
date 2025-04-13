package com.google.android.exoplayer2.text.pgs;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import java.util.List;

/* loaded from: classes.dex */
final class PgsSubtitle implements Subtitle {

    /* renamed from: b */
    public final List<Cue> f13672b;

    public PgsSubtitle(List<Cue> list) {
        this.f13672b = list;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    /* renamed from: a */
    public int mo7181a(long j2) {
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    /* renamed from: b */
    public long mo7182b(int i2) {
        return 0L;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    /* renamed from: c */
    public List<Cue> mo7183c(long j2) {
        return this.f13672b;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    /* renamed from: d */
    public int mo7184d() {
        return 1;
    }
}
