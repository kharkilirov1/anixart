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
import com.yandex.div2.Div;
import com.yandex.div2.DivAccessibility;
import com.yandex.div2.DivAccessibilityTemplate;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivActionTemplate;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivAnimationTemplate;
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
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeTemplate;
import com.yandex.div2.DivTemplate;
import com.yandex.div2.DivTooltip;
import com.yandex.div2.DivTooltipTemplate;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivTransformTemplate;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.div2.DivVisibilityActionTemplate;
import com.yandex.mobile.ads.C4632R;
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

/* compiled from: DivGridTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivGridTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivGrid;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivGridTemplate implements JSONSerializable, JsonTemplate<DivGrid> {

    /* renamed from: A0 */
    @NotNull
    public static final ListValidator<DivTooltip> f36494A0;

    /* renamed from: B0 */
    @NotNull
    public static final ListValidator<DivTooltipTemplate> f36495B0;

    /* renamed from: C0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f36496C0;

    /* renamed from: D0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f36497D0;

    /* renamed from: E0 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f36498E0;

    /* renamed from: F0 */
    @NotNull
    public static final ListValidator<DivVisibilityActionTemplate> f36499F0;

    /* renamed from: G0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAccessibility> f36500G0;

    /* renamed from: H0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAction> f36501H0;

    /* renamed from: I0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAnimation> f36502I0;

    /* renamed from: J */
    @NotNull
    public static final DivAccessibility f36503J = new DivAccessibility(null, null, null, null, null, null, 63);

    /* renamed from: J0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f36504J0;

    /* renamed from: K */
    @NotNull
    public static final DivAnimation f36505K;

    /* renamed from: K0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>> f36506K0;

    /* renamed from: L */
    @NotNull
    public static final Expression<Double> f36507L;

    /* renamed from: L0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>> f36508L0;

    /* renamed from: M */
    @NotNull
    public static final DivBorder f36509M;

    /* renamed from: M0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f36510M0;

    /* renamed from: N */
    @NotNull
    public static final Expression<DivAlignmentHorizontal> f36511N;

    /* renamed from: N0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>> f36512N0;

    /* renamed from: O */
    @NotNull
    public static final Expression<DivAlignmentVertical> f36513O;

    /* renamed from: O0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivBorder> f36514O0;

    /* renamed from: P */
    @NotNull
    public static final DivSize.WrapContent f36515P;

    /* renamed from: P0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f36516P0;

    /* renamed from: Q */
    @NotNull
    public static final DivEdgeInsets f36517Q;

    /* renamed from: Q0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f36518Q0;

    /* renamed from: R */
    @NotNull
    public static final DivEdgeInsets f36519R;

    /* renamed from: R0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>> f36520R0;

    /* renamed from: S */
    @NotNull
    public static final DivTransform f36521S;

    /* renamed from: S0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>> f36522S0;

    /* renamed from: T */
    @NotNull
    public static final Expression<DivVisibility> f36523T;

    /* renamed from: T0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>> f36524T0;

    /* renamed from: U */
    @NotNull
    public static final DivSize.MatchParent f36525U;

    /* renamed from: U0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f36526U0;

    /* renamed from: V */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f36527V;

    /* renamed from: V0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>> f36528V0;

    /* renamed from: W */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f36529W;

    /* renamed from: W0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivFocus> f36530W0;

    /* renamed from: X */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f36531X;

    /* renamed from: X0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f36532X0;

    /* renamed from: Y */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f36533Y;

    /* renamed from: Y0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f36534Y0;

    /* renamed from: Z */
    @NotNull
    public static final TypeHelper<DivVisibility> f36535Z;

    /* renamed from: Z0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<Div>> f36536Z0;

    /* renamed from: a0 */
    @NotNull
    public static final ListValidator<DivAction> f36537a0;

    /* renamed from: a1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f36538a1;

    /* renamed from: b0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f36539b0;

    /* renamed from: b1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f36540b1;

    /* renamed from: c0 */
    @NotNull
    public static final ValueValidator<Double> f36541c0;

    /* renamed from: c1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f36542c1;

    /* renamed from: d0 */
    @NotNull
    public static final ValueValidator<Double> f36543d0;

    /* renamed from: d1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f36544d1;

    /* renamed from: e0 */
    @NotNull
    public static final ListValidator<DivBackground> f36545e0;

    /* renamed from: e1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f36546e1;

    /* renamed from: f0 */
    @NotNull
    public static final ListValidator<DivBackgroundTemplate> f36547f0;

    /* renamed from: f1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>> f36548f1;

    /* renamed from: g0 */
    @NotNull
    public static final ValueValidator<Long> f36549g0;

    /* renamed from: g1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivTransform> f36550g1;

    /* renamed from: h0 */
    @NotNull
    public static final ValueValidator<Long> f36551h0;

    /* renamed from: h1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition> f36552h1;

    /* renamed from: i0 */
    @NotNull
    public static final ValueValidator<Long> f36553i0;

    /* renamed from: i1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f36554i1;

    /* renamed from: j0 */
    @NotNull
    public static final ValueValidator<Long> f36555j0;

    /* renamed from: j1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f36556j1;

    /* renamed from: k0 */
    @NotNull
    public static final ListValidator<DivDisappearAction> f36557k0;

    /* renamed from: k1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>> f36558k1;

    /* renamed from: l0 */
    @NotNull
    public static final ListValidator<DivDisappearActionTemplate> f36559l0;

    /* renamed from: l1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>> f36560l1;

    /* renamed from: m0 */
    @NotNull
    public static final ListValidator<DivAction> f36561m0;

    /* renamed from: m1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction> f36562m1;

    /* renamed from: n0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f36563n0;

    /* renamed from: n1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>> f36564n1;

    /* renamed from: o0 */
    @NotNull
    public static final ListValidator<DivExtension> f36565o0;

    /* renamed from: o1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f36566o1;

    /* renamed from: p0 */
    @NotNull
    public static final ListValidator<DivExtensionTemplate> f36567p0;

    /* renamed from: q0 */
    @NotNull
    public static final ValueValidator<String> f36568q0;

    /* renamed from: r0 */
    @NotNull
    public static final ValueValidator<String> f36569r0;

    /* renamed from: s0 */
    @NotNull
    public static final ListValidator<Div> f36570s0;

    /* renamed from: t0 */
    @NotNull
    public static final ListValidator<DivTemplate> f36571t0;

    /* renamed from: u0 */
    @NotNull
    public static final ListValidator<DivAction> f36572u0;

    /* renamed from: v0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f36573v0;

    /* renamed from: w0 */
    @NotNull
    public static final ValueValidator<Long> f36574w0;

    /* renamed from: x0 */
    @NotNull
    public static final ValueValidator<Long> f36575x0;

    /* renamed from: y0 */
    @NotNull
    public static final ListValidator<DivAction> f36576y0;

    /* renamed from: z0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f36577z0;

    /* renamed from: A */
    @JvmField
    @NotNull
    public final Field<DivTransformTemplate> f36578A;

    /* renamed from: B */
    @JvmField
    @NotNull
    public final Field<DivChangeTransitionTemplate> f36579B;

    /* renamed from: C */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f36580C;

    /* renamed from: D */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f36581D;

    /* renamed from: E */
    @JvmField
    @NotNull
    public final Field<List<DivTransitionTrigger>> f36582E;

    /* renamed from: F */
    @JvmField
    @NotNull
    public final Field<Expression<DivVisibility>> f36583F;

    /* renamed from: G */
    @JvmField
    @NotNull
    public final Field<DivVisibilityActionTemplate> f36584G;

    /* renamed from: H */
    @JvmField
    @NotNull
    public final Field<List<DivVisibilityActionTemplate>> f36585H;

    /* renamed from: I */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f36586I;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<DivAccessibilityTemplate> f36587a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<DivActionTemplate> f36588b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<DivAnimationTemplate> f36589c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f36590d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f36591e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f36592f;

    /* renamed from: g */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f36593g;

    /* renamed from: h */
    @JvmField
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f36594h;

    /* renamed from: i */
    @JvmField
    @NotNull
    public final Field<DivBorderTemplate> f36595i;

    /* renamed from: j */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f36596j;

    /* renamed from: k */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f36597k;

    /* renamed from: l */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f36598l;

    /* renamed from: m */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f36599m;

    /* renamed from: n */
    @JvmField
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f36600n;

    /* renamed from: o */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f36601o;

    /* renamed from: p */
    @JvmField
    @NotNull
    public final Field<List<DivExtensionTemplate>> f36602p;

    /* renamed from: q */
    @JvmField
    @NotNull
    public final Field<DivFocusTemplate> f36603q;

    /* renamed from: r */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f36604r;

    /* renamed from: s */
    @JvmField
    @NotNull
    public final Field<String> f36605s;

    /* renamed from: t */
    @JvmField
    @NotNull
    public final Field<List<DivTemplate>> f36606t;

    /* renamed from: u */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f36607u;

    /* renamed from: v */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f36608v;

    /* renamed from: w */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f36609w;

    /* renamed from: x */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f36610x;

    /* renamed from: y */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f36611y;

    /* renamed from: z */
    @JvmField
    @NotNull
    public final Field<List<DivTooltipTemplate>> f36612z;

    /* compiled from: DivGridTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\bR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\bR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0014R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0014R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0014R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0011R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0011R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\bR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\bR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\bR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\bR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\bR\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\bR\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0014R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002030\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0014R\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\bR\u001a\u00109\u001a\b\u0012\u0004\u0012\u0002080\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\bR\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\bR\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\bR\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010>R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\u0014R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010\u0014R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010\bR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010\bR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010\bR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010\bR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010\bR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020K0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010\bR\u0014\u0010N\u001a\u0002038\u0006X\u0086T¢\u0006\u0006\n\u0004\bN\u0010OR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\"0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020$0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010RR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\"0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010RR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020$0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010RR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020V0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010RR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020X0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010\bR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\bR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020V0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010\u0011R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_¨\u0006`"}, m31884d2 = {"Lcom/yandex/div2/DivGridTemplate$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivActionTemplate;", "ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAction;", "ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivAnimation;", "ACTION_ANIMATION_DEFAULT_VALUE", "Lcom/yandex/div2/DivAnimation;", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "Lcom/yandex/div2/DivBackgroundTemplate;", "BACKGROUND_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "", "COLUMN_COUNT_TEMPLATE_VALIDATOR", "COLUMN_COUNT_VALIDATOR", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivAlignmentHorizontal;", "CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE", "Lcom/yandex/div2/DivAlignmentVertical;", "CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE", "Lcom/yandex/div2/DivDisappearActionTemplate;", "DISAPPEAR_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "DOUBLETAP_ACTIONS_TEMPLATE_VALIDATOR", "DOUBLETAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivExtensionTemplate;", "EXTENSIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div2/DivTemplate;", "ITEMS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/Div;", "ITEMS_VALIDATOR", "LONGTAP_ACTIONS_TEMPLATE_VALIDATOR", "LONGTAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "PADDINGS_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "SELECTED_ACTIONS_TEMPLATE_VALIDATOR", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivTooltipTemplate;", "TOOLTIPS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_TEMPLATE_VALIDATOR", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL", "TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/DivVisibilityActionTemplate;", "VISIBILITY_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        Expression m17539a = companion.m17539a(100L);
        Expression m17539a2 = companion.m17539a(Double.valueOf(0.6d));
        Expression m17539a3 = companion.m17539a(DivAnimation.Name.FADE);
        Double valueOf = Double.valueOf(1.0d);
        f36505K = new DivAnimation(m17539a, m17539a2, null, null, m17539a3, null, null, companion.m17539a(valueOf), C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
        f36507L = companion.m17539a(valueOf);
        f36509M = new DivBorder(null, null, null, null, null, 31);
        f36511N = companion.m17539a(DivAlignmentHorizontal.LEFT);
        f36513O = companion.m17539a(DivAlignmentVertical.TOP);
        f36515P = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7));
        f36517Q = new DivEdgeInsets(null, null, null, null, null, 31);
        f36519R = new DivEdgeInsets(null, null, null, null, null, 31);
        f36521S = new DivTransform(null, null, null, 7);
        f36523T = companion.m17539a(DivVisibility.VISIBLE);
        f36525U = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i2 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f36527V = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGridTemplate$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f36529W = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGridTemplate$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f36531X = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGridTemplate$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f36533Y = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGridTemplate$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f36535Z = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGridTemplate$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f36537a0 = C3063p.f41869s;
        f36539b0 = C3063p.f41848B;
        f36541c0 = C3061o.f41810v;
        f36543d0 = C3061o.f41811w;
        f36545e0 = C3065q.f41913i;
        f36547f0 = C3065q.f41914j;
        f36549g0 = C3061o.f41812x;
        f36551h0 = C3061o.f41813y;
        f36553i0 = C3061o.f41814z;
        f36555j0 = C3067r.f41951c;
        f36557k0 = C3063p.f41870t;
        f36559l0 = C3063p.f41871u;
        f36561m0 = C3063p.f41872v;
        f36563n0 = C3063p.f41873w;
        f36565o0 = C3063p.f41874x;
        f36567p0 = C3063p.f41875y;
        f36568q0 = C3061o.f41806r;
        f36569r0 = C3061o.f41807s;
        f36570s0 = C3063p.f41876z;
        f36571t0 = C3063p.f41847A;
        f36572u0 = C3063p.f41849C;
        f36573v0 = C3063p.f41850D;
        f36574w0 = C3061o.f41808t;
        f36575x0 = C3061o.f41809u;
        f36576y0 = C3063p.f41851E;
        f36577z0 = C3065q.f41906b;
        f36494A0 = C3065q.f41907c;
        f36495B0 = C3065q.f41908d;
        f36496C0 = C3065q.f41909e;
        f36497D0 = C3065q.f41910f;
        f36498E0 = C3065q.f41911g;
        f36499F0 = C3065q.f41912h;
        f36500G0 = new Function3<String, JSONObject, ParsingEnvironment, DivAccessibility>() { // from class: com.yandex.div2.DivGridTemplate$Companion$ACCESSIBILITY_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAccessibility mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAccessibility.Companion companion3 = DivAccessibility.f34479f;
                DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject2, str2, DivAccessibility.f34486m, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divAccessibility == null ? DivGridTemplate.f36503J : divAccessibility;
            }
        };
        f36501H0 = new Function3<String, JSONObject, ParsingEnvironment, DivAction>() { // from class: com.yandex.div2.DivGridTemplate$Companion$ACTION_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAction mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return (DivAction) JsonParser.m17322n(jSONObject2, str2, DivAction.f34550k, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36502I0 = new Function3<String, JSONObject, ParsingEnvironment, DivAnimation>() { // from class: com.yandex.div2.DivGridTemplate$Companion$ACTION_ANIMATION_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAnimation mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAnimation.Companion companion3 = DivAnimation.f34634h;
                DivAnimation divAnimation = (DivAnimation) JsonParser.m17322n(jSONObject2, str2, DivAnimation.f34644r, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divAnimation == null ? DivGridTemplate.f36505K : divAnimation;
            }
        };
        f36504J0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivGridTemplate$Companion$ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivGridTemplate.f36537a0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36506K0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>>() { // from class: com.yandex.div2.DivGridTemplate$Companion$ALIGNMENT_HORIZONTAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentHorizontal> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentHorizontal.f34618d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivGridTemplate.f36527V);
            }
        };
        f36508L0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>>() { // from class: com.yandex.div2.DivGridTemplate$Companion$ALIGNMENT_VERTICAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentVertical> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentVertical.Converter converter = DivAlignmentVertical.f34625c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentVertical.f34626d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivGridTemplate.f36529W);
            }
        };
        f36510M0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivGridTemplate$Companion$ALPHA_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
                ValueValidator<Double> valueValidator = DivGridTemplate.f36543d0;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Double> expression = DivGridTemplate.f36507L;
                Expression<Double> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
                return m17328t == null ? expression : m17328t;
            }
        };
        f36512N0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>>() { // from class: com.yandex.div2.DivGridTemplate$Companion$BACKGROUND_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivBackground> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBackground.Companion companion3 = DivBackground.f34750a;
                return JsonParser.m17333y(jSONObject2, str2, DivBackground.f34751b, DivGridTemplate.f36545e0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36514O0 = new Function3<String, JSONObject, ParsingEnvironment, DivBorder>() { // from class: com.yandex.div2.DivGridTemplate$Companion$BORDER_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivBorder mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBorder.Companion companion3 = DivBorder.f34785f;
                DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject2, str2, DivBorder.f34788i, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divBorder == null ? DivGridTemplate.f36509M : divBorder;
            }
        };
        f36516P0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivGridTemplate$Companion$COLUMN_COUNT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17316h(jSONObject2, str2, ParsingConvertersKt.f33831e, DivGridTemplate.f36551h0, parsingEnvironment2.getF34328a(), TypeHelpersKt.f33849b);
            }
        };
        f36518Q0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivGridTemplate$Companion$COLUMN_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivGridTemplate.f36555j0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f36520R0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>>() { // from class: com.yandex.div2.DivGridTemplate$Companion$CONTENT_ALIGNMENT_HORIZONTAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentHorizontal> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
                Function1<String, DivAlignmentHorizontal> function1 = DivAlignmentHorizontal.f34618d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivAlignmentHorizontal> expression = DivGridTemplate.f36511N;
                Expression<DivAlignmentHorizontal> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivGridTemplate.f36531X);
                return m17330v == null ? expression : m17330v;
            }
        };
        f36522S0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>>() { // from class: com.yandex.div2.DivGridTemplate$Companion$CONTENT_ALIGNMENT_VERTICAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentVertical> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentVertical.Converter converter = DivAlignmentVertical.f34625c;
                Function1<String, DivAlignmentVertical> function1 = DivAlignmentVertical.f34626d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivAlignmentVertical> expression = DivGridTemplate.f36513O;
                Expression<DivAlignmentVertical> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivGridTemplate.f36533Y);
                return m17330v == null ? expression : m17330v;
            }
        };
        f36524T0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>>() { // from class: com.yandex.div2.DivGridTemplate$Companion$DISAPPEAR_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivDisappearAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivDisappearAction.Companion companion3 = DivDisappearAction.f35537a;
                return JsonParser.m17333y(jSONObject2, str2, DivDisappearAction.f35545i, DivGridTemplate.f36557k0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36526U0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivGridTemplate$Companion$DOUBLETAP_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivGridTemplate.f36561m0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36528V0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>>() { // from class: com.yandex.div2.DivGridTemplate$Companion$EXTENSIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivExtension> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivExtension.Companion companion3 = DivExtension.f35659c;
                return JsonParser.m17333y(jSONObject2, str2, DivExtension.f35660d, DivGridTemplate.f36565o0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36530W0 = new Function3<String, JSONObject, ParsingEnvironment, DivFocus>() { // from class: com.yandex.div2.DivGridTemplate$Companion$FOCUS_READER$1
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
        f36532X0 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivGridTemplate$Companion$HEIGHT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivGridTemplate.f36515P : divSize;
            }
        };
        f36534Y0 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivGridTemplate$Companion$ID_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return (String) JsonParser.m17323o(jSONObject2, str2, DivGridTemplate.f36569r0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36536Z0 = new Function3<String, JSONObject, ParsingEnvironment, List<Div>>() { // from class: com.yandex.div2.DivGridTemplate$Companion$ITEMS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<Div> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Div.Companion companion3 = Div.f34418a;
                List<Div> m17308A = JsonParser.m17308A(jSONObject2, str2, Div.f34419b, DivGridTemplate.f36570s0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                Intrinsics.m32178g(m17308A, "readStrictList(json, key…LIDATOR, env.logger, env)");
                return m17308A;
            }
        };
        f36538a1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivGridTemplate$Companion$LONGTAP_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivGridTemplate.f36572u0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36540b1 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivGridTemplate$Companion$MARGINS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivGridTemplate.f36517Q : divEdgeInsets;
            }
        };
        f36542c1 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivGridTemplate$Companion$PADDINGS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivGridTemplate.f36519R : divEdgeInsets;
            }
        };
        f36544d1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivGridTemplate$Companion$ROW_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivGridTemplate.f36575x0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f36546e1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivGridTemplate$Companion$SELECTED_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivGridTemplate.f36576y0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36548f1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>>() { // from class: com.yandex.div2.DivGridTemplate$Companion$TOOLTIPS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTooltip> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTooltip.Companion companion3 = DivTooltip.f40492h;
                return JsonParser.m17333y(jSONObject2, str2, DivTooltip.f40497m, DivGridTemplate.f36494A0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36550g1 = new Function3<String, JSONObject, ParsingEnvironment, DivTransform>() { // from class: com.yandex.div2.DivGridTemplate$Companion$TRANSFORM_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivTransform mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransform.Companion companion3 = DivTransform.f40551d;
                DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject2, str2, DivTransform.f40554g, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divTransform == null ? DivGridTemplate.f36521S : divTransform;
            }
        };
        f36552h1 = new Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition>() { // from class: com.yandex.div2.DivGridTemplate$Companion$TRANSITION_CHANGE_READER$1
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
        f36554i1 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivGridTemplate$Companion$TRANSITION_IN_READER$1
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
        f36556j1 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivGridTemplate$Companion$TRANSITION_OUT_READER$1
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
        f36558k1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>>() { // from class: com.yandex.div2.DivGridTemplate$Companion$TRANSITION_TRIGGERS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTransitionTrigger> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransitionTrigger.Converter converter = DivTransitionTrigger.f40582c;
                return JsonParser.m17332x(jSONObject2, str2, DivTransitionTrigger.f40583d, DivGridTemplate.f36496C0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        DivGridTemplate$Companion$TYPE_READER$1 divGridTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivGridTemplate$Companion$TYPE_READER$1
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
        f36560l1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>>() { // from class: com.yandex.div2.DivGridTemplate$Companion$VISIBILITY_READER$1
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
                Expression<DivVisibility> expression = DivGridTemplate.f36523T;
                Expression<DivVisibility> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivGridTemplate.f36535Z);
                return m17330v == null ? expression : m17330v;
            }
        };
        f36562m1 = new Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction>() { // from class: com.yandex.div2.DivGridTemplate$Companion$VISIBILITY_ACTION_READER$1
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
        f36564n1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>>() { // from class: com.yandex.div2.DivGridTemplate$Companion$VISIBILITY_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivVisibilityAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivVisibilityAction.Companion companion3 = DivVisibilityAction.f40938i;
                return JsonParser.m17333y(jSONObject2, str2, DivVisibilityAction.f40946q, DivGridTemplate.f36498E0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36566o1 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivGridTemplate$Companion$WIDTH_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivGridTemplate.f36525U : divSize;
            }
        };
        DivGridTemplate$Companion$CREATOR$1 divGridTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivGridTemplate>() { // from class: com.yandex.div2.DivGridTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivGridTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivGridTemplate(env, null, false, it);
            }
        };
    }

    public DivGridTemplate(@NotNull ParsingEnvironment env, @Nullable DivGridTemplate divGridTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        Field<DivAccessibilityTemplate> field = divGridTemplate == null ? null : divGridTemplate.f36587a;
        DivAccessibilityTemplate.Companion companion = DivAccessibilityTemplate.f34515g;
        this.f36587a = JsonTemplateParser.m17354o(json, "accessibility", z, field, DivAccessibilityTemplate.f34531w, f34328a, env);
        Field<DivActionTemplate> field2 = divGridTemplate == null ? null : divGridTemplate.f36588b;
        DivActionTemplate.Companion companion2 = DivActionTemplate.f34572i;
        Function2<ParsingEnvironment, JSONObject, DivActionTemplate> function2 = DivActionTemplate.f34586w;
        this.f36588b = JsonTemplateParser.m17354o(json, "action", z, field2, function2, f34328a, env);
        Field<DivAnimationTemplate> field3 = divGridTemplate == null ? null : divGridTemplate.f36589c;
        DivAnimationTemplate.Companion companion3 = DivAnimationTemplate.f34681i;
        this.f36589c = JsonTemplateParser.m17354o(json, "action_animation", z, field3, DivAnimationTemplate.f34680D, f34328a, env);
        this.f36590d = JsonTemplateParser.m17360u(json, "actions", z, divGridTemplate == null ? null : divGridTemplate.f36590d, function2, f36539b0, f34328a, env);
        Field<Expression<DivAlignmentHorizontal>> field4 = divGridTemplate == null ? null : divGridTemplate.f36591e;
        DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
        Function1<String, DivAlignmentHorizontal> function1 = DivAlignmentHorizontal.f34618d;
        this.f36591e = JsonTemplateParser.m17358s(json, "alignment_horizontal", z, field4, function1, f34328a, env, f36527V);
        Field<Expression<DivAlignmentVertical>> field5 = divGridTemplate == null ? null : divGridTemplate.f36592f;
        DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
        Function1<String, DivAlignmentVertical> function12 = DivAlignmentVertical.f34626d;
        this.f36592f = JsonTemplateParser.m17358s(json, "alignment_vertical", z, field5, function12, f34328a, env, f36529W);
        this.f36593g = JsonTemplateParser.m17357r(json, "alpha", z, divGridTemplate == null ? null : divGridTemplate.f36593g, ParsingConvertersKt.f33830d, f36541c0, f34328a, env, TypeHelpersKt.f33851d);
        Field<List<DivBackgroundTemplate>> field6 = divGridTemplate == null ? null : divGridTemplate.f36594h;
        DivBackgroundTemplate.Companion companion4 = DivBackgroundTemplate.f34758a;
        this.f36594h = JsonTemplateParser.m17360u(json, "background", z, field6, DivBackgroundTemplate.f34759b, f36547f0, f34328a, env);
        Field<DivBorderTemplate> field7 = divGridTemplate == null ? null : divGridTemplate.f36595i;
        DivBorderTemplate.Companion companion5 = DivBorderTemplate.f34795f;
        this.f36595i = JsonTemplateParser.m17354o(json, "border", z, field7, DivBorderTemplate.f34804o, f34328a, env);
        Field<Expression<Long>> field8 = divGridTemplate == null ? null : divGridTemplate.f36596j;
        Function1<Number, Long> function13 = ParsingConvertersKt.f33831e;
        ValueValidator<Long> valueValidator = f36549g0;
        TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
        this.f36596j = JsonTemplateParser.m17348i(json, "column_count", z, field8, function13, valueValidator, f34328a, env, typeHelper);
        this.f36597k = JsonTemplateParser.m17357r(json, "column_span", z, divGridTemplate == null ? null : divGridTemplate.f36597k, function13, f36553i0, f34328a, env, typeHelper);
        this.f36598l = JsonTemplateParser.m17358s(json, "content_alignment_horizontal", z, divGridTemplate == null ? null : divGridTemplate.f36598l, function1, f34328a, env, f36531X);
        this.f36599m = JsonTemplateParser.m17358s(json, "content_alignment_vertical", z, divGridTemplate == null ? null : divGridTemplate.f36599m, function12, f34328a, env, f36533Y);
        Field<List<DivDisappearActionTemplate>> field9 = divGridTemplate == null ? null : divGridTemplate.f36600n;
        DivDisappearActionTemplate.Companion companion6 = DivDisappearActionTemplate.f35550i;
        this.f36600n = JsonTemplateParser.m17360u(json, "disappear_actions", z, field9, DivDisappearActionTemplate.f35549C, f36559l0, f34328a, env);
        this.f36601o = JsonTemplateParser.m17360u(json, "doubletap_actions", z, divGridTemplate == null ? null : divGridTemplate.f36601o, function2, f36563n0, f34328a, env);
        Field<List<DivExtensionTemplate>> field10 = divGridTemplate == null ? null : divGridTemplate.f36602p;
        DivExtensionTemplate.Companion companion7 = DivExtensionTemplate.f35664c;
        this.f36602p = JsonTemplateParser.m17360u(json, "extensions", z, field10, DivExtensionTemplate.f35667f, f36567p0, f34328a, env);
        Field<DivFocusTemplate> field11 = divGridTemplate == null ? null : divGridTemplate.f36603q;
        DivFocusTemplate.Companion companion8 = DivFocusTemplate.f35833f;
        this.f36603q = JsonTemplateParser.m17354o(json, "focus", z, field11, DivFocusTemplate.f35846s, f34328a, env);
        Field<DivSizeTemplate> field12 = divGridTemplate == null ? null : divGridTemplate.f36604r;
        DivSizeTemplate.Companion companion9 = DivSizeTemplate.f38839a;
        Function2<ParsingEnvironment, JSONObject, DivSizeTemplate> function22 = DivSizeTemplate.f38840b;
        this.f36604r = JsonTemplateParser.m17354o(json, "height", z, field12, function22, f34328a, env);
        this.f36605s = JsonTemplateParser.m17351l(json, "id", z, divGridTemplate == null ? null : divGridTemplate.f36605s, f36568q0, f34328a, env);
        Field<List<DivTemplate>> field13 = divGridTemplate == null ? null : divGridTemplate.f36606t;
        DivTemplate.Companion companion10 = DivTemplate.f39864a;
        this.f36606t = JsonTemplateParser.m17362w(json, "items", z, field13, DivTemplate.f39865b, f36571t0, f34328a, env);
        this.f36607u = JsonTemplateParser.m17360u(json, "longtap_actions", z, divGridTemplate == null ? null : divGridTemplate.f36607u, function2, f36573v0, f34328a, env);
        Field<DivEdgeInsetsTemplate> field14 = divGridTemplate == null ? null : divGridTemplate.f36608v;
        DivEdgeInsetsTemplate.Companion companion11 = DivEdgeInsetsTemplate.f35626f;
        Function2<ParsingEnvironment, JSONObject, DivEdgeInsetsTemplate> function23 = DivEdgeInsetsTemplate.f35646z;
        this.f36608v = JsonTemplateParser.m17354o(json, "margins", z, field14, function23, f34328a, env);
        this.f36609w = JsonTemplateParser.m17354o(json, "paddings", z, divGridTemplate == null ? null : divGridTemplate.f36609w, function23, f34328a, env);
        this.f36610x = JsonTemplateParser.m17357r(json, "row_span", z, divGridTemplate == null ? null : divGridTemplate.f36610x, function13, f36574w0, f34328a, env, typeHelper);
        this.f36611y = JsonTemplateParser.m17360u(json, "selected_actions", z, divGridTemplate == null ? null : divGridTemplate.f36611y, function2, f36577z0, f34328a, env);
        Field<List<DivTooltipTemplate>> field15 = divGridTemplate == null ? null : divGridTemplate.f36612z;
        DivTooltipTemplate.Companion companion12 = DivTooltipTemplate.f40520h;
        this.f36612z = JsonTemplateParser.m17360u(json, "tooltips", z, field15, DivTooltipTemplate.f40534v, f36495B0, f34328a, env);
        Field<DivTransformTemplate> field16 = divGridTemplate == null ? null : divGridTemplate.f36578A;
        DivTransformTemplate.Companion companion13 = DivTransformTemplate.f40559d;
        this.f36578A = JsonTemplateParser.m17354o(json, "transform", z, field16, DivTransformTemplate.f40565j, f34328a, env);
        Field<DivChangeTransitionTemplate> field17 = divGridTemplate == null ? null : divGridTemplate.f36579B;
        DivChangeTransitionTemplate.Companion companion14 = DivChangeTransitionTemplate.f34861a;
        this.f36579B = JsonTemplateParser.m17354o(json, "transition_change", z, field17, DivChangeTransitionTemplate.f34862b, f34328a, env);
        Field<DivAppearanceTransitionTemplate> field18 = divGridTemplate == null ? null : divGridTemplate.f36580C;
        DivAppearanceTransitionTemplate.Companion companion15 = DivAppearanceTransitionTemplate.f34733a;
        Function2<ParsingEnvironment, JSONObject, DivAppearanceTransitionTemplate> function24 = DivAppearanceTransitionTemplate.f34734b;
        this.f36580C = JsonTemplateParser.m17354o(json, "transition_in", z, field18, function24, f34328a, env);
        this.f36581D = JsonTemplateParser.m17354o(json, "transition_out", z, divGridTemplate == null ? null : divGridTemplate.f36581D, function24, f34328a, env);
        Field<List<DivTransitionTrigger>> field19 = divGridTemplate == null ? null : divGridTemplate.f36582E;
        DivTransitionTrigger.Converter converter3 = DivTransitionTrigger.f40582c;
        this.f36582E = JsonTemplateParser.m17359t(json, "transition_triggers", z, field19, DivTransitionTrigger.f40583d, f36497D0, f34328a, env);
        Field<Expression<DivVisibility>> field20 = divGridTemplate == null ? null : divGridTemplate.f36583F;
        DivVisibility.Converter converter4 = DivVisibility.f40930c;
        this.f36583F = JsonTemplateParser.m17358s(json, "visibility", z, field20, DivVisibility.f40931d, f34328a, env, f36535Z);
        Field<DivVisibilityActionTemplate> field21 = divGridTemplate == null ? null : divGridTemplate.f36584G;
        DivVisibilityActionTemplate.Companion companion16 = DivVisibilityActionTemplate.f40959i;
        Function2<ParsingEnvironment, JSONObject, DivVisibilityActionTemplate> function25 = DivVisibilityActionTemplate.f40958C;
        this.f36584G = JsonTemplateParser.m17354o(json, "visibility_action", z, field21, function25, f34328a, env);
        this.f36585H = JsonTemplateParser.m17360u(json, "visibility_actions", z, divGridTemplate == null ? null : divGridTemplate.f36585H, function25, f36499F0, f34328a, env);
        this.f36586I = JsonTemplateParser.m17354o(json, "width", z, divGridTemplate == null ? null : divGridTemplate.f36586I, function22, f34328a, env);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivGrid mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        DivAccessibility divAccessibility = (DivAccessibility) FieldKt.m17381g(this.f36587a, env, "accessibility", data, f36500G0);
        if (divAccessibility == null) {
            divAccessibility = f36503J;
        }
        DivAccessibility divAccessibility2 = divAccessibility;
        DivAction divAction = (DivAction) FieldKt.m17381g(this.f36588b, env, "action", data, f36501H0);
        DivAnimation divAnimation = (DivAnimation) FieldKt.m17381g(this.f36589c, env, "action_animation", data, f36502I0);
        if (divAnimation == null) {
            divAnimation = f36505K;
        }
        DivAnimation divAnimation2 = divAnimation;
        List m17382h = FieldKt.m17382h(this.f36590d, env, "actions", data, f36537a0, f36504J0);
        Expression expression = (Expression) FieldKt.m17378d(this.f36591e, env, "alignment_horizontal", data, f36506K0);
        Expression expression2 = (Expression) FieldKt.m17378d(this.f36592f, env, "alignment_vertical", data, f36508L0);
        Expression<Double> expression3 = (Expression) FieldKt.m17378d(this.f36593g, env, "alpha", data, f36510M0);
        if (expression3 == null) {
            expression3 = f36507L;
        }
        Expression<Double> expression4 = expression3;
        List m17382h2 = FieldKt.m17382h(this.f36594h, env, "background", data, f36545e0, f36512N0);
        DivBorder divBorder = (DivBorder) FieldKt.m17381g(this.f36595i, env, "border", data, f36514O0);
        if (divBorder == null) {
            divBorder = f36509M;
        }
        DivBorder divBorder2 = divBorder;
        Expression expression5 = (Expression) FieldKt.m17376b(this.f36596j, env, "column_count", data, f36516P0);
        Expression expression6 = (Expression) FieldKt.m17378d(this.f36597k, env, "column_span", data, f36518Q0);
        Expression<DivAlignmentHorizontal> expression7 = (Expression) FieldKt.m17378d(this.f36598l, env, "content_alignment_horizontal", data, f36520R0);
        if (expression7 == null) {
            expression7 = f36511N;
        }
        Expression<DivAlignmentHorizontal> expression8 = expression7;
        Expression<DivAlignmentVertical> expression9 = (Expression) FieldKt.m17378d(this.f36599m, env, "content_alignment_vertical", data, f36522S0);
        if (expression9 == null) {
            expression9 = f36513O;
        }
        Expression<DivAlignmentVertical> expression10 = expression9;
        List m17382h3 = FieldKt.m17382h(this.f36600n, env, "disappear_actions", data, f36557k0, f36524T0);
        List m17382h4 = FieldKt.m17382h(this.f36601o, env, "doubletap_actions", data, f36561m0, f36526U0);
        List m17382h5 = FieldKt.m17382h(this.f36602p, env, "extensions", data, f36565o0, f36528V0);
        DivFocus divFocus = (DivFocus) FieldKt.m17381g(this.f36603q, env, "focus", data, f36530W0);
        DivSize divSize = (DivSize) FieldKt.m17381g(this.f36604r, env, "height", data, f36532X0);
        if (divSize == null) {
            divSize = f36515P;
        }
        DivSize divSize2 = divSize;
        String str = (String) FieldKt.m17378d(this.f36605s, env, "id", data, f36534Y0);
        List m17384j = FieldKt.m17384j(this.f36606t, env, "items", data, f36570s0, f36536Z0);
        List m17382h6 = FieldKt.m17382h(this.f36607u, env, "longtap_actions", data, f36572u0, f36538a1);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) FieldKt.m17381g(this.f36608v, env, "margins", data, f36540b1);
        if (divEdgeInsets == null) {
            divEdgeInsets = f36517Q;
        }
        DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
        DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) FieldKt.m17381g(this.f36609w, env, "paddings", data, f36542c1);
        if (divEdgeInsets3 == null) {
            divEdgeInsets3 = f36519R;
        }
        DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
        Expression expression11 = (Expression) FieldKt.m17378d(this.f36610x, env, "row_span", data, f36544d1);
        List m17382h7 = FieldKt.m17382h(this.f36611y, env, "selected_actions", data, f36576y0, f36546e1);
        List m17382h8 = FieldKt.m17382h(this.f36612z, env, "tooltips", data, f36494A0, f36548f1);
        DivTransform divTransform = (DivTransform) FieldKt.m17381g(this.f36578A, env, "transform", data, f36550g1);
        if (divTransform == null) {
            divTransform = f36521S;
        }
        DivTransform divTransform2 = divTransform;
        DivChangeTransition divChangeTransition = (DivChangeTransition) FieldKt.m17381g(this.f36579B, env, "transition_change", data, f36552h1);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) FieldKt.m17381g(this.f36580C, env, "transition_in", data, f36554i1);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) FieldKt.m17381g(this.f36581D, env, "transition_out", data, f36556j1);
        List m17380f = FieldKt.m17380f(this.f36582E, env, "transition_triggers", data, f36496C0, f36558k1);
        Expression<DivVisibility> expression12 = (Expression) FieldKt.m17378d(this.f36583F, env, "visibility", data, f36560l1);
        if (expression12 == null) {
            expression12 = f36523T;
        }
        Expression<DivVisibility> expression13 = expression12;
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) FieldKt.m17381g(this.f36584G, env, "visibility_action", data, f36562m1);
        List m17382h9 = FieldKt.m17382h(this.f36585H, env, "visibility_actions", data, f36498E0, f36564n1);
        DivSize divSize3 = (DivSize) FieldKt.m17381g(this.f36586I, env, "width", data, f36566o1);
        if (divSize3 == null) {
            divSize3 = f36525U;
        }
        return new DivGrid(divAccessibility2, divAction, divAnimation2, m17382h, expression, expression2, expression4, m17382h2, divBorder2, expression5, expression6, expression8, expression10, m17382h3, m17382h4, m17382h5, divFocus, divSize2, str, m17384j, m17382h6, divEdgeInsets2, divEdgeInsets4, expression11, m17382h7, m17382h8, divTransform2, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17380f, expression13, divVisibilityAction, m17382h9, divSize3);
    }
}
