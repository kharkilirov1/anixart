package com.yandex.mobile.ads.impl;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Locale;
import java.util.Objects;

@RequiresApi
/* renamed from: com.yandex.mobile.ads.impl.zq */
/* loaded from: classes3.dex */
public final class RunnableC6136zq implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: h */
    private static final int[] f57281h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: b */
    private final Handler f57282b;

    /* renamed from: c */
    private final int[] f57283c = new int[1];

    /* renamed from: d */
    @Nullable
    private EGLDisplay f57284d;

    /* renamed from: e */
    @Nullable
    private EGLContext f57285e;

    /* renamed from: f */
    @Nullable
    private EGLSurface f57286f;

    /* renamed from: g */
    @Nullable
    private SurfaceTexture f57287g;

    /* renamed from: com.yandex.mobile.ads.impl.zq$a */
    public static final class a extends RuntimeException {
        public /* synthetic */ a(String str, int i2) {
            this(str);
        }

        private a(String str) {
            super(str);
        }
    }

    public RunnableC6136zq(Handler handler) {
        this.f57282b = handler;
    }

    /* renamed from: a */
    public final SurfaceTexture m30277a() {
        SurfaceTexture surfaceTexture = this.f57287g;
        Objects.requireNonNull(surfaceTexture);
        return surfaceTexture;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final void m30279b() {
        this.f57282b.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f57287g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f57283c, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f57284d;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f57284d;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f57286f;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f57284d, this.f57286f);
            }
            EGLContext eGLContext = this.f57285e;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f57284d, eGLContext);
            }
            if (s91.f54530a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f57284d;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f57284d);
            }
            this.f57284d = null;
            this.f57285e = null;
            this.f57286f = null;
            this.f57287g = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f57282b.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f57287g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void m30278a(int i2) {
        EGLConfig eGLConfig;
        EGLSurface eglCreatePbufferSurface;
        int i3 = 0;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                this.f57284d = eglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, f57281h, 0, eGLConfigArr, 0, 1, iArr2, 0);
                if (eglChooseConfig && iArr2[0] > 0 && (eGLConfig = eGLConfigArr[0]) != null) {
                    EGLContext eglCreateContext = EGL14.eglCreateContext(this.f57284d, eGLConfig, EGL14.EGL_NO_CONTEXT, i2 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
                    if (eglCreateContext != null) {
                        this.f57285e = eglCreateContext;
                        EGLDisplay eGLDisplay = this.f57284d;
                        if (i2 == 1) {
                            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                        } else {
                            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i2 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                            if (eglCreatePbufferSurface == null) {
                                throw new a("eglCreatePbufferSurface failed", i3);
                            }
                        }
                        if (EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
                            this.f57286f = eglCreatePbufferSurface;
                            GLES20.glGenTextures(1, this.f57283c, 0);
                            C5660qx.m27792a();
                            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f57283c[0]);
                            this.f57287g = surfaceTexture;
                            surfaceTexture.setOnFrameAvailableListener(this);
                            return;
                        }
                        throw new a("eglMakeCurrent failed", i3);
                    }
                    throw new a("eglCreateContext failed", i3);
                }
                Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
                int i4 = s91.f54530a;
                throw new a(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), i3);
            }
            throw new a("eglInitialize failed", i3);
        }
        throw new a("eglGetDisplay failed", i3);
    }
}
