package com.yandex.div.core.tooltip;

import android.R;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$children$1;
import com.swiftsoft.anixartd.C2507R;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.DivTooltipRestrictor;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.SafePopupWindow;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.Div2Builder;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivTooltip;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivTooltipController.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0011\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/tooltip/DivTooltipController;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public class DivTooltipController {

    /* renamed from: a */
    @NotNull
    public final Provider<Div2Builder> f31406a;

    /* renamed from: b */
    @NotNull
    public final DivTooltipRestrictor f31407b;

    /* renamed from: c */
    @NotNull
    public final DivVisibilityActionTracker f31408c;

    /* renamed from: d */
    @NotNull
    public final DivPreloader f31409d;

    /* renamed from: e */
    @NotNull
    public final Function3<View, Integer, Integer, SafePopupWindow> f31410e;

    /* renamed from: f */
    @NotNull
    public final Map<String, TooltipData> f31411f;

    /* renamed from: g */
    @NotNull
    public final Handler f31412g;

    @Inject
    public DivTooltipController(@NotNull Provider<Div2Builder> div2Builder, @NotNull DivTooltipRestrictor tooltipRestrictor, @NotNull DivVisibilityActionTracker divVisibilityActionTracker, @NotNull DivPreloader divPreloader) {
        Intrinsics.m32179h(div2Builder, "div2Builder");
        Intrinsics.m32179h(tooltipRestrictor, "tooltipRestrictor");
        Intrinsics.m32179h(divVisibilityActionTracker, "divVisibilityActionTracker");
        Intrinsics.m32179h(divPreloader, "divPreloader");
        C28441 createPopup = new Function3<View, Integer, Integer, SafePopupWindow>() { // from class: com.yandex.div.core.tooltip.DivTooltipController.1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public SafePopupWindow mo16505k(View view, Integer num, Integer num2) {
                View c2 = view;
                int intValue = num.intValue();
                int intValue2 = num2.intValue();
                Intrinsics.m32179h(c2, "c");
                return new DivTooltipWindow(c2, intValue, intValue2, false, 8);
            }
        };
        Intrinsics.m32179h(createPopup, "createPopup");
        this.f31406a = div2Builder;
        this.f31407b = tooltipRestrictor;
        this.f31408c = divVisibilityActionTracker;
        this.f31409d = divPreloader;
        this.f31410e = createPopup;
        this.f31411f = new LinkedHashMap();
        this.f31412g = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public static final void m16742a(final DivTooltipController divTooltipController, final View view, final DivTooltip divTooltip, final Div2View div2View) {
        int m16931U;
        int m16931U2;
        if (divTooltipController.f31407b.mo16602a(div2View, view, divTooltip)) {
            final Div div = divTooltip.f40500c;
            DivBase m17557a = div.m17557a();
            final View m16800a = divTooltipController.f31406a.get().m16800a(div, div2View, DivStatePath.f31330c.m16720a(0L));
            DisplayMetrics displayMetrics = div2View.getResources().getDisplayMetrics();
            final ExpressionResolver expressionResolver = div2View.getExpressionResolver();
            Function3<View, Integer, Integer, SafePopupWindow> function3 = divTooltipController.f31410e;
            DivSize f39961z = m17557a.getF39961Z();
            Intrinsics.m32178g(displayMetrics, "displayMetrics");
            m16931U = BaseDivViewExtensionsKt.m16931U(f39961z, displayMetrics, expressionResolver, null);
            Integer valueOf = Integer.valueOf(m16931U);
            m16931U2 = BaseDivViewExtensionsKt.m16931U(m17557a.getF39983v(), displayMetrics, expressionResolver, null);
            final SafePopupWindow mo16505k = function3.mo16505k(m16800a, valueOf, Integer.valueOf(m16931U2));
            mo16505k.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.yandex.div.core.tooltip.a
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    DivTooltipController this$0 = DivTooltipController.this;
                    DivTooltip divTooltip2 = divTooltip;
                    Div2View div2View2 = div2View;
                    View anchor = view;
                    Intrinsics.m32179h(this$0, "this$0");
                    Intrinsics.m32179h(divTooltip2, "$divTooltip");
                    Intrinsics.m32179h(div2View2, "$div2View");
                    Intrinsics.m32179h(anchor, "$anchor");
                    this$0.f31411f.remove(divTooltip2.f40502e);
                    this$0.m16745d(div2View2, divTooltip2.f40500c);
                    DivTooltipRestrictor.DivTooltipShownCallback mo16603b = this$0.f31407b.mo16603b();
                    if (mo16603b == null) {
                        return;
                    }
                    mo16603b.m16605b(div2View2, anchor, divTooltip2);
                }
            });
            mo16505k.setOutsideTouchable(true);
            mo16505k.setTouchInterceptor(new View.OnTouchListener() { // from class: com.yandex.div.core.tooltip.c
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    SafePopupWindow this_setDismissOnTouchOutside = SafePopupWindow.this;
                    Intrinsics.m32179h(this_setDismissOnTouchOutside, "$this_setDismissOnTouchOutside");
                    if (motionEvent.getAction() != 4) {
                        return false;
                    }
                    this_setDismissOnTouchOutside.dismiss();
                    return true;
                }
            });
            ExpressionResolver resolver = div2View.getExpressionResolver();
            Intrinsics.m32179h(resolver, "resolver");
            if (Build.VERSION.SDK_INT >= 23) {
                DivAnimation divAnimation = divTooltip.f40498a;
                mo16505k.setEnterTransition(divAnimation != null ? DivTooltipAnimationKt.m16741b(divAnimation, divTooltip.f40504g.mo17535b(resolver), true, resolver) : DivTooltipAnimationKt.m16740a(divTooltip, resolver));
                DivAnimation divAnimation2 = divTooltip.f40499b;
                mo16505k.setExitTransition(divAnimation2 != null ? DivTooltipAnimationKt.m16741b(divAnimation2, divTooltip.f40504g.mo17535b(resolver), false, resolver) : DivTooltipAnimationKt.m16740a(divTooltip, resolver));
            } else {
                mo16505k.setAnimationStyle(R.style.Animation.Dialog);
            }
            final TooltipData tooltipData = new TooltipData(mo16505k, div, null, false, 8);
            divTooltipController.f31411f.put(divTooltip.f40502e, tooltipData);
            DivPreloader.Ticket m16588a = divTooltipController.f31409d.m16588a(div, div2View.getExpressionResolver(), new DivPreloader.Callback() { // from class: com.yandex.div.core.tooltip.b
                @Override // com.yandex.div.core.DivPreloader.Callback
                /* renamed from: g */
                public final void mo16589g(boolean z) {
                    ExpressionResolver expressionResolver2;
                    TooltipData tooltipData2 = TooltipData.this;
                    final View anchor = view;
                    final DivTooltipController this$0 = divTooltipController;
                    final Div2View div2View2 = div2View;
                    final DivTooltip divTooltip2 = divTooltip;
                    final View tooltipView = m16800a;
                    final SafePopupWindow popup = mo16505k;
                    ExpressionResolver resolver2 = expressionResolver;
                    final Div div2 = div;
                    Intrinsics.m32179h(tooltipData2, "$tooltipData");
                    Intrinsics.m32179h(anchor, "$anchor");
                    Intrinsics.m32179h(this$0, "this$0");
                    Intrinsics.m32179h(div2View2, "$div2View");
                    Intrinsics.m32179h(divTooltip2, "$divTooltip");
                    Intrinsics.m32179h(tooltipView, "$tooltipView");
                    Intrinsics.m32179h(popup, "$popup");
                    Intrinsics.m32179h(resolver2, "$resolver");
                    Intrinsics.m32179h(div2, "$div");
                    if (z || tooltipData2.f31435c || !anchor.isAttachedToWindow() || !this$0.f31407b.mo16602a(div2View2, anchor, divTooltip2)) {
                        return;
                    }
                    if (!ViewsKt.m16768b(tooltipView) || tooltipView.isLayoutRequested()) {
                        expressionResolver2 = resolver2;
                        tooltipView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.tooltip.DivTooltipController$tryShowTooltip$lambda-12$$inlined$doOnActualLayout$1
                            @Override // android.view.View.OnLayoutChangeListener
                            public void onLayoutChange(@NotNull View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                                Intrinsics.m32179h(view2, "view");
                                view2.removeOnLayoutChangeListener(this);
                                Point m16747b = DivTooltipControllerKt.m16747b(tooltipView, anchor, divTooltip2, div2View2.getExpressionResolver());
                                if (!DivTooltipControllerKt.m16746a(div2View2, tooltipView, m16747b)) {
                                    this$0.m16744c(divTooltip2.f40502e, div2View2);
                                    return;
                                }
                                popup.update(m16747b.x, m16747b.y, tooltipView.getWidth(), tooltipView.getHeight());
                                DivTooltipController divTooltipController2 = this$0;
                                Div2View div2View3 = div2View2;
                                Div div3 = div2;
                                View view3 = tooltipView;
                                divTooltipController2.m16745d(div2View3, div3);
                                divTooltipController2.f31408c.m16876d(div2View3, view3, div3, (r5 & 8) != 0 ? BaseDivViewExtensionsKt.m16911A(div3.m17557a()) : null);
                                DivTooltipRestrictor.DivTooltipShownCallback mo16603b = this$0.f31407b.mo16603b();
                                if (mo16603b == null) {
                                    return;
                                }
                                mo16603b.m16604a(div2View2, anchor, divTooltip2);
                            }
                        });
                    } else {
                        Point m16747b = DivTooltipControllerKt.m16747b(tooltipView, anchor, divTooltip2, div2View2.getExpressionResolver());
                        if (DivTooltipControllerKt.m16746a(div2View2, tooltipView, m16747b)) {
                            popup.update(m16747b.x, m16747b.y, tooltipView.getWidth(), tooltipView.getHeight());
                            this$0.m16745d(div2View2, div2);
                            this$0.f31408c.m16876d(div2View2, tooltipView, div2, (r5 & 8) != 0 ? BaseDivViewExtensionsKt.m16911A(div2.m17557a()) : null);
                            DivTooltipRestrictor.DivTooltipShownCallback mo16603b = this$0.f31407b.mo16603b();
                            if (mo16603b != null) {
                                mo16603b.m16604a(div2View2, anchor, divTooltip2);
                            }
                        } else {
                            this$0.m16744c(divTooltip2.f40502e, div2View2);
                        }
                        expressionResolver2 = resolver2;
                    }
                    popup.showAtLocation(anchor, 0, 0, 0);
                    if (divTooltip2.f40501d.mo17535b(expressionResolver2).longValue() != 0) {
                        this$0.f31412g.postDelayed(new Runnable() { // from class: com.yandex.div.core.tooltip.DivTooltipController$tryShowTooltip$lambda-12$$inlined$postDelayed$default$1
                            @Override // java.lang.Runnable
                            public final void run() {
                                DivTooltipController.this.m16744c(divTooltip2.f40502e, div2View2);
                            }
                        }, divTooltip2.f40501d.mo17535b(expressionResolver2).longValue());
                    }
                }
            });
            TooltipData tooltipData2 = divTooltipController.f31411f.get(divTooltip.f40502e);
            if (tooltipData2 == null) {
                return;
            }
            tooltipData2.f31434b = m16588a;
        }
    }

    /* renamed from: b */
    public final void m16743b(Div2View div2View, View view) {
        Object tag = view.getTag(C2507R.id.div_tooltips_tag);
        List<DivTooltip> list = tag instanceof List ? (List) tag : null;
        if (list != null) {
            for (DivTooltip divTooltip : list) {
                ArrayList arrayList = new ArrayList();
                TooltipData tooltipData = this.f31411f.get(divTooltip.f40502e);
                if (tooltipData != null) {
                    tooltipData.f31435c = true;
                    if (tooltipData.f31433a.isShowing()) {
                        SafePopupWindow safePopupWindow = tooltipData.f31433a;
                        Intrinsics.m32179h(safePopupWindow, "<this>");
                        if (Build.VERSION.SDK_INT >= 23) {
                            safePopupWindow.setEnterTransition(null);
                            safePopupWindow.setExitTransition(null);
                        } else {
                            safePopupWindow.setAnimationStyle(0);
                        }
                        tooltipData.f31433a.dismiss();
                    } else {
                        arrayList.add(divTooltip.f40502e);
                        m16745d(div2View, divTooltip.f40500c);
                    }
                    DivPreloader.Ticket ticket = tooltipData.f31434b;
                    if (ticket != null) {
                        ticket.cancel();
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.f31411f.remove((String) it.next());
                }
            }
        }
        if (view instanceof ViewGroup) {
            Iterator<View> it2 = ((ViewGroupKt$children$1) ViewGroupKt.m2377b((ViewGroup) view)).iterator();
            while (it2.hasNext()) {
                m16743b(div2View, it2.next());
            }
        }
    }

    /* renamed from: c */
    public void m16744c(@NotNull String id2, @NotNull Div2View div2View) {
        SafePopupWindow safePopupWindow;
        Intrinsics.m32179h(id2, "id");
        Intrinsics.m32179h(div2View, "div2View");
        TooltipData tooltipData = this.f31411f.get(id2);
        if (tooltipData == null || (safePopupWindow = tooltipData.f31433a) == null) {
            return;
        }
        safePopupWindow.dismiss();
    }

    /* renamed from: d */
    public final void m16745d(Div2View div2View, Div div) {
        this.f31408c.m16876d(div2View, null, div, (r5 & 8) != 0 ? BaseDivViewExtensionsKt.m16911A(div.m17557a()) : null);
    }
}
