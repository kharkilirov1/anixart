package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
public final class SonicAudioProcessor implements AudioProcessor {

    /* renamed from: b */
    public int f10529b;

    /* renamed from: c */
    public float f10530c = 1.0f;

    /* renamed from: d */
    public float f10531d = 1.0f;

    /* renamed from: e */
    public AudioProcessor.AudioFormat f10532e;

    /* renamed from: f */
    public AudioProcessor.AudioFormat f10533f;

    /* renamed from: g */
    public AudioProcessor.AudioFormat f10534g;

    /* renamed from: h */
    public AudioProcessor.AudioFormat f10535h;

    /* renamed from: i */
    public boolean f10536i;

    /* renamed from: j */
    @Nullable
    public Sonic f10537j;

    /* renamed from: k */
    public ByteBuffer f10538k;

    /* renamed from: l */
    public ShortBuffer f10539l;

    /* renamed from: m */
    public ByteBuffer f10540m;

    /* renamed from: n */
    public long f10541n;

    /* renamed from: o */
    public long f10542o;

    /* renamed from: p */
    public boolean f10543p;

    public SonicAudioProcessor() {
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.f10300e;
        this.f10532e = audioFormat;
        this.f10533f = audioFormat;
        this.f10534g = audioFormat;
        this.f10535h = audioFormat;
        ByteBuffer byteBuffer = AudioProcessor.f10299a;
        this.f10538k = byteBuffer;
        this.f10539l = byteBuffer.asShortBuffer();
        this.f10540m = byteBuffer;
        this.f10529b = -1;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* renamed from: a */
    public boolean mo6112a() {
        return this.f10533f.f10301a != -1 && (Math.abs(this.f10530c - 1.0f) >= 1.0E-4f || Math.abs(this.f10531d - 1.0f) >= 1.0E-4f || this.f10533f.f10301a != this.f10532e.f10301a);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* renamed from: b */
    public ByteBuffer mo6113b() {
        int i2;
        Sonic sonic = this.f10537j;
        if (sonic != null && (i2 = sonic.f10519m * sonic.f10508b * 2) > 0) {
            if (this.f10538k.capacity() < i2) {
                ByteBuffer order = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
                this.f10538k = order;
                this.f10539l = order.asShortBuffer();
            } else {
                this.f10538k.clear();
                this.f10539l.clear();
            }
            ShortBuffer shortBuffer = this.f10539l;
            int min = Math.min(shortBuffer.remaining() / sonic.f10508b, sonic.f10519m);
            shortBuffer.put(sonic.f10518l, 0, sonic.f10508b * min);
            int i3 = sonic.f10519m - min;
            sonic.f10519m = i3;
            short[] sArr = sonic.f10518l;
            int i4 = sonic.f10508b;
            System.arraycopy(sArr, min * i4, sArr, 0, i3 * i4);
            this.f10542o += i2;
            this.f10538k.limit(i2);
            this.f10540m = this.f10538k;
        }
        ByteBuffer byteBuffer = this.f10540m;
        this.f10540m = AudioProcessor.f10299a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* renamed from: c */
    public boolean mo6114c() {
        Sonic sonic;
        return this.f10543p && ((sonic = this.f10537j) == null || (sonic.f10519m * sonic.f10508b) * 2 == 0);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* renamed from: d */
    public void mo6115d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            Sonic sonic = this.f10537j;
            Objects.requireNonNull(sonic);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f10541n += remaining;
            int remaining2 = asShortBuffer.remaining();
            int i2 = sonic.f10508b;
            int i3 = remaining2 / i2;
            short[] m6234c = sonic.m6234c(sonic.f10516j, sonic.f10517k, i3);
            sonic.f10516j = m6234c;
            asShortBuffer.get(m6234c, sonic.f10517k * sonic.f10508b, ((i2 * i3) * 2) / 2);
            sonic.f10517k += i3;
            sonic.m6236f();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* renamed from: e */
    public AudioProcessor.AudioFormat mo6116e(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.f10303c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        int i2 = this.f10529b;
        if (i2 == -1) {
            i2 = audioFormat.f10301a;
        }
        this.f10532e = audioFormat;
        AudioProcessor.AudioFormat audioFormat2 = new AudioProcessor.AudioFormat(i2, audioFormat.f10302b, 2);
        this.f10533f = audioFormat2;
        this.f10536i = true;
        return audioFormat2;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* renamed from: f */
    public void mo6117f() {
        int i2;
        Sonic sonic = this.f10537j;
        if (sonic != null) {
            int i3 = sonic.f10517k;
            float f2 = sonic.f10509c;
            float f3 = sonic.f10510d;
            int i4 = sonic.f10519m + ((int) ((((i3 / (f2 / f3)) + sonic.f10521o) / (sonic.f10511e * f3)) + 0.5f));
            sonic.f10516j = sonic.m6234c(sonic.f10516j, i3, (sonic.f10514h * 2) + i3);
            int i5 = 0;
            while (true) {
                i2 = sonic.f10514h * 2;
                int i6 = sonic.f10508b;
                if (i5 >= i2 * i6) {
                    break;
                }
                sonic.f10516j[(i6 * i3) + i5] = 0;
                i5++;
            }
            sonic.f10517k = i2 + sonic.f10517k;
            sonic.m6236f();
            if (sonic.f10519m > i4) {
                sonic.f10519m = i4;
            }
            sonic.f10517k = 0;
            sonic.f10524r = 0;
            sonic.f10521o = 0;
        }
        this.f10543p = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void flush() {
        if (mo6112a()) {
            AudioProcessor.AudioFormat audioFormat = this.f10532e;
            this.f10534g = audioFormat;
            AudioProcessor.AudioFormat audioFormat2 = this.f10533f;
            this.f10535h = audioFormat2;
            if (this.f10536i) {
                this.f10537j = new Sonic(audioFormat.f10301a, audioFormat.f10302b, this.f10530c, this.f10531d, audioFormat2.f10301a);
            } else {
                Sonic sonic = this.f10537j;
                if (sonic != null) {
                    sonic.f10517k = 0;
                    sonic.f10519m = 0;
                    sonic.f10521o = 0;
                    sonic.f10522p = 0;
                    sonic.f10523q = 0;
                    sonic.f10524r = 0;
                    sonic.f10525s = 0;
                    sonic.f10526t = 0;
                    sonic.f10527u = 0;
                    sonic.f10528v = 0;
                }
            }
        }
        this.f10540m = AudioProcessor.f10299a;
        this.f10541n = 0L;
        this.f10542o = 0L;
        this.f10543p = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void reset() {
        this.f10530c = 1.0f;
        this.f10531d = 1.0f;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.f10300e;
        this.f10532e = audioFormat;
        this.f10533f = audioFormat;
        this.f10534g = audioFormat;
        this.f10535h = audioFormat;
        ByteBuffer byteBuffer = AudioProcessor.f10299a;
        this.f10538k = byteBuffer;
        this.f10539l = byteBuffer.asShortBuffer();
        this.f10540m = byteBuffer;
        this.f10529b = -1;
        this.f10536i = false;
        this.f10537j = null;
        this.f10541n = 0L;
        this.f10542o = 0L;
        this.f10543p = false;
    }
}
