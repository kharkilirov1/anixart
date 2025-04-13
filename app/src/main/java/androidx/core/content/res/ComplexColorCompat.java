package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.graphics.Shader;
import androidx.annotation.ColorInt;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes.dex */
public final class ComplexColorCompat {

    /* renamed from: a */
    public final Shader f3323a;

    /* renamed from: b */
    public final ColorStateList f3324b;

    /* renamed from: c */
    public int f3325c;

    public ComplexColorCompat(Shader shader, ColorStateList colorStateList, @ColorInt int i2) {
        this.f3323a = shader;
        this.f3324b = colorStateList;
        this.f3325c = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c4, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    @androidx.annotation.NonNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.core.content.res.ComplexColorCompat m1722a(@androidx.annotation.NonNull android.content.res.Resources r29, @androidx.annotation.ColorRes int r30, @androidx.annotation.Nullable android.content.res.Resources.Theme r31) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            Method dump skipped, instructions count: 645
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.ComplexColorCompat.m1722a(android.content.res.Resources, int, android.content.res.Resources$Theme):androidx.core.content.res.ComplexColorCompat");
    }

    /* renamed from: b */
    public boolean m1723b() {
        return this.f3323a != null;
    }

    /* renamed from: c */
    public boolean m1724c() {
        ColorStateList colorStateList;
        return this.f3323a == null && (colorStateList = this.f3324b) != null && colorStateList.isStateful();
    }

    /* renamed from: d */
    public boolean m1725d(int[] iArr) {
        if (m1724c()) {
            ColorStateList colorStateList = this.f3324b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f3325c) {
                this.f3325c = colorForState;
                return true;
            }
        }
        return false;
    }
}
