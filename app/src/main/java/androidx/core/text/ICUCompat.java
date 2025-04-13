package androidx.core.text;

import android.icu.util.ULocale;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;
import java.util.Locale;

/* loaded from: classes.dex */
public final class ICUCompat {

    /* renamed from: a */
    public static Method f3528a;

    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* renamed from: a */
        public static String m2010a(Locale locale) {
            return locale.getScript();
        }
    }

    @RequiresApi
    public static class Api24Impl {
        @DoNotInline
        /* renamed from: a */
        public static ULocale m2011a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        @DoNotInline
        /* renamed from: b */
        public static ULocale m2012b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        @DoNotInline
        /* renamed from: c */
        public static String m2013c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f3528a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        }
    }
}
