package com.google.android.exoplayer2.video.spherical;

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
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.AnyThread;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.motion.widget.RunnableC0207a;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.util.TimedValueQueue;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import com.google.android.exoplayer2.video.spherical.OrientationListener;
import com.google.android.exoplayer2.video.spherical.ProjectionRenderer;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.google.android.exoplayer2.video.spherical.TouchTracker;
import java.nio.Buffer;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes.dex */
public final class SphericalGLSurfaceView extends GLSurfaceView {

    /* renamed from: b */
    public final CopyOnWriteArrayList<VideoSurfaceListener> f14974b;

    /* renamed from: c */
    public final SensorManager f14975c;

    /* renamed from: d */
    @Nullable
    public final Sensor f14976d;

    /* renamed from: e */
    public final OrientationListener f14977e;

    /* renamed from: f */
    public final Handler f14978f;

    /* renamed from: g */
    public final SceneRenderer f14979g;

    /* renamed from: h */
    @Nullable
    public SurfaceTexture f14980h;

    /* renamed from: i */
    @Nullable
    public Surface f14981i;

    /* renamed from: j */
    public boolean f14982j;

    /* renamed from: k */
    public boolean f14983k;

    /* renamed from: l */
    public boolean f14984l;

    @VisibleForTesting
    public final class Renderer implements GLSurfaceView.Renderer, TouchTracker.Listener, OrientationListener.Listener {

        /* renamed from: b */
        public final SceneRenderer f14985b;

        /* renamed from: e */
        public final float[] f14988e;

        /* renamed from: f */
        public final float[] f14989f;

        /* renamed from: g */
        public final float[] f14990g;

        /* renamed from: h */
        public float f14991h;

        /* renamed from: i */
        public float f14992i;

        /* renamed from: c */
        public final float[] f14986c = new float[16];

        /* renamed from: d */
        public final float[] f14987d = new float[16];

        /* renamed from: j */
        public final float[] f14993j = new float[16];

        /* renamed from: k */
        public final float[] f14994k = new float[16];

        public Renderer(SceneRenderer sceneRenderer) {
            float[] fArr = new float[16];
            this.f14988e = fArr;
            float[] fArr2 = new float[16];
            this.f14989f = fArr2;
            float[] fArr3 = new float[16];
            this.f14990g = fArr3;
            this.f14985b = sceneRenderer;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f14992i = 3.1415927f;
        }

        @Override // com.google.android.exoplayer2.video.spherical.OrientationListener.Listener
        @BinderThread
        /* renamed from: a */
        public synchronized void mo7822a(float[] fArr, float f2) {
            float[] fArr2 = this.f14988e;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f14992i = -f2;
            m7828c();
        }

