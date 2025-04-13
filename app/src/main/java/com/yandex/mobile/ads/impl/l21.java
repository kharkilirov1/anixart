package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.ImageView;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class l21 {

    /* renamed from: a */
    @NotNull
    private final h21 f52219a = new h21();

    /* renamed from: b */
    @NotNull
    private final Matrix f52220b = new Matrix();

    /* renamed from: c */
    @NotNull
    private final Paint f52221c;

    /* renamed from: d */
    @NotNull
    private final Rect f52222d;

    public l21() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.parseColor("#2E7D32"));
        paint.setStrokeWidth(10.0f);
        this.f52221c = paint;
        this.f52222d = new Rect();
    }

    /* renamed from: a */
    public final void m26333a(@NotNull ImageView view, @NotNull Bitmap bitmap, @NotNull f21 smartCenter, @NotNull String backGroundColor) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(bitmap, "bitmap");
        Intrinsics.m32179h(smartCenter, "smartCenter");
        Intrinsics.m32179h(backGroundColor, "backGroundColor");
        float width = view.getWidth();
        float height = view.getHeight();
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        float m24296c = smartCenter.m24296c();
        float m24295b = smartCenter.m24295b();
        if (height == 0.0f) {
            return;
        }
        if (m24295b == 0.0f) {
            return;
        }
        if (height2 == 0.0f) {
            return;
        }
        float f2 = width / height;
        float f3 = (f2 > (m24296c / m24295b) ? 1 : (f2 == (m24296c / m24295b) ? 0 : -1)) < 0 ? width / m24296c : height / m24295b;
        if (f3 > 1.0f) {
            f3 = f2 < width2 / height2 ? width / width2 : height / height2;
        }
        float f4 = 2;
        this.f52220b.setScale(f3, f3);
        this.f52220b.postTranslate((width / f4) - (((smartCenter.m24296c() / 2) + smartCenter.m24297d()) * f3), (height / f4) - (((smartCenter.m24295b() / 2) + smartCenter.m24298e()) * f3));
        view.setScaleType(ImageView.ScaleType.MATRIX);
        view.setImageMatrix(this.f52220b);
        view.setBackgroundColor(Color.parseColor(backGroundColor));
        h21 h21Var = this.f52219a;
        Context context = view.getContext();
        Intrinsics.m32178g(context, "view.context");
        Objects.requireNonNull(h21Var);
        if (h21.m25033a(context)) {
            Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            Canvas canvas = new Canvas(copy);
            Rect rect = this.f52222d;
            rect.set(smartCenter.m24297d(), smartCenter.m24298e(), smartCenter.m24296c() + smartCenter.m24297d(), smartCenter.m24295b() + smartCenter.m24298e());
            canvas.drawRect(rect, this.f52221c);
            view.setImageBitmap(copy);
        }
    }

    /* renamed from: a */
    public final void m26332a(@NotNull ImageView view, @NotNull Bitmap bitmap, @NotNull f21 smartCenter) {
        float m24296c;
        Float valueOf;
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(bitmap, "bitmap");
        Intrinsics.m32179h(smartCenter, "smartCenter");
        float width = view.getWidth();
        float height = view.getHeight();
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        float f2 = 0.0f;
        Float valueOf2 = Float.valueOf(0.0f);
        if (height == 0.0f) {
            return;
        }
        if (height2 == 0.0f) {
            return;
        }
        boolean z = width / height > width2 / height2;
        float f3 = z ? width / width2 : height / height2;
        float f4 = width2 * f3;
        float f5 = height2 * f3;
        if (z) {
            m24296c = 0.0f;
        } else {
            m24296c = (width / 2) - (((smartCenter.m24296c() / 2) + smartCenter.m24297d()) * f3);
            if (m24296c > 0.0f) {
                valueOf = valueOf2;
            } else {
                valueOf = m24296c + f4 < width ? Float.valueOf(width - f4) : null;
            }
            if (valueOf != null) {
                m24296c = valueOf.floatValue();
            }
        }
        if (z) {
            float m24295b = (height / 2) - (((smartCenter.m24295b() / 2) + smartCenter.m24298e()) * f3);
            if (m24295b <= 0.0f) {
                valueOf2 = m24295b + f5 < height ? Float.valueOf(height - f5) : null;
            }
            f2 = valueOf2 != null ? valueOf2.floatValue() : m24295b;
        }
        this.f52220b.setScale(f3, f3);
        this.f52220b.postTranslate(m24296c, f2);
        view.setScaleType(ImageView.ScaleType.MATRIX);
        view.setImageMatrix(this.f52220b);
        h21 h21Var = this.f52219a;
        Context context = view.getContext();
        Intrinsics.m32178g(context, "view.context");
        Objects.requireNonNull(h21Var);
        if (h21.m25033a(context)) {
            Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            Canvas canvas = new Canvas(copy);
            Rect rect = this.f52222d;
            rect.set(smartCenter.m24297d(), smartCenter.m24298e(), smartCenter.m24296c() + smartCenter.m24297d(), smartCenter.m24295b() + smartCenter.m24298e());
            canvas.drawRect(rect, this.f52221c);
            view.setImageBitmap(copy);
        }
    }
}
