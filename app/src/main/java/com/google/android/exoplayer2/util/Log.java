package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: classes.dex */
public final class Log {
    @Pure
    /* renamed from: a */
    public static String m7584a(String str, @Nullable Throwable th) {
        String m7586c = m7586c(th);
        if (TextUtils.isEmpty(m7586c)) {
            return str;
        }
        String valueOf = String.valueOf(str);
        String replace = m7586c.replace("\n", "\n  ");
        StringBuilder sb = new StringBuilder(C0576a.m4106e(replace, valueOf.length() + 4));
        sb.append(valueOf);
        sb.append("\n  ");
        sb.append(replace);
        sb.append('\n');
        return sb.toString();
    }

    @Pure
    /* renamed from: b */
    public static void m7585b(String str, String str2, @Nullable Throwable th) {
        android.util.Log.e(str, m7584a(str2, th));
    }

    @Nullable
    @Pure
    /* renamed from: c */
    public static String m7586c(@Nullable Throwable th) {
        boolean z;
        if (th == null) {
            return null;
        }
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
        return z ? "UnknownHostException (no network)" : android.util.Log.getStackTraceString(th).trim().replace("\t", "    ");
    }

    @Pure
    /* renamed from: d */
    public static void m7587d(String str, String str2, @Nullable Throwable th) {
        android.util.Log.i(str, m7584a(str2, th));
    }

    @Pure
    /* renamed from: e */
    public static void m7588e(String str, String str2, @Nullable Throwable th) {
        android.util.Log.w(str, m7584a(str2, th));
    }
}
