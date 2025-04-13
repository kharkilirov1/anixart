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

/* compiled from: DivCustom.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div2/DivCustom;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div2/DivBase;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivCustom implements JSONSerializable, DivBase {

    /* renamed from: D */
    @NotNull
    public static final Companion f35258D = new Companion(null);

    /* renamed from: E */
    @NotNull
    public static final DivAccessibility f35259E;

    /* renamed from: F */
    @NotNull
    public static final Expression<Double> f35260F;

    /* renamed from: G */
    @NotNull
    public static final DivBorder f35261G;

    /* renamed from: H */
    @NotNull
    public static final DivSize.WrapContent f35262H;

    /* renamed from: I */
    @NotNull
    public static final DivEdgeInsets f35263I;

    /* renamed from: J */
    @NotNull
    public static final DivEdgeInsets f35264J;

    /* renamed from: K */
    @NotNull
    public static final DivTransform f35265K;

    /* renamed from: L */
    @NotNull
    public static final Expression<DivVisibility> f35266L;

    /* renamed from: M */
    @NotNull
    public static final DivSize.MatchParent f35267M;

    /* renamed from: N */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f35268N;

    /* renamed from: O */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f35269O;

    /* renamed from: P */
    @NotNull
    public static final TypeHelper<DivVisibility> f35270P;

    /* renamed from: Q */
    @NotNull
    public static final ValueValidator<Double> f35271Q;

    /* renamed from: R */
    @NotNull
    public static final ListValidator<DivBackground> f35272R;

    /* renamed from: S */
    @NotNull
    public static final ValueValidator<Long> f35273S;

    /* renamed from: T */
    @NotNull
    public static final ListValidator<DivDisappearAction> f35274T;

    /* renamed from: U */
    @NotNull
    public static final ListValidator<DivExtension> f35275U;

    /* renamed from: V */
    @NotNull
    public static final ValueValidator<String> f35276V;

    /* renamed from: W */
    @NotNull
    public static final ListValidator<Div> f35277W;

    /* renamed from: X */
    @NotNull
    public static final ValueValidator<Long> f35278X;

    /* renamed from: Y */
    @NotNull
    public static final ListValidator<DivAction> f35279Y;

    /* renamed from: Z */
    @NotNull
    public static final ListValidator<DivTooltip> f35280Z;

    /* renamed from: a0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f35281a0;

    /* renamed from: b0 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f35282b0;

    /* renamed from: A */
    @Nullable
    public final DivVisibilityAction f35283A;

    /* renamed from: B */
    @Nullable
    public final List<DivVisibilityAction> f35284B;

    /* renamed from: C */
    @NotNull
    public final DivSize f35285C;

    /* renamed from: a */
    @NotNull
    public final DivAccessibility f35286a;

    /* renamed from: b */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f35287b;

    /* renamed from: c */
    @Nullable
    public final Expression<DivAlignmentVertical> f35288c;

    /* renamed from: d */
    @NotNull
    public final Expression<Double> f35289d;

    /* renamed from: e */
    @Nullable
    public final List<DivBackground> f35290e;

    /* renamed from: f */
    @NotNull
    public final DivBorder f35291f;

    /* renamed from: g */
    @Nullable
    public final Expression<Long> f35292g;

    /* renamed from: h */
    @JvmField
    @Nullable
    public final JSONObject f35293h;

    /* renamed from: i */
    @JvmField
    @NotNull
    public final String f35294i;

    /* renamed from: j */
    @Nullable
    public final List<DivDisappearAction> f35295j;

    /* renamed from: k */
    @Nullable
    public final List<DivExtension> f35296k;

    /* renamed from: l */
    @Nullable
    public final DivFocus f35297l;

    /* renamed from: m */
    @NotNull
    public final DivSize f35298m;

    /* renamed from: n */
    @Nullable
    public final String f35299n;

    /* renamed from: o */
    @JvmField
    @Nullable
    public final List<Div> f35300o;

    /* renamed from: p */
    @NotNull
    public final DivEdgeInsets f35301p;

    /* renamed from: q */
    @NotNull
    public final DivEdgeInsets f35302q;

    /* renamed from: r */
    @Nullable
    public final Expression<Long> f35303r;

    /* renamed from: s */
    @Nullable
    public final List<DivAction> f35304s;

    /* renamed from: t */
    @Nullable
    public final List<DivTooltip> f35305t;

    /* renamed from: u */
    @NotNull
    public final DivTransform f35306u;

    /* renamed from: v */
    @Nullable
    public final DivChangeTransition f35307v;

    /* renamed from: w */
    @Nullable
    public final DivAppearanceTransition f35308w;

    /* renamed from: x */
    @Nullable
    public final DivAppearanceTransition f35309x;

    /* renamed from: y */
    @Nullable
    public final List<DivTransitionTrigger> f35310y;

    /* renamed from: z */
    @NotNull
    public final Expression<DivVisibility> f35311z;

    /* compiled from: DivCustom.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u000bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u000bR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0010R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u000bR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u000bR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0010R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0010R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0010R\u0014\u00102\u001a\u00020\u001e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00106\u001a\b\u0012\u0004\u0012\u000205048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000208048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00107R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010\u0010R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020:0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010\bR\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006B"}, m31884d2 = {"Lcom/yandex/div2/DivCustom$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div2/Div;", "ITEMS_VALIDATOR", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "PADDINGS_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "Lcom/yandex/div2/DivAction;", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivCustom m17607a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            DivAccessibility.Companion companion = DivAccessibility.f34479f;
            DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject, "accessibility", DivAccessibility.f34486m, f34328a, parsingEnvironment);
            if (divAccessibility == null) {
                divAccessibility = DivCustom.f35259E;
            }
            DivAccessibility divAccessibility2 = divAccessibility;
            Intrinsics.m32178g(divAccessibility2, "JsonParser.readOptional(…CESSIBILITY_DEFAULT_VALUE");
            DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
            Expression m17329u = JsonParser.m17329u(jSONObject, "alignment_horizontal", DivAlignmentHorizontal.f34618d, f34328a, parsingEnvironment, DivCustom.f35268N);
            DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
            Expression m17329u2 = JsonParser.m17329u(jSONObject, "alignment_vertical", DivAlignmentVertical.f34626d, f34328a, parsingEnvironment, DivCustom.f35269O);
            Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
            ValueValidator<Double> valueValidator = DivCustom.f35271Q;
            Expression<Double> expression = DivCustom.f35260F;
            Expression<Double> m17328t = JsonParser.m17328t(jSONObject, "alpha", function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
            Expression<Double> expression2 = m17328t == null ? expression : m17328t;
            DivBackground.Companion companion2 = DivBackground.f34750a;
            List m17333y = JsonParser.m17333y(jSONObject, "background", DivBackground.f34751b, DivCustom.f35272R, f34328a, parsingEnvironment);
            DivBorder.Companion companion3 = DivBorder.f34785f;
            DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject, "border", DivBorder.f34788i, f34328a, parsingEnvironment);
            if (divBorder == null) {
                divBorder = DivCustom.f35261G;
            }
            DivBorder divBorder2 = divBorder;
            Intrinsics.m32178g(divBorder2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            Function1<Number, Long> function12 = ParsingConvertersKt.f33831e;
            ValueValidator<Long> valueValidator2 = DivCustom.f35273S;
            TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
            Expression m17327s = JsonParser.m17327s(jSONObject, "column_span", function12, valueValidator2, f34328a, parsingEnvironment, typeHelper);
            Object m17310b = JsonParser.m17310b(jSONObject, "custom_props");
            if (m17310b == null) {
                m17310b = null;
            }
            JSONObject jSONObject2 = (JSONObject) m17310b;
            Object m17310b2 = JsonParser.m17310b(jSONObject, "custom_type");
            if (m17310b2 == null) {
                throw ParsingExceptionKt.m17523h(jSONObject, "custom_type");
            }
            String str = (String) m17310b2;
            DivDisappearAction.Companion companion4 = DivDisappearAction.f35537a;
            List m17333y2 = JsonParser.m17333y(jSONObject, "disappear_actions", DivDisappearAction.f35545i, DivCustom.f35274T, f34328a, parsingEnvironment);
            DivExtension.Companion companion5 = DivExtension.f35659c;
            List m17333y3 = JsonParser.m17333y(jSONObject, "extensions", DivExtension.f35660d, DivCustom.f35275U, f34328a, parsingEnvironment);
            DivFocus.Companion companion6 = DivFocus.f35813f;
            DivFocus divFocus = (DivFocus) JsonParser.m17322n(jSONObject, "focus", DivFocus.f35818k, f34328a, parsingEnvironment);
            DivSize.Companion companion7 = DivSize.f38833a;
            Function2<ParsingEnvironment, JSONObject, DivSize> function2 = DivSize.f38834b;
            DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject, "height", function2, f34328a, parsingEnvironment);
            if (divSize == null) {
                divSize = DivCustom.f35262H;
            }
            DivSize divSize2 = divSize;
            Intrinsics.m32178g(divSize2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            String str2 = (String) JsonParser.m17323o(jSONObject, "id", DivCustom.f35276V, f34328a, parsingEnvironment);
            Div.Companion companion8 = Div.f34418a;
            List m17333y4 = JsonParser.m17333y(jSONObject, "items", Div.f34419b, DivCustom.f35277W, f34328a, parsingEnvironment);
            DivEdgeInsets.Companion companion9 = DivEdgeInsets.f35607f;
            Function2<ParsingEnvironment, JSONObject, DivEdgeInsets> function22 = DivEdgeInsets.f35618q;
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "margins", function22, f34328a, parsingEnvironment);
            if (divEdgeInsets == null) {
                divEdgeInsets = DivCustom.f35263I;
            }
            DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
            Intrinsics.m32178g(divEdgeInsets2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "paddings", function22, f34328a, parsingEnvironment);
            if (divEdgeInsets3 == null) {
                divEdgeInsets3 = DivCustom.f35264J;
            }
            DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
            Intrinsics.m32178g(divEdgeInsets4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            Expression m17327s2 = JsonParser.m17327s(jSONObject, "row_span", function12, DivCustom.f35278X, f34328a, parsingEnvironment, typeHelper);
            DivAction.Companion companion10 = DivAction.f34546g;
            List m17333y5 = JsonParser.m17333y(jSONObject, "selected_actions", DivAction.f34550k, DivCustom.f35279Y, f34328a, parsingEnvironment);
            DivTooltip.Companion companion11 = DivTooltip.f40492h;
            List m17333y6 = JsonParser.m17333y(jSONObject, "tooltips", DivTooltip.f40497m, DivCustom.f35280Z, f34328a, parsingEnvironment);
            DivTransform.Companion companion12 = DivTransform.f40551d;
            DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject, "transform", DivTransform.f40554g, f34328a, parsingEnvironment);
            if (divTransform == null) {
                divTransform = DivCustom.f35265K;
            }
            DivTransform divTransform2 = divTransform;
            Intrinsics.m32178g(divTransform2, "JsonParser.readOptional(…: TRANSFORM_DEFAULT_VALUE");
            DivChangeTransition.Companion companion13 = DivChangeTransition.f34856a;
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonParser.m17322n(jSONObject, "transition_change", DivChangeTransition.f34857b, f34328a, parsingEnvironment);
            DivAppearanceTransition.Companion companion14 = DivAppearanceTransition.f34726a;
            Function2<ParsingEnvironment, JSONObject, DivAppearanceTransition> function23 = DivAppearanceTransition.f34727b;
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonParser.m17322n(jSONObject, "transition_in", function23, f34328a, parsingEnvironment);
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonParser.m17322n(jSONObject, "transition_out", function23, f34328a, parsingEnvironment);
            DivTransitionTrigger.Converter converter3 = DivTransitionTrigger.f40582c;
            List m17332x = JsonParser.m17332x(jSONObject, "transition_triggers", DivTransitionTrigger.f40583d, DivCustom.f35281a0, f34328a, parsingEnvironment);
            DivVisibility.Converter converter4 = DivVisibility.f40930c;
            Function1<String, DivVisibility> function13 = DivVisibility.f40931d;
            Expression<DivVisibility> expression3 = DivCustom.f35266L;
            Expression<DivVisibility> m17330v = JsonParser.m17330v(jSONObject, "visibility", function13, f34328a, parsingEnvironment, expression3, DivCustom.f35270P);
            Expression<DivVisibility> expression4 = m17330v == null ? expression3 : m17330v;
            DivVisibilityAction.Companion companion15 = DivVisibilityAction.f40938i;
            Function2<ParsingEnvironment, JSONObject, DivVisibilityAction> function24 = DivVisibilityAction.f40946q;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonParser.m17322n(jSONObject, "visibility_action", function24, f34328a, parsingEnvironment);
            List m17333y7 = JsonParser.m17333y(jSONObject, "visibility_actions", function24, DivCustom.f35282b0, f34328a, parsingEnvironment);
            DivSize divSize3 = (DivSize) JsonParser.m17322n(jSONObject, "width", function2, f34328a, parsingEnvironment);
            if (divSize3 == null) {
                divSize3 = DivCustom.f35267M;
            }
            Intrinsics.m32178g(divSize3, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new DivCustom(divAccessibility2, m17329u, m17329u2, expression2, m17333y, divBorder2, m17327s, jSONObject2, str, m17333y2, m17333y3, divFocus, divSize2, str2, m17333y4, divEdgeInsets2, divEdgeInsets4, m17327s2, m17333y5, m17333y6, divTransform2, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17332x, expression4, divVisibilityAction, m17333y7, divSize3);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression expression = null;
        Expression expression2 = null;
        f35259E = new DivAccessibility(null, expression, null, expression2, null, null, 63);
        Expression.Companion companion = Expression.f34334a;
        f35260F = companion.m17539a(Double.valueOf(1.0d));
        f35261G = new DivBorder(expression, 0 == true ? 1 : 0, expression2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31);
        int i2 = 7;
        f35262H = new DivSize.WrapContent(new DivWrapContentSize(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i2));
        f35263I = new DivEdgeInsets(expression2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, null, 31);
        f35264J = new DivEdgeInsets(null, null, null, null, null, 31);
        f35265K = new DivTransform(0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i2);
        f35266L = companion.m17539a(DivVisibility.VISIBLE);
        f35267M = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i3 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f35268N = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivCustom$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f35269O = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivCustom$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f35270P = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivCustom$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f35271Q = C3045g.f41369c;
        f35272R = C3041e.f41288x;
        f35273S = C3045g.f41370d;
        f35274T = C3041e.f41289y;
        f35275U = C3041e.f41290z;
        f35276V = C3045g.f41371e;
        f35277W = C3041e.f41261A;
        f35278X = C3043f.f41344x;
        f35279Y = C3041e.f41284t;
        f35280Z = C3041e.f41285u;
        f35281a0 = C3041e.f41286v;
        f35282b0 = C3041e.f41287w;
        DivCustom$Companion$CREATOR$1 divCustom$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivCustom>() { // from class: com.yandex.div2.DivCustom$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivCustom invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivCustom.f35258D.m17607a(env, it);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @DivModelInternalApi
    public DivCustom(@NotNull DivAccessibility accessibility, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> alpha, @Nullable List<? extends DivBackground> list, @NotNull DivBorder border, @Nullable Expression<Long> expression3, @Nullable JSONObject jSONObject, @NotNull String customType, @Nullable List<? extends DivDisappearAction> list2, @Nullable List<? extends DivExtension> list3, @Nullable DivFocus divFocus, @NotNull DivSize height, @Nullable String str, @Nullable List<? extends Div> list4, @NotNull DivEdgeInsets margins, @NotNull DivEdgeInsets paddings, @Nullable Expression<Long> expression4, @Nullable List<? extends DivAction> list5, @Nullable List<? extends DivTooltip> list6, @NotNull DivTransform transform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list7, @NotNull Expression<DivVisibility> visibility, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<? extends DivVisibilityAction> list8, @NotNull DivSize width) {
        Intrinsics.m32179h(accessibility, "accessibility");
        Intrinsics.m32179h(alpha, "alpha");
        Intrinsics.m32179h(border, "border");
        Intrinsics.m32179h(customType, "customType");
        Intrinsics.m32179h(height, "height");
        Intrinsics.m32179h(margins, "margins");
        Intrinsics.m32179h(paddings, "paddings");
        Intrinsics.m32179h(transform, "transform");
        Intrinsics.m32179h(visibility, "visibility");
        Intrinsics.m32179h(width, "width");
        this.f35286a = accessibility;
        this.f35287b = expression;
        this.f35288c = expression2;
        this.f35289d = alpha;
        this.f35290e = list;
        this.f35291f = border;
        this.f35292g = expression3;
        this.f35293h = jSONObject;
        this.f35294i = customType;
        this.f35295j = list2;
        this.f35296k = list3;
        this.f35297l = divFocus;
        this.f35298m = height;
        this.f35299n = str;
        this.f35300o = list4;
        this.f35301p = margins;
        this.f35302q = paddings;
        this.f35303r = expression4;
        this.f35304s = list5;
        this.f35305t = list6;
        this.f35306u = transform;
        this.f35307v = divChangeTransition;
        this.f35308w = divAppearanceTransition;
        this.f35309x = divAppearanceTransition2;
        this.f35310y = list7;
        this.f35311z = visibility;
        this.f35283A = divVisibilityAction;
        this.f35284B = list8;
        this.f35285C = width;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: a, reason: from getter */
    public DivSize getF39236m() {
        return this.f35298m;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: b, reason: from getter */
    public DivTransform getF39244u() {
        return this.f35306u;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: c */
    public List<DivVisibilityAction> mo17569c() {
        return this.f35284B;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: d */
    public List<DivBackground> mo17570d() {
        return this.f35290e;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: e, reason: from getter */
    public DivAccessibility getF39224a() {
        return this.f35286a;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: f */
    public Expression<Long> mo17572f() {
        return this.f35292g;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: g, reason: from getter */
    public DivSize getF39223D() {
        return this.f35285C;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: getBorder, reason: from getter */
    public DivBorder getF39229f() {
        return this.f35291f;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: getId, reason: from getter */
    public String getF39237n() {
        return this.f35299n;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    public Expression<DivVisibility> getVisibility() {
        return this.f35311z;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: h, reason: from getter */
    public DivEdgeInsets getF39238o() {
        return this.f35301p;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: i */
    public Expression<Long> mo17575i() {
        return this.f35303r;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: j, reason: from getter */
    public DivEdgeInsets getF39239p() {
        return this.f35302q;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: k */
    public List<DivTransitionTrigger> mo17577k() {
        return this.f35310y;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: l */
    public List<DivAction> mo17578l() {
        return this.f35304s;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: m */
    public Expression<DivAlignmentHorizontal> mo17579m() {
        return this.f35287b;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: n */
    public List<DivExtension> mo17580n() {
        return this.f35296k;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: o */
    public List<DivTooltip> mo17581o() {
        return this.f35305t;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: p, reason: from getter */
    public DivVisibilityAction getF39221B() {
        return this.f35283A;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: q */
    public Expression<DivAlignmentVertical> mo17583q() {
        return this.f35288c;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: r, reason: from getter */
    public DivAppearanceTransition getF39247x() {
        return this.f35308w;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: s */
    public Expression<Double> mo17585s() {
        return this.f35289d;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: t, reason: from getter */
    public DivFocus getF39235l() {
        return this.f35297l;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: u, reason: from getter */
    public DivAppearanceTransition getF39248y() {
        return this.f35309x;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: v, reason: from getter */
    public DivChangeTransition getF39246w() {
        return this.f35307v;
    }
}
