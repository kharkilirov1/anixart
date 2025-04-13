package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class TrimmingAudioProcessor extends BaseAudioProcessor {

    /* renamed from: i */
    public int f10544i;

    /* renamed from: j */
    public int f10545j;

    /* renamed from: k */
    public boolean f10546k;

    /* renamed from: l */
    public int f10547l;

    /* renamed from: m */
    public byte[] f10548m = Util.f14741f;

    /* renamed from: n */
    public int f10549n;

    /* renamed from: o */
    public long f10550o;

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor, com.google.android.exoplayer2.audio.AudioProcessor
    /* renamed from: b */
    public ByteBuffer mo6113b() {
        int i2;
        if (super.mo6114c() && (i2 = this.f10549n) > 0) {
            m6161k(i2).put(this.f10548m, 0, this.f10549n).flip();
            this.f10549n = 0;
        }
        return super.mo6113b();
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor, com.google.android.exoplayer2.audio.AudioProcessor
    /* renamed from: c */
    public boolean mo6114c() {
        return super.mo6114c() && this.f10549n == 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* renamed from: d */
    public void mo6115d(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        if (i2 == 0) {
            return;
        }
        int min = Math.min(i2, this.f10547l);
        this.f10550o += min / this.f10357b.f10304d;
        this.f10547l -= min;
        byteBuffer.position(position + min);
        if (this.f10547l > 0) {
            return;
        }
        int i3 = i2 - min;
        int length = (this.f10549n + i3) - this.f10548m.length;
        ByteBuffer m6161k = m6161k(length);
        int m7741j = Util.m7741j(length, 0, this.f10549n);
        m6161k.put(this.f10548m, 0, m7741j);
        int m7741j2 = Util.m7741j(length - m7741j, 0, i3);
        byteBuffer.limit(byteBuffer.position() + m7741j2);
        m6161k.put(byteBuffer);
        byteBuffer.limit(limit);
        int i4 = i3 - m7741j2;
        int i5 = this.f10549n - m7741j;
        this.f10549n = i5;
        byte[] bArr = this.f10548m;
        System.arraycopy(bArr, m7741j, bArr, 0, i5);
        byteBuffer.get(this.f10548m, this.f10549n, i4);
        this.f10549n += i4;
        m6161k.flip();
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    /* renamed from: g */
    public AudioProcessor.AudioFormat mo6157g(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.f10303c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        this.f10546k = true;
        return (this.f10544i == 0 && this.f10545j == 0) ? AudioProcessor.AudioFormat.f10300e : audioFormat;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    /* renamed from: h */
    public void mo6158h() {
        if (this.f10546k) {
            this.f10546k = false;
            int i2 = this.f10545j;
            int i3 = this.f10357b.f10304d;
            this.f10548m = new byte[i2 * i3];
            this.f10547l = this.f10544i * i3;
        }
        this.f10549n = 0;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    /* renamed from: i */
    public void mo6159i() {
        if (this.f10546k) {
            if (this.f10549n > 0) {
                this.f10550o += r0 / this.f10357b.f10304d;
            }
            this.f10549n = 0;
        }
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    /* renamed from: j */
    public void mo6160j() {
        this.f10548m = Util.f14741f;
    }
}
