package androidx.core.os;

import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Locale;

/* loaded from: classes.dex */
public final class LocaleListCompat {

    /* renamed from: b */
    public static final /* synthetic */ int f3461b = 0;

    /* renamed from: a */
    public final LocaleListInterface f3462a;

    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* renamed from: a */
        public static Locale m1957a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    @RequiresApi
    public static class Api24Impl {
        @DoNotInline
        /* renamed from: a */
        public static LocaleList m1958a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        @DoNotInline
        /* renamed from: b */
        public static LocaleList m1959b() {
            return LocaleList.getAdjustedDefault();
        }

        @DoNotInline
        /* renamed from: c */
        public static LocaleList m1960c() {
            return LocaleList.getDefault();
        }
    }

    static {
        m1955a(new Locale[0]);
    }

    public LocaleListCompat(LocaleListInterface localeListInterface) {
        this.f3462a = localeListInterface;
    }

    @NonNull
    /* renamed from: a */
    public static LocaleListCompat m1955a(@NonNull Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new LocaleListCompat(new LocaleListPlatformWrapper(Api24Impl.m1958a(localeArr))) : new LocaleListCompat(new LocaleListCompatWrapper(localeArr));
    }

    @Nullable
    /* renamed from: b */
    public Locale m1956b(int i2) {
        return this.f3462a.get(i2);
    }

    public boolean equals(Object obj) {
        return (obj instanceof LocaleListCompat) && this.f3462a.equals(((LocaleListCompat) obj).f3462a);
    }

    public int hashCode() {
        return this.f3462a.hashCode();
    }

    @NonNull
    public String toString() {
        return this.f3462a.toString();
    }
}
