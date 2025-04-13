package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableImageSourceView;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton implements TintableBackgroundView, TintableImageSourceView {

    /* renamed from: b */
    public final AppCompatBackgroundHelper f1182b;

    /* renamed from: c */
    public final AppCompatImageHelper f1183c;

    /* renamed from: d */
    public boolean f1184d;

    public AppCompatImageButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C2507R.attr.imageButtonStyle);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1182b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m714a();
        }
        AppCompatImageHelper appCompatImageHelper = this.f1183c;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.m747a();
        }
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1182b;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m715b();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1182b;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m716c();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportImageTintList() {
        TintInfo tintInfo;
        AppCompatImageHelper appCompatImageHelper = this.f1183c;
        if (appCompatImageHelper == null || (tintInfo = appCompatImageHelper.f1186b) == null) {
            return null;
        }
        return tintInfo.f1576a;
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportImageTintMode() {
        TintInfo tintInfo;
        AppCompatImageHelper appCompatImageHelper = this.f1183c;
        if (appCompatImageHelper == null || (tintInfo = appCompatImageHelper.f1186b) == null) {
            return null;
        }
        return tintInfo.f1577b;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return ((this.f1183c.f1185a.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1182b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m718e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i2) {
        super.setBackgroundResource(i2);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1182b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m719f(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        AppCompatImageHelper appCompatImageHelper = this.f1183c;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.m747a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        AppCompatImageHelper appCompatImageHelper = this.f1183c;
        if (appCompatImageHelper != null && drawable != null && !this.f1184d) {
            appCompatImageHelper.f1188d = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        AppCompatImageHelper appCompatImageHelper2 = this.f1183c;
        if (appCompatImageHelper2 != null) {
            appCompatImageHelper2.m747a();
            if (this.f1184d) {
                return;
            }
            AppCompatImageHelper appCompatImageHelper3 = this.f1183c;
            if (appCompatImageHelper3.f1185a.getDrawable() != null) {
                appCompatImageHelper3.f1185a.getDrawable().setLevel(appCompatImageHelper3.f1188d);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i2) {
        super.setImageLevel(i2);
        this.f1184d = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i2) {
        this.f1183c.m749c(i2);
    }

    @Override // android.widget.ImageView
    public void setImageURI(@Nullable Uri uri) {
        super.setImageURI(uri);
        AppCompatImageHelper appCompatImageHelper = this.f1183c;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.m747a();
        }
    }

    @RestrictTo
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1182b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m721h(colorStateList);
        }
    }

    @RestrictTo
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1182b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m722i(mode);
        }
    }

    @RestrictTo
    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        AppCompatImageHelper appCompatImageHelper = this.f1183c;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.m750d(colorStateList);
        }
    }

    @RestrictTo
    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatImageHelper appCompatImageHelper = this.f1183c;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.m751e(mode);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TintContextWrapper.m949a(context);
        this.f1184d = false;
        ThemeUtils.m945a(this, getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f1182b = appCompatBackgroundHelper;
        appCompatBackgroundHelper.m717d(attributeSet, i2);
        AppCompatImageHelper appCompatImageHelper = new AppCompatImageHelper(this);
        this.f1183c = appCompatImageHelper;
        appCompatImageHelper.m748b(attributeSet, i2);
    }
}
