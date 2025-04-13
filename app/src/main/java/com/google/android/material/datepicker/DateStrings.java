package com.google.android.material.datepicker;

import android.os.Build;
import androidx.annotation.Nullable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
class DateStrings {
    /* renamed from: a */
    public static String m9989a(long j2) {
        return m9990b(j2, null);
    }

    /* renamed from: b */
    public static String m9990b(long j2, @Nullable SimpleDateFormat simpleDateFormat) {
        Calendar m10035h = UtcDates.m10035h();
        Calendar m10036i = UtcDates.m10036i();
        m10036i.setTimeInMillis(j2);
        return simpleDateFormat != null ? simpleDateFormat.format(new Date(j2)) : m10035h.get(1) == m10036i.get(1) ? m9991c(j2, Locale.getDefault()) : m9992d(j2, Locale.getDefault());
    }

    /* renamed from: c */
    public static String m9991c(long j2, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return UtcDates.m10030c("MMMd", locale).format(new Date(j2));
        }
        AtomicReference<TimeSource> atomicReference = UtcDates.f18055a;
        DateFormat dateInstance = DateFormat.getDateInstance(2, locale);
        dateInstance.setTimeZone(UtcDates.m10034g());
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) dateInstance;
        String pattern = simpleDateFormat.toPattern();
        int m10029b = UtcDates.m10029b(pattern, "yY", 1, 0);
        if (m10029b < pattern.length()) {
            int m10029b2 = UtcDates.m10029b(pattern, "EMd", 1, m10029b);
            pattern = pattern.replace(pattern.substring(UtcDates.m10029b(pattern, m10029b2 < pattern.length() ? "EMd," : "EMd", -1, m10029b) + 1, m10029b2), " ").trim();
        }
        simpleDateFormat.applyPattern(pattern);
        return simpleDateFormat.format(new Date(j2));
    }

    /* renamed from: d */
    public static String m9992d(long j2, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return UtcDates.m10030c("yMMMd", locale).format(new Date(j2));
        }
        AtomicReference<TimeSource> atomicReference = UtcDates.f18055a;
        DateFormat dateInstance = DateFormat.getDateInstance(2, locale);
        dateInstance.setTimeZone(UtcDates.m10034g());
        return dateInstance.format(new Date(j2));
    }
}
