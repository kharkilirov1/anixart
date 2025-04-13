package com.yandex.div2;

import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAccessibility;
import com.yandex.div2.DivAccessibilityTemplate;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivActionTemplate;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivAppearanceTransitionTemplate;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivBackgroundTemplate;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivBorderTemplate;
import com.yandex.div2.DivChangeTransition;
import com.yandex.div2.DivChangeTransitionTemplate;
import com.yandex.div2.DivDisappearAction;
import com.yandex.div2.DivDisappearActionTemplate;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivEdgeInsetsTemplate;
import com.yandex.div2.DivExtension;
import com.yandex.div2.DivExtensionTemplate;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivFocusTemplate;
import com.yandex.div2.DivFontFamily;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivSelect;
import com.yandex.div2.DivSelectTemplate;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeTemplate;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivTooltip;
import com.yandex.div2.DivTooltipTemplate;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivTransformTemplate;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.div2.DivVisibilityActionTemplate;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivSelectTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div2/DivSelectTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivSelect;", "Companion", "OptionTemplate", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivSelectTemplate implements JSONSerializable, JsonTemplate<DivSelect> {

    /* renamed from: A0 */
    @NotNull
    public static final ListValidator<OptionTemplate> f38354A0;

    /* renamed from: B0 */
    @NotNull
    public static final ValueValidator<Long> f38355B0;

    /* renamed from: C0 */
    @NotNull
    public static final ValueValidator<Long> f38356C0;

    /* renamed from: D0 */
    @NotNull
    public static final ListValidator<DivAction> f38357D0;

    /* renamed from: E0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f38358E0;

    /* renamed from: F0 */
    @NotNull
    public static final ListValidator<DivTooltip> f38359F0;

    /* renamed from: G0 */
    @NotNull
    public static final ListValidator<DivTooltipTemplate> f38360G0;

    /* renamed from: H0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f38361H0;

    /* renamed from: I0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f38362I0;

    /* renamed from: J0 */
    @NotNull
    public static final ValueValidator<String> f38363J0;

    /* renamed from: K0 */
    @NotNull
    public static final ValueValidator<String> f38364K0;

    /* renamed from: L */
    @NotNull
    public static final DivAccessibility f38365L = new DivAccessibility(null, null, null, null, null, null, 63);

    /* renamed from: L0 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f38366L0;

    /* renamed from: M */
    @NotNull
    public static final Expression<Double> f38367M;

    /* renamed from: M0 */
    @NotNull
    public static final ListValidator<DivVisibilityActionTemplate> f38368M0;

    /* renamed from: N */
    @NotNull
    public static final DivBorder f38369N;

    /* renamed from: N0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAccessibility> f38370N0;

    /* renamed from: O */
    @NotNull
    public static final Expression<DivFontFamily> f38371O;

    /* renamed from: O0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>> f38372O0;

    /* renamed from: P */
    @NotNull
    public static final Expression<Long> f38373P;

    /* renamed from: P0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>> f38374P0;

    /* renamed from: Q */
    @NotNull
    public static final Expression<DivSizeUnit> f38375Q;

    /* renamed from: Q0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f38376Q0;

    /* renamed from: R */
    @NotNull
    public static final Expression<DivFontWeight> f38377R;

    /* renamed from: R0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>> f38378R0;

    /* renamed from: S */
    @NotNull
    public static final DivSize.WrapContent f38379S;

    /* renamed from: S0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivBorder> f38380S0;

    /* renamed from: T */
    @NotNull
    public static final Expression<Integer> f38381T;

    /* renamed from: T0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f38382T0;

    /* renamed from: U */
    @NotNull
    public static final Expression<Double> f38383U;

    /* renamed from: U0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>> f38384U0;

    /* renamed from: V */
    @NotNull
    public static final DivEdgeInsets f38385V;

    /* renamed from: V0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>> f38386V0;

    /* renamed from: W */
    @NotNull
    public static final DivEdgeInsets f38387W;

    /* renamed from: W0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivFocus> f38388W0;

    /* renamed from: X */
    @NotNull
    public static final Expression<Integer> f38389X;

    /* renamed from: X0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivFontFamily>> f38390X0;

    /* renamed from: Y */
    @NotNull
    public static final DivTransform f38391Y;

    /* renamed from: Y0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f38392Y0;

    /* renamed from: Z */
    @NotNull
    public static final Expression<DivVisibility> f38393Z;

    /* renamed from: Z0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivSizeUnit>> f38394Z0;

    /* renamed from: a0 */
    @NotNull
    public static final DivSize.MatchParent f38395a0;

    /* renamed from: a1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivFontWeight>> f38396a1;

    /* renamed from: b0 */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f38397b0;

    /* renamed from: b1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f38398b1;

    /* renamed from: c0 */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f38399c0;

    /* renamed from: c1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>> f38400c1;

    /* renamed from: d0 */
    @NotNull
    public static final TypeHelper<DivFontFamily> f38401d0;

    /* renamed from: d1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<String>> f38402d1;

    /* renamed from: e0 */
    @NotNull
    public static final TypeHelper<DivSizeUnit> f38403e0;

    /* renamed from: e1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f38404e1;

    /* renamed from: f0 */
    @NotNull
    public static final TypeHelper<DivFontWeight> f38405f0;

    /* renamed from: f1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f38406f1;

    /* renamed from: g0 */
    @NotNull
    public static final TypeHelper<DivVisibility> f38407g0;

    /* renamed from: g1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f38408g1;

    /* renamed from: h0 */
    @NotNull
    public static final ValueValidator<Double> f38409h0;

    /* renamed from: h1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f38410h1;

    /* renamed from: i0 */
    @NotNull
    public static final ValueValidator<Double> f38411i0;

    /* renamed from: i1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivSelect.Option>> f38412i1;

    /* renamed from: j0 */
    @NotNull
    public static final ListValidator<DivBackground> f38413j0;

    /* renamed from: j1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f38414j1;

    /* renamed from: k0 */
    @NotNull
    public static final ListValidator<DivBackgroundTemplate> f38415k0;

    /* renamed from: k1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f38416k1;

    /* renamed from: l0 */
    @NotNull
    public static final ValueValidator<Long> f38417l0;

    /* renamed from: l1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f38418l1;

    /* renamed from: m0 */
    @NotNull
    public static final ValueValidator<Long> f38419m0;

    /* renamed from: m1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>> f38420m1;

    /* renamed from: n0 */
    @NotNull
    public static final ListValidator<DivDisappearAction> f38421n0;

    /* renamed from: n1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>> f38422n1;

    /* renamed from: o0 */
    @NotNull
    public static final ListValidator<DivDisappearActionTemplate> f38423o0;

    /* renamed from: o1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivTransform> f38424o1;

    /* renamed from: p0 */
    @NotNull
    public static final ListValidator<DivExtension> f38425p0;

    /* renamed from: p1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition> f38426p1;

    /* renamed from: q0 */
    @NotNull
    public static final ListValidator<DivExtensionTemplate> f38427q0;

    /* renamed from: q1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f38428q1;

    /* renamed from: r0 */
    @NotNull
    public static final ValueValidator<Long> f38429r0;

    /* renamed from: r1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f38430r1;

    /* renamed from: s0 */
    @NotNull
    public static final ValueValidator<Long> f38431s0;

    /* renamed from: s1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>> f38432s1;

    /* renamed from: t0 */
    @NotNull
    public static final ValueValidator<String> f38433t0;

    /* renamed from: t1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f38434t1;

    /* renamed from: u0 */
    @NotNull
    public static final ValueValidator<String> f38435u0;

    /* renamed from: u1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>> f38436u1;

    /* renamed from: v0 */
    @NotNull
    public static final ValueValidator<String> f38437v0;

    /* renamed from: v1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction> f38438v1;

    /* renamed from: w0 */
    @NotNull
    public static final ValueValidator<String> f38439w0;

    /* renamed from: w1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>> f38440w1;

    /* renamed from: x0 */
    @NotNull
    public static final ValueValidator<Long> f38441x0;

    /* renamed from: x1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f38442x1;

    /* renamed from: y0 */
    @NotNull
    public static final ValueValidator<Long> f38443y0;

    /* renamed from: z0 */
    @NotNull
    public static final ListValidator<DivSelect.Option> f38444z0;

    /* renamed from: A */
    @JvmField
    @NotNull
    public final Field<List<DivTooltipTemplate>> f38445A;

    /* renamed from: B */
    @JvmField
    @NotNull
    public final Field<DivTransformTemplate> f38446B;

    /* renamed from: C */
    @JvmField
    @NotNull
    public final Field<DivChangeTransitionTemplate> f38447C;

    /* renamed from: D */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f38448D;

    /* renamed from: E */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f38449E;

    /* renamed from: F */
    @JvmField
    @NotNull
    public final Field<List<DivTransitionTrigger>> f38450F;

    /* renamed from: G */
    @JvmField
    @NotNull
    public final Field<String> f38451G;

    /* renamed from: H */
    @JvmField
    @NotNull
    public final Field<Expression<DivVisibility>> f38452H;

    /* renamed from: I */
    @JvmField
    @NotNull
    public final Field<DivVisibilityActionTemplate> f38453I;

    /* renamed from: J */
    @JvmField
    @NotNull
    public final Field<List<DivVisibilityActionTemplate>> f38454J;

    /* renamed from: K */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f38455K;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<DivAccessibilityTemplate> f38456a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f38457b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f38458c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f38459d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f38460e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final Field<DivBorderTemplate> f38461f;

    /* renamed from: g */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f38462g;

    /* renamed from: h */
    @JvmField
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f38463h;

    /* renamed from: i */
    @JvmField
    @NotNull
    public final Field<List<DivExtensionTemplate>> f38464i;

    /* renamed from: j */
    @JvmField
    @NotNull
    public final Field<DivFocusTemplate> f38465j;

    /* renamed from: k */
    @JvmField
    @NotNull
    public final Field<Expression<DivFontFamily>> f38466k;

    /* renamed from: l */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f38467l;

    /* renamed from: m */
    @JvmField
    @NotNull
    public final Field<Expression<DivSizeUnit>> f38468m;

    /* renamed from: n */
    @JvmField
    @NotNull
    public final Field<Expression<DivFontWeight>> f38469n;

    /* renamed from: o */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f38470o;

    /* renamed from: p */
    @JvmField
    @NotNull
    public final Field<Expression<Integer>> f38471p;

    /* renamed from: q */
    @JvmField
    @NotNull
    public final Field<Expression<String>> f38472q;

    /* renamed from: r */
    @JvmField
    @NotNull
    public final Field<String> f38473r;

    /* renamed from: s */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f38474s;

    /* renamed from: t */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f38475t;

    /* renamed from: u */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f38476u;

    /* renamed from: v */
    @JvmField
    @NotNull
    public final Field<List<OptionTemplate>> f38477v;

    /* renamed from: w */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f38478w;

    /* renamed from: x */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f38479x;

    /* renamed from: y */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f38480y;

    /* renamed from: z */
    @JvmField
    @NotNull
    public final Field<Expression<Integer>> f38481z;

    /* compiled from: DivSelectTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000bR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0010R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0010R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\bR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00160\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\bR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u000bR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\bR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u000bR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\bR\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\bR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020/0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u000bR\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020/0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u000bR\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020/0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u000bR\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020/0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u000bR\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\bR\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u000bR\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u000bR\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0010R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010\u0010R\u0014\u0010>\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00109R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\u000bR\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\u000bR\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0010R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010\u0010R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020-0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010\bR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010\u0010R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010\u0010R\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010\u0010R\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020M0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010\u0010R\u0014\u0010P\u001a\u00020/8\u0006X\u0086T¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020S0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020V0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010UR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020!0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010UR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020%0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010UR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020(0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010UR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010UR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020/0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010\u000bR\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020/0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010\u000bR\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020_0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010\u0010R\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020a0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010\u0010R\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020[0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010\bR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010f¨\u0006g"}, m31884d2 = {"Lcom/yandex/div2/DivSelectTemplate$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackgroundTemplate;", "BACKGROUND_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivDisappearActionTemplate;", "DISAPPEAR_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivExtensionTemplate;", "EXTENSIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/DivFontFamily;", "FONT_FAMILY_DEFAULT_VALUE", "FONT_SIZE_DEFAULT_VALUE", "FONT_SIZE_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivSizeUnit;", "FONT_SIZE_UNIT_DEFAULT_VALUE", "FONT_SIZE_VALIDATOR", "Lcom/yandex/div2/DivFontWeight;", "FONT_WEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "", "HINT_COLOR_DEFAULT_VALUE", "", "HINT_TEXT_TEMPLATE_VALIDATOR", "HINT_TEXT_VALIDATOR", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "LETTER_SPACING_DEFAULT_VALUE", "LINE_HEIGHT_TEMPLATE_VALIDATOR", "LINE_HEIGHT_VALIDATOR", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "Lcom/yandex/div2/DivSelectTemplate$OptionTemplate;", "OPTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivSelect$Option;", "OPTIONS_VALIDATOR", "PADDINGS_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "Lcom/yandex/div2/DivActionTemplate;", "SELECTED_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivAction;", "SELECTED_ACTIONS_VALIDATOR", "TEXT_COLOR_DEFAULT_VALUE", "Lcom/yandex/div2/DivTooltipTemplate;", "TOOLTIPS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_TEMPLATE_VALIDATOR", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "TYPE_HELPER_FONT_FAMILY", "TYPE_HELPER_FONT_SIZE_UNIT", "TYPE_HELPER_FONT_WEIGHT", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "VALUE_VARIABLE_TEMPLATE_VALIDATOR", "VALUE_VARIABLE_VALIDATOR", "Lcom/yandex/div2/DivVisibilityActionTemplate;", "VISIBILITY_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: DivSelectTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivSelectTemplate$OptionTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivSelect$Option;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class OptionTemplate implements JSONSerializable, JsonTemplate<DivSelect.Option> {

        /* renamed from: c */
        @NotNull
        public static final Companion f38527c = new Companion(null);

        /* renamed from: d */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<String>> f38528d = new Function3<String, JSONObject, ParsingEnvironment, Expression<String>>() { // from class: com.yandex.div2.DivSelectTemplate$OptionTemplate$Companion$TEXT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<String> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String key = str;
                JSONObject json = jSONObject;
                ParsingEnvironment env = parsingEnvironment;
                Intrinsics.m32179h(key, "key");
                Intrinsics.m32179h(json, "json");
                Intrinsics.m32179h(env, "env");
                return JsonParser.m17326r(json, key, env.getF34328a(), env, TypeHelpersKt.f33850c);
            }
        };

        /* renamed from: e */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<String>> f38529e = new Function3<String, JSONObject, ParsingEnvironment, Expression<String>>() { // from class: com.yandex.div2.DivSelectTemplate$OptionTemplate$Companion$VALUE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<String> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String key = str;
                JSONObject json = jSONObject;
                ParsingEnvironment env = parsingEnvironment;
                Intrinsics.m32179h(key, "key");
                Intrinsics.m32179h(json, "json");
                Intrinsics.m32179h(env, "env");
                return JsonParser.m17315g(json, key, env.getF34328a(), env, TypeHelpersKt.f33850c);
            }
        };

        /* renamed from: f */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, OptionTemplate> f38530f = new Function2<ParsingEnvironment, JSONObject, OptionTemplate>() { // from class: com.yandex.div2.DivSelectTemplate$OptionTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivSelectTemplate.OptionTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivSelectTemplate.OptionTemplate(env, null, false, it, 6);
            }
        };

        /* renamed from: a */
        @JvmField
        @NotNull
        public final Field<Expression<String>> f38531a;

        /* renamed from: b */
        @JvmField
        @NotNull
        public final Field<Expression<String>> f38532b;

        /* compiled from: DivSelectTemplate.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivSelectTemplate$OptionTemplate$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        public OptionTemplate(ParsingEnvironment parsingEnvironment, OptionTemplate optionTemplate, boolean z, JSONObject jSONObject, int i2) {
            z = (i2 & 4) != 0 ? false : z;
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            TypeHelper<String> typeHelper = TypeHelpersKt.f33850c;
            this.f38531a = JsonTemplateParser.m17356q(jSONObject, "text", z, null, f34328a, parsingEnvironment, typeHelper);
            this.f38532b = JsonTemplateParser.m17347h(jSONObject, "value", z, null, f34328a, parsingEnvironment, typeHelper);
        }

        @Override // com.yandex.div.json.JsonTemplate
        /* renamed from: a */
        public DivSelect.Option mo17514a(ParsingEnvironment env, JSONObject data) {
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(data, "data");
            return new DivSelect.Option((Expression) FieldKt.m17378d(this.f38531a, env, "text", data, f38528d), (Expression) FieldKt.m17376b(this.f38532b, env, "value", data, f38529e));
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f38367M = companion.m17539a(Double.valueOf(1.0d));
        f38369N = new DivBorder(null, null, null, null, null, 31);
        f38371O = companion.m17539a(DivFontFamily.TEXT);
        f38373P = companion.m17539a(12L);
        f38375Q = companion.m17539a(DivSizeUnit.SP);
        f38377R = companion.m17539a(DivFontWeight.REGULAR);
        f38379S = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7));
        f38381T = companion.m17539a(1929379840);
        f38383U = companion.m17539a(Double.valueOf(0.0d));
        f38385V = new DivEdgeInsets(null, null, null, null, null, 31);
        f38387W = new DivEdgeInsets(null, null, null, null, null, 31);
        f38389X = companion.m17539a(-16777216);
        f38391Y = new DivTransform(null, null, null, 7);
        f38393Z = companion.m17539a(DivVisibility.VISIBLE);
        f38395a0 = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i2 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f38397b0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f38399c0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f38401d0 = companion2.m17372a(ArraysKt.m31926B(DivFontFamily.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$TYPE_HELPER_FONT_FAMILY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivFontFamily);
            }
        });
        f38403e0 = companion2.m17372a(ArraysKt.m31926B(DivSizeUnit.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivSizeUnit);
            }
        });
        f38405f0 = companion2.m17372a(ArraysKt.m31926B(DivFontWeight.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$TYPE_HELPER_FONT_WEIGHT$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivFontWeight);
            }
        });
        f38407g0 = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f38409h0 = C3036b0.f41130e;
        f38411i0 = C3036b0.f41139n;
        f38413j0 = C3077z.f42222x;
        f38415k0 = C3077z.f42195A;
        f38417l0 = C3036b0.f41144s;
        f38419m0 = C3036b0.f41145t;
        f38421n0 = C3077z.f42196B;
        f38423o0 = C3077z.f42197C;
        f38425p0 = C3077z.f42198D;
        f38427q0 = C3077z.f42199E;
        f38429r0 = C3036b0.f41131f;
        f38431s0 = C3036b0.f41132g;
        f38433t0 = C3036b0.f41133h;
        f38435u0 = C3036b0.f41134i;
        f38437v0 = C3036b0.f41135j;
        f38439w0 = C3036b0.f41136k;
        f38441x0 = C3036b0.f41137l;
        f38443y0 = C3036b0.f41138m;
        f38444z0 = C3077z.f42214p;
        f38354A0 = C3077z.f42215q;
        f38355B0 = C3036b0.f41140o;
        f38356C0 = C3036b0.f41141p;
        f38357D0 = C3077z.f42216r;
        f38358E0 = C3077z.f42217s;
        f38359F0 = C3077z.f42218t;
        f38360G0 = C3077z.f42219u;
        f38361H0 = C3077z.f42220v;
        f38362I0 = C3077z.f42221w;
        f38363J0 = C3036b0.f41142q;
        f38364K0 = C3036b0.f41143r;
        f38366L0 = C3077z.f42223y;
        f38368M0 = C3077z.f42224z;
        f38370N0 = new Function3<String, JSONObject, ParsingEnvironment, DivAccessibility>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$ACCESSIBILITY_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAccessibility mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAccessibility.Companion companion3 = DivAccessibility.f34479f;
                DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject2, str2, DivAccessibility.f34486m, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divAccessibility == null ? DivSelectTemplate.f38365L : divAccessibility;
            }
        };
        f38372O0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$ALIGNMENT_HORIZONTAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentHorizontal> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentHorizontal.f34618d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivSelectTemplate.f38397b0);
            }
        };
        f38374P0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$ALIGNMENT_VERTICAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentVertical> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentVertical.Converter converter = DivAlignmentVertical.f34625c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentVertical.f34626d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivSelectTemplate.f38399c0);
            }
        };
        f38376Q0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$ALPHA_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
                ValueValidator<Double> valueValidator = DivSelectTemplate.f38411i0;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Double> expression = DivSelectTemplate.f38367M;
                Expression<Double> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
                return m17328t == null ? expression : m17328t;
            }
        };
        f38378R0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$BACKGROUND_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivBackground> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBackground.Companion companion3 = DivBackground.f34750a;
                return JsonParser.m17333y(jSONObject2, str2, DivBackground.f34751b, DivSelectTemplate.f38413j0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f38380S0 = new Function3<String, JSONObject, ParsingEnvironment, DivBorder>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$BORDER_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivBorder mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBorder.Companion companion3 = DivBorder.f34785f;
                DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject2, str2, DivBorder.f34788i, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divBorder == null ? DivSelectTemplate.f38369N : divBorder;
            }
        };
        f38382T0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$COLUMN_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivSelectTemplate.f38419m0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f38384U0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$DISAPPEAR_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivDisappearAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivDisappearAction.Companion companion3 = DivDisappearAction.f35537a;
                return JsonParser.m17333y(jSONObject2, str2, DivDisappearAction.f35545i, DivSelectTemplate.f38421n0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f38386V0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$EXTENSIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivExtension> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivExtension.Companion companion3 = DivExtension.f35659c;
                return JsonParser.m17333y(jSONObject2, str2, DivExtension.f35660d, DivSelectTemplate.f38425p0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f38388W0 = new Function3<String, JSONObject, ParsingEnvironment, DivFocus>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$FOCUS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivFocus mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivFocus.Companion companion3 = DivFocus.f35813f;
                return (DivFocus) JsonParser.m17322n(jSONObject2, str2, DivFocus.f35818k, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f38390X0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivFontFamily>>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$FONT_FAMILY_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivFontFamily> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivFontFamily.Converter converter = DivFontFamily.f35876c;
                Function1<String, DivFontFamily> function1 = DivFontFamily.f35877d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivFontFamily> expression = DivSelectTemplate.f38371O;
                Expression<DivFontFamily> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivSelectTemplate.f38401d0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f38392Y0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$FONT_SIZE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivSelectTemplate.f38431s0;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivSelectTemplate.f38373P;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        f38394Z0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivSizeUnit>>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$FONT_SIZE_UNIT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivSizeUnit> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSizeUnit.Converter converter = DivSizeUnit.f38845c;
                Function1<String, DivSizeUnit> function1 = DivSizeUnit.f38846d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivSizeUnit> expression = DivSelectTemplate.f38375Q;
                Expression<DivSizeUnit> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivSelectTemplate.f38403e0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f38396a1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivFontWeight>>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$FONT_WEIGHT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivFontWeight> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivFontWeight.Converter converter = DivFontWeight.f35883c;
                Function1<String, DivFontWeight> function1 = DivFontWeight.f35884d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivFontWeight> expression = DivSelectTemplate.f38377R;
                Expression<DivFontWeight> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivSelectTemplate.f38405f0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f38398b1 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$HEIGHT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivSelectTemplate.f38379S : divSize;
            }
        };
        f38400c1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$HINT_COLOR_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Integer> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Object, Integer> function1 = ParsingConvertersKt.f33827a;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Integer> expression = DivSelectTemplate.f38381T;
                Expression<Integer> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33853f);
                return m17330v == null ? expression : m17330v;
            }
        };
        f38402d1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<String>>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$HINT_TEXT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<String> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17325q(jSONObject2, str2, DivSelectTemplate.f38435u0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33850c);
            }
        };
        f38404e1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$ID_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return (String) JsonParser.m17323o(jSONObject2, str2, DivSelectTemplate.f38439w0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f38406f1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$LETTER_SPACING_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Double> expression = DivSelectTemplate.f38383U;
                Expression<Double> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33851d);
                return m17330v == null ? expression : m17330v;
            }
        };
        f38408g1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$LINE_HEIGHT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivSelectTemplate.f38443y0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f38410h1 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$MARGINS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivSelectTemplate.f38385V : divEdgeInsets;
            }
        };
        f38412i1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivSelect.Option>>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$OPTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivSelect.Option> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSelect.Option.Companion companion3 = DivSelect.Option.f38349c;
                List<DivSelect.Option> m17321m = JsonParser.m17321m(jSONObject2, str2, DivSelect.Option.f38350d, DivSelectTemplate.f38444z0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                Intrinsics.m32178g(m17321m, "readList(json, key, DivS…LIDATOR, env.logger, env)");
                return m17321m;
            }
        };
        f38414j1 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$PADDINGS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivSelectTemplate.f38387W : divEdgeInsets;
            }
        };
        f38416k1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$ROW_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivSelectTemplate.f38356C0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f38418l1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$SELECTED_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivSelectTemplate.f38357D0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f38420m1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$TEXT_COLOR_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Integer> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Object, Integer> function1 = ParsingConvertersKt.f33827a;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Integer> expression = DivSelectTemplate.f38389X;
                Expression<Integer> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33853f);
                return m17330v == null ? expression : m17330v;
            }
        };
        f38422n1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$TOOLTIPS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTooltip> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTooltip.Companion companion3 = DivTooltip.f40492h;
                return JsonParser.m17333y(jSONObject2, str2, DivTooltip.f40497m, DivSelectTemplate.f38359F0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f38424o1 = new Function3<String, JSONObject, ParsingEnvironment, DivTransform>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$TRANSFORM_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivTransform mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransform.Companion companion3 = DivTransform.f40551d;
                DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject2, str2, DivTransform.f40554g, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divTransform == null ? DivSelectTemplate.f38391Y : divTransform;
            }
        };
        f38426p1 = new Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$TRANSITION_CHANGE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivChangeTransition mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivChangeTransition.Companion companion3 = DivChangeTransition.f34856a;
                return (DivChangeTransition) JsonParser.m17322n(jSONObject2, str2, DivChangeTransition.f34857b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f38428q1 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$TRANSITION_IN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAppearanceTransition mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAppearanceTransition.Companion companion3 = DivAppearanceTransition.f34726a;
                return (DivAppearanceTransition) JsonParser.m17322n(jSONObject2, str2, DivAppearanceTransition.f34727b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f38430r1 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$TRANSITION_OUT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAppearanceTransition mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAppearanceTransition.Companion companion3 = DivAppearanceTransition.f34726a;
                return (DivAppearanceTransition) JsonParser.m17322n(jSONObject2, str2, DivAppearanceTransition.f34727b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f38432s1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$TRANSITION_TRIGGERS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTransitionTrigger> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransitionTrigger.Converter converter = DivTransitionTrigger.f40582c;
                return JsonParser.m17332x(jSONObject2, str2, DivTransitionTrigger.f40583d, DivSelectTemplate.f38361H0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        DivSelectTemplate$Companion$TYPE_READER$1 divSelectTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$TYPE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                Object m17742d = C3033a.m17742d(str2, "key", jSONObject2, "json", parsingEnvironment, "env", jSONObject2, str2);
                if (m17742d != null) {
                    return (String) m17742d;
                }
                throw ParsingExceptionKt.m17523h(jSONObject2, str2);
            }
        };
        f38434t1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$VALUE_VARIABLE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return (String) JsonParser.m17311c(jSONObject2, str2, DivSelectTemplate.f38364K0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f38436u1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$VISIBILITY_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivVisibility> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivVisibility.Converter converter = DivVisibility.f40930c;
                Function1<String, DivVisibility> function1 = DivVisibility.f40931d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivVisibility> expression = DivSelectTemplate.f38393Z;
                Expression<DivVisibility> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivSelectTemplate.f38407g0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f38438v1 = new Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$VISIBILITY_ACTION_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivVisibilityAction mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivVisibilityAction.Companion companion3 = DivVisibilityAction.f40938i;
                return (DivVisibilityAction) JsonParser.m17322n(jSONObject2, str2, DivVisibilityAction.f40946q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f38440w1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$VISIBILITY_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivVisibilityAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivVisibilityAction.Companion companion3 = DivVisibilityAction.f40938i;
                return JsonParser.m17333y(jSONObject2, str2, DivVisibilityAction.f40946q, DivSelectTemplate.f38366L0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f38442x1 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$WIDTH_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivSelectTemplate.f38395a0 : divSize;
            }
        };
        DivSelectTemplate$Companion$CREATOR$1 divSelectTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivSelectTemplate>() { // from class: com.yandex.div2.DivSelectTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivSelectTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivSelectTemplate(env, null, false, it);
            }
        };
    }

    public DivSelectTemplate(@NotNull ParsingEnvironment env, @Nullable DivSelectTemplate divSelectTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        Field<DivAccessibilityTemplate> field = divSelectTemplate == null ? null : divSelectTemplate.f38456a;
        DivAccessibilityTemplate.Companion companion = DivAccessibilityTemplate.f34515g;
        this.f38456a = JsonTemplateParser.m17354o(json, "accessibility", z, field, DivAccessibilityTemplate.f34531w, f34328a, env);
        Field<Expression<DivAlignmentHorizontal>> field2 = divSelectTemplate == null ? null : divSelectTemplate.f38457b;
        DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
        this.f38457b = JsonTemplateParser.m17358s(json, "alignment_horizontal", z, field2, DivAlignmentHorizontal.f34618d, f34328a, env, f38397b0);
        Field<Expression<DivAlignmentVertical>> field3 = divSelectTemplate == null ? null : divSelectTemplate.f38458c;
        DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
        this.f38458c = JsonTemplateParser.m17358s(json, "alignment_vertical", z, field3, DivAlignmentVertical.f34626d, f34328a, env, f38399c0);
        Field<Expression<Double>> field4 = divSelectTemplate == null ? null : divSelectTemplate.f38459d;
        Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
        ValueValidator<Double> valueValidator = f38409h0;
        TypeHelper<Double> typeHelper = TypeHelpersKt.f33851d;
        this.f38459d = JsonTemplateParser.m17357r(json, "alpha", z, field4, function1, valueValidator, f34328a, env, typeHelper);
        Field<List<DivBackgroundTemplate>> field5 = divSelectTemplate == null ? null : divSelectTemplate.f38460e;
        DivBackgroundTemplate.Companion companion2 = DivBackgroundTemplate.f34758a;
        this.f38460e = JsonTemplateParser.m17360u(json, "background", z, field5, DivBackgroundTemplate.f34759b, f38415k0, f34328a, env);
        Field<DivBorderTemplate> field6 = divSelectTemplate == null ? null : divSelectTemplate.f38461f;
        DivBorderTemplate.Companion companion3 = DivBorderTemplate.f34795f;
        this.f38461f = JsonTemplateParser.m17354o(json, "border", z, field6, DivBorderTemplate.f34804o, f34328a, env);
        Field<Expression<Long>> field7 = divSelectTemplate == null ? null : divSelectTemplate.f38462g;
        Function1<Number, Long> function12 = ParsingConvertersKt.f33831e;
        ValueValidator<Long> valueValidator2 = f38417l0;
        TypeHelper<Long> typeHelper2 = TypeHelpersKt.f33849b;
        this.f38462g = JsonTemplateParser.m17357r(json, "column_span", z, field7, function12, valueValidator2, f34328a, env, typeHelper2);
        Field<List<DivDisappearActionTemplate>> field8 = divSelectTemplate == null ? null : divSelectTemplate.f38463h;
        DivDisappearActionTemplate.Companion companion4 = DivDisappearActionTemplate.f35550i;
        this.f38463h = JsonTemplateParser.m17360u(json, "disappear_actions", z, field8, DivDisappearActionTemplate.f35549C, f38423o0, f34328a, env);
        Field<List<DivExtensionTemplate>> field9 = divSelectTemplate == null ? null : divSelectTemplate.f38464i;
        DivExtensionTemplate.Companion companion5 = DivExtensionTemplate.f35664c;
        this.f38464i = JsonTemplateParser.m17360u(json, "extensions", z, field9, DivExtensionTemplate.f35667f, f38427q0, f34328a, env);
        Field<DivFocusTemplate> field10 = divSelectTemplate == null ? null : divSelectTemplate.f38465j;
        DivFocusTemplate.Companion companion6 = DivFocusTemplate.f35833f;
        this.f38465j = JsonTemplateParser.m17354o(json, "focus", z, field10, DivFocusTemplate.f35846s, f34328a, env);
        Field<Expression<DivFontFamily>> field11 = divSelectTemplate == null ? null : divSelectTemplate.f38466k;
        DivFontFamily.Converter converter3 = DivFontFamily.f35876c;
        this.f38466k = JsonTemplateParser.m17358s(json, "font_family", z, field11, DivFontFamily.f35877d, f34328a, env, f38401d0);
        this.f38467l = JsonTemplateParser.m17357r(json, "font_size", z, divSelectTemplate == null ? null : divSelectTemplate.f38467l, function12, f38429r0, f34328a, env, typeHelper2);
        Field<Expression<DivSizeUnit>> field12 = divSelectTemplate == null ? null : divSelectTemplate.f38468m;
        DivSizeUnit.Converter converter4 = DivSizeUnit.f38845c;
        this.f38468m = JsonTemplateParser.m17358s(json, "font_size_unit", z, field12, DivSizeUnit.f38846d, f34328a, env, f38403e0);
        Field<Expression<DivFontWeight>> field13 = divSelectTemplate == null ? null : divSelectTemplate.f38469n;
        DivFontWeight.Converter converter5 = DivFontWeight.f35883c;
        this.f38469n = JsonTemplateParser.m17358s(json, "font_weight", z, field13, DivFontWeight.f35884d, f34328a, env, f38405f0);
        Field<DivSizeTemplate> field14 = divSelectTemplate == null ? null : divSelectTemplate.f38470o;
        DivSizeTemplate.Companion companion7 = DivSizeTemplate.f38839a;
        Function2<ParsingEnvironment, JSONObject, DivSizeTemplate> function2 = DivSizeTemplate.f38840b;
        this.f38470o = JsonTemplateParser.m17354o(json, "height", z, field14, function2, f34328a, env);
        Field<Expression<Integer>> field15 = divSelectTemplate == null ? null : divSelectTemplate.f38471p;
        Function1<Object, Integer> function13 = ParsingConvertersKt.f33827a;
        TypeHelper<Integer> typeHelper3 = TypeHelpersKt.f33853f;
        this.f38471p = JsonTemplateParser.m17358s(json, "hint_color", z, field15, function13, f34328a, env, typeHelper3);
        this.f38472q = JsonTemplateParser.m17355p(json, "hint_text", z, divSelectTemplate == null ? null : divSelectTemplate.f38472q, f38433t0, f34328a, env, TypeHelpersKt.f33850c);
        this.f38473r = JsonTemplateParser.m17351l(json, "id", z, divSelectTemplate == null ? null : divSelectTemplate.f38473r, f38437v0, f34328a, env);
        this.f38474s = JsonTemplateParser.m17358s(json, "letter_spacing", z, divSelectTemplate == null ? null : divSelectTemplate.f38474s, function1, f34328a, env, typeHelper);
        this.f38475t = JsonTemplateParser.m17357r(json, "line_height", z, divSelectTemplate == null ? null : divSelectTemplate.f38475t, function12, f38441x0, f34328a, env, typeHelper2);
        Field<DivEdgeInsetsTemplate> field16 = divSelectTemplate == null ? null : divSelectTemplate.f38476u;
        DivEdgeInsetsTemplate.Companion companion8 = DivEdgeInsetsTemplate.f35626f;
        Function2<ParsingEnvironment, JSONObject, DivEdgeInsetsTemplate> function22 = DivEdgeInsetsTemplate.f35646z;
        this.f38476u = JsonTemplateParser.m17354o(json, "margins", z, field16, function22, f34328a, env);
        Field<List<OptionTemplate>> field17 = divSelectTemplate == null ? null : divSelectTemplate.f38477v;
        OptionTemplate.Companion companion9 = OptionTemplate.f38527c;
        this.f38477v = JsonTemplateParser.m17350k(json, "options", z, field17, OptionTemplate.f38530f, f38354A0, f34328a, env);
        this.f38478w = JsonTemplateParser.m17354o(json, "paddings", z, divSelectTemplate == null ? null : divSelectTemplate.f38478w, function22, f34328a, env);
        this.f38479x = JsonTemplateParser.m17357r(json, "row_span", z, divSelectTemplate == null ? null : divSelectTemplate.f38479x, function12, f38355B0, f34328a, env, typeHelper2);
        Field<List<DivActionTemplate>> field18 = divSelectTemplate == null ? null : divSelectTemplate.f38480y;
        DivActionTemplate.Companion companion10 = DivActionTemplate.f34572i;
        this.f38480y = JsonTemplateParser.m17360u(json, "selected_actions", z, field18, DivActionTemplate.f34586w, f38358E0, f34328a, env);
        this.f38481z = JsonTemplateParser.m17358s(json, "text_color", z, divSelectTemplate == null ? null : divSelectTemplate.f38481z, function13, f34328a, env, typeHelper3);
        Field<List<DivTooltipTemplate>> field19 = divSelectTemplate == null ? null : divSelectTemplate.f38445A;
        DivTooltipTemplate.Companion companion11 = DivTooltipTemplate.f40520h;
        this.f38445A = JsonTemplateParser.m17360u(json, "tooltips", z, field19, DivTooltipTemplate.f40534v, f38360G0, f34328a, env);
        Field<DivTransformTemplate> field20 = divSelectTemplate == null ? null : divSelectTemplate.f38446B;
        DivTransformTemplate.Companion companion12 = DivTransformTemplate.f40559d;
        this.f38446B = JsonTemplateParser.m17354o(json, "transform", z, field20, DivTransformTemplate.f40565j, f34328a, env);
        Field<DivChangeTransitionTemplate> field21 = divSelectTemplate == null ? null : divSelectTemplate.f38447C;
        DivChangeTransitionTemplate.Companion companion13 = DivChangeTransitionTemplate.f34861a;
        this.f38447C = JsonTemplateParser.m17354o(json, "transition_change", z, field21, DivChangeTransitionTemplate.f34862b, f34328a, env);
        Field<DivAppearanceTransitionTemplate> field22 = divSelectTemplate == null ? null : divSelectTemplate.f38448D;
        DivAppearanceTransitionTemplate.Companion companion14 = DivAppearanceTransitionTemplate.f34733a;
        Function2<ParsingEnvironment, JSONObject, DivAppearanceTransitionTemplate> function23 = DivAppearanceTransitionTemplate.f34734b;
        this.f38448D = JsonTemplateParser.m17354o(json, "transition_in", z, field22, function23, f34328a, env);
        this.f38449E = JsonTemplateParser.m17354o(json, "transition_out", z, divSelectTemplate == null ? null : divSelectTemplate.f38449E, function23, f34328a, env);
        Field<List<DivTransitionTrigger>> field23 = divSelectTemplate == null ? null : divSelectTemplate.f38450F;
        DivTransitionTrigger.Converter converter6 = DivTransitionTrigger.f40582c;
        this.f38450F = JsonTemplateParser.m17359t(json, "transition_triggers", z, field23, DivTransitionTrigger.f40583d, f38362I0, f34328a, env);
        this.f38451G = JsonTemplateParser.m17341b(json, "value_variable", z, divSelectTemplate == null ? null : divSelectTemplate.f38451G, f38363J0, f34328a, env);
        Field<Expression<DivVisibility>> field24 = divSelectTemplate == null ? null : divSelectTemplate.f38452H;
        DivVisibility.Converter converter7 = DivVisibility.f40930c;
        this.f38452H = JsonTemplateParser.m17358s(json, "visibility", z, field24, DivVisibility.f40931d, f34328a, env, f38407g0);
        Field<DivVisibilityActionTemplate> field25 = divSelectTemplate == null ? null : divSelectTemplate.f38453I;
        DivVisibilityActionTemplate.Companion companion15 = DivVisibilityActionTemplate.f40959i;
        Function2<ParsingEnvironment, JSONObject, DivVisibilityActionTemplate> function24 = DivVisibilityActionTemplate.f40958C;
        this.f38453I = JsonTemplateParser.m17354o(json, "visibility_action", z, field25, function24, f34328a, env);
        this.f38454J = JsonTemplateParser.m17360u(json, "visibility_actions", z, divSelectTemplate == null ? null : divSelectTemplate.f38454J, function24, f38368M0, f34328a, env);
        this.f38455K = JsonTemplateParser.m17354o(json, "width", z, divSelectTemplate == null ? null : divSelectTemplate.f38455K, function2, f34328a, env);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivSelect mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        DivAccessibility divAccessibility = (DivAccessibility) FieldKt.m17381g(this.f38456a, env, "accessibility", data, f38370N0);
        if (divAccessibility == null) {
            divAccessibility = f38365L;
        }
        DivAccessibility divAccessibility2 = divAccessibility;
        Expression expression = (Expression) FieldKt.m17378d(this.f38457b, env, "alignment_horizontal", data, f38372O0);
        Expression expression2 = (Expression) FieldKt.m17378d(this.f38458c, env, "alignment_vertical", data, f38374P0);
        Expression<Double> expression3 = (Expression) FieldKt.m17378d(this.f38459d, env, "alpha", data, f38376Q0);
        if (expression3 == null) {
            expression3 = f38367M;
        }
        Expression<Double> expression4 = expression3;
        List m17382h = FieldKt.m17382h(this.f38460e, env, "background", data, f38413j0, f38378R0);
        DivBorder divBorder = (DivBorder) FieldKt.m17381g(this.f38461f, env, "border", data, f38380S0);
        if (divBorder == null) {
            divBorder = f38369N;
        }
        DivBorder divBorder2 = divBorder;
        Expression expression5 = (Expression) FieldKt.m17378d(this.f38462g, env, "column_span", data, f38382T0);
        List m17382h2 = FieldKt.m17382h(this.f38463h, env, "disappear_actions", data, f38421n0, f38384U0);
        List m17382h3 = FieldKt.m17382h(this.f38464i, env, "extensions", data, f38425p0, f38386V0);
        DivFocus divFocus = (DivFocus) FieldKt.m17381g(this.f38465j, env, "focus", data, f38388W0);
        Expression<DivFontFamily> expression6 = (Expression) FieldKt.m17378d(this.f38466k, env, "font_family", data, f38390X0);
        if (expression6 == null) {
            expression6 = f38371O;
        }
        Expression<DivFontFamily> expression7 = expression6;
        Expression<Long> expression8 = (Expression) FieldKt.m17378d(this.f38467l, env, "font_size", data, f38392Y0);
        if (expression8 == null) {
            expression8 = f38373P;
        }
        Expression<Long> expression9 = expression8;
        Expression<DivSizeUnit> expression10 = (Expression) FieldKt.m17378d(this.f38468m, env, "font_size_unit", data, f38394Z0);
        if (expression10 == null) {
            expression10 = f38375Q;
        }
        Expression<DivSizeUnit> expression11 = expression10;
        Expression<DivFontWeight> expression12 = (Expression) FieldKt.m17378d(this.f38469n, env, "font_weight", data, f38396a1);
        if (expression12 == null) {
            expression12 = f38377R;
        }
        Expression<DivFontWeight> expression13 = expression12;
        DivSize divSize = (DivSize) FieldKt.m17381g(this.f38470o, env, "height", data, f38398b1);
        if (divSize == null) {
            divSize = f38379S;
        }
        DivSize divSize2 = divSize;
        Expression<Integer> expression14 = (Expression) FieldKt.m17378d(this.f38471p, env, "hint_color", data, f38400c1);
        if (expression14 == null) {
            expression14 = f38381T;
        }
        Expression<Integer> expression15 = expression14;
        Expression expression16 = (Expression) FieldKt.m17378d(this.f38472q, env, "hint_text", data, f38402d1);
        String str = (String) FieldKt.m17378d(this.f38473r, env, "id", data, f38404e1);
        Expression<Double> expression17 = (Expression) FieldKt.m17378d(this.f38474s, env, "letter_spacing", data, f38406f1);
        if (expression17 == null) {
            expression17 = f38383U;
        }
        Expression<Double> expression18 = expression17;
        Expression expression19 = (Expression) FieldKt.m17378d(this.f38475t, env, "line_height", data, f38408g1);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) FieldKt.m17381g(this.f38476u, env, "margins", data, f38410h1);
        if (divEdgeInsets == null) {
            divEdgeInsets = f38385V;
        }
        DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
        List m17384j = FieldKt.m17384j(this.f38477v, env, "options", data, f38444z0, f38412i1);
        DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) FieldKt.m17381g(this.f38478w, env, "paddings", data, f38414j1);
        if (divEdgeInsets3 == null) {
            divEdgeInsets3 = f38387W;
        }
        DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
        Expression expression20 = (Expression) FieldKt.m17378d(this.f38479x, env, "row_span", data, f38416k1);
        List m17382h4 = FieldKt.m17382h(this.f38480y, env, "selected_actions", data, f38357D0, f38418l1);
        Expression<Integer> expression21 = (Expression) FieldKt.m17378d(this.f38481z, env, "text_color", data, f38420m1);
        if (expression21 == null) {
            expression21 = f38389X;
        }
        Expression<Integer> expression22 = expression21;
        List m17382h5 = FieldKt.m17382h(this.f38445A, env, "tooltips", data, f38359F0, f38422n1);
        DivTransform divTransform = (DivTransform) FieldKt.m17381g(this.f38446B, env, "transform", data, f38424o1);
        if (divTransform == null) {
            divTransform = f38391Y;
        }
        DivTransform divTransform2 = divTransform;
        DivChangeTransition divChangeTransition = (DivChangeTransition) FieldKt.m17381g(this.f38447C, env, "transition_change", data, f38426p1);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) FieldKt.m17381g(this.f38448D, env, "transition_in", data, f38428q1);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) FieldKt.m17381g(this.f38449E, env, "transition_out", data, f38430r1);
        List m17380f = FieldKt.m17380f(this.f38450F, env, "transition_triggers", data, f38361H0, f38432s1);
        String str2 = (String) FieldKt.m17376b(this.f38451G, env, "value_variable", data, f38434t1);
        Expression<DivVisibility> expression23 = (Expression) FieldKt.m17378d(this.f38452H, env, "visibility", data, f38436u1);
        if (expression23 == null) {
            expression23 = f38393Z;
        }
        Expression<DivVisibility> expression24 = expression23;
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) FieldKt.m17381g(this.f38453I, env, "visibility_action", data, f38438v1);
        List m17382h6 = FieldKt.m17382h(this.f38454J, env, "visibility_actions", data, f38366L0, f38440w1);
        DivSize divSize3 = (DivSize) FieldKt.m17381g(this.f38455K, env, "width", data, f38442x1);
        if (divSize3 == null) {
            divSize3 = f38395a0;
        }
        return new DivSelect(divAccessibility2, expression, expression2, expression4, m17382h, divBorder2, expression5, m17382h2, m17382h3, divFocus, expression7, expression9, expression11, expression13, divSize2, expression15, expression16, str, expression18, expression19, divEdgeInsets2, m17384j, divEdgeInsets4, expression20, m17382h4, expression22, m17382h5, divTransform2, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17380f, str2, expression24, divVisibilityAction, m17382h6, divSize3);
    }
}
