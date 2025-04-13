package com.swiftsoft.anixartd.utils.radiobutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.snackbar.ViewOnClickListenerC1394a;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CustomRadioGroup.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0010B\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0011"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/radiobutton/CustomRadioGroup;", "Landroid/widget/LinearLayout;", "Lcom/swiftsoft/anixartd/utils/radiobutton/CustomRadioGroup$OnRadioButtonListener;", "onClickListener", "", "setOnRadioClickListener", "Lcom/swiftsoft/anixartd/utils/radiobutton/CustomRadioButton;", "button", "setSelectedButtonToSelectedState", "setButtonToUnselectedState", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "OnRadioButtonListener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CustomRadioGroup extends LinearLayout {

    /* renamed from: c */
    public static final /* synthetic */ int f30537c = 0;

    /* renamed from: b */
    @Nullable
    public OnRadioButtonListener f30538b;

    /* compiled from: CustomRadioGroup.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/radiobutton/CustomRadioGroup$OnRadioButtonListener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface OnRadioButtonListener {
        void onClick(@NotNull View view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomRadioGroup(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(attrs, "attrs");
        new LinkedHashMap();
    }

    /* renamed from: a */
    public final void m16470a() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof CustomRadioButton) {
                setButtonToUnselectedState((CustomRadioButton) childAt);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(@NotNull View child, int i2, @NotNull ViewGroup.LayoutParams params) {
        Intrinsics.m32179h(child, "child");
        Intrinsics.m32179h(params, "params");
        if (child instanceof CustomRadioButton) {
            child.setOnClickListener(new ViewOnClickListenerC1394a(this, child, 6));
        }
        super.addView(child, i2, params);
    }

    public final void setButtonToUnselectedState(@NotNull CustomRadioButton button) {
        Intrinsics.m32179h(button, "button");
        button.mo16469e();
    }

    public final void setOnRadioClickListener(@NotNull OnRadioButtonListener onClickListener) {
        Intrinsics.m32179h(onClickListener, "onClickListener");
        this.f30538b = onClickListener;
    }

    public final void setSelectedButtonToSelectedState(@NotNull CustomRadioButton button) {
        Intrinsics.m32179h(button, "button");
        button.mo16468d();
    }
}
