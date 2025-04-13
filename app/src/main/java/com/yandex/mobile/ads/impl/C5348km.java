package com.yandex.mobile.ads.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.km */
/* loaded from: classes3.dex */
public final class C5348km {

    /* renamed from: a */
    @NotNull
    private static final a f52031a = new a();

    /* renamed from: com.yandex.mobile.ads.impl.km$a */
    public static final class a extends ThreadLocal<DateFormat> {
        @Override // java.lang.ThreadLocal
        public final DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(t91.f54982d);
            return simpleDateFormat;
        }
    }

    @NotNull
    /* renamed from: a */
    public static final String m26164a(@NotNull Date date) {
        Intrinsics.m32179h(date, "<this>");
        String format = f52031a.get().format(date);
        Intrinsics.m32178g(format, "STANDARD_DATE_FORMAT.get().format(this)");
        return format;
    }
}
