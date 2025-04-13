package com.google.android.datatransport.runtime.logging;

import android.os.Build;
import android.util.Log;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class Logging {
    /* renamed from: a */
    public static void m5544a(String str, String str2, Object obj) {
        String m5547d = m5547d(str);
        if (Log.isLoggable(m5547d, 3)) {
            Log.d(m5547d, String.format(str2, obj));
        }
    }

    /* renamed from: b */
    public static void m5545b(String str, String str2, Object... objArr) {
        String m5547d = m5547d(str);
        if (Log.isLoggable(m5547d, 3)) {
            Log.d(m5547d, String.format(str2, objArr));
        }
    }

    /* renamed from: c */
    public static void m5546c(String str, String str2, Throwable th) {
        String m5547d = m5547d(str);
        if (Log.isLoggable(m5547d, 6)) {
            Log.e(m5547d, str2, th);
        }
    }

    /* renamed from: d */
    public static String m5547d(String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0000a.m14k("TRuntime.", str);
        }
        String m14k = C0000a.m14k("TRuntime.", str);
        return m14k.length() > 23 ? m14k.substring(0, 23) : m14k;
    }

    /* renamed from: e */
    public static void m5548e(String str, String str2, Object obj) {
        String m5547d = m5547d(str);
        if (Log.isLoggable(m5547d, 4)) {
            Log.i(m5547d, String.format(str2, obj));
        }
    }
}
