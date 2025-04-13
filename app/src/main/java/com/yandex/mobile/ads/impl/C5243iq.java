package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import com.yandex.mobile.ads.C4632R;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.iq */
/* loaded from: classes3.dex */
public final class C5243iq {

    /* renamed from: a */
    @NotNull
    private final C6084yo f51360a = new C6084yo();

    @NotNull
    /* renamed from: a */
    public final LayerDrawable m25587a(@NotNull Context context, int i2, int i3) {
        Intrinsics.m32179h(context, "context");
        Objects.requireNonNull(this.f51360a);
        int m29954a = C6084yo.m29954a(context, 6.0f);
        Objects.requireNonNull(this.f51360a);
        int m29954a2 = C6084yo.m29954a(context, 4.0f);
        Objects.requireNonNull(this.f51360a);
        int m29954a3 = C6084yo.m29954a(context, 3.0f);
        Objects.requireNonNull(this.f51360a);
        int m29954a4 = C6084yo.m29954a(context, 12.0f);
        int i4 = ((i3 + 1) * m29954a2) + (m29954a * i3);
        float f2 = m29954a4;
        RectF rectF = new RectF(0.0f, 0.0f, i4, f2);
        float[] fArr = new float[8];
        int i5 = 0;
        for (int i6 = 0; i6 < 8; i6++) {
            fArr[i6] = f2;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, rectF, null));
        shapeDrawable.setIntrinsicWidth(i4);
        shapeDrawable.setIntrinsicHeight(m29954a4);
        shapeDrawable.getPaint().setColor(-16777216);
        shapeDrawable.setAlpha(C4632R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
        ShapeDrawable[] shapeDrawableArr = new ShapeDrawable[i3];
        for (int i7 = 0; i7 < i3; i7++) {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
            shapeDrawable2.setIntrinsicHeight(m29954a);
            shapeDrawable2.setIntrinsicWidth(m29954a);
            shapeDrawable2.getPaint().setColor(-1);
            if (i7 != i2) {
                shapeDrawable2.setAlpha(C4632R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
            }
            shapeDrawableArr[i7] = shapeDrawable2;
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.f63354a.add(shapeDrawable);
        spreadBuilder.m32210a(shapeDrawableArr);
        LayerDrawable layerDrawable = new LayerDrawable((Drawable[]) spreadBuilder.f63354a.toArray(new ShapeDrawable[spreadBuilder.m32211b()]));
        while (i5 < i3) {
            int i8 = m29954a2 + m29954a;
            int i9 = i5 + 1;
            layerDrawable.setLayerInset(i9, (i8 * i5) + m29954a2, m29954a3, i4 - (i8 * i9), m29954a3);
            i5 = i9;
        }
        return layerDrawable;
    }
}
