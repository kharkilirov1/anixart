package com.yandex.div.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.core.view.ViewGroupKt$iterator$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewPager2Wrapper.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR$\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m31884d2 = {"Lcom/yandex/div/core/widget/ViewPager2Wrapper;", "Landroid/widget/FrameLayout;", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "viewPool", "", "setRecycledViewPool", "Landroidx/viewpager2/widget/ViewPager2;", "b", "Landroidx/viewpager2/widget/ViewPager2;", "getViewPager", "()Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "", "value", "getOrientation", "()I", "setOrientation", "(I)V", "orientation", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class ViewPager2Wrapper extends FrameLayout {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ViewPager2 viewPager;

    @JvmOverloads
    public ViewPager2Wrapper(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        ViewPager2 viewPager2 = new ViewPager2(context);
        viewPager2.setDescendantFocusability(393216);
        this.viewPager = viewPager2;
        addView(getViewPager());
    }

    @Override // android.view.ViewGroup
    public final void addView(@Nullable View view) {
        super.addView(view);
    }

    /* renamed from: b */
    public final void m17185b(Function1<? super RecyclerView, Unit> function1) {
        View childAt = getViewPager().getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView == null) {
            return;
        }
        function1.invoke(recyclerView);
    }

    public final int getOrientation() {
        return getViewPager().getOrientation();
    }

    @NotNull
    public ViewPager2 getViewPager() {
        return this.viewPager;
    }

    public final void setOrientation(int i2) {
        if (getViewPager().getOrientation() == i2) {
            return;
        }
        getViewPager().setOrientation(i2);
        m17185b(new Function1<RecyclerView, Unit>() { // from class: com.yandex.div.core.widget.ViewPager2Wrapper$orientation$1
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(RecyclerView recyclerView) {
                RecyclerView withRecyclerView = recyclerView;
                Intrinsics.m32179h(withRecyclerView, "$this$withRecyclerView");
                withRecyclerView.getRecycledViewPool().mo3915a();
                Iterator<View> it = ((ViewGroupKt$children$1) ViewGroupKt.m2377b(withRecyclerView)).iterator();
                while (true) {
                    ViewGroupKt$iterator$1 viewGroupKt$iterator$1 = (ViewGroupKt$iterator$1) it;
                    if (!viewGroupKt$iterator$1.hasNext()) {
                        return Unit.f63088a;
                    }
                    View view = (View) viewGroupKt$iterator$1.next();
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                }
            }
        });
    }

    public final void setRecycledViewPool(@NotNull final RecyclerView.RecycledViewPool viewPool) {
        Intrinsics.m32179h(viewPool, "viewPool");
        m17185b(new Function1<RecyclerView, Unit>() { // from class: com.yandex.div.core.widget.ViewPager2Wrapper$setRecycledViewPool$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(RecyclerView recyclerView) {
                RecyclerView withRecyclerView = recyclerView;
                Intrinsics.m32179h(withRecyclerView, "$this$withRecyclerView");
                withRecyclerView.setRecycledViewPool(RecyclerView.RecycledViewPool.this);
                return Unit.f63088a;
            }
        });
    }
}
