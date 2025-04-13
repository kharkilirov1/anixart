package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class TeeAudioProcessor extends BaseAudioProcessor {

    public interface AudioBufferSink {
    }

    public static final class WavFileAudioBufferSink implements AudioBufferSink {
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* renamed from: d */
    public void mo6115d(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() == 0) {
            return;
        }
        byteBuffer.asReadOnlyBuffer();
        throw null;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    /* renamed from: g */
    public AudioProcessor.AudioFormat mo6157g(AudioProcessor.AudioFormat audioFormat) {
        return audioFormat;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    /* renamed from: h */
    public void mo6158h() {
        m6237l();
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    /* renamed from: i */
    public void mo6159i() {
        m6237l();
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    /* renamed from: j */
    public void mo6160j() {
        m6237l();
    }

    /* renamed from: l */
    public final void m6237l() {
        if (mo6112a()) {
            AudioProcessor.AudioFormat audioFormat = this.f10357b;
            int i2 = audioFormat.f10301a;
            int i3 = audioFormat.f10302b;
            int i4 = audioFormat.f10303c;
            throw null;
        }
    }
}
