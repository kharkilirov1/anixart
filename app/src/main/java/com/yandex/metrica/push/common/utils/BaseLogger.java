package com.yandex.metrica.push.common.utils;

import android.os.Process;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;
import p000a.C0000a;

/* loaded from: classes2.dex */
public abstract class BaseLogger {
    public volatile boolean isEnabled = false;

    @NonNull
    /* renamed from: a */
    private String m21362a(@Nullable String str) {
        return str == null ? "" : str;
    }

    @NonNull
    /* renamed from: a */
    private String m21363a(@NonNull String str, @Nullable Object[] objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i2 = 5; i2 < stackTrace.length; i2++) {
            Class<? super Object> superclass = stackTrace[i2].getClass().getSuperclass();
            if (superclass == null || !superclass.equals(BaseLogger.class)) {
                String className = stackTrace[i2].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                StringBuilder m27x = C0000a.m27x(substring.substring(substring.lastIndexOf(36) + 1), ".");
                m27x.append(stackTrace[i2].getMethodName());
                str2 = m27x.toString();
                break;
            }
        }
        str2 = "<unknown>";
        return String.format(Locale.US, "[%d/%d] %s: %s", Integer.valueOf(Process.myPid()), Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    @NonNull
    /* renamed from: b */
    private String m21364b(@Nullable String str, @Nullable Object[] objArr) {
        return mo21365a() + m21363a(m21362a(str), objArr);
    }

    /* renamed from: a */
    public abstract String mo21365a();

    /* renamed from: b */
    public abstract String mo21366b();

    public void log(int i2, @Nullable String str, @Nullable Object... objArr) {
        if (shouldLog()) {
            Log.println(i2, mo21366b(), m21364b(str, objArr));
        }
    }

    public boolean shouldLog() {
        return this.isEnabled;
    }

    public void log(int i2, @Nullable Throwable th, @Nullable String str, @Nullable Object... objArr) {
        if (shouldLog()) {
            Log.println(i2, mo21366b(), m21364b(str, objArr) + "\n" + Log.getStackTraceString(th));
        }
    }
}
