package com.google.android.exoplayer2.text.tx3g;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class Tx3gSubtitle implements Subtitle {

    /* renamed from: c */
    public static final Tx3gSubtitle f13796c = new Tx3gSubtitle();

    /* renamed from: b */
    public final List<Cue> f13797b;

    public Tx3gSubtitle(Cue cue) {
        this.f13797b = Collections.singletonList(cue);
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
        return j2 >= 0 ? this.f13797b : Collections.emptyList();
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    /* renamed from: d */
    public int mo7184d() {
        return 1;
    }

    public Tx3gSubtitle() {
        this.f13797b = Collections.emptyList();
    }
}
