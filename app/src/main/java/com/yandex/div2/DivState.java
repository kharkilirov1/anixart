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
import com.yandex.div.json.ParsingExceptionKt;
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
import com.yandex.div2.DivState;
import com.yandex.div2.DivTooltip;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivTransitionSelector;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
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

/* compiled from: DivState.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivState;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div2/DivBase;", "Companion", "State", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivState implements JSONSerializable, DivBase {

    /* renamed from: E */
    @NotNull
    public static final Companion f39193E = new Companion(null);

    /* renamed from: F */
    @NotNull
    public static final DivAccessibility f39194F;

    /* renamed from: G */
    @NotNull
    public static final Expression<Double> f39195G;

    /* renamed from: H */
    @NotNull
    public static final DivBorder f39196H;

    /* renamed from: I */
    @NotNull
    public static final DivSize.WrapContent f39197I;

    /* renamed from: J */
    @NotNull
    public static final DivEdgeInsets f39198J;

    /* renamed from: K */
    @NotNull
    public static final DivEdgeInsets f39199K;

    /* renamed from: L */
    @NotNull
    public static final DivTransform f39200L;

    /* renamed from: M */
    @NotNull
    public static final Expression<DivTransitionSelector> f39201M;

    /* renamed from: N */
    @NotNull
    public static final Expression<DivVisibility> f39202N;

    /* renamed from: O */
    @NotNull
    public static final DivSize.MatchParent f39203O;

    /* renamed from: P */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f39204P;

    /* renamed from: Q */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f39205Q;

    /* renamed from: R */
    @NotNull
    public static final TypeHelper<DivTransitionSelector> f39206R;

    /* renamed from: S */
    @NotNull
    public static final TypeHelper<DivVisibility> f39207S;

    /* renamed from: T */
    @NotNull
    public static final ValueValidator<Double> f39208T;

    /* renamed from: U */
    @NotNull
    public static final ListValidator<DivBackground> f39209U;

    /* renamed from: V */
    @NotNull
    public static final ValueValidator<Long> f39210V;

    /* renamed from: W */
    @NotNull
    public static final ListValidator<DivDisappearAction> f39211W;

    /* renamed from: X */
    @NotNull
    public static final ListValidator<DivExtension> f39212X;

    /* renamed from: Y */
    @NotNull
    public static final ValueValidator<String> f39213Y;

    /* renamed from: Z */
    @NotNull
    public static final ValueValidator<Long> f39214Z;

    /* renamed from: a0 */
    @NotNull
    public static final ListValidator<DivAction> f39215a0;

    /* renamed from: b0 */
    @NotNull
    public static final ListValidator<State> f39216b0;

    /* renamed from: c0 */
    @NotNull
    public static final ListValidator<DivTooltip> f39217c0;

    /* renamed from: d0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f39218d0;

    /* renamed from: e0 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f39219e0;

    /* renamed from: A */
    @NotNull
    public final Expression<DivVisibility> f39220A;

    /* renamed from: B */
    @Nullable
    public final DivVisibilityAction f39221B;

    /* renamed from: C */
    @Nullable
    public final List<DivVisibilityAction> f39222C;

    /* renamed from: D */
    @NotNull
    public final DivSize f39223D;

    /* renamed from: a */
    @NotNull
    public final DivAccessibility f39224a;

    /* renamed from: b */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f39225b;

    /* renamed from: c */
    @Nullable
    public final Expression<DivAlignmentVertical> f39226c;

    /* renamed from: d */
    @NotNull
    public final Expression<Double> f39227d;

    /* renamed from: e */
    @Nullable
    public final List<DivBackground> f39228e;

    /* renamed from: f */
    @NotNull
    public final DivBorder f39229f;

    /* renamed from: g */
    @Nullable
    public final Expression<Long> f39230g;

    /* renamed from: h */
    @JvmField
    @Nullable
    public final Expression<String> f39231h;

    /* renamed from: i */
    @Nullable
    public final List<DivDisappearAction> f39232i;

    /* renamed from: j */
    @JvmField
    @Nullable
    public final String f39233j;

    /* renamed from: k */
    @Nullable
    public final List<DivExtension> f39234k;

    /* renamed from: l */
    @Nullable
    public final DivFocus f39235l;

    /* renamed from: m */
    @NotNull
    public final DivSize f39236m;

    /* renamed from: n */
    @Nullable
    public final String f39237n;

    /* renamed from: o */
    @NotNull
    public final DivEdgeInsets f39238o;

    /* renamed from: p */
    @NotNull
    public final DivEdgeInsets f39239p;

    /* renamed from: q */
    @Nullable
    public final Expression<Long> f39240q;

    /* renamed from: r */
    @Nullable
    public final List<DivAction> f39241r;

    /* renamed from: s */
    @JvmField
    @NotNull
    public final List<State> f39242s;

    /* renamed from: t */
    @Nullable
    public final List<DivTooltip> f39243t;

    /* renamed from: u */
    @NotNull
    public final DivTransform f39244u;

    /* renamed from: v */
    @JvmField
    @NotNull
    public final Expression<DivTransitionSelector> f39245v;

    /* renamed from: w */
    @Nullable
    public final DivChangeTransition f39246w;

    /* renamed from: x */
    @Nullable
    public final DivAppearanceTransition f39247x;

    /* renamed from: y */
    @Nullable
    public final DivAppearanceTransition f39248y;

    /* renamed from: z */
    @Nullable
    public final List<DivTransitionTrigger> f39249z;

    /* compiled from: DivState.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u000bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u000bR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u000bR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u000bR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0010R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0010R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0010R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\bR\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0010R\u0014\u00104\u001a\u00020\u001e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000207068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00109R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u000200068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00109R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00109R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\u0010R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020=0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010\bR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006E"}, m31884d2 = {"Lcom/yandex/div2/DivState$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "PADDINGS_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "Lcom/yandex/div2/DivAction;", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivState$State;", "STATES_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionSelector;", "TRANSITION_ANIMATION_SELECTOR_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "TYPE_HELPER_TRANSITION_ANIMATION_SELECTOR", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivState m17707a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            DivAccessibility.Companion companion = DivAccessibility.f34479f;
            DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject, "accessibility", DivAccessibility.f34486m, f34328a, parsingEnvironment);
            if (divAccessibility == null) {
                divAccessibility = DivState.f39194F;
            }
            DivAccessibility divAccessibility2 = divAccessibility;
            Intrinsics.m32178g(divAccessibility2, "JsonParser.readOptional(…CESSIBILITY_DEFAULT_VALUE");
            DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
            Expression m17329u = JsonParser.m17329u(jSONObject, "alignment_horizontal", DivAlignmentHorizontal.f34618d, f34328a, parsingEnvironment, DivState.f39204P);
            DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
            Expression m17329u2 = JsonParser.m17329u(jSONObject, "alignment_vertical", DivAlignmentVertical.f34626d, f34328a, parsingEnvironment, DivState.f39205Q);
            Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
            ValueValidator<Double> valueValidator = DivState.f39208T;
            Expression<Double> expression = DivState.f39195G;
            Expression<Double> m17328t = JsonParser.m17328t(jSONObject, "alpha", function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
            Expression<Double> expression2 = m17328t == null ? expression : m17328t;
            DivBackground.Companion companion2 = DivBackground.f34750a;
            List m17333y = JsonParser.m17333y(jSONObject, "background", DivBackground.f34751b, DivState.f39209U, f34328a, parsingEnvironment);
            DivBorder.Companion companion3 = DivBorder.f34785f;
            DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject, "border", DivBorder.f34788i, f34328a, parsingEnvironment);
            if (divBorder == null) {
                divBorder = DivState.f39196H;
            }
            DivBorder divBorder2 = divBorder;
            Intrinsics.m32178g(divBorder2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            Function1<Number, Long> function12 = ParsingConvertersKt.f33831e;
            ValueValidator<Long> valueValidator2 = DivState.f39210V;
            TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
            Expression m17327s = JsonParser.m17327s(jSONObject, "column_span", function12, valueValidator2, f34328a, parsingEnvironment, typeHelper);
            Expression<String> m17326r = JsonParser.m17326r(jSONObject, "default_state_id", f34328a, parsingEnvironment, TypeHelpersKt.f33850c);
            DivDisappearAction.Companion companion4 = DivDisappearAction.f35537a;
            List m17333y2 = JsonParser.m17333y(jSONObject, "disappear_actions", DivDisappearAction.f35545i, DivState.f39211W, f34328a, parsingEnvironment);
            Object m17310b = JsonParser.m17310b(jSONObject, "div_id");
            if (m17310b == null) {
                m17310b = null;
            }
            String str = (String) m17310b;
            DivExtension.Companion companion5 = DivExtension.f35659c;
            List m17333y3 = JsonParser.m17333y(jSONObject, "extensions", DivExtension.f35660d, DivState.f39212X, f34328a, parsingEnvironment);
            DivFocus.Companion companion6 = DivFocus.f35813f;
            DivFocus divFocus = (DivFocus) JsonParser.m17322n(jSONObject, "focus", DivFocus.f35818k, f34328a, parsingEnvironment);
            DivSize.Companion companion7 = DivSize.f38833a;
            Function2<ParsingEnvironment, JSONObject, DivSize> function2 = DivSize.f38834b;
            DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject, "height", function2, f34328a, parsingEnvironment);
            if (divSize == null) {
                divSize = DivState.f39197I;
            }
            DivSize divSize2 = divSize;
            Intrinsics.m32178g(divSize2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            String str2 = (String) JsonParser.m17323o(jSONObject, "id", DivState.f39213Y, f34328a, parsingEnvironment);
            DivEdgeInsets.Companion companion8 = DivEdgeInsets.f35607f;
            Function2<ParsingEnvironment, JSONObject, DivEdgeInsets> function22 = DivEdgeInsets.f35618q;
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "margins", function22, f34328a, parsingEnvironment);
            if (divEdgeInsets == null) {
                divEdgeInsets = DivState.f39198J;
            }
            DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
            Intrinsics.m32178g(divEdgeInsets2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "paddings", function22, f34328a, parsingEnvironment);
            if (divEdgeInsets3 == null) {
                divEdgeInsets3 = DivState.f39199K;
            }
            DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
            Intrinsics.m32178g(divEdgeInsets4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            Expression m17327s2 = JsonParser.m17327s(jSONObject, "row_span", function12, DivState.f39214Z, f34328a, parsingEnvironment, typeHelper);
            DivAction.Companion companion9 = DivAction.f34546g;
            List m17333y4 = JsonParser.m17333y(jSONObject, "selected_actions", DivAction.f34550k, DivState.f39215a0, f34328a, parsingEnvironment);
            State.Companion companion10 = State.f39255f;
            List m17321m = JsonParser.m17321m(jSONObject, "states", State.f39256g, DivState.f39216b0, f34328a, parsingEnvironment);
            Intrinsics.m32178g(m17321m, "readList(json, \"states\",…S_VALIDATOR, logger, env)");
            DivTooltip.Companion companion11 = DivTooltip.f40492h;
            List m17333y5 = JsonParser.m17333y(jSONObject, "tooltips", DivTooltip.f40497m, DivState.f39217c0, f34328a, parsingEnvironment);
            DivTransform.Companion companion12 = DivTransform.f40551d;
            DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject, "transform", DivTransform.f40554g, f34328a, parsingEnvironment);
            if (divTransform == null) {
                divTransform = DivState.f39200L;
            }
            DivTransform divTransform2 = divTransform;
            Intrinsics.m32178g(divTransform2, "JsonParser.readOptional(…: TRANSFORM_DEFAULT_VALUE");
            DivTransitionSelector.Converter converter3 = DivTransitionSelector.f40573c;
            Function1<String, DivTransitionSelector> function13 = DivTransitionSelector.f40574d;
            Expression<DivTransitionSelector> expression3 = DivState.f39201M;
            Expression<DivTransitionSelector> m17330v = JsonParser.m17330v(jSONObject, "transition_animation_selector", function13, f34328a, parsingEnvironment, expression3, DivState.f39206R);
            Expression<DivTransitionSelector> expression4 = m17330v == null ? expression3 : m17330v;
            DivChangeTransition.Companion companion13 = DivChangeTransition.f34856a;
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonParser.m17322n(jSONObject, "transition_change", DivChangeTransition.f34857b, f34328a, parsingEnvironment);
            DivAppearanceTransition.Companion companion14 = DivAppearanceTransition.f34726a;
            Function2<ParsingEnvironment, JSONObject, DivAppearanceTransition> function23 = DivAppearanceTransition.f34727b;
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonParser.m17322n(jSONObject, "transition_in", function23, f34328a, parsingEnvironment);
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonParser.m17322n(jSONObject, "transition_out", function23, f34328a, parsingEnvironment);
            DivTransitionTrigger.Converter converter4 = DivTransitionTrigger.f40582c;
            List m17332x = JsonParser.m17332x(jSONObject, "transition_triggers", DivTransitionTrigger.f40583d, DivState.f39218d0, f34328a, parsingEnvironment);
            DivVisibility.Converter converter5 = DivVisibility.f40930c;
            Function1<String, DivVisibility> function14 = DivVisibility.f40931d;
            Expression<DivVisibility> expression5 = DivState.f39202N;
            Expression<DivVisibility> m17330v2 = JsonParser.m17330v(jSONObject, "visibility", function14, f34328a, parsingEnvironment, expression5, DivState.f39207S);
            Expression<DivVisibility> expression6 = m17330v2 == null ? expression5 : m17330v2;
            DivVisibilityAction.Companion companion15 = DivVisibilityAction.f40938i;
            Function2<ParsingEnvironment, JSONObject, DivVisibilityAction> function24 = DivVisibilityAction.f40946q;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonParser.m17322n(jSONObject, "visibility_action", function24, f34328a, parsingEnvironment);
            List m17333y6 = JsonParser.m17333y(jSONObject, "visibility_actions", function24, DivState.f39219e0, f34328a, parsingEnvironment);
            DivSize divSize3 = (DivSize) JsonParser.m17322n(jSONObject, "width", function2, f34328a, parsingEnvironment);
            if (divSize3 == null) {
                divSize3 = DivState.f39203O;
            }
            Intrinsics.m32178g(divSize3, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new DivState(divAccessibility2, m17329u, m17329u2, expression2, m17333y, divBorder2, m17327s, m17326r, m17333y2, str, m17333y3, divFocus, divSize2, str2, divEdgeInsets2, divEdgeInsets4, m17327s2, m17333y4, m17321m, m17333y5, divTransform2, expression4, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17332x, expression6, divVisibilityAction, m17333y6, divSize3);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivState.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivState$State;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class State implements JSONSerializable {

        /* renamed from: f */
        @NotNull
        public static final Companion f39255f = new Companion(null);

        /* renamed from: g */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, State> f39256g = new Function2<ParsingEnvironment, JSONObject, State>() { // from class: com.yandex.div2.DivState$State$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivState.State invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                DivState.State.Companion companion = DivState.State.f39255f;
                ParsingErrorLogger f34328a = env.getF34328a();
                DivAnimation.Companion companion2 = DivAnimation.f34634h;
                Function2<ParsingEnvironment, JSONObject, DivAnimation> function2 = DivAnimation.f34644r;
                DivAnimation divAnimation = (DivAnimation) JsonParser.m17322n(it, "animation_in", function2, f34328a, env);
                DivAnimation divAnimation2 = (DivAnimation) JsonParser.m17322n(it, "animation_out", function2, f34328a, env);
                Div.Companion companion3 = Div.f34418a;
                Div div = (Div) JsonParser.m17322n(it, "div", Div.f34419b, f34328a, env);
                Object m17310b = JsonParser.m17310b(it, "state_id");
                if (m17310b == null) {
                    throw ParsingExceptionKt.m17523h(it, "state_id");
                }
                DivAction.Companion companion4 = DivAction.f34546g;
                Function2<ParsingEnvironment, JSONObject, DivAction> function22 = DivAction.f34550k;
                DivState.State.Companion companion5 = DivState.State.f39255f;
                return new DivState.State(divAnimation, divAnimation2, div, (String) m17310b, JsonParser.m17333y(it, "swipe_out_actions", function22, C3042e0.f41296E, f34328a, env));
            }
        };

        /* renamed from: a */
        @JvmField
        @Nullable
        public final DivAnimation f39257a;

        /* renamed from: b */
        @JvmField
        @Nullable
        public final DivAnimation f39258b;

        /* renamed from: c */
        @JvmField
        @Nullable
        public final Div f39259c;

        /* renamed from: d */
        @JvmField
        @NotNull
        public final String f39260d;

        /* renamed from: e */
        @JvmField
        @Nullable
        public final List<DivAction> f39261e;

        /* compiled from: DivState.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div2/DivState$State$Companion;", "", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAction;", "SWIPE_OUT_ACTIONS_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @DivModelInternalApi
        public State(@Nullable DivAnimation divAnimation, @Nullable DivAnimation divAnimation2, @Nullable Div div, @NotNull String stateId, @Nullable List<? extends DivAction> list) {
            Intrinsics.m32179h(stateId, "stateId");
            this.f39257a = divAnimation;
            this.f39258b = divAnimation2;
            this.f39259c = div;
            this.f39260d = stateId;
            this.f39261e = list;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression expression = null;
        Expression expression2 = null;
        f39194F = new DivAccessibility(null, expression, null, expression2, null, null, 63);
        Expression.Companion companion = Expression.f34334a;
        f39195G = companion.m17539a(Double.valueOf(1.0d));
        f39196H = new DivBorder(expression, 0 == true ? 1 : 0, expression2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31);
        int i2 = 7;
        f39197I = new DivSize.WrapContent(new DivWrapContentSize(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i2));
        f39198J = new DivEdgeInsets(expression2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, null, 31);
        f39199K = new DivEdgeInsets(null, null, null, null, null, 31);
        f39200L = new DivTransform(0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i2);
        f39201M = companion.m17539a(DivTransitionSelector.STATE_CHANGE);
        f39202N = companion.m17539a(DivVisibility.VISIBLE);
        f39203O = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i3 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f39204P = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivState$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f39205Q = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivState$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f39206R = companion2.m17372a(ArraysKt.m31926B(DivTransitionSelector.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivState$Companion$TYPE_HELPER_TRANSITION_ANIMATION_SELECTOR$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivTransitionSelector);
            }
        });
        f39207S = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivState$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f39208T = C3044f0.f41364u;
        f39209U = C3042e0.f41293B;
        f39210V = C3044f0.f41365v;
        f39211W = C3042e0.f41294C;
        f39212X = C3042e0.f41295D;
        f39213Y = C3044f0.f41366w;
        f39214Z = C3044f0.f41363t;
        f39215a0 = C3042e0.f41318w;
        f39216b0 = C3042e0.f41319x;
        f39217c0 = C3042e0.f41320y;
        f39218d0 = C3042e0.f41321z;
        f39219e0 = C3042e0.f41292A;
        DivState$Companion$CREATOR$1 divState$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivState>() { // from class: com.yandex.div2.DivState$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivState invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivState.f39193E.m17707a(env, it);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @DivModelInternalApi
    public DivState(@NotNull DivAccessibility accessibility, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> alpha, @Nullable List<? extends DivBackground> list, @NotNull DivBorder border, @Nullable Expression<Long> expression3, @Nullable Expression<String> expression4, @Nullable List<? extends DivDisappearAction> list2, @Nullable String str, @Nullable List<? extends DivExtension> list3, @Nullable DivFocus divFocus, @NotNull DivSize height, @Nullable String str2, @NotNull DivEdgeInsets margins, @NotNull DivEdgeInsets paddings, @Nullable Expression<Long> expression5, @Nullable List<? extends DivAction> list4, @NotNull List<? extends State> states, @Nullable List<? extends DivTooltip> list5, @NotNull DivTransform transform, @NotNull Expression<DivTransitionSelector> transitionAnimationSelector, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list6, @NotNull Expression<DivVisibility> visibility, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<? extends DivVisibilityAction> list7, @NotNull DivSize width) {
        Intrinsics.m32179h(accessibility, "accessibility");
        Intrinsics.m32179h(alpha, "alpha");
        Intrinsics.m32179h(border, "border");
        Intrinsics.m32179h(height, "height");
        Intrinsics.m32179h(margins, "margins");
        Intrinsics.m32179h(paddings, "paddings");
        Intrinsics.m32179h(states, "states");
        Intrinsics.m32179h(transform, "transform");
        Intrinsics.m32179h(transitionAnimationSelector, "transitionAnimationSelector");
        Intrinsics.m32179h(visibility, "visibility");
        Intrinsics.m32179h(width, "width");
        this.f39224a = accessibility;
        this.f39225b = expression;
        this.f39226c = expression2;
        this.f39227d = alpha;
        this.f39228e = list;
        this.f39229f = border;
        this.f39230g = expression3;
        this.f39231h = expression4;
        this.f39232i = list2;
        this.f39233j = str;
        this.f39234k = list3;
        this.f39235l = divFocus;
        this.f39236m = height;
        this.f39237n = str2;
        this.f39238o = margins;
        this.f39239p = paddings;
        this.f39240q = expression5;
        this.f39241r = list4;
        this.f39242s = states;
        this.f39243t = list5;
        this.f39244u = transform;
        this.f39245v = transitionAnimationSelector;
        this.f39246w = divChangeTransition;
        this.f39247x = divAppearanceTransition;
        this.f39248y = divAppearanceTransition2;
        this.f39249z = list6;
        this.f39220A = visibility;
        this.f39221B = divVisibilityAction;
        this.f39222C = list7;
        this.f39223D = width;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: a, reason: from getter */
    public DivSize getF36228s() {
        return this.f39236m;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: b, reason: from getter */
    public DivTransform getF36201E() {
        return this.f39244u;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: c */
    public List<DivVisibilityAction> mo17569c() {
        return this.f39222C;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: d */
    public List<DivBackground> mo17570d() {
        return this.f39228e;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: e, reason: from getter */
    public DivAccessibility getF36210a() {
        return this.f39224a;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: f */
    public Expression<Long> mo17572f() {
        return this.f39230g;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: g, reason: from getter */
    public DivSize getF36209M() {
        return this.f39223D;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: getBorder, reason: from getter */
    public DivBorder getF36219j() {
        return this.f39229f;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: getId, reason: from getter */
    public String getF36229t() {
        return this.f39237n;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    public Expression<DivVisibility> getVisibility() {
        return this.f39220A;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: h, reason: from getter */
    public DivEdgeInsets getF36231v() {
        return this.f39238o;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: i */
    public Expression<Long> mo17575i() {
        return this.f39240q;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: j, reason: from getter */
    public DivEdgeInsets getF36232w() {
        return this.f39239p;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: k */
    public List<DivTransitionTrigger> mo17577k() {
        return this.f39249z;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: l */
    public List<DivAction> mo17578l() {
        return this.f39241r;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: m */
    public Expression<DivAlignmentHorizontal> mo17579m() {
        return this.f39225b;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: n */
    public List<DivExtension> mo17580n() {
        return this.f39234k;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: o */
    public List<DivTooltip> mo17581o() {
        return this.f39243t;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: p, reason: from getter */
    public DivVisibilityAction getF36207K() {
        return this.f39221B;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: q */
    public Expression<DivAlignmentVertical> mo17583q() {
        return this.f39226c;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: r, reason: from getter */
    public DivAppearanceTransition getF36203G() {
        return this.f39247x;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: s */
    public Expression<Double> mo17585s() {
        return this.f39227d;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: t, reason: from getter */
    public DivFocus getF36226q() {
        return this.f39235l;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: u, reason: from getter */
    public DivAppearanceTransition getF36204H() {
        return this.f39248y;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: v, reason: from getter */
    public DivChangeTransition getF36202F() {
        return this.f39246w;
    }
}
