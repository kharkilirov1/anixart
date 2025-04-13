package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableCompoundButton;
import androidx.core.widget.TintableCompoundDrawablesView;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements TintableCompoundButton, TintableBackgroundView, EmojiCompatConfigurationView, TintableCompoundDrawablesView {

    /* renamed from: b */
    public final AppCompatCompoundButtonHelper f1144b;

    /* renamed from: c */
    public final AppCompatBackgroundHelper f1145c;

    /* renamed from: d */
    public final AppCompatTextHelper f1146d;

    /* renamed from: e */
    public AppCompatEmojiTextHelper f1147e;

    public AppCompatCheckBox(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C2507R.attr.checkboxStyle);
    }

    @NonNull
    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.f1147e == null) {
            this.f1147e = new AppCompatEmojiTextHelper(this);
        }
        return this.f1147e;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1145c;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m714a();
        }
        AppCompatTextHelper appCompatTextHelper = this.f1146d;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m782b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        return super.getCompoundPaddingLeft();
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1145c;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m715b();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1145c;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m716c();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCompoundButton
    @Nullable
    @RestrictTo
    public ColorStateList getSupportButtonTintList() {
        AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = this.f1144b;
        if (appCompatCompoundButtonHelper != null) {
            return appCompatCompoundButtonHelper.f1159b;
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportButtonTintMode() {
        AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = this.f1144b;
        if (appCompatCompoundButtonHelper != null) {
            return appCompatCompoundButtonHelper.f1160c;
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1146d.m783d();
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1146d.m784e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().f1181b.m2882c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1145c;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m718e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i2) {
        super.setBackgroundResource(i2);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1145c;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m719f(i2);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = this.f1144b;
        if (appCompatCompoundButtonHelper != null) {
            if (appCompatCompoundButtonHelper.f1163f) {
                appCompatCompoundButtonHelper.f1163f = false;
            } else {
                appCompatCompoundButtonHelper.f1163f = true;
                appCompatCompoundButtonHelper.m724a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f1146d;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m782b();
        }
    }

    @Override // android.widget.TextView
    @RequiresApi
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f1146d;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m782b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().f1181b.m2883d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f1181b.m2880a(inputFilterArr));
    }

    @RestrictTo
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1145c;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m721h(colorStateList);
        }
    }

    @RestrictTo
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1145c;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m722i(mode);
        }
    }

    @Override // androidx.core.widget.TintableCompoundButton
    @RestrictTo
    public void setSupportButtonTintList(@Nullable ColorStateList colorStateList) {
        AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = this.f1144b;
        if (appCompatCompoundButtonHelper != null) {
            appCompatCompoundButtonHelper.f1159b = colorStateList;
            appCompatCompoundButtonHelper.f1161d = true;
            appCompatCompoundButtonHelper.m724a();
        }
    }

    @Override // androidx.core.widget.TintableCompoundButton
    @RestrictTo
    public void setSupportButtonTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = this.f1144b;
        if (appCompatCompoundButtonHelper != null) {
            appCompatCompoundButtonHelper.f1160c = mode;
            appCompatCompoundButtonHelper.f1162e = true;
            appCompatCompoundButtonHelper.m724a();
        }
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        this.f1146d.m792m(colorStateList);
        this.f1146d.m782b();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        this.f1146d.m793n(mode);
        this.f1146d.m782b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckBox(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TintContextWrapper.m949a(context);
        ThemeUtils.m945a(this, getContext());
        AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = new AppCompatCompoundButtonHelper(this);
        this.f1144b = appCompatCompoundButtonHelper;
        appCompatCompoundButtonHelper.m725b(attributeSet, i2);
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f1145c = appCompatBackgroundHelper;
        appCompatBackgroundHelper.m717d(attributeSet, i2);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.f1146d = appCompatTextHelper;
        appCompatTextHelper.m786g(attributeSet, i2);
        getEmojiTextViewHelper().m745a(attributeSet, i2);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(@DrawableRes int i2) {
        setButtonDrawable(AppCompatResources.m497b(getContext(), i2));
    }
}
