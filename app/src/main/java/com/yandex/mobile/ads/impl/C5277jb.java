package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayDeque;

@RequiresApi
/* renamed from: com.yandex.mobile.ads.impl.jb */
/* loaded from: classes3.dex */
final class C5277jb extends MediaCodec.Callback {

    /* renamed from: b */
    private final HandlerThread f51546b;

    /* renamed from: c */
    private Handler f51547c;

    /* renamed from: h */
    @Nullable
    @GuardedBy
    private MediaFormat f51552h;

    /* renamed from: i */
    @Nullable
    @GuardedBy
    private MediaFormat f51553i;

    /* renamed from: j */
    @Nullable
    @GuardedBy
    private MediaCodec.CodecException f51554j;

    /* renamed from: k */
    @GuardedBy
    private long f51555k;

    /* renamed from: l */
    @GuardedBy
    private boolean f51556l;

    /* renamed from: m */
    @Nullable
    @GuardedBy
    private IllegalStateException f51557m;

    /* renamed from: a */
    private final Object f51545a = new Object();

    /* renamed from: d */
    @GuardedBy
    private final c60 f51548d = new c60();

    /* renamed from: e */
    @GuardedBy
    private final c60 f51549e = new c60();

    /* renamed from: f */
    @GuardedBy
    private final ArrayDeque<MediaCodec.BufferInfo> f51550f = new ArrayDeque<>();

    /* renamed from: g */
    @GuardedBy
    private final ArrayDeque<MediaFormat> f51551g = new ArrayDeque<>();

