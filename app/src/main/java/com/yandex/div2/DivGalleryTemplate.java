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
import com.yandex.div2.DivGallery;
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

/* compiled from: DivGalleryTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivGalleryTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivGallery;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivGalleryTemplate implements JSONSerializable, JsonTemplate<DivGallery> {

    /* renamed from: A0 */
    @NotNull
    public static final ValueValidator<Long> f35994A0;

    /* renamed from: B0 */
    @NotNull
    public static final ValueValidator<Long> f35995B0;

    /* renamed from: C0 */
    @NotNull
    public static final ListValidator<DivAction> f35996C0;

    /* renamed from: D0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f35997D0;

    /* renamed from: E0 */
    @NotNull
    public static final ListValidator<DivTooltip> f35998E0;

    /* renamed from: F0 */
    @NotNull
    public static final ListValidator<DivTooltipTemplate> f35999F0;

    /* renamed from: G0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f36000G0;

    /* renamed from: H0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f36001H0;

    /* renamed from: I0 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f36002I0;

    /* renamed from: J */
    @NotNull
    public static final DivAccessibility f36003J = new DivAccessibility(null, null, null, null, null, null, 63);

    /* renamed from: J0 */
    @NotNull
    public static final ListValidator<DivVisibilityActionTemplate> f36004J0;

    /* renamed from: K */
    @NotNull
    public static final Expression<Double> f36005K;

    /* renamed from: K0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAccessibility> f36006K0;

    /* renamed from: L */
    @NotNull
    public static final DivBorder f36007L;

    /* renamed from: L0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>> f36008L0;

    /* renamed from: M */
    @NotNull
    public static final Expression<DivGallery.CrossContentAlignment> f36009M;

    /* renamed from: M0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>> f36010M0;

    /* renamed from: N */
    @NotNull
    public static final Expression<Long> f36011N;

    /* renamed from: N0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f36012N0;

    /* renamed from: O */
    @NotNull
    public static final DivSize.WrapContent f36013O;

    /* renamed from: O0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>> f36014O0;

    /* renamed from: P */
    @NotNull
    public static final Expression<Long> f36015P;

    /* renamed from: P0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivBorder> f36016P0;

    /* renamed from: Q */
    @NotNull
    public static final DivEdgeInsets f36017Q;

    /* renamed from: Q0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f36018Q0;

    /* renamed from: R */
    @NotNull
    public static final Expression<DivGallery.Orientation> f36019R;

    /* renamed from: R0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f36020R0;

    /* renamed from: S */
    @NotNull
    public static final DivEdgeInsets f36021S;

    /* renamed from: S0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivGallery.CrossContentAlignment>> f36022S0;

    /* renamed from: T */
    @NotNull
    public static final Expression<Boolean> f36023T;

    /* renamed from: T0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f36024T0;

    /* renamed from: U */
    @NotNull
    public static final Expression<DivGallery.ScrollMode> f36025U;

    /* renamed from: U0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f36026U0;

    /* renamed from: V */
    @NotNull
    public static final DivTransform f36027V;

    /* renamed from: V0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>> f36028V0;

    /* renamed from: W */
    @NotNull
    public static final Expression<DivVisibility> f36029W;

    /* renamed from: W0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>> f36030W0;

    /* renamed from: X */
    @NotNull
    public static final DivSize.MatchParent f36031X;

    /* renamed from: X0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivFocus> f36032X0;

    /* renamed from: Y */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f36033Y;

    /* renamed from: Y0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f36034Y0;

    /* renamed from: Z */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f36035Z;

    /* renamed from: Z0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f36036Z0;

    /* renamed from: a0 */
    @NotNull
    public static final TypeHelper<DivGallery.CrossContentAlignment> f36037a0;

    /* renamed from: a1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f36038a1;

    /* renamed from: b0 */
    @NotNull
    public static final TypeHelper<DivGallery.Orientation> f36039b0;

    /* renamed from: b1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<Div>> f36040b1;

    /* renamed from: c0 */
    @NotNull
    public static final TypeHelper<DivGallery.ScrollMode> f36041c0;

    /* renamed from: c1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f36042c1;

    /* renamed from: d0 */
    @NotNull
    public static final TypeHelper<DivVisibility> f36043d0;

    /* renamed from: d1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivGallery.Orientation>> f36044d1;

    /* renamed from: e0 */
    @NotNull
    public static final ValueValidator<Double> f36045e0;

    /* renamed from: e1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f36046e1;

    /* renamed from: f0 */
    @NotNull
    public static final ValueValidator<Double> f36047f0;

    /* renamed from: f1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>> f36048f1;

    /* renamed from: g0 */
    @NotNull
    public static final ListValidator<DivBackground> f36049g0;

    /* renamed from: g1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f36050g1;

    /* renamed from: h0 */
    @NotNull
    public static final ListValidator<DivBackgroundTemplate> f36051h0;

    /* renamed from: h1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivGallery.ScrollMode>> f36052h1;

    /* renamed from: i0 */
    @NotNull
    public static final ValueValidator<Long> f36053i0;

    /* renamed from: i1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f36054i1;

    /* renamed from: j0 */
    @NotNull
    public static final ValueValidator<Long> f36055j0;

    /* renamed from: j1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>> f36056j1;

    /* renamed from: k0 */
    @NotNull
    public static final ValueValidator<Long> f36057k0;

    /* renamed from: k1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivTransform> f36058k1;

    /* renamed from: l0 */
    @NotNull
    public static final ValueValidator<Long> f36059l0;

    /* renamed from: l1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition> f36060l1;

    /* renamed from: m0 */
    @NotNull
    public static final ValueValidator<Long> f36061m0;

    /* renamed from: m1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f36062m1;

    /* renamed from: n0 */
    @NotNull
    public static final ValueValidator<Long> f36063n0;

    /* renamed from: n1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f36064n1;

    /* renamed from: o0 */
    @NotNull
    public static final ValueValidator<Long> f36065o0;

    /* renamed from: o1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>> f36066o1;

    /* renamed from: p0 */
    @NotNull
    public static final ValueValidator<Long> f36067p0;

    /* renamed from: p1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>> f36068p1;

    /* renamed from: q0 */
    @NotNull
    public static final ListValidator<DivDisappearAction> f36069q0;

    /* renamed from: q1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction> f36070q1;

    /* renamed from: r0 */
    @NotNull
    public static final ListValidator<DivDisappearActionTemplate> f36071r0;

    /* renamed from: r1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>> f36072r1;

    /* renamed from: s0 */
    @NotNull
    public static final ListValidator<DivExtension> f36073s0;

    /* renamed from: s1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f36074s1;

    /* renamed from: t0 */
    @NotNull
    public static final ListValidator<DivExtensionTemplate> f36075t0;

    /* renamed from: u0 */
    @NotNull
    public static final ValueValidator<String> f36076u0;

    /* renamed from: v0 */
    @NotNull
    public static final ValueValidator<String> f36077v0;

    /* renamed from: w0 */
    @NotNull
    public static final ValueValidator<Long> f36078w0;

    /* renamed from: x0 */
    @NotNull
    public static final ValueValidator<Long> f36079x0;

    /* renamed from: y0 */
    @NotNull
    public static final ListValidator<Div> f36080y0;

    /* renamed from: z0 */
    @NotNull
    public static final ListValidator<DivTemplate> f36081z0;

    /* renamed from: A */
    @JvmField
    @NotNull
    public final Field<DivTransformTemplate> f36082A;

    /* renamed from: B */
    @JvmField
    @NotNull
    public final Field<DivChangeTransitionTemplate> f36083B;

    /* renamed from: C */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f36084C;

    /* renamed from: D */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f36085D;

    /* renamed from: E */
    @JvmField
    @NotNull
    public final Field<List<DivTransitionTrigger>> f36086E;

    /* renamed from: F */
    @JvmField
    @NotNull
    public final Field<Expression<DivVisibility>> f36087F;

    /* renamed from: G */
    @JvmField
    @NotNull
    public final Field<DivVisibilityActionTemplate> f36088G;

    /* renamed from: H */
    @JvmField
    @NotNull
    public final Field<List<DivVisibilityActionTemplate>> f36089H;

    /* renamed from: I */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f36090I;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<DivAccessibilityTemplate> f36091a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f36092b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f36093c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f36094d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f36095e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final Field<DivBorderTemplate> f36096f;

    /* renamed from: g */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f36097g;

    /* renamed from: h */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f36098h;

    /* renamed from: i */
    @JvmField
    @NotNull
    public final Field<Expression<DivGallery.CrossContentAlignment>> f36099i;

    /* renamed from: j */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f36100j;

    /* renamed from: k */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f36101k;

    /* renamed from: l */
    @JvmField
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f36102l;

    /* renamed from: m */
    @JvmField
    @NotNull
    public final Field<List<DivExtensionTemplate>> f36103m;

    /* renamed from: n */
    @JvmField
    @NotNull
    public final Field<DivFocusTemplate> f36104n;

    /* renamed from: o */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f36105o;

    /* renamed from: p */
    @JvmField
    @NotNull
    public final Field<String> f36106p;

    /* renamed from: q */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f36107q;

    /* renamed from: r */
    @JvmField
    @NotNull
    public final Field<List<DivTemplate>> f36108r;

    /* renamed from: s */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f36109s;

    /* renamed from: t */
    @JvmField
    @NotNull
    public final Field<Expression<DivGallery.Orientation>> f36110t;

    /* renamed from: u */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f36111u;

    /* renamed from: v */
    @JvmField
    @NotNull
    public final Field<Expression<Boolean>> f36112v;

    /* renamed from: w */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f36113w;

    /* renamed from: x */
    @JvmField
    @NotNull
    public final Field<Expression<DivGallery.ScrollMode>> f36114x;

    /* renamed from: y */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f36115y;

    /* renamed from: z */
    @JvmField
    @NotNull
    public final Field<List<DivTooltipTemplate>> f36116z;

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u000bR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u000bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u000bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u000bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u000bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u000bR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0010R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0010R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0010R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0010R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u000bR\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020-0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u000bR\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0010R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0010R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00160\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\bR\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u000bR\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u000bR\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\bR\u0014\u0010<\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00109R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010\bR\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\u000bR\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\u000bR\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010\bR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010\u0010R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010\u0010R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010\u0010R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010\u0010R\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010\u0010R\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020N0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010\u0010R\u0014\u0010Q\u001a\u00020-8\u0006X\u0086T¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020T0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020W0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010VR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u001b0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010VR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020:0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010VR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020A0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010VR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010VR\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020^0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010\u0010R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020`0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010\u0010R\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020\\0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010\bR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010e¨\u0006f"}, m31884d2 = {"Lcom/yandex/div2/DivGalleryTemplate$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackgroundTemplate;", "BACKGROUND_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "", "COLUMN_COUNT_TEMPLATE_VALIDATOR", "COLUMN_COUNT_VALIDATOR", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivGallery$CrossContentAlignment;", "CROSS_CONTENT_ALIGNMENT_DEFAULT_VALUE", "CROSS_SPACING_TEMPLATE_VALIDATOR", "CROSS_SPACING_VALIDATOR", "DEFAULT_ITEM_DEFAULT_VALUE", "DEFAULT_ITEM_TEMPLATE_VALIDATOR", "DEFAULT_ITEM_VALIDATOR", "Lcom/yandex/div2/DivDisappearActionTemplate;", "DISAPPEAR_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivExtensionTemplate;", "EXTENSIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div2/DivTemplate;", "ITEMS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/Div;", "ITEMS_VALIDATOR", "ITEM_SPACING_DEFAULT_VALUE", "ITEM_SPACING_TEMPLATE_VALIDATOR", "ITEM_SPACING_VALIDATOR", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "Lcom/yandex/div2/DivGallery$Orientation;", "ORIENTATION_DEFAULT_VALUE", "PADDINGS_DEFAULT_VALUE", "", "RESTRICT_PARENT_SCROLL_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "Lcom/yandex/div2/DivGallery$ScrollMode;", "SCROLL_MODE_DEFAULT_VALUE", "Lcom/yandex/div2/DivActionTemplate;", "SELECTED_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivAction;", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivTooltipTemplate;", "TOOLTIPS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_TEMPLATE_VALIDATOR", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "TYPE_HELPER_CROSS_CONTENT_ALIGNMENT", "TYPE_HELPER_ORIENTATION", "TYPE_HELPER_SCROLL_MODE", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/DivVisibilityActionTemplate;", "VISIBILITY_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f36005K = companion.m17539a(Double.valueOf(1.0d));
        f36007L = new DivBorder(null, null, null, null, null, 31);
        f36009M = companion.m17539a(DivGallery.CrossContentAlignment.START);
        f36011N = companion.m17539a(0L);
        f36013O = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7));
        f36015P = companion.m17539a(8L);
        f36017Q = new DivEdgeInsets(null, null, null, null, null, 31);
        f36019R = companion.m17539a(DivGallery.Orientation.HORIZONTAL);
        f36021S = new DivEdgeInsets(null, null, null, null, null, 31);
        f36023T = companion.m17539a(Boolean.FALSE);
        f36025U = companion.m17539a(DivGallery.ScrollMode.DEFAULT);
        f36027V = new DivTransform(null, null, null, 7);
        f36029W = companion.m17539a(DivVisibility.VISIBLE);
        f36031X = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i2 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f36033Y = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f36035Z = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f36037a0 = companion2.m17372a(ArraysKt.m31926B(DivGallery.CrossContentAlignment.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$TYPE_HELPER_CROSS_CONTENT_ALIGNMENT$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivGallery.CrossContentAlignment);
            }
        });
        f36039b0 = companion2.m17372a(ArraysKt.m31926B(DivGallery.Orientation.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$TYPE_HELPER_ORIENTATION$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivGallery.Orientation);
            }
        });
        f36041c0 = companion2.m17372a(ArraysKt.m31926B(DivGallery.ScrollMode.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$TYPE_HELPER_SCROLL_MODE$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivGallery.ScrollMode);
            }
        });
        f36043d0 = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f36045e0 = C3057m.f41682e;
        f36047f0 = C3057m.f41689l;
        f36049g0 = C3059n.f41742d;
        f36051h0 = C3059n.f41745g;
        f36053i0 = C3057m.f41692o;
        f36055j0 = C3057m.f41693p;
        f36057k0 = C3057m.f41694q;
        f36059l0 = C3057m.f41695r;
        f36061m0 = C3057m.f41696s;
        f36063n0 = C3057m.f41697t;
        f36065o0 = C3057m.f41683f;
        f36067p0 = C3057m.f41684g;
        f36069q0 = C3053k.f41607v;
        f36071r0 = C3053k.f41608w;
        f36073s0 = C3053k.f41609x;
        f36075t0 = C3053k.f41610y;
        f36076u0 = C3057m.f41685h;
        f36077v0 = C3057m.f41686i;
        f36078w0 = C3057m.f41687j;
        f36079x0 = C3057m.f41688k;
        f36080y0 = C3053k.f41611z;
        f36081z0 = C3053k.f41582A;
        f35994A0 = C3057m.f41690m;
        f35995B0 = C3057m.f41691n;
        f35996C0 = C3053k.f41583B;
        f35997D0 = C3053k.f41584C;
        f35998E0 = C3053k.f41585D;
        f35999F0 = C3053k.f41586E;
        f36000G0 = C3059n.f41740b;
        f36001H0 = C3059n.f41741c;
        f36002I0 = C3059n.f41743e;
        f36004J0 = C3059n.f41744f;
        f36006K0 = new Function3<String, JSONObject, ParsingEnvironment, DivAccessibility>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$ACCESSIBILITY_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAccessibility mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAccessibility.Companion companion3 = DivAccessibility.f34479f;
                DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject2, str2, DivAccessibility.f34486m, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divAccessibility == null ? DivGalleryTemplate.f36003J : divAccessibility;
            }
        };
        f36008L0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$ALIGNMENT_HORIZONTAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentHorizontal> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentHorizontal.f34618d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivGalleryTemplate.f36033Y);
            }
        };
        f36010M0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$ALIGNMENT_VERTICAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentVertical> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentVertical.Converter converter = DivAlignmentVertical.f34625c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentVertical.f34626d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivGalleryTemplate.f36035Z);
            }
        };
        f36012N0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$ALPHA_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
                ValueValidator<Double> valueValidator = DivGalleryTemplate.f36047f0;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Double> expression = DivGalleryTemplate.f36005K;
                Expression<Double> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
                return m17328t == null ? expression : m17328t;
            }
        };
        f36014O0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$BACKGROUND_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivBackground> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBackground.Companion companion3 = DivBackground.f34750a;
                return JsonParser.m17333y(jSONObject2, str2, DivBackground.f34751b, DivGalleryTemplate.f36049g0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36016P0 = new Function3<String, JSONObject, ParsingEnvironment, DivBorder>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$BORDER_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivBorder mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBorder.Companion companion3 = DivBorder.f34785f;
                DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject2, str2, DivBorder.f34788i, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divBorder == null ? DivGalleryTemplate.f36007L : divBorder;
            }
        };
        f36018Q0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$COLUMN_COUNT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivGalleryTemplate.f36055j0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f36020R0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$COLUMN_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivGalleryTemplate.f36059l0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f36022S0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivGallery.CrossContentAlignment>>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$CROSS_CONTENT_ALIGNMENT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivGallery.CrossContentAlignment> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivGallery.CrossContentAlignment.Converter converter = DivGallery.CrossContentAlignment.f35972c;
                Function1<String, DivGallery.CrossContentAlignment> function1 = DivGallery.CrossContentAlignment.f35973d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivGallery.CrossContentAlignment> expression = DivGalleryTemplate.f36009M;
                Expression<DivGallery.CrossContentAlignment> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivGalleryTemplate.f36037a0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f36024T0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$CROSS_SPACING_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivGalleryTemplate.f36063n0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f36026U0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$DEFAULT_ITEM_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivGalleryTemplate.f36067p0;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivGalleryTemplate.f36011N;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        f36028V0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$DISAPPEAR_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivDisappearAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivDisappearAction.Companion companion3 = DivDisappearAction.f35537a;
                return JsonParser.m17333y(jSONObject2, str2, DivDisappearAction.f35545i, DivGalleryTemplate.f36069q0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36030W0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$EXTENSIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivExtension> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivExtension.Companion companion3 = DivExtension.f35659c;
                return JsonParser.m17333y(jSONObject2, str2, DivExtension.f35660d, DivGalleryTemplate.f36073s0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36032X0 = new Function3<String, JSONObject, ParsingEnvironment, DivFocus>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$FOCUS_READER$1
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
        f36034Y0 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$HEIGHT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivGalleryTemplate.f36013O : divSize;
            }
        };
        f36036Z0 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$ID_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return (String) JsonParser.m17323o(jSONObject2, str2, DivGalleryTemplate.f36077v0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36038a1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$ITEM_SPACING_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivGalleryTemplate.f36079x0;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivGalleryTemplate.f36015P;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        f36040b1 = new Function3<String, JSONObject, ParsingEnvironment, List<Div>>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$ITEMS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<Div> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Div.Companion companion3 = Div.f34418a;
                List<Div> m17321m = JsonParser.m17321m(jSONObject2, str2, Div.f34419b, DivGalleryTemplate.f36080y0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                Intrinsics.m32178g(m17321m, "readList(json, key, Div.…LIDATOR, env.logger, env)");
                return m17321m;
            }
        };
        f36042c1 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$MARGINS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivGalleryTemplate.f36017Q : divEdgeInsets;
            }
        };
        f36044d1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivGallery.Orientation>>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$ORIENTATION_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivGallery.Orientation> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivGallery.Orientation.Converter converter = DivGallery.Orientation.f35980c;
                Function1<String, DivGallery.Orientation> function1 = DivGallery.Orientation.f35981d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivGallery.Orientation> expression = DivGalleryTemplate.f36019R;
                Expression<DivGallery.Orientation> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivGalleryTemplate.f36039b0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f36046e1 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$PADDINGS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivGalleryTemplate.f36021S : divEdgeInsets;
            }
        };
        f36048f1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$RESTRICT_PARENT_SCROLL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Boolean> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Object, Boolean> function1 = ParsingConvertersKt.f33829c;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Boolean> expression = DivGalleryTemplate.f36023T;
                Expression<Boolean> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33848a);
                return m17330v == null ? expression : m17330v;
            }
        };
        f36050g1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$ROW_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivGalleryTemplate.f35995B0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f36052h1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivGallery.ScrollMode>>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$SCROLL_MODE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivGallery.ScrollMode> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivGallery.ScrollMode.Converter converter = DivGallery.ScrollMode.f35987c;
                Function1<String, DivGallery.ScrollMode> function1 = DivGallery.ScrollMode.f35988d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivGallery.ScrollMode> expression = DivGalleryTemplate.f36025U;
                Expression<DivGallery.ScrollMode> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivGalleryTemplate.f36041c0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f36054i1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$SELECTED_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivGalleryTemplate.f35996C0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36056j1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$TOOLTIPS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTooltip> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTooltip.Companion companion3 = DivTooltip.f40492h;
                return JsonParser.m17333y(jSONObject2, str2, DivTooltip.f40497m, DivGalleryTemplate.f35998E0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36058k1 = new Function3<String, JSONObject, ParsingEnvironment, DivTransform>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$TRANSFORM_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivTransform mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransform.Companion companion3 = DivTransform.f40551d;
                DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject2, str2, DivTransform.f40554g, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divTransform == null ? DivGalleryTemplate.f36027V : divTransform;
            }
        };
        f36060l1 = new Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$TRANSITION_CHANGE_READER$1
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
        f36062m1 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$TRANSITION_IN_READER$1
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
        f36064n1 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$TRANSITION_OUT_READER$1
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
        f36066o1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$TRANSITION_TRIGGERS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTransitionTrigger> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransitionTrigger.Converter converter = DivTransitionTrigger.f40582c;
                return JsonParser.m17332x(jSONObject2, str2, DivTransitionTrigger.f40583d, DivGalleryTemplate.f36000G0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        DivGalleryTemplate$Companion$TYPE_READER$1 divGalleryTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$TYPE_READER$1
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
        f36068p1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$VISIBILITY_READER$1
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
                Expression<DivVisibility> expression = DivGalleryTemplate.f36029W;
                Expression<DivVisibility> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivGalleryTemplate.f36043d0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f36070q1 = new Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$VISIBILITY_ACTION_READER$1
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
        f36072r1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$VISIBILITY_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivVisibilityAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivVisibilityAction.Companion companion3 = DivVisibilityAction.f40938i;
                return JsonParser.m17333y(jSONObject2, str2, DivVisibilityAction.f40946q, DivGalleryTemplate.f36002I0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36074s1 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$WIDTH_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivGalleryTemplate.f36031X : divSize;
            }
        };
        DivGalleryTemplate$Companion$CREATOR$1 divGalleryTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivGalleryTemplate>() { // from class: com.yandex.div2.DivGalleryTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivGalleryTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivGalleryTemplate(env, null, false, it);
            }
        };
    }

    public DivGalleryTemplate(@NotNull ParsingEnvironment env, @Nullable DivGalleryTemplate divGalleryTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        Field<DivAccessibilityTemplate> field = divGalleryTemplate == null ? null : divGalleryTemplate.f36091a;
        DivAccessibilityTemplate.Companion companion = DivAccessibilityTemplate.f34515g;
        this.f36091a = JsonTemplateParser.m17354o(json, "accessibility", z, field, DivAccessibilityTemplate.f34531w, f34328a, env);
        Field<Expression<DivAlignmentHorizontal>> field2 = divGalleryTemplate == null ? null : divGalleryTemplate.f36092b;
        DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
        this.f36092b = JsonTemplateParser.m17358s(json, "alignment_horizontal", z, field2, DivAlignmentHorizontal.f34618d, f34328a, env, f36033Y);
        Field<Expression<DivAlignmentVertical>> field3 = divGalleryTemplate == null ? null : divGalleryTemplate.f36093c;
        DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
        this.f36093c = JsonTemplateParser.m17358s(json, "alignment_vertical", z, field3, DivAlignmentVertical.f34626d, f34328a, env, f36035Z);
        this.f36094d = JsonTemplateParser.m17357r(json, "alpha", z, divGalleryTemplate == null ? null : divGalleryTemplate.f36094d, ParsingConvertersKt.f33830d, f36045e0, f34328a, env, TypeHelpersKt.f33851d);
        Field<List<DivBackgroundTemplate>> field4 = divGalleryTemplate == null ? null : divGalleryTemplate.f36095e;
        DivBackgroundTemplate.Companion companion2 = DivBackgroundTemplate.f34758a;
        this.f36095e = JsonTemplateParser.m17360u(json, "background", z, field4, DivBackgroundTemplate.f34759b, f36051h0, f34328a, env);
        Field<DivBorderTemplate> field5 = divGalleryTemplate == null ? null : divGalleryTemplate.f36096f;
        DivBorderTemplate.Companion companion3 = DivBorderTemplate.f34795f;
        this.f36096f = JsonTemplateParser.m17354o(json, "border", z, field5, DivBorderTemplate.f34804o, f34328a, env);
        Field<Expression<Long>> field6 = divGalleryTemplate == null ? null : divGalleryTemplate.f36097g;
        Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
        ValueValidator<Long> valueValidator = f36053i0;
        TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
        this.f36097g = JsonTemplateParser.m17357r(json, "column_count", z, field6, function1, valueValidator, f34328a, env, typeHelper);
        this.f36098h = JsonTemplateParser.m17357r(json, "column_span", z, divGalleryTemplate == null ? null : divGalleryTemplate.f36098h, function1, f36057k0, f34328a, env, typeHelper);
        Field<Expression<DivGallery.CrossContentAlignment>> field7 = divGalleryTemplate == null ? null : divGalleryTemplate.f36099i;
        DivGallery.CrossContentAlignment.Converter converter3 = DivGallery.CrossContentAlignment.f35972c;
        this.f36099i = JsonTemplateParser.m17358s(json, "cross_content_alignment", z, field7, DivGallery.CrossContentAlignment.f35973d, f34328a, env, f36037a0);
        this.f36100j = JsonTemplateParser.m17357r(json, "cross_spacing", z, divGalleryTemplate == null ? null : divGalleryTemplate.f36100j, function1, f36061m0, f34328a, env, typeHelper);
        this.f36101k = JsonTemplateParser.m17357r(json, "default_item", z, divGalleryTemplate == null ? null : divGalleryTemplate.f36101k, function1, f36065o0, f34328a, env, typeHelper);
        Field<List<DivDisappearActionTemplate>> field8 = divGalleryTemplate == null ? null : divGalleryTemplate.f36102l;
        DivDisappearActionTemplate.Companion companion4 = DivDisappearActionTemplate.f35550i;
        this.f36102l = JsonTemplateParser.m17360u(json, "disappear_actions", z, field8, DivDisappearActionTemplate.f35549C, f36071r0, f34328a, env);
        Field<List<DivExtensionTemplate>> field9 = divGalleryTemplate == null ? null : divGalleryTemplate.f36103m;
        DivExtensionTemplate.Companion companion5 = DivExtensionTemplate.f35664c;
        this.f36103m = JsonTemplateParser.m17360u(json, "extensions", z, field9, DivExtensionTemplate.f35667f, f36075t0, f34328a, env);
        Field<DivFocusTemplate> field10 = divGalleryTemplate == null ? null : divGalleryTemplate.f36104n;
        DivFocusTemplate.Companion companion6 = DivFocusTemplate.f35833f;
        this.f36104n = JsonTemplateParser.m17354o(json, "focus", z, field10, DivFocusTemplate.f35846s, f34328a, env);
        Field<DivSizeTemplate> field11 = divGalleryTemplate == null ? null : divGalleryTemplate.f36105o;
        DivSizeTemplate.Companion companion7 = DivSizeTemplate.f38839a;
        Function2<ParsingEnvironment, JSONObject, DivSizeTemplate> function2 = DivSizeTemplate.f38840b;
        this.f36105o = JsonTemplateParser.m17354o(json, "height", z, field11, function2, f34328a, env);
        this.f36106p = JsonTemplateParser.m17351l(json, "id", z, divGalleryTemplate == null ? null : divGalleryTemplate.f36106p, f36076u0, f34328a, env);
        this.f36107q = JsonTemplateParser.m17357r(json, "item_spacing", z, divGalleryTemplate == null ? null : divGalleryTemplate.f36107q, function1, f36078w0, f34328a, env, typeHelper);
        Field<List<DivTemplate>> field12 = divGalleryTemplate == null ? null : divGalleryTemplate.f36108r;
        DivTemplate.Companion companion8 = DivTemplate.f39864a;
        this.f36108r = JsonTemplateParser.m17350k(json, "items", z, field12, DivTemplate.f39865b, f36081z0, f34328a, env);
        Field<DivEdgeInsetsTemplate> field13 = divGalleryTemplate == null ? null : divGalleryTemplate.f36109s;
        DivEdgeInsetsTemplate.Companion companion9 = DivEdgeInsetsTemplate.f35626f;
        Function2<ParsingEnvironment, JSONObject, DivEdgeInsetsTemplate> function22 = DivEdgeInsetsTemplate.f35646z;
        this.f36109s = JsonTemplateParser.m17354o(json, "margins", z, field13, function22, f34328a, env);
        Field<Expression<DivGallery.Orientation>> field14 = divGalleryTemplate == null ? null : divGalleryTemplate.f36110t;
        DivGallery.Orientation.Converter converter4 = DivGallery.Orientation.f35980c;
        this.f36110t = JsonTemplateParser.m17358s(json, "orientation", z, field14, DivGallery.Orientation.f35981d, f34328a, env, f36039b0);
        this.f36111u = JsonTemplateParser.m17354o(json, "paddings", z, divGalleryTemplate == null ? null : divGalleryTemplate.f36111u, function22, f34328a, env);
        this.f36112v = JsonTemplateParser.m17358s(json, "restrict_parent_scroll", z, divGalleryTemplate == null ? null : divGalleryTemplate.f36112v, ParsingConvertersKt.f33829c, f34328a, env, TypeHelpersKt.f33848a);
        this.f36113w = JsonTemplateParser.m17357r(json, "row_span", z, divGalleryTemplate == null ? null : divGalleryTemplate.f36113w, function1, f35994A0, f34328a, env, typeHelper);
        Field<Expression<DivGallery.ScrollMode>> field15 = divGalleryTemplate == null ? null : divGalleryTemplate.f36114x;
        DivGallery.ScrollMode.Converter converter5 = DivGallery.ScrollMode.f35987c;
        this.f36114x = JsonTemplateParser.m17358s(json, "scroll_mode", z, field15, DivGallery.ScrollMode.f35988d, f34328a, env, f36041c0);
        Field<List<DivActionTemplate>> field16 = divGalleryTemplate == null ? null : divGalleryTemplate.f36115y;
        DivActionTemplate.Companion companion10 = DivActionTemplate.f34572i;
        this.f36115y = JsonTemplateParser.m17360u(json, "selected_actions", z, field16, DivActionTemplate.f34586w, f35997D0, f34328a, env);
        Field<List<DivTooltipTemplate>> field17 = divGalleryTemplate == null ? null : divGalleryTemplate.f36116z;
        DivTooltipTemplate.Companion companion11 = DivTooltipTemplate.f40520h;
        this.f36116z = JsonTemplateParser.m17360u(json, "tooltips", z, field17, DivTooltipTemplate.f40534v, f35999F0, f34328a, env);
        Field<DivTransformTemplate> field18 = divGalleryTemplate == null ? null : divGalleryTemplate.f36082A;
        DivTransformTemplate.Companion companion12 = DivTransformTemplate.f40559d;
        this.f36082A = JsonTemplateParser.m17354o(json, "transform", z, field18, DivTransformTemplate.f40565j, f34328a, env);
        Field<DivChangeTransitionTemplate> field19 = divGalleryTemplate == null ? null : divGalleryTemplate.f36083B;
        DivChangeTransitionTemplate.Companion companion13 = DivChangeTransitionTemplate.f34861a;
        this.f36083B = JsonTemplateParser.m17354o(json, "transition_change", z, field19, DivChangeTransitionTemplate.f34862b, f34328a, env);
        Field<DivAppearanceTransitionTemplate> field20 = divGalleryTemplate == null ? null : divGalleryTemplate.f36084C;
        DivAppearanceTransitionTemplate.Companion companion14 = DivAppearanceTransitionTemplate.f34733a;
        Function2<ParsingEnvironment, JSONObject, DivAppearanceTransitionTemplate> function23 = DivAppearanceTransitionTemplate.f34734b;
        this.f36084C = JsonTemplateParser.m17354o(json, "transition_in", z, field20, function23, f34328a, env);
        this.f36085D = JsonTemplateParser.m17354o(json, "transition_out", z, divGalleryTemplate == null ? null : divGalleryTemplate.f36085D, function23, f34328a, env);
        Field<List<DivTransitionTrigger>> field21 = divGalleryTemplate == null ? null : divGalleryTemplate.f36086E;
        DivTransitionTrigger.Converter converter6 = DivTransitionTrigger.f40582c;
        this.f36086E = JsonTemplateParser.m17359t(json, "transition_triggers", z, field21, DivTransitionTrigger.f40583d, f36001H0, f34328a, env);
        Field<Expression<DivVisibility>> field22 = divGalleryTemplate == null ? null : divGalleryTemplate.f36087F;
        DivVisibility.Converter converter7 = DivVisibility.f40930c;
        this.f36087F = JsonTemplateParser.m17358s(json, "visibility", z, field22, DivVisibility.f40931d, f34328a, env, f36043d0);
        Field<DivVisibilityActionTemplate> field23 = divGalleryTemplate == null ? null : divGalleryTemplate.f36088G;
        DivVisibilityActionTemplate.Companion companion15 = DivVisibilityActionTemplate.f40959i;
        Function2<ParsingEnvironment, JSONObject, DivVisibilityActionTemplate> function24 = DivVisibilityActionTemplate.f40958C;
        this.f36088G = JsonTemplateParser.m17354o(json, "visibility_action", z, field23, function24, f34328a, env);
        this.f36089H = JsonTemplateParser.m17360u(json, "visibility_actions", z, divGalleryTemplate == null ? null : divGalleryTemplate.f36089H, function24, f36004J0, f34328a, env);
        this.f36090I = JsonTemplateParser.m17354o(json, "width", z, divGalleryTemplate == null ? null : divGalleryTemplate.f36090I, function2, f34328a, env);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivGallery mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        DivAccessibility divAccessibility = (DivAccessibility) FieldKt.m17381g(this.f36091a, env, "accessibility", data, f36006K0);
        if (divAccessibility == null) {
            divAccessibility = f36003J;
        }
        DivAccessibility divAccessibility2 = divAccessibility;
        Expression expression = (Expression) FieldKt.m17378d(this.f36092b, env, "alignment_horizontal", data, f36008L0);
        Expression expression2 = (Expression) FieldKt.m17378d(this.f36093c, env, "alignment_vertical", data, f36010M0);
        Expression<Double> expression3 = (Expression) FieldKt.m17378d(this.f36094d, env, "alpha", data, f36012N0);
        if (expression3 == null) {
            expression3 = f36005K;
        }
        Expression<Double> expression4 = expression3;
        List m17382h = FieldKt.m17382h(this.f36095e, env, "background", data, f36049g0, f36014O0);
        DivBorder divBorder = (DivBorder) FieldKt.m17381g(this.f36096f, env, "border", data, f36016P0);
        if (divBorder == null) {
            divBorder = f36007L;
        }
        DivBorder divBorder2 = divBorder;
        Expression expression5 = (Expression) FieldKt.m17378d(this.f36097g, env, "column_count", data, f36018Q0);
        Expression expression6 = (Expression) FieldKt.m17378d(this.f36098h, env, "column_span", data, f36020R0);
        Expression<DivGallery.CrossContentAlignment> expression7 = (Expression) FieldKt.m17378d(this.f36099i, env, "cross_content_alignment", data, f36022S0);
        if (expression7 == null) {
            expression7 = f36009M;
        }
        Expression<DivGallery.CrossContentAlignment> expression8 = expression7;
        Expression expression9 = (Expression) FieldKt.m17378d(this.f36100j, env, "cross_spacing", data, f36024T0);
        Expression<Long> expression10 = (Expression) FieldKt.m17378d(this.f36101k, env, "default_item", data, f36026U0);
        if (expression10 == null) {
            expression10 = f36011N;
        }
        Expression<Long> expression11 = expression10;
        List m17382h2 = FieldKt.m17382h(this.f36102l, env, "disappear_actions", data, f36069q0, f36028V0);
        List m17382h3 = FieldKt.m17382h(this.f36103m, env, "extensions", data, f36073s0, f36030W0);
        DivFocus divFocus = (DivFocus) FieldKt.m17381g(this.f36104n, env, "focus", data, f36032X0);
        DivSize divSize = (DivSize) FieldKt.m17381g(this.f36105o, env, "height", data, f36034Y0);
        if (divSize == null) {
            divSize = f36013O;
        }
        DivSize divSize2 = divSize;
        String str = (String) FieldKt.m17378d(this.f36106p, env, "id", data, f36036Z0);
        Expression<Long> expression12 = (Expression) FieldKt.m17378d(this.f36107q, env, "item_spacing", data, f36038a1);
        if (expression12 == null) {
            expression12 = f36015P;
        }
        Expression<Long> expression13 = expression12;
        List m17384j = FieldKt.m17384j(this.f36108r, env, "items", data, f36080y0, f36040b1);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) FieldKt.m17381g(this.f36109s, env, "margins", data, f36042c1);
        if (divEdgeInsets == null) {
            divEdgeInsets = f36017Q;
        }
        DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
        Expression<DivGallery.Orientation> expression14 = (Expression) FieldKt.m17378d(this.f36110t, env, "orientation", data, f36044d1);
        if (expression14 == null) {
            expression14 = f36019R;
        }
        Expression<DivGallery.Orientation> expression15 = expression14;
        DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) FieldKt.m17381g(this.f36111u, env, "paddings", data, f36046e1);
        if (divEdgeInsets3 == null) {
            divEdgeInsets3 = f36021S;
        }
        DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
        Expression<Boolean> expression16 = (Expression) FieldKt.m17378d(this.f36112v, env, "restrict_parent_scroll", data, f36048f1);
        if (expression16 == null) {
            expression16 = f36023T;
        }
        Expression<Boolean> expression17 = expression16;
        Expression expression18 = (Expression) FieldKt.m17378d(this.f36113w, env, "row_span", data, f36050g1);
        Expression<DivGallery.ScrollMode> expression19 = (Expression) FieldKt.m17378d(this.f36114x, env, "scroll_mode", data, f36052h1);
        if (expression19 == null) {
            expression19 = f36025U;
        }
        Expression<DivGallery.ScrollMode> expression20 = expression19;
        List m17382h4 = FieldKt.m17382h(this.f36115y, env, "selected_actions", data, f35996C0, f36054i1);
        List m17382h5 = FieldKt.m17382h(this.f36116z, env, "tooltips", data, f35998E0, f36056j1);
        DivTransform divTransform = (DivTransform) FieldKt.m17381g(this.f36082A, env, "transform", data, f36058k1);
        if (divTransform == null) {
            divTransform = f36027V;
        }
        DivTransform divTransform2 = divTransform;
        DivChangeTransition divChangeTransition = (DivChangeTransition) FieldKt.m17381g(this.f36083B, env, "transition_change", data, f36060l1);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) FieldKt.m17381g(this.f36084C, env, "transition_in", data, f36062m1);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) FieldKt.m17381g(this.f36085D, env, "transition_out", data, f36064n1);
        List m17380f = FieldKt.m17380f(this.f36086E, env, "transition_triggers", data, f36000G0, f36066o1);
        Expression<DivVisibility> expression21 = (Expression) FieldKt.m17378d(this.f36087F, env, "visibility", data, f36068p1);
        if (expression21 == null) {
            expression21 = f36029W;
        }
        Expression<DivVisibility> expression22 = expression21;
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) FieldKt.m17381g(this.f36088G, env, "visibility_action", data, f36070q1);
        List m17382h6 = FieldKt.m17382h(this.f36089H, env, "visibility_actions", data, f36002I0, f36072r1);
        DivSize divSize3 = (DivSize) FieldKt.m17381g(this.f36090I, env, "width", data, f36074s1);
        if (divSize3 == null) {
            divSize3 = f36031X;
        }
        return new DivGallery(divAccessibility2, expression, expression2, expression4, m17382h, divBorder2, expression5, expression6, expression8, expression9, expression11, m17382h2, m17382h3, divFocus, divSize2, str, expression13, m17384j, divEdgeInsets2, expression15, divEdgeInsets4, expression17, expression18, expression20, m17382h4, m17382h5, divTransform2, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17380f, expression22, divVisibilityAction, m17382h6, divSize3);
    }
}
