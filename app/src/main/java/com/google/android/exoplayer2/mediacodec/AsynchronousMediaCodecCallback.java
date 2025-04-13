package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayDeque;

@RequiresApi
/* loaded from: classes.dex */
final class AsynchronousMediaCodecCallback extends MediaCodec.Callback {

    /* renamed from: b */
    public final HandlerThread f11850b;

    /* renamed from: c */
    public Handler f11851c;

    /* renamed from: h */
    @Nullable
    @GuardedBy
    public MediaFormat f11856h;

    /* renamed from: i */
    @Nullable
    @GuardedBy
    public MediaFormat f11857i;

    /* renamed from: j */
    @Nullable
    @GuardedBy
    public MediaCodec.CodecException f11858j;

    /* renamed from: k */
    @GuardedBy
    public long f11859k;

    /* renamed from: l */
    @GuardedBy
    public boolean f11860l;

    /* renamed from: m */
    @Nullable
    @GuardedBy
    public IllegalStateException f11861m;

    /* renamed from: a */
    public final Object f11849a = new Object();

    /* renamed from: d */
    @GuardedBy
    public final IntArrayQueue f11852d = new IntArrayQueue();

    /* renamed from: e */
    @GuardedBy
    public final IntArrayQueue f11853e = new IntArrayQueue();

    /* renamed from: f */
    @GuardedBy
    public final ArrayDeque<MediaCodec.BufferInfo> f11854f = new ArrayDeque<>();

    /* renamed from: g */
    @GuardedBy
    public final ArrayDeque<MediaFormat> f11855g = new ArrayDeque<>();

    public AsynchronousMediaCodecCallback(HandlerThread handlerThread) {
        this.f11850b = handlerThread;
    }

    /* renamed from: a */
    public void m6628a(@Nullable final MediaCodec mediaCodec) {
        synchronized (this.f11849a) {
            this.f11859k++;
            Handler handler = this.f11851c;
            int i2 = Util.f14736a;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.mediacodec.c
                @Override // java.lang.Runnable
                public final void run() {
                    AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = AsynchronousMediaCodecCallback.this;
                    MediaCodec mediaCodec2 = mediaCodec;
                    synchronized (asynchronousMediaCodecCallback.f11849a) {
                        if (asynchronousMediaCodecCallback.f11860l) {
                            return;
                        }
                        long j2 = asynchronousMediaCodecCallback.f11859k - 1;
                        asynchronousMediaCodecCallback.f11859k = j2;
                        if (j2 > 0) {
                            return;
                        }
                        if (j2 < 0) {
                            asynchronousMediaCodecCallback.m6631d(new IllegalStateException());
                            return;
                        }
                        asynchronousMediaCodecCallback.m6629b();
                        if (mediaCodec2 != null) {
                            try {
                                try {
                                    mediaCodec2.start();
                                } catch (IllegalStateException e2) {
                                    asynchronousMediaCodecCallback.m6631d(e2);
                                }
                            } catch (Exception e3) {
                                asynchronousMediaCodecCallback.m6631d(new IllegalStateException(e3));
                            }
                        }
                    }
                }
            });
        }
    }

    @GuardedBy
    /* renamed from: b */
    public final void m6629b() {
        if (!this.f11855g.isEmpty()) {
            this.f11857i = this.f11855g.getLast();
        }
        IntArrayQueue intArrayQueue = this.f11852d;
        intArrayQueue.f11868a = 0;
        intArrayQueue.f11869b = -1;
        intArrayQueue.f11870c = 0;
        IntArrayQueue intArrayQueue2 = this.f11853e;
        intArrayQueue2.f11868a = 0;
        intArrayQueue2.f11869b = -1;
        intArrayQueue2.f11870c = 0;
        this.f11854f.clear();
        this.f11855g.clear();
        this.f11858j = null;
    }

    @GuardedBy
    /* renamed from: c */
    public final boolean m6630c() {
        return this.f11859k > 0 || this.f11860l;
    }

    /* renamed from: d */
    public final void m6631d(IllegalStateException illegalStateException) {
        synchronized (this.f11849a) {
            this.f11861m = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f11849a) {
            this.f11858j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i2) {
        synchronized (this.f11849a) {
            this.f11852d.m6635a(i2);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f11849a) {
            MediaFormat mediaFormat = this.f11857i;
            if (mediaFormat != null) {
                this.f11853e.m6635a(-2);
                this.f11855g.add(mediaFormat);
                this.f11857i = null;
            }
            this.f11853e.m6635a(i2);
            this.f11854f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f11849a) {
            this.f11853e.m6635a(-2);
            this.f11855g.add(mediaFormat);
            this.f11857i = null;
        }
    }
}
