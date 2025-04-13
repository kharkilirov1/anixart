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
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeTemplate;
import com.yandex.div2.DivTooltip;
import com.yandex.div2.DivTooltipTemplate;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivTransformTemplate;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVideoSource;
import com.yandex.div2.DivVideoSourceTemplate;
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

/* compiled from: DivVideoTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivVideoTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivVideo;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivVideoTemplate implements JSONSerializable, JsonTemplate<DivVideo> {

    /* renamed from: A0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f40758A0;

    /* renamed from: B0 */
    @NotNull
    public static final ValueValidator<Long> f40759B0;

    /* renamed from: C0 */
    @NotNull
    public static final ValueValidator<Long> f40760C0;

    /* renamed from: D0 */
    @NotNull
    public static final ListValidator<DivAction> f40761D0;

    /* renamed from: E0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f40762E0;

    /* renamed from: F0 */
    @NotNull
    public static final ListValidator<DivTooltip> f40763F0;

    /* renamed from: G0 */
    @NotNull
    public static final ListValidator<DivTooltipTemplate> f40764G0;

    /* renamed from: H0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f40765H0;

    /* renamed from: I0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f40766I0;

    /* renamed from: J0 */
    @NotNull
    public static final ListValidator<DivVideoSource> f40767J0;

    /* renamed from: K0 */
    @NotNull
    public static final ListValidator<DivVideoSourceTemplate> f40768K0;

    /* renamed from: L0 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f40769L0;

    /* renamed from: M */
    @NotNull
    public static final DivAccessibility f40770M = new DivAccessibility(null, null, null, null, null, null, 63);

    /* renamed from: M0 */
    @NotNull
    public static final ListValidator<DivVisibilityActionTemplate> f40771M0;

    /* renamed from: N */
    @NotNull
    public static final Expression<Double> f40772N;

    /* renamed from: N0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAccessibility> f40773N0;

    /* renamed from: O */
    @NotNull
    public static final Expression<Boolean> f40774O;

    /* renamed from: O0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>> f40775O0;

    /* renamed from: P */
    @NotNull
    public static final DivBorder f40776P;

    /* renamed from: P0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>> f40777P0;

    /* renamed from: Q */
    @NotNull
    public static final DivSize.WrapContent f40778Q;

    /* renamed from: Q0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f40779Q0;

    /* renamed from: R */
    @NotNull
    public static final DivEdgeInsets f40780R;

    /* renamed from: R0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>> f40781R0;

    /* renamed from: S */
    @NotNull
    public static final Expression<Boolean> f40782S;

    /* renamed from: S0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>> f40783S0;

    /* renamed from: T */
    @NotNull
    public static final DivEdgeInsets f40784T;

    /* renamed from: T0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivBorder> f40785T0;

    /* renamed from: U */
    @NotNull
    public static final Expression<Boolean> f40786U;

    /* renamed from: U0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f40787U0;

    /* renamed from: V */
    @NotNull
    public static final DivTransform f40788V;

    /* renamed from: V0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f40789V0;

    /* renamed from: W */
    @NotNull
    public static final Expression<DivVisibility> f40790W;

    /* renamed from: W0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>> f40791W0;

    /* renamed from: X */
    @NotNull
    public static final DivSize.MatchParent f40792X;

    /* renamed from: X0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f40793X0;

    /* renamed from: Y */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f40794Y;

    /* renamed from: Y0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f40795Y0;

    /* renamed from: Z */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f40796Z;

    /* renamed from: Z0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>> f40797Z0;

    /* renamed from: a0 */
    @NotNull
    public static final TypeHelper<DivVisibility> f40798a0;

    /* renamed from: a1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f40799a1;

    /* renamed from: b0 */
    @NotNull
    public static final ValueValidator<Double> f40800b0;

    /* renamed from: b1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivFocus> f40801b1;

    /* renamed from: c0 */
    @NotNull
    public static final ValueValidator<Double> f40802c0;

    /* renamed from: c1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f40803c1;

    /* renamed from: d0 */
    @NotNull
    public static final ListValidator<DivBackground> f40804d0;

    /* renamed from: d1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f40805d1;

    /* renamed from: e0 */
    @NotNull
    public static final ListValidator<DivBackgroundTemplate> f40806e0;

    /* renamed from: e1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f40807e1;

    /* renamed from: f0 */
    @NotNull
    public static final ListValidator<DivAction> f40808f0;

    /* renamed from: f1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>> f40809f1;

    /* renamed from: g0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f40810g0;

    /* renamed from: g1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f40811g1;

    /* renamed from: h0 */
    @NotNull
    public static final ValueValidator<Long> f40812h0;

    /* renamed from: h1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f40813h1;

    /* renamed from: i0 */
    @NotNull
    public static final ValueValidator<Long> f40814i0;

    /* renamed from: i1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, JSONObject> f40815i1;

    /* renamed from: j0 */
    @NotNull
    public static final ListValidator<DivDisappearAction> f40816j0;

    /* renamed from: j1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<String>> f40817j1;

    /* renamed from: k0 */
    @NotNull
    public static final ListValidator<DivDisappearActionTemplate> f40818k0;

    /* renamed from: k1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>> f40819k1;

    /* renamed from: l0 */
    @NotNull
    public static final ValueValidator<String> f40820l0;

    /* renamed from: l1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f40821l1;

    /* renamed from: m0 */
    @NotNull
    public static final ValueValidator<String> f40822m0;

    /* renamed from: m1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f40823m1;

    /* renamed from: n0 */
    @NotNull
    public static final ListValidator<DivAction> f40824n0;

    /* renamed from: n1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f40825n1;

    /* renamed from: o0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f40826o0;

    /* renamed from: o1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>> f40827o1;

    /* renamed from: p0 */
    @NotNull
    public static final ListValidator<DivExtension> f40828p0;

    /* renamed from: p1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivTransform> f40829p1;

    /* renamed from: q0 */
    @NotNull
    public static final ListValidator<DivExtensionTemplate> f40830q0;

    /* renamed from: q1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition> f40831q1;

    /* renamed from: r0 */
    @NotNull
    public static final ListValidator<DivAction> f40832r0;

    /* renamed from: r1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f40833r1;

    /* renamed from: s0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f40834s0;

    /* renamed from: s1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f40835s1;

    /* renamed from: t0 */
    @NotNull
    public static final ValueValidator<String> f40836t0;

    /* renamed from: t1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>> f40837t1;

    /* renamed from: u0 */
    @NotNull
    public static final ValueValidator<String> f40838u0;

    /* renamed from: u1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivVideoSource>> f40839u1;

    /* renamed from: v0 */
    @NotNull
    public static final ListValidator<DivAction> f40840v0;

    /* renamed from: v1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>> f40841v1;

    /* renamed from: w0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f40842w0;

    /* renamed from: w1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction> f40843w1;

    /* renamed from: x0 */
    @NotNull
    public static final ValueValidator<String> f40844x0;

    /* renamed from: x1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>> f40845x1;

    /* renamed from: y0 */
    @NotNull
    public static final ValueValidator<String> f40846y0;

    /* renamed from: y1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f40847y1;

    /* renamed from: z0 */
    @NotNull
    public static final ListValidator<DivAction> f40848z0;

    /* renamed from: A */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f40849A;

    /* renamed from: B */
    @JvmField
    @NotNull
    public final Field<List<DivTooltipTemplate>> f40850B;

    /* renamed from: C */
    @JvmField
    @NotNull
    public final Field<DivTransformTemplate> f40851C;

    /* renamed from: D */
    @JvmField
    @NotNull
    public final Field<DivChangeTransitionTemplate> f40852D;

    /* renamed from: E */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f40853E;

    /* renamed from: F */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f40854F;

    /* renamed from: G */
    @JvmField
    @NotNull
    public final Field<List<DivTransitionTrigger>> f40855G;

    /* renamed from: H */
    @JvmField
    @NotNull
    public final Field<List<DivVideoSourceTemplate>> f40856H;

    /* renamed from: I */
    @JvmField
    @NotNull
    public final Field<Expression<DivVisibility>> f40857I;

    /* renamed from: J */
    @JvmField
    @NotNull
    public final Field<DivVisibilityActionTemplate> f40858J;

    /* renamed from: K */
    @JvmField
    @NotNull
    public final Field<List<DivVisibilityActionTemplate>> f40859K;

    /* renamed from: L */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f40860L;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<DivAccessibilityTemplate> f40861a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f40862b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f40863c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f40864d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Field<Expression<Boolean>> f40865e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f40866f;

    /* renamed from: g */
    @JvmField
    @NotNull
    public final Field<DivBorderTemplate> f40867g;

    /* renamed from: h */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f40868h;

    /* renamed from: i */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f40869i;

    /* renamed from: j */
    @JvmField
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f40870j;

    /* renamed from: k */
    @JvmField
    @NotNull
    public final Field<String> f40871k;

    /* renamed from: l */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f40872l;

    /* renamed from: m */
    @JvmField
    @NotNull
    public final Field<List<DivExtensionTemplate>> f40873m;

    /* renamed from: n */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f40874n;

    /* renamed from: o */
    @JvmField
    @NotNull
    public final Field<DivFocusTemplate> f40875o;

    /* renamed from: p */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f40876p;

    /* renamed from: q */
    @JvmField
    @NotNull
    public final Field<String> f40877q;

    /* renamed from: r */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f40878r;

    /* renamed from: s */
    @JvmField
    @NotNull
    public final Field<Expression<Boolean>> f40879s;

    /* renamed from: t */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f40880t;

    /* renamed from: u */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f40881u;

    /* renamed from: v */
    @JvmField
    @NotNull
    public final Field<JSONObject> f40882v;

    /* renamed from: w */
    @JvmField
    @NotNull
    public final Field<Expression<String>> f40883w;

    /* renamed from: x */
    @JvmField
    @NotNull
    public final Field<Expression<Boolean>> f40884x;

    /* renamed from: y */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f40885y;

    /* renamed from: z */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f40886z;

    /* compiled from: DivVideoTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u000bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u000bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0012R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0012R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u000bR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u000bR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00180\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0012R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0012R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0012R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0012R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00180\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0012R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0012R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020#0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u000bR\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020#0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u000bR\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\r0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\bR\u0014\u00107\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00105R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u00180\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0012R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0012R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020#0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\u000bR\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020#0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\u000bR\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\r0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\bR\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00180\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010\u0012R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010\u0012R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001c0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\u000bR\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001c0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\u000bR\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00180\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010\u0012R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0012R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010\u0012R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010\u0012R\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020J0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010\u0012R\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020J0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010\u0012R\u0014\u0010M\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\bM\u0010NR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020S0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010RR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020U0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010RR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020W0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010\u0012R\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010\u0012R\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010\u0012R\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010\u0012R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020U0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010\bR\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010b¨\u0006c"}, m31884d2 = {"Lcom/yandex/div2/DivVideoTemplate$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "", "AUTOSTART_DEFAULT_VALUE", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackgroundTemplate;", "BACKGROUND_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "Lcom/yandex/div2/DivActionTemplate;", "BUFFERING_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivAction;", "BUFFERING_ACTIONS_VALIDATOR", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivDisappearActionTemplate;", "DISAPPEAR_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "", "ELAPSED_TIME_VARIABLE_TEMPLATE_VALIDATOR", "ELAPSED_TIME_VARIABLE_VALIDATOR", "END_ACTIONS_TEMPLATE_VALIDATOR", "END_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivExtensionTemplate;", "EXTENSIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "FATAL_ACTIONS_TEMPLATE_VALIDATOR", "FATAL_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "MUTED_DEFAULT_VALUE", "PADDINGS_DEFAULT_VALUE", "PAUSE_ACTIONS_TEMPLATE_VALIDATOR", "PAUSE_ACTIONS_VALIDATOR", "PREVIEW_TEMPLATE_VALIDATOR", "PREVIEW_VALIDATOR", "REPEATABLE_DEFAULT_VALUE", "RESUME_ACTIONS_TEMPLATE_VALIDATOR", "RESUME_ACTIONS_VALIDATOR", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "SELECTED_ACTIONS_TEMPLATE_VALIDATOR", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivTooltipTemplate;", "TOOLTIPS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_TEMPLATE_VALIDATOR", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/DivVideoSourceTemplate;", "VIDEO_SOURCES_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivVideoSource;", "VIDEO_SOURCES_VALIDATOR", "Lcom/yandex/div2/DivVisibilityActionTemplate;", "VISIBILITY_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f40772N = companion.m17539a(Double.valueOf(1.0d));
        Boolean bool = Boolean.FALSE;
        f40774O = companion.m17539a(bool);
        Expression expression = null;
        Expression expression2 = null;
        f40776P = new DivBorder(null, null, null, null, null, 31);
        f40778Q = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7));
        Expression expression3 = null;
        Expression expression4 = null;
        Expression expression5 = null;
        int i2 = 31;
        f40780R = new DivEdgeInsets(expression, expression2, expression3, expression4, expression5, i2);
        f40782S = companion.m17539a(bool);
        f40784T = new DivEdgeInsets(expression, expression2, expression3, expression4, expression5, i2);
        f40786U = companion.m17539a(bool);
        f40788V = new DivTransform(null, null, null, 7);
        f40790W = companion.m17539a(DivVisibility.VISIBLE);
        f40792X = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i3 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f40794Y = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f40796Z = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f40798a0 = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f40800b0 = C3064p0.f41891p;
        f40802c0 = C3064p0.f41896u;
        f40804d0 = C3066q0.f41936f;
        f40806e0 = C3066q0.f41945o;
        f40808f0 = C3066q0.f41946p;
        f40810g0 = C3066q0.f41947q;
        f40812h0 = C3068r0.f41974d;
        f40814i0 = C3068r0.f41975e;
        f40816j0 = C3066q0.f41948r;
        f40818k0 = C3066q0.f41949s;
        f40820l0 = C3064p0.f41892q;
        f40822m0 = C3064p0.f41893r;
        f40824n0 = C3062o0.f41843x;
        f40826o0 = C3062o0.f41844y;
        f40828p0 = C3062o0.f41845z;
        f40830q0 = C3062o0.f41816A;
        f40832r0 = C3062o0.f41817B;
        f40834s0 = C3062o0.f41818C;
        f40836t0 = C3064p0.f41894s;
        f40838u0 = C3064p0.f41895t;
        f40840v0 = C3062o0.f41819D;
        f40842w0 = C3062o0.f41820E;
        f40844x0 = C3064p0.f41897v;
        f40846y0 = C3064p0.f41898w;
        f40848z0 = C3066q0.f41932b;
        f40758A0 = C3066q0.f41933c;
        f40759B0 = C3064p0.f41899x;
        f40760C0 = C3068r0.f41973c;
        f40761D0 = C3066q0.f41934d;
        f40762E0 = C3066q0.f41935e;
        f40763F0 = C3066q0.f41937g;
        f40764G0 = C3066q0.f41938h;
        f40765H0 = C3066q0.f41939i;
        f40766I0 = C3066q0.f41940j;
        f40767J0 = C3066q0.f41941k;
        f40768K0 = C3066q0.f41942l;
        f40769L0 = C3066q0.f41943m;
        f40771M0 = C3066q0.f41944n;
        f40773N0 = new Function3<String, JSONObject, ParsingEnvironment, DivAccessibility>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$ACCESSIBILITY_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAccessibility mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAccessibility.Companion companion3 = DivAccessibility.f34479f;
                DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject2, str2, DivAccessibility.f34486m, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divAccessibility == null ? DivVideoTemplate.f40770M : divAccessibility;
            }
        };
        f40775O0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$ALIGNMENT_HORIZONTAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentHorizontal> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentHorizontal.f34618d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivVideoTemplate.f40794Y);
            }
        };
        f40777P0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$ALIGNMENT_VERTICAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentVertical> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentVertical.Converter converter = DivAlignmentVertical.f34625c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentVertical.f34626d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivVideoTemplate.f40796Z);
            }
        };
        f40779Q0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$ALPHA_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
                ValueValidator<Double> valueValidator = DivVideoTemplate.f40802c0;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Double> expression6 = DivVideoTemplate.f40772N;
                Expression<Double> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression6, TypeHelpersKt.f33851d);
                return m17328t == null ? expression6 : m17328t;
            }
        };
        f40781R0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$AUTOSTART_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Boolean> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Object, Boolean> function1 = ParsingConvertersKt.f33829c;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Boolean> expression6 = DivVideoTemplate.f40774O;
                Expression<Boolean> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression6, TypeHelpersKt.f33848a);
                return m17330v == null ? expression6 : m17330v;
            }
        };
        f40783S0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$BACKGROUND_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivBackground> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBackground.Companion companion3 = DivBackground.f34750a;
                return JsonParser.m17333y(jSONObject2, str2, DivBackground.f34751b, DivVideoTemplate.f40804d0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40785T0 = new Function3<String, JSONObject, ParsingEnvironment, DivBorder>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$BORDER_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivBorder mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBorder.Companion companion3 = DivBorder.f34785f;
                DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject2, str2, DivBorder.f34788i, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divBorder == null ? DivVideoTemplate.f40776P : divBorder;
            }
        };
        f40787U0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$BUFFERING_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivVideoTemplate.f40808f0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40789V0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$COLUMN_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivVideoTemplate.f40814i0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f40791W0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$DISAPPEAR_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivDisappearAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivDisappearAction.Companion companion3 = DivDisappearAction.f35537a;
                return JsonParser.m17333y(jSONObject2, str2, DivDisappearAction.f35545i, DivVideoTemplate.f40816j0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40793X0 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$ELAPSED_TIME_VARIABLE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return (String) JsonParser.m17323o(jSONObject2, str2, DivVideoTemplate.f40822m0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40795Y0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$END_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivVideoTemplate.f40824n0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40797Z0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$EXTENSIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivExtension> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivExtension.Companion companion3 = DivExtension.f35659c;
                return JsonParser.m17333y(jSONObject2, str2, DivExtension.f35660d, DivVideoTemplate.f40828p0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40799a1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$FATAL_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivVideoTemplate.f40832r0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40801b1 = new Function3<String, JSONObject, ParsingEnvironment, DivFocus>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$FOCUS_READER$1
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
        f40803c1 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$HEIGHT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivVideoTemplate.f40778Q : divSize;
            }
        };
        f40805d1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$ID_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return (String) JsonParser.m17323o(jSONObject2, str2, DivVideoTemplate.f40838u0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40807e1 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$MARGINS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivVideoTemplate.f40780R : divEdgeInsets;
            }
        };
        f40809f1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$MUTED_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Boolean> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Object, Boolean> function1 = ParsingConvertersKt.f33829c;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Boolean> expression6 = DivVideoTemplate.f40782S;
                Expression<Boolean> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression6, TypeHelpersKt.f33848a);
                return m17330v == null ? expression6 : m17330v;
            }
        };
        f40811g1 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$PADDINGS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivVideoTemplate.f40784T : divEdgeInsets;
            }
        };
        f40813h1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$PAUSE_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivVideoTemplate.f40840v0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40815i1 = new Function3<String, JSONObject, ParsingEnvironment, JSONObject>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$PLAYER_SETTINGS_PAYLOAD_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public JSONObject mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                Object m17742d = C3033a.m17742d(str2, "key", jSONObject2, "json", parsingEnvironment, "env", jSONObject2, str2);
                if (m17742d == null) {
                    m17742d = null;
                }
                return (JSONObject) m17742d;
            }
        };
        f40817j1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<String>>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$PREVIEW_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<String> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17325q(jSONObject2, str2, DivVideoTemplate.f40846y0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33850c);
            }
        };
        f40819k1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$REPEATABLE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Boolean> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Object, Boolean> function1 = ParsingConvertersKt.f33829c;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Boolean> expression6 = DivVideoTemplate.f40786U;
                Expression<Boolean> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression6, TypeHelpersKt.f33848a);
                return m17330v == null ? expression6 : m17330v;
            }
        };
        f40821l1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$RESUME_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivVideoTemplate.f40848z0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40823m1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$ROW_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivVideoTemplate.f40760C0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f40825n1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$SELECTED_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivVideoTemplate.f40761D0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40827o1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$TOOLTIPS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTooltip> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTooltip.Companion companion3 = DivTooltip.f40492h;
                return JsonParser.m17333y(jSONObject2, str2, DivTooltip.f40497m, DivVideoTemplate.f40763F0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40829p1 = new Function3<String, JSONObject, ParsingEnvironment, DivTransform>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$TRANSFORM_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivTransform mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransform.Companion companion3 = DivTransform.f40551d;
                DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject2, str2, DivTransform.f40554g, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divTransform == null ? DivVideoTemplate.f40788V : divTransform;
            }
        };
        f40831q1 = new Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$TRANSITION_CHANGE_READER$1
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
        f40833r1 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$TRANSITION_IN_READER$1
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
        f40835s1 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$TRANSITION_OUT_READER$1
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
        f40837t1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$TRANSITION_TRIGGERS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTransitionTrigger> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransitionTrigger.Converter converter = DivTransitionTrigger.f40582c;
                return JsonParser.m17332x(jSONObject2, str2, DivTransitionTrigger.f40583d, DivVideoTemplate.f40765H0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        DivVideoTemplate$Companion$TYPE_READER$1 divVideoTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$TYPE_READER$1
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
        f40839u1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivVideoSource>>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$VIDEO_SOURCES_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivVideoSource> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivVideoSource.Companion companion3 = DivVideoSource.f40720e;
                List<DivVideoSource> m17321m = JsonParser.m17321m(jSONObject2, str2, DivVideoSource.f40721f, DivVideoTemplate.f40767J0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                Intrinsics.m32178g(m17321m, "readList(json, key, DivV…LIDATOR, env.logger, env)");
                return m17321m;
            }
        };
        f40841v1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$VISIBILITY_READER$1
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
                Expression<DivVisibility> expression6 = DivVideoTemplate.f40790W;
                Expression<DivVisibility> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression6, DivVideoTemplate.f40798a0);
                return m17330v == null ? expression6 : m17330v;
            }
        };
        f40843w1 = new Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$VISIBILITY_ACTION_READER$1
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
        f40845x1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$VISIBILITY_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivVisibilityAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivVisibilityAction.Companion companion3 = DivVisibilityAction.f40938i;
                return JsonParser.m17333y(jSONObject2, str2, DivVisibilityAction.f40946q, DivVideoTemplate.f40769L0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40847y1 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$WIDTH_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivVideoTemplate.f40792X : divSize;
            }
        };
        DivVideoTemplate$Companion$CREATOR$1 divVideoTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivVideoTemplate>() { // from class: com.yandex.div2.DivVideoTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivVideoTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivVideoTemplate(env, null, false, it);
            }
        };
    }

    public DivVideoTemplate(@NotNull ParsingEnvironment env, @Nullable DivVideoTemplate divVideoTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        Field<DivAccessibilityTemplate> field = divVideoTemplate == null ? null : divVideoTemplate.f40861a;
        DivAccessibilityTemplate.Companion companion = DivAccessibilityTemplate.f34515g;
        this.f40861a = JsonTemplateParser.m17354o(json, "accessibility", z, field, DivAccessibilityTemplate.f34531w, f34328a, env);
        Field<Expression<DivAlignmentHorizontal>> field2 = divVideoTemplate == null ? null : divVideoTemplate.f40862b;
        DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
        this.f40862b = JsonTemplateParser.m17358s(json, "alignment_horizontal", z, field2, DivAlignmentHorizontal.f34618d, f34328a, env, f40794Y);
        Field<Expression<DivAlignmentVertical>> field3 = divVideoTemplate == null ? null : divVideoTemplate.f40863c;
        DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
        this.f40863c = JsonTemplateParser.m17358s(json, "alignment_vertical", z, field3, DivAlignmentVertical.f34626d, f34328a, env, f40796Z);
        this.f40864d = JsonTemplateParser.m17357r(json, "alpha", z, divVideoTemplate == null ? null : divVideoTemplate.f40864d, ParsingConvertersKt.f33830d, f40800b0, f34328a, env, TypeHelpersKt.f33851d);
        Field<Expression<Boolean>> field4 = divVideoTemplate == null ? null : divVideoTemplate.f40865e;
        Function1<Object, Boolean> function1 = ParsingConvertersKt.f33829c;
        TypeHelper<Boolean> typeHelper = TypeHelpersKt.f33848a;
        this.f40865e = JsonTemplateParser.m17358s(json, "autostart", z, field4, function1, f34328a, env, typeHelper);
        Field<List<DivBackgroundTemplate>> field5 = divVideoTemplate == null ? null : divVideoTemplate.f40866f;
        DivBackgroundTemplate.Companion companion2 = DivBackgroundTemplate.f34758a;
        this.f40866f = JsonTemplateParser.m17360u(json, "background", z, field5, DivBackgroundTemplate.f34759b, f40806e0, f34328a, env);
        Field<DivBorderTemplate> field6 = divVideoTemplate == null ? null : divVideoTemplate.f40867g;
        DivBorderTemplate.Companion companion3 = DivBorderTemplate.f34795f;
        this.f40867g = JsonTemplateParser.m17354o(json, "border", z, field6, DivBorderTemplate.f34804o, f34328a, env);
        Field<List<DivActionTemplate>> field7 = divVideoTemplate == null ? null : divVideoTemplate.f40868h;
        DivActionTemplate.Companion companion4 = DivActionTemplate.f34572i;
        Function2<ParsingEnvironment, JSONObject, DivActionTemplate> function2 = DivActionTemplate.f34586w;
        this.f40868h = JsonTemplateParser.m17360u(json, "buffering_actions", z, field7, function2, f40810g0, f34328a, env);
        Field<Expression<Long>> field8 = divVideoTemplate == null ? null : divVideoTemplate.f40869i;
        Function1<Number, Long> function12 = ParsingConvertersKt.f33831e;
        ValueValidator<Long> valueValidator = f40812h0;
        TypeHelper<Long> typeHelper2 = TypeHelpersKt.f33849b;
        this.f40869i = JsonTemplateParser.m17357r(json, "column_span", z, field8, function12, valueValidator, f34328a, env, typeHelper2);
        Field<List<DivDisappearActionTemplate>> field9 = divVideoTemplate == null ? null : divVideoTemplate.f40870j;
        DivDisappearActionTemplate.Companion companion5 = DivDisappearActionTemplate.f35550i;
        this.f40870j = JsonTemplateParser.m17360u(json, "disappear_actions", z, field9, DivDisappearActionTemplate.f35549C, f40818k0, f34328a, env);
        this.f40871k = JsonTemplateParser.m17351l(json, "elapsed_time_variable", z, divVideoTemplate == null ? null : divVideoTemplate.f40871k, f40820l0, f34328a, env);
        this.f40872l = JsonTemplateParser.m17360u(json, "end_actions", z, divVideoTemplate == null ? null : divVideoTemplate.f40872l, function2, f40826o0, f34328a, env);
        Field<List<DivExtensionTemplate>> field10 = divVideoTemplate == null ? null : divVideoTemplate.f40873m;
        DivExtensionTemplate.Companion companion6 = DivExtensionTemplate.f35664c;
        this.f40873m = JsonTemplateParser.m17360u(json, "extensions", z, field10, DivExtensionTemplate.f35667f, f40830q0, f34328a, env);
        this.f40874n = JsonTemplateParser.m17360u(json, "fatal_actions", z, divVideoTemplate == null ? null : divVideoTemplate.f40874n, function2, f40834s0, f34328a, env);
        Field<DivFocusTemplate> field11 = divVideoTemplate == null ? null : divVideoTemplate.f40875o;
        DivFocusTemplate.Companion companion7 = DivFocusTemplate.f35833f;
        this.f40875o = JsonTemplateParser.m17354o(json, "focus", z, field11, DivFocusTemplate.f35846s, f34328a, env);
        Field<DivSizeTemplate> field12 = divVideoTemplate == null ? null : divVideoTemplate.f40876p;
        DivSizeTemplate.Companion companion8 = DivSizeTemplate.f38839a;
        Function2<ParsingEnvironment, JSONObject, DivSizeTemplate> function22 = DivSizeTemplate.f38840b;
        this.f40876p = JsonTemplateParser.m17354o(json, "height", z, field12, function22, f34328a, env);
        this.f40877q = JsonTemplateParser.m17351l(json, "id", z, divVideoTemplate == null ? null : divVideoTemplate.f40877q, f40836t0, f34328a, env);
        Field<DivEdgeInsetsTemplate> field13 = divVideoTemplate == null ? null : divVideoTemplate.f40878r;
        DivEdgeInsetsTemplate.Companion companion9 = DivEdgeInsetsTemplate.f35626f;
        Function2<ParsingEnvironment, JSONObject, DivEdgeInsetsTemplate> function23 = DivEdgeInsetsTemplate.f35646z;
        this.f40878r = JsonTemplateParser.m17354o(json, "margins", z, field13, function23, f34328a, env);
        this.f40879s = JsonTemplateParser.m17358s(json, "muted", z, divVideoTemplate == null ? null : divVideoTemplate.f40879s, function1, f34328a, env, typeHelper);
        this.f40880t = JsonTemplateParser.m17354o(json, "paddings", z, divVideoTemplate == null ? null : divVideoTemplate.f40880t, function23, f34328a, env);
        this.f40881u = JsonTemplateParser.m17360u(json, "pause_actions", z, divVideoTemplate == null ? null : divVideoTemplate.f40881u, function2, f40842w0, f34328a, env);
        this.f40882v = JsonTemplateParser.m17352m(json, "player_settings_payload", z, divVideoTemplate == null ? null : divVideoTemplate.f40882v, f34328a, env);
        this.f40883w = JsonTemplateParser.m17355p(json, "preview", z, divVideoTemplate == null ? null : divVideoTemplate.f40883w, f40844x0, f34328a, env, TypeHelpersKt.f33850c);
        this.f40884x = JsonTemplateParser.m17358s(json, "repeatable", z, divVideoTemplate == null ? null : divVideoTemplate.f40884x, function1, f34328a, env, typeHelper);
        this.f40885y = JsonTemplateParser.m17360u(json, "resume_actions", z, divVideoTemplate == null ? null : divVideoTemplate.f40885y, function2, f40758A0, f34328a, env);
        this.f40886z = JsonTemplateParser.m17357r(json, "row_span", z, divVideoTemplate == null ? null : divVideoTemplate.f40886z, function12, f40759B0, f34328a, env, typeHelper2);
        this.f40849A = JsonTemplateParser.m17360u(json, "selected_actions", z, divVideoTemplate == null ? null : divVideoTemplate.f40849A, function2, f40762E0, f34328a, env);
        Field<List<DivTooltipTemplate>> field14 = divVideoTemplate == null ? null : divVideoTemplate.f40850B;
        DivTooltipTemplate.Companion companion10 = DivTooltipTemplate.f40520h;
        this.f40850B = JsonTemplateParser.m17360u(json, "tooltips", z, field14, DivTooltipTemplate.f40534v, f40764G0, f34328a, env);
        Field<DivTransformTemplate> field15 = divVideoTemplate == null ? null : divVideoTemplate.f40851C;
        DivTransformTemplate.Companion companion11 = DivTransformTemplate.f40559d;
        this.f40851C = JsonTemplateParser.m17354o(json, "transform", z, field15, DivTransformTemplate.f40565j, f34328a, env);
        Field<DivChangeTransitionTemplate> field16 = divVideoTemplate == null ? null : divVideoTemplate.f40852D;
        DivChangeTransitionTemplate.Companion companion12 = DivChangeTransitionTemplate.f34861a;
        this.f40852D = JsonTemplateParser.m17354o(json, "transition_change", z, field16, DivChangeTransitionTemplate.f34862b, f34328a, env);
        Field<DivAppearanceTransitionTemplate> field17 = divVideoTemplate == null ? null : divVideoTemplate.f40853E;
        DivAppearanceTransitionTemplate.Companion companion13 = DivAppearanceTransitionTemplate.f34733a;
        Function2<ParsingEnvironment, JSONObject, DivAppearanceTransitionTemplate> function24 = DivAppearanceTransitionTemplate.f34734b;
        this.f40853E = JsonTemplateParser.m17354o(json, "transition_in", z, field17, function24, f34328a, env);
        this.f40854F = JsonTemplateParser.m17354o(json, "transition_out", z, divVideoTemplate == null ? null : divVideoTemplate.f40854F, function24, f34328a, env);
        Field<List<DivTransitionTrigger>> field18 = divVideoTemplate == null ? null : divVideoTemplate.f40855G;
        DivTransitionTrigger.Converter converter3 = DivTransitionTrigger.f40582c;
        this.f40855G = JsonTemplateParser.m17359t(json, "transition_triggers", z, field18, DivTransitionTrigger.f40583d, f40766I0, f34328a, env);
        Field<List<DivVideoSourceTemplate>> field19 = divVideoTemplate == null ? null : divVideoTemplate.f40856H;
        DivVideoSourceTemplate.Companion companion14 = DivVideoSourceTemplate.f40732e;
        this.f40856H = JsonTemplateParser.m17350k(json, "video_sources", z, field19, DivVideoSourceTemplate.f40737j, f40768K0, f34328a, env);
        Field<Expression<DivVisibility>> field20 = divVideoTemplate == null ? null : divVideoTemplate.f40857I;
        DivVisibility.Converter converter4 = DivVisibility.f40930c;
        this.f40857I = JsonTemplateParser.m17358s(json, "visibility", z, field20, DivVisibility.f40931d, f34328a, env, f40798a0);
        Field<DivVisibilityActionTemplate> field21 = divVideoTemplate == null ? null : divVideoTemplate.f40858J;
        DivVisibilityActionTemplate.Companion companion15 = DivVisibilityActionTemplate.f40959i;
        Function2<ParsingEnvironment, JSONObject, DivVisibilityActionTemplate> function25 = DivVisibilityActionTemplate.f40958C;
        this.f40858J = JsonTemplateParser.m17354o(json, "visibility_action", z, field21, function25, f34328a, env);
        this.f40859K = JsonTemplateParser.m17360u(json, "visibility_actions", z, divVideoTemplate == null ? null : divVideoTemplate.f40859K, function25, f40771M0, f34328a, env);
        this.f40860L = JsonTemplateParser.m17354o(json, "width", z, divVideoTemplate == null ? null : divVideoTemplate.f40860L, function22, f34328a, env);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivVideo mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        DivAccessibility divAccessibility = (DivAccessibility) FieldKt.m17381g(this.f40861a, env, "accessibility", data, f40773N0);
        if (divAccessibility == null) {
            divAccessibility = f40770M;
        }
        DivAccessibility divAccessibility2 = divAccessibility;
        Expression expression = (Expression) FieldKt.m17378d(this.f40862b, env, "alignment_horizontal", data, f40775O0);
        Expression expression2 = (Expression) FieldKt.m17378d(this.f40863c, env, "alignment_vertical", data, f40777P0);
        Expression<Double> expression3 = (Expression) FieldKt.m17378d(this.f40864d, env, "alpha", data, f40779Q0);
        if (expression3 == null) {
            expression3 = f40772N;
        }
        Expression<Double> expression4 = expression3;
        Expression<Boolean> expression5 = (Expression) FieldKt.m17378d(this.f40865e, env, "autostart", data, f40781R0);
        if (expression5 == null) {
            expression5 = f40774O;
        }
        Expression<Boolean> expression6 = expression5;
        List m17382h = FieldKt.m17382h(this.f40866f, env, "background", data, f40804d0, f40783S0);
        DivBorder divBorder = (DivBorder) FieldKt.m17381g(this.f40867g, env, "border", data, f40785T0);
        if (divBorder == null) {
            divBorder = f40776P;
        }
        DivBorder divBorder2 = divBorder;
        List m17382h2 = FieldKt.m17382h(this.f40868h, env, "buffering_actions", data, f40808f0, f40787U0);
        Expression expression7 = (Expression) FieldKt.m17378d(this.f40869i, env, "column_span", data, f40789V0);
        List m17382h3 = FieldKt.m17382h(this.f40870j, env, "disappear_actions", data, f40816j0, f40791W0);
        String str = (String) FieldKt.m17378d(this.f40871k, env, "elapsed_time_variable", data, f40793X0);
        List m17382h4 = FieldKt.m17382h(this.f40872l, env, "end_actions", data, f40824n0, f40795Y0);
        List m17382h5 = FieldKt.m17382h(this.f40873m, env, "extensions", data, f40828p0, f40797Z0);
        List m17382h6 = FieldKt.m17382h(this.f40874n, env, "fatal_actions", data, f40832r0, f40799a1);
        DivFocus divFocus = (DivFocus) FieldKt.m17381g(this.f40875o, env, "focus", data, f40801b1);
        DivSize divSize = (DivSize) FieldKt.m17381g(this.f40876p, env, "height", data, f40803c1);
        if (divSize == null) {
            divSize = f40778Q;
        }
        DivSize divSize2 = divSize;
        String str2 = (String) FieldKt.m17378d(this.f40877q, env, "id", data, f40805d1);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) FieldKt.m17381g(this.f40878r, env, "margins", data, f40807e1);
        if (divEdgeInsets == null) {
            divEdgeInsets = f40780R;
        }
        DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
        Expression<Boolean> expression8 = (Expression) FieldKt.m17378d(this.f40879s, env, "muted", data, f40809f1);
        if (expression8 == null) {
            expression8 = f40782S;
        }
        Expression<Boolean> expression9 = expression8;
        DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) FieldKt.m17381g(this.f40880t, env, "paddings", data, f40811g1);
        if (divEdgeInsets3 == null) {
            divEdgeInsets3 = f40784T;
        }
        DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
        List m17382h7 = FieldKt.m17382h(this.f40881u, env, "pause_actions", data, f40840v0, f40813h1);
        JSONObject jSONObject = (JSONObject) FieldKt.m17378d(this.f40882v, env, "player_settings_payload", data, f40815i1);
        Expression expression10 = (Expression) FieldKt.m17378d(this.f40883w, env, "preview", data, f40817j1);
        Expression<Boolean> expression11 = (Expression) FieldKt.m17378d(this.f40884x, env, "repeatable", data, f40819k1);
        if (expression11 == null) {
            expression11 = f40786U;
        }
        Expression<Boolean> expression12 = expression11;
        List m17382h8 = FieldKt.m17382h(this.f40885y, env, "resume_actions", data, f40848z0, f40821l1);
        Expression expression13 = (Expression) FieldKt.m17378d(this.f40886z, env, "row_span", data, f40823m1);
        List m17382h9 = FieldKt.m17382h(this.f40849A, env, "selected_actions", data, f40761D0, f40825n1);
        List m17382h10 = FieldKt.m17382h(this.f40850B, env, "tooltips", data, f40763F0, f40827o1);
        DivTransform divTransform = (DivTransform) FieldKt.m17381g(this.f40851C, env, "transform", data, f40829p1);
        if (divTransform == null) {
            divTransform = f40788V;
        }
        DivTransform divTransform2 = divTransform;
        DivChangeTransition divChangeTransition = (DivChangeTransition) FieldKt.m17381g(this.f40852D, env, "transition_change", data, f40831q1);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) FieldKt.m17381g(this.f40853E, env, "transition_in", data, f40833r1);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) FieldKt.m17381g(this.f40854F, env, "transition_out", data, f40835s1);
        List m17380f = FieldKt.m17380f(this.f40855G, env, "transition_triggers", data, f40765H0, f40837t1);
        List m17384j = FieldKt.m17384j(this.f40856H, env, "video_sources", data, f40767J0, f40839u1);
        Expression<DivVisibility> expression14 = (Expression) FieldKt.m17378d(this.f40857I, env, "visibility", data, f40841v1);
        if (expression14 == null) {
            expression14 = f40790W;
        }
        Expression<DivVisibility> expression15 = expression14;
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) FieldKt.m17381g(this.f40858J, env, "visibility_action", data, f40843w1);
        List m17382h11 = FieldKt.m17382h(this.f40859K, env, "visibility_actions", data, f40769L0, f40845x1);
        DivSize divSize3 = (DivSize) FieldKt.m17381g(this.f40860L, env, "width", data, f40847y1);
        if (divSize3 == null) {
            divSize3 = f40792X;
        }
        return new DivVideo(divAccessibility2, expression, expression2, expression4, expression6, m17382h, divBorder2, m17382h2, expression7, m17382h3, str, m17382h4, m17382h5, m17382h6, divFocus, divSize2, str2, divEdgeInsets2, expression9, divEdgeInsets4, m17382h7, jSONObject, expression10, expression12, m17382h8, expression13, m17382h9, m17382h10, divTransform2, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17380f, m17384j, expression15, divVisibilityAction, m17382h11, divSize3);
    }
}
