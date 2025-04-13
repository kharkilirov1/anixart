package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.types.DateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p000a.C0000a;

/* compiled from: DateTimeFunctions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div-evaluable"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DateTimeFunctionsKt {
    /* renamed from: a */
    public static final void m17239a(String str) {
        String lowerCase = str.toLowerCase();
        Intrinsics.m32178g(lowerCase, "this as java.lang.String).toLowerCase()");
        if (StringsKt.m33922t(lowerCase, "z", false, 2, null)) {
            throw new EvaluableException(C0000a.m15l("z/Z not supported in [", str, ']'), null, 2);
        }
    }

    /* renamed from: b */
    public static final Calendar m17240b(DateTime dateTime) {
        Calendar gregorianCalendar = GregorianCalendar.getInstance();
        gregorianCalendar.setTimeZone(dateTime.f33645c);
        gregorianCalendar.setTimeInMillis(dateTime.f33644b);
        return gregorianCalendar;
    }

    /* renamed from: c */
    public static final Date m17241c(DateTime dateTime) {
        return new Date(dateTime.f33644b - dateTime.f33645c.getRawOffset());
    }
}
