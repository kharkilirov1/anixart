package com.yandex.div.core.view2.divs;

import android.R;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.DisplayMetrics;
import android.util.StateSet;
import android.view.View;
import com.swiftsoft.anixartd.C2507R;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.tooltip.DivTooltipController;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivAccessibilityBinder;
import com.yandex.div.core.view2.divs.DivFocusBinder;
import com.yandex.div.core.view2.divs.DivFocusBinder.FocusChangeListener;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivWrapContentSize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivBaseBinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public final class DivBaseBinder {

    /* renamed from: a */
    @NotNull
    public final DivBackgroundBinder f31913a;

    /* renamed from: b */
    @NotNull
    public final DivTooltipController f31914b;

    /* renamed from: c */
    @NotNull
    public final DivExtensionController f31915c;

    /* renamed from: d */
    @NotNull
    public final DivFocusBinder f31916d;

    /* renamed from: e */
    @NotNull
    public final DivAccessibilityBinder f31917e;

    /* compiled from: DivBaseBinder.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[DivVisibility.values().length];
            DivVisibility divVisibility = DivVisibility.VISIBLE;
            iArr[0] = 1;
            DivVisibility divVisibility2 = DivVisibility.INVISIBLE;
            iArr[1] = 2;
            DivVisibility divVisibility3 = DivVisibility.GONE;
            iArr[2] = 3;
        }
    }

    @Inject
    public DivBaseBinder(@NotNull DivBackgroundBinder divBackgroundBinder, @NotNull DivTooltipController tooltipController, @NotNull DivExtensionController extensionController, @NotNull DivFocusBinder divFocusBinder, @NotNull DivAccessibilityBinder divAccessibilityBinder) {
        Intrinsics.m32179h(divBackgroundBinder, "divBackgroundBinder");
        Intrinsics.m32179h(tooltipController, "tooltipController");
        Intrinsics.m32179h(extensionController, "extensionController");
        Intrinsics.m32179h(divFocusBinder, "divFocusBinder");
        Intrinsics.m32179h(divAccessibilityBinder, "divAccessibilityBinder");
        this.f31913a = divBackgroundBinder;
        this.f31914b = tooltipController;
        this.f31915c = extensionController;
        this.f31916d = divFocusBinder;
        this.f31917e = divAccessibilityBinder;
    }

    /* renamed from: a */
    public final void m16980a(View view, Div2View div2View, DivBorder blurredBorder, DivBorder divBorder, ExpressionResolver expressionResolver) {
        DivFocusBinder divFocusBinder = this.f31916d;
        Objects.requireNonNull(divFocusBinder);
        Intrinsics.m32179h(blurredBorder, "blurredBorder");
        divFocusBinder.m16995a(view, (divBorder == null || BaseDivViewExtensionsKt.m16916F(divBorder) || !view.isFocused()) ? blurredBorder : divBorder, expressionResolver);
        View.OnFocusChangeListener onFocusChangeListener = view.getOnFocusChangeListener();
        DivFocusBinder.FocusChangeListener focusChangeListener = onFocusChangeListener instanceof DivFocusBinder.FocusChangeListener ? (DivFocusBinder.FocusChangeListener) onFocusChangeListener : null;
        if (focusChangeListener == null && BaseDivViewExtensionsKt.m16916F(divBorder)) {
            return;
        }
        boolean z = true;
        if (focusChangeListener != null && focusChangeListener.f32062f == null && focusChangeListener.f32063g == null && BaseDivViewExtensionsKt.m16916F(divBorder)) {
            z = false;
        }
        if (!z) {
            view.setOnFocusChangeListener(null);
            return;
        }
        DivFocusBinder.FocusChangeListener focusChangeListener2 = divFocusBinder.new FocusChangeListener(div2View, expressionResolver);
        focusChangeListener2.f32060d = divBorder;
        focusChangeListener2.f32061e = blurredBorder;
        if (focusChangeListener != null) {
            List<? extends DivAction> list = focusChangeListener.f32062f;
            List<? extends DivAction> list2 = focusChangeListener.f32063g;
            focusChangeListener2.f32062f = list;
            focusChangeListener2.f32063g = list2;
        }
        view.setOnFocusChangeListener(focusChangeListener2);
    }

    /* renamed from: b */
    public final void m16981b(View view, Div2View div2View, ExpressionResolver expressionResolver, List<? extends DivAction> list, List<? extends DivAction> list2) {
        DivFocusBinder divFocusBinder = this.f31916d;
        Objects.requireNonNull(divFocusBinder);
        View.OnFocusChangeListener onFocusChangeListener = view.getOnFocusChangeListener();
        DivFocusBinder.FocusChangeListener focusChangeListener = onFocusChangeListener instanceof DivFocusBinder.FocusChangeListener ? (DivFocusBinder.FocusChangeListener) onFocusChangeListener : null;
        boolean z = true;
        if (focusChangeListener == null && CollectionsKt.m17385a(list, list2)) {
            return;
        }
        if (focusChangeListener != null) {
            z = (focusChangeListener.f32060d == null && CollectionsKt.m17385a(list, list2)) ? false : true;
        }
        if (!z) {
            view.setOnFocusChangeListener(null);
            return;
        }
        DivFocusBinder.FocusChangeListener focusChangeListener2 = divFocusBinder.new FocusChangeListener(div2View, expressionResolver);
        if (focusChangeListener != null) {
            DivBorder divBorder = focusChangeListener.f32060d;
            DivBorder divBorder2 = focusChangeListener.f32061e;
            focusChangeListener2.f32060d = divBorder;
            focusChangeListener2.f32061e = divBorder2;
        }
        focusChangeListener2.f32062f = list;
        focusChangeListener2.f32063g = list2;
        view.setOnFocusChangeListener(focusChangeListener2);
    }

    /* renamed from: c */
    public final void m16982c(@NotNull View view, @NotNull Div2View divView, @Nullable String str) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(divView, "divView");
        int m16870a = divView.getViewComponent().mo16652a().m16870a(str);
        view.setTag(str);
        view.setId(m16870a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0231, code lost:
    
        if (r2 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0277, code lost:
    
        r4 = r2.mo17535b(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0275, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0273, code lost:
    
        if (r2 == null) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0290  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m16983d(@org.jetbrains.annotations.NotNull final android.view.View r10, @org.jetbrains.annotations.NotNull final com.yandex.div2.DivBase r11, @org.jetbrains.annotations.Nullable com.yandex.div2.DivBase r12, @org.jetbrains.annotations.NotNull final com.yandex.div.json.expressions.ExpressionResolver r13) {
        /*
            Method dump skipped, instructions count: 737
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivBaseBinder.m16983d(android.view.View, com.yandex.div2.DivBase, com.yandex.div2.DivBase, com.yandex.div.json.expressions.ExpressionResolver):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ad, code lost:
    
        if ((r1 == null || r1.isEmpty()) == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01ea, code lost:
    
        if ((r1 == null || r1.isEmpty()) == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0227, code lost:
    
        if ((r1 == null || r1.isEmpty()) == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0263, code lost:
    
        if ((r1 == null || r1.isEmpty()) == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0322, code lost:
    
        if (r1 == null) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0366, code lost:
    
        r3 = r0;
        r4 = r1.f35820b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0495, code lost:
    
        if (r1 == null) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x04e0, code lost:
    
        r4 = r0;
        r5 = r1.f35822d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x04dc, code lost:
    
        r4 = r0;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x04da, code lost:
    
        if (r1 == null) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0362, code lost:
    
        r3 = r0;
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0360, code lost:
    
        if (r1 == null) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0170, code lost:
    
        if ((r1 == null || r1.isEmpty()) == false) goto L198;
     */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:287:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0384  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m16984e(@org.jetbrains.annotations.NotNull final android.view.View r25, @org.jetbrains.annotations.NotNull final com.yandex.div2.DivBase r26, @org.jetbrains.annotations.Nullable com.yandex.div2.DivBase r27, @org.jetbrains.annotations.NotNull final com.yandex.div.core.view2.Div2View r28) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivBaseBinder.m16984e(android.view.View, com.yandex.div2.DivBase, com.yandex.div2.DivBase, com.yandex.div.core.view2.Div2View):void");
    }

    /* renamed from: f */
    public final DivWrapContentSize.ConstraintSize m16985f(DivSize divSize) {
        DivWrapContentSize divWrapContentSize;
        DivSize.WrapContent wrapContent = divSize instanceof DivSize.WrapContent ? (DivSize.WrapContent) divSize : null;
        if (wrapContent == null || (divWrapContentSize = wrapContent.f38838c) == null) {
            return null;
        }
        return divWrapContentSize.f40996b;
    }

    /* renamed from: g */
    public final DivWrapContentSize.ConstraintSize m16986g(DivSize divSize) {
        DivWrapContentSize divWrapContentSize;
        DivSize.WrapContent wrapContent = divSize instanceof DivSize.WrapContent ? (DivSize.WrapContent) divSize : null;
        if (wrapContent == null || (divWrapContentSize = wrapContent.f38838c) == null) {
            return null;
        }
        return divWrapContentSize.f40997c;
    }

    /* renamed from: h */
    public final void m16987h(final View view, final Div2View divView, final List<? extends DivBackground> list, final List<? extends DivBackground> list2, final ExpressionResolver resolver, ExpressionSubscriber subscriber, final Drawable drawable) {
        final DivBackgroundBinder divBackgroundBinder = this.f31913a;
        Objects.requireNonNull(divBackgroundBinder);
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(divView, "divView");
        Intrinsics.m32179h(resolver, "resolver");
        Intrinsics.m32179h(subscriber, "subscriber");
        final DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        if (list2 == null) {
            Function1<Object, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$bindBackground$1$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v12, types: [android.view.View] */
                /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r4v1 */
                /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.collections.EmptyList] */
                /* JADX WARN: Type inference failed for: r4v4 */
                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Object noName_0) {
                    List arrayList;
                    Intrinsics.m32179h(noName_0, "$noName_0");
                    List<DivBackground> list3 = list;
                    if (list3 == null) {
                        arrayList = 0;
                    } else {
                        DivBackgroundBinder divBackgroundBinder2 = divBackgroundBinder;
                        DisplayMetrics metrics = displayMetrics;
                        ExpressionResolver expressionResolver = resolver;
                        arrayList = new ArrayList(kotlin.collections.CollectionsKt.m32032m(list3, 10));
                        for (DivBackground divBackground : list3) {
                            Intrinsics.m32178g(metrics, "metrics");
                            arrayList.add(DivBackgroundBinder.m16974a(divBackgroundBinder2, divBackground, metrics, expressionResolver));
                        }
                    }
                    if (arrayList == 0) {
                        arrayList = EmptyList.f63144b;
                    }
                    Object tag = view.getTag(C2507R.id.div_default_background_list_tag);
                    List list4 = tag instanceof List ? (List) tag : null;
                    Object tag2 = view.getTag(C2507R.id.div_additional_background_layer_tag);
                    if ((Intrinsics.m32174c(list4, arrayList) && Intrinsics.m32174c(tag2 instanceof Drawable ? (Drawable) tag2 : null, drawable)) ? false : true) {
                        DivBackgroundBinder divBackgroundBinder3 = divBackgroundBinder;
                        View view2 = view;
                        DivBackgroundBinder.m16976c(divBackgroundBinder3, view2, DivBackgroundBinder.m16975b(divBackgroundBinder3, arrayList, view2, divView, drawable, resolver));
                        view.setTag(C2507R.id.div_default_background_list_tag, arrayList);
                        view.setTag(C2507R.id.div_focused_background_list_tag, null);
                        view.setTag(C2507R.id.div_additional_background_layer_tag, drawable);
                    }
                    return Unit.f63088a;
                }
            };
            function1.invoke(Unit.f63088a);
            divBackgroundBinder.m16977d(list, resolver, subscriber, function1);
        } else {
            Function1<Object, Unit> function12 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$bindBackground$1$callback$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r15v14, types: [android.view.View] */
                /* JADX WARN: Type inference failed for: r6v0, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r6v1 */
                /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.collections.EmptyList] */
                /* JADX WARN: Type inference failed for: r6v4 */
                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Object noName_0) {
                    List arrayList;
                    Intrinsics.m32179h(noName_0, "$noName_0");
                    List<DivBackground> list3 = list;
                    if (list3 == null) {
                        arrayList = 0;
                    } else {
                        DivBackgroundBinder divBackgroundBinder2 = divBackgroundBinder;
                        DisplayMetrics metrics = displayMetrics;
                        ExpressionResolver expressionResolver = resolver;
                        arrayList = new ArrayList(kotlin.collections.CollectionsKt.m32032m(list3, 10));
                        for (DivBackground divBackground : list3) {
                            Intrinsics.m32178g(metrics, "metrics");
                            arrayList.add(DivBackgroundBinder.m16974a(divBackgroundBinder2, divBackground, metrics, expressionResolver));
                        }
                    }
                    if (arrayList == 0) {
                        arrayList = EmptyList.f63144b;
                    }
                    List<DivBackground> list4 = list2;
                    DivBackgroundBinder divBackgroundBinder3 = divBackgroundBinder;
                    DisplayMetrics metrics2 = displayMetrics;
                    ExpressionResolver expressionResolver2 = resolver;
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.CollectionsKt.m32032m(list4, 10));
                    for (DivBackground divBackground2 : list4) {
                        Intrinsics.m32178g(metrics2, "metrics");
                        arrayList2.add(DivBackgroundBinder.m16974a(divBackgroundBinder3, divBackground2, metrics2, expressionResolver2));
                    }
                    Object tag = view.getTag(C2507R.id.div_default_background_list_tag);
                    List list5 = tag instanceof List ? (List) tag : null;
                    Object tag2 = view.getTag(C2507R.id.div_focused_background_list_tag);
                    List list6 = tag2 instanceof List ? (List) tag2 : null;
                    Object tag3 = view.getTag(C2507R.id.div_additional_background_layer_tag);
                    if ((Intrinsics.m32174c(list5, arrayList) && Intrinsics.m32174c(list6, arrayList2) && Intrinsics.m32174c(tag3 instanceof Drawable ? (Drawable) tag3 : null, drawable)) ? false : true) {
                        StateListDrawable stateListDrawable = new StateListDrawable();
                        stateListDrawable.addState(new int[]{R.attr.state_focused}, DivBackgroundBinder.m16975b(divBackgroundBinder, arrayList2, view, divView, drawable, resolver));
                        if (list != null || drawable != null) {
                            stateListDrawable.addState(StateSet.WILD_CARD, DivBackgroundBinder.m16975b(divBackgroundBinder, arrayList, view, divView, drawable, resolver));
                        }
                        DivBackgroundBinder.m16976c(divBackgroundBinder, view, stateListDrawable);
                        view.setTag(C2507R.id.div_default_background_list_tag, arrayList);
                        view.setTag(C2507R.id.div_focused_background_list_tag, arrayList2);
                        view.setTag(C2507R.id.div_additional_background_layer_tag, drawable);
                    }
                    return Unit.f63088a;
                }
            };
            function12.invoke(Unit.f63088a);
            divBackgroundBinder.m16977d(list2, resolver, subscriber, function12);
            divBackgroundBinder.m16977d(list, resolver, subscriber, function12);
        }
    }

    /* renamed from: i */
    public final void m16988i(@NotNull View view, @NotNull DivBase divBase, @NotNull Div2View div2View) {
        Intrinsics.m32179h(view, "view");
        this.f31915c.m16694d(div2View, view, divBase);
    }
}
