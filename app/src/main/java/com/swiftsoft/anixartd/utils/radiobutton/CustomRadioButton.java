package com.swiftsoft.anixartd.utils.radiobutton;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CustomRadioButton.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001R\"\u0010\t\u001a\u00020\u00028\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/radiobutton/CustomRadioButton;", "Landroid/widget/LinearLayout;", "Landroid/content/res/TypedArray;", "d", "Landroid/content/res/TypedArray;", "getStyledAttributes", "()Landroid/content/res/TypedArray;", "setStyledAttributes", "(Landroid/content/res/TypedArray;)V", "styledAttributes", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
@SuppressLint
/* loaded from: classes2.dex */
public abstract class CustomRadioButton extends LinearLayout {

    /* renamed from: b */
    public AttributeSet f30534b;

    /* renamed from: c */
    public int[] f30535c;

    /* renamed from: d, reason: from kotlin metadata */
    public TypedArray styledAttributes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomRadioButton(@NotNull Context context, @NotNull AttributeSet attributeSet, int i2, @NotNull int[] iArr) {
        super(context, attributeSet);
        new LinkedHashMap();
        LayoutInflater.from(getContext()).inflate(i2, (ViewGroup) this, true);
        this.f30535c = iArr;
        this.f30534b = attributeSet;
        Resources.Theme theme = getContext().getTheme();
        AttributeSet attributeSet2 = this.f30534b;
        if (attributeSet2 == null) {
            Intrinsics.m32189r("attrs");
            throw null;
        }
        int[] iArr2 = this.f30535c;
        if (iArr2 == null) {
            Intrinsics.m32189r("styleable");
            throw null;
        }
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet2, iArr2, 0, 0);
        Intrinsics.m32178g(obtainStyledAttributes, "context.theme.obtainStyl…s(attrs, styleable, 0, 0)");
        setStyledAttributes(obtainStyledAttributes);
        mo16465a();
        mo16466b();
        mo16467c();
    }

    /* renamed from: a */
    public abstract void mo16465a();

    /* renamed from: b */
    public abstract void mo16466b();

    /* renamed from: c */
    public abstract void mo16467c();

    /* renamed from: d */
    public abstract void mo16468d();

    /* renamed from: e */
    public abstract void mo16469e();

    @NotNull
    public final TypedArray getStyledAttributes() {
        TypedArray typedArray = this.styledAttributes;
        if (typedArray != null) {
            return typedArray;
        }
        Intrinsics.m32189r("styledAttributes");
        throw null;
    }

    public final void setStyledAttributes(@NotNull TypedArray typedArray) {
        Intrinsics.m32179h(typedArray, "<set-?>");
        this.styledAttributes = typedArray;
    }
}
