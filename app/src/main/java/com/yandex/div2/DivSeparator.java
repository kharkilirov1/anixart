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
import com.yandex.div2.DivSeparator;
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

/* compiled from: DivSeparator.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivSeparator;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div2/DivBase;", "Companion", "DelimiterStyle", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivSeparator implements JSONSerializable, DivBase {

    /* renamed from: G */
    @NotNull
    public static final Companion f38536G = new Companion(null);

    /* renamed from: H */
    @NotNull
    public static final DivAccessibility f38537H;

    /* renamed from: I */
    @NotNull
    public static final DivAnimation f38538I;

    /* renamed from: J */
    @NotNull
    public static final Expression<Double> f38539J;

    /* renamed from: K */
    @NotNull
    public static final DivBorder f38540K;

    /* renamed from: L */
    @NotNull
    public static final DelimiterStyle f38541L;

    /* renamed from: M */
    @NotNull
    public static final DivSize.WrapContent f38542M;

    /* renamed from: N */
    @NotNull
    public static final DivEdgeInsets f38543N;

    /* renamed from: O */
    @NotNull
    public static final DivEdgeInsets f38544O;

    /* renamed from: P */
    @NotNull
    public static final DivTransform f38545P;

    /* renamed from: Q */
    @NotNull
    public static final Expression<DivVisibility> f38546Q;

    /* renamed from: R */
    @NotNull
    public static final DivSize.MatchParent f38547R;

    /* renamed from: S */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f38548S;

    /* renamed from: T */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f38549T;

    /* renamed from: U */
    @NotNull
    public static final TypeHelper<DivVisibility> f38550U;

    /* renamed from: V */
    @NotNull
    public static final ListValidator<DivAction> f38551V;

    /* renamed from: W */
    @NotNull
    public static final ValueValidator<Double> f38552W;

    /* renamed from: X */
    @NotNull
    public static final ListValidator<DivBackground> f38553X;

    /* renamed from: Y */
    @NotNull
    public static final ValueValidator<Long> f38554Y;

    /* renamed from: Z */
    @NotNull
    public static final ListValidator<DivDisappearAction> f38555Z;

    /* renamed from: a0 */
    @NotNull
    public static final ListValidator<DivAction> f38556a0;

    /* renamed from: b0 */
    @NotNull
    public static final ListValidator<DivExtension> f38557b0;

    /* renamed from: c0 */
    @NotNull
    public static final ValueValidator<String> f38558c0;

    /* renamed from: d0 */
    @NotNull
    public static final ListValidator<DivAction> f38559d0;

    /* renamed from: e0 */
    @NotNull
    public static final ValueValidator<Long> f38560e0;

    /* renamed from: f0 */
    @NotNull
    public static final ListValidator<DivAction> f38561f0;

    /* renamed from: g0 */
    @NotNull
    public static final ListValidator<DivTooltip> f38562g0;

    /* renamed from: h0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f38563h0;

    /* renamed from: i0 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f38564i0;

    /* renamed from: A */
    @Nullable
    public final DivAppearanceTransition f38565A;

    /* renamed from: B */
    @Nullable
    public final List<DivTransitionTrigger> f38566B;

    /* renamed from: C */
    @NotNull
    public final Expression<DivVisibility> f38567C;

    /* renamed from: D */
    @Nullable
    public final DivVisibilityAction f38568D;

    /* renamed from: E */
    @Nullable
    public final List<DivVisibilityAction> f38569E;

    /* renamed from: F */
    @NotNull
    public final DivSize f38570F;

    /* renamed from: a */
    @NotNull
    public final DivAccessibility f38571a;

    /* renamed from: b */
    @JvmField
    @Nullable
    public final DivAction f38572b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final DivAnimation f38573c;

    /* renamed from: d */
    @JvmField
    @Nullable
    public final List<DivAction> f38574d;

    /* renamed from: e */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f38575e;

    /* renamed from: f */
    @Nullable
    public final Expression<DivAlignmentVertical> f38576f;

    /* renamed from: g */
    @NotNull
    public final Expression<Double> f38577g;

    /* renamed from: h */
    @Nullable
    public final List<DivBackground> f38578h;

    /* renamed from: i */
    @NotNull
    public final DivBorder f38579i;

    /* renamed from: j */
    @Nullable
    public final Expression<Long> f38580j;

    /* renamed from: k */
    @JvmField
    @NotNull
    public final DelimiterStyle f38581k;

    /* renamed from: l */
    @Nullable
    public final List<DivDisappearAction> f38582l;

    /* renamed from: m */
    @JvmField
    @Nullable
    public final List<DivAction> f38583m;

    /* renamed from: n */
    @Nullable
    public final List<DivExtension> f38584n;

    /* renamed from: o */
    @Nullable
    public final DivFocus f38585o;

    /* renamed from: p */
    @NotNull
    public final DivSize f38586p;

    /* renamed from: q */
    @Nullable
    public final String f38587q;

    /* renamed from: r */
    @JvmField
    @Nullable
    public final List<DivAction> f38588r;

    /* renamed from: s */
    @NotNull
    public final DivEdgeInsets f38589s;

    /* renamed from: t */
    @NotNull
    public final DivEdgeInsets f38590t;

    /* renamed from: u */
    @Nullable
    public final Expression<Long> f38591u;

    /* renamed from: v */
    @Nullable
    public final List<DivAction> f38592v;

    /* renamed from: w */
    @Nullable
    public final List<DivTooltip> f38593w;

    /* renamed from: x */
    @NotNull
    public final DivTransform f38594x;

    /* renamed from: y */
    @Nullable
    public final DivChangeTransition f38595y;

    /* renamed from: z */
    @Nullable
    public final DivAppearanceTransition f38596z;

    /* compiled from: DivSeparator.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\bR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0012R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\bR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\bR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0012R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0012R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\bR\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0012R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0012R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\bR\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\bR\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\bR\u0014\u00109\u001a\u00020'8\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020?0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010>R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020A0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010>R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010\bR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020A0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010\u000fR\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006I"}, m31884d2 = {"Lcom/yandex/div2/DivSeparator$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAction;", "ACTIONS_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAnimation;", "ACTION_ANIMATION_DEFAULT_VALUE", "Lcom/yandex/div2/DivAnimation;", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivSeparator$DelimiterStyle;", "DELIMITER_STYLE_DEFAULT_VALUE", "Lcom/yandex/div2/DivSeparator$DelimiterStyle;", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "DOUBLETAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "LONGTAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "PADDINGS_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivSeparator m17691a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            DivAccessibility.Companion companion = DivAccessibility.f34479f;
            DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject, "accessibility", DivAccessibility.f34486m, f34328a, parsingEnvironment);
            if (divAccessibility == null) {
                divAccessibility = DivSeparator.f38537H;
            }
            DivAccessibility divAccessibility2 = divAccessibility;
            Intrinsics.m32178g(divAccessibility2, "JsonParser.readOptional(…CESSIBILITY_DEFAULT_VALUE");
            DivAction.Companion companion2 = DivAction.f34546g;
            Function2<ParsingEnvironment, JSONObject, DivAction> function2 = DivAction.f34550k;
            DivAction divAction = (DivAction) JsonParser.m17322n(jSONObject, "action", function2, f34328a, parsingEnvironment);
            DivAnimation.Companion companion3 = DivAnimation.f34634h;
            DivAnimation divAnimation = (DivAnimation) JsonParser.m17322n(jSONObject, "action_animation", DivAnimation.f34644r, f34328a, parsingEnvironment);
            if (divAnimation == null) {
                divAnimation = DivSeparator.f38538I;
            }
            DivAnimation divAnimation2 = divAnimation;
            Intrinsics.m32178g(divAnimation2, "JsonParser.readOptional(…N_ANIMATION_DEFAULT_VALUE");
            List m17333y = JsonParser.m17333y(jSONObject, "actions", function2, DivSeparator.f38551V, f34328a, parsingEnvironment);
            DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
            Expression m17329u = JsonParser.m17329u(jSONObject, "alignment_horizontal", DivAlignmentHorizontal.f34618d, f34328a, parsingEnvironment, DivSeparator.f38548S);
            DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
            Expression m17329u2 = JsonParser.m17329u(jSONObject, "alignment_vertical", DivAlignmentVertical.f34626d, f34328a, parsingEnvironment, DivSeparator.f38549T);
            Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
            ValueValidator<Double> valueValidator = DivSeparator.f38552W;
            Expression<Double> expression = DivSeparator.f38539J;
            Expression<Double> m17328t = JsonParser.m17328t(jSONObject, "alpha", function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
            if (m17328t != null) {
                expression = m17328t;
            }
            DivBackground.Companion companion4 = DivBackground.f34750a;
            List m17333y2 = JsonParser.m17333y(jSONObject, "background", DivBackground.f34751b, DivSeparator.f38553X, f34328a, parsingEnvironment);
            DivBorder.Companion companion5 = DivBorder.f34785f;
            DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject, "border", DivBorder.f34788i, f34328a, parsingEnvironment);
            if (divBorder == null) {
                divBorder = DivSeparator.f38540K;
            }
            DivBorder divBorder2 = divBorder;
            Intrinsics.m32178g(divBorder2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            Function1<Number, Long> function12 = ParsingConvertersKt.f33831e;
            ValueValidator<Long> valueValidator2 = DivSeparator.f38554Y;
            TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
            Expression m17327s = JsonParser.m17327s(jSONObject, "column_span", function12, valueValidator2, f34328a, parsingEnvironment, typeHelper);
            DelimiterStyle.Companion companion6 = DelimiterStyle.f38601c;
            DelimiterStyle delimiterStyle = (DelimiterStyle) JsonParser.m17322n(jSONObject, "delimiter_style", DelimiterStyle.f38605g, f34328a, parsingEnvironment);
            if (delimiterStyle == null) {
                delimiterStyle = DivSeparator.f38541L;
            }
            DelimiterStyle delimiterStyle2 = delimiterStyle;
            Intrinsics.m32178g(delimiterStyle2, "JsonParser.readOptional(…MITER_STYLE_DEFAULT_VALUE");
            DivDisappearAction.Companion companion7 = DivDisappearAction.f35537a;
            List m17333y3 = JsonParser.m17333y(jSONObject, "disappear_actions", DivDisappearAction.f35545i, DivSeparator.f38555Z, f34328a, parsingEnvironment);
            List m17333y4 = JsonParser.m17333y(jSONObject, "doubletap_actions", function2, DivSeparator.f38556a0, f34328a, parsingEnvironment);
            DivExtension.Companion companion8 = DivExtension.f35659c;
            List m17333y5 = JsonParser.m17333y(jSONObject, "extensions", DivExtension.f35660d, DivSeparator.f38557b0, f34328a, parsingEnvironment);
            DivFocus.Companion companion9 = DivFocus.f35813f;
            DivFocus divFocus = (DivFocus) JsonParser.m17322n(jSONObject, "focus", DivFocus.f35818k, f34328a, parsingEnvironment);
            DivSize.Companion companion10 = DivSize.f38833a;
            Function2<ParsingEnvironment, JSONObject, DivSize> function22 = DivSize.f38834b;
            DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject, "height", function22, f34328a, parsingEnvironment);
            if (divSize == null) {
                divSize = DivSeparator.f38542M;
            }
            DivSize divSize2 = divSize;
            Intrinsics.m32178g(divSize2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            String str = (String) JsonParser.m17323o(jSONObject, "id", DivSeparator.f38558c0, f34328a, parsingEnvironment);
            List m17333y6 = JsonParser.m17333y(jSONObject, "longtap_actions", function2, DivSeparator.f38559d0, f34328a, parsingEnvironment);
            DivEdgeInsets.Companion companion11 = DivEdgeInsets.f35607f;
            Function2<ParsingEnvironment, JSONObject, DivEdgeInsets> function23 = DivEdgeInsets.f35618q;
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "margins", function23, f34328a, parsingEnvironment);
            if (divEdgeInsets == null) {
                divEdgeInsets = DivSeparator.f38543N;
            }
            DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
            Intrinsics.m32178g(divEdgeInsets2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "paddings", function23, f34328a, parsingEnvironment);
            if (divEdgeInsets3 == null) {
                divEdgeInsets3 = DivSeparator.f38544O;
            }
            DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
            Intrinsics.m32178g(divEdgeInsets4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            Expression m17327s2 = JsonParser.m17327s(jSONObject, "row_span", function12, DivSeparator.f38560e0, f34328a, parsingEnvironment, typeHelper);
            List m17333y7 = JsonParser.m17333y(jSONObject, "selected_actions", function2, DivSeparator.f38561f0, f34328a, parsingEnvironment);
            DivTooltip.Companion companion12 = DivTooltip.f40492h;
            List m17333y8 = JsonParser.m17333y(jSONObject, "tooltips", DivTooltip.f40497m, DivSeparator.f38562g0, f34328a, parsingEnvironment);
            DivTransform.Companion companion13 = DivTransform.f40551d;
            DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject, "transform", DivTransform.f40554g, f34328a, parsingEnvironment);
            if (divTransform == null) {
                divTransform = DivSeparator.f38545P;
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
            List m17332x = JsonParser.m17332x(jSONObject, "transition_triggers", DivTransitionTrigger.f40583d, DivSeparator.f38563h0, f34328a, parsingEnvironment);
            DivVisibility.Converter converter4 = DivVisibility.f40930c;
            Function1<String, DivVisibility> function13 = DivVisibility.f40931d;
            Expression<DivVisibility> expression2 = DivSeparator.f38546Q;
            Expression<DivVisibility> m17330v = JsonParser.m17330v(jSONObject, "visibility", function13, f34328a, parsingEnvironment, expression2, DivSeparator.f38550U);
            Expression<DivVisibility> expression3 = m17330v == null ? expression2 : m17330v;
            DivVisibilityAction.Companion companion16 = DivVisibilityAction.f40938i;
            Function2<ParsingEnvironment, JSONObject, DivVisibilityAction> function25 = DivVisibilityAction.f40946q;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonParser.m17322n(jSONObject, "visibility_action", function25, f34328a, parsingEnvironment);
            List m17333y9 = JsonParser.m17333y(jSONObject, "visibility_actions", function25, DivSeparator.f38564i0, f34328a, parsingEnvironment);
            DivSize divSize3 = (DivSize) JsonParser.m17322n(jSONObject, "width", function22, f34328a, parsingEnvironment);
            if (divSize3 == null) {
                divSize3 = DivSeparator.f38547R;
            }
            Intrinsics.m32178g(divSize3, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new DivSeparator(divAccessibility2, divAction, divAnimation2, m17333y, m17329u, m17329u2, expression, m17333y2, divBorder2, m17327s, delimiterStyle2, m17333y3, m17333y4, m17333y5, divFocus, divSize2, str, m17333y6, divEdgeInsets2, divEdgeInsets4, m17327s2, m17333y7, m17333y8, divTransform2, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17332x, expression3, divVisibilityAction, m17333y9, divSize3);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression expression = null;
        f38537H = new DivAccessibility(null, null, null, expression, null, null, 63);
        Expression.Companion companion = Expression.f34334a;
        Expression m17539a = companion.m17539a(100L);
        Expression m17539a2 = companion.m17539a(Double.valueOf(0.6d));
        Expression m17539a3 = companion.m17539a(DivAnimation.Name.FADE);
        Double valueOf = Double.valueOf(1.0d);
        Expression expression2 = null;
        Expression expression3 = null;
        f38538I = new DivAnimation(m17539a, m17539a2, expression2, null, m17539a3, null, expression3, companion.m17539a(valueOf), C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
        f38539J = companion.m17539a(valueOf);
        f38540K = new DivBorder(null, null == true ? 1 : 0, expression, null == true ? 1 : 0, null == true ? 1 : 0, 31);
        f38541L = new DelimiterStyle(null, null == true ? 1 : 0, 3);
        int i2 = 7;
        f38542M = new DivSize.WrapContent(new DivWrapContentSize(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, i2));
        f38543N = new DivEdgeInsets(expression, null == true ? 1 : 0, null == true ? 1 : 0, null, null, 31);
        f38544O = new DivEdgeInsets(expression2, null == true ? 1 : 0, null, null == true ? 1 : 0, expression3, 31);
        f38545P = new DivTransform(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, i2);
        f38546Q = companion.m17539a(DivVisibility.VISIBLE);
        f38547R = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i3 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f38548S = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSeparator$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f38549T = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSeparator$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f38550U = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSeparator$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f38551V = C3038c0.f41188b;
        f38552W = C3036b0.f41148w;
        f38553X = C3038c0.f41194h;
        f38554Y = C3036b0.f41149x;
        f38555Z = C3038c0.f41195i;
        f38556a0 = C3038c0.f41196j;
        f38557b0 = C3038c0.f41197k;
        f38558c0 = C3036b0.f41146u;
        f38559d0 = C3038c0.f41189c;
        f38560e0 = C3036b0.f41147v;
        f38561f0 = C3038c0.f41190d;
        f38562g0 = C3038c0.f41191e;
        f38563h0 = C3038c0.f41192f;
        f38564i0 = C3038c0.f41193g;
        DivSeparator$Companion$CREATOR$1 divSeparator$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivSeparator>() { // from class: com.yandex.div2.DivSeparator$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivSeparator invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivSeparator.f38536G.m17691a(env, it);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @DivModelInternalApi
    public DivSeparator(@NotNull DivAccessibility accessibility, @Nullable DivAction divAction, @NotNull DivAnimation actionAnimation, @Nullable List<? extends DivAction> list, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> alpha, @Nullable List<? extends DivBackground> list2, @NotNull DivBorder border, @Nullable Expression<Long> expression3, @NotNull DelimiterStyle delimiterStyle, @Nullable List<? extends DivDisappearAction> list3, @Nullable List<? extends DivAction> list4, @Nullable List<? extends DivExtension> list5, @Nullable DivFocus divFocus, @NotNull DivSize height, @Nullable String str, @Nullable List<? extends DivAction> list6, @NotNull DivEdgeInsets margins, @NotNull DivEdgeInsets paddings, @Nullable Expression<Long> expression4, @Nullable List<? extends DivAction> list7, @Nullable List<? extends DivTooltip> list8, @NotNull DivTransform transform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list9, @NotNull Expression<DivVisibility> visibility, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<? extends DivVisibilityAction> list10, @NotNull DivSize width) {
        Intrinsics.m32179h(accessibility, "accessibility");
        Intrinsics.m32179h(actionAnimation, "actionAnimation");
        Intrinsics.m32179h(alpha, "alpha");
        Intrinsics.m32179h(border, "border");
        Intrinsics.m32179h(delimiterStyle, "delimiterStyle");
        Intrinsics.m32179h(height, "height");
        Intrinsics.m32179h(margins, "margins");
        Intrinsics.m32179h(paddings, "paddings");
        Intrinsics.m32179h(transform, "transform");
        Intrinsics.m32179h(visibility, "visibility");
        Intrinsics.m32179h(width, "width");
        this.f38571a = accessibility;
        this.f38572b = divAction;
        this.f38573c = actionAnimation;
        this.f38574d = list;
        this.f38575e = expression;
        this.f38576f = expression2;
        this.f38577g = alpha;
        this.f38578h = list2;
        this.f38579i = border;
        this.f38580j = expression3;
        this.f38581k = delimiterStyle;
        this.f38582l = list3;
        this.f38583m = list4;
        this.f38584n = list5;
        this.f38585o = divFocus;
        this.f38586p = height;
        this.f38587q = str;
        this.f38588r = list6;
        this.f38589s = margins;
        this.f38590t = paddings;
        this.f38591u = expression4;
        this.f38592v = list7;
        this.f38593w = list8;
        this.f38594x = transform;
        this.f38595y = divChangeTransition;
        this.f38596z = divAppearanceTransition;
        this.f38565A = divAppearanceTransition2;
        this.f38566B = list9;
        this.f38567C = visibility;
        this.f38568D = divVisibilityAction;
        this.f38569E = list10;
        this.f38570F = width;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: a, reason: from getter */
    public DivSize getF39983v() {
        return this.f38586p;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: b, reason: from getter */
    public DivTransform getF39952Q() {
        return this.f38594x;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: c */
    public List<DivVisibilityAction> mo17569c() {
        return this.f38569E;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: d */
    public List<DivBackground> mo17570d() {
        return this.f38578h;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: e, reason: from getter */
    public DivAccessibility getF39962a() {
        return this.f38571a;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: f */
    public Expression<Long> mo17572f() {
        return this.f38580j;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: g, reason: from getter */
    public DivSize getF39961Z() {
        return this.f38570F;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: getBorder, reason: from getter */
    public DivBorder getF39971j() {
        return this.f38579i;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: getId, reason: from getter */
    public String getF39984w() {
        return this.f38587q;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    public Expression<DivVisibility> getVisibility() {
        return this.f38567C;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: h, reason: from getter */
    public DivEdgeInsets getF39937B() {
        return this.f38589s;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: i */
    public Expression<Long> mo17575i() {
        return this.f38591u;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: j, reason: from getter */
    public DivEdgeInsets getF39940E() {
        return this.f38590t;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: k */
    public List<DivTransitionTrigger> mo17577k() {
        return this.f38566B;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: l */
    public List<DivAction> mo17578l() {
        return this.f38592v;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: m */
    public Expression<DivAlignmentHorizontal> mo17579m() {
        return this.f38575e;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: n */
    public List<DivExtension> mo17580n() {
        return this.f38584n;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: o */
    public List<DivTooltip> mo17581o() {
        return this.f38593w;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: p, reason: from getter */
    public DivVisibilityAction getF39959X() {
        return this.f38568D;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: q */
    public Expression<DivAlignmentVertical> mo17583q() {
        return this.f38576f;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: r, reason: from getter */
    public DivAppearanceTransition getF39954S() {
        return this.f38596z;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: s */
    public Expression<Double> mo17585s() {
        return this.f38577g;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: t, reason: from getter */
    public DivFocus getF39977p() {
        return this.f38585o;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: u, reason: from getter */
    public DivAppearanceTransition getF39955T() {
        return this.f38565A;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: v, reason: from getter */
    public DivChangeTransition getF39953R() {
        return this.f38595y;
    }

    /* compiled from: DivSeparator.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div2/DivSeparator$DelimiterStyle;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "Orientation", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class DelimiterStyle implements JSONSerializable {

        /* renamed from: c */
        @NotNull
        public static final Companion f38601c = new Companion(null);

        /* renamed from: d */
        @NotNull
        public static final Expression<Integer> f38602d;

        /* renamed from: e */
        @NotNull
        public static final Expression<Orientation> f38603e;

        /* renamed from: f */
        @NotNull
        public static final TypeHelper<Orientation> f38604f;

        /* renamed from: g */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, DelimiterStyle> f38605g;

        /* renamed from: a */
        @JvmField
        @NotNull
        public final Expression<Integer> f38606a;

        /* renamed from: b */
        @JvmField
        @NotNull
        public final Expression<Orientation> f38607b;

        /* compiled from: DivSeparator.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m31884d2 = {"Lcom/yandex/div2/DivSeparator$DelimiterStyle$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "COLOR_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div2/DivSeparator$DelimiterStyle$Orientation;", "ORIENTATION_DEFAULT_VALUE", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_ORIENTATION", "Lcom/yandex/div/internal/parser/TypeHelper;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* compiled from: DivSeparator.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivSeparator$DelimiterStyle$Orientation;", "", "Converter", "VERTICAL", "HORIZONTAL", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public enum Orientation {
            VERTICAL("vertical"),
            HORIZONTAL("horizontal");


            /* renamed from: c */
            @NotNull
            public static final Converter f38610c = new Converter(null);

            /* renamed from: d */
            @NotNull
            public static final Function1<String, Orientation> f38611d = new Function1<String, Orientation>() { // from class: com.yandex.div2.DivSeparator$DelimiterStyle$Orientation$Converter$FROM_STRING$1
                @Override // kotlin.jvm.functions.Function1
                public DivSeparator.DelimiterStyle.Orientation invoke(String str) {
                    String string = str;
                    Intrinsics.m32179h(string, "string");
                    DivSeparator.DelimiterStyle.Orientation orientation = DivSeparator.DelimiterStyle.Orientation.VERTICAL;
                    if (Intrinsics.m32174c(string, "vertical")) {
                        return orientation;
                    }
                    DivSeparator.DelimiterStyle.Orientation orientation2 = DivSeparator.DelimiterStyle.Orientation.HORIZONTAL;
                    if (Intrinsics.m32174c(string, "horizontal")) {
                        return orientation2;
                    }
                    return null;
                }
            };

            /* renamed from: b */
            @NotNull
            public final String f38615b;

            /* compiled from: DivSeparator.kt */
            @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivSeparator$DelimiterStyle$Orientation$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
            public static final class Converter {
                public Converter() {
                }

                public Converter(DefaultConstructorMarker defaultConstructorMarker) {
                }
            }

            Orientation(String str) {
                this.f38615b = str;
            }
        }

        static {
            Expression.Companion companion = Expression.f34334a;
            f38602d = companion.m17539a(335544320);
            f38603e = companion.m17539a(Orientation.HORIZONTAL);
            int i2 = TypeHelper.f33843a;
            f38604f = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(Orientation.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSeparator$DelimiterStyle$Companion$TYPE_HELPER_ORIENTATION$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivSeparator.DelimiterStyle.Orientation);
                }
            });
            f38605g = new Function2<ParsingEnvironment, JSONObject, DelimiterStyle>() { // from class: com.yandex.div2.DivSeparator$DelimiterStyle$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                public DivSeparator.DelimiterStyle invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    ParsingEnvironment env = parsingEnvironment;
                    JSONObject it = jSONObject;
                    Intrinsics.m32179h(env, "env");
                    Intrinsics.m32179h(it, "it");
                    DivSeparator.DelimiterStyle.Companion companion2 = DivSeparator.DelimiterStyle.f38601c;
                    ParsingErrorLogger f34328a = env.getF34328a();
                    Function1<Object, Integer> function1 = ParsingConvertersKt.f33827a;
                    Expression<Integer> expression = DivSeparator.DelimiterStyle.f38602d;
                    Expression<Integer> m17330v = JsonParser.m17330v(it, "color", function1, f34328a, env, expression, TypeHelpersKt.f33853f);
                    if (m17330v != null) {
                        expression = m17330v;
                    }
                    DivSeparator.DelimiterStyle.Orientation.Converter converter = DivSeparator.DelimiterStyle.Orientation.f38610c;
                    Function1<String, DivSeparator.DelimiterStyle.Orientation> function12 = DivSeparator.DelimiterStyle.Orientation.f38611d;
                    Expression<DivSeparator.DelimiterStyle.Orientation> expression2 = DivSeparator.DelimiterStyle.f38603e;
                    Expression<DivSeparator.DelimiterStyle.Orientation> m17330v2 = JsonParser.m17330v(it, "orientation", function12, f34328a, env, expression2, DivSeparator.DelimiterStyle.f38604f);
                    if (m17330v2 != null) {
                        expression2 = m17330v2;
                    }
                    return new DivSeparator.DelimiterStyle(expression, expression2);
                }
            };
        }

        /* JADX WARN: Illegal instructions before constructor call */
        @com.yandex.div.data.DivModelInternalApi
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public DelimiterStyle() {
            /*
                r2 = this;
                r0 = 0
                r1 = 3
                r2.<init>(r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.div2.DivSeparator.DelimiterStyle.<init>():void");
        }

        @DivModelInternalApi
        public DelimiterStyle(@NotNull Expression<Integer> color, @NotNull Expression<Orientation> orientation) {
            Intrinsics.m32179h(color, "color");
            Intrinsics.m32179h(orientation, "orientation");
            this.f38606a = color;
            this.f38607b = orientation;
        }

        public /* synthetic */ DelimiterStyle(Expression expression, Expression expression2, int i2) {
            this((i2 & 1) != 0 ? f38602d : null, (i2 & 2) != 0 ? f38603e : null);
        }
    }

    @DivModelInternalApi
    public DivSeparator() {
        this(f38537H, null, f38538I, null, null, null, f38539J, null, f38540K, null, f38541L, null, null, null, null, f38542M, null, null, f38543N, f38544O, null, null, null, f38545P, null, null, null, null, f38546Q, null, null, f38547R);
    }
}
