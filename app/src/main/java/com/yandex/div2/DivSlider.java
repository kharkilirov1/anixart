package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.C2904b;
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
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivChangeTransition;
import com.yandex.div2.DivDisappearAction;
import com.yandex.div2.DivDrawable;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivExtension;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivPoint;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivSlider;
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

/* compiled from: DivSlider.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivSlider;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div2/DivBase;", "Companion", "TextStyle", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivSlider implements JSONSerializable, DivBase {

    /* renamed from: M */
    @NotNull
    public static final Companion f38908M = new Companion(null);

    /* renamed from: N */
    @NotNull
    public static final DivAccessibility f38909N;

    /* renamed from: O */
    @NotNull
    public static final Expression<Double> f38910O;

    /* renamed from: P */
    @NotNull
    public static final DivBorder f38911P;

    /* renamed from: Q */
    @NotNull
    public static final DivSize.WrapContent f38912Q;

    /* renamed from: R */
    @NotNull
    public static final DivEdgeInsets f38913R;

    /* renamed from: S */
    @NotNull
    public static final Expression<Long> f38914S;

    /* renamed from: T */
    @NotNull
    public static final Expression<Long> f38915T;

    /* renamed from: U */
    @NotNull
    public static final DivEdgeInsets f38916U;

    /* renamed from: V */
    @NotNull
    public static final DivAccessibility f38917V;

    /* renamed from: W */
    @NotNull
    public static final DivTransform f38918W;

    /* renamed from: X */
    @NotNull
    public static final Expression<DivVisibility> f38919X;

    /* renamed from: Y */
    @NotNull
    public static final DivSize.MatchParent f38920Y;

    /* renamed from: Z */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f38921Z;

    /* renamed from: a0 */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f38922a0;

    /* renamed from: b0 */
    @NotNull
    public static final TypeHelper<DivVisibility> f38923b0;

    /* renamed from: c0 */
    @NotNull
    public static final ValueValidator<Double> f38924c0;

    /* renamed from: d0 */
    @NotNull
    public static final ListValidator<DivBackground> f38925d0;

    /* renamed from: e0 */
    @NotNull
    public static final ValueValidator<Long> f38926e0;

    /* renamed from: f0 */
    @NotNull
    public static final ListValidator<DivDisappearAction> f38927f0;

    /* renamed from: g0 */
    @NotNull
    public static final ListValidator<DivExtension> f38928g0;

    /* renamed from: h0 */
    @NotNull
    public static final ValueValidator<String> f38929h0;

    /* renamed from: i0 */
    @NotNull
    public static final ValueValidator<Long> f38930i0;

    /* renamed from: j0 */
    @NotNull
    public static final ListValidator<DivAction> f38931j0;

    /* renamed from: k0 */
    @NotNull
    public static final ValueValidator<String> f38932k0;

    /* renamed from: l0 */
    @NotNull
    public static final ValueValidator<String> f38933l0;

    /* renamed from: m0 */
    @NotNull
    public static final ListValidator<DivTooltip> f38934m0;

    /* renamed from: n0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f38935n0;

    /* renamed from: o0 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f38936o0;

    /* renamed from: A */
    @Nullable
    public final List<DivTooltip> f38937A;

    /* renamed from: B */
    @JvmField
    @NotNull
    public final DivDrawable f38938B;

    /* renamed from: C */
    @JvmField
    @NotNull
    public final DivDrawable f38939C;

    /* renamed from: D */
    @NotNull
    public final DivTransform f38940D;

    /* renamed from: E */
    @Nullable
    public final DivChangeTransition f38941E;

    /* renamed from: F */
    @Nullable
    public final DivAppearanceTransition f38942F;

    /* renamed from: G */
    @Nullable
    public final DivAppearanceTransition f38943G;

    /* renamed from: H */
    @Nullable
    public final List<DivTransitionTrigger> f38944H;

    /* renamed from: I */
    @NotNull
    public final Expression<DivVisibility> f38945I;

    /* renamed from: J */
    @Nullable
    public final DivVisibilityAction f38946J;

    /* renamed from: K */
    @Nullable
    public final List<DivVisibilityAction> f38947K;

    /* renamed from: L */
    @NotNull
    public final DivSize f38948L;

    /* renamed from: a */
    @NotNull
    public final DivAccessibility f38949a;

    /* renamed from: b */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f38950b;

    /* renamed from: c */
    @Nullable
    public final Expression<DivAlignmentVertical> f38951c;

    /* renamed from: d */
    @NotNull
    public final Expression<Double> f38952d;

    /* renamed from: e */
    @Nullable
    public final List<DivBackground> f38953e;

    /* renamed from: f */
    @NotNull
    public final DivBorder f38954f;

    /* renamed from: g */
    @Nullable
    public final Expression<Long> f38955g;

    /* renamed from: h */
    @Nullable
    public final List<DivDisappearAction> f38956h;

    /* renamed from: i */
    @Nullable
    public final List<DivExtension> f38957i;

    /* renamed from: j */
    @Nullable
    public final DivFocus f38958j;

    /* renamed from: k */
    @NotNull
    public final DivSize f38959k;

    /* renamed from: l */
    @Nullable
    public final String f38960l;

    /* renamed from: m */
    @NotNull
    public final DivEdgeInsets f38961m;

    /* renamed from: n */
    @JvmField
    @NotNull
    public final Expression<Long> f38962n;

    /* renamed from: o */
    @JvmField
    @NotNull
    public final Expression<Long> f38963o;

    /* renamed from: p */
    @NotNull
    public final DivEdgeInsets f38964p;

    /* renamed from: q */
    @Nullable
    public final Expression<Long> f38965q;

    /* renamed from: r */
    @Nullable
    public final List<DivAction> f38966r;

    /* renamed from: s */
    @JvmField
    @Nullable
    public final DivDrawable f38967s;

    /* renamed from: t */
    @JvmField
    @Nullable
    public final TextStyle f38968t;

    /* renamed from: u */
    @JvmField
    @Nullable
    public final String f38969u;

    /* renamed from: v */
    @JvmField
    @NotNull
    public final DivDrawable f38970v;

    /* renamed from: w */
    @JvmField
    @Nullable
    public final TextStyle f38971w;

    /* renamed from: x */
    @JvmField
    @Nullable
    public final String f38972x;

    /* renamed from: y */
    @JvmField
    @Nullable
    public final DivDrawable f38973y;

    /* renamed from: z */
    @JvmField
    @Nullable
    public final DivDrawable f38974z;

    /* compiled from: DivSlider.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u000bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u000bR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\bR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00140\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\bR\u0014\u0010&\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u000bR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u000bR\u0014\u0010)\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0004R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0010R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001e0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u000bR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001e0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u000bR\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001e0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u000bR\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001e0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u000bR\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0010R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00106\u001a\b\u0012\u0004\u0012\u0002050\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0010R\u0014\u00107\u001a\u00020\u001e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020?098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010<R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0010R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020?0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010\bR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006G"}, m31884d2 = {"Lcom/yandex/div2/DivSlider$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "MAX_VALUE_DEFAULT_VALUE", "MIN_VALUE_DEFAULT_VALUE", "PADDINGS_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "SECONDARY_VALUE_ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAction;", "SELECTED_ACTIONS_VALIDATOR", "THUMB_SECONDARY_VALUE_VARIABLE_TEMPLATE_VALIDATOR", "THUMB_SECONDARY_VALUE_VARIABLE_VALIDATOR", "THUMB_VALUE_VARIABLE_TEMPLATE_VALIDATOR", "THUMB_VALUE_VARIABLE_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivSlider m17703a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            DivAccessibility.Companion companion = DivAccessibility.f34479f;
            Function2<ParsingEnvironment, JSONObject, DivAccessibility> function2 = DivAccessibility.f34486m;
            DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject, "accessibility", function2, f34328a, parsingEnvironment);
            if (divAccessibility == null) {
                divAccessibility = DivSlider.f38909N;
            }
            DivAccessibility divAccessibility2 = divAccessibility;
            Intrinsics.m32178g(divAccessibility2, "JsonParser.readOptional(…CESSIBILITY_DEFAULT_VALUE");
            DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
            Expression m17329u = JsonParser.m17329u(jSONObject, "alignment_horizontal", DivAlignmentHorizontal.f34618d, f34328a, parsingEnvironment, DivSlider.f38921Z);
            DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
            Expression m17329u2 = JsonParser.m17329u(jSONObject, "alignment_vertical", DivAlignmentVertical.f34626d, f34328a, parsingEnvironment, DivSlider.f38922a0);
            Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
            ValueValidator<Double> valueValidator = DivSlider.f38924c0;
            Expression<Double> expression = DivSlider.f38910O;
            Expression<Double> m17328t = JsonParser.m17328t(jSONObject, "alpha", function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
            if (m17328t != null) {
                expression = m17328t;
            }
            DivBackground.Companion companion2 = DivBackground.f34750a;
            List m17333y = JsonParser.m17333y(jSONObject, "background", DivBackground.f34751b, DivSlider.f38925d0, f34328a, parsingEnvironment);
            DivBorder.Companion companion3 = DivBorder.f34785f;
            DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject, "border", DivBorder.f34788i, f34328a, parsingEnvironment);
            if (divBorder == null) {
                divBorder = DivSlider.f38911P;
            }
            DivBorder divBorder2 = divBorder;
            Intrinsics.m32178g(divBorder2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            Function1<Number, Long> function12 = ParsingConvertersKt.f33831e;
            ValueValidator<Long> valueValidator2 = DivSlider.f38926e0;
            TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
            Expression m17327s = JsonParser.m17327s(jSONObject, "column_span", function12, valueValidator2, f34328a, parsingEnvironment, typeHelper);
            DivDisappearAction.Companion companion4 = DivDisappearAction.f35537a;
            List m17333y2 = JsonParser.m17333y(jSONObject, "disappear_actions", DivDisappearAction.f35545i, DivSlider.f38927f0, f34328a, parsingEnvironment);
            DivExtension.Companion companion5 = DivExtension.f35659c;
            List m17333y3 = JsonParser.m17333y(jSONObject, "extensions", DivExtension.f35660d, DivSlider.f38928g0, f34328a, parsingEnvironment);
            DivFocus.Companion companion6 = DivFocus.f35813f;
            DivFocus divFocus = (DivFocus) JsonParser.m17322n(jSONObject, "focus", DivFocus.f35818k, f34328a, parsingEnvironment);
            DivSize.Companion companion7 = DivSize.f38833a;
            Function2<ParsingEnvironment, JSONObject, DivSize> function22 = DivSize.f38834b;
            DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject, "height", function22, f34328a, parsingEnvironment);
            if (divSize == null) {
                divSize = DivSlider.f38912Q;
            }
            DivSize divSize2 = divSize;
            Intrinsics.m32178g(divSize2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            String str = (String) JsonParser.m17323o(jSONObject, "id", DivSlider.f38929h0, f34328a, parsingEnvironment);
            DivEdgeInsets.Companion companion8 = DivEdgeInsets.f35607f;
            Function2<ParsingEnvironment, JSONObject, DivEdgeInsets> function23 = DivEdgeInsets.f35618q;
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "margins", function23, f34328a, parsingEnvironment);
            if (divEdgeInsets == null) {
                divEdgeInsets = DivSlider.f38913R;
            }
            DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
            Intrinsics.m32178g(divEdgeInsets2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            Expression<Long> expression2 = DivSlider.f38914S;
            Expression<Double> expression3 = expression;
            Expression<Long> m17330v = JsonParser.m17330v(jSONObject, "max_value", function12, f34328a, parsingEnvironment, expression2, typeHelper);
            if (m17330v != null) {
                expression2 = m17330v;
            }
            Expression<Long> expression4 = DivSlider.f38915T;
            Expression<Long> m17330v2 = JsonParser.m17330v(jSONObject, "min_value", function12, f34328a, parsingEnvironment, expression4, typeHelper);
            if (m17330v2 != null) {
                expression4 = m17330v2;
            }
            DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "paddings", function23, f34328a, parsingEnvironment);
            if (divEdgeInsets3 == null) {
                divEdgeInsets3 = DivSlider.f38916U;
            }
            DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
            Intrinsics.m32178g(divEdgeInsets4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            Expression m17327s2 = JsonParser.m17327s(jSONObject, "row_span", function12, DivSlider.f38930i0, f34328a, parsingEnvironment, typeHelper);
            DivAccessibility divAccessibility3 = (DivAccessibility) JsonParser.m17322n(jSONObject, "secondary_value_accessibility", function2, f34328a, parsingEnvironment);
            if (divAccessibility3 == null) {
                divAccessibility3 = DivSlider.f38917V;
            }
            DivAccessibility divAccessibility4 = divAccessibility3;
            Intrinsics.m32178g(divAccessibility4, "JsonParser.readOptional(…CESSIBILITY_DEFAULT_VALUE");
            DivAction.Companion companion9 = DivAction.f34546g;
            List m17333y4 = JsonParser.m17333y(jSONObject, "selected_actions", DivAction.f34550k, DivSlider.f38931j0, f34328a, parsingEnvironment);
            DivDrawable.Companion companion10 = DivDrawable.f35599a;
            Function2<ParsingEnvironment, JSONObject, DivDrawable> function24 = DivDrawable.f35600b;
            DivDrawable divDrawable = (DivDrawable) JsonParser.m17322n(jSONObject, "thumb_secondary_style", function24, f34328a, parsingEnvironment);
            TextStyle.Companion companion11 = TextStyle.f38979f;
            Function2<ParsingEnvironment, JSONObject, TextStyle> function25 = TextStyle.f38986m;
            TextStyle textStyle = (TextStyle) JsonParser.m17322n(jSONObject, "thumb_secondary_text_style", function25, f34328a, parsingEnvironment);
            String str2 = (String) JsonParser.m17323o(jSONObject, "thumb_secondary_value_variable", DivSlider.f38932k0, f34328a, parsingEnvironment);
            C2904b c2904b = C2904b.f33858e;
            DivDrawable divDrawable2 = (DivDrawable) JsonParser.m17313e(jSONObject, "thumb_style", function24, c2904b, parsingEnvironment);
            TextStyle textStyle2 = (TextStyle) JsonParser.m17322n(jSONObject, "thumb_text_style", function25, f34328a, parsingEnvironment);
            String str3 = (String) JsonParser.m17323o(jSONObject, "thumb_value_variable", DivSlider.f38933l0, f34328a, parsingEnvironment);
            DivDrawable divDrawable3 = (DivDrawable) JsonParser.m17322n(jSONObject, "tick_mark_active_style", function24, f34328a, parsingEnvironment);
            DivDrawable divDrawable4 = (DivDrawable) JsonParser.m17322n(jSONObject, "tick_mark_inactive_style", function24, f34328a, parsingEnvironment);
            DivTooltip.Companion companion12 = DivTooltip.f40492h;
            List m17333y5 = JsonParser.m17333y(jSONObject, "tooltips", DivTooltip.f40497m, DivSlider.f38934m0, f34328a, parsingEnvironment);
            DivDrawable divDrawable5 = (DivDrawable) JsonParser.m17313e(jSONObject, "track_active_style", function24, c2904b, parsingEnvironment);
            DivDrawable divDrawable6 = (DivDrawable) JsonParser.m17313e(jSONObject, "track_inactive_style", function24, c2904b, parsingEnvironment);
            DivTransform.Companion companion13 = DivTransform.f40551d;
            DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject, "transform", DivTransform.f40554g, f34328a, parsingEnvironment);
            if (divTransform == null) {
                divTransform = DivSlider.f38918W;
            }
            DivTransform divTransform2 = divTransform;
            Intrinsics.m32178g(divTransform2, "JsonParser.readOptional(…: TRANSFORM_DEFAULT_VALUE");
            DivChangeTransition.Companion companion14 = DivChangeTransition.f34856a;
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonParser.m17322n(jSONObject, "transition_change", DivChangeTransition.f34857b, f34328a, parsingEnvironment);
            DivAppearanceTransition.Companion companion15 = DivAppearanceTransition.f34726a;
            Function2<ParsingEnvironment, JSONObject, DivAppearanceTransition> function26 = DivAppearanceTransition.f34727b;
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonParser.m17322n(jSONObject, "transition_in", function26, f34328a, parsingEnvironment);
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonParser.m17322n(jSONObject, "transition_out", function26, f34328a, parsingEnvironment);
            DivTransitionTrigger.Converter converter3 = DivTransitionTrigger.f40582c;
            List m17332x = JsonParser.m17332x(jSONObject, "transition_triggers", DivTransitionTrigger.f40583d, DivSlider.f38935n0, f34328a, parsingEnvironment);
            DivVisibility.Converter converter4 = DivVisibility.f40930c;
            Function1<String, DivVisibility> function13 = DivVisibility.f40931d;
            Expression<DivVisibility> expression5 = DivSlider.f38919X;
            Expression<DivVisibility> m17330v3 = JsonParser.m17330v(jSONObject, "visibility", function13, f34328a, parsingEnvironment, expression5, DivSlider.f38923b0);
            Expression<DivVisibility> expression6 = m17330v3 == null ? expression5 : m17330v3;
            DivVisibilityAction.Companion companion16 = DivVisibilityAction.f40938i;
            Function2<ParsingEnvironment, JSONObject, DivVisibilityAction> function27 = DivVisibilityAction.f40946q;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonParser.m17322n(jSONObject, "visibility_action", function27, f34328a, parsingEnvironment);
            List m17333y6 = JsonParser.m17333y(jSONObject, "visibility_actions", function27, DivSlider.f38936o0, f34328a, parsingEnvironment);
            DivSize divSize3 = (DivSize) JsonParser.m17322n(jSONObject, "width", function22, f34328a, parsingEnvironment);
            if (divSize3 == null) {
                divSize3 = DivSlider.f38920Y;
            }
            Intrinsics.m32178g(divSize3, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new DivSlider(divAccessibility2, m17329u, m17329u2, expression3, m17333y, divBorder2, m17327s, m17333y2, m17333y3, divFocus, divSize2, str, divEdgeInsets2, expression2, expression4, divEdgeInsets4, m17327s2, divAccessibility4, m17333y4, divDrawable, textStyle, str2, divDrawable2, textStyle2, str3, divDrawable3, divDrawable4, m17333y5, divDrawable5, divDrawable6, divTransform2, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17332x, expression6, divVisibilityAction, m17333y6, divSize3);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivSlider.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivSlider$TextStyle;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class TextStyle implements JSONSerializable {

        /* renamed from: f */
        @NotNull
        public static final Companion f38979f = new Companion(null);

        /* renamed from: g */
        @NotNull
        public static final Expression<DivSizeUnit> f38980g;

        /* renamed from: h */
        @NotNull
        public static final Expression<DivFontWeight> f38981h;

        /* renamed from: i */
        @NotNull
        public static final Expression<Integer> f38982i;

        /* renamed from: j */
        @NotNull
        public static final TypeHelper<DivSizeUnit> f38983j;

        /* renamed from: k */
        @NotNull
        public static final TypeHelper<DivFontWeight> f38984k;

        /* renamed from: l */
        @NotNull
        public static final ValueValidator<Long> f38985l;

        /* renamed from: m */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, TextStyle> f38986m;

        /* renamed from: a */
        @JvmField
        @NotNull
        public final Expression<Long> f38987a;

        /* renamed from: b */
        @JvmField
        @NotNull
        public final Expression<DivSizeUnit> f38988b;

        /* renamed from: c */
        @JvmField
        @NotNull
        public final Expression<DivFontWeight> f38989c;

        /* renamed from: d */
        @JvmField
        @Nullable
        public final DivPoint f38990d;

        /* renamed from: e */
        @JvmField
        @NotNull
        public final Expression<Integer> f38991e;

        /* compiled from: DivSlider.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, m31884d2 = {"Lcom/yandex/div2/DivSlider$TextStyle$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "FONT_SIZE_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div2/DivSizeUnit;", "FONT_SIZE_UNIT_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "FONT_SIZE_VALIDATOR", "Lcom/yandex/div2/DivFontWeight;", "FONT_WEIGHT_DEFAULT_VALUE", "", "TEXT_COLOR_DEFAULT_VALUE", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_FONT_SIZE_UNIT", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_FONT_WEIGHT", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        static {
            Expression.Companion companion = Expression.f34334a;
            f38980g = companion.m17539a(DivSizeUnit.SP);
            f38981h = companion.m17539a(DivFontWeight.REGULAR);
            f38982i = companion.m17539a(-16777216);
            int i2 = TypeHelper.f33843a;
            TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
            f38983j = companion2.m17372a(ArraysKt.m31926B(DivSizeUnit.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSlider$TextStyle$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivSizeUnit);
                }
            });
            f38984k = companion2.m17372a(ArraysKt.m31926B(DivFontWeight.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSlider$TextStyle$Companion$TYPE_HELPER_FONT_WEIGHT$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivFontWeight);
                }
            });
            f38985l = C3044f0.f41348e;
            f38986m = new Function2<ParsingEnvironment, JSONObject, TextStyle>() { // from class: com.yandex.div2.DivSlider$TextStyle$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                public DivSlider.TextStyle invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    ParsingEnvironment env = parsingEnvironment;
                    JSONObject it = jSONObject;
                    Intrinsics.m32179h(env, "env");
                    Intrinsics.m32179h(it, "it");
                    DivSlider.TextStyle.Companion companion3 = DivSlider.TextStyle.f38979f;
                    ParsingErrorLogger f34328a = env.getF34328a();
                    Expression m17316h = JsonParser.m17316h(it, "font_size", ParsingConvertersKt.f33831e, DivSlider.TextStyle.f38985l, f34328a, TypeHelpersKt.f33849b);
                    DivSizeUnit.Converter converter = DivSizeUnit.f38845c;
                    Function1<String, DivSizeUnit> function1 = DivSizeUnit.f38846d;
                    Expression<DivSizeUnit> expression = DivSlider.TextStyle.f38980g;
                    Expression<DivSizeUnit> m17330v = JsonParser.m17330v(it, "font_size_unit", function1, f34328a, env, expression, DivSlider.TextStyle.f38983j);
                    if (m17330v != null) {
                        expression = m17330v;
                    }
                    DivFontWeight.Converter converter2 = DivFontWeight.f35883c;
                    Function1<String, DivFontWeight> function12 = DivFontWeight.f35884d;
                    Expression<DivFontWeight> expression2 = DivSlider.TextStyle.f38981h;
                    Expression<DivFontWeight> m17330v2 = JsonParser.m17330v(it, "font_weight", function12, f34328a, env, expression2, DivSlider.TextStyle.f38984k);
                    if (m17330v2 != null) {
                        expression2 = m17330v2;
                    }
                    DivPoint.Companion companion4 = DivPoint.f38064c;
                    DivPoint divPoint = (DivPoint) JsonParser.m17322n(it, "offset", DivPoint.f38065d, f34328a, env);
                    Function1<Object, Integer> function13 = ParsingConvertersKt.f33827a;
                    Expression<Integer> expression3 = DivSlider.TextStyle.f38982i;
                    Expression<Integer> m17330v3 = JsonParser.m17330v(it, "text_color", function13, f34328a, env, expression3, TypeHelpersKt.f33853f);
                    return new DivSlider.TextStyle(m17316h, expression, expression2, divPoint, m17330v3 == null ? expression3 : m17330v3);
                }
            };
        }

        @DivModelInternalApi
        public TextStyle(@NotNull Expression<Long> fontSize, @NotNull Expression<DivSizeUnit> fontSizeUnit, @NotNull Expression<DivFontWeight> fontWeight, @Nullable DivPoint divPoint, @NotNull Expression<Integer> textColor) {
            Intrinsics.m32179h(fontSize, "fontSize");
            Intrinsics.m32179h(fontSizeUnit, "fontSizeUnit");
            Intrinsics.m32179h(fontWeight, "fontWeight");
            Intrinsics.m32179h(textColor, "textColor");
            this.f38987a = fontSize;
            this.f38988b = fontSizeUnit;
            this.f38989c = fontWeight;
            this.f38990d = divPoint;
            this.f38991e = textColor;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression expression = null;
        Expression expression2 = null;
        f38909N = new DivAccessibility(null, expression, null, expression2, null, null, 63);
        Expression.Companion companion = Expression.f34334a;
        f38910O = companion.m17539a(Double.valueOf(1.0d));
        f38911P = new DivBorder(expression, null == true ? 1 : 0, expression2, null == true ? 1 : 0, null == true ? 1 : 0, 31);
        int i2 = 7;
        f38912Q = new DivSize.WrapContent(new DivWrapContentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, i2));
        Expression expression3 = null;
        Expression expression4 = null;
        int i3 = 31;
        f38913R = new DivEdgeInsets(expression2, null == true ? 1 : 0, null == true ? 1 : 0, expression3, expression4, i3);
        f38914S = companion.m17539a(100L);
        f38915T = companion.m17539a(0L);
        f38916U = new DivEdgeInsets(expression2, null == true ? 1 : 0, null == true ? 1 : 0, expression3, expression4, i3);
        f38917V = new DivAccessibility(null, null, null, null, null, null, 63);
        f38918W = new DivTransform(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, i2);
        f38919X = companion.m17539a(DivVisibility.VISIBLE);
        f38920Y = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i4 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f38921Z = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSlider$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f38922a0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSlider$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f38923b0 = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSlider$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f38924c0 = C3040d0.f41259y;
        f38925d0 = C3042e0.f41301f;
        f38926e0 = C3044f0.f41346c;
        f38927f0 = C3042e0.f41302g;
        f38928g0 = C3042e0.f41303h;
        f38929h0 = C3044f0.f41347d;
        f38930i0 = C3040d0.f41256v;
        f38931j0 = C3042e0.f41297b;
        f38932k0 = C3040d0.f41257w;
        f38933l0 = C3040d0.f41258x;
        f38934m0 = C3042e0.f41298c;
        f38935n0 = C3042e0.f41299d;
        f38936o0 = C3042e0.f41300e;
        DivSlider$Companion$CREATOR$1 divSlider$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivSlider>() { // from class: com.yandex.div2.DivSlider$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivSlider invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivSlider.f38908M.m17703a(env, it);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @DivModelInternalApi
    public DivSlider(@NotNull DivAccessibility accessibility, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> alpha, @Nullable List<? extends DivBackground> list, @NotNull DivBorder border, @Nullable Expression<Long> expression3, @Nullable List<? extends DivDisappearAction> list2, @Nullable List<? extends DivExtension> list3, @Nullable DivFocus divFocus, @NotNull DivSize height, @Nullable String str, @NotNull DivEdgeInsets margins, @NotNull Expression<Long> maxValue, @NotNull Expression<Long> minValue, @NotNull DivEdgeInsets paddings, @Nullable Expression<Long> expression4, @NotNull DivAccessibility secondaryValueAccessibility, @Nullable List<? extends DivAction> list4, @Nullable DivDrawable divDrawable, @Nullable TextStyle textStyle, @Nullable String str2, @NotNull DivDrawable thumbStyle, @Nullable TextStyle textStyle2, @Nullable String str3, @Nullable DivDrawable divDrawable2, @Nullable DivDrawable divDrawable3, @Nullable List<? extends DivTooltip> list5, @NotNull DivDrawable trackActiveStyle, @NotNull DivDrawable trackInactiveStyle, @NotNull DivTransform transform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list6, @NotNull Expression<DivVisibility> visibility, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<? extends DivVisibilityAction> list7, @NotNull DivSize width) {
        Intrinsics.m32179h(accessibility, "accessibility");
        Intrinsics.m32179h(alpha, "alpha");
        Intrinsics.m32179h(border, "border");
        Intrinsics.m32179h(height, "height");
        Intrinsics.m32179h(margins, "margins");
        Intrinsics.m32179h(maxValue, "maxValue");
        Intrinsics.m32179h(minValue, "minValue");
        Intrinsics.m32179h(paddings, "paddings");
        Intrinsics.m32179h(secondaryValueAccessibility, "secondaryValueAccessibility");
        Intrinsics.m32179h(thumbStyle, "thumbStyle");
        Intrinsics.m32179h(trackActiveStyle, "trackActiveStyle");
        Intrinsics.m32179h(trackInactiveStyle, "trackInactiveStyle");
        Intrinsics.m32179h(transform, "transform");
        Intrinsics.m32179h(visibility, "visibility");
        Intrinsics.m32179h(width, "width");
        this.f38949a = accessibility;
        this.f38950b = expression;
        this.f38951c = expression2;
        this.f38952d = alpha;
        this.f38953e = list;
        this.f38954f = border;
        this.f38955g = expression3;
        this.f38956h = list2;
        this.f38957i = list3;
        this.f38958j = divFocus;
        this.f38959k = height;
        this.f38960l = str;
        this.f38961m = margins;
        this.f38962n = maxValue;
        this.f38963o = minValue;
        this.f38964p = paddings;
        this.f38965q = expression4;
        this.f38966r = list4;
        this.f38967s = divDrawable;
        this.f38968t = textStyle;
        this.f38969u = str2;
        this.f38970v = thumbStyle;
        this.f38971w = textStyle2;
        this.f38972x = str3;
        this.f38973y = divDrawable2;
        this.f38974z = divDrawable3;
        this.f38937A = list5;
        this.f38938B = trackActiveStyle;
        this.f38939C = trackInactiveStyle;
        this.f38940D = transform;
        this.f38941E = divChangeTransition;
        this.f38942F = divAppearanceTransition;
        this.f38943G = divAppearanceTransition2;
        this.f38944H = list6;
        this.f38945I = visibility;
        this.f38946J = divVisibilityAction;
        this.f38947K = list7;
        this.f38948L = width;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: a, reason: from getter */
    public DivSize getF39983v() {
        return this.f38959k;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: b, reason: from getter */
    public DivTransform getF39952Q() {
        return this.f38940D;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: c */
    public List<DivVisibilityAction> mo17569c() {
        return this.f38947K;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: d */
    public List<DivBackground> mo17570d() {
        return this.f38953e;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: e, reason: from getter */
    public DivAccessibility getF39962a() {
        return this.f38949a;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: f */
    public Expression<Long> mo17572f() {
        return this.f38955g;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: g, reason: from getter */
    public DivSize getF39961Z() {
        return this.f38948L;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: getBorder, reason: from getter */
    public DivBorder getF39971j() {
        return this.f38954f;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: getId, reason: from getter */
    public String getF39984w() {
        return this.f38960l;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    public Expression<DivVisibility> getVisibility() {
        return this.f38945I;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: h, reason: from getter */
    public DivEdgeInsets getF39937B() {
        return this.f38961m;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: i */
    public Expression<Long> mo17575i() {
        return this.f38965q;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: j, reason: from getter */
    public DivEdgeInsets getF39940E() {
        return this.f38964p;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: k */
    public List<DivTransitionTrigger> mo17577k() {
        return this.f38944H;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: l */
    public List<DivAction> mo17578l() {
        return this.f38966r;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: m */
    public Expression<DivAlignmentHorizontal> mo17579m() {
        return this.f38950b;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: n */
    public List<DivExtension> mo17580n() {
        return this.f38957i;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: o */
    public List<DivTooltip> mo17581o() {
        return this.f38937A;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: p, reason: from getter */
    public DivVisibilityAction getF39959X() {
        return this.f38946J;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: q */
    public Expression<DivAlignmentVertical> mo17583q() {
        return this.f38951c;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: r, reason: from getter */
    public DivAppearanceTransition getF39954S() {
        return this.f38942F;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: s */
    public Expression<Double> mo17585s() {
        return this.f38952d;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: t, reason: from getter */
    public DivFocus getF39977p() {
        return this.f38958j;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: u, reason: from getter */
    public DivAppearanceTransition getF39955T() {
        return this.f38943G;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: v, reason: from getter */
    public DivChangeTransition getF39953R() {
        return this.f38941E;
    }
}
