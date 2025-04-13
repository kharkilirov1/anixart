package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.swiftsoft.anixartd.C2507R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
class UtcDates {

    /* renamed from: a */
    public static AtomicReference<TimeSource> f18055a = new AtomicReference<>();

    /* renamed from: a */
    public static long m10028a(long j2) {
        Calendar m10036i = m10036i();
        m10036i.setTimeInMillis(j2);
        return m10031d(m10036i).getTimeInMillis();
    }

    /* renamed from: b */
    public static int m10029b(@NonNull String str, @NonNull String str2, int i2, int i3) {
        while (i3 >= 0 && i3 < str.length() && str2.indexOf(str.charAt(i3)) == -1) {
            if (str.charAt(i3) == '\'') {
                do {
                    i3 += i2;
                    if (i3 >= 0 && i3 < str.length()) {
                    }
                } while (str.charAt(i3) != '\'');
            }
            i3 += i2;
        }
        return i3;
    }

    @TargetApi
    /* renamed from: c */
    public static DateFormat m10030c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        return instanceForSkeleton;
    }

    /* renamed from: d */
    public static Calendar m10031d(Calendar calendar) {
        Calendar m10037j = m10037j(calendar);
        Calendar m10036i = m10036i();
        m10036i.set(m10037j.get(1), m10037j.get(2), m10037j.get(5));
        return m10036i;
    }

    /* renamed from: e */
    public static SimpleDateFormat m10032e() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("\\s+", ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(m10034g());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    /* renamed from: f */
    public static String m10033f(Resources resources, SimpleDateFormat simpleDateFormat) {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(C2507R.string.mtrl_picker_text_input_year_abbr);
        String string2 = resources.getString(C2507R.string.mtrl_picker_text_input_month_abbr);
        String string3 = resources.getString(C2507R.string.mtrl_picker_text_input_day_abbr);
        if (pattern.replaceAll("[^y]", "").length() == 1) {
            pattern = pattern.replace("y", "yyyy");
        }
        return pattern.replace("d", string3).replace("M", string2).replace("y", string);
    }

    /* renamed from: g */
    public static java.util.TimeZone m10034g() {
        return java.util.TimeZone.getTimeZone("UTC");
    }

    /* renamed from: h */
    public static Calendar m10035h() {
        TimeSource timeSource = f18055a.get();
        if (timeSource == null) {
            timeSource = TimeSource.f18052c;
        }
        java.util.TimeZone timeZone = timeSource.f18054b;
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l2 = timeSource.f18053a;
        if (l2 != null) {
            calendar.setTimeInMillis(l2.longValue());
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(m10034g());
        return calendar;
    }

    /* renamed from: i */
    public static Calendar m10036i() {
        return m10037j(null);
    }

    /* renamed from: j */
    public static Calendar m10037j(@Nullable Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(m10034g());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }
}
