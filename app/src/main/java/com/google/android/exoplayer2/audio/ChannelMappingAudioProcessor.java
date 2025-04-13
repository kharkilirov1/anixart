package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
final class ChannelMappingAudioProcessor extends BaseAudioProcessor {

    /* renamed from: i */
    @Nullable
    public int[] f10364i;

    /* renamed from: j */
    @Nullable
    public int[] f10365j;

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* renamed from: d */
    public void mo6115d(ByteBuffer byteBuffer) {
        int[] iArr = this.f10365j;
        Objects.requireNonNull(iArr);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer m6161k = m6161k(((limit - position) / this.f10357b.f10304d) * this.f10358c.f10304d);
        while (position < limit) {
            for (int i2 : iArr) {
                m6161k.putShort(byteBuffer.getShort((i2 * 2) + position));
            }
            position += this.f10357b.f10304d;
        }
        byteBuffer.position(limit);
        m6161k.flip();
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    /* renamed from: g */
    public AudioProcessor.AudioFormat mo6157g(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.f10364i;
        if (iArr == null) {
            return AudioProcessor.AudioFormat.f10300e;
        }
        if (audioFormat.f10303c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        boolean z = audioFormat.f10302b != iArr.length;
        int i2 = 0;
        while (i2 < iArr.length) {
            int i3 = iArr[i2];
            if (i3 >= audioFormat.f10302b) {
                throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
            }
            z |= i3 != i2;
            i2++;
        }
        return z ? new AudioProcessor.AudioFormat(audioFormat.f10301a, iArr.length, 2) : AudioProcessor.AudioFormat.f10300e;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    /* renamed from: h */
    public void mo6158h() {
        this.f10365j = this.f10364i;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    /* renamed from: j */
    public void mo6160j() {
        this.f10365j = null;
        this.f10364i = null;
    }
}
