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
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivFixedSizeTemplate;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivFocusTemplate;
import com.yandex.div2.DivIndicator;
import com.yandex.div2.DivIndicatorItemPlacement;
import com.yandex.div2.DivIndicatorItemPlacementTemplate;
import com.yandex.div2.DivRoundedRectangleShape;
import com.yandex.div2.DivRoundedRectangleShapeTemplate;
import com.yandex.div2.DivShape;
import com.yandex.div2.DivShapeTemplate;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeTemplate;
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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivIndicatorTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivIndicatorTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivIndicator;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivIndicatorTemplate implements JSONSerializable, JsonTemplate<DivIndicator> {

    /* renamed from: A0 */
    @NotNull
    public static final ListValidator<DivTooltip> f37109A0;

    /* renamed from: B0 */
    @NotNull
    public static final ListValidator<DivTooltipTemplate> f37110B0;

    /* renamed from: C0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f37111C0;

    /* renamed from: D0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f37112D0;

    /* renamed from: E0 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f37113E0;

    /* renamed from: F0 */
    @NotNull
    public static final ListValidator<DivVisibilityActionTemplate> f37114F0;

    /* renamed from: G0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAccessibility> f37115G0;

    /* renamed from: H0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>> f37116H0;

    /* renamed from: I0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f37117I0;

    /* renamed from: J0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivRoundedRectangleShape> f37118J0;

    /* renamed from: K0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>> f37119K0;

    /* renamed from: L0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>> f37120L0;

    /* renamed from: M */
    @NotNull
    public static final DivAccessibility f37121M = new DivAccessibility(null, null, null, null, null, null, 63);

    /* renamed from: M0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f37122M0;

    /* renamed from: N */
    @NotNull
    public static final Expression<Integer> f37123N;

    /* renamed from: N0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivIndicator.Animation>> f37124N0;

    /* renamed from: O */
    @NotNull
    public static final Expression<Double> f37125O;

    /* renamed from: O0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>> f37126O0;

    /* renamed from: P */
    @NotNull
    public static final Expression<Double> f37127P;

    /* renamed from: P0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivBorder> f37128P0;

    /* renamed from: Q */
    @NotNull
    public static final Expression<DivIndicator.Animation> f37129Q;

    /* renamed from: Q0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f37130Q0;

    /* renamed from: R */
    @NotNull
    public static final DivBorder f37131R;

    /* renamed from: R0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>> f37132R0;

    /* renamed from: S */
    @NotNull
    public static final DivSize.WrapContent f37133S;

    /* renamed from: S0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>> f37134S0;

    /* renamed from: T */
    @NotNull
    public static final Expression<Integer> f37135T;

    /* renamed from: T0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivFocus> f37136T0;

    /* renamed from: U */
    @NotNull
    public static final DivEdgeInsets f37137U;

    /* renamed from: U0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f37138U0;

    /* renamed from: V */
    @NotNull
    public static final Expression<Double> f37139V;

    /* renamed from: V0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f37140V0;

    /* renamed from: W */
    @NotNull
    public static final DivEdgeInsets f37141W;

    /* renamed from: W0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>> f37142W0;

    /* renamed from: X */
    @NotNull
    public static final DivShape.RoundedRectangle f37143X;

    /* renamed from: X0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivRoundedRectangleShape> f37144X0;

    /* renamed from: Y */
    @NotNull
    public static final DivFixedSize f37145Y;

    /* renamed from: Y0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivRoundedRectangleShape> f37146Y0;

    /* renamed from: Z */
    @NotNull
    public static final DivTransform f37147Z;

    /* renamed from: Z0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivIndicatorItemPlacement> f37148Z0;

    /* renamed from: a0 */
    @NotNull
    public static final Expression<DivVisibility> f37149a0;

    /* renamed from: a1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f37150a1;

    /* renamed from: b0 */
    @NotNull
    public static final DivSize.MatchParent f37151b0;

    /* renamed from: b1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f37152b1;

    /* renamed from: c0 */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f37153c0;

    /* renamed from: c1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f37154c1;

    /* renamed from: d0 */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f37155d0;

    /* renamed from: d1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f37156d1;

    /* renamed from: e0 */
    @NotNull
    public static final TypeHelper<DivIndicator.Animation> f37157e0;

    /* renamed from: e1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f37158e1;

    /* renamed from: f0 */
    @NotNull
    public static final TypeHelper<DivVisibility> f37159f0;

    /* renamed from: f1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f37160f1;

    /* renamed from: g0 */
    @NotNull
    public static final ValueValidator<Double> f37161g0;

    /* renamed from: g1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivShape> f37162g1;

    /* renamed from: h0 */
    @NotNull
    public static final ValueValidator<Double> f37163h0;

    /* renamed from: h1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivFixedSize> f37164h1;

    /* renamed from: i0 */
    @NotNull
    public static final ValueValidator<Double> f37165i0;

    /* renamed from: i1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>> f37166i1;

    /* renamed from: j0 */
    @NotNull
    public static final ValueValidator<Double> f37167j0;

    /* renamed from: j1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivTransform> f37168j1;

    /* renamed from: k0 */
    @NotNull
    public static final ListValidator<DivBackground> f37169k0;

    /* renamed from: k1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition> f37170k1;

    /* renamed from: l0 */
    @NotNull
    public static final ListValidator<DivBackgroundTemplate> f37171l0;

    /* renamed from: l1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f37172l1;

    /* renamed from: m0 */
    @NotNull
    public static final ValueValidator<Long> f37173m0;

    /* renamed from: m1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f37174m1;

    /* renamed from: n0 */
    @NotNull
    public static final ValueValidator<Long> f37175n0;

    /* renamed from: n1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>> f37176n1;

    /* renamed from: o0 */
    @NotNull
    public static final ListValidator<DivDisappearAction> f37177o0;

    /* renamed from: o1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>> f37178o1;

    /* renamed from: p0 */
    @NotNull
    public static final ListValidator<DivDisappearActionTemplate> f37179p0;

    /* renamed from: p1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction> f37180p1;

    /* renamed from: q0 */
    @NotNull
    public static final ListValidator<DivExtension> f37181q0;

    /* renamed from: q1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>> f37182q1;

    /* renamed from: r0 */
    @NotNull
    public static final ListValidator<DivExtensionTemplate> f37183r0;

    /* renamed from: r1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f37184r1;

    /* renamed from: s0 */
    @NotNull
    public static final ValueValidator<String> f37185s0;

    /* renamed from: t0 */
    @NotNull
    public static final ValueValidator<String> f37186t0;

    /* renamed from: u0 */
    @NotNull
    public static final ValueValidator<Double> f37187u0;

    /* renamed from: v0 */
    @NotNull
    public static final ValueValidator<Double> f37188v0;

    /* renamed from: w0 */
    @NotNull
    public static final ValueValidator<Long> f37189w0;

    /* renamed from: x0 */
    @NotNull
    public static final ValueValidator<Long> f37190x0;

    /* renamed from: y0 */
    @NotNull
    public static final ListValidator<DivAction> f37191y0;

    /* renamed from: z0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f37192z0;

    /* renamed from: A */
    @JvmField
    @NotNull
    public final Field<DivShapeTemplate> f37193A;

    /* renamed from: B */
    @JvmField
    @NotNull
    public final Field<DivFixedSizeTemplate> f37194B;

    /* renamed from: C */
    @JvmField
    @NotNull
    public final Field<List<DivTooltipTemplate>> f37195C;

    /* renamed from: D */
    @JvmField
    @NotNull
    public final Field<DivTransformTemplate> f37196D;

    /* renamed from: E */
    @JvmField
    @NotNull
    public final Field<DivChangeTransitionTemplate> f37197E;

    /* renamed from: F */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f37198F;

    /* renamed from: G */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f37199G;

    /* renamed from: H */
    @JvmField
    @NotNull
    public final Field<List<DivTransitionTrigger>> f37200H;

    /* renamed from: I */
    @JvmField
    @NotNull
    public final Field<Expression<DivVisibility>> f37201I;

    /* renamed from: J */
    @JvmField
    @NotNull
    public final Field<DivVisibilityActionTemplate> f37202J;

    /* renamed from: K */
    @JvmField
    @NotNull
    public final Field<List<DivVisibilityActionTemplate>> f37203K;

    /* renamed from: L */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f37204L;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<DivAccessibilityTemplate> f37205a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Expression<Integer>> f37206b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f37207c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<DivRoundedRectangleShapeTemplate> f37208d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f37209e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f37210f;

    /* renamed from: g */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f37211g;

    /* renamed from: h */
    @JvmField
    @NotNull
    public final Field<Expression<DivIndicator.Animation>> f37212h;

    /* renamed from: i */
    @JvmField
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f37213i;

    /* renamed from: j */
    @JvmField
    @NotNull
    public final Field<DivBorderTemplate> f37214j;

    /* renamed from: k */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f37215k;

    /* renamed from: l */
    @JvmField
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f37216l;

    /* renamed from: m */
    @JvmField
    @NotNull
    public final Field<List<DivExtensionTemplate>> f37217m;

    /* renamed from: n */
    @JvmField
    @NotNull
    public final Field<DivFocusTemplate> f37218n;

    /* renamed from: o */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f37219o;

    /* renamed from: p */
    @JvmField
    @NotNull
    public final Field<String> f37220p;

    /* renamed from: q */
    @JvmField
    @NotNull
    public final Field<Expression<Integer>> f37221q;

    /* renamed from: r */
    @JvmField
    @NotNull
    public final Field<DivRoundedRectangleShapeTemplate> f37222r;

    /* renamed from: s */
    @JvmField
    @NotNull
    public final Field<DivRoundedRectangleShapeTemplate> f37223s;

    /* renamed from: t */
    @JvmField
    @NotNull
    public final Field<DivIndicatorItemPlacementTemplate> f37224t;

    /* renamed from: u */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f37225u;

    /* renamed from: v */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f37226v;

    /* renamed from: w */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f37227w;

    /* renamed from: x */
    @JvmField
    @NotNull
    public final Field<String> f37228x;

    /* renamed from: y */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f37229y;

    /* renamed from: z */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f37230z;

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\bR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\rR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\rR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0017R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0017R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0017R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0017R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\rR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020+0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\rR\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\bR\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\bR\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\rR\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\rR\u0014\u00105\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00101R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\rR\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\rR\u001a\u00109\u001a\b\u0012\u0004\u0012\u0002080\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0017R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0017R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010\u0017R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010\u0017R\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010\u0017R\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020I0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010\u0017R\u0014\u0010L\u001a\u00020+8\u0006X\u0086T¢\u0006\u0006\n\u0004\bL\u0010MR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020O0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020R0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010QR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00120N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010QR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020U0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010QR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020W0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010\u0017R\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010\u0017R\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020U0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\bR\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^¨\u0006_"}, m31884d2 = {"Lcom/yandex/div2/DivIndicatorTemplate$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/json/expressions/Expression;", "", "ACTIVE_ITEM_COLOR_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "", "ACTIVE_ITEM_SIZE_DEFAULT_VALUE", "Lcom/yandex/div/internal/parser/ValueValidator;", "ACTIVE_ITEM_SIZE_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ACTIVE_ITEM_SIZE_VALIDATOR", "ALPHA_DEFAULT_VALUE", "ALPHA_TEMPLATE_VALIDATOR", "ALPHA_VALIDATOR", "Lcom/yandex/div2/DivIndicator$Animation;", "ANIMATION_DEFAULT_VALUE", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackgroundTemplate;", "BACKGROUND_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivDisappearActionTemplate;", "DISAPPEAR_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivExtensionTemplate;", "EXTENSIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "INACTIVE_ITEM_COLOR_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "MINIMUM_ITEM_SIZE_DEFAULT_VALUE", "MINIMUM_ITEM_SIZE_TEMPLATE_VALIDATOR", "MINIMUM_ITEM_SIZE_VALIDATOR", "PADDINGS_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "Lcom/yandex/div2/DivActionTemplate;", "SELECTED_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivAction;", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivShape$RoundedRectangle;", "SHAPE_DEFAULT_VALUE", "Lcom/yandex/div2/DivShape$RoundedRectangle;", "Lcom/yandex/div2/DivFixedSize;", "SPACE_BETWEEN_CENTERS_DEFAULT_VALUE", "Lcom/yandex/div2/DivFixedSize;", "Lcom/yandex/div2/DivTooltipTemplate;", "TOOLTIPS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_TEMPLATE_VALIDATOR", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "TYPE_HELPER_ANIMATION", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/DivVisibilityActionTemplate;", "VISIBILITY_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f37123N = companion.m17539a(16768096);
        f37125O = companion.m17539a(Double.valueOf(1.3d));
        f37127P = companion.m17539a(Double.valueOf(1.0d));
        f37129Q = companion.m17539a(DivIndicator.Animation.SCALE);
        f37131R = new DivBorder(null, null, null, null, null, 31);
        f37133S = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7));
        f37135T = companion.m17539a(865180853);
        f37137U = new DivEdgeInsets(null, null, null, null, null, 31);
        f37139V = companion.m17539a(Double.valueOf(0.5d));
        f37141W = new DivEdgeInsets(null, null, null, null, null, 31);
        f37143X = new DivShape.RoundedRectangle(new DivRoundedRectangleShape(null, null, null, null, null, 31));
        f37145Y = new DivFixedSize(null, companion.m17539a(15L), 1);
        f37147Z = new DivTransform(null, null, null, 7);
        f37149a0 = companion.m17539a(DivVisibility.VISIBLE);
        f37151b0 = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i2 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f37153c0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f37155d0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f37157e0 = companion2.m17372a(ArraysKt.m31926B(DivIndicator.Animation.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$TYPE_HELPER_ANIMATION$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivIndicator.Animation);
            }
        });
        f37159f0 = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f37161g0 = C3071t.f42042g;
        f37163h0 = C3071t.f42049n;
        f37165i0 = C3071t.f42050o;
        f37167j0 = C3071t.f42051p;
        f37169k0 = C3072u.f42068d;
        f37171l0 = C3072u.f42069e;
        f37173m0 = C3071t.f42052q;
        f37175n0 = C3071t.f42053r;
        f37177o0 = C3072u.f42070f;
        f37179p0 = C3072u.f42071g;
        f37181q0 = C3069s.f42024x;
        f37183r0 = C3069s.f42025y;
        f37185s0 = C3071t.f42043h;
        f37186t0 = C3071t.f42044i;
        f37187u0 = C3071t.f42045j;
        f37188v0 = C3071t.f42046k;
        f37189w0 = C3071t.f42047l;
        f37190x0 = C3071t.f42048m;
        f37191y0 = C3069s.f42026z;
        f37192z0 = C3069s.f41997A;
        f37109A0 = C3069s.f41998B;
        f37110B0 = C3069s.f41999C;
        f37111C0 = C3069s.f42000D;
        f37112D0 = C3069s.f42001E;
        f37113E0 = C3072u.f42066b;
        f37114F0 = C3072u.f42067c;
        f37115G0 = new Function3<String, JSONObject, ParsingEnvironment, DivAccessibility>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$ACCESSIBILITY_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAccessibility mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAccessibility.Companion companion3 = DivAccessibility.f34479f;
                DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject2, str2, DivAccessibility.f34486m, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divAccessibility == null ? DivIndicatorTemplate.f37121M : divAccessibility;
            }
        };
        f37116H0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$ACTIVE_ITEM_COLOR_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Integer> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Object, Integer> function1 = ParsingConvertersKt.f33827a;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Integer> expression = DivIndicatorTemplate.f37123N;
                Expression<Integer> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33853f);
                return m17330v == null ? expression : m17330v;
            }
        };
        f37117I0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$ACTIVE_ITEM_SIZE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
                ValueValidator<Double> valueValidator = DivIndicatorTemplate.f37163h0;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Double> expression = DivIndicatorTemplate.f37125O;
                Expression<Double> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
                return m17328t == null ? expression : m17328t;
            }
        };
        f37118J0 = new Function3<String, JSONObject, ParsingEnvironment, DivRoundedRectangleShape>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$ACTIVE_SHAPE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivRoundedRectangleShape mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivRoundedRectangleShape.Companion companion3 = DivRoundedRectangleShape.f38174f;
                return (DivRoundedRectangleShape) JsonParser.m17322n(jSONObject2, str2, DivRoundedRectangleShape.f38178j, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f37119K0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$ALIGNMENT_HORIZONTAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentHorizontal> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentHorizontal.f34618d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivIndicatorTemplate.f37153c0);
            }
        };
        f37120L0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$ALIGNMENT_VERTICAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentVertical> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentVertical.Converter converter = DivAlignmentVertical.f34625c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentVertical.f34626d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivIndicatorTemplate.f37155d0);
            }
        };
        f37122M0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$ALPHA_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
                ValueValidator<Double> valueValidator = DivIndicatorTemplate.f37167j0;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Double> expression = DivIndicatorTemplate.f37127P;
                Expression<Double> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
                return m17328t == null ? expression : m17328t;
            }
        };
        f37124N0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivIndicator.Animation>>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$ANIMATION_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivIndicator.Animation> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivIndicator.Animation.Converter converter = DivIndicator.Animation.f37086c;
                Function1<String, DivIndicator.Animation> function1 = DivIndicator.Animation.f37087d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivIndicator.Animation> expression = DivIndicatorTemplate.f37129Q;
                Expression<DivIndicator.Animation> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivIndicatorTemplate.f37157e0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f37126O0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$BACKGROUND_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivBackground> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBackground.Companion companion3 = DivBackground.f34750a;
                return JsonParser.m17333y(jSONObject2, str2, DivBackground.f34751b, DivIndicatorTemplate.f37169k0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f37128P0 = new Function3<String, JSONObject, ParsingEnvironment, DivBorder>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$BORDER_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivBorder mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBorder.Companion companion3 = DivBorder.f34785f;
                DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject2, str2, DivBorder.f34788i, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divBorder == null ? DivIndicatorTemplate.f37131R : divBorder;
            }
        };
        f37130Q0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$COLUMN_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivIndicatorTemplate.f37175n0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f37132R0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$DISAPPEAR_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivDisappearAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivDisappearAction.Companion companion3 = DivDisappearAction.f35537a;
                return JsonParser.m17333y(jSONObject2, str2, DivDisappearAction.f35545i, DivIndicatorTemplate.f37177o0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f37134S0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$EXTENSIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivExtension> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivExtension.Companion companion3 = DivExtension.f35659c;
                return JsonParser.m17333y(jSONObject2, str2, DivExtension.f35660d, DivIndicatorTemplate.f37181q0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f37136T0 = new Function3<String, JSONObject, ParsingEnvironment, DivFocus>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$FOCUS_READER$1
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
        f37138U0 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$HEIGHT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivIndicatorTemplate.f37133S : divSize;
            }
        };
        f37140V0 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$ID_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return (String) JsonParser.m17323o(jSONObject2, str2, DivIndicatorTemplate.f37186t0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f37142W0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$INACTIVE_ITEM_COLOR_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Integer> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Object, Integer> function1 = ParsingConvertersKt.f33827a;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Integer> expression = DivIndicatorTemplate.f37135T;
                Expression<Integer> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33853f);
                return m17330v == null ? expression : m17330v;
            }
        };
        f37144X0 = new Function3<String, JSONObject, ParsingEnvironment, DivRoundedRectangleShape>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$INACTIVE_MINIMUM_SHAPE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivRoundedRectangleShape mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivRoundedRectangleShape.Companion companion3 = DivRoundedRectangleShape.f38174f;
                return (DivRoundedRectangleShape) JsonParser.m17322n(jSONObject2, str2, DivRoundedRectangleShape.f38178j, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f37146Y0 = new Function3<String, JSONObject, ParsingEnvironment, DivRoundedRectangleShape>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$INACTIVE_SHAPE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivRoundedRectangleShape mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivRoundedRectangleShape.Companion companion3 = DivRoundedRectangleShape.f38174f;
                return (DivRoundedRectangleShape) JsonParser.m17322n(jSONObject2, str2, DivRoundedRectangleShape.f38178j, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f37148Z0 = new Function3<String, JSONObject, ParsingEnvironment, DivIndicatorItemPlacement>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$ITEMS_PLACEMENT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivIndicatorItemPlacement mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivIndicatorItemPlacement.Companion companion3 = DivIndicatorItemPlacement.f37099a;
                return (DivIndicatorItemPlacement) JsonParser.m17322n(jSONObject2, str2, DivIndicatorItemPlacement.f37100b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f37150a1 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$MARGINS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivIndicatorTemplate.f37137U : divEdgeInsets;
            }
        };
        f37152b1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$MINIMUM_ITEM_SIZE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
                ValueValidator<Double> valueValidator = DivIndicatorTemplate.f37188v0;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Double> expression = DivIndicatorTemplate.f37139V;
                Expression<Double> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
                return m17328t == null ? expression : m17328t;
            }
        };
        f37154c1 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$PADDINGS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivIndicatorTemplate.f37141W : divEdgeInsets;
            }
        };
        f37156d1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$PAGER_ID_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                Object m17742d = C3033a.m17742d(str2, "key", jSONObject2, "json", parsingEnvironment, "env", jSONObject2, str2);
                if (m17742d == null) {
                    m17742d = null;
                }
                return (String) m17742d;
            }
        };
        f37158e1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$ROW_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivIndicatorTemplate.f37190x0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f37160f1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$SELECTED_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivIndicatorTemplate.f37191y0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f37162g1 = new Function3<String, JSONObject, ParsingEnvironment, DivShape>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$SHAPE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivShape mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivShape.Companion companion3 = DivShape.f38807a;
                DivShape divShape = (DivShape) JsonParser.m17322n(jSONObject2, str2, DivShape.f38808b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divShape == null ? DivIndicatorTemplate.f37143X : divShape;
            }
        };
        f37164h1 = new Function3<String, JSONObject, ParsingEnvironment, DivFixedSize>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$SPACE_BETWEEN_CENTERS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivFixedSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivFixedSize.Companion companion3 = DivFixedSize.f35789c;
                DivFixedSize divFixedSize = (DivFixedSize) JsonParser.m17322n(jSONObject2, str2, DivFixedSize.f35793g, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divFixedSize == null ? DivIndicatorTemplate.f37145Y : divFixedSize;
            }
        };
        f37166i1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$TOOLTIPS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTooltip> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTooltip.Companion companion3 = DivTooltip.f40492h;
                return JsonParser.m17333y(jSONObject2, str2, DivTooltip.f40497m, DivIndicatorTemplate.f37109A0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f37168j1 = new Function3<String, JSONObject, ParsingEnvironment, DivTransform>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$TRANSFORM_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivTransform mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransform.Companion companion3 = DivTransform.f40551d;
                DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject2, str2, DivTransform.f40554g, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divTransform == null ? DivIndicatorTemplate.f37147Z : divTransform;
            }
        };
        f37170k1 = new Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$TRANSITION_CHANGE_READER$1
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
        f37172l1 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$TRANSITION_IN_READER$1
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
        f37174m1 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$TRANSITION_OUT_READER$1
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
        f37176n1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$TRANSITION_TRIGGERS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTransitionTrigger> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransitionTrigger.Converter converter = DivTransitionTrigger.f40582c;
                return JsonParser.m17332x(jSONObject2, str2, DivTransitionTrigger.f40583d, DivIndicatorTemplate.f37111C0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        DivIndicatorTemplate$Companion$TYPE_READER$1 divIndicatorTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$TYPE_READER$1
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
        f37178o1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$VISIBILITY_READER$1
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
                Expression<DivVisibility> expression = DivIndicatorTemplate.f37149a0;
                Expression<DivVisibility> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivIndicatorTemplate.f37159f0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f37180p1 = new Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$VISIBILITY_ACTION_READER$1
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
        f37182q1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$VISIBILITY_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivVisibilityAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivVisibilityAction.Companion companion3 = DivVisibilityAction.f40938i;
                return JsonParser.m17333y(jSONObject2, str2, DivVisibilityAction.f40946q, DivIndicatorTemplate.f37113E0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f37184r1 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$WIDTH_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivIndicatorTemplate.f37151b0 : divSize;
            }
        };
        DivIndicatorTemplate$Companion$CREATOR$1 divIndicatorTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivIndicatorTemplate>() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivIndicatorTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivIndicatorTemplate(env, null, false, it);
            }
        };
    }

    public DivIndicatorTemplate(@NotNull ParsingEnvironment env, @Nullable DivIndicatorTemplate divIndicatorTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        Field<DivAccessibilityTemplate> field = divIndicatorTemplate == null ? null : divIndicatorTemplate.f37205a;
        DivAccessibilityTemplate.Companion companion = DivAccessibilityTemplate.f34515g;
        this.f37205a = JsonTemplateParser.m17354o(json, "accessibility", z, field, DivAccessibilityTemplate.f34531w, f34328a, env);
        Field<Expression<Integer>> field2 = divIndicatorTemplate == null ? null : divIndicatorTemplate.f37206b;
        Function1<Object, Integer> function1 = ParsingConvertersKt.f33827a;
        TypeHelper<Integer> typeHelper = TypeHelpersKt.f33853f;
        this.f37206b = JsonTemplateParser.m17358s(json, "active_item_color", z, field2, function1, f34328a, env, typeHelper);
        Field<Expression<Double>> field3 = divIndicatorTemplate == null ? null : divIndicatorTemplate.f37207c;
        Function1<Number, Double> function12 = ParsingConvertersKt.f33830d;
        ValueValidator<Double> valueValidator = f37161g0;
        TypeHelper<Double> typeHelper2 = TypeHelpersKt.f33851d;
        this.f37207c = JsonTemplateParser.m17357r(json, "active_item_size", z, field3, function12, valueValidator, f34328a, env, typeHelper2);
        Field<DivRoundedRectangleShapeTemplate> field4 = divIndicatorTemplate == null ? null : divIndicatorTemplate.f37208d;
        DivRoundedRectangleShapeTemplate.Companion companion2 = DivRoundedRectangleShapeTemplate.f38185f;
        Function2<ParsingEnvironment, JSONObject, DivRoundedRectangleShapeTemplate> function2 = DivRoundedRectangleShapeTemplate.f38194o;
        this.f37208d = JsonTemplateParser.m17354o(json, "active_shape", z, field4, function2, f34328a, env);
        Field<Expression<DivAlignmentHorizontal>> field5 = divIndicatorTemplate == null ? null : divIndicatorTemplate.f37209e;
        DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
        this.f37209e = JsonTemplateParser.m17358s(json, "alignment_horizontal", z, field5, DivAlignmentHorizontal.f34618d, f34328a, env, f37153c0);
        Field<Expression<DivAlignmentVertical>> field6 = divIndicatorTemplate == null ? null : divIndicatorTemplate.f37210f;
        DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
        this.f37210f = JsonTemplateParser.m17358s(json, "alignment_vertical", z, field6, DivAlignmentVertical.f34626d, f34328a, env, f37155d0);
        this.f37211g = JsonTemplateParser.m17357r(json, "alpha", z, divIndicatorTemplate == null ? null : divIndicatorTemplate.f37211g, function12, f37165i0, f34328a, env, typeHelper2);
        Field<Expression<DivIndicator.Animation>> field7 = divIndicatorTemplate == null ? null : divIndicatorTemplate.f37212h;
        DivIndicator.Animation.Converter converter3 = DivIndicator.Animation.f37086c;
        this.f37212h = JsonTemplateParser.m17358s(json, "animation", z, field7, DivIndicator.Animation.f37087d, f34328a, env, f37157e0);
        Field<List<DivBackgroundTemplate>> field8 = divIndicatorTemplate == null ? null : divIndicatorTemplate.f37213i;
        DivBackgroundTemplate.Companion companion3 = DivBackgroundTemplate.f34758a;
        this.f37213i = JsonTemplateParser.m17360u(json, "background", z, field8, DivBackgroundTemplate.f34759b, f37171l0, f34328a, env);
        Field<DivBorderTemplate> field9 = divIndicatorTemplate == null ? null : divIndicatorTemplate.f37214j;
        DivBorderTemplate.Companion companion4 = DivBorderTemplate.f34795f;
        this.f37214j = JsonTemplateParser.m17354o(json, "border", z, field9, DivBorderTemplate.f34804o, f34328a, env);
        Field<Expression<Long>> field10 = divIndicatorTemplate == null ? null : divIndicatorTemplate.f37215k;
        Function1<Number, Long> function13 = ParsingConvertersKt.f33831e;
        ValueValidator<Long> valueValidator2 = f37173m0;
        TypeHelper<Long> typeHelper3 = TypeHelpersKt.f33849b;
        this.f37215k = JsonTemplateParser.m17357r(json, "column_span", z, field10, function13, valueValidator2, f34328a, env, typeHelper3);
        Field<List<DivDisappearActionTemplate>> field11 = divIndicatorTemplate == null ? null : divIndicatorTemplate.f37216l;
        DivDisappearActionTemplate.Companion companion5 = DivDisappearActionTemplate.f35550i;
        this.f37216l = JsonTemplateParser.m17360u(json, "disappear_actions", z, field11, DivDisappearActionTemplate.f35549C, f37179p0, f34328a, env);
        Field<List<DivExtensionTemplate>> field12 = divIndicatorTemplate == null ? null : divIndicatorTemplate.f37217m;
        DivExtensionTemplate.Companion companion6 = DivExtensionTemplate.f35664c;
        this.f37217m = JsonTemplateParser.m17360u(json, "extensions", z, field12, DivExtensionTemplate.f35667f, f37183r0, f34328a, env);
        Field<DivFocusTemplate> field13 = divIndicatorTemplate == null ? null : divIndicatorTemplate.f37218n;
        DivFocusTemplate.Companion companion7 = DivFocusTemplate.f35833f;
        this.f37218n = JsonTemplateParser.m17354o(json, "focus", z, field13, DivFocusTemplate.f35846s, f34328a, env);
        Field<DivSizeTemplate> field14 = divIndicatorTemplate == null ? null : divIndicatorTemplate.f37219o;
        DivSizeTemplate.Companion companion8 = DivSizeTemplate.f38839a;
        Function2<ParsingEnvironment, JSONObject, DivSizeTemplate> function22 = DivSizeTemplate.f38840b;
        this.f37219o = JsonTemplateParser.m17354o(json, "height", z, field14, function22, f34328a, env);
        this.f37220p = JsonTemplateParser.m17351l(json, "id", z, divIndicatorTemplate == null ? null : divIndicatorTemplate.f37220p, f37185s0, f34328a, env);
        this.f37221q = JsonTemplateParser.m17358s(json, "inactive_item_color", z, divIndicatorTemplate == null ? null : divIndicatorTemplate.f37221q, function1, f34328a, env, typeHelper);
        this.f37222r = JsonTemplateParser.m17354o(json, "inactive_minimum_shape", z, divIndicatorTemplate == null ? null : divIndicatorTemplate.f37222r, function2, f34328a, env);
        this.f37223s = JsonTemplateParser.m17354o(json, "inactive_shape", z, divIndicatorTemplate == null ? null : divIndicatorTemplate.f37223s, function2, f34328a, env);
        Field<DivIndicatorItemPlacementTemplate> field15 = divIndicatorTemplate == null ? null : divIndicatorTemplate.f37224t;
        DivIndicatorItemPlacementTemplate.Companion companion9 = DivIndicatorItemPlacementTemplate.f37104a;
        this.f37224t = JsonTemplateParser.m17354o(json, "items_placement", z, field15, DivIndicatorItemPlacementTemplate.f37105b, f34328a, env);
        Field<DivEdgeInsetsTemplate> field16 = divIndicatorTemplate == null ? null : divIndicatorTemplate.f37225u;
        DivEdgeInsetsTemplate.Companion companion10 = DivEdgeInsetsTemplate.f35626f;
        Function2<ParsingEnvironment, JSONObject, DivEdgeInsetsTemplate> function23 = DivEdgeInsetsTemplate.f35646z;
        this.f37225u = JsonTemplateParser.m17354o(json, "margins", z, field16, function23, f34328a, env);
        this.f37226v = JsonTemplateParser.m17357r(json, "minimum_item_size", z, divIndicatorTemplate == null ? null : divIndicatorTemplate.f37226v, function12, f37187u0, f34328a, env, typeHelper2);
        this.f37227w = JsonTemplateParser.m17354o(json, "paddings", z, divIndicatorTemplate == null ? null : divIndicatorTemplate.f37227w, function23, f34328a, env);
        this.f37228x = JsonTemplateParser.m17352m(json, "pager_id", z, divIndicatorTemplate == null ? null : divIndicatorTemplate.f37228x, f34328a, env);
        this.f37229y = JsonTemplateParser.m17357r(json, "row_span", z, divIndicatorTemplate == null ? null : divIndicatorTemplate.f37229y, function13, f37189w0, f34328a, env, typeHelper3);
        Field<List<DivActionTemplate>> field17 = divIndicatorTemplate == null ? null : divIndicatorTemplate.f37230z;
        DivActionTemplate.Companion companion11 = DivActionTemplate.f34572i;
        this.f37230z = JsonTemplateParser.m17360u(json, "selected_actions", z, field17, DivActionTemplate.f34586w, f37192z0, f34328a, env);
        Field<DivShapeTemplate> field18 = divIndicatorTemplate == null ? null : divIndicatorTemplate.f37193A;
        DivShapeTemplate.Companion companion12 = DivShapeTemplate.f38828a;
        this.f37193A = JsonTemplateParser.m17354o(json, "shape", z, field18, DivShapeTemplate.f38829b, f34328a, env);
        Field<DivFixedSizeTemplate> field19 = divIndicatorTemplate == null ? null : divIndicatorTemplate.f37194B;
        DivFixedSizeTemplate.Companion companion13 = DivFixedSizeTemplate.f35798c;
        this.f37194B = JsonTemplateParser.m17354o(json, "space_between_centers", z, field19, DivFixedSizeTemplate.f35805j, f34328a, env);
        Field<List<DivTooltipTemplate>> field20 = divIndicatorTemplate == null ? null : divIndicatorTemplate.f37195C;
        DivTooltipTemplate.Companion companion14 = DivTooltipTemplate.f40520h;
        this.f37195C = JsonTemplateParser.m17360u(json, "tooltips", z, field20, DivTooltipTemplate.f40534v, f37110B0, f34328a, env);
        Field<DivTransformTemplate> field21 = divIndicatorTemplate == null ? null : divIndicatorTemplate.f37196D;
        DivTransformTemplate.Companion companion15 = DivTransformTemplate.f40559d;
        this.f37196D = JsonTemplateParser.m17354o(json, "transform", z, field21, DivTransformTemplate.f40565j, f34328a, env);
        Field<DivChangeTransitionTemplate> field22 = divIndicatorTemplate == null ? null : divIndicatorTemplate.f37197E;
        DivChangeTransitionTemplate.Companion companion16 = DivChangeTransitionTemplate.f34861a;
        this.f37197E = JsonTemplateParser.m17354o(json, "transition_change", z, field22, DivChangeTransitionTemplate.f34862b, f34328a, env);
        Field<DivAppearanceTransitionTemplate> field23 = divIndicatorTemplate == null ? null : divIndicatorTemplate.f37198F;
        DivAppearanceTransitionTemplate.Companion companion17 = DivAppearanceTransitionTemplate.f34733a;
        Function2<ParsingEnvironment, JSONObject, DivAppearanceTransitionTemplate> function24 = DivAppearanceTransitionTemplate.f34734b;
        this.f37198F = JsonTemplateParser.m17354o(json, "transition_in", z, field23, function24, f34328a, env);
        this.f37199G = JsonTemplateParser.m17354o(json, "transition_out", z, divIndicatorTemplate == null ? null : divIndicatorTemplate.f37199G, function24, f34328a, env);
        Field<List<DivTransitionTrigger>> field24 = divIndicatorTemplate == null ? null : divIndicatorTemplate.f37200H;
        DivTransitionTrigger.Converter converter4 = DivTransitionTrigger.f40582c;
        this.f37200H = JsonTemplateParser.m17359t(json, "transition_triggers", z, field24, DivTransitionTrigger.f40583d, f37112D0, f34328a, env);
        Field<Expression<DivVisibility>> field25 = divIndicatorTemplate == null ? null : divIndicatorTemplate.f37201I;
        DivVisibility.Converter converter5 = DivVisibility.f40930c;
        this.f37201I = JsonTemplateParser.m17358s(json, "visibility", z, field25, DivVisibility.f40931d, f34328a, env, f37159f0);
        Field<DivVisibilityActionTemplate> field26 = divIndicatorTemplate == null ? null : divIndicatorTemplate.f37202J;
        DivVisibilityActionTemplate.Companion companion18 = DivVisibilityActionTemplate.f40959i;
        Function2<ParsingEnvironment, JSONObject, DivVisibilityActionTemplate> function25 = DivVisibilityActionTemplate.f40958C;
        this.f37202J = JsonTemplateParser.m17354o(json, "visibility_action", z, field26, function25, f34328a, env);
        this.f37203K = JsonTemplateParser.m17360u(json, "visibility_actions", z, divIndicatorTemplate == null ? null : divIndicatorTemplate.f37203K, function25, f37114F0, f34328a, env);
        this.f37204L = JsonTemplateParser.m17354o(json, "width", z, divIndicatorTemplate == null ? null : divIndicatorTemplate.f37204L, function22, f34328a, env);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivIndicator mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        DivAccessibility divAccessibility = (DivAccessibility) FieldKt.m17381g(this.f37205a, env, "accessibility", data, f37115G0);
        if (divAccessibility == null) {
            divAccessibility = f37121M;
        }
        DivAccessibility divAccessibility2 = divAccessibility;
        Expression<Integer> expression = (Expression) FieldKt.m17378d(this.f37206b, env, "active_item_color", data, f37116H0);
        if (expression == null) {
            expression = f37123N;
        }
        Expression<Integer> expression2 = expression;
        Expression<Double> expression3 = (Expression) FieldKt.m17378d(this.f37207c, env, "active_item_size", data, f37117I0);
        if (expression3 == null) {
            expression3 = f37125O;
        }
        Expression<Double> expression4 = expression3;
        DivRoundedRectangleShape divRoundedRectangleShape = (DivRoundedRectangleShape) FieldKt.m17381g(this.f37208d, env, "active_shape", data, f37118J0);
        Expression expression5 = (Expression) FieldKt.m17378d(this.f37209e, env, "alignment_horizontal", data, f37119K0);
        Expression expression6 = (Expression) FieldKt.m17378d(this.f37210f, env, "alignment_vertical", data, f37120L0);
        Expression<Double> expression7 = (Expression) FieldKt.m17378d(this.f37211g, env, "alpha", data, f37122M0);
        if (expression7 == null) {
            expression7 = f37127P;
        }
        Expression<Double> expression8 = expression7;
        Expression<DivIndicator.Animation> expression9 = (Expression) FieldKt.m17378d(this.f37212h, env, "animation", data, f37124N0);
        if (expression9 == null) {
            expression9 = f37129Q;
        }
        Expression<DivIndicator.Animation> expression10 = expression9;
        List m17382h = FieldKt.m17382h(this.f37213i, env, "background", data, f37169k0, f37126O0);
        DivBorder divBorder = (DivBorder) FieldKt.m17381g(this.f37214j, env, "border", data, f37128P0);
        if (divBorder == null) {
            divBorder = f37131R;
        }
        DivBorder divBorder2 = divBorder;
        Expression expression11 = (Expression) FieldKt.m17378d(this.f37215k, env, "column_span", data, f37130Q0);
        List m17382h2 = FieldKt.m17382h(this.f37216l, env, "disappear_actions", data, f37177o0, f37132R0);
        List m17382h3 = FieldKt.m17382h(this.f37217m, env, "extensions", data, f37181q0, f37134S0);
        DivFocus divFocus = (DivFocus) FieldKt.m17381g(this.f37218n, env, "focus", data, f37136T0);
        DivSize divSize = (DivSize) FieldKt.m17381g(this.f37219o, env, "height", data, f37138U0);
        if (divSize == null) {
            divSize = f37133S;
        }
        DivSize divSize2 = divSize;
        String str = (String) FieldKt.m17378d(this.f37220p, env, "id", data, f37140V0);
        Expression<Integer> expression12 = (Expression) FieldKt.m17378d(this.f37221q, env, "inactive_item_color", data, f37142W0);
        if (expression12 == null) {
            expression12 = f37135T;
        }
        Expression<Integer> expression13 = expression12;
        DivRoundedRectangleShape divRoundedRectangleShape2 = (DivRoundedRectangleShape) FieldKt.m17381g(this.f37222r, env, "inactive_minimum_shape", data, f37144X0);
        DivRoundedRectangleShape divRoundedRectangleShape3 = (DivRoundedRectangleShape) FieldKt.m17381g(this.f37223s, env, "inactive_shape", data, f37146Y0);
        DivIndicatorItemPlacement divIndicatorItemPlacement = (DivIndicatorItemPlacement) FieldKt.m17381g(this.f37224t, env, "items_placement", data, f37148Z0);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) FieldKt.m17381g(this.f37225u, env, "margins", data, f37150a1);
        if (divEdgeInsets == null) {
            divEdgeInsets = f37137U;
        }
        DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
        Expression<Double> expression14 = (Expression) FieldKt.m17378d(this.f37226v, env, "minimum_item_size", data, f37152b1);
        if (expression14 == null) {
            expression14 = f37139V;
        }
        Expression<Double> expression15 = expression14;
        DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) FieldKt.m17381g(this.f37227w, env, "paddings", data, f37154c1);
        if (divEdgeInsets3 == null) {
            divEdgeInsets3 = f37141W;
        }
        DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
        String str2 = (String) FieldKt.m17378d(this.f37228x, env, "pager_id", data, f37156d1);
        Expression expression16 = (Expression) FieldKt.m17378d(this.f37229y, env, "row_span", data, f37158e1);
        List m17382h4 = FieldKt.m17382h(this.f37230z, env, "selected_actions", data, f37191y0, f37160f1);
        DivShape divShape = (DivShape) FieldKt.m17381g(this.f37193A, env, "shape", data, f37162g1);
        if (divShape == null) {
            divShape = f37143X;
        }
        DivShape divShape2 = divShape;
        DivFixedSize divFixedSize = (DivFixedSize) FieldKt.m17381g(this.f37194B, env, "space_between_centers", data, f37164h1);
        if (divFixedSize == null) {
            divFixedSize = f37145Y;
        }
        DivFixedSize divFixedSize2 = divFixedSize;
        List m17382h5 = FieldKt.m17382h(this.f37195C, env, "tooltips", data, f37109A0, f37166i1);
        DivTransform divTransform = (DivTransform) FieldKt.m17381g(this.f37196D, env, "transform", data, f37168j1);
        if (divTransform == null) {
            divTransform = f37147Z;
        }
        DivTransform divTransform2 = divTransform;
        DivChangeTransition divChangeTransition = (DivChangeTransition) FieldKt.m17381g(this.f37197E, env, "transition_change", data, f37170k1);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) FieldKt.m17381g(this.f37198F, env, "transition_in", data, f37172l1);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) FieldKt.m17381g(this.f37199G, env, "transition_out", data, f37174m1);
        List m17380f = FieldKt.m17380f(this.f37200H, env, "transition_triggers", data, f37111C0, f37176n1);
        Expression<DivVisibility> expression17 = (Expression) FieldKt.m17378d(this.f37201I, env, "visibility", data, f37178o1);
        if (expression17 == null) {
            expression17 = f37149a0;
        }
        Expression<DivVisibility> expression18 = expression17;
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) FieldKt.m17381g(this.f37202J, env, "visibility_action", data, f37180p1);
        List m17382h6 = FieldKt.m17382h(this.f37203K, env, "visibility_actions", data, f37113E0, f37182q1);
        DivSize divSize3 = (DivSize) FieldKt.m17381g(this.f37204L, env, "width", data, f37184r1);
        if (divSize3 == null) {
            divSize3 = f37151b0;
        }
        return new DivIndicator(divAccessibility2, expression2, expression4, divRoundedRectangleShape, expression5, expression6, expression8, expression10, m17382h, divBorder2, expression11, m17382h2, m17382h3, divFocus, divSize2, str, expression13, divRoundedRectangleShape2, divRoundedRectangleShape3, divIndicatorItemPlacement, divEdgeInsets2, expression15, divEdgeInsets4, str2, expression16, m17382h4, divShape2, divFixedSize2, m17382h5, divTransform2, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17380f, expression18, divVisibilityAction, m17382h6, divSize3);
    }
}
