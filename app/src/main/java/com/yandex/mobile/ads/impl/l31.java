package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.r61;
import com.yandex.mobile.ads.impl.ro0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes3.dex */
public final class l31 extends GLSurfaceView {

    /* renamed from: a */
    private final CopyOnWriteArrayList<InterfaceC5375b> f52225a;

    /* renamed from: b */
    private final SensorManager f52226b;

    /* renamed from: c */
    @Nullable
    private final Sensor f52227c;

    /* renamed from: d */
    private final ro0 f52228d;

    /* renamed from: e */
    private final Handler f52229e;

    /* renamed from: f */
    private final wy0 f52230f;

    /* renamed from: g */
    @Nullable
    private SurfaceTexture f52231g;

    /* renamed from: h */
    @Nullable
    private Surface f52232h;

    /* renamed from: i */
    private boolean f52233i;

    /* renamed from: j */
    private boolean f52234j;

    /* renamed from: k */
    private boolean f52235k;

    /* renamed from: com.yandex.mobile.ads.impl.l31$b */
    public interface InterfaceC5375b {
        /* renamed from: a */
        void mo25709a(Surface surface);

        /* renamed from: b */
        void mo25716b();
    }

    public l31(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m26343c() {
        Surface surface = this.f52232h;
        if (surface != null) {
            Iterator<InterfaceC5375b> it = this.f52225a.iterator();
            while (it.hasNext()) {
                it.next().mo25716b();
            }
        }
        SurfaceTexture surfaceTexture = this.f52231g;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
        this.f52231g = null;
        this.f52232h = null;
    }

    /* renamed from: d */
    private void m26344d() {
        boolean z = this.f52233i && this.f52234j;
        Sensor sensor = this.f52227c;
        if (sensor == null || z == this.f52235k) {
            return;
        }
        if (z) {
            this.f52226b.registerListener(this.f52228d, sensor, 0);
        } else {
            this.f52226b.unregisterListener(this.f52228d);
        }
        this.f52235k = z;
    }

    /* renamed from: b */
    public final me1 m26346b() {
        return this.f52230f;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f52229e.post(new gp1(this, 8));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f52234j = false;
        m26344d();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f52234j = true;
        m26344d();
    }

    public void setDefaultStereoMode(int i2) {
        this.f52230f.m29589a(i2);
    }

    public void setUseSensorRotation(boolean z) {
        this.f52233i = z;
        m26344d();
    }

    public l31(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52225a = new CopyOnWriteArrayList<>();
        this.f52229e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) C5220ia.m25469a(context.getSystemService("sensor"));
        this.f52226b = sensorManager;
        Sensor defaultSensor = s91.f54530a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f52227c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        wy0 wy0Var = new wy0();
        this.f52230f = wy0Var;
        C5374a c5374a = new C5374a(wy0Var);
        View.OnTouchListener r61Var = new r61(context, c5374a);
        this.f52228d = new ro0(((WindowManager) C5220ia.m25469a((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), r61Var, c5374a);
        this.f52233i = true;
        setEGLContextClientVersion(2);
        setRenderer(c5374a);
        setOnTouchListener(r61Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m26341b(SurfaceTexture surfaceTexture) {
        this.f52229e.post(new hn1(this, surfaceTexture, 23));
    }

    /* renamed from: a */
    public final InterfaceC6026xg m26345a() {
        return this.f52230f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m26338a(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f52231g;
        Surface surface = this.f52232h;
        Surface surface2 = new Surface(surfaceTexture);
        this.f52231g = surfaceTexture;
        this.f52232h = surface2;
        Iterator<InterfaceC5375b> it = this.f52225a.iterator();
        while (it.hasNext()) {
            it.next().mo25709a(surface2);
        }
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    @VisibleForTesting
    /* renamed from: com.yandex.mobile.ads.impl.l31$a */
    public final class C5374a implements GLSurfaceView.Renderer, r61.InterfaceC5675a, ro0.InterfaceC5702a {

        /* renamed from: a */
        private final wy0 f52236a;

        /* renamed from: d */
        private final float[] f52239d;

        /* renamed from: e */
        private final float[] f52240e;

        /* renamed from: f */
        private final float[] f52241f;

        /* renamed from: g */
        private float f52242g;

        /* renamed from: h */
        private float f52243h;

        /* renamed from: b */
        private final float[] f52237b = new float[16];

        /* renamed from: c */
        private final float[] f52238c = new float[16];

        /* renamed from: i */
        private final float[] f52244i = new float[16];

        /* renamed from: j */
        private final float[] f52245j = new float[16];

        public C5374a(wy0 wy0Var) {
            float[] fArr = new float[16];
            this.f52239d = fArr;
            float[] fArr2 = new float[16];
            this.f52240e = fArr2;
            float[] fArr3 = new float[16];
            this.f52241f = fArr3;
            this.f52236a = wy0Var;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f52243h = 3.1415927f;
        }

        @Override // com.yandex.mobile.ads.impl.ro0.InterfaceC5702a
        @BinderThread
        /* renamed from: a */
        public final synchronized void mo26348a(float[] fArr, float f2) {
            float[] fArr2 = this.f52239d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f3 = -f2;
            this.f52243h = f3;
            Matrix.setRotateM(this.f52240e, 0, -this.f52242g, (float) Math.cos(f3), (float) Math.sin(this.f52243h), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f52245j, 0, this.f52239d, 0, this.f52241f, 0);
                Matrix.multiplyMM(this.f52244i, 0, this.f52240e, 0, this.f52245j, 0);
            }
            Matrix.multiplyMM(this.f52238c, 0, this.f52237b, 0, this.f52244i, 0);
            this.f52236a.m29590a(this.f52238c);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i2, int i3) {
            GLES20.glViewport(0, 0, i2, i3);
            float f2 = i2 / i3;
            Matrix.perspectiveM(this.f52237b, 0, f2 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f2)) * 2.0d) : 90.0f, f2, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            l31.this.m26341b(this.f52236a.m29588a());
        }

        @UiThread
        /* renamed from: a */
        public final synchronized void m26347a(PointF pointF) {
            float f2 = pointF.y;
            this.f52242g = f2;
            Matrix.setRotateM(this.f52240e, 0, -f2, (float) Math.cos(this.f52243h), (float) Math.sin(this.f52243h), 0.0f);
            Matrix.setRotateM(this.f52241f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }
    }
}