    public C5277jb(HandlerThread handlerThread) {
        this.f51546b = handlerThread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m25831d() {
        synchronized (this.f51545a) {
            if (this.f51556l) {
                return;
            }
            long j2 = this.f51555k - 1;
            this.f51555k = j2;
            if (j2 > 0) {
                return;
            }
            if (j2 < 0) {
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (this.f51545a) {
                    this.f51557m = illegalStateException;
                }
                return;
            }
            if (!this.f51551g.isEmpty()) {
                this.f51553i = this.f51551g.getLast();
            }
            this.f51548d.m23027a();
            this.f51549e.m23027a();
            this.f51550f.clear();
            this.f51551g.clear();
            this.f51554j = null;
        }
    }

    /* renamed from: a */
    public final void m25834a(MediaCodec mediaCodec) {
        C5220ia.m25476b(this.f51547c == null);
        this.f51546b.start();
        Handler handler = new Handler(this.f51546b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f51547c = handler;
    }

    /* renamed from: b */
    public final void m25835b() {
        synchronized (this.f51545a) {
            this.f51555k++;
            Handler handler = this.f51547c;
            int i2 = s91.f54530a;
            handler.post(new gp1(this, 1));
        }
    }

    /* renamed from: c */
    public final MediaFormat m25836c() {
        MediaFormat mediaFormat;
        synchronized (this.f51545a) {
            mediaFormat = this.f51552h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    /* renamed from: e */
    public final void m25837e() {
        synchronized (this.f51545a) {
            this.f51556l = true;
            this.f51546b.quit();
            if (!this.f51551g.isEmpty()) {
                this.f51553i = this.f51551g.getLast();
            }
            this.f51548d.m23027a();
            this.f51549e.m23027a();
            this.f51550f.clear();
            this.f51551g.clear();
            this.f51554j = null;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f51545a) {
            this.f51554j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i2) {
        synchronized (this.f51545a) {
            this.f51548d.m23028a(i2);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f51545a) {
            MediaFormat mediaFormat = this.f51553i;
            if (mediaFormat != null) {
                this.f51549e.m23028a(-2);
                this.f51551g.add(mediaFormat);
                this.f51553i = null;
            }
            this.f51549e.m23028a(i2);
            this.f51550f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f51545a) {
            this.f51549e.m23028a(-2);
            this.f51551g.add(mediaFormat);
            this.f51553i = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[Catch: all -> 0x0038, DONT_GENERATE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000b, B:12:0x0016, B:15:0x0018, B:17:0x001d, B:19:0x0021, B:22:0x0030, B:24:0x002a, B:25:0x0032, B:26:0x0034, B:27:0x0035, B:28:0x0037), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0018 A[Catch: all -> 0x0038, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000b, B:12:0x0016, B:15:0x0018, B:17:0x001d, B:19:0x0021, B:22:0x0030, B:24:0x002a, B:25:0x0032, B:26:0x0034, B:27:0x0035, B:28:0x0037), top: B:3:0x0003 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m25832a() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f51545a
            monitor-enter(r0)
            long r1 = r6.f51555k     // Catch: java.lang.Throwable -> L38
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L12
            boolean r1 = r6.f51556l     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L10
            goto L12
        L10:
            r1 = 0
            goto L13
        L12:
            r1 = 1
        L13:
            r2 = -1
            if (r1 == 0) goto L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            return r2
        L18:
            java.lang.IllegalStateException r1 = r6.f51557m     // Catch: java.lang.Throwable -> L38
            r3 = 0
            if (r1 != 0) goto L35
            android.media.MediaCodec$CodecException r1 = r6.f51554j     // Catch: java.lang.Throwable -> L38
            if (r1 != 0) goto L32
            com.yandex.mobile.ads.impl.c60 r1 = r6.f51548d     // Catch: java.lang.Throwable -> L38
            boolean r1 = r1.m23029b()     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L2a
            goto L30
        L2a:
            com.yandex.mobile.ads.impl.c60 r1 = r6.f51548d     // Catch: java.lang.Throwable -> L38
            int r2 = r1.m23030c()     // Catch: java.lang.Throwable -> L38
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            return r2
        L32:
            r6.f51554j = r3     // Catch: java.lang.Throwable -> L38
            throw r1     // Catch: java.lang.Throwable -> L38
        L35:
            r6.f51557m = r3     // Catch: java.lang.Throwable -> L38
            throw r1     // Catch: java.lang.Throwable -> L38
        L38:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5277jb.m25832a():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[Catch: all -> 0x0062, DONT_GENERATE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000b, B:12:0x0016, B:15:0x0018, B:17:0x001d, B:19:0x0021, B:21:0x0029, B:23:0x002b, B:25:0x0033, B:26:0x005a, B:30:0x0050, B:31:0x005c, B:32:0x005e, B:33:0x005f, B:34:0x0061), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0018 A[Catch: all -> 0x0062, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000b, B:12:0x0016, B:15:0x0018, B:17:0x001d, B:19:0x0021, B:21:0x0029, B:23:0x002b, B:25:0x0033, B:26:0x005a, B:30:0x0050, B:31:0x005c, B:32:0x005e, B:33:0x005f, B:34:0x0061), top: B:3:0x0003 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m25833a(android.media.MediaCodec.BufferInfo r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f51545a
            monitor-enter(r0)
            long r1 = r9.f51555k     // Catch: java.lang.Throwable -> L62
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L12
            boolean r1 = r9.f51556l     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L10
            goto L12
        L10:
            r1 = 0
            goto L13
        L12:
            r1 = 1
        L13:
            r2 = -1
            if (r1 == 0) goto L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            return r2
        L18:
            java.lang.IllegalStateException r1 = r9.f51557m     // Catch: java.lang.Throwable -> L62
            r3 = 0
            if (r1 != 0) goto L5f
            android.media.MediaCodec$CodecException r1 = r9.f51554j     // Catch: java.lang.Throwable -> L62
            if (r1 != 0) goto L5c
            com.yandex.mobile.ads.impl.c60 r1 = r9.f51549e     // Catch: java.lang.Throwable -> L62
            boolean r1 = r1.m23029b()     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L2b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            return r2
        L2b:
            com.yandex.mobile.ads.impl.c60 r1 = r9.f51549e     // Catch: java.lang.Throwable -> L62
            int r1 = r1.m23030c()     // Catch: java.lang.Throwable -> L62
            if (r1 < 0) goto L4d
            android.media.MediaFormat r2 = r9.f51552h     // Catch: java.lang.Throwable -> L62
            com.yandex.mobile.ads.impl.C5220ia.m25474b(r2)     // Catch: java.lang.Throwable -> L62
            java.util.ArrayDeque<android.media.MediaCodec$BufferInfo> r2 = r9.f51550f     // Catch: java.lang.Throwable -> L62
            java.lang.Object r2 = r2.remove()     // Catch: java.lang.Throwable -> L62
            android.media.MediaCodec$BufferInfo r2 = (android.media.MediaCodec.BufferInfo) r2     // Catch: java.lang.Throwable -> L62
            int r4 = r2.offset     // Catch: java.lang.Throwable -> L62
            int r5 = r2.size     // Catch: java.lang.Throwable -> L62
            long r6 = r2.presentationTimeUs     // Catch: java.lang.Throwable -> L62
            int r8 = r2.flags     // Catch: java.lang.Throwable -> L62
            r3 = r10
            r3.set(r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L62
            goto L5a
        L4d:
            r10 = -2
            if (r1 != r10) goto L5a
            java.util.ArrayDeque<android.media.MediaFormat> r10 = r9.f51551g     // Catch: java.lang.Throwable -> L62
            java.lang.Object r10 = r10.remove()     // Catch: java.lang.Throwable -> L62
            android.media.MediaFormat r10 = (android.media.MediaFormat) r10     // Catch: java.lang.Throwable -> L62
            r9.f51552h = r10     // Catch: java.lang.Throwable -> L62
        L5a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            return r1
        L5c:
            r9.f51554j = r3     // Catch: java.lang.Throwable -> L62
            throw r1     // Catch: java.lang.Throwable -> L62
        L5f:
            r9.f51557m = r3     // Catch: java.lang.Throwable -> L62
            throw r1     // Catch: java.lang.Throwable -> L62
        L62:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5277jb.m25833a(android.media.MediaCodec$BufferInfo):int");
    }
}
