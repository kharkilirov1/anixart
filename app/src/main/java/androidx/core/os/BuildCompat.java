package androidx.core.os;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresOptIn;
import androidx.annotation.RestrictTo;
import java.util.Locale;

/* loaded from: classes.dex */
public class BuildCompat {

    @RequiresOptIn
    public @interface PrereleaseSdkCheck {
    }

    @RestrictTo
    /* renamed from: a */
    public static boolean m1940a(@NonNull String str, @NonNull String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }
}
