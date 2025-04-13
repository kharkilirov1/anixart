package androidx.core.os;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class ConfigurationCompat {

    @RequiresApi
    public static class Api24Impl {
        @DoNotInline
        /* renamed from: a */
        public static LocaleList m1951a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    @NonNull
    /* renamed from: a */
    public static LocaleListCompat m1950a(@NonNull Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? new LocaleListCompat(new LocaleListPlatformWrapper(Api24Impl.m1951a(configuration))) : LocaleListCompat.m1955a(configuration.locale);
    }
}
