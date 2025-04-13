package com.google.protobuf;

/* loaded from: classes2.dex */
final class ByteBufferWriter {
    static {
        Class<?> cls;
        new ThreadLocal();
        try {
            cls = Class.forName("java.io.FileOutputStream");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                if (UnsafeUtil.f24392g) {
                    UnsafeUtil.m13693t(cls.getDeclaredField("channel"));
                }
            } catch (Throwable unused2) {
            }
        }
    }
}
