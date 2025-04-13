package com.google.android.exoplayer2.util;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.room.util.C0576a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes.dex */
public final class GlUtil {

    @RequiresApi
    public static final class Api17 {
        @DoNotInline
        /* renamed from: a */
        public static EGLContext m7557a(EGLDisplay eGLDisplay) throws UnsupportedEglVersionException {
            EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, m7561e(eGLDisplay), EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
            if (eglCreateContext != null) {
                GlUtil.m7555b();
                return eglCreateContext;
            }
            EGL14.eglTerminate(eGLDisplay);
            throw new UnsupportedEglVersionException();
        }

        @DoNotInline
        /* renamed from: b */
        public static EGLDisplay m7558b() {
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            GlUtil.m7554a(!eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
            if (!EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0)) {
                android.util.Log.e("GlUtil", "Error in eglInitialize.");
            }
            GlUtil.m7555b();
            return eglGetDisplay;
        }

        @DoNotInline
        /* renamed from: c */
        public static void m7559c(@Nullable EGLDisplay eGLDisplay, @Nullable EGLContext eGLContext) {
            if (eGLDisplay == null) {
                return;
            }
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            int eglGetError = EGL14.eglGetError();
            boolean z = eglGetError == 12288;
            StringBuilder sb = new StringBuilder(36);
            sb.append("Error releasing context: ");
            sb.append(eglGetError);
            GlUtil.m7554a(z, sb.toString());
            if (eGLContext != null) {
                EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                int eglGetError2 = EGL14.eglGetError();
                boolean z2 = eglGetError2 == 12288;
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Error destroying context: ");
                sb2.append(eglGetError2);
                GlUtil.m7554a(z2, sb2.toString());
            }
            EGL14.eglReleaseThread();
            int eglGetError3 = EGL14.eglGetError();
            boolean z3 = eglGetError3 == 12288;
            StringBuilder sb3 = new StringBuilder(35);
            sb3.append("Error releasing thread: ");
            sb3.append(eglGetError3);
            GlUtil.m7554a(z3, sb3.toString());
            EGL14.eglTerminate(eGLDisplay);
            int eglGetError4 = EGL14.eglGetError();
            boolean z4 = eglGetError4 == 12288;
            StringBuilder sb4 = new StringBuilder(38);
            sb4.append("Error terminating display: ");
            sb4.append(eglGetError4);
            GlUtil.m7554a(z4, sb4.toString());
        }

        @DoNotInline
        /* renamed from: d */
        public static void m7560d(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i2, int i3) {
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(36006, iArr, 0);
            if (iArr[0] != 0) {
                GLES20.glBindFramebuffer(36160, 0);
            }
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
            GLES20.glViewport(0, 0, i2, i3);
        }

        @DoNotInline
        /* renamed from: e */
        private static EGLConfig m7561e(EGLDisplay eGLDisplay) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!EGL14.eglChooseConfig(eGLDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                android.util.Log.e("GlUtil", "eglChooseConfig failed.");
            }
            return eGLConfigArr[0];
        }

        @DoNotInline
        /* renamed from: f */
        public static EGLSurface m7562f(EGLDisplay eGLDisplay, Object obj) {
            return EGL14.eglCreateWindowSurface(eGLDisplay, m7561e(eGLDisplay), obj, new int[]{12344}, 0);
        }
    }

    public static final class Attribute {
    }

    public static final class GlException extends RuntimeException {
    }

    public static final class Uniform {
    }

    public static final class UnsupportedEglVersionException extends Exception {
    }

    /* renamed from: a */
    public static void m7554a(boolean z, String str) {
        if (z) {
            return;
        }
        android.util.Log.e("GlUtil", str);
    }

    /* renamed from: b */
    public static void m7555b() {
        int i2 = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
            android.util.Log.e("GlUtil", valueOf.length() != 0 ? "glError ".concat(valueOf) : new String("glError "));
            i2 = glGetError;
        }
        if (i2 != 0) {
            String valueOf2 = String.valueOf(GLU.gluErrorString(i2));
            android.util.Log.e("GlUtil", valueOf2.length() != 0 ? "glError ".concat(valueOf2) : new String("glError "));
        }
    }

    /* renamed from: c */
    public static FloatBuffer m7556c(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static final class Program {

        /* renamed from: a */
        public final int f14640a;

        public Program(String str, String str2) {
            this.f14640a = GLES20.glCreateProgram();
            GlUtil.m7555b();
            m7563a(35633, str);
            m7563a(35632, str2);
        }

        /* renamed from: a */
        public final void m7563a(int i2, String str) {
            int glCreateShader = GLES20.glCreateShader(i2);
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = {0};
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] != 1) {
                String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
                StringBuilder sb = new StringBuilder(C0576a.m4106e(str, C0576a.m4106e(glGetShaderInfoLog, 10)));
                sb.append(glGetShaderInfoLog);
                sb.append(", source: ");
                sb.append(str);
                android.util.Log.e("GlUtil", sb.toString());
            }
            GLES20.glAttachShader(this.f14640a, glCreateShader);
            GLES20.glDeleteShader(glCreateShader);
            GlUtil.m7555b();
        }

        /* renamed from: b */
        public int m7564b(String str) {
            return GLES20.glGetUniformLocation(this.f14640a, str);
        }

        /* renamed from: c */
        public void m7565c() {
            GLES20.glLinkProgram(this.f14640a);
            int[] iArr = {0};
            GLES20.glGetProgramiv(this.f14640a, 35714, iArr, 0);
            if (iArr[0] != 1) {
                String valueOf = String.valueOf(GLES20.glGetProgramInfoLog(this.f14640a));
                android.util.Log.e("GlUtil", valueOf.length() != 0 ? "Unable to link shader program: \n".concat(valueOf) : new String("Unable to link shader program: \n"));
            }
            GlUtil.m7555b();
            GLES20.glUseProgram(this.f14640a);
        }

        public Program(String[] strArr, String[] strArr2) {
            String join = TextUtils.join("\n", strArr);
            String join2 = TextUtils.join("\n", strArr2);
            this.f14640a = GLES20.glCreateProgram();
            GlUtil.m7555b();
            m7563a(35633, join);
            m7563a(35632, join2);
        }
    }
}
