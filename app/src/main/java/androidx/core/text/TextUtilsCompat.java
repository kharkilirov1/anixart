package androidx.core.text;

import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.Locale;

/* loaded from: classes.dex */
public final class TextUtilsCompat {

    /* renamed from: a */
    public static final /* synthetic */ int f3549a = 0;

    @RequiresApi
    public static class Api17Impl {
        @DoNotInline
        /* renamed from: a */
        public static int m2018a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    static {
        new Locale("", "");
    }
}
