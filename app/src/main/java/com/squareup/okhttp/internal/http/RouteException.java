package com.squareup.okhttp.internal.http;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class RouteException extends Exception {

    /* renamed from: b */
    public static final Method f25183b;

    static {
        Method method;
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
            method = null;
        }
        f25183b = method;
    }
}
