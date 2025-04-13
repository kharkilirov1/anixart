package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.impl.sa0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class e51 implements sa0 {

    /* renamed from: a */
    private final MediaCodec f49813a;

    /* renamed from: b */
    @Nullable
    private ByteBuffer[] f49814b;

    /* renamed from: c */
    @Nullable
    private ByteBuffer[] f49815c;

    /* renamed from: com.yandex.mobile.ads.impl.e51$a */
    public static class C5006a implements sa0.InterfaceC5735b {
        /* renamed from: b */
        public static MediaCodec m24030b(sa0.C5734a c5734a) throws IOException {
            Objects.requireNonNull(c5734a.f54544a);
            String str = c5734a.f54544a.f56065a;
            s61.m28074a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            s61.m28073a();
            return createByCodecName;
        }

        @Override // com.yandex.mobile.ads.impl.sa0.InterfaceC5735b
        /* renamed from: a */
        public final sa0 mo24031a(sa0.C5734a c5734a) throws IOException {
            MediaCodec mediaCodec = null;
            try {
                mediaCodec = m24030b(c5734a);
                s61.m28074a("configureCodec");
                mediaCodec.configure(c5734a.f54545b, c5734a.f54547d, c5734a.f54548e, 0);
                s61.m28073a();
                s61.m28074a("startCodec");
                mediaCodec.start();
                s61.m28073a();
                return new e51(mediaCodec, 0);
            } catch (IOException | RuntimeException e2) {
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e2;
            }
        }
    }

    public /* synthetic */ e51(MediaCodec mediaCodec, int i2) {
        this(mediaCodec);
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    /* renamed from: a */
    public final int mo24016a(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f49813a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && s91.f54530a < 21) {
                this.f49815c = this.f49813a.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    /* renamed from: a */
    public final void mo24017a() {
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    /* renamed from: b */
    public final MediaFormat mo24026b() {
        return this.f49813a.getOutputFormat();
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    /* renamed from: c */
    public final int mo24028c() {
        return this.f49813a.dequeueInputBuffer(0L);
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    public final void flush() {
        this.f49813a.flush();
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    public final void release() {
        this.f49814b = null;
        this.f49815c = null;
        this.f49813a.release();
    }

    private e51(MediaCodec mediaCodec) {
        this.f49813a = mediaCodec;
        if (s91.f54530a < 21) {
            this.f49814b = mediaCodec.getInputBuffers();
            this.f49815c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    @Nullable
    /* renamed from: b */
    public final ByteBuffer mo24027b(int i2) {
        return s91.f54530a >= 21 ? this.f49813a.getInputBuffer(i2) : this.f49814b[i2];
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    @Nullable
    /* renamed from: c */
    public final ByteBuffer mo24029c(int i2) {
        return s91.f54530a >= 21 ? this.f49813a.getOutputBuffer(i2) : this.f49815c[i2];
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    /* renamed from: a */
    public final void mo24019a(int i2, int i3, long j2, int i4) {
        this.f49813a.queueInputBuffer(i2, 0, i3, j2, i4);
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    /* renamed from: a */
    public final void mo24021a(int i2, C5695rl c5695rl, long j2) {
        this.f49813a.queueSecureInputBuffer(i2, 0, c5695rl.m27943a(), j2, 0);
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    /* renamed from: a */
    public final void mo24025a(boolean z, int i2) {
        this.f49813a.releaseOutputBuffer(i2, z);
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    @RequiresApi
    /* renamed from: a */
    public final void mo24020a(int i2, long j2) {
        this.f49813a.releaseOutputBuffer(i2, j2);
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    @RequiresApi
    /* renamed from: a */
    public final void mo24024a(sa0.InterfaceC5736c interfaceC5736c, Handler handler) {
        this.f49813a.setOnFrameRenderedListener(new oo1(this, interfaceC5736c, 1), handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m24015a(sa0.InterfaceC5736c interfaceC5736c, MediaCodec mediaCodec, long j2, long j3) {
        interfaceC5736c.mo24090a(j2);
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    @RequiresApi
    /* renamed from: a */
    public final void mo24023a(Surface surface) {
        this.f49813a.setOutputSurface(surface);
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    @RequiresApi
    /* renamed from: a */
    public final void mo24022a(Bundle bundle) {
        this.f49813a.setParameters(bundle);
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    /* renamed from: a */
    public final void mo24018a(int i2) {
        this.f49813a.setVideoScalingMode(i2);
    }
}
