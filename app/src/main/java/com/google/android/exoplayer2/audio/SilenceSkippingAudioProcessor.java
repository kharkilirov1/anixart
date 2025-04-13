package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class SilenceSkippingAudioProcessor extends BaseAudioProcessor {

    /* renamed from: i */
    public final long f10495i = 150000;

    /* renamed from: j */
    public final long f10496j = 20000;

    /* renamed from: k */
    public final short f10497k = 1024;

    /* renamed from: l */
    public int f10498l;

    /* renamed from: m */
    public boolean f10499m;

    /* renamed from: n */
    public byte[] f10500n;

    /* renamed from: o */
    public byte[] f10501o;

    /* renamed from: p */
    public int f10502p;

    /* renamed from: q */
    public int f10503q;

    /* renamed from: r */
    public int f10504r;

    /* renamed from: s */
    public boolean f10505s;

    /* renamed from: t */
    public long f10506t;

    public SilenceSkippingAudioProcessor() {
        byte[] bArr = Util.f14741f;
        this.f10500n = bArr;
        this.f10501o = bArr;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor, com.google.android.exoplayer2.audio.AudioProcessor
    /* renamed from: a */
    public boolean mo6112a() {
        return this.f10499m;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* renamed from: d */
    public void mo6115d(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.f10362g.hasRemaining()) {
            int i2 = this.f10502p;
            if (i2 == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f10500n.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    limit2 -= 2;
                    if (limit2 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else if (Math.abs((int) byteBuffer.getShort(limit2)) > this.f10497k) {
                        int i3 = this.f10498l;
                        position = ((limit2 / i3) * i3) + i3;
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f10502p = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    m6161k(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f10505s = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i2 == 1) {
                int limit3 = byteBuffer.limit();
                int m6228l = m6228l(byteBuffer);
                int position2 = m6228l - byteBuffer.position();
                byte[] bArr = this.f10500n;
                int length = bArr.length;
                int i4 = this.f10503q;
                int i5 = length - i4;
                if (m6228l >= limit3 || position2 >= i5) {
                    int min = Math.min(position2, i5);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f10500n, this.f10503q, min);
                    int i6 = this.f10503q + min;
                    this.f10503q = i6;
                    byte[] bArr2 = this.f10500n;
                    if (i6 == bArr2.length) {
                        if (this.f10505s) {
                            m6229m(bArr2, this.f10504r);
                            this.f10506t += (this.f10503q - (this.f10504r * 2)) / this.f10498l;
                        } else {
                            this.f10506t += (i6 - this.f10504r) / this.f10498l;
                        }
                        m6230n(byteBuffer, this.f10500n, this.f10503q);
                        this.f10503q = 0;
                        this.f10502p = 2;
                    }
                    byteBuffer.limit(limit3);
                } else {
                    m6229m(bArr, i4);
                    this.f10503q = 0;
                    this.f10502p = 0;
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException();
                }
                int limit4 = byteBuffer.limit();
                int m6228l2 = m6228l(byteBuffer);
                byteBuffer.limit(m6228l2);
                this.f10506t += byteBuffer.remaining() / this.f10498l;
                m6230n(byteBuffer, this.f10501o, this.f10504r);
                if (m6228l2 < limit4) {
                    m6229m(this.f10501o, this.f10504r);
                    this.f10502p = 0;
                    byteBuffer.limit(limit4);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    /* renamed from: g */
    public AudioProcessor.AudioFormat mo6157g(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.f10303c == 2) {
            return this.f10499m ? audioFormat : AudioProcessor.AudioFormat.f10300e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    /* renamed from: h */
    public void mo6158h() {
        if (this.f10499m) {
            AudioProcessor.AudioFormat audioFormat = this.f10357b;
            int i2 = audioFormat.f10304d;
            this.f10498l = i2;
            long j2 = this.f10495i;
            long j3 = audioFormat.f10301a;
            int i3 = ((int) ((j2 * j3) / 1000000)) * i2;
            if (this.f10500n.length != i3) {
                this.f10500n = new byte[i3];
            }
            int i4 = ((int) ((this.f10496j * j3) / 1000000)) * i2;
            this.f10504r = i4;
            if (this.f10501o.length != i4) {
                this.f10501o = new byte[i4];
            }
        }
        this.f10502p = 0;
        this.f10506t = 0L;
        this.f10503q = 0;
        this.f10505s = false;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    /* renamed from: i */
    public void mo6159i() {
        int i2 = this.f10503q;
        if (i2 > 0) {
            m6229m(this.f10500n, i2);
        }
        if (this.f10505s) {
            return;
        }
        this.f10506t += this.f10504r / this.f10498l;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    /* renamed from: j */
    public void mo6160j() {
        this.f10499m = false;
        this.f10504r = 0;
        byte[] bArr = Util.f14741f;
        this.f10500n = bArr;
        this.f10501o = bArr;
    }

    /* renamed from: l */
    public final int m6228l(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f10497k) {
                int i2 = this.f10498l;
                return (position / i2) * i2;
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: m */
    public final void m6229m(byte[] bArr, int i2) {
        m6161k(i2).put(bArr, 0, i2).flip();
        if (i2 > 0) {
            this.f10505s = true;
        }
    }

    /* renamed from: n */
    public final void m6230n(ByteBuffer byteBuffer, byte[] bArr, int i2) {
        int min = Math.min(byteBuffer.remaining(), this.f10504r);
        int i3 = this.f10504r - min;
        System.arraycopy(bArr, i2 - i3, this.f10501o, 0, i3);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f10501o, i3, min);
    }
}
