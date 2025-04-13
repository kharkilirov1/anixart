package androidx.core.os;

import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import p000a.C0000a;

/* loaded from: classes.dex */
final class LocaleListCompatWrapper implements LocaleListInterface {

    /* renamed from: b */
    public static final Locale[] f3463b = new Locale[0];

    /* renamed from: a */
    public final Locale[] f3464a;

    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* renamed from: a */
        public static String m1962a(Locale locale) {
            return locale.getScript();
        }
    }

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        int i2 = LocaleListCompat.f3461b;
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else {
            if (split.length != 1) {
                throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
            }
            new Locale(split[0]);
        }
    }

    public LocaleListCompatWrapper(@NonNull Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f3464a = f3463b;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < localeArr.length; i2++) {
            Locale locale = localeArr[i2];
            if (locale == null) {
                throw new NullPointerException(C0000a.m8e("list[", i2, "] is null"));
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                locale2.getLanguage();
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    locale2.getCountry();
                }
                hashSet.add(locale2);
            }
        }
        this.f3464a = (Locale[]) arrayList.toArray(new Locale[0]);
    }

    @Override // androidx.core.os.LocaleListInterface
    @Nullable
    /* renamed from: a */
    public Object mo1961a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocaleListCompatWrapper)) {
            return false;
        }
        Locale[] localeArr = ((LocaleListCompatWrapper) obj).f3464a;
        if (this.f3464a.length != localeArr.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            Locale[] localeArr2 = this.f3464a;
            if (i2 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i2].equals(localeArr[i2])) {
                return false;
            }
            i2++;
        }
    }

    @Override // androidx.core.os.LocaleListInterface
    public Locale get(int i2) {
        if (i2 >= 0) {
            Locale[] localeArr = this.f3464a;
            if (i2 < localeArr.length) {
                return localeArr[i2];
            }
        }
        return null;
    }

    public int hashCode() {
        int i2 = 1;
        for (Locale locale : this.f3464a) {
            i2 = (i2 * 31) + locale.hashCode();
        }
        return i2;
    }

    @NonNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("[");
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.f3464a;
            if (i2 >= localeArr.length) {
                m24u.append("]");
                return m24u.toString();
            }
            m24u.append(localeArr[i2]);
            if (i2 < this.f3464a.length - 1) {
                m24u.append(',');
            }
            i2++;
        }
    }
}
