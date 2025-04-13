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
import com.yandex.div2.DivPager;
import com.yandex.div2.DivPagerLayoutMode;
import com.yandex.div2.DivPagerLayoutModeTemplate;
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

/* compiled from: DivPagerTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivPagerTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivPager;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivPagerTemplate implements JSONSerializable, JsonTemplate<DivPager> {

    /* renamed from: A0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f37833A0;

    /* renamed from: B0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>> f37834B0;

    /* renamed from: C0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivBorder> f37835C0;

    /* renamed from: D0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f37836D0;

    /* renamed from: E0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f37837E0;

    /* renamed from: F0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>> f37838F0;

    /* renamed from: G */
    @NotNull
    public static final DivAccessibility f37839G = new DivAccessibility(null, null, null, null, null, null, 63);

    /* renamed from: G0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>> f37840G0;

    /* renamed from: H */
    @NotNull
    public static final Expression<Double> f37841H;

    /* renamed from: H0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivFocus> f37842H0;

    /* renamed from: I */
    @NotNull
    public static final DivBorder f37843I;

    /* renamed from: I0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f37844I0;

    /* renamed from: J */
    @NotNull
    public static final Expression<Long> f37845J;

    /* renamed from: J0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f37846J0;

    /* renamed from: K */
    @NotNull
    public static final DivSize.WrapContent f37847K;

    /* renamed from: K0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivFixedSize> f37848K0;

    /* renamed from: L */
    @NotNull
    public static final DivFixedSize f37849L;

    /* renamed from: L0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<Div>> f37850L0;

    /* renamed from: M */
    @NotNull
    public static final DivEdgeInsets f37851M;

    /* renamed from: M0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivPagerLayoutMode> f37852M0;

    /* renamed from: N */
    @NotNull
    public static final Expression<DivPager.Orientation> f37853N;

    /* renamed from: N0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f37854N0;

    /* renamed from: O */
    @NotNull
    public static final DivEdgeInsets f37855O;

    /* renamed from: O0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivPager.Orientation>> f37856O0;

    /* renamed from: P */
    @NotNull
    public static final Expression<Boolean> f37857P;

    /* renamed from: P0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f37858P0;

    /* renamed from: Q */
    @NotNull
    public static final DivTransform f37859Q;

    /* renamed from: Q0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>> f37860Q0;

    /* renamed from: R */
    @NotNull
    public static final Expression<DivVisibility> f37861R;

    /* renamed from: R0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f37862R0;

    /* renamed from: S */
    @NotNull
    public static final DivSize.MatchParent f37863S;

    /* renamed from: S0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f37864S0;

    /* renamed from: T */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f37865T;

    /* renamed from: T0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>> f37866T0;

    /* renamed from: U */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f37867U;

    /* renamed from: U0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivTransform> f37868U0;

    /* renamed from: V */
    @NotNull
    public static final TypeHelper<DivPager.Orientation> f37869V;

    /* renamed from: V0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition> f37870V0;

    /* renamed from: W */
    @NotNull
    public static final TypeHelper<DivVisibility> f37871W;

    /* renamed from: W0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f37872W0;

    /* renamed from: X */
    @NotNull
    public static final ValueValidator<Double> f37873X;

    /* renamed from: X0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f37874X0;

    /* renamed from: Y */
    @NotNull
    public static final ValueValidator<Double> f37875Y;

    /* renamed from: Y0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>> f37876Y0;

    /* renamed from: Z */
    @NotNull
    public static final ListValidator<DivBackground> f37877Z;

    /* renamed from: Z0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>> f37878Z0;

    /* renamed from: a0 */
    @NotNull
    public static final ListValidator<DivBackgroundTemplate> f37879a0;

    /* renamed from: a1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction> f37880a1;

    /* renamed from: b0 */
    @NotNull
    public static final ValueValidator<Long> f37881b0;

    /* renamed from: b1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>> f37882b1;

    /* renamed from: c0 */
    @NotNull
    public static final ValueValidator<Long> f37883c0;

    /* renamed from: c1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f37884c1;

    /* renamed from: d0 */
    @NotNull
    public static final ValueValidator<Long> f37885d0;

    /* renamed from: e0 */
    @NotNull
    public static final ValueValidator<Long> f37886e0;

    /* renamed from: f0 */
    @NotNull
    public static final ListValidator<DivDisappearAction> f37887f0;

    /* renamed from: g0 */
    @NotNull
    public static final ListValidator<DivDisappearActionTemplate> f37888g0;

    /* renamed from: h0 */
    @NotNull
    public static final ListValidator<DivExtension> f37889h0;

    /* renamed from: i0 */
    @NotNull
    public static final ListValidator<DivExtensionTemplate> f37890i0;

    /* renamed from: j0 */
    @NotNull
    public static final ValueValidator<String> f37891j0;

    /* renamed from: k0 */
    @NotNull
    public static final ValueValidator<String> f37892k0;

    /* renamed from: l0 */
    @NotNull
    public static final ListValidator<Div> f37893l0;

    /* renamed from: m0 */
    @NotNull
    public static final ListValidator<DivTemplate> f37894m0;

    /* renamed from: n0 */
    @NotNull
    public static final ValueValidator<Long> f37895n0;

    /* renamed from: o0 */
    @NotNull
    public static final ValueValidator<Long> f37896o0;

    /* renamed from: p0 */
    @NotNull
    public static final ListValidator<DivAction> f37897p0;

    /* renamed from: q0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f37898q0;

    /* renamed from: r0 */
    @NotNull
    public static final ListValidator<DivTooltip> f37899r0;

    /* renamed from: s0 */
    @NotNull
    public static final ListValidator<DivTooltipTemplate> f37900s0;

    /* renamed from: t0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f37901t0;

    /* renamed from: u0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f37902u0;

    /* renamed from: v0 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f37903v0;

    /* renamed from: w0 */
    @NotNull
    public static final ListValidator<DivVisibilityActionTemplate> f37904w0;

    /* renamed from: x0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAccessibility> f37905x0;

    /* renamed from: y0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>> f37906y0;

    /* renamed from: z0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>> f37907z0;

    /* renamed from: A */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f37908A;

    /* renamed from: B */
    @JvmField
    @NotNull
    public final Field<List<DivTransitionTrigger>> f37909B;

    /* renamed from: C */
    @JvmField
    @NotNull
    public final Field<Expression<DivVisibility>> f37910C;

    /* renamed from: D */
    @JvmField
    @NotNull
    public final Field<DivVisibilityActionTemplate> f37911D;

    /* renamed from: E */
    @JvmField
    @NotNull
    public final Field<List<DivVisibilityActionTemplate>> f37912E;

    /* renamed from: F */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f37913F;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<DivAccessibilityTemplate> f37914a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f37915b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f37916c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f37917d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f37918e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final Field<DivBorderTemplate> f37919f;

    /* renamed from: g */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f37920g;

    /* renamed from: h */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f37921h;

    /* renamed from: i */
    @JvmField
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f37922i;

    /* renamed from: j */
    @JvmField
    @NotNull
    public final Field<List<DivExtensionTemplate>> f37923j;

    /* renamed from: k */
    @JvmField
    @NotNull
    public final Field<DivFocusTemplate> f37924k;

    /* renamed from: l */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f37925l;

    /* renamed from: m */
    @JvmField
    @NotNull
    public final Field<String> f37926m;

    /* renamed from: n */
    @JvmField
    @NotNull
    public final Field<DivFixedSizeTemplate> f37927n;

    /* renamed from: o */
    @JvmField
    @NotNull
    public final Field<List<DivTemplate>> f37928o;

    /* renamed from: p */
    @JvmField
    @NotNull
    public final Field<DivPagerLayoutModeTemplate> f37929p;

    /* renamed from: q */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f37930q;

    /* renamed from: r */
    @JvmField
    @NotNull
    public final Field<Expression<DivPager.Orientation>> f37931r;

    /* renamed from: s */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f37932s;

    /* renamed from: t */
    @JvmField
    @NotNull
    public final Field<Expression<Boolean>> f37933t;

    /* renamed from: u */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f37934u;

    /* renamed from: v */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f37935v;

    /* renamed from: w */
    @JvmField
    @NotNull
    public final Field<List<DivTooltipTemplate>> f37936w;

    /* renamed from: x */
    @JvmField
    @NotNull
    public final Field<DivTransformTemplate> f37937x;

    /* renamed from: y */
    @JvmField
    @NotNull
    public final Field<DivChangeTransitionTemplate> f37938y;

    /* renamed from: z */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f37939z;

    /* compiled from: DivPagerTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\bR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u000bR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u000bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0010R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0010R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0010R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0010R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u000bR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u000bR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0010R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0010R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\bR\u0014\u00106\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00103R\u001a\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\bR\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\u000bR\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\u000bR\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\u0010R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010\u0010R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\u0010R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0010R\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010\u0010R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020F0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010\u0010R\u0014\u0010I\u001a\u00020'8\u0006X\u0086T¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020L0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020O0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010NR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u0002040K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010NR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020R0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010NR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020T0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010\u0010R\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020V0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010\u0010R\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020R0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010\bR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[¨\u0006\\"}, m31884d2 = {"Lcom/yandex/div2/DivPagerTemplate$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackgroundTemplate;", "BACKGROUND_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "DEFAULT_ITEM_DEFAULT_VALUE", "DEFAULT_ITEM_TEMPLATE_VALIDATOR", "DEFAULT_ITEM_VALIDATOR", "Lcom/yandex/div2/DivDisappearActionTemplate;", "DISAPPEAR_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivExtensionTemplate;", "EXTENSIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div2/DivTemplate;", "ITEMS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/Div;", "ITEMS_VALIDATOR", "Lcom/yandex/div2/DivFixedSize;", "ITEM_SPACING_DEFAULT_VALUE", "Lcom/yandex/div2/DivFixedSize;", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "Lcom/yandex/div2/DivPager$Orientation;", "ORIENTATION_DEFAULT_VALUE", "PADDINGS_DEFAULT_VALUE", "", "RESTRICT_PARENT_SCROLL_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "Lcom/yandex/div2/DivActionTemplate;", "SELECTED_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivAction;", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivTooltipTemplate;", "TOOLTIPS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_TEMPLATE_VALIDATOR", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "TYPE_HELPER_ORIENTATION", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/DivVisibilityActionTemplate;", "VISIBILITY_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f37841H = companion.m17539a(Double.valueOf(1.0d));
        f37843I = new DivBorder(null, null, null, null, null, 31);
        f37845J = companion.m17539a(0L);
        f37847K = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7));
        f37849L = new DivFixedSize(null, companion.m17539a(0L), 1);
        f37851M = new DivEdgeInsets(null, null, null, null, null, 31);
        f37853N = companion.m17539a(DivPager.Orientation.HORIZONTAL);
        f37855O = new DivEdgeInsets(null, null, null, null, null, 31);
        f37857P = companion.m17539a(Boolean.FALSE);
        f37859Q = new DivTransform(null, null, null, 7);
        f37861R = companion.m17539a(DivVisibility.VISIBLE);
        f37863S = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i2 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f37865T = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f37867U = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f37869V = companion2.m17372a(ArraysKt.m31926B(DivPager.Orientation.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$TYPE_HELPER_ORIENTATION$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivPager.Orientation);
            }
        });
        f37871W = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f37873X = C3076y.f42181l;
        f37875Y = C3076y.f42186q;
        f37877Z = C3075x.f42169y;
        f37879a0 = C3075x.f42170z;
        f37881b0 = C3076y.f42187r;
        f37883c0 = C3076y.f42188s;
        f37885d0 = C3076y.f42189t;
        f37886e0 = C3076y.f42190u;
        f37887f0 = C3075x.f42141A;
        f37888g0 = C3075x.f42142B;
        f37889h0 = C3075x.f42157m;
        f37890i0 = C3075x.f42158n;
        f37891j0 = C3076y.f42182m;
        f37892k0 = C3076y.f42183n;
        f37893l0 = C3075x.f42159o;
        f37894m0 = C3075x.f42160p;
        f37895n0 = C3076y.f42184o;
        f37896o0 = C3076y.f42185p;
        f37897p0 = C3075x.f42161q;
        f37898q0 = C3075x.f42162r;
        f37899r0 = C3075x.f42163s;
        f37900s0 = C3075x.f42164t;
        f37901t0 = C3075x.f42165u;
        f37902u0 = C3075x.f42166v;
        f37903v0 = C3075x.f42167w;
        f37904w0 = C3075x.f42168x;
        f37905x0 = new Function3<String, JSONObject, ParsingEnvironment, DivAccessibility>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$ACCESSIBILITY_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAccessibility mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAccessibility.Companion companion3 = DivAccessibility.f34479f;
                DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject2, str2, DivAccessibility.f34486m, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divAccessibility == null ? DivPagerTemplate.f37839G : divAccessibility;
            }
        };
        f37906y0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$ALIGNMENT_HORIZONTAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentHorizontal> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentHorizontal.f34618d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivPagerTemplate.f37865T);
            }
        };
        f37907z0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$ALIGNMENT_VERTICAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentVertical> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentVertical.Converter converter = DivAlignmentVertical.f34625c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentVertical.f34626d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivPagerTemplate.f37867U);
            }
        };
        f37833A0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$ALPHA_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
                ValueValidator<Double> valueValidator = DivPagerTemplate.f37875Y;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Double> expression = DivPagerTemplate.f37841H;
                Expression<Double> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
                return m17328t == null ? expression : m17328t;
            }
        };
        f37834B0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$BACKGROUND_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivBackground> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBackground.Companion companion3 = DivBackground.f34750a;
                return JsonParser.m17333y(jSONObject2, str2, DivBackground.f34751b, DivPagerTemplate.f37877Z, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f37835C0 = new Function3<String, JSONObject, ParsingEnvironment, DivBorder>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$BORDER_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivBorder mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBorder.Companion companion3 = DivBorder.f34785f;
                DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject2, str2, DivBorder.f34788i, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divBorder == null ? DivPagerTemplate.f37843I : divBorder;
            }
        };
        f37836D0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$COLUMN_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivPagerTemplate.f37883c0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f37837E0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$DEFAULT_ITEM_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivPagerTemplate.f37886e0;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivPagerTemplate.f37845J;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        f37838F0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$DISAPPEAR_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivDisappearAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivDisappearAction.Companion companion3 = DivDisappearAction.f35537a;
                return JsonParser.m17333y(jSONObject2, str2, DivDisappearAction.f35545i, DivPagerTemplate.f37887f0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f37840G0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$EXTENSIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivExtension> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivExtension.Companion companion3 = DivExtension.f35659c;
                return JsonParser.m17333y(jSONObject2, str2, DivExtension.f35660d, DivPagerTemplate.f37889h0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f37842H0 = new Function3<String, JSONObject, ParsingEnvironment, DivFocus>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$FOCUS_READER$1
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
        f37844I0 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$HEIGHT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivPagerTemplate.f37847K : divSize;
            }
        };
        f37846J0 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$ID_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return (String) JsonParser.m17323o(jSONObject2, str2, DivPagerTemplate.f37892k0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f37848K0 = new Function3<String, JSONObject, ParsingEnvironment, DivFixedSize>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$ITEM_SPACING_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivFixedSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivFixedSize.Companion companion3 = DivFixedSize.f35789c;
                DivFixedSize divFixedSize = (DivFixedSize) JsonParser.m17322n(jSONObject2, str2, DivFixedSize.f35793g, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divFixedSize == null ? DivPagerTemplate.f37849L : divFixedSize;
            }
        };
        f37850L0 = new Function3<String, JSONObject, ParsingEnvironment, List<Div>>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$ITEMS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<Div> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Div.Companion companion3 = Div.f34418a;
                List<Div> m17321m = JsonParser.m17321m(jSONObject2, str2, Div.f34419b, DivPagerTemplate.f37893l0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                Intrinsics.m32178g(m17321m, "readList(json, key, Div.…LIDATOR, env.logger, env)");
                return m17321m;
            }
        };
        f37852M0 = new Function3<String, JSONObject, ParsingEnvironment, DivPagerLayoutMode>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$LAYOUT_MODE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivPagerLayoutMode mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivPagerLayoutMode.Companion companion3 = DivPagerLayoutMode.f37823a;
                Function2<ParsingEnvironment, JSONObject, DivPagerLayoutMode> function2 = DivPagerLayoutMode.f37824b;
                parsingEnvironment2.getF34328a();
                return (DivPagerLayoutMode) JsonParser.m17313e(jSONObject2, str2, function2, C2904b.f33858e, parsingEnvironment2);
            }
        };
        f37854N0 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$MARGINS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivPagerTemplate.f37851M : divEdgeInsets;
            }
        };
        f37856O0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivPager.Orientation>>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$ORIENTATION_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivPager.Orientation> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivPager.Orientation.Converter converter = DivPager.Orientation.f37816c;
                Function1<String, DivPager.Orientation> function1 = DivPager.Orientation.f37817d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivPager.Orientation> expression = DivPagerTemplate.f37853N;
                Expression<DivPager.Orientation> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivPagerTemplate.f37869V);
                return m17330v == null ? expression : m17330v;
            }
        };
        f37858P0 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$PADDINGS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivPagerTemplate.f37855O : divEdgeInsets;
            }
        };
        f37860Q0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$RESTRICT_PARENT_SCROLL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Boolean> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Object, Boolean> function1 = ParsingConvertersKt.f33829c;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Boolean> expression = DivPagerTemplate.f37857P;
                Expression<Boolean> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33848a);
                return m17330v == null ? expression : m17330v;
            }
        };
        f37862R0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$ROW_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivPagerTemplate.f37896o0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f37864S0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$SELECTED_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivPagerTemplate.f37897p0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f37866T0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$TOOLTIPS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTooltip> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTooltip.Companion companion3 = DivTooltip.f40492h;
                return JsonParser.m17333y(jSONObject2, str2, DivTooltip.f40497m, DivPagerTemplate.f37899r0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f37868U0 = new Function3<String, JSONObject, ParsingEnvironment, DivTransform>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$TRANSFORM_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivTransform mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransform.Companion companion3 = DivTransform.f40551d;
                DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject2, str2, DivTransform.f40554g, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divTransform == null ? DivPagerTemplate.f37859Q : divTransform;
            }
        };
        f37870V0 = new Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$TRANSITION_CHANGE_READER$1
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
        f37872W0 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$TRANSITION_IN_READER$1
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
        f37874X0 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$TRANSITION_OUT_READER$1
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
        f37876Y0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$TRANSITION_TRIGGERS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTransitionTrigger> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransitionTrigger.Converter converter = DivTransitionTrigger.f40582c;
                return JsonParser.m17332x(jSONObject2, str2, DivTransitionTrigger.f40583d, DivPagerTemplate.f37901t0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        DivPagerTemplate$Companion$TYPE_READER$1 divPagerTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$TYPE_READER$1
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
        f37878Z0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$VISIBILITY_READER$1
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
                Expression<DivVisibility> expression = DivPagerTemplate.f37861R;
                Expression<DivVisibility> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivPagerTemplate.f37871W);
                return m17330v == null ? expression : m17330v;
            }
        };
        f37880a1 = new Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$VISIBILITY_ACTION_READER$1
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
        f37882b1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$VISIBILITY_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivVisibilityAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivVisibilityAction.Companion companion3 = DivVisibilityAction.f40938i;
                return JsonParser.m17333y(jSONObject2, str2, DivVisibilityAction.f40946q, DivPagerTemplate.f37903v0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f37884c1 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$WIDTH_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivPagerTemplate.f37863S : divSize;
            }
        };
        DivPagerTemplate$Companion$CREATOR$1 divPagerTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivPagerTemplate>() { // from class: com.yandex.div2.DivPagerTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivPagerTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivPagerTemplate(env, null, false, it);
            }
        };
    }

    public DivPagerTemplate(@NotNull ParsingEnvironment env, @Nullable DivPagerTemplate divPagerTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        Field<DivAccessibilityTemplate> field = divPagerTemplate == null ? null : divPagerTemplate.f37914a;
        DivAccessibilityTemplate.Companion companion = DivAccessibilityTemplate.f34515g;
        this.f37914a = JsonTemplateParser.m17354o(json, "accessibility", z, field, DivAccessibilityTemplate.f34531w, f34328a, env);
        Field<Expression<DivAlignmentHorizontal>> field2 = divPagerTemplate == null ? null : divPagerTemplate.f37915b;
        DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
        this.f37915b = JsonTemplateParser.m17358s(json, "alignment_horizontal", z, field2, DivAlignmentHorizontal.f34618d, f34328a, env, f37865T);
        Field<Expression<DivAlignmentVertical>> field3 = divPagerTemplate == null ? null : divPagerTemplate.f37916c;
        DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
        this.f37916c = JsonTemplateParser.m17358s(json, "alignment_vertical", z, field3, DivAlignmentVertical.f34626d, f34328a, env, f37867U);
        this.f37917d = JsonTemplateParser.m17357r(json, "alpha", z, divPagerTemplate == null ? null : divPagerTemplate.f37917d, ParsingConvertersKt.f33830d, f37873X, f34328a, env, TypeHelpersKt.f33851d);
        Field<List<DivBackgroundTemplate>> field4 = divPagerTemplate == null ? null : divPagerTemplate.f37918e;
        DivBackgroundTemplate.Companion companion2 = DivBackgroundTemplate.f34758a;
        this.f37918e = JsonTemplateParser.m17360u(json, "background", z, field4, DivBackgroundTemplate.f34759b, f37879a0, f34328a, env);
        Field<DivBorderTemplate> field5 = divPagerTemplate == null ? null : divPagerTemplate.f37919f;
        DivBorderTemplate.Companion companion3 = DivBorderTemplate.f34795f;
        this.f37919f = JsonTemplateParser.m17354o(json, "border", z, field5, DivBorderTemplate.f34804o, f34328a, env);
        Field<Expression<Long>> field6 = divPagerTemplate == null ? null : divPagerTemplate.f37920g;
        Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
        ValueValidator<Long> valueValidator = f37881b0;
        TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
        this.f37920g = JsonTemplateParser.m17357r(json, "column_span", z, field6, function1, valueValidator, f34328a, env, typeHelper);
        this.f37921h = JsonTemplateParser.m17357r(json, "default_item", z, divPagerTemplate == null ? null : divPagerTemplate.f37921h, function1, f37885d0, f34328a, env, typeHelper);
        Field<List<DivDisappearActionTemplate>> field7 = divPagerTemplate == null ? null : divPagerTemplate.f37922i;
        DivDisappearActionTemplate.Companion companion4 = DivDisappearActionTemplate.f35550i;
        this.f37922i = JsonTemplateParser.m17360u(json, "disappear_actions", z, field7, DivDisappearActionTemplate.f35549C, f37888g0, f34328a, env);
        Field<List<DivExtensionTemplate>> field8 = divPagerTemplate == null ? null : divPagerTemplate.f37923j;
        DivExtensionTemplate.Companion companion5 = DivExtensionTemplate.f35664c;
        this.f37923j = JsonTemplateParser.m17360u(json, "extensions", z, field8, DivExtensionTemplate.f35667f, f37890i0, f34328a, env);
        Field<DivFocusTemplate> field9 = divPagerTemplate == null ? null : divPagerTemplate.f37924k;
        DivFocusTemplate.Companion companion6 = DivFocusTemplate.f35833f;
        this.f37924k = JsonTemplateParser.m17354o(json, "focus", z, field9, DivFocusTemplate.f35846s, f34328a, env);
        Field<DivSizeTemplate> field10 = divPagerTemplate == null ? null : divPagerTemplate.f37925l;
        DivSizeTemplate.Companion companion7 = DivSizeTemplate.f38839a;
        Function2<ParsingEnvironment, JSONObject, DivSizeTemplate> function2 = DivSizeTemplate.f38840b;
        this.f37925l = JsonTemplateParser.m17354o(json, "height", z, field10, function2, f34328a, env);
        this.f37926m = JsonTemplateParser.m17351l(json, "id", z, divPagerTemplate == null ? null : divPagerTemplate.f37926m, f37891j0, f34328a, env);
        Field<DivFixedSizeTemplate> field11 = divPagerTemplate == null ? null : divPagerTemplate.f37927n;
        DivFixedSizeTemplate.Companion companion8 = DivFixedSizeTemplate.f35798c;
        this.f37927n = JsonTemplateParser.m17354o(json, "item_spacing", z, field11, DivFixedSizeTemplate.f35805j, f34328a, env);
        Field<List<DivTemplate>> field12 = divPagerTemplate == null ? null : divPagerTemplate.f37928o;
        DivTemplate.Companion companion9 = DivTemplate.f39864a;
        this.f37928o = JsonTemplateParser.m17350k(json, "items", z, field12, DivTemplate.f39865b, f37894m0, f34328a, env);
        Field<DivPagerLayoutModeTemplate> field13 = divPagerTemplate == null ? null : divPagerTemplate.f37929p;
        DivPagerLayoutModeTemplate.Companion companion10 = DivPagerLayoutModeTemplate.f37828a;
        this.f37929p = JsonTemplateParser.m17345f(json, "layout_mode", z, field13, DivPagerLayoutModeTemplate.f37829b, f34328a, env);
        Field<DivEdgeInsetsTemplate> field14 = divPagerTemplate == null ? null : divPagerTemplate.f37930q;
        DivEdgeInsetsTemplate.Companion companion11 = DivEdgeInsetsTemplate.f35626f;
        Function2<ParsingEnvironment, JSONObject, DivEdgeInsetsTemplate> function22 = DivEdgeInsetsTemplate.f35646z;
        this.f37930q = JsonTemplateParser.m17354o(json, "margins", z, field14, function22, f34328a, env);
        Field<Expression<DivPager.Orientation>> field15 = divPagerTemplate == null ? null : divPagerTemplate.f37931r;
        DivPager.Orientation.Converter converter3 = DivPager.Orientation.f37816c;
        this.f37931r = JsonTemplateParser.m17358s(json, "orientation", z, field15, DivPager.Orientation.f37817d, f34328a, env, f37869V);
        this.f37932s = JsonTemplateParser.m17354o(json, "paddings", z, divPagerTemplate == null ? null : divPagerTemplate.f37932s, function22, f34328a, env);
        this.f37933t = JsonTemplateParser.m17358s(json, "restrict_parent_scroll", z, divPagerTemplate == null ? null : divPagerTemplate.f37933t, ParsingConvertersKt.f33829c, f34328a, env, TypeHelpersKt.f33848a);
        this.f37934u = JsonTemplateParser.m17357r(json, "row_span", z, divPagerTemplate == null ? null : divPagerTemplate.f37934u, function1, f37895n0, f34328a, env, typeHelper);
        Field<List<DivActionTemplate>> field16 = divPagerTemplate == null ? null : divPagerTemplate.f37935v;
        DivActionTemplate.Companion companion12 = DivActionTemplate.f34572i;
        this.f37935v = JsonTemplateParser.m17360u(json, "selected_actions", z, field16, DivActionTemplate.f34586w, f37898q0, f34328a, env);
        Field<List<DivTooltipTemplate>> field17 = divPagerTemplate == null ? null : divPagerTemplate.f37936w;
        DivTooltipTemplate.Companion companion13 = DivTooltipTemplate.f40520h;
        this.f37936w = JsonTemplateParser.m17360u(json, "tooltips", z, field17, DivTooltipTemplate.f40534v, f37900s0, f34328a, env);
        Field<DivTransformTemplate> field18 = divPagerTemplate == null ? null : divPagerTemplate.f37937x;
        DivTransformTemplate.Companion companion14 = DivTransformTemplate.f40559d;
        this.f37937x = JsonTemplateParser.m17354o(json, "transform", z, field18, DivTransformTemplate.f40565j, f34328a, env);
        Field<DivChangeTransitionTemplate> field19 = divPagerTemplate == null ? null : divPagerTemplate.f37938y;
        DivChangeTransitionTemplate.Companion companion15 = DivChangeTransitionTemplate.f34861a;
        this.f37938y = JsonTemplateParser.m17354o(json, "transition_change", z, field19, DivChangeTransitionTemplate.f34862b, f34328a, env);
        Field<DivAppearanceTransitionTemplate> field20 = divPagerTemplate == null ? null : divPagerTemplate.f37939z;
        DivAppearanceTransitionTemplate.Companion companion16 = DivAppearanceTransitionTemplate.f34733a;
        Function2<ParsingEnvironment, JSONObject, DivAppearanceTransitionTemplate> function23 = DivAppearanceTransitionTemplate.f34734b;
        this.f37939z = JsonTemplateParser.m17354o(json, "transition_in", z, field20, function23, f34328a, env);
        this.f37908A = JsonTemplateParser.m17354o(json, "transition_out", z, divPagerTemplate == null ? null : divPagerTemplate.f37908A, function23, f34328a, env);
        Field<List<DivTransitionTrigger>> field21 = divPagerTemplate == null ? null : divPagerTemplate.f37909B;
        DivTransitionTrigger.Converter converter4 = DivTransitionTrigger.f40582c;
        this.f37909B = JsonTemplateParser.m17359t(json, "transition_triggers", z, field21, DivTransitionTrigger.f40583d, f37902u0, f34328a, env);
        Field<Expression<DivVisibility>> field22 = divPagerTemplate == null ? null : divPagerTemplate.f37910C;
        DivVisibility.Converter converter5 = DivVisibility.f40930c;
        this.f37910C = JsonTemplateParser.m17358s(json, "visibility", z, field22, DivVisibility.f40931d, f34328a, env, f37871W);
        Field<DivVisibilityActionTemplate> field23 = divPagerTemplate == null ? null : divPagerTemplate.f37911D;
        DivVisibilityActionTemplate.Companion companion17 = DivVisibilityActionTemplate.f40959i;
        Function2<ParsingEnvironment, JSONObject, DivVisibilityActionTemplate> function24 = DivVisibilityActionTemplate.f40958C;
        this.f37911D = JsonTemplateParser.m17354o(json, "visibility_action", z, field23, function24, f34328a, env);
        this.f37912E = JsonTemplateParser.m17360u(json, "visibility_actions", z, divPagerTemplate == null ? null : divPagerTemplate.f37912E, function24, f37904w0, f34328a, env);
        this.f37913F = JsonTemplateParser.m17354o(json, "width", z, divPagerTemplate == null ? null : divPagerTemplate.f37913F, function2, f34328a, env);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivPager mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        DivAccessibility divAccessibility = (DivAccessibility) FieldKt.m17381g(this.f37914a, env, "accessibility", data, f37905x0);
        if (divAccessibility == null) {
            divAccessibility = f37839G;
        }
        DivAccessibility divAccessibility2 = divAccessibility;
        Expression expression = (Expression) FieldKt.m17378d(this.f37915b, env, "alignment_horizontal", data, f37906y0);
        Expression expression2 = (Expression) FieldKt.m17378d(this.f37916c, env, "alignment_vertical", data, f37907z0);
        Expression<Double> expression3 = (Expression) FieldKt.m17378d(this.f37917d, env, "alpha", data, f37833A0);
        if (expression3 == null) {
            expression3 = f37841H;
        }
        Expression<Double> expression4 = expression3;
        List m17382h = FieldKt.m17382h(this.f37918e, env, "background", data, f37877Z, f37834B0);
        DivBorder divBorder = (DivBorder) FieldKt.m17381g(this.f37919f, env, "border", data, f37835C0);
        if (divBorder == null) {
            divBorder = f37843I;
        }
        DivBorder divBorder2 = divBorder;
        Expression expression5 = (Expression) FieldKt.m17378d(this.f37920g, env, "column_span", data, f37836D0);
        Expression<Long> expression6 = (Expression) FieldKt.m17378d(this.f37921h, env, "default_item", data, f37837E0);
        if (expression6 == null) {
            expression6 = f37845J;
        }
        Expression<Long> expression7 = expression6;
        List m17382h2 = FieldKt.m17382h(this.f37922i, env, "disappear_actions", data, f37887f0, f37838F0);
        List m17382h3 = FieldKt.m17382h(this.f37923j, env, "extensions", data, f37889h0, f37840G0);
        DivFocus divFocus = (DivFocus) FieldKt.m17381g(this.f37924k, env, "focus", data, f37842H0);
        DivSize divSize = (DivSize) FieldKt.m17381g(this.f37925l, env, "height", data, f37844I0);
        if (divSize == null) {
            divSize = f37847K;
        }
        DivSize divSize2 = divSize;
        String str = (String) FieldKt.m17378d(this.f37926m, env, "id", data, f37846J0);
        DivFixedSize divFixedSize = (DivFixedSize) FieldKt.m17381g(this.f37927n, env, "item_spacing", data, f37848K0);
        if (divFixedSize == null) {
            divFixedSize = f37849L;
        }
        DivFixedSize divFixedSize2 = divFixedSize;
        List m17384j = FieldKt.m17384j(this.f37928o, env, "items", data, f37893l0, f37850L0);
        DivPagerLayoutMode divPagerLayoutMode = (DivPagerLayoutMode) FieldKt.m17383i(this.f37929p, env, "layout_mode", data, f37852M0);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) FieldKt.m17381g(this.f37930q, env, "margins", data, f37854N0);
        if (divEdgeInsets == null) {
            divEdgeInsets = f37851M;
        }
        DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
        Expression<DivPager.Orientation> expression8 = (Expression) FieldKt.m17378d(this.f37931r, env, "orientation", data, f37856O0);
        if (expression8 == null) {
            expression8 = f37853N;
        }
        Expression<DivPager.Orientation> expression9 = expression8;
        DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) FieldKt.m17381g(this.f37932s, env, "paddings", data, f37858P0);
        if (divEdgeInsets3 == null) {
            divEdgeInsets3 = f37855O;
        }
        DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
        Expression<Boolean> expression10 = (Expression) FieldKt.m17378d(this.f37933t, env, "restrict_parent_scroll", data, f37860Q0);
        if (expression10 == null) {
            expression10 = f37857P;
        }
        Expression<Boolean> expression11 = expression10;
        Expression expression12 = (Expression) FieldKt.m17378d(this.f37934u, env, "row_span", data, f37862R0);
        List m17382h4 = FieldKt.m17382h(this.f37935v, env, "selected_actions", data, f37897p0, f37864S0);
        List m17382h5 = FieldKt.m17382h(this.f37936w, env, "tooltips", data, f37899r0, f37866T0);
        DivTransform divTransform = (DivTransform) FieldKt.m17381g(this.f37937x, env, "transform", data, f37868U0);
        if (divTransform == null) {
            divTransform = f37859Q;
        }
        DivTransform divTransform2 = divTransform;
        DivChangeTransition divChangeTransition = (DivChangeTransition) FieldKt.m17381g(this.f37938y, env, "transition_change", data, f37870V0);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) FieldKt.m17381g(this.f37939z, env, "transition_in", data, f37872W0);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) FieldKt.m17381g(this.f37908A, env, "transition_out", data, f37874X0);
        List m17380f = FieldKt.m17380f(this.f37909B, env, "transition_triggers", data, f37901t0, f37876Y0);
        Expression<DivVisibility> expression13 = (Expression) FieldKt.m17378d(this.f37910C, env, "visibility", data, f37878Z0);
        if (expression13 == null) {
            expression13 = f37861R;
        }
        Expression<DivVisibility> expression14 = expression13;
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) FieldKt.m17381g(this.f37911D, env, "visibility_action", data, f37880a1);
        List m17382h6 = FieldKt.m17382h(this.f37912E, env, "visibility_actions", data, f37903v0, f37882b1);
        DivSize divSize3 = (DivSize) FieldKt.m17381g(this.f37913F, env, "width", data, f37884c1);
        if (divSize3 == null) {
            divSize3 = f37863S;
        }
        return new DivPager(divAccessibility2, expression, expression2, expression4, m17382h, divBorder2, expression5, expression7, m17382h2, m17382h3, divFocus, divSize2, str, divFixedSize2, m17384j, divPagerLayoutMode, divEdgeInsets2, expression9, divEdgeInsets4, expression11, expression12, m17382h4, m17382h5, divTransform2, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17380f, expression14, divVisibilityAction, m17382h6, divSize3);
    }
}
