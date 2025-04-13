package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

@RequiresApi
/* renamed from: com.yandex.mobile.ads.impl.ib */
/* loaded from: classes3.dex */
final class C5222ib {

    /* renamed from: g */
    @GuardedBy
    private static final ArrayDeque<b> f51253g = new ArrayDeque<>();

    /* renamed from: h */
    private static final Object f51254h = new Object();

    /* renamed from: a */
    private final MediaCodec f51255a;

    /* renamed from: b */
    private final HandlerThread f51256b;

    /* renamed from: c */
    private Handler f51257c;

    /* renamed from: d */
    private final AtomicReference<RuntimeException> f51258d;

    /* renamed from: e */
    private final C4813ak f51259e;

    /* renamed from: f */
    private boolean f51260f;

    /* renamed from: com.yandex.mobile.ads.impl.ib$a */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C5222ib.m25481a(C5222ib.this, message);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ib$b */
    public static class b {

        /* renamed from: a */
        public int f51262a;

        /* renamed from: b */
        public int f51263b;

        /* renamed from: c */
        public int f51264c;

        /* renamed from: d */
        public final MediaCodec.CryptoInfo f51265d = new MediaCodec.CryptoInfo();

        /* renamed from: e */
        public long f51266e;

        /* renamed from: f */
        public int f51267f;
    }

