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
import com.yandex.div2.DivDrawable;
import com.yandex.div2.DivDrawableTemplate;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivEdgeInsetsTemplate;
import com.yandex.div2.DivExtension;
import com.yandex.div2.DivExtensionTemplate;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivFocusTemplate;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivPoint;
import com.yandex.div2.DivPointTemplate;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeTemplate;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivSlider;
import com.yandex.div2.DivSliderTemplate;
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

/* compiled from: DivSliderTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div2/DivSliderTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivSlider;", "Companion", "TextStyleTemplate", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivSliderTemplate implements JSONSerializable, JsonTemplate<DivSlider> {

    /* renamed from: A0 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f38995A0;

    /* renamed from: B0 */
    @NotNull
    public static final ListValidator<DivVisibilityActionTemplate> f38996B0;

    /* renamed from: C0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAccessibility> f38997C0;

    /* renamed from: D0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>> f38998D0;

    /* renamed from: E0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>> f38999E0;

    /* renamed from: F0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f39000F0;

    /* renamed from: G0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>> f39001G0;

    /* renamed from: H0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivBorder> f39002H0;

    /* renamed from: I0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f39003I0;

    /* renamed from: J0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>> f39004J0;

    /* renamed from: K0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>> f39005K0;

    /* renamed from: L0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivFocus> f39006L0;

    /* renamed from: M0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f39007M0;

    /* renamed from: N */
    @NotNull
    public static final DivAccessibility f39008N = new DivAccessibility(null, null, null, null, null, null, 63);

    /* renamed from: N0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f39009N0;

    /* renamed from: O */
    @NotNull
    public static final Expression<Double> f39010O;

    /* renamed from: O0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f39011O0;

    /* renamed from: P */
    @NotNull
    public static final DivBorder f39012P;

    /* renamed from: P0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f39013P0;

    /* renamed from: Q */
    @NotNull
    public static final DivSize.WrapContent f39014Q;

    /* renamed from: Q0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f39015Q0;

    /* renamed from: R */
    @NotNull
    public static final DivEdgeInsets f39016R;

    /* renamed from: R0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f39017R0;

    /* renamed from: S */
    @NotNull
    public static final Expression<Long> f39018S;

    /* renamed from: S0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f39019S0;

    /* renamed from: T */
    @NotNull
    public static final Expression<Long> f39020T;

    /* renamed from: T0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAccessibility> f39021T0;

    /* renamed from: U */
    @NotNull
    public static final DivEdgeInsets f39022U;

    /* renamed from: U0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f39023U0;

    /* renamed from: V */
    @NotNull
    public static final DivAccessibility f39024V;

    /* renamed from: V0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivDrawable> f39025V0;

    /* renamed from: W */
    @NotNull
    public static final DivTransform f39026W;

    /* renamed from: W0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSlider.TextStyle> f39027W0;

    /* renamed from: X */
    @NotNull
    public static final Expression<DivVisibility> f39028X;

    /* renamed from: X0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f39029X0;

    /* renamed from: Y */
    @NotNull
    public static final DivSize.MatchParent f39030Y;

    /* renamed from: Y0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivDrawable> f39031Y0;

    /* renamed from: Z */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f39032Z;

    /* renamed from: Z0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSlider.TextStyle> f39033Z0;

    /* renamed from: a0 */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f39034a0;

    /* renamed from: a1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f39035a1;

    /* renamed from: b0 */
    @NotNull
    public static final TypeHelper<DivVisibility> f39036b0;

    /* renamed from: b1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivDrawable> f39037b1;

    /* renamed from: c0 */
    @NotNull
    public static final ValueValidator<Double> f39038c0;

    /* renamed from: c1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivDrawable> f39039c1;

    /* renamed from: d0 */
    @NotNull
    public static final ValueValidator<Double> f39040d0;

    /* renamed from: d1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>> f39041d1;

    /* renamed from: e0 */
    @NotNull
    public static final ListValidator<DivBackground> f39042e0;

    /* renamed from: e1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivDrawable> f39043e1;

    /* renamed from: f0 */
    @NotNull
    public static final ListValidator<DivBackgroundTemplate> f39044f0;

    /* renamed from: f1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivDrawable> f39045f1;

    /* renamed from: g0 */
    @NotNull
    public static final ValueValidator<Long> f39046g0;

    /* renamed from: g1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivTransform> f39047g1;

    /* renamed from: h0 */
    @NotNull
    public static final ValueValidator<Long> f39048h0;

    /* renamed from: h1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition> f39049h1;

    /* renamed from: i0 */
    @NotNull
    public static final ListValidator<DivDisappearAction> f39050i0;

    /* renamed from: i1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f39051i1;

    /* renamed from: j0 */
    @NotNull
    public static final ListValidator<DivDisappearActionTemplate> f39052j0;

    /* renamed from: j1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f39053j1;

    /* renamed from: k0 */
    @NotNull
    public static final ListValidator<DivExtension> f39054k0;

    /* renamed from: k1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>> f39055k1;

    /* renamed from: l0 */
    @NotNull
    public static final ListValidator<DivExtensionTemplate> f39056l0;

    /* renamed from: l1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>> f39057l1;

    /* renamed from: m0 */
    @NotNull
    public static final ValueValidator<String> f39058m0;

    /* renamed from: m1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction> f39059m1;

    /* renamed from: n0 */
    @NotNull
    public static final ValueValidator<String> f39060n0;

    /* renamed from: n1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>> f39061n1;

    /* renamed from: o0 */
    @NotNull
    public static final ValueValidator<Long> f39062o0;

    /* renamed from: o1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f39063o1;

    /* renamed from: p0 */
    @NotNull
    public static final ValueValidator<Long> f39064p0;

    /* renamed from: q0 */
    @NotNull
    public static final ListValidator<DivAction> f39065q0;

    /* renamed from: r0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f39066r0;

    /* renamed from: s0 */
    @NotNull
    public static final ValueValidator<String> f39067s0;

    /* renamed from: t0 */
    @NotNull
    public static final ValueValidator<String> f39068t0;

    /* renamed from: u0 */
    @NotNull
    public static final ValueValidator<String> f39069u0;

    /* renamed from: v0 */
    @NotNull
    public static final ValueValidator<String> f39070v0;

    /* renamed from: w0 */
    @NotNull
    public static final ListValidator<DivTooltip> f39071w0;

    /* renamed from: x0 */
    @NotNull
    public static final ListValidator<DivTooltipTemplate> f39072x0;

    /* renamed from: y0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f39073y0;

    /* renamed from: z0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f39074z0;

    /* renamed from: A */
    @JvmField
    @NotNull
    public final Field<DivDrawableTemplate> f39075A;

    /* renamed from: B */
    @JvmField
    @NotNull
    public final Field<List<DivTooltipTemplate>> f39076B;

    /* renamed from: C */
    @JvmField
    @NotNull
    public final Field<DivDrawableTemplate> f39077C;

    /* renamed from: D */
    @JvmField
    @NotNull
    public final Field<DivDrawableTemplate> f39078D;

    /* renamed from: E */
    @JvmField
    @NotNull
    public final Field<DivTransformTemplate> f39079E;

    /* renamed from: F */
    @JvmField
    @NotNull
    public final Field<DivChangeTransitionTemplate> f39080F;

    /* renamed from: G */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f39081G;

    /* renamed from: H */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f39082H;

    /* renamed from: I */
    @JvmField
    @NotNull
    public final Field<List<DivTransitionTrigger>> f39083I;

    /* renamed from: J */
    @JvmField
    @NotNull
    public final Field<Expression<DivVisibility>> f39084J;

    /* renamed from: K */
    @JvmField
    @NotNull
    public final Field<DivVisibilityActionTemplate> f39085K;

    /* renamed from: L */
    @JvmField
    @NotNull
    public final Field<List<DivVisibilityActionTemplate>> f39086L;

    /* renamed from: M */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f39087M;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<DivAccessibilityTemplate> f39088a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f39089b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f39090c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f39091d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f39092e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final Field<DivBorderTemplate> f39093f;

    /* renamed from: g */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f39094g;

    /* renamed from: h */
    @JvmField
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f39095h;

    /* renamed from: i */
    @JvmField
    @NotNull
    public final Field<List<DivExtensionTemplate>> f39096i;

    /* renamed from: j */
    @JvmField
    @NotNull
    public final Field<DivFocusTemplate> f39097j;

    /* renamed from: k */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f39098k;

    /* renamed from: l */
    @JvmField
    @NotNull
    public final Field<String> f39099l;

    /* renamed from: m */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f39100m;

    /* renamed from: n */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f39101n;

    /* renamed from: o */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f39102o;

    /* renamed from: p */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f39103p;

    /* renamed from: q */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f39104q;

    /* renamed from: r */
    @JvmField
    @NotNull
    public final Field<DivAccessibilityTemplate> f39105r;

    /* renamed from: s */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f39106s;

    /* renamed from: t */
    @JvmField
    @NotNull
    public final Field<DivDrawableTemplate> f39107t;

    /* renamed from: u */
    @JvmField
    @NotNull
    public final Field<TextStyleTemplate> f39108u;

    /* renamed from: v */
    @JvmField
    @NotNull
    public final Field<String> f39109v;

    /* renamed from: w */
    @JvmField
    @NotNull
    public final Field<DivDrawableTemplate> f39110w;

    /* renamed from: x */
    @JvmField
    @NotNull
    public final Field<TextStyleTemplate> f39111x;

    /* renamed from: y */
    @JvmField
    @NotNull
    public final Field<String> f39112y;

    /* renamed from: z */
    @JvmField
    @NotNull
    public final Field<DivDrawableTemplate> f39113z;

    /* compiled from: DivSliderTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000bR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0010R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0010R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u000bR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020$0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u000bR\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00160\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\bR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00160\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\bR\u0014\u0010,\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010)R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u000bR\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u000bR\u0014\u0010/\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0004R\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0010R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0010R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020$0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u000bR\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020$0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u000bR\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020$0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u000bR\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020$0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\u000bR\u001a\u00109\u001a\b\u0012\u0004\u0012\u0002080\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0010R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0010R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\u0010R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020?0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010\u0010R\u0014\u0010B\u001a\u00020$8\u0006X\u0086T¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020E0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020H0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010GR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020J0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010GR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020L0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010\u0010R\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010\u0010R\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020J0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010\bR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006T"}, m31884d2 = {"Lcom/yandex/div2/DivSliderTemplate$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackgroundTemplate;", "BACKGROUND_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivDisappearActionTemplate;", "DISAPPEAR_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivExtensionTemplate;", "EXTENSIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "MAX_VALUE_DEFAULT_VALUE", "MIN_VALUE_DEFAULT_VALUE", "PADDINGS_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "SECONDARY_VALUE_ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivActionTemplate;", "SELECTED_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivAction;", "SELECTED_ACTIONS_VALIDATOR", "THUMB_SECONDARY_VALUE_VARIABLE_TEMPLATE_VALIDATOR", "THUMB_SECONDARY_VALUE_VARIABLE_VALIDATOR", "THUMB_VALUE_VARIABLE_TEMPLATE_VALIDATOR", "THUMB_VALUE_VARIABLE_VALIDATOR", "Lcom/yandex/div2/DivTooltipTemplate;", "TOOLTIPS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_TEMPLATE_VALIDATOR", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/DivVisibilityActionTemplate;", "VISIBILITY_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: DivSliderTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivSliderTemplate$TextStyleTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivSlider$TextStyle;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class TextStyleTemplate implements JSONSerializable, JsonTemplate<DivSlider.TextStyle> {

        /* renamed from: f */
        @NotNull
        public static final Companion f39158f = new Companion(null);

        /* renamed from: g */
        @NotNull
        public static final Expression<DivSizeUnit> f39159g;

        /* renamed from: h */
        @NotNull
        public static final Expression<DivFontWeight> f39160h;

        /* renamed from: i */
        @NotNull
        public static final Expression<Integer> f39161i;

        /* renamed from: j */
        @NotNull
        public static final TypeHelper<DivSizeUnit> f39162j;

        /* renamed from: k */
        @NotNull
        public static final TypeHelper<DivFontWeight> f39163k;

        /* renamed from: l */
        @NotNull
        public static final ValueValidator<Long> f39164l;

        /* renamed from: m */
        @NotNull
        public static final ValueValidator<Long> f39165m;

        /* renamed from: n */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f39166n;

        /* renamed from: o */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivSizeUnit>> f39167o;

        /* renamed from: p */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivFontWeight>> f39168p;

        /* renamed from: q */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, DivPoint> f39169q;

        /* renamed from: r */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>> f39170r;

        /* renamed from: s */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, TextStyleTemplate> f39171s;

        /* renamed from: a */
        @JvmField
        @NotNull
        public final Field<Expression<Long>> f39172a;

        /* renamed from: b */
        @JvmField
        @NotNull
        public final Field<Expression<DivSizeUnit>> f39173b;

        /* renamed from: c */
        @JvmField
        @NotNull
        public final Field<Expression<DivFontWeight>> f39174c;

        /* renamed from: d */
        @JvmField
        @NotNull
        public final Field<DivPointTemplate> f39175d;

        /* renamed from: e */
        @JvmField
        @NotNull
        public final Field<Expression<Integer>> f39176e;

        /* compiled from: DivSliderTemplate.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, m31884d2 = {"Lcom/yandex/div2/DivSliderTemplate$TextStyleTemplate$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "FONT_SIZE_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div2/DivSizeUnit;", "FONT_SIZE_UNIT_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "FONT_SIZE_VALIDATOR", "Lcom/yandex/div2/DivFontWeight;", "FONT_WEIGHT_DEFAULT_VALUE", "", "TEXT_COLOR_DEFAULT_VALUE", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_FONT_SIZE_UNIT", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_FONT_WEIGHT", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        static {
            Expression.Companion companion = Expression.f34334a;
            f39159g = companion.m17539a(DivSizeUnit.SP);
            f39160h = companion.m17539a(DivFontWeight.REGULAR);
            f39161i = companion.m17539a(-16777216);
            int i2 = TypeHelper.f33843a;
            TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
            f39162j = companion2.m17372a(ArraysKt.m31926B(DivSizeUnit.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSliderTemplate$TextStyleTemplate$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivSizeUnit);
                }
            });
            f39163k = companion2.m17372a(ArraysKt.m31926B(DivFontWeight.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSliderTemplate$TextStyleTemplate$Companion$TYPE_HELPER_FONT_WEIGHT$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivFontWeight);
                }
            });
            f39164l = C3044f0.f41361r;
            f39165m = C3044f0.f41362s;
            f39166n = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivSliderTemplate$TextStyleTemplate$Companion$FONT_SIZE_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    return JsonParser.m17316h(jSONObject2, str2, ParsingConvertersKt.f33831e, DivSliderTemplate.TextStyleTemplate.f39165m, parsingEnvironment2.getF34328a(), TypeHelpersKt.f33849b);
                }
            };
            f39167o = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivSizeUnit>>() { // from class: com.yandex.div2.DivSliderTemplate$TextStyleTemplate$Companion$FONT_SIZE_UNIT_READER$1
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
                    Expression<DivSizeUnit> expression = DivSliderTemplate.TextStyleTemplate.f39159g;
                    Expression<DivSizeUnit> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivSliderTemplate.TextStyleTemplate.f39162j);
                    return m17330v == null ? expression : m17330v;
                }
            };
            f39168p = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivFontWeight>>() { // from class: com.yandex.div2.DivSliderTemplate$TextStyleTemplate$Companion$FONT_WEIGHT_READER$1
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
                    Expression<DivFontWeight> expression = DivSliderTemplate.TextStyleTemplate.f39160h;
                    Expression<DivFontWeight> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivSliderTemplate.TextStyleTemplate.f39163k);
                    return m17330v == null ? expression : m17330v;
                }
            };
            f39169q = new Function3<String, JSONObject, ParsingEnvironment, DivPoint>() { // from class: com.yandex.div2.DivSliderTemplate$TextStyleTemplate$Companion$OFFSET_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public DivPoint mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    DivPoint.Companion companion3 = DivPoint.f38064c;
                    return (DivPoint) JsonParser.m17322n(jSONObject2, str2, DivPoint.f38065d, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                }
            };
            f39170r = new Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>>() { // from class: com.yandex.div2.DivSliderTemplate$TextStyleTemplate$Companion$TEXT_COLOR_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<Integer> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    Function1<Object, Integer> function1 = ParsingConvertersKt.f33827a;
                    ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                    Expression<Integer> expression = DivSliderTemplate.TextStyleTemplate.f39161i;
                    Expression<Integer> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33853f);
                    return m17330v == null ? expression : m17330v;
                }
            };
            f39171s = new Function2<ParsingEnvironment, JSONObject, TextStyleTemplate>() { // from class: com.yandex.div2.DivSliderTemplate$TextStyleTemplate$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                public DivSliderTemplate.TextStyleTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    ParsingEnvironment env = parsingEnvironment;
                    JSONObject it = jSONObject;
                    Intrinsics.m32179h(env, "env");
                    Intrinsics.m32179h(it, "it");
                    return new DivSliderTemplate.TextStyleTemplate(env, null, false, it, 6);
                }
            };
        }

        public TextStyleTemplate(ParsingEnvironment parsingEnvironment, TextStyleTemplate textStyleTemplate, boolean z, JSONObject jSONObject, int i2) {
            z = (i2 & 4) != 0 ? false : z;
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            this.f39172a = JsonTemplateParser.m17348i(jSONObject, "font_size", z, null, ParsingConvertersKt.f33831e, f39164l, f34328a, parsingEnvironment, TypeHelpersKt.f33849b);
            DivSizeUnit.Converter converter = DivSizeUnit.f38845c;
            this.f39173b = JsonTemplateParser.m17358s(jSONObject, "font_size_unit", z, null, DivSizeUnit.f38846d, f34328a, parsingEnvironment, f39162j);
            DivFontWeight.Converter converter2 = DivFontWeight.f35883c;
            this.f39174c = JsonTemplateParser.m17358s(jSONObject, "font_weight", z, null, DivFontWeight.f35884d, f34328a, parsingEnvironment, f39163k);
            DivPointTemplate.Companion companion = DivPointTemplate.f38069c;
            this.f39175d = JsonTemplateParser.m17354o(jSONObject, "offset", z, null, DivPointTemplate.f38072f, f34328a, parsingEnvironment);
            this.f39176e = JsonTemplateParser.m17358s(jSONObject, "text_color", z, null, ParsingConvertersKt.f33827a, f34328a, parsingEnvironment, TypeHelpersKt.f33853f);
        }

        @Override // com.yandex.div.json.JsonTemplate
        /* renamed from: a */
        public DivSlider.TextStyle mo17514a(ParsingEnvironment env, JSONObject data) {
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(data, "data");
            Expression expression = (Expression) FieldKt.m17376b(this.f39172a, env, "font_size", data, f39166n);
            Expression<DivSizeUnit> expression2 = (Expression) FieldKt.m17378d(this.f39173b, env, "font_size_unit", data, f39167o);
            if (expression2 == null) {
                expression2 = f39159g;
            }
            Expression<DivSizeUnit> expression3 = expression2;
            Expression<DivFontWeight> expression4 = (Expression) FieldKt.m17378d(this.f39174c, env, "font_weight", data, f39168p);
            if (expression4 == null) {
                expression4 = f39160h;
            }
            Expression<DivFontWeight> expression5 = expression4;
            DivPoint divPoint = (DivPoint) FieldKt.m17381g(this.f39175d, env, "offset", data, f39169q);
            Expression<Integer> expression6 = (Expression) FieldKt.m17378d(this.f39176e, env, "text_color", data, f39170r);
            if (expression6 == null) {
                expression6 = f39161i;
            }
            return new DivSlider.TextStyle(expression, expression3, expression5, divPoint, expression6);
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f39010O = companion.m17539a(Double.valueOf(1.0d));
        f39012P = new DivBorder(null, null, null, null, null, 31);
        f39014Q = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7));
        f39016R = new DivEdgeInsets(null, null, null, null, null, 31);
        f39018S = companion.m17539a(100L);
        f39020T = companion.m17539a(0L);
        f39022U = new DivEdgeInsets(null, null, null, null, null, 31);
        f39024V = new DivAccessibility(null, null, null, null, null, null, 63);
        f39026W = new DivTransform(null, null, null, 7);
        f39028X = companion.m17539a(DivVisibility.VISIBLE);
        f39030Y = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i2 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f39032Z = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f39034a0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f39036b0 = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f39038c0 = C3044f0.f41349f;
        f39040d0 = C3044f0.f41358o;
        f39042e0 = C3042e0.f41312q;
        f39044f0 = C3042e0.f41313r;
        f39046g0 = C3044f0.f41359p;
        f39048h0 = C3044f0.f41360q;
        f39050i0 = C3042e0.f41314s;
        f39052j0 = C3042e0.f41315t;
        f39054k0 = C3042e0.f41316u;
        f39056l0 = C3042e0.f41317v;
        f39058m0 = C3044f0.f41350g;
        f39060n0 = C3044f0.f41351h;
        f39062o0 = C3044f0.f41352i;
        f39064p0 = C3044f0.f41353j;
        f39065q0 = C3042e0.f41304i;
        f39066r0 = C3042e0.f41305j;
        f39067s0 = C3044f0.f41354k;
        f39068t0 = C3044f0.f41355l;
        f39069u0 = C3044f0.f41356m;
        f39070v0 = C3044f0.f41357n;
        f39071w0 = C3042e0.f41306k;
        f39072x0 = C3042e0.f41307l;
        f39073y0 = C3042e0.f41308m;
        f39074z0 = C3042e0.f41309n;
        f38995A0 = C3042e0.f41310o;
        f38996B0 = C3042e0.f41311p;
        f38997C0 = new Function3<String, JSONObject, ParsingEnvironment, DivAccessibility>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$ACCESSIBILITY_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAccessibility mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAccessibility.Companion companion3 = DivAccessibility.f34479f;
                DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject2, str2, DivAccessibility.f34486m, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divAccessibility == null ? DivSliderTemplate.f39008N : divAccessibility;
            }
        };
        f38998D0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$ALIGNMENT_HORIZONTAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentHorizontal> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentHorizontal.f34618d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivSliderTemplate.f39032Z);
            }
        };
        f38999E0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$ALIGNMENT_VERTICAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentVertical> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentVertical.Converter converter = DivAlignmentVertical.f34625c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentVertical.f34626d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivSliderTemplate.f39034a0);
            }
        };
        f39000F0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$ALPHA_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
                ValueValidator<Double> valueValidator = DivSliderTemplate.f39040d0;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Double> expression = DivSliderTemplate.f39010O;
                Expression<Double> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
                return m17328t == null ? expression : m17328t;
            }
        };
        f39001G0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$BACKGROUND_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivBackground> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBackground.Companion companion3 = DivBackground.f34750a;
                return JsonParser.m17333y(jSONObject2, str2, DivBackground.f34751b, DivSliderTemplate.f39042e0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f39002H0 = new Function3<String, JSONObject, ParsingEnvironment, DivBorder>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$BORDER_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivBorder mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBorder.Companion companion3 = DivBorder.f34785f;
                DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject2, str2, DivBorder.f34788i, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divBorder == null ? DivSliderTemplate.f39012P : divBorder;
            }
        };
        f39003I0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$COLUMN_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivSliderTemplate.f39048h0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f39004J0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$DISAPPEAR_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivDisappearAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivDisappearAction.Companion companion3 = DivDisappearAction.f35537a;
                return JsonParser.m17333y(jSONObject2, str2, DivDisappearAction.f35545i, DivSliderTemplate.f39050i0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f39005K0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$EXTENSIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivExtension> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivExtension.Companion companion3 = DivExtension.f35659c;
                return JsonParser.m17333y(jSONObject2, str2, DivExtension.f35660d, DivSliderTemplate.f39054k0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f39006L0 = new Function3<String, JSONObject, ParsingEnvironment, DivFocus>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$FOCUS_READER$1
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
        f39007M0 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$HEIGHT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivSliderTemplate.f39014Q : divSize;
            }
        };
        f39009N0 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$ID_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return (String) JsonParser.m17323o(jSONObject2, str2, DivSliderTemplate.f39060n0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f39011O0 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$MARGINS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivSliderTemplate.f39016R : divEdgeInsets;
            }
        };
        f39013P0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$MAX_VALUE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivSliderTemplate.f39018S;
                Expression<Long> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33849b);
                return m17330v == null ? expression : m17330v;
            }
        };
        f39015Q0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$MIN_VALUE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivSliderTemplate.f39020T;
                Expression<Long> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33849b);
                return m17330v == null ? expression : m17330v;
            }
        };
        f39017R0 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$PADDINGS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivSliderTemplate.f39022U : divEdgeInsets;
            }
        };
        f39019S0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$ROW_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivSliderTemplate.f39064p0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f39021T0 = new Function3<String, JSONObject, ParsingEnvironment, DivAccessibility>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$SECONDARY_VALUE_ACCESSIBILITY_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAccessibility mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAccessibility.Companion companion3 = DivAccessibility.f34479f;
                DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject2, str2, DivAccessibility.f34486m, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divAccessibility == null ? DivSliderTemplate.f39024V : divAccessibility;
            }
        };
        f39023U0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$SELECTED_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivSliderTemplate.f39065q0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f39025V0 = new Function3<String, JSONObject, ParsingEnvironment, DivDrawable>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$THUMB_SECONDARY_STYLE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivDrawable mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivDrawable.Companion companion3 = DivDrawable.f35599a;
                return (DivDrawable) JsonParser.m17322n(jSONObject2, str2, DivDrawable.f35600b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f39027W0 = new Function3<String, JSONObject, ParsingEnvironment, DivSlider.TextStyle>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$THUMB_SECONDARY_TEXT_STYLE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSlider.TextStyle mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSlider.TextStyle.Companion companion3 = DivSlider.TextStyle.f38979f;
                return (DivSlider.TextStyle) JsonParser.m17322n(jSONObject2, str2, DivSlider.TextStyle.f38986m, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f39029X0 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$THUMB_SECONDARY_VALUE_VARIABLE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return (String) JsonParser.m17323o(jSONObject2, str2, DivSliderTemplate.f39068t0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f39031Y0 = new Function3<String, JSONObject, ParsingEnvironment, DivDrawable>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$THUMB_STYLE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivDrawable mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivDrawable.Companion companion3 = DivDrawable.f35599a;
                Function2<ParsingEnvironment, JSONObject, DivDrawable> function2 = DivDrawable.f35600b;
                parsingEnvironment2.getF34328a();
                return (DivDrawable) JsonParser.m17313e(jSONObject2, str2, function2, C2904b.f33858e, parsingEnvironment2);
            }
        };
        f39033Z0 = new Function3<String, JSONObject, ParsingEnvironment, DivSlider.TextStyle>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$THUMB_TEXT_STYLE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSlider.TextStyle mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSlider.TextStyle.Companion companion3 = DivSlider.TextStyle.f38979f;
                return (DivSlider.TextStyle) JsonParser.m17322n(jSONObject2, str2, DivSlider.TextStyle.f38986m, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f39035a1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$THUMB_VALUE_VARIABLE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return (String) JsonParser.m17323o(jSONObject2, str2, DivSliderTemplate.f39070v0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f39037b1 = new Function3<String, JSONObject, ParsingEnvironment, DivDrawable>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$TICK_MARK_ACTIVE_STYLE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivDrawable mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivDrawable.Companion companion3 = DivDrawable.f35599a;
                return (DivDrawable) JsonParser.m17322n(jSONObject2, str2, DivDrawable.f35600b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f39039c1 = new Function3<String, JSONObject, ParsingEnvironment, DivDrawable>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$TICK_MARK_INACTIVE_STYLE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivDrawable mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivDrawable.Companion companion3 = DivDrawable.f35599a;
                return (DivDrawable) JsonParser.m17322n(jSONObject2, str2, DivDrawable.f35600b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f39041d1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$TOOLTIPS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTooltip> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTooltip.Companion companion3 = DivTooltip.f40492h;
                return JsonParser.m17333y(jSONObject2, str2, DivTooltip.f40497m, DivSliderTemplate.f39071w0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f39043e1 = new Function3<String, JSONObject, ParsingEnvironment, DivDrawable>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$TRACK_ACTIVE_STYLE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivDrawable mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivDrawable.Companion companion3 = DivDrawable.f35599a;
                Function2<ParsingEnvironment, JSONObject, DivDrawable> function2 = DivDrawable.f35600b;
                parsingEnvironment2.getF34328a();
                return (DivDrawable) JsonParser.m17313e(jSONObject2, str2, function2, C2904b.f33858e, parsingEnvironment2);
            }
        };
        f39045f1 = new Function3<String, JSONObject, ParsingEnvironment, DivDrawable>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$TRACK_INACTIVE_STYLE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivDrawable mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivDrawable.Companion companion3 = DivDrawable.f35599a;
                Function2<ParsingEnvironment, JSONObject, DivDrawable> function2 = DivDrawable.f35600b;
                parsingEnvironment2.getF34328a();
                return (DivDrawable) JsonParser.m17313e(jSONObject2, str2, function2, C2904b.f33858e, parsingEnvironment2);
            }
        };
        f39047g1 = new Function3<String, JSONObject, ParsingEnvironment, DivTransform>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$TRANSFORM_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivTransform mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransform.Companion companion3 = DivTransform.f40551d;
                DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject2, str2, DivTransform.f40554g, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divTransform == null ? DivSliderTemplate.f39026W : divTransform;
            }
        };
        f39049h1 = new Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$TRANSITION_CHANGE_READER$1
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
        f39051i1 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$TRANSITION_IN_READER$1
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
        f39053j1 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$TRANSITION_OUT_READER$1
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
        f39055k1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$TRANSITION_TRIGGERS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTransitionTrigger> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransitionTrigger.Converter converter = DivTransitionTrigger.f40582c;
                return JsonParser.m17332x(jSONObject2, str2, DivTransitionTrigger.f40583d, DivSliderTemplate.f39073y0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        DivSliderTemplate$Companion$TYPE_READER$1 divSliderTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$TYPE_READER$1
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
        f39057l1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$VISIBILITY_READER$1
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
                Expression<DivVisibility> expression = DivSliderTemplate.f39028X;
                Expression<DivVisibility> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivSliderTemplate.f39036b0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f39059m1 = new Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$VISIBILITY_ACTION_READER$1
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
        f39061n1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$VISIBILITY_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivVisibilityAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivVisibilityAction.Companion companion3 = DivVisibilityAction.f40938i;
                return JsonParser.m17333y(jSONObject2, str2, DivVisibilityAction.f40946q, DivSliderTemplate.f38995A0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f39063o1 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$WIDTH_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivSliderTemplate.f39030Y : divSize;
            }
        };
        DivSliderTemplate$Companion$CREATOR$1 divSliderTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivSliderTemplate>() { // from class: com.yandex.div2.DivSliderTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivSliderTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivSliderTemplate(env, null, false, it);
            }
        };
    }

    public DivSliderTemplate(@NotNull ParsingEnvironment env, @Nullable DivSliderTemplate divSliderTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        Field<DivAccessibilityTemplate> field = divSliderTemplate == null ? null : divSliderTemplate.f39088a;
        DivAccessibilityTemplate.Companion companion = DivAccessibilityTemplate.f34515g;
        Function2<ParsingEnvironment, JSONObject, DivAccessibilityTemplate> function2 = DivAccessibilityTemplate.f34531w;
        this.f39088a = JsonTemplateParser.m17354o(json, "accessibility", z, field, function2, f34328a, env);
        Field<Expression<DivAlignmentHorizontal>> field2 = divSliderTemplate == null ? null : divSliderTemplate.f39089b;
        DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
        this.f39089b = JsonTemplateParser.m17358s(json, "alignment_horizontal", z, field2, DivAlignmentHorizontal.f34618d, f34328a, env, f39032Z);
        Field<Expression<DivAlignmentVertical>> field3 = divSliderTemplate == null ? null : divSliderTemplate.f39090c;
        DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
        this.f39090c = JsonTemplateParser.m17358s(json, "alignment_vertical", z, field3, DivAlignmentVertical.f34626d, f34328a, env, f39034a0);
        this.f39091d = JsonTemplateParser.m17357r(json, "alpha", z, divSliderTemplate == null ? null : divSliderTemplate.f39091d, ParsingConvertersKt.f33830d, f39038c0, f34328a, env, TypeHelpersKt.f33851d);
        Field<List<DivBackgroundTemplate>> field4 = divSliderTemplate == null ? null : divSliderTemplate.f39092e;
        DivBackgroundTemplate.Companion companion2 = DivBackgroundTemplate.f34758a;
        this.f39092e = JsonTemplateParser.m17360u(json, "background", z, field4, DivBackgroundTemplate.f34759b, f39044f0, f34328a, env);
        Field<DivBorderTemplate> field5 = divSliderTemplate == null ? null : divSliderTemplate.f39093f;
        DivBorderTemplate.Companion companion3 = DivBorderTemplate.f34795f;
        this.f39093f = JsonTemplateParser.m17354o(json, "border", z, field5, DivBorderTemplate.f34804o, f34328a, env);
        Field<Expression<Long>> field6 = divSliderTemplate == null ? null : divSliderTemplate.f39094g;
        Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
        ValueValidator<Long> valueValidator = f39046g0;
        TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
        this.f39094g = JsonTemplateParser.m17357r(json, "column_span", z, field6, function1, valueValidator, f34328a, env, typeHelper);
        Field<List<DivDisappearActionTemplate>> field7 = divSliderTemplate == null ? null : divSliderTemplate.f39095h;
        DivDisappearActionTemplate.Companion companion4 = DivDisappearActionTemplate.f35550i;
        this.f39095h = JsonTemplateParser.m17360u(json, "disappear_actions", z, field7, DivDisappearActionTemplate.f35549C, f39052j0, f34328a, env);
        Field<List<DivExtensionTemplate>> field8 = divSliderTemplate == null ? null : divSliderTemplate.f39096i;
        DivExtensionTemplate.Companion companion5 = DivExtensionTemplate.f35664c;
        this.f39096i = JsonTemplateParser.m17360u(json, "extensions", z, field8, DivExtensionTemplate.f35667f, f39056l0, f34328a, env);
        Field<DivFocusTemplate> field9 = divSliderTemplate == null ? null : divSliderTemplate.f39097j;
        DivFocusTemplate.Companion companion6 = DivFocusTemplate.f35833f;
        this.f39097j = JsonTemplateParser.m17354o(json, "focus", z, field9, DivFocusTemplate.f35846s, f34328a, env);
        Field<DivSizeTemplate> field10 = divSliderTemplate == null ? null : divSliderTemplate.f39098k;
        DivSizeTemplate.Companion companion7 = DivSizeTemplate.f38839a;
        Function2<ParsingEnvironment, JSONObject, DivSizeTemplate> function22 = DivSizeTemplate.f38840b;
        this.f39098k = JsonTemplateParser.m17354o(json, "height", z, field10, function22, f34328a, env);
        this.f39099l = JsonTemplateParser.m17351l(json, "id", z, divSliderTemplate == null ? null : divSliderTemplate.f39099l, f39058m0, f34328a, env);
        Field<DivEdgeInsetsTemplate> field11 = divSliderTemplate == null ? null : divSliderTemplate.f39100m;
        DivEdgeInsetsTemplate.Companion companion8 = DivEdgeInsetsTemplate.f35626f;
        Function2<ParsingEnvironment, JSONObject, DivEdgeInsetsTemplate> function23 = DivEdgeInsetsTemplate.f35646z;
        this.f39100m = JsonTemplateParser.m17354o(json, "margins", z, field11, function23, f34328a, env);
        this.f39101n = JsonTemplateParser.m17358s(json, "max_value", z, divSliderTemplate == null ? null : divSliderTemplate.f39101n, function1, f34328a, env, typeHelper);
        this.f39102o = JsonTemplateParser.m17358s(json, "min_value", z, divSliderTemplate == null ? null : divSliderTemplate.f39102o, function1, f34328a, env, typeHelper);
        this.f39103p = JsonTemplateParser.m17354o(json, "paddings", z, divSliderTemplate == null ? null : divSliderTemplate.f39103p, function23, f34328a, env);
        this.f39104q = JsonTemplateParser.m17357r(json, "row_span", z, divSliderTemplate == null ? null : divSliderTemplate.f39104q, function1, f39062o0, f34328a, env, typeHelper);
        this.f39105r = JsonTemplateParser.m17354o(json, "secondary_value_accessibility", z, divSliderTemplate == null ? null : divSliderTemplate.f39105r, function2, f34328a, env);
        Field<List<DivActionTemplate>> field12 = divSliderTemplate == null ? null : divSliderTemplate.f39106s;
        DivActionTemplate.Companion companion9 = DivActionTemplate.f34572i;
        this.f39106s = JsonTemplateParser.m17360u(json, "selected_actions", z, field12, DivActionTemplate.f34586w, f39066r0, f34328a, env);
        Field<DivDrawableTemplate> field13 = divSliderTemplate == null ? null : divSliderTemplate.f39107t;
        DivDrawableTemplate.Companion companion10 = DivDrawableTemplate.f35603a;
        Function2<ParsingEnvironment, JSONObject, DivDrawableTemplate> function24 = DivDrawableTemplate.f35604b;
        this.f39107t = JsonTemplateParser.m17354o(json, "thumb_secondary_style", z, field13, function24, f34328a, env);
        Field<TextStyleTemplate> field14 = divSliderTemplate == null ? null : divSliderTemplate.f39108u;
        TextStyleTemplate.Companion companion11 = TextStyleTemplate.f39158f;
        Function2<ParsingEnvironment, JSONObject, TextStyleTemplate> function25 = TextStyleTemplate.f39171s;
        this.f39108u = JsonTemplateParser.m17354o(json, "thumb_secondary_text_style", z, field14, function25, f34328a, env);
        this.f39109v = JsonTemplateParser.m17351l(json, "thumb_secondary_value_variable", z, divSliderTemplate == null ? null : divSliderTemplate.f39109v, f39067s0, f34328a, env);
        this.f39110w = JsonTemplateParser.m17345f(json, "thumb_style", z, divSliderTemplate == null ? null : divSliderTemplate.f39110w, function24, f34328a, env);
        this.f39111x = JsonTemplateParser.m17354o(json, "thumb_text_style", z, divSliderTemplate == null ? null : divSliderTemplate.f39111x, function25, f34328a, env);
        this.f39112y = JsonTemplateParser.m17351l(json, "thumb_value_variable", z, divSliderTemplate == null ? null : divSliderTemplate.f39112y, f39069u0, f34328a, env);
        this.f39113z = JsonTemplateParser.m17354o(json, "tick_mark_active_style", z, divSliderTemplate == null ? null : divSliderTemplate.f39113z, function24, f34328a, env);
        this.f39075A = JsonTemplateParser.m17354o(json, "tick_mark_inactive_style", z, divSliderTemplate == null ? null : divSliderTemplate.f39075A, function24, f34328a, env);
        Field<List<DivTooltipTemplate>> field15 = divSliderTemplate == null ? null : divSliderTemplate.f39076B;
        DivTooltipTemplate.Companion companion12 = DivTooltipTemplate.f40520h;
        this.f39076B = JsonTemplateParser.m17360u(json, "tooltips", z, field15, DivTooltipTemplate.f40534v, f39072x0, f34328a, env);
        this.f39077C = JsonTemplateParser.m17345f(json, "track_active_style", z, divSliderTemplate == null ? null : divSliderTemplate.f39077C, function24, f34328a, env);
        this.f39078D = JsonTemplateParser.m17345f(json, "track_inactive_style", z, divSliderTemplate == null ? null : divSliderTemplate.f39078D, function24, f34328a, env);
        Field<DivTransformTemplate> field16 = divSliderTemplate == null ? null : divSliderTemplate.f39079E;
        DivTransformTemplate.Companion companion13 = DivTransformTemplate.f40559d;
        this.f39079E = JsonTemplateParser.m17354o(json, "transform", z, field16, DivTransformTemplate.f40565j, f34328a, env);
        Field<DivChangeTransitionTemplate> field17 = divSliderTemplate == null ? null : divSliderTemplate.f39080F;
        DivChangeTransitionTemplate.Companion companion14 = DivChangeTransitionTemplate.f34861a;
        this.f39080F = JsonTemplateParser.m17354o(json, "transition_change", z, field17, DivChangeTransitionTemplate.f34862b, f34328a, env);
        Field<DivAppearanceTransitionTemplate> field18 = divSliderTemplate == null ? null : divSliderTemplate.f39081G;
        DivAppearanceTransitionTemplate.Companion companion15 = DivAppearanceTransitionTemplate.f34733a;
        Function2<ParsingEnvironment, JSONObject, DivAppearanceTransitionTemplate> function26 = DivAppearanceTransitionTemplate.f34734b;
        this.f39081G = JsonTemplateParser.m17354o(json, "transition_in", z, field18, function26, f34328a, env);
        this.f39082H = JsonTemplateParser.m17354o(json, "transition_out", z, divSliderTemplate == null ? null : divSliderTemplate.f39082H, function26, f34328a, env);
        Field<List<DivTransitionTrigger>> field19 = divSliderTemplate == null ? null : divSliderTemplate.f39083I;
        DivTransitionTrigger.Converter converter3 = DivTransitionTrigger.f40582c;
        this.f39083I = JsonTemplateParser.m17359t(json, "transition_triggers", z, field19, DivTransitionTrigger.f40583d, f39074z0, f34328a, env);
        Field<Expression<DivVisibility>> field20 = divSliderTemplate == null ? null : divSliderTemplate.f39084J;
        DivVisibility.Converter converter4 = DivVisibility.f40930c;
        this.f39084J = JsonTemplateParser.m17358s(json, "visibility", z, field20, DivVisibility.f40931d, f34328a, env, f39036b0);
        Field<DivVisibilityActionTemplate> field21 = divSliderTemplate == null ? null : divSliderTemplate.f39085K;
        DivVisibilityActionTemplate.Companion companion16 = DivVisibilityActionTemplate.f40959i;
        Function2<ParsingEnvironment, JSONObject, DivVisibilityActionTemplate> function27 = DivVisibilityActionTemplate.f40958C;
        this.f39085K = JsonTemplateParser.m17354o(json, "visibility_action", z, field21, function27, f34328a, env);
        this.f39086L = JsonTemplateParser.m17360u(json, "visibility_actions", z, divSliderTemplate == null ? null : divSliderTemplate.f39086L, function27, f38996B0, f34328a, env);
        this.f39087M = JsonTemplateParser.m17354o(json, "width", z, divSliderTemplate == null ? null : divSliderTemplate.f39087M, function22, f34328a, env);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivSlider mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        DivAccessibility divAccessibility = (DivAccessibility) FieldKt.m17381g(this.f39088a, env, "accessibility", data, f38997C0);
        if (divAccessibility == null) {
            divAccessibility = f39008N;
        }
        DivAccessibility divAccessibility2 = divAccessibility;
        Expression expression = (Expression) FieldKt.m17378d(this.f39089b, env, "alignment_horizontal", data, f38998D0);
        Expression expression2 = (Expression) FieldKt.m17378d(this.f39090c, env, "alignment_vertical", data, f38999E0);
        Expression<Double> expression3 = (Expression) FieldKt.m17378d(this.f39091d, env, "alpha", data, f39000F0);
        if (expression3 == null) {
            expression3 = f39010O;
        }
        Expression<Double> expression4 = expression3;
        List m17382h = FieldKt.m17382h(this.f39092e, env, "background", data, f39042e0, f39001G0);
        DivBorder divBorder = (DivBorder) FieldKt.m17381g(this.f39093f, env, "border", data, f39002H0);
        if (divBorder == null) {
            divBorder = f39012P;
        }
        DivBorder divBorder2 = divBorder;
        Expression expression5 = (Expression) FieldKt.m17378d(this.f39094g, env, "column_span", data, f39003I0);
        List m17382h2 = FieldKt.m17382h(this.f39095h, env, "disappear_actions", data, f39050i0, f39004J0);
        List m17382h3 = FieldKt.m17382h(this.f39096i, env, "extensions", data, f39054k0, f39005K0);
        DivFocus divFocus = (DivFocus) FieldKt.m17381g(this.f39097j, env, "focus", data, f39006L0);
        DivSize divSize = (DivSize) FieldKt.m17381g(this.f39098k, env, "height", data, f39007M0);
        if (divSize == null) {
            divSize = f39014Q;
        }
        DivSize divSize2 = divSize;
        String str = (String) FieldKt.m17378d(this.f39099l, env, "id", data, f39009N0);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) FieldKt.m17381g(this.f39100m, env, "margins", data, f39011O0);
        if (divEdgeInsets == null) {
            divEdgeInsets = f39016R;
        }
        DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
        Expression<Long> expression6 = (Expression) FieldKt.m17378d(this.f39101n, env, "max_value", data, f39013P0);
        if (expression6 == null) {
            expression6 = f39018S;
        }
        Expression<Long> expression7 = expression6;
        Expression<Long> expression8 = (Expression) FieldKt.m17378d(this.f39102o, env, "min_value", data, f39015Q0);
        if (expression8 == null) {
            expression8 = f39020T;
        }
        Expression<Long> expression9 = expression8;
        DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) FieldKt.m17381g(this.f39103p, env, "paddings", data, f39017R0);
        if (divEdgeInsets3 == null) {
            divEdgeInsets3 = f39022U;
        }
        DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
        Expression expression10 = (Expression) FieldKt.m17378d(this.f39104q, env, "row_span", data, f39019S0);
        DivAccessibility divAccessibility3 = (DivAccessibility) FieldKt.m17381g(this.f39105r, env, "secondary_value_accessibility", data, f39021T0);
        if (divAccessibility3 == null) {
            divAccessibility3 = f39024V;
        }
        DivAccessibility divAccessibility4 = divAccessibility3;
        List m17382h4 = FieldKt.m17382h(this.f39106s, env, "selected_actions", data, f39065q0, f39023U0);
        DivDrawable divDrawable = (DivDrawable) FieldKt.m17381g(this.f39107t, env, "thumb_secondary_style", data, f39025V0);
        DivSlider.TextStyle textStyle = (DivSlider.TextStyle) FieldKt.m17381g(this.f39108u, env, "thumb_secondary_text_style", data, f39027W0);
        String str2 = (String) FieldKt.m17378d(this.f39109v, env, "thumb_secondary_value_variable", data, f39029X0);
        DivDrawable divDrawable2 = (DivDrawable) FieldKt.m17383i(this.f39110w, env, "thumb_style", data, f39031Y0);
        DivSlider.TextStyle textStyle2 = (DivSlider.TextStyle) FieldKt.m17381g(this.f39111x, env, "thumb_text_style", data, f39033Z0);
        String str3 = (String) FieldKt.m17378d(this.f39112y, env, "thumb_value_variable", data, f39035a1);
        DivDrawable divDrawable3 = (DivDrawable) FieldKt.m17381g(this.f39113z, env, "tick_mark_active_style", data, f39037b1);
        DivDrawable divDrawable4 = (DivDrawable) FieldKt.m17381g(this.f39075A, env, "tick_mark_inactive_style", data, f39039c1);
        List m17382h5 = FieldKt.m17382h(this.f39076B, env, "tooltips", data, f39071w0, f39041d1);
        DivDrawable divDrawable5 = (DivDrawable) FieldKt.m17383i(this.f39077C, env, "track_active_style", data, f39043e1);
        DivDrawable divDrawable6 = (DivDrawable) FieldKt.m17383i(this.f39078D, env, "track_inactive_style", data, f39045f1);
        DivTransform divTransform = (DivTransform) FieldKt.m17381g(this.f39079E, env, "transform", data, f39047g1);
        if (divTransform == null) {
            divTransform = f39026W;
        }
        DivTransform divTransform2 = divTransform;
        DivChangeTransition divChangeTransition = (DivChangeTransition) FieldKt.m17381g(this.f39080F, env, "transition_change", data, f39049h1);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) FieldKt.m17381g(this.f39081G, env, "transition_in", data, f39051i1);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) FieldKt.m17381g(this.f39082H, env, "transition_out", data, f39053j1);
        List m17380f = FieldKt.m17380f(this.f39083I, env, "transition_triggers", data, f39073y0, f39055k1);
        Expression<DivVisibility> expression11 = (Expression) FieldKt.m17378d(this.f39084J, env, "visibility", data, f39057l1);
        if (expression11 == null) {
            expression11 = f39028X;
        }
        Expression<DivVisibility> expression12 = expression11;
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) FieldKt.m17381g(this.f39085K, env, "visibility_action", data, f39059m1);
        List m17382h6 = FieldKt.m17382h(this.f39086L, env, "visibility_actions", data, f38995A0, f39061n1);
        DivSize divSize3 = (DivSize) FieldKt.m17381g(this.f39087M, env, "width", data, f39063o1);
        if (divSize3 == null) {
            divSize3 = f39030Y;
        }
        return new DivSlider(divAccessibility2, expression, expression2, expression4, m17382h, divBorder2, expression5, m17382h2, m17382h3, divFocus, divSize2, str, divEdgeInsets2, expression7, expression9, divEdgeInsets4, expression10, divAccessibility4, m17382h4, divDrawable, textStyle, str2, divDrawable2, textStyle2, str3, divDrawable3, divDrawable4, m17382h5, divDrawable5, divDrawable6, divTransform2, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17380f, expression12, divVisibilityAction, m17382h6, divSize3);
    }
}
