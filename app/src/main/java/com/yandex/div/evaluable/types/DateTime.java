package com.yandex.div.evaluable.types;

import java.util.Calendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DateTime.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/evaluable/types/DateTime;", "", "Companion", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DateTime implements Comparable<DateTime> {

    /* renamed from: f */
    @NotNull
    public static final SimpleTimeZone f33643f = new SimpleTimeZone(0, "UTC");

    /* renamed from: b */
    public final long f33644b;

    /* renamed from: c */
    @NotNull
    public final TimeZone f33645c;

    /* renamed from: d */
    @NotNull
    public final Lazy f33646d;

    /* renamed from: e */
    public final long f33647e;

    /* compiled from: DateTime.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31884d2 = {"Lcom/yandex/div/evaluable/types/DateTime$Companion;", "", "", "DEFAULT_FORMAT_PATTERN", "Ljava/lang/String;", "Ljava/util/SimpleTimeZone;", "utcTimezone", "Ljava/util/SimpleTimeZone;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    public DateTime(long j2, @NotNull TimeZone timezone) {
        Intrinsics.m32179h(timezone, "timezone");
        this.f33644b = j2;
        this.f33645c = timezone;
        this.f33646d = LazyKt.m31880a(LazyThreadSafetyMode.NONE, new Function0<Calendar>() { // from class: com.yandex.div.evaluable.types.DateTime$calendar$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Calendar invoke() {
                Calendar calendar = Calendar.getInstance(DateTime.f33643f);
                calendar.setTimeInMillis(DateTime.this.f33644b);
                return calendar;
            }
        });
        this.f33647e = j2 - ((timezone.getRawOffset() / 60) * 60000);
    }

    @Override // java.lang.Comparable
    public int compareTo(DateTime dateTime) {
        DateTime other = dateTime;
        Intrinsics.m32179h(other, "other");
        return Intrinsics.m32182k(this.f33647e, other.f33647e);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateTime) && this.f33647e == ((DateTime) obj).f33647e;
    }

    public int hashCode() {
        long j2 = this.f33647e;
        return (int) (j2 ^ (j2 >>> 32));
    }

    @NotNull
    public String toString() {
        Calendar calendar = (Calendar) this.f33646d.getValue();
        Intrinsics.m32178g(calendar, "calendar");
        return String.valueOf(calendar.get(1)) + '-' + StringsKt.m33883I(String.valueOf(calendar.get(2) + 1), 2, '0') + '-' + StringsKt.m33883I(String.valueOf(calendar.get(5)), 2, '0') + ' ' + StringsKt.m33883I(String.valueOf(calendar.get(11)), 2, '0') + ':' + StringsKt.m33883I(String.valueOf(calendar.get(12)), 2, '0') + ':' + StringsKt.m33883I(String.valueOf(calendar.get(13)), 2, '0');
    }
}
