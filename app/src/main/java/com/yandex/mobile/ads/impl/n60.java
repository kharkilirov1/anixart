package com.yandex.mobile.ads.impl;

import android.util.Log;
import com.yandex.mobile.ads.BuildConfigFieldProvider;
import java.util.Locale;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class n60 {

    /* renamed from: a */
    public static final boolean f52852a = BuildConfigFieldProvider.isWithLogs();

    /* renamed from: a */
    public static void m26808a(Throwable th, String str, Object... objArr) {
        if (f52852a) {
            Log.e("Yandex Mobile Ads Debug", m26807a(str, objArr), th);
        }
    }

    /* renamed from: b */
    public static void m26809b(String str, Object... objArr) {
        if (f52852a) {
            Log.d("Yandex Mobile Ads Debug", m26807a(str, objArr));
        }
    }

    /* renamed from: c */
    public static void m26810c(String str, Object... objArr) {
        if (f52852a) {
            Log.e("Yandex Mobile Ads Debug", m26807a(str, objArr));
        }
    }

    /* renamed from: d */
    public static void m26811d(String str, Object... objArr) {
        if (f52852a) {
            Log.i("Yandex Mobile Ads Debug", m26807a(str, objArr));
        }
    }

    /* renamed from: e */
    public static void m26812e(String str, Object... objArr) {
        if (f52852a) {
            Log.v("Yandex Mobile Ads Debug", m26807a(str, objArr));
        }
    }

    /* renamed from: f */
    public static void m26813f(String str, Object... objArr) {
        if (f52852a) {
            Log.w("Yandex Mobile Ads Debug", m26807a(str, objArr));
        }
    }

    /* renamed from: a */
    public static String m26807a(String str, Object... objArr) {
        String str2;
        if (objArr.length != 0) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i2 = 2;
        while (true) {
            if (i2 >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            }
            if (!stackTrace[i2].getClass().equals(n60.class)) {
                String className = stackTrace[i2].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                StringBuilder m27x = C0000a.m27x(substring.substring(substring.lastIndexOf(36) + 1), ".");
                m27x.append(stackTrace[i2].getMethodName());
                str2 = m27x.toString();
                break;
            }
            i2++;
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }
}