        @Override // com.google.android.exoplayer2.video.spherical.TouchTracker.Listener
        @UiThread
        /* renamed from: b */
        public synchronized void mo7827b(PointF pointF) {
            this.f14991h = pointF.y;
            m7828c();
            Matrix.setRotateM(this.f14990g, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        @AnyThread
        /* renamed from: c */
        public final void m7828c() {
            Matrix.setRotateM(this.f14989f, 0, -this.f14991h, (float) Math.cos(this.f14992i), (float) Math.sin(this.f14992i), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            Long m7688d;
            float[] fArr;
            synchronized (this) {
                Matrix.multiplyMM(this.f14994k, 0, this.f14988e, 0, this.f14990g, 0);
                Matrix.multiplyMM(this.f14993j, 0, this.f14989f, 0, this.f14994k, 0);
            }
            Matrix.multiplyMM(this.f14987d, 0, this.f14986c, 0, this.f14993j, 0);
            SceneRenderer sceneRenderer = this.f14985b;
            float[] fArr2 = this.f14987d;
            Objects.requireNonNull(sceneRenderer);
            GLES20.glClear(16384);
            GlUtil.m7555b();
            if (sceneRenderer.f14961b.compareAndSet(true, false)) {
                SurfaceTexture surfaceTexture = sceneRenderer.f14970k;
                Objects.requireNonNull(surfaceTexture);
                surfaceTexture.updateTexImage();
                GlUtil.m7555b();
                if (sceneRenderer.f14962c.compareAndSet(true, false)) {
                    Matrix.setIdentityM(sceneRenderer.f14967h, 0);
                }
                long timestamp = sceneRenderer.f14970k.getTimestamp();
                TimedValueQueue<Long> timedValueQueue = sceneRenderer.f14965f;
                synchronized (timedValueQueue) {
                    m7688d = timedValueQueue.m7688d(timestamp, false);
                }
                Long l2 = m7688d;
                if (l2 != null) {
                    FrameRotationQueue frameRotationQueue = sceneRenderer.f14964e;
                    float[] fArr3 = sceneRenderer.f14967h;
                    float[] m7689e = frameRotationQueue.f14923c.m7689e(l2.longValue());
                    if (m7689e != null) {
                        float[] fArr4 = frameRotationQueue.f14922b;
                        float f2 = m7689e[0];
                        float f3 = -m7689e[1];
                        float f4 = -m7689e[2];
                        float length = Matrix.length(f2, f3, f4);
                        if (length != 0.0f) {
                            fArr = fArr3;
                            Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees(length), f2 / length, f3 / length, f4 / length);
                        } else {
                            fArr = fArr3;
                            Matrix.setIdentityM(fArr4, 0);
                        }
                        if (!frameRotationQueue.f14924d) {
                            FrameRotationQueue.m7821a(frameRotationQueue.f14921a, frameRotationQueue.f14922b);
                            frameRotationQueue.f14924d = true;
                        }
                        Matrix.multiplyMM(fArr, 0, frameRotationQueue.f14921a, 0, frameRotationQueue.f14922b, 0);
                    }
                }
                Projection m7689e2 = sceneRenderer.f14966g.m7689e(timestamp);
                if (m7689e2 != null) {
                    ProjectionRenderer projectionRenderer = sceneRenderer.f14963d;
                    Objects.requireNonNull(projectionRenderer);
                    if (ProjectionRenderer.m7824a(m7689e2)) {
                        projectionRenderer.f14948a = m7689e2.f14934c;
                        ProjectionRenderer.MeshData meshData = new ProjectionRenderer.MeshData(m7689e2.f14932a.f14936a[0]);
                        projectionRenderer.f14949b = meshData;
                        if (!m7689e2.f14935d) {
                            meshData = new ProjectionRenderer.MeshData(m7689e2.f14933b.f14936a[0]);
                        }
                        projectionRenderer.f14950c = meshData;
                    }
                }
            }
            Matrix.multiplyMM(sceneRenderer.f14968i, 0, fArr2, 0, sceneRenderer.f14967h, 0);
            ProjectionRenderer projectionRenderer2 = sceneRenderer.f14963d;
            int i2 = sceneRenderer.f14969j;
            float[] fArr5 = sceneRenderer.f14968i;
            ProjectionRenderer.MeshData meshData2 = projectionRenderer2.f14949b;
            if (meshData2 == null) {
                return;
            }
            GlUtil.Program program = projectionRenderer2.f14951d;
            Objects.requireNonNull(program);
            program.m7565c();
            GlUtil.m7555b();
            GLES20.glEnableVertexAttribArray(projectionRenderer2.f14954g);
            GLES20.glEnableVertexAttribArray(projectionRenderer2.f14955h);
            GlUtil.m7555b();
            int i3 = projectionRenderer2.f14948a;
            GLES20.glUniformMatrix3fv(projectionRenderer2.f14953f, 1, false, i3 == 1 ? ProjectionRenderer.f14944m : i3 == 2 ? ProjectionRenderer.f14946o : ProjectionRenderer.f14943l, 0);
            GLES20.glUniformMatrix4fv(projectionRenderer2.f14952e, 1, false, fArr5, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i2);
            GLES20.glUniform1i(projectionRenderer2.f14956i, 0);
            GlUtil.m7555b();
            GLES20.glVertexAttribPointer(projectionRenderer2.f14954g, 3, 5126, false, 12, (Buffer) meshData2.f14958b);
            GlUtil.m7555b();
            GLES20.glVertexAttribPointer(projectionRenderer2.f14955h, 2, 5126, false, 8, (Buffer) meshData2.f14959c);
            GlUtil.m7555b();
            GLES20.glDrawArrays(meshData2.f14960d, 0, meshData2.f14957a);
            GlUtil.m7555b();
            GLES20.glDisableVertexAttribArray(projectionRenderer2.f14954g);
            GLES20.glDisableVertexAttribArray(projectionRenderer2.f14955h);
        }

        @Override // com.google.android.exoplayer2.video.spherical.TouchTracker.Listener
        @UiThread
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return SphericalGLSurfaceView.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i2, int i3) {
            GLES20.glViewport(0, 0, i2, i3);
            float f2 = i2 / i3;
            Matrix.perspectiveM(this.f14986c, 0, f2 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f2)) * 2.0d) : 90.0f, f2, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            SphericalGLSurfaceView sphericalGLSurfaceView = SphericalGLSurfaceView.this;
            sphericalGLSurfaceView.f14978f.post(new RunnableC0207a(sphericalGLSurfaceView, this.f14985b.m7825b(), 12));
        }
    }

    public interface VideoSurfaceListener {
        /* renamed from: k */
        void mo5961k(Surface surface);

        /* renamed from: p */
        void mo5966p(Surface surface);
    }

    public SphericalGLSurfaceView(Context context) {
        super(context, null);
        this.f14974b = new CopyOnWriteArrayList<>();
        this.f14978f = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        Objects.requireNonNull(systemService);
        SensorManager sensorManager = (SensorManager) systemService;
        this.f14975c = sensorManager;
        Sensor defaultSensor = Util.f14736a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f14976d = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        SceneRenderer sceneRenderer = new SceneRenderer();
        this.f14979g = sceneRenderer;
        Renderer renderer = new Renderer(sceneRenderer);
        View.OnTouchListener touchTracker = new TouchTracker(context, renderer, 25.0f);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Objects.requireNonNull(windowManager);
        this.f14977e = new OrientationListener(windowManager.getDefaultDisplay(), touchTracker, renderer);
        this.f14982j = true;
        setEGLContextClientVersion(2);
        setRenderer(renderer);
        setOnTouchListener(touchTracker);
    }

    /* renamed from: a */
    public final void m7826a() {
        boolean z = this.f14982j && this.f14983k;
        Sensor sensor = this.f14976d;
        if (sensor == null || z == this.f14984l) {
            return;
        }
        if (z) {
            this.f14975c.registerListener(this.f14977e, sensor, 0);
        } else {
            this.f14975c.unregisterListener(this.f14977e);
        }
        this.f14984l = z;
    }

    public CameraMotionListener getCameraMotionListener() {
        return this.f14979g;
    }

    public VideoFrameMetadataListener getVideoFrameMetadataListener() {
        return this.f14979g;
    }

    @Nullable
    public Surface getVideoSurface() {
        return this.f14981i;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f14978f.post(new Runnable() { // from class: com.google.android.exoplayer2.video.spherical.b
            @Override // java.lang.Runnable
            public final void run() {
                SphericalGLSurfaceView sphericalGLSurfaceView = SphericalGLSurfaceView.this;
                Surface surface = sphericalGLSurfaceView.f14981i;
                if (surface != null) {
                    Iterator<SphericalGLSurfaceView.VideoSurfaceListener> it = sphericalGLSurfaceView.f14974b.iterator();
                    while (it.hasNext()) {
                        it.next().mo5961k(surface);
                    }
                }
                SurfaceTexture surfaceTexture = sphericalGLSurfaceView.f14980h;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                sphericalGLSurfaceView.f14980h = null;
                sphericalGLSurfaceView.f14981i = null;
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f14983k = false;
        m7826a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f14983k = true;
        m7826a();
    }

    public void setDefaultStereoMode(int i2) {
        this.f14979g.f14971l = i2;
    }

    public void setUseSensorRotation(boolean z) {
        this.f14982j = z;
        m7826a();
    }
}