    public C5222ib(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new C4813ak());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0064  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m25481a(com.yandex.mobile.ads.impl.C5222ib r9, android.os.Message r10) {
        /*
            java.util.Objects.requireNonNull(r9)
            int r0 = r10.what
            r1 = 0
            if (r0 == 0) goto L47
            r2 = 1
            if (r0 == r2) goto L25
            r2 = 2
            if (r0 == r2) goto L1f
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r9 = r9.f51258d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r10 = r10.what
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r0.<init>(r10)
            r9.compareAndSet(r1, r0)
            goto L62
        L1f:
            com.yandex.mobile.ads.impl.ak r9 = r9.f51259e
            r9.m22536e()
            goto L62
        L25:
            java.lang.Object r10 = r10.obj
            com.yandex.mobile.ads.impl.ib$b r10 = (com.yandex.mobile.ads.impl.C5222ib.b) r10
            int r3 = r10.f51262a
            int r4 = r10.f51263b
            android.media.MediaCodec$CryptoInfo r5 = r10.f51265d
            long r6 = r10.f51266e
            int r8 = r10.f51267f
            java.lang.Object r0 = com.yandex.mobile.ads.impl.C5222ib.f51254h     // Catch: java.lang.RuntimeException -> L40
            monitor-enter(r0)     // Catch: java.lang.RuntimeException -> L40
            android.media.MediaCodec r2 = r9.f51255a     // Catch: java.lang.Throwable -> L3d
            r2.queueSecureInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            goto L61
        L3d:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            throw r2     // Catch: java.lang.RuntimeException -> L40
        L40:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r9 = r9.f51258d
            r9.compareAndSet(r1, r0)
            goto L61
        L47:
            java.lang.Object r10 = r10.obj
            com.yandex.mobile.ads.impl.ib$b r10 = (com.yandex.mobile.ads.impl.C5222ib.b) r10
            int r3 = r10.f51262a
            int r4 = r10.f51263b
            int r5 = r10.f51264c
            long r6 = r10.f51266e
            int r8 = r10.f51267f
            android.media.MediaCodec r2 = r9.f51255a     // Catch: java.lang.RuntimeException -> L5b
            r2.queueInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.RuntimeException -> L5b
            goto L61
        L5b:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r9 = r9.f51258d
            r9.compareAndSet(r1, r0)
        L61:
            r1 = r10
        L62:
            if (r1 == 0) goto L6f
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.ib$b> r9 = com.yandex.mobile.ads.impl.C5222ib.f51253g
            monitor-enter(r9)
            r9.add(r1)     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L6c
            goto L6f
        L6c:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L6c
            throw r10
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5222ib.m25481a(com.yandex.mobile.ads.impl.ib, android.os.Message):void");
    }

    /* renamed from: b */
    public final void m25485b() {
        if (this.f51260f) {
            m25482a();
            this.f51256b.quit();
        }
        this.f51260f = false;
    }

    /* renamed from: c */
    public final void m25486c() {
        if (this.f51260f) {
            return;
        }
        this.f51256b.start();
        this.f51257c = new a(this.f51256b.getLooper());
        this.f51260f = true;
    }

    /* renamed from: d */
    public final void m25487d() throws InterruptedException {
        this.f51259e.m22534c();
        Handler handler = this.f51257c;
        Objects.requireNonNull(handler);
        handler.obtainMessage(2).sendToTarget();
        this.f51259e.m22531a();
    }

    @VisibleForTesting
    public C5222ib(MediaCodec mediaCodec, HandlerThread handlerThread, C4813ak c4813ak) {
        this.f51255a = mediaCodec;
        this.f51256b = handlerThread;
        this.f51259e = c4813ak;
        this.f51258d = new AtomicReference<>();
    }

    /* renamed from: a */
    public final void m25482a() {
        if (this.f51260f) {
            try {
                Handler handler = this.f51257c;
                Objects.requireNonNull(handler);
                handler.removeCallbacksAndMessages(null);
                this.f51259e.m22534c();
                Handler handler2 = this.f51257c;
                Objects.requireNonNull(handler2);
                handler2.obtainMessage(2).sendToTarget();
                this.f51259e.m22531a();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
    }

    /* renamed from: a */
    public final void m25483a(int i2, int i3, long j2, int i4) {
        b removeFirst;
        RuntimeException andSet = this.f51258d.getAndSet(null);
        if (andSet == null) {
            ArrayDeque<b> arrayDeque = f51253g;
            synchronized (arrayDeque) {
                if (arrayDeque.isEmpty()) {
                    removeFirst = new b();
                } else {
                    removeFirst = arrayDeque.removeFirst();
                }
            }
            removeFirst.f51262a = i2;
            removeFirst.f51263b = 0;
            removeFirst.f51264c = i3;
            removeFirst.f51266e = j2;
            removeFirst.f51267f = i4;
            Handler handler = this.f51257c;
            int i5 = s91.f54530a;
            handler.obtainMessage(0, removeFirst).sendToTarget();
            return;
        }
        throw andSet;
    }

    /* renamed from: a */
    public final void m25484a(int i2, C5695rl c5695rl, long j2) {
        b removeFirst;
        RuntimeException andSet = this.f51258d.getAndSet(null);
        if (andSet == null) {
            ArrayDeque<b> arrayDeque = f51253g;
            synchronized (arrayDeque) {
                if (arrayDeque.isEmpty()) {
                    removeFirst = new b();
                } else {
                    removeFirst = arrayDeque.removeFirst();
                }
            }
            removeFirst.f51262a = i2;
            removeFirst.f51263b = 0;
            removeFirst.f51264c = 0;
            removeFirst.f51266e = j2;
            removeFirst.f51267f = 0;
            MediaCodec.CryptoInfo cryptoInfo = removeFirst.f51265d;
            cryptoInfo.numSubSamples = c5695rl.f54347f;
            int[] iArr = c5695rl.f54345d;
            int[] iArr2 = cryptoInfo.numBytesOfClearData;
            if (iArr != null) {
                if (iArr2 != null && iArr2.length >= iArr.length) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                } else {
                    iArr2 = Arrays.copyOf(iArr, iArr.length);
                }
            }
            cryptoInfo.numBytesOfClearData = iArr2;
            int[] iArr3 = c5695rl.f54346e;
            int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
            if (iArr3 != null) {
                if (iArr4 != null && iArr4.length >= iArr3.length) {
                    System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
                } else {
                    iArr4 = Arrays.copyOf(iArr3, iArr3.length);
                }
            }
            cryptoInfo.numBytesOfEncryptedData = iArr4;
            byte[] bArr = c5695rl.f54343b;
            byte[] bArr2 = cryptoInfo.key;
            if (bArr != null) {
                if (bArr2 != null && bArr2.length >= bArr.length) {
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                } else {
                    bArr2 = Arrays.copyOf(bArr, bArr.length);
                }
            }
            Objects.requireNonNull(bArr2);
            cryptoInfo.key = bArr2;
            byte[] bArr3 = c5695rl.f54342a;
            byte[] bArr4 = cryptoInfo.iv;
            if (bArr3 != null) {
                if (bArr4 != null && bArr4.length >= bArr3.length) {
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                } else {
                    bArr4 = Arrays.copyOf(bArr3, bArr3.length);
                }
            }
            Objects.requireNonNull(bArr4);
            cryptoInfo.iv = bArr4;
            cryptoInfo.mode = c5695rl.f54344c;
            if (s91.f54530a >= 24) {
                cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(c5695rl.f54348g, c5695rl.f54349h));
            }
            this.f51257c.obtainMessage(1, removeFirst).sendToTarget();
            return;
        }
        throw andSet;
    }
}
