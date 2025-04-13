package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.util.Pair;

/* loaded from: classes.dex */
public final class PaintCompat {

    /* renamed from: a */
    public static final ThreadLocal<Pair<Rect, Rect>> f3372a = new ThreadLocal<>();

    @RequiresApi
    public static class Api23Impl {
        @DoNotInline
        /* renamed from: a */
        public static boolean m1784a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m1785a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    /* renamed from: a */
    public static boolean m1783a(@NonNull Paint paint, @NonNull String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.m1784a(paint, str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float measureText = paint.measureText("\udfffd");
        float measureText2 = paint.measureText("m");
        float measureText3 = paint.measureText(str);
        float f2 = 0.0f;
        if (measureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (measureText3 > measureText2 * 2.0f) {
                return false;
            }
            int i2 = 0;
            while (i2 < length) {
                int charCount = Character.charCount(str.codePointAt(i2)) + i2;
                f2 += paint.measureText(str, i2, charCount);
                i2 = charCount;
            }
            if (measureText3 >= f2) {
                return false;
            }
        }
        if (measureText3 != measureText) {
            return true;
        }
        ThreadLocal<Pair<Rect, Rect>> threadLocal = f3372a;
        Pair<Rect, Rect> pair = threadLocal.get();
        if (pair == null) {
            pair = new Pair<>(new Rect(), new Rect());
            threadLocal.set(pair);
        } else {
            pair.f3552a.setEmpty();
            pair.f3553b.setEmpty();
        }
        paint.getTextBounds("\udfffd", 0, 2, pair.f3552a);
        paint.getTextBounds(str, 0, length, pair.f3553b);
        return !pair.f3552a.equals(pair.f3553b);
    }
}
