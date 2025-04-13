package androidx.core.content.res;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.AnyRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import org.xmlpull.v1.XmlPullParser;

@RestrictTo
/* loaded from: classes.dex */
public class TypedArrayUtils {
    /* renamed from: a */
    public static int m1749a(@NonNull Context context, int i2, int i3) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId != 0 ? i2 : i3;
    }

    /* renamed from: b */
    public static boolean m1750b(@NonNull TypedArray typedArray, @StyleableRes int i2, @StyleableRes int i3, boolean z) {
        return typedArray.getBoolean(i2, typedArray.getBoolean(i3, z));
    }

    /* renamed from: c */
    public static ComplexColorCompat m1751c(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme, @NonNull String str, @StyleableRes int i2, @ColorInt int i3) {
        ComplexColorCompat complexColorCompat;
        if (m1756h(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i2, typedValue);
            int i4 = typedValue.type;
            if (i4 >= 28 && i4 <= 31) {
                return new ComplexColorCompat(null, null, typedValue.data);
            }
            try {
                complexColorCompat = ComplexColorCompat.m1722a(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme);
            } catch (Exception e2) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
                complexColorCompat = null;
            }
            if (complexColorCompat != null) {
                return complexColorCompat;
            }
        }
        return new ComplexColorCompat(null, null, i3);
    }

    @Nullable
    /* renamed from: d */
    public static String m1752d(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i2) {
        if (m1756h(xmlPullParser, str)) {
            return typedArray.getString(i2);
        }
        return null;
    }

    @AnyRes
    /* renamed from: e */
    public static int m1753e(@NonNull TypedArray typedArray, @StyleableRes int i2, @StyleableRes int i3, @AnyRes int i4) {
        return typedArray.getResourceId(i2, typedArray.getResourceId(i3, i4));
    }

    @Nullable
    /* renamed from: f */
    public static String m1754f(@NonNull TypedArray typedArray, @StyleableRes int i2, @StyleableRes int i3) {
        String string = typedArray.getString(i2);
        return string == null ? typedArray.getString(i3) : string;
    }

    @Nullable
    /* renamed from: g */
    public static CharSequence[] m1755g(@NonNull TypedArray typedArray, @StyleableRes int i2, @StyleableRes int i3) {
        CharSequence[] textArray = typedArray.getTextArray(i2);
        return textArray == null ? typedArray.getTextArray(i3) : textArray;
    }

    /* renamed from: h */
    public static boolean m1756h(@NonNull XmlPullParser xmlPullParser, @NonNull String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    @NonNull
    /* renamed from: i */
    public static TypedArray m1757i(@NonNull Resources resources, @Nullable Resources.Theme theme, @NonNull AttributeSet attributeSet, @NonNull int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
