package androidx.core.text;

import android.annotation.SuppressLint;
import android.text.Html;
import android.text.Spanned;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@SuppressLint
/* loaded from: classes.dex */
public final class HtmlCompat {

    @RequiresApi
    public static class Api24Impl {
        @DoNotInline
        /* renamed from: a */
        public static Spanned m2007a(String str, int i2) {
            return Html.fromHtml(str, i2);
        }

        @DoNotInline
        /* renamed from: b */
        public static Spanned m2008b(String str, int i2, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i2, imageGetter, tagHandler);
        }

        @DoNotInline
        /* renamed from: c */
        public static String m2009c(Spanned spanned, int i2) {
            return Html.toHtml(spanned, i2);
        }
    }
}
