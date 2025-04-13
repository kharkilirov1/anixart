package com.yandex.metrica.push.common.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class PLog extends BaseLogger {

    /* renamed from: a */
    private static final BaseLogger f47247a = new PLog();

    private PLog() {
    }

    /* renamed from: d */
    public static void m21377d(@Nullable String str, @Nullable Object... objArr) {
        f47247a.log(3, str, objArr);
    }

    /* renamed from: e */
    public static void m21378e(@Nullable String str, @Nullable Object... objArr) {
        f47247a.log(6, str, objArr);
    }

    /* renamed from: i */
    public static void m21380i(@Nullable String str, @Nullable Object... objArr) {
        f47247a.log(4, str, objArr);
    }

    /* renamed from: w */
    public static void m21381w(@Nullable String str, @Nullable Object... objArr) {
        f47247a.log(5, str, objArr);
    }

    @Override // com.yandex.metrica.push.common.utils.BaseLogger
    @NonNull
    /* renamed from: a */
    public String mo21365a() {
        return "";
    }

    @Override // com.yandex.metrica.push.common.utils.BaseLogger
    @NonNull
    /* renamed from: b */
    public String mo21366b() {
        return "AppMetricaPushDebug";
    }

    @Override // com.yandex.metrica.push.common.utils.BaseLogger
    public boolean shouldLog() {
        return true;
    }

    /* renamed from: e */
    public static void m21379e(@Nullable Throwable th, @Nullable String str, @Nullable Object... objArr) {
        f47247a.log(6, th, str, objArr);
    }
}
