package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Supplier;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;

@RequiresApi
/* loaded from: classes.dex */
final class AsynchronousMediaCodecAdapter implements MediaCodecAdapter {

    /* renamed from: a */
    public final MediaCodec f11822a;

    /* renamed from: b */
    public final AsynchronousMediaCodecCallback f11823b;

    /* renamed from: c */
    public final AsynchronousMediaCodecBufferEnqueuer f11824c;

    /* renamed from: d */
    public final boolean f11825d;

    /* renamed from: e */
    public final boolean f11826e;

    /* renamed from: f */
    public boolean f11827f;

    /* renamed from: g */
    public int f11828g = 0;

    /* renamed from: h */
    @Nullable
    public Surface f11829h;

    public static final class Factory implements MediaCodecAdapter.Factory {

        /* renamed from: a */
        public final Supplier<HandlerThread> f11830a;

        /* renamed from: b */
        public final Supplier<HandlerThread> f11831b;

        /* renamed from: c */
        public final boolean f11832c;

        /* renamed from: d */
        public final boolean f11833d;

        public Factory(final int i2, boolean z, boolean z2) {
            final int i3 = 0;
            Supplier<HandlerThread> supplier = new Supplier() { // from class: com.google.android.exoplayer2.mediacodec.b
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    switch (i3) {
                        case 0:
                            return new HandlerThread(AsynchronousMediaCodecAdapter.m6605p(i2, "ExoPlayer:MediaCodecAsyncAdapter:"));
                        default:
                            return new HandlerThread(AsynchronousMediaCodecAdapter.m6605p(i2, "ExoPlayer:MediaCodecQueueingThread:"));
                    }
                }
            };
            final int i4 = 1;
            Supplier<HandlerThread> supplier2 = new Supplier() { // from class: com.google.android.exoplayer2.mediacodec.b
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    switch (i4) {
                        case 0:
                            return new HandlerThread(AsynchronousMediaCodecAdapter.m6605p(i2, "ExoPlayer:MediaCodecAsyncAdapter:"));
                        default:
                            return new HandlerThread(AsynchronousMediaCodecAdapter.m6605p(i2, "ExoPlayer:MediaCodecQueueingThread:"));
                    }
                }
            };
            this.f11830a = supplier;
            this.f11831b = supplier2;
            this.f11832c = z;
            this.f11833d = z2;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AsynchronousMediaCodecAdapter mo6621a(MediaCodecAdapter.Configuration configuration) throws IOException {
            MediaCodec mediaCodec;
            AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter;
            String str = configuration.f11873a.f11880a;
            AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter2 = null;
            try {
                String valueOf = String.valueOf(str);
                TraceUtil.m7696a(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    asynchronousMediaCodecAdapter = new AsynchronousMediaCodecAdapter(mediaCodec, this.f11830a.get(), this.f11831b.get(), this.f11832c, this.f11833d, null);
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                mediaCodec = null;
            }
            try {
                TraceUtil.m7697b();
                AsynchronousMediaCodecAdapter.m6604o(asynchronousMediaCodecAdapter, configuration.f11874b, configuration.f11876d, configuration.f11877e, configuration.f11878f, configuration.f11879g);
                return asynchronousMediaCodecAdapter;
            } catch (Exception e4) {
                e = e4;
                asynchronousMediaCodecAdapter2 = asynchronousMediaCodecAdapter;
                if (asynchronousMediaCodecAdapter2 != null) {
                    asynchronousMediaCodecAdapter2.release();
                } else if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        }
    }

    public AsynchronousMediaCodecAdapter(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, boolean z2, C10281 c10281) {
        this.f11822a = mediaCodec;
        this.f11823b = new AsynchronousMediaCodecCallback(handlerThread);
        this.f11824c = new AsynchronousMediaCodecBufferEnqueuer(mediaCodec, handlerThread2);
        this.f11825d = z;
        this.f11826e = z2;
    }

    /* renamed from: o */
    public static void m6604o(AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i2, boolean z) {
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = asynchronousMediaCodecAdapter.f11823b;
        MediaCodec mediaCodec = asynchronousMediaCodecAdapter.f11822a;
        Assertions.m7516d(asynchronousMediaCodecCallback.f11851c == null);
        asynchronousMediaCodecCallback.f11850b.start();
        Handler handler = new Handler(asynchronousMediaCodecCallback.f11850b.getLooper());
        mediaCodec.setCallback(asynchronousMediaCodecCallback, handler);
        asynchronousMediaCodecCallback.f11851c = handler;
        TraceUtil.m7696a("configureCodec");
        asynchronousMediaCodecAdapter.f11822a.configure(mediaFormat, surface, mediaCrypto, i2);
        TraceUtil.m7697b();
        if (z) {
            asynchronousMediaCodecAdapter.f11829h = asynchronousMediaCodecAdapter.f11822a.createInputSurface();
        }
        AsynchronousMediaCodecBufferEnqueuer asynchronousMediaCodecBufferEnqueuer = asynchronousMediaCodecAdapter.f11824c;
        if (!asynchronousMediaCodecBufferEnqueuer.f11841f) {
            asynchronousMediaCodecBufferEnqueuer.f11837b.start();
            asynchronousMediaCodecBufferEnqueuer.f11838c = new Handler(asynchronousMediaCodecBufferEnqueuer.f11837b.getLooper()) { // from class: com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer.1
                public HandlerC10291(Looper looper) {
                    super(looper);
                }

                /* JADX WARN: Removed duplicated region for block: B:21:0x0073 A[ORIG_RETURN, RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:9:0x0068  */
                @Override // android.os.Handler
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void handleMessage(android.os.Message r11) {
                    /*
                        r10 = this;
                        com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer r0 = com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer.this
                        java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer$MessageParams> r1 = com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer.f11834g
                        java.util.Objects.requireNonNull(r0)
                        int r1 = r11.what
                        r2 = 0
                        if (r1 == 0) goto L4b
                        r3 = 1
                        if (r1 == r3) goto L29
                        r3 = 2
                        if (r1 == r3) goto L23
                        java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r0 = r0.f11839d
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        int r11 = r11.what
                        java.lang.String r11 = java.lang.String.valueOf(r11)
                        r1.<init>(r11)
                        r0.compareAndSet(r2, r1)
                        goto L66
                    L23:
                        com.google.android.exoplayer2.util.ConditionVariable r11 = r0.f11840e
                        r11.m7538e()
                        goto L66
                    L29:
                        java.lang.Object r11 = r11.obj
                        com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer$MessageParams r11 = (com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams) r11
                        int r4 = r11.f11843a
                        int r5 = r11.f11844b
                        android.media.MediaCodec$CryptoInfo r6 = r11.f11846d
                        long r7 = r11.f11847e
                        int r9 = r11.f11848f
                        java.lang.Object r1 = com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer.f11835h     // Catch: java.lang.RuntimeException -> L44
                        monitor-enter(r1)     // Catch: java.lang.RuntimeException -> L44
                        android.media.MediaCodec r3 = r0.f11836a     // Catch: java.lang.Throwable -> L41
                        r3.queueSecureInputBuffer(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L41
                        monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
                        goto L65
                    L41:
                        r3 = move-exception
                        monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
                        throw r3     // Catch: java.lang.RuntimeException -> L44
                    L44:
                        r1 = move-exception
                        java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r0 = r0.f11839d
                        r0.compareAndSet(r2, r1)
                        goto L65
                    L4b:
                        java.lang.Object r11 = r11.obj
                        com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer$MessageParams r11 = (com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams) r11
                        int r4 = r11.f11843a
                        int r5 = r11.f11844b
                        int r6 = r11.f11845c
                        long r7 = r11.f11847e
                        int r9 = r11.f11848f
                        android.media.MediaCodec r3 = r0.f11836a     // Catch: java.lang.RuntimeException -> L5f
                        r3.queueInputBuffer(r4, r5, r6, r7, r9)     // Catch: java.lang.RuntimeException -> L5f
                        goto L65
                    L5f:
                        r1 = move-exception
                        java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r0 = r0.f11839d
                        r0.compareAndSet(r2, r1)
                    L65:
                        r2 = r11
                    L66:
                        if (r2 == 0) goto L73
                        java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer$MessageParams> r11 = com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer.f11834g
                        monitor-enter(r11)
                        r11.add(r2)     // Catch: java.lang.Throwable -> L70
                        monitor-exit(r11)     // Catch: java.lang.Throwable -> L70
                        goto L73
                    L70:
                        r0 = move-exception
                        monitor-exit(r11)     // Catch: java.lang.Throwable -> L70
                        throw r0
                    L73:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer.HandlerC10291.handleMessage(android.os.Message):void");
                }
            };
            asynchronousMediaCodecBufferEnqueuer.f11841f = true;
        }
        TraceUtil.m7696a("startCodec");
        asynchronousMediaCodecAdapter.f11822a.start();
        TraceUtil.m7697b();
        asynchronousMediaCodecAdapter.f11828g = 1;
    }

    /* renamed from: p */
    public static String m6605p(int i2, String str) {
        StringBuilder sb = new StringBuilder(str);
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

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    /* renamed from: a */
    public boolean mo6606a() {
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    /* renamed from: b */
    public void mo6607b(int i2, int i3, CryptoInfo cryptoInfo, long j2, int i4) {
        AsynchronousMediaCodecBufferEnqueuer asynchronousMediaCodecBufferEnqueuer = this.f11824c;
        RuntimeException andSet = asynchronousMediaCodecBufferEnqueuer.f11839d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
        AsynchronousMediaCodecBufferEnqueuer.MessageParams m6625e = AsynchronousMediaCodecBufferEnqueuer.m6625e();
        m6625e.f11843a = i2;
        m6625e.f11844b = i3;
        m6625e.f11845c = 0;
        m6625e.f11847e = j2;
        m6625e.f11848f = i4;
        MediaCodec.CryptoInfo cryptoInfo2 = m6625e.f11846d;
        cryptoInfo2.numSubSamples = cryptoInfo.f10586f;
        cryptoInfo2.numBytesOfClearData = AsynchronousMediaCodecBufferEnqueuer.m6624c(cryptoInfo.f10584d, cryptoInfo2.numBytesOfClearData);
        cryptoInfo2.numBytesOfEncryptedData = AsynchronousMediaCodecBufferEnqueuer.m6624c(cryptoInfo.f10585e, cryptoInfo2.numBytesOfEncryptedData);
        byte[] m6623b = AsynchronousMediaCodecBufferEnqueuer.m6623b(cryptoInfo.f10582b, cryptoInfo2.key);
        Objects.requireNonNull(m6623b);
        cryptoInfo2.key = m6623b;
        byte[] m6623b2 = AsynchronousMediaCodecBufferEnqueuer.m6623b(cryptoInfo.f10581a, cryptoInfo2.iv);
        Objects.requireNonNull(m6623b2);
        cryptoInfo2.iv = m6623b2;
        cryptoInfo2.mode = cryptoInfo.f10583c;
        if (Util.f14736a >= 24) {
            cryptoInfo2.setPattern(new MediaCodec.CryptoInfo.Pattern(cryptoInfo.f10587g, cryptoInfo.f10588h));
        }
        asynchronousMediaCodecBufferEnqueuer.f11838c.obtainMessage(1, m6625e).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    /* renamed from: c */
    public MediaFormat mo6608c() {
        MediaFormat mediaFormat;
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.f11823b;
        synchronized (asynchronousMediaCodecCallback.f11849a) {
            mediaFormat = asynchronousMediaCodecCallback.f11856h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    /* renamed from: d */
    public void mo6609d(Bundle bundle) {
        m6620q();
        this.f11822a.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    /* renamed from: e */
    public void mo6610e(int i2, long j2) {
        this.f11822a.releaseOutputBuffer(i2, j2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    /* renamed from: f */
    public int mo6611f() {
        int i2;
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.f11823b;
        synchronized (asynchronousMediaCodecCallback.f11849a) {
            i2 = -1;
            if (!asynchronousMediaCodecCallback.m6630c()) {
                IllegalStateException illegalStateException = asynchronousMediaCodecCallback.f11861m;
                if (illegalStateException != null) {
                    asynchronousMediaCodecCallback.f11861m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = asynchronousMediaCodecCallback.f11858j;
                if (codecException != null) {
                    asynchronousMediaCodecCallback.f11858j = null;
                    throw codecException;
                }
                IntArrayQueue intArrayQueue = asynchronousMediaCodecCallback.f11852d;
                if (!(intArrayQueue.f11870c == 0)) {
                    i2 = intArrayQueue.m6636b();
                }
            }
        }
        return i2;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void flush() {
        this.f11824c.m6627d();
        this.f11822a.flush();
        if (!this.f11826e) {
            this.f11823b.m6628a(this.f11822a);
        } else {
            this.f11823b.m6628a(null);
            this.f11822a.start();
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    /* renamed from: g */
    public int mo6612g(MediaCodec.BufferInfo bufferInfo) {
        int i2;
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.f11823b;
        synchronized (asynchronousMediaCodecCallback.f11849a) {
            i2 = -1;
            if (!asynchronousMediaCodecCallback.m6630c()) {
                IllegalStateException illegalStateException = asynchronousMediaCodecCallback.f11861m;
                if (illegalStateException != null) {
                    asynchronousMediaCodecCallback.f11861m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = asynchronousMediaCodecCallback.f11858j;
                if (codecException != null) {
                    asynchronousMediaCodecCallback.f11858j = null;
                    throw codecException;
                }
                IntArrayQueue intArrayQueue = asynchronousMediaCodecCallback.f11853e;
                if (!(intArrayQueue.f11870c == 0)) {
                    i2 = intArrayQueue.m6636b();
                    if (i2 >= 0) {
                        Assertions.m7518f(asynchronousMediaCodecCallback.f11856h);
                        MediaCodec.BufferInfo remove = asynchronousMediaCodecCallback.f11854f.remove();
                        bufferInfo.set(remove.offset, remove.size, remove.presentationTimeUs, remove.flags);
                    } else if (i2 == -2) {
                        asynchronousMediaCodecCallback.f11856h = asynchronousMediaCodecCallback.f11855g.remove();
                    }
                }
            }
        }
        return i2;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    /* renamed from: h */
    public void mo6613h(MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        m6620q();
        this.f11822a.setOnFrameRenderedListener(new C1032a(this, onFrameRenderedListener, 0), handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    /* renamed from: i */
    public void mo6614i(int i2, boolean z) {
        this.f11822a.releaseOutputBuffer(i2, z);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    /* renamed from: j */
    public void mo6615j(int i2) {
        m6620q();
        this.f11822a.setVideoScalingMode(i2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    @Nullable
    /* renamed from: k */
    public ByteBuffer mo6616k(int i2) {
        return this.f11822a.getInputBuffer(i2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    /* renamed from: l */
    public void mo6617l(Surface surface) {
        m6620q();
        this.f11822a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    /* renamed from: m */
    public void mo6618m(int i2, int i3, int i4, long j2, int i5) {
        AsynchronousMediaCodecBufferEnqueuer asynchronousMediaCodecBufferEnqueuer = this.f11824c;
        RuntimeException andSet = asynchronousMediaCodecBufferEnqueuer.f11839d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
        AsynchronousMediaCodecBufferEnqueuer.MessageParams m6625e = AsynchronousMediaCodecBufferEnqueuer.m6625e();
        m6625e.f11843a = i2;
        m6625e.f11844b = i3;
        m6625e.f11845c = i4;
        m6625e.f11847e = j2;
        m6625e.f11848f = i5;
        Handler handler = asynchronousMediaCodecBufferEnqueuer.f11838c;
        int i6 = Util.f14736a;
        handler.obtainMessage(0, m6625e).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    @Nullable
    /* renamed from: n */
    public ByteBuffer mo6619n(int i2) {
        return this.f11822a.getOutputBuffer(i2);
    }

    /* renamed from: q */
    public final void m6620q() {
        if (this.f11825d) {
            try {
                this.f11824c.m6626a();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void release() {
        try {
            if (this.f11828g == 1) {
                AsynchronousMediaCodecBufferEnqueuer asynchronousMediaCodecBufferEnqueuer = this.f11824c;
                if (asynchronousMediaCodecBufferEnqueuer.f11841f) {
                    asynchronousMediaCodecBufferEnqueuer.m6627d();
                    asynchronousMediaCodecBufferEnqueuer.f11837b.quit();
                }
                asynchronousMediaCodecBufferEnqueuer.f11841f = false;
                AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.f11823b;
                synchronized (asynchronousMediaCodecCallback.f11849a) {
                    asynchronousMediaCodecCallback.f11860l = true;
                    asynchronousMediaCodecCallback.f11850b.quit();
                    asynchronousMediaCodecCallback.m6629b();
                }
            }
            this.f11828g = 2;
        } finally {
            Surface surface = this.f11829h;
            if (surface != null) {
                surface.release();
            }
            if (!this.f11827f) {
                this.f11822a.release();
                this.f11827f = true;
            }
        }
    }
}
