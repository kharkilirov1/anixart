package com.swiftsoft.anixartd.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FitsSystemWindowRelativeLayout.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/FitsSystemWindowRelativeLayout;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class FitsSystemWindowRelativeLayout extends RelativeLayout {

    /* renamed from: b */
    @Nullable
    public Rect f30165b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FitsSystemWindowRelativeLayout(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(attrs, "attrs");
        new LinkedHashMap();
        m16330a();
    }

    /* renamed from: a */
    public final void m16330a() {
        if (this.f30165b == null) {
            this.f30165b = new Rect(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        m16331b(new Rect());
    }

    /* renamed from: b */
    public final void m16331b(Rect rect) {
        Rect rect2 = this.f30165b;
        Intrinsics.m32176e(rect2);
        int i2 = rect2.left + rect.left;
        Rect rect3 = this.f30165b;
        Intrinsics.m32176e(rect3);
        int i3 = rect3.right + rect.right;
        Rect rect4 = this.f30165b;
        Intrinsics.m32176e(rect4);
        int i4 = rect4.bottom + rect.bottom;
        Rect rect5 = this.f30165b;
        Intrinsics.m32176e(rect5);
        setPadding(i2, rect5.top + rect.top, i3, i4);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(@NonNull @NotNull Rect insets) {
        Intrinsics.m32179h(insets, "insets");
        m16331b(insets);
        return false;
    }

    @Override // android.view.View
    @TargetApi
    @NotNull
    public WindowInsets onApplyWindowInsets(@NotNull WindowInsets insets) {
        Intrinsics.m32179h(insets, "insets");
        fitSystemWindows(new Rect(insets.getSystemWindowInsetLeft(), insets.getSystemWindowInsetTop(), insets.getSystemWindowInsetRight(), insets.getSystemWindowInsetBottom()));
        return insets;
    }

    @Override // android.view.View
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.m32179h(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (getResources().getConfiguration().smallestScreenWidthDp <= 600) {
            m16330a();
        }
    }
}
