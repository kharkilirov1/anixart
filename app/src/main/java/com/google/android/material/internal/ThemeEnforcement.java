package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.StyleableRes;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.C1195R;
import com.swiftsoft.anixartd.C2507R;
import p000a.C0000a;

@RestrictTo
/* loaded from: classes.dex */
public final class ThemeEnforcement {

    /* renamed from: a */
    public static final int[] f18359a = {C2507R.attr.colorPrimary};

    /* renamed from: b */
    public static final int[] f18360b = {C2507R.attr.colorPrimaryVariant};

    /* renamed from: a */
    public static void m10156a(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1195R.styleable.f17314O, i2, i3);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C2507R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m10158c(context, f18360b, "Theme.MaterialComponents");
            }
        }
        m10158c(context, f18359a, "Theme.AppCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0038, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L20;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m10157b(@androidx.annotation.NonNull android.content.Context r4, android.util.AttributeSet r5, @androidx.annotation.NonNull @androidx.annotation.StyleableRes int[] r6, @androidx.annotation.AttrRes int r7, @androidx.annotation.StyleRes int r8, @androidx.annotation.Nullable @androidx.annotation.StyleableRes int... r9) {
        /*
            int[] r0 = com.google.android.material.C1195R.styleable.f17314O
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r5, r0, r7, r8)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L12
            r0.recycle()
            return
        L12:
            r1 = -1
            if (r9 == 0) goto L34
            int r3 = r9.length
            if (r3 != 0) goto L19
            goto L34
        L19:
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r6, r7, r8)
            int r5 = r9.length
            r6 = 0
        L1f:
            if (r6 >= r5) goto L30
            r7 = r9[r6]
            int r7 = r4.getResourceId(r7, r1)
            if (r7 != r1) goto L2d
            r4.recycle()
            goto L3b
        L2d:
            int r6 = r6 + 1
            goto L1f
        L30:
            r4.recycle()
            goto L3a
        L34:
            int r4 = r0.getResourceId(r2, r1)
            if (r4 == r1) goto L3b
        L3a:
            r2 = 1
        L3b:
            r0.recycle()
            if (r2 == 0) goto L41
            return
        L41:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.ThemeEnforcement.m10157b(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    /* renamed from: c */
    public static void m10158c(@NonNull Context context, @NonNull int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= iArr.length) {
                obtainStyledAttributes.recycle();
                z = true;
                break;
            } else {
                if (!obtainStyledAttributes.hasValue(i2)) {
                    obtainStyledAttributes.recycle();
                    break;
                }
                i2++;
            }
        }
        if (!z) {
            throw new IllegalArgumentException(C0000a.m16m("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }

    @NonNull
    /* renamed from: d */
    public static TypedArray m10159d(@NonNull Context context, AttributeSet attributeSet, @NonNull @StyleableRes int[] iArr, @AttrRes int i2, @StyleRes int i3, @StyleableRes int... iArr2) {
        m10156a(context, attributeSet, i2, i3);
        m10157b(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    /* renamed from: e */
    public static TintTypedArray m10160e(@NonNull Context context, AttributeSet attributeSet, @NonNull @StyleableRes int[] iArr, @AttrRes int i2, @StyleRes int i3, @StyleableRes int... iArr2) {
        m10156a(context, attributeSet, i2, i3);
        m10157b(context, attributeSet, iArr, i2, i3, iArr2);
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }
}
