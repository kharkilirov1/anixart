package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCheckedTextView;
import androidx.core.widget.TintableCompoundDrawablesView;

/* loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView implements TintableCheckedTextView, TintableBackgroundView, EmojiCompatConfigurationView, TintableCompoundDrawablesView {

    /* renamed from: b */
    public final AppCompatCheckedTextViewHelper f1148b;

    /* renamed from: c */
    public final AppCompatBackgroundHelper f1149c;

    /* renamed from: d */
    public final AppCompatTextHelper f1150d;

    /* renamed from: e */
    @NonNull
    public AppCompatEmojiTextHelper f1151e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084 A[Catch: all -> 0x00b0, TryCatch #0 {all -> 0x00b0, blocks: (B:3:0x0049, B:5:0x004f, B:8:0x0055, B:10:0x0064, B:12:0x006a, B:14:0x0070, B:15:0x007d, B:17:0x0084, B:18:0x008d, B:20:0x0094), top: B:2:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0094 A[Catch: all -> 0x00b0, TRY_LEAVE, TryCatch #0 {all -> 0x00b0, blocks: (B:3:0x0049, B:5:0x004f, B:8:0x0055, B:10:0x0064, B:12:0x006a, B:14:0x0070, B:15:0x007d, B:17:0x0084, B:18:0x008d, B:20:0x0094), top: B:2:0x0049 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppCompatCheckedTextView(@androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.Nullable android.util.AttributeSet r12) {
        /*
            r10 = this;
            androidx.appcompat.widget.TintContextWrapper.m949a(r11)
            r0 = 2130968770(0x7f0400c2, float:1.7546203E38)
            r10.<init>(r11, r12, r0)
            android.content.Context r11 = r10.getContext()
            androidx.appcompat.widget.ThemeUtils.m945a(r10, r11)
            androidx.appcompat.widget.AppCompatTextHelper r11 = new androidx.appcompat.widget.AppCompatTextHelper
            r11.<init>(r10)
            r10.f1150d = r11
            r11.m786g(r12, r0)
            r11.m782b()
            androidx.appcompat.widget.AppCompatBackgroundHelper r11 = new androidx.appcompat.widget.AppCompatBackgroundHelper
            r11.<init>(r10)
            r10.f1149c = r11
            r11.m717d(r12, r0)
            androidx.appcompat.widget.AppCompatCheckedTextViewHelper r11 = new androidx.appcompat.widget.AppCompatCheckedTextViewHelper
            r11.<init>(r10)
            r10.f1148b = r11
            android.content.Context r1 = r10.getContext()
            int[] r4 = androidx.appcompat.C0055R.styleable.f302m
            r9 = 0
            androidx.appcompat.widget.TintTypedArray r1 = androidx.appcompat.widget.TintTypedArray.m951r(r1, r12, r4, r0, r9)
            android.content.Context r3 = r10.getContext()
            android.content.res.TypedArray r6 = r1.f1582b
            r8 = 0
            r7 = 2130968770(0x7f0400c2, float:1.7546203E38)
            r2 = r10
            r5 = r12
            androidx.core.view.ViewCompat.m2194d0(r2, r3, r4, r5, r6, r7, r8)
            r2 = 1
            boolean r3 = r1.m967p(r2)     // Catch: java.lang.Throwable -> Lb0
            if (r3 == 0) goto L61
            int r3 = r1.m964m(r2, r9)     // Catch: java.lang.Throwable -> Lb0
            if (r3 == 0) goto L61
            android.content.Context r4 = r10.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L61 java.lang.Throwable -> Lb0
            android.graphics.drawable.Drawable r3 = androidx.appcompat.content.res.AppCompatResources.m497b(r4, r3)     // Catch: android.content.res.Resources.NotFoundException -> L61 java.lang.Throwable -> Lb0
            r10.setCheckMarkDrawable(r3)     // Catch: android.content.res.Resources.NotFoundException -> L61 java.lang.Throwable -> Lb0
            goto L62
        L61:
            r2 = 0
        L62:
            if (r2 != 0) goto L7d
            boolean r2 = r1.m967p(r9)     // Catch: java.lang.Throwable -> Lb0
            if (r2 == 0) goto L7d
            int r2 = r1.m964m(r9, r9)     // Catch: java.lang.Throwable -> Lb0
            if (r2 == 0) goto L7d
            android.widget.CheckedTextView r3 = r11.f1152a     // Catch: java.lang.Throwable -> Lb0
            android.content.Context r4 = r3.getContext()     // Catch: java.lang.Throwable -> Lb0
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.m497b(r4, r2)     // Catch: java.lang.Throwable -> Lb0
            r3.setCheckMarkDrawable(r2)     // Catch: java.lang.Throwable -> Lb0
        L7d:
            r2 = 2
            boolean r3 = r1.m967p(r2)     // Catch: java.lang.Throwable -> Lb0
            if (r3 == 0) goto L8d
            android.widget.CheckedTextView r3 = r11.f1152a     // Catch: java.lang.Throwable -> Lb0
            android.content.res.ColorStateList r2 = r1.m954c(r2)     // Catch: java.lang.Throwable -> Lb0
            r3.setCheckMarkTintList(r2)     // Catch: java.lang.Throwable -> Lb0
        L8d:
            r2 = 3
            boolean r3 = r1.m967p(r2)     // Catch: java.lang.Throwable -> Lb0
            if (r3 == 0) goto La3
            android.widget.CheckedTextView r11 = r11.f1152a     // Catch: java.lang.Throwable -> Lb0
            r3 = -1
            int r2 = r1.m961j(r2, r3)     // Catch: java.lang.Throwable -> Lb0
            r3 = 0
            android.graphics.PorterDuff$Mode r2 = androidx.appcompat.widget.DrawableUtils.m852d(r2, r3)     // Catch: java.lang.Throwable -> Lb0
            r11.setCheckMarkTintMode(r2)     // Catch: java.lang.Throwable -> Lb0
        La3:
            android.content.res.TypedArray r11 = r1.f1582b
            r11.recycle()
            androidx.appcompat.widget.AppCompatEmojiTextHelper r11 = r10.getEmojiTextViewHelper()
            r11.m745a(r12, r0)
            return
        Lb0:
            r11 = move-exception
            android.content.res.TypedArray r12 = r1.f1582b
            r12.recycle()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatCheckedTextView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @NonNull
    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.f1151e == null) {
            this.f1151e = new AppCompatEmojiTextHelper(this);
        }
        return this.f1151e;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatTextHelper appCompatTextHelper = this.f1150d;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m782b();
        }
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1149c;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m714a();
        }
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.f1148b;
        if (appCompatCheckedTextViewHelper != null) {
            appCompatCheckedTextViewHelper.m723a();
        }
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.m2651m(super.getCustomSelectionActionModeCallback());
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1149c;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m715b();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1149c;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m716c();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportCheckMarkTintList() {
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.f1148b;
        if (appCompatCheckedTextViewHelper != null) {
            return appCompatCheckedTextViewHelper.f1153b;
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.f1148b;
        if (appCompatCheckedTextViewHelper != null) {
            return appCompatCheckedTextViewHelper.f1154c;
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1150d.m783d();
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1150d.m784e();
    }

    @Override // android.widget.TextView, android.view.View
    @Nullable
    public InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AppCompatHintHelper.m746a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().f1181b.m2882c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1149c;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m718e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i2) {
        super.setBackgroundResource(i2);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1149c;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m719f(i2);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@Nullable Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.f1148b;
        if (appCompatCheckedTextViewHelper != null) {
            if (appCompatCheckedTextViewHelper.f1157f) {
                appCompatCheckedTextViewHelper.f1157f = false;
            } else {
                appCompatCheckedTextViewHelper.f1157f = true;
                appCompatCheckedTextViewHelper.m723a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f1150d;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m782b();
        }
    }

    @Override // android.widget.TextView
    @RequiresApi
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f1150d;
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

    @RestrictTo
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1149c;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m721h(colorStateList);
        }
    }

    @RestrictTo
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1149c;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m722i(mode);
        }
    }

    @RestrictTo
    public void setSupportCheckMarkTintList(@Nullable ColorStateList colorStateList) {
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.f1148b;
        if (appCompatCheckedTextViewHelper != null) {
            appCompatCheckedTextViewHelper.f1153b = colorStateList;
            appCompatCheckedTextViewHelper.f1155d = true;
            appCompatCheckedTextViewHelper.m723a();
        }
    }

    @RestrictTo
    public void setSupportCheckMarkTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.f1148b;
        if (appCompatCheckedTextViewHelper != null) {
            appCompatCheckedTextViewHelper.f1154c = mode;
            appCompatCheckedTextViewHelper.f1156e = true;
            appCompatCheckedTextViewHelper.m723a();
        }
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        this.f1150d.m792m(colorStateList);
        this.f1150d.m782b();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        this.f1150d.m793n(mode);
        this.f1150d.m782b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(@NonNull Context context, int i2) {
        super.setTextAppearance(context, i2);
        AppCompatTextHelper appCompatTextHelper = this.f1150d;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m787h(context, i2);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@DrawableRes int i2) {
        setCheckMarkDrawable(AppCompatResources.m497b(getContext(), i2));
    }
}
