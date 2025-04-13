package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class k21 implements View.OnLayoutChangeListener {

    /* renamed from: a */
    @NotNull
    private final C5586pc f51824a;

    /* renamed from: b */
    @NotNull
    private final C5437me f51825b;

    /* renamed from: c */
    @NotNull
    private final l21 f51826c;

    /* renamed from: d */
    @NotNull
    private final z10 f51827d;

    /* renamed from: e */
    @NotNull
    private final Bitmap f51828e;

    public k21(@NotNull C5586pc axisBackgroundColorProvider, @NotNull C5437me bestSmartCenterProvider, @NotNull l21 smartCenterMatrixScaler, @NotNull z10 imageValue, @NotNull Bitmap bitmap) {
        Intrinsics.m32179h(axisBackgroundColorProvider, "axisBackgroundColorProvider");
        Intrinsics.m32179h(bestSmartCenterProvider, "bestSmartCenterProvider");
        Intrinsics.m32179h(smartCenterMatrixScaler, "smartCenterMatrixScaler");
        Intrinsics.m32179h(imageValue, "imageValue");
        Intrinsics.m32179h(bitmap, "bitmap");
        this.f51824a = axisBackgroundColorProvider;
        this.f51825b = bestSmartCenterProvider;
        this.f51826c = smartCenterMatrixScaler;
        this.f51827d = imageValue;
        this.f51828e = bitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m26014a(k21 this$0, RectF viewRect, ImageView view) {
        f21 m26792b;
        Intrinsics.m32179h(this$0, "this$0");
        Intrinsics.m32179h(viewRect, "$viewRect");
        Intrinsics.m32179h(view, "$view");
        if (viewRect.height() == 0.0f) {
            return;
        }
        C5586pc c5586pc = this$0.f51824a;
        z10 z10Var = this$0.f51827d;
        Objects.requireNonNull(c5586pc);
        if (!C5586pc.m27307a(z10Var)) {
            f21 m26629a = this$0.f51825b.m26629a(viewRect, this$0.f51827d);
            if (m26629a != null) {
                this$0.f51826c.m26332a(view, this$0.f51828e, m26629a);
                return;
            }
            return;
        }
        C5586pc c5586pc2 = this$0.f51824a;
        z10 z10Var2 = this$0.f51827d;
        Objects.requireNonNull(c5586pc2);
        String m27306a = C5586pc.m27306a(viewRect, z10Var2);
        n21 m30041c = this$0.f51827d.m30041c();
        if (m30041c == null || (m26792b = m30041c.m26792b()) == null) {
            return;
        }
        if (m27306a != null) {
            this$0.f51826c.m26333a(view, this$0.f51828e, m26792b, m27306a);
        } else {
            this$0.f51826c.m26332a(view, this$0.f51828e, m26792b);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(@Nullable View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
        if (imageView == null) {
            return;
        }
        int i10 = i8 - i6;
        boolean z = false;
        boolean z2 = (i4 - i2 == i10 && i5 - i3 == i9 - i7) ? false : true;
        if (i5 != i3 && i2 != i4) {
            z = true;
        }
        if (z2 && z) {
            imageView.post(new sq1(this, new RectF(0.0f, 0.0f, imageView.getWidth(), imageView.getHeight()), imageView, 4));
        }
    }
}
