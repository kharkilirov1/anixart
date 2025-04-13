package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.C0055R;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
class AppCompatBackgroundHelper {

    /* renamed from: a */
    @NonNull
    public final View f1135a;

    /* renamed from: d */
    public TintInfo f1138d;

    /* renamed from: e */
    public TintInfo f1139e;

    /* renamed from: f */
    public TintInfo f1140f;

    /* renamed from: c */
    public int f1137c = -1;

    /* renamed from: b */
    public final AppCompatDrawableManager f1136b = AppCompatDrawableManager.m726a();

    public AppCompatBackgroundHelper(@NonNull View view) {
        this.f1135a = view;
    }

    /* renamed from: a */
    public void m714a() {
        Drawable background = this.f1135a.getBackground();
        if (background != null) {
            int i2 = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i2 <= 21 ? i2 == 21 : this.f1138d != null) {
                if (this.f1140f == null) {
                    this.f1140f = new TintInfo();
                }
                TintInfo tintInfo = this.f1140f;
                tintInfo.f1576a = null;
                tintInfo.f1579d = false;
                tintInfo.f1577b = null;
                tintInfo.f1578c = false;
                ColorStateList m2213n = ViewCompat.m2213n(this.f1135a);
                if (m2213n != null) {
                    tintInfo.f1579d = true;
                    tintInfo.f1576a = m2213n;
                }
                PorterDuff.Mode m2215o = ViewCompat.m2215o(this.f1135a);
                if (m2215o != null) {
                    tintInfo.f1578c = true;
                    tintInfo.f1577b = m2215o;
                }
                if (tintInfo.f1579d || tintInfo.f1578c) {
                    AppCompatDrawableManager.m729f(background, tintInfo, this.f1135a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            TintInfo tintInfo2 = this.f1139e;
            if (tintInfo2 != null) {
                AppCompatDrawableManager.m729f(background, tintInfo2, this.f1135a.getDrawableState());
                return;
            }
            TintInfo tintInfo3 = this.f1138d;
            if (tintInfo3 != null) {
                AppCompatDrawableManager.m729f(background, tintInfo3, this.f1135a.getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public ColorStateList m715b() {
        TintInfo tintInfo = this.f1139e;
        if (tintInfo != null) {
            return tintInfo.f1576a;
        }
        return null;
    }

    /* renamed from: c */
    public PorterDuff.Mode m716c() {
        TintInfo tintInfo = this.f1139e;
        if (tintInfo != null) {
            return tintInfo.f1577b;
        }
        return null;
    }

    /* renamed from: d */
    public void m717d(@Nullable AttributeSet attributeSet, int i2) {
        Context context = this.f1135a.getContext();
        int[] iArr = C0055R.styleable.f288B;
        TintTypedArray m951r = TintTypedArray.m951r(context, attributeSet, iArr, i2, 0);
        View view = this.f1135a;
        ViewCompat.m2194d0(view, view.getContext(), iArr, attributeSet, m951r.f1582b, i2, 0);
        try {
            if (m951r.m967p(0)) {
                this.f1137c = m951r.m964m(0, -1);
                ColorStateList m731d = this.f1136b.m731d(this.f1135a.getContext(), this.f1137c);
                if (m731d != null) {
                    m720g(m731d);
                }
            }
            if (m951r.m967p(1)) {
                ViewCompat.m2206j0(this.f1135a, m951r.m954c(1));
            }
            if (m951r.m967p(2)) {
                ViewCompat.m2208k0(this.f1135a, DrawableUtils.m852d(m951r.m961j(2, -1), null));
            }
        } finally {
            m951r.f1582b.recycle();
        }
    }

    /* renamed from: e */
    public void m718e() {
        this.f1137c = -1;
        m720g(null);
        m714a();
    }

    /* renamed from: f */
    public void m719f(int i2) {
        this.f1137c = i2;
        AppCompatDrawableManager appCompatDrawableManager = this.f1136b;
        m720g(appCompatDrawableManager != null ? appCompatDrawableManager.m731d(this.f1135a.getContext(), i2) : null);
        m714a();
    }

    /* renamed from: g */
    public void m720g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1138d == null) {
                this.f1138d = new TintInfo();
            }
            TintInfo tintInfo = this.f1138d;
            tintInfo.f1576a = colorStateList;
            tintInfo.f1579d = true;
        } else {
            this.f1138d = null;
        }
        m714a();
    }

    /* renamed from: h */
    public void m721h(ColorStateList colorStateList) {
        if (this.f1139e == null) {
            this.f1139e = new TintInfo();
        }
        TintInfo tintInfo = this.f1139e;
        tintInfo.f1576a = colorStateList;
        tintInfo.f1579d = true;
        m714a();
    }

    /* renamed from: i */
    public void m722i(PorterDuff.Mode mode) {
        if (this.f1139e == null) {
            this.f1139e = new TintInfo();
        }
        TintInfo tintInfo = this.f1139e;
        tintInfo.f1577b = mode;
        tintInfo.f1578c = true;
        m714a();
    }
}
