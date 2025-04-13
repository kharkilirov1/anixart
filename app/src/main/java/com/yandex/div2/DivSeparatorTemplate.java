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
import com.yandex.div2.DivSeparator;
import com.yandex.div2.DivSeparatorTemplate;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivSeparatorTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div2/DivSeparatorTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivSeparator;", "Companion", "DelimiterStyleTemplate", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivSeparatorTemplate implements JSONSerializable, JsonTemplate<DivSeparator> {

    /* renamed from: A0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>> f38617A0;

    /* renamed from: B0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>> f38618B0;

    /* renamed from: C0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f38619C0;

    /* renamed from: D0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>> f38620D0;

    /* renamed from: E0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivBorder> f38621E0;

    /* renamed from: F0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f38622F0;

    /* renamed from: G */
    @NotNull
    public static final DivAccessibility f38623G = new DivAccessibility(null, null, null, null, null, null, 63);

    /* renamed from: G0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSeparator.DelimiterStyle> f38624G0;

    /* renamed from: H */
    @NotNull
    public static final DivAnimation f38625H;

    /* renamed from: H0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>> f38626H0;

    /* renamed from: I */
    @NotNull
    public static final Expression<Double> f38627I;

    /* renamed from: I0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f38628I0;

    /* renamed from: J */
    @NotNull
    public static final DivBorder f38629J;

    /* renamed from: J0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>> f38630J0;

    /* renamed from: K */
    @NotNull
    public static final DivSeparator.DelimiterStyle f38631K;

    /* renamed from: K0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivFocus> f38632K0;

    /* renamed from: L */
    @NotNull
    public static final DivSize.WrapContent f38633L;

    /* renamed from: L0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f38634L0;

    /* renamed from: M */
    @NotNull
    public static final DivEdgeInsets f38635M;

    /* renamed from: M0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f38636M0;

    /* renamed from: N */
    @NotNull
    public static final DivEdgeInsets f38637N;

    /* renamed from: N0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f38638N0;

    /* renamed from: O */
    @NotNull
    public static final DivTransform f38639O;

    /* renamed from: O0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f38640O0;

    /* renamed from: P */
    @NotNull
    public static final Expression<DivVisibility> f38641P;

    /* renamed from: P0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f38642P0;

    /* renamed from: Q */
    @NotNull
    public static final DivSize.MatchParent f38643Q;

    /* renamed from: Q0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f38644Q0;

    /* renamed from: R */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f38645R;

    /* renamed from: R0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f38646R0;

    /* renamed from: S */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f38647S;

    /* renamed from: S0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>> f38648S0;

    /* renamed from: T */
    @NotNull
    public static final TypeHelper<DivVisibility> f38649T;

    /* renamed from: T0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivTransform> f38650T0;

    /* renamed from: U */
    @NotNull
    public static final ListValidator<DivAction> f38651U;

    /* renamed from: U0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition> f38652U0;

    /* renamed from: V */
    @NotNull
    public static final ListValidator<DivActionTemplate> f38653V;

    /* renamed from: V0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f38654V0;

    /* renamed from: W */
    @NotNull
    public static final ValueValidator<Double> f38655W;

    /* renamed from: W0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f38656W0;

    /* renamed from: X */
    @NotNull
    public static final ValueValidator<Double> f38657X;

    /* renamed from: X0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>> f38658X0;

    /* renamed from: Y */
    @NotNull
    public static final ListValidator<DivBackground> f38659Y;

    /* renamed from: Y0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>> f38660Y0;

    /* renamed from: Z */
    @NotNull
    public static final ListValidator<DivBackgroundTemplate> f38661Z;

    /* renamed from: Z0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction> f38662Z0;

    /* renamed from: a0 */
    @NotNull
    public static final ValueValidator<Long> f38663a0;

    /* renamed from: a1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>> f38664a1;

    /* renamed from: b0 */
    @NotNull
    public static final ValueValidator<Long> f38665b0;

    /* renamed from: b1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f38666b1;

    /* renamed from: c0 */
    @NotNull
    public static final ListValidator<DivDisappearAction> f38667c0;

    /* renamed from: d0 */
    @NotNull
    public static final ListValidator<DivDisappearActionTemplate> f38668d0;

    /* renamed from: e0 */
    @NotNull
    public static final ListValidator<DivAction> f38669e0;

    /* renamed from: f0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f38670f0;

    /* renamed from: g0 */
    @NotNull
    public static final ListValidator<DivExtension> f38671g0;

    /* renamed from: h0 */
    @NotNull
    public static final ListValidator<DivExtensionTemplate> f38672h0;

    /* renamed from: i0 */
    @NotNull
    public static final ValueValidator<String> f38673i0;

    /* renamed from: j0 */
    @NotNull
    public static final ValueValidator<String> f38674j0;

    /* renamed from: k0 */
    @NotNull
    public static final ListValidator<DivAction> f38675k0;

    /* renamed from: l0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f38676l0;

    /* renamed from: m0 */
    @NotNull
    public static final ValueValidator<Long> f38677m0;

    /* renamed from: n0 */
    @NotNull
    public static final ValueValidator<Long> f38678n0;

    /* renamed from: o0 */
    @NotNull
    public static final ListValidator<DivAction> f38679o0;

    /* renamed from: p0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f38680p0;

    /* renamed from: q0 */
    @NotNull
    public static final ListValidator<DivTooltip> f38681q0;

    /* renamed from: r0 */
    @NotNull
    public static final ListValidator<DivTooltipTemplate> f38682r0;

    /* renamed from: s0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f38683s0;

    /* renamed from: t0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f38684t0;

    /* renamed from: u0 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f38685u0;

    /* renamed from: v0 */
    @NotNull
    public static final ListValidator<DivVisibilityActionTemplate> f38686v0;

    /* renamed from: w0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAccessibility> f38687w0;

    /* renamed from: x0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAction> f38688x0;

    /* renamed from: y0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAnimation> f38689y0;

    /* renamed from: z0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f38690z0;

    /* renamed from: A */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f38691A;

    /* renamed from: B */
    @JvmField
    @NotNull
    public final Field<List<DivTransitionTrigger>> f38692B;

    /* renamed from: C */
    @JvmField
    @NotNull
    public final Field<Expression<DivVisibility>> f38693C;

    /* renamed from: D */
    @JvmField
    @NotNull
    public final Field<DivVisibilityActionTemplate> f38694D;

    /* renamed from: E */
    @JvmField
    @NotNull
    public final Field<List<DivVisibilityActionTemplate>> f38695E;

    /* renamed from: F */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f38696F;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<DivAccessibilityTemplate> f38697a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<DivActionTemplate> f38698b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<DivAnimationTemplate> f38699c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f38700d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f38701e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f38702f;

    /* renamed from: g */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f38703g;

    /* renamed from: h */
    @JvmField
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f38704h;

    /* renamed from: i */
    @JvmField
    @NotNull
    public final Field<DivBorderTemplate> f38705i;

    /* renamed from: j */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f38706j;

    /* renamed from: k */
    @JvmField
    @NotNull
    public final Field<DelimiterStyleTemplate> f38707k;

    /* renamed from: l */
    @JvmField
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f38708l;

    /* renamed from: m */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f38709m;

    /* renamed from: n */
    @JvmField
    @NotNull
    public final Field<List<DivExtensionTemplate>> f38710n;

    /* renamed from: o */
    @JvmField
    @NotNull
    public final Field<DivFocusTemplate> f38711o;

    /* renamed from: p */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f38712p;

    /* renamed from: q */
    @JvmField
    @NotNull
    public final Field<String> f38713q;

    /* renamed from: r */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f38714r;

    /* renamed from: s */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f38715s;

    /* renamed from: t */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f38716t;

    /* renamed from: u */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f38717u;

    /* renamed from: v */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f38718v;

    /* renamed from: w */
    @JvmField
    @NotNull
    public final Field<List<DivTooltipTemplate>> f38719w;

    /* renamed from: x */
    @JvmField
    @NotNull
    public final Field<DivTransformTemplate> f38720x;

    /* renamed from: y */
    @JvmField
    @NotNull
    public final Field<DivChangeTransitionTemplate> f38721y;

    /* renamed from: z */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f38722z;

    /* compiled from: DivSeparatorTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\bR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\bR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0014R\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\bR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\bR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\bR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\bR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\bR\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\bR\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0014R\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002000\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0014R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\bR\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\bR\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0014R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0014R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\bR\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\bR\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010\bR\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\bR\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010\bR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020D0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010\bR\u0014\u0010G\u001a\u0002008\u0006X\u0086T¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020J0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020M0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010LR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020O0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010LR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010\bR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020S0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010\bR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020O0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010\u0011R\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010X¨\u0006Y"}, m31884d2 = {"Lcom/yandex/div2/DivSeparatorTemplate$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivActionTemplate;", "ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAction;", "ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivAnimation;", "ACTION_ANIMATION_DEFAULT_VALUE", "Lcom/yandex/div2/DivAnimation;", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "Lcom/yandex/div2/DivBackgroundTemplate;", "BACKGROUND_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivSeparator$DelimiterStyle;", "DELIMITER_STYLE_DEFAULT_VALUE", "Lcom/yandex/div2/DivSeparator$DelimiterStyle;", "Lcom/yandex/div2/DivDisappearActionTemplate;", "DISAPPEAR_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "DOUBLETAP_ACTIONS_TEMPLATE_VALIDATOR", "DOUBLETAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivExtensionTemplate;", "EXTENSIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "LONGTAP_ACTIONS_TEMPLATE_VALIDATOR", "LONGTAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "PADDINGS_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "SELECTED_ACTIONS_TEMPLATE_VALIDATOR", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivTooltipTemplate;", "TOOLTIPS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_TEMPLATE_VALIDATOR", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/DivVisibilityActionTemplate;", "VISIBILITY_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: DivSeparatorTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivSeparatorTemplate$DelimiterStyleTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivSeparator$DelimiterStyle;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class DelimiterStyleTemplate implements JSONSerializable, JsonTemplate<DivSeparator.DelimiterStyle> {

        /* renamed from: c */
        @NotNull
        public static final Companion f38760c = new Companion(null);

        /* renamed from: d */
        @NotNull
        public static final Expression<Integer> f38761d;

        /* renamed from: e */
        @NotNull
        public static final Expression<DivSeparator.DelimiterStyle.Orientation> f38762e;

        /* renamed from: f */
        @NotNull
        public static final TypeHelper<DivSeparator.DelimiterStyle.Orientation> f38763f;

        /* renamed from: g */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>> f38764g;

        /* renamed from: h */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivSeparator.DelimiterStyle.Orientation>> f38765h;

        /* renamed from: i */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, DelimiterStyleTemplate> f38766i;

        /* renamed from: a */
        @JvmField
        @NotNull
        public final Field<Expression<Integer>> f38767a;

        /* renamed from: b */
        @JvmField
        @NotNull
        public final Field<Expression<DivSeparator.DelimiterStyle.Orientation>> f38768b;

        /* compiled from: DivSeparatorTemplate.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m31884d2 = {"Lcom/yandex/div2/DivSeparatorTemplate$DelimiterStyleTemplate$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "COLOR_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div2/DivSeparator$DelimiterStyle$Orientation;", "ORIENTATION_DEFAULT_VALUE", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_ORIENTATION", "Lcom/yandex/div/internal/parser/TypeHelper;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        static {
            Expression.Companion companion = Expression.f34334a;
            f38761d = companion.m17539a(335544320);
            f38762e = companion.m17539a(DivSeparator.DelimiterStyle.Orientation.HORIZONTAL);
            int i2 = TypeHelper.f33843a;
            f38763f = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(DivSeparator.DelimiterStyle.Orientation.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSeparatorTemplate$DelimiterStyleTemplate$Companion$TYPE_HELPER_ORIENTATION$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivSeparator.DelimiterStyle.Orientation);
                }
            });
            f38764g = new Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>>() { // from class: com.yandex.div2.DivSeparatorTemplate$DelimiterStyleTemplate$Companion$COLOR_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<Integer> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    Function1<Object, Integer> function1 = ParsingConvertersKt.f33827a;
                    ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                    Expression<Integer> expression = DivSeparatorTemplate.DelimiterStyleTemplate.f38761d;
                    Expression<Integer> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33853f);
                    return m17330v == null ? expression : m17330v;
                }
            };
            f38765h = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivSeparator.DelimiterStyle.Orientation>>() { // from class: com.yandex.div2.DivSeparatorTemplate$DelimiterStyleTemplate$Companion$ORIENTATION_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<DivSeparator.DelimiterStyle.Orientation> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    DivSeparator.DelimiterStyle.Orientation.Converter converter = DivSeparator.DelimiterStyle.Orientation.f38610c;
                    Function1<String, DivSeparator.DelimiterStyle.Orientation> function1 = DivSeparator.DelimiterStyle.Orientation.f38611d;
                    ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                    Expression<DivSeparator.DelimiterStyle.Orientation> expression = DivSeparatorTemplate.DelimiterStyleTemplate.f38762e;
                    Expression<DivSeparator.DelimiterStyle.Orientation> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivSeparatorTemplate.DelimiterStyleTemplate.f38763f);
                    return m17330v == null ? expression : m17330v;
                }
            };
            f38766i = new Function2<ParsingEnvironment, JSONObject, DelimiterStyleTemplate>() { // from class: com.yandex.div2.DivSeparatorTemplate$DelimiterStyleTemplate$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                public DivSeparatorTemplate.DelimiterStyleTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    ParsingEnvironment env = parsingEnvironment;
                    JSONObject it = jSONObject;
                    Intrinsics.m32179h(env, "env");
                    Intrinsics.m32179h(it, "it");
                    return new DivSeparatorTemplate.DelimiterStyleTemplate(env, null, false, it, 6);
                }
            };
        }

        public DelimiterStyleTemplate(ParsingEnvironment parsingEnvironment, DelimiterStyleTemplate delimiterStyleTemplate, boolean z, JSONObject jSONObject, int i2) {
            z = (i2 & 4) != 0 ? false : z;
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            this.f38767a = JsonTemplateParser.m17358s(jSONObject, "color", z, null, ParsingConvertersKt.f33827a, f34328a, parsingEnvironment, TypeHelpersKt.f33853f);
            DivSeparator.DelimiterStyle.Orientation.Converter converter = DivSeparator.DelimiterStyle.Orientation.f38610c;
            this.f38768b = JsonTemplateParser.m17358s(jSONObject, "orientation", z, null, DivSeparator.DelimiterStyle.Orientation.f38611d, f34328a, parsingEnvironment, f38763f);
        }

        @Override // com.yandex.div.json.JsonTemplate
        /* renamed from: a */
        public DivSeparator.DelimiterStyle mo17514a(ParsingEnvironment env, JSONObject data) {
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(data, "data");
            Expression<Integer> expression = (Expression) FieldKt.m17378d(this.f38767a, env, "color", data, f38764g);
            if (expression == null) {
                expression = f38761d;
            }
            Expression<DivSeparator.DelimiterStyle.Orientation> expression2 = (Expression) FieldKt.m17378d(this.f38768b, env, "orientation", data, f38765h);
            if (expression2 == null) {
                expression2 = f38762e;
            }
            return new DivSeparator.DelimiterStyle(expression, expression2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.f34334a;
        Expression m17539a = companion.m17539a(100L);
        Expression m17539a2 = companion.m17539a(Double.valueOf(0.6d));
        Expression m17539a3 = companion.m17539a(DivAnimation.Name.FADE);
        Double valueOf = Double.valueOf(1.0d);
        f38625H = new DivAnimation(m17539a, m17539a2, null, null, m17539a3, null, null, companion.m17539a(valueOf), C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
        f38627I = companion.m17539a(valueOf);
        f38629J = new DivBorder(null, null, null, null, null, 31);
        f38631K = new DivSeparator.DelimiterStyle(null, null == true ? 1 : 0, 3);
        int i2 = 7;
        f38633L = new DivSize.WrapContent(new DivWrapContentSize(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, i2));
        f38635M = new DivEdgeInsets(null == true ? 1 : 0, null == true ? 1 : 0, null, null, null, 31);
        f38637N = new DivEdgeInsets(null, null, null, null, null, 31);
        f38639O = new DivTransform(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, i2);
        f38641P = companion.m17539a(DivVisibility.VISIBLE);
        f38643Q = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i3 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f38645R = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f38647S = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f38649T = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f38651U = C3038c0.f41198l;
        f38653V = C3038c0.f41205s;
        f38655W = C3040d0.f41240f;
        f38657X = C3040d0.f41241g;
        f38659Y = C3038c0.f41184B;
        f38661Z = C3038c0.f41185C;
        f38663a0 = C3040d0.f41242h;
        f38665b0 = C3040d0.f41243i;
        f38667c0 = C3038c0.f41186D;
        f38668d0 = C3038c0.f41187E;
        f38669e0 = C3038c0.f41199m;
        f38670f0 = C3038c0.f41200n;
        f38671g0 = C3038c0.f41201o;
        f38672h0 = C3038c0.f41202p;
        f38673i0 = C3036b0.f41150y;
        f38674j0 = C3040d0.f41237c;
        f38675k0 = C3038c0.f41203q;
        f38676l0 = C3038c0.f41204r;
        f38677m0 = C3040d0.f41238d;
        f38678n0 = C3040d0.f41239e;
        f38679o0 = C3038c0.f41206t;
        f38680p0 = C3038c0.f41207u;
        f38681q0 = C3038c0.f41208v;
        f38682r0 = C3038c0.f41209w;
        f38683s0 = C3038c0.f41210x;
        f38684t0 = C3038c0.f41211y;
        f38685u0 = C3038c0.f41212z;
        f38686v0 = C3038c0.f41183A;
        f38687w0 = new Function3<String, JSONObject, ParsingEnvironment, DivAccessibility>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$ACCESSIBILITY_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAccessibility mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAccessibility.Companion companion3 = DivAccessibility.f34479f;
                DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject2, str2, DivAccessibility.f34486m, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divAccessibility == null ? DivSeparatorTemplate.f38623G : divAccessibility;
            }
        };
        f38688x0 = new Function3<String, JSONObject, ParsingEnvironment, DivAction>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$ACTION_READER$1
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
        f38689y0 = new Function3<String, JSONObject, ParsingEnvironment, DivAnimation>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$ACTION_ANIMATION_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAnimation mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAnimation.Companion companion3 = DivAnimation.f34634h;
                DivAnimation divAnimation = (DivAnimation) JsonParser.m17322n(jSONObject2, str2, DivAnimation.f34644r, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divAnimation == null ? DivSeparatorTemplate.f38625H : divAnimation;
            }
        };
        f38690z0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivSeparatorTemplate.f38651U, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f38617A0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$ALIGNMENT_HORIZONTAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentHorizontal> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentHorizontal.f34618d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivSeparatorTemplate.f38645R);
            }
        };
        f38618B0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$ALIGNMENT_VERTICAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentVertical> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentVertical.Converter converter = DivAlignmentVertical.f34625c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentVertical.f34626d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivSeparatorTemplate.f38647S);
            }
        };
        f38619C0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$ALPHA_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
                ValueValidator<Double> valueValidator = DivSeparatorTemplate.f38657X;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Double> expression = DivSeparatorTemplate.f38627I;
                Expression<Double> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
                return m17328t == null ? expression : m17328t;
            }
        };
        f38620D0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$BACKGROUND_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivBackground> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBackground.Companion companion3 = DivBackground.f34750a;
                return JsonParser.m17333y(jSONObject2, str2, DivBackground.f34751b, DivSeparatorTemplate.f38659Y, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f38621E0 = new Function3<String, JSONObject, ParsingEnvironment, DivBorder>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$BORDER_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivBorder mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBorder.Companion companion3 = DivBorder.f34785f;
                DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject2, str2, DivBorder.f34788i, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divBorder == null ? DivSeparatorTemplate.f38629J : divBorder;
            }
        };
        f38622F0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$COLUMN_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivSeparatorTemplate.f38665b0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f38624G0 = new Function3<String, JSONObject, ParsingEnvironment, DivSeparator.DelimiterStyle>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$DELIMITER_STYLE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSeparator.DelimiterStyle mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSeparator.DelimiterStyle.Companion companion3 = DivSeparator.DelimiterStyle.f38601c;
                DivSeparator.DelimiterStyle delimiterStyle = (DivSeparator.DelimiterStyle) JsonParser.m17322n(jSONObject2, str2, DivSeparator.DelimiterStyle.f38605g, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return delimiterStyle == null ? DivSeparatorTemplate.f38631K : delimiterStyle;
            }
        };
        f38626H0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$DISAPPEAR_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivDisappearAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivDisappearAction.Companion companion3 = DivDisappearAction.f35537a;
                return JsonParser.m17333y(jSONObject2, str2, DivDisappearAction.f35545i, DivSeparatorTemplate.f38667c0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f38628I0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$DOUBLETAP_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivSeparatorTemplate.f38669e0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f38630J0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$EXTENSIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivExtension> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivExtension.Companion companion3 = DivExtension.f35659c;
                return JsonParser.m17333y(jSONObject2, str2, DivExtension.f35660d, DivSeparatorTemplate.f38671g0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f38632K0 = new Function3<String, JSONObject, ParsingEnvironment, DivFocus>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$FOCUS_READER$1
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
        f38634L0 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$HEIGHT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivSeparatorTemplate.f38633L : divSize;
            }
        };
        f38636M0 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$ID_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return (String) JsonParser.m17323o(jSONObject2, str2, DivSeparatorTemplate.f38674j0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f38638N0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$LONGTAP_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivSeparatorTemplate.f38675k0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f38640O0 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$MARGINS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivSeparatorTemplate.f38635M : divEdgeInsets;
            }
        };
        f38642P0 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$PADDINGS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivSeparatorTemplate.f38637N : divEdgeInsets;
            }
        };
        f38644Q0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$ROW_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivSeparatorTemplate.f38678n0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f38646R0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$SELECTED_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivSeparatorTemplate.f38679o0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f38648S0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$TOOLTIPS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTooltip> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTooltip.Companion companion3 = DivTooltip.f40492h;
                return JsonParser.m17333y(jSONObject2, str2, DivTooltip.f40497m, DivSeparatorTemplate.f38681q0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f38650T0 = new Function3<String, JSONObject, ParsingEnvironment, DivTransform>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$TRANSFORM_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivTransform mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransform.Companion companion3 = DivTransform.f40551d;
                DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject2, str2, DivTransform.f40554g, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divTransform == null ? DivSeparatorTemplate.f38639O : divTransform;
            }
        };
        f38652U0 = new Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$TRANSITION_CHANGE_READER$1
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
        f38654V0 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$TRANSITION_IN_READER$1
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
        f38656W0 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$TRANSITION_OUT_READER$1
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
        f38658X0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$TRANSITION_TRIGGERS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTransitionTrigger> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransitionTrigger.Converter converter = DivTransitionTrigger.f40582c;
                return JsonParser.m17332x(jSONObject2, str2, DivTransitionTrigger.f40583d, DivSeparatorTemplate.f38683s0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        DivSeparatorTemplate$Companion$TYPE_READER$1 divSeparatorTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$TYPE_READER$1
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
        f38660Y0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$VISIBILITY_READER$1
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
                Expression<DivVisibility> expression = DivSeparatorTemplate.f38641P;
                Expression<DivVisibility> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivSeparatorTemplate.f38649T);
                return m17330v == null ? expression : m17330v;
            }
        };
        f38662Z0 = new Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$VISIBILITY_ACTION_READER$1
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
        f38664a1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$VISIBILITY_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivVisibilityAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivVisibilityAction.Companion companion3 = DivVisibilityAction.f40938i;
                return JsonParser.m17333y(jSONObject2, str2, DivVisibilityAction.f40946q, DivSeparatorTemplate.f38685u0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f38666b1 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$WIDTH_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivSeparatorTemplate.f38643Q : divSize;
            }
        };
        DivSeparatorTemplate$Companion$CREATOR$1 divSeparatorTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivSeparatorTemplate>() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivSeparatorTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivSeparatorTemplate(env, null, false, it);
            }
        };
    }

    public DivSeparatorTemplate(@NotNull ParsingEnvironment env, @Nullable DivSeparatorTemplate divSeparatorTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        Field<DivAccessibilityTemplate> field = divSeparatorTemplate == null ? null : divSeparatorTemplate.f38697a;
        DivAccessibilityTemplate.Companion companion = DivAccessibilityTemplate.f34515g;
        this.f38697a = JsonTemplateParser.m17354o(json, "accessibility", z, field, DivAccessibilityTemplate.f34531w, f34328a, env);
        Field<DivActionTemplate> field2 = divSeparatorTemplate == null ? null : divSeparatorTemplate.f38698b;
        DivActionTemplate.Companion companion2 = DivActionTemplate.f34572i;
        Function2<ParsingEnvironment, JSONObject, DivActionTemplate> function2 = DivActionTemplate.f34586w;
        this.f38698b = JsonTemplateParser.m17354o(json, "action", z, field2, function2, f34328a, env);
        Field<DivAnimationTemplate> field3 = divSeparatorTemplate == null ? null : divSeparatorTemplate.f38699c;
        DivAnimationTemplate.Companion companion3 = DivAnimationTemplate.f34681i;
        this.f38699c = JsonTemplateParser.m17354o(json, "action_animation", z, field3, DivAnimationTemplate.f34680D, f34328a, env);
        this.f38700d = JsonTemplateParser.m17360u(json, "actions", z, divSeparatorTemplate == null ? null : divSeparatorTemplate.f38700d, function2, f38653V, f34328a, env);
        Field<Expression<DivAlignmentHorizontal>> field4 = divSeparatorTemplate == null ? null : divSeparatorTemplate.f38701e;
        DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
        this.f38701e = JsonTemplateParser.m17358s(json, "alignment_horizontal", z, field4, DivAlignmentHorizontal.f34618d, f34328a, env, f38645R);
        Field<Expression<DivAlignmentVertical>> field5 = divSeparatorTemplate == null ? null : divSeparatorTemplate.f38702f;
        DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
        this.f38702f = JsonTemplateParser.m17358s(json, "alignment_vertical", z, field5, DivAlignmentVertical.f34626d, f34328a, env, f38647S);
        this.f38703g = JsonTemplateParser.m17357r(json, "alpha", z, divSeparatorTemplate == null ? null : divSeparatorTemplate.f38703g, ParsingConvertersKt.f33830d, f38655W, f34328a, env, TypeHelpersKt.f33851d);
        Field<List<DivBackgroundTemplate>> field6 = divSeparatorTemplate == null ? null : divSeparatorTemplate.f38704h;
        DivBackgroundTemplate.Companion companion4 = DivBackgroundTemplate.f34758a;
        this.f38704h = JsonTemplateParser.m17360u(json, "background", z, field6, DivBackgroundTemplate.f34759b, f38661Z, f34328a, env);
        Field<DivBorderTemplate> field7 = divSeparatorTemplate == null ? null : divSeparatorTemplate.f38705i;
        DivBorderTemplate.Companion companion5 = DivBorderTemplate.f34795f;
        this.f38705i = JsonTemplateParser.m17354o(json, "border", z, field7, DivBorderTemplate.f34804o, f34328a, env);
        Field<Expression<Long>> field8 = divSeparatorTemplate == null ? null : divSeparatorTemplate.f38706j;
        Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
        ValueValidator<Long> valueValidator = f38663a0;
        TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
        this.f38706j = JsonTemplateParser.m17357r(json, "column_span", z, field8, function1, valueValidator, f34328a, env, typeHelper);
        Field<DelimiterStyleTemplate> field9 = divSeparatorTemplate == null ? null : divSeparatorTemplate.f38707k;
        DelimiterStyleTemplate.Companion companion6 = DelimiterStyleTemplate.f38760c;
        this.f38707k = JsonTemplateParser.m17354o(json, "delimiter_style", z, field9, DelimiterStyleTemplate.f38766i, f34328a, env);
        Field<List<DivDisappearActionTemplate>> field10 = divSeparatorTemplate == null ? null : divSeparatorTemplate.f38708l;
        DivDisappearActionTemplate.Companion companion7 = DivDisappearActionTemplate.f35550i;
        this.f38708l = JsonTemplateParser.m17360u(json, "disappear_actions", z, field10, DivDisappearActionTemplate.f35549C, f38668d0, f34328a, env);
        this.f38709m = JsonTemplateParser.m17360u(json, "doubletap_actions", z, divSeparatorTemplate == null ? null : divSeparatorTemplate.f38709m, function2, f38670f0, f34328a, env);
        Field<List<DivExtensionTemplate>> field11 = divSeparatorTemplate == null ? null : divSeparatorTemplate.f38710n;
        DivExtensionTemplate.Companion companion8 = DivExtensionTemplate.f35664c;
        this.f38710n = JsonTemplateParser.m17360u(json, "extensions", z, field11, DivExtensionTemplate.f35667f, f38672h0, f34328a, env);
        Field<DivFocusTemplate> field12 = divSeparatorTemplate == null ? null : divSeparatorTemplate.f38711o;
        DivFocusTemplate.Companion companion9 = DivFocusTemplate.f35833f;
        this.f38711o = JsonTemplateParser.m17354o(json, "focus", z, field12, DivFocusTemplate.f35846s, f34328a, env);
        Field<DivSizeTemplate> field13 = divSeparatorTemplate == null ? null : divSeparatorTemplate.f38712p;
        DivSizeTemplate.Companion companion10 = DivSizeTemplate.f38839a;
        Function2<ParsingEnvironment, JSONObject, DivSizeTemplate> function22 = DivSizeTemplate.f38840b;
        this.f38712p = JsonTemplateParser.m17354o(json, "height", z, field13, function22, f34328a, env);
        this.f38713q = JsonTemplateParser.m17351l(json, "id", z, divSeparatorTemplate == null ? null : divSeparatorTemplate.f38713q, f38673i0, f34328a, env);
        this.f38714r = JsonTemplateParser.m17360u(json, "longtap_actions", z, divSeparatorTemplate == null ? null : divSeparatorTemplate.f38714r, function2, f38676l0, f34328a, env);
        Field<DivEdgeInsetsTemplate> field14 = divSeparatorTemplate == null ? null : divSeparatorTemplate.f38715s;
        DivEdgeInsetsTemplate.Companion companion11 = DivEdgeInsetsTemplate.f35626f;
        Function2<ParsingEnvironment, JSONObject, DivEdgeInsetsTemplate> function23 = DivEdgeInsetsTemplate.f35646z;
        this.f38715s = JsonTemplateParser.m17354o(json, "margins", z, field14, function23, f34328a, env);
        this.f38716t = JsonTemplateParser.m17354o(json, "paddings", z, divSeparatorTemplate == null ? null : divSeparatorTemplate.f38716t, function23, f34328a, env);
        this.f38717u = JsonTemplateParser.m17357r(json, "row_span", z, divSeparatorTemplate == null ? null : divSeparatorTemplate.f38717u, function1, f38677m0, f34328a, env, typeHelper);
        this.f38718v = JsonTemplateParser.m17360u(json, "selected_actions", z, divSeparatorTemplate == null ? null : divSeparatorTemplate.f38718v, function2, f38680p0, f34328a, env);
        Field<List<DivTooltipTemplate>> field15 = divSeparatorTemplate == null ? null : divSeparatorTemplate.f38719w;
        DivTooltipTemplate.Companion companion12 = DivTooltipTemplate.f40520h;
        this.f38719w = JsonTemplateParser.m17360u(json, "tooltips", z, field15, DivTooltipTemplate.f40534v, f38682r0, f34328a, env);
        Field<DivTransformTemplate> field16 = divSeparatorTemplate == null ? null : divSeparatorTemplate.f38720x;
        DivTransformTemplate.Companion companion13 = DivTransformTemplate.f40559d;
        this.f38720x = JsonTemplateParser.m17354o(json, "transform", z, field16, DivTransformTemplate.f40565j, f34328a, env);
        Field<DivChangeTransitionTemplate> field17 = divSeparatorTemplate == null ? null : divSeparatorTemplate.f38721y;
        DivChangeTransitionTemplate.Companion companion14 = DivChangeTransitionTemplate.f34861a;
        this.f38721y = JsonTemplateParser.m17354o(json, "transition_change", z, field17, DivChangeTransitionTemplate.f34862b, f34328a, env);
        Field<DivAppearanceTransitionTemplate> field18 = divSeparatorTemplate == null ? null : divSeparatorTemplate.f38722z;
        DivAppearanceTransitionTemplate.Companion companion15 = DivAppearanceTransitionTemplate.f34733a;
        Function2<ParsingEnvironment, JSONObject, DivAppearanceTransitionTemplate> function24 = DivAppearanceTransitionTemplate.f34734b;
        this.f38722z = JsonTemplateParser.m17354o(json, "transition_in", z, field18, function24, f34328a, env);
        this.f38691A = JsonTemplateParser.m17354o(json, "transition_out", z, divSeparatorTemplate == null ? null : divSeparatorTemplate.f38691A, function24, f34328a, env);
        Field<List<DivTransitionTrigger>> field19 = divSeparatorTemplate == null ? null : divSeparatorTemplate.f38692B;
        DivTransitionTrigger.Converter converter3 = DivTransitionTrigger.f40582c;
        this.f38692B = JsonTemplateParser.m17359t(json, "transition_triggers", z, field19, DivTransitionTrigger.f40583d, f38684t0, f34328a, env);
        Field<Expression<DivVisibility>> field20 = divSeparatorTemplate == null ? null : divSeparatorTemplate.f38693C;
        DivVisibility.Converter converter4 = DivVisibility.f40930c;
        this.f38693C = JsonTemplateParser.m17358s(json, "visibility", z, field20, DivVisibility.f40931d, f34328a, env, f38649T);
        Field<DivVisibilityActionTemplate> field21 = divSeparatorTemplate == null ? null : divSeparatorTemplate.f38694D;
        DivVisibilityActionTemplate.Companion companion16 = DivVisibilityActionTemplate.f40959i;
        Function2<ParsingEnvironment, JSONObject, DivVisibilityActionTemplate> function25 = DivVisibilityActionTemplate.f40958C;
        this.f38694D = JsonTemplateParser.m17354o(json, "visibility_action", z, field21, function25, f34328a, env);
        this.f38695E = JsonTemplateParser.m17360u(json, "visibility_actions", z, divSeparatorTemplate == null ? null : divSeparatorTemplate.f38695E, function25, f38686v0, f34328a, env);
        this.f38696F = JsonTemplateParser.m17354o(json, "width", z, divSeparatorTemplate == null ? null : divSeparatorTemplate.f38696F, function22, f34328a, env);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivSeparator mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        DivAccessibility divAccessibility = (DivAccessibility) FieldKt.m17381g(this.f38697a, env, "accessibility", data, f38687w0);
        if (divAccessibility == null) {
            divAccessibility = f38623G;
        }
        DivAccessibility divAccessibility2 = divAccessibility;
        DivAction divAction = (DivAction) FieldKt.m17381g(this.f38698b, env, "action", data, f38688x0);
        DivAnimation divAnimation = (DivAnimation) FieldKt.m17381g(this.f38699c, env, "action_animation", data, f38689y0);
        if (divAnimation == null) {
            divAnimation = f38625H;
        }
        DivAnimation divAnimation2 = divAnimation;
        List m17382h = FieldKt.m17382h(this.f38700d, env, "actions", data, f38651U, f38690z0);
        Expression expression = (Expression) FieldKt.m17378d(this.f38701e, env, "alignment_horizontal", data, f38617A0);
        Expression expression2 = (Expression) FieldKt.m17378d(this.f38702f, env, "alignment_vertical", data, f38618B0);
        Expression<Double> expression3 = (Expression) FieldKt.m17378d(this.f38703g, env, "alpha", data, f38619C0);
        if (expression3 == null) {
            expression3 = f38627I;
        }
        Expression<Double> expression4 = expression3;
        List m17382h2 = FieldKt.m17382h(this.f38704h, env, "background", data, f38659Y, f38620D0);
        DivBorder divBorder = (DivBorder) FieldKt.m17381g(this.f38705i, env, "border", data, f38621E0);
        if (divBorder == null) {
            divBorder = f38629J;
        }
        DivBorder divBorder2 = divBorder;
        Expression expression5 = (Expression) FieldKt.m17378d(this.f38706j, env, "column_span", data, f38622F0);
        DivSeparator.DelimiterStyle delimiterStyle = (DivSeparator.DelimiterStyle) FieldKt.m17381g(this.f38707k, env, "delimiter_style", data, f38624G0);
        if (delimiterStyle == null) {
            delimiterStyle = f38631K;
        }
        DivSeparator.DelimiterStyle delimiterStyle2 = delimiterStyle;
        List m17382h3 = FieldKt.m17382h(this.f38708l, env, "disappear_actions", data, f38667c0, f38626H0);
        List m17382h4 = FieldKt.m17382h(this.f38709m, env, "doubletap_actions", data, f38669e0, f38628I0);
        List m17382h5 = FieldKt.m17382h(this.f38710n, env, "extensions", data, f38671g0, f38630J0);
        DivFocus divFocus = (DivFocus) FieldKt.m17381g(this.f38711o, env, "focus", data, f38632K0);
        DivSize divSize = (DivSize) FieldKt.m17381g(this.f38712p, env, "height", data, f38634L0);
        if (divSize == null) {
            divSize = f38633L;
        }
        DivSize divSize2 = divSize;
        String str = (String) FieldKt.m17378d(this.f38713q, env, "id", data, f38636M0);
        List m17382h6 = FieldKt.m17382h(this.f38714r, env, "longtap_actions", data, f38675k0, f38638N0);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) FieldKt.m17381g(this.f38715s, env, "margins", data, f38640O0);
        if (divEdgeInsets == null) {
            divEdgeInsets = f38635M;
        }
        DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
        DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) FieldKt.m17381g(this.f38716t, env, "paddings", data, f38642P0);
        if (divEdgeInsets3 == null) {
            divEdgeInsets3 = f38637N;
        }
        DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
        Expression expression6 = (Expression) FieldKt.m17378d(this.f38717u, env, "row_span", data, f38644Q0);
        List m17382h7 = FieldKt.m17382h(this.f38718v, env, "selected_actions", data, f38679o0, f38646R0);
        List m17382h8 = FieldKt.m17382h(this.f38719w, env, "tooltips", data, f38681q0, f38648S0);
        DivTransform divTransform = (DivTransform) FieldKt.m17381g(this.f38720x, env, "transform", data, f38650T0);
        if (divTransform == null) {
            divTransform = f38639O;
        }
        DivTransform divTransform2 = divTransform;
        DivChangeTransition divChangeTransition = (DivChangeTransition) FieldKt.m17381g(this.f38721y, env, "transition_change", data, f38652U0);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) FieldKt.m17381g(this.f38722z, env, "transition_in", data, f38654V0);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) FieldKt.m17381g(this.f38691A, env, "transition_out", data, f38656W0);
        List m17380f = FieldKt.m17380f(this.f38692B, env, "transition_triggers", data, f38683s0, f38658X0);
        Expression<DivVisibility> expression7 = (Expression) FieldKt.m17378d(this.f38693C, env, "visibility", data, f38660Y0);
        if (expression7 == null) {
            expression7 = f38641P;
        }
        Expression<DivVisibility> expression8 = expression7;
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) FieldKt.m17381g(this.f38694D, env, "visibility_action", data, f38662Z0);
        List m17382h9 = FieldKt.m17382h(this.f38695E, env, "visibility_actions", data, f38685u0, f38664a1);
        DivSize divSize3 = (DivSize) FieldKt.m17381g(this.f38696F, env, "width", data, f38666b1);
        if (divSize3 == null) {
            divSize3 = f38643Q;
        }
        return new DivSeparator(divAccessibility2, divAction, divAnimation2, m17382h, expression, expression2, expression4, m17382h2, divBorder2, expression5, delimiterStyle2, m17382h3, m17382h4, m17382h5, divFocus, divSize2, str, m17382h6, divEdgeInsets2, divEdgeInsets4, expression6, m17382h7, m17382h8, divTransform2, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17380f, expression8, divVisibilityAction, m17382h9, divSize3);
    }
}
