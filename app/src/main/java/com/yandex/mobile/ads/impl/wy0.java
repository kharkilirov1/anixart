package com.yandex.mobile.ads.impl;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.annotation.Nullable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class wy0 implements me1, InterfaceC6026xg {

    /* renamed from: j */
    private int f56296j;

    /* renamed from: k */
    private SurfaceTexture f56297k;

    /* renamed from: n */
    @Nullable
    private byte[] f56300n;

    /* renamed from: b */
    private final AtomicBoolean f56288b = new AtomicBoolean();

    /* renamed from: c */
    private final AtomicBoolean f56289c = new AtomicBoolean(true);

    /* renamed from: d */
    private final zs0 f56290d = new zs0();

    /* renamed from: e */
    private final C5889uv f56291e = new C5889uv();

    /* renamed from: f */
    private final j61<Long> f56292f = new j61<>();

    /* renamed from: g */
    private final j61<xs0> f56293g = new j61<>();

    /* renamed from: h */
    private final float[] f56294h = new float[16];

    /* renamed from: i */
    private final float[] f56295i = new float[16];

    /* renamed from: l */
    private volatile int f56298l = 0;

    /* renamed from: m */
    private int f56299m = -1;

    /* renamed from: a */
    public final void m29589a(int i2) {
        this.f56298l = i2;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6026xg
    /* renamed from: f */
    public final void mo25724f() {
        this.f56292f.m25807a();
        this.f56291e.m29141a();
        this.f56289c.set(true);
    }

    /* renamed from: a */
    public final SurfaceTexture m29588a() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        C5660qx.m27792a();
        this.f56290d.m30293a();
        C5660qx.m27792a();
        this.f56296j = C5660qx.m27795b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f56296j);
        this.f56297k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.yandex.mobile.ads.impl.nq1
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                wy0.this.m29586a(surfaceTexture2);
            }
        });
        return this.f56297k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29586a(SurfaceTexture surfaceTexture) {
        this.f56288b.set(true);
    }

    /* renamed from: a */
    public final void m29590a(float[] fArr) {
        GLES20.glClear(16384);
        C5660qx.m27792a();
        if (this.f56288b.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.f56297k;
            Objects.requireNonNull(surfaceTexture);
            surfaceTexture.updateTexImage();
            C5660qx.m27792a();
            if (this.f56289c.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f56294h, 0);
            }
            long timestamp = this.f56297k.getTimestamp();
            Long m25806a = this.f56292f.m25806a(timestamp);
            if (m25806a != null) {
                this.f56291e.m29142a(m25806a.longValue(), this.f56294h);
            }
            xs0 m25809b = this.f56293g.m25809b(timestamp);
            if (m25809b != null) {
                this.f56290d.m30295a(m25809b);
            }
        }
        Matrix.multiplyMM(this.f56295i, 0, fArr, 0, this.f56294h, 0);
        this.f56290d.m30294a(this.f56296j, this.f56295i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if ((r6.m29808b() == 1 && r6.m29807a().f56561a == 0 && r7.m29808b() == 1 && r7.m29807a().f56561a == 0) != false) goto L51;
     */
    @Override // com.yandex.mobile.ads.impl.me1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo25722a(long r32, long r34, com.yandex.mobile.ads.impl.C5606pv r36, @androidx.annotation.Nullable android.media.MediaFormat r37) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.wy0.mo25722a(long, long, com.yandex.mobile.ads.impl.pv, android.media.MediaFormat):void");
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6026xg
    /* renamed from: a */
    public final void mo25723a(long j2, float[] fArr) {
        this.f56291e.m29143b(j2, fArr);
    }
}
