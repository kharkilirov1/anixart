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

/* compiled from: DivGifImageTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivGifImageTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivGifImage;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivGifImageTemplate implements JSONSerializable, JsonTemplate<DivGifImage> {

    /* renamed from: A0 */
    @NotNull
    public static final ValueValidator<String> f36243A0;

    /* renamed from: B0 */
    @NotNull
    public static final ValueValidator<String> f36244B0;

    /* renamed from: C0 */
    @NotNull
    public static final ValueValidator<Long> f36245C0;

    /* renamed from: D0 */
    @NotNull
    public static final ValueValidator<Long> f36246D0;

    /* renamed from: E0 */
    @NotNull
    public static final ListValidator<DivAction> f36247E0;

    /* renamed from: F0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f36248F0;

    /* renamed from: G0 */
    @NotNull
    public static final ListValidator<DivTooltip> f36249G0;

    /* renamed from: H0 */
    @NotNull
    public static final ListValidator<DivTooltipTemplate> f36250H0;

    /* renamed from: I0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f36251I0;

    /* renamed from: J0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f36252J0;

    /* renamed from: K0 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f36253K0;

    /* renamed from: L0 */
    @NotNull
    public static final ListValidator<DivVisibilityActionTemplate> f36254L0;

    /* renamed from: M0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAccessibility> f36255M0;

    /* renamed from: N */
    @NotNull
    public static final DivAccessibility f36256N = new DivAccessibility(null, null, null, null, null, null, 63);

    /* renamed from: N0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAction> f36257N0;

    /* renamed from: O */
    @NotNull
    public static final DivAnimation f36258O;

    /* renamed from: O0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAnimation> f36259O0;

    /* renamed from: P */
    @NotNull
    public static final Expression<Double> f36260P;

    /* renamed from: P0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f36261P0;

    /* renamed from: Q */
    @NotNull
    public static final DivBorder f36262Q;

    /* renamed from: Q0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>> f36263Q0;

    /* renamed from: R */
    @NotNull
    public static final Expression<DivAlignmentHorizontal> f36264R;

    /* renamed from: R0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>> f36265R0;

    /* renamed from: S */
    @NotNull
    public static final Expression<DivAlignmentVertical> f36266S;

    /* renamed from: S0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f36267S0;

    /* renamed from: T */
    @NotNull
    public static final DivSize.WrapContent f36268T;

    /* renamed from: T0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAspect> f36269T0;

    /* renamed from: U */
    @NotNull
    public static final DivEdgeInsets f36270U;

    /* renamed from: U0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>> f36271U0;

    /* renamed from: V */
    @NotNull
    public static final DivEdgeInsets f36272V;

    /* renamed from: V0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivBorder> f36273V0;

    /* renamed from: W */
    @NotNull
    public static final Expression<Integer> f36274W;

    /* renamed from: W0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f36275W0;

    /* renamed from: X */
    @NotNull
    public static final Expression<Boolean> f36276X;

    /* renamed from: X0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>> f36277X0;

    /* renamed from: Y */
    @NotNull
    public static final Expression<DivImageScale> f36278Y;

    /* renamed from: Y0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>> f36279Y0;

    /* renamed from: Z */
    @NotNull
    public static final DivTransform f36280Z;

    /* renamed from: Z0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>> f36281Z0;

    /* renamed from: a0 */
    @NotNull
    public static final Expression<DivVisibility> f36282a0;

    /* renamed from: a1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f36283a1;

    /* renamed from: b0 */
    @NotNull
    public static final DivSize.MatchParent f36284b0;

    /* renamed from: b1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>> f36285b1;

    /* renamed from: c0 */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f36286c0;

    /* renamed from: c1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivFocus> f36287c1;

    /* renamed from: d0 */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f36288d0;

    /* renamed from: d1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Uri>> f36289d1;

    /* renamed from: e0 */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f36290e0;

    /* renamed from: e1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f36291e1;

    /* renamed from: f0 */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f36292f0;

    /* renamed from: f1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f36293f1;

    /* renamed from: g0 */
    @NotNull
    public static final TypeHelper<DivImageScale> f36294g0;

    /* renamed from: g1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f36295g1;

    /* renamed from: h0 */
    @NotNull
    public static final TypeHelper<DivVisibility> f36296h0;

    /* renamed from: h1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f36297h1;

    /* renamed from: i0 */
    @NotNull
    public static final ListValidator<DivAction> f36298i0;

    /* renamed from: i1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f36299i1;

    /* renamed from: j0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f36300j0;

    /* renamed from: j1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>> f36301j1;

    /* renamed from: k0 */
    @NotNull
    public static final ValueValidator<Double> f36302k0;

    /* renamed from: k1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>> f36303k1;

    /* renamed from: l0 */
    @NotNull
    public static final ValueValidator<Double> f36304l0;

    /* renamed from: l1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<String>> f36305l1;

    /* renamed from: m0 */
    @NotNull
    public static final ListValidator<DivBackground> f36306m0;

    /* renamed from: m1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f36307m1;

    /* renamed from: n0 */
    @NotNull
    public static final ListValidator<DivBackgroundTemplate> f36308n0;

    /* renamed from: n1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivImageScale>> f36309n1;

    /* renamed from: o0 */
    @NotNull
    public static final ValueValidator<Long> f36310o0;

    /* renamed from: o1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f36311o1;

    /* renamed from: p0 */
    @NotNull
    public static final ValueValidator<Long> f36312p0;

    /* renamed from: p1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>> f36313p1;

    /* renamed from: q0 */
    @NotNull
    public static final ListValidator<DivDisappearAction> f36314q0;

    /* renamed from: q1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivTransform> f36315q1;

    /* renamed from: r0 */
    @NotNull
    public static final ListValidator<DivDisappearActionTemplate> f36316r0;

    /* renamed from: r1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition> f36317r1;

    /* renamed from: s0 */
    @NotNull
    public static final ListValidator<DivAction> f36318s0;

    /* renamed from: s1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f36319s1;

    /* renamed from: t0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f36320t0;

    /* renamed from: t1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f36321t1;

    /* renamed from: u0 */
    @NotNull
    public static final ListValidator<DivExtension> f36322u0;

    /* renamed from: u1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>> f36323u1;

    /* renamed from: v0 */
    @NotNull
    public static final ListValidator<DivExtensionTemplate> f36324v0;

    /* renamed from: v1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>> f36325v1;

    /* renamed from: w0 */
    @NotNull
    public static final ValueValidator<String> f36326w0;

    /* renamed from: w1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction> f36327w1;

    /* renamed from: x0 */
    @NotNull
    public static final ValueValidator<String> f36328x0;

    /* renamed from: x1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>> f36329x1;

    /* renamed from: y0 */
    @NotNull
    public static final ListValidator<DivAction> f36330y0;

    /* renamed from: y1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f36331y1;

    /* renamed from: z0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f36332z0;

    /* renamed from: A */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f36333A;

    /* renamed from: B */
    @JvmField
    @NotNull
    public final Field<Expression<DivImageScale>> f36334B;

    /* renamed from: C */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f36335C;

    /* renamed from: D */
    @JvmField
    @NotNull
    public final Field<List<DivTooltipTemplate>> f36336D;

    /* renamed from: E */
    @JvmField
    @NotNull
    public final Field<DivTransformTemplate> f36337E;

    /* renamed from: F */
    @JvmField
    @NotNull
    public final Field<DivChangeTransitionTemplate> f36338F;

    /* renamed from: G */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f36339G;

    /* renamed from: H */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f36340H;

    /* renamed from: I */
    @JvmField
    @NotNull
    public final Field<List<DivTransitionTrigger>> f36341I;

    /* renamed from: J */
    @JvmField
    @NotNull
    public final Field<Expression<DivVisibility>> f36342J;

    /* renamed from: K */
    @JvmField
    @NotNull
    public final Field<DivVisibilityActionTemplate> f36343K;

    /* renamed from: L */
    @JvmField
    @NotNull
    public final Field<List<DivVisibilityActionTemplate>> f36344L;

    /* renamed from: M */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f36345M;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<DivAccessibilityTemplate> f36346a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<DivActionTemplate> f36347b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<DivAnimationTemplate> f36348c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f36349d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f36350e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f36351f;

    /* renamed from: g */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f36352g;

    /* renamed from: h */
    @JvmField
    @NotNull
    public final Field<DivAspectTemplate> f36353h;

    /* renamed from: i */
    @JvmField
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f36354i;

    /* renamed from: j */
    @JvmField
    @NotNull
    public final Field<DivBorderTemplate> f36355j;

    /* renamed from: k */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f36356k;

    /* renamed from: l */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f36357l;

    /* renamed from: m */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f36358m;

    /* renamed from: n */
    @JvmField
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f36359n;

    /* renamed from: o */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f36360o;

    /* renamed from: p */
    @JvmField
    @NotNull
    public final Field<List<DivExtensionTemplate>> f36361p;

    /* renamed from: q */
    @JvmField
    @NotNull
    public final Field<DivFocusTemplate> f36362q;

    /* renamed from: r */
    @JvmField
    @NotNull
    public final Field<Expression<Uri>> f36363r;

    /* renamed from: s */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f36364s;

    /* renamed from: t */
    @JvmField
    @NotNull
    public final Field<String> f36365t;

    /* renamed from: u */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f36366u;

    /* renamed from: v */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f36367v;

    /* renamed from: w */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f36368w;

    /* renamed from: x */
    @JvmField
    @NotNull
    public final Field<Expression<Integer>> f36369x;

    /* renamed from: y */
    @JvmField
    @NotNull
    public final Field<Expression<Boolean>> f36370y;

    /* renamed from: z */
    @JvmField
    @NotNull
    public final Field<Expression<String>> f36371z;

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\bR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\bR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0014R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0011R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0011R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\bR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\bR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\bR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\bR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\bR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\bR\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0014R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0014R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\bR\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\bR\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0011R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010\u0011R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u0002010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010\u0014R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u0002010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0014R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\u0014R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010\u0014R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010\u0011R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010\bR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010\bR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010\bR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010\bR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010\bR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020M0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010\bR\u0014\u0010P\u001a\u0002018\u0006X\u0086T¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020 0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\"0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010TR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020 0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010TR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\"0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010TR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020B0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010TR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010TR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010\bR\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010\bR\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020Y0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010\u0011R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010b¨\u0006c"}, m31884d2 = {"Lcom/yandex/div2/DivGifImageTemplate$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivActionTemplate;", "ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAction;", "ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivAnimation;", "ACTION_ANIMATION_DEFAULT_VALUE", "Lcom/yandex/div2/DivAnimation;", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "Lcom/yandex/div2/DivBackgroundTemplate;", "BACKGROUND_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivAlignmentHorizontal;", "CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE", "Lcom/yandex/div2/DivAlignmentVertical;", "CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE", "Lcom/yandex/div2/DivDisappearActionTemplate;", "DISAPPEAR_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "DOUBLETAP_ACTIONS_TEMPLATE_VALIDATOR", "DOUBLETAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivExtensionTemplate;", "EXTENSIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "LONGTAP_ACTIONS_TEMPLATE_VALIDATOR", "LONGTAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "PADDINGS_DEFAULT_VALUE", "", "PLACEHOLDER_COLOR_DEFAULT_VALUE", "", "PRELOAD_REQUIRED_DEFAULT_VALUE", "PREVIEW_TEMPLATE_VALIDATOR", "PREVIEW_VALIDATOR", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "Lcom/yandex/div2/DivImageScale;", "SCALE_DEFAULT_VALUE", "SELECTED_ACTIONS_TEMPLATE_VALIDATOR", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivTooltipTemplate;", "TOOLTIPS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_TEMPLATE_VALIDATOR", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL", "TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL", "TYPE_HELPER_SCALE", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/DivVisibilityActionTemplate;", "VISIBILITY_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        Expression m17539a = companion.m17539a(100L);
        Expression m17539a2 = companion.m17539a(Double.valueOf(0.6d));
        Expression m17539a3 = companion.m17539a(DivAnimation.Name.FADE);
        Double valueOf = Double.valueOf(1.0d);
        f36258O = new DivAnimation(m17539a, m17539a2, null, null, m17539a3, null, null, companion.m17539a(valueOf), C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
        f36260P = companion.m17539a(valueOf);
        f36262Q = new DivBorder(null, null, null, null, null, 31);
        f36264R = companion.m17539a(DivAlignmentHorizontal.CENTER);
        f36266S = companion.m17539a(DivAlignmentVertical.CENTER);
        f36268T = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7));
        f36270U = new DivEdgeInsets(null, null, null, null, null, 31);
        f36272V = new DivEdgeInsets(null, null, null, null, null, 31);
        f36274W = companion.m17539a(335544320);
        f36276X = companion.m17539a(Boolean.FALSE);
        f36278Y = companion.m17539a(DivImageScale.FILL);
        f36280Z = new DivTransform(null, null, null, 7);
        f36282a0 = companion.m17539a(DivVisibility.VISIBLE);
        f36284b0 = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i2 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f36286c0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f36288d0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f36290e0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f36292f0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f36294g0 = companion2.m17372a(ArraysKt.m31926B(DivImageScale.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$TYPE_HELPER_SCALE$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivImageScale);
            }
        });
        f36296h0 = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f36298i0 = C3059n.f41756r;
        f36300j0 = C3059n.f41763y;
        f36302k0 = C3061o.f41797i;
        f36304l0 = C3061o.f41798j;
        f36306m0 = C3063p.f41854d;
        f36308n0 = C3063p.f41855e;
        f36310o0 = C3061o.f41799k;
        f36312p0 = C3061o.f41800l;
        f36314q0 = C3063p.f41856f;
        f36316r0 = C3063p.f41857g;
        f36318s0 = C3059n.f41757s;
        f36320t0 = C3059n.f41758t;
        f36322u0 = C3059n.f41759u;
        f36324v0 = C3059n.f41760v;
        f36326w0 = C3061o.f41791c;
        f36328x0 = C3061o.f41792d;
        f36330y0 = C3059n.f41761w;
        f36332z0 = C3059n.f41762x;
        f36243A0 = C3061o.f41793e;
        f36244B0 = C3061o.f41794f;
        f36245C0 = C3061o.f41795g;
        f36246D0 = C3061o.f41796h;
        f36247E0 = C3059n.f41764z;
        f36248F0 = C3059n.f41735A;
        f36249G0 = C3059n.f41736B;
        f36250H0 = C3059n.f41737C;
        f36251I0 = C3059n.f41738D;
        f36252J0 = C3059n.f41739E;
        f36253K0 = C3063p.f41852b;
        f36254L0 = C3063p.f41853c;
        f36255M0 = new Function3<String, JSONObject, ParsingEnvironment, DivAccessibility>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$ACCESSIBILITY_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAccessibility mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAccessibility.Companion companion3 = DivAccessibility.f34479f;
                DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject2, str2, DivAccessibility.f34486m, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divAccessibility == null ? DivGifImageTemplate.f36256N : divAccessibility;
            }
        };
        f36257N0 = new Function3<String, JSONObject, ParsingEnvironment, DivAction>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$ACTION_READER$1
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
        f36259O0 = new Function3<String, JSONObject, ParsingEnvironment, DivAnimation>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$ACTION_ANIMATION_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAnimation mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAnimation.Companion companion3 = DivAnimation.f34634h;
                DivAnimation divAnimation = (DivAnimation) JsonParser.m17322n(jSONObject2, str2, DivAnimation.f34644r, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divAnimation == null ? DivGifImageTemplate.f36258O : divAnimation;
            }
        };
        f36261P0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivGifImageTemplate.f36298i0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36263Q0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$ALIGNMENT_HORIZONTAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentHorizontal> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentHorizontal.f34618d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivGifImageTemplate.f36286c0);
            }
        };
        f36265R0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$ALIGNMENT_VERTICAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentVertical> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentVertical.Converter converter = DivAlignmentVertical.f34625c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentVertical.f34626d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivGifImageTemplate.f36288d0);
            }
        };
        f36267S0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$ALPHA_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
                ValueValidator<Double> valueValidator = DivGifImageTemplate.f36304l0;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Double> expression = DivGifImageTemplate.f36260P;
                Expression<Double> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
                return m17328t == null ? expression : m17328t;
            }
        };
        f36269T0 = new Function3<String, JSONObject, ParsingEnvironment, DivAspect>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$ASPECT_READER$1
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
        f36271U0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$BACKGROUND_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivBackground> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBackground.Companion companion3 = DivBackground.f34750a;
                return JsonParser.m17333y(jSONObject2, str2, DivBackground.f34751b, DivGifImageTemplate.f36306m0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36273V0 = new Function3<String, JSONObject, ParsingEnvironment, DivBorder>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$BORDER_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivBorder mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBorder.Companion companion3 = DivBorder.f34785f;
                DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject2, str2, DivBorder.f34788i, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divBorder == null ? DivGifImageTemplate.f36262Q : divBorder;
            }
        };
        f36275W0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$COLUMN_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivGifImageTemplate.f36312p0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f36277X0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$CONTENT_ALIGNMENT_HORIZONTAL_READER$1
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
                Expression<DivAlignmentHorizontal> expression = DivGifImageTemplate.f36264R;
                Expression<DivAlignmentHorizontal> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivGifImageTemplate.f36290e0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f36279Y0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$CONTENT_ALIGNMENT_VERTICAL_READER$1
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
                Expression<DivAlignmentVertical> expression = DivGifImageTemplate.f36266S;
                Expression<DivAlignmentVertical> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivGifImageTemplate.f36292f0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f36281Z0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$DISAPPEAR_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivDisappearAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivDisappearAction.Companion companion3 = DivDisappearAction.f35537a;
                return JsonParser.m17333y(jSONObject2, str2, DivDisappearAction.f35545i, DivGifImageTemplate.f36314q0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36283a1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$DOUBLETAP_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivGifImageTemplate.f36318s0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36285b1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$EXTENSIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivExtension> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivExtension.Companion companion3 = DivExtension.f35659c;
                return JsonParser.m17333y(jSONObject2, str2, DivExtension.f35660d, DivGifImageTemplate.f36322u0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36287c1 = new Function3<String, JSONObject, ParsingEnvironment, DivFocus>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$FOCUS_READER$1
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
        f36289d1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Uri>>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$GIF_URL_READER$1
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
        f36291e1 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$HEIGHT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivGifImageTemplate.f36268T : divSize;
            }
        };
        f36293f1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$ID_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return (String) JsonParser.m17323o(jSONObject2, str2, DivGifImageTemplate.f36328x0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36295g1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$LONGTAP_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivGifImageTemplate.f36330y0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36297h1 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$MARGINS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivGifImageTemplate.f36270U : divEdgeInsets;
            }
        };
        f36299i1 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$PADDINGS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivGifImageTemplate.f36272V : divEdgeInsets;
            }
        };
        f36301j1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$PLACEHOLDER_COLOR_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Integer> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Object, Integer> function1 = ParsingConvertersKt.f33827a;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Integer> expression = DivGifImageTemplate.f36274W;
                Expression<Integer> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33853f);
                return m17330v == null ? expression : m17330v;
            }
        };
        f36303k1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$PRELOAD_REQUIRED_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Boolean> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Object, Boolean> function1 = ParsingConvertersKt.f33829c;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Boolean> expression = DivGifImageTemplate.f36276X;
                Expression<Boolean> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33848a);
                return m17330v == null ? expression : m17330v;
            }
        };
        f36305l1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<String>>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$PREVIEW_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<String> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17325q(jSONObject2, str2, DivGifImageTemplate.f36244B0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33850c);
            }
        };
        f36307m1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$ROW_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivGifImageTemplate.f36246D0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f36309n1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivImageScale>>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$SCALE_READER$1
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
                Expression<DivImageScale> expression = DivGifImageTemplate.f36278Y;
                Expression<DivImageScale> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivGifImageTemplate.f36294g0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f36311o1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$SELECTED_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivGifImageTemplate.f36247E0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36313p1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$TOOLTIPS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTooltip> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTooltip.Companion companion3 = DivTooltip.f40492h;
                return JsonParser.m17333y(jSONObject2, str2, DivTooltip.f40497m, DivGifImageTemplate.f36249G0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36315q1 = new Function3<String, JSONObject, ParsingEnvironment, DivTransform>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$TRANSFORM_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivTransform mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransform.Companion companion3 = DivTransform.f40551d;
                DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject2, str2, DivTransform.f40554g, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divTransform == null ? DivGifImageTemplate.f36280Z : divTransform;
            }
        };
        f36317r1 = new Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$TRANSITION_CHANGE_READER$1
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
        f36319s1 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$TRANSITION_IN_READER$1
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
        f36321t1 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$TRANSITION_OUT_READER$1
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
        f36323u1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$TRANSITION_TRIGGERS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTransitionTrigger> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransitionTrigger.Converter converter = DivTransitionTrigger.f40582c;
                return JsonParser.m17332x(jSONObject2, str2, DivTransitionTrigger.f40583d, DivGifImageTemplate.f36251I0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        DivGifImageTemplate$Companion$TYPE_READER$1 divGifImageTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$TYPE_READER$1
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
        f36325v1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$VISIBILITY_READER$1
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
                Expression<DivVisibility> expression = DivGifImageTemplate.f36282a0;
                Expression<DivVisibility> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivGifImageTemplate.f36296h0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f36327w1 = new Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$VISIBILITY_ACTION_READER$1
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
        f36329x1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$VISIBILITY_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivVisibilityAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivVisibilityAction.Companion companion3 = DivVisibilityAction.f40938i;
                return JsonParser.m17333y(jSONObject2, str2, DivVisibilityAction.f40946q, DivGifImageTemplate.f36253K0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36331y1 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$WIDTH_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivGifImageTemplate.f36284b0 : divSize;
            }
        };
        DivGifImageTemplate$Companion$CREATOR$1 divGifImageTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivGifImageTemplate>() { // from class: com.yandex.div2.DivGifImageTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivGifImageTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivGifImageTemplate(env, null, false, it);
            }
        };
    }

    public DivGifImageTemplate(@NotNull ParsingEnvironment env, @Nullable DivGifImageTemplate divGifImageTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        Field<DivAccessibilityTemplate> field = divGifImageTemplate == null ? null : divGifImageTemplate.f36346a;
        DivAccessibilityTemplate.Companion companion = DivAccessibilityTemplate.f34515g;
        this.f36346a = JsonTemplateParser.m17354o(json, "accessibility", z, field, DivAccessibilityTemplate.f34531w, f34328a, env);
        Field<DivActionTemplate> field2 = divGifImageTemplate == null ? null : divGifImageTemplate.f36347b;
        DivActionTemplate.Companion companion2 = DivActionTemplate.f34572i;
        Function2<ParsingEnvironment, JSONObject, DivActionTemplate> function2 = DivActionTemplate.f34586w;
        this.f36347b = JsonTemplateParser.m17354o(json, "action", z, field2, function2, f34328a, env);
        Field<DivAnimationTemplate> field3 = divGifImageTemplate == null ? null : divGifImageTemplate.f36348c;
        DivAnimationTemplate.Companion companion3 = DivAnimationTemplate.f34681i;
        this.f36348c = JsonTemplateParser.m17354o(json, "action_animation", z, field3, DivAnimationTemplate.f34680D, f34328a, env);
        this.f36349d = JsonTemplateParser.m17360u(json, "actions", z, divGifImageTemplate == null ? null : divGifImageTemplate.f36349d, function2, f36300j0, f34328a, env);
        Field<Expression<DivAlignmentHorizontal>> field4 = divGifImageTemplate == null ? null : divGifImageTemplate.f36350e;
        DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
        Function1<String, DivAlignmentHorizontal> function1 = DivAlignmentHorizontal.f34618d;
        this.f36350e = JsonTemplateParser.m17358s(json, "alignment_horizontal", z, field4, function1, f34328a, env, f36286c0);
        Field<Expression<DivAlignmentVertical>> field5 = divGifImageTemplate == null ? null : divGifImageTemplate.f36351f;
        DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
        Function1<String, DivAlignmentVertical> function12 = DivAlignmentVertical.f34626d;
        this.f36351f = JsonTemplateParser.m17358s(json, "alignment_vertical", z, field5, function12, f34328a, env, f36288d0);
        this.f36352g = JsonTemplateParser.m17357r(json, "alpha", z, divGifImageTemplate == null ? null : divGifImageTemplate.f36352g, ParsingConvertersKt.f33830d, f36302k0, f34328a, env, TypeHelpersKt.f33851d);
        Field<DivAspectTemplate> field6 = divGifImageTemplate == null ? null : divGifImageTemplate.f36353h;
        DivAspectTemplate.Companion companion4 = DivAspectTemplate.f34744b;
        this.f36353h = JsonTemplateParser.m17354o(json, "aspect", z, field6, DivAspectTemplate.f34746d, f34328a, env);
        Field<List<DivBackgroundTemplate>> field7 = divGifImageTemplate == null ? null : divGifImageTemplate.f36354i;
        DivBackgroundTemplate.Companion companion5 = DivBackgroundTemplate.f34758a;
        this.f36354i = JsonTemplateParser.m17360u(json, "background", z, field7, DivBackgroundTemplate.f34759b, f36308n0, f34328a, env);
        Field<DivBorderTemplate> field8 = divGifImageTemplate == null ? null : divGifImageTemplate.f36355j;
        DivBorderTemplate.Companion companion6 = DivBorderTemplate.f34795f;
        this.f36355j = JsonTemplateParser.m17354o(json, "border", z, field8, DivBorderTemplate.f34804o, f34328a, env);
        Field<Expression<Long>> field9 = divGifImageTemplate == null ? null : divGifImageTemplate.f36356k;
        Function1<Number, Long> function13 = ParsingConvertersKt.f33831e;
        ValueValidator<Long> valueValidator = f36310o0;
        TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
        this.f36356k = JsonTemplateParser.m17357r(json, "column_span", z, field9, function13, valueValidator, f34328a, env, typeHelper);
        this.f36357l = JsonTemplateParser.m17358s(json, "content_alignment_horizontal", z, divGifImageTemplate == null ? null : divGifImageTemplate.f36357l, function1, f34328a, env, f36290e0);
        this.f36358m = JsonTemplateParser.m17358s(json, "content_alignment_vertical", z, divGifImageTemplate == null ? null : divGifImageTemplate.f36358m, function12, f34328a, env, f36292f0);
        Field<List<DivDisappearActionTemplate>> field10 = divGifImageTemplate == null ? null : divGifImageTemplate.f36359n;
        DivDisappearActionTemplate.Companion companion7 = DivDisappearActionTemplate.f35550i;
        this.f36359n = JsonTemplateParser.m17360u(json, "disappear_actions", z, field10, DivDisappearActionTemplate.f35549C, f36316r0, f34328a, env);
        this.f36360o = JsonTemplateParser.m17360u(json, "doubletap_actions", z, divGifImageTemplate == null ? null : divGifImageTemplate.f36360o, function2, f36320t0, f34328a, env);
        Field<List<DivExtensionTemplate>> field11 = divGifImageTemplate == null ? null : divGifImageTemplate.f36361p;
        DivExtensionTemplate.Companion companion8 = DivExtensionTemplate.f35664c;
        this.f36361p = JsonTemplateParser.m17360u(json, "extensions", z, field11, DivExtensionTemplate.f35667f, f36324v0, f34328a, env);
        Field<DivFocusTemplate> field12 = divGifImageTemplate == null ? null : divGifImageTemplate.f36362q;
        DivFocusTemplate.Companion companion9 = DivFocusTemplate.f35833f;
        this.f36362q = JsonTemplateParser.m17354o(json, "focus", z, field12, DivFocusTemplate.f35846s, f34328a, env);
        this.f36363r = JsonTemplateParser.m17349j(json, "gif_url", z, divGifImageTemplate == null ? null : divGifImageTemplate.f36363r, ParsingConvertersKt.f33828b, f34328a, env, TypeHelpersKt.f33852e);
        Field<DivSizeTemplate> field13 = divGifImageTemplate == null ? null : divGifImageTemplate.f36364s;
        DivSizeTemplate.Companion companion10 = DivSizeTemplate.f38839a;
        Function2<ParsingEnvironment, JSONObject, DivSizeTemplate> function22 = DivSizeTemplate.f38840b;
        this.f36364s = JsonTemplateParser.m17354o(json, "height", z, field13, function22, f34328a, env);
        this.f36365t = JsonTemplateParser.m17351l(json, "id", z, divGifImageTemplate == null ? null : divGifImageTemplate.f36365t, f36326w0, f34328a, env);
        this.f36366u = JsonTemplateParser.m17360u(json, "longtap_actions", z, divGifImageTemplate == null ? null : divGifImageTemplate.f36366u, function2, f36332z0, f34328a, env);
        Field<DivEdgeInsetsTemplate> field14 = divGifImageTemplate == null ? null : divGifImageTemplate.f36367v;
        DivEdgeInsetsTemplate.Companion companion11 = DivEdgeInsetsTemplate.f35626f;
        Function2<ParsingEnvironment, JSONObject, DivEdgeInsetsTemplate> function23 = DivEdgeInsetsTemplate.f35646z;
        this.f36367v = JsonTemplateParser.m17354o(json, "margins", z, field14, function23, f34328a, env);
        this.f36368w = JsonTemplateParser.m17354o(json, "paddings", z, divGifImageTemplate == null ? null : divGifImageTemplate.f36368w, function23, f34328a, env);
        this.f36369x = JsonTemplateParser.m17358s(json, "placeholder_color", z, divGifImageTemplate == null ? null : divGifImageTemplate.f36369x, ParsingConvertersKt.f33827a, f34328a, env, TypeHelpersKt.f33853f);
        this.f36370y = JsonTemplateParser.m17358s(json, "preload_required", z, divGifImageTemplate == null ? null : divGifImageTemplate.f36370y, ParsingConvertersKt.f33829c, f34328a, env, TypeHelpersKt.f33848a);
        this.f36371z = JsonTemplateParser.m17355p(json, "preview", z, divGifImageTemplate == null ? null : divGifImageTemplate.f36371z, f36243A0, f34328a, env, TypeHelpersKt.f33850c);
        this.f36333A = JsonTemplateParser.m17357r(json, "row_span", z, divGifImageTemplate == null ? null : divGifImageTemplate.f36333A, function13, f36245C0, f34328a, env, typeHelper);
        Field<Expression<DivImageScale>> field15 = divGifImageTemplate == null ? null : divGifImageTemplate.f36334B;
        DivImageScale.Converter converter3 = DivImageScale.f36808c;
        this.f36334B = JsonTemplateParser.m17358s(json, "scale", z, field15, DivImageScale.f36809d, f34328a, env, f36294g0);
        Field<List<DivActionTemplate>> field16 = divGifImageTemplate == null ? null : divGifImageTemplate.f36335C;
        DivActionTemplate.Companion companion12 = DivActionTemplate.f34572i;
        this.f36335C = JsonTemplateParser.m17360u(json, "selected_actions", z, field16, DivActionTemplate.f34586w, f36248F0, f34328a, env);
        Field<List<DivTooltipTemplate>> field17 = divGifImageTemplate == null ? null : divGifImageTemplate.f36336D;
        DivTooltipTemplate.Companion companion13 = DivTooltipTemplate.f40520h;
        this.f36336D = JsonTemplateParser.m17360u(json, "tooltips", z, field17, DivTooltipTemplate.f40534v, f36250H0, f34328a, env);
        Field<DivTransformTemplate> field18 = divGifImageTemplate == null ? null : divGifImageTemplate.f36337E;
        DivTransformTemplate.Companion companion14 = DivTransformTemplate.f40559d;
        this.f36337E = JsonTemplateParser.m17354o(json, "transform", z, field18, DivTransformTemplate.f40565j, f34328a, env);
        Field<DivChangeTransitionTemplate> field19 = divGifImageTemplate == null ? null : divGifImageTemplate.f36338F;
        DivChangeTransitionTemplate.Companion companion15 = DivChangeTransitionTemplate.f34861a;
        this.f36338F = JsonTemplateParser.m17354o(json, "transition_change", z, field19, DivChangeTransitionTemplate.f34862b, f34328a, env);
        Field<DivAppearanceTransitionTemplate> field20 = divGifImageTemplate == null ? null : divGifImageTemplate.f36339G;
        DivAppearanceTransitionTemplate.Companion companion16 = DivAppearanceTransitionTemplate.f34733a;
        Function2<ParsingEnvironment, JSONObject, DivAppearanceTransitionTemplate> function24 = DivAppearanceTransitionTemplate.f34734b;
        this.f36339G = JsonTemplateParser.m17354o(json, "transition_in", z, field20, function24, f34328a, env);
        this.f36340H = JsonTemplateParser.m17354o(json, "transition_out", z, divGifImageTemplate == null ? null : divGifImageTemplate.f36340H, function24, f34328a, env);
        Field<List<DivTransitionTrigger>> field21 = divGifImageTemplate == null ? null : divGifImageTemplate.f36341I;
        DivTransitionTrigger.Converter converter4 = DivTransitionTrigger.f40582c;
        this.f36341I = JsonTemplateParser.m17359t(json, "transition_triggers", z, field21, DivTransitionTrigger.f40583d, f36252J0, f34328a, env);
        Field<Expression<DivVisibility>> field22 = divGifImageTemplate == null ? null : divGifImageTemplate.f36342J;
        DivVisibility.Converter converter5 = DivVisibility.f40930c;
        this.f36342J = JsonTemplateParser.m17358s(json, "visibility", z, field22, DivVisibility.f40931d, f34328a, env, f36296h0);
        Field<DivVisibilityActionTemplate> field23 = divGifImageTemplate == null ? null : divGifImageTemplate.f36343K;
        DivVisibilityActionTemplate.Companion companion17 = DivVisibilityActionTemplate.f40959i;
        Function2<ParsingEnvironment, JSONObject, DivVisibilityActionTemplate> function25 = DivVisibilityActionTemplate.f40958C;
        this.f36343K = JsonTemplateParser.m17354o(json, "visibility_action", z, field23, function25, f34328a, env);
        this.f36344L = JsonTemplateParser.m17360u(json, "visibility_actions", z, divGifImageTemplate == null ? null : divGifImageTemplate.f36344L, function25, f36254L0, f34328a, env);
        this.f36345M = JsonTemplateParser.m17354o(json, "width", z, divGifImageTemplate == null ? null : divGifImageTemplate.f36345M, function22, f34328a, env);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivGifImage mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        DivAccessibility divAccessibility = (DivAccessibility) FieldKt.m17381g(this.f36346a, env, "accessibility", data, f36255M0);
        if (divAccessibility == null) {
            divAccessibility = f36256N;
        }
        DivAccessibility divAccessibility2 = divAccessibility;
        DivAction divAction = (DivAction) FieldKt.m17381g(this.f36347b, env, "action", data, f36257N0);
        DivAnimation divAnimation = (DivAnimation) FieldKt.m17381g(this.f36348c, env, "action_animation", data, f36259O0);
        if (divAnimation == null) {
            divAnimation = f36258O;
        }
        DivAnimation divAnimation2 = divAnimation;
        List m17382h = FieldKt.m17382h(this.f36349d, env, "actions", data, f36298i0, f36261P0);
        Expression expression = (Expression) FieldKt.m17378d(this.f36350e, env, "alignment_horizontal", data, f36263Q0);
        Expression expression2 = (Expression) FieldKt.m17378d(this.f36351f, env, "alignment_vertical", data, f36265R0);
        Expression<Double> expression3 = (Expression) FieldKt.m17378d(this.f36352g, env, "alpha", data, f36267S0);
        if (expression3 == null) {
            expression3 = f36260P;
        }
        Expression<Double> expression4 = expression3;
        DivAspect divAspect = (DivAspect) FieldKt.m17381g(this.f36353h, env, "aspect", data, f36269T0);
        List m17382h2 = FieldKt.m17382h(this.f36354i, env, "background", data, f36306m0, f36271U0);
        DivBorder divBorder = (DivBorder) FieldKt.m17381g(this.f36355j, env, "border", data, f36273V0);
        if (divBorder == null) {
            divBorder = f36262Q;
        }
        DivBorder divBorder2 = divBorder;
        Expression expression5 = (Expression) FieldKt.m17378d(this.f36356k, env, "column_span", data, f36275W0);
        Expression<DivAlignmentHorizontal> expression6 = (Expression) FieldKt.m17378d(this.f36357l, env, "content_alignment_horizontal", data, f36277X0);
        if (expression6 == null) {
            expression6 = f36264R;
        }
        Expression<DivAlignmentHorizontal> expression7 = expression6;
        Expression<DivAlignmentVertical> expression8 = (Expression) FieldKt.m17378d(this.f36358m, env, "content_alignment_vertical", data, f36279Y0);
        if (expression8 == null) {
            expression8 = f36266S;
        }
        Expression<DivAlignmentVertical> expression9 = expression8;
        List m17382h3 = FieldKt.m17382h(this.f36359n, env, "disappear_actions", data, f36314q0, f36281Z0);
        List m17382h4 = FieldKt.m17382h(this.f36360o, env, "doubletap_actions", data, f36318s0, f36283a1);
        List m17382h5 = FieldKt.m17382h(this.f36361p, env, "extensions", data, f36322u0, f36285b1);
        DivFocus divFocus = (DivFocus) FieldKt.m17381g(this.f36362q, env, "focus", data, f36287c1);
        Expression expression10 = (Expression) FieldKt.m17376b(this.f36363r, env, "gif_url", data, f36289d1);
        DivSize divSize = (DivSize) FieldKt.m17381g(this.f36364s, env, "height", data, f36291e1);
        if (divSize == null) {
            divSize = f36268T;
        }
        DivSize divSize2 = divSize;
        String str = (String) FieldKt.m17378d(this.f36365t, env, "id", data, f36293f1);
        List m17382h6 = FieldKt.m17382h(this.f36366u, env, "longtap_actions", data, f36330y0, f36295g1);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) FieldKt.m17381g(this.f36367v, env, "margins", data, f36297h1);
        if (divEdgeInsets == null) {
            divEdgeInsets = f36270U;
        }
        DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
        DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) FieldKt.m17381g(this.f36368w, env, "paddings", data, f36299i1);
        if (divEdgeInsets3 == null) {
            divEdgeInsets3 = f36272V;
        }
        DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
        Expression<Integer> expression11 = (Expression) FieldKt.m17378d(this.f36369x, env, "placeholder_color", data, f36301j1);
        if (expression11 == null) {
            expression11 = f36274W;
        }
        Expression<Integer> expression12 = expression11;
        Expression<Boolean> expression13 = (Expression) FieldKt.m17378d(this.f36370y, env, "preload_required", data, f36303k1);
        if (expression13 == null) {
            expression13 = f36276X;
        }
        Expression<Boolean> expression14 = expression13;
        Expression expression15 = (Expression) FieldKt.m17378d(this.f36371z, env, "preview", data, f36305l1);
        Expression expression16 = (Expression) FieldKt.m17378d(this.f36333A, env, "row_span", data, f36307m1);
        Expression<DivImageScale> expression17 = (Expression) FieldKt.m17378d(this.f36334B, env, "scale", data, f36309n1);
        if (expression17 == null) {
            expression17 = f36278Y;
        }
        Expression<DivImageScale> expression18 = expression17;
        List m17382h7 = FieldKt.m17382h(this.f36335C, env, "selected_actions", data, f36247E0, f36311o1);
        List m17382h8 = FieldKt.m17382h(this.f36336D, env, "tooltips", data, f36249G0, f36313p1);
        DivTransform divTransform = (DivTransform) FieldKt.m17381g(this.f36337E, env, "transform", data, f36315q1);
        if (divTransform == null) {
            divTransform = f36280Z;
        }
        DivTransform divTransform2 = divTransform;
        DivChangeTransition divChangeTransition = (DivChangeTransition) FieldKt.m17381g(this.f36338F, env, "transition_change", data, f36317r1);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) FieldKt.m17381g(this.f36339G, env, "transition_in", data, f36319s1);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) FieldKt.m17381g(this.f36340H, env, "transition_out", data, f36321t1);
        List m17380f = FieldKt.m17380f(this.f36341I, env, "transition_triggers", data, f36251I0, f36323u1);
        Expression<DivVisibility> expression19 = (Expression) FieldKt.m17378d(this.f36342J, env, "visibility", data, f36325v1);
        if (expression19 == null) {
            expression19 = f36282a0;
        }
        Expression<DivVisibility> expression20 = expression19;
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) FieldKt.m17381g(this.f36343K, env, "visibility_action", data, f36327w1);
        List m17382h9 = FieldKt.m17382h(this.f36344L, env, "visibility_actions", data, f36253K0, f36329x1);
        DivSize divSize3 = (DivSize) FieldKt.m17381g(this.f36345M, env, "width", data, f36331y1);
        if (divSize3 == null) {
            divSize3 = f36284b0;
        }
        return new DivGifImage(divAccessibility2, divAction, divAnimation2, m17382h, expression, expression2, expression4, divAspect, m17382h2, divBorder2, expression5, expression7, expression9, m17382h3, m17382h4, m17382h5, divFocus, expression10, divSize2, str, m17382h6, divEdgeInsets2, divEdgeInsets4, expression12, expression14, expression15, expression16, expression18, m17382h7, m17382h8, divTransform2, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17380f, expression20, divVisibilityAction, m17382h9, divSize3);
    }
}
