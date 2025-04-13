package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.audio.AudioSink;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class ForwardingAudioSink implements AudioSink {
    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: a */
    public boolean mo6122a(Format format) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: b */
    public void mo6123b() throws AudioSink.WriteException {
        throw null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: c */
    public boolean mo6124c() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: d */
    public void mo6125d(PlaybackParameters playbackParameters) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: e */
    public boolean mo6126e() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: f */
    public void mo6127f(int i2) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void flush() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: g */
    public long mo6128g(boolean z) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public PlaybackParameters getPlaybackParameters() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: h */
    public void mo6129h() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: i */
    public void mo6130i(AudioAttributes audioAttributes) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: j */
    public void mo6131j() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: k */
    public void mo6132k() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: l */
    public boolean mo6133l(ByteBuffer byteBuffer, long j2, int i2) throws AudioSink.InitializationException, AudioSink.WriteException {
        throw null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: m */
    public void mo6134m(AudioSink.Listener listener) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: n */
    public int mo6135n(Format format) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: o */
    public void mo6136o(Format format, int i2, @Nullable int[] iArr) throws AudioSink.ConfigurationException {
        throw null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: p */
    public void mo6137p(boolean z) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void pause() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void play() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: q */
    public void mo6138q(AuxEffectInfo auxEffectInfo) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void reset() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setVolume(float f2) {
        throw null;
    }
}
