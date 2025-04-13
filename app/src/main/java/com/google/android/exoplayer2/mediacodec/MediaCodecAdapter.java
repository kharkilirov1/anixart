package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.CryptoInfo;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface MediaCodecAdapter {

    public static final class Configuration {

        /* renamed from: a */
        public final MediaCodecInfo f11873a;

        /* renamed from: b */
        public final MediaFormat f11874b;

        /* renamed from: c */
        public final Format f11875c;

        /* renamed from: d */
        @Nullable
        public final Surface f11876d;

        /* renamed from: e */
        @Nullable
        public final MediaCrypto f11877e;

        /* renamed from: f */
        public final int f11878f;

        /* renamed from: g */
        public final boolean f11879g;

        public Configuration(MediaCodecInfo mediaCodecInfo, MediaFormat mediaFormat, Format format, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, int i2, boolean z) {
            this.f11873a = mediaCodecInfo;
            this.f11874b = mediaFormat;
            this.f11875c = format;
            this.f11876d = surface;
            this.f11877e = mediaCrypto;
            this.f11878f = i2;
            this.f11879g = z;
        }
    }

    public interface Factory {
        /* renamed from: a */
        MediaCodecAdapter mo6621a(Configuration configuration) throws IOException;
    }

    public interface OnFrameRenderedListener {
        /* renamed from: a */
        void mo6637a(MediaCodecAdapter mediaCodecAdapter, long j2, long j3);
    }

    /* renamed from: a */
    boolean mo6606a();

    /* renamed from: b */
    void mo6607b(int i2, int i3, CryptoInfo cryptoInfo, long j2, int i4);

    /* renamed from: c */
    MediaFormat mo6608c();

    @RequiresApi
    /* renamed from: d */
    void mo6609d(Bundle bundle);

    @RequiresApi
    /* renamed from: e */
    void mo6610e(int i2, long j2);

    /* renamed from: f */
    int mo6611f();

    void flush();

    /* renamed from: g */
    int mo6612g(MediaCodec.BufferInfo bufferInfo);

    @RequiresApi
    /* renamed from: h */
    void mo6613h(OnFrameRenderedListener onFrameRenderedListener, Handler handler);

    /* renamed from: i */
    void mo6614i(int i2, boolean z);

    /* renamed from: j */
    void mo6615j(int i2);

    @Nullable
    /* renamed from: k */
    ByteBuffer mo6616k(int i2);

    @RequiresApi
    /* renamed from: l */
    void mo6617l(Surface surface);

    /* renamed from: m */
    void mo6618m(int i2, int i3, int i4, long j2, int i5);

    @Nullable
    /* renamed from: n */
    ByteBuffer mo6619n(int i2);

    void release();
}
