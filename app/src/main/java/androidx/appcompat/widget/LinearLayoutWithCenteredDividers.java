package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: LinearLayoutWithCenteredDividers.kt */
@Deprecated
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/appcompat/widget/LinearLayoutWithCenteredDividers;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes.dex */
public class LinearLayoutWithCenteredDividers extends LinearLayoutCompat {
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: e */
    public void mo859e(@NotNull Canvas canvas, int i2) {
        Intrinsics.m32179h(canvas, "canvas");
        m862l(canvas, getDividerPadding() + getPaddingLeft(), i2, (getWidth() - getPaddingRight()) - getDividerPadding(), getDividerDrawable().getIntrinsicHeight() + i2);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: g */
    public void mo860g(@NotNull Canvas canvas, int i2) {
        Intrinsics.m32179h(canvas, "canvas");
        m862l(canvas, i2, getDividerPadding() + getPaddingTop(), getDividerDrawable().getIntrinsicWidth() + i2, (getHeight() - getPaddingBottom()) - getDividerPadding());
    }

    /* renamed from: l */
    public final void m862l(Canvas canvas, int i2, int i3, int i4, int i5) {
        Drawable dividerDrawable = getDividerDrawable();
        float f2 = (i2 + i4) / 2.0f;
        float f3 = (i3 + i5) / 2.0f;
        float intrinsicWidth = dividerDrawable.getIntrinsicWidth() / 2.0f;
        float intrinsicHeight = dividerDrawable.getIntrinsicHeight() / 2.0f;
        dividerDrawable.setBounds((int) (f2 - intrinsicWidth), (int) (f3 - intrinsicHeight), (int) (f2 + intrinsicWidth), (int) (f3 + intrinsicHeight));
        dividerDrawable.draw(canvas);
    }
}
