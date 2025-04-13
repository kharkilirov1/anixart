package com.yandex.metrica.profile;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.yandex.metrica.impl.p023ob.AbstractC4237qf;
import com.yandex.metrica.impl.p023ob.C3197Bf;
import com.yandex.metrica.impl.p023ob.C3222Cf;
import com.yandex.metrica.impl.p023ob.C3247Df;
import com.yandex.metrica.impl.p023ob.C3272Ef;
import com.yandex.metrica.impl.p023ob.C3380In;
import com.yandex.metrica.impl.p023ob.C4168no;
import com.yandex.metrica.impl.p023ob.C4289sf;
import com.yandex.metrica.impl.p023ob.C4367vf;
import com.yandex.metrica.impl.p023ob.InterfaceC3347Hf;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes2.dex */
public class BirthDateAttribute {

    /* renamed from: a */
    public final C4367vf f47215a = new C4367vf("appmetrica_birth_date", new C4168no(), new C3247Df());

    @SuppressLint
    @VisibleForTesting
    /* renamed from: a */
    public UserProfileUpdate<? extends InterfaceC3347Hf> m21347a(@NonNull Calendar calendar, @NonNull String str, @NonNull AbstractC4237qf abstractC4237qf) {
        return new UserProfileUpdate<>(new C3272Ef(this.f47215a.m20942a(), new SimpleDateFormat(str).format(calendar.getTime()), new C3380In(), new C4168no(), abstractC4237qf));
    }

    /* renamed from: b */
    public final Calendar m21348b(int i2) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i2);
        return gregorianCalendar;
    }

    public UserProfileUpdate<? extends InterfaceC3347Hf> withAge(int i2) {
        return m21347a(m21348b(Calendar.getInstance(Locale.US).get(1) - i2), "yyyy", new C4289sf(this.f47215a.m20944c()));
    }

    public UserProfileUpdate<? extends InterfaceC3347Hf> withAgeIfUndefined(int i2) {
        return m21347a(m21348b(Calendar.getInstance(Locale.US).get(1) - i2), "yyyy", new C3222Cf(this.f47215a.m20944c()));
    }

    public UserProfileUpdate<? extends InterfaceC3347Hf> withBirthDate(int i2) {
        return m21347a(m21348b(i2), "yyyy", new C4289sf(this.f47215a.m20944c()));
    }

    public UserProfileUpdate<? extends InterfaceC3347Hf> withBirthDateIfUndefined(int i2) {
        return m21347a(m21348b(i2), "yyyy", new C3222Cf(this.f47215a.m20944c()));
    }

    public UserProfileUpdate<? extends InterfaceC3347Hf> withValueReset() {
        return new UserProfileUpdate<>(new C3197Bf(0, this.f47215a.m20942a(), new C4168no(), new C3247Df()));
    }

    public UserProfileUpdate<? extends InterfaceC3347Hf> withBirthDate(int i2, int i3) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, i3 - 1);
        gregorianCalendar.set(5, 1);
        return m21347a(gregorianCalendar, "yyyy-MM", new C4289sf(this.f47215a.m20944c()));
    }

    public UserProfileUpdate<? extends InterfaceC3347Hf> withBirthDateIfUndefined(int i2, int i3) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, i3 - 1);
        gregorianCalendar.set(5, 1);
        return m21347a(gregorianCalendar, "yyyy-MM", new C3222Cf(this.f47215a.m20944c()));
    }

    public UserProfileUpdate<? extends InterfaceC3347Hf> withBirthDate(int i2, int i3, int i4) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, i3 - 1);
        gregorianCalendar.set(5, i4);
        return m21347a(gregorianCalendar, StdDateFormat.DATE_FORMAT_STR_PLAIN, new C4289sf(this.f47215a.m20944c()));
    }

    public UserProfileUpdate<? extends InterfaceC3347Hf> withBirthDateIfUndefined(int i2, int i3, int i4) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, i3 - 1);
        gregorianCalendar.set(5, i4);
        return m21347a(gregorianCalendar, StdDateFormat.DATE_FORMAT_STR_PLAIN, new C3222Cf(this.f47215a.m20944c()));
    }

    public UserProfileUpdate<? extends InterfaceC3347Hf> withBirthDate(@NonNull Calendar calendar) {
        return m21347a(calendar, StdDateFormat.DATE_FORMAT_STR_PLAIN, new C4289sf(this.f47215a.m20944c()));
    }

    public UserProfileUpdate<? extends InterfaceC3347Hf> withBirthDateIfUndefined(@NonNull Calendar calendar) {
        return m21347a(calendar, StdDateFormat.DATE_FORMAT_STR_PLAIN, new C3222Cf(this.f47215a.m20944c()));
    }
}
