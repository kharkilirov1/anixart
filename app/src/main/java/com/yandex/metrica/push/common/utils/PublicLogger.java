package com.yandex.metrica.push.common.utils;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public class PublicLogger extends BaseLogger {

    /* renamed from: a */
    private static final BaseLogger f47248a = new PublicLogger();

    private PublicLogger() {
    }

    /* renamed from: d */
    public static void m21382d(@Nullable String str, @Nullable Object... objArr) {
        f47248a.log(3, str, objArr);
    }

    /* renamed from: e */
    public static void m21383e(@Nullable String str, @Nullable Object... objArr) {
        f47248a.log(6, str, objArr);
    }

    /* renamed from: i */
    public static void m21385i(@Nullable String str, @Nullable Object... objArr) {
        f47248a.log(4, str, objArr);
    }

    public static void setEnabled() {
        f47248a.isEnabled = true;
    }

    /* renamed from: w */
    public static void m21386w(@Nullable String str, @Nullable Object... objArr) {
        f47248a.log(5, str, objArr);
    }

    @Override // com.yandex.metrica.push.common.utils.BaseLogger
    /* renamed from: a */
    public String mo21365a() {
        return "";
    }

    @Override // com.yandex.metrica.push.common.utils.BaseLogger
    /* renamed from: b */
    public String mo21366b() {
        return "AppMetricaPush";
    }

    /* renamed from: e */
    public static void m21384e(@Nullable Throwable th, @Nullable String str, @Nullable Object... objArr) {
        f47248a.log(6, th, str, objArr);
    }
}
