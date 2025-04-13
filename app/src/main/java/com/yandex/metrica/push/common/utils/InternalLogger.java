package com.yandex.metrica.push.common.utils;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public class InternalLogger extends BaseLogger {

    /* renamed from: a */
    private static final BaseLogger f47246a = new InternalLogger();

    private InternalLogger() {
    }

    /* renamed from: d */
    public static void m21367d(@Nullable String str, @Nullable Object... objArr) {
        f47246a.log(3, str, objArr);
    }

    /* renamed from: e */
    public static void m21368e(@Nullable String str, @Nullable Object... objArr) {
        f47246a.log(6, str, objArr);
    }

    /* renamed from: i */
    public static void m21370i(@Nullable String str, @Nullable Object... objArr) {
        f47246a.log(4, str, objArr);
    }

    public static void setEnabled() {
        f47246a.isEnabled = true;
    }

    /* renamed from: w */
    public static void m21371w(@Nullable String str, @Nullable Object... objArr) {
        f47246a.log(5, str, objArr);
    }

    @Override // com.yandex.metrica.push.common.utils.BaseLogger
    /* renamed from: a */
    public String mo21365a() {
        return "";
    }

    @Override // com.yandex.metrica.push.common.utils.BaseLogger
    /* renamed from: b */
    public String mo21366b() {
        return "AppMetricaPushInternal";
    }

    @Override // com.yandex.metrica.push.common.utils.BaseLogger
    public boolean shouldLog() {
        super.shouldLog();
        return false;
    }

    /* renamed from: e */
    public static void m21369e(@Nullable Throwable th, @Nullable String str, @Nullable Object... objArr) {
        f47246a.log(6, th, str, objArr);
    }
}
