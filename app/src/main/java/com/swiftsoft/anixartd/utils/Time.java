package com.swiftsoft.anixartd.utils;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;
import android.widget.EditText;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.activity.ViewOnClickListenerC2635k;
import com.yandex.div2.C3033a;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: Time.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/Time;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class Time {

    /* renamed from: a */
    @NotNull
    public static final Time f30247a = new Time();

    /* renamed from: b */
    @NotNull
    public static final Locale f30248b = new Locale("ru");

    @SuppressLint
    @NotNull
    /* renamed from: a */
    public final String m16355a(long j2) {
        return m16356b(j2, m16365k(System.currentTimeMillis() / ((long) 1000), j2) ? "d MMM в HH:mm" : "d MMM yyyy в HH:mm");
    }

    @SuppressLint
    @NotNull
    /* renamed from: b */
    public final String m16356b(long j2, @NotNull String str) {
        return new SimpleDateFormat(str, f30248b).format(Long.valueOf(j2 * 1000)).toString();
    }

    @NotNull
    /* renamed from: c */
    public final String m16357c(long j2) {
        long j3 = j2 / 3600;
        if (j3 > 0) {
            long j4 = 60;
            return C3033a.m17745g(new Object[]{Long.valueOf(j3), Long.valueOf((j2 / j4) % j4), Long.valueOf(j2 % j4)}, 3, "%02d:%02d:%02d", "format(format, *args)");
        }
        long j5 = 60;
        return C3033a.m17745g(new Object[]{Long.valueOf((j2 / j5) % j5), Long.valueOf(j2 % j5)}, 2, "%02d:%02d", "format(format, *args)");
    }

    @SuppressLint
    @NotNull
    /* renamed from: d */
    public final String m16358d(long j2) {
        return m16356b(j2, "dd.MM");
    }

    @Nullable
    /* renamed from: e */
    public final Long m16359e(@NotNull String str, @NotNull String str2) {
        try {
            Date parse = new SimpleDateFormat(str2, f30248b).parse(str);
            if (parse != null) {
                return Long.valueOf(parse.getTime() / 1000);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @NotNull
    /* renamed from: f */
    public final String m16360f(@Nullable Context context, long j2) {
        if (context == null) {
            return "";
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        int days = (int) timeUnit.toDays(j2);
        int hours = (int) (timeUnit.toHours(j2) - (days * 24));
        int minutes = (int) (timeUnit.toMinutes(j2) - (timeUnit.toHours(j2) * 60));
        if (days <= 0) {
            if (hours > 0) {
                StringBuilder m24u = C0000a.m24u("");
                String format = String.format(Plurals.f30231a.m16341a(context, hours, C2507R.plurals.hours), Arrays.copyOf(new Object[0], 0));
                Intrinsics.m32178g(format, "format(format, *args)");
                m24u.append(format);
                return m24u.toString();
            }
            if (minutes <= 0) {
                return "";
            }
            StringBuilder m24u2 = C0000a.m24u("");
            String format2 = String.format(Plurals.f30231a.m16341a(context, minutes, C2507R.plurals.minutes), Arrays.copyOf(new Object[0], 0));
            Intrinsics.m32178g(format2, "format(format, *args)");
            m24u2.append(format2);
            return m24u2.toString();
        }
        if (hours <= 0) {
            StringBuilder m24u3 = C0000a.m24u("");
            String format3 = String.format(Plurals.f30231a.m16341a(context, days, C2507R.plurals.days), Arrays.copyOf(new Object[0], 0));
            Intrinsics.m32178g(format3, "format(format, *args)");
            m24u3.append(format3);
            return m24u3.toString();
        }
        StringBuilder m24u4 = C0000a.m24u("");
        Plurals plurals = Plurals.f30231a;
        String format4 = String.format(plurals.m16341a(context, days, C2507R.plurals.days), Arrays.copyOf(new Object[0], 0));
        Intrinsics.m32178g(format4, "format(format, *args)");
        m24u4.append(format4);
        StringBuilder m24u5 = C0000a.m24u(m24u4.toString() + ' ');
        String format5 = String.format(plurals.m16341a(context, hours, C2507R.plurals.hours), Arrays.copyOf(new Object[0], 0));
        Intrinsics.m32178g(format5, "format(format, *args)");
        m24u5.append(format5);
        return m24u5.toString();
    }

    @NotNull
    /* renamed from: g */
    public final String m16361g(@NotNull Context context, long j2) {
        Locale locale = f30248b;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d MMM yyyy в HH:mm", locale);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("d MMM в HH:mm", locale);
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("HH:mm", locale);
        long j3 = 1000;
        long currentTimeMillis = System.currentTimeMillis() / j3;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long j4 = currentTimeMillis - j2;
        int days = (int) timeUnit.toDays(j4);
        int i2 = days * 24;
        int hours = (int) (timeUnit.toHours(j4) - i2);
        int i3 = hours * 60;
        int minutes = (int) ((timeUnit.toMinutes(j4) - (i2 * 60)) - i3);
        int seconds = (int) (((timeUnit.toSeconds(j4) - (r14 * 60)) - (i3 * 60)) - (minutes * 60));
        boolean m16365k = m16365k(currentTimeMillis, j2);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis((currentTimeMillis - 86400) * j3);
        Calendar calendar2 = Calendar.getInstance();
        long j5 = j2 * j3;
        calendar2.setTimeInMillis(j5);
        boolean z = calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
        boolean m16364j = m16364j(currentTimeMillis, j2);
        if (days == 0 && hours == 0 && minutes == 0 && seconds >= 0 && seconds < 5) {
            String string = context.getString(C2507R.string.just_now);
            Intrinsics.m32178g(string, "context.getString(R.string.just_now)");
            return string;
        }
        if (days == 0 && hours == 0 && minutes == 0 && seconds > 5) {
            String string2 = context.getString(C2507R.string.sec_ago);
            Intrinsics.m32178g(string2, "context.getString(R.string.sec_ago)");
            return C3033a.m17745g(new Object[]{Integer.valueOf(seconds)}, 1, string2, "format(format, *args)");
        }
        if (days == 0 && hours == 0 && minutes >= 1) {
            String string3 = context.getString(C2507R.string.min_ago);
            Intrinsics.m32178g(string3, "context.getString(R.string.min_ago)");
            return C3033a.m17745g(new Object[]{Integer.valueOf(minutes)}, 1, string3, "format(format, *args)");
        }
        if (days == 0 && hours >= 1 && hours <= 3) {
            String string4 = context.getString(C2507R.string.hours_ago);
            Intrinsics.m32178g(string4, "context.getString(R.string.hours_ago)");
            return C3033a.m17745g(new Object[]{Integer.valueOf(hours)}, 1, string4, "format(format, *args)");
        }
        if (days == 0 && hours >= 4 && m16364j) {
            String string5 = context.getString(C2507R.string.today);
            Intrinsics.m32178g(string5, "context.getString(R.string.today)");
            return C3033a.m17745g(new Object[]{simpleDateFormat3.format(Long.valueOf(j5))}, 1, string5, "format(format, *args)");
        }
        if (days == 0 && hours >= 4 && !m16364j && z) {
            String string6 = context.getString(C2507R.string.yesterday);
            Intrinsics.m32178g(string6, "context.getString(R.string.yesterday)");
            return C3033a.m17745g(new Object[]{simpleDateFormat3.format(Long.valueOf(j5))}, 1, string6, "format(format, *args)");
        }
        if (days != 1 || !z) {
            return (days != 1 || z) ? (days < 2 || !m16365k) ? simpleDateFormat.format(Long.valueOf(j5)).toString() : simpleDateFormat2.format(Long.valueOf(j5)).toString() : simpleDateFormat2.format(Long.valueOf(j5)).toString();
        }
        String string7 = context.getString(C2507R.string.yesterday);
        Intrinsics.m32178g(string7, "context.getString(R.string.yesterday)");
        return C3033a.m17745g(new Object[]{simpleDateFormat3.format(Long.valueOf(j5))}, 1, string7, "format(format, *args)");
    }

    @NotNull
    /* renamed from: h */
    public final String m16362h(@Nullable Context context, long j2) {
        if (context == null) {
            return "";
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        int hours = (int) timeUnit.toHours(j2);
        int minutes = (int) timeUnit.toMinutes(j2);
        if (hours > 0) {
            return C3033a.m17745g(new Object[0], 0, Plurals.f30231a.m16341a(context, hours, C2507R.plurals.hours), "format(format, *args)");
        }
        return C3033a.m17745g(new Object[0], 0, Plurals.f30231a.m16341a(context, minutes, C2507R.plurals.minutes), "format(format, *args)");
    }

    /* renamed from: i */
    public final void m16363i(@NotNull final EditText editText, @Nullable Long l2, @NotNull String str, @NotNull final Function1<? super Long, Unit> function1) {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, f30248b);
        final Calendar calendar = Calendar.getInstance();
        Intrinsics.m32178g(calendar, "getInstance()");
        if (l2 != null && l2.longValue() > 0) {
            calendar.setTimeInMillis(l2.longValue() * 1000);
            editText.setText(simpleDateFormat.format(calendar.getTime()));
        }
        editText.setOnClickListener(new ViewOnClickListenerC2635k(editText, new DatePickerDialog.OnDateSetListener() { // from class: com.swiftsoft.anixartd.utils.b
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                Calendar calendar2 = calendar;
                EditText view = editText;
                SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
                Function1 callback = function1;
                Time time = Time.f30247a;
                Intrinsics.m32179h(calendar2, "$calendar");
                Intrinsics.m32179h(view, "$view");
                Intrinsics.m32179h(simpleDateFormat2, "$simpleDateFormat");
                Intrinsics.m32179h(callback, "$callback");
                calendar2.set(1, i2);
                calendar2.set(2, i3);
                calendar2.set(5, i4);
                view.setText(simpleDateFormat2.format(calendar2.getTime()));
                callback.invoke(Long.valueOf(calendar2.getTimeInMillis() / 1000));
            }
        }, calendar, 7));
    }

    /* renamed from: j */
    public final boolean m16364j(long j2, long j3) {
        Calendar calendar = Calendar.getInstance();
        long j4 = 1000;
        calendar.setTimeInMillis(j2 * j4);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j3 * j4);
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
    }

    /* renamed from: k */
    public final boolean m16365k(long j2, long j3) {
        Calendar calendar = Calendar.getInstance();
        long j4 = 1000;
        calendar.setTimeInMillis(j2 * j4);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j3 * j4);
        return calendar.get(1) == calendar2.get(1);
    }
}
