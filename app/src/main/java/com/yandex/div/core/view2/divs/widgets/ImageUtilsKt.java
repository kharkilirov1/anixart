package com.yandex.div.core.view2.divs.widgets;

import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.View;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.internal.util.SizeKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivBlur;
import com.yandex.div2.DivFilter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ImageUtils.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ImageUtilsKt {
    /* renamed from: a */
    public static final void m17106a(@NotNull final Bitmap bitmap, @NotNull final View target, @Nullable final List<? extends DivFilter> list, @NotNull final Div2Component component, @NotNull final ExpressionResolver resolver, @NotNull final Function1<? super Bitmap, Unit> function1) {
        Intrinsics.m32179h(target, "target");
        Intrinsics.m32179h(component, "component");
        Intrinsics.m32179h(resolver, "resolver");
        if (list == null) {
            function1.invoke(bitmap);
            return;
        }
        if (!ViewsKt.m16768b(target) || target.isLayoutRequested()) {
            target.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.widgets.ImageUtilsKt$applyFilters$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    Intrinsics.m32179h(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    float max = Math.max(target.getHeight() / bitmap.getHeight(), target.getWidth() / bitmap.getWidth());
                    Bitmap bitmap2 = Bitmap.createScaledBitmap(bitmap, (int) (r2.getWidth() * max), (int) (max * bitmap.getHeight()), false);
                    for (DivFilter divFilter : list) {
                        if (divFilter instanceof DivFilter.Blur) {
                            Intrinsics.m32178g(bitmap2, "bitmap");
                            bitmap2 = ImageUtilsKt.m17107b(bitmap2, ((DivFilter.Blur) divFilter).f35719c, component, resolver);
                        }
                    }
                    Function1 function12 = function1;
                    Intrinsics.m32178g(bitmap2, "bitmap");
                    function12.invoke(bitmap2);
                }
            });
            return;
        }
        float max = Math.max(target.getHeight() / bitmap.getHeight(), target.getWidth() / bitmap.getWidth());
        Bitmap bitmap2 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * max), (int) (max * bitmap.getHeight()), false);
        for (DivFilter divFilter : list) {
            if (divFilter instanceof DivFilter.Blur) {
                Intrinsics.m32178g(bitmap2, "bitmap");
                bitmap2 = m17107b(bitmap2, ((DivFilter.Blur) divFilter).f35719c, component, resolver);
            }
        }
        Intrinsics.m32178g(bitmap2, "bitmap");
        function1.invoke(bitmap2);
    }

    @NotNull
    /* renamed from: b */
    public static final Bitmap m17107b(@NotNull Bitmap bitmap, @NotNull DivBlur blur, @NotNull Div2Component component, @NotNull ExpressionResolver resolver) {
        float f2;
        Intrinsics.m32179h(blur, "blur");
        Intrinsics.m32179h(component, "component");
        Intrinsics.m32179h(resolver, "resolver");
        long longValue = blur.f34778a.mo17535b(resolver).longValue();
        long j2 = longValue >> 31;
        int i2 = (j2 == 0 || j2 == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        if (i2 == 0) {
            return bitmap;
        }
        int m17396b = SizeKt.m17396b(i2);
        int i3 = 25;
        if (m17396b > 25) {
            f2 = (m17396b * 1.0f) / 25;
        } else {
            i3 = m17396b;
            f2 = 1.0f;
        }
        if (!(f2 == 1.0f)) {
            bitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / f2), (int) (bitmap.getHeight() / f2), false);
        }
        RenderScript mo16643o = component.mo16643o();
        Intrinsics.m32178g(mo16643o, "component.renderScript");
        Allocation createFromBitmap = Allocation.createFromBitmap(mo16643o, bitmap);
        Allocation createTyped = Allocation.createTyped(mo16643o, createFromBitmap.getType());
        ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(mo16643o, Element.U8_4(mo16643o));
        create.setRadius(i3);
        create.setInput(createFromBitmap);
        create.forEach(createTyped);
        createTyped.copyTo(bitmap);
        Intrinsics.m32178g(bitmap, "bitmap");
        return bitmap;
    }
}
