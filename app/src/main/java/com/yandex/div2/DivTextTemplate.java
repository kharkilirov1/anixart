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
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivFixedSizeTemplate;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivFocusTemplate;
import com.yandex.div2.DivFontFamily;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivLineStyle;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeTemplate;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivText;
import com.yandex.div2.DivTextGradient;
import com.yandex.div2.DivTextGradientTemplate;
import com.yandex.div2.DivTextRangeBackground;
import com.yandex.div2.DivTextRangeBackgroundTemplate;
import com.yandex.div2.DivTextRangeBorder;
import com.yandex.div2.DivTextRangeBorderTemplate;
import com.yandex.div2.DivTextTemplate;
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

/* compiled from: DivTextTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, m31884d2 = {"Lcom/yandex/div2/DivTextTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivText;", "Companion", "EllipsisTemplate", "ImageTemplate", "RangeTemplate", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivTextTemplate implements JSONSerializable, JsonTemplate<DivText> {

    /* renamed from: A0 */
    @NotNull
    public static final TypeHelper<DivLineStyle> f40087A0;

    /* renamed from: A1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>> f40088A1;

    /* renamed from: B0 */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f40089B0;

    /* renamed from: B1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f40090B1;

    /* renamed from: C0 */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f40091C0;

    /* renamed from: C1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>> f40092C1;

    /* renamed from: D0 */
    @NotNull
    public static final TypeHelper<DivLineStyle> f40093D0;

    /* renamed from: D1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>> f40094D1;

    /* renamed from: E0 */
    @NotNull
    public static final TypeHelper<DivVisibility> f40095E0;

    /* renamed from: E1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivBorder> f40096E1;

    /* renamed from: F0 */
    @NotNull
    public static final ListValidator<DivAction> f40097F0;

    /* renamed from: F1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f40098F1;

    /* renamed from: G0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f40099G0;

    /* renamed from: G1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>> f40100G1;

    /* renamed from: H0 */
    @NotNull
    public static final ValueValidator<Double> f40101H0;

    /* renamed from: H1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f40102H1;

    /* renamed from: I0 */
    @NotNull
    public static final ValueValidator<Double> f40103I0;

    /* renamed from: I1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivText.Ellipsis> f40104I1;

    /* renamed from: J0 */
    @NotNull
    public static final ListValidator<DivBackground> f40105J0;

    /* renamed from: J1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>> f40106J1;

    /* renamed from: K0 */
    @NotNull
    public static final ListValidator<DivBackgroundTemplate> f40107K0;

    /* renamed from: K1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivFocus> f40108K1;

    /* renamed from: L0 */
    @NotNull
    public static final ValueValidator<Long> f40109L0;

    /* renamed from: L1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>> f40110L1;

    /* renamed from: M0 */
    @NotNull
    public static final ValueValidator<Long> f40111M0;

    /* renamed from: M1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivFontFamily>> f40112M1;

    /* renamed from: N0 */
    @NotNull
    public static final ListValidator<DivDisappearAction> f40113N0;

    /* renamed from: N1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f40114N1;

    /* renamed from: O0 */
    @NotNull
    public static final ListValidator<DivDisappearActionTemplate> f40115O0;

    /* renamed from: O1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivSizeUnit>> f40116O1;

    /* renamed from: P0 */
    @NotNull
    public static final ListValidator<DivAction> f40117P0;

    /* renamed from: P1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivFontWeight>> f40118P1;

    /* renamed from: Q0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f40119Q0;

    /* renamed from: Q1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f40120Q1;

    /* renamed from: R0 */
    @NotNull
    public static final ListValidator<DivExtension> f40121R0;

    /* renamed from: R1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f40122R1;

    /* renamed from: S0 */
    @NotNull
    public static final ListValidator<DivExtensionTemplate> f40123S0;

    /* renamed from: S1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivText.Image>> f40124S1;

    /* renamed from: T0 */
    @NotNull
    public static final ValueValidator<Long> f40125T0;

    /* renamed from: T1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f40126T1;

    /* renamed from: U0 */
    @NotNull
    public static final ValueValidator<Long> f40127U0;

    /* renamed from: U1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f40128U1;

    /* renamed from: V0 */
    @NotNull
    public static final ValueValidator<String> f40129V0;

    /* renamed from: V1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f40130V1;

    /* renamed from: W0 */
    @NotNull
    public static final ValueValidator<String> f40131W0;

    /* renamed from: W1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f40132W1;

    /* renamed from: X0 */
    @NotNull
    public static final ListValidator<DivText.Image> f40133X0;

    /* renamed from: X1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f40134X1;

    /* renamed from: Y0 */
    @NotNull
    public static final ListValidator<ImageTemplate> f40135Y0;

    /* renamed from: Y1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f40136Y1;

    /* renamed from: Z0 */
    @NotNull
    public static final ValueValidator<Long> f40137Z0;

    /* renamed from: Z1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f40138Z1;

    /* renamed from: a0 */
    @NotNull
    public static final DivAccessibility f40139a0 = new DivAccessibility(null, null, null, null, null, null, 63);

    /* renamed from: a1 */
    @NotNull
    public static final ValueValidator<Long> f40140a1;

    /* renamed from: a2 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivText.Range>> f40141a2;

    /* renamed from: b0 */
    @NotNull
    public static final DivAnimation f40142b0;

    /* renamed from: b1 */
    @NotNull
    public static final ListValidator<DivAction> f40143b1;

    /* renamed from: b2 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f40144b2;

    /* renamed from: c0 */
    @NotNull
    public static final Expression<Double> f40145c0;

    /* renamed from: c1 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f40146c1;

    /* renamed from: c2 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>> f40147c2;

    /* renamed from: d0 */
    @NotNull
    public static final DivBorder f40148d0;

    /* renamed from: d1 */
    @NotNull
    public static final ValueValidator<Long> f40149d1;

    /* renamed from: d2 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f40150d2;

    /* renamed from: e0 */
    @NotNull
    public static final Expression<DivFontFamily> f40151e0;

    /* renamed from: e1 */
    @NotNull
    public static final ValueValidator<Long> f40152e1;

    /* renamed from: e2 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivLineStyle>> f40153e2;

    /* renamed from: f0 */
    @NotNull
    public static final Expression<Long> f40154f0;

    /* renamed from: f1 */
    @NotNull
    public static final ValueValidator<Long> f40155f1;

    /* renamed from: f2 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<String>> f40156f2;

    /* renamed from: g0 */
    @NotNull
    public static final Expression<DivSizeUnit> f40157g0;

    /* renamed from: g1 */
    @NotNull
    public static final ValueValidator<Long> f40158g1;

    /* renamed from: g2 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>> f40159g2;

    /* renamed from: h0 */
    @NotNull
    public static final Expression<DivFontWeight> f40160h0;

    /* renamed from: h1 */
    @NotNull
    public static final ListValidator<DivText.Range> f40161h1;

    /* renamed from: h2 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>> f40162h2;

    /* renamed from: i0 */
    @NotNull
    public static final DivSize.WrapContent f40163i0;

    /* renamed from: i1 */
    @NotNull
    public static final ListValidator<RangeTemplate> f40164i1;

    /* renamed from: i2 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>> f40165i2;

    /* renamed from: j0 */
    @NotNull
    public static final Expression<Double> f40166j0;

    /* renamed from: j1 */
    @NotNull
    public static final ValueValidator<Long> f40167j1;

    /* renamed from: j2 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivTextGradient> f40168j2;

    /* renamed from: k0 */
    @NotNull
    public static final DivEdgeInsets f40169k0;

    /* renamed from: k1 */
    @NotNull
    public static final ValueValidator<Long> f40170k1;

    /* renamed from: k2 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>> f40171k2;

    /* renamed from: l0 */
    @NotNull
    public static final DivEdgeInsets f40172l0;

    /* renamed from: l1 */
    @NotNull
    public static final ListValidator<DivAction> f40173l1;

    /* renamed from: l2 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivTransform> f40174l2;

    /* renamed from: m0 */
    @NotNull
    public static final Expression<Boolean> f40175m0;

    /* renamed from: m1 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f40176m1;

    /* renamed from: m2 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition> f40177m2;

    /* renamed from: n0 */
    @NotNull
    public static final Expression<DivLineStyle> f40178n0;

    /* renamed from: n1 */
    @NotNull
    public static final ValueValidator<String> f40179n1;

    /* renamed from: n2 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f40180n2;

    /* renamed from: o0 */
    @NotNull
    public static final Expression<DivAlignmentHorizontal> f40181o0;

    /* renamed from: o1 */
    @NotNull
    public static final ValueValidator<String> f40182o1;

    /* renamed from: o2 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f40183o2;

    /* renamed from: p0 */
    @NotNull
    public static final Expression<DivAlignmentVertical> f40184p0;

    /* renamed from: p1 */
    @NotNull
    public static final ListValidator<DivTooltip> f40185p1;

    /* renamed from: p2 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>> f40186p2;

    /* renamed from: q0 */
    @NotNull
    public static final Expression<Integer> f40187q0;

    /* renamed from: q1 */
    @NotNull
    public static final ListValidator<DivTooltipTemplate> f40188q1;

    /* renamed from: q2 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivLineStyle>> f40189q2;

    /* renamed from: r0 */
    @NotNull
    public static final DivTransform f40190r0;

    /* renamed from: r1 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f40191r1;

    /* renamed from: r2 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>> f40192r2;

    /* renamed from: s0 */
    @NotNull
    public static final Expression<DivLineStyle> f40193s0;

    /* renamed from: s1 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f40194s1;

    /* renamed from: s2 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction> f40195s2;

    /* renamed from: t0 */
    @NotNull
    public static final Expression<DivVisibility> f40196t0;

    /* renamed from: t1 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f40197t1;

    /* renamed from: t2 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>> f40198t2;

    /* renamed from: u0 */
    @NotNull
    public static final DivSize.MatchParent f40199u0;

    /* renamed from: u1 */
    @NotNull
    public static final ListValidator<DivVisibilityActionTemplate> f40200u1;

    /* renamed from: u2 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f40201u2;

    /* renamed from: v0 */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f40202v0;

    /* renamed from: v1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAccessibility> f40203v1;

    /* renamed from: w0 */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f40204w0;

    /* renamed from: w1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAction> f40205w1;

    /* renamed from: x0 */
    @NotNull
    public static final TypeHelper<DivFontFamily> f40206x0;

    /* renamed from: x1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAnimation> f40207x1;

    /* renamed from: y0 */
    @NotNull
    public static final TypeHelper<DivSizeUnit> f40208y0;

    /* renamed from: y1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f40209y1;

    /* renamed from: z0 */
    @NotNull
    public static final TypeHelper<DivFontWeight> f40210z0;

    /* renamed from: z1 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>> f40211z1;

    /* renamed from: A */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f40212A;

    /* renamed from: B */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f40213B;

    /* renamed from: C */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f40214C;

    /* renamed from: D */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f40215D;

    /* renamed from: E */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f40216E;

    /* renamed from: F */
    @JvmField
    @NotNull
    public final Field<List<RangeTemplate>> f40217F;

    /* renamed from: G */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f40218G;

    /* renamed from: H */
    @JvmField
    @NotNull
    public final Field<Expression<Boolean>> f40219H;

    /* renamed from: I */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f40220I;

    /* renamed from: J */
    @JvmField
    @NotNull
    public final Field<Expression<DivLineStyle>> f40221J;

    /* renamed from: K */
    @JvmField
    @NotNull
    public final Field<Expression<String>> f40222K;

    /* renamed from: L */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f40223L;

    /* renamed from: M */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f40224M;

    /* renamed from: N */
    @JvmField
    @NotNull
    public final Field<Expression<Integer>> f40225N;

    /* renamed from: O */
    @JvmField
    @NotNull
    public final Field<DivTextGradientTemplate> f40226O;

    /* renamed from: P */
    @JvmField
    @NotNull
    public final Field<List<DivTooltipTemplate>> f40227P;

    /* renamed from: Q */
    @JvmField
    @NotNull
    public final Field<DivTransformTemplate> f40228Q;

    /* renamed from: R */
    @JvmField
    @NotNull
    public final Field<DivChangeTransitionTemplate> f40229R;

    /* renamed from: S */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f40230S;

    /* renamed from: T */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f40231T;

    /* renamed from: U */
    @JvmField
    @NotNull
    public final Field<List<DivTransitionTrigger>> f40232U;

    /* renamed from: V */
    @JvmField
    @NotNull
    public final Field<Expression<DivLineStyle>> f40233V;

    /* renamed from: W */
    @JvmField
    @NotNull
    public final Field<Expression<DivVisibility>> f40234W;

    /* renamed from: X */
    @JvmField
    @NotNull
    public final Field<DivVisibilityActionTemplate> f40235X;

    /* renamed from: Y */
    @JvmField
    @NotNull
    public final Field<List<DivVisibilityActionTemplate>> f40236Y;

    /* renamed from: Z */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f40237Z;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<DivAccessibilityTemplate> f40238a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<DivActionTemplate> f40239b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<DivAnimationTemplate> f40240c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f40241d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f40242e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f40243f;

    /* renamed from: g */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f40244g;

    /* renamed from: h */
    @JvmField
    @NotNull
    public final Field<Expression<Boolean>> f40245h;

    /* renamed from: i */
    @JvmField
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f40246i;

    /* renamed from: j */
    @JvmField
    @NotNull
    public final Field<DivBorderTemplate> f40247j;

    /* renamed from: k */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f40248k;

    /* renamed from: l */
    @JvmField
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f40249l;

    /* renamed from: m */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f40250m;

    /* renamed from: n */
    @JvmField
    @NotNull
    public final Field<EllipsisTemplate> f40251n;

    /* renamed from: o */
    @JvmField
    @NotNull
    public final Field<List<DivExtensionTemplate>> f40252o;

    /* renamed from: p */
    @JvmField
    @NotNull
    public final Field<DivFocusTemplate> f40253p;

    /* renamed from: q */
    @JvmField
    @NotNull
    public final Field<Expression<Integer>> f40254q;

    /* renamed from: r */
    @JvmField
    @NotNull
    public final Field<Expression<DivFontFamily>> f40255r;

    /* renamed from: s */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f40256s;

    /* renamed from: t */
    @JvmField
    @NotNull
    public final Field<Expression<DivSizeUnit>> f40257t;

    /* renamed from: u */
    @JvmField
    @NotNull
    public final Field<Expression<DivFontWeight>> f40258u;

    /* renamed from: v */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f40259v;

    /* renamed from: w */
    @JvmField
    @NotNull
    public final Field<String> f40260w;

    /* renamed from: x */
    @JvmField
    @NotNull
    public final Field<List<ImageTemplate>> f40261x;

    /* renamed from: y */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f40262y;

    /* renamed from: z */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f40263z;

    /* compiled from: DivTextTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000¢\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\bR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\bR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0014R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\bR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\bR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\bR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\bR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\bR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\bR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0011R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0011R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0014R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0011R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0014R\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0011R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\u0014R\u001a\u00108\u001a\b\u0012\u0004\u0012\u0002060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0014R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\bR\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\bR\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010\u0011R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010\u0014R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0014R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\bR\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010\bR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010\u0014R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010\u0014R\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010\u0014R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010\u0014R\u0014\u0010I\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010DR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020J0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010\bR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020L0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010\bR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010\u0014R\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010\u0014R\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010\u0011R\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010\bR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010\bR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020T0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010\u0011R\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020V0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010\u0011R\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020X0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010\u0011R\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\u0011R\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u0002060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010\u0014R\u001a\u0010]\u001a\b\u0012\u0004\u0012\u0002060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010\u0014R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020^0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010\bR\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020`0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010\bR\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020e0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010\bR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020e0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010\bR\u0014\u0010h\u001a\u0002068\u0006X\u0086T¢\u0006\u0006\n\u0004\bh\u0010iR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020V0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020X0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010lR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020*0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010lR\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020.0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010lR\u001a\u0010p\u001a\b\u0012\u0004\u0012\u0002010j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010lR\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00020T0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010lR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020V0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010lR\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020X0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010lR\u001a\u0010t\u001a\b\u0012\u0004\u0012\u00020T0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010lR\u001a\u0010v\u001a\b\u0012\u0004\u0012\u00020u0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010lR\u001a\u0010w\u001a\b\u0012\u0004\u0012\u00020T0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010\u0011R\u001a\u0010y\u001a\b\u0012\u0004\u0012\u00020x0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010\bR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020z0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010\bR\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00020u0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010\u0011R\u0014\u0010~\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007f¨\u0006\u0080\u0001"}, m31884d2 = {"Lcom/yandex/div2/DivTextTemplate$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivActionTemplate;", "ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAction;", "ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivAnimation;", "ACTION_ANIMATION_DEFAULT_VALUE", "Lcom/yandex/div2/DivAnimation;", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "Lcom/yandex/div2/DivBackgroundTemplate;", "BACKGROUND_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivDisappearActionTemplate;", "DISAPPEAR_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "DOUBLETAP_ACTIONS_TEMPLATE_VALIDATOR", "DOUBLETAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivExtensionTemplate;", "EXTENSIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/DivFontFamily;", "FONT_FAMILY_DEFAULT_VALUE", "FONT_SIZE_DEFAULT_VALUE", "FONT_SIZE_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivSizeUnit;", "FONT_SIZE_UNIT_DEFAULT_VALUE", "FONT_SIZE_VALIDATOR", "Lcom/yandex/div2/DivFontWeight;", "FONT_WEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div2/DivTextTemplate$ImageTemplate;", "IMAGES_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivText$Image;", "IMAGES_VALIDATOR", "LETTER_SPACING_DEFAULT_VALUE", "LINE_HEIGHT_TEMPLATE_VALIDATOR", "LINE_HEIGHT_VALIDATOR", "LONGTAP_ACTIONS_TEMPLATE_VALIDATOR", "LONGTAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "MAX_LINES_TEMPLATE_VALIDATOR", "MAX_LINES_VALIDATOR", "MIN_HIDDEN_LINES_TEMPLATE_VALIDATOR", "MIN_HIDDEN_LINES_VALIDATOR", "PADDINGS_DEFAULT_VALUE", "Lcom/yandex/div2/DivTextTemplate$RangeTemplate;", "RANGES_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivText$Range;", "RANGES_VALIDATOR", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "", "SELECTABLE_DEFAULT_VALUE", "SELECTED_ACTIONS_TEMPLATE_VALIDATOR", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivLineStyle;", "STRIKE_DEFAULT_VALUE", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TEXT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE", "Lcom/yandex/div2/DivAlignmentVertical;", "TEXT_ALIGNMENT_VERTICAL_DEFAULT_VALUE", "", "TEXT_COLOR_DEFAULT_VALUE", "TEXT_TEMPLATE_VALIDATOR", "TEXT_VALIDATOR", "Lcom/yandex/div2/DivTooltipTemplate;", "TOOLTIPS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_TEMPLATE_VALIDATOR", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "TYPE_HELPER_FONT_FAMILY", "TYPE_HELPER_FONT_SIZE_UNIT", "TYPE_HELPER_FONT_WEIGHT", "TYPE_HELPER_STRIKE", "TYPE_HELPER_TEXT_ALIGNMENT_HORIZONTAL", "TYPE_HELPER_TEXT_ALIGNMENT_VERTICAL", "TYPE_HELPER_UNDERLINE", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "UNDERLINE_DEFAULT_VALUE", "Lcom/yandex/div2/DivVisibilityActionTemplate;", "VISIBILITY_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: DivTextTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivTextTemplate$EllipsisTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivText$Ellipsis;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class EllipsisTemplate implements JSONSerializable, JsonTemplate<DivText.Ellipsis> {

        /* renamed from: e */
        @NotNull
        public static final Companion f40328e = new Companion(null);

        /* renamed from: f */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f40329f = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivTextTemplate$EllipsisTemplate$Companion$ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion = DivAction.f34546g;
                Function2<ParsingEnvironment, JSONObject, DivAction> function2 = DivAction.f34550k;
                DivTextTemplate.EllipsisTemplate.Companion companion2 = DivTextTemplate.EllipsisTemplate.f40328e;
                return JsonParser.m17333y(jSONObject2, str2, function2, C3058m0.f41731x, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };

        /* renamed from: g */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, List<DivText.Image>> f40330g = new Function3<String, JSONObject, ParsingEnvironment, List<DivText.Image>>() { // from class: com.yandex.div2.DivTextTemplate$EllipsisTemplate$Companion$IMAGES_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivText.Image> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivText.Image.Companion companion = DivText.Image.f40006g;
                Function2<ParsingEnvironment, JSONObject, DivText.Image> function2 = DivText.Image.f40012m;
                DivTextTemplate.EllipsisTemplate.Companion companion2 = DivTextTemplate.EllipsisTemplate.f40328e;
                return JsonParser.m17333y(jSONObject2, str2, function2, C3058m0.f41733z, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };

        /* renamed from: h */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, List<DivText.Range>> f40331h = new Function3<String, JSONObject, ParsingEnvironment, List<DivText.Range>>() { // from class: com.yandex.div2.DivTextTemplate$EllipsisTemplate$Companion$RANGES_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivText.Range> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivText.Range.Companion companion = DivText.Range.f40023o;
                Function2<ParsingEnvironment, JSONObject, DivText.Range> function2 = DivText.Range.f40022B;
                DivTextTemplate.EllipsisTemplate.Companion companion2 = DivTextTemplate.EllipsisTemplate.f40328e;
                return JsonParser.m17333y(jSONObject2, str2, function2, C3058m0.f41705B, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };

        /* renamed from: i */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<String>> f40332i = new Function3<String, JSONObject, ParsingEnvironment, Expression<String>>() { // from class: com.yandex.div2.DivTextTemplate$EllipsisTemplate$Companion$TEXT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<String> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTextTemplate.EllipsisTemplate.Companion companion = DivTextTemplate.EllipsisTemplate.f40328e;
                return JsonParser.m17314f(jSONObject2, str2, C3056l0.f41677y, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33850c);
            }
        };

        /* renamed from: j */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, EllipsisTemplate> f40333j = new Function2<ParsingEnvironment, JSONObject, EllipsisTemplate>() { // from class: com.yandex.div2.DivTextTemplate$EllipsisTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivTextTemplate.EllipsisTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivTextTemplate.EllipsisTemplate(env, null, false, it, 6);
            }
        };

        /* renamed from: a */
        @JvmField
        @NotNull
        public final Field<List<DivActionTemplate>> f40334a;

        /* renamed from: b */
        @JvmField
        @NotNull
        public final Field<List<ImageTemplate>> f40335b;

        /* renamed from: c */
        @JvmField
        @NotNull
        public final Field<List<RangeTemplate>> f40336c;

        /* renamed from: d */
        @JvmField
        @NotNull
        public final Field<Expression<String>> f40337d;

        /* compiled from: DivTextTemplate.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, m31884d2 = {"Lcom/yandex/div2/DivTextTemplate$EllipsisTemplate$Companion;", "", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivActionTemplate;", "ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAction;", "ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivTextTemplate$ImageTemplate;", "IMAGES_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivText$Image;", "IMAGES_VALIDATOR", "Lcom/yandex/div2/DivTextTemplate$RangeTemplate;", "RANGES_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivText$Range;", "RANGES_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "TEXT_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "TEXT_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        public EllipsisTemplate(ParsingEnvironment parsingEnvironment, EllipsisTemplate ellipsisTemplate, boolean z, JSONObject jSONObject, int i2) {
            z = (i2 & 4) != 0 ? false : z;
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            DivActionTemplate.Companion companion = DivActionTemplate.f34572i;
            this.f40334a = JsonTemplateParser.m17360u(jSONObject, "actions", z, null, DivActionTemplate.f34586w, C3058m0.f41732y, f34328a, parsingEnvironment);
            ImageTemplate.Companion companion2 = ImageTemplate.f40343g;
            this.f40335b = JsonTemplateParser.m17360u(jSONObject, "images", z, null, ImageTemplate.f40356t, C3058m0.f41704A, f34328a, parsingEnvironment);
            RangeTemplate.Companion companion3 = RangeTemplate.f40395p;
            this.f40336c = JsonTemplateParser.m17360u(jSONObject, "ranges", z, null, RangeTemplate.f40394X, C3058m0.f41706C, f34328a, parsingEnvironment);
            this.f40337d = JsonTemplateParser.m17346g(jSONObject, "text", z, null, C3056l0.f41676x, f34328a, parsingEnvironment, TypeHelpersKt.f33850c);
        }

        @Override // com.yandex.div.json.JsonTemplate
        /* renamed from: a */
        public DivText.Ellipsis mo17514a(ParsingEnvironment env, JSONObject data) {
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(data, "data");
            return new DivText.Ellipsis(FieldKt.m17382h(this.f40334a, env, "actions", data, C3058m0.f41731x, f40329f), FieldKt.m17382h(this.f40335b, env, "images", data, C3058m0.f41733z, f40330g), FieldKt.m17382h(this.f40336c, env, "ranges", data, C3058m0.f41705B, f40331h), (Expression) FieldKt.m17376b(this.f40337d, env, "text", data, f40332i));
        }
    }

    /* compiled from: DivTextTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivTextTemplate$ImageTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivText$Image;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class ImageTemplate implements JSONSerializable, JsonTemplate<DivText.Image> {

        /* renamed from: g */
        @NotNull
        public static final Companion f40343g = new Companion(null);

        /* renamed from: h */
        @NotNull
        public static final DivFixedSize f40344h;

        /* renamed from: i */
        @NotNull
        public static final Expression<DivBlendMode> f40345i;

        /* renamed from: j */
        @NotNull
        public static final DivFixedSize f40346j;

        /* renamed from: k */
        @NotNull
        public static final TypeHelper<DivBlendMode> f40347k;

        /* renamed from: l */
        @NotNull
        public static final ValueValidator<Long> f40348l;

        /* renamed from: m */
        @NotNull
        public static final ValueValidator<Long> f40349m;

        /* renamed from: n */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, DivFixedSize> f40350n;

        /* renamed from: o */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f40351o;

        /* renamed from: p */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>> f40352p;

        /* renamed from: q */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivBlendMode>> f40353q;

        /* renamed from: r */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Uri>> f40354r;

        /* renamed from: s */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, DivFixedSize> f40355s;

        /* renamed from: t */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, ImageTemplate> f40356t;

        /* renamed from: a */
        @JvmField
        @NotNull
        public final Field<DivFixedSizeTemplate> f40357a;

        /* renamed from: b */
        @JvmField
        @NotNull
        public final Field<Expression<Long>> f40358b;

        /* renamed from: c */
        @JvmField
        @NotNull
        public final Field<Expression<Integer>> f40359c;

        /* renamed from: d */
        @JvmField
        @NotNull
        public final Field<Expression<DivBlendMode>> f40360d;

        /* renamed from: e */
        @JvmField
        @NotNull
        public final Field<Expression<Uri>> f40361e;

        /* renamed from: f */
        @JvmField
        @NotNull
        public final Field<DivFixedSizeTemplate> f40362f;

        /* compiled from: DivTextTemplate.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004¨\u0006\u0012"}, m31884d2 = {"Lcom/yandex/div2/DivTextTemplate$ImageTemplate$Companion;", "", "Lcom/yandex/div2/DivFixedSize;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivFixedSize;", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "START_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "START_VALIDATOR", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div2/DivBlendMode;", "TINT_MODE_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_TINT_MODE", "Lcom/yandex/div/internal/parser/TypeHelper;", "WIDTH_DEFAULT_VALUE", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        static {
            Expression.Companion companion = Expression.f34334a;
            f40344h = new DivFixedSize(null, companion.m17539a(20L), 1);
            f40345i = companion.m17539a(DivBlendMode.SOURCE_IN);
            f40346j = new DivFixedSize(null, companion.m17539a(20L), 1);
            int i2 = TypeHelper.f33843a;
            f40347k = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(DivBlendMode.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTextTemplate$ImageTemplate$Companion$TYPE_HELPER_TINT_MODE$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivBlendMode);
                }
            });
            f40348l = C3056l0.f41678z;
            f40349m = C3056l0.f41651A;
            f40350n = new Function3<String, JSONObject, ParsingEnvironment, DivFixedSize>() { // from class: com.yandex.div2.DivTextTemplate$ImageTemplate$Companion$HEIGHT_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public DivFixedSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    DivFixedSize.Companion companion2 = DivFixedSize.f35789c;
                    DivFixedSize divFixedSize = (DivFixedSize) JsonParser.m17322n(jSONObject2, str2, DivFixedSize.f35793g, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                    return divFixedSize == null ? DivTextTemplate.ImageTemplate.f40344h : divFixedSize;
                }
            };
            f40351o = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivTextTemplate$ImageTemplate$Companion$START_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    return JsonParser.m17316h(jSONObject2, str2, ParsingConvertersKt.f33831e, DivTextTemplate.ImageTemplate.f40349m, parsingEnvironment2.getF34328a(), TypeHelpersKt.f33849b);
                }
            };
            f40352p = new Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>>() { // from class: com.yandex.div2.DivTextTemplate$ImageTemplate$Companion$TINT_COLOR_READER$1
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
            f40353q = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivBlendMode>>() { // from class: com.yandex.div2.DivTextTemplate$ImageTemplate$Companion$TINT_MODE_READER$1
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
                    Expression<DivBlendMode> expression = DivTextTemplate.ImageTemplate.f40345i;
                    Expression<DivBlendMode> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivTextTemplate.ImageTemplate.f40347k);
                    return m17330v == null ? expression : m17330v;
                }
            };
            f40354r = new Function3<String, JSONObject, ParsingEnvironment, Expression<Uri>>() { // from class: com.yandex.div2.DivTextTemplate$ImageTemplate$Companion$URL_READER$1
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
            f40355s = new Function3<String, JSONObject, ParsingEnvironment, DivFixedSize>() { // from class: com.yandex.div2.DivTextTemplate$ImageTemplate$Companion$WIDTH_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public DivFixedSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    DivFixedSize.Companion companion2 = DivFixedSize.f35789c;
                    DivFixedSize divFixedSize = (DivFixedSize) JsonParser.m17322n(jSONObject2, str2, DivFixedSize.f35793g, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                    return divFixedSize == null ? DivTextTemplate.ImageTemplate.f40346j : divFixedSize;
                }
            };
            f40356t = new Function2<ParsingEnvironment, JSONObject, ImageTemplate>() { // from class: com.yandex.div2.DivTextTemplate$ImageTemplate$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                public DivTextTemplate.ImageTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    ParsingEnvironment env = parsingEnvironment;
                    JSONObject it = jSONObject;
                    Intrinsics.m32179h(env, "env");
                    Intrinsics.m32179h(it, "it");
                    return new DivTextTemplate.ImageTemplate(env, null, false, it, 6);
                }
            };
        }

        public ImageTemplate(ParsingEnvironment parsingEnvironment, ImageTemplate imageTemplate, boolean z, JSONObject jSONObject, int i2) {
            z = (i2 & 4) != 0 ? false : z;
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            DivFixedSizeTemplate.Companion companion = DivFixedSizeTemplate.f35798c;
            Function2<ParsingEnvironment, JSONObject, DivFixedSizeTemplate> function2 = DivFixedSizeTemplate.f35805j;
            this.f40357a = JsonTemplateParser.m17354o(jSONObject, "height", z, null, function2, f34328a, parsingEnvironment);
            this.f40358b = JsonTemplateParser.m17348i(jSONObject, "start", z, null, ParsingConvertersKt.f33831e, f40348l, f34328a, parsingEnvironment, TypeHelpersKt.f33849b);
            this.f40359c = JsonTemplateParser.m17358s(jSONObject, "tint_color", z, null, ParsingConvertersKt.f33827a, f34328a, parsingEnvironment, TypeHelpersKt.f33853f);
            DivBlendMode.Converter converter = DivBlendMode.f34766c;
            this.f40360d = JsonTemplateParser.m17358s(jSONObject, "tint_mode", z, null, DivBlendMode.f34767d, f34328a, parsingEnvironment, f40347k);
            this.f40361e = JsonTemplateParser.m17349j(jSONObject, "url", z, null, ParsingConvertersKt.f33828b, f34328a, parsingEnvironment, TypeHelpersKt.f33852e);
            this.f40362f = JsonTemplateParser.m17354o(jSONObject, "width", z, null, function2, f34328a, parsingEnvironment);
        }

        @Override // com.yandex.div.json.JsonTemplate
        /* renamed from: a */
        public DivText.Image mo17514a(ParsingEnvironment env, JSONObject data) {
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(data, "data");
            DivFixedSize divFixedSize = (DivFixedSize) FieldKt.m17381g(this.f40357a, env, "height", data, f40350n);
            if (divFixedSize == null) {
                divFixedSize = f40344h;
            }
            DivFixedSize divFixedSize2 = divFixedSize;
            Expression expression = (Expression) FieldKt.m17376b(this.f40358b, env, "start", data, f40351o);
            Expression expression2 = (Expression) FieldKt.m17378d(this.f40359c, env, "tint_color", data, f40352p);
            Expression<DivBlendMode> expression3 = (Expression) FieldKt.m17378d(this.f40360d, env, "tint_mode", data, f40353q);
            if (expression3 == null) {
                expression3 = f40345i;
            }
            Expression<DivBlendMode> expression4 = expression3;
            Expression expression5 = (Expression) FieldKt.m17376b(this.f40361e, env, "url", data, f40354r);
            DivFixedSize divFixedSize3 = (DivFixedSize) FieldKt.m17381g(this.f40362f, env, "width", data, f40355s);
            if (divFixedSize3 == null) {
                divFixedSize3 = f40346j;
            }
            return new DivText.Image(divFixedSize2, expression, expression2, expression4, expression5, divFixedSize3);
        }
    }

    /* compiled from: DivTextTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivTextTemplate$RangeTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivText$Range;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class RangeTemplate implements JSONSerializable, JsonTemplate<DivText.Range> {

        /* renamed from: A */
        @NotNull
        public static final ValueValidator<Long> f40371A;

        /* renamed from: B */
        @NotNull
        public static final ValueValidator<Long> f40372B;

        /* renamed from: C */
        @NotNull
        public static final ValueValidator<Long> f40373C;

        /* renamed from: D */
        @NotNull
        public static final ValueValidator<Long> f40374D;

        /* renamed from: E */
        @NotNull
        public static final ValueValidator<Long> f40375E;

        /* renamed from: F */
        @NotNull
        public static final ValueValidator<Long> f40376F;

        /* renamed from: G */
        @NotNull
        public static final ValueValidator<Long> f40377G;

        /* renamed from: H */
        @NotNull
        public static final ValueValidator<Long> f40378H;

        /* renamed from: I */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f40379I;

        /* renamed from: J */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, DivTextRangeBackground> f40380J;

        /* renamed from: K */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, DivTextRangeBorder> f40381K;

        /* renamed from: L */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f40382L;

        /* renamed from: M */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivFontFamily>> f40383M;

        /* renamed from: N */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f40384N;

        /* renamed from: O */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivSizeUnit>> f40385O;

        /* renamed from: P */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivFontWeight>> f40386P;

        /* renamed from: Q */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f40387Q;

        /* renamed from: R */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f40388R;

        /* renamed from: S */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f40389S;

        /* renamed from: T */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivLineStyle>> f40390T;

        /* renamed from: U */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>> f40391U;

        /* renamed from: V */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f40392V;

        /* renamed from: W */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivLineStyle>> f40393W;

        /* renamed from: X */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, RangeTemplate> f40394X;

        /* renamed from: p */
        @NotNull
        public static final Companion f40395p = new Companion(null);

        /* renamed from: q */
        @NotNull
        public static final Expression<DivSizeUnit> f40396q = Expression.f34334a.m17539a(DivSizeUnit.SP);

        /* renamed from: r */
        @NotNull
        public static final TypeHelper<DivFontFamily> f40397r;

        /* renamed from: s */
        @NotNull
        public static final TypeHelper<DivSizeUnit> f40398s;

        /* renamed from: t */
        @NotNull
        public static final TypeHelper<DivFontWeight> f40399t;

        /* renamed from: u */
        @NotNull
        public static final TypeHelper<DivLineStyle> f40400u;

        /* renamed from: v */
        @NotNull
        public static final TypeHelper<DivLineStyle> f40401v;

        /* renamed from: w */
        @NotNull
        public static final ListValidator<DivAction> f40402w;

        /* renamed from: x */
        @NotNull
        public static final ListValidator<DivActionTemplate> f40403x;

        /* renamed from: y */
        @NotNull
        public static final ValueValidator<Long> f40404y;

        /* renamed from: z */
        @NotNull
        public static final ValueValidator<Long> f40405z;

        /* renamed from: a */
        @JvmField
        @NotNull
        public final Field<List<DivActionTemplate>> f40406a;

        /* renamed from: b */
        @JvmField
        @NotNull
        public final Field<DivTextRangeBackgroundTemplate> f40407b;

        /* renamed from: c */
        @JvmField
        @NotNull
        public final Field<DivTextRangeBorderTemplate> f40408c;

        /* renamed from: d */
        @JvmField
        @NotNull
        public final Field<Expression<Long>> f40409d;

        /* renamed from: e */
        @JvmField
        @NotNull
        public final Field<Expression<DivFontFamily>> f40410e;

        /* renamed from: f */
        @JvmField
        @NotNull
        public final Field<Expression<Long>> f40411f;

        /* renamed from: g */
        @JvmField
        @NotNull
        public final Field<Expression<DivSizeUnit>> f40412g;

        /* renamed from: h */
        @JvmField
        @NotNull
        public final Field<Expression<DivFontWeight>> f40413h;

        /* renamed from: i */
        @JvmField
        @NotNull
        public final Field<Expression<Double>> f40414i;

        /* renamed from: j */
        @JvmField
        @NotNull
        public final Field<Expression<Long>> f40415j;

        /* renamed from: k */
        @JvmField
        @NotNull
        public final Field<Expression<Long>> f40416k;

        /* renamed from: l */
        @JvmField
        @NotNull
        public final Field<Expression<DivLineStyle>> f40417l;

        /* renamed from: m */
        @JvmField
        @NotNull
        public final Field<Expression<Integer>> f40418m;

        /* renamed from: n */
        @JvmField
        @NotNull
        public final Field<Expression<Long>> f40419n;

        /* renamed from: o */
        @JvmField
        @NotNull
        public final Field<Expression<DivLineStyle>> f40420o;

        /* compiled from: DivTextTemplate.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000bR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001cR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001c¨\u0006#"}, m31884d2 = {"Lcom/yandex/div2/DivTextTemplate$RangeTemplate$Companion;", "", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivActionTemplate;", "ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAction;", "ACTIONS_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "END_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "END_VALIDATOR", "FONT_SIZE_TEMPLATE_VALIDATOR", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div2/DivSizeUnit;", "FONT_SIZE_UNIT_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "FONT_SIZE_VALIDATOR", "LINE_HEIGHT_TEMPLATE_VALIDATOR", "LINE_HEIGHT_VALIDATOR", "START_TEMPLATE_VALIDATOR", "START_VALIDATOR", "TOP_OFFSET_TEMPLATE_VALIDATOR", "TOP_OFFSET_VALIDATOR", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivFontFamily;", "TYPE_HELPER_FONT_FAMILY", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_FONT_SIZE_UNIT", "Lcom/yandex/div2/DivFontWeight;", "TYPE_HELPER_FONT_WEIGHT", "Lcom/yandex/div2/DivLineStyle;", "TYPE_HELPER_STRIKE", "TYPE_HELPER_UNDERLINE", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        static {
            int i2 = TypeHelper.f33843a;
            TypeHelper.Companion companion = TypeHelper.Companion.f33844a;
            f40397r = companion.m17372a(ArraysKt.m31926B(DivFontFamily.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTextTemplate$RangeTemplate$Companion$TYPE_HELPER_FONT_FAMILY$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivFontFamily);
                }
            });
            f40398s = companion.m17372a(ArraysKt.m31926B(DivSizeUnit.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTextTemplate$RangeTemplate$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivSizeUnit);
                }
            });
            f40399t = companion.m17372a(ArraysKt.m31926B(DivFontWeight.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTextTemplate$RangeTemplate$Companion$TYPE_HELPER_FONT_WEIGHT$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivFontWeight);
                }
            });
            f40400u = companion.m17372a(ArraysKt.m31926B(DivLineStyle.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTextTemplate$RangeTemplate$Companion$TYPE_HELPER_STRIKE$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivLineStyle);
                }
            });
            f40401v = companion.m17372a(ArraysKt.m31926B(DivLineStyle.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTextTemplate$RangeTemplate$Companion$TYPE_HELPER_UNDERLINE$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivLineStyle);
                }
            });
            f40402w = C3058m0.f41707D;
            f40403x = C3058m0.f41708E;
            f40404y = C3056l0.f41654D;
            f40405z = C3060n0.f41766c;
            f40371A = C3060n0.f41767d;
            f40372B = C3060n0.f41768e;
            f40373C = C3060n0.f41769f;
            f40374D = C3060n0.f41770g;
            f40375E = C3060n0.f41771h;
            f40376F = C3060n0.f41772i;
            f40377G = C3056l0.f41652B;
            f40378H = C3056l0.f41653C;
            f40379I = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivTextTemplate$RangeTemplate$Companion$ACTIONS_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    DivAction.Companion companion2 = DivAction.f34546g;
                    return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivTextTemplate.RangeTemplate.f40402w, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                }
            };
            f40380J = new Function3<String, JSONObject, ParsingEnvironment, DivTextRangeBackground>() { // from class: com.yandex.div2.DivTextTemplate$RangeTemplate$Companion$BACKGROUND_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public DivTextRangeBackground mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    DivTextRangeBackground.Companion companion2 = DivTextRangeBackground.f40065a;
                    return (DivTextRangeBackground) JsonParser.m17322n(jSONObject2, str2, DivTextRangeBackground.f40066b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                }
            };
            f40381K = new Function3<String, JSONObject, ParsingEnvironment, DivTextRangeBorder>() { // from class: com.yandex.div2.DivTextTemplate$RangeTemplate$Companion$BORDER_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public DivTextRangeBorder mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    DivTextRangeBorder.Companion companion2 = DivTextRangeBorder.f40073c;
                    return (DivTextRangeBorder) JsonParser.m17322n(jSONObject2, str2, DivTextRangeBorder.f40074d, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                }
            };
            f40382L = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivTextTemplate$RangeTemplate$Companion$END_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    return JsonParser.m17316h(jSONObject2, str2, ParsingConvertersKt.f33831e, DivTextTemplate.RangeTemplate.f40405z, parsingEnvironment2.getF34328a(), TypeHelpersKt.f33849b);
                }
            };
            f40383M = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivFontFamily>>() { // from class: com.yandex.div2.DivTextTemplate$RangeTemplate$Companion$FONT_FAMILY_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<DivFontFamily> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    DivFontFamily.Converter converter = DivFontFamily.f35876c;
                    return JsonParser.m17329u(jSONObject2, str2, DivFontFamily.f35877d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivTextTemplate.RangeTemplate.f40397r);
                }
            };
            f40384N = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivTextTemplate$RangeTemplate$Companion$FONT_SIZE_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivTextTemplate.RangeTemplate.f40372B, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
                }
            };
            f40385O = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivSizeUnit>>() { // from class: com.yandex.div2.DivTextTemplate$RangeTemplate$Companion$FONT_SIZE_UNIT_READER$1
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
                    Expression<DivSizeUnit> expression = DivTextTemplate.RangeTemplate.f40396q;
                    Expression<DivSizeUnit> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivTextTemplate.RangeTemplate.f40398s);
                    return m17330v == null ? expression : m17330v;
                }
            };
            f40386P = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivFontWeight>>() { // from class: com.yandex.div2.DivTextTemplate$RangeTemplate$Companion$FONT_WEIGHT_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<DivFontWeight> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    DivFontWeight.Converter converter = DivFontWeight.f35883c;
                    return JsonParser.m17329u(jSONObject2, str2, DivFontWeight.f35884d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivTextTemplate.RangeTemplate.f40399t);
                }
            };
            f40387Q = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivTextTemplate$RangeTemplate$Companion$LETTER_SPACING_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    return JsonParser.m17329u(jSONObject2, str2, ParsingConvertersKt.f33830d, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33851d);
                }
            };
            f40388R = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivTextTemplate$RangeTemplate$Companion$LINE_HEIGHT_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivTextTemplate.RangeTemplate.f40374D, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
                }
            };
            f40389S = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivTextTemplate$RangeTemplate$Companion$START_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    return JsonParser.m17316h(jSONObject2, str2, ParsingConvertersKt.f33831e, DivTextTemplate.RangeTemplate.f40376F, parsingEnvironment2.getF34328a(), TypeHelpersKt.f33849b);
                }
            };
            f40390T = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivLineStyle>>() { // from class: com.yandex.div2.DivTextTemplate$RangeTemplate$Companion$STRIKE_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<DivLineStyle> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    DivLineStyle.Converter converter = DivLineStyle.f37683c;
                    return JsonParser.m17329u(jSONObject2, str2, DivLineStyle.f37684d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivTextTemplate.RangeTemplate.f40400u);
                }
            };
            f40391U = new Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>>() { // from class: com.yandex.div2.DivTextTemplate$RangeTemplate$Companion$TEXT_COLOR_READER$1
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
            f40392V = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivTextTemplate$RangeTemplate$Companion$TOP_OFFSET_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivTextTemplate.RangeTemplate.f40378H, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
                }
            };
            f40393W = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivLineStyle>>() { // from class: com.yandex.div2.DivTextTemplate$RangeTemplate$Companion$UNDERLINE_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<DivLineStyle> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    DivLineStyle.Converter converter = DivLineStyle.f37683c;
                    return JsonParser.m17329u(jSONObject2, str2, DivLineStyle.f37684d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivTextTemplate.RangeTemplate.f40401v);
                }
            };
            f40394X = new Function2<ParsingEnvironment, JSONObject, RangeTemplate>() { // from class: com.yandex.div2.DivTextTemplate$RangeTemplate$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                public DivTextTemplate.RangeTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    ParsingEnvironment env = parsingEnvironment;
                    JSONObject it = jSONObject;
                    Intrinsics.m32179h(env, "env");
                    Intrinsics.m32179h(it, "it");
                    return new DivTextTemplate.RangeTemplate(env, null, false, it, 6);
                }
            };
        }

        public RangeTemplate(ParsingEnvironment parsingEnvironment, RangeTemplate rangeTemplate, boolean z, JSONObject jSONObject, int i2) {
            boolean z2 = (i2 & 4) != 0 ? false : z;
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            DivActionTemplate.Companion companion = DivActionTemplate.f34572i;
            this.f40406a = JsonTemplateParser.m17360u(jSONObject, "actions", z2, null, DivActionTemplate.f34586w, f40403x, f34328a, parsingEnvironment);
            DivTextRangeBackgroundTemplate.Companion companion2 = DivTextRangeBackgroundTemplate.f40069a;
            this.f40407b = JsonTemplateParser.m17354o(jSONObject, "background", z2, null, DivTextRangeBackgroundTemplate.f40070b, f34328a, parsingEnvironment);
            DivTextRangeBorderTemplate.Companion companion3 = DivTextRangeBorderTemplate.f40078c;
            this.f40408c = JsonTemplateParser.m17354o(jSONObject, "border", z2, null, DivTextRangeBorderTemplate.f40081f, f34328a, parsingEnvironment);
            Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
            ValueValidator<Long> valueValidator = f40404y;
            TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
            this.f40409d = JsonTemplateParser.m17348i(jSONObject, "end", z2, null, function1, valueValidator, f34328a, parsingEnvironment, typeHelper);
            DivFontFamily.Converter converter = DivFontFamily.f35876c;
            this.f40410e = JsonTemplateParser.m17358s(jSONObject, "font_family", z2, null, DivFontFamily.f35877d, f34328a, parsingEnvironment, f40397r);
            this.f40411f = JsonTemplateParser.m17357r(jSONObject, "font_size", z2, null, function1, f40371A, f34328a, parsingEnvironment, typeHelper);
            DivSizeUnit.Converter converter2 = DivSizeUnit.f38845c;
            this.f40412g = JsonTemplateParser.m17358s(jSONObject, "font_size_unit", z2, null, DivSizeUnit.f38846d, f34328a, parsingEnvironment, f40398s);
            DivFontWeight.Converter converter3 = DivFontWeight.f35883c;
            this.f40413h = JsonTemplateParser.m17358s(jSONObject, "font_weight", z2, null, DivFontWeight.f35884d, f34328a, parsingEnvironment, f40399t);
            this.f40414i = JsonTemplateParser.m17358s(jSONObject, "letter_spacing", z2, null, ParsingConvertersKt.f33830d, f34328a, parsingEnvironment, TypeHelpersKt.f33851d);
            this.f40415j = JsonTemplateParser.m17357r(jSONObject, "line_height", z2, null, function1, f40373C, f34328a, parsingEnvironment, typeHelper);
            this.f40416k = JsonTemplateParser.m17348i(jSONObject, "start", z2, null, function1, f40375E, f34328a, parsingEnvironment, typeHelper);
            DivLineStyle.Converter converter4 = DivLineStyle.f37683c;
            Function1<String, DivLineStyle> function12 = DivLineStyle.f37684d;
            this.f40417l = JsonTemplateParser.m17358s(jSONObject, "strike", z2, null, function12, f34328a, parsingEnvironment, f40400u);
            this.f40418m = JsonTemplateParser.m17358s(jSONObject, "text_color", z2, null, ParsingConvertersKt.f33827a, f34328a, parsingEnvironment, TypeHelpersKt.f33853f);
            this.f40419n = JsonTemplateParser.m17357r(jSONObject, "top_offset", z2, null, function1, f40377G, f34328a, parsingEnvironment, typeHelper);
            this.f40420o = JsonTemplateParser.m17358s(jSONObject, "underline", z2, null, function12, f34328a, parsingEnvironment, f40401v);
        }

        @Override // com.yandex.div.json.JsonTemplate
        /* renamed from: a */
        public DivText.Range mo17514a(ParsingEnvironment env, JSONObject data) {
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(data, "data");
            List m17382h = FieldKt.m17382h(this.f40406a, env, "actions", data, f40402w, f40379I);
            DivTextRangeBackground divTextRangeBackground = (DivTextRangeBackground) FieldKt.m17381g(this.f40407b, env, "background", data, f40380J);
            DivTextRangeBorder divTextRangeBorder = (DivTextRangeBorder) FieldKt.m17381g(this.f40408c, env, "border", data, f40381K);
            Expression expression = (Expression) FieldKt.m17376b(this.f40409d, env, "end", data, f40382L);
            Expression expression2 = (Expression) FieldKt.m17378d(this.f40410e, env, "font_family", data, f40383M);
            Expression expression3 = (Expression) FieldKt.m17378d(this.f40411f, env, "font_size", data, f40384N);
            Expression<DivSizeUnit> expression4 = (Expression) FieldKt.m17378d(this.f40412g, env, "font_size_unit", data, f40385O);
            if (expression4 == null) {
                expression4 = f40396q;
            }
            return new DivText.Range(m17382h, divTextRangeBackground, divTextRangeBorder, expression, expression2, expression3, expression4, (Expression) FieldKt.m17378d(this.f40413h, env, "font_weight", data, f40386P), (Expression) FieldKt.m17378d(this.f40414i, env, "letter_spacing", data, f40387Q), (Expression) FieldKt.m17378d(this.f40415j, env, "line_height", data, f40388R), (Expression) FieldKt.m17376b(this.f40416k, env, "start", data, f40389S), (Expression) FieldKt.m17378d(this.f40417l, env, "strike", data, f40390T), (Expression) FieldKt.m17378d(this.f40418m, env, "text_color", data, f40391U), (Expression) FieldKt.m17378d(this.f40419n, env, "top_offset", data, f40392V), (Expression) FieldKt.m17378d(this.f40420o, env, "underline", data, f40393W));
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        Expression m17539a = companion.m17539a(100L);
        Expression m17539a2 = companion.m17539a(Double.valueOf(0.6d));
        Expression m17539a3 = companion.m17539a(DivAnimation.Name.FADE);
        Double valueOf = Double.valueOf(1.0d);
        f40142b0 = new DivAnimation(m17539a, m17539a2, null, null, m17539a3, null, null, companion.m17539a(valueOf), C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
        f40145c0 = companion.m17539a(valueOf);
        f40148d0 = new DivBorder(null, null, null, null, null, 31);
        f40151e0 = companion.m17539a(DivFontFamily.TEXT);
        f40154f0 = companion.m17539a(12L);
        f40157g0 = companion.m17539a(DivSizeUnit.SP);
        f40160h0 = companion.m17539a(DivFontWeight.REGULAR);
        f40163i0 = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7));
        f40166j0 = companion.m17539a(Double.valueOf(0.0d));
        f40169k0 = new DivEdgeInsets(null, null, null, null, null, 31);
        f40172l0 = new DivEdgeInsets(null, null, null, null, null, 31);
        f40175m0 = companion.m17539a(Boolean.FALSE);
        DivLineStyle divLineStyle = DivLineStyle.NONE;
        f40178n0 = companion.m17539a(divLineStyle);
        f40181o0 = companion.m17539a(DivAlignmentHorizontal.LEFT);
        f40184p0 = companion.m17539a(DivAlignmentVertical.TOP);
        f40187q0 = companion.m17539a(-16777216);
        f40190r0 = new DivTransform(null, null, null, 7);
        f40193s0 = companion.m17539a(divLineStyle);
        f40196t0 = companion.m17539a(DivVisibility.VISIBLE);
        f40199u0 = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i2 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f40202v0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTextTemplate$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f40204w0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTextTemplate$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f40206x0 = companion2.m17372a(ArraysKt.m31926B(DivFontFamily.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTextTemplate$Companion$TYPE_HELPER_FONT_FAMILY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivFontFamily);
            }
        });
        f40208y0 = companion2.m17372a(ArraysKt.m31926B(DivSizeUnit.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTextTemplate$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivSizeUnit);
            }
        });
        f40210z0 = companion2.m17372a(ArraysKt.m31926B(DivFontWeight.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTextTemplate$Companion$TYPE_HELPER_FONT_WEIGHT$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivFontWeight);
            }
        });
        f40087A0 = companion2.m17372a(ArraysKt.m31926B(DivLineStyle.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTextTemplate$Companion$TYPE_HELPER_STRIKE$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivLineStyle);
            }
        });
        f40089B0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTextTemplate$Companion$TYPE_HELPER_TEXT_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f40091C0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTextTemplate$Companion$TYPE_HELPER_TEXT_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f40093D0 = companion2.m17372a(ArraysKt.m31926B(DivLineStyle.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTextTemplate$Companion$TYPE_HELPER_UNDERLINE$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivLineStyle);
            }
        });
        f40095E0 = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTextTemplate$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f40097F0 = C3052j0.f41554D;
        f40099G0 = C3058m0.f41714g;
        f40101H0 = C3056l0.f41668p;
        f40103I0 = C3056l0.f41673u;
        f40105J0 = C3058m0.f41727t;
        f40107K0 = C3058m0.f41728u;
        f40109L0 = C3056l0.f41674v;
        f40111M0 = C3056l0.f41675w;
        f40113N0 = C3058m0.f41729v;
        f40115O0 = C3058m0.f41730w;
        f40117P0 = C3052j0.f41555E;
        f40119Q0 = C3058m0.f41709b;
        f40121R0 = C3058m0.f41710c;
        f40123S0 = C3058m0.f41711d;
        f40125T0 = C3056l0.f41658f;
        f40127U0 = C3056l0.f41659g;
        f40129V0 = C3056l0.f41660h;
        f40131W0 = C3056l0.f41661i;
        f40133X0 = C3058m0.f41712e;
        f40135Y0 = C3058m0.f41713f;
        f40137Z0 = C3056l0.f41662j;
        f40140a1 = C3056l0.f41663k;
        f40143b1 = C3058m0.f41715h;
        f40146c1 = C3058m0.f41716i;
        f40149d1 = C3056l0.f41664l;
        f40152e1 = C3056l0.f41665m;
        f40155f1 = C3056l0.f41666n;
        f40158g1 = C3056l0.f41667o;
        f40161h1 = C3058m0.f41717j;
        f40164i1 = C3058m0.f41718k;
        f40167j1 = C3056l0.f41669q;
        f40170k1 = C3056l0.f41670r;
        f40173l1 = C3058m0.f41719l;
        f40176m1 = C3058m0.f41720m;
        f40179n1 = C3056l0.f41671s;
        f40182o1 = C3056l0.f41672t;
        f40185p1 = C3058m0.f41721n;
        f40188q1 = C3058m0.f41722o;
        f40191r1 = C3058m0.f41723p;
        f40194s1 = C3058m0.f41724q;
        f40197t1 = C3058m0.f41725r;
        f40200u1 = C3058m0.f41726s;
        f40203v1 = new Function3<String, JSONObject, ParsingEnvironment, DivAccessibility>() { // from class: com.yandex.div2.DivTextTemplate$Companion$ACCESSIBILITY_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAccessibility mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAccessibility.Companion companion3 = DivAccessibility.f34479f;
                DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject2, str2, DivAccessibility.f34486m, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divAccessibility == null ? DivTextTemplate.f40139a0 : divAccessibility;
            }
        };
        f40205w1 = new Function3<String, JSONObject, ParsingEnvironment, DivAction>() { // from class: com.yandex.div2.DivTextTemplate$Companion$ACTION_READER$1
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
        f40207x1 = new Function3<String, JSONObject, ParsingEnvironment, DivAnimation>() { // from class: com.yandex.div2.DivTextTemplate$Companion$ACTION_ANIMATION_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAnimation mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAnimation.Companion companion3 = DivAnimation.f34634h;
                DivAnimation divAnimation = (DivAnimation) JsonParser.m17322n(jSONObject2, str2, DivAnimation.f34644r, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divAnimation == null ? DivTextTemplate.f40142b0 : divAnimation;
            }
        };
        f40209y1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivTextTemplate.f40097F0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40211z1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$ALIGNMENT_HORIZONTAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentHorizontal> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentHorizontal.f34618d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivTextTemplate.f40202v0);
            }
        };
        f40088A1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$ALIGNMENT_VERTICAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentVertical> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentVertical.Converter converter = DivAlignmentVertical.f34625c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentVertical.f34626d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivTextTemplate.f40204w0);
            }
        };
        f40090B1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$ALPHA_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
                ValueValidator<Double> valueValidator = DivTextTemplate.f40103I0;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Double> expression = DivTextTemplate.f40145c0;
                Expression<Double> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
                return m17328t == null ? expression : m17328t;
            }
        };
        f40092C1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$AUTO_ELLIPSIZE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Boolean> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17329u(jSONObject2, str2, ParsingConvertersKt.f33829c, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33848a);
            }
        };
        f40094D1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$BACKGROUND_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivBackground> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBackground.Companion companion3 = DivBackground.f34750a;
                return JsonParser.m17333y(jSONObject2, str2, DivBackground.f34751b, DivTextTemplate.f40105J0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40096E1 = new Function3<String, JSONObject, ParsingEnvironment, DivBorder>() { // from class: com.yandex.div2.DivTextTemplate$Companion$BORDER_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivBorder mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBorder.Companion companion3 = DivBorder.f34785f;
                DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject2, str2, DivBorder.f34788i, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divBorder == null ? DivTextTemplate.f40148d0 : divBorder;
            }
        };
        f40098F1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$COLUMN_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivTextTemplate.f40111M0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f40100G1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$DISAPPEAR_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivDisappearAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivDisappearAction.Companion companion3 = DivDisappearAction.f35537a;
                return JsonParser.m17333y(jSONObject2, str2, DivDisappearAction.f35545i, DivTextTemplate.f40113N0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40102H1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$DOUBLETAP_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivTextTemplate.f40117P0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40104I1 = new Function3<String, JSONObject, ParsingEnvironment, DivText.Ellipsis>() { // from class: com.yandex.div2.DivTextTemplate$Companion$ELLIPSIS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivText.Ellipsis mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivText.Ellipsis.Companion companion3 = DivText.Ellipsis.f39999e;
                return (DivText.Ellipsis) JsonParser.m17322n(jSONObject2, str2, DivText.Ellipsis.f40000f, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40106J1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$EXTENSIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivExtension> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivExtension.Companion companion3 = DivExtension.f35659c;
                return JsonParser.m17333y(jSONObject2, str2, DivExtension.f35660d, DivTextTemplate.f40121R0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40108K1 = new Function3<String, JSONObject, ParsingEnvironment, DivFocus>() { // from class: com.yandex.div2.DivTextTemplate$Companion$FOCUS_READER$1
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
        f40110L1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$FOCUSED_TEXT_COLOR_READER$1
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
        f40112M1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivFontFamily>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$FONT_FAMILY_READER$1
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
                Expression<DivFontFamily> expression = DivTextTemplate.f40151e0;
                Expression<DivFontFamily> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivTextTemplate.f40206x0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f40114N1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$FONT_SIZE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivTextTemplate.f40127U0;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivTextTemplate.f40154f0;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        f40116O1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivSizeUnit>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$FONT_SIZE_UNIT_READER$1
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
                Expression<DivSizeUnit> expression = DivTextTemplate.f40157g0;
                Expression<DivSizeUnit> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivTextTemplate.f40208y0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f40118P1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivFontWeight>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$FONT_WEIGHT_READER$1
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
                Expression<DivFontWeight> expression = DivTextTemplate.f40160h0;
                Expression<DivFontWeight> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivTextTemplate.f40210z0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f40120Q1 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivTextTemplate$Companion$HEIGHT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivTextTemplate.f40163i0 : divSize;
            }
        };
        f40122R1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivTextTemplate$Companion$ID_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return (String) JsonParser.m17323o(jSONObject2, str2, DivTextTemplate.f40131W0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40124S1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivText.Image>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$IMAGES_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivText.Image> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivText.Image.Companion companion3 = DivText.Image.f40006g;
                return JsonParser.m17333y(jSONObject2, str2, DivText.Image.f40012m, DivTextTemplate.f40133X0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40126T1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$LETTER_SPACING_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Double> expression = DivTextTemplate.f40166j0;
                Expression<Double> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33851d);
                return m17330v == null ? expression : m17330v;
            }
        };
        f40128U1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$LINE_HEIGHT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivTextTemplate.f40140a1, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f40130V1 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$LONGTAP_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivTextTemplate.f40143b1, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40132W1 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivTextTemplate$Companion$MARGINS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivTextTemplate.f40169k0 : divEdgeInsets;
            }
        };
        f40134X1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$MAX_LINES_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivTextTemplate.f40152e1, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f40136Y1 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$MIN_HIDDEN_LINES_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivTextTemplate.f40158g1, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f40138Z1 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivTextTemplate$Companion$PADDINGS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivTextTemplate.f40172l0 : divEdgeInsets;
            }
        };
        f40141a2 = new Function3<String, JSONObject, ParsingEnvironment, List<DivText.Range>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$RANGES_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivText.Range> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivText.Range.Companion companion3 = DivText.Range.f40023o;
                return JsonParser.m17333y(jSONObject2, str2, DivText.Range.f40022B, DivTextTemplate.f40161h1, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40144b2 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$ROW_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivTextTemplate.f40170k1, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f40147c2 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$SELECTABLE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Boolean> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Object, Boolean> function1 = ParsingConvertersKt.f33829c;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Boolean> expression = DivTextTemplate.f40175m0;
                Expression<Boolean> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33848a);
                return m17330v == null ? expression : m17330v;
            }
        };
        f40150d2 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$SELECTED_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivTextTemplate.f40173l1, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40153e2 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivLineStyle>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$STRIKE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivLineStyle> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivLineStyle.Converter converter = DivLineStyle.f37683c;
                Function1<String, DivLineStyle> function1 = DivLineStyle.f37684d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivLineStyle> expression = DivTextTemplate.f40178n0;
                Expression<DivLineStyle> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivTextTemplate.f40087A0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f40156f2 = new Function3<String, JSONObject, ParsingEnvironment, Expression<String>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$TEXT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<String> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17314f(jSONObject2, str2, DivTextTemplate.f40182o1, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33850c);
            }
        };
        f40159g2 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$TEXT_ALIGNMENT_HORIZONTAL_READER$1
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
                Expression<DivAlignmentHorizontal> expression = DivTextTemplate.f40181o0;
                Expression<DivAlignmentHorizontal> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivTextTemplate.f40089B0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f40162h2 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$TEXT_ALIGNMENT_VERTICAL_READER$1
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
                Expression<DivAlignmentVertical> expression = DivTextTemplate.f40184p0;
                Expression<DivAlignmentVertical> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivTextTemplate.f40091C0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f40165i2 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$TEXT_COLOR_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Integer> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Object, Integer> function1 = ParsingConvertersKt.f33827a;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Integer> expression = DivTextTemplate.f40187q0;
                Expression<Integer> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33853f);
                return m17330v == null ? expression : m17330v;
            }
        };
        f40168j2 = new Function3<String, JSONObject, ParsingEnvironment, DivTextGradient>() { // from class: com.yandex.div2.DivTextTemplate$Companion$TEXT_GRADIENT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivTextGradient mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTextGradient.Companion companion3 = DivTextGradient.f40055a;
                return (DivTextGradient) JsonParser.m17322n(jSONObject2, str2, DivTextGradient.f40056b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40171k2 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$TOOLTIPS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTooltip> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTooltip.Companion companion3 = DivTooltip.f40492h;
                return JsonParser.m17333y(jSONObject2, str2, DivTooltip.f40497m, DivTextTemplate.f40185p1, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40174l2 = new Function3<String, JSONObject, ParsingEnvironment, DivTransform>() { // from class: com.yandex.div2.DivTextTemplate$Companion$TRANSFORM_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivTransform mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransform.Companion companion3 = DivTransform.f40551d;
                DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject2, str2, DivTransform.f40554g, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divTransform == null ? DivTextTemplate.f40190r0 : divTransform;
            }
        };
        f40177m2 = new Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition>() { // from class: com.yandex.div2.DivTextTemplate$Companion$TRANSITION_CHANGE_READER$1
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
        f40180n2 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivTextTemplate$Companion$TRANSITION_IN_READER$1
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
        f40183o2 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivTextTemplate$Companion$TRANSITION_OUT_READER$1
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
        f40186p2 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$TRANSITION_TRIGGERS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTransitionTrigger> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransitionTrigger.Converter converter = DivTransitionTrigger.f40582c;
                return JsonParser.m17332x(jSONObject2, str2, DivTransitionTrigger.f40583d, DivTextTemplate.f40191r1, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        DivTextTemplate$Companion$TYPE_READER$1 divTextTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivTextTemplate$Companion$TYPE_READER$1
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
        f40189q2 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivLineStyle>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$UNDERLINE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivLineStyle> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivLineStyle.Converter converter = DivLineStyle.f37683c;
                Function1<String, DivLineStyle> function1 = DivLineStyle.f37684d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivLineStyle> expression = DivTextTemplate.f40193s0;
                Expression<DivLineStyle> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivTextTemplate.f40093D0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f40192r2 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$VISIBILITY_READER$1
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
                Expression<DivVisibility> expression = DivTextTemplate.f40196t0;
                Expression<DivVisibility> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivTextTemplate.f40095E0);
                return m17330v == null ? expression : m17330v;
            }
        };
        f40195s2 = new Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction>() { // from class: com.yandex.div2.DivTextTemplate$Companion$VISIBILITY_ACTION_READER$1
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
        f40198t2 = new Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>>() { // from class: com.yandex.div2.DivTextTemplate$Companion$VISIBILITY_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivVisibilityAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivVisibilityAction.Companion companion3 = DivVisibilityAction.f40938i;
                return JsonParser.m17333y(jSONObject2, str2, DivVisibilityAction.f40946q, DivTextTemplate.f40197t1, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40201u2 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivTextTemplate$Companion$WIDTH_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivTextTemplate.f40199u0 : divSize;
            }
        };
        DivTextTemplate$Companion$CREATOR$1 divTextTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivTextTemplate>() { // from class: com.yandex.div2.DivTextTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivTextTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivTextTemplate(env, null, false, it);
            }
        };
    }

    public DivTextTemplate(@NotNull ParsingEnvironment env, @Nullable DivTextTemplate divTextTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        Field<DivAccessibilityTemplate> field = divTextTemplate == null ? null : divTextTemplate.f40238a;
        DivAccessibilityTemplate.Companion companion = DivAccessibilityTemplate.f34515g;
        this.f40238a = JsonTemplateParser.m17354o(json, "accessibility", z, field, DivAccessibilityTemplate.f34531w, f34328a, env);
        Field<DivActionTemplate> field2 = divTextTemplate == null ? null : divTextTemplate.f40239b;
        DivActionTemplate.Companion companion2 = DivActionTemplate.f34572i;
        Function2<ParsingEnvironment, JSONObject, DivActionTemplate> function2 = DivActionTemplate.f34586w;
        this.f40239b = JsonTemplateParser.m17354o(json, "action", z, field2, function2, f34328a, env);
        Field<DivAnimationTemplate> field3 = divTextTemplate == null ? null : divTextTemplate.f40240c;
        DivAnimationTemplate.Companion companion3 = DivAnimationTemplate.f34681i;
        this.f40240c = JsonTemplateParser.m17354o(json, "action_animation", z, field3, DivAnimationTemplate.f34680D, f34328a, env);
        this.f40241d = JsonTemplateParser.m17360u(json, "actions", z, divTextTemplate == null ? null : divTextTemplate.f40241d, function2, f40099G0, f34328a, env);
        Field<Expression<DivAlignmentHorizontal>> field4 = divTextTemplate == null ? null : divTextTemplate.f40242e;
        DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
        this.f40242e = JsonTemplateParser.m17358s(json, "alignment_horizontal", z, field4, DivAlignmentHorizontal.f34618d, f34328a, env, f40202v0);
        Field<Expression<DivAlignmentVertical>> field5 = divTextTemplate == null ? null : divTextTemplate.f40243f;
        DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
        this.f40243f = JsonTemplateParser.m17358s(json, "alignment_vertical", z, field5, DivAlignmentVertical.f34626d, f34328a, env, f40204w0);
        Field<Expression<Double>> field6 = divTextTemplate == null ? null : divTextTemplate.f40244g;
        Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
        ValueValidator<Double> valueValidator = f40101H0;
        TypeHelper<Double> typeHelper = TypeHelpersKt.f33851d;
        this.f40244g = JsonTemplateParser.m17357r(json, "alpha", z, field6, function1, valueValidator, f34328a, env, typeHelper);
        Field<Expression<Boolean>> field7 = divTextTemplate == null ? null : divTextTemplate.f40245h;
        Function1<Object, Boolean> function12 = ParsingConvertersKt.f33829c;
        TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.f33848a;
        this.f40245h = JsonTemplateParser.m17358s(json, "auto_ellipsize", z, field7, function12, f34328a, env, typeHelper2);
        Field<List<DivBackgroundTemplate>> field8 = divTextTemplate == null ? null : divTextTemplate.f40246i;
        DivBackgroundTemplate.Companion companion4 = DivBackgroundTemplate.f34758a;
        this.f40246i = JsonTemplateParser.m17360u(json, "background", z, field8, DivBackgroundTemplate.f34759b, f40107K0, f34328a, env);
        Field<DivBorderTemplate> field9 = divTextTemplate == null ? null : divTextTemplate.f40247j;
        DivBorderTemplate.Companion companion5 = DivBorderTemplate.f34795f;
        this.f40247j = JsonTemplateParser.m17354o(json, "border", z, field9, DivBorderTemplate.f34804o, f34328a, env);
        Field<Expression<Long>> field10 = divTextTemplate == null ? null : divTextTemplate.f40248k;
        Function1<Number, Long> function13 = ParsingConvertersKt.f33831e;
        ValueValidator<Long> valueValidator2 = f40109L0;
        TypeHelper<Long> typeHelper3 = TypeHelpersKt.f33849b;
        this.f40248k = JsonTemplateParser.m17357r(json, "column_span", z, field10, function13, valueValidator2, f34328a, env, typeHelper3);
        Field<List<DivDisappearActionTemplate>> field11 = divTextTemplate == null ? null : divTextTemplate.f40249l;
        DivDisappearActionTemplate.Companion companion6 = DivDisappearActionTemplate.f35550i;
        this.f40249l = JsonTemplateParser.m17360u(json, "disappear_actions", z, field11, DivDisappearActionTemplate.f35549C, f40115O0, f34328a, env);
        this.f40250m = JsonTemplateParser.m17360u(json, "doubletap_actions", z, divTextTemplate == null ? null : divTextTemplate.f40250m, function2, f40119Q0, f34328a, env);
        Field<EllipsisTemplate> field12 = divTextTemplate == null ? null : divTextTemplate.f40251n;
        EllipsisTemplate.Companion companion7 = EllipsisTemplate.f40328e;
        this.f40251n = JsonTemplateParser.m17354o(json, "ellipsis", z, field12, EllipsisTemplate.f40333j, f34328a, env);
        Field<List<DivExtensionTemplate>> field13 = divTextTemplate == null ? null : divTextTemplate.f40252o;
        DivExtensionTemplate.Companion companion8 = DivExtensionTemplate.f35664c;
        this.f40252o = JsonTemplateParser.m17360u(json, "extensions", z, field13, DivExtensionTemplate.f35667f, f40123S0, f34328a, env);
        Field<DivFocusTemplate> field14 = divTextTemplate == null ? null : divTextTemplate.f40253p;
        DivFocusTemplate.Companion companion9 = DivFocusTemplate.f35833f;
        this.f40253p = JsonTemplateParser.m17354o(json, "focus", z, field14, DivFocusTemplate.f35846s, f34328a, env);
        Field<Expression<Integer>> field15 = divTextTemplate == null ? null : divTextTemplate.f40254q;
        Function1<Object, Integer> function14 = ParsingConvertersKt.f33827a;
        TypeHelper<Integer> typeHelper4 = TypeHelpersKt.f33853f;
        this.f40254q = JsonTemplateParser.m17358s(json, "focused_text_color", z, field15, function14, f34328a, env, typeHelper4);
        Field<Expression<DivFontFamily>> field16 = divTextTemplate == null ? null : divTextTemplate.f40255r;
        DivFontFamily.Converter converter3 = DivFontFamily.f35876c;
        this.f40255r = JsonTemplateParser.m17358s(json, "font_family", z, field16, DivFontFamily.f35877d, f34328a, env, f40206x0);
        this.f40256s = JsonTemplateParser.m17357r(json, "font_size", z, divTextTemplate == null ? null : divTextTemplate.f40256s, function13, f40125T0, f34328a, env, typeHelper3);
        Field<Expression<DivSizeUnit>> field17 = divTextTemplate == null ? null : divTextTemplate.f40257t;
        DivSizeUnit.Converter converter4 = DivSizeUnit.f38845c;
        this.f40257t = JsonTemplateParser.m17358s(json, "font_size_unit", z, field17, DivSizeUnit.f38846d, f34328a, env, f40208y0);
        Field<Expression<DivFontWeight>> field18 = divTextTemplate == null ? null : divTextTemplate.f40258u;
        DivFontWeight.Converter converter5 = DivFontWeight.f35883c;
        this.f40258u = JsonTemplateParser.m17358s(json, "font_weight", z, field18, DivFontWeight.f35884d, f34328a, env, f40210z0);
        Field<DivSizeTemplate> field19 = divTextTemplate == null ? null : divTextTemplate.f40259v;
        DivSizeTemplate.Companion companion10 = DivSizeTemplate.f38839a;
        Function2<ParsingEnvironment, JSONObject, DivSizeTemplate> function22 = DivSizeTemplate.f38840b;
        this.f40259v = JsonTemplateParser.m17354o(json, "height", z, field19, function22, f34328a, env);
        this.f40260w = JsonTemplateParser.m17351l(json, "id", z, divTextTemplate == null ? null : divTextTemplate.f40260w, f40129V0, f34328a, env);
        Field<List<ImageTemplate>> field20 = divTextTemplate == null ? null : divTextTemplate.f40261x;
        ImageTemplate.Companion companion11 = ImageTemplate.f40343g;
        this.f40261x = JsonTemplateParser.m17360u(json, "images", z, field20, ImageTemplate.f40356t, f40135Y0, f34328a, env);
        this.f40262y = JsonTemplateParser.m17358s(json, "letter_spacing", z, divTextTemplate == null ? null : divTextTemplate.f40262y, function1, f34328a, env, typeHelper);
        this.f40263z = JsonTemplateParser.m17357r(json, "line_height", z, divTextTemplate == null ? null : divTextTemplate.f40263z, function13, f40137Z0, f34328a, env, typeHelper3);
        this.f40212A = JsonTemplateParser.m17360u(json, "longtap_actions", z, divTextTemplate == null ? null : divTextTemplate.f40212A, function2, f40146c1, f34328a, env);
        Field<DivEdgeInsetsTemplate> field21 = divTextTemplate == null ? null : divTextTemplate.f40213B;
        DivEdgeInsetsTemplate.Companion companion12 = DivEdgeInsetsTemplate.f35626f;
        Function2<ParsingEnvironment, JSONObject, DivEdgeInsetsTemplate> function23 = DivEdgeInsetsTemplate.f35646z;
        this.f40213B = JsonTemplateParser.m17354o(json, "margins", z, field21, function23, f34328a, env);
        this.f40214C = JsonTemplateParser.m17357r(json, "max_lines", z, divTextTemplate == null ? null : divTextTemplate.f40214C, function13, f40149d1, f34328a, env, typeHelper3);
        this.f40215D = JsonTemplateParser.m17357r(json, "min_hidden_lines", z, divTextTemplate == null ? null : divTextTemplate.f40215D, function13, f40155f1, f34328a, env, typeHelper3);
        this.f40216E = JsonTemplateParser.m17354o(json, "paddings", z, divTextTemplate == null ? null : divTextTemplate.f40216E, function23, f34328a, env);
        Field<List<RangeTemplate>> field22 = divTextTemplate == null ? null : divTextTemplate.f40217F;
        RangeTemplate.Companion companion13 = RangeTemplate.f40395p;
        this.f40217F = JsonTemplateParser.m17360u(json, "ranges", z, field22, RangeTemplate.f40394X, f40164i1, f34328a, env);
        this.f40218G = JsonTemplateParser.m17357r(json, "row_span", z, divTextTemplate == null ? null : divTextTemplate.f40218G, function13, f40167j1, f34328a, env, typeHelper3);
        this.f40219H = JsonTemplateParser.m17358s(json, "selectable", z, divTextTemplate == null ? null : divTextTemplate.f40219H, function12, f34328a, env, typeHelper2);
        this.f40220I = JsonTemplateParser.m17360u(json, "selected_actions", z, divTextTemplate == null ? null : divTextTemplate.f40220I, function2, f40176m1, f34328a, env);
        Field<Expression<DivLineStyle>> field23 = divTextTemplate == null ? null : divTextTemplate.f40221J;
        DivLineStyle.Converter converter6 = DivLineStyle.f37683c;
        Function1<String, DivLineStyle> function15 = DivLineStyle.f37684d;
        this.f40221J = JsonTemplateParser.m17358s(json, "strike", z, field23, function15, f34328a, env, f40087A0);
        this.f40222K = JsonTemplateParser.m17346g(json, "text", z, divTextTemplate == null ? null : divTextTemplate.f40222K, f40179n1, f34328a, env, TypeHelpersKt.f33850c);
        Field<Expression<DivAlignmentHorizontal>> field24 = divTextTemplate == null ? null : divTextTemplate.f40223L;
        DivAlignmentHorizontal.Converter converter7 = DivAlignmentHorizontal.f34617c;
        this.f40223L = JsonTemplateParser.m17358s(json, "text_alignment_horizontal", z, field24, DivAlignmentHorizontal.f34618d, f34328a, env, f40089B0);
        Field<Expression<DivAlignmentVertical>> field25 = divTextTemplate == null ? null : divTextTemplate.f40224M;
        DivAlignmentVertical.Converter converter8 = DivAlignmentVertical.f34625c;
        this.f40224M = JsonTemplateParser.m17358s(json, "text_alignment_vertical", z, field25, DivAlignmentVertical.f34626d, f34328a, env, f40091C0);
        this.f40225N = JsonTemplateParser.m17358s(json, "text_color", z, divTextTemplate == null ? null : divTextTemplate.f40225N, function14, f34328a, env, typeHelper4);
        Field<DivTextGradientTemplate> field26 = divTextTemplate == null ? null : divTextTemplate.f40226O;
        DivTextGradientTemplate.Companion companion14 = DivTextGradientTemplate.f40060a;
        this.f40226O = JsonTemplateParser.m17354o(json, "text_gradient", z, field26, DivTextGradientTemplate.f40061b, f34328a, env);
        Field<List<DivTooltipTemplate>> field27 = divTextTemplate == null ? null : divTextTemplate.f40227P;
        DivTooltipTemplate.Companion companion15 = DivTooltipTemplate.f40520h;
        this.f40227P = JsonTemplateParser.m17360u(json, "tooltips", z, field27, DivTooltipTemplate.f40534v, f40188q1, f34328a, env);
        Field<DivTransformTemplate> field28 = divTextTemplate == null ? null : divTextTemplate.f40228Q;
        DivTransformTemplate.Companion companion16 = DivTransformTemplate.f40559d;
        this.f40228Q = JsonTemplateParser.m17354o(json, "transform", z, field28, DivTransformTemplate.f40565j, f34328a, env);
        Field<DivChangeTransitionTemplate> field29 = divTextTemplate == null ? null : divTextTemplate.f40229R;
        DivChangeTransitionTemplate.Companion companion17 = DivChangeTransitionTemplate.f34861a;
        this.f40229R = JsonTemplateParser.m17354o(json, "transition_change", z, field29, DivChangeTransitionTemplate.f34862b, f34328a, env);
        Field<DivAppearanceTransitionTemplate> field30 = divTextTemplate == null ? null : divTextTemplate.f40230S;
        DivAppearanceTransitionTemplate.Companion companion18 = DivAppearanceTransitionTemplate.f34733a;
        Function2<ParsingEnvironment, JSONObject, DivAppearanceTransitionTemplate> function24 = DivAppearanceTransitionTemplate.f34734b;
        this.f40230S = JsonTemplateParser.m17354o(json, "transition_in", z, field30, function24, f34328a, env);
        this.f40231T = JsonTemplateParser.m17354o(json, "transition_out", z, divTextTemplate == null ? null : divTextTemplate.f40231T, function24, f34328a, env);
        Field<List<DivTransitionTrigger>> field31 = divTextTemplate == null ? null : divTextTemplate.f40232U;
        DivTransitionTrigger.Converter converter9 = DivTransitionTrigger.f40582c;
        this.f40232U = JsonTemplateParser.m17359t(json, "transition_triggers", z, field31, DivTransitionTrigger.f40583d, f40194s1, f34328a, env);
        this.f40233V = JsonTemplateParser.m17358s(json, "underline", z, divTextTemplate == null ? null : divTextTemplate.f40233V, function15, f34328a, env, f40093D0);
        Field<Expression<DivVisibility>> field32 = divTextTemplate == null ? null : divTextTemplate.f40234W;
        DivVisibility.Converter converter10 = DivVisibility.f40930c;
        this.f40234W = JsonTemplateParser.m17358s(json, "visibility", z, field32, DivVisibility.f40931d, f34328a, env, f40095E0);
        Field<DivVisibilityActionTemplate> field33 = divTextTemplate == null ? null : divTextTemplate.f40235X;
        DivVisibilityActionTemplate.Companion companion19 = DivVisibilityActionTemplate.f40959i;
        Function2<ParsingEnvironment, JSONObject, DivVisibilityActionTemplate> function25 = DivVisibilityActionTemplate.f40958C;
        this.f40235X = JsonTemplateParser.m17354o(json, "visibility_action", z, field33, function25, f34328a, env);
        this.f40236Y = JsonTemplateParser.m17360u(json, "visibility_actions", z, divTextTemplate == null ? null : divTextTemplate.f40236Y, function25, f40200u1, f34328a, env);
        this.f40237Z = JsonTemplateParser.m17354o(json, "width", z, divTextTemplate == null ? null : divTextTemplate.f40237Z, function22, f34328a, env);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivText mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        DivAccessibility divAccessibility = (DivAccessibility) FieldKt.m17381g(this.f40238a, env, "accessibility", data, f40203v1);
        if (divAccessibility == null) {
            divAccessibility = f40139a0;
        }
        DivAccessibility divAccessibility2 = divAccessibility;
        DivAction divAction = (DivAction) FieldKt.m17381g(this.f40239b, env, "action", data, f40205w1);
        DivAnimation divAnimation = (DivAnimation) FieldKt.m17381g(this.f40240c, env, "action_animation", data, f40207x1);
        if (divAnimation == null) {
            divAnimation = f40142b0;
        }
        DivAnimation divAnimation2 = divAnimation;
        List m17382h = FieldKt.m17382h(this.f40241d, env, "actions", data, f40097F0, f40209y1);
        Expression expression = (Expression) FieldKt.m17378d(this.f40242e, env, "alignment_horizontal", data, f40211z1);
        Expression expression2 = (Expression) FieldKt.m17378d(this.f40243f, env, "alignment_vertical", data, f40088A1);
        Expression<Double> expression3 = (Expression) FieldKt.m17378d(this.f40244g, env, "alpha", data, f40090B1);
        if (expression3 == null) {
            expression3 = f40145c0;
        }
        Expression<Double> expression4 = expression3;
        Expression expression5 = (Expression) FieldKt.m17378d(this.f40245h, env, "auto_ellipsize", data, f40092C1);
        List m17382h2 = FieldKt.m17382h(this.f40246i, env, "background", data, f40105J0, f40094D1);
        DivBorder divBorder = (DivBorder) FieldKt.m17381g(this.f40247j, env, "border", data, f40096E1);
        if (divBorder == null) {
            divBorder = f40148d0;
        }
        DivBorder divBorder2 = divBorder;
        Expression expression6 = (Expression) FieldKt.m17378d(this.f40248k, env, "column_span", data, f40098F1);
        List m17382h3 = FieldKt.m17382h(this.f40249l, env, "disappear_actions", data, f40113N0, f40100G1);
        List m17382h4 = FieldKt.m17382h(this.f40250m, env, "doubletap_actions", data, f40117P0, f40102H1);
        DivText.Ellipsis ellipsis = (DivText.Ellipsis) FieldKt.m17381g(this.f40251n, env, "ellipsis", data, f40104I1);
        List m17382h5 = FieldKt.m17382h(this.f40252o, env, "extensions", data, f40121R0, f40106J1);
        DivFocus divFocus = (DivFocus) FieldKt.m17381g(this.f40253p, env, "focus", data, f40108K1);
        Expression expression7 = (Expression) FieldKt.m17378d(this.f40254q, env, "focused_text_color", data, f40110L1);
        Expression<DivFontFamily> expression8 = (Expression) FieldKt.m17378d(this.f40255r, env, "font_family", data, f40112M1);
        if (expression8 == null) {
            expression8 = f40151e0;
        }
        Expression<DivFontFamily> expression9 = expression8;
        Expression<Long> expression10 = (Expression) FieldKt.m17378d(this.f40256s, env, "font_size", data, f40114N1);
        if (expression10 == null) {
            expression10 = f40154f0;
        }
        Expression<Long> expression11 = expression10;
        Expression<DivSizeUnit> expression12 = (Expression) FieldKt.m17378d(this.f40257t, env, "font_size_unit", data, f40116O1);
        if (expression12 == null) {
            expression12 = f40157g0;
        }
        Expression<DivSizeUnit> expression13 = expression12;
        Expression<DivFontWeight> expression14 = (Expression) FieldKt.m17378d(this.f40258u, env, "font_weight", data, f40118P1);
        if (expression14 == null) {
            expression14 = f40160h0;
        }
        Expression<DivFontWeight> expression15 = expression14;
        DivSize divSize = (DivSize) FieldKt.m17381g(this.f40259v, env, "height", data, f40120Q1);
        if (divSize == null) {
            divSize = f40163i0;
        }
        DivSize divSize2 = divSize;
        String str = (String) FieldKt.m17378d(this.f40260w, env, "id", data, f40122R1);
        List m17382h6 = FieldKt.m17382h(this.f40261x, env, "images", data, f40133X0, f40124S1);
        Expression<Double> expression16 = (Expression) FieldKt.m17378d(this.f40262y, env, "letter_spacing", data, f40126T1);
        if (expression16 == null) {
            expression16 = f40166j0;
        }
        Expression<Double> expression17 = expression16;
        Expression expression18 = (Expression) FieldKt.m17378d(this.f40263z, env, "line_height", data, f40128U1);
        List m17382h7 = FieldKt.m17382h(this.f40212A, env, "longtap_actions", data, f40143b1, f40130V1);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) FieldKt.m17381g(this.f40213B, env, "margins", data, f40132W1);
        if (divEdgeInsets == null) {
            divEdgeInsets = f40169k0;
        }
        DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
        Expression expression19 = (Expression) FieldKt.m17378d(this.f40214C, env, "max_lines", data, f40134X1);
        Expression expression20 = (Expression) FieldKt.m17378d(this.f40215D, env, "min_hidden_lines", data, f40136Y1);
        DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) FieldKt.m17381g(this.f40216E, env, "paddings", data, f40138Z1);
        if (divEdgeInsets3 == null) {
            divEdgeInsets3 = f40172l0;
        }
        DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
        List m17382h8 = FieldKt.m17382h(this.f40217F, env, "ranges", data, f40161h1, f40141a2);
        Expression expression21 = (Expression) FieldKt.m17378d(this.f40218G, env, "row_span", data, f40144b2);
        Expression<Boolean> expression22 = (Expression) FieldKt.m17378d(this.f40219H, env, "selectable", data, f40147c2);
        if (expression22 == null) {
            expression22 = f40175m0;
        }
        Expression<Boolean> expression23 = expression22;
        List m17382h9 = FieldKt.m17382h(this.f40220I, env, "selected_actions", data, f40173l1, f40150d2);
        Expression<DivLineStyle> expression24 = (Expression) FieldKt.m17378d(this.f40221J, env, "strike", data, f40153e2);
        if (expression24 == null) {
            expression24 = f40178n0;
        }
        Expression<DivLineStyle> expression25 = expression24;
        Expression expression26 = (Expression) FieldKt.m17376b(this.f40222K, env, "text", data, f40156f2);
        Expression<DivAlignmentHorizontal> expression27 = (Expression) FieldKt.m17378d(this.f40223L, env, "text_alignment_horizontal", data, f40159g2);
        if (expression27 == null) {
            expression27 = f40181o0;
        }
        Expression<DivAlignmentHorizontal> expression28 = expression27;
        Expression<DivAlignmentVertical> expression29 = (Expression) FieldKt.m17378d(this.f40224M, env, "text_alignment_vertical", data, f40162h2);
        if (expression29 == null) {
            expression29 = f40184p0;
        }
        Expression<DivAlignmentVertical> expression30 = expression29;
        Expression<Integer> expression31 = (Expression) FieldKt.m17378d(this.f40225N, env, "text_color", data, f40165i2);
        if (expression31 == null) {
            expression31 = f40187q0;
        }
        Expression<Integer> expression32 = expression31;
        DivTextGradient divTextGradient = (DivTextGradient) FieldKt.m17381g(this.f40226O, env, "text_gradient", data, f40168j2);
        List m17382h10 = FieldKt.m17382h(this.f40227P, env, "tooltips", data, f40185p1, f40171k2);
        DivTransform divTransform = (DivTransform) FieldKt.m17381g(this.f40228Q, env, "transform", data, f40174l2);
        if (divTransform == null) {
            divTransform = f40190r0;
        }
        DivTransform divTransform2 = divTransform;
        DivChangeTransition divChangeTransition = (DivChangeTransition) FieldKt.m17381g(this.f40229R, env, "transition_change", data, f40177m2);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) FieldKt.m17381g(this.f40230S, env, "transition_in", data, f40180n2);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) FieldKt.m17381g(this.f40231T, env, "transition_out", data, f40183o2);
        List m17380f = FieldKt.m17380f(this.f40232U, env, "transition_triggers", data, f40191r1, f40186p2);
        Expression<DivLineStyle> expression33 = (Expression) FieldKt.m17378d(this.f40233V, env, "underline", data, f40189q2);
        if (expression33 == null) {
            expression33 = f40193s0;
        }
        Expression<DivLineStyle> expression34 = expression33;
        Expression<DivVisibility> expression35 = (Expression) FieldKt.m17378d(this.f40234W, env, "visibility", data, f40192r2);
        if (expression35 == null) {
            expression35 = f40196t0;
        }
        Expression<DivVisibility> expression36 = expression35;
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) FieldKt.m17381g(this.f40235X, env, "visibility_action", data, f40195s2);
        List m17382h11 = FieldKt.m17382h(this.f40236Y, env, "visibility_actions", data, f40197t1, f40198t2);
        DivSize divSize3 = (DivSize) FieldKt.m17381g(this.f40237Z, env, "width", data, f40201u2);
        if (divSize3 == null) {
            divSize3 = f40199u0;
        }
        return new DivText(divAccessibility2, divAction, divAnimation2, m17382h, expression, expression2, expression4, expression5, m17382h2, divBorder2, expression6, m17382h3, m17382h4, ellipsis, m17382h5, divFocus, expression7, expression9, expression11, expression13, expression15, divSize2, str, m17382h6, expression17, expression18, m17382h7, divEdgeInsets2, expression19, expression20, divEdgeInsets4, m17382h8, expression21, expression23, m17382h9, expression25, expression26, expression28, expression30, expression32, divTextGradient, m17382h10, divTransform2, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17380f, expression34, expression36, divVisibilityAction, m17382h11, divSize3);
    }
}
