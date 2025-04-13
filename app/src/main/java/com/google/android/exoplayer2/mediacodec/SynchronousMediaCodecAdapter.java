package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
public class SynchronousMediaCodecAdapter implements MediaCodecAdapter {

    /* renamed from: a */
    public final MediaCodec f11970a;

    /* renamed from: b */
    @Nullable
    public final Surface f11971b;

    /* renamed from: c */
    @Nullable
    public ByteBuffer[] f11972c;

    /* renamed from: d */
    @Nullable
    public ByteBuffer[] f11973d;

    @RequiresApi
    public static final class Api18 {
        @DoNotInline
        /* renamed from: a */
        public static Surface m6693a(MediaCodec mediaCodec) {
            return mediaCodec.createInputSurface();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m6694b(MediaCodec mediaCodec) {
            mediaCodec.signalEndOfInputStream();
        }
    }

    public static class Factory implements MediaCodecAdapter.Factory {
        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory
        /* renamed from: a */
        public MediaCodecAdapter mo6621a(MediaCodecAdapter.Configuration configuration) throws IOException {
            MediaCodec mediaCodec;
            Surface surface;
            Surface surface2 = null;
            try {
                mediaCodec = m6695b(configuration);
                try {
                    TraceUtil.m7696a("configureCodec");
                    mediaCodec.configure(configuration.f11874b, configuration.f11876d, configuration.f11877e, configuration.f11878f);
                    TraceUtil.m7697b();
                    if (!configuration.f11879g) {
                        surface = null;
                    } else {
                        if (Util.f14736a < 18) {
                            throw new IllegalStateException("Encoding from a surface is only supported on API 18 and up.");
                        }
                        surface = Api18.m6693a(mediaCodec);
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (RuntimeException e3) {
                    e = e3;
                }
                try {
                    TraceUtil.m7696a("startCodec");
                    mediaCodec.start();
                    TraceUtil.m7697b();
                    return new SynchronousMediaCodecAdapter(mediaCodec, surface, null);
                } catch (IOException | RuntimeException e4) {
                    surface2 = surface;
                    e = e4;
                    if (surface2 != null) {
                        surface2.release();
                    }
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException | RuntimeException e5) {
                e = e5;
                mediaCodec = null;
            }
        }

        /* renamed from: b */
        public MediaCodec m6695b(MediaCodecAdapter.Configuration configuration) throws IOException {
            Objects.requireNonNull(configuration.f11873a);
            String str = configuration.f11873a.f11880a;
            String valueOf = String.valueOf(str);
            TraceUtil.m7696a(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            TraceUtil.m7697b();
            return createByCodecName;
        }
    }

    public SynchronousMediaCodecAdapter(MediaCodec mediaCodec, Surface surface, C10311 c10311) {
        this.f11970a = mediaCodec;
        this.f11971b = surface;
        if (Util.f14736a < 21) {
            this.f11972c = mediaCodec.getInputBuffers();
            this.f11973d = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    /* renamed from: a */
    public boolean mo6606a() {
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    /* renamed from: b */
    public void mo6607b(int i2, int i3, CryptoInfo cryptoInfo, long j2, int i4) {
        this.f11970a.queueSecureInputBuffer(i2, i3, cryptoInfo.f10589i, j2, i4);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    /* renamed from: c */
    public MediaFormat mo6608c() {
        return this.f11970a.getOutputFormat();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    @RequiresApi
    /* renamed from: d */
    public void mo6609d(Bundle bundle) {
        this.f11970a.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    @RequiresApi
    /* renamed from: e */
    public void mo6610e(int i2, long j2) {
        this.f11970a.releaseOutputBuffer(i2, j2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    /* renamed from: f */
    public int mo6611f() {
        return this.f11970a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void flush() {
        this.f11970a.flush();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    /* renamed from: g */
    public int mo6612g(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f11970a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && Util.f14736a < 21) {
                this.f11973d = this.f11970a.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    @RequiresApi
    /* renamed from: h */
    public void mo6613h(MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        this.f11970a.setOnFrameRenderedListener(new C1032a(this, onFrameRenderedListener, 1), handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    /* renamed from: i */
    public void mo6614i(int i2, boolean z) {
        this.f11970a.releaseOutputBuffer(i2, z);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    /* renamed from: j */
    public void mo6615j(int i2) {
        this.f11970a.setVideoScalingMode(i2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    @Nullable
    /* renamed from: k */
    public ByteBuffer mo6616k(int i2) {
        return Util.f14736a >= 21 ? this.f11970a.getInputBuffer(i2) : this.f11972c[i2];
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    @RequiresApi
    /* renamed from: l */
    public void mo6617l(Surface surface) {
        this.f11970a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    /* renamed from: m */
    public void mo6618m(int i2, int i3, int i4, long j2, int i5) {
        this.f11970a.queueInputBuffer(i2, i3, i4, j2, i5);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    @Nullable
    /* renamed from: n */
    public ByteBuffer mo6619n(int i2) {
        return Util.f14736a >= 21 ? this.f11970a.getOutputBuffer(i2) : this.f11973d[i2];
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void release() {
        this.f11972c = null;
        this.f11973d = null;
        Surface surface = this.f11971b;
        if (surface != null) {
            surface.release();
        }
        this.f11970a.release();
    }
}
