package com.yandex.metrica.impl.p022ac;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3658U2;
import dalvik.system.PathClassLoader;

/* loaded from: classes2.dex */
public class HandlerRunner {
    @SuppressLint
    /* renamed from: a */
    private static void m17804a(@NonNull String str) {
        try {
            String findLibrary = new PathClassLoader(System.getProperty("java.class.path"), System.getProperty("java.library.path"), ClassLoader.getSystemClassLoader()).findLibrary(str);
            if (findLibrary != null) {
                System.load(findLibrary);
            }
        } catch (Throwable unused) {
        }
    }

    public static void main(String[] strArr) {
        if (C3658U2.m19211a(24)) {
            try {
                System.loadLibrary("appmetrica-native-runner");
            } catch (Throwable unused) {
                m17804a("appmetrica-native-runner");
            }
        } else {
            m17804a("appmetrica-native-runner");
        }
        runHandler(strArr);
    }

    private static native void runHandler(String[] strArr);
}
