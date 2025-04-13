package com.google.android.exoplayer2.audio;

import androidx.annotation.CallSuper;
import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class BaseAudioProcessor implements AudioProcessor {

    /* renamed from: b */
    public AudioProcessor.AudioFormat f10357b;

    /* renamed from: c */
    public AudioProcessor.AudioFormat f10358c;

    /* renamed from: d */
    public AudioProcessor.AudioFormat f10359d;

    /* renamed from: e */
    public AudioProcessor.AudioFormat f10360e;

    /* renamed from: f */
    public ByteBuffer f10361f;

    /* renamed from: g */
    public ByteBuffer f10362g;

    /* renamed from: h */
    public boolean f10363h;

    public BaseAudioProcessor() {
        ByteBuffer byteBuffer = AudioProcessor.f10299a;
        this.f10361f = byteBuffer;
        this.f10362g = byteBuffer;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.f10300e;
        this.f10359d = audioFormat;
        this.f10360e = audioFormat;
        this.f10357b = audioFormat;
        this.f10358c = audioFormat;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* renamed from: a */
    public boolean mo6112a() {
        return this.f10360e != AudioProcessor.AudioFormat.f10300e;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    @CallSuper
    /* renamed from: b */
    public ByteBuffer mo6113b() {
        ByteBuffer byteBuffer = this.f10362g;
        this.f10362g = AudioProcessor.f10299a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    @CallSuper
    /* renamed from: c */
    public boolean mo6114c() {
        return this.f10363h && this.f10362g == AudioProcessor.f10299a;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* renamed from: e */
    public final AudioProcessor.AudioFormat mo6116e(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        this.f10359d = audioFormat;
        this.f10360e = mo6157g(audioFormat);
        return mo6112a() ? this.f10360e : AudioProcessor.AudioFormat.f10300e;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* renamed from: f */
    public final void mo6117f() {
        this.f10363h = true;
        mo6159i();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        this.f10362g = AudioProcessor.f10299a;
        this.f10363h = false;
        this.f10357b = this.f10359d;
        this.f10358c = this.f10360e;
        mo6158h();
    }

    /* renamed from: g */
    public AudioProcessor.AudioFormat mo6157g(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        return AudioProcessor.AudioFormat.f10300e;
    }

    /* renamed from: h */
    public void mo6158h() {
    }

    /* renamed from: i */
    public void mo6159i() {
    }

    /* renamed from: j */
    public void mo6160j() {
    }

    /* renamed from: k */
    public final ByteBuffer m6161k(int i2) {
        if (this.f10361f.capacity() < i2) {
            this.f10361f = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.f10361f.clear();
        }
        ByteBuffer byteBuffer = this.f10361f;
        this.f10362g = byteBuffer;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void reset() {
        flush();
        this.f10361f = AudioProcessor.f10299a;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.f10300e;
        this.f10359d = audioFormat;
        this.f10360e = audioFormat;
        this.f10357b = audioFormat;
        this.f10358c = audioFormat;
        mo6160j();
    }
}
