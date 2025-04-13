package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.Div;
import com.yandex.div2.DivAccessibility;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivChangeTransition;
import com.yandex.div2.DivDisappearAction;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivExtension;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivTooltip;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.mobile.ads.C4632R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivGrid.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div2/DivGrid;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div2/DivBase;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivGrid implements JSONSerializable, DivBase {

    /* renamed from: J */
    @NotNull
    public static final Companion f36419J = new Companion(null);

    /* renamed from: K */
    @NotNull
    public static final DivAccessibility f36420K;

    /* renamed from: L */
    @NotNull
    public static final DivAnimation f36421L;

    /* renamed from: M */
    @NotNull
    public static final Expression<Double> f36422M;

    /* renamed from: N */
    @NotNull
    public static final DivBorder f36423N;

    /* renamed from: O */
    @NotNull
    public static final Expression<DivAlignmentHorizontal> f36424O;

    /* renamed from: P */
    @NotNull
    public static final Expression<DivAlignmentVertical> f36425P;

    /* renamed from: Q */
    @NotNull
    public static final DivSize.WrapContent f36426Q;

    /* renamed from: R */
    @NotNull
    public static final DivEdgeInsets f36427R;

    /* renamed from: S */
    @NotNull
    public static final DivEdgeInsets f36428S;

    /* renamed from: T */
    @NotNull
    public static final DivTransform f36429T;

    /* renamed from: U */
    @NotNull
    public static final Expression<DivVisibility> f36430U;

    /* renamed from: V */
    @NotNull
    public static final DivSize.MatchParent f36431V;

    /* renamed from: W */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f36432W;

    /* renamed from: X */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f36433X;

    /* renamed from: Y */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f36434Y;

    /* renamed from: Z */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f36435Z;

    /* renamed from: a0 */
    @NotNull
    public static final TypeHelper<DivVisibility> f36436a0;

    /* renamed from: b0 */
    @NotNull
    public static final ListValidator<DivAction> f36437b0;

    /* renamed from: c0 */
    @NotNull
    public static final ValueValidator<Double> f36438c0;

    /* renamed from: d0 */
    @NotNull
    public static final ListValidator<DivBackground> f36439d0;

    /* renamed from: e0 */
    @NotNull
    public static final ValueValidator<Long> f36440e0;

    /* renamed from: f0 */
    @NotNull
    public static final ValueValidator<Long> f36441f0;

    /* renamed from: g0 */
    @NotNull
    public static final ListValidator<DivDisappearAction> f36442g0;

    /* renamed from: h0 */
    @NotNull
    public static final ListValidator<DivAction> f36443h0;

    /* renamed from: i0 */
    @NotNull
    public static final ListValidator<DivExtension> f36444i0;

    /* renamed from: j0 */
    @NotNull
    public static final ValueValidator<String> f36445j0;

    /* renamed from: k0 */
    @NotNull
    public static final ListValidator<Div> f36446k0;

    /* renamed from: l0 */
    @NotNull
    public static final ListValidator<DivAction> f36447l0;

    /* renamed from: m0 */
    @NotNull
    public static final ValueValidator<Long> f36448m0;

    /* renamed from: n0 */
    @NotNull
    public static final ListValidator<DivAction> f36449n0;

    /* renamed from: o0 */
    @NotNull
    public static final ListValidator<DivTooltip> f36450o0;

    /* renamed from: p0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f36451p0;

    /* renamed from: q0 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f36452q0;

    /* renamed from: A */
    @NotNull
    public final DivTransform f36453A;

    /* renamed from: B */
    @Nullable
    public final DivChangeTransition f36454B;

    /* renamed from: C */
    @Nullable
    public final DivAppearanceTransition f36455C;

    /* renamed from: D */
    @Nullable
    public final DivAppearanceTransition f36456D;

    /* renamed from: E */
    @Nullable
    public final List<DivTransitionTrigger> f36457E;

    /* renamed from: F */
    @NotNull
    public final Expression<DivVisibility> f36458F;

    /* renamed from: G */
    @Nullable
    public final DivVisibilityAction f36459G;

    /* renamed from: H */
    @Nullable
    public final List<DivVisibilityAction> f36460H;

    /* renamed from: I */
    @NotNull
    public final DivSize f36461I;

    /* renamed from: a */
    @NotNull
    public final DivAccessibility f36462a;

    /* renamed from: b */
    @JvmField
    @Nullable
    public final DivAction f36463b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final DivAnimation f36464c;

    /* renamed from: d */
    @JvmField
    @Nullable
    public final List<DivAction> f36465d;

    /* renamed from: e */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f36466e;

    /* renamed from: f */
    @Nullable
    public final Expression<DivAlignmentVertical> f36467f;

    /* renamed from: g */
    @NotNull
    public final Expression<Double> f36468g;

    /* renamed from: h */
    @Nullable
    public final List<DivBackground> f36469h;

    /* renamed from: i */
    @NotNull
    public final DivBorder f36470i;

    /* renamed from: j */
    @JvmField
    @NotNull
    public final Expression<Long> f36471j;

    /* renamed from: k */
    @Nullable
    public final Expression<Long> f36472k;

    /* renamed from: l */
    @JvmField
    @NotNull
    public final Expression<DivAlignmentHorizontal> f36473l;

    /* renamed from: m */
    @JvmField
    @NotNull
    public final Expression<DivAlignmentVertical> f36474m;

    /* renamed from: n */
    @Nullable
    public final List<DivDisappearAction> f36475n;

    /* renamed from: o */
    @JvmField
    @Nullable
    public final List<DivAction> f36476o;

    /* renamed from: p */
    @Nullable
    public final List<DivExtension> f36477p;

    /* renamed from: q */
    @Nullable
    public final DivFocus f36478q;

    /* renamed from: r */
    @NotNull
    public final DivSize f36479r;

    /* renamed from: s */
    @Nullable
    public final String f36480s;

    /* renamed from: t */
    @JvmField
    @NotNull
    public final List<Div> f36481t;

    /* renamed from: u */
    @JvmField
    @Nullable
    public final List<DivAction> f36482u;

    /* renamed from: v */
    @NotNull
    public final DivEdgeInsets f36483v;

    /* renamed from: w */
    @NotNull
    public final DivEdgeInsets f36484w;

    /* renamed from: x */
    @Nullable
    public final Expression<Long> f36485x;

    /* renamed from: y */
    @Nullable
    public final List<DivAction> f36486y;

    /* renamed from: z */
    @Nullable
    public final List<DivTooltip> f36487z;

    /* compiled from: DivGrid.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\bR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0012R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0012R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u000fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u000fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\bR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\bR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\bR\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0012R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020*0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0012R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\bR\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\bR\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00102R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0012R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0012R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\bR\u001a\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\bR\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010\bR\u0014\u0010>\u001a\u00020*8\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001e0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020 0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010BR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001e0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010BR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020 0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010BR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020F0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010BR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010\bR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020F0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010\u000fR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006N"}, m31884d2 = {"Lcom/yandex/div2/DivGrid$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAction;", "ACTIONS_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAnimation;", "ACTION_ANIMATION_DEFAULT_VALUE", "Lcom/yandex/div2/DivAnimation;", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "", "COLUMN_COUNT_TEMPLATE_VALIDATOR", "COLUMN_COUNT_VALIDATOR", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivAlignmentHorizontal;", "CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE", "Lcom/yandex/div2/DivAlignmentVertical;", "CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "DOUBLETAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div2/Div;", "ITEMS_VALIDATOR", "LONGTAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "PADDINGS_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL", "TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivGrid m17628a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            DivAccessibility.Companion companion = DivAccessibility.f34479f;
            DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject, "accessibility", DivAccessibility.f34486m, f34328a, parsingEnvironment);
            if (divAccessibility == null) {
                divAccessibility = DivGrid.f36420K;
            }
            DivAccessibility divAccessibility2 = divAccessibility;
            Intrinsics.m32178g(divAccessibility2, "JsonParser.readOptional(…CESSIBILITY_DEFAULT_VALUE");
            DivAction.Companion companion2 = DivAction.f34546g;
            Function2<ParsingEnvironment, JSONObject, DivAction> function2 = DivAction.f34550k;
            DivAction divAction = (DivAction) JsonParser.m17322n(jSONObject, "action", function2, f34328a, parsingEnvironment);
            DivAnimation.Companion companion3 = DivAnimation.f34634h;
            DivAnimation divAnimation = (DivAnimation) JsonParser.m17322n(jSONObject, "action_animation", DivAnimation.f34644r, f34328a, parsingEnvironment);
            if (divAnimation == null) {
                divAnimation = DivGrid.f36421L;
            }
            DivAnimation divAnimation2 = divAnimation;
            Intrinsics.m32178g(divAnimation2, "JsonParser.readOptional(…N_ANIMATION_DEFAULT_VALUE");
            List m17333y = JsonParser.m17333y(jSONObject, "actions", function2, DivGrid.f36437b0, f34328a, parsingEnvironment);
            DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
            Function1<String, DivAlignmentHorizontal> function1 = DivAlignmentHorizontal.f34618d;
            Expression m17329u = JsonParser.m17329u(jSONObject, "alignment_horizontal", function1, f34328a, parsingEnvironment, DivGrid.f36432W);
            DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
            Function1<String, DivAlignmentVertical> function12 = DivAlignmentVertical.f34626d;
            Expression m17329u2 = JsonParser.m17329u(jSONObject, "alignment_vertical", function12, f34328a, parsingEnvironment, DivGrid.f36433X);
            Function1<Number, Double> function13 = ParsingConvertersKt.f33830d;
            ValueValidator<Double> valueValidator = DivGrid.f36438c0;
            Expression<Double> expression = DivGrid.f36422M;
            Expression<Double> m17328t = JsonParser.m17328t(jSONObject, "alpha", function13, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
            if (m17328t != null) {
                expression = m17328t;
            }
            DivBackground.Companion companion4 = DivBackground.f34750a;
            List m17333y2 = JsonParser.m17333y(jSONObject, "background", DivBackground.f34751b, DivGrid.f36439d0, f34328a, parsingEnvironment);
            DivBorder.Companion companion5 = DivBorder.f34785f;
            DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject, "border", DivBorder.f34788i, f34328a, parsingEnvironment);
            if (divBorder == null) {
                divBorder = DivGrid.f36423N;
            }
            DivBorder divBorder2 = divBorder;
            Intrinsics.m32178g(divBorder2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            Function1<Number, Long> function14 = ParsingConvertersKt.f33831e;
            ValueValidator<Long> valueValidator2 = DivGrid.f36440e0;
            TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
            Expression m17316h = JsonParser.m17316h(jSONObject, "column_count", function14, valueValidator2, f34328a, typeHelper);
            Expression m17327s = JsonParser.m17327s(jSONObject, "column_span", function14, DivGrid.f36441f0, f34328a, parsingEnvironment, typeHelper);
            Expression<DivAlignmentHorizontal> expression2 = DivGrid.f36424O;
            Expression<DivAlignmentHorizontal> m17330v = JsonParser.m17330v(jSONObject, "content_alignment_horizontal", function1, f34328a, parsingEnvironment, expression2, DivGrid.f36434Y);
            if (m17330v != null) {
                expression2 = m17330v;
            }
            Expression<DivAlignmentVertical> expression3 = DivGrid.f36425P;
            Expression<DivAlignmentVertical> m17330v2 = JsonParser.m17330v(jSONObject, "content_alignment_vertical", function12, f34328a, parsingEnvironment, expression3, DivGrid.f36435Z);
            Expression<DivAlignmentVertical> expression4 = m17330v2 == null ? expression3 : m17330v2;
            DivDisappearAction.Companion companion6 = DivDisappearAction.f35537a;
            List m17333y3 = JsonParser.m17333y(jSONObject, "disappear_actions", DivDisappearAction.f35545i, DivGrid.f36442g0, f34328a, parsingEnvironment);
            List m17333y4 = JsonParser.m17333y(jSONObject, "doubletap_actions", function2, DivGrid.f36443h0, f34328a, parsingEnvironment);
            DivExtension.Companion companion7 = DivExtension.f35659c;
            List m17333y5 = JsonParser.m17333y(jSONObject, "extensions", DivExtension.f35660d, DivGrid.f36444i0, f34328a, parsingEnvironment);
            DivFocus.Companion companion8 = DivFocus.f35813f;
            DivFocus divFocus = (DivFocus) JsonParser.m17322n(jSONObject, "focus", DivFocus.f35818k, f34328a, parsingEnvironment);
            DivSize.Companion companion9 = DivSize.f38833a;
            Function2<ParsingEnvironment, JSONObject, DivSize> function22 = DivSize.f38834b;
            DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject, "height", function22, f34328a, parsingEnvironment);
            if (divSize == null) {
                divSize = DivGrid.f36426Q;
            }
            DivSize divSize2 = divSize;
            Intrinsics.m32178g(divSize2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            String str = (String) JsonParser.m17323o(jSONObject, "id", DivGrid.f36445j0, f34328a, parsingEnvironment);
            Div.Companion companion10 = Div.f34418a;
            List m17308A = JsonParser.m17308A(jSONObject, "items", Div.f34419b, DivGrid.f36446k0, f34328a, parsingEnvironment);
            Intrinsics.m32178g(m17308A, "readStrictList(json, \"it…S_VALIDATOR, logger, env)");
            List m17333y6 = JsonParser.m17333y(jSONObject, "longtap_actions", function2, DivGrid.f36447l0, f34328a, parsingEnvironment);
            DivEdgeInsets.Companion companion11 = DivEdgeInsets.f35607f;
            Function2<ParsingEnvironment, JSONObject, DivEdgeInsets> function23 = DivEdgeInsets.f35618q;
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "margins", function23, f34328a, parsingEnvironment);
            if (divEdgeInsets == null) {
                divEdgeInsets = DivGrid.f36427R;
            }
            DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
            Intrinsics.m32178g(divEdgeInsets2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "paddings", function23, f34328a, parsingEnvironment);
            if (divEdgeInsets3 == null) {
                divEdgeInsets3 = DivGrid.f36428S;
            }
            DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
            Intrinsics.m32178g(divEdgeInsets4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            Expression m17327s2 = JsonParser.m17327s(jSONObject, "row_span", function14, DivGrid.f36448m0, f34328a, parsingEnvironment, typeHelper);
            List m17333y7 = JsonParser.m17333y(jSONObject, "selected_actions", function2, DivGrid.f36449n0, f34328a, parsingEnvironment);
            DivTooltip.Companion companion12 = DivTooltip.f40492h;
            List m17333y8 = JsonParser.m17333y(jSONObject, "tooltips", DivTooltip.f40497m, DivGrid.f36450o0, f34328a, parsingEnvironment);
            DivTransform.Companion companion13 = DivTransform.f40551d;
            DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject, "transform", DivTransform.f40554g, f34328a, parsingEnvironment);
            if (divTransform == null) {
                divTransform = DivGrid.f36429T;
            }
            DivTransform divTransform2 = divTransform;
            Intrinsics.m32178g(divTransform2, "JsonParser.readOptional(…: TRANSFORM_DEFAULT_VALUE");
            DivChangeTransition.Companion companion14 = DivChangeTransition.f34856a;
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonParser.m17322n(jSONObject, "transition_change", DivChangeTransition.f34857b, f34328a, parsingEnvironment);
            DivAppearanceTransition.Companion companion15 = DivAppearanceTransition.f34726a;
            Function2<ParsingEnvironment, JSONObject, DivAppearanceTransition> function24 = DivAppearanceTransition.f34727b;
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonParser.m17322n(jSONObject, "transition_in", function24, f34328a, parsingEnvironment);
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonParser.m17322n(jSONObject, "transition_out", function24, f34328a, parsingEnvironment);
            DivTransitionTrigger.Converter converter3 = DivTransitionTrigger.f40582c;
            List m17332x = JsonParser.m17332x(jSONObject, "transition_triggers", DivTransitionTrigger.f40583d, DivGrid.f36451p0, f34328a, parsingEnvironment);
            DivVisibility.Converter converter4 = DivVisibility.f40930c;
            Function1<String, DivVisibility> function15 = DivVisibility.f40931d;
            Expression<DivVisibility> expression5 = DivGrid.f36430U;
            Expression<DivVisibility> m17330v3 = JsonParser.m17330v(jSONObject, "visibility", function15, f34328a, parsingEnvironment, expression5, DivGrid.f36436a0);
            Expression<DivVisibility> expression6 = m17330v3 == null ? expression5 : m17330v3;
            DivVisibilityAction.Companion companion16 = DivVisibilityAction.f40938i;
            Function2<ParsingEnvironment, JSONObject, DivVisibilityAction> function25 = DivVisibilityAction.f40946q;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonParser.m17322n(jSONObject, "visibility_action", function25, f34328a, parsingEnvironment);
            List m17333y9 = JsonParser.m17333y(jSONObject, "visibility_actions", function25, DivGrid.f36452q0, f34328a, parsingEnvironment);
            DivSize divSize3 = (DivSize) JsonParser.m17322n(jSONObject, "width", function22, f34328a, parsingEnvironment);
            if (divSize3 == null) {
                divSize3 = DivGrid.f36431V;
            }
            Intrinsics.m32178g(divSize3, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new DivGrid(divAccessibility2, divAction, divAnimation2, m17333y, m17329u, m17329u2, expression, m17333y2, divBorder2, m17316h, m17327s, expression2, expression4, m17333y3, m17333y4, m17333y5, divFocus, divSize2, str, m17308A, m17333y6, divEdgeInsets2, divEdgeInsets4, m17327s2, m17333y7, m17333y8, divTransform2, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17332x, expression6, divVisibilityAction, m17333y9, divSize3);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression expression = null;
        f36420K = new DivAccessibility(null, null, null, expression, null, null, 63);
        Expression.Companion companion = Expression.f34334a;
        Expression m17539a = companion.m17539a(100L);
        Expression m17539a2 = companion.m17539a(Double.valueOf(0.6d));
        Expression m17539a3 = companion.m17539a(DivAnimation.Name.FADE);
        Double valueOf = Double.valueOf(1.0d);
        Expression expression2 = null;
        Expression expression3 = null;
        f36421L = new DivAnimation(m17539a, m17539a2, expression2, null, m17539a3, null, expression3, companion.m17539a(valueOf), C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
        f36422M = companion.m17539a(valueOf);
        f36423N = new DivBorder(null, null == true ? 1 : 0, expression, null == true ? 1 : 0, null == true ? 1 : 0, 31);
        f36424O = companion.m17539a(DivAlignmentHorizontal.LEFT);
        f36425P = companion.m17539a(DivAlignmentVertical.TOP);
        int i2 = 7;
        f36426Q = new DivSize.WrapContent(new DivWrapContentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, i2));
        f36427R = new DivEdgeInsets(expression, null == true ? 1 : 0, null == true ? 1 : 0, null, null, 31);
        f36428S = new DivEdgeInsets(expression2, null == true ? 1 : 0, null, null == true ? 1 : 0, expression3, 31);
        f36429T = new DivTransform(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, i2);
        f36430U = companion.m17539a(DivVisibility.VISIBLE);
        f36431V = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i3 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f36432W = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGrid$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f36433X = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGrid$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f36434Y = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGrid$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f36435Z = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGrid$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f36436a0 = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGrid$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f36437b0 = C3063p.f41858h;
        f36438c0 = C3061o.f41803o;
        f36439d0 = C3063p.f41866p;
        f36440e0 = C3061o.f41804p;
        f36441f0 = C3061o.f41805q;
        f36442g0 = C3063p.f41867q;
        f36443h0 = C3063p.f41868r;
        f36444i0 = C3063p.f41859i;
        f36445j0 = C3061o.f41801m;
        f36446k0 = C3063p.f41860j;
        f36447l0 = C3063p.f41861k;
        f36448m0 = C3061o.f41802n;
        f36449n0 = C3063p.f41862l;
        f36450o0 = C3063p.f41863m;
        f36451p0 = C3063p.f41864n;
        f36452q0 = C3063p.f41865o;
        DivGrid$Companion$CREATOR$1 divGrid$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivGrid>() { // from class: com.yandex.div2.DivGrid$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivGrid invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivGrid.f36419J.m17628a(env, it);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @DivModelInternalApi
    public DivGrid(@NotNull DivAccessibility accessibility, @Nullable DivAction divAction, @NotNull DivAnimation actionAnimation, @Nullable List<? extends DivAction> list, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> alpha, @Nullable List<? extends DivBackground> list2, @NotNull DivBorder border, @NotNull Expression<Long> columnCount, @Nullable Expression<Long> expression3, @NotNull Expression<DivAlignmentHorizontal> contentAlignmentHorizontal, @NotNull Expression<DivAlignmentVertical> contentAlignmentVertical, @Nullable List<? extends DivDisappearAction> list3, @Nullable List<? extends DivAction> list4, @Nullable List<? extends DivExtension> list5, @Nullable DivFocus divFocus, @NotNull DivSize height, @Nullable String str, @NotNull List<? extends Div> items, @Nullable List<? extends DivAction> list6, @NotNull DivEdgeInsets margins, @NotNull DivEdgeInsets paddings, @Nullable Expression<Long> expression4, @Nullable List<? extends DivAction> list7, @Nullable List<? extends DivTooltip> list8, @NotNull DivTransform transform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list9, @NotNull Expression<DivVisibility> visibility, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<? extends DivVisibilityAction> list10, @NotNull DivSize width) {
        Intrinsics.m32179h(accessibility, "accessibility");
        Intrinsics.m32179h(actionAnimation, "actionAnimation");
        Intrinsics.m32179h(alpha, "alpha");
        Intrinsics.m32179h(border, "border");
        Intrinsics.m32179h(columnCount, "columnCount");
        Intrinsics.m32179h(contentAlignmentHorizontal, "contentAlignmentHorizontal");
        Intrinsics.m32179h(contentAlignmentVertical, "contentAlignmentVertical");
        Intrinsics.m32179h(height, "height");
        Intrinsics.m32179h(items, "items");
        Intrinsics.m32179h(margins, "margins");
        Intrinsics.m32179h(paddings, "paddings");
        Intrinsics.m32179h(transform, "transform");
        Intrinsics.m32179h(visibility, "visibility");
        Intrinsics.m32179h(width, "width");
        this.f36462a = accessibility;
        this.f36463b = divAction;
        this.f36464c = actionAnimation;
        this.f36465d = list;
        this.f36466e = expression;
        this.f36467f = expression2;
        this.f36468g = alpha;
        this.f36469h = list2;
        this.f36470i = border;
        this.f36471j = columnCount;
        this.f36472k = expression3;
        this.f36473l = contentAlignmentHorizontal;
        this.f36474m = contentAlignmentVertical;
        this.f36475n = list3;
        this.f36476o = list4;
        this.f36477p = list5;
        this.f36478q = divFocus;
        this.f36479r = height;
        this.f36480s = str;
        this.f36481t = items;
        this.f36482u = list6;
        this.f36483v = margins;
        this.f36484w = paddings;
        this.f36485x = expression4;
        this.f36486y = list7;
        this.f36487z = list8;
        this.f36453A = transform;
        this.f36454B = divChangeTransition;
        this.f36455C = divAppearanceTransition;
        this.f36456D = divAppearanceTransition2;
        this.f36457E = list9;
        this.f36458F = visibility;
        this.f36459G = divVisibilityAction;
        this.f36460H = list10;
        this.f36461I = width;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: a, reason: from getter */
    public DivSize getF35298m() {
        return this.f36479r;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: b, reason: from getter */
    public DivTransform getF35306u() {
        return this.f36453A;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: c */
    public List<DivVisibilityAction> mo17569c() {
        return this.f36460H;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: d */
    public List<DivBackground> mo17570d() {
        return this.f36469h;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: e, reason: from getter */
    public DivAccessibility getF35286a() {
        return this.f36462a;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: f */
    public Expression<Long> mo17572f() {
        return this.f36472k;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: g, reason: from getter */
    public DivSize getF35285C() {
        return this.f36461I;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: getBorder, reason: from getter */
    public DivBorder getF35291f() {
        return this.f36470i;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: getId, reason: from getter */
    public String getF35299n() {
        return this.f36480s;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    public Expression<DivVisibility> getVisibility() {
        return this.f36458F;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: h, reason: from getter */
    public DivEdgeInsets getF35301p() {
        return this.f36483v;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: i */
    public Expression<Long> mo17575i() {
        return this.f36485x;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: j, reason: from getter */
    public DivEdgeInsets getF35302q() {
        return this.f36484w;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: k */
    public List<DivTransitionTrigger> mo17577k() {
        return this.f36457E;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: l */
    public List<DivAction> mo17578l() {
        return this.f36486y;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: m */
    public Expression<DivAlignmentHorizontal> mo17579m() {
        return this.f36466e;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: n */
    public List<DivExtension> mo17580n() {
        return this.f36477p;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: o */
    public List<DivTooltip> mo17581o() {
        return this.f36487z;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: p, reason: from getter */
    public DivVisibilityAction getF35283A() {
        return this.f36459G;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: q */
    public Expression<DivAlignmentVertical> mo17583q() {
        return this.f36467f;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: r, reason: from getter */
    public DivAppearanceTransition getF35308w() {
        return this.f36455C;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: s */
    public Expression<Double> mo17585s() {
        return this.f36468g;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: t, reason: from getter */
    public DivFocus getF35297l() {
        return this.f36478q;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: u, reason: from getter */
    public DivAppearanceTransition getF35309x() {
        return this.f36456D;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: v, reason: from getter */
    public DivChangeTransition getF35307v() {
        return this.f36454B;
    }
}
