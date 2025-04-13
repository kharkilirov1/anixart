package com.google.android.exoplayer2.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@RequiresApi
/* loaded from: classes.dex */
public final class EGLSurfaceTexture implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: i */
    public static final int[] f14628i = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: b */
    public final Handler f14629b;

    /* renamed from: e */
    @Nullable
    public EGLDisplay f14632e;

    /* renamed from: f */
    @Nullable
    public EGLContext f14633f;

    /* renamed from: g */
    @Nullable
    public EGLSurface f14634g;

    /* renamed from: h */
    @Nullable
    public SurfaceTexture f14635h;

    /* renamed from: d */
    @Nullable
    public final TextureImageListener f14631d = null;

    /* renamed from: c */
    public final int[] f14630c = new int[1];

    public static final class GlException extends RuntimeException {
        public GlException(String str, C11711 c11711) {
            super(str);
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SecureMode {
    }

    public interface TextureImageListener {
        /* renamed from: a */
        void m7540a();
    }

    public EGLSurfaceTexture(Handler handler) {
        this.f14629b = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f14629b.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        TextureImageListener textureImageListener = this.f14631d;
        if (textureImageListener != null) {
            textureImageListener.m7540a();
        }
        SurfaceTexture surfaceTexture = this.f14635h;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
