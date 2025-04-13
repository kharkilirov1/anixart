package com.airbnb.epoxy;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class EpoxyAsyncUtil {

    /* renamed from: a */
    public static final Handler f6900a = m4512a(Looper.getMainLooper(), false);

    /* renamed from: b */
    public static final Handler f6901b = m4512a(Looper.getMainLooper(), true);

    /* renamed from: c */
    public static Handler f6902c;

    /* renamed from: a */
    public static Handler m4512a(Looper looper, boolean z) {
        if (!z) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (Throwable unused) {
            return new Handler(looper);
        }
    }
}
