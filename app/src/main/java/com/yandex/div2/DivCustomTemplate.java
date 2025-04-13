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

/* compiled from: DivCustomTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivCustomTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivCustom;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivCustomTemplate implements JSONSerializable, JsonTemplate<DivCustom> {

    /* renamed from: A0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f35316A0;

    /* renamed from: B0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<Div>> f35317B0;

    /* renamed from: C0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f35318C0;

    /* renamed from: D */
    @NotNull
    public static final DivAccessibility f35319D = new DivAccessibility(null, null, null, null, null, null, 63);

    /* renamed from: D0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets> f35320D0;

    /* renamed from: E */
    @NotNull
    public static final Expression<Double> f35321E;

    /* renamed from: E0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f35322E0;

    /* renamed from: F */
    @NotNull
    public static final DivBorder f35323F;

    /* renamed from: F0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f35324F0;

    /* renamed from: G */
    @NotNull
    public static final DivSize.WrapContent f35325G;

    /* renamed from: G0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>> f35326G0;

    /* renamed from: H */
    @NotNull
    public static final DivEdgeInsets f35327H;

    /* renamed from: H0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivTransform> f35328H0;

    /* renamed from: I */
    @NotNull
    public static final DivEdgeInsets f35329I;

    /* renamed from: I0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition> f35330I0;

    /* renamed from: J */
    @NotNull
    public static final DivTransform f35331J;

    /* renamed from: J0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f35332J0;

    /* renamed from: K */
    @NotNull
    public static final Expression<DivVisibility> f35333K;

    /* renamed from: K0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition> f35334K0;

    /* renamed from: L */
    @NotNull
    public static final DivSize.MatchParent f35335L;

    /* renamed from: L0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>> f35336L0;

    /* renamed from: M */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f35337M;

    /* renamed from: M0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>> f35338M0;

    /* renamed from: N */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f35339N;

    /* renamed from: N0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction> f35340N0;

    /* renamed from: O */
    @NotNull
    public static final TypeHelper<DivVisibility> f35341O;

    /* renamed from: O0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>> f35342O0;

    /* renamed from: P */
    @NotNull
    public static final ValueValidator<Double> f35343P;

    /* renamed from: P0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f35344P0;

    /* renamed from: Q */
    @NotNull
    public static final ValueValidator<Double> f35345Q;

    /* renamed from: R */
    @NotNull
    public static final ListValidator<DivBackground> f35346R;

    /* renamed from: S */
    @NotNull
    public static final ListValidator<DivBackgroundTemplate> f35347S;

    /* renamed from: T */
    @NotNull
    public static final ValueValidator<Long> f35348T;

    /* renamed from: U */
    @NotNull
    public static final ValueValidator<Long> f35349U;

    /* renamed from: V */
    @NotNull
    public static final ListValidator<DivDisappearAction> f35350V;

    /* renamed from: W */
    @NotNull
    public static final ListValidator<DivDisappearActionTemplate> f35351W;

    /* renamed from: X */
    @NotNull
    public static final ListValidator<DivExtension> f35352X;

    /* renamed from: Y */
    @NotNull
    public static final ListValidator<DivExtensionTemplate> f35353Y;

    /* renamed from: Z */
    @NotNull
    public static final ValueValidator<String> f35354Z;

    /* renamed from: a0 */
    @NotNull
    public static final ValueValidator<String> f35355a0;

    /* renamed from: b0 */
    @NotNull
    public static final ListValidator<Div> f35356b0;

    /* renamed from: c0 */
    @NotNull
    public static final ListValidator<DivTemplate> f35357c0;

    /* renamed from: d0 */
    @NotNull
    public static final ValueValidator<Long> f35358d0;

    /* renamed from: e0 */
    @NotNull
    public static final ValueValidator<Long> f35359e0;

    /* renamed from: f0 */
    @NotNull
    public static final ListValidator<DivAction> f35360f0;

    /* renamed from: g0 */
    @NotNull
    public static final ListValidator<DivActionTemplate> f35361g0;

    /* renamed from: h0 */
    @NotNull
    public static final ListValidator<DivTooltip> f35362h0;

    /* renamed from: i0 */
    @NotNull
    public static final ListValidator<DivTooltipTemplate> f35363i0;

    /* renamed from: j0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f35364j0;

    /* renamed from: k0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f35365k0;

    /* renamed from: l0 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f35366l0;

    /* renamed from: m0 */
    @NotNull
    public static final ListValidator<DivVisibilityActionTemplate> f35367m0;

    /* renamed from: n0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAccessibility> f35368n0;

    /* renamed from: o0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>> f35369o0;

    /* renamed from: p0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>> f35370p0;

    /* renamed from: q0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f35371q0;

    /* renamed from: r0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>> f35372r0;

    /* renamed from: s0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivBorder> f35373s0;

    /* renamed from: t0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f35374t0;

    /* renamed from: u0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, JSONObject> f35375u0;

    /* renamed from: v0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f35376v0;

    /* renamed from: w0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>> f35377w0;

    /* renamed from: x0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>> f35378x0;

    /* renamed from: y0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivFocus> f35379y0;

    /* renamed from: z0 */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivSize> f35380z0;

    /* renamed from: A */
    @JvmField
    @NotNull
    public final Field<DivVisibilityActionTemplate> f35381A;

    /* renamed from: B */
    @JvmField
    @NotNull
    public final Field<List<DivVisibilityActionTemplate>> f35382B;

    /* renamed from: C */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f35383C;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<DivAccessibilityTemplate> f35384a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f35385b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f35386c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f35387d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Field<List<DivBackgroundTemplate>> f35388e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final Field<DivBorderTemplate> f35389f;

    /* renamed from: g */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f35390g;

    /* renamed from: h */
    @JvmField
    @NotNull
    public final Field<JSONObject> f35391h;

    /* renamed from: i */
    @JvmField
    @NotNull
    public final Field<String> f35392i;

    /* renamed from: j */
    @JvmField
    @NotNull
    public final Field<List<DivDisappearActionTemplate>> f35393j;

    /* renamed from: k */
    @JvmField
    @NotNull
    public final Field<List<DivExtensionTemplate>> f35394k;

    /* renamed from: l */
    @JvmField
    @NotNull
    public final Field<DivFocusTemplate> f35395l;

    /* renamed from: m */
    @JvmField
    @NotNull
    public final Field<DivSizeTemplate> f35396m;

    /* renamed from: n */
    @JvmField
    @NotNull
    public final Field<String> f35397n;

    /* renamed from: o */
    @JvmField
    @NotNull
    public final Field<List<DivTemplate>> f35398o;

    /* renamed from: p */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f35399p;

    /* renamed from: q */
    @JvmField
    @NotNull
    public final Field<DivEdgeInsetsTemplate> f35400q;

    /* renamed from: r */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f35401r;

    /* renamed from: s */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f35402s;

    /* renamed from: t */
    @JvmField
    @NotNull
    public final Field<List<DivTooltipTemplate>> f35403t;

    /* renamed from: u */
    @JvmField
    @NotNull
    public final Field<DivTransformTemplate> f35404u;

    /* renamed from: v */
    @JvmField
    @NotNull
    public final Field<DivChangeTransitionTemplate> f35405v;

    /* renamed from: w */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f35406w;

    /* renamed from: x */
    @JvmField
    @NotNull
    public final Field<DivAppearanceTransitionTemplate> f35407x;

    /* renamed from: y */
    @JvmField
    @NotNull
    public final Field<List<DivTransitionTrigger>> f35408y;

    /* renamed from: z */
    @JvmField
    @NotNull
    public final Field<Expression<DivVisibility>> f35409z;

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000bR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0010R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0010R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u000bR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020$0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u000bR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0010R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0010R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u000bR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u000bR\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0010R\u001a\u00104\u001a\b\u0012\u0004\u0012\u0002030\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0010R\u001a\u00106\u001a\b\u0012\u0004\u0012\u0002050\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0010R\u001a\u00108\u001a\b\u0012\u0004\u0012\u0002070\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0010R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010\u0010R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020<0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010\u0010R\u0014\u0010?\u001a\u00020$8\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020B0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020E0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010DR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020G0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010DR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010\u0010R\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010\u0010R\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020G0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010\bR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006Q"}, m31884d2 = {"Lcom/yandex/div2/DivCustomTemplate$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackgroundTemplate;", "BACKGROUND_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivDisappearActionTemplate;", "DISAPPEAR_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivExtensionTemplate;", "EXTENSIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div2/DivTemplate;", "ITEMS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/Div;", "ITEMS_VALIDATOR", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "PADDINGS_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "Lcom/yandex/div2/DivActionTemplate;", "SELECTED_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivAction;", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivTooltipTemplate;", "TOOLTIPS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_TEMPLATE_VALIDATOR", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/DivVisibilityActionTemplate;", "VISIBILITY_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.f34334a;
        f35321E = companion.m17539a(Double.valueOf(1.0d));
        f35323F = new DivBorder(null, null, null, null, null, 31);
        int i2 = 7;
        f35325G = new DivSize.WrapContent(new DivWrapContentSize(0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i2));
        f35327H = new DivEdgeInsets(0 == true ? 1 : 0, 0 == true ? 1 : 0, null, null, null, 31);
        f35329I = new DivEdgeInsets(null, null, null, null, null, 31);
        f35331J = new DivTransform(0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i2);
        f35333K = companion.m17539a(DivVisibility.VISIBLE);
        f35335L = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i3 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f35337M = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f35339N = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f35341O = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f35343P = C3045g.f41372f;
        f35345Q = C3045g.f41377k;
        f35346R = C3047h.f41435h;
        f35347S = C3047h.f41436i;
        f35348T = C3045g.f41378l;
        f35349U = C3045g.f41379m;
        f35350V = C3047h.f41437j;
        f35351W = C3047h.f41438k;
        f35352X = C3047h.f41439l;
        f35353Y = C3047h.f41440m;
        f35354Z = C3045g.f41373g;
        f35355a0 = C3045g.f41374h;
        f35356b0 = C3041e.f41262B;
        f35357c0 = C3041e.f41263C;
        f35358d0 = C3045g.f41375i;
        f35359e0 = C3045g.f41376j;
        f35360f0 = C3041e.f41264D;
        f35361g0 = C3041e.f41265E;
        f35362h0 = C3047h.f41429b;
        f35363i0 = C3047h.f41430c;
        f35364j0 = C3047h.f41431d;
        f35365k0 = C3047h.f41432e;
        f35366l0 = C3047h.f41433f;
        f35367m0 = C3047h.f41434g;
        f35368n0 = new Function3<String, JSONObject, ParsingEnvironment, DivAccessibility>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$ACCESSIBILITY_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivAccessibility mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAccessibility.Companion companion3 = DivAccessibility.f34479f;
                DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject2, str2, DivAccessibility.f34486m, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divAccessibility == null ? DivCustomTemplate.f35319D : divAccessibility;
            }
        };
        f35369o0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$ALIGNMENT_HORIZONTAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentHorizontal> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentHorizontal.f34618d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivCustomTemplate.f35337M);
            }
        };
        f35370p0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$ALIGNMENT_VERTICAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentVertical> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentVertical.Converter converter = DivAlignmentVertical.f34625c;
                return JsonParser.m17329u(jSONObject2, str2, DivAlignmentVertical.f34626d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivCustomTemplate.f35339N);
            }
        };
        f35371q0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$ALPHA_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
                ValueValidator<Double> valueValidator = DivCustomTemplate.f35345Q;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Double> expression = DivCustomTemplate.f35321E;
                Expression<Double> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
                return m17328t == null ? expression : m17328t;
            }
        };
        f35372r0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivBackground>>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$BACKGROUND_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivBackground> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBackground.Companion companion3 = DivBackground.f34750a;
                return JsonParser.m17333y(jSONObject2, str2, DivBackground.f34751b, DivCustomTemplate.f35346R, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f35373s0 = new Function3<String, JSONObject, ParsingEnvironment, DivBorder>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$BORDER_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivBorder mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivBorder.Companion companion3 = DivBorder.f34785f;
                DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject2, str2, DivBorder.f34788i, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divBorder == null ? DivCustomTemplate.f35323F : divBorder;
            }
        };
        f35374t0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$COLUMN_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivCustomTemplate.f35349U, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f35375u0 = new Function3<String, JSONObject, ParsingEnvironment, JSONObject>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$CUSTOM_PROPS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public JSONObject mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                Object m17742d = C3033a.m17742d(str2, "key", jSONObject2, "json", parsingEnvironment, "env", jSONObject2, str2);
                if (m17742d == null) {
                    m17742d = null;
                }
                return (JSONObject) m17742d;
            }
        };
        f35376v0 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$CUSTOM_TYPE_READER$1
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
        f35377w0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivDisappearAction>>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$DISAPPEAR_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivDisappearAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivDisappearAction.Companion companion3 = DivDisappearAction.f35537a;
                return JsonParser.m17333y(jSONObject2, str2, DivDisappearAction.f35545i, DivCustomTemplate.f35350V, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f35378x0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivExtension>>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$EXTENSIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivExtension> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivExtension.Companion companion3 = DivExtension.f35659c;
                return JsonParser.m17333y(jSONObject2, str2, DivExtension.f35660d, DivCustomTemplate.f35352X, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f35379y0 = new Function3<String, JSONObject, ParsingEnvironment, DivFocus>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$FOCUS_READER$1
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
        f35380z0 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$HEIGHT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivCustomTemplate.f35325G : divSize;
            }
        };
        f35316A0 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$ID_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return (String) JsonParser.m17323o(jSONObject2, str2, DivCustomTemplate.f35355a0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f35317B0 = new Function3<String, JSONObject, ParsingEnvironment, List<Div>>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$ITEMS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<Div> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Div.Companion companion3 = Div.f34418a;
                return JsonParser.m17333y(jSONObject2, str2, Div.f34419b, DivCustomTemplate.f35356b0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f35318C0 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$MARGINS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivCustomTemplate.f35327H : divEdgeInsets;
            }
        };
        f35320D0 = new Function3<String, JSONObject, ParsingEnvironment, DivEdgeInsets>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$PADDINGS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivEdgeInsets.f35618q, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divEdgeInsets == null ? DivCustomTemplate.f35329I : divEdgeInsets;
            }
        };
        f35322E0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$ROW_SPAN_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivCustomTemplate.f35359e0, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        f35324F0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$SELECTED_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion3 = DivAction.f34546g;
                return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivCustomTemplate.f35360f0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f35326G0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTooltip>>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$TOOLTIPS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTooltip> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTooltip.Companion companion3 = DivTooltip.f40492h;
                return JsonParser.m17333y(jSONObject2, str2, DivTooltip.f40497m, DivCustomTemplate.f35362h0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f35328H0 = new Function3<String, JSONObject, ParsingEnvironment, DivTransform>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$TRANSFORM_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivTransform mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransform.Companion companion3 = DivTransform.f40551d;
                DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject2, str2, DivTransform.f40554g, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divTransform == null ? DivCustomTemplate.f35331J : divTransform;
            }
        };
        f35330I0 = new Function3<String, JSONObject, ParsingEnvironment, DivChangeTransition>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$TRANSITION_CHANGE_READER$1
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
        f35332J0 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$TRANSITION_IN_READER$1
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
        f35334K0 = new Function3<String, JSONObject, ParsingEnvironment, DivAppearanceTransition>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$TRANSITION_OUT_READER$1
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
        f35336L0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivTransitionTrigger>>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$TRANSITION_TRIGGERS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivTransitionTrigger> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTransitionTrigger.Converter converter = DivTransitionTrigger.f40582c;
                return JsonParser.m17332x(jSONObject2, str2, DivTransitionTrigger.f40583d, DivCustomTemplate.f35364j0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        DivCustomTemplate$Companion$TYPE_READER$1 divCustomTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$TYPE_READER$1
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
        f35338M0 = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivVisibility>>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$VISIBILITY_READER$1
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
                Expression<DivVisibility> expression = DivCustomTemplate.f35333K;
                Expression<DivVisibility> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivCustomTemplate.f35341O);
                return m17330v == null ? expression : m17330v;
            }
        };
        f35340N0 = new Function3<String, JSONObject, ParsingEnvironment, DivVisibilityAction>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$VISIBILITY_ACTION_READER$1
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
        f35342O0 = new Function3<String, JSONObject, ParsingEnvironment, List<DivVisibilityAction>>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$VISIBILITY_ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivVisibilityAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivVisibilityAction.Companion companion3 = DivVisibilityAction.f40938i;
                return JsonParser.m17333y(jSONObject2, str2, DivVisibilityAction.f40946q, DivCustomTemplate.f35366l0, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f35344P0 = new Function3<String, JSONObject, ParsingEnvironment, DivSize>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$WIDTH_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSize.Companion companion3 = DivSize.f38833a;
                DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject2, str2, DivSize.f38834b, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                return divSize == null ? DivCustomTemplate.f35335L : divSize;
            }
        };
        DivCustomTemplate$Companion$CREATOR$1 divCustomTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivCustomTemplate>() { // from class: com.yandex.div2.DivCustomTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivCustomTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivCustomTemplate(env, null, false, it);
            }
        };
    }

    public DivCustomTemplate(@NotNull ParsingEnvironment env, @Nullable DivCustomTemplate divCustomTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        Field<DivAccessibilityTemplate> field = divCustomTemplate == null ? null : divCustomTemplate.f35384a;
        DivAccessibilityTemplate.Companion companion = DivAccessibilityTemplate.f34515g;
        this.f35384a = JsonTemplateParser.m17354o(json, "accessibility", z, field, DivAccessibilityTemplate.f34531w, f34328a, env);
        Field<Expression<DivAlignmentHorizontal>> field2 = divCustomTemplate == null ? null : divCustomTemplate.f35385b;
        DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
        this.f35385b = JsonTemplateParser.m17358s(json, "alignment_horizontal", z, field2, DivAlignmentHorizontal.f34618d, f34328a, env, f35337M);
        Field<Expression<DivAlignmentVertical>> field3 = divCustomTemplate == null ? null : divCustomTemplate.f35386c;
        DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
        this.f35386c = JsonTemplateParser.m17358s(json, "alignment_vertical", z, field3, DivAlignmentVertical.f34626d, f34328a, env, f35339N);
        this.f35387d = JsonTemplateParser.m17357r(json, "alpha", z, divCustomTemplate == null ? null : divCustomTemplate.f35387d, ParsingConvertersKt.f33830d, f35343P, f34328a, env, TypeHelpersKt.f33851d);
        Field<List<DivBackgroundTemplate>> field4 = divCustomTemplate == null ? null : divCustomTemplate.f35388e;
        DivBackgroundTemplate.Companion companion2 = DivBackgroundTemplate.f34758a;
        this.f35388e = JsonTemplateParser.m17360u(json, "background", z, field4, DivBackgroundTemplate.f34759b, f35347S, f34328a, env);
        Field<DivBorderTemplate> field5 = divCustomTemplate == null ? null : divCustomTemplate.f35389f;
        DivBorderTemplate.Companion companion3 = DivBorderTemplate.f34795f;
        this.f35389f = JsonTemplateParser.m17354o(json, "border", z, field5, DivBorderTemplate.f34804o, f34328a, env);
        Field<Expression<Long>> field6 = divCustomTemplate == null ? null : divCustomTemplate.f35390g;
        Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
        ValueValidator<Long> valueValidator = f35348T;
        TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
        this.f35390g = JsonTemplateParser.m17357r(json, "column_span", z, field6, function1, valueValidator, f34328a, env, typeHelper);
        this.f35391h = JsonTemplateParser.m17352m(json, "custom_props", z, divCustomTemplate == null ? null : divCustomTemplate.f35391h, f34328a, env);
        this.f35392i = JsonTemplateParser.m17342c(json, "custom_type", z, divCustomTemplate == null ? null : divCustomTemplate.f35392i, f34328a, env);
        Field<List<DivDisappearActionTemplate>> field7 = divCustomTemplate == null ? null : divCustomTemplate.f35393j;
        DivDisappearActionTemplate.Companion companion4 = DivDisappearActionTemplate.f35550i;
        this.f35393j = JsonTemplateParser.m17360u(json, "disappear_actions", z, field7, DivDisappearActionTemplate.f35549C, f35351W, f34328a, env);
        Field<List<DivExtensionTemplate>> field8 = divCustomTemplate == null ? null : divCustomTemplate.f35394k;
        DivExtensionTemplate.Companion companion5 = DivExtensionTemplate.f35664c;
        this.f35394k = JsonTemplateParser.m17360u(json, "extensions", z, field8, DivExtensionTemplate.f35667f, f35353Y, f34328a, env);
        Field<DivFocusTemplate> field9 = divCustomTemplate == null ? null : divCustomTemplate.f35395l;
        DivFocusTemplate.Companion companion6 = DivFocusTemplate.f35833f;
        this.f35395l = JsonTemplateParser.m17354o(json, "focus", z, field9, DivFocusTemplate.f35846s, f34328a, env);
        Field<DivSizeTemplate> field10 = divCustomTemplate == null ? null : divCustomTemplate.f35396m;
        DivSizeTemplate.Companion companion7 = DivSizeTemplate.f38839a;
        Function2<ParsingEnvironment, JSONObject, DivSizeTemplate> function2 = DivSizeTemplate.f38840b;
        this.f35396m = JsonTemplateParser.m17354o(json, "height", z, field10, function2, f34328a, env);
        this.f35397n = JsonTemplateParser.m17351l(json, "id", z, divCustomTemplate == null ? null : divCustomTemplate.f35397n, f35354Z, f34328a, env);
        Field<List<DivTemplate>> field11 = divCustomTemplate == null ? null : divCustomTemplate.f35398o;
        DivTemplate.Companion companion8 = DivTemplate.f39864a;
        this.f35398o = JsonTemplateParser.m17360u(json, "items", z, field11, DivTemplate.f39865b, f35357c0, f34328a, env);
        Field<DivEdgeInsetsTemplate> field12 = divCustomTemplate == null ? null : divCustomTemplate.f35399p;
        DivEdgeInsetsTemplate.Companion companion9 = DivEdgeInsetsTemplate.f35626f;
        Function2<ParsingEnvironment, JSONObject, DivEdgeInsetsTemplate> function22 = DivEdgeInsetsTemplate.f35646z;
        this.f35399p = JsonTemplateParser.m17354o(json, "margins", z, field12, function22, f34328a, env);
        this.f35400q = JsonTemplateParser.m17354o(json, "paddings", z, divCustomTemplate == null ? null : divCustomTemplate.f35400q, function22, f34328a, env);
        this.f35401r = JsonTemplateParser.m17357r(json, "row_span", z, divCustomTemplate == null ? null : divCustomTemplate.f35401r, function1, f35358d0, f34328a, env, typeHelper);
        Field<List<DivActionTemplate>> field13 = divCustomTemplate == null ? null : divCustomTemplate.f35402s;
        DivActionTemplate.Companion companion10 = DivActionTemplate.f34572i;
        this.f35402s = JsonTemplateParser.m17360u(json, "selected_actions", z, field13, DivActionTemplate.f34586w, f35361g0, f34328a, env);
        Field<List<DivTooltipTemplate>> field14 = divCustomTemplate == null ? null : divCustomTemplate.f35403t;
        DivTooltipTemplate.Companion companion11 = DivTooltipTemplate.f40520h;
        this.f35403t = JsonTemplateParser.m17360u(json, "tooltips", z, field14, DivTooltipTemplate.f40534v, f35363i0, f34328a, env);
        Field<DivTransformTemplate> field15 = divCustomTemplate == null ? null : divCustomTemplate.f35404u;
        DivTransformTemplate.Companion companion12 = DivTransformTemplate.f40559d;
        this.f35404u = JsonTemplateParser.m17354o(json, "transform", z, field15, DivTransformTemplate.f40565j, f34328a, env);
        Field<DivChangeTransitionTemplate> field16 = divCustomTemplate == null ? null : divCustomTemplate.f35405v;
        DivChangeTransitionTemplate.Companion companion13 = DivChangeTransitionTemplate.f34861a;
        this.f35405v = JsonTemplateParser.m17354o(json, "transition_change", z, field16, DivChangeTransitionTemplate.f34862b, f34328a, env);
        Field<DivAppearanceTransitionTemplate> field17 = divCustomTemplate == null ? null : divCustomTemplate.f35406w;
        DivAppearanceTransitionTemplate.Companion companion14 = DivAppearanceTransitionTemplate.f34733a;
        Function2<ParsingEnvironment, JSONObject, DivAppearanceTransitionTemplate> function23 = DivAppearanceTransitionTemplate.f34734b;
        this.f35406w = JsonTemplateParser.m17354o(json, "transition_in", z, field17, function23, f34328a, env);
        this.f35407x = JsonTemplateParser.m17354o(json, "transition_out", z, divCustomTemplate == null ? null : divCustomTemplate.f35407x, function23, f34328a, env);
        Field<List<DivTransitionTrigger>> field18 = divCustomTemplate == null ? null : divCustomTemplate.f35408y;
        DivTransitionTrigger.Converter converter3 = DivTransitionTrigger.f40582c;
        this.f35408y = JsonTemplateParser.m17359t(json, "transition_triggers", z, field18, DivTransitionTrigger.f40583d, f35365k0, f34328a, env);
        Field<Expression<DivVisibility>> field19 = divCustomTemplate == null ? null : divCustomTemplate.f35409z;
        DivVisibility.Converter converter4 = DivVisibility.f40930c;
        this.f35409z = JsonTemplateParser.m17358s(json, "visibility", z, field19, DivVisibility.f40931d, f34328a, env, f35341O);
        Field<DivVisibilityActionTemplate> field20 = divCustomTemplate == null ? null : divCustomTemplate.f35381A;
        DivVisibilityActionTemplate.Companion companion15 = DivVisibilityActionTemplate.f40959i;
        Function2<ParsingEnvironment, JSONObject, DivVisibilityActionTemplate> function24 = DivVisibilityActionTemplate.f40958C;
        this.f35381A = JsonTemplateParser.m17354o(json, "visibility_action", z, field20, function24, f34328a, env);
        this.f35382B = JsonTemplateParser.m17360u(json, "visibility_actions", z, divCustomTemplate == null ? null : divCustomTemplate.f35382B, function24, f35367m0, f34328a, env);
        this.f35383C = JsonTemplateParser.m17354o(json, "width", z, divCustomTemplate == null ? null : divCustomTemplate.f35383C, function2, f34328a, env);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivCustom mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        DivAccessibility divAccessibility = (DivAccessibility) FieldKt.m17381g(this.f35384a, env, "accessibility", data, f35368n0);
        if (divAccessibility == null) {
            divAccessibility = f35319D;
        }
        DivAccessibility divAccessibility2 = divAccessibility;
        Expression expression = (Expression) FieldKt.m17378d(this.f35385b, env, "alignment_horizontal", data, f35369o0);
        Expression expression2 = (Expression) FieldKt.m17378d(this.f35386c, env, "alignment_vertical", data, f35370p0);
        Expression<Double> expression3 = (Expression) FieldKt.m17378d(this.f35387d, env, "alpha", data, f35371q0);
        if (expression3 == null) {
            expression3 = f35321E;
        }
        Expression<Double> expression4 = expression3;
        List m17382h = FieldKt.m17382h(this.f35388e, env, "background", data, f35346R, f35372r0);
        DivBorder divBorder = (DivBorder) FieldKt.m17381g(this.f35389f, env, "border", data, f35373s0);
        if (divBorder == null) {
            divBorder = f35323F;
        }
        DivBorder divBorder2 = divBorder;
        Expression expression5 = (Expression) FieldKt.m17378d(this.f35390g, env, "column_span", data, f35374t0);
        JSONObject jSONObject = (JSONObject) FieldKt.m17378d(this.f35391h, env, "custom_props", data, f35375u0);
        String str = (String) FieldKt.m17376b(this.f35392i, env, "custom_type", data, f35376v0);
        List m17382h2 = FieldKt.m17382h(this.f35393j, env, "disappear_actions", data, f35350V, f35377w0);
        List m17382h3 = FieldKt.m17382h(this.f35394k, env, "extensions", data, f35352X, f35378x0);
        DivFocus divFocus = (DivFocus) FieldKt.m17381g(this.f35395l, env, "focus", data, f35379y0);
        DivSize divSize = (DivSize) FieldKt.m17381g(this.f35396m, env, "height", data, f35380z0);
        if (divSize == null) {
            divSize = f35325G;
        }
        DivSize divSize2 = divSize;
        String str2 = (String) FieldKt.m17378d(this.f35397n, env, "id", data, f35316A0);
        List m17382h4 = FieldKt.m17382h(this.f35398o, env, "items", data, f35356b0, f35317B0);
        DivEdgeInsets divEdgeInsets = (DivEdgeInsets) FieldKt.m17381g(this.f35399p, env, "margins", data, f35318C0);
        if (divEdgeInsets == null) {
            divEdgeInsets = f35327H;
        }
        DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
        DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) FieldKt.m17381g(this.f35400q, env, "paddings", data, f35320D0);
        if (divEdgeInsets3 == null) {
            divEdgeInsets3 = f35329I;
        }
        DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
        Expression expression6 = (Expression) FieldKt.m17378d(this.f35401r, env, "row_span", data, f35322E0);
        List m17382h5 = FieldKt.m17382h(this.f35402s, env, "selected_actions", data, f35360f0, f35324F0);
        List m17382h6 = FieldKt.m17382h(this.f35403t, env, "tooltips", data, f35362h0, f35326G0);
        DivTransform divTransform = (DivTransform) FieldKt.m17381g(this.f35404u, env, "transform", data, f35328H0);
        if (divTransform == null) {
            divTransform = f35331J;
        }
        DivTransform divTransform2 = divTransform;
        DivChangeTransition divChangeTransition = (DivChangeTransition) FieldKt.m17381g(this.f35405v, env, "transition_change", data, f35330I0);
        DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) FieldKt.m17381g(this.f35406w, env, "transition_in", data, f35332J0);
        DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) FieldKt.m17381g(this.f35407x, env, "transition_out", data, f35334K0);
        List m17380f = FieldKt.m17380f(this.f35408y, env, "transition_triggers", data, f35364j0, f35336L0);
        Expression<DivVisibility> expression7 = (Expression) FieldKt.m17378d(this.f35409z, env, "visibility", data, f35338M0);
        if (expression7 == null) {
            expression7 = f35333K;
        }
        Expression<DivVisibility> expression8 = expression7;
        DivVisibilityAction divVisibilityAction = (DivVisibilityAction) FieldKt.m17381g(this.f35381A, env, "visibility_action", data, f35340N0);
        List m17382h7 = FieldKt.m17382h(this.f35382B, env, "visibility_actions", data, f35366l0, f35342O0);
        DivSize divSize3 = (DivSize) FieldKt.m17381g(this.f35383C, env, "width", data, f35344P0);
        if (divSize3 == null) {
            divSize3 = f35335L;
        }
        return new DivCustom(divAccessibility2, expression, expression2, expression4, m17382h, divBorder2, expression5, jSONObject, str, m17382h2, m17382h3, divFocus, divSize2, str2, m17382h4, divEdgeInsets2, divEdgeInsets4, expression6, m17382h5, m17382h6, divTransform2, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17380f, expression8, divVisibilityAction, m17382h7, divSize3);
    }
}
