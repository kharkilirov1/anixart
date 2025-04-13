package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextClassifierHelper;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.graphics.TypefaceCompatBaseImpl;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCompoundDrawablesView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements TintableBackgroundView, TintableCompoundDrawablesView, AutoSizeableTextView, EmojiCompatConfigurationView {

    /* renamed from: b */
    public final AppCompatBackgroundHelper f1261b;

    /* renamed from: c */
    public final AppCompatTextHelper f1262c;

    /* renamed from: d */
    public final AppCompatTextClassifierHelper f1263d;

    /* renamed from: e */
    @NonNull
    public AppCompatEmojiTextHelper f1264e;

    /* renamed from: f */
    public boolean f1265f;

    /* renamed from: g */
    @Nullable
    public Future<PrecomputedTextCompat> f1266g;

    public AppCompatTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @NonNull
    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.f1264e == null) {
            this.f1264e = new AppCompatEmojiTextHelper(this);
        }
        return this.f1264e;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1261b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m714a();
        }
        AppCompatTextHelper appCompatTextHelper = this.f1262c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m782b();
        }
    }

    @Override // android.widget.TextView
    @RestrictTo
    public int getAutoSizeMaxTextSize() {
        if (AutoSizeableTextView.f3815u1) {
            return super.getAutoSizeMaxTextSize();
        }
        AppCompatTextHelper appCompatTextHelper = this.f1262c;
        if (appCompatTextHelper != null) {
            return Math.round(appCompatTextHelper.f1249i.f1274e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    @RestrictTo
    public int getAutoSizeMinTextSize() {
        if (AutoSizeableTextView.f3815u1) {
            return super.getAutoSizeMinTextSize();
        }
        AppCompatTextHelper appCompatTextHelper = this.f1262c;
        if (appCompatTextHelper != null) {
            return Math.round(appCompatTextHelper.f1249i.f1273d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    @RestrictTo
    public int getAutoSizeStepGranularity() {
        if (AutoSizeableTextView.f3815u1) {
            return super.getAutoSizeStepGranularity();
        }
        AppCompatTextHelper appCompatTextHelper = this.f1262c;
        if (appCompatTextHelper != null) {
            return Math.round(appCompatTextHelper.f1249i.f1272c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    @RestrictTo
    public int[] getAutoSizeTextAvailableSizes() {
        if (AutoSizeableTextView.f3815u1) {
            return super.getAutoSizeTextAvailableSizes();
        }
        AppCompatTextHelper appCompatTextHelper = this.f1262c;
        return appCompatTextHelper != null ? appCompatTextHelper.f1249i.f1275f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint
    @RestrictTo
    public int getAutoSizeTextType() {
        if (AutoSizeableTextView.f3815u1) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        AppCompatTextHelper appCompatTextHelper = this.f1262c;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.f1249i.f1270a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.m2651m(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1261b;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m715b();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1261b;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m716c();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1262c.m783d();
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1262c.m784e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<PrecomputedTextCompat> future = this.f1266g;
        if (future != null) {
            try {
                this.f1266g = null;
                TextViewCompat.m2648j(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    @NonNull
    @RequiresApi
    public TextClassifier getTextClassifier() {
        AppCompatTextClassifierHelper appCompatTextClassifierHelper;
        if (Build.VERSION.SDK_INT >= 28 || (appCompatTextClassifierHelper = this.f1263d) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = appCompatTextClassifierHelper.f1240b;
        return textClassifier == null ? AppCompatTextClassifierHelper.Api26Impl.m779a(appCompatTextClassifierHelper.f1239a) : textClassifier;
    }

    @NonNull
    public PrecomputedTextCompat.Params getTextMetricsParamsCompat() {
        return TextViewCompat.m2641c(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1262c.m788i(this, onCreateInputConnection, editorInfo);
        AppCompatHintHelper.m746a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        AppCompatTextHelper appCompatTextHelper = this.f1262c;
        if (appCompatTextHelper == null || AutoSizeableTextView.f3815u1) {
            return;
        }
        appCompatTextHelper.f1249i.m810a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        Future<PrecomputedTextCompat> future = this.f1266g;
        if (future != null) {
            try {
                this.f1266g = null;
                TextViewCompat.m2648j(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        AppCompatTextHelper appCompatTextHelper = this.f1262c;
        if (appCompatTextHelper == null || AutoSizeableTextView.f3815u1 || !appCompatTextHelper.m785f()) {
            return;
        }
        this.f1262c.f1249i.m810a();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().f1181b.m2882c(z);
    }

    @Override // android.widget.TextView
    @RestrictTo
    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) throws IllegalArgumentException {
        if (AutoSizeableTextView.f3815u1) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.f1262c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m789j(i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    @RestrictTo
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i2) throws IllegalArgumentException {
        if (AutoSizeableTextView.f3815u1) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.f1262c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m790k(iArr, i2);
        }
    }

    @Override // android.widget.TextView
    @RestrictTo
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (AutoSizeableTextView.f3815u1) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.f1262c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m791l(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1261b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m718e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i2) {
        super.setBackgroundResource(i2);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1261b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m719f(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f1262c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m782b();
        }
    }

    @Override // android.widget.TextView
    @RequiresApi
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f1262c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m782b();
        }
    }

    @Override // android.widget.TextView
    @RequiresApi
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f1262c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m782b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f1262c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m782b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.m2652n(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().f1181b.m2883d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f1181b.m2880a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(@IntRange @Px int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i2);
        } else {
            TextViewCompat.m2645g(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(@IntRange @Px int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i2);
        } else {
            TextViewCompat.m2646h(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(@IntRange @Px int i2) {
        TextViewCompat.m2647i(this, i2);
    }

    public void setPrecomputedText(@NonNull PrecomputedTextCompat precomputedTextCompat) {
        TextViewCompat.m2648j(this, precomputedTextCompat);
    }

    @RestrictTo
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1261b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m721h(colorStateList);
        }
    }

    @RestrictTo
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1261b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m722i(mode);
        }
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        this.f1262c.m792m(colorStateList);
        this.f1262c.m782b();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        this.f1262c.m793n(mode);
        this.f1262c.m782b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        AppCompatTextHelper appCompatTextHelper = this.f1262c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m787h(context, i2);
        }
    }

    @Override // android.widget.TextView
    @RequiresApi
    public void setTextClassifier(@Nullable TextClassifier textClassifier) {
        AppCompatTextClassifierHelper appCompatTextClassifierHelper;
        if (Build.VERSION.SDK_INT >= 28 || (appCompatTextClassifierHelper = this.f1263d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            appCompatTextClassifierHelper.f1240b = textClassifier;
        }
    }

    public void setTextFuture(@Nullable Future<PrecomputedTextCompat> future) {
        this.f1266g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull PrecomputedTextCompat.Params params) {
        TextViewCompat.m2650l(this, params);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f2) {
        boolean z = AutoSizeableTextView.f3815u1;
        if (z) {
            super.setTextSize(i2, f2);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.f1262c;
        if (appCompatTextHelper == null || z || appCompatTextHelper.m785f()) {
            return;
        }
        appCompatTextHelper.f1249i.m813f(i2, f2);
    }

    @Override // android.widget.TextView
    public void setTypeface(@Nullable Typeface typeface, int i2) {
        if (this.f1265f) {
            return;
        }
        Typeface typeface2 = null;
        if (typeface != null && i2 > 0) {
            Context context = getContext();
            TypefaceCompatBaseImpl typefaceCompatBaseImpl = TypefaceCompat.f3376a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i2);
        }
        this.f1265f = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i2);
        } finally {
            this.f1265f = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TintContextWrapper.m949a(context);
        this.f1265f = false;
        ThemeUtils.m945a(this, getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f1261b = appCompatBackgroundHelper;
        appCompatBackgroundHelper.m717d(attributeSet, i2);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.f1262c = appCompatTextHelper;
        appCompatTextHelper.m786g(attributeSet, i2);
        appCompatTextHelper.m782b();
        this.f1263d = new AppCompatTextClassifierHelper(this);
        getEmojiTextViewHelper().m745a(attributeSet, i2);
    }

    @Override // android.widget.TextView
    @RequiresApi
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i2 != 0 ? AppCompatResources.m497b(context, i2) : null, i3 != 0 ? AppCompatResources.m497b(context, i3) : null, i4 != 0 ? AppCompatResources.m497b(context, i4) : null, i5 != 0 ? AppCompatResources.m497b(context, i5) : null);
        AppCompatTextHelper appCompatTextHelper = this.f1262c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m782b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i2 != 0 ? AppCompatResources.m497b(context, i2) : null, i3 != 0 ? AppCompatResources.m497b(context, i3) : null, i4 != 0 ? AppCompatResources.m497b(context, i4) : null, i5 != 0 ? AppCompatResources.m497b(context, i5) : null);
        AppCompatTextHelper appCompatTextHelper = this.f1262c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m782b();
        }
    }
}
