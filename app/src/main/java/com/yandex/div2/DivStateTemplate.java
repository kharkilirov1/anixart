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
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeTemplate;
import com.yandex.div2.DivState;
import com.yandex.div2.DivStateTemplate;
import com.yandex.div2.DivTemplate;
import com.yandex.div2.DivTooltip;
import com.yandex.div2.DivTooltipTemplate;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivTransformTemplate;
import com.yandex.div2.DivTransitionSelector;
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

/* compiled from: DivStateTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div2/DivStateTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivState;", "Companion", "StateTemplate", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivStateTemplate implements JSONSerializable, JsonTemplate<DivState> {

    /* renamed from: A0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>> f39263A0;

    /* renamed from: B0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivFocus> f39264B0;

    /* renamed from: C0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f39265C0;

    /* renamed from: D0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f39266D0;

    /* renamed from: E */
    @NotNull
    public static final DivAccessibility f39267E = new DivAccessibility(null, null, null, null, null, null, 63);

    /* renamed from: E0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f39268E0;

    /* renamed from: F */
    @NotNull
    public static final Expression<Double> f39269F;

    /* renamed from: F0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f39270F0;

    /* renamed from: G */
    @NotNull
    public static final DivBorder f39271G;

    /* renamed from: G0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f39272G0;

    /* renamed from: H */
    @NotNull
    public static final DivSize.WrapContent f39273H;

    /* renamed from: H0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f39274H0;

    /* renamed from: I */
    @NotNull
    public static final DivEdgeInsets f39275I;

    /* renamed from: I0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivState.State>> f39276I0;

    /* renamed from: J */
    @NotNull
    public static final DivEdgeInsets f39277J;

    /* renamed from: J0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>> f39278J0;

    /* renamed from: K */
    @NotNull
    public static final DivTransform f39279K;

    /* renamed from: K0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivTransform> f39280K0;

    /* renamed from: L */
    @NotNull
    public static final Expression<DivTransitionSelector> f39281L;

    /* renamed from: L0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivTransitionSelector>> f39282L0;

    /* renamed from: M */
    @NotNull
    public static final Expression<DivVisibility> f39283M;

    /* renamed from: M0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition> f39284M0;

    /* renamed from: N */
    @NotNull
    public static final DivSize.MatchParent f39285N;

    /* renamed from: N0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f39286N0;

    /* renamed from: O */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f39287O;

    /* renamed from: O0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f39288O0;

    /* renamed from: P */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f39289P;

    /* renamed from: P0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>> f39290P0;

    /* renamed from: Q */
    @NotNull
    public static final TypeHelper<DivTransitionSelector> f39291Q;

    /* renamed from: Q0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>> f39292Q0;

    /* renamed from: R */
    @NotNull
    public static final TypeHelper<DivVisibility> f39293R;

    /* renamed from: R0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction> f39294R0;

    /* renamed from: S */
    @NotNull
    public static final ValueValidator<Double> f39295S;

    /* renamed from: S0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>> f39296S0;

    /* renamed from: T */
    @NotNull
    public static final ValueValidator<Double> f39297T;

    /* renamed from: T0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f39298T0;

    /* renamed from: U */
    @NotNull
    public static final ListValidator<DivBackground> f39299U;

    /* renamed from: V */
    @NotNull
    public static final ListValidator<DivBackgroundTemplate> f39300V;

    /* renamed from: W */
    @NotNull
    public static final ValueValidator<Long> f39301W;

    /* renamed from: X */
    @NotNull
    public static final ValueValidator<Long> f39302X;

    /* renamed from: Y */
    @NotNull
    public static final ListValidator<DivDisappearAction> f39303Y;

    /* renamed from: Z */
    @NotNull
    public static final ListValidator<DivDisappearActionTemplate> f39304Z;

    /* renamed from: a0 */
    @NotNull
    public static final ListValidator<DivExtension> f39305a0;

    /* renamed from: b0 */
    @NotNull
    public static final ListValidator<DivExtensionTemplate> f39306b0;

    /* renamed from: c0 */
    @NotNull
    public static final ValueValidator<String> f39307c0;

    /* renamed from: d0 */
    @NotNull
    public static final ValueValidator<String> f39308d0;

    /* renamed from: e0 */
    @NotNull
    public static final ValueValidator<Long> f39309e0;

    /* renamed from: f0 */
    @NotNull
    public static final ValueValidator<Long> f39310f0;

    /* renamed from: g0 */
    @NotNull
    public static final ListValidator<DivAction> f39311g0;

    /* renamed from: h0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f39312h0;

    /* renamed from: i0 */
    @NotNull
    public static final ListValidator<DivState.State> f39313i0;

    /* renamed from: j0 */
    @NotNull
    public static final ListValidator<StateTemplate> f39314j0;

    /* renamed from: k0 */
    @NotNull
    public static final ListValidator<DivTooltip> f39315k0;

    /* renamed from: l0 */
    @NotNull
    public static final ListValidator<DivTooltipTemplate> f39316l0;

    /* renamed from: m0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f39317m0;

    /* renamed from: n0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f39318n0;

    /* renamed from: o0 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f39319o0;

    /* renamed from: p0 */
    @NotNull
    public static final ListValidator<DivVisibilityActionTemplate> f39320p0;

    /* renamed from: q0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAccessibility> f39321q0;

    /* renamed from: r0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>> f39322r0;

    /* renamed from: s0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>> f39323s0;

    /* renamed from: t0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f39324t0;

    /* renamed from: u0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>> f39325u0;

    /* renamed from: v0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivBorder> f39326v0;

    /* renamed from: w0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f39327w0;

    /* renamed from: x0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<String>> f39328x0;

    /* renamed from: y0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>> f39329y0;

    /* renamed from: z0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f39330z0;

    /* renamed from: A */
    @JvmField
    @NotNull
    public final Field<Expression<DivVisibility>> f39331A;

    /* renamed from: B */
    @JvmField
    @NotNull
    public final Field<DivVisibilityActionTemplate> f39332B;

    /* renamed from: C */
    @JvmField
    @NotNull
    public final Field<List<DivVisibilityActionTemplate>> f39333C;

    /* renamed from: D */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f39334D;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<DivAccessibilityTemplate> f39335a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f39336b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f39337c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f39338d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f39339e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final Field<DivBorderTemplate> f39340f;

    /* renamed from: g */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f39341g;

    /* renamed from: h */
    @JvmField
    @NotNull
    public final Field<Expression<String>> f39342h;

    /* renamed from: i */
    @JvmField
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f39343i;

    /* renamed from: j */
    @JvmField
    @NotNull
    public final Field<String> f39344j;

    /* renamed from: k */
    @JvmField
    @NotNull
    public final Field<List<DivExtensionTemplate>> f39345k;

    /* renamed from: l */
    @JvmField
    @NotNull
    public final Field<DivFocusTemplate> f39346l;

    /* renamed from: m */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f39347m;

    /* renamed from: n */
    @JvmField
    @NotNull
    public final Field<String> f39348n;

    /* renamed from: o */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f39349o;

    /* renamed from: p */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f39350p;

    /* renamed from: q */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f39351q;

    /* renamed from: r */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f39352r;

    /* renamed from: s */
    @JvmField
    @NotNull
    public final Field<List<StateTemplate>> f39353s;

    /* renamed from: t */
    @JvmField
    @NotNull
    public final Field<List<DivTooltipTemplate>> f39354t;

    /* renamed from: u */
    @JvmField
    @NotNull
    public final Field<DivTransformTemplate> f39355u;

    /* renamed from: v */
    @JvmField
    @NotNull
    public final Field<Expression<DivTransitionSelector>> f39356v;

    /* renamed from: w */
    @JvmField
    @NotNull
    public final Field<DivChangeTransitionTemplate> f39357w;

    /* renamed from: x */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f39358x;

    /* renamed from: y */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f39359y;

    /* renamed from: z */
    @JvmField
    @NotNull
    public final Field<List<DivTransitionTrigger>> f39360z;

    /* compiled from: DivStateTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000bR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0010R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0010R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u000bR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020$0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u000bR\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u000bR\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u000bR\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0010R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020/0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0010R\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0010R\u001a\u00104\u001a\b\u0012\u0004\u0012\u0002030\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0010R\u001a\u00106\u001a\b\u0012\u0004\u0012\u0002050\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0010R\u001a\u00108\u001a\b\u0012\u0004\u0012\u0002070\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0010R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010\bR\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0010R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020>0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\u0010R\u0014\u0010A\u001a\u00020$8\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020D0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020G0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010FR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020<0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010FR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020J0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010FR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020L0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010\u0010R\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010\u0010R\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020J0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010\bR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006T"}, m31884d2 = {"Lcom/yandex/div2/DivStateTemplate$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackgroundTemplate;", "BACKGROUND_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivDisappearActionTemplate;", "DISAPPEAR_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivExtensionTemplate;", "EXTENSIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "PADDINGS_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "Lcom/yandex/div2/DivActionTemplate;", "SELECTED_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivAction;", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivStateTemplate$StateTemplate;", "STATES_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivState$State;", "STATES_VALIDATOR", "Lcom/yandex/div2/DivTooltipTemplate;", "TOOLTIPS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionSelector;", "TRANSITION_ANIMATION_SELECTOR_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_TEMPLATE_VALIDATOR", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "TYPE_HELPER_TRANSITION_ANIMATION_SELECTOR", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/DivVisibilityActionTemplate;", "VISIBILITY_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: DivStateTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivStateTemplate$StateTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivState$State;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class StateTemplate implements JSONSerializable, JsonTemplate<DivState.State> {

        /* renamed from: f */
        @NotNull
        public static final Companion f39397f = new Companion(null);

        /* renamed from: g */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, DivAnimation> f39398g = new Function3<String, JSONObject, ParsingEnvironment, DivAnimation>() { // from class: com.yandex.div2.DivStateTemplate$StateTemplate$Companion$ANIMATION_IN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAnimation mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAnimation.Companion companion = DivAnimation.f34634h;
                return (DivAnimation) JsonParser.m17322n(jSONObject2, str2, DivAnimation.f34644r, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };

        /* renamed from: h */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, DivAnimation> f39399h = new Function3<String, JSONObject, ParsingEnvironment, DivAnimation>() { // from class: com.yandex.div2.DivStateTemplate$StateTemplate$Companion$ANIMATION_OUT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAnimation mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAnimation.Companion companion = DivAnimation.f34634h;
                return (DivAnimation) JsonParser.m17322n(jSONObject2, str2, DivAnimation.f34644r, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };

        /* renamed from: i */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Div> f39400i = new Function3<String, JSONObject, ParsingEnvironment, Div>() { // from class: com.yandex.div2.DivStateTemplate$StateTemplate$Companion$DIV_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Div mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Div.Companion companion = Div.f34418a;
                return (Div) JsonParser.m17322n(jSONObject2, str2, Div.f34419b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };

        /* renamed from: j */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, String> f39401j = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivStateTemplate$StateTemplate$Companion$STATE_ID_READER$1
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

        /* renamed from: k */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f39402k = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivStateTemplate$StateTemplate$Companion$SWIPE_OUT_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion = DivAction.f34546g;
                Function2<ParsingEnvironment, JSONObject, DivAction> function2 = DivAction.f34550k;
                DivStateTemplate.StateTemplate.Companion companion2 = DivStateTemplate.StateTemplate.f39397f;
                return JsonParser.m17333y(jSONObject2, str2, function2, C3046g0.f41414r, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };

        /* renamed from: l */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, StateTemplate> f39403l = new Function2<ParsingEnvironment, JSONObject, StateTemplate>() { // from class: com.yandex.div2.DivStateTemplate$StateTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivStateTemplate.StateTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivStateTemplate.StateTemplate(env, null, false, it, 6);
            }
        };

        /* renamed from: a */
        @JvmField
        @NotNull
        public final Field<DivAnimationTemplate> f39404a;

        /* renamed from: b */
        @JvmField
        @NotNull
        public final Field<DivAnimationTemplate> f39405b;

        /* renamed from: c */
        @JvmField
        @NotNull
        public final Field<DivTemplate> f39406c;

        /* renamed from: d */
        @JvmField
        @NotNull
        public final Field<String> f39407d;

        /* renamed from: e */
        @JvmField
        @NotNull
        public final Field<List<DivActionTemplate>> f39408e;

        /* compiled from: DivStateTemplate.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005¨\u0006\b"}, m31884d2 = {"Lcom/yandex/div2/DivStateTemplate$StateTemplate$Companion;", "", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivActionTemplate;", "SWIPE_OUT_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAction;", "SWIPE_OUT_ACTIONS_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        public StateTemplate(ParsingEnvironment parsingEnvironment, StateTemplate stateTemplate, boolean z, JSONObject jSONObject, int i2) {
            z = (i2 & 4) != 0 ? false : z;
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            DivAnimationTemplate.Companion companion = DivAnimationTemplate.f34681i;
            Function2<ParsingEnvironment, JSONObject, DivAnimationTemplate> function2 = DivAnimationTemplate.f34680D;
            this.f39404a = JsonTemplateParser.m17354o(jSONObject, "animation_in", z, null, function2, f34328a, parsingEnvironment);
            this.f39405b = JsonTemplateParser.m17354o(jSONObject, "animation_out", z, null, function2, f34328a, parsingEnvironment);
            DivTemplate.Companion companion2 = DivTemplate.f39864a;
            this.f39406c = JsonTemplateParser.m17354o(jSONObject, "div", z, null, DivTemplate.f39865b, f34328a, parsingEnvironment);
            this.f39407d = JsonTemplateParser.m17342c(jSONObject, "state_id", z, null, f34328a, parsingEnvironment);
            DivActionTemplate.Companion companion3 = DivActionTemplate.f34572i;
            this.f39408e = JsonTemplateParser.m17360u(jSONObject, "swipe_out_actions", z, null, DivActionTemplate.f34586w, C3046g0.f41415s, f34328a, parsingEnvironment);
        }

        @Override // com.yandex.div.json.JsonTemplate
        /* renamed from: a */
        public DivState.State mo17514a(ParsingEnvironment env, JSONObject data) {
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(data, "data");
            return new DivState.State((DivAnimation) FieldKt.m17381g(this.f39404a, env, "animation_in", data, f39398g), (DivAnimation) FieldKt.m17381g(this.f39405b, env, "animation_out", data, f39399h), (Div) FieldKt.m17381g(this.f39406c, env, "div", data, f39400i), (String) FieldKt.m17376b(this.f39407d, env, "state_id", data, f39401j), FieldKt.m17382h(this.f39408e, env, "swipe_out_actions", data, C3046g0.f41414r, f39402k));
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f39269F = companion.m17539a(Double.valueOf(1.0d));
        f39271G = new DivBorder(null, null, null, null, null, 31);
        f39273H = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7));
        f39275I = new DivEdgeInsets(null, null, null, null, null, 31);
        f39277J = new DivEdgeInsets(null, null, null, null, null, 31);
        f39279K = new DivTransform(null, null, null, 7);
        f39281L = companion.m17539a(DivTransitionSelector.STATE_CHANGE);
        f39283M = companion.m17539a(DivVisibility.VISIBLE);
        f39285N = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i2 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f39287O = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivStateTemplate$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f39289P = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivStateTemplate$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f39291Q = companion2.m17372a(ArraysKt.m31926B(DivTransitionSelector.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivStateTemplate$Companion$TYPE_HELPER_TRANSITION_ANIMATION_SELECTOR$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivTransitionSelector);
            }
        });
        f39293R = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivStateTemplate$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f39295S = C3044f0.f41367x;
        f39297T = C3048h0.f41459g;
        f39299U = C3046g0.f41408l;
        f39300V = C3046g0.f41409m;
        f39301W = C3048h0.f41460h;
        f39302X = C3048h0.f41461i;
        f39303Y = C3046g0.f41410n;
        f39304Z = C3046g0.f41411o;
        f39305a0 = C3046g0.f41412p;
        f39306b0 = C3046g0.f41413q;
        f39307c0 = C3048h0.f41455c;
        f39308d0 = C3048h0.f41456d;
        f39309e0 = C3048h0.f41457e;
        f39310f0 = C3048h0.f41458f;
        f39311g0 = C3046g0.f41398b;
        f39312h0 = C3046g0.f41399c;
        f39313i0 = C3046g0.f41400d;
        f39314j0 = C3046g0.f41401e;
        f39315k0 = C3046g0.f41402f;
        f39316l0 = C3046g0.f41403g;
        f39317m0 = C3046g0.f41404h;
        f39318n0 = C3046g0.f41405i;
        f39319o0 = C3046g0.f41406j;
        f39320p0 = C3046g0.f41407k;
        f39321q0 = new Function3<String, JSONObject, ParsingEnvironment, DivAccessibility>() { // from class: com.yandex.div2.DivStateTemplate$Companion$ACCESSIBILITY_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAccessibility mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAccessibility.Companion companion3 = DivAccessibility.f34479f;
                DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject2, str2, DivAccessibility.f34486m, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divAccessibility == null ? DivStateTemplate.f39267E : divAccessibility;
            }
        };
        f39322r0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>>() { // from class: com.yandex.div2.DivStateTemplate$Companion$ALIGNMENT_HORIZONTAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentHorizontal> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentHorizontal.f34618d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivStateTemplate.f39287O);
            }
        };
        f39323s0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>>() { // from class: com.yandex.div2.DivStateTemplate$Companion$ALIGNMENT_VERTICAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentVertical> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentVertical.Converter converter = DivAlignmentVertical.f34625c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentVertical.f34626d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivStateTemplate.f39289P);
            }
        };
        f39324t0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivStateTemplate$Companion$ALPHA_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
                ValueValidator<Double> valueValidator = DivStateTemplate.f39297T;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Double> expression = DivStateTemplate.f39269F;
                Expression<Double> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
                return m17328t == null ? expression : m17328t;
            }
        };
        f39325u0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>>() { // from class: com.yandex.div2.DivStateTemplate$Companion$BACKGROUND_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivBackground> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBackground.Companion companion3 = DivBackground.f34750a;
                return JsonParser.m17333y(jSONObject2, str2, DivBackground.f34751b, DivStateTemplate.f39299U, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f39326v0 = new Function3<String, JSONObject, ParsingEnvironment, DivBorder>() { // from class: com.yandex.div2.DivStateTemplate$Companion$BORDER_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivBorder mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBorder.Companion companion3 = DivBorder.f34785f;
                DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject2, str2, DivBorder.f34788i, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divBorder == null ? DivStateTemplate.f39271G : divBorder;
            }
        };
        f39327w0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivStateTemplate$Companion$COLUMN_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivStateTemplate.f39302X, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f39328x0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<String>>() { // from class: com.yandex.div2.DivStateTemplate$Companion$DEFAULT_STATE_ID_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<String> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String key = str;
                JSONObject json = jSONObject;
                ParsingEnvironment env = parsingEnvironment;
                Intrinsics.m32179h(key, "key");
                Intrinsics.m32179h(json, "json");
                Intrinsics.m32179h(env, "env");
                return JsonParser.m17326r(json, key, env.getF34328a(), env, TypeHelpersKt.f33850c);
            }
        };
        f39329y0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>>() { // from class: com.yandex.div2.DivStateTemplate$Companion$DISAPPEAR_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivDisappearAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivDisappearAction.Companion companion3 = DivDisappearAction.f35537a;
                return JsonParser.m17333y(jSONObject2, str2, DivDisappearAction.f35545i, DivStateTemplate.f39303Y, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f39330z0 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivStateTemplate$Companion$DIV_ID_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                Object m17742d = C3033a.m17742d(str2, "key", jSONObject2, "json", parsingEnvironment, "env", jSONObject2, str2);
                if (m17742d == null) {
                    m17742d = null;
                }
                return (String) m17742d;
            }
        };
        f39263A0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>>() { // from class: com.yandex.div2.DivStateTemplate$Companion$EXTENSIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivExtension> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivExtension.Companion companion3 = DivExtension.f35659c;
                return JsonParser.m17333y(jSONObject2, str2, DivExtension.f35660d, DivStateTemplate.f39305a0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f39264B0 = new Function3<String, JSONObject, ParsingEnvironment, DivFocus>() { // from class: com.yandex.div2.DivStateTemplate$Companion$FOCUS_READER$1
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
        f39265C0 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivStateTemplate$Companion$HEIGHT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivStateTemplate.f39273H : divSize;
            }
        };
        f39266D0 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivStateTemplate$Companion$ID_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return (String) JsonParser.m17323o(jSONObject2, str2, DivStateTemplate.f39308d0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f39268E0 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivStateTemplate$Companion$MARGINS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivStateTemplate.f39275I : divEdgeInsets;
            }
        };
        f39270F0 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivStateTemplate$Companion$PADDINGS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivStateTemplate.f39277J : divEdgeInsets;
            }
        };
        f39272G0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivStateTemplate$Companion$ROW_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivStateTemplate.f39310f0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f39274H0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivStateTemplate$Companion$SELECTED_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivStateTemplate.f39311g0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f39276I0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivState.State>>() { // from class: com.yandex.div2.DivStateTemplate$Companion$STATES_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivState.State> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivState.State.Companion companion3 = DivState.State.f39255f;
                List<DivState.State> m17321m = JsonParser.m17321m(jSONObject2, str2, DivState.State.f39256g, DivStateTemplate.f39313i0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                Intrinsics.m32178g(m17321m, "readList(json, key, DivS…LIDATOR, env.logger, env)");
                return m17321m;
            }
        };
        f39278J0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>>() { // from class: com.yandex.div2.DivStateTemplate$Companion$TOOLTIPS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTooltip> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTooltip.Companion companion3 = DivTooltip.f40492h;
                return JsonParser.m17333y(jSONObject2, str2, DivTooltip.f40497m, DivStateTemplate.f39315k0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f39280K0 = new Function3<String, JSONObject, ParsingEnvironment, DivTransform>() { // from class: com.yandex.div2.DivStateTemplate$Companion$TRANSFORM_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivTransform mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransform.Companion companion3 = DivTransform.f40551d;
                DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject2, str2, DivTransform.f40554g, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divTransform == null ? DivStateTemplate.f39279K : divTransform;
            }
        };
        f39282L0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivTransitionSelector>>() { // from class: com.yandex.div2.DivStateTemplate$Companion$TRANSITION_ANIMATION_SELECTOR_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivTransitionSelector> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransitionSelector.Converter converter = DivTransitionSelector.f40573c;
                Function1<String, DivTransitionSelector> function1 = DivTransitionSelector.f40574d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivTransitionSelector> expression = DivStateTemplate.f39281L;
                Expression<DivTransitionSelector> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivStateTemplate.f39291Q);
                return m17330v == null ? expression : m17330v;
            }
        };
        f39284M0 = new Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition>() { // from class: com.yandex.div2.DivStateTemplate$Companion$TRANSITION_CHANGE_READER$1
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
        f39286N0 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivStateTemplate$Companion$TRANSITION_IN_READER$1
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
        f39288O0 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivStateTemplate$Companion$TRANSITION_OUT_READER$1
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
        f39290P0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>>() { // from class: com.yandex.div2.DivStateTemplate$Companion$TRANSITION_TRIGGERS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTransitionTrigger> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransitionTrigger.Converter converter = DivTransitionTrigger.f40582c;
                return JsonParser.m17332x(jSONObject2, str2, DivTransitionTrigger.f40583d, DivStateTemplate.f39317m0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        DivStateTemplate$Companion$TYPE_READER$1 divStateTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivStateTemplate$Companion$TYPE_READER$1
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
        f39292Q0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>>() { // from class: com.yandex.div2.DivStateTemplate$Companion$VISIBILITY_READER$1
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
                Expression<DivVisibility> expression = DivStateTemplate.f39283M;
                Expression<DivVisibility> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivStateTemplate.f39293R);
                return m17330v == null ? expression : m17330v;
            }
        };
        f39294R0 = new Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction>() { // from class: com.yandex.div2.DivStateTemplate$Companion$VISIBILITY_ACTION_READER$1
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
        f39296S0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>>() { // from class: com.yandex.div2.DivStateTemplate$Companion$VISIBILITY_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivVisibilityAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivVisibilityAction.Companion companion3 = DivVisibilityAction.f40938i;
                return JsonParser.m17333y(jSONObject2, str2, DivVisibilityAction.f40946q, DivStateTemplate.f39319o0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f39298T0 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivStateTemplate$Companion$WIDTH_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivStateTemplate.f39285N : divSize;
            }
        };
        DivStateTemplate$Companion$CREATOR$1 divStateTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivStateTemplate>() { // from class: com.yandex.div2.DivStateTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivStateTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivStateTemplate(env, null, false, it);
            }
        };
    }

    public DivStateTemplate(@NotNull ParsingEnvironment env, @Nullable DivStateTemplate divStateTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        Field<DivAccessibilityTemplate> field = divStateTemplate == null ? null : divStateTemplate.f39335a;
        DivAccessibilityTemplate.Companion companion = DivAccessibilityTemplate.f34515g;
        this.f39335a = JsonTemplateParser.m17354o(json, "accessibility", z, field, DivAccessibilityTemplate.f34531w, f34328a, env);
        Field<Expression<DivAlignmentHorizontal>> field2 = divStateTemplate == null ? null : divStateTemplate.f39336b;
        DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
        this.f39336b = JsonTemplateParser.m17358s(json, "alignment_horizontal", z, field2, DivAlignmentHorizontal.f34618d, f34328a, env, f39287O);
        Field<Expression<DivAlignmentVertical>> field3 = divStateTemplate == null ? null : divStateTemplate.f39337c;
        DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
        this.f39337c = JsonTemplateParser.m17358s(json, "alignment_vertical", z, field3, DivAlignmentVertical.f34626d, f34328a, env, f39289P);
        this.f39338d = JsonTemplateParser.m17357r(json, "alpha", z, divStateTemplate == null ? null : divStateTemplate.f39338d, ParsingConvertersKt.f33830d, f39295S, f34328a, env, TypeHelpersKt.f33851d);
        Field<List<DivBackgroundTemplate>> field4 = divStateTemplate == null ? null : divStateTemplate.f39339e;
        DivBackgroundTemplate.Companion companion2 = DivBackgroundTemplate.f34758a;
        this.f39339e = JsonTemplateParser.m17360u(json, "background", z, field4, DivBackgroundTemplate.f34759b, f39300V, f34328a, env);
        Field<DivBorderTemplate> field5 = divStateTemplate == null ? null : divStateTemplate.f39340f;
        DivBorderTemplate.Companion companion3 = DivBorderTemplate.f34795f;
        this.f39340f = JsonTemplateParser.m17354o(json, "border", z, field5, DivBorderTemplate.f34804o, f34328a, env);
        Field<Expression<Long>> field6 = divStateTemplate == null ? null : divStateTemplate.f39341g;
        Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
        ValueValidator<Long> valueValidator = f39301W;
        TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
        this.f39341g = JsonTemplateParser.m17357r(json, "column_span", z, field6, function1, valueValidator, f34328a, env, typeHelper);
        this.f39342h = JsonTemplateParser.m17356q(json, "default_state_id", z, divStateTemplate == null ? null : divStateTemplate.f39342h, f34328a, env, TypeHelpersKt.f33850c);
        Field<List<DivDisappearActionTemplate>> field7 = divStateTemplate == null ? null : divStateTemplate.f39343i;
        DivDisappearActionTemplate.Companion companion4 = DivDisappearActionTemplate.f35550i;
        this.f39343i = JsonTemplateParser.m17360u(json, "disappear_actions", z, field7, DivDisappearActionTemplate.f35549C, f39304Z, f34328a, env);
        this.f39344j = JsonTemplateParser.m17352m(json, "div_id", z, divStateTemplate == null ? null : divStateTemplate.f39344j, f34328a, env);
        Field<List<DivExtensionTemplate>> field8 = divStateTemplate == null ? null : divStateTemplate.f39345k;
        DivExtensionTemplate.Companion companion5 = DivExtensionTemplate.f35664c;
        this.f39345k = JsonTemplateParser.m17360u(json, "extensions", z, field8, DivExtensionTemplate.f35667f, f39306b0, f34328a, env);
        Field<DivFocusTemplate> field9 = divStateTemplate == null ? null : divStateTemplate.f39346l;
        DivFocusTemplate.Companion companion6 = DivFocusTemplate.f35833f;
        this.f39346l = JsonTemplateParser.m17354o(json, "focus", z, field9, DivFocusTemplate.f35846s, f34328a, env);
        Field<DivSizeTemplate> field10 = divStateTemplate == null ? null : divStateTemplate.f39347m;
        DivSizeTemplate.Companion companion7 = DivSizeTemplate.f38839a;
        Function2<ParsingEnvironment, JSONObject, DivSizeTemplate> function2 = DivSizeTemplate.f38840b;
        this.f39347m = JsonTemplateParser.m17354o(json, "height", z, field10, function2, f34328a, env);
        this.f39348n = JsonTemplateParser.m17351l(json, "id", z, divStateTemplate == null ? null : divStateTemplate.f39348n, f39307c0, f34328a, env);
        Field<DivEdgeInsetsTemplate> field11 = divStateTemplate == null ? null : divStateTemplate.f39349o;
        DivEdgeInsetsTemplate.Companion companion8 = DivEdgeInsetsTemplate.f35626f;
        Function2<ParsingEnvironment, JSONObject, DivEdgeInsetsTemplate> function22 = DivEdgeInsetsTemplate.f35646z;
        this.f39349o = JsonTemplateParser.m17354o(json, "margins", z, field11, function22, f34328a, env);
        this.f39350p = JsonTemplateParser.m17354o(json, "paddings", z, divStateTemplate == null ? null : divStateTemplate.f39350p, function22, f34328a, env);
        this.f39351q = JsonTemplateParser.m17357r(json, "row_span", z, divStateTemplate == null ? null : divStateTemplate.f39351q, function1, f39309e0, f34328a, env, typeHelper);
        Field<List<DivActionTemplate>> field12 = divStateTemplate == null ? null : divStateTemplate.f39352r;
        DivActionTemplate.Companion companion9 = DivActionTemplate.f34572i;
        this.f39352r = JsonTemplateParser.m17360u(json, "selected_actions", z, field12, DivActionTemplate.f34586w, f39312h0, f34328a, env);
        Field<List<StateTemplate>> field13 = divStateTemplate == null ? null : divStateTemplate.f39353s;
        StateTemplate.Companion companion10 = StateTemplate.f39397f;
        this.f39353s = JsonTemplateParser.m17350k(json, "states", z, field13, StateTemplate.f39403l, f39314j0, f34328a, env);
        Field<List<DivTooltipTemplate>> field14 = divStateTemplate == null ? null : divStateTemplate.f39354t;
        DivTooltipTemplate.Companion companion11 = DivTooltipTemplate.f40520h;
        this.f39354t = JsonTemplateParser.m17360u(json, "tooltips", z, field14, DivTooltipTemplate.f40534v, f39316l0, f34328a, env);
        Field<DivTransformTemplate> field15 = divStateTemplate == null ? null : divStateTemplate.f39355u;
        DivTransformTemplate.Companion companion12 = DivTransformTemplate.f40559d;
        this.f39355u = JsonTemplateParser.m17354o(json, "transform", z, field15, DivTransformTemplate.f40565j, f34328a, env);
        Field<Expression<DivTransitionSelector>> field16 = divStateTemplate == null ? null : divStateTemplate.f39356v;
        DivTransitionSelector.Converter converter3 = DivTransitionSelector.f40573c;
        this.f39356v = JsonTemplateParser.m17358s(json, "transition_animation_selector", z, field16, DivTransitionSelector.f40574d, f34328a, env, f39291Q);
        Field<DivChangeTransitionTemplate> field17 = divStateTemplate == null ? null : divStateTemplate.f39357w;
        DivChangeTransitionTemplate.Companion companion13 = DivChangeTransitionTemplate.f34861a;
        this.f39357w = JsonTemplateParser.m17354o(json, "transition_change", z, field17, DivChangeTransitionTemplate.f34862b, f34328a, env);
        Field<DivAppearanceTransitionTemplate> field18 = divStateTemplate == null ? null : divStateTemplate.f39358x;
        DivAppearanceTransitionTemplate.Companion companion14 = DivAppearanceTransitionTemplate.f34733a;
        Function2<ParsingEnvironment, JSONObject, DivAppearanceTransitionTemplate> function23 = DivAppearanceTransitionTemplate.f34734b;
        this.f39358x = JsonTemplateParser.m17354o(json, "transition_in", z, field18, function23, f34328a, env);
        this.f39359y = JsonTemplateParser.m17354o(json, "transition_out", z, divStateTemplate == null ? null : divStateTemplate.f39359y, function23, f34328a, env);
        Field<List<DivTransitionTrigger>> field19 = divStateTemplate == null ? null : divStateTemplate.f39360z;
        DivTransitionTrigger.Converter converter4 = DivTransitionTrigger.f40582c;
        this.f39360z = JsonTemplateParser.m17359t(json, "transition_triggers", z, field19, DivTransitionTrigger.f40583d, f39318n0, f34328a, env);
        Field<Expression<DivVisibility>> field20 = divStateTemplate == null ? null : divStateTemplate.f39331A;
        DivVisibility.Converter converter5 = DivVisibility.f40930c;
        this.f39331A = JsonTemplateParser.m17358s(json, "visibility", z, field20, DivVisibility.f40931d, f34328a, env, f39293R);
        Field<DivVisibilityActionTemplate> field21 = divStateTemplate == null ? null : divStateTemplate.f39332B;
        DivVisibilityActionTemplate.Companion companion15 = DivVisibilityActionTemplate.f40959i;
        Function2<ParsingEnvironment, JSONObject, DivVisibilityActionTemplate> function24 = DivVisibilityActionTemplate.f40958C;
        this.f39332B = JsonTemplateParser.m17354o(json, "visibility_action", z, field21, function24, f34328a, env);
        this.f39333C = JsonTemplateParser.m17360u(json, "visibility_actions", z, divStateTemplate == null ? null : divStateTemplate.f39333C, function24, f39320p0, f34328a, env);
        this.f39334D = JsonTemplateParser.m17354o(json, "width", z, divStateTemplate == null ? null : divStateTemplate.f39334D, function2, f34328a, env);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivState mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        DivAccessibility divAccessibility = (DivAccessibility) FieldKt.m17381g(this.f39335a, env, "accessibility", data, f39321q0);
        if (divAccessibility == null) {
            divAccessibility = f39267E;
        }
        DivAccessibility divAccessibility2 = divAccessibility;
        Expression expression = (Expression) FieldKt.m17378d(this.f39336b, env, "alignment_horizontal", data, f39322r0);
        Expression expression2 = (Expression) FieldKt.m17378d(this.f39337c, env, "alignment_vertical", data, f39323s0);
        Expression<Double> expression3 = (Expression) FieldKt.m17378d(this.f39338d, env, "alpha", data, f39324t0);
        if (expression3 == null) {
            expression3 = f39269F;
        }
        Expression<Double> expression4 = expression3;
        List m17382h = FieldKt.m17382h(this.f39339e, env, "background", data, f39299U, f39325u0);
        DivBorder divBorder = (DivBorder) FieldKt.m17381g(this.f39340f, env, "border", data, f39326v0);
        if (divBorder == null) {
            divBorder = f39271G;
        }
        DivBorder divBorder2 = divBorder;
        Expression expression5 = (Expression) FieldKt.m17378d(this.f39341g, env, "column_span", data, f39327w0);
        Expression expression6 = (Expression) FieldKt.m17378d(this.f39342h, env, "default_state_id", data, f39328x0);
        List m17382h2 = FieldKt.m17382h(this.f39343i, env, "disappear_actions", data, f39303Y, f39329y0);
        String str = (String) FieldKt.m17378d(this.f39344j, env, "div_id", data, f39330z0);
        List m17382h3 = FieldKt.m17382h(this.f39345k, env, "extensions", data, f39305a0, f39263A0);
        DivFocus divFocus = (DivFocus) FieldKt.m17381g(this.f39346l, env, "focus", data, f39264B0);
        DivSize divSize = (DivSize) FieldKt.m17381g(this.f39347m, env, "height", data, f39265C0);
        if (divSize == null) {
            divSize = f39273H;
        }
        DivSize divSize2 = divSize;
        String str2 = (String) FieldKt.m17378d(this.f39348n, env, "id", data, f39266D0);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) FieldKt.m17381g(this.f39349o, env, "margins", data, f39268E0);
        if (divEdgeInsets == null) {
            divEdgeInsets = f39275I;
        }
        DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
        DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) FieldKt.m17381g(this.f39350p, env, "paddings", data, f39270F0);
        if (divEdgeInsets3 == null) {
            divEdgeInsets3 = f39277J;
        }
        DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
        Expression expression7 = (Expression) FieldKt.m17378d(this.f39351q, env, "row_span", data, f39272G0);
        List m17382h4 = FieldKt.m17382h(this.f39352r, env, "selected_actions", data, f39311g0, f39274H0);
        List m17384j = FieldKt.m17384j(this.f39353s, env, "states", data, f39313i0, f39276I0);
        List m17382h5 = FieldKt.m17382h(this.f39354t, env, "tooltips", data, f39315k0, f39278J0);
        DivTransform divTransform = (DivTransform) FieldKt.m17381g(this.f39355u, env, "transform", data, f39280K0);
        if (divTransform == null) {
            divTransform = f39279K;
        }
        DivTransform divTransform2 = divTransform;
        Expression<DivTransitionSelector> expression8 = (Expression) FieldKt.m17378d(this.f39356v, env, "transition_animation_selector", data, f39282L0);
        if (expression8 == null) {
            expression8 = f39281L;
        }
        Expression<DivTransitionSelector> expression9 = expression8;
        DivChangeTransition divChangeTransition = (DivChangeTransition) FieldKt.m17381g(this.f39357w, env, "transition_change", data, f39284M0);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) FieldKt.m17381g(this.f39358x, env, "transition_in", data, f39286N0);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) FieldKt.m17381g(this.f39359y, env, "transition_out", data, f39288O0);
        List m17380f = FieldKt.m17380f(this.f39360z, env, "transition_triggers", data, f39317m0, f39290P0);
        Expression<DivVisibility> expression10 = (Expression) FieldKt.m17378d(this.f39331A, env, "visibility", data, f39292Q0);
        if (expression10 == null) {
            expression10 = f39283M;
        }
        Expression<DivVisibility> expression11 = expression10;
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) FieldKt.m17381g(this.f39332B, env, "visibility_action", data, f39294R0);
        List m17382h6 = FieldKt.m17382h(this.f39333C, env, "visibility_actions", data, f39319o0, f39296S0);
        DivSize divSize3 = (DivSize) FieldKt.m17381g(this.f39334D, env, "width", data, f39298T0);
        if (divSize3 == null) {
            divSize3 = f39285N;
        }
        return new DivState(divAccessibility2, expression, expression2, expression4, m17382h, divBorder2, expression5, expression6, m17382h2, str, m17382h3, divFocus, divSize2, str2, divEdgeInsets2, divEdgeInsets4, expression7, m17382h4, m17384j, m17382h5, divTransform2, expression9, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17380f, expression11, divVisibilityAction, m17382h6, divSize3);
    }
}
