package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0055R;
import androidx.core.graphics.ColorUtils;
import com.yandex.mobile.ads.C4632R;

@RestrictTo
/* loaded from: classes.dex */
public class ThemeUtils {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f1567a = new ThreadLocal<>();

    /* renamed from: b */
    public static final int[] f1568b = {-16842910};

    /* renamed from: c */
    public static final int[] f1569c = {R.attr.state_focused};

    /* renamed from: d */
    public static final int[] f1570d = {R.attr.state_pressed};

    /* renamed from: e */
    public static final int[] f1571e = {R.attr.state_checked};

    /* renamed from: f */
    public static final int[] f1572f = new int[0];

    /* renamed from: g */
    public static final int[] f1573g = new int[1];

    /* renamed from: a */
    public static void m945a(@NonNull View view, @NonNull Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C0055R.styleable.f300k);
        try {
            if (!obtainStyledAttributes.hasValue(C4632R.styleable.AppCompatTheme_windowActionBar)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m946b(@NonNull Context context, int i2) {
        ColorStateList m948d = m948d(context, i2);
        if (m948d != null && m948d.isStateful()) {
            return m948d.getColorForState(f1568b, m948d.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f1567a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f2 = typedValue.getFloat();
        return ColorUtils.m1776e(m947c(context, i2), Math.round(Color.alpha(r4) * f2));
    }

    /* renamed from: c */
    public static int m947c(@NonNull Context context, int i2) {
        int[] iArr = f1573g;
        iArr[0] = i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        TintTypedArray tintTypedArray = new TintTypedArray(context, obtainStyledAttributes);
        try {
            int m953b = tintTypedArray.m953b(0, 0);
            obtainStyledAttributes.recycle();
            return m953b;
        } catch (Throwable th) {
            tintTypedArray.f1582b.recycle();
            throw th;
        }
    }

    @Nullable
    /* renamed from: d */
    public static ColorStateList m948d(@NonNull Context context, int i2) {
        int[] iArr = f1573g;
        iArr[0] = i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        TintTypedArray tintTypedArray = new TintTypedArray(context, obtainStyledAttributes);
        try {
            ColorStateList m954c = tintTypedArray.m954c(0);
            obtainStyledAttributes.recycle();
            return m954c;
        } catch (Throwable th) {
            tintTypedArray.f1582b.recycle();
            throw th;
        }
    }
}
