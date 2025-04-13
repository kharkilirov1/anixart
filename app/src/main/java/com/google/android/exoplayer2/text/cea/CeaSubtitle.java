package com.google.android.exoplayer2.text.cea;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class CeaSubtitle implements Subtitle {

    /* renamed from: b */
    public final List<Cue> f13604b;

    public CeaSubtitle(List<Cue> list) {
        this.f13604b = list;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    /* renamed from: a */
    public int mo7181a(long j2) {
        return j2 < 0 ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    /* renamed from: b */
    public long mo7182b(int i2) {
        Assertions.m7513a(i2 == 0);
        return 0L;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    /* renamed from: c */
    public List<Cue> mo7183c(long j2) {
        return j2 >= 0 ? this.f13604b : Collections.emptyList();
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    /* renamed from: d */
    public int mo7184d() {
        return 1;
    }
}
