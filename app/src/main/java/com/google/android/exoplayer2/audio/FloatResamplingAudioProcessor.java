package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class FloatResamplingAudioProcessor extends BaseAudioProcessor {

    /* renamed from: i */
    public static final int f10468i = Float.floatToIntBits(Float.NaN);

    /* renamed from: l */
    public static void m6203l(int i2, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i2 * 4.656612875245797E-10d));
        if (floatToIntBits == f10468i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* renamed from: d */
    public void mo6115d(ByteBuffer byteBuffer) {
        ByteBuffer m6161k;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.f10357b.f10303c;
        if (i3 == 536870912) {
            m6161k = m6161k((i2 / 3) * 4);
            while (position < limit) {
                m6203l(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), m6161k);
                position += 3;
            }
        } else {
            if (i3 != 805306368) {
                throw new IllegalStateException();
            }
            m6161k = m6161k(i2);
            while (position < limit) {
                m6203l((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), m6161k);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        m6161k.flip();
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    /* renamed from: g */
    public AudioProcessor.AudioFormat mo6157g(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int i2 = audioFormat.f10303c;
        if (Util.m7712K(i2)) {
            return i2 != 4 ? new AudioProcessor.AudioFormat(audioFormat.f10301a, audioFormat.f10302b, 4) : AudioProcessor.AudioFormat.f10300e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }
}
