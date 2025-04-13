package com.yandex.div2;

import android.net.Uri;
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
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivAnimationTemplate;
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivAppearanceTransitionTemplate;
import com.yandex.div2.DivAspect;
import com.yandex.div2.DivAspectTemplate;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivBackgroundTemplate;
import com.yandex.div2.DivBlendMode;
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
import com.yandex.div2.DivFadeTransition;
import com.yandex.div2.DivFadeTransitionTemplate;
import com.yandex.div2.DivFilter;
import com.yandex.div2.DivFilterTemplate;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivFocusTemplate;
import com.yandex.div2.DivImageScale;
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

/* compiled from: DivImageTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivImageTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivImage;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivImageTemplate implements JSONSerializable, JsonTemplate<DivImage> {

    /* renamed from: A0 */
    @NotNull
    public static final ListValidator<DivAction> f36817A0;

    /* renamed from: A1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivImageScale>> f36818A1;

    /* renamed from: B0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f36819B0;

    /* renamed from: B1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f36820B1;

    /* renamed from: C0 */
    @NotNull
    public static final ListValidator<DivExtension> f36821C0;

    /* renamed from: C1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>> f36822C1;

    /* renamed from: D0 */
    @NotNull
    public static final ListValidator<DivExtensionTemplate> f36823D0;

    /* renamed from: D1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivBlendMode>> f36824D1;

    /* renamed from: E0 */
    @NotNull
    public static final ListValidator<DivFilter> f36825E0;

    /* renamed from: E1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>> f36826E1;

    /* renamed from: F0 */
    @NotNull
    public static final ListValidator<DivFilterTemplate> f36827F0;

    /* renamed from: F1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivTransform> f36828F1;

    /* renamed from: G0 */
    @NotNull
    public static final ValueValidator<String> f36829G0;

    /* renamed from: G1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition> f36830G1;

    /* renamed from: H0 */
    @NotNull
    public static final ValueValidator<String> f36831H0;

    /* renamed from: H1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f36832H1;

    /* renamed from: I0 */
    @NotNull
    public static final ListValidator<DivAction> f36833I0;

    /* renamed from: I1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f36834I1;

    /* renamed from: J0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f36835J0;

    /* renamed from: J1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>> f36836J1;

    /* renamed from: K0 */
    @NotNull
    public static final ValueValidator<String> f36837K0;

    /* renamed from: K1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>> f36838K1;

    /* renamed from: L0 */
    @NotNull
    public static final ValueValidator<String> f36839L0;

    /* renamed from: L1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction> f36840L1;

    /* renamed from: M0 */
    @NotNull
    public static final ValueValidator<Long> f36841M0;

    /* renamed from: M1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>> f36842M1;

    /* renamed from: N0 */
    @NotNull
    public static final ValueValidator<Long> f36843N0;

    /* renamed from: N1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f36844N1;

    /* renamed from: O0 */
    @NotNull
    public static final ListValidator<DivAction> f36845O0;

    /* renamed from: P0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f36846P0;

    /* renamed from: Q0 */
    @NotNull
    public static final ListValidator<DivTooltip> f36847Q0;

    /* renamed from: R0 */
    @NotNull
    public static final ListValidator<DivTooltipTemplate> f36848R0;

    /* renamed from: S */
    @NotNull
    public static final DivAccessibility f36849S = new DivAccessibility(null, null, null, null, null, null, 63);

    /* renamed from: S0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f36850S0;

    /* renamed from: T */
    @NotNull
    public static final DivAnimation f36851T;

    /* renamed from: T0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f36852T0;

    /* renamed from: U */
    @NotNull
    public static final Expression<Double> f36853U;

    /* renamed from: U0 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f36854U0;

    /* renamed from: V */
    @NotNull
    public static final DivBorder f36855V;

    /* renamed from: V0 */
    @NotNull
    public static final ListValidator<DivVisibilityActionTemplate> f36856V0;

    /* renamed from: W */
    @NotNull
    public static final Expression<DivAlignmentHorizontal> f36857W;

    /* renamed from: W0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAccessibility> f36858W0;

    /* renamed from: X */
    @NotNull
    public static final Expression<DivAlignmentVertical> f36859X;

    /* renamed from: X0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAction> f36860X0;

    /* renamed from: Y */
    @NotNull
    public static final DivSize.WrapContent f36861Y;

    /* renamed from: Y0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAnimation> f36862Y0;

    /* renamed from: Z */
    @NotNull
    public static final Expression<Boolean> f36863Z;

    /* renamed from: Z0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f36864Z0;

    /* renamed from: a0 */
    @NotNull
    public static final DivEdgeInsets f36865a0;

    /* renamed from: a1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>> f36866a1;

    /* renamed from: b0 */
    @NotNull
    public static final DivEdgeInsets f36867b0;

    /* renamed from: b1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>> f36868b1;

    /* renamed from: c0 */
    @NotNull
    public static final Expression<Integer> f36869c0;

    /* renamed from: c1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f36870c1;

    /* renamed from: d0 */
    @NotNull
    public static final Expression<Boolean> f36871d0;

    /* renamed from: d1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivFadeTransition> f36872d1;

    /* renamed from: e0 */
    @NotNull
    public static final Expression<DivImageScale> f36873e0;

    /* renamed from: e1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAspect> f36874e1;

    /* renamed from: f0 */
    @NotNull
    public static final Expression<DivBlendMode> f36875f0;

    /* renamed from: f1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>> f36876f1;

    /* renamed from: g0 */
    @NotNull
    public static final DivTransform f36877g0;

    /* renamed from: g1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivBorder> f36878g1;

    /* renamed from: h0 */
    @NotNull
    public static final Expression<DivVisibility> f36879h0;

    /* renamed from: h1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f36880h1;

    /* renamed from: i0 */
    @NotNull
    public static final DivSize.MatchParent f36881i0;

    /* renamed from: i1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>> f36882i1;

    /* renamed from: j0 */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f36883j0;

    /* renamed from: j1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>> f36884j1;

    /* renamed from: k0 */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f36885k0;

    /* renamed from: k1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>> f36886k1;

    /* renamed from: l0 */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f36887l0;

    /* renamed from: l1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f36888l1;

    /* renamed from: m0 */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f36889m0;

    /* renamed from: m1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>> f36890m1;

    /* renamed from: n0 */
    @NotNull
    public static final TypeHelper<DivImageScale> f36891n0;

    /* renamed from: n1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivFilter>> f36892n1;

    /* renamed from: o0 */
    @NotNull
    public static final TypeHelper<DivBlendMode> f36893o0;

    /* renamed from: o1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivFocus> f36894o1;

    /* renamed from: p0 */
    @NotNull
    public static final TypeHelper<DivVisibility> f36895p0;

    /* renamed from: p1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f36896p1;

    /* renamed from: q0 */
    @NotNull
    public static final ListValidator<DivAction> f36897q0;

    /* renamed from: q1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>> f36898q1;

    /* renamed from: r0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f36899r0;

    /* renamed from: r1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f36900r1;

    /* renamed from: s0 */
    @NotNull
    public static final ValueValidator<Double> f36901s0;

    /* renamed from: s1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Uri>> f36902s1;

    /* renamed from: t0 */
    @NotNull
    public static final ValueValidator<Double> f36903t0;

    /* renamed from: t1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f36904t1;

    /* renamed from: u0 */
    @NotNull
    public static final ListValidator<DivBackground> f36905u0;

    /* renamed from: u1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f36906u1;

    /* renamed from: v0 */
    @NotNull
    public static final ListValidator<DivBackgroundTemplate> f36907v0;

    /* renamed from: v1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f36908v1;

    /* renamed from: w0 */
    @NotNull
    public static final ValueValidator<Long> f36909w0;

    /* renamed from: w1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>> f36910w1;

    /* renamed from: x0 */
    @NotNull
    public static final ValueValidator<Long> f36911x0;

    /* renamed from: x1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>> f36912x1;

    /* renamed from: y0 */
    @NotNull
    public static final ListValidator<DivDisappearAction> f36913y0;

    /* renamed from: y1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<String>> f36914y1;

    /* renamed from: z0 */
    @NotNull
    public static final ListValidator<DivDisappearActionTemplate> f36915z0;

    /* renamed from: z1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f36916z1;

    /* renamed from: A */
    @JvmField
    @NotNull
    public final Field<Expression<Integer>> f36917A;

    /* renamed from: B */
    @JvmField
    @NotNull
    public final Field<Expression<Boolean>> f36918B;

    /* renamed from: C */
    @JvmField
    @NotNull
    public final Field<Expression<String>> f36919C;

    /* renamed from: D */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f36920D;

    /* renamed from: E */
    @JvmField
    @NotNull
    public final Field<Expression<DivImageScale>> f36921E;

    /* renamed from: F */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f36922F;

    /* renamed from: G */
    @JvmField
    @NotNull
    public final Field<Expression<Integer>> f36923G;

    /* renamed from: H */
    @JvmField
    @NotNull
    public final Field<Expression<DivBlendMode>> f36924H;

    /* renamed from: I */
    @JvmField
    @NotNull
    public final Field<List<DivTooltipTemplate>> f36925I;

    /* renamed from: J */
    @JvmField
    @NotNull
    public final Field<DivTransformTemplate> f36926J;

    /* renamed from: K */
    @JvmField
    @NotNull
    public final Field<DivChangeTransitionTemplate> f36927K;

    /* renamed from: L */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f36928L;

    /* renamed from: M */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f36929M;

    /* renamed from: N */
    @JvmField
    @NotNull
    public final Field<List<DivTransitionTrigger>> f36930N;

    /* renamed from: O */
    @JvmField
    @NotNull
    public final Field<Expression<DivVisibility>> f36931O;

    /* renamed from: P */
    @JvmField
    @NotNull
    public final Field<DivVisibilityActionTemplate> f36932P;

    /* renamed from: Q */
    @JvmField
    @NotNull
    public final Field<List<DivVisibilityActionTemplate>> f36933Q;

    /* renamed from: R */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f36934R;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<DivAccessibilityTemplate> f36935a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<DivActionTemplate> f36936b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<DivAnimationTemplate> f36937c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f36938d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f36939e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f36940f;

    /* renamed from: g */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f36941g;

    /* renamed from: h */
    @JvmField
    @NotNull
    public final Field<DivFadeTransitionTemplate> f36942h;

    /* renamed from: i */
    @JvmField
    @NotNull
    public final Field<DivAspectTemplate> f36943i;

    /* renamed from: j */
    @JvmField
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f36944j;

    /* renamed from: k */
    @JvmField
    @NotNull
    public final Field<DivBorderTemplate> f36945k;

    /* renamed from: l */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f36946l;

    /* renamed from: m */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f36947m;

    /* renamed from: n */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f36948n;

    /* renamed from: o */
    @JvmField
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f36949o;

    /* renamed from: p */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f36950p;

    /* renamed from: q */
    @JvmField
    @NotNull
    public final Field<List<DivExtensionTemplate>> f36951q;

    /* renamed from: r */
    @JvmField
    @NotNull
    public final Field<List<DivFilterTemplate>> f36952r;

    /* renamed from: s */
    @JvmField
    @NotNull
    public final Field<DivFocusTemplate> f36953s;

    /* renamed from: t */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f36954t;

    /* renamed from: u */
    @JvmField
    @NotNull
    public final Field<Expression<Boolean>> f36955u;

    /* renamed from: v */
    @JvmField
    @NotNull
    public final Field<String> f36956v;

    /* renamed from: w */
    @JvmField
    @NotNull
    public final Field<Expression<Uri>> f36957w;

    /* renamed from: x */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f36958x;

    /* renamed from: y */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f36959y;

    /* renamed from: z */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f36960z;

    /* compiled from: DivImageTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\bR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\bR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0014R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0011R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0011R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\bR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\bR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\bR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\bR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\bR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\bR\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\bR\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\bR\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00106\u001a\b\u0012\u0004\u0012\u0002050\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0011R\u001a\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0014R\u001a\u00109\u001a\b\u0012\u0004\u0012\u0002070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0014R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\bR\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\bR\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010>R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010\u0011R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u0002050\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0011R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u0002070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010\u0014R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u0002070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010\u0014R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010\u0014R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010\u0014R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010\u0011R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010\bR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010\bR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010\u0011R\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010\bR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020O0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010\bR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020T0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010\bR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020T0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010\bR\u0014\u0010W\u001a\u0002078\u0006X\u0086T¢\u0006\u0006\n\u0004\bW\u0010XR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020 0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\"0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010[R\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020 0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010[R\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020\"0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010[R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020G0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010[R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020K0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010[R\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020a0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010[R\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020c0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010\bR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020e0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010\bR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020a0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010\u0011R\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010j¨\u0006k"}, m31884d2 = {"Lcom/yandex/div2/DivImageTemplate$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivActionTemplate;", "ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAction;", "ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivAnimation;", "ACTION_ANIMATION_DEFAULT_VALUE", "Lcom/yandex/div2/DivAnimation;", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "Lcom/yandex/div2/DivBackgroundTemplate;", "BACKGROUND_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivAlignmentHorizontal;", "CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE", "Lcom/yandex/div2/DivAlignmentVertical;", "CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE", "Lcom/yandex/div2/DivDisappearActionTemplate;", "DISAPPEAR_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "DOUBLETAP_ACTIONS_TEMPLATE_VALIDATOR", "DOUBLETAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivExtensionTemplate;", "EXTENSIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/DivFilterTemplate;", "FILTERS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivFilter;", "FILTERS_VALIDATOR", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "", "HIGH_PRIORITY_PREVIEW_SHOW_DEFAULT_VALUE", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "LONGTAP_ACTIONS_TEMPLATE_VALIDATOR", "LONGTAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "PADDINGS_DEFAULT_VALUE", "", "PLACEHOLDER_COLOR_DEFAULT_VALUE", "PRELOAD_REQUIRED_DEFAULT_VALUE", "PREVIEW_TEMPLATE_VALIDATOR", "PREVIEW_VALIDATOR", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "Lcom/yandex/div2/DivImageScale;", "SCALE_DEFAULT_VALUE", "SELECTED_ACTIONS_TEMPLATE_VALIDATOR", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivBlendMode;", "TINT_MODE_DEFAULT_VALUE", "Lcom/yandex/div2/DivTooltipTemplate;", "TOOLTIPS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_TEMPLATE_VALIDATOR", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL", "TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL", "TYPE_HELPER_SCALE", "TYPE_HELPER_TINT_MODE", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/DivVisibilityActionTemplate;", "VISIBILITY_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        Expression m17539a = companion.m17539a(100L);
        Expression m17539a2 = companion.m17539a(Double.valueOf(0.6d));
        Expression m17539a3 = companion.m17539a(DivAnimation.Name.FADE);
        Double valueOf = Double.valueOf(1.0d);
        f36851T = new DivAnimation(m17539a, m17539a2, null, null, m17539a3, null, null, companion.m17539a(valueOf), C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
        f36853U = companion.m17539a(valueOf);
        f36855V = new DivBorder(null, null, null, null, null, 31);
        f36857W = companion.m17539a(DivAlignmentHorizontal.CENTER);
        f36859X = companion.m17539a(DivAlignmentVertical.CENTER);
        f36861Y = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7));
        Boolean bool = Boolean.FALSE;
        f36863Z = companion.m17539a(bool);
        f36865a0 = new DivEdgeInsets(null, null, null, null, null, 31);
        f36867b0 = new DivEdgeInsets(null, null, null, null, null, 31);
        f36869c0 = companion.m17539a(335544320);
        f36871d0 = companion.m17539a(bool);
        f36873e0 = companion.m17539a(DivImageScale.FILL);
        f36875f0 = companion.m17539a(DivBlendMode.SOURCE_IN);
        f36877g0 = new DivTransform(null, null, null, 7);
        f36879h0 = companion.m17539a(DivVisibility.VISIBLE);
        f36881i0 = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i2 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f36883j0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivImageTemplate$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f36885k0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivImageTemplate$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f36887l0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivImageTemplate$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f36889m0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivImageTemplate$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f36891n0 = companion2.m17372a(ArraysKt.m31926B(DivImageScale.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivImageTemplate$Companion$TYPE_HELPER_SCALE$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivImageScale);
            }
        });
        f36893o0 = companion2.m17372a(ArraysKt.m31926B(DivBlendMode.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivImageTemplate$Companion$TYPE_HELPER_TINT_MODE$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivBlendMode);
            }
        });
        f36895p0 = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivImageTemplate$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f36897q0 = C3065q.f41929y;
        f36899r0 = C3069s.f42004d;
        f36901s0 = C3067r.f41966r;
        f36903t0 = C3067r.f41967s;
        f36905u0 = C3069s.f42013m;
        f36907v0 = C3069s.f42014n;
        f36909w0 = C3067r.f41968t;
        f36911x0 = C3067r.f41969u;
        f36913y0 = C3069s.f42015o;
        f36915z0 = C3069s.f42016p;
        f36817A0 = C3065q.f41930z;
        f36819B0 = C3065q.f41901A;
        f36821C0 = C3065q.f41902B;
        f36823D0 = C3065q.f41903C;
        f36825E0 = C3065q.f41904D;
        f36827F0 = C3065q.f41905E;
        f36829G0 = C3067r.f41960l;
        f36831H0 = C3067r.f41961m;
        f36833I0 = C3069s.f42002b;
        f36835J0 = C3069s.f42003c;
        f36837K0 = C3067r.f41962n;
        f36839L0 = C3067r.f41963o;
        f36841M0 = C3067r.f41964p;
        f36843N0 = C3067r.f41965q;
        f36845O0 = C3069s.f42005e;
        f36846P0 = C3069s.f42006f;
        f36847Q0 = C3069s.f42007g;
        f36848R0 = C3069s.f42008h;
        f36850S0 = C3069s.f42009i;
        f36852T0 = C3069s.f42010j;
        f36854U0 = C3069s.f42011k;
        f36856V0 = C3069s.f42012l;
        f36858W0 = new Function3<String, JSONObject, ParsingEnvironment, DivAccessibility>() { // from class: com.yandex.div2.DivImageTemplate$Companion$ACCESSIBILITY_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAccessibility mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAccessibility.Companion companion3 = DivAccessibility.f34479f;
                DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject2, str2, DivAccessibility.f34486m, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divAccessibility == null ? DivImageTemplate.f36849S : divAccessibility;
            }
        };
        f36860X0 = new Function3<String, JSONObject, ParsingEnvironment, DivAction>() { // from class: com.yandex.div2.DivImageTemplate$Companion$ACTION_READER$1
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
        f36862Y0 = new Function3<String, JSONObject, ParsingEnvironment, DivAnimation>() { // from class: com.yandex.div2.DivImageTemplate$Companion$ACTION_ANIMATION_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAnimation mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAnimation.Companion companion3 = DivAnimation.f34634h;
                DivAnimation divAnimation = (DivAnimation) JsonParser.m17322n(jSONObject2, str2, DivAnimation.f34644r, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divAnimation == null ? DivImageTemplate.f36851T : divAnimation;
            }
        };
        f36864Z0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivImageTemplate$Companion$ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivImageTemplate.f36897q0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36866a1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>>() { // from class: com.yandex.div2.DivImageTemplate$Companion$ALIGNMENT_HORIZONTAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentHorizontal> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentHorizontal.f34618d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivImageTemplate.f36883j0);
            }
        };
        f36868b1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>>() { // from class: com.yandex.div2.DivImageTemplate$Companion$ALIGNMENT_VERTICAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentVertical> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentVertical.Converter converter = DivAlignmentVertical.f34625c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentVertical.f34626d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivImageTemplate.f36885k0);
            }
        };
        f36870c1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivImageTemplate$Companion$ALPHA_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
                ValueValidator<Double> valueValidator = DivImageTemplate.f36903t0;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Double> expression = DivImageTemplate.f36853U;
                Expression<Double> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
                return m17328t == null ? expression : m17328t;
            }
        };
        f36872d1 = new Function3<String, JSONObject, ParsingEnvironment, DivFadeTransition>() { // from class: com.yandex.div2.DivImageTemplate$Companion$APPEARANCE_ANIMATION_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivFadeTransition mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivFadeTransition.Companion companion3 = DivFadeTransition.f35673e;
                return (DivFadeTransition) JsonParser.m17322n(jSONObject2, str2, DivFadeTransition.f35682n, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36874e1 = new Function3<String, JSONObject, ParsingEnvironment, DivAspect>() { // from class: com.yandex.div2.DivImageTemplate$Companion$ASPECT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAspect mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAspect.Companion companion3 = DivAspect.f34740b;
                return (DivAspect) JsonParser.m17322n(jSONObject2, str2, DivAspect.f34741c, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36876f1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>>() { // from class: com.yandex.div2.DivImageTemplate$Companion$BACKGROUND_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivBackground> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBackground.Companion companion3 = DivBackground.f34750a;
                return JsonParser.m17333y(jSONObject2, str2, DivBackground.f34751b, DivImageTemplate.f36905u0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36878g1 = new Function3<String, JSONObject, ParsingEnvironment, DivBorder>() { // from class: com.yandex.div2.DivImageTemplate$Companion$BORDER_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivBorder mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBorder.Companion companion3 = DivBorder.f34785f;
                DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject2, str2, DivBorder.f34788i, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divBorder == null ? DivImageTemplate.f36855V : divBorder;
            }
        };
        f36880h1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivImageTemplate$Companion$COLUMN_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivImageTemplate.f36911x0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f36882i1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>>() { // from class: com.yandex.div2.DivImageTemplate$Companion$CONTENT_ALIGNMENT_HORIZONTAL_READER$1
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
                Expression<DivAlignmentHorizontal> expression = DivImageTemplate.f36857W;
                Expression<DivAlignmentHorizontal> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivImageTemplate.f36887l0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f36884j1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>>() { // from class: com.yandex.div2.DivImageTemplate$Companion$CONTENT_ALIGNMENT_VERTICAL_READER$1
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
                Expression<DivAlignmentVertical> expression = DivImageTemplate.f36859X;
                Expression<DivAlignmentVertical> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivImageTemplate.f36889m0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f36886k1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>>() { // from class: com.yandex.div2.DivImageTemplate$Companion$DISAPPEAR_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivDisappearAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivDisappearAction.Companion companion3 = DivDisappearAction.f35537a;
                return JsonParser.m17333y(jSONObject2, str2, DivDisappearAction.f35545i, DivImageTemplate.f36913y0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36888l1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivImageTemplate$Companion$DOUBLETAP_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivImageTemplate.f36817A0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36890m1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>>() { // from class: com.yandex.div2.DivImageTemplate$Companion$EXTENSIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivExtension> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivExtension.Companion companion3 = DivExtension.f35659c;
                return JsonParser.m17333y(jSONObject2, str2, DivExtension.f35660d, DivImageTemplate.f36821C0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36892n1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivFilter>>() { // from class: com.yandex.div2.DivImageTemplate$Companion$FILTERS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivFilter> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivFilter.Companion companion3 = DivFilter.f35717a;
                return JsonParser.m17333y(jSONObject2, str2, DivFilter.f35718b, DivImageTemplate.f36825E0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36894o1 = new Function3<String, JSONObject, ParsingEnvironment, DivFocus>() { // from class: com.yandex.div2.DivImageTemplate$Companion$FOCUS_READER$1
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
        f36896p1 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivImageTemplate$Companion$HEIGHT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivImageTemplate.f36861Y : divSize;
            }
        };
        f36898q1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>>() { // from class: com.yandex.div2.DivImageTemplate$Companion$HIGH_PRIORITY_PREVIEW_SHOW_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Boolean> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Object, Boolean> function1 = ParsingConvertersKt.f33829c;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Boolean> expression = DivImageTemplate.f36863Z;
                Expression<Boolean> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33848a);
                return m17330v == null ? expression : m17330v;
            }
        };
        f36900r1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivImageTemplate$Companion$ID_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return (String) JsonParser.m17323o(jSONObject2, str2, DivImageTemplate.f36831H0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36902s1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Uri>>() { // from class: com.yandex.div2.DivImageTemplate$Companion$IMAGE_URL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Uri> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17317i(jSONObject2, str2, ParsingConvertersKt.f33828b, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33852e);
            }
        };
        f36904t1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivImageTemplate$Companion$LONGTAP_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivImageTemplate.f36833I0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36906u1 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivImageTemplate$Companion$MARGINS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivImageTemplate.f36865a0 : divEdgeInsets;
            }
        };
        f36908v1 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivImageTemplate$Companion$PADDINGS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivImageTemplate.f36867b0 : divEdgeInsets;
            }
        };
        f36910w1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>>() { // from class: com.yandex.div2.DivImageTemplate$Companion$PLACEHOLDER_COLOR_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Integer> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Object, Integer> function1 = ParsingConvertersKt.f33827a;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Integer> expression = DivImageTemplate.f36869c0;
                Expression<Integer> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33853f);
                return m17330v == null ? expression : m17330v;
            }
        };
        f36912x1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>>() { // from class: com.yandex.div2.DivImageTemplate$Companion$PRELOAD_REQUIRED_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Boolean> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Object, Boolean> function1 = ParsingConvertersKt.f33829c;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Boolean> expression = DivImageTemplate.f36871d0;
                Expression<Boolean> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33848a);
                return m17330v == null ? expression : m17330v;
            }
        };
        f36914y1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<String>>() { // from class: com.yandex.div2.DivImageTemplate$Companion$PREVIEW_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<String> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17325q(jSONObject2, str2, DivImageTemplate.f36839L0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33850c);
            }
        };
        f36916z1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivImageTemplate$Companion$ROW_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivImageTemplate.f36843N0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f36818A1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivImageScale>>() { // from class: com.yandex.div2.DivImageTemplate$Companion$SCALE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivImageScale> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivImageScale.Converter converter = DivImageScale.f36808c;
                Function1<String, DivImageScale> function1 = DivImageScale.f36809d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivImageScale> expression = DivImageTemplate.f36873e0;
                Expression<DivImageScale> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivImageTemplate.f36891n0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f36820B1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivImageTemplate$Companion$SELECTED_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivImageTemplate.f36845O0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36822C1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>>() { // from class: com.yandex.div2.DivImageTemplate$Companion$TINT_COLOR_READER$1
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
        f36824D1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivBlendMode>>() { // from class: com.yandex.div2.DivImageTemplate$Companion$TINT_MODE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivBlendMode> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBlendMode.Converter converter = DivBlendMode.f34766c;
                Function1<String, DivBlendMode> function1 = DivBlendMode.f34767d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivBlendMode> expression = DivImageTemplate.f36875f0;
                Expression<DivBlendMode> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivImageTemplate.f36893o0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f36826E1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>>() { // from class: com.yandex.div2.DivImageTemplate$Companion$TOOLTIPS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTooltip> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTooltip.Companion companion3 = DivTooltip.f40492h;
                return JsonParser.m17333y(jSONObject2, str2, DivTooltip.f40497m, DivImageTemplate.f36847Q0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36828F1 = new Function3<String, JSONObject, ParsingEnvironment, DivTransform>() { // from class: com.yandex.div2.DivImageTemplate$Companion$TRANSFORM_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivTransform mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransform.Companion companion3 = DivTransform.f40551d;
                DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject2, str2, DivTransform.f40554g, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divTransform == null ? DivImageTemplate.f36877g0 : divTransform;
            }
        };
        f36830G1 = new Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition>() { // from class: com.yandex.div2.DivImageTemplate$Companion$TRANSITION_CHANGE_READER$1
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
        f36832H1 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivImageTemplate$Companion$TRANSITION_IN_READER$1
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
        f36834I1 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivImageTemplate$Companion$TRANSITION_OUT_READER$1
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
        f36836J1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>>() { // from class: com.yandex.div2.DivImageTemplate$Companion$TRANSITION_TRIGGERS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTransitionTrigger> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransitionTrigger.Converter converter = DivTransitionTrigger.f40582c;
                return JsonParser.m17332x(jSONObject2, str2, DivTransitionTrigger.f40583d, DivImageTemplate.f36850S0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        DivImageTemplate$Companion$TYPE_READER$1 divImageTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivImageTemplate$Companion$TYPE_READER$1
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
        f36838K1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>>() { // from class: com.yandex.div2.DivImageTemplate$Companion$VISIBILITY_READER$1
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
                Expression<DivVisibility> expression = DivImageTemplate.f36879h0;
                Expression<DivVisibility> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivImageTemplate.f36895p0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f36840L1 = new Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction>() { // from class: com.yandex.div2.DivImageTemplate$Companion$VISIBILITY_ACTION_READER$1
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
        f36842M1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>>() { // from class: com.yandex.div2.DivImageTemplate$Companion$VISIBILITY_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivVisibilityAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivVisibilityAction.Companion companion3 = DivVisibilityAction.f40938i;
                return JsonParser.m17333y(jSONObject2, str2, DivVisibilityAction.f40946q, DivImageTemplate.f36854U0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36844N1 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivImageTemplate$Companion$WIDTH_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivImageTemplate.f36881i0 : divSize;
            }
        };
        DivImageTemplate$Companion$CREATOR$1 divImageTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivImageTemplate>() { // from class: com.yandex.div2.DivImageTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivImageTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivImageTemplate(env, null, false, it);
            }
        };
    }

    public DivImageTemplate(@NotNull ParsingEnvironment env, @Nullable DivImageTemplate divImageTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        Field<DivAccessibilityTemplate> field = divImageTemplate == null ? null : divImageTemplate.f36935a;
        DivAccessibilityTemplate.Companion companion = DivAccessibilityTemplate.f34515g;
        this.f36935a = JsonTemplateParser.m17354o(json, "accessibility", z, field, DivAccessibilityTemplate.f34531w, f34328a, env);
        Field<DivActionTemplate> field2 = divImageTemplate == null ? null : divImageTemplate.f36936b;
        DivActionTemplate.Companion companion2 = DivActionTemplate.f34572i;
        Function2<ParsingEnvironment, JSONObject, DivActionTemplate> function2 = DivActionTemplate.f34586w;
        this.f36936b = JsonTemplateParser.m17354o(json, "action", z, field2, function2, f34328a, env);
        Field<DivAnimationTemplate> field3 = divImageTemplate == null ? null : divImageTemplate.f36937c;
        DivAnimationTemplate.Companion companion3 = DivAnimationTemplate.f34681i;
        this.f36937c = JsonTemplateParser.m17354o(json, "action_animation", z, field3, DivAnimationTemplate.f34680D, f34328a, env);
        this.f36938d = JsonTemplateParser.m17360u(json, "actions", z, divImageTemplate == null ? null : divImageTemplate.f36938d, function2, f36899r0, f34328a, env);
        Field<Expression<DivAlignmentHorizontal>> field4 = divImageTemplate == null ? null : divImageTemplate.f36939e;
        DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
        Function1<String, DivAlignmentHorizontal> function1 = DivAlignmentHorizontal.f34618d;
        this.f36939e = JsonTemplateParser.m17358s(json, "alignment_horizontal", z, field4, function1, f34328a, env, f36883j0);
        Field<Expression<DivAlignmentVertical>> field5 = divImageTemplate == null ? null : divImageTemplate.f36940f;
        DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
        Function1<String, DivAlignmentVertical> function12 = DivAlignmentVertical.f34626d;
        this.f36940f = JsonTemplateParser.m17358s(json, "alignment_vertical", z, field5, function12, f34328a, env, f36885k0);
        this.f36941g = JsonTemplateParser.m17357r(json, "alpha", z, divImageTemplate == null ? null : divImageTemplate.f36941g, ParsingConvertersKt.f33830d, f36901s0, f34328a, env, TypeHelpersKt.f33851d);
        Field<DivFadeTransitionTemplate> field6 = divImageTemplate == null ? null : divImageTemplate.f36942h;
        DivFadeTransitionTemplate.Companion companion4 = DivFadeTransitionTemplate.f35689e;
        this.f36942h = JsonTemplateParser.m17354o(json, "appearance_animation", z, field6, DivFadeTransitionTemplate.f35705u, f34328a, env);
        Field<DivAspectTemplate> field7 = divImageTemplate == null ? null : divImageTemplate.f36943i;
        DivAspectTemplate.Companion companion5 = DivAspectTemplate.f34744b;
        this.f36943i = JsonTemplateParser.m17354o(json, "aspect", z, field7, DivAspectTemplate.f34746d, f34328a, env);
        Field<List<DivBackgroundTemplate>> field8 = divImageTemplate == null ? null : divImageTemplate.f36944j;
        DivBackgroundTemplate.Companion companion6 = DivBackgroundTemplate.f34758a;
        this.f36944j = JsonTemplateParser.m17360u(json, "background", z, field8, DivBackgroundTemplate.f34759b, f36907v0, f34328a, env);
        Field<DivBorderTemplate> field9 = divImageTemplate == null ? null : divImageTemplate.f36945k;
        DivBorderTemplate.Companion companion7 = DivBorderTemplate.f34795f;
        this.f36945k = JsonTemplateParser.m17354o(json, "border", z, field9, DivBorderTemplate.f34804o, f34328a, env);
        Field<Expression<Long>> field10 = divImageTemplate == null ? null : divImageTemplate.f36946l;
        Function1<Number, Long> function13 = ParsingConvertersKt.f33831e;
        ValueValidator<Long> valueValidator = f36909w0;
        TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
        this.f36946l = JsonTemplateParser.m17357r(json, "column_span", z, field10, function13, valueValidator, f34328a, env, typeHelper);
        this.f36947m = JsonTemplateParser.m17358s(json, "content_alignment_horizontal", z, divImageTemplate == null ? null : divImageTemplate.f36947m, function1, f34328a, env, f36887l0);
        this.f36948n = JsonTemplateParser.m17358s(json, "content_alignment_vertical", z, divImageTemplate == null ? null : divImageTemplate.f36948n, function12, f34328a, env, f36889m0);
        Field<List<DivDisappearActionTemplate>> field11 = divImageTemplate == null ? null : divImageTemplate.f36949o;
        DivDisappearActionTemplate.Companion companion8 = DivDisappearActionTemplate.f35550i;
        this.f36949o = JsonTemplateParser.m17360u(json, "disappear_actions", z, field11, DivDisappearActionTemplate.f35549C, f36915z0, f34328a, env);
        this.f36950p = JsonTemplateParser.m17360u(json, "doubletap_actions", z, divImageTemplate == null ? null : divImageTemplate.f36950p, function2, f36819B0, f34328a, env);
        Field<List<DivExtensionTemplate>> field12 = divImageTemplate == null ? null : divImageTemplate.f36951q;
        DivExtensionTemplate.Companion companion9 = DivExtensionTemplate.f35664c;
        this.f36951q = JsonTemplateParser.m17360u(json, "extensions", z, field12, DivExtensionTemplate.f35667f, f36823D0, f34328a, env);
        Field<List<DivFilterTemplate>> field13 = divImageTemplate == null ? null : divImageTemplate.f36952r;
        DivFilterTemplate.Companion companion10 = DivFilterTemplate.f35721a;
        this.f36952r = JsonTemplateParser.m17360u(json, "filters", z, field13, DivFilterTemplate.f35722b, f36827F0, f34328a, env);
        Field<DivFocusTemplate> field14 = divImageTemplate == null ? null : divImageTemplate.f36953s;
        DivFocusTemplate.Companion companion11 = DivFocusTemplate.f35833f;
        this.f36953s = JsonTemplateParser.m17354o(json, "focus", z, field14, DivFocusTemplate.f35846s, f34328a, env);
        Field<DivSizeTemplate> field15 = divImageTemplate == null ? null : divImageTemplate.f36954t;
        DivSizeTemplate.Companion companion12 = DivSizeTemplate.f38839a;
        Function2<ParsingEnvironment, JSONObject, DivSizeTemplate> function22 = DivSizeTemplate.f38840b;
        this.f36954t = JsonTemplateParser.m17354o(json, "height", z, field15, function22, f34328a, env);
        Field<Expression<Boolean>> field16 = divImageTemplate == null ? null : divImageTemplate.f36955u;
        Function1<Object, Boolean> function14 = ParsingConvertersKt.f33829c;
        TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.f33848a;
        this.f36955u = JsonTemplateParser.m17358s(json, "high_priority_preview_show", z, field16, function14, f34328a, env, typeHelper2);
        this.f36956v = JsonTemplateParser.m17351l(json, "id", z, divImageTemplate == null ? null : divImageTemplate.f36956v, f36829G0, f34328a, env);
        this.f36957w = JsonTemplateParser.m17349j(json, "image_url", z, divImageTemplate == null ? null : divImageTemplate.f36957w, ParsingConvertersKt.f33828b, f34328a, env, TypeHelpersKt.f33852e);
        this.f36958x = JsonTemplateParser.m17360u(json, "longtap_actions", z, divImageTemplate == null ? null : divImageTemplate.f36958x, function2, f36835J0, f34328a, env);
        Field<DivEdgeInsetsTemplate> field17 = divImageTemplate == null ? null : divImageTemplate.f36959y;
        DivEdgeInsetsTemplate.Companion companion13 = DivEdgeInsetsTemplate.f35626f;
        Function2<ParsingEnvironment, JSONObject, DivEdgeInsetsTemplate> function23 = DivEdgeInsetsTemplate.f35646z;
        this.f36959y = JsonTemplateParser.m17354o(json, "margins", z, field17, function23, f34328a, env);
        this.f36960z = JsonTemplateParser.m17354o(json, "paddings", z, divImageTemplate == null ? null : divImageTemplate.f36960z, function23, f34328a, env);
        Field<Expression<Integer>> field18 = divImageTemplate == null ? null : divImageTemplate.f36917A;
        Function1<Object, Integer> function15 = ParsingConvertersKt.f33827a;
        TypeHelper<Integer> typeHelper3 = TypeHelpersKt.f33853f;
        this.f36917A = JsonTemplateParser.m17358s(json, "placeholder_color", z, field18, function15, f34328a, env, typeHelper3);
        this.f36918B = JsonTemplateParser.m17358s(json, "preload_required", z, divImageTemplate == null ? null : divImageTemplate.f36918B, function14, f34328a, env, typeHelper2);
        this.f36919C = JsonTemplateParser.m17355p(json, "preview", z, divImageTemplate == null ? null : divImageTemplate.f36919C, f36837K0, f34328a, env, TypeHelpersKt.f33850c);
        this.f36920D = JsonTemplateParser.m17357r(json, "row_span", z, divImageTemplate == null ? null : divImageTemplate.f36920D, function13, f36841M0, f34328a, env, typeHelper);
        Field<Expression<DivImageScale>> field19 = divImageTemplate == null ? null : divImageTemplate.f36921E;
        DivImageScale.Converter converter3 = DivImageScale.f36808c;
        this.f36921E = JsonTemplateParser.m17358s(json, "scale", z, field19, DivImageScale.f36809d, f34328a, env, f36891n0);
        this.f36922F = JsonTemplateParser.m17360u(json, "selected_actions", z, divImageTemplate == null ? null : divImageTemplate.f36922F, function2, f36846P0, f34328a, env);
        this.f36923G = JsonTemplateParser.m17358s(json, "tint_color", z, divImageTemplate == null ? null : divImageTemplate.f36923G, function15, f34328a, env, typeHelper3);
        Field<Expression<DivBlendMode>> field20 = divImageTemplate == null ? null : divImageTemplate.f36924H;
        DivBlendMode.Converter converter4 = DivBlendMode.f34766c;
        this.f36924H = JsonTemplateParser.m17358s(json, "tint_mode", z, field20, DivBlendMode.f34767d, f34328a, env, f36893o0);
        Field<List<DivTooltipTemplate>> field21 = divImageTemplate == null ? null : divImageTemplate.f36925I;
        DivTooltipTemplate.Companion companion14 = DivTooltipTemplate.f40520h;
        this.f36925I = JsonTemplateParser.m17360u(json, "tooltips", z, field21, DivTooltipTemplate.f40534v, f36848R0, f34328a, env);
        Field<DivTransformTemplate> field22 = divImageTemplate == null ? null : divImageTemplate.f36926J;
        DivTransformTemplate.Companion companion15 = DivTransformTemplate.f40559d;
        this.f36926J = JsonTemplateParser.m17354o(json, "transform", z, field22, DivTransformTemplate.f40565j, f34328a, env);
        Field<DivChangeTransitionTemplate> field23 = divImageTemplate == null ? null : divImageTemplate.f36927K;
        DivChangeTransitionTemplate.Companion companion16 = DivChangeTransitionTemplate.f34861a;
        this.f36927K = JsonTemplateParser.m17354o(json, "transition_change", z, field23, DivChangeTransitionTemplate.f34862b, f34328a, env);
        Field<DivAppearanceTransitionTemplate> field24 = divImageTemplate == null ? null : divImageTemplate.f36928L;
        DivAppearanceTransitionTemplate.Companion companion17 = DivAppearanceTransitionTemplate.f34733a;
        Function2<ParsingEnvironment, JSONObject, DivAppearanceTransitionTemplate> function24 = DivAppearanceTransitionTemplate.f34734b;
        this.f36928L = JsonTemplateParser.m17354o(json, "transition_in", z, field24, function24, f34328a, env);
        this.f36929M = JsonTemplateParser.m17354o(json, "transition_out", z, divImageTemplate == null ? null : divImageTemplate.f36929M, function24, f34328a, env);
        Field<List<DivTransitionTrigger>> field25 = divImageTemplate == null ? null : divImageTemplate.f36930N;
        DivTransitionTrigger.Converter converter5 = DivTransitionTrigger.f40582c;
        this.f36930N = JsonTemplateParser.m17359t(json, "transition_triggers", z, field25, DivTransitionTrigger.f40583d, f36852T0, f34328a, env);
        Field<Expression<DivVisibility>> field26 = divImageTemplate == null ? null : divImageTemplate.f36931O;
        DivVisibility.Converter converter6 = DivVisibility.f40930c;
        this.f36931O = JsonTemplateParser.m17358s(json, "visibility", z, field26, DivVisibility.f40931d, f34328a, env, f36895p0);
        Field<DivVisibilityActionTemplate> field27 = divImageTemplate == null ? null : divImageTemplate.f36932P;
        DivVisibilityActionTemplate.Companion companion18 = DivVisibilityActionTemplate.f40959i;
        Function2<ParsingEnvironment, JSONObject, DivVisibilityActionTemplate> function25 = DivVisibilityActionTemplate.f40958C;
        this.f36932P = JsonTemplateParser.m17354o(json, "visibility_action", z, field27, function25, f34328a, env);
        this.f36933Q = JsonTemplateParser.m17360u(json, "visibility_actions", z, divImageTemplate == null ? null : divImageTemplate.f36933Q, function25, f36856V0, f34328a, env);
        this.f36934R = JsonTemplateParser.m17354o(json, "width", z, divImageTemplate == null ? null : divImageTemplate.f36934R, function22, f34328a, env);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivImage mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        DivAccessibility divAccessibility = (DivAccessibility) FieldKt.m17381g(this.f36935a, env, "accessibility", data, f36858W0);
        if (divAccessibility == null) {
            divAccessibility = f36849S;
        }
        DivAccessibility divAccessibility2 = divAccessibility;
        DivAction divAction = (DivAction) FieldKt.m17381g(this.f36936b, env, "action", data, f36860X0);
        DivAnimation divAnimation = (DivAnimation) FieldKt.m17381g(this.f36937c, env, "action_animation", data, f36862Y0);
        if (divAnimation == null) {
            divAnimation = f36851T;
        }
        DivAnimation divAnimation2 = divAnimation;
        List m17382h = FieldKt.m17382h(this.f36938d, env, "actions", data, f36897q0, f36864Z0);
        Expression expression = (Expression) FieldKt.m17378d(this.f36939e, env, "alignment_horizontal", data, f36866a1);
        Expression expression2 = (Expression) FieldKt.m17378d(this.f36940f, env, "alignment_vertical", data, f36868b1);
        Expression<Double> expression3 = (Expression) FieldKt.m17378d(this.f36941g, env, "alpha", data, f36870c1);
        if (expression3 == null) {
            expression3 = f36853U;
        }
        Expression<Double> expression4 = expression3;
        DivFadeTransition divFadeTransition = (DivFadeTransition) FieldKt.m17381g(this.f36942h, env, "appearance_animation", data, f36872d1);
        DivAspect divAspect = (DivAspect) FieldKt.m17381g(this.f36943i, env, "aspect", data, f36874e1);
        List m17382h2 = FieldKt.m17382h(this.f36944j, env, "background", data, f36905u0, f36876f1);
        DivBorder divBorder = (DivBorder) FieldKt.m17381g(this.f36945k, env, "border", data, f36878g1);
        if (divBorder == null) {
            divBorder = f36855V;
        }
        DivBorder divBorder2 = divBorder;
        Expression expression5 = (Expression) FieldKt.m17378d(this.f36946l, env, "column_span", data, f36880h1);
        Expression<DivAlignmentHorizontal> expression6 = (Expression) FieldKt.m17378d(this.f36947m, env, "content_alignment_horizontal", data, f36882i1);
        if (expression6 == null) {
            expression6 = f36857W;
        }
        Expression<DivAlignmentHorizontal> expression7 = expression6;
        Expression<DivAlignmentVertical> expression8 = (Expression) FieldKt.m17378d(this.f36948n, env, "content_alignment_vertical", data, f36884j1);
        if (expression8 == null) {
            expression8 = f36859X;
        }
        Expression<DivAlignmentVertical> expression9 = expression8;
        List m17382h3 = FieldKt.m17382h(this.f36949o, env, "disappear_actions", data, f36913y0, f36886k1);
        List m17382h4 = FieldKt.m17382h(this.f36950p, env, "doubletap_actions", data, f36817A0, f36888l1);
        List m17382h5 = FieldKt.m17382h(this.f36951q, env, "extensions", data, f36821C0, f36890m1);
        List m17382h6 = FieldKt.m17382h(this.f36952r, env, "filters", data, f36825E0, f36892n1);
        DivFocus divFocus = (DivFocus) FieldKt.m17381g(this.f36953s, env, "focus", data, f36894o1);
        DivSize divSize = (DivSize) FieldKt.m17381g(this.f36954t, env, "height", data, f36896p1);
        if (divSize == null) {
            divSize = f36861Y;
        }
        DivSize divSize2 = divSize;
        Expression<Boolean> expression10 = (Expression) FieldKt.m17378d(this.f36955u, env, "high_priority_preview_show", data, f36898q1);
        if (expression10 == null) {
            expression10 = f36863Z;
        }
        Expression<Boolean> expression11 = expression10;
        String str = (String) FieldKt.m17378d(this.f36956v, env, "id", data, f36900r1);
        Expression expression12 = (Expression) FieldKt.m17376b(this.f36957w, env, "image_url", data, f36902s1);
        List m17382h7 = FieldKt.m17382h(this.f36958x, env, "longtap_actions", data, f36833I0, f36904t1);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) FieldKt.m17381g(this.f36959y, env, "margins", data, f36906u1);
        if (divEdgeInsets == null) {
            divEdgeInsets = f36865a0;
        }
        DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
        DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) FieldKt.m17381g(this.f36960z, env, "paddings", data, f36908v1);
        if (divEdgeInsets3 == null) {
            divEdgeInsets3 = f36867b0;
        }
        DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
        Expression<Integer> expression13 = (Expression) FieldKt.m17378d(this.f36917A, env, "placeholder_color", data, f36910w1);
        if (expression13 == null) {
            expression13 = f36869c0;
        }
        Expression<Integer> expression14 = expression13;
        Expression<Boolean> expression15 = (Expression) FieldKt.m17378d(this.f36918B, env, "preload_required", data, f36912x1);
        if (expression15 == null) {
            expression15 = f36871d0;
        }
        Expression<Boolean> expression16 = expression15;
        Expression expression17 = (Expression) FieldKt.m17378d(this.f36919C, env, "preview", data, f36914y1);
        Expression expression18 = (Expression) FieldKt.m17378d(this.f36920D, env, "row_span", data, f36916z1);
        Expression<DivImageScale> expression19 = (Expression) FieldKt.m17378d(this.f36921E, env, "scale", data, f36818A1);
        if (expression19 == null) {
            expression19 = f36873e0;
        }
        Expression<DivImageScale> expression20 = expression19;
        List m17382h8 = FieldKt.m17382h(this.f36922F, env, "selected_actions", data, f36845O0, f36820B1);
        Expression expression21 = (Expression) FieldKt.m17378d(this.f36923G, env, "tint_color", data, f36822C1);
        Expression<DivBlendMode> expression22 = (Expression) FieldKt.m17378d(this.f36924H, env, "tint_mode", data, f36824D1);
        if (expression22 == null) {
            expression22 = f36875f0;
        }
        Expression<DivBlendMode> expression23 = expression22;
        List m17382h9 = FieldKt.m17382h(this.f36925I, env, "tooltips", data, f36847Q0, f36826E1);
        DivTransform divTransform = (DivTransform) FieldKt.m17381g(this.f36926J, env, "transform", data, f36828F1);
        if (divTransform == null) {
            divTransform = f36877g0;
        }
        DivTransform divTransform2 = divTransform;
        DivChangeTransition divChangeTransition = (DivChangeTransition) FieldKt.m17381g(this.f36927K, env, "transition_change", data, f36830G1);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) FieldKt.m17381g(this.f36928L, env, "transition_in", data, f36832H1);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) FieldKt.m17381g(this.f36929M, env, "transition_out", data, f36834I1);
        List m17380f = FieldKt.m17380f(this.f36930N, env, "transition_triggers", data, f36850S0, f36836J1);
        Expression<DivVisibility> expression24 = (Expression) FieldKt.m17378d(this.f36931O, env, "visibility", data, f36838K1);
        if (expression24 == null) {
            expression24 = f36879h0;
        }
        Expression<DivVisibility> expression25 = expression24;
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) FieldKt.m17381g(this.f36932P, env, "visibility_action", data, f36840L1);
        List m17382h10 = FieldKt.m17382h(this.f36933Q, env, "visibility_actions", data, f36854U0, f36842M1);
        DivSize divSize3 = (DivSize) FieldKt.m17381g(this.f36934R, env, "width", data, f36844N1);
        if (divSize3 == null) {
            divSize3 = f36881i0;
        }
        return new DivImage(divAccessibility2, divAction, divAnimation2, m17382h, expression, expression2, expression4, divFadeTransition, divAspect, m17382h2, divBorder2, expression5, expression7, expression9, m17382h3, m17382h4, m17382h5, m17382h6, divFocus, divSize2, expression11, str, expression12, m17382h7, divEdgeInsets2, divEdgeInsets4, expression14, expression16, expression17, expression18, expression20, m17382h8, expression21, expression23, m17382h9, divTransform2, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17380f, expression25, divVisibilityAction, m17382h10, divSize3);
    }
}
