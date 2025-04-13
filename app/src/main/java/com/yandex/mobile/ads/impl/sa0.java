package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface sa0 {

    /* renamed from: com.yandex.mobile.ads.impl.sa0$a */
    public static final class C5734a {

        /* renamed from: a */
        public final wa0 f54544a;

        /* renamed from: b */
        public final MediaFormat f54545b;

        /* renamed from: c */
        public final C5606pv f54546c;

        /* renamed from: d */
        @Nullable
        public final Surface f54547d;

        /* renamed from: e */
        @Nullable
        public final MediaCrypto f54548e;

        private C5734a(wa0 wa0Var, MediaFormat mediaFormat, C5606pv c5606pv, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto) {
            this.f54544a = wa0Var;
            this.f54545b = mediaFormat;
            this.f54546c = c5606pv;
            this.f54547d = surface;
            this.f54548e = mediaCrypto;
        }

        /* renamed from: a */
        public static C5734a m28136a(wa0 wa0Var, MediaFormat mediaFormat, C5606pv c5606pv, @Nullable MediaCrypto mediaCrypto) {
            return new C5734a(wa0Var, mediaFormat, c5606pv, null, mediaCrypto);
        }

        /* renamed from: a */
        public static C5734a m28137a(wa0 wa0Var, MediaFormat mediaFormat, C5606pv c5606pv, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto) {
            return new C5734a(wa0Var, mediaFormat, c5606pv, surface, mediaCrypto);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sa0$b */
    public interface InterfaceC5735b {
        /* renamed from: a */
        sa0 mo24031a(C5734a c5734a) throws IOException;
    }

    /* renamed from: com.yandex.mobile.ads.impl.sa0$c */
    public interface InterfaceC5736c {
        /* renamed from: a */
        void mo24090a(long j2);
    }

    /* renamed from: a */
    int mo24016a(MediaCodec.BufferInfo bufferInfo);

    /* renamed from: a */
    void mo24017a();

    /* renamed from: a */
    void mo24018a(int i2);

    /* renamed from: a */
    void mo24019a(int i2, int i3, long j2, int i4);

    @RequiresApi
    /* renamed from: a */
    void mo24020a(int i2, long j2);

    /* renamed from: a */
    void mo24021a(int i2, C5695rl c5695rl, long j2);

    @RequiresApi
    /* renamed from: a */
    void mo24022a(Bundle bundle);

    @RequiresApi
    /* renamed from: a */
    void mo24023a(Surface surface);

    @RequiresApi
    /* renamed from: a */
    void mo24024a(InterfaceC5736c interfaceC5736c, Handler handler);

    /* renamed from: a */
    void mo24025a(boolean z, int i2);

    /* renamed from: b */
    MediaFormat mo24026b();

    @Nullable
    /* renamed from: b */
    ByteBuffer mo24027b(int i2);

    /* renamed from: c */
    int mo24028c();

    @Nullable
    /* renamed from: c */
    ByteBuffer mo24029c(int i2);

    void flush();

    void release();
}
