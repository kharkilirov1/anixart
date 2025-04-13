package com.swiftsoft.anixartd.utils;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CustomTextView.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/CustomTextView;", "Landroid/widget/TextView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CustomTextView extends TextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.m32179h(context, "context");
        new LinkedHashMap();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        Layout layout;
        int lineCount;
        super.onMeasure(i2, i3);
        if (View.MeasureSpec.getMode(i2) == 1073741824 || (lineCount = (layout = getLayout()).getLineCount()) <= 1) {
            return;
        }
        float f2 = 0.0f;
        for (int i4 = 0; i4 < lineCount; i4++) {
            f2 = Math.max(f2, layout.getLineWidth(i4));
        }
        int ceil = (int) Math.ceil(f2);
        if (ceil < getMeasuredWidth()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(ceil, Integer.MIN_VALUE), i3);
        }
    }
}
