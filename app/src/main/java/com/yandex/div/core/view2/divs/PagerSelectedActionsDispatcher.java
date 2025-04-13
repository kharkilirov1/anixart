package com.yandex.div.core.view2.divs;

import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.KLog;
import com.yandex.div2.Div;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivPager;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PagerSelectedActionsDispatcher.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/PagerSelectedActionsDispatcher;", "", "PageSelectionTracker", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class PagerSelectedActionsDispatcher {

    /* renamed from: a */
    @NotNull
    public final Div2View f32537a;

    /* renamed from: b */
    @NotNull
    public final DivPager f32538b;

    /* renamed from: c */
    @NotNull
    public final DivActionBinder f32539c;

    /* renamed from: d */
    @Nullable
    public ViewPager2.OnPageChangeCallback f32540d;

    /* compiled from: PagerSelectedActionsDispatcher.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/PagerSelectedActionsDispatcher$PageSelectionTracker;", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public final class PageSelectionTracker extends ViewPager2.OnPageChangeCallback {

        /* renamed from: a */
        public int f32541a = -1;

        /* renamed from: b */
        @NotNull
        public final ArrayDeque<Integer> f32542b = new ArrayDeque<>();

        public PageSelectionTracker() {
        }

        /* renamed from: a */
        public final void m17052a() {
            while (!this.f32542b.isEmpty()) {
                int intValue = this.f32542b.removeFirst().intValue();
                KLog kLog = KLog.f33717a;
                final PagerSelectedActionsDispatcher pagerSelectedActionsDispatcher = PagerSelectedActionsDispatcher.this;
                Div div = pagerSelectedActionsDispatcher.f32538b.f37799o.get(intValue);
                Objects.requireNonNull(pagerSelectedActionsDispatcher);
                final List<DivAction> mo17578l = div.m17557a().mo17578l();
                if (mo17578l != null) {
                    pagerSelectedActionsDispatcher.f32537a.m16816q(new Function0<Unit>() { // from class: com.yandex.div.core.view2.divs.PagerSelectedActionsDispatcher$dispatchSelectedActions$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public Unit invoke() {
                            List<DivAction> list = mo17578l;
                            PagerSelectedActionsDispatcher pagerSelectedActionsDispatcher2 = pagerSelectedActionsDispatcher;
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                pagerSelectedActionsDispatcher2.f32539c.m16970a(pagerSelectedActionsDispatcher2.f32537a, (DivAction) it.next(), null);
                            }
                            return Unit.f63088a;
                        }
                    });
                }
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i2) {
            if (i2 == 0) {
                m17052a();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i2) {
            KLog kLog = KLog.f33717a;
            if (this.f32541a == i2) {
                return;
            }
            this.f32542b.add(Integer.valueOf(i2));
            if (this.f32541a == -1) {
                m17052a();
            }
            this.f32541a = i2;
        }
    }

    public PagerSelectedActionsDispatcher(@NotNull Div2View div2View, @NotNull DivPager divPager, @NotNull DivActionBinder divActionBinder) {
        Intrinsics.m32179h(divActionBinder, "divActionBinder");
        this.f32537a = div2View;
        this.f32538b = divPager;
        this.f32539c = divActionBinder;
    }
}
