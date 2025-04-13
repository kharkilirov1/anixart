package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.ConditionVariable;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

@RequiresApi
/* loaded from: classes.dex */
class AsynchronousMediaCodecBufferEnqueuer {

    /* renamed from: g */
    @GuardedBy
    public static final ArrayDeque<MessageParams> f11834g = new ArrayDeque<>();

    /* renamed from: h */
    public static final Object f11835h = new Object();

    /* renamed from: a */
    public final MediaCodec f11836a;

    /* renamed from: b */
    public final HandlerThread f11837b;

    /* renamed from: c */
    public Handler f11838c;

    /* renamed from: d */
    public final AtomicReference<RuntimeException> f11839d;

    /* renamed from: e */
    public final ConditionVariable f11840e;

    /* renamed from: f */
    public boolean f11841f;

    public static class MessageParams {

        /* renamed from: a */
        public int f11843a;

        /* renamed from: b */
        public int f11844b;

        /* renamed from: c */
        public int f11845c;

        /* renamed from: d */
        public final MediaCodec.CryptoInfo f11846d = new MediaCodec.CryptoInfo();

        /* renamed from: e */
        public long f11847e;

        /* renamed from: f */
        public int f11848f;
    }

    public AsynchronousMediaCodecBufferEnqueuer(MediaCodec mediaCodec, HandlerThread handlerThread) {
        ConditionVariable conditionVariable = new ConditionVariable();
        this.f11836a = mediaCodec;
        this.f11837b = handlerThread;
        this.f11840e = conditionVariable;
        this.f11839d = new AtomicReference<>();
    }

    @Nullable
    /* renamed from: b */
    public static byte[] m6623b(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    @Nullable
    /* renamed from: c */
    public static int[] m6624c(@Nullable int[] iArr, @Nullable int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* renamed from: e */
    public static MessageParams m6625e() {
        ArrayDeque<MessageParams> arrayDeque = f11834g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new MessageParams();
            }
            return arrayDeque.removeFirst();
        }
    }

    /* renamed from: a */
    public final void m6626a() throws InterruptedException {
        this.f11840e.m7536c();
        Handler handler = this.f11838c;
        Objects.requireNonNull(handler);
        handler.obtainMessage(2).sendToTarget();
        this.f11840e.m7534a();
    }

    /* renamed from: d */
    public void m6627d() {
        if (this.f11841f) {
            try {
                Handler handler = this.f11838c;
                Objects.requireNonNull(handler);
                handler.removeCallbacksAndMessages(null);
                m6626a();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
    }
}
