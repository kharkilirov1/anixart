package com.yandex.metrica.billing_interface;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.billing_interface.c */
/* loaded from: classes2.dex */
public class C3117c {

    /* renamed from: c */
    public static final Pattern f42401c = Pattern.compile("P(\\d+)(\\S+)");

    /* renamed from: a */
    public final int f42402a;

    /* renamed from: b */
    @NonNull
    public final a f42403b;

    /* renamed from: com.yandex.metrica.billing_interface.c$a */
    public enum a {
        TIME_UNIT_UNKNOWN,
        DAY,
        WEEK,
        MONTH,
        YEAR
    }

    public C3117c(int i2, @NonNull a aVar) {
        this.f42402a = i2;
        this.f42403b = aVar;
    }

    @Nullable
    /* renamed from: a */
    public static C3117c m17789a(@NonNull String str) {
        Matcher matcher = f42401c.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        String group = matcher.group(1);
        String group2 = matcher.group(2);
        if (group == null || group2 == null) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(group);
            char charAt = group2.charAt(0);
            return new C3117c(parseInt, charAt != 'D' ? charAt != 'M' ? charAt != 'W' ? charAt != 'Y' ? a.TIME_UNIT_UNKNOWN : a.YEAR : a.WEEK : a.MONTH : a.DAY);
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3117c.class != obj.getClass()) {
            return false;
        }
        C3117c c3117c = (C3117c) obj;
        return this.f42402a == c3117c.f42402a && this.f42403b == c3117c.f42403b;
    }

    public int hashCode() {
        return this.f42403b.hashCode() + ((this.f42402a + 0) * 31);
    }

    @NonNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("Period{number=");
        m24u.append(this.f42402a);
        m24u.append("timeUnit=");
        m24u.append(this.f42403b);
        m24u.append("}");
        return m24u.toString();
    }
}
