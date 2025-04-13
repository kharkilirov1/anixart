package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.EGLSurfaceTexture;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.util.Objects;

@RequiresApi
/* loaded from: classes.dex */
public final class DummySurface extends Surface {

    /* renamed from: e */
    public static int f14790e;

    /* renamed from: f */
    public static boolean f14791f;

    /* renamed from: b */
    public final boolean f14792b;

    /* renamed from: c */
    public final DummySurfaceThread f14793c;

    /* renamed from: d */
    public boolean f14794d;

    public static class DummySurfaceThread extends HandlerThread implements Handler.Callback {

        /* renamed from: b */
        public EGLSurfaceTexture f14795b;

        /* renamed from: c */
        public Handler f14796c;

        /* renamed from: d */
        @Nullable
        public Error f14797d;

        /* renamed from: e */
        @Nullable
        public RuntimeException f14798e;

        /* renamed from: f */
        @Nullable
        public DummySurface f14799f;

        public DummySurfaceThread() {
            super("ExoPlayer:DummySurface");
        }

        /* renamed from: a */
        public final void m7780a(int i2) {
            EGLSurface eglCreatePbufferSurface;
            Objects.requireNonNull(this.f14795b);
            EGLSurfaceTexture eGLSurfaceTexture = this.f14795b;
            Objects.requireNonNull(eGLSurfaceTexture);
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            if (eglGetDisplay == null) {
                throw new EGLSurfaceTexture.GlException("eglGetDisplay failed", null);
            }
            int[] iArr = new int[2];
            if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                throw new EGLSurfaceTexture.GlException("eglInitialize failed", null);
            }
            eGLSurfaceTexture.f14632e = eglGetDisplay;
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, EGLSurfaceTexture.f14628i, 0, eGLConfigArr, 0, 1, iArr2, 0);
            if (!eglChooseConfig || iArr2[0] <= 0 || eGLConfigArr[0] == null) {
                throw new EGLSurfaceTexture.GlException(Util.m7747p("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]), null);
            }
            EGLConfig eGLConfig = eGLConfigArr[0];
            EGLContext eglCreateContext = EGL14.eglCreateContext(eGLSurfaceTexture.f14632e, eGLConfig, EGL14.EGL_NO_CONTEXT, i2 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
            if (eglCreateContext == null) {
                throw new EGLSurfaceTexture.GlException("eglCreateContext failed", null);
            }
            eGLSurfaceTexture.f14633f = eglCreateContext;
            EGLDisplay eGLDisplay = eGLSurfaceTexture.f14632e;
            if (i2 == 1) {
                eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
            } else {
                eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i2 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                if (eglCreatePbufferSurface == null) {
                    throw new EGLSurfaceTexture.GlException("eglCreatePbufferSurface failed", null);
                }
            }
            if (!EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
                throw new EGLSurfaceTexture.GlException("eglMakeCurrent failed", null);
            }
            eGLSurfaceTexture.f14634g = eglCreatePbufferSurface;
            GLES20.glGenTextures(1, eGLSurfaceTexture.f14630c, 0);
            GlUtil.m7555b();
            SurfaceTexture surfaceTexture = new SurfaceTexture(eGLSurfaceTexture.f14630c[0]);
            eGLSurfaceTexture.f14635h = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(eGLSurfaceTexture);
            SurfaceTexture surfaceTexture2 = this.f14795b.f14635h;
            Objects.requireNonNull(surfaceTexture2);
            this.f14799f = new DummySurface(this, surfaceTexture2, i2 != 0, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public final void m7781b() {
            Objects.requireNonNull(this.f14795b);
            EGLSurfaceTexture eGLSurfaceTexture = this.f14795b;
            eGLSurfaceTexture.f14629b.removeCallbacks(eGLSurfaceTexture);
            try {
                SurfaceTexture surfaceTexture = eGLSurfaceTexture.f14635h;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, eGLSurfaceTexture.f14630c, 0);
                }
            } finally {
                EGLDisplay eGLDisplay = eGLSurfaceTexture.f14632e;
                if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGLDisplay eGLDisplay2 = eGLSurfaceTexture.f14632e;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface2 = eGLSurfaceTexture.f14634g;
                if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(eGLSurfaceTexture.f14632e, eGLSurfaceTexture.f14634g);
                }
                EGLContext eGLContext = eGLSurfaceTexture.f14633f;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(eGLSurfaceTexture.f14632e, eGLContext);
                }
                if (Util.f14736a >= 19) {
                    EGL14.eglReleaseThread();
                }
                EGLDisplay eGLDisplay3 = eGLSurfaceTexture.f14632e;
                if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(eGLSurfaceTexture.f14632e);
                }
                eGLSurfaceTexture.f14632e = null;
                eGLSurfaceTexture.f14633f = null;
                eGLSurfaceTexture.f14634g = null;
                eGLSurfaceTexture.f14635h = null;
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            try {
                if (i2 != 1) {
                    if (i2 != 2) {
                        return true;
                    }
                    try {
                        m7781b();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    m7780a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    Log.m7585b("DummySurface", "Failed to initialize dummy surface", e2);
                    this.f14797d = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    Log.m7585b("DummySurface", "Failed to initialize dummy surface", e3);
                    this.f14798e = e3;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }
    }

    public DummySurface(DummySurfaceThread dummySurfaceThread, SurfaceTexture surfaceTexture, boolean z, C11781 c11781) {
        super(surfaceTexture);
        this.f14793c = dummySurfaceThread;
        this.f14792b = z;
    }

    /* renamed from: a */
    public static int m7777a(Context context) {
        String eglQueryString;
        String eglQueryString2;
        int i2 = Util.f14736a;
        boolean z = false;
        if (!(i2 >= 24 && (i2 >= 26 || !("samsung".equals(Util.f14738c) || "XT1650".equals(Util.f14739d))) && ((i2 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString2.contains("EGL_EXT_protected_content")))) {
            return 0;
        }
        if (i2 >= 17 && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_KHR_surfaceless_context")) {
            z = true;
        }
        return z ? 1 : 2;
    }

    /* renamed from: c */
    public static synchronized boolean m7778c(Context context) {
        boolean z;
        synchronized (DummySurface.class) {
            if (!f14791f) {
                f14790e = m7777a(context);
                f14791f = true;
            }
            z = f14790e != 0;
        }
        return z;
    }

    /* renamed from: d */
    public static DummySurface m7779d(Context context, boolean z) {
        boolean z2 = false;
        Assertions.m7516d(!z || m7778c(context));
        DummySurfaceThread dummySurfaceThread = new DummySurfaceThread();
        int i2 = z ? f14790e : 0;
        dummySurfaceThread.start();
        Handler handler = new Handler(dummySurfaceThread.getLooper(), dummySurfaceThread);
        dummySurfaceThread.f14796c = handler;
        dummySurfaceThread.f14795b = new EGLSurfaceTexture(handler);
        synchronized (dummySurfaceThread) {
            dummySurfaceThread.f14796c.obtainMessage(1, i2, 0).sendToTarget();
            while (dummySurfaceThread.f14799f == null && dummySurfaceThread.f14798e == null && dummySurfaceThread.f14797d == null) {
                try {
                    dummySurfaceThread.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = dummySurfaceThread.f14798e;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = dummySurfaceThread.f14797d;
        if (error != null) {
            throw error;
        }
        DummySurface dummySurface = dummySurfaceThread.f14799f;
        Objects.requireNonNull(dummySurface);
        return dummySurface;
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f14793c) {
            if (!this.f14794d) {
                DummySurfaceThread dummySurfaceThread = this.f14793c;
                Objects.requireNonNull(dummySurfaceThread.f14796c);
                dummySurfaceThread.f14796c.sendEmptyMessage(2);
                this.f14794d = true;
            }
        }
    }
}
