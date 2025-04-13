package com.google.android.gms.common;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.room.util.C0576a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.common.internal.zaz;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.dynamic.RemoteCreator;
import com.swiftsoft.anixartd.C2507R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class SignInButton extends FrameLayout implements View.OnClickListener {

    /* renamed from: b */
    public int f15338b;

    /* renamed from: c */
    public int f15339c;

    /* renamed from: d */
    public View f15340d;

    /* renamed from: e */
    @Nullable
    public View.OnClickListener f15341e;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ButtonSize {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ColorScheme {
    }

    /* renamed from: a */
    public void m7931a(int i2, int i3) {
        this.f15338b = i2;
        this.f15339c = i3;
        Context context = getContext();
        View view = this.f15340d;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f15340d = zaz.m8190c(context, this.f15338b, this.f15339c);
        } catch (RemoteCreator.RemoteCreatorException unused) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i4 = this.f15338b;
            int i5 = this.f15339c;
            zaaa zaaaVar = new zaaa(context);
            Resources resources = context.getResources();
            zaaaVar.setTypeface(Typeface.DEFAULT_BOLD);
            zaaaVar.setTextSize(14.0f);
            int i6 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
            zaaaVar.setMinHeight(i6);
            zaaaVar.setMinWidth(i6);
            int m8178a = zaaa.m8178a(i5, C2507R.drawable.common_google_signin_btn_icon_dark, C2507R.drawable.common_google_signin_btn_icon_light, C2507R.drawable.common_google_signin_btn_icon_light);
            int m8178a2 = zaaa.m8178a(i5, C2507R.drawable.common_google_signin_btn_text_dark, C2507R.drawable.common_google_signin_btn_text_light, C2507R.drawable.common_google_signin_btn_text_light);
            if (i4 == 0 || i4 == 1) {
                m8178a = m8178a2;
            } else if (i4 != 2) {
                throw new IllegalStateException(C0576a.m4111j(32, "Unknown button size: ", i4));
            }
            Drawable m1845q = DrawableCompat.m1845q(resources.getDrawable(m8178a));
            DrawableCompat.m1842n(m1845q, resources.getColorStateList(C2507R.color.common_google_signin_btn_tint));
            DrawableCompat.m1843o(m1845q, PorterDuff.Mode.SRC_ATOP);
            zaaaVar.setBackgroundDrawable(m1845q);
            ColorStateList colorStateList = resources.getColorStateList(zaaa.m8178a(i5, C2507R.color.common_google_signin_btn_text_dark, C2507R.color.common_google_signin_btn_text_light, C2507R.color.common_google_signin_btn_text_light));
            Objects.requireNonNull(colorStateList, "null reference");
            zaaaVar.setTextColor(colorStateList);
            if (i4 == 0) {
                zaaaVar.setText(resources.getString(C2507R.string.common_signin_button_text));
            } else if (i4 == 1) {
                zaaaVar.setText(resources.getString(C2507R.string.common_signin_button_text_long));
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException(C0576a.m4111j(32, "Unknown button size: ", i4));
                }
                zaaaVar.setText((CharSequence) null);
            }
            zaaaVar.setTransformationMethod(null);
            if (DeviceProperties.m8239a(zaaaVar.getContext())) {
                zaaaVar.setGravity(19);
            }
            this.f15340d = zaaaVar;
        }
        addView(this.f15340d);
        this.f15340d.setEnabled(isEnabled());
        this.f15340d.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NonNull View view) {
        View.OnClickListener onClickListener = this.f15341e;
        if (onClickListener == null || view != this.f15340d) {
            return;
        }
        onClickListener.onClick(this);
    }

    public void setColorScheme(int i2) {
        m7931a(this.f15338b, i2);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f15340d.setEnabled(z);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f15341e = onClickListener;
        View view = this.f15340d;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(@NonNull Scope[] scopeArr) {
        m7931a(this.f15338b, this.f15339c);
    }

    public void setSize(int i2) {
        m7931a(i2, this.f15339c);
    }
}
