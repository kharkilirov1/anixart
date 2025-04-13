package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivBase.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div2/DivBase;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public interface DivBase {
    @NotNull
    /* renamed from: a */
    DivSize getF39983v();

    @NotNull
    /* renamed from: b */
    DivTransform getF39952Q();

    @Nullable
    /* renamed from: c */
    List<DivVisibilityAction> mo17569c();

    @Nullable
    /* renamed from: d */
    List<DivBackground> mo17570d();

    @NotNull
    /* renamed from: e */
    DivAccessibility getF39962a();

    @Nullable
    /* renamed from: f */
    Expression<Long> mo17572f();

    @NotNull
    /* renamed from: g */
    DivSize getF39961Z();

    @NotNull
    /* renamed from: getBorder */
    DivBorder getF39971j();

    @Nullable
    /* renamed from: getId */
    String getF39984w();

    @NotNull
    Expression<DivVisibility> getVisibility();

    @NotNull
    /* renamed from: h */
    DivEdgeInsets getF39937B();

    @Nullable
    /* renamed from: i */
    Expression<Long> mo17575i();

    @NotNull
    /* renamed from: j */
    DivEdgeInsets getF39940E();

    @Nullable
    /* renamed from: k */
    List<DivTransitionTrigger> mo17577k();

    @Nullable
    /* renamed from: l */
    List<DivAction> mo17578l();

    @Nullable
    /* renamed from: m */
    Expression<DivAlignmentHorizontal> mo17579m();

    @Nullable
    /* renamed from: n */
    List<DivExtension> mo17580n();

    @Nullable
    /* renamed from: o */
    List<DivTooltip> mo17581o();

    @Nullable
    /* renamed from: p */
    DivVisibilityAction getF39959X();

    @Nullable
    /* renamed from: q */
    Expression<DivAlignmentVertical> mo17583q();

    @Nullable
    /* renamed from: r */
    DivAppearanceTransition getF39954S();

    @NotNull
    /* renamed from: s */
    Expression<Double> mo17585s();

    @Nullable
    /* renamed from: t */
    DivFocus getF39977p();

    @Nullable
    /* renamed from: u */
    DivAppearanceTransition getF39955T();

    @Nullable
    /* renamed from: v */
    DivChangeTransition getF39953R();
}
