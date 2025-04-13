package com.google.android.play.core.internal;

import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzci {
    /* renamed from: a */
    public static <T> T m10890a(T t, Object obj) {
        Objects.requireNonNull(t, (String) obj);
        return t;
    }

    /* renamed from: b */
    public static void m10891b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
