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
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivPagerLayoutMode;
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

/* compiled from: DivPager.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivPager;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div2/DivBase;", "Companion", "Orientation", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivPager implements JSONSerializable, DivBase {

    /* renamed from: G */
    @NotNull
    public static final Companion f37748G = new Companion(null);

    /* renamed from: H */
    @NotNull
    public static final DivAccessibility f37749H;

    /* renamed from: I */
    @NotNull
    public static final Expression<Double> f37750I;

    /* renamed from: J */
    @NotNull
    public static final DivBorder f37751J;

    /* renamed from: K */
    @NotNull
    public static final Expression<Long> f37752K;

    /* renamed from: L */
    @NotNull
    public static final DivSize.WrapContent f37753L;

    /* renamed from: M */
    @NotNull
    public static final DivFixedSize f37754M;

    /* renamed from: N */
    @NotNull
    public static final DivEdgeInsets f37755N;

    /* renamed from: O */
    @NotNull
    public static final Expression<Orientation> f37756O;

    /* renamed from: P */
    @NotNull
    public static final DivEdgeInsets f37757P;

    /* renamed from: Q */
    @NotNull
    public static final Expression<Boolean> f37758Q;

    /* renamed from: R */
    @NotNull
    public static final DivTransform f37759R;

    /* renamed from: S */
    @NotNull
    public static final Expression<DivVisibility> f37760S;

    /* renamed from: T */
    @NotNull
    public static final DivSize.MatchParent f37761T;

    /* renamed from: U */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f37762U;

    /* renamed from: V */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f37763V;

    /* renamed from: W */
    @NotNull
    public static final TypeHelper<Orientation> f37764W;

    /* renamed from: X */
    @NotNull
    public static final TypeHelper<DivVisibility> f37765X;

    /* renamed from: Y */
    @NotNull
    public static final ValueValidator<Double> f37766Y;

    /* renamed from: Z */
    @NotNull
    public static final ListValidator<DivBackground> f37767Z;

    /* renamed from: a0 */
    @NotNull
    public static final ValueValidator<Long> f37768a0;

    /* renamed from: b0 */
    @NotNull
    public static final ValueValidator<Long> f37769b0;

    /* renamed from: c0 */
    @NotNull
    public static final ListValidator<DivDisappearAction> f37770c0;

    /* renamed from: d0 */
    @NotNull
    public static final ListValidator<DivExtension> f37771d0;

    /* renamed from: e0 */
    @NotNull
    public static final ValueValidator<String> f37772e0;

    /* renamed from: f0 */
    @NotNull
    public static final ListValidator<Div> f37773f0;

    /* renamed from: g0 */
    @NotNull
    public static final ValueValidator<Long> f37774g0;

    /* renamed from: h0 */
    @NotNull
    public static final ListValidator<DivAction> f37775h0;

    /* renamed from: i0 */
    @NotNull
    public static final ListValidator<DivTooltip> f37776i0;

    /* renamed from: j0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f37777j0;

    /* renamed from: k0 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f37778k0;

    /* renamed from: A */
    @Nullable
    public final DivAppearanceTransition f37779A;

    /* renamed from: B */
    @Nullable
    public final List<DivTransitionTrigger> f37780B;

    /* renamed from: C */
    @NotNull
    public final Expression<DivVisibility> f37781C;

    /* renamed from: D */
    @Nullable
    public final DivVisibilityAction f37782D;

    /* renamed from: E */
    @Nullable
    public final List<DivVisibilityAction> f37783E;

    /* renamed from: F */
    @NotNull
    public final DivSize f37784F;

    /* renamed from: a */
    @NotNull
    public final DivAccessibility f37785a;

    /* renamed from: b */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f37786b;

    /* renamed from: c */
    @Nullable
    public final Expression<DivAlignmentVertical> f37787c;

    /* renamed from: d */
    @NotNull
    public final Expression<Double> f37788d;

    /* renamed from: e */
    @Nullable
    public final List<DivBackground> f37789e;

    /* renamed from: f */
    @NotNull
    public final DivBorder f37790f;

    /* renamed from: g */
    @Nullable
    public final Expression<Long> f37791g;

    /* renamed from: h */
    @JvmField
    @NotNull
    public final Expression<Long> f37792h;

    /* renamed from: i */
    @Nullable
    public final List<DivDisappearAction> f37793i;

    /* renamed from: j */
    @Nullable
    public final List<DivExtension> f37794j;

    /* renamed from: k */
    @Nullable
    public final DivFocus f37795k;

    /* renamed from: l */
    @NotNull
    public final DivSize f37796l;

    /* renamed from: m */
    @Nullable
    public final String f37797m;

    /* renamed from: n */
    @JvmField
    @NotNull
    public final DivFixedSize f37798n;

    /* renamed from: o */
    @JvmField
    @NotNull
    public final List<Div> f37799o;

    /* renamed from: p */
    @JvmField
    @NotNull
    public final DivPagerLayoutMode f37800p;

    /* renamed from: q */
    @NotNull
    public final DivEdgeInsets f37801q;

    /* renamed from: r */
    @JvmField
    @NotNull
    public final Expression<Orientation> f37802r;

    /* renamed from: s */
    @NotNull
    public final DivEdgeInsets f37803s;

    /* renamed from: t */
    @JvmField
    @NotNull
    public final Expression<Boolean> f37804t;

    /* renamed from: u */
    @Nullable
    public final Expression<Long> f37805u;

    /* renamed from: v */
    @Nullable
    public final List<DivAction> f37806v;

    /* renamed from: w */
    @Nullable
    public final List<DivTooltip> f37807w;

    /* renamed from: x */
    @NotNull
    public final DivTransform f37808x;

    /* renamed from: y */
    @Nullable
    public final DivChangeTransition f37809y;

    /* renamed from: z */
    @Nullable
    public final DivAppearanceTransition f37810z;

    /* compiled from: DivPager.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u000bR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0010R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0010R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u000bR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u000bR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0010R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\bR\u0014\u0010.\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010+R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\bR\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u000bR\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u000bR\u001a\u00104\u001a\b\u0012\u0004\u0012\u0002030\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0010R\u001a\u00106\u001a\b\u0012\u0004\u0012\u0002050\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0010R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0010R\u0014\u0010<\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020B0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010AR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020,0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010AR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020E0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010AR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010\u0010R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020E0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010\bR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006M"}, m31884d2 = {"Lcom/yandex/div2/DivPager$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "DEFAULT_ITEM_DEFAULT_VALUE", "DEFAULT_ITEM_TEMPLATE_VALIDATOR", "DEFAULT_ITEM_VALIDATOR", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div2/Div;", "ITEMS_VALIDATOR", "Lcom/yandex/div2/DivFixedSize;", "ITEM_SPACING_DEFAULT_VALUE", "Lcom/yandex/div2/DivFixedSize;", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "Lcom/yandex/div2/DivPager$Orientation;", "ORIENTATION_DEFAULT_VALUE", "PADDINGS_DEFAULT_VALUE", "", "RESTRICT_PARENT_SCROLL_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "Lcom/yandex/div2/DivAction;", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "TYPE_HELPER_ORIENTATION", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivPager m17661a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            DivAccessibility.Companion companion = DivAccessibility.f34479f;
            DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject, "accessibility", DivAccessibility.f34486m, f34328a, parsingEnvironment);
            if (divAccessibility == null) {
                divAccessibility = DivPager.f37749H;
            }
            DivAccessibility divAccessibility2 = divAccessibility;
            Intrinsics.m32178g(divAccessibility2, "JsonParser.readOptional(…CESSIBILITY_DEFAULT_VALUE");
            DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
            Expression m17329u = JsonParser.m17329u(jSONObject, "alignment_horizontal", DivAlignmentHorizontal.f34618d, f34328a, parsingEnvironment, DivPager.f37762U);
            DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
            Expression m17329u2 = JsonParser.m17329u(jSONObject, "alignment_vertical", DivAlignmentVertical.f34626d, f34328a, parsingEnvironment, DivPager.f37763V);
            Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
            ValueValidator<Double> valueValidator = DivPager.f37766Y;
            Expression<Double> expression = DivPager.f37750I;
            Expression<Double> m17328t = JsonParser.m17328t(jSONObject, "alpha", function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
            Expression<Double> expression2 = m17328t == null ? expression : m17328t;
            DivBackground.Companion companion2 = DivBackground.f34750a;
            List m17333y = JsonParser.m17333y(jSONObject, "background", DivBackground.f34751b, DivPager.f37767Z, f34328a, parsingEnvironment);
            DivBorder.Companion companion3 = DivBorder.f34785f;
            DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject, "border", DivBorder.f34788i, f34328a, parsingEnvironment);
            if (divBorder == null) {
                divBorder = DivPager.f37751J;
            }
            DivBorder divBorder2 = divBorder;
            Intrinsics.m32178g(divBorder2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            Function1<Number, Long> function12 = ParsingConvertersKt.f33831e;
            ValueValidator<Long> valueValidator2 = DivPager.f37768a0;
            TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
            Expression m17327s = JsonParser.m17327s(jSONObject, "column_span", function12, valueValidator2, f34328a, parsingEnvironment, typeHelper);
            ValueValidator<Long> valueValidator3 = DivPager.f37769b0;
            Expression<Long> expression3 = DivPager.f37752K;
            Expression<Long> m17328t2 = JsonParser.m17328t(jSONObject, "default_item", function12, valueValidator3, f34328a, expression3, typeHelper);
            if (m17328t2 != null) {
                expression3 = m17328t2;
            }
            DivDisappearAction.Companion companion4 = DivDisappearAction.f35537a;
            List m17333y2 = JsonParser.m17333y(jSONObject, "disappear_actions", DivDisappearAction.f35545i, DivPager.f37770c0, f34328a, parsingEnvironment);
            DivExtension.Companion companion5 = DivExtension.f35659c;
            List m17333y3 = JsonParser.m17333y(jSONObject, "extensions", DivExtension.f35660d, DivPager.f37771d0, f34328a, parsingEnvironment);
            DivFocus.Companion companion6 = DivFocus.f35813f;
            DivFocus divFocus = (DivFocus) JsonParser.m17322n(jSONObject, "focus", DivFocus.f35818k, f34328a, parsingEnvironment);
            DivSize.Companion companion7 = DivSize.f38833a;
            Function2<ParsingEnvironment, JSONObject, DivSize> function2 = DivSize.f38834b;
            DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject, "height", function2, f34328a, parsingEnvironment);
            if (divSize == null) {
                divSize = DivPager.f37753L;
            }
            DivSize divSize2 = divSize;
            Intrinsics.m32178g(divSize2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            String str = (String) JsonParser.m17323o(jSONObject, "id", DivPager.f37772e0, f34328a, parsingEnvironment);
            DivFixedSize.Companion companion8 = DivFixedSize.f35789c;
            DivFixedSize divFixedSize = (DivFixedSize) JsonParser.m17322n(jSONObject, "item_spacing", DivFixedSize.f35793g, f34328a, parsingEnvironment);
            if (divFixedSize == null) {
                divFixedSize = DivPager.f37754M;
            }
            DivFixedSize divFixedSize2 = divFixedSize;
            Intrinsics.m32178g(divFixedSize2, "JsonParser.readOptional(…TEM_SPACING_DEFAULT_VALUE");
            Div.Companion companion9 = Div.f34418a;
            List m17321m = JsonParser.m17321m(jSONObject, "items", Div.f34419b, DivPager.f37773f0, f34328a, parsingEnvironment);
            Intrinsics.m32178g(m17321m, "readList(json, \"items\", …S_VALIDATOR, logger, env)");
            DivPagerLayoutMode.Companion companion10 = DivPagerLayoutMode.f37823a;
            DivPagerLayoutMode divPagerLayoutMode = (DivPagerLayoutMode) JsonParser.m17313e(jSONObject, "layout_mode", DivPagerLayoutMode.f37824b, C2904b.f33858e, parsingEnvironment);
            DivEdgeInsets.Companion companion11 = DivEdgeInsets.f35607f;
            Function2<ParsingEnvironment, JSONObject, DivEdgeInsets> function22 = DivEdgeInsets.f35618q;
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "margins", function22, f34328a, parsingEnvironment);
            if (divEdgeInsets == null) {
                divEdgeInsets = DivPager.f37755N;
            }
            DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
            Intrinsics.m32178g(divEdgeInsets2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            Orientation.Converter converter3 = Orientation.f37816c;
            Function1<String, Orientation> function13 = Orientation.f37817d;
            Expression<Orientation> expression4 = DivPager.f37756O;
            Expression<Orientation> m17330v = JsonParser.m17330v(jSONObject, "orientation", function13, f34328a, parsingEnvironment, expression4, DivPager.f37764W);
            Expression<Orientation> expression5 = m17330v == null ? expression4 : m17330v;
            DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "paddings", function22, f34328a, parsingEnvironment);
            if (divEdgeInsets3 == null) {
                divEdgeInsets3 = DivPager.f37757P;
            }
            DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
            Intrinsics.m32178g(divEdgeInsets4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            Function1<Object, Boolean> function14 = ParsingConvertersKt.f33829c;
            Expression<Boolean> expression6 = DivPager.f37758Q;
            Expression<Boolean> m17330v2 = JsonParser.m17330v(jSONObject, "restrict_parent_scroll", function14, f34328a, parsingEnvironment, expression6, TypeHelpersKt.f33848a);
            Expression<Boolean> expression7 = m17330v2 == null ? expression6 : m17330v2;
            Expression m17327s2 = JsonParser.m17327s(jSONObject, "row_span", function12, DivPager.f37774g0, f34328a, parsingEnvironment, typeHelper);
            DivAction.Companion companion12 = DivAction.f34546g;
            List m17333y4 = JsonParser.m17333y(jSONObject, "selected_actions", DivAction.f34550k, DivPager.f37775h0, f34328a, parsingEnvironment);
            DivTooltip.Companion companion13 = DivTooltip.f40492h;
            List m17333y5 = JsonParser.m17333y(jSONObject, "tooltips", DivTooltip.f40497m, DivPager.f37776i0, f34328a, parsingEnvironment);
            DivTransform.Companion companion14 = DivTransform.f40551d;
            DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject, "transform", DivTransform.f40554g, f34328a, parsingEnvironment);
            if (divTransform == null) {
                divTransform = DivPager.f37759R;
            }
            DivTransform divTransform2 = divTransform;
            Intrinsics.m32178g(divTransform2, "JsonParser.readOptional(…: TRANSFORM_DEFAULT_VALUE");
            DivChangeTransition.Companion companion15 = DivChangeTransition.f34856a;
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonParser.m17322n(jSONObject, "transition_change", DivChangeTransition.f34857b, f34328a, parsingEnvironment);
            DivAppearanceTransition.Companion companion16 = DivAppearanceTransition.f34726a;
            Function2<ParsingEnvironment, JSONObject, DivAppearanceTransition> function23 = DivAppearanceTransition.f34727b;
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonParser.m17322n(jSONObject, "transition_in", function23, f34328a, parsingEnvironment);
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonParser.m17322n(jSONObject, "transition_out", function23, f34328a, parsingEnvironment);
            DivTransitionTrigger.Converter converter4 = DivTransitionTrigger.f40582c;
            List m17332x = JsonParser.m17332x(jSONObject, "transition_triggers", DivTransitionTrigger.f40583d, DivPager.f37777j0, f34328a, parsingEnvironment);
            DivVisibility.Converter converter5 = DivVisibility.f40930c;
            Function1<String, DivVisibility> function15 = DivVisibility.f40931d;
            Expression<DivVisibility> expression8 = DivPager.f37760S;
            Expression<DivVisibility> m17330v3 = JsonParser.m17330v(jSONObject, "visibility", function15, f34328a, parsingEnvironment, expression8, DivPager.f37765X);
            Expression<DivVisibility> expression9 = m17330v3 == null ? expression8 : m17330v3;
            DivVisibilityAction.Companion companion17 = DivVisibilityAction.f40938i;
            Function2<ParsingEnvironment, JSONObject, DivVisibilityAction> function24 = DivVisibilityAction.f40946q;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonParser.m17322n(jSONObject, "visibility_action", function24, f34328a, parsingEnvironment);
            List m17333y6 = JsonParser.m17333y(jSONObject, "visibility_actions", function24, DivPager.f37778k0, f34328a, parsingEnvironment);
            DivSize divSize3 = (DivSize) JsonParser.m17322n(jSONObject, "width", function2, f34328a, parsingEnvironment);
            if (divSize3 == null) {
                divSize3 = DivPager.f37761T;
            }
            Intrinsics.m32178g(divSize3, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new DivPager(divAccessibility2, m17329u, m17329u2, expression2, m17333y, divBorder2, m17327s, expression3, m17333y2, m17333y3, divFocus, divSize2, str, divFixedSize2, m17321m, divPagerLayoutMode, divEdgeInsets2, expression5, divEdgeInsets4, expression7, m17327s2, m17333y4, m17333y5, divTransform2, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17332x, expression9, divVisibilityAction, m17333y6, divSize3);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivPager.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivPager$Orientation;", "", "Converter", "HORIZONTAL", "VERTICAL", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public enum Orientation {
        HORIZONTAL("horizontal"),
        VERTICAL("vertical");


        /* renamed from: c */
        @NotNull
        public static final Converter f37816c = new Converter(null);

        /* renamed from: d */
        @NotNull
        public static final Function1<String, Orientation> f37817d = new Function1<String, Orientation>() { // from class: com.yandex.div2.DivPager$Orientation$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            public DivPager.Orientation invoke(String str) {
                String string = str;
                Intrinsics.m32179h(string, "string");
                DivPager.Orientation orientation = DivPager.Orientation.HORIZONTAL;
                if (Intrinsics.m32174c(string, "horizontal")) {
                    return orientation;
                }
                DivPager.Orientation orientation2 = DivPager.Orientation.VERTICAL;
                if (Intrinsics.m32174c(string, "vertical")) {
                    return orientation2;
                }
                return null;
            }
        };

        /* renamed from: b */
        @NotNull
        public final String f37821b;

        /* compiled from: DivPager.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivPager$Orientation$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Converter {
            public Converter() {
            }

            public Converter(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        Orientation(String str) {
            this.f37821b = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression expression = null;
        Expression expression2 = null;
        f37749H = new DivAccessibility(null, expression, null, expression2, null, null, 63);
        Expression.Companion companion = Expression.f34334a;
        f37750I = companion.m17539a(Double.valueOf(1.0d));
        f37751J = new DivBorder(expression, null == true ? 1 : 0, expression2, null == true ? 1 : 0, null == true ? 1 : 0, 31);
        f37752K = companion.m17539a(0L);
        int i2 = 7;
        f37753L = new DivSize.WrapContent(new DivWrapContentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, i2));
        f37754M = new DivFixedSize(null == true ? 1 : 0, companion.m17539a(0L), 1);
        Expression expression3 = null;
        Expression expression4 = null;
        Expression expression5 = null;
        int i3 = 31;
        f37755N = new DivEdgeInsets(null == true ? 1 : 0, null == true ? 1 : 0, expression3, expression4, expression5, i3);
        f37756O = companion.m17539a(Orientation.HORIZONTAL);
        f37757P = new DivEdgeInsets(null == true ? 1 : 0, null == true ? 1 : 0, expression3, expression4, expression5, i3);
        f37758Q = companion.m17539a(Boolean.FALSE);
        f37759R = new DivTransform(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, i2);
        f37760S = companion.m17539a(DivVisibility.VISIBLE);
        f37761T = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i4 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f37762U = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivPager$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f37763V = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivPager$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f37764W = companion2.m17372a(ArraysKt.m31926B(Orientation.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivPager$Companion$TYPE_HELPER_ORIENTATION$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivPager.Orientation);
            }
        });
        f37765X = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivPager$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f37766Y = C3076y.f42178i;
        f37767Z = C3075x.f42154j;
        f37768a0 = C3076y.f42179j;
        f37769b0 = C3076y.f42180k;
        f37770c0 = C3075x.f42155k;
        f37771d0 = C3075x.f42156l;
        f37772e0 = C3076y.f42176g;
        f37773f0 = C3075x.f42149e;
        f37774g0 = C3076y.f42177h;
        f37775h0 = C3075x.f42150f;
        f37776i0 = C3075x.f42151g;
        f37777j0 = C3075x.f42152h;
        f37778k0 = C3075x.f42153i;
        DivPager$Companion$CREATOR$1 divPager$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivPager>() { // from class: com.yandex.div2.DivPager$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivPager invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivPager.f37748G.m17661a(env, it);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @DivModelInternalApi
    public DivPager(@NotNull DivAccessibility accessibility, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> alpha, @Nullable List<? extends DivBackground> list, @NotNull DivBorder border, @Nullable Expression<Long> expression3, @NotNull Expression<Long> defaultItem, @Nullable List<? extends DivDisappearAction> list2, @Nullable List<? extends DivExtension> list3, @Nullable DivFocus divFocus, @NotNull DivSize height, @Nullable String str, @NotNull DivFixedSize itemSpacing, @NotNull List<? extends Div> items, @NotNull DivPagerLayoutMode layoutMode, @NotNull DivEdgeInsets margins, @NotNull Expression<Orientation> orientation, @NotNull DivEdgeInsets paddings, @NotNull Expression<Boolean> restrictParentScroll, @Nullable Expression<Long> expression4, @Nullable List<? extends DivAction> list4, @Nullable List<? extends DivTooltip> list5, @NotNull DivTransform transform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list6, @NotNull Expression<DivVisibility> visibility, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<? extends DivVisibilityAction> list7, @NotNull DivSize width) {
        Intrinsics.m32179h(accessibility, "accessibility");
        Intrinsics.m32179h(alpha, "alpha");
        Intrinsics.m32179h(border, "border");
        Intrinsics.m32179h(defaultItem, "defaultItem");
        Intrinsics.m32179h(height, "height");
        Intrinsics.m32179h(itemSpacing, "itemSpacing");
        Intrinsics.m32179h(items, "items");
        Intrinsics.m32179h(layoutMode, "layoutMode");
        Intrinsics.m32179h(margins, "margins");
        Intrinsics.m32179h(orientation, "orientation");
        Intrinsics.m32179h(paddings, "paddings");
        Intrinsics.m32179h(restrictParentScroll, "restrictParentScroll");
        Intrinsics.m32179h(transform, "transform");
        Intrinsics.m32179h(visibility, "visibility");
        Intrinsics.m32179h(width, "width");
        this.f37785a = accessibility;
        this.f37786b = expression;
        this.f37787c = expression2;
        this.f37788d = alpha;
        this.f37789e = list;
        this.f37790f = border;
        this.f37791g = expression3;
        this.f37792h = defaultItem;
        this.f37793i = list2;
        this.f37794j = list3;
        this.f37795k = divFocus;
        this.f37796l = height;
        this.f37797m = str;
        this.f37798n = itemSpacing;
        this.f37799o = items;
        this.f37800p = layoutMode;
        this.f37801q = margins;
        this.f37802r = orientation;
        this.f37803s = paddings;
        this.f37804t = restrictParentScroll;
        this.f37805u = expression4;
        this.f37806v = list4;
        this.f37807w = list5;
        this.f37808x = transform;
        this.f37809y = divChangeTransition;
        this.f37810z = divAppearanceTransition;
        this.f37779A = divAppearanceTransition2;
        this.f37780B = list6;
        this.f37781C = visibility;
        this.f37782D = divVisibilityAction;
        this.f37783E = list7;
        this.f37784F = width;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: a, reason: from getter */
    public DivSize getF38586p() {
        return this.f37796l;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: b, reason: from getter */
    public DivTransform getF38594x() {
        return this.f37808x;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: c */
    public List<DivVisibilityAction> mo17569c() {
        return this.f37783E;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: d */
    public List<DivBackground> mo17570d() {
        return this.f37789e;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: e, reason: from getter */
    public DivAccessibility getF38571a() {
        return this.f37785a;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: f */
    public Expression<Long> mo17572f() {
        return this.f37791g;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: g, reason: from getter */
    public DivSize getF38570F() {
        return this.f37784F;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: getBorder, reason: from getter */
    public DivBorder getF38579i() {
        return this.f37790f;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: getId, reason: from getter */
    public String getF38587q() {
        return this.f37797m;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    public Expression<DivVisibility> getVisibility() {
        return this.f37781C;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: h, reason: from getter */
    public DivEdgeInsets getF38589s() {
        return this.f37801q;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: i */
    public Expression<Long> mo17575i() {
        return this.f37805u;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: j, reason: from getter */
    public DivEdgeInsets getF38590t() {
        return this.f37803s;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: k */
    public List<DivTransitionTrigger> mo17577k() {
        return this.f37780B;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: l */
    public List<DivAction> mo17578l() {
        return this.f37806v;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: m */
    public Expression<DivAlignmentHorizontal> mo17579m() {
        return this.f37786b;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: n */
    public List<DivExtension> mo17580n() {
        return this.f37794j;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: o */
    public List<DivTooltip> mo17581o() {
        return this.f37807w;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: p, reason: from getter */
    public DivVisibilityAction getF38568D() {
        return this.f37782D;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: q */
    public Expression<DivAlignmentVertical> mo17583q() {
        return this.f37787c;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: r, reason: from getter */
    public DivAppearanceTransition getF38596z() {
        return this.f37810z;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: s */
    public Expression<Double> mo17585s() {
        return this.f37788d;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: t, reason: from getter */
    public DivFocus getF38585o() {
        return this.f37795k;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: u, reason: from getter */
    public DivAppearanceTransition getF38565A() {
        return this.f37779A;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: v, reason: from getter */
    public DivChangeTransition getF38595y() {
        return this.f37809y;
    }
}
