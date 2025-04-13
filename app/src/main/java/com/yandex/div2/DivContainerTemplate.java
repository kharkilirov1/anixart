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
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivContainerTemplate;
import com.yandex.div2.DivContentAlignmentHorizontal;
import com.yandex.div2.DivContentAlignmentVertical;
import com.yandex.div2.DivDisappearAction;
import com.yandex.div2.DivDisappearActionTemplate;
import com.yandex.div2.DivDrawable;
import com.yandex.div2.DivDrawableTemplate;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivContainerTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div2/DivContainerTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivContainer;", "Companion", "SeparatorTemplate", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivContainerTemplate implements JSONSerializable, JsonTemplate<DivContainer> {

    /* renamed from: A0 */
    @NotNull
    public static final ListValidator<DivAction> f34994A0;

    /* renamed from: B0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f34995B0;

    /* renamed from: C0 */
    @NotNull
    public static final ValueValidator<Long> f34996C0;

    /* renamed from: D0 */
    @NotNull
    public static final ValueValidator<Long> f34997D0;

    /* renamed from: E0 */
    @NotNull
    public static final ListValidator<DivAction> f34998E0;

    /* renamed from: F0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f34999F0;

    /* renamed from: G0 */
    @NotNull
    public static final ListValidator<DivTooltip> f35000G0;

    /* renamed from: H0 */
    @NotNull
    public static final ListValidator<DivTooltipTemplate> f35001H0;

    /* renamed from: I0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f35002I0;

    /* renamed from: J0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f35003J0;

    /* renamed from: K0 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f35004K0;

    /* renamed from: L0 */
    @NotNull
    public static final ListValidator<DivVisibilityActionTemplate> f35005L0;

    /* renamed from: M0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAccessibility> f35006M0;

    /* renamed from: N */
    @NotNull
    public static final DivAccessibility f35007N = new DivAccessibility(null, null, null, null, null, null, 63);

    /* renamed from: N0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAction> f35008N0;

    /* renamed from: O */
    @NotNull
    public static final DivAnimation f35009O;

    /* renamed from: O0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAnimation> f35010O0;

    /* renamed from: P */
    @NotNull
    public static final Expression<Double> f35011P;

    /* renamed from: P0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f35012P0;

    /* renamed from: Q */
    @NotNull
    public static final DivBorder f35013Q;

    /* renamed from: Q0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>> f35014Q0;

    /* renamed from: R */
    @NotNull
    public static final Expression<DivContentAlignmentHorizontal> f35015R;

    /* renamed from: R0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>> f35016R0;

    /* renamed from: S */
    @NotNull
    public static final Expression<DivContentAlignmentVertical> f35017S;

    /* renamed from: S0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f35018S0;

    /* renamed from: T */
    @NotNull
    public static final DivSize.WrapContent f35019T;

    /* renamed from: T0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAspect> f35020T0;

    /* renamed from: U */
    @NotNull
    public static final Expression<DivContainer.LayoutMode> f35021U;

    /* renamed from: U0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>> f35022U0;

    /* renamed from: V */
    @NotNull
    public static final DivEdgeInsets f35023V;

    /* renamed from: V0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivBorder> f35024V0;

    /* renamed from: W */
    @NotNull
    public static final Expression<DivContainer.Orientation> f35025W;

    /* renamed from: W0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f35026W0;

    /* renamed from: X */
    @NotNull
    public static final DivEdgeInsets f35027X;

    /* renamed from: X0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivContentAlignmentHorizontal>> f35028X0;

    /* renamed from: Y */
    @NotNull
    public static final DivTransform f35029Y;

    /* renamed from: Y0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivContentAlignmentVertical>> f35030Y0;

    /* renamed from: Z */
    @NotNull
    public static final Expression<DivVisibility> f35031Z;

    /* renamed from: Z0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>> f35032Z0;

    /* renamed from: a0 */
    @NotNull
    public static final DivSize.MatchParent f35033a0;

    /* renamed from: a1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f35034a1;

    /* renamed from: b0 */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f35035b0;

    /* renamed from: b1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>> f35036b1;

    /* renamed from: c0 */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f35037c0;

    /* renamed from: c1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivFocus> f35038c1;

    /* renamed from: d0 */
    @NotNull
    public static final TypeHelper<DivContentAlignmentHorizontal> f35039d0;

    /* renamed from: d1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f35040d1;

    /* renamed from: e0 */
    @NotNull
    public static final TypeHelper<DivContentAlignmentVertical> f35041e0;

    /* renamed from: e1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f35042e1;

    /* renamed from: f0 */
    @NotNull
    public static final TypeHelper<DivContainer.LayoutMode> f35043f0;

    /* renamed from: f1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<Div>> f35044f1;

    /* renamed from: g0 */
    @NotNull
    public static final TypeHelper<DivContainer.Orientation> f35045g0;

    /* renamed from: g1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivContainer.LayoutMode>> f35046g1;

    /* renamed from: h0 */
    @NotNull
    public static final TypeHelper<DivVisibility> f35047h0;

    /* renamed from: h1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivContainer.Separator> f35048h1;

    /* renamed from: i0 */
    @NotNull
    public static final ListValidator<DivAction> f35049i0;

    /* renamed from: i1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f35050i1;

    /* renamed from: j0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f35051j0;

    /* renamed from: j1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f35052j1;

    /* renamed from: k0 */
    @NotNull
    public static final ValueValidator<Double> f35053k0;

    /* renamed from: k1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivContainer.Orientation>> f35054k1;

    /* renamed from: l0 */
    @NotNull
    public static final ValueValidator<Double> f35055l0;

    /* renamed from: l1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f35056l1;

    /* renamed from: m0 */
    @NotNull
    public static final ListValidator<DivBackground> f35057m0;

    /* renamed from: m1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f35058m1;

    /* renamed from: n0 */
    @NotNull
    public static final ListValidator<DivBackgroundTemplate> f35059n0;

    /* renamed from: n1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f35060n1;

    /* renamed from: o0 */
    @NotNull
    public static final ValueValidator<Long> f35061o0;

    /* renamed from: o1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivContainer.Separator> f35062o1;

    /* renamed from: p0 */
    @NotNull
    public static final ValueValidator<Long> f35063p0;

    /* renamed from: p1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>> f35064p1;

    /* renamed from: q0 */
    @NotNull
    public static final ListValidator<DivDisappearAction> f35065q0;

    /* renamed from: q1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivTransform> f35066q1;

    /* renamed from: r0 */
    @NotNull
    public static final ListValidator<DivDisappearActionTemplate> f35067r0;

    /* renamed from: r1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition> f35068r1;

    /* renamed from: s0 */
    @NotNull
    public static final ListValidator<DivAction> f35069s0;

    /* renamed from: s1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f35070s1;

    /* renamed from: t0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f35071t0;

    /* renamed from: t1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f35072t1;

    /* renamed from: u0 */
    @NotNull
    public static final ListValidator<DivExtension> f35073u0;

    /* renamed from: u1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>> f35074u1;

    /* renamed from: v0 */
    @NotNull
    public static final ListValidator<DivExtensionTemplate> f35075v0;

    /* renamed from: v1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>> f35076v1;

    /* renamed from: w0 */
    @NotNull
    public static final ValueValidator<String> f35077w0;

    /* renamed from: w1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction> f35078w1;

    /* renamed from: x0 */
    @NotNull
    public static final ValueValidator<String> f35079x0;

    /* renamed from: x1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>> f35080x1;

    /* renamed from: y0 */
    @NotNull
    public static final ListValidator<Div> f35081y0;

    /* renamed from: y1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f35082y1;

    /* renamed from: z0 */
    @NotNull
    public static final ListValidator<DivTemplate> f35083z0;

    /* renamed from: A */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f35084A;

    /* renamed from: B */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f35085B;

    /* renamed from: C */
    @JvmField
    @NotNull
    public final Field<SeparatorTemplate> f35086C;

    /* renamed from: D */
    @JvmField
    @NotNull
    public final Field<List<DivTooltipTemplate>> f35087D;

    /* renamed from: E */
    @JvmField
    @NotNull
    public final Field<DivTransformTemplate> f35088E;

    /* renamed from: F */
    @JvmField
    @NotNull
    public final Field<DivChangeTransitionTemplate> f35089F;

    /* renamed from: G */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f35090G;

    /* renamed from: H */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f35091H;

    /* renamed from: I */
    @JvmField
    @NotNull
    public final Field<List<DivTransitionTrigger>> f35092I;

    /* renamed from: J */
    @JvmField
    @NotNull
    public final Field<Expression<DivVisibility>> f35093J;

    /* renamed from: K */
    @JvmField
    @NotNull
    public final Field<DivVisibilityActionTemplate> f35094K;

    /* renamed from: L */
    @JvmField
    @NotNull
    public final Field<List<DivVisibilityActionTemplate>> f35095L;

    /* renamed from: M */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f35096M;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<DivAccessibilityTemplate> f35097a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<DivActionTemplate> f35098b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<DivAnimationTemplate> f35099c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f35100d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f35101e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f35102f;

    /* renamed from: g */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f35103g;

    /* renamed from: h */
    @JvmField
    @NotNull
    public final Field<DivAspectTemplate> f35104h;

    /* renamed from: i */
    @JvmField
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f35105i;

    /* renamed from: j */
    @JvmField
    @NotNull
    public final Field<DivBorderTemplate> f35106j;

    /* renamed from: k */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f35107k;

    /* renamed from: l */
    @JvmField
    @NotNull
    public final Field<Expression<DivContentAlignmentHorizontal>> f35108l;

    /* renamed from: m */
    @JvmField
    @NotNull
    public final Field<Expression<DivContentAlignmentVertical>> f35109m;

    /* renamed from: n */
    @JvmField
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f35110n;

    /* renamed from: o */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f35111o;

    /* renamed from: p */
    @JvmField
    @NotNull
    public final Field<List<DivExtensionTemplate>> f35112p;

    /* renamed from: q */
    @JvmField
    @NotNull
    public final Field<DivFocusTemplate> f35113q;

    /* renamed from: r */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f35114r;

    /* renamed from: s */
    @JvmField
    @NotNull
    public final Field<String> f35115s;

    /* renamed from: t */
    @JvmField
    @NotNull
    public final Field<List<DivTemplate>> f35116t;

    /* renamed from: u */
    @JvmField
    @NotNull
    public final Field<Expression<DivContainer.LayoutMode>> f35117u;

    /* renamed from: v */
    @JvmField
    @NotNull
    public final Field<SeparatorTemplate> f35118v;

    /* renamed from: w */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f35119w;

    /* renamed from: x */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f35120x;

    /* renamed from: y */
    @JvmField
    @NotNull
    public final Field<Expression<DivContainer.Orientation>> f35121y;

    /* renamed from: z */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f35122z;

    /* compiled from: DivContainerTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\bR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\bR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0014R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0011R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0011R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\bR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\bR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\bR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\bR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\bR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\bR\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0014R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0014R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\bR\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\bR\u001a\u00109\u001a\b\u0012\u0004\u0012\u0002080\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0011R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\bR\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\bR\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\u0011R\u0014\u0010A\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010>R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0014R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010\u0014R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010\bR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010\bR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010\bR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010\bR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010\bR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020M0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010\bR\u0014\u0010P\u001a\u0002018\u0006X\u0086T¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020S0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020V0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010UR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020 0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010UR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020\"0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010UR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u0002080R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010UR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020?0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010UR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010UR\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020^0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010\bR\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020`0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010\bR\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020\\0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010\u0011R\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010e¨\u0006f"}, m31884d2 = {"Lcom/yandex/div2/DivContainerTemplate$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivActionTemplate;", "ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAction;", "ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivAnimation;", "ACTION_ANIMATION_DEFAULT_VALUE", "Lcom/yandex/div2/DivAnimation;", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "Lcom/yandex/div2/DivBackgroundTemplate;", "BACKGROUND_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivContentAlignmentHorizontal;", "CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE", "Lcom/yandex/div2/DivContentAlignmentVertical;", "CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE", "Lcom/yandex/div2/DivDisappearActionTemplate;", "DISAPPEAR_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "DOUBLETAP_ACTIONS_TEMPLATE_VALIDATOR", "DOUBLETAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivExtensionTemplate;", "EXTENSIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div2/DivTemplate;", "ITEMS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/Div;", "ITEMS_VALIDATOR", "Lcom/yandex/div2/DivContainer$LayoutMode;", "LAYOUT_MODE_DEFAULT_VALUE", "LONGTAP_ACTIONS_TEMPLATE_VALIDATOR", "LONGTAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "Lcom/yandex/div2/DivContainer$Orientation;", "ORIENTATION_DEFAULT_VALUE", "PADDINGS_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "SELECTED_ACTIONS_TEMPLATE_VALIDATOR", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivTooltipTemplate;", "TOOLTIPS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_TEMPLATE_VALIDATOR", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL", "TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL", "TYPE_HELPER_LAYOUT_MODE", "TYPE_HELPER_ORIENTATION", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/DivVisibilityActionTemplate;", "VISIBILITY_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: DivContainerTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivContainerTemplate$SeparatorTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivContainer$Separator;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class SeparatorTemplate implements JSONSerializable, JsonTemplate<DivContainer.Separator> {

        /* renamed from: f */
        @NotNull
        public static final Companion f35171f = new Companion(null);

        /* renamed from: g */
        @NotNull
        public static final DivEdgeInsets f35172g = new DivEdgeInsets(null, null, null, null, null, 31);

        /* renamed from: h */
        @NotNull
        public static final Expression<Boolean> f35173h;

        /* renamed from: i */
        @NotNull
        public static final Expression<Boolean> f35174i;

        /* renamed from: j */
        @NotNull
        public static final Expression<Boolean> f35175j;

        /* renamed from: k */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f35176k;

        /* renamed from: l */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>> f35177l;

        /* renamed from: m */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>> f35178m;

        /* renamed from: n */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>> f35179n;

        /* renamed from: o */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, DivDrawable> f35180o;

        /* renamed from: p */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, SeparatorTemplate> f35181p;

        /* renamed from: a */
        @JvmField
        @NotNull
        public final Field<DivEdgeInsetsTemplate> f35182a;

        /* renamed from: b */
        @JvmField
        @NotNull
        public final Field<Expression<Boolean>> f35183b;

        /* renamed from: c */
        @JvmField
        @NotNull
        public final Field<Expression<Boolean>> f35184c;

        /* renamed from: d */
        @JvmField
        @NotNull
        public final Field<Expression<Boolean>> f35185d;

        /* renamed from: e */
        @JvmField
        @NotNull
        public final Field<DivDrawableTemplate> f35186e;

        /* compiled from: DivContainerTemplate.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\u000b"}, m31884d2 = {"Lcom/yandex/div2/DivContainerTemplate$SeparatorTemplate$Companion;", "", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "Lcom/yandex/div/json/expressions/Expression;", "", "SHOW_AT_END_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "SHOW_AT_START_DEFAULT_VALUE", "SHOW_BETWEEN_DEFAULT_VALUE", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        static {
            Expression.Companion companion = Expression.f34334a;
            Boolean bool = Boolean.FALSE;
            f35173h = companion.m17539a(bool);
            f35174i = companion.m17539a(bool);
            f35175j = companion.m17539a(Boolean.TRUE);
            f35176k = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivContainerTemplate$SeparatorTemplate$Companion$MARGINS_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    DivEdgeInsets.Companion companion2 = DivEdgeInsets.f35607f;
                    DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                    return divEdgeInsets == null ? DivContainerTemplate.SeparatorTemplate.f35172g : divEdgeInsets;
                }
            };
            f35177l = new Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>>() { // from class: com.yandex.div2.DivContainerTemplate$SeparatorTemplate$Companion$SHOW_AT_END_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<Boolean> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    Function1<Object, Boolean> function1 = ParsingConvertersKt.f33829c;
                    ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                    Expression<Boolean> expression = DivContainerTemplate.SeparatorTemplate.f35173h;
                    Expression<Boolean> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33848a);
                    return m17330v == null ? expression : m17330v;
                }
            };
            f35178m = new Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>>() { // from class: com.yandex.div2.DivContainerTemplate$SeparatorTemplate$Companion$SHOW_AT_START_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<Boolean> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    Function1<Object, Boolean> function1 = ParsingConvertersKt.f33829c;
                    ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                    Expression<Boolean> expression = DivContainerTemplate.SeparatorTemplate.f35174i;
                    Expression<Boolean> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33848a);
                    return m17330v == null ? expression : m17330v;
                }
            };
            f35179n = new Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>>() { // from class: com.yandex.div2.DivContainerTemplate$SeparatorTemplate$Companion$SHOW_BETWEEN_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<Boolean> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    Function1<Object, Boolean> function1 = ParsingConvertersKt.f33829c;
                    ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                    Expression<Boolean> expression = DivContainerTemplate.SeparatorTemplate.f35175j;
                    Expression<Boolean> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33848a);
                    return m17330v == null ? expression : m17330v;
                }
            };
            f35180o = new Function3<String, JSONObject, ParsingEnvironment, DivDrawable>() { // from class: com.yandex.div2.DivContainerTemplate$SeparatorTemplate$Companion$STYLE_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public DivDrawable mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    DivDrawable.Companion companion2 = DivDrawable.f35599a;
                    Function2<ParsingEnvironment, JSONObject, DivDrawable> function2 = DivDrawable.f35600b;
                    parsingEnvironment2.getF34328a();
                    return (DivDrawable) JsonParser.m17313e(jSONObject2, str2, function2, C2904b.f33858e, parsingEnvironment2);
                }
            };
            f35181p = new Function2<ParsingEnvironment, JSONObject, SeparatorTemplate>() { // from class: com.yandex.div2.DivContainerTemplate$SeparatorTemplate$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                public DivContainerTemplate.SeparatorTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    ParsingEnvironment env = parsingEnvironment;
                    JSONObject it = jSONObject;
                    Intrinsics.m32179h(env, "env");
                    Intrinsics.m32179h(it, "it");
                    return new DivContainerTemplate.SeparatorTemplate(env, null, false, it, 6);
                }
            };
        }

        public SeparatorTemplate(ParsingEnvironment parsingEnvironment, SeparatorTemplate separatorTemplate, boolean z, JSONObject jSONObject, int i2) {
            z = (i2 & 4) != 0 ? false : z;
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            DivEdgeInsetsTemplate.Companion companion = DivEdgeInsetsTemplate.f35626f;
            this.f35182a = JsonTemplateParser.m17354o(jSONObject, "margins", z, null, DivEdgeInsetsTemplate.f35646z, f34328a, parsingEnvironment);
            Function1<Object, Boolean> function1 = ParsingConvertersKt.f33829c;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.f33848a;
            this.f35183b = JsonTemplateParser.m17358s(jSONObject, "show_at_end", z, null, function1, f34328a, parsingEnvironment, typeHelper);
            this.f35184c = JsonTemplateParser.m17358s(jSONObject, "show_at_start", z, null, function1, f34328a, parsingEnvironment, typeHelper);
            this.f35185d = JsonTemplateParser.m17358s(jSONObject, "show_between", z, null, function1, f34328a, parsingEnvironment, typeHelper);
            DivDrawableTemplate.Companion companion2 = DivDrawableTemplate.f35603a;
            this.f35186e = JsonTemplateParser.m17345f(jSONObject, "style", z, null, DivDrawableTemplate.f35604b, f34328a, parsingEnvironment);
        }

        @Override // com.yandex.div.json.JsonTemplate
        /* renamed from: a */
        public DivContainer.Separator mo17514a(ParsingEnvironment env, JSONObject data) {
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(data, "data");
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) FieldKt.m17381g(this.f35182a, env, "margins", data, f35176k);
            if (divEdgeInsets == null) {
                divEdgeInsets = f35172g;
            }
            DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
            Expression<Boolean> expression = (Expression) FieldKt.m17378d(this.f35183b, env, "show_at_end", data, f35177l);
            if (expression == null) {
                expression = f35173h;
            }
            Expression<Boolean> expression2 = expression;
            Expression<Boolean> expression3 = (Expression) FieldKt.m17378d(this.f35184c, env, "show_at_start", data, f35178m);
            if (expression3 == null) {
                expression3 = f35174i;
            }
            Expression<Boolean> expression4 = expression3;
            Expression<Boolean> expression5 = (Expression) FieldKt.m17378d(this.f35185d, env, "show_between", data, f35179n);
            if (expression5 == null) {
                expression5 = f35175j;
            }
            return new DivContainer.Separator(divEdgeInsets2, expression2, expression4, expression5, (DivDrawable) FieldKt.m17383i(this.f35186e, env, "style", data, f35180o));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression expression = null;
        Expression.Companion companion = Expression.f34334a;
        Expression m17539a = companion.m17539a(100L);
        Expression m17539a2 = companion.m17539a(Double.valueOf(0.6d));
        Expression m17539a3 = companion.m17539a(DivAnimation.Name.FADE);
        Double valueOf = Double.valueOf(1.0d);
        f35009O = new DivAnimation(m17539a, m17539a2, null, null, m17539a3, null, null, companion.m17539a(valueOf), C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
        f35011P = companion.m17539a(valueOf);
        Expression expression2 = null;
        f35013Q = new DivBorder(null, null, null, null, null, 31);
        f35015R = companion.m17539a(DivContentAlignmentHorizontal.LEFT);
        f35017S = companion.m17539a(DivContentAlignmentVertical.TOP);
        f35019T = new DivSize.WrapContent(new DivWrapContentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, 7));
        f35021U = companion.m17539a(DivContainer.LayoutMode.NO_WRAP);
        Expression expression3 = null;
        Expression expression4 = null;
        Expression expression5 = null;
        int i2 = 31;
        f35023V = new DivEdgeInsets(expression, expression2, expression3, expression4, expression5, i2);
        f35025W = companion.m17539a(DivContainer.Orientation.VERTICAL);
        f35027X = new DivEdgeInsets(expression, expression2, expression3, expression4, expression5, i2);
        f35029Y = new DivTransform(null, null, null, 7);
        f35031Z = companion.m17539a(DivVisibility.VISIBLE);
        f35033a0 = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i3 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f35035b0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f35037c0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f35039d0 = companion2.m17372a(ArraysKt.m31926B(DivContentAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivContentAlignmentHorizontal);
            }
        });
        f35041e0 = companion2.m17372a(ArraysKt.m31926B(DivContentAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivContentAlignmentVertical);
            }
        });
        f35043f0 = companion2.m17372a(ArraysKt.m31926B(DivContainer.LayoutMode.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$TYPE_HELPER_LAYOUT_MODE$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivContainer.LayoutMode);
            }
        });
        f35045g0 = companion2.m17372a(ArraysKt.m31926B(DivContainer.Orientation.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$TYPE_HELPER_ORIENTATION$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivContainer.Orientation);
            }
        });
        f35047h0 = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f35049i0 = C3037c.f41153B;
        f35051j0 = C3041e.f41271g;
        f35053k0 = C3039d.f41235x;
        f35055l0 = C3043f.f41323c;
        f35057m0 = C3041e.f41280p;
        f35059n0 = C3041e.f41281q;
        f35061o0 = C3043f.f41324d;
        f35063p0 = C3043f.f41325e;
        f35065q0 = C3041e.f41282r;
        f35067r0 = C3041e.f41283s;
        f35069s0 = C3037c.f41154C;
        f35071t0 = C3037c.f41155D;
        f35073u0 = C3037c.f41156E;
        f35075v0 = C3041e.f41266b;
        f35077w0 = C3039d.f41231t;
        f35079x0 = C3039d.f41232u;
        f35081y0 = C3041e.f41267c;
        f35083z0 = C3041e.f41268d;
        f34994A0 = C3041e.f41269e;
        f34995B0 = C3041e.f41270f;
        f34996C0 = C3039d.f41233v;
        f34997D0 = C3039d.f41234w;
        f34998E0 = C3041e.f41272h;
        f34999F0 = C3041e.f41273i;
        f35000G0 = C3041e.f41274j;
        f35001H0 = C3041e.f41275k;
        f35002I0 = C3041e.f41276l;
        f35003J0 = C3041e.f41277m;
        f35004K0 = C3041e.f41278n;
        f35005L0 = C3041e.f41279o;
        f35006M0 = new Function3<String, JSONObject, ParsingEnvironment, DivAccessibility>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$ACCESSIBILITY_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAccessibility mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAccessibility.Companion companion3 = DivAccessibility.f34479f;
                DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject2, str2, DivAccessibility.f34486m, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divAccessibility == null ? DivContainerTemplate.f35007N : divAccessibility;
            }
        };
        f35008N0 = new Function3<String, JSONObject, ParsingEnvironment, DivAction>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$ACTION_READER$1
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
        f35010O0 = new Function3<String, JSONObject, ParsingEnvironment, DivAnimation>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$ACTION_ANIMATION_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAnimation mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAnimation.Companion companion3 = DivAnimation.f34634h;
                DivAnimation divAnimation = (DivAnimation) JsonParser.m17322n(jSONObject2, str2, DivAnimation.f34644r, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divAnimation == null ? DivContainerTemplate.f35009O : divAnimation;
            }
        };
        f35012P0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivContainerTemplate.f35049i0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f35014Q0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$ALIGNMENT_HORIZONTAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentHorizontal> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentHorizontal.f34618d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivContainerTemplate.f35035b0);
            }
        };
        f35016R0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$ALIGNMENT_VERTICAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentVertical> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentVertical.Converter converter = DivAlignmentVertical.f34625c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentVertical.f34626d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivContainerTemplate.f35037c0);
            }
        };
        f35018S0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$ALPHA_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
                ValueValidator<Double> valueValidator = DivContainerTemplate.f35055l0;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Double> expression6 = DivContainerTemplate.f35011P;
                Expression<Double> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression6, TypeHelpersKt.f33851d);
                return m17328t == null ? expression6 : m17328t;
            }
        };
        f35020T0 = new Function3<String, JSONObject, ParsingEnvironment, DivAspect>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$ASPECT_READER$1
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
        f35022U0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$BACKGROUND_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivBackground> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBackground.Companion companion3 = DivBackground.f34750a;
                return JsonParser.m17333y(jSONObject2, str2, DivBackground.f34751b, DivContainerTemplate.f35057m0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f35024V0 = new Function3<String, JSONObject, ParsingEnvironment, DivBorder>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$BORDER_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivBorder mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBorder.Companion companion3 = DivBorder.f34785f;
                DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject2, str2, DivBorder.f34788i, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divBorder == null ? DivContainerTemplate.f35013Q : divBorder;
            }
        };
        f35026W0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$COLUMN_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivContainerTemplate.f35063p0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f35028X0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivContentAlignmentHorizontal>>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$CONTENT_ALIGNMENT_HORIZONTAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivContentAlignmentHorizontal> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivContentAlignmentHorizontal.Converter converter = DivContentAlignmentHorizontal.f35193c;
                Function1<String, DivContentAlignmentHorizontal> function1 = DivContentAlignmentHorizontal.f35194d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivContentAlignmentHorizontal> expression6 = DivContainerTemplate.f35015R;
                Expression<DivContentAlignmentHorizontal> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression6, DivContainerTemplate.f35039d0);
                return m17330v == null ? expression6 : m17330v;
            }
        };
        f35030Y0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivContentAlignmentVertical>>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$CONTENT_ALIGNMENT_VERTICAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivContentAlignmentVertical> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivContentAlignmentVertical.Converter converter = DivContentAlignmentVertical.f35204c;
                Function1<String, DivContentAlignmentVertical> function1 = DivContentAlignmentVertical.f35205d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivContentAlignmentVertical> expression6 = DivContainerTemplate.f35017S;
                Expression<DivContentAlignmentVertical> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression6, DivContainerTemplate.f35041e0);
                return m17330v == null ? expression6 : m17330v;
            }
        };
        f35032Z0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$DISAPPEAR_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivDisappearAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivDisappearAction.Companion companion3 = DivDisappearAction.f35537a;
                return JsonParser.m17333y(jSONObject2, str2, DivDisappearAction.f35545i, DivContainerTemplate.f35065q0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f35034a1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$DOUBLETAP_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivContainerTemplate.f35069s0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f35036b1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$EXTENSIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivExtension> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivExtension.Companion companion3 = DivExtension.f35659c;
                return JsonParser.m17333y(jSONObject2, str2, DivExtension.f35660d, DivContainerTemplate.f35073u0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f35038c1 = new Function3<String, JSONObject, ParsingEnvironment, DivFocus>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$FOCUS_READER$1
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
        f35040d1 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$HEIGHT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivContainerTemplate.f35019T : divSize;
            }
        };
        f35042e1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$ID_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return (String) JsonParser.m17323o(jSONObject2, str2, DivContainerTemplate.f35079x0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f35044f1 = new Function3<String, JSONObject, ParsingEnvironment, List<Div>>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$ITEMS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<Div> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Div.Companion companion3 = Div.f34418a;
                List<Div> m17321m = JsonParser.m17321m(jSONObject2, str2, Div.f34419b, DivContainerTemplate.f35081y0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                Intrinsics.m32178g(m17321m, "readList(json, key, Div.…LIDATOR, env.logger, env)");
                return m17321m;
            }
        };
        f35046g1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivContainer.LayoutMode>>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$LAYOUT_MODE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivContainer.LayoutMode> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivContainer.LayoutMode.Converter converter = DivContainer.LayoutMode.f34968c;
                Function1<String, DivContainer.LayoutMode> function1 = DivContainer.LayoutMode.f34969d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivContainer.LayoutMode> expression6 = DivContainerTemplate.f35021U;
                Expression<DivContainer.LayoutMode> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression6, DivContainerTemplate.f35043f0);
                return m17330v == null ? expression6 : m17330v;
            }
        };
        f35048h1 = new Function3<String, JSONObject, ParsingEnvironment, DivContainer.Separator>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$LINE_SEPARATOR_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivContainer.Separator mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivContainer.Separator.Companion companion3 = DivContainer.Separator.f34983e;
                return (DivContainer.Separator) JsonParser.m17322n(jSONObject2, str2, DivContainer.Separator.f34988j, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f35050i1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$LONGTAP_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivContainerTemplate.f34994A0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f35052j1 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$MARGINS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivContainerTemplate.f35023V : divEdgeInsets;
            }
        };
        f35054k1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivContainer.Orientation>>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$ORIENTATION_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivContainer.Orientation> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivContainer.Orientation.Converter converter = DivContainer.Orientation.f34975c;
                Function1<String, DivContainer.Orientation> function1 = DivContainer.Orientation.f34976d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivContainer.Orientation> expression6 = DivContainerTemplate.f35025W;
                Expression<DivContainer.Orientation> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression6, DivContainerTemplate.f35045g0);
                return m17330v == null ? expression6 : m17330v;
            }
        };
        f35056l1 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$PADDINGS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivContainerTemplate.f35027X : divEdgeInsets;
            }
        };
        f35058m1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$ROW_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivContainerTemplate.f34997D0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f35060n1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$SELECTED_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivContainerTemplate.f34998E0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f35062o1 = new Function3<String, JSONObject, ParsingEnvironment, DivContainer.Separator>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$SEPARATOR_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivContainer.Separator mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivContainer.Separator.Companion companion3 = DivContainer.Separator.f34983e;
                return (DivContainer.Separator) JsonParser.m17322n(jSONObject2, str2, DivContainer.Separator.f34988j, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f35064p1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$TOOLTIPS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTooltip> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTooltip.Companion companion3 = DivTooltip.f40492h;
                return JsonParser.m17333y(jSONObject2, str2, DivTooltip.f40497m, DivContainerTemplate.f35000G0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f35066q1 = new Function3<String, JSONObject, ParsingEnvironment, DivTransform>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$TRANSFORM_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivTransform mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransform.Companion companion3 = DivTransform.f40551d;
                DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject2, str2, DivTransform.f40554g, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divTransform == null ? DivContainerTemplate.f35029Y : divTransform;
            }
        };
        f35068r1 = new Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$TRANSITION_CHANGE_READER$1
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
        f35070s1 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$TRANSITION_IN_READER$1
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
        f35072t1 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$TRANSITION_OUT_READER$1
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
        f35074u1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$TRANSITION_TRIGGERS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTransitionTrigger> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransitionTrigger.Converter converter = DivTransitionTrigger.f40582c;
                return JsonParser.m17332x(jSONObject2, str2, DivTransitionTrigger.f40583d, DivContainerTemplate.f35002I0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        DivContainerTemplate$Companion$TYPE_READER$1 divContainerTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$TYPE_READER$1
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
        f35076v1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$VISIBILITY_READER$1
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
                Expression<DivVisibility> expression6 = DivContainerTemplate.f35031Z;
                Expression<DivVisibility> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression6, DivContainerTemplate.f35047h0);
                return m17330v == null ? expression6 : m17330v;
            }
        };
        f35078w1 = new Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$VISIBILITY_ACTION_READER$1
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
        f35080x1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$VISIBILITY_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivVisibilityAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivVisibilityAction.Companion companion3 = DivVisibilityAction.f40938i;
                return JsonParser.m17333y(jSONObject2, str2, DivVisibilityAction.f40946q, DivContainerTemplate.f35004K0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f35082y1 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$WIDTH_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivContainerTemplate.f35033a0 : divSize;
            }
        };
        DivContainerTemplate$Companion$CREATOR$1 divContainerTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivContainerTemplate>() { // from class: com.yandex.div2.DivContainerTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivContainerTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivContainerTemplate(env, null, false, it);
            }
        };
    }

    public DivContainerTemplate(@NotNull ParsingEnvironment env, @Nullable DivContainerTemplate divContainerTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        Field<DivAccessibilityTemplate> field = divContainerTemplate == null ? null : divContainerTemplate.f35097a;
        DivAccessibilityTemplate.Companion companion = DivAccessibilityTemplate.f34515g;
        this.f35097a = JsonTemplateParser.m17354o(json, "accessibility", z, field, DivAccessibilityTemplate.f34531w, f34328a, env);
        Field<DivActionTemplate> field2 = divContainerTemplate == null ? null : divContainerTemplate.f35098b;
        DivActionTemplate.Companion companion2 = DivActionTemplate.f34572i;
        Function2<ParsingEnvironment, JSONObject, DivActionTemplate> function2 = DivActionTemplate.f34586w;
        this.f35098b = JsonTemplateParser.m17354o(json, "action", z, field2, function2, f34328a, env);
        Field<DivAnimationTemplate> field3 = divContainerTemplate == null ? null : divContainerTemplate.f35099c;
        DivAnimationTemplate.Companion companion3 = DivAnimationTemplate.f34681i;
        this.f35099c = JsonTemplateParser.m17354o(json, "action_animation", z, field3, DivAnimationTemplate.f34680D, f34328a, env);
        this.f35100d = JsonTemplateParser.m17360u(json, "actions", z, divContainerTemplate == null ? null : divContainerTemplate.f35100d, function2, f35051j0, f34328a, env);
        Field<Expression<DivAlignmentHorizontal>> field4 = divContainerTemplate == null ? null : divContainerTemplate.f35101e;
        DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
        this.f35101e = JsonTemplateParser.m17358s(json, "alignment_horizontal", z, field4, DivAlignmentHorizontal.f34618d, f34328a, env, f35035b0);
        Field<Expression<DivAlignmentVertical>> field5 = divContainerTemplate == null ? null : divContainerTemplate.f35102f;
        DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
        this.f35102f = JsonTemplateParser.m17358s(json, "alignment_vertical", z, field5, DivAlignmentVertical.f34626d, f34328a, env, f35037c0);
        this.f35103g = JsonTemplateParser.m17357r(json, "alpha", z, divContainerTemplate == null ? null : divContainerTemplate.f35103g, ParsingConvertersKt.f33830d, f35053k0, f34328a, env, TypeHelpersKt.f33851d);
        Field<DivAspectTemplate> field6 = divContainerTemplate == null ? null : divContainerTemplate.f35104h;
        DivAspectTemplate.Companion companion4 = DivAspectTemplate.f34744b;
        this.f35104h = JsonTemplateParser.m17354o(json, "aspect", z, field6, DivAspectTemplate.f34746d, f34328a, env);
        Field<List<DivBackgroundTemplate>> field7 = divContainerTemplate == null ? null : divContainerTemplate.f35105i;
        DivBackgroundTemplate.Companion companion5 = DivBackgroundTemplate.f34758a;
        this.f35105i = JsonTemplateParser.m17360u(json, "background", z, field7, DivBackgroundTemplate.f34759b, f35059n0, f34328a, env);
        Field<DivBorderTemplate> field8 = divContainerTemplate == null ? null : divContainerTemplate.f35106j;
        DivBorderTemplate.Companion companion6 = DivBorderTemplate.f34795f;
        this.f35106j = JsonTemplateParser.m17354o(json, "border", z, field8, DivBorderTemplate.f34804o, f34328a, env);
        Field<Expression<Long>> field9 = divContainerTemplate == null ? null : divContainerTemplate.f35107k;
        Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
        ValueValidator<Long> valueValidator = f35061o0;
        TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
        this.f35107k = JsonTemplateParser.m17357r(json, "column_span", z, field9, function1, valueValidator, f34328a, env, typeHelper);
        Field<Expression<DivContentAlignmentHorizontal>> field10 = divContainerTemplate == null ? null : divContainerTemplate.f35108l;
        DivContentAlignmentHorizontal.Converter converter3 = DivContentAlignmentHorizontal.f35193c;
        this.f35108l = JsonTemplateParser.m17358s(json, "content_alignment_horizontal", z, field10, DivContentAlignmentHorizontal.f35194d, f34328a, env, f35039d0);
        Field<Expression<DivContentAlignmentVertical>> field11 = divContainerTemplate == null ? null : divContainerTemplate.f35109m;
        DivContentAlignmentVertical.Converter converter4 = DivContentAlignmentVertical.f35204c;
        this.f35109m = JsonTemplateParser.m17358s(json, "content_alignment_vertical", z, field11, DivContentAlignmentVertical.f35205d, f34328a, env, f35041e0);
        Field<List<DivDisappearActionTemplate>> field12 = divContainerTemplate == null ? null : divContainerTemplate.f35110n;
        DivDisappearActionTemplate.Companion companion7 = DivDisappearActionTemplate.f35550i;
        this.f35110n = JsonTemplateParser.m17360u(json, "disappear_actions", z, field12, DivDisappearActionTemplate.f35549C, f35067r0, f34328a, env);
        this.f35111o = JsonTemplateParser.m17360u(json, "doubletap_actions", z, divContainerTemplate == null ? null : divContainerTemplate.f35111o, function2, f35071t0, f34328a, env);
        Field<List<DivExtensionTemplate>> field13 = divContainerTemplate == null ? null : divContainerTemplate.f35112p;
        DivExtensionTemplate.Companion companion8 = DivExtensionTemplate.f35664c;
        this.f35112p = JsonTemplateParser.m17360u(json, "extensions", z, field13, DivExtensionTemplate.f35667f, f35075v0, f34328a, env);
        Field<DivFocusTemplate> field14 = divContainerTemplate == null ? null : divContainerTemplate.f35113q;
        DivFocusTemplate.Companion companion9 = DivFocusTemplate.f35833f;
        this.f35113q = JsonTemplateParser.m17354o(json, "focus", z, field14, DivFocusTemplate.f35846s, f34328a, env);
        Field<DivSizeTemplate> field15 = divContainerTemplate == null ? null : divContainerTemplate.f35114r;
        DivSizeTemplate.Companion companion10 = DivSizeTemplate.f38839a;
        Function2<ParsingEnvironment, JSONObject, DivSizeTemplate> function22 = DivSizeTemplate.f38840b;
        this.f35114r = JsonTemplateParser.m17354o(json, "height", z, field15, function22, f34328a, env);
        this.f35115s = JsonTemplateParser.m17351l(json, "id", z, divContainerTemplate == null ? null : divContainerTemplate.f35115s, f35077w0, f34328a, env);
        Field<List<DivTemplate>> field16 = divContainerTemplate == null ? null : divContainerTemplate.f35116t;
        DivTemplate.Companion companion11 = DivTemplate.f39864a;
        this.f35116t = JsonTemplateParser.m17350k(json, "items", z, field16, DivTemplate.f39865b, f35083z0, f34328a, env);
        Field<Expression<DivContainer.LayoutMode>> field17 = divContainerTemplate == null ? null : divContainerTemplate.f35117u;
        DivContainer.LayoutMode.Converter converter5 = DivContainer.LayoutMode.f34968c;
        this.f35117u = JsonTemplateParser.m17358s(json, "layout_mode", z, field17, DivContainer.LayoutMode.f34969d, f34328a, env, f35043f0);
        Field<SeparatorTemplate> field18 = divContainerTemplate == null ? null : divContainerTemplate.f35118v;
        SeparatorTemplate.Companion companion12 = SeparatorTemplate.f35171f;
        Function2<ParsingEnvironment, JSONObject, SeparatorTemplate> function23 = SeparatorTemplate.f35181p;
        this.f35118v = JsonTemplateParser.m17354o(json, "line_separator", z, field18, function23, f34328a, env);
        this.f35119w = JsonTemplateParser.m17360u(json, "longtap_actions", z, divContainerTemplate == null ? null : divContainerTemplate.f35119w, function2, f34995B0, f34328a, env);
        Field<DivEdgeInsetsTemplate> field19 = divContainerTemplate == null ? null : divContainerTemplate.f35120x;
        DivEdgeInsetsTemplate.Companion companion13 = DivEdgeInsetsTemplate.f35626f;
        Function2<ParsingEnvironment, JSONObject, DivEdgeInsetsTemplate> function24 = DivEdgeInsetsTemplate.f35646z;
        this.f35120x = JsonTemplateParser.m17354o(json, "margins", z, field19, function24, f34328a, env);
        Field<Expression<DivContainer.Orientation>> field20 = divContainerTemplate == null ? null : divContainerTemplate.f35121y;
        DivContainer.Orientation.Converter converter6 = DivContainer.Orientation.f34975c;
        this.f35121y = JsonTemplateParser.m17358s(json, "orientation", z, field20, DivContainer.Orientation.f34976d, f34328a, env, f35045g0);
        this.f35122z = JsonTemplateParser.m17354o(json, "paddings", z, divContainerTemplate == null ? null : divContainerTemplate.f35122z, function24, f34328a, env);
        this.f35084A = JsonTemplateParser.m17357r(json, "row_span", z, divContainerTemplate == null ? null : divContainerTemplate.f35084A, function1, f34996C0, f34328a, env, typeHelper);
        this.f35085B = JsonTemplateParser.m17360u(json, "selected_actions", z, divContainerTemplate == null ? null : divContainerTemplate.f35085B, function2, f34999F0, f34328a, env);
        this.f35086C = JsonTemplateParser.m17354o(json, "separator", z, divContainerTemplate == null ? null : divContainerTemplate.f35086C, function23, f34328a, env);
        Field<List<DivTooltipTemplate>> field21 = divContainerTemplate == null ? null : divContainerTemplate.f35087D;
        DivTooltipTemplate.Companion companion14 = DivTooltipTemplate.f40520h;
        this.f35087D = JsonTemplateParser.m17360u(json, "tooltips", z, field21, DivTooltipTemplate.f40534v, f35001H0, f34328a, env);
        Field<DivTransformTemplate> field22 = divContainerTemplate == null ? null : divContainerTemplate.f35088E;
        DivTransformTemplate.Companion companion15 = DivTransformTemplate.f40559d;
        this.f35088E = JsonTemplateParser.m17354o(json, "transform", z, field22, DivTransformTemplate.f40565j, f34328a, env);
        Field<DivChangeTransitionTemplate> field23 = divContainerTemplate == null ? null : divContainerTemplate.f35089F;
        DivChangeTransitionTemplate.Companion companion16 = DivChangeTransitionTemplate.f34861a;
        this.f35089F = JsonTemplateParser.m17354o(json, "transition_change", z, field23, DivChangeTransitionTemplate.f34862b, f34328a, env);
        Field<DivAppearanceTransitionTemplate> field24 = divContainerTemplate == null ? null : divContainerTemplate.f35090G;
        DivAppearanceTransitionTemplate.Companion companion17 = DivAppearanceTransitionTemplate.f34733a;
        Function2<ParsingEnvironment, JSONObject, DivAppearanceTransitionTemplate> function25 = DivAppearanceTransitionTemplate.f34734b;
        this.f35090G = JsonTemplateParser.m17354o(json, "transition_in", z, field24, function25, f34328a, env);
        this.f35091H = JsonTemplateParser.m17354o(json, "transition_out", z, divContainerTemplate == null ? null : divContainerTemplate.f35091H, function25, f34328a, env);
        Field<List<DivTransitionTrigger>> field25 = divContainerTemplate == null ? null : divContainerTemplate.f35092I;
        DivTransitionTrigger.Converter converter7 = DivTransitionTrigger.f40582c;
        this.f35092I = JsonTemplateParser.m17359t(json, "transition_triggers", z, field25, DivTransitionTrigger.f40583d, f35003J0, f34328a, env);
        Field<Expression<DivVisibility>> field26 = divContainerTemplate == null ? null : divContainerTemplate.f35093J;
        DivVisibility.Converter converter8 = DivVisibility.f40930c;
        this.f35093J = JsonTemplateParser.m17358s(json, "visibility", z, field26, DivVisibility.f40931d, f34328a, env, f35047h0);
        Field<DivVisibilityActionTemplate> field27 = divContainerTemplate == null ? null : divContainerTemplate.f35094K;
        DivVisibilityActionTemplate.Companion companion18 = DivVisibilityActionTemplate.f40959i;
        Function2<ParsingEnvironment, JSONObject, DivVisibilityActionTemplate> function26 = DivVisibilityActionTemplate.f40958C;
        this.f35094K = JsonTemplateParser.m17354o(json, "visibility_action", z, field27, function26, f34328a, env);
        this.f35095L = JsonTemplateParser.m17360u(json, "visibility_actions", z, divContainerTemplate == null ? null : divContainerTemplate.f35095L, function26, f35005L0, f34328a, env);
        this.f35096M = JsonTemplateParser.m17354o(json, "width", z, divContainerTemplate == null ? null : divContainerTemplate.f35096M, function22, f34328a, env);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivContainer mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        DivAccessibility divAccessibility = (DivAccessibility) FieldKt.m17381g(this.f35097a, env, "accessibility", data, f35006M0);
        if (divAccessibility == null) {
            divAccessibility = f35007N;
        }
        DivAccessibility divAccessibility2 = divAccessibility;
        DivAction divAction = (DivAction) FieldKt.m17381g(this.f35098b, env, "action", data, f35008N0);
        DivAnimation divAnimation = (DivAnimation) FieldKt.m17381g(this.f35099c, env, "action_animation", data, f35010O0);
        if (divAnimation == null) {
            divAnimation = f35009O;
        }
        DivAnimation divAnimation2 = divAnimation;
        List m17382h = FieldKt.m17382h(this.f35100d, env, "actions", data, f35049i0, f35012P0);
        Expression expression = (Expression) FieldKt.m17378d(this.f35101e, env, "alignment_horizontal", data, f35014Q0);
        Expression expression2 = (Expression) FieldKt.m17378d(this.f35102f, env, "alignment_vertical", data, f35016R0);
        Expression<Double> expression3 = (Expression) FieldKt.m17378d(this.f35103g, env, "alpha", data, f35018S0);
        if (expression3 == null) {
            expression3 = f35011P;
        }
        Expression<Double> expression4 = expression3;
        DivAspect divAspect = (DivAspect) FieldKt.m17381g(this.f35104h, env, "aspect", data, f35020T0);
        List m17382h2 = FieldKt.m17382h(this.f35105i, env, "background", data, f35057m0, f35022U0);
        DivBorder divBorder = (DivBorder) FieldKt.m17381g(this.f35106j, env, "border", data, f35024V0);
        if (divBorder == null) {
            divBorder = f35013Q;
        }
        DivBorder divBorder2 = divBorder;
        Expression expression5 = (Expression) FieldKt.m17378d(this.f35107k, env, "column_span", data, f35026W0);
        Expression<DivContentAlignmentHorizontal> expression6 = (Expression) FieldKt.m17378d(this.f35108l, env, "content_alignment_horizontal", data, f35028X0);
        if (expression6 == null) {
            expression6 = f35015R;
        }
        Expression<DivContentAlignmentHorizontal> expression7 = expression6;
        Expression<DivContentAlignmentVertical> expression8 = (Expression) FieldKt.m17378d(this.f35109m, env, "content_alignment_vertical", data, f35030Y0);
        if (expression8 == null) {
            expression8 = f35017S;
        }
        Expression<DivContentAlignmentVertical> expression9 = expression8;
        List m17382h3 = FieldKt.m17382h(this.f35110n, env, "disappear_actions", data, f35065q0, f35032Z0);
        List m17382h4 = FieldKt.m17382h(this.f35111o, env, "doubletap_actions", data, f35069s0, f35034a1);
        List m17382h5 = FieldKt.m17382h(this.f35112p, env, "extensions", data, f35073u0, f35036b1);
        DivFocus divFocus = (DivFocus) FieldKt.m17381g(this.f35113q, env, "focus", data, f35038c1);
        DivSize divSize = (DivSize) FieldKt.m17381g(this.f35114r, env, "height", data, f35040d1);
        if (divSize == null) {
            divSize = f35019T;
        }
        DivSize divSize2 = divSize;
        String str = (String) FieldKt.m17378d(this.f35115s, env, "id", data, f35042e1);
        List m17384j = FieldKt.m17384j(this.f35116t, env, "items", data, f35081y0, f35044f1);
        Expression<DivContainer.LayoutMode> expression10 = (Expression) FieldKt.m17378d(this.f35117u, env, "layout_mode", data, f35046g1);
        if (expression10 == null) {
            expression10 = f35021U;
        }
        Expression<DivContainer.LayoutMode> expression11 = expression10;
        DivContainer.Separator separator = (DivContainer.Separator) FieldKt.m17381g(this.f35118v, env, "line_separator", data, f35048h1);
        List m17382h6 = FieldKt.m17382h(this.f35119w, env, "longtap_actions", data, f34994A0, f35050i1);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) FieldKt.m17381g(this.f35120x, env, "margins", data, f35052j1);
        if (divEdgeInsets == null) {
            divEdgeInsets = f35023V;
        }
        DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
        Expression<DivContainer.Orientation> expression12 = (Expression) FieldKt.m17378d(this.f35121y, env, "orientation", data, f35054k1);
        if (expression12 == null) {
            expression12 = f35025W;
        }
        Expression<DivContainer.Orientation> expression13 = expression12;
        DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) FieldKt.m17381g(this.f35122z, env, "paddings", data, f35056l1);
        if (divEdgeInsets3 == null) {
            divEdgeInsets3 = f35027X;
        }
        DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
        Expression expression14 = (Expression) FieldKt.m17378d(this.f35084A, env, "row_span", data, f35058m1);
        List m17382h7 = FieldKt.m17382h(this.f35085B, env, "selected_actions", data, f34998E0, f35060n1);
        DivContainer.Separator separator2 = (DivContainer.Separator) FieldKt.m17381g(this.f35086C, env, "separator", data, f35062o1);
        List m17382h8 = FieldKt.m17382h(this.f35087D, env, "tooltips", data, f35000G0, f35064p1);
        DivTransform divTransform = (DivTransform) FieldKt.m17381g(this.f35088E, env, "transform", data, f35066q1);
        if (divTransform == null) {
            divTransform = f35029Y;
        }
        DivTransform divTransform2 = divTransform;
        DivChangeTransition divChangeTransition = (DivChangeTransition) FieldKt.m17381g(this.f35089F, env, "transition_change", data, f35068r1);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) FieldKt.m17381g(this.f35090G, env, "transition_in", data, f35070s1);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) FieldKt.m17381g(this.f35091H, env, "transition_out", data, f35072t1);
        List m17380f = FieldKt.m17380f(this.f35092I, env, "transition_triggers", data, f35002I0, f35074u1);
        Expression<DivVisibility> expression15 = (Expression) FieldKt.m17378d(this.f35093J, env, "visibility", data, f35076v1);
        if (expression15 == null) {
            expression15 = f35031Z;
        }
        Expression<DivVisibility> expression16 = expression15;
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) FieldKt.m17381g(this.f35094K, env, "visibility_action", data, f35078w1);
        List m17382h9 = FieldKt.m17382h(this.f35095L, env, "visibility_actions", data, f35004K0, f35080x1);
        DivSize divSize3 = (DivSize) FieldKt.m17381g(this.f35096M, env, "width", data, f35082y1);
        if (divSize3 == null) {
            divSize3 = f35033a0;
        }
        return new DivContainer(divAccessibility2, divAction, divAnimation2, m17382h, expression, expression2, expression4, divAspect, m17382h2, divBorder2, expression5, expression7, expression9, m17382h3, m17382h4, m17382h5, divFocus, divSize2, str, m17384j, expression11, separator, m17382h6, divEdgeInsets2, expression13, divEdgeInsets4, expression14, m17382h7, separator2, m17382h8, divTransform2, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17380f, expression16, divVisibilityAction, m17382h9, divSize3);
    }
}
