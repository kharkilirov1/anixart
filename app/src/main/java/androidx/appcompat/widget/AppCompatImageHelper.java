package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0055R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ImageViewCompat;

@RestrictTo
/* loaded from: classes.dex */
public class AppCompatImageHelper {

    /* renamed from: a */
    @NonNull
    public final ImageView f1185a;

    /* renamed from: b */
    public TintInfo f1186b;

    /* renamed from: c */
    public TintInfo f1187c;

    /* renamed from: d */
    public int f1188d = 0;

    public AppCompatImageHelper(@NonNull ImageView imageView) {
        this.f1185a = imageView;
    }

    /* renamed from: a */
    public void m747a() {
        Drawable drawable = this.f1185a.getDrawable();
        if (drawable != null) {
            DrawableUtils.m849a(drawable);
        }
        if (drawable != null) {
            int i2 = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i2 <= 21 && i2 == 21) {
                if (this.f1187c == null) {
                    this.f1187c = new TintInfo();
                }
                TintInfo tintInfo = this.f1187c;
                tintInfo.f1576a = null;
                tintInfo.f1579d = false;
                tintInfo.f1577b = null;
                tintInfo.f1578c = false;
                ColorStateList m2592a = ImageViewCompat.m2592a(this.f1185a);
                if (m2592a != null) {
                    tintInfo.f1579d = true;
                    tintInfo.f1576a = m2592a;
                }
                PorterDuff.Mode m2593b = ImageViewCompat.m2593b(this.f1185a);
                if (m2593b != null) {
                    tintInfo.f1578c = true;
                    tintInfo.f1577b = m2593b;
                }
                if (tintInfo.f1579d || tintInfo.f1578c) {
                    AppCompatDrawableManager.m729f(drawable, tintInfo, this.f1185a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            TintInfo tintInfo2 = this.f1186b;
            if (tintInfo2 != null) {
                AppCompatDrawableManager.m729f(drawable, tintInfo2, this.f1185a.getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public void m748b(AttributeSet attributeSet, int i2) {
        int m964m;
        Context context = this.f1185a.getContext();
        int[] iArr = C0055R.styleable.f296g;
        TintTypedArray m951r = TintTypedArray.m951r(context, attributeSet, iArr, i2, 0);
        ImageView imageView = this.f1185a;
        ViewCompat.m2194d0(imageView, imageView.getContext(), iArr, attributeSet, m951r.f1582b, i2, 0);
        try {
            Drawable drawable = this.f1185a.getDrawable();
            if (drawable == null && (m964m = m951r.m964m(1, -1)) != -1 && (drawable = AppCompatResources.m497b(this.f1185a.getContext(), m964m)) != null) {
                this.f1185a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                DrawableUtils.m849a(drawable);
            }
            if (m951r.m967p(2)) {
                ImageViewCompat.m2594c(this.f1185a, m951r.m954c(2));
            }
            if (m951r.m967p(3)) {
                ImageViewCompat.m2595d(this.f1185a, DrawableUtils.m852d(m951r.m961j(3, -1), null));
            }
        } finally {
            m951r.f1582b.recycle();
        }
    }

    /* renamed from: c */
    public void m749c(int i2) {
        if (i2 != 0) {
            Drawable m497b = AppCompatResources.m497b(this.f1185a.getContext(), i2);
            if (m497b != null) {
                DrawableUtils.m849a(m497b);
            }
            this.f1185a.setImageDrawable(m497b);
        } else {
            this.f1185a.setImageDrawable(null);
        }
        m747a();
    }

    /* renamed from: d */
    public void m750d(ColorStateList colorStateList) {
        if (this.f1186b == null) {
            this.f1186b = new TintInfo();
        }
        TintInfo tintInfo = this.f1186b;
        tintInfo.f1576a = colorStateList;
        tintInfo.f1579d = true;
        m747a();
    }

    /* renamed from: e */
    public void m751e(PorterDuff.Mode mode) {
        if (this.f1186b == null) {
            this.f1186b = new TintInfo();
        }
        TintInfo tintInfo = this.f1186b;
        tintInfo.f1577b = mode;
        tintInfo.f1578c = true;
        m747a();
    }
}
