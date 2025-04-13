package com.bumptech.glide.request;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.model.Model;
import com.bumptech.glide.load.resource.drawable.DrawableDecoderCompat;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.TransitionFactory;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class SingleRequest<R> implements Request, SizeReadyCallback, ResourceCallback, FactoryPools.Poolable {

    /* renamed from: D */
    public static final Pools.Pool<SingleRequest<?>> f8746D = FactoryPools.m5353a(150, new FactoryPools.Factory<SingleRequest<?>>() { // from class: com.bumptech.glide.request.SingleRequest.1
        @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
        /* renamed from: a */
        public SingleRequest<?> mo5033a() {
            return new SingleRequest<>();
        }
    });

    /* renamed from: E */
    public static final boolean f8747E = Log.isLoggable("Request", 2);

    /* renamed from: A */
    public int f8748A;

    /* renamed from: B */
    public int f8749B;

    /* renamed from: C */
    @Nullable
    public RuntimeException f8750C;

    /* renamed from: b */
    public boolean f8751b;

    /* renamed from: c */
    @Nullable
    public final String f8752c;

    /* renamed from: d */
    public final StateVerifier f8753d;

    /* renamed from: e */
    @Nullable
    public RequestListener<R> f8754e;

    /* renamed from: f */
    public RequestCoordinator f8755f;

    /* renamed from: g */
    public Context f8756g;

    /* renamed from: h */
    public GlideContext f8757h;

    /* renamed from: i */
    @Nullable
    public Object f8758i;

    /* renamed from: j */
    public Class<R> f8759j;

    /* renamed from: k */
    public BaseRequestOptions<?> f8760k;

    /* renamed from: l */
    public int f8761l;

    /* renamed from: m */
    public int f8762m;

    /* renamed from: n */
    public Priority f8763n;

    /* renamed from: o */
    public Target<R> f8764o;

    /* renamed from: p */
    @Nullable
    public List<RequestListener<R>> f8765p;

    /* renamed from: q */
    public Engine f8766q;

    /* renamed from: r */
    public TransitionFactory<? super R> f8767r;

    /* renamed from: s */
    public Executor f8768s;

    /* renamed from: t */
    public Resource<R> f8769t;

    /* renamed from: u */
    public Engine.LoadStatus f8770u;

    /* renamed from: v */
    public long f8771v;

    /* renamed from: w */
    @GuardedBy
    public Status f8772w;

    /* renamed from: x */
    public Drawable f8773x;

    /* renamed from: y */
    public Drawable f8774y;

    /* renamed from: z */
    public Drawable f8775z;

    public enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public SingleRequest() {
        this.f8752c = f8747E ? String.valueOf(hashCode()) : null;
        this.f8753d = StateVerifier.m5356a();
    }

    /* renamed from: r */
    public static <R> SingleRequest<R> m5301r(Context context, GlideContext glideContext, Object obj, Class<R> cls, BaseRequestOptions<?> baseRequestOptions, int i2, int i3, Priority priority, Target<R> target, RequestListener<R> requestListener, @Nullable List<RequestListener<R>> list, RequestCoordinator requestCoordinator, Engine engine, TransitionFactory<? super R> transitionFactory, Executor executor) {
        SingleRequest<R> singleRequest = (SingleRequest) f8746D.mo2027b();
        if (singleRequest == null) {
            singleRequest = new SingleRequest<>();
        }
        synchronized (singleRequest) {
            singleRequest.f8756g = context;
            singleRequest.f8757h = glideContext;
            singleRequest.f8758i = obj;
            singleRequest.f8759j = cls;
            singleRequest.f8760k = baseRequestOptions;
            singleRequest.f8761l = i2;
            singleRequest.f8762m = i3;
            singleRequest.f8763n = priority;
            singleRequest.f8764o = target;
            singleRequest.f8754e = requestListener;
            singleRequest.f8765p = list;
            singleRequest.f8755f = requestCoordinator;
            singleRequest.f8766q = engine;
            singleRequest.f8767r = transitionFactory;
            singleRequest.f8768s = executor;
            singleRequest.f8772w = Status.PENDING;
            if (singleRequest.f8750C == null && glideContext.f7911h) {
                singleRequest.f8750C = new RuntimeException("Glide request origin trace");
            }
        }
        return singleRequest;
    }

    @Override // com.bumptech.glide.request.ResourceCallback
    /* renamed from: a */
    public synchronized void mo5299a(GlideException glideException) {
        m5310s(glideException, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[Catch: all -> 0x00b6, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000b, B:9:0x002d, B:11:0x0033, B:14:0x0040, B:16:0x0044, B:21:0x0050, B:24:0x005d, B:28:0x0062, B:30:0x0081, B:31:0x0088, B:34:0x00a7), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d A[Catch: all -> 0x00b6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000b, B:9:0x002d, B:11:0x0033, B:14:0x0040, B:16:0x0044, B:21:0x0050, B:24:0x005d, B:28:0x0062, B:30:0x0081, B:31:0x0088, B:34:0x00a7), top: B:2:0x0001 }] */
    @Override // com.bumptech.glide.request.ResourceCallback
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void mo5300b(com.bumptech.glide.load.engine.Resource<?> r5, com.bumptech.glide.load.DataSource r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.bumptech.glide.util.pool.StateVerifier r0 = r4.f8753d     // Catch: java.lang.Throwable -> Lb6
            r0.mo5358c()     // Catch: java.lang.Throwable -> Lb6
            r0 = 0
            r4.f8770u = r0     // Catch: java.lang.Throwable -> Lb6
            if (r5 != 0) goto L2d
            com.bumptech.glide.load.engine.GlideException r5 = new com.bumptech.glide.load.engine.GlideException     // Catch: java.lang.Throwable -> Lb6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb6
            r6.<init>()     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r0 = "Expected to receive a Resource<R> with an object of "
            r6.append(r0)     // Catch: java.lang.Throwable -> Lb6
            java.lang.Class<R> r0 = r4.f8759j     // Catch: java.lang.Throwable -> Lb6
            r6.append(r0)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r0 = " inside, but instead got null."
            r6.append(r0)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lb6
            r5.<init>(r6)     // Catch: java.lang.Throwable -> Lb6
            r4.mo5299a(r5)     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r4)
            return
        L2d:
            java.lang.Object r1 = r5.get()     // Catch: java.lang.Throwable -> Lb6
            if (r1 == 0) goto L62
            java.lang.Class<R> r2 = r4.f8759j     // Catch: java.lang.Throwable -> Lb6
            java.lang.Class r3 = r1.getClass()     // Catch: java.lang.Throwable -> Lb6
            boolean r2 = r2.isAssignableFrom(r3)     // Catch: java.lang.Throwable -> Lb6
            if (r2 != 0) goto L40
            goto L62
        L40:
            com.bumptech.glide.request.RequestCoordinator r2 = r4.f8755f     // Catch: java.lang.Throwable -> Lb6
            if (r2 == 0) goto L4d
            boolean r2 = r2.mo5284h(r4)     // Catch: java.lang.Throwable -> Lb6
            if (r2 == 0) goto L4b
            goto L4d
        L4b:
            r2 = 0
            goto L4e
        L4d:
            r2 = 1
        L4e:
            if (r2 != 0) goto L5d
            com.bumptech.glide.load.engine.Engine r6 = r4.f8766q     // Catch: java.lang.Throwable -> Lb6
            r6.m5031g(r5)     // Catch: java.lang.Throwable -> Lb6
            r4.f8769t = r0     // Catch: java.lang.Throwable -> Lb6
            com.bumptech.glide.request.SingleRequest$Status r5 = com.bumptech.glide.request.SingleRequest.Status.COMPLETE     // Catch: java.lang.Throwable -> Lb6
            r4.f8772w = r5     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r4)
            return
        L5d:
            r4.m5311t(r5, r1, r6)     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r4)
            return
        L62:
            com.bumptech.glide.load.engine.Engine r6 = r4.f8766q     // Catch: java.lang.Throwable -> Lb6
            r6.m5031g(r5)     // Catch: java.lang.Throwable -> Lb6
            r4.f8769t = r0     // Catch: java.lang.Throwable -> Lb6
            com.bumptech.glide.load.engine.GlideException r6 = new com.bumptech.glide.load.engine.GlideException     // Catch: java.lang.Throwable -> Lb6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb6
            r0.<init>()     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r2 = "Expected to receive an object of "
            r0.append(r2)     // Catch: java.lang.Throwable -> Lb6
            java.lang.Class<R> r2 = r4.f8759j     // Catch: java.lang.Throwable -> Lb6
            r0.append(r2)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r2 = " but instead got "
            r0.append(r2)     // Catch: java.lang.Throwable -> Lb6
            if (r1 == 0) goto L86
            java.lang.Class r2 = r1.getClass()     // Catch: java.lang.Throwable -> Lb6
            goto L88
        L86:
            java.lang.String r2 = ""
        L88:
            r0.append(r2)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r2 = "{"
            r0.append(r2)     // Catch: java.lang.Throwable -> Lb6
            r0.append(r1)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r2 = "} inside Resource{"
            r0.append(r2)     // Catch: java.lang.Throwable -> Lb6
            r0.append(r5)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r5 = "}."
            r0.append(r5)     // Catch: java.lang.Throwable -> Lb6
            if (r1 == 0) goto La5
            java.lang.String r5 = ""
            goto La7
        La5:
            java.lang.String r5 = " To indicate failure return a null Resource object, rather than a Resource object containing null data."
        La7:
            r0.append(r5)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> Lb6
            r6.<init>(r5)     // Catch: java.lang.Throwable -> Lb6
            r4.mo5299a(r6)     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r4)
            return
        Lb6:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.mo5300b(com.bumptech.glide.load.engine.Resource, com.bumptech.glide.load.DataSource):void");
    }

    @Override // com.bumptech.glide.request.Request
    /* renamed from: c */
    public synchronized void mo5279c() {
        m5303j();
        this.f8756g = null;
        this.f8757h = null;
        this.f8758i = null;
        this.f8759j = null;
        this.f8760k = null;
        this.f8761l = -1;
        this.f8762m = -1;
        this.f8764o = null;
        this.f8765p = null;
        this.f8754e = null;
        this.f8755f = null;
        this.f8767r = null;
        this.f8770u = null;
        this.f8773x = null;
        this.f8774y = null;
        this.f8775z = null;
        this.f8748A = -1;
        this.f8749B = -1;
        this.f8750C = null;
        f8746D.mo2026a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f A[Catch: all -> 0x004c, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0011, B:10:0x0022, B:11:0x0028, B:13:0x002c, B:14:0x002f, B:16:0x0033, B:21:0x003f, B:22:0x0048), top: B:2:0x0001 }] */
    @Override // com.bumptech.glide.request.Request
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void clear() {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.m5303j()     // Catch: java.lang.Throwable -> L4c
            com.bumptech.glide.util.pool.StateVerifier r0 = r3.f8753d     // Catch: java.lang.Throwable -> L4c
            r0.mo5358c()     // Catch: java.lang.Throwable -> L4c
            com.bumptech.glide.request.SingleRequest$Status r0 = r3.f8772w     // Catch: java.lang.Throwable -> L4c
            com.bumptech.glide.request.SingleRequest$Status r1 = com.bumptech.glide.request.SingleRequest.Status.CLEARED     // Catch: java.lang.Throwable -> L4c
            if (r0 != r1) goto L11
            monitor-exit(r3)
            return
        L11:
            r3.m5303j()     // Catch: java.lang.Throwable -> L4c
            com.bumptech.glide.util.pool.StateVerifier r0 = r3.f8753d     // Catch: java.lang.Throwable -> L4c
            r0.mo5358c()     // Catch: java.lang.Throwable -> L4c
            com.bumptech.glide.request.target.Target<R> r0 = r3.f8764o     // Catch: java.lang.Throwable -> L4c
            r0.mo4876a(r3)     // Catch: java.lang.Throwable -> L4c
            com.bumptech.glide.load.engine.Engine$LoadStatus r0 = r3.f8770u     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L28
            r0.m5034a()     // Catch: java.lang.Throwable -> L4c
            r0 = 0
            r3.f8770u = r0     // Catch: java.lang.Throwable -> L4c
        L28:
            com.bumptech.glide.load.engine.Resource<R> r0 = r3.f8769t     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L2f
            r3.m5312u(r0)     // Catch: java.lang.Throwable -> L4c
        L2f:
            com.bumptech.glide.request.RequestCoordinator r0 = r3.f8755f     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L3c
            boolean r0 = r0.mo5288l(r3)     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L3a
            goto L3c
        L3a:
            r0 = 0
            goto L3d
        L3c:
            r0 = 1
        L3d:
            if (r0 == 0) goto L48
            com.bumptech.glide.request.target.Target<R> r0 = r3.f8764o     // Catch: java.lang.Throwable -> L4c
            android.graphics.drawable.Drawable r2 = r3.m5305m()     // Catch: java.lang.Throwable -> L4c
            r0.mo5296k(r2)     // Catch: java.lang.Throwable -> L4c
        L48:
            r3.f8772w = r1     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r3)
            return
        L4c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.clear():void");
    }

    @Override // com.bumptech.glide.request.Request
    /* renamed from: d */
    public synchronized boolean mo5280d() {
        return mo5287k();
    }

    @Override // com.bumptech.glide.request.target.SizeReadyCallback
    /* renamed from: e */
    public synchronized void mo5302e(int i2, int i3) {
        int i4 = i2;
        synchronized (this) {
            try {
                this.f8753d.mo5358c();
                boolean z = f8747E;
                if (z) {
                    m5309q("Got onSizeReady in " + LogTime.m5335a(this.f8771v));
                }
                if (this.f8772w != Status.WAITING_FOR_SIZE) {
                    return;
                }
                Status status = Status.RUNNING;
                this.f8772w = status;
                float f2 = this.f8760k.f8707c;
                if (i4 != Integer.MIN_VALUE) {
                    i4 = Math.round(i4 * f2);
                }
                this.f8748A = i4;
                this.f8749B = i3 == Integer.MIN_VALUE ? i3 : Math.round(f2 * i3);
                if (z) {
                    m5309q("finished setup for calling load in " + LogTime.m5335a(this.f8771v));
                }
                Engine engine = this.f8766q;
                GlideContext glideContext = this.f8757h;
                Object obj = this.f8758i;
                BaseRequestOptions<?> baseRequestOptions = this.f8760k;
                try {
                    try {
                        this.f8770u = engine.m5030e(glideContext, obj, baseRequestOptions.f8717m, this.f8748A, this.f8749B, baseRequestOptions.f8724t, this.f8759j, this.f8763n, baseRequestOptions.f8708d, baseRequestOptions.f8723s, baseRequestOptions.f8718n, baseRequestOptions.f8730z, baseRequestOptions.f8722r, baseRequestOptions.f8714j, baseRequestOptions.f8728x, baseRequestOptions.f8705A, baseRequestOptions.f8729y, this, this.f8768s);
                        if (this.f8772w != status) {
                            this.f8770u = null;
                        }
                        if (z) {
                            m5309q("finished onSizeReady in " + LogTime.m5335a(this.f8771v));
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    /* renamed from: f */
    public synchronized boolean mo5282f() {
        return this.f8772w == Status.FAILED;
    }

    @Override // com.bumptech.glide.request.Request
    /* renamed from: g */
    public synchronized boolean mo5283g() {
        return this.f8772w == Status.CLEARED;
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    @NonNull
    /* renamed from: h */
    public StateVerifier mo5005h() {
        return this.f8753d;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[Catch: all -> 0x00b1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0015, B:7:0x001f, B:8:0x0027, B:11:0x0030, B:16:0x003c, B:18:0x0042, B:20:0x0046, B:23:0x004f, B:25:0x005d, B:26:0x006a, B:29:0x0089, B:31:0x008d, B:34:0x0070, B:36:0x0074, B:41:0x0080, B:43:0x0065, B:44:0x00a9, B:45:0x00b0), top: B:2:0x0001 }] */
    @Override // com.bumptech.glide.request.Request
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void mo5285i() {
        /*
            r4 = this;
            monitor-enter(r4)
            r4.m5303j()     // Catch: java.lang.Throwable -> Lb1
            com.bumptech.glide.util.pool.StateVerifier r0 = r4.f8753d     // Catch: java.lang.Throwable -> Lb1
            r0.mo5358c()     // Catch: java.lang.Throwable -> Lb1
            int r0 = com.bumptech.glide.util.LogTime.f8843b     // Catch: java.lang.Throwable -> Lb1
            long r0 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> Lb1
            r4.f8771v = r0     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r0 = r4.f8758i     // Catch: java.lang.Throwable -> Lb1
            if (r0 != 0) goto L3c
            int r0 = r4.f8761l     // Catch: java.lang.Throwable -> Lb1
            int r1 = r4.f8762m     // Catch: java.lang.Throwable -> Lb1
            boolean r0 = com.bumptech.glide.util.Util.m5352i(r0, r1)     // Catch: java.lang.Throwable -> Lb1
            if (r0 == 0) goto L27
            int r0 = r4.f8761l     // Catch: java.lang.Throwable -> Lb1
            r4.f8748A = r0     // Catch: java.lang.Throwable -> Lb1
            int r0 = r4.f8762m     // Catch: java.lang.Throwable -> Lb1
            r4.f8749B = r0     // Catch: java.lang.Throwable -> Lb1
        L27:
            android.graphics.drawable.Drawable r0 = r4.m5304l()     // Catch: java.lang.Throwable -> Lb1
            if (r0 != 0) goto L2f
            r0 = 5
            goto L30
        L2f:
            r0 = 3
        L30:
            com.bumptech.glide.load.engine.GlideException r1 = new com.bumptech.glide.load.engine.GlideException     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r2 = "Received null model"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lb1
            r4.m5310s(r1, r0)     // Catch: java.lang.Throwable -> Lb1
            monitor-exit(r4)
            return
        L3c:
            com.bumptech.glide.request.SingleRequest$Status r0 = r4.f8772w     // Catch: java.lang.Throwable -> Lb1
            com.bumptech.glide.request.SingleRequest$Status r1 = com.bumptech.glide.request.SingleRequest.Status.RUNNING     // Catch: java.lang.Throwable -> Lb1
            if (r0 == r1) goto La9
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.COMPLETE     // Catch: java.lang.Throwable -> Lb1
            if (r0 != r2) goto L4f
            com.bumptech.glide.load.engine.Resource<R> r0 = r4.f8769t     // Catch: java.lang.Throwable -> Lb1
            com.bumptech.glide.load.DataSource r1 = com.bumptech.glide.load.DataSource.MEMORY_CACHE     // Catch: java.lang.Throwable -> Lb1
            r4.mo5300b(r0, r1)     // Catch: java.lang.Throwable -> Lb1
            monitor-exit(r4)
            return
        L4f:
            com.bumptech.glide.request.SingleRequest$Status r0 = com.bumptech.glide.request.SingleRequest.Status.WAITING_FOR_SIZE     // Catch: java.lang.Throwable -> Lb1
            r4.f8772w = r0     // Catch: java.lang.Throwable -> Lb1
            int r2 = r4.f8761l     // Catch: java.lang.Throwable -> Lb1
            int r3 = r4.f8762m     // Catch: java.lang.Throwable -> Lb1
            boolean r2 = com.bumptech.glide.util.Util.m5352i(r2, r3)     // Catch: java.lang.Throwable -> Lb1
            if (r2 == 0) goto L65
            int r2 = r4.f8761l     // Catch: java.lang.Throwable -> Lb1
            int r3 = r4.f8762m     // Catch: java.lang.Throwable -> Lb1
            r4.mo5302e(r2, r3)     // Catch: java.lang.Throwable -> Lb1
            goto L6a
        L65:
            com.bumptech.glide.request.target.Target<R> r2 = r4.f8764o     // Catch: java.lang.Throwable -> Lb1
            r2.mo4878l(r4)     // Catch: java.lang.Throwable -> Lb1
        L6a:
            com.bumptech.glide.request.SingleRequest$Status r2 = r4.f8772w     // Catch: java.lang.Throwable -> Lb1
            if (r2 == r1) goto L70
            if (r2 != r0) goto L89
        L70:
            com.bumptech.glide.request.RequestCoordinator r0 = r4.f8755f     // Catch: java.lang.Throwable -> Lb1
            if (r0 == 0) goto L7d
            boolean r0 = r0.mo5281e(r4)     // Catch: java.lang.Throwable -> Lb1
            if (r0 == 0) goto L7b
            goto L7d
        L7b:
            r0 = 0
            goto L7e
        L7d:
            r0 = 1
        L7e:
            if (r0 == 0) goto L89
            com.bumptech.glide.request.target.Target<R> r0 = r4.f8764o     // Catch: java.lang.Throwable -> Lb1
            android.graphics.drawable.Drawable r1 = r4.m5305m()     // Catch: java.lang.Throwable -> Lb1
            r0.mo5294i(r1)     // Catch: java.lang.Throwable -> Lb1
        L89:
            boolean r0 = com.bumptech.glide.request.SingleRequest.f8747E     // Catch: java.lang.Throwable -> Lb1
            if (r0 == 0) goto La7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb1
            r0.<init>()     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r1 = "finished run method in "
            r0.append(r1)     // Catch: java.lang.Throwable -> Lb1
            long r1 = r4.f8771v     // Catch: java.lang.Throwable -> Lb1
            double r1 = com.bumptech.glide.util.LogTime.m5335a(r1)     // Catch: java.lang.Throwable -> Lb1
            r0.append(r1)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lb1
            r4.m5309q(r0)     // Catch: java.lang.Throwable -> Lb1
        La7:
            monitor-exit(r4)
            return
        La9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r1 = "Cannot restart a running request"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb1
            throw r0     // Catch: java.lang.Throwable -> Lb1
        Lb1:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.mo5285i():void");
    }

    @Override // com.bumptech.glide.request.Request
    public synchronized boolean isRunning() {
        boolean z;
        Status status = this.f8772w;
        if (status != Status.RUNNING) {
            z = status == Status.WAITING_FOR_SIZE;
        }
        return z;
    }

    /* renamed from: j */
    public final void m5303j() {
        if (this.f8751b) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @Override // com.bumptech.glide.request.Request
    /* renamed from: k */
    public synchronized boolean mo5287k() {
        return this.f8772w == Status.COMPLETE;
    }

    /* renamed from: l */
    public final Drawable m5304l() {
        int i2;
        if (this.f8775z == null) {
            BaseRequestOptions<?> baseRequestOptions = this.f8760k;
            Drawable drawable = baseRequestOptions.f8720p;
            this.f8775z = drawable;
            if (drawable == null && (i2 = baseRequestOptions.f8721q) > 0) {
                this.f8775z = m5308p(i2);
            }
        }
        return this.f8775z;
    }

    /* renamed from: m */
    public final Drawable m5305m() {
        int i2;
        if (this.f8774y == null) {
            BaseRequestOptions<?> baseRequestOptions = this.f8760k;
            Drawable drawable = baseRequestOptions.f8712h;
            this.f8774y = drawable;
            if (drawable == null && (i2 = baseRequestOptions.f8713i) > 0) {
                this.f8774y = m5308p(i2);
            }
        }
        return this.f8774y;
    }

    /* renamed from: n */
    public synchronized boolean m5306n(Request request) {
        boolean z = false;
        if (!(request instanceof SingleRequest)) {
            return false;
        }
        SingleRequest singleRequest = (SingleRequest) request;
        synchronized (singleRequest) {
            if (this.f8761l == singleRequest.f8761l && this.f8762m == singleRequest.f8762m) {
                Object obj = this.f8758i;
                Object obj2 = singleRequest.f8758i;
                char[] cArr = Util.f8851a;
                if ((obj == null ? obj2 == null : obj instanceof Model ? ((Model) obj).m5144a(obj2) : obj.equals(obj2)) && this.f8759j.equals(singleRequest.f8759j) && this.f8760k.equals(singleRequest.f8760k) && this.f8763n == singleRequest.f8763n) {
                    synchronized (this) {
                        synchronized (singleRequest) {
                            List<RequestListener<R>> list = this.f8765p;
                            int size = list == null ? 0 : list.size();
                            List<RequestListener<R>> list2 = singleRequest.f8765p;
                            boolean z2 = size == (list2 == null ? 0 : list2.size());
                            if (z2) {
                                z = true;
                            }
                        }
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: o */
    public final boolean m5307o() {
        RequestCoordinator requestCoordinator = this.f8755f;
        return requestCoordinator == null || !requestCoordinator.mo5278b();
    }

    /* renamed from: p */
    public final Drawable m5308p(@DrawableRes int i2) {
        Resources.Theme theme = this.f8760k.f8726v;
        if (theme == null) {
            theme = this.f8756g.getTheme();
        }
        GlideContext glideContext = this.f8757h;
        return DrawableDecoderCompat.m5196a(glideContext, glideContext, i2, theme);
    }

    /* renamed from: q */
    public final void m5309q(String str) {
        StringBuilder m27x = C0000a.m27x(str, " this: ");
        m27x.append(this.f8752c);
        Log.v("Request", m27x.toString());
    }

    /* renamed from: s */
    public final synchronized void m5310s(GlideException glideException, int i2) {
        boolean z;
        this.f8753d.mo5358c();
        Objects.requireNonNull(glideException);
        int i3 = this.f8757h.f7912i;
        if (i3 <= i2) {
            Log.w("Glide", "Load failed for " + this.f8758i + " with size [" + this.f8748A + "x" + this.f8749B + "]", glideException);
            if (i3 <= 4) {
                glideException.m5051e("Glide");
            }
        }
        this.f8770u = null;
        this.f8772w = Status.FAILED;
        boolean z2 = true;
        this.f8751b = true;
        try {
            List<RequestListener<R>> list = this.f8765p;
            if (list != null) {
                Iterator<RequestListener<R>> it = list.iterator();
                z = false;
                while (it.hasNext()) {
                    z |= it.next().mo5291e(glideException, this.f8758i, this.f8764o, m5307o());
                }
            } else {
                z = false;
            }
            RequestListener<R> requestListener = this.f8754e;
            if (requestListener == null || !requestListener.mo5291e(glideException, this.f8758i, this.f8764o, m5307o())) {
                z2 = false;
            }
            if (!(z | z2)) {
                m5313v();
            }
            this.f8751b = false;
            RequestCoordinator requestCoordinator = this.f8755f;
            if (requestCoordinator != null) {
                requestCoordinator.mo5277a(this);
            }
        } catch (Throwable th) {
            this.f8751b = false;
            throw th;
        }
    }

    /* renamed from: t */
    public final synchronized void m5311t(Resource<R> resource, R r, DataSource dataSource) {
        boolean z;
        boolean m5307o = m5307o();
        this.f8772w = Status.COMPLETE;
        this.f8769t = resource;
        if (this.f8757h.f7912i <= 3) {
            Log.d("Glide", "Finished loading " + r.getClass().getSimpleName() + " from " + dataSource + " for " + this.f8758i + " with size [" + this.f8748A + "x" + this.f8749B + "] in " + LogTime.m5335a(this.f8771v) + " ms");
        }
        boolean z2 = true;
        this.f8751b = true;
        try {
            List<RequestListener<R>> list = this.f8765p;
            if (list != null) {
                Iterator<RequestListener<R>> it = list.iterator();
                z = false;
                while (it.hasNext()) {
                    z |= it.next().mo5293h(r, this.f8758i, this.f8764o, dataSource, m5307o);
                }
            } else {
                z = false;
            }
            RequestListener<R> requestListener = this.f8754e;
            if (requestListener == null || !requestListener.mo5293h(r, this.f8758i, this.f8764o, dataSource, m5307o)) {
                z2 = false;
            }
            if (!(z2 | z)) {
                this.f8764o.mo4877c(r, this.f8767r.mo5324a(dataSource, m5307o));
            }
            this.f8751b = false;
            RequestCoordinator requestCoordinator = this.f8755f;
            if (requestCoordinator != null) {
                requestCoordinator.mo5286j(this);
            }
        } catch (Throwable th) {
            this.f8751b = false;
            throw th;
        }
    }

    /* renamed from: u */
    public final void m5312u(Resource<?> resource) {
        this.f8766q.m5031g(resource);
        this.f8769t = null;
    }

    /* renamed from: v */
    public final synchronized void m5313v() {
        int i2;
        RequestCoordinator requestCoordinator = this.f8755f;
        if (requestCoordinator == null || requestCoordinator.mo5281e(this)) {
            Drawable m5304l = this.f8758i == null ? m5304l() : null;
            if (m5304l == null) {
                if (this.f8773x == null) {
                    BaseRequestOptions<?> baseRequestOptions = this.f8760k;
                    Drawable drawable = baseRequestOptions.f8710f;
                    this.f8773x = drawable;
                    if (drawable == null && (i2 = baseRequestOptions.f8711g) > 0) {
                        this.f8773x = m5308p(i2);
                    }
                }
                m5304l = this.f8773x;
            }
            if (m5304l == null) {
                m5304l = m5305m();
            }
            this.f8764o.mo5292f(m5304l);
        }
    }
}
