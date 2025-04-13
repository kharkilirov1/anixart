package com.google.android.material.dialog;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: classes.dex */
public class MaterialAlertDialogBuilder extends AlertDialog.Builder {
    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    /* renamed from: a */
    public AlertDialog.Builder mo367a(boolean z) {
        this.f413a.f384m = z;
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    /* renamed from: b */
    public AlertDialog.Builder mo368b(@Nullable Drawable drawable) {
        this.f413a.f374c = drawable;
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    /* renamed from: c */
    public AlertDialog.Builder mo369c(@Nullable CharSequence charSequence) {
        this.f413a.f377f = charSequence;
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public AlertDialog create() {
        super.create().getWindow().getDecorView();
        throw null;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    /* renamed from: d */
    public AlertDialog.Builder mo370d(@Nullable CharSequence[] charSequenceArr, @Nullable boolean[] zArr, @Nullable DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        AlertController.AlertParams alertParams = this.f413a;
        alertParams.f388q = charSequenceArr;
        alertParams.f396y = onMultiChoiceClickListener;
        alertParams.f392u = zArr;
        alertParams.f393v = true;
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    /* renamed from: e */
    public AlertDialog.Builder mo371e(@Nullable CharSequence charSequence, @Nullable DialogInterface.OnClickListener onClickListener) {
        AlertController.AlertParams alertParams = this.f413a;
        alertParams.f380i = charSequence;
        alertParams.f381j = onClickListener;
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    /* renamed from: f */
    public AlertDialog.Builder mo372f(@StringRes int i2, @Nullable DialogInterface.OnClickListener onClickListener) {
        super.mo372f(i2, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    /* renamed from: g */
    public AlertDialog.Builder mo373g(@Nullable DialogInterface.OnDismissListener onDismissListener) {
        this.f413a.f386o = onDismissListener;
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    /* renamed from: h */
    public AlertDialog.Builder mo374h(@Nullable DialogInterface.OnKeyListener onKeyListener) {
        this.f413a.f387p = onKeyListener;
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    /* renamed from: i */
    public AlertDialog.Builder mo375i(@Nullable CharSequence charSequence, @Nullable DialogInterface.OnClickListener onClickListener) {
        AlertController.AlertParams alertParams = this.f413a;
        alertParams.f378g = charSequence;
        alertParams.f379h = onClickListener;
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    /* renamed from: j */
    public AlertDialog.Builder mo376j(@Nullable CharSequence[] charSequenceArr, int i2, @Nullable DialogInterface.OnClickListener onClickListener) {
        AlertController.AlertParams alertParams = this.f413a;
        alertParams.f388q = charSequenceArr;
        alertParams.f390s = onClickListener;
        alertParams.f395x = i2;
        alertParams.f394w = true;
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    /* renamed from: k */
    public AlertDialog.Builder mo377k(@StringRes int i2) {
        AlertController.AlertParams alertParams = this.f413a;
        alertParams.f375d = alertParams.f372a.getText(i2);
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public AlertDialog.Builder setNegativeButton(@StringRes int i2, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNegativeButton(i2, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public AlertDialog.Builder setPositiveButton(@StringRes int i2, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setPositiveButton(i2, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public AlertDialog.Builder setTitle(@Nullable CharSequence charSequence) {
        return (MaterialAlertDialogBuilder) super.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    @CanIgnoreReturnValue
    public AlertDialog.Builder setView(@Nullable View view) {
        return (MaterialAlertDialogBuilder) super.setView(view);
    }
}
