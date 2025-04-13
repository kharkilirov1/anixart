package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
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
import com.yandex.div2.Div;
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
import com.yandex.div2.DivCornersRadius;
import com.yandex.div2.DivCornersRadiusTemplate;
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
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeTemplate;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivTabs;
import com.yandex.div2.DivTabsTemplate;
import com.yandex.div2.DivTemplate;
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

/* compiled from: DivTabsTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivTabsTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivTabs;", "Companion", "ItemTemplate", "TabTitleStyleTemplate", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivTabsTemplate implements JSONSerializable, JsonTemplate<DivTabs> {

    /* renamed from: A0 */
    @NotNull
    public static final ListValidator<DivTooltipTemplate> f39601A0;

    /* renamed from: B0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f39602B0;

    /* renamed from: C0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f39603C0;

    /* renamed from: D0 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f39604D0;

    /* renamed from: E0 */
    @NotNull
    public static final ListValidator<DivVisibilityActionTemplate> f39605E0;

    /* renamed from: F0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAccessibility> f39606F0;

    /* renamed from: G0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>> f39607G0;

    /* renamed from: H0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>> f39608H0;

    /* renamed from: I0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f39609I0;

    /* renamed from: J0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>> f39610J0;

    /* renamed from: K */
    @NotNull
    public static final DivAccessibility f39611K = new DivAccessibility(null, null, null, null, null, null, 63);

    /* renamed from: K0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivBorder> f39612K0;

    /* renamed from: L */
    @NotNull
    public static final Expression<Double> f39613L;

    /* renamed from: L0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f39614L0;

    /* renamed from: M */
    @NotNull
    public static final DivBorder f39615M;

    /* renamed from: M0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>> f39616M0;

    /* renamed from: N */
    @NotNull
    public static final Expression<Boolean> f39617N;

    /* renamed from: N0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>> f39618N0;

    /* renamed from: O */
    @NotNull
    public static final Expression<Boolean> f39619O;

    /* renamed from: O0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>> f39620O0;

    /* renamed from: P */
    @NotNull
    public static final DivSize.WrapContent f39621P;

    /* renamed from: P0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivFocus> f39622P0;

    /* renamed from: Q */
    @NotNull
    public static final DivEdgeInsets f39623Q;

    /* renamed from: Q0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>> f39624Q0;

    /* renamed from: R */
    @NotNull
    public static final DivEdgeInsets f39625R;

    /* renamed from: R0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f39626R0;

    /* renamed from: S */
    @NotNull
    public static final Expression<Boolean> f39627S;

    /* renamed from: S0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f39628S0;

    /* renamed from: T */
    @NotNull
    public static final Expression<Long> f39629T;

    /* renamed from: T0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTabs.Item>> f39630T0;

    /* renamed from: U */
    @NotNull
    public static final Expression<Integer> f39631U;

    /* renamed from: U0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f39632U0;

    /* renamed from: V */
    @NotNull
    public static final DivEdgeInsets f39633V;

    /* renamed from: V0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f39634V0;

    /* renamed from: W */
    @NotNull
    public static final Expression<Boolean> f39635W;

    /* renamed from: W0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>> f39636W0;

    /* renamed from: X */
    @NotNull
    public static final DivTabs.TabTitleStyle f39637X;

    /* renamed from: X0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f39638X0;

    /* renamed from: Y */
    @NotNull
    public static final DivEdgeInsets f39639Y;

    /* renamed from: Y0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f39640Y0;

    /* renamed from: Z */
    @NotNull
    public static final DivTransform f39641Z;

    /* renamed from: Z0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f39642Z0;

    /* renamed from: a0 */
    @NotNull
    public static final Expression<DivVisibility> f39643a0;

    /* renamed from: a1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>> f39644a1;

    /* renamed from: b0 */
    @NotNull
    public static final DivSize.MatchParent f39645b0;

    /* renamed from: b1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f39646b1;

    /* renamed from: c0 */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f39647c0;

    /* renamed from: c1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>> f39648c1;

    /* renamed from: d0 */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f39649d0;

    /* renamed from: d1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivTabs.TabTitleStyle> f39650d1;

    /* renamed from: e0 */
    @NotNull
    public static final TypeHelper<DivVisibility> f39651e0;

    /* renamed from: e1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f39652e1;

    /* renamed from: f0 */
    @NotNull
    public static final ValueValidator<Double> f39653f0;

    /* renamed from: f1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>> f39654f1;

    /* renamed from: g0 */
    @NotNull
    public static final ValueValidator<Double> f39655g0;

    /* renamed from: g1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivTransform> f39656g1;

    /* renamed from: h0 */
    @NotNull
    public static final ListValidator<DivBackground> f39657h0;

    /* renamed from: h1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition> f39658h1;

    /* renamed from: i0 */
    @NotNull
    public static final ListValidator<DivBackgroundTemplate> f39659i0;

    /* renamed from: i1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f39660i1;

    /* renamed from: j0 */
    @NotNull
    public static final ValueValidator<Long> f39661j0;

    /* renamed from: j1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f39662j1;

    /* renamed from: k0 */
    @NotNull
    public static final ValueValidator<Long> f39663k0;

    /* renamed from: k1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>> f39664k1;

    /* renamed from: l0 */
    @NotNull
    public static final ListValidator<DivDisappearAction> f39665l0;

    /* renamed from: l1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>> f39666l1;

    /* renamed from: m0 */
    @NotNull
    public static final ListValidator<DivDisappearActionTemplate> f39667m0;

    /* renamed from: m1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction> f39668m1;

    /* renamed from: n0 */
    @NotNull
    public static final ListValidator<DivExtension> f39669n0;

    /* renamed from: n1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>> f39670n1;

    /* renamed from: o0 */
    @NotNull
    public static final ListValidator<DivExtensionTemplate> f39671o0;

    /* renamed from: o1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f39672o1;

    /* renamed from: p0 */
    @NotNull
    public static final ValueValidator<String> f39673p0;

    /* renamed from: q0 */
    @NotNull
    public static final ValueValidator<String> f39674q0;

    /* renamed from: r0 */
    @NotNull
    public static final ListValidator<DivTabs.Item> f39675r0;

    /* renamed from: s0 */
    @NotNull
    public static final ListValidator<ItemTemplate> f39676s0;

    /* renamed from: t0 */
    @NotNull
    public static final ValueValidator<Long> f39677t0;

    /* renamed from: u0 */
    @NotNull
    public static final ValueValidator<Long> f39678u0;

    /* renamed from: v0 */
    @NotNull
    public static final ListValidator<DivAction> f39679v0;

    /* renamed from: w0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f39680w0;

    /* renamed from: x0 */
    @NotNull
    public static final ValueValidator<Long> f39681x0;

    /* renamed from: y0 */
    @NotNull
    public static final ValueValidator<Long> f39682y0;

    /* renamed from: z0 */
    @NotNull
    public static final ListValidator<DivTooltip> f39683z0;

    /* renamed from: A */
    @JvmField
    @NotNull
    public final Field<List<DivTooltipTemplate>> f39684A;

    /* renamed from: B */
    @JvmField
    @NotNull
    public final Field<DivTransformTemplate> f39685B;

    /* renamed from: C */
    @JvmField
    @NotNull
    public final Field<DivChangeTransitionTemplate> f39686C;

    /* renamed from: D */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f39687D;

    /* renamed from: E */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f39688E;

    /* renamed from: F */
    @JvmField
    @NotNull
    public final Field<List<DivTransitionTrigger>> f39689F;

    /* renamed from: G */
    @JvmField
    @NotNull
    public final Field<Expression<DivVisibility>> f39690G;

    /* renamed from: H */
    @JvmField
    @NotNull
    public final Field<DivVisibilityActionTemplate> f39691H;

    /* renamed from: I */
    @JvmField
    @NotNull
    public final Field<List<DivVisibilityActionTemplate>> f39692I;

    /* renamed from: J */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f39693J;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<DivAccessibilityTemplate> f39694a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f39695b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f39696c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f39697d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f39698e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final Field<DivBorderTemplate> f39699f;

    /* renamed from: g */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f39700g;

    /* renamed from: h */
    @JvmField
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f39701h;

    /* renamed from: i */
    @JvmField
    @NotNull
    public final Field<Expression<Boolean>> f39702i;

    /* renamed from: j */
    @JvmField
    @NotNull
    public final Field<List<DivExtensionTemplate>> f39703j;

    /* renamed from: k */
    @JvmField
    @NotNull
    public final Field<DivFocusTemplate> f39704k;

    /* renamed from: l */
    @JvmField
    @NotNull
    public final Field<Expression<Boolean>> f39705l;

    /* renamed from: m */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f39706m;

    /* renamed from: n */
    @JvmField
    @NotNull
    public final Field<String> f39707n;

    /* renamed from: o */
    @JvmField
    @NotNull
    public final Field<List<ItemTemplate>> f39708o;

    /* renamed from: p */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f39709p;

    /* renamed from: q */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f39710q;

    /* renamed from: r */
    @JvmField
    @NotNull
    public final Field<Expression<Boolean>> f39711r;

    /* renamed from: s */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f39712s;

    /* renamed from: t */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f39713t;

    /* renamed from: u */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f39714u;

    /* renamed from: v */
    @JvmField
    @NotNull
    public final Field<Expression<Integer>> f39715v;

    /* renamed from: w */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f39716w;

    /* renamed from: x */
    @JvmField
    @NotNull
    public final Field<Expression<Boolean>> f39717x;

    /* renamed from: y */
    @JvmField
    @NotNull
    public final Field<TabTitleStyleTemplate> f39718y;

    /* renamed from: z */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f39719z;

    /* compiled from: DivTabsTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000bR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0010R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0010R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\bR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u000bR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u000bR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0010R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0010R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\bR\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u000bR\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u000bR\u001a\u00106\u001a\b\u0012\u0004\u0012\u0002050\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0010R\u001a\u00108\u001a\b\u0012\u0004\u0012\u0002070\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0010R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u00160\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\bR\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\u000bR\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\u000bR\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010\bR\u0014\u0010>\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00100R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\bR\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00100R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010\u0010R\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010\u0010R\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010\u0010R\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020K0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010\u0010R\u0014\u0010N\u001a\u00020'8\u0006X\u0086T¢\u0006\u0006\n\u0004\bN\u0010OR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020T0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010SR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020V0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010SR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020X0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010\u0010R\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\u0010R\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020V0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010\bR\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_¨\u0006`"}, m31884d2 = {"Lcom/yandex/div2/DivTabsTemplate$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackgroundTemplate;", "BACKGROUND_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivDisappearActionTemplate;", "DISAPPEAR_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "", "DYNAMIC_HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivExtensionTemplate;", "EXTENSIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "HAS_SEPARATOR_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div2/DivTabsTemplate$ItemTemplate;", "ITEMS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivTabs$Item;", "ITEMS_VALIDATOR", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "PADDINGS_DEFAULT_VALUE", "RESTRICT_PARENT_SCROLL_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "Lcom/yandex/div2/DivActionTemplate;", "SELECTED_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivAction;", "SELECTED_ACTIONS_VALIDATOR", "SELECTED_TAB_DEFAULT_VALUE", "SELECTED_TAB_TEMPLATE_VALIDATOR", "SELECTED_TAB_VALIDATOR", "", "SEPARATOR_COLOR_DEFAULT_VALUE", "SEPARATOR_PADDINGS_DEFAULT_VALUE", "SWITCH_TABS_BY_CONTENT_SWIPE_ENABLED_DEFAULT_VALUE", "Lcom/yandex/div2/DivTabs$TabTitleStyle;", "TAB_TITLE_STYLE_DEFAULT_VALUE", "Lcom/yandex/div2/DivTabs$TabTitleStyle;", "TITLE_PADDINGS_DEFAULT_VALUE", "Lcom/yandex/div2/DivTooltipTemplate;", "TOOLTIPS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_TEMPLATE_VALIDATOR", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/DivVisibilityActionTemplate;", "VISIBILITY_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: DivTabsTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivTabsTemplate$ItemTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivTabs$Item;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class ItemTemplate implements JSONSerializable, JsonTemplate<DivTabs.Item> {

        /* renamed from: d */
        @NotNull
        public static final Companion f39761d = new Companion(null);

        /* renamed from: e */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Div> f39762e = new Function3<String, JSONObject, ParsingEnvironment, Div>() { // from class: com.yandex.div2.DivTabsTemplate$ItemTemplate$Companion$DIV_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Div mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Div.Companion companion = Div.f34418a;
                Function2<ParsingEnvironment, JSONObject, Div> function2 = Div.f34419b;
                parsingEnvironment2.getF34328a();
                return (Div) JsonParser.m17313e(jSONObject2, str2, function2, C2904b.f33858e, parsingEnvironment2);
            }
        };

        /* renamed from: f */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<String>> f39763f = new Function3<String, JSONObject, ParsingEnvironment, Expression<String>>() { // from class: com.yandex.div2.DivTabsTemplate$ItemTemplate$Companion$TITLE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<String> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTabsTemplate.ItemTemplate.Companion companion = DivTabsTemplate.ItemTemplate.f39761d;
                return JsonParser.m17314f(jSONObject2, str2, C3050i0.f41517r, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33850c);
            }
        };

        /* renamed from: g */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, DivAction> f39764g = new Function3<String, JSONObject, ParsingEnvironment, DivAction>() { // from class: com.yandex.div2.DivTabsTemplate$ItemTemplate$Companion$TITLE_CLICK_ACTION_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAction mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion = DivAction.f34546g;
                return (DivAction) JsonParser.m17322n(jSONObject2, str2, DivAction.f34550k, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };

        /* renamed from: h */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, ItemTemplate> f39765h = new Function2<ParsingEnvironment, JSONObject, ItemTemplate>() { // from class: com.yandex.div2.DivTabsTemplate$ItemTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivTabsTemplate.ItemTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivTabsTemplate.ItemTemplate(env, null, false, it, 6);
            }
        };

        /* renamed from: a */
        @JvmField
        @NotNull
        public final Field<DivTemplate> f39766a;

        /* renamed from: b */
        @JvmField
        @NotNull
        public final Field<Expression<String>> f39767b;

        /* renamed from: c */
        @JvmField
        @NotNull
        public final Field<DivActionTemplate> f39768c;

        /* compiled from: DivTabsTemplate.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivTabsTemplate$ItemTemplate$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "TITLE_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "TITLE_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        public ItemTemplate(ParsingEnvironment parsingEnvironment, ItemTemplate itemTemplate, boolean z, JSONObject jSONObject, int i2) {
            z = (i2 & 4) != 0 ? false : z;
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            DivTemplate.Companion companion = DivTemplate.f39864a;
            this.f39766a = JsonTemplateParser.m17345f(jSONObject, "div", z, null, DivTemplate.f39865b, f34328a, parsingEnvironment);
            this.f39767b = JsonTemplateParser.m17346g(jSONObject, "title", z, null, C3050i0.f41516q, f34328a, parsingEnvironment, TypeHelpersKt.f33850c);
            DivActionTemplate.Companion companion2 = DivActionTemplate.f34572i;
            this.f39768c = JsonTemplateParser.m17354o(jSONObject, "title_click_action", z, null, DivActionTemplate.f34586w, f34328a, parsingEnvironment);
        }

        @Override // com.yandex.div.json.JsonTemplate
        /* renamed from: a */
        public DivTabs.Item mo17514a(ParsingEnvironment env, JSONObject data) {
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(data, "data");
            return new DivTabs.Item((Div) FieldKt.m17383i(this.f39766a, env, "div", data, f39762e), (Expression) FieldKt.m17376b(this.f39767b, env, "title", data, f39763f), (DivAction) FieldKt.m17381g(this.f39768c, env, "title_click_action", data, f39764g));
        }
    }

    /* compiled from: DivTabsTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivTabsTemplate$TabTitleStyleTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivTabs$TabTitleStyle;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class TabTitleStyleTemplate implements JSONSerializable, JsonTemplate<DivTabs.TabTitleStyle> {

        /* renamed from: A */
        @NotNull
        public static final Expression<DivFontWeight> f39773A;

        /* renamed from: B */
        @NotNull
        public static final Expression<Integer> f39774B;

        /* renamed from: C */
        @NotNull
        public static final Expression<Long> f39775C;

        /* renamed from: D */
        @NotNull
        public static final Expression<Double> f39776D;

        /* renamed from: E */
        @NotNull
        public static final DivEdgeInsets f39777E;

        /* renamed from: F */
        @NotNull
        public static final TypeHelper<DivFontWeight> f39778F;

        /* renamed from: G */
        @NotNull
        public static final TypeHelper<DivTabs.TabTitleStyle.AnimationType> f39779G;

        /* renamed from: H */
        @NotNull
        public static final TypeHelper<DivFontFamily> f39780H;

        /* renamed from: I */
        @NotNull
        public static final TypeHelper<DivSizeUnit> f39781I;

        /* renamed from: J */
        @NotNull
        public static final TypeHelper<DivFontWeight> f39782J;

        /* renamed from: K */
        @NotNull
        public static final TypeHelper<DivFontWeight> f39783K;

        /* renamed from: L */
        @NotNull
        public static final ValueValidator<Long> f39784L;

        /* renamed from: M */
        @NotNull
        public static final ValueValidator<Long> f39785M;

        /* renamed from: N */
        @NotNull
        public static final ValueValidator<Long> f39786N;

        /* renamed from: O */
        @NotNull
        public static final ValueValidator<Long> f39787O;

        /* renamed from: P */
        @NotNull
        public static final ValueValidator<Long> f39788P;

        /* renamed from: Q */
        @NotNull
        public static final ValueValidator<Long> f39789Q;

        /* renamed from: R */
        @NotNull
        public static final ValueValidator<Long> f39790R;

        /* renamed from: S */
        @NotNull
        public static final ValueValidator<Long> f39791S;

        /* renamed from: T */
        @NotNull
        public static final ValueValidator<Long> f39792T;

        /* renamed from: U */
        @NotNull
        public static final ValueValidator<Long> f39793U;

        /* renamed from: V */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>> f39794V;

        /* renamed from: W */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivFontWeight>> f39795W;

        /* renamed from: X */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>> f39796X;

        /* renamed from: Y */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f39797Y;

        /* renamed from: Z */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivTabs.TabTitleStyle.AnimationType>> f39798Z;

        /* renamed from: a0 */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f39799a0;

        /* renamed from: b0 */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, DivCornersRadius> f39800b0;

        /* renamed from: c0 */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivFontFamily>> f39801c0;

        /* renamed from: d0 */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f39802d0;

        /* renamed from: e0 */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivSizeUnit>> f39803e0;

        /* renamed from: f0 */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivFontWeight>> f39804f0;

        /* renamed from: g0 */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>> f39805g0;

        /* renamed from: h0 */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivFontWeight>> f39806h0;

        /* renamed from: i0 */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>> f39807i0;

        /* renamed from: j0 */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f39808j0;

        /* renamed from: k0 */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f39809k0;

        /* renamed from: l0 */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f39810l0;

        /* renamed from: m0 */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f39811m0;

        /* renamed from: n0 */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, TabTitleStyleTemplate> f39812n0;

        /* renamed from: s */
        @NotNull
        public static final Companion f39813s = new Companion(null);

        /* renamed from: t */
        @NotNull
        public static final Expression<Integer> f39814t;

        /* renamed from: u */
        @NotNull
        public static final Expression<Integer> f39815u;

        /* renamed from: v */
        @NotNull
        public static final Expression<Long> f39816v;

        /* renamed from: w */
        @NotNull
        public static final Expression<DivTabs.TabTitleStyle.AnimationType> f39817w;

        /* renamed from: x */
        @NotNull
        public static final Expression<DivFontFamily> f39818x;

        /* renamed from: y */
        @NotNull
        public static final Expression<Long> f39819y;

        /* renamed from: z */
        @NotNull
        public static final Expression<DivSizeUnit> f39820z;

        /* renamed from: a */
        @JvmField
        @NotNull
        public final Field<Expression<Integer>> f39821a;

        /* renamed from: b */
        @JvmField
        @NotNull
        public final Field<Expression<DivFontWeight>> f39822b;

        /* renamed from: c */
        @JvmField
        @NotNull
        public final Field<Expression<Integer>> f39823c;

        /* renamed from: d */
        @JvmField
        @NotNull
        public final Field<Expression<Long>> f39824d;

        /* renamed from: e */
        @JvmField
        @NotNull
        public final Field<Expression<DivTabs.TabTitleStyle.AnimationType>> f39825e;

        /* renamed from: f */
        @JvmField
        @NotNull
        public final Field<Expression<Long>> f39826f;

        /* renamed from: g */
        @JvmField
        @NotNull
        public final Field<DivCornersRadiusTemplate> f39827g;

        /* renamed from: h */
        @JvmField
        @NotNull
        public final Field<Expression<DivFontFamily>> f39828h;

        /* renamed from: i */
        @JvmField
        @NotNull
        public final Field<Expression<Long>> f39829i;

        /* renamed from: j */
        @JvmField
        @NotNull
        public final Field<Expression<DivSizeUnit>> f39830j;

        /* renamed from: k */
        @JvmField
        @NotNull
        public final Field<Expression<DivFontWeight>> f39831k;

        /* renamed from: l */
        @JvmField
        @NotNull
        public final Field<Expression<Integer>> f39832l;

        /* renamed from: m */
        @JvmField
        @NotNull
        public final Field<Expression<DivFontWeight>> f39833m;

        /* renamed from: n */
        @JvmField
        @NotNull
        public final Field<Expression<Integer>> f39834n;

        /* renamed from: o */
        @JvmField
        @NotNull
        public final Field<Expression<Long>> f39835o;

        /* renamed from: p */
        @JvmField
        @NotNull
        public final Field<Expression<Double>> f39836p;

        /* renamed from: q */
        @JvmField
        @NotNull
        public final Field<Expression<Long>> f39837q;

        /* renamed from: r */
        @JvmField
        @NotNull
        public final Field<DivEdgeInsetsTemplate> f39838r;

        /* compiled from: DivTabsTemplate.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0005R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0005R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0005R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0005R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0005R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u000bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u000bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0005R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u000bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u000bR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00180%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00150%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00180%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010'R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00180%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010'¨\u0006-"}, m31884d2 = {"Lcom/yandex/div2/DivTabsTemplate$TabTitleStyleTemplate$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "ACTIVE_BACKGROUND_COLOR_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "ACTIVE_TEXT_COLOR_DEFAULT_VALUE", "", "ANIMATION_DURATION_DEFAULT_VALUE", "Lcom/yandex/div/internal/parser/ValueValidator;", "ANIMATION_DURATION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ANIMATION_DURATION_VALIDATOR", "Lcom/yandex/div2/DivTabs$TabTitleStyle$AnimationType;", "ANIMATION_TYPE_DEFAULT_VALUE", "CORNER_RADIUS_TEMPLATE_VALIDATOR", "CORNER_RADIUS_VALIDATOR", "Lcom/yandex/div2/DivFontFamily;", "FONT_FAMILY_DEFAULT_VALUE", "FONT_SIZE_DEFAULT_VALUE", "FONT_SIZE_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivSizeUnit;", "FONT_SIZE_UNIT_DEFAULT_VALUE", "FONT_SIZE_VALIDATOR", "Lcom/yandex/div2/DivFontWeight;", "FONT_WEIGHT_DEFAULT_VALUE", "INACTIVE_TEXT_COLOR_DEFAULT_VALUE", "ITEM_SPACING_DEFAULT_VALUE", "ITEM_SPACING_TEMPLATE_VALIDATOR", "ITEM_SPACING_VALIDATOR", "", "LETTER_SPACING_DEFAULT_VALUE", "LINE_HEIGHT_TEMPLATE_VALIDATOR", "LINE_HEIGHT_VALIDATOR", "Lcom/yandex/div2/DivEdgeInsets;", "PADDINGS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_ACTIVE_FONT_WEIGHT", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_ANIMATION_TYPE", "TYPE_HELPER_FONT_FAMILY", "TYPE_HELPER_FONT_SIZE_UNIT", "TYPE_HELPER_FONT_WEIGHT", "TYPE_HELPER_INACTIVE_FONT_WEIGHT", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        static {
            Expression.Companion companion = Expression.f34334a;
            f39814t = companion.m17539a(-9120);
            f39815u = companion.m17539a(-872415232);
            f39816v = companion.m17539a(300L);
            f39817w = companion.m17539a(DivTabs.TabTitleStyle.AnimationType.SLIDE);
            f39818x = companion.m17539a(DivFontFamily.TEXT);
            f39819y = companion.m17539a(12L);
            f39820z = companion.m17539a(DivSizeUnit.SP);
            f39773A = companion.m17539a(DivFontWeight.REGULAR);
            f39774B = companion.m17539a(Integer.MIN_VALUE);
            f39775C = companion.m17539a(0L);
            f39776D = companion.m17539a(Double.valueOf(0.0d));
            f39777E = new DivEdgeInsets(companion.m17539a(6L), companion.m17539a(8L), companion.m17539a(8L), companion.m17539a(6L), null, 16);
            int i2 = TypeHelper.f33843a;
            TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
            f39778F = companion2.m17372a(ArraysKt.m31926B(DivFontWeight.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTabsTemplate$TabTitleStyleTemplate$Companion$TYPE_HELPER_ACTIVE_FONT_WEIGHT$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivFontWeight);
                }
            });
            f39779G = companion2.m17372a(ArraysKt.m31926B(DivTabs.TabTitleStyle.AnimationType.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTabsTemplate$TabTitleStyleTemplate$Companion$TYPE_HELPER_ANIMATION_TYPE$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivTabs.TabTitleStyle.AnimationType);
                }
            });
            f39780H = companion2.m17372a(ArraysKt.m31926B(DivFontFamily.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTabsTemplate$TabTitleStyleTemplate$Companion$TYPE_HELPER_FONT_FAMILY$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivFontFamily);
                }
            });
            f39781I = companion2.m17372a(ArraysKt.m31926B(DivSizeUnit.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTabsTemplate$TabTitleStyleTemplate$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivSizeUnit);
                }
            });
            f39782J = companion2.m17372a(ArraysKt.m31926B(DivFontWeight.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTabsTemplate$TabTitleStyleTemplate$Companion$TYPE_HELPER_FONT_WEIGHT$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivFontWeight);
                }
            });
            f39783K = companion2.m17372a(ArraysKt.m31926B(DivFontWeight.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTabsTemplate$TabTitleStyleTemplate$Companion$TYPE_HELPER_INACTIVE_FONT_WEIGHT$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivFontWeight);
                }
            });
            f39784L = C3050i0.f41518s;
            f39785M = C3050i0.f41519t;
            f39786N = C3050i0.f41520u;
            f39787O = C3050i0.f41521v;
            f39788P = C3050i0.f41522w;
            f39789Q = C3050i0.f41523x;
            f39790R = C3050i0.f41524y;
            f39791S = C3050i0.f41525z;
            f39792T = C3050i0.f41499A;
            f39793U = C3050i0.f41500B;
            f39794V = new Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>>() { // from class: com.yandex.div2.DivTabsTemplate$TabTitleStyleTemplate$Companion$ACTIVE_BACKGROUND_COLOR_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<Integer> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    Function1<Object, Integer> function1 = ParsingConvertersKt.f33827a;
                    ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                    Expression<Integer> expression = DivTabsTemplate.TabTitleStyleTemplate.f39814t;
                    Expression<Integer> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33853f);
                    return m17330v == null ? expression : m17330v;
                }
            };
            f39795W = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivFontWeight>>() { // from class: com.yandex.div2.DivTabsTemplate$TabTitleStyleTemplate$Companion$ACTIVE_FONT_WEIGHT_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<DivFontWeight> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    DivFontWeight.Converter converter = DivFontWeight.f35883c;
                    return JsonParser.m17329u(jSONObject2, str2, DivFontWeight.f35884d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivTabsTemplate.TabTitleStyleTemplate.f39778F);
                }
            };
            f39796X = new Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>>() { // from class: com.yandex.div2.DivTabsTemplate$TabTitleStyleTemplate$Companion$ACTIVE_TEXT_COLOR_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<Integer> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    Function1<Object, Integer> function1 = ParsingConvertersKt.f33827a;
                    ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                    Expression<Integer> expression = DivTabsTemplate.TabTitleStyleTemplate.f39815u;
                    Expression<Integer> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33853f);
                    return m17330v == null ? expression : m17330v;
                }
            };
            f39797Y = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivTabsTemplate$TabTitleStyleTemplate$Companion$ANIMATION_DURATION_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                    ValueValidator<Long> valueValidator = DivTabsTemplate.TabTitleStyleTemplate.f39785M;
                    ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                    Expression<Long> expression = DivTabsTemplate.TabTitleStyleTemplate.f39816v;
                    Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                    return m17328t == null ? expression : m17328t;
                }
            };
            f39798Z = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivTabs.TabTitleStyle.AnimationType>>() { // from class: com.yandex.div2.DivTabsTemplate$TabTitleStyleTemplate$Companion$ANIMATION_TYPE_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<DivTabs.TabTitleStyle.AnimationType> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    DivTabs.TabTitleStyle.AnimationType.Converter converter = DivTabs.TabTitleStyle.AnimationType.f39586c;
                    Function1<String, DivTabs.TabTitleStyle.AnimationType> function1 = DivTabs.TabTitleStyle.AnimationType.f39587d;
                    ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                    Expression<DivTabs.TabTitleStyle.AnimationType> expression = DivTabsTemplate.TabTitleStyleTemplate.f39817w;
                    Expression<DivTabs.TabTitleStyle.AnimationType> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivTabsTemplate.TabTitleStyleTemplate.f39779G);
                    return m17330v == null ? expression : m17330v;
                }
            };
            f39799a0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivTabsTemplate$TabTitleStyleTemplate$Companion$CORNER_RADIUS_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivTabsTemplate.TabTitleStyleTemplate.f39787O, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
                }
            };
            f39800b0 = new Function3<String, JSONObject, ParsingEnvironment, DivCornersRadius>() { // from class: com.yandex.div2.DivTabsTemplate$TabTitleStyleTemplate$Companion$CORNERS_RADIUS_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public DivCornersRadius mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    DivCornersRadius.Companion companion3 = DivCornersRadius.f35216e;
                    return (DivCornersRadius) JsonParser.m17322n(jSONObject2, str2, DivCornersRadius.f35217f, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                }
            };
            f39801c0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivFontFamily>>() { // from class: com.yandex.div2.DivTabsTemplate$TabTitleStyleTemplate$Companion$FONT_FAMILY_READER$1
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
                    Expression<DivFontFamily> expression = DivTabsTemplate.TabTitleStyleTemplate.f39818x;
                    Expression<DivFontFamily> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivTabsTemplate.TabTitleStyleTemplate.f39780H);
                    return m17330v == null ? expression : m17330v;
                }
            };
            f39802d0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivTabsTemplate$TabTitleStyleTemplate$Companion$FONT_SIZE_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                    ValueValidator<Long> valueValidator = DivTabsTemplate.TabTitleStyleTemplate.f39789Q;
                    ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                    Expression<Long> expression = DivTabsTemplate.TabTitleStyleTemplate.f39819y;
                    Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                    return m17328t == null ? expression : m17328t;
                }
            };
            f39803e0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivSizeUnit>>() { // from class: com.yandex.div2.DivTabsTemplate$TabTitleStyleTemplate$Companion$FONT_SIZE_UNIT_READER$1
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
                    Expression<DivSizeUnit> expression = DivTabsTemplate.TabTitleStyleTemplate.f39820z;
                    Expression<DivSizeUnit> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivTabsTemplate.TabTitleStyleTemplate.f39781I);
                    return m17330v == null ? expression : m17330v;
                }
            };
            f39804f0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivFontWeight>>() { // from class: com.yandex.div2.DivTabsTemplate$TabTitleStyleTemplate$Companion$FONT_WEIGHT_READER$1
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
                    Expression<DivFontWeight> expression = DivTabsTemplate.TabTitleStyleTemplate.f39773A;
                    Expression<DivFontWeight> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivTabsTemplate.TabTitleStyleTemplate.f39782J);
                    return m17330v == null ? expression : m17330v;
                }
            };
            f39805g0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>>() { // from class: com.yandex.div2.DivTabsTemplate$TabTitleStyleTemplate$Companion$INACTIVE_BACKGROUND_COLOR_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<Integer> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    return JsonParser.m17329u(jSONObject2, str2, ParsingConvertersKt.f33827a, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33853f);
                }
            };
            f39806h0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivFontWeight>>() { // from class: com.yandex.div2.DivTabsTemplate$TabTitleStyleTemplate$Companion$INACTIVE_FONT_WEIGHT_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<DivFontWeight> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    DivFontWeight.Converter converter = DivFontWeight.f35883c;
                    return JsonParser.m17329u(jSONObject2, str2, DivFontWeight.f35884d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivTabsTemplate.TabTitleStyleTemplate.f39783K);
                }
            };
            f39807i0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>>() { // from class: com.yandex.div2.DivTabsTemplate$TabTitleStyleTemplate$Companion$INACTIVE_TEXT_COLOR_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<Integer> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    Function1<Object, Integer> function1 = ParsingConvertersKt.f33827a;
                    ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                    Expression<Integer> expression = DivTabsTemplate.TabTitleStyleTemplate.f39774B;
                    Expression<Integer> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33853f);
                    return m17330v == null ? expression : m17330v;
                }
            };
            f39808j0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivTabsTemplate$TabTitleStyleTemplate$Companion$ITEM_SPACING_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                    ValueValidator<Long> valueValidator = DivTabsTemplate.TabTitleStyleTemplate.f39791S;
                    ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                    Expression<Long> expression = DivTabsTemplate.TabTitleStyleTemplate.f39775C;
                    Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                    return m17328t == null ? expression : m17328t;
                }
            };
            f39809k0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivTabsTemplate$TabTitleStyleTemplate$Companion$LETTER_SPACING_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
                    ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                    Expression<Double> expression = DivTabsTemplate.TabTitleStyleTemplate.f39776D;
                    Expression<Double> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33851d);
                    return m17330v == null ? expression : m17330v;
                }
            };
            f39810l0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivTabsTemplate$TabTitleStyleTemplate$Companion$LINE_HEIGHT_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivTabsTemplate.TabTitleStyleTemplate.f39793U, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
                }
            };
            f39811m0 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivTabsTemplate$TabTitleStyleTemplate$Companion$PADDINGS_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                    DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                    return divEdgeInsets == null ? DivTabsTemplate.TabTitleStyleTemplate.f39777E : divEdgeInsets;
                }
            };
            f39812n0 = new Function2<ParsingEnvironment, JSONObject, TabTitleStyleTemplate>() { // from class: com.yandex.div2.DivTabsTemplate$TabTitleStyleTemplate$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                public DivTabsTemplate.TabTitleStyleTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    ParsingEnvironment env = parsingEnvironment;
                    JSONObject it = jSONObject;
                    Intrinsics.m32179h(env, "env");
                    Intrinsics.m32179h(it, "it");
                    return new DivTabsTemplate.TabTitleStyleTemplate(env, null, false, it, 6);
                }
            };
        }

        public TabTitleStyleTemplate(ParsingEnvironment parsingEnvironment, TabTitleStyleTemplate tabTitleStyleTemplate, boolean z, JSONObject jSONObject, int i2) {
            boolean z2 = (i2 & 4) != 0 ? false : z;
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            Function1<Object, Integer> function1 = ParsingConvertersKt.f33827a;
            TypeHelper<Integer> typeHelper = TypeHelpersKt.f33853f;
            this.f39821a = JsonTemplateParser.m17358s(jSONObject, "active_background_color", z2, null, function1, f34328a, parsingEnvironment, typeHelper);
            DivFontWeight.Converter converter = DivFontWeight.f35883c;
            Function1<String, DivFontWeight> function12 = DivFontWeight.f35884d;
            this.f39822b = JsonTemplateParser.m17358s(jSONObject, "active_font_weight", z2, null, function12, f34328a, parsingEnvironment, f39778F);
            this.f39823c = JsonTemplateParser.m17358s(jSONObject, "active_text_color", z2, null, function1, f34328a, parsingEnvironment, typeHelper);
            Function1<Number, Long> function13 = ParsingConvertersKt.f33831e;
            ValueValidator<Long> valueValidator = f39784L;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.f33849b;
            this.f39824d = JsonTemplateParser.m17357r(jSONObject, "animation_duration", z2, null, function13, valueValidator, f34328a, parsingEnvironment, typeHelper2);
            DivTabs.TabTitleStyle.AnimationType.Converter converter2 = DivTabs.TabTitleStyle.AnimationType.f39586c;
            this.f39825e = JsonTemplateParser.m17358s(jSONObject, "animation_type", z2, null, DivTabs.TabTitleStyle.AnimationType.f39587d, f34328a, parsingEnvironment, f39779G);
            this.f39826f = JsonTemplateParser.m17357r(jSONObject, "corner_radius", z2, null, function13, f39786N, f34328a, parsingEnvironment, typeHelper2);
            DivCornersRadiusTemplate.Companion companion = DivCornersRadiusTemplate.f35223e;
            this.f39827g = JsonTemplateParser.m17354o(jSONObject, "corners_radius", z2, null, DivCornersRadiusTemplate.f35228j, f34328a, parsingEnvironment);
            DivFontFamily.Converter converter3 = DivFontFamily.f35876c;
            this.f39828h = JsonTemplateParser.m17358s(jSONObject, "font_family", z2, null, DivFontFamily.f35877d, f34328a, parsingEnvironment, f39780H);
            this.f39829i = JsonTemplateParser.m17357r(jSONObject, "font_size", z2, null, function13, f39788P, f34328a, parsingEnvironment, typeHelper2);
            DivSizeUnit.Converter converter4 = DivSizeUnit.f38845c;
            this.f39830j = JsonTemplateParser.m17358s(jSONObject, "font_size_unit", z2, null, DivSizeUnit.f38846d, f34328a, parsingEnvironment, f39781I);
            this.f39831k = JsonTemplateParser.m17358s(jSONObject, "font_weight", z2, null, function12, f34328a, parsingEnvironment, f39782J);
            this.f39832l = JsonTemplateParser.m17358s(jSONObject, "inactive_background_color", z2, null, function1, f34328a, parsingEnvironment, typeHelper);
            this.f39833m = JsonTemplateParser.m17358s(jSONObject, "inactive_font_weight", z2, null, function12, f34328a, parsingEnvironment, f39783K);
            this.f39834n = JsonTemplateParser.m17358s(jSONObject, "inactive_text_color", z2, null, function1, f34328a, parsingEnvironment, typeHelper);
            this.f39835o = JsonTemplateParser.m17357r(jSONObject, "item_spacing", z2, null, function13, f39790R, f34328a, parsingEnvironment, typeHelper2);
            this.f39836p = JsonTemplateParser.m17358s(jSONObject, "letter_spacing", z2, null, ParsingConvertersKt.f33830d, f34328a, parsingEnvironment, TypeHelpersKt.f33851d);
            this.f39837q = JsonTemplateParser.m17357r(jSONObject, "line_height", z2, null, function13, f39792T, f34328a, parsingEnvironment, typeHelper2);
            DivEdgeInsetsTemplate.Companion companion2 = DivEdgeInsetsTemplate.f35626f;
            this.f39838r = JsonTemplateParser.m17354o(jSONObject, "paddings", z2, null, DivEdgeInsetsTemplate.f35646z, f34328a, parsingEnvironment);
        }

        @Override // com.yandex.div.json.JsonTemplate
        /* renamed from: a */
        public DivTabs.TabTitleStyle mo17514a(ParsingEnvironment env, JSONObject data) {
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(data, "data");
            Expression<Integer> expression = (Expression) FieldKt.m17378d(this.f39821a, env, "active_background_color", data, f39794V);
            if (expression == null) {
                expression = f39814t;
            }
            Expression<Integer> expression2 = expression;
            Expression expression3 = (Expression) FieldKt.m17378d(this.f39822b, env, "active_font_weight", data, f39795W);
            Expression<Integer> expression4 = (Expression) FieldKt.m17378d(this.f39823c, env, "active_text_color", data, f39796X);
            if (expression4 == null) {
                expression4 = f39815u;
            }
            Expression<Integer> expression5 = expression4;
            Expression<Long> expression6 = (Expression) FieldKt.m17378d(this.f39824d, env, "animation_duration", data, f39797Y);
            if (expression6 == null) {
                expression6 = f39816v;
            }
            Expression<Long> expression7 = expression6;
            Expression<DivTabs.TabTitleStyle.AnimationType> expression8 = (Expression) FieldKt.m17378d(this.f39825e, env, "animation_type", data, f39798Z);
            if (expression8 == null) {
                expression8 = f39817w;
            }
            Expression<DivTabs.TabTitleStyle.AnimationType> expression9 = expression8;
            Expression expression10 = (Expression) FieldKt.m17378d(this.f39826f, env, "corner_radius", data, f39799a0);
            DivCornersRadius divCornersRadius = (DivCornersRadius) FieldKt.m17381g(this.f39827g, env, "corners_radius", data, f39800b0);
            Expression<DivFontFamily> expression11 = (Expression) FieldKt.m17378d(this.f39828h, env, "font_family", data, f39801c0);
            if (expression11 == null) {
                expression11 = f39818x;
            }
            Expression<DivFontFamily> expression12 = expression11;
            Expression<Long> expression13 = (Expression) FieldKt.m17378d(this.f39829i, env, "font_size", data, f39802d0);
            if (expression13 == null) {
                expression13 = f39819y;
            }
            Expression<Long> expression14 = expression13;
            Expression<DivSizeUnit> expression15 = (Expression) FieldKt.m17378d(this.f39830j, env, "font_size_unit", data, f39803e0);
            if (expression15 == null) {
                expression15 = f39820z;
            }
            Expression<DivSizeUnit> expression16 = expression15;
            Expression<DivFontWeight> expression17 = (Expression) FieldKt.m17378d(this.f39831k, env, "font_weight", data, f39804f0);
            if (expression17 == null) {
                expression17 = f39773A;
            }
            Expression<DivFontWeight> expression18 = expression17;
            Expression expression19 = (Expression) FieldKt.m17378d(this.f39832l, env, "inactive_background_color", data, f39805g0);
            Expression expression20 = (Expression) FieldKt.m17378d(this.f39833m, env, "inactive_font_weight", data, f39806h0);
            Expression<Integer> expression21 = (Expression) FieldKt.m17378d(this.f39834n, env, "inactive_text_color", data, f39807i0);
            if (expression21 == null) {
                expression21 = f39774B;
            }
            Expression<Integer> expression22 = expression21;
            Expression<Long> expression23 = (Expression) FieldKt.m17378d(this.f39835o, env, "item_spacing", data, f39808j0);
            if (expression23 == null) {
                expression23 = f39775C;
            }
            Expression<Long> expression24 = expression23;
            Expression<Double> expression25 = (Expression) FieldKt.m17378d(this.f39836p, env, "letter_spacing", data, f39809k0);
            if (expression25 == null) {
                expression25 = f39776D;
            }
            Expression<Double> expression26 = expression25;
            Expression expression27 = (Expression) FieldKt.m17378d(this.f39837q, env, "line_height", data, f39810l0);
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) FieldKt.m17381g(this.f39838r, env, "paddings", data, f39811m0);
            if (divEdgeInsets == null) {
                divEdgeInsets = f39777E;
            }
            return new DivTabs.TabTitleStyle(expression2, expression3, expression5, expression7, expression9, expression10, divCornersRadius, expression12, expression14, expression16, expression18, expression19, expression20, expression22, expression24, expression26, expression27, divEdgeInsets);
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f39613L = companion.m17539a(Double.valueOf(1.0d));
        f39615M = new DivBorder(null, null, null, null, null, 31);
        Boolean bool = Boolean.FALSE;
        f39617N = companion.m17539a(bool);
        f39619O = companion.m17539a(bool);
        f39621P = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7));
        f39623Q = new DivEdgeInsets(null, null, null, null, null, 31);
        f39625R = new DivEdgeInsets(null, null, null, null, null, 31);
        f39627S = companion.m17539a(bool);
        f39629T = companion.m17539a(0L);
        f39631U = companion.m17539a(335544320);
        f39633V = new DivEdgeInsets(companion.m17539a(0L), companion.m17539a(12L), companion.m17539a(12L), companion.m17539a(0L), null, 16);
        f39635W = companion.m17539a(Boolean.TRUE);
        f39637X = new DivTabs.TabTitleStyle(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143);
        f39639Y = new DivEdgeInsets(companion.m17539a(8L), companion.m17539a(12L), companion.m17539a(12L), companion.m17539a(0L), null, 16);
        f39641Z = new DivTransform(null, null, null, 7);
        f39643a0 = companion.m17539a(DivVisibility.VISIBLE);
        f39645b0 = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i2 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f39647c0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f39649d0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f39651e0 = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f39653f0 = C3050i0.f41506g;
        f39655g0 = C3050i0.f41513n;
        f39657h0 = C3052j0.f41562h;
        f39659i0 = C3052j0.f41563i;
        f39661j0 = C3050i0.f41514o;
        f39663k0 = C3050i0.f41515p;
        f39665l0 = C3052j0.f41564j;
        f39667m0 = C3052j0.f41565k;
        f39669n0 = C3052j0.f41566l;
        f39671o0 = C3052j0.f41567m;
        f39673p0 = C3050i0.f41507h;
        f39674q0 = C3050i0.f41508i;
        f39675r0 = C3046g0.f41394B;
        f39676s0 = C3046g0.f41395C;
        f39677t0 = C3050i0.f41509j;
        f39678u0 = C3050i0.f41510k;
        f39679v0 = C3046g0.f41396D;
        f39680w0 = C3046g0.f41397E;
        f39681x0 = C3050i0.f41511l;
        f39682y0 = C3050i0.f41512m;
        f39683z0 = C3052j0.f41556b;
        f39601A0 = C3052j0.f41557c;
        f39602B0 = C3052j0.f41558d;
        f39603C0 = C3052j0.f41559e;
        f39604D0 = C3052j0.f41560f;
        f39605E0 = C3052j0.f41561g;
        f39606F0 = new Function3<String, JSONObject, ParsingEnvironment, DivAccessibility>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$ACCESSIBILITY_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAccessibility mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAccessibility.Companion companion3 = DivAccessibility.f34479f;
                DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject2, str2, DivAccessibility.f34486m, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divAccessibility == null ? DivTabsTemplate.f39611K : divAccessibility;
            }
        };
        f39607G0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$ALIGNMENT_HORIZONTAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentHorizontal> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentHorizontal.f34618d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivTabsTemplate.f39647c0);
            }
        };
        f39608H0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$ALIGNMENT_VERTICAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentVertical> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentVertical.Converter converter = DivAlignmentVertical.f34625c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentVertical.f34626d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivTabsTemplate.f39649d0);
            }
        };
        f39609I0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$ALPHA_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
                ValueValidator<Double> valueValidator = DivTabsTemplate.f39655g0;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Double> expression = DivTabsTemplate.f39613L;
                Expression<Double> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
                return m17328t == null ? expression : m17328t;
            }
        };
        f39610J0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$BACKGROUND_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivBackground> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBackground.Companion companion3 = DivBackground.f34750a;
                return JsonParser.m17333y(jSONObject2, str2, DivBackground.f34751b, DivTabsTemplate.f39657h0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f39612K0 = new Function3<String, JSONObject, ParsingEnvironment, DivBorder>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$BORDER_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivBorder mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBorder.Companion companion3 = DivBorder.f34785f;
                DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject2, str2, DivBorder.f34788i, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divBorder == null ? DivTabsTemplate.f39615M : divBorder;
            }
        };
        f39614L0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$COLUMN_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivTabsTemplate.f39663k0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f39616M0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$DISAPPEAR_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivDisappearAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivDisappearAction.Companion companion3 = DivDisappearAction.f35537a;
                return JsonParser.m17333y(jSONObject2, str2, DivDisappearAction.f35545i, DivTabsTemplate.f39665l0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f39618N0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$DYNAMIC_HEIGHT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Boolean> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Object, Boolean> function1 = ParsingConvertersKt.f33829c;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Boolean> expression = DivTabsTemplate.f39617N;
                Expression<Boolean> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33848a);
                return m17330v == null ? expression : m17330v;
            }
        };
        f39620O0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$EXTENSIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivExtension> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivExtension.Companion companion3 = DivExtension.f35659c;
                return JsonParser.m17333y(jSONObject2, str2, DivExtension.f35660d, DivTabsTemplate.f39669n0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f39622P0 = new Function3<String, JSONObject, ParsingEnvironment, DivFocus>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$FOCUS_READER$1
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
        f39624Q0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$HAS_SEPARATOR_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Boolean> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Object, Boolean> function1 = ParsingConvertersKt.f33829c;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Boolean> expression = DivTabsTemplate.f39619O;
                Expression<Boolean> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33848a);
                return m17330v == null ? expression : m17330v;
            }
        };
        f39626R0 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$HEIGHT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivTabsTemplate.f39621P : divSize;
            }
        };
        f39628S0 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$ID_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return (String) JsonParser.m17323o(jSONObject2, str2, DivTabsTemplate.f39674q0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f39630T0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTabs.Item>>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$ITEMS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTabs.Item> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTabs.Item.Companion companion3 = DivTabs.Item.f39538d;
                List<DivTabs.Item> m17321m = JsonParser.m17321m(jSONObject2, str2, DivTabs.Item.f39539e, DivTabsTemplate.f39675r0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                Intrinsics.m32178g(m17321m, "readList(json, key, DivT…LIDATOR, env.logger, env)");
                return m17321m;
            }
        };
        f39632U0 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$MARGINS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivTabsTemplate.f39623Q : divEdgeInsets;
            }
        };
        f39634V0 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$PADDINGS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivTabsTemplate.f39625R : divEdgeInsets;
            }
        };
        f39636W0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$RESTRICT_PARENT_SCROLL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Boolean> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Object, Boolean> function1 = ParsingConvertersKt.f33829c;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Boolean> expression = DivTabsTemplate.f39627S;
                Expression<Boolean> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33848a);
                return m17330v == null ? expression : m17330v;
            }
        };
        f39638X0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$ROW_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivTabsTemplate.f39678u0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f39640Y0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$SELECTED_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivTabsTemplate.f39679v0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f39642Z0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$SELECTED_TAB_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivTabsTemplate.f39682y0;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivTabsTemplate.f39629T;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        f39644a1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$SEPARATOR_COLOR_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Integer> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Object, Integer> function1 = ParsingConvertersKt.f33827a;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Integer> expression = DivTabsTemplate.f39631U;
                Expression<Integer> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33853f);
                return m17330v == null ? expression : m17330v;
            }
        };
        f39646b1 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$SEPARATOR_PADDINGS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivTabsTemplate.f39633V : divEdgeInsets;
            }
        };
        f39648c1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$SWITCH_TABS_BY_CONTENT_SWIPE_ENABLED_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Boolean> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Object, Boolean> function1 = ParsingConvertersKt.f33829c;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Boolean> expression = DivTabsTemplate.f39635W;
                Expression<Boolean> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33848a);
                return m17330v == null ? expression : m17330v;
            }
        };
        f39650d1 = new Function3<String, JSONObject, ParsingEnvironment, DivTabs.TabTitleStyle>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$TAB_TITLE_STYLE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivTabs.TabTitleStyle mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTabs.TabTitleStyle.Companion companion3 = DivTabs.TabTitleStyle.f39560r;
                DivTabs.TabTitleStyle tabTitleStyle = (DivTabs.TabTitleStyle) JsonParser.m17322n(jSONObject2, str2, DivTabs.TabTitleStyle.f39559P, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return tabTitleStyle == null ? DivTabsTemplate.f39637X : tabTitleStyle;
            }
        };
        f39652e1 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$TITLE_PADDINGS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivTabsTemplate.f39639Y : divEdgeInsets;
            }
        };
        f39654f1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$TOOLTIPS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTooltip> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTooltip.Companion companion3 = DivTooltip.f40492h;
                return JsonParser.m17333y(jSONObject2, str2, DivTooltip.f40497m, DivTabsTemplate.f39683z0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f39656g1 = new Function3<String, JSONObject, ParsingEnvironment, DivTransform>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$TRANSFORM_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivTransform mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransform.Companion companion3 = DivTransform.f40551d;
                DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject2, str2, DivTransform.f40554g, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divTransform == null ? DivTabsTemplate.f39641Z : divTransform;
            }
        };
        f39658h1 = new Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$TRANSITION_CHANGE_READER$1
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
        f39660i1 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$TRANSITION_IN_READER$1
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
        f39662j1 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$TRANSITION_OUT_READER$1
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
        f39664k1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$TRANSITION_TRIGGERS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTransitionTrigger> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransitionTrigger.Converter converter = DivTransitionTrigger.f40582c;
                return JsonParser.m17332x(jSONObject2, str2, DivTransitionTrigger.f40583d, DivTabsTemplate.f39602B0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        DivTabsTemplate$Companion$TYPE_READER$1 divTabsTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$TYPE_READER$1
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
        f39666l1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$VISIBILITY_READER$1
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
                Expression<DivVisibility> expression = DivTabsTemplate.f39643a0;
                Expression<DivVisibility> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivTabsTemplate.f39651e0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f39668m1 = new Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$VISIBILITY_ACTION_READER$1
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
        f39670n1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$VISIBILITY_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivVisibilityAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivVisibilityAction.Companion companion3 = DivVisibilityAction.f40938i;
                return JsonParser.m17333y(jSONObject2, str2, DivVisibilityAction.f40946q, DivTabsTemplate.f39604D0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f39672o1 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$WIDTH_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivTabsTemplate.f39645b0 : divSize;
            }
        };
        DivTabsTemplate$Companion$CREATOR$1 divTabsTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivTabsTemplate>() { // from class: com.yandex.div2.DivTabsTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivTabsTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivTabsTemplate(env, null, false, it);
            }
        };
    }

    public DivTabsTemplate(@NotNull ParsingEnvironment env, @Nullable DivTabsTemplate divTabsTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        Field<DivAccessibilityTemplate> field = divTabsTemplate == null ? null : divTabsTemplate.f39694a;
        DivAccessibilityTemplate.Companion companion = DivAccessibilityTemplate.f34515g;
        this.f39694a = JsonTemplateParser.m17354o(json, "accessibility", z, field, DivAccessibilityTemplate.f34531w, f34328a, env);
        Field<Expression<DivAlignmentHorizontal>> field2 = divTabsTemplate == null ? null : divTabsTemplate.f39695b;
        DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
        this.f39695b = JsonTemplateParser.m17358s(json, "alignment_horizontal", z, field2, DivAlignmentHorizontal.f34618d, f34328a, env, f39647c0);
        Field<Expression<DivAlignmentVertical>> field3 = divTabsTemplate == null ? null : divTabsTemplate.f39696c;
        DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
        this.f39696c = JsonTemplateParser.m17358s(json, "alignment_vertical", z, field3, DivAlignmentVertical.f34626d, f34328a, env, f39649d0);
        this.f39697d = JsonTemplateParser.m17357r(json, "alpha", z, divTabsTemplate == null ? null : divTabsTemplate.f39697d, ParsingConvertersKt.f33830d, f39653f0, f34328a, env, TypeHelpersKt.f33851d);
        Field<List<DivBackgroundTemplate>> field4 = divTabsTemplate == null ? null : divTabsTemplate.f39698e;
        DivBackgroundTemplate.Companion companion2 = DivBackgroundTemplate.f34758a;
        this.f39698e = JsonTemplateParser.m17360u(json, "background", z, field4, DivBackgroundTemplate.f34759b, f39659i0, f34328a, env);
        Field<DivBorderTemplate> field5 = divTabsTemplate == null ? null : divTabsTemplate.f39699f;
        DivBorderTemplate.Companion companion3 = DivBorderTemplate.f34795f;
        this.f39699f = JsonTemplateParser.m17354o(json, "border", z, field5, DivBorderTemplate.f34804o, f34328a, env);
        Field<Expression<Long>> field6 = divTabsTemplate == null ? null : divTabsTemplate.f39700g;
        Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
        ValueValidator<Long> valueValidator = f39661j0;
        TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
        this.f39700g = JsonTemplateParser.m17357r(json, "column_span", z, field6, function1, valueValidator, f34328a, env, typeHelper);
        Field<List<DivDisappearActionTemplate>> field7 = divTabsTemplate == null ? null : divTabsTemplate.f39701h;
        DivDisappearActionTemplate.Companion companion4 = DivDisappearActionTemplate.f35550i;
        this.f39701h = JsonTemplateParser.m17360u(json, "disappear_actions", z, field7, DivDisappearActionTemplate.f35549C, f39667m0, f34328a, env);
        Field<Expression<Boolean>> field8 = divTabsTemplate == null ? null : divTabsTemplate.f39702i;
        Function1<Object, Boolean> function12 = ParsingConvertersKt.f33829c;
        TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.f33848a;
        this.f39702i = JsonTemplateParser.m17358s(json, "dynamic_height", z, field8, function12, f34328a, env, typeHelper2);
        Field<List<DivExtensionTemplate>> field9 = divTabsTemplate == null ? null : divTabsTemplate.f39703j;
        DivExtensionTemplate.Companion companion5 = DivExtensionTemplate.f35664c;
        this.f39703j = JsonTemplateParser.m17360u(json, "extensions", z, field9, DivExtensionTemplate.f35667f, f39671o0, f34328a, env);
        Field<DivFocusTemplate> field10 = divTabsTemplate == null ? null : divTabsTemplate.f39704k;
        DivFocusTemplate.Companion companion6 = DivFocusTemplate.f35833f;
        this.f39704k = JsonTemplateParser.m17354o(json, "focus", z, field10, DivFocusTemplate.f35846s, f34328a, env);
        this.f39705l = JsonTemplateParser.m17358s(json, "has_separator", z, divTabsTemplate == null ? null : divTabsTemplate.f39705l, function12, f34328a, env, typeHelper2);
        Field<DivSizeTemplate> field11 = divTabsTemplate == null ? null : divTabsTemplate.f39706m;
        DivSizeTemplate.Companion companion7 = DivSizeTemplate.f38839a;
        Function2<ParsingEnvironment, JSONObject, DivSizeTemplate> function2 = DivSizeTemplate.f38840b;
        this.f39706m = JsonTemplateParser.m17354o(json, "height", z, field11, function2, f34328a, env);
        this.f39707n = JsonTemplateParser.m17351l(json, "id", z, divTabsTemplate == null ? null : divTabsTemplate.f39707n, f39673p0, f34328a, env);
        Field<List<ItemTemplate>> field12 = divTabsTemplate == null ? null : divTabsTemplate.f39708o;
        ItemTemplate.Companion companion8 = ItemTemplate.f39761d;
        this.f39708o = JsonTemplateParser.m17350k(json, "items", z, field12, ItemTemplate.f39765h, f39676s0, f34328a, env);
        Field<DivEdgeInsetsTemplate> field13 = divTabsTemplate == null ? null : divTabsTemplate.f39709p;
        DivEdgeInsetsTemplate.Companion companion9 = DivEdgeInsetsTemplate.f35626f;
        Function2<ParsingEnvironment, JSONObject, DivEdgeInsetsTemplate> function22 = DivEdgeInsetsTemplate.f35646z;
        this.f39709p = JsonTemplateParser.m17354o(json, "margins", z, field13, function22, f34328a, env);
        this.f39710q = JsonTemplateParser.m17354o(json, "paddings", z, divTabsTemplate == null ? null : divTabsTemplate.f39710q, function22, f34328a, env);
        this.f39711r = JsonTemplateParser.m17358s(json, "restrict_parent_scroll", z, divTabsTemplate == null ? null : divTabsTemplate.f39711r, function12, f34328a, env, typeHelper2);
        this.f39712s = JsonTemplateParser.m17357r(json, "row_span", z, divTabsTemplate == null ? null : divTabsTemplate.f39712s, function1, f39677t0, f34328a, env, typeHelper);
        Field<List<DivActionTemplate>> field14 = divTabsTemplate == null ? null : divTabsTemplate.f39713t;
        DivActionTemplate.Companion companion10 = DivActionTemplate.f34572i;
        this.f39713t = JsonTemplateParser.m17360u(json, "selected_actions", z, field14, DivActionTemplate.f34586w, f39680w0, f34328a, env);
        this.f39714u = JsonTemplateParser.m17357r(json, "selected_tab", z, divTabsTemplate == null ? null : divTabsTemplate.f39714u, function1, f39681x0, f34328a, env, typeHelper);
        this.f39715v = JsonTemplateParser.m17358s(json, "separator_color", z, divTabsTemplate == null ? null : divTabsTemplate.f39715v, ParsingConvertersKt.f33827a, f34328a, env, TypeHelpersKt.f33853f);
        this.f39716w = JsonTemplateParser.m17354o(json, "separator_paddings", z, divTabsTemplate == null ? null : divTabsTemplate.f39716w, function22, f34328a, env);
        this.f39717x = JsonTemplateParser.m17358s(json, "switch_tabs_by_content_swipe_enabled", z, divTabsTemplate == null ? null : divTabsTemplate.f39717x, function12, f34328a, env, typeHelper2);
        Field<TabTitleStyleTemplate> field15 = divTabsTemplate == null ? null : divTabsTemplate.f39718y;
        TabTitleStyleTemplate.Companion companion11 = TabTitleStyleTemplate.f39813s;
        this.f39718y = JsonTemplateParser.m17354o(json, "tab_title_style", z, field15, TabTitleStyleTemplate.f39812n0, f34328a, env);
        this.f39719z = JsonTemplateParser.m17354o(json, "title_paddings", z, divTabsTemplate == null ? null : divTabsTemplate.f39719z, function22, f34328a, env);
        Field<List<DivTooltipTemplate>> field16 = divTabsTemplate == null ? null : divTabsTemplate.f39684A;
        DivTooltipTemplate.Companion companion12 = DivTooltipTemplate.f40520h;
        this.f39684A = JsonTemplateParser.m17360u(json, "tooltips", z, field16, DivTooltipTemplate.f40534v, f39601A0, f34328a, env);
        Field<DivTransformTemplate> field17 = divTabsTemplate == null ? null : divTabsTemplate.f39685B;
        DivTransformTemplate.Companion companion13 = DivTransformTemplate.f40559d;
        this.f39685B = JsonTemplateParser.m17354o(json, "transform", z, field17, DivTransformTemplate.f40565j, f34328a, env);
        Field<DivChangeTransitionTemplate> field18 = divTabsTemplate == null ? null : divTabsTemplate.f39686C;
        DivChangeTransitionTemplate.Companion companion14 = DivChangeTransitionTemplate.f34861a;
        this.f39686C = JsonTemplateParser.m17354o(json, "transition_change", z, field18, DivChangeTransitionTemplate.f34862b, f34328a, env);
        Field<DivAppearanceTransitionTemplate> field19 = divTabsTemplate == null ? null : divTabsTemplate.f39687D;
        DivAppearanceTransitionTemplate.Companion companion15 = DivAppearanceTransitionTemplate.f34733a;
        Function2<ParsingEnvironment, JSONObject, DivAppearanceTransitionTemplate> function23 = DivAppearanceTransitionTemplate.f34734b;
        this.f39687D = JsonTemplateParser.m17354o(json, "transition_in", z, field19, function23, f34328a, env);
        this.f39688E = JsonTemplateParser.m17354o(json, "transition_out", z, divTabsTemplate == null ? null : divTabsTemplate.f39688E, function23, f34328a, env);
        Field<List<DivTransitionTrigger>> field20 = divTabsTemplate == null ? null : divTabsTemplate.f39689F;
        DivTransitionTrigger.Converter converter3 = DivTransitionTrigger.f40582c;
        this.f39689F = JsonTemplateParser.m17359t(json, "transition_triggers", z, field20, DivTransitionTrigger.f40583d, f39603C0, f34328a, env);
        Field<Expression<DivVisibility>> field21 = divTabsTemplate == null ? null : divTabsTemplate.f39690G;
        DivVisibility.Converter converter4 = DivVisibility.f40930c;
        this.f39690G = JsonTemplateParser.m17358s(json, "visibility", z, field21, DivVisibility.f40931d, f34328a, env, f39651e0);
        Field<DivVisibilityActionTemplate> field22 = divTabsTemplate == null ? null : divTabsTemplate.f39691H;
        DivVisibilityActionTemplate.Companion companion16 = DivVisibilityActionTemplate.f40959i;
        Function2<ParsingEnvironment, JSONObject, DivVisibilityActionTemplate> function24 = DivVisibilityActionTemplate.f40958C;
        this.f39691H = JsonTemplateParser.m17354o(json, "visibility_action", z, field22, function24, f34328a, env);
        this.f39692I = JsonTemplateParser.m17360u(json, "visibility_actions", z, divTabsTemplate == null ? null : divTabsTemplate.f39692I, function24, f39605E0, f34328a, env);
        this.f39693J = JsonTemplateParser.m17354o(json, "width", z, divTabsTemplate == null ? null : divTabsTemplate.f39693J, function2, f34328a, env);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivTabs mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        DivAccessibility divAccessibility = (DivAccessibility) FieldKt.m17381g(this.f39694a, env, "accessibility", data, f39606F0);
        if (divAccessibility == null) {
            divAccessibility = f39611K;
        }
        DivAccessibility divAccessibility2 = divAccessibility;
        Expression expression = (Expression) FieldKt.m17378d(this.f39695b, env, "alignment_horizontal", data, f39607G0);
        Expression expression2 = (Expression) FieldKt.m17378d(this.f39696c, env, "alignment_vertical", data, f39608H0);
        Expression<Double> expression3 = (Expression) FieldKt.m17378d(this.f39697d, env, "alpha", data, f39609I0);
        if (expression3 == null) {
            expression3 = f39613L;
        }
        Expression<Double> expression4 = expression3;
        List m17382h = FieldKt.m17382h(this.f39698e, env, "background", data, f39657h0, f39610J0);
        DivBorder divBorder = (DivBorder) FieldKt.m17381g(this.f39699f, env, "border", data, f39612K0);
        if (divBorder == null) {
            divBorder = f39615M;
        }
        DivBorder divBorder2 = divBorder;
        Expression expression5 = (Expression) FieldKt.m17378d(this.f39700g, env, "column_span", data, f39614L0);
        List m17382h2 = FieldKt.m17382h(this.f39701h, env, "disappear_actions", data, f39665l0, f39616M0);
        Expression<Boolean> expression6 = (Expression) FieldKt.m17378d(this.f39702i, env, "dynamic_height", data, f39618N0);
        if (expression6 == null) {
            expression6 = f39617N;
        }
        Expression<Boolean> expression7 = expression6;
        List m17382h3 = FieldKt.m17382h(this.f39703j, env, "extensions", data, f39669n0, f39620O0);
        DivFocus divFocus = (DivFocus) FieldKt.m17381g(this.f39704k, env, "focus", data, f39622P0);
        Expression<Boolean> expression8 = (Expression) FieldKt.m17378d(this.f39705l, env, "has_separator", data, f39624Q0);
        if (expression8 == null) {
            expression8 = f39619O;
        }
        Expression<Boolean> expression9 = expression8;
        DivSize divSize = (DivSize) FieldKt.m17381g(this.f39706m, env, "height", data, f39626R0);
        if (divSize == null) {
            divSize = f39621P;
        }
        DivSize divSize2 = divSize;
        String str = (String) FieldKt.m17378d(this.f39707n, env, "id", data, f39628S0);
        List m17384j = FieldKt.m17384j(this.f39708o, env, "items", data, f39675r0, f39630T0);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) FieldKt.m17381g(this.f39709p, env, "margins", data, f39632U0);
        if (divEdgeInsets == null) {
            divEdgeInsets = f39623Q;
        }
        DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
        DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) FieldKt.m17381g(this.f39710q, env, "paddings", data, f39634V0);
        if (divEdgeInsets3 == null) {
            divEdgeInsets3 = f39625R;
        }
        DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
        Expression<Boolean> expression10 = (Expression) FieldKt.m17378d(this.f39711r, env, "restrict_parent_scroll", data, f39636W0);
        if (expression10 == null) {
            expression10 = f39627S;
        }
        Expression<Boolean> expression11 = expression10;
        Expression expression12 = (Expression) FieldKt.m17378d(this.f39712s, env, "row_span", data, f39638X0);
        List m17382h4 = FieldKt.m17382h(this.f39713t, env, "selected_actions", data, f39679v0, f39640Y0);
        Expression<Long> expression13 = (Expression) FieldKt.m17378d(this.f39714u, env, "selected_tab", data, f39642Z0);
        if (expression13 == null) {
            expression13 = f39629T;
        }
        Expression<Long> expression14 = expression13;
        Expression<Integer> expression15 = (Expression) FieldKt.m17378d(this.f39715v, env, "separator_color", data, f39644a1);
        if (expression15 == null) {
            expression15 = f39631U;
        }
        Expression<Integer> expression16 = expression15;
        DivEdgeInsets divEdgeInsets5 = (DivEdgeInsets) FieldKt.m17381g(this.f39716w, env, "separator_paddings", data, f39646b1);
        if (divEdgeInsets5 == null) {
            divEdgeInsets5 = f39633V;
        }
        DivEdgeInsets divEdgeInsets6 = divEdgeInsets5;
        Expression<Boolean> expression17 = (Expression) FieldKt.m17378d(this.f39717x, env, "switch_tabs_by_content_swipe_enabled", data, f39648c1);
        if (expression17 == null) {
            expression17 = f39635W;
        }
        Expression<Boolean> expression18 = expression17;
        DivTabs.TabTitleStyle tabTitleStyle = (DivTabs.TabTitleStyle) FieldKt.m17381g(this.f39718y, env, "tab_title_style", data, f39650d1);
        if (tabTitleStyle == null) {
            tabTitleStyle = f39637X;
        }
        DivTabs.TabTitleStyle tabTitleStyle2 = tabTitleStyle;
        DivEdgeInsets divEdgeInsets7 = (DivEdgeInsets) FieldKt.m17381g(this.f39719z, env, "title_paddings", data, f39652e1);
        if (divEdgeInsets7 == null) {
            divEdgeInsets7 = f39639Y;
        }
        DivEdgeInsets divEdgeInsets8 = divEdgeInsets7;
        List m17382h5 = FieldKt.m17382h(this.f39684A, env, "tooltips", data, f39683z0, f39654f1);
        DivTransform divTransform = (DivTransform) FieldKt.m17381g(this.f39685B, env, "transform", data, f39656g1);
        if (divTransform == null) {
            divTransform = f39641Z;
        }
        DivTransform divTransform2 = divTransform;
        DivChangeTransition divChangeTransition = (DivChangeTransition) FieldKt.m17381g(this.f39686C, env, "transition_change", data, f39658h1);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) FieldKt.m17381g(this.f39687D, env, "transition_in", data, f39660i1);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) FieldKt.m17381g(this.f39688E, env, "transition_out", data, f39662j1);
        List m17380f = FieldKt.m17380f(this.f39689F, env, "transition_triggers", data, f39602B0, f39664k1);
        Expression<DivVisibility> expression19 = (Expression) FieldKt.m17378d(this.f39690G, env, "visibility", data, f39666l1);
        if (expression19 == null) {
            expression19 = f39643a0;
        }
        Expression<DivVisibility> expression20 = expression19;
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) FieldKt.m17381g(this.f39691H, env, "visibility_action", data, f39668m1);
        List m17382h6 = FieldKt.m17382h(this.f39692I, env, "visibility_actions", data, f39604D0, f39670n1);
        DivSize divSize3 = (DivSize) FieldKt.m17381g(this.f39693J, env, "width", data, f39672o1);
        if (divSize3 == null) {
            divSize3 = f39645b0;
        }
        return new DivTabs(divAccessibility2, expression, expression2, expression4, m17382h, divBorder2, expression5, m17382h2, expression7, m17382h3, divFocus, expression9, divSize2, str, m17384j, divEdgeInsets2, divEdgeInsets4, expression11, expression12, m17382h4, expression14, expression16, divEdgeInsets6, expression18, tabTitleStyle2, divEdgeInsets8, m17382h5, divTransform2, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17380f, expression20, divVisibilityAction, m17382h6, divSize3);
    }
}
