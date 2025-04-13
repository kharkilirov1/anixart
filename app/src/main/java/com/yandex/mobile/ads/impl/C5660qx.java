package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: com.yandex.mobile.ads.impl.qx */
/* loaded from: classes3.dex */
public final class C5660qx {

    /* renamed from: a */
    private static final C5717rx f54141a = ct0.m23511c();

    /* renamed from: b */
    public static final /* synthetic */ int f54142b = 0;

    /* renamed from: a */
    public static boolean m27794a(Context context) {
        String eglQueryString;
        int i2 = s91.f54530a;
        if (i2 < 24) {
            return false;
        }
        if (i2 < 26) {
            C5717rx c5717rx = f54141a;
            if (c5717rx.m28028a().equals(s91.f54532c) || c5717rx.m28029b().equals(s91.f54533d)) {
                return false;
            }
        }
        return (i2 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content");
    }

    /* renamed from: b */
    public static int m27795b() {
        if (!(!s91.m28112a(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT))) {
            d90.m23839b("GlUtil", "No current context");
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        m27792a();
        int i2 = iArr[0];
        GLES20.glBindTexture(36197, i2);
        m27792a();
        GLES20.glTexParameteri(36197, 10240, 9729);
        m27792a();
        GLES20.glTexParameteri(36197, 10241, 9729);
        m27792a();
        GLES20.glTexParameteri(36197, 10242, 33071);
        m27792a();
        GLES20.glTexParameteri(36197, 10243, 33071);
        m27792a();
        return i2;
    }

    /* renamed from: c */
    public static boolean m27796c() {
        String eglQueryString;
        return s91.f54530a >= 17 && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_KHR_surfaceless_context");
    }

    /* renamed from: a */
    public static void m27792a() {
        int i2 = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            StringBuilder m26356a = l60.m26356a("glError: ");
            m26356a.append(GLU.gluErrorString(glGetError));
            d90.m23839b("GlUtil", m26356a.toString());
            i2 = glGetError;
        }
        if (i2 != 0) {
            StringBuilder m26356a2 = l60.m26356a("glError: ");
            m26356a2.append(GLU.gluErrorString(i2));
            d90.m23839b("GlUtil", m26356a2.toString());
        }
    }

    /* renamed from: a */
    public static FloatBuffer m27791a(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    /* renamed from: a */
    public static void m27793a(String str) {
        d90.m23839b("GlUtil", str);
    }
}
