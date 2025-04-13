package com.google.android.exoplayer2.text;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderOutputBuffer;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class SubtitleOutputBuffer extends DecoderOutputBuffer implements Subtitle {

    /* renamed from: e */
    @Nullable
    public Subtitle f13494e;

    /* renamed from: f */
    public long f13495f;

    @Override // com.google.android.exoplayer2.text.Subtitle
    /* renamed from: a */
    public int mo7181a(long j2) {
        Subtitle subtitle = this.f13494e;
        Objects.requireNonNull(subtitle);
        return subtitle.mo7181a(j2 - this.f13495f);
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    /* renamed from: b */
    public long mo7182b(int i2) {
        Subtitle subtitle = this.f13494e;
        Objects.requireNonNull(subtitle);
        return subtitle.mo7182b(i2) + this.f13495f;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    /* renamed from: c */
    public List<Cue> mo7183c(long j2) {
        Subtitle subtitle = this.f13494e;
        Objects.requireNonNull(subtitle);
        return subtitle.mo7183c(j2 - this.f13495f);
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    /* renamed from: d */
    public int mo7184d() {
        Subtitle subtitle = this.f13494e;
        Objects.requireNonNull(subtitle);
        return subtitle.mo7184d();
    }

    /* renamed from: m */
    public void m7189m() {
        this.f10580b = 0;
        this.f13494e = null;
    }

    /* renamed from: n */
    public void m7190n(long j2, Subtitle subtitle, long j3) {
        this.f10611c = j2;
        this.f13494e = subtitle;
        if (j3 != Long.MAX_VALUE) {
            j2 = j3;
        }
        this.f13495f = j2;
    }
}
