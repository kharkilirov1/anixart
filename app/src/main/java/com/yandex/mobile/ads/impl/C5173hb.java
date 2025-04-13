package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.sa0;
import java.io.IOException;
import java.nio.ByteBuffer;

@RequiresApi
/* renamed from: com.yandex.mobile.ads.impl.hb */
/* loaded from: classes3.dex */
final class C5173hb implements sa0 {

    /* renamed from: a */
    private final MediaCodec f50888a;

    /* renamed from: b */
    private final C5277jb f50889b;

    /* renamed from: c */
    private final C5222ib f50890c;

    /* renamed from: d */
    private final boolean f50891d;

    /* renamed from: e */
    private boolean f50892e;

    /* renamed from: f */
    private int f50893f;

    /* renamed from: com.yandex.mobile.ads.impl.hb$a */
    public static final class a implements sa0.InterfaceC5735b {

        /* renamed from: a */
        private final c51<HandlerThread> f50894a;

        /* renamed from: b */
        private final c51<HandlerThread> f50895b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(final int r4) {
            /*
                r3 = this;
                com.yandex.mobile.ads.impl.po1 r0 = new com.yandex.mobile.ads.impl.po1
                r1 = 0
                r0.<init>()
                com.yandex.mobile.ads.impl.po1 r1 = new com.yandex.mobile.ads.impl.po1
                r2 = 1
                r1.<init>()
                r3.<init>(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5173hb.a.<init>(int):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static /* synthetic */ HandlerThread m25108b(int i2) {
            return new HandlerThread(C5173hb.m25105d(i2));
        }

        @VisibleForTesting
        public a(c51 c51Var, c51 c51Var2) {
            this.f50894a = c51Var;
            this.f50895b = c51Var2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ HandlerThread m25107a(int i2) {
            return new HandlerThread(C5173hb.m25106e(i2));
        }

        @Override // com.yandex.mobile.ads.impl.sa0.InterfaceC5735b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C5173hb mo24031a(sa0.C5734a c5734a) throws IOException {
            MediaCodec mediaCodec;
            C5173hb c5173hb;
            String str = c5734a.f54544a.f56065a;
            C5173hb c5173hb2 = null;
            try {
                s61.m28074a("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    c5173hb = new C5173hb(mediaCodec, this.f50894a.get(), this.f50895b.get(), false, 0);
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                mediaCodec = null;
            }
            try {
                s61.m28073a();
                C5173hb.m25102a(c5173hb, c5734a.f54545b, c5734a.f54547d, c5734a.f54548e);
                return c5173hb;
            } catch (Exception e4) {
                e = e4;
                c5173hb2 = c5173hb;
                if (c5173hb2 != null) {
                    c5173hb2.release();
                } else if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        }
    }

    public /* synthetic */ C5173hb(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, int i2) {
        this(mediaCodec, handlerThread, handlerThread2, z);
    }

    /* renamed from: a */
    public static void m25102a(C5173hb c5173hb, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        c5173hb.f50889b.m25834a(c5173hb.f50888a);
        s61.m28074a("configureCodec");
        c5173hb.f50888a.configure(mediaFormat, surface, mediaCrypto, 0);
        s61.m28073a();
        c5173hb.f50890c.m25486c();
        s61.m28074a("startCodec");
        c5173hb.f50888a.start();
        s61.m28073a();
        c5173hb.f50893f = 1;
    }

    /* renamed from: d */
    public static String m25105d(int i2) {
        StringBuilder sb = new StringBuilder("ExoPlayer:MediaCodecQueueingThread:");
        if (i2 == 1) {
            sb.append("Audio");
        } else if (i2 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i2);
            sb.append(")");
        }
        return sb.toString();
    }

    /* renamed from: e */
    public static String m25106e(int i2) {
        StringBuilder sb = new StringBuilder("ExoPlayer:MediaCodecAsyncAdapter:");
        if (i2 == 1) {
            sb.append("Audio");
        } else if (i2 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i2);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    /* renamed from: a */
    public final void mo24017a() {
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    /* renamed from: b */
    public final MediaFormat mo24026b() {
        return this.f50889b.m25836c();
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    /* renamed from: c */
    public final int mo24028c() {
        return this.f50889b.m25832a();
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    public final void flush() {
        this.f50890c.m25482a();
        this.f50888a.flush();
        this.f50889b.m25835b();
        this.f50888a.start();
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    public final void release() {
        try {
            if (this.f50893f == 1) {
                this.f50890c.m25485b();
                this.f50889b.m25837e();
            }
            this.f50893f = 2;
        } finally {
            if (!this.f50892e) {
                this.f50888a.release();
                this.f50892e = true;
            }
        }
    }

    private C5173hb(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z) {
        this.f50888a = mediaCodec;
        this.f50889b = new C5277jb(handlerThread);
        this.f50890c = new C5222ib(mediaCodec, handlerThread2);
        this.f50891d = z;
        this.f50893f = 0;
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    @Nullable
    /* renamed from: b */
    public final ByteBuffer mo24027b(int i2) {
        return this.f50888a.getInputBuffer(i2);
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    @Nullable
    /* renamed from: c */
    public final ByteBuffer mo24029c(int i2) {
        return this.f50888a.getOutputBuffer(i2);
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    /* renamed from: a */
    public final void mo24019a(int i2, int i3, long j2, int i4) {
        this.f50890c.m25483a(i2, i3, j2, i4);
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    /* renamed from: a */
    public final void mo24021a(int i2, C5695rl c5695rl, long j2) {
        this.f50890c.m25484a(i2, c5695rl, j2);
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    /* renamed from: a */
    public final void mo24025a(boolean z, int i2) {
        this.f50888a.releaseOutputBuffer(i2, z);
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    /* renamed from: a */
    public final void mo24020a(int i2, long j2) {
        this.f50888a.releaseOutputBuffer(i2, j2);
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    /* renamed from: a */
    public final int mo24016a(MediaCodec.BufferInfo bufferInfo) {
        return this.f50889b.m25833a(bufferInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m25104a(sa0.InterfaceC5736c interfaceC5736c, MediaCodec mediaCodec, long j2, long j3) {
        interfaceC5736c.mo24090a(j2);
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    /* renamed from: a */
    public final void mo24024a(sa0.InterfaceC5736c interfaceC5736c, Handler handler) {
        if (this.f50891d) {
            try {
                this.f50890c.m25487d();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
        this.f50888a.setOnFrameRenderedListener(new oo1(this, interfaceC5736c, 0), handler);
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    /* renamed from: a */
    public final void mo24023a(Surface surface) {
        if (this.f50891d) {
            try {
                this.f50890c.m25487d();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
        this.f50888a.setOutputSurface(surface);
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    /* renamed from: a */
    public final void mo24022a(Bundle bundle) {
        if (this.f50891d) {
            try {
                this.f50890c.m25487d();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
        this.f50888a.setParameters(bundle);
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    /* renamed from: a */
    public final void mo24018a(int i2) {
        if (this.f50891d) {
            try {
                this.f50890c.m25487d();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
        this.f50888a.setVideoScalingMode(i2);
    }
}
