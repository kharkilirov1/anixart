package com.swiftsoft.anixartd.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.swiftsoft.anixartd.C2507R;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DashedUnderlinedTextView.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/DashedUnderlinedTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DashedUnderlinedTextView extends AppCompatTextView {

    /* renamed from: h */
    @Nullable
    public Rect f30128h;

    /* renamed from: i */
    @Nullable
    public Paint f30129i;

    /* renamed from: j */
    public float f30130j;

    /* renamed from: k */
    public int f30131k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashedUnderlinedTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.m32179h(context, "context");
        new LinkedHashMap();
        float f2 = context.getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2507R.styleable.f25396b, 0, 0);
        Intrinsics.m32178g(obtainStyledAttributes, "context.obtainStyledAttr…,\n            0\n        )");
        int color = obtainStyledAttributes.getColor(0, ContextCompat.m1670c(context, C2507R.color.dashColor));
        this.f30130j = obtainStyledAttributes.getDimension(2, f2 * 2);
        this.f30131k = obtainStyledAttributes.getInteger(1, 2);
        obtainStyledAttributes.recycle();
        this.f30128h = new Rect();
        Paint paint = new Paint();
        this.f30129i = paint;
        paint.setStyle(Paint.Style.STROKE);
        Paint paint2 = this.f30129i;
        Intrinsics.m32176e(paint2);
        paint2.setColor(color);
        Paint paint3 = this.f30129i;
        Intrinsics.m32176e(paint3);
        paint3.setStrokeWidth(this.f30130j);
        Paint paint4 = this.f30129i;
        Intrinsics.m32176e(paint4);
        paint4.setPathEffect(new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f));
        setLayerType(1, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.m32179h(canvas, "canvas");
        int lineCount = getLineCount();
        Layout layout = getLayout();
        Intrinsics.m32178g(layout, "layout");
        for (int i2 = 0; i2 < lineCount; i2++) {
            int lineBounds = getLineBounds(i2, this.f30128h) + this.f30131k;
            int lineStart = layout.getLineStart(i2);
            int lineEnd = layout.getLineEnd(i2);
            float primaryHorizontal = layout.getPrimaryHorizontal(lineStart);
            float primaryHorizontal2 = layout.getPrimaryHorizontal(lineEnd - 1) + (layout.getPrimaryHorizontal(lineStart + 1) - primaryHorizontal);
            float f2 = lineBounds;
            float f3 = this.f30130j;
            Paint paint = this.f30129i;
            Intrinsics.m32176e(paint);
            canvas.drawLine(primaryHorizontal, f2 + f3, primaryHorizontal2, f2 + f3, paint);
        }
        super.onDraw(canvas);
    }
}
