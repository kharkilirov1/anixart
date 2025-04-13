package com.swiftsoft.anixartd.utils.radiobutton.types;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.swiftsoft.anixartd.utils.radiobutton.CustomRadioButton;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OneFieldCardRadioButton.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/radiobutton/types/OneFieldCardRadioButton;", "Lcom/swiftsoft/anixartd/utils/radiobutton/CustomRadioButton;", "", "k", "Z", "isChecked", "()Z", "setChecked", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class OneFieldCardRadioButton extends CustomRadioButton {

    /* renamed from: e */
    @Nullable
    public TextView f30544e;

    /* renamed from: f */
    @Nullable
    public ImageView f30545f;

    /* renamed from: g */
    @Nullable
    public ImageView f30546g;

    /* renamed from: h */
    @Nullable
    public String f30547h;

    /* renamed from: i */
    @Nullable
    public Integer f30548i;

    /* renamed from: j */
    public boolean f30549j;

    /* renamed from: k, reason: from kotlin metadata */
    public boolean isChecked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneFieldCardRadioButton(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs, C2507R.layout.item_radio_button_one_field_card, C2507R.styleable.f25397c);
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(attrs, "attrs");
        new LinkedHashMap();
    }

    @Override // com.swiftsoft.anixartd.utils.radiobutton.CustomRadioButton
    /* renamed from: a */
    public void mo16465a() {
        this.f30544e = (TextView) findViewById(C2507R.id.radio_button_two_fields_card_title);
        this.f30545f = (ImageView) findViewById(C2507R.id.radio_button_two_fields_card_icon);
        this.f30546g = (ImageView) findViewById(C2507R.id.radio_button_two_fields_card_chevron);
    }

    @Override // com.swiftsoft.anixartd.utils.radiobutton.CustomRadioButton
    /* renamed from: b */
    public void mo16466b() {
        if (getStyledAttributes().hasValue(4)) {
            this.f30547h = getStyledAttributes().getString(4);
        }
        if (getStyledAttributes().hasValue(2)) {
            this.f30548i = Integer.valueOf(getStyledAttributes().getResourceId(2, C2507R.drawable.ic_check));
        }
        if (getStyledAttributes().hasValue(0)) {
            this.f30549j = getStyledAttributes().getBoolean(0, false);
        }
    }

    @Override // com.swiftsoft.anixartd.utils.radiobutton.CustomRadioButton
    /* renamed from: c */
    public void mo16467c() {
        TextView textView = this.f30544e;
        if (textView != null) {
            textView.setText(this.f30547h);
        }
        if (this.f30548i != null) {
            Context context = getContext();
            Integer num = this.f30548i;
            Intrinsics.m32176e(num);
            Drawable m497b = AppCompatResources.m497b(context, num.intValue());
            Intrinsics.m32176e(m497b);
            Drawable m1845q = DrawableCompat.m1845q(m497b);
            Intrinsics.m32178g(m1845q, "wrap(unwrappedDrawable!!)");
            DrawableCompat.m1841m(m1845q, ViewsKt.m16370c(this, C2507R.attr.iconTintColor));
            ImageView imageView = this.f30545f;
            if (imageView != null) {
                imageView.setBackgroundDrawable(m1845q);
            }
        } else {
            ImageView imageView2 = this.f30545f;
            if (imageView2 != null) {
                ViewsKt.m16372e(imageView2);
            }
        }
        ImageView imageView3 = this.f30546g;
        if (imageView3 != null) {
            ViewsKt.m16379l(imageView3, this.f30549j);
        }
    }

    @Override // com.swiftsoft.anixartd.utils.radiobutton.CustomRadioButton
    /* renamed from: d */
    public void mo16468d() {
        setAlpha(1.0f);
        setBackground(ContextCompat.m1671d(getContext(), C2507R.drawable.background_custom_radio_button_one_field_card_selected_state));
        TextView textView = this.f30544e;
        if (textView != null) {
            textView.setTextColor(ViewsKt.m16370c(this, C2507R.attr.iconAccentTintColor));
        }
        Typeface m1735e = ResourcesCompat.m1735e(getContext(), C2507R.font.roboto_medium);
        TextView textView2 = this.f30544e;
        if (textView2 != null) {
            textView2.setTypeface(m1735e);
        }
        if (this.f30548i != null) {
            Context context = getContext();
            Integer num = this.f30548i;
            Intrinsics.m32176e(num);
            Drawable m497b = AppCompatResources.m497b(context, num.intValue());
            Intrinsics.m32176e(m497b);
            Drawable m1845q = DrawableCompat.m1845q(m497b);
            Intrinsics.m32178g(m1845q, "wrap(unwrappedDrawable!!)");
            DrawableCompat.m1841m(m1845q, ViewsKt.m16370c(this, C2507R.attr.iconAccentTintColor));
            ImageView imageView = this.f30545f;
            if (imageView != null) {
                imageView.setBackgroundDrawable(m1845q);
            }
        }
        ImageView imageView2 = this.f30546g;
        Intrinsics.m32176e(imageView2);
        imageView2.setImageTintList(ColorStateList.valueOf(ViewsKt.m16370c(this, C2507R.attr.iconAccentTintColor)));
        this.isChecked = true;
    }

    @Override // com.swiftsoft.anixartd.utils.radiobutton.CustomRadioButton
    /* renamed from: e */
    public void mo16469e() {
        setAlpha(1.0f);
        setBackground(ContextCompat.m1671d(getContext(), C2507R.drawable.background_custom_radio_button_one_field_card_unselected_state));
        TextView textView = this.f30544e;
        if (textView != null) {
            textView.setTextColor(ViewsKt.m16370c(this, C2507R.attr.primaryTextColor));
        }
        TextView textView2 = this.f30544e;
        if (textView2 != null) {
            textView2.setTypeface(Typeface.DEFAULT);
        }
        if (this.f30548i != null) {
            Context context = getContext();
            Integer num = this.f30548i;
            Intrinsics.m32176e(num);
            Drawable m497b = AppCompatResources.m497b(context, num.intValue());
            Intrinsics.m32176e(m497b);
            Drawable m1845q = DrawableCompat.m1845q(m497b);
            Intrinsics.m32178g(m1845q, "wrap(unwrappedDrawable!!)");
            DrawableCompat.m1841m(m1845q, ViewsKt.m16370c(this, C2507R.attr.iconTintColor));
            ImageView imageView = this.f30545f;
            if (imageView != null) {
                imageView.setBackgroundDrawable(m1845q);
            }
        }
        ImageView imageView2 = this.f30546g;
        Intrinsics.m32176e(imageView2);
        imageView2.setImageTintList(ColorStateList.valueOf(ViewsKt.m16370c(this, C2507R.attr.iconTintColor)));
        this.isChecked = false;
    }

    public final void setChecked(boolean z) {
        this.isChecked = z;
    }
}
