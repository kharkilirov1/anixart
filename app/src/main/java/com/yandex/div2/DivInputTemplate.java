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
import com.yandex.div2.DivInput;
import com.yandex.div2.DivInputMask;
import com.yandex.div2.DivInputMaskTemplate;
import com.yandex.div2.DivInputTemplate;
import com.yandex.div2.DivInputValidator;
import com.yandex.div2.DivInputValidatorTemplate;
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

/* compiled from: DivInputTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div2/DivInputTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivInput;", "Companion", "NativeInterfaceTemplate", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivInputTemplate implements JSONSerializable, JsonTemplate<DivInput> {

    /* renamed from: A0 */
    @NotNull
    public static final ValueValidator<Long> f37398A0;

    /* renamed from: A1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>> f37399A1;

    /* renamed from: B0 */
    @NotNull
    public static final ValueValidator<Long> f37400B0;

    /* renamed from: B1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f37401B1;

    /* renamed from: C0 */
    @NotNull
    public static final ValueValidator<String> f37402C0;

    /* renamed from: C1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>> f37403C1;

    /* renamed from: D0 */
    @NotNull
    public static final ValueValidator<String> f37404D0;

    /* renamed from: D1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f37405D1;

    /* renamed from: E0 */
    @NotNull
    public static final ValueValidator<String> f37406E0;

    /* renamed from: E1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>> f37407E1;

    /* renamed from: F0 */
    @NotNull
    public static final ValueValidator<String> f37408F0;

    /* renamed from: F1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivTransform> f37409F1;

    /* renamed from: G0 */
    @NotNull
    public static final ValueValidator<Long> f37410G0;

    /* renamed from: G1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition> f37411G1;

    /* renamed from: H0 */
    @NotNull
    public static final ValueValidator<Long> f37412H0;

    /* renamed from: H1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f37413H1;

    /* renamed from: I0 */
    @NotNull
    public static final ValueValidator<Long> f37414I0;

    /* renamed from: I1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f37415I1;

    /* renamed from: J0 */
    @NotNull
    public static final ValueValidator<Long> f37416J0;

    /* renamed from: J1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>> f37417J1;

    /* renamed from: K0 */
    @NotNull
    public static final ValueValidator<Long> f37418K0;

    /* renamed from: K1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivInputValidator>> f37419K1;

    /* renamed from: L0 */
    @NotNull
    public static final ValueValidator<Long> f37420L0;

    /* renamed from: L1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>> f37421L1;

    /* renamed from: M0 */
    @NotNull
    public static final ListValidator<DivAction> f37422M0;

    /* renamed from: M1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction> f37423M1;

    /* renamed from: N0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f37424N0;

    /* renamed from: N1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>> f37425N1;

    /* renamed from: O0 */
    @NotNull
    public static final ValueValidator<String> f37426O0;

    /* renamed from: O1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f37427O1;

    /* renamed from: P0 */
    @NotNull
    public static final ValueValidator<String> f37428P0;

    /* renamed from: Q0 */
    @NotNull
    public static final ListValidator<DivTooltip> f37429Q0;

    /* renamed from: R */
    @NotNull
    public static final DivAccessibility f37430R = new DivAccessibility(null, null, null, null, null, null, 63);

    /* renamed from: R0 */
    @NotNull
    public static final ListValidator<DivTooltipTemplate> f37431R0;

    /* renamed from: S */
    @NotNull
    public static final Expression<Double> f37432S;

    /* renamed from: S0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f37433S0;

    /* renamed from: T */
    @NotNull
    public static final DivBorder f37434T;

    /* renamed from: T0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f37435T0;

    /* renamed from: U */
    @NotNull
    public static final Expression<DivFontFamily> f37436U;

    /* renamed from: U0 */
    @NotNull
    public static final ListValidator<DivInputValidator> f37437U0;

    /* renamed from: V */
    @NotNull
    public static final Expression<Long> f37438V;

    /* renamed from: V0 */
    @NotNull
    public static final ListValidator<DivInputValidatorTemplate> f37439V0;

    /* renamed from: W */
    @NotNull
    public static final Expression<DivSizeUnit> f37440W;

    /* renamed from: W0 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f37441W0;

    /* renamed from: X */
    @NotNull
    public static final Expression<DivFontWeight> f37442X;

    /* renamed from: X0 */
    @NotNull
    public static final ListValidator<DivVisibilityActionTemplate> f37443X0;

    /* renamed from: Y */
    @NotNull
    public static final DivSize.WrapContent f37444Y;

    /* renamed from: Y0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAccessibility> f37445Y0;

    /* renamed from: Z */
    @NotNull
    public static final Expression<Integer> f37446Z;

    /* renamed from: Z0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>> f37447Z0;

    /* renamed from: a0 */
    @NotNull
    public static final Expression<DivInput.KeyboardType> f37448a0;

    /* renamed from: a1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>> f37449a1;

    /* renamed from: b0 */
    @NotNull
    public static final Expression<Double> f37450b0;

    /* renamed from: b1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f37451b1;

    /* renamed from: c0 */
    @NotNull
    public static final DivEdgeInsets f37452c0;

    /* renamed from: c1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>> f37453c1;

    /* renamed from: d0 */
    @NotNull
    public static final DivEdgeInsets f37454d0;

    /* renamed from: d1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivBorder> f37455d1;

    /* renamed from: e0 */
    @NotNull
    public static final Expression<Boolean> f37456e0;

    /* renamed from: e1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f37457e1;

    /* renamed from: f0 */
    @NotNull
    public static final Expression<Integer> f37458f0;

    /* renamed from: f1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>> f37459f1;

    /* renamed from: g0 */
    @NotNull
    public static final DivTransform f37460g0;

    /* renamed from: g1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>> f37461g1;

    /* renamed from: h0 */
    @NotNull
    public static final Expression<DivVisibility> f37462h0;

    /* renamed from: h1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivFocus> f37463h1;

    /* renamed from: i0 */
    @NotNull
    public static final DivSize.MatchParent f37464i0;

    /* renamed from: i1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivFontFamily>> f37465i1;

    /* renamed from: j0 */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f37466j0;

    /* renamed from: j1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f37467j1;

    /* renamed from: k0 */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f37468k0;

    /* renamed from: k1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivSizeUnit>> f37469k1;

    /* renamed from: l0 */
    @NotNull
    public static final TypeHelper<DivFontFamily> f37470l0;

    /* renamed from: l1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivFontWeight>> f37471l1;

    /* renamed from: m0 */
    @NotNull
    public static final TypeHelper<DivSizeUnit> f37472m0;

    /* renamed from: m1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f37473m1;

    /* renamed from: n0 */
    @NotNull
    public static final TypeHelper<DivFontWeight> f37474n0;

    /* renamed from: n1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>> f37475n1;

    /* renamed from: o0 */
    @NotNull
    public static final TypeHelper<DivInput.KeyboardType> f37476o0;

    /* renamed from: o1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>> f37477o1;

    /* renamed from: p0 */
    @NotNull
    public static final TypeHelper<DivVisibility> f37478p0;

    /* renamed from: p1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<String>> f37479p1;

    /* renamed from: q0 */
    @NotNull
    public static final ValueValidator<Double> f37480q0;

    /* renamed from: q1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f37481q1;

    /* renamed from: r0 */
    @NotNull
    public static final ValueValidator<Double> f37482r0;

    /* renamed from: r1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivInput.KeyboardType>> f37483r1;

    /* renamed from: s0 */
    @NotNull
    public static final ListValidator<DivBackground> f37484s0;

    /* renamed from: s1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f37485s1;

    /* renamed from: t0 */
    @NotNull
    public static final ListValidator<DivBackgroundTemplate> f37486t0;

    /* renamed from: t1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f37487t1;

    /* renamed from: u0 */
    @NotNull
    public static final ValueValidator<Long> f37488u0;

    /* renamed from: u1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f37489u1;

    /* renamed from: v0 */
    @NotNull
    public static final ValueValidator<Long> f37490v0;

    /* renamed from: v1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivInputMask> f37491v1;

    /* renamed from: w0 */
    @NotNull
    public static final ListValidator<DivDisappearAction> f37492w0;

    /* renamed from: w1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f37493w1;

    /* renamed from: x0 */
    @NotNull
    public static final ListValidator<DivDisappearActionTemplate> f37494x0;

    /* renamed from: x1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivInput.NativeInterface> f37495x1;

    /* renamed from: y0 */
    @NotNull
    public static final ListValidator<DivExtension> f37496y0;

    /* renamed from: y1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f37497y1;

    /* renamed from: z0 */
    @NotNull
    public static final ListValidator<DivExtensionTemplate> f37498z0;

    /* renamed from: z1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f37499z1;

    /* renamed from: A */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f37500A;

    /* renamed from: B */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f37501B;

    /* renamed from: C */
    @JvmField
    @NotNull
    public final Field<Expression<Boolean>> f37502C;

    /* renamed from: D */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f37503D;

    /* renamed from: E */
    @JvmField
    @NotNull
    public final Field<Expression<Integer>> f37504E;

    /* renamed from: F */
    @JvmField
    @NotNull
    public final Field<String> f37505F;

    /* renamed from: G */
    @JvmField
    @NotNull
    public final Field<List<DivTooltipTemplate>> f37506G;

    /* renamed from: H */
    @JvmField
    @NotNull
    public final Field<DivTransformTemplate> f37507H;

    /* renamed from: I */
    @JvmField
    @NotNull
    public final Field<DivChangeTransitionTemplate> f37508I;

    /* renamed from: J */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f37509J;

    /* renamed from: K */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f37510K;

    /* renamed from: L */
    @JvmField
    @NotNull
    public final Field<List<DivTransitionTrigger>> f37511L;

    /* renamed from: M */
    @JvmField
    @NotNull
    public final Field<List<DivInputValidatorTemplate>> f37512M;

    /* renamed from: N */
    @JvmField
    @NotNull
    public final Field<Expression<DivVisibility>> f37513N;

    /* renamed from: O */
    @JvmField
    @NotNull
    public final Field<DivVisibilityActionTemplate> f37514O;

    /* renamed from: P */
    @JvmField
    @NotNull
    public final Field<List<DivVisibilityActionTemplate>> f37515P;

    /* renamed from: Q */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f37516Q;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<DivAccessibilityTemplate> f37517a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f37518b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f37519c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f37520d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f37521e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final Field<DivBorderTemplate> f37522f;

    /* renamed from: g */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f37523g;

    /* renamed from: h */
    @JvmField
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f37524h;

    /* renamed from: i */
    @JvmField
    @NotNull
    public final Field<List<DivExtensionTemplate>> f37525i;

    /* renamed from: j */
    @JvmField
    @NotNull
    public final Field<DivFocusTemplate> f37526j;

    /* renamed from: k */
    @JvmField
    @NotNull
    public final Field<Expression<DivFontFamily>> f37527k;

    /* renamed from: l */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f37528l;

    /* renamed from: m */
    @JvmField
    @NotNull
    public final Field<Expression<DivSizeUnit>> f37529m;

    /* renamed from: n */
    @JvmField
    @NotNull
    public final Field<Expression<DivFontWeight>> f37530n;

    /* renamed from: o */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f37531o;

    /* renamed from: p */
    @JvmField
    @NotNull
    public final Field<Expression<Integer>> f37532p;

    /* renamed from: q */
    @JvmField
    @NotNull
    public final Field<Expression<Integer>> f37533q;

    /* renamed from: r */
    @JvmField
    @NotNull
    public final Field<Expression<String>> f37534r;

    /* renamed from: s */
    @JvmField
    @NotNull
    public final Field<String> f37535s;

    /* renamed from: t */
    @JvmField
    @NotNull
    public final Field<Expression<DivInput.KeyboardType>> f37536t;

    /* renamed from: u */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f37537u;

    /* renamed from: v */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f37538v;

    /* renamed from: w */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f37539w;

    /* renamed from: x */
    @JvmField
    @NotNull
    public final Field<DivInputMaskTemplate> f37540x;

    /* renamed from: y */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f37541y;

    /* renamed from: z */
    @JvmField
    @NotNull
    public final Field<NativeInterfaceTemplate> f37542z;

    /* compiled from: DivInputTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000bR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0010R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0010R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\bR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00160\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\bR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u000bR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\bR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u000bR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\bR\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\bR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020/0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u000bR\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020/0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u000bR\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020/0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u000bR\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020/0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u000bR\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\bR\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\bR\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\u000bR\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\u000bR\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\u000bR\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010\u000bR\u0014\u0010>\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010;R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\u000bR\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\u000bR\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0010R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010\u0010R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010\bR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020-0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010\bR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020/0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010\u000bR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020/0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010\u000bR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020J0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010\u0010R\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020L0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010\u0010R\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010\u0010R\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020Q0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010\u0010R\u0014\u0010T\u001a\u00020/8\u0006X\u0086T¢\u0006\u0006\n\u0004\bT\u0010UR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020W0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010YR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020!0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010YR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020%0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010YR\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020(0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010YR\u001a\u0010_\u001a\b\u0012\u0004\u0012\u0002040V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010YR\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020`0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010YR\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010\u0010R\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020d0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010\u0010R\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010\u0010R\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020h0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010\u0010R\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020`0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010\bR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010m¨\u0006n"}, m31884d2 = {"Lcom/yandex/div2/DivInputTemplate$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackgroundTemplate;", "BACKGROUND_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivDisappearActionTemplate;", "DISAPPEAR_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivExtensionTemplate;", "EXTENSIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/DivFontFamily;", "FONT_FAMILY_DEFAULT_VALUE", "FONT_SIZE_DEFAULT_VALUE", "FONT_SIZE_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivSizeUnit;", "FONT_SIZE_UNIT_DEFAULT_VALUE", "FONT_SIZE_VALIDATOR", "Lcom/yandex/div2/DivFontWeight;", "FONT_WEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "", "HINT_COLOR_DEFAULT_VALUE", "", "HINT_TEXT_TEMPLATE_VALIDATOR", "HINT_TEXT_VALIDATOR", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div2/DivInput$KeyboardType;", "KEYBOARD_TYPE_DEFAULT_VALUE", "LETTER_SPACING_DEFAULT_VALUE", "LINE_HEIGHT_TEMPLATE_VALIDATOR", "LINE_HEIGHT_VALIDATOR", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "MAX_VISIBLE_LINES_TEMPLATE_VALIDATOR", "MAX_VISIBLE_LINES_VALIDATOR", "PADDINGS_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "Lcom/yandex/div2/DivActionTemplate;", "SELECTED_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivAction;", "SELECTED_ACTIONS_VALIDATOR", "", "SELECT_ALL_ON_FOCUS_DEFAULT_VALUE", "TEXT_COLOR_DEFAULT_VALUE", "TEXT_VARIABLE_TEMPLATE_VALIDATOR", "TEXT_VARIABLE_VALIDATOR", "Lcom/yandex/div2/DivTooltipTemplate;", "TOOLTIPS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_TEMPLATE_VALIDATOR", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "TYPE_HELPER_FONT_FAMILY", "TYPE_HELPER_FONT_SIZE_UNIT", "TYPE_HELPER_FONT_WEIGHT", "TYPE_HELPER_KEYBOARD_TYPE", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/DivInputValidatorTemplate;", "VALIDATORS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivInputValidator;", "VALIDATORS_VALIDATOR", "Lcom/yandex/div2/DivVisibilityActionTemplate;", "VISIBILITY_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: DivInputTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivInputTemplate$NativeInterfaceTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivInput$NativeInterface;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class NativeInterfaceTemplate implements JSONSerializable, JsonTemplate<DivInput.NativeInterface> {

        /* renamed from: b */
        @NotNull
        public static final Companion f37595b = new Companion(null);

        /* renamed from: c */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>> f37596c = new Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>>() { // from class: com.yandex.div2.DivInputTemplate$NativeInterfaceTemplate$Companion$COLOR_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Integer> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17317i(jSONObject2, str2, ParsingConvertersKt.f33827a, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33853f);
            }
        };

        /* renamed from: d */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, NativeInterfaceTemplate> f37597d = new Function2<ParsingEnvironment, JSONObject, NativeInterfaceTemplate>() { // from class: com.yandex.div2.DivInputTemplate$NativeInterfaceTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivInputTemplate.NativeInterfaceTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivInputTemplate.NativeInterfaceTemplate(env, null, false, it, 6);
            }
        };

        /* renamed from: a */
        @JvmField
        @NotNull
        public final Field<Expression<Integer>> f37598a;

        /* compiled from: DivInputTemplate.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivInputTemplate$NativeInterfaceTemplate$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        public NativeInterfaceTemplate(ParsingEnvironment parsingEnvironment, NativeInterfaceTemplate nativeInterfaceTemplate, boolean z, JSONObject jSONObject, int i2) {
            this.f37598a = JsonTemplateParser.m17349j(jSONObject, "color", (i2 & 4) != 0 ? false : z, null, ParsingConvertersKt.f33827a, parsingEnvironment.getF34328a(), parsingEnvironment, TypeHelpersKt.f33853f);
        }

        @Override // com.yandex.div.json.JsonTemplate
        /* renamed from: a */
        public DivInput.NativeInterface mo17514a(ParsingEnvironment env, JSONObject data) {
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(data, "data");
            return new DivInput.NativeInterface((Expression) FieldKt.m17376b(this.f37598a, env, "color", data, f37596c));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.f34334a;
        f37432S = companion.m17539a(Double.valueOf(1.0d));
        f37434T = new DivBorder(null, null, null, null, null, 31);
        f37436U = companion.m17539a(DivFontFamily.TEXT);
        f37438V = companion.m17539a(12L);
        f37440W = companion.m17539a(DivSizeUnit.SP);
        f37442X = companion.m17539a(DivFontWeight.REGULAR);
        int i2 = 7;
        f37444Y = new DivSize.WrapContent(new DivWrapContentSize(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, i2));
        f37446Z = companion.m17539a(1929379840);
        f37448a0 = companion.m17539a(DivInput.KeyboardType.MULTI_LINE_TEXT);
        f37450b0 = companion.m17539a(Double.valueOf(0.0d));
        f37452c0 = new DivEdgeInsets(null == true ? 1 : 0, null == true ? 1 : 0, null, null, null, 31);
        f37454d0 = new DivEdgeInsets(null, null, null, null, null, 31);
        f37456e0 = companion.m17539a(Boolean.FALSE);
        f37458f0 = companion.m17539a(-16777216);
        f37460g0 = new DivTransform(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, i2);
        f37462h0 = companion.m17539a(DivVisibility.VISIBLE);
        f37464i0 = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i3 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f37466j0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivInputTemplate$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f37468k0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivInputTemplate$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f37470l0 = companion2.m17372a(ArraysKt.m31926B(DivFontFamily.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivInputTemplate$Companion$TYPE_HELPER_FONT_FAMILY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivFontFamily);
            }
        });
        f37472m0 = companion2.m17372a(ArraysKt.m31926B(DivSizeUnit.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivInputTemplate$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivSizeUnit);
            }
        });
        f37474n0 = companion2.m17372a(ArraysKt.m31926B(DivFontWeight.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivInputTemplate$Companion$TYPE_HELPER_FONT_WEIGHT$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivFontWeight);
            }
        });
        f37476o0 = companion2.m17372a(ArraysKt.m31926B(DivInput.KeyboardType.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivInputTemplate$Companion$TYPE_HELPER_KEYBOARD_TYPE$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivInput.KeyboardType);
            }
        });
        f37478p0 = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivInputTemplate$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f37480q0 = C3073v.f42095f;
        f37482r0 = C3073v.f42106q;
        f37484s0 = C3072u.f42086v;
        f37486t0 = C3072u.f42061A;
        f37488u0 = C3073v.f42111v;
        f37490v0 = C3073v.f42112w;
        f37492w0 = C3072u.f42062B;
        f37494x0 = C3072u.f42063C;
        f37496y0 = C3072u.f42064D;
        f37498z0 = C3072u.f42065E;
        f37398A0 = C3073v.f42096g;
        f37400B0 = C3073v.f42097h;
        f37402C0 = C3073v.f42098i;
        f37404D0 = C3073v.f42099j;
        f37406E0 = C3073v.f42100k;
        f37408F0 = C3073v.f42101l;
        f37410G0 = C3073v.f42102m;
        f37412H0 = C3073v.f42103n;
        f37414I0 = C3073v.f42104o;
        f37416J0 = C3073v.f42105p;
        f37418K0 = C3073v.f42107r;
        f37420L0 = C3073v.f42108s;
        f37422M0 = C3072u.f42080p;
        f37424N0 = C3072u.f42081q;
        f37426O0 = C3073v.f42109t;
        f37428P0 = C3073v.f42110u;
        f37429Q0 = C3072u.f42082r;
        f37431R0 = C3072u.f42083s;
        f37433S0 = C3072u.f42084t;
        f37435T0 = C3072u.f42085u;
        f37437U0 = C3072u.f42087w;
        f37439V0 = C3072u.f42088x;
        f37441W0 = C3072u.f42089y;
        f37443X0 = C3072u.f42090z;
        f37445Y0 = new Function3<String, JSONObject, ParsingEnvironment, DivAccessibility>() { // from class: com.yandex.div2.DivInputTemplate$Companion$ACCESSIBILITY_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAccessibility mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAccessibility.Companion companion3 = DivAccessibility.f34479f;
                DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject2, str2, DivAccessibility.f34486m, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divAccessibility == null ? DivInputTemplate.f37430R : divAccessibility;
            }
        };
        f37447Z0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>>() { // from class: com.yandex.div2.DivInputTemplate$Companion$ALIGNMENT_HORIZONTAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentHorizontal> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentHorizontal.f34618d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivInputTemplate.f37466j0);
            }
        };
        f37449a1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>>() { // from class: com.yandex.div2.DivInputTemplate$Companion$ALIGNMENT_VERTICAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentVertical> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentVertical.Converter converter = DivAlignmentVertical.f34625c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentVertical.f34626d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivInputTemplate.f37468k0);
            }
        };
        f37451b1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivInputTemplate$Companion$ALPHA_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
                ValueValidator<Double> valueValidator = DivInputTemplate.f37482r0;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Double> expression = DivInputTemplate.f37432S;
                Expression<Double> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
                return m17328t == null ? expression : m17328t;
            }
        };
        f37453c1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>>() { // from class: com.yandex.div2.DivInputTemplate$Companion$BACKGROUND_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivBackground> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBackground.Companion companion3 = DivBackground.f34750a;
                return JsonParser.m17333y(jSONObject2, str2, DivBackground.f34751b, DivInputTemplate.f37484s0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f37455d1 = new Function3<String, JSONObject, ParsingEnvironment, DivBorder>() { // from class: com.yandex.div2.DivInputTemplate$Companion$BORDER_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivBorder mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBorder.Companion companion3 = DivBorder.f34785f;
                DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject2, str2, DivBorder.f34788i, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divBorder == null ? DivInputTemplate.f37434T : divBorder;
            }
        };
        f37457e1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivInputTemplate$Companion$COLUMN_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivInputTemplate.f37490v0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f37459f1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>>() { // from class: com.yandex.div2.DivInputTemplate$Companion$DISAPPEAR_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivDisappearAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivDisappearAction.Companion companion3 = DivDisappearAction.f35537a;
                return JsonParser.m17333y(jSONObject2, str2, DivDisappearAction.f35545i, DivInputTemplate.f37492w0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f37461g1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>>() { // from class: com.yandex.div2.DivInputTemplate$Companion$EXTENSIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivExtension> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivExtension.Companion companion3 = DivExtension.f35659c;
                return JsonParser.m17333y(jSONObject2, str2, DivExtension.f35660d, DivInputTemplate.f37496y0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f37463h1 = new Function3<String, JSONObject, ParsingEnvironment, DivFocus>() { // from class: com.yandex.div2.DivInputTemplate$Companion$FOCUS_READER$1
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
        f37465i1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivFontFamily>>() { // from class: com.yandex.div2.DivInputTemplate$Companion$FONT_FAMILY_READER$1
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
                Expression<DivFontFamily> expression = DivInputTemplate.f37436U;
                Expression<DivFontFamily> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivInputTemplate.f37470l0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f37467j1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivInputTemplate$Companion$FONT_SIZE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivInputTemplate.f37400B0;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivInputTemplate.f37438V;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        f37469k1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivSizeUnit>>() { // from class: com.yandex.div2.DivInputTemplate$Companion$FONT_SIZE_UNIT_READER$1
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
                Expression<DivSizeUnit> expression = DivInputTemplate.f37440W;
                Expression<DivSizeUnit> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivInputTemplate.f37472m0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f37471l1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivFontWeight>>() { // from class: com.yandex.div2.DivInputTemplate$Companion$FONT_WEIGHT_READER$1
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
                Expression<DivFontWeight> expression = DivInputTemplate.f37442X;
                Expression<DivFontWeight> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivInputTemplate.f37474n0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f37473m1 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivInputTemplate$Companion$HEIGHT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivInputTemplate.f37444Y : divSize;
            }
        };
        f37475n1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>>() { // from class: com.yandex.div2.DivInputTemplate$Companion$HIGHLIGHT_COLOR_READER$1
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
        f37477o1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>>() { // from class: com.yandex.div2.DivInputTemplate$Companion$HINT_COLOR_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Integer> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Object, Integer> function1 = ParsingConvertersKt.f33827a;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Integer> expression = DivInputTemplate.f37446Z;
                Expression<Integer> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33853f);
                return m17330v == null ? expression : m17330v;
            }
        };
        f37479p1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<String>>() { // from class: com.yandex.div2.DivInputTemplate$Companion$HINT_TEXT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<String> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17325q(jSONObject2, str2, DivInputTemplate.f37404D0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33850c);
            }
        };
        f37481q1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivInputTemplate$Companion$ID_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return (String) JsonParser.m17323o(jSONObject2, str2, DivInputTemplate.f37408F0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f37483r1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivInput.KeyboardType>>() { // from class: com.yandex.div2.DivInputTemplate$Companion$KEYBOARD_TYPE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivInput.KeyboardType> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivInput.KeyboardType.Converter converter = DivInput.KeyboardType.f37373c;
                Function1<String, DivInput.KeyboardType> function1 = DivInput.KeyboardType.f37374d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivInput.KeyboardType> expression = DivInputTemplate.f37448a0;
                Expression<DivInput.KeyboardType> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivInputTemplate.f37476o0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f37485s1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivInputTemplate$Companion$LETTER_SPACING_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Double> expression = DivInputTemplate.f37450b0;
                Expression<Double> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33851d);
                return m17330v == null ? expression : m17330v;
            }
        };
        f37487t1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivInputTemplate$Companion$LINE_HEIGHT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivInputTemplate.f37412H0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f37489u1 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivInputTemplate$Companion$MARGINS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivInputTemplate.f37452c0 : divEdgeInsets;
            }
        };
        f37491v1 = new Function3<String, JSONObject, ParsingEnvironment, DivInputMask>() { // from class: com.yandex.div2.DivInputTemplate$Companion$MASK_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivInputMask mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivInputMask.Companion companion3 = DivInputMask.f37388a;
                return (DivInputMask) JsonParser.m17322n(jSONObject2, str2, DivInputMask.f37389b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f37493w1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivInputTemplate$Companion$MAX_VISIBLE_LINES_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivInputTemplate.f37416J0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f37495x1 = new Function3<String, JSONObject, ParsingEnvironment, DivInput.NativeInterface>() { // from class: com.yandex.div2.DivInputTemplate$Companion$NATIVE_INTERFACE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivInput.NativeInterface mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivInput.NativeInterface.Companion companion3 = DivInput.NativeInterface.f37384b;
                return (DivInput.NativeInterface) JsonParser.m17322n(jSONObject2, str2, DivInput.NativeInterface.f37385c, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f37497y1 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivInputTemplate$Companion$PADDINGS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivInputTemplate.f37454d0 : divEdgeInsets;
            }
        };
        f37499z1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivInputTemplate$Companion$ROW_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivInputTemplate.f37420L0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f37399A1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>>() { // from class: com.yandex.div2.DivInputTemplate$Companion$SELECT_ALL_ON_FOCUS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Boolean> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Object, Boolean> function1 = ParsingConvertersKt.f33829c;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Boolean> expression = DivInputTemplate.f37456e0;
                Expression<Boolean> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33848a);
                return m17330v == null ? expression : m17330v;
            }
        };
        f37401B1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivInputTemplate$Companion$SELECTED_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivInputTemplate.f37422M0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f37403C1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>>() { // from class: com.yandex.div2.DivInputTemplate$Companion$TEXT_COLOR_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Integer> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Object, Integer> function1 = ParsingConvertersKt.f33827a;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Integer> expression = DivInputTemplate.f37458f0;
                Expression<Integer> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33853f);
                return m17330v == null ? expression : m17330v;
            }
        };
        f37405D1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivInputTemplate$Companion$TEXT_VARIABLE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return (String) JsonParser.m17311c(jSONObject2, str2, DivInputTemplate.f37428P0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f37407E1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>>() { // from class: com.yandex.div2.DivInputTemplate$Companion$TOOLTIPS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTooltip> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTooltip.Companion companion3 = DivTooltip.f40492h;
                return JsonParser.m17333y(jSONObject2, str2, DivTooltip.f40497m, DivInputTemplate.f37429Q0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f37409F1 = new Function3<String, JSONObject, ParsingEnvironment, DivTransform>() { // from class: com.yandex.div2.DivInputTemplate$Companion$TRANSFORM_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivTransform mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransform.Companion companion3 = DivTransform.f40551d;
                DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject2, str2, DivTransform.f40554g, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divTransform == null ? DivInputTemplate.f37460g0 : divTransform;
            }
        };
        f37411G1 = new Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition>() { // from class: com.yandex.div2.DivInputTemplate$Companion$TRANSITION_CHANGE_READER$1
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
        f37413H1 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivInputTemplate$Companion$TRANSITION_IN_READER$1
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
        f37415I1 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivInputTemplate$Companion$TRANSITION_OUT_READER$1
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
        f37417J1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>>() { // from class: com.yandex.div2.DivInputTemplate$Companion$TRANSITION_TRIGGERS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTransitionTrigger> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransitionTrigger.Converter converter = DivTransitionTrigger.f40582c;
                return JsonParser.m17332x(jSONObject2, str2, DivTransitionTrigger.f40583d, DivInputTemplate.f37433S0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        DivInputTemplate$Companion$TYPE_READER$1 divInputTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivInputTemplate$Companion$TYPE_READER$1
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
        f37419K1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivInputValidator>>() { // from class: com.yandex.div2.DivInputTemplate$Companion$VALIDATORS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivInputValidator> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivInputValidator.Companion companion3 = DivInputValidator.f37601a;
                return JsonParser.m17333y(jSONObject2, str2, DivInputValidator.f37602b, DivInputTemplate.f37437U0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f37421L1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>>() { // from class: com.yandex.div2.DivInputTemplate$Companion$VISIBILITY_READER$1
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
                Expression<DivVisibility> expression = DivInputTemplate.f37462h0;
                Expression<DivVisibility> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivInputTemplate.f37478p0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f37423M1 = new Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction>() { // from class: com.yandex.div2.DivInputTemplate$Companion$VISIBILITY_ACTION_READER$1
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
        f37425N1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>>() { // from class: com.yandex.div2.DivInputTemplate$Companion$VISIBILITY_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivVisibilityAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivVisibilityAction.Companion companion3 = DivVisibilityAction.f40938i;
                return JsonParser.m17333y(jSONObject2, str2, DivVisibilityAction.f40946q, DivInputTemplate.f37441W0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f37427O1 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivInputTemplate$Companion$WIDTH_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivInputTemplate.f37464i0 : divSize;
            }
        };
        DivInputTemplate$Companion$CREATOR$1 divInputTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivInputTemplate>() { // from class: com.yandex.div2.DivInputTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivInputTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivInputTemplate(env, null, false, it);
            }
        };
    }

    public DivInputTemplate(@NotNull ParsingEnvironment env, @Nullable DivInputTemplate divInputTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        Field<DivAccessibilityTemplate> field = divInputTemplate == null ? null : divInputTemplate.f37517a;
        DivAccessibilityTemplate.Companion companion = DivAccessibilityTemplate.f34515g;
        this.f37517a = JsonTemplateParser.m17354o(json, "accessibility", z, field, DivAccessibilityTemplate.f34531w, f34328a, env);
        Field<Expression<DivAlignmentHorizontal>> field2 = divInputTemplate == null ? null : divInputTemplate.f37518b;
        DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
        this.f37518b = JsonTemplateParser.m17358s(json, "alignment_horizontal", z, field2, DivAlignmentHorizontal.f34618d, f34328a, env, f37466j0);
        Field<Expression<DivAlignmentVertical>> field3 = divInputTemplate == null ? null : divInputTemplate.f37519c;
        DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
        this.f37519c = JsonTemplateParser.m17358s(json, "alignment_vertical", z, field3, DivAlignmentVertical.f34626d, f34328a, env, f37468k0);
        Field<Expression<Double>> field4 = divInputTemplate == null ? null : divInputTemplate.f37520d;
        Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
        ValueValidator<Double> valueValidator = f37480q0;
        TypeHelper<Double> typeHelper = TypeHelpersKt.f33851d;
        this.f37520d = JsonTemplateParser.m17357r(json, "alpha", z, field4, function1, valueValidator, f34328a, env, typeHelper);
        Field<List<DivBackgroundTemplate>> field5 = divInputTemplate == null ? null : divInputTemplate.f37521e;
        DivBackgroundTemplate.Companion companion2 = DivBackgroundTemplate.f34758a;
        this.f37521e = JsonTemplateParser.m17360u(json, "background", z, field5, DivBackgroundTemplate.f34759b, f37486t0, f34328a, env);
        Field<DivBorderTemplate> field6 = divInputTemplate == null ? null : divInputTemplate.f37522f;
        DivBorderTemplate.Companion companion3 = DivBorderTemplate.f34795f;
        this.f37522f = JsonTemplateParser.m17354o(json, "border", z, field6, DivBorderTemplate.f34804o, f34328a, env);
        Field<Expression<Long>> field7 = divInputTemplate == null ? null : divInputTemplate.f37523g;
        Function1<Number, Long> function12 = ParsingConvertersKt.f33831e;
        ValueValidator<Long> valueValidator2 = f37488u0;
        TypeHelper<Long> typeHelper2 = TypeHelpersKt.f33849b;
        this.f37523g = JsonTemplateParser.m17357r(json, "column_span", z, field7, function12, valueValidator2, f34328a, env, typeHelper2);
        Field<List<DivDisappearActionTemplate>> field8 = divInputTemplate == null ? null : divInputTemplate.f37524h;
        DivDisappearActionTemplate.Companion companion4 = DivDisappearActionTemplate.f35550i;
        this.f37524h = JsonTemplateParser.m17360u(json, "disappear_actions", z, field8, DivDisappearActionTemplate.f35549C, f37494x0, f34328a, env);
        Field<List<DivExtensionTemplate>> field9 = divInputTemplate == null ? null : divInputTemplate.f37525i;
        DivExtensionTemplate.Companion companion5 = DivExtensionTemplate.f35664c;
        this.f37525i = JsonTemplateParser.m17360u(json, "extensions", z, field9, DivExtensionTemplate.f35667f, f37498z0, f34328a, env);
        Field<DivFocusTemplate> field10 = divInputTemplate == null ? null : divInputTemplate.f37526j;
        DivFocusTemplate.Companion companion6 = DivFocusTemplate.f35833f;
        this.f37526j = JsonTemplateParser.m17354o(json, "focus", z, field10, DivFocusTemplate.f35846s, f34328a, env);
        Field<Expression<DivFontFamily>> field11 = divInputTemplate == null ? null : divInputTemplate.f37527k;
        DivFontFamily.Converter converter3 = DivFontFamily.f35876c;
        this.f37527k = JsonTemplateParser.m17358s(json, "font_family", z, field11, DivFontFamily.f35877d, f34328a, env, f37470l0);
        this.f37528l = JsonTemplateParser.m17357r(json, "font_size", z, divInputTemplate == null ? null : divInputTemplate.f37528l, function12, f37398A0, f34328a, env, typeHelper2);
        Field<Expression<DivSizeUnit>> field12 = divInputTemplate == null ? null : divInputTemplate.f37529m;
        DivSizeUnit.Converter converter4 = DivSizeUnit.f38845c;
        this.f37529m = JsonTemplateParser.m17358s(json, "font_size_unit", z, field12, DivSizeUnit.f38846d, f34328a, env, f37472m0);
        Field<Expression<DivFontWeight>> field13 = divInputTemplate == null ? null : divInputTemplate.f37530n;
        DivFontWeight.Converter converter5 = DivFontWeight.f35883c;
        this.f37530n = JsonTemplateParser.m17358s(json, "font_weight", z, field13, DivFontWeight.f35884d, f34328a, env, f37474n0);
        Field<DivSizeTemplate> field14 = divInputTemplate == null ? null : divInputTemplate.f37531o;
        DivSizeTemplate.Companion companion7 = DivSizeTemplate.f38839a;
        Function2<ParsingEnvironment, JSONObject, DivSizeTemplate> function2 = DivSizeTemplate.f38840b;
        this.f37531o = JsonTemplateParser.m17354o(json, "height", z, field14, function2, f34328a, env);
        Field<Expression<Integer>> field15 = divInputTemplate == null ? null : divInputTemplate.f37532p;
        Function1<Object, Integer> function13 = ParsingConvertersKt.f33827a;
        TypeHelper<Integer> typeHelper3 = TypeHelpersKt.f33853f;
        this.f37532p = JsonTemplateParser.m17358s(json, "highlight_color", z, field15, function13, f34328a, env, typeHelper3);
        this.f37533q = JsonTemplateParser.m17358s(json, "hint_color", z, divInputTemplate == null ? null : divInputTemplate.f37533q, function13, f34328a, env, typeHelper3);
        this.f37534r = JsonTemplateParser.m17355p(json, "hint_text", z, divInputTemplate == null ? null : divInputTemplate.f37534r, f37402C0, f34328a, env, TypeHelpersKt.f33850c);
        this.f37535s = JsonTemplateParser.m17351l(json, "id", z, divInputTemplate == null ? null : divInputTemplate.f37535s, f37406E0, f34328a, env);
        Field<Expression<DivInput.KeyboardType>> field16 = divInputTemplate == null ? null : divInputTemplate.f37536t;
        DivInput.KeyboardType.Converter converter6 = DivInput.KeyboardType.f37373c;
        this.f37536t = JsonTemplateParser.m17358s(json, "keyboard_type", z, field16, DivInput.KeyboardType.f37374d, f34328a, env, f37476o0);
        this.f37537u = JsonTemplateParser.m17358s(json, "letter_spacing", z, divInputTemplate == null ? null : divInputTemplate.f37537u, function1, f34328a, env, typeHelper);
        this.f37538v = JsonTemplateParser.m17357r(json, "line_height", z, divInputTemplate == null ? null : divInputTemplate.f37538v, function12, f37410G0, f34328a, env, typeHelper2);
        Field<DivEdgeInsetsTemplate> field17 = divInputTemplate == null ? null : divInputTemplate.f37539w;
        DivEdgeInsetsTemplate.Companion companion8 = DivEdgeInsetsTemplate.f35626f;
        Function2<ParsingEnvironment, JSONObject, DivEdgeInsetsTemplate> function22 = DivEdgeInsetsTemplate.f35646z;
        this.f37539w = JsonTemplateParser.m17354o(json, "margins", z, field17, function22, f34328a, env);
        Field<DivInputMaskTemplate> field18 = divInputTemplate == null ? null : divInputTemplate.f37540x;
        DivInputMaskTemplate.Companion companion9 = DivInputMaskTemplate.f37393a;
        this.f37540x = JsonTemplateParser.m17354o(json, "mask", z, field18, DivInputMaskTemplate.f37394b, f34328a, env);
        this.f37541y = JsonTemplateParser.m17357r(json, "max_visible_lines", z, divInputTemplate == null ? null : divInputTemplate.f37541y, function12, f37414I0, f34328a, env, typeHelper2);
        Field<NativeInterfaceTemplate> field19 = divInputTemplate == null ? null : divInputTemplate.f37542z;
        NativeInterfaceTemplate.Companion companion10 = NativeInterfaceTemplate.f37595b;
        this.f37542z = JsonTemplateParser.m17354o(json, "native_interface", z, field19, NativeInterfaceTemplate.f37597d, f34328a, env);
        this.f37500A = JsonTemplateParser.m17354o(json, "paddings", z, divInputTemplate == null ? null : divInputTemplate.f37500A, function22, f34328a, env);
        this.f37501B = JsonTemplateParser.m17357r(json, "row_span", z, divInputTemplate == null ? null : divInputTemplate.f37501B, function12, f37418K0, f34328a, env, typeHelper2);
        this.f37502C = JsonTemplateParser.m17358s(json, "select_all_on_focus", z, divInputTemplate == null ? null : divInputTemplate.f37502C, ParsingConvertersKt.f33829c, f34328a, env, TypeHelpersKt.f33848a);
        Field<List<DivActionTemplate>> field20 = divInputTemplate == null ? null : divInputTemplate.f37503D;
        DivActionTemplate.Companion companion11 = DivActionTemplate.f34572i;
        this.f37503D = JsonTemplateParser.m17360u(json, "selected_actions", z, field20, DivActionTemplate.f34586w, f37424N0, f34328a, env);
        this.f37504E = JsonTemplateParser.m17358s(json, "text_color", z, divInputTemplate == null ? null : divInputTemplate.f37504E, function13, f34328a, env, typeHelper3);
        this.f37505F = JsonTemplateParser.m17341b(json, "text_variable", z, divInputTemplate == null ? null : divInputTemplate.f37505F, f37426O0, f34328a, env);
        Field<List<DivTooltipTemplate>> field21 = divInputTemplate == null ? null : divInputTemplate.f37506G;
        DivTooltipTemplate.Companion companion12 = DivTooltipTemplate.f40520h;
        this.f37506G = JsonTemplateParser.m17360u(json, "tooltips", z, field21, DivTooltipTemplate.f40534v, f37431R0, f34328a, env);
        Field<DivTransformTemplate> field22 = divInputTemplate == null ? null : divInputTemplate.f37507H;
        DivTransformTemplate.Companion companion13 = DivTransformTemplate.f40559d;
        this.f37507H = JsonTemplateParser.m17354o(json, "transform", z, field22, DivTransformTemplate.f40565j, f34328a, env);
        Field<DivChangeTransitionTemplate> field23 = divInputTemplate == null ? null : divInputTemplate.f37508I;
        DivChangeTransitionTemplate.Companion companion14 = DivChangeTransitionTemplate.f34861a;
        this.f37508I = JsonTemplateParser.m17354o(json, "transition_change", z, field23, DivChangeTransitionTemplate.f34862b, f34328a, env);
        Field<DivAppearanceTransitionTemplate> field24 = divInputTemplate == null ? null : divInputTemplate.f37509J;
        DivAppearanceTransitionTemplate.Companion companion15 = DivAppearanceTransitionTemplate.f34733a;
        Function2<ParsingEnvironment, JSONObject, DivAppearanceTransitionTemplate> function23 = DivAppearanceTransitionTemplate.f34734b;
        this.f37509J = JsonTemplateParser.m17354o(json, "transition_in", z, field24, function23, f34328a, env);
        this.f37510K = JsonTemplateParser.m17354o(json, "transition_out", z, divInputTemplate == null ? null : divInputTemplate.f37510K, function23, f34328a, env);
        Field<List<DivTransitionTrigger>> field25 = divInputTemplate == null ? null : divInputTemplate.f37511L;
        DivTransitionTrigger.Converter converter7 = DivTransitionTrigger.f40582c;
        this.f37511L = JsonTemplateParser.m17359t(json, "transition_triggers", z, field25, DivTransitionTrigger.f40583d, f37435T0, f34328a, env);
        Field<List<DivInputValidatorTemplate>> field26 = divInputTemplate == null ? null : divInputTemplate.f37512M;
        DivInputValidatorTemplate.Companion companion16 = DivInputValidatorTemplate.f37678a;
        this.f37512M = JsonTemplateParser.m17360u(json, "validators", z, field26, DivInputValidatorTemplate.f37679b, f37439V0, f34328a, env);
        Field<Expression<DivVisibility>> field27 = divInputTemplate == null ? null : divInputTemplate.f37513N;
        DivVisibility.Converter converter8 = DivVisibility.f40930c;
        this.f37513N = JsonTemplateParser.m17358s(json, "visibility", z, field27, DivVisibility.f40931d, f34328a, env, f37478p0);
        Field<DivVisibilityActionTemplate> field28 = divInputTemplate == null ? null : divInputTemplate.f37514O;
        DivVisibilityActionTemplate.Companion companion17 = DivVisibilityActionTemplate.f40959i;
        Function2<ParsingEnvironment, JSONObject, DivVisibilityActionTemplate> function24 = DivVisibilityActionTemplate.f40958C;
        this.f37514O = JsonTemplateParser.m17354o(json, "visibility_action", z, field28, function24, f34328a, env);
        this.f37515P = JsonTemplateParser.m17360u(json, "visibility_actions", z, divInputTemplate == null ? null : divInputTemplate.f37515P, function24, f37443X0, f34328a, env);
        this.f37516Q = JsonTemplateParser.m17354o(json, "width", z, divInputTemplate == null ? null : divInputTemplate.f37516Q, function2, f34328a, env);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivInput mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        DivAccessibility divAccessibility = (DivAccessibility) FieldKt.m17381g(this.f37517a, env, "accessibility", data, f37445Y0);
        if (divAccessibility == null) {
            divAccessibility = f37430R;
        }
        DivAccessibility divAccessibility2 = divAccessibility;
        Expression expression = (Expression) FieldKt.m17378d(this.f37518b, env, "alignment_horizontal", data, f37447Z0);
        Expression expression2 = (Expression) FieldKt.m17378d(this.f37519c, env, "alignment_vertical", data, f37449a1);
        Expression<Double> expression3 = (Expression) FieldKt.m17378d(this.f37520d, env, "alpha", data, f37451b1);
        if (expression3 == null) {
            expression3 = f37432S;
        }
        Expression<Double> expression4 = expression3;
        List m17382h = FieldKt.m17382h(this.f37521e, env, "background", data, f37484s0, f37453c1);
        DivBorder divBorder = (DivBorder) FieldKt.m17381g(this.f37522f, env, "border", data, f37455d1);
        if (divBorder == null) {
            divBorder = f37434T;
        }
        DivBorder divBorder2 = divBorder;
        Expression expression5 = (Expression) FieldKt.m17378d(this.f37523g, env, "column_span", data, f37457e1);
        List m17382h2 = FieldKt.m17382h(this.f37524h, env, "disappear_actions", data, f37492w0, f37459f1);
        List m17382h3 = FieldKt.m17382h(this.f37525i, env, "extensions", data, f37496y0, f37461g1);
        DivFocus divFocus = (DivFocus) FieldKt.m17381g(this.f37526j, env, "focus", data, f37463h1);
        Expression<DivFontFamily> expression6 = (Expression) FieldKt.m17378d(this.f37527k, env, "font_family", data, f37465i1);
        if (expression6 == null) {
            expression6 = f37436U;
        }
        Expression<DivFontFamily> expression7 = expression6;
        Expression<Long> expression8 = (Expression) FieldKt.m17378d(this.f37528l, env, "font_size", data, f37467j1);
        if (expression8 == null) {
            expression8 = f37438V;
        }
        Expression<Long> expression9 = expression8;
        Expression<DivSizeUnit> expression10 = (Expression) FieldKt.m17378d(this.f37529m, env, "font_size_unit", data, f37469k1);
        if (expression10 == null) {
            expression10 = f37440W;
        }
        Expression<DivSizeUnit> expression11 = expression10;
        Expression<DivFontWeight> expression12 = (Expression) FieldKt.m17378d(this.f37530n, env, "font_weight", data, f37471l1);
        if (expression12 == null) {
            expression12 = f37442X;
        }
        Expression<DivFontWeight> expression13 = expression12;
        DivSize divSize = (DivSize) FieldKt.m17381g(this.f37531o, env, "height", data, f37473m1);
        if (divSize == null) {
            divSize = f37444Y;
        }
        DivSize divSize2 = divSize;
        Expression expression14 = (Expression) FieldKt.m17378d(this.f37532p, env, "highlight_color", data, f37475n1);
        Expression<Integer> expression15 = (Expression) FieldKt.m17378d(this.f37533q, env, "hint_color", data, f37477o1);
        if (expression15 == null) {
            expression15 = f37446Z;
        }
        Expression<Integer> expression16 = expression15;
        Expression expression17 = (Expression) FieldKt.m17378d(this.f37534r, env, "hint_text", data, f37479p1);
        String str = (String) FieldKt.m17378d(this.f37535s, env, "id", data, f37481q1);
        Expression<DivInput.KeyboardType> expression18 = (Expression) FieldKt.m17378d(this.f37536t, env, "keyboard_type", data, f37483r1);
        if (expression18 == null) {
            expression18 = f37448a0;
        }
        Expression<DivInput.KeyboardType> expression19 = expression18;
        Expression<Double> expression20 = (Expression) FieldKt.m17378d(this.f37537u, env, "letter_spacing", data, f37485s1);
        if (expression20 == null) {
            expression20 = f37450b0;
        }
        Expression<Double> expression21 = expression20;
        Expression expression22 = (Expression) FieldKt.m17378d(this.f37538v, env, "line_height", data, f37487t1);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) FieldKt.m17381g(this.f37539w, env, "margins", data, f37489u1);
        if (divEdgeInsets == null) {
            divEdgeInsets = f37452c0;
        }
        DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
        DivInputMask divInputMask = (DivInputMask) FieldKt.m17381g(this.f37540x, env, "mask", data, f37491v1);
        Expression expression23 = (Expression) FieldKt.m17378d(this.f37541y, env, "max_visible_lines", data, f37493w1);
        DivInput.NativeInterface nativeInterface = (DivInput.NativeInterface) FieldKt.m17381g(this.f37542z, env, "native_interface", data, f37495x1);
        DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) FieldKt.m17381g(this.f37500A, env, "paddings", data, f37497y1);
        if (divEdgeInsets3 == null) {
            divEdgeInsets3 = f37454d0;
        }
        DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
        Expression expression24 = (Expression) FieldKt.m17378d(this.f37501B, env, "row_span", data, f37499z1);
        Expression<Boolean> expression25 = (Expression) FieldKt.m17378d(this.f37502C, env, "select_all_on_focus", data, f37399A1);
        if (expression25 == null) {
            expression25 = f37456e0;
        }
        Expression<Boolean> expression26 = expression25;
        List m17382h4 = FieldKt.m17382h(this.f37503D, env, "selected_actions", data, f37422M0, f37401B1);
        Expression<Integer> expression27 = (Expression) FieldKt.m17378d(this.f37504E, env, "text_color", data, f37403C1);
        if (expression27 == null) {
            expression27 = f37458f0;
        }
        Expression<Integer> expression28 = expression27;
        String str2 = (String) FieldKt.m17376b(this.f37505F, env, "text_variable", data, f37405D1);
        List m17382h5 = FieldKt.m17382h(this.f37506G, env, "tooltips", data, f37429Q0, f37407E1);
        DivTransform divTransform = (DivTransform) FieldKt.m17381g(this.f37507H, env, "transform", data, f37409F1);
        if (divTransform == null) {
            divTransform = f37460g0;
        }
        DivTransform divTransform2 = divTransform;
        DivChangeTransition divChangeTransition = (DivChangeTransition) FieldKt.m17381g(this.f37508I, env, "transition_change", data, f37411G1);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) FieldKt.m17381g(this.f37509J, env, "transition_in", data, f37413H1);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) FieldKt.m17381g(this.f37510K, env, "transition_out", data, f37415I1);
        List m17380f = FieldKt.m17380f(this.f37511L, env, "transition_triggers", data, f37433S0, f37417J1);
        List m17382h6 = FieldKt.m17382h(this.f37512M, env, "validators", data, f37437U0, f37419K1);
        Expression<DivVisibility> expression29 = (Expression) FieldKt.m17378d(this.f37513N, env, "visibility", data, f37421L1);
        if (expression29 == null) {
            expression29 = f37462h0;
        }
        Expression<DivVisibility> expression30 = expression29;
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) FieldKt.m17381g(this.f37514O, env, "visibility_action", data, f37423M1);
        List m17382h7 = FieldKt.m17382h(this.f37515P, env, "visibility_actions", data, f37441W0, f37425N1);
        DivSize divSize3 = (DivSize) FieldKt.m17381g(this.f37516Q, env, "width", data, f37427O1);
        if (divSize3 == null) {
            divSize3 = f37464i0;
        }
        return new DivInput(divAccessibility2, expression, expression2, expression4, m17382h, divBorder2, expression5, m17382h2, m17382h3, divFocus, expression7, expression9, expression11, expression13, divSize2, expression14, expression16, expression17, str, expression19, expression21, expression22, divEdgeInsets2, divInputMask, expression23, nativeInterface, divEdgeInsets4, expression24, expression26, m17382h4, expression28, str2, m17382h5, divTransform2, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17380f, m17382h6, expression30, divVisibilityAction, m17382h7, divSize3);
    }
}
