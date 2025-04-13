package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class d90 {

    /* renamed from: a */
    private static final Object f49605a = new Object();

    @Pure
    /* renamed from: a */
    public static void m23837a(@Size String str, String str2) {
        synchronized (f49605a) {
            Log.d(str, str2);
        }
    }

    @Pure
    /* renamed from: b */
    public static void m23840b(@Size String str, String str2, @Nullable Throwable th) {
        m23842d(str, m23835a(str2, th));
    }

    @Pure
    /* renamed from: c */
    public static void m23841c(@Size String str, String str2) {
        synchronized (f49605a) {
            Log.i(str, str2);
        }
    }

    @Pure
    /* renamed from: d */
    public static void m23842d(@Size String str, String str2) {
        synchronized (f49605a) {
            Log.w(str, str2);
        }
    }

    @Pure
    /* renamed from: b */
    public static void m23839b(@Size String str, String str2) {
        synchronized (f49605a) {
            Log.e(str, str2);
        }
    }

    @Pure
    /* renamed from: a */
    public static void m23836a(String str, @Nullable Exception exc) {
        m23841c("BundleUtil", m23835a(str, (Throwable) exc));
    }

    @Pure
    /* renamed from: a */
    public static void m23838a(@Size String str, String str2, @Nullable Throwable th) {
        m23839b(str, m23835a(str2, th));
    }

    @Pure
    /* renamed from: a */
    private static String m23835a(String str, @Nullable Throwable th) {
        boolean z;
        String replace;
        synchronized (f49605a) {
            try {
                if (th == null) {
                    replace = null;
                } else {
                    Throwable th2 = th;
                    while (true) {
                        if (th2 == null) {
                            z = false;
                            break;
                        }
                        if (th2 instanceof UnknownHostException) {
                            z = true;
                            break;
                        }
                        th2 = th2.getCause();
                    }
                    replace = z ? "UnknownHostException (no network)" : Log.getStackTraceString(th).trim().replace("\t", "    ");
                }
            } finally {
            }
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        StringBuilder m27x = C0000a.m27x(str, "\n  ");
        m27x.append(replace.replace("\n", "\n  "));
        m27x.append('\n');
        return m27x.toString();
    }
}
