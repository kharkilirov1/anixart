package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.Div;
import com.yandex.div2.DivAccessibility;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivAspect;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivChangeTransition;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivContentAlignmentHorizontal;
import com.yandex.div2.DivContentAlignmentVertical;
import com.yandex.div2.DivDisappearAction;
import com.yandex.div2.DivDrawable;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivExtension;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivTooltip;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.mobile.ads.C4632R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivContainer.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivContainer;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div2/DivBase;", "Companion", "LayoutMode", "Orientation", "Separator", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivContainer implements JSONSerializable, DivBase {

    /* renamed from: N */
    @NotNull
    public static final Companion f34884N = new Companion(null);

    /* renamed from: O */
    @NotNull
    public static final DivAccessibility f34885O;

    /* renamed from: P */
    @NotNull
    public static final DivAnimation f34886P;

    /* renamed from: Q */
    @NotNull
    public static final Expression<Double> f34887Q;

    /* renamed from: R */
    @NotNull
    public static final DivBorder f34888R;

    /* renamed from: S */
    @NotNull
    public static final Expression<DivContentAlignmentHorizontal> f34889S;

    /* renamed from: T */
    @NotNull
    public static final Expression<DivContentAlignmentVertical> f34890T;

    /* renamed from: U */
    @NotNull
    public static final DivSize.WrapContent f34891U;

    /* renamed from: V */
    @NotNull
    public static final Expression<LayoutMode> f34892V;

    /* renamed from: W */
    @NotNull
    public static final DivEdgeInsets f34893W;

    /* renamed from: X */
    @NotNull
    public static final Expression<Orientation> f34894X;

    /* renamed from: Y */
    @NotNull
    public static final DivEdgeInsets f34895Y;

    /* renamed from: Z */
    @NotNull
    public static final DivTransform f34896Z;

    /* renamed from: a0 */
    @NotNull
    public static final Expression<DivVisibility> f34897a0;

    /* renamed from: b0 */
    @NotNull
    public static final DivSize.MatchParent f34898b0;

    /* renamed from: c0 */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f34899c0;

    /* renamed from: d0 */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f34900d0;

    /* renamed from: e0 */
    @NotNull
    public static final TypeHelper<DivContentAlignmentHorizontal> f34901e0;

    /* renamed from: f0 */
    @NotNull
    public static final TypeHelper<DivContentAlignmentVertical> f34902f0;

    /* renamed from: g0 */
    @NotNull
    public static final TypeHelper<LayoutMode> f34903g0;

    /* renamed from: h0 */
    @NotNull
    public static final TypeHelper<Orientation> f34904h0;

    /* renamed from: i0 */
    @NotNull
    public static final TypeHelper<DivVisibility> f34905i0;

    /* renamed from: j0 */
    @NotNull
    public static final ListValidator<DivAction> f34906j0;

    /* renamed from: k0 */
    @NotNull
    public static final ValueValidator<Double> f34907k0;

    /* renamed from: l0 */
    @NotNull
    public static final ListValidator<DivBackground> f34908l0;

    /* renamed from: m0 */
    @NotNull
    public static final ValueValidator<Long> f34909m0;

    /* renamed from: n0 */
    @NotNull
    public static final ListValidator<DivDisappearAction> f34910n0;

    /* renamed from: o0 */
    @NotNull
    public static final ListValidator<DivAction> f34911o0;

    /* renamed from: p0 */
    @NotNull
    public static final ListValidator<DivExtension> f34912p0;

    /* renamed from: q0 */
    @NotNull
    public static final ValueValidator<String> f34913q0;

    /* renamed from: r0 */
    @NotNull
    public static final ListValidator<Div> f34914r0;

    /* renamed from: s0 */
    @NotNull
    public static final ListValidator<DivAction> f34915s0;

    /* renamed from: t0 */
    @NotNull
    public static final ValueValidator<Long> f34916t0;

    /* renamed from: u0 */
    @NotNull
    public static final ListValidator<DivAction> f34917u0;

    /* renamed from: v0 */
    @NotNull
    public static final ListValidator<DivTooltip> f34918v0;

    /* renamed from: w0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f34919w0;

    /* renamed from: x0 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f34920x0;

    /* renamed from: A */
    @Nullable
    public final Expression<Long> f34921A;

    /* renamed from: B */
    @Nullable
    public final List<DivAction> f34922B;

    /* renamed from: C */
    @JvmField
    @Nullable
    public final Separator f34923C;

    /* renamed from: D */
    @Nullable
    public final List<DivTooltip> f34924D;

    /* renamed from: E */
    @NotNull
    public final DivTransform f34925E;

    /* renamed from: F */
    @Nullable
    public final DivChangeTransition f34926F;

    /* renamed from: G */
    @Nullable
    public final DivAppearanceTransition f34927G;

    /* renamed from: H */
    @Nullable
    public final DivAppearanceTransition f34928H;

    /* renamed from: I */
    @Nullable
    public final List<DivTransitionTrigger> f34929I;

    /* renamed from: J */
    @NotNull
    public final Expression<DivVisibility> f34930J;

    /* renamed from: K */
    @Nullable
    public final DivVisibilityAction f34931K;

    /* renamed from: L */
    @Nullable
    public final List<DivVisibilityAction> f34932L;

    /* renamed from: M */
    @NotNull
    public final DivSize f34933M;

    /* renamed from: a */
    @NotNull
    public final DivAccessibility f34934a;

    /* renamed from: b */
    @JvmField
    @Nullable
    public final DivAction f34935b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final DivAnimation f34936c;

    /* renamed from: d */
    @JvmField
    @Nullable
    public final List<DivAction> f34937d;

    /* renamed from: e */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f34938e;

    /* renamed from: f */
    @Nullable
    public final Expression<DivAlignmentVertical> f34939f;

    /* renamed from: g */
    @NotNull
    public final Expression<Double> f34940g;

    /* renamed from: h */
    @JvmField
    @Nullable
    public final DivAspect f34941h;

    /* renamed from: i */
    @Nullable
    public final List<DivBackground> f34942i;

    /* renamed from: j */
    @NotNull
    public final DivBorder f34943j;

    /* renamed from: k */
    @Nullable
    public final Expression<Long> f34944k;

    /* renamed from: l */
    @JvmField
    @NotNull
    public final Expression<DivContentAlignmentHorizontal> f34945l;

    /* renamed from: m */
    @JvmField
    @NotNull
    public final Expression<DivContentAlignmentVertical> f34946m;

    /* renamed from: n */
    @Nullable
    public final List<DivDisappearAction> f34947n;

    /* renamed from: o */
    @JvmField
    @Nullable
    public final List<DivAction> f34948o;

    /* renamed from: p */
    @Nullable
    public final List<DivExtension> f34949p;

    /* renamed from: q */
    @Nullable
    public final DivFocus f34950q;

    /* renamed from: r */
    @NotNull
    public final DivSize f34951r;

    /* renamed from: s */
    @Nullable
    public final String f34952s;

    /* renamed from: t */
    @JvmField
    @NotNull
    public final List<Div> f34953t;

    /* renamed from: u */
    @JvmField
    @NotNull
    public final Expression<LayoutMode> f34954u;

    /* renamed from: v */
    @JvmField
    @Nullable
    public final Separator f34955v;

    /* renamed from: w */
    @JvmField
    @Nullable
    public final List<DivAction> f34956w;

    /* renamed from: x */
    @NotNull
    public final DivEdgeInsets f34957x;

    /* renamed from: y */
    @JvmField
    @NotNull
    public final Expression<Orientation> f34958y;

    /* renamed from: z */
    @NotNull
    public final DivEdgeInsets f34959z;

    /* compiled from: DivContainer.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\bR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u000fR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u000fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\bR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\bR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\bR\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0012R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0012R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\bR\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u000fR\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\bR\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00104\u001a\b\u0012\u0004\u0012\u0002030\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u000fR\u0014\u00105\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00102R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0012R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\u0012R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\bR\u001a\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\bR\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\bR\u0014\u0010@\u001a\u00020(8\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020C0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020F0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010ER\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001c0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010ER\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001e0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010ER\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020-0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010ER\u001a\u0010K\u001a\b\u0012\u0004\u0012\u0002030B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010ER\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020L0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010ER\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010\bR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020L0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010\u000fR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006T"}, m31884d2 = {"Lcom/yandex/div2/DivContainer$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAction;", "ACTIONS_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAnimation;", "ACTION_ANIMATION_DEFAULT_VALUE", "Lcom/yandex/div2/DivAnimation;", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivContentAlignmentHorizontal;", "CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE", "Lcom/yandex/div2/DivContentAlignmentVertical;", "CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "DOUBLETAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div2/Div;", "ITEMS_VALIDATOR", "Lcom/yandex/div2/DivContainer$LayoutMode;", "LAYOUT_MODE_DEFAULT_VALUE", "LONGTAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "Lcom/yandex/div2/DivContainer$Orientation;", "ORIENTATION_DEFAULT_VALUE", "PADDINGS_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL", "TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL", "TYPE_HELPER_LAYOUT_MODE", "TYPE_HELPER_ORIENTATION", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivContainer m17600a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            DivAccessibility.Companion companion = DivAccessibility.f34479f;
            DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject, "accessibility", DivAccessibility.f34486m, f34328a, parsingEnvironment);
            if (divAccessibility == null) {
                divAccessibility = DivContainer.f34885O;
            }
            DivAccessibility divAccessibility2 = divAccessibility;
            Intrinsics.m32178g(divAccessibility2, "JsonParser.readOptional(…CESSIBILITY_DEFAULT_VALUE");
            DivAction.Companion companion2 = DivAction.f34546g;
            Function2<ParsingEnvironment, JSONObject, DivAction> function2 = DivAction.f34550k;
            DivAction divAction = (DivAction) JsonParser.m17322n(jSONObject, "action", function2, f34328a, parsingEnvironment);
            DivAnimation.Companion companion3 = DivAnimation.f34634h;
            DivAnimation divAnimation = (DivAnimation) JsonParser.m17322n(jSONObject, "action_animation", DivAnimation.f34644r, f34328a, parsingEnvironment);
            if (divAnimation == null) {
                divAnimation = DivContainer.f34886P;
            }
            DivAnimation divAnimation2 = divAnimation;
            Intrinsics.m32178g(divAnimation2, "JsonParser.readOptional(…N_ANIMATION_DEFAULT_VALUE");
            List m17333y = JsonParser.m17333y(jSONObject, "actions", function2, DivContainer.f34906j0, f34328a, parsingEnvironment);
            DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
            Expression m17329u = JsonParser.m17329u(jSONObject, "alignment_horizontal", DivAlignmentHorizontal.f34618d, f34328a, parsingEnvironment, DivContainer.f34899c0);
            DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
            Expression m17329u2 = JsonParser.m17329u(jSONObject, "alignment_vertical", DivAlignmentVertical.f34626d, f34328a, parsingEnvironment, DivContainer.f34900d0);
            Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
            ValueValidator<Double> valueValidator = DivContainer.f34907k0;
            Expression<Double> expression = DivContainer.f34887Q;
            Expression<Double> m17328t = JsonParser.m17328t(jSONObject, "alpha", function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
            if (m17328t != null) {
                expression = m17328t;
            }
            DivAspect.Companion companion4 = DivAspect.f34740b;
            DivAspect divAspect = (DivAspect) JsonParser.m17322n(jSONObject, "aspect", DivAspect.f34741c, f34328a, parsingEnvironment);
            DivBackground.Companion companion5 = DivBackground.f34750a;
            List m17333y2 = JsonParser.m17333y(jSONObject, "background", DivBackground.f34751b, DivContainer.f34908l0, f34328a, parsingEnvironment);
            DivBorder.Companion companion6 = DivBorder.f34785f;
            DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject, "border", DivBorder.f34788i, f34328a, parsingEnvironment);
            if (divBorder == null) {
                divBorder = DivContainer.f34888R;
            }
            DivBorder divBorder2 = divBorder;
            Intrinsics.m32178g(divBorder2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            Function1<Number, Long> function12 = ParsingConvertersKt.f33831e;
            ValueValidator<Long> valueValidator2 = DivContainer.f34909m0;
            TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
            Expression m17327s = JsonParser.m17327s(jSONObject, "column_span", function12, valueValidator2, f34328a, parsingEnvironment, typeHelper);
            DivContentAlignmentHorizontal.Converter converter3 = DivContentAlignmentHorizontal.f35193c;
            Function1<String, DivContentAlignmentHorizontal> function13 = DivContentAlignmentHorizontal.f35194d;
            Expression<DivContentAlignmentHorizontal> expression2 = DivContainer.f34889S;
            Expression<DivContentAlignmentHorizontal> m17330v = JsonParser.m17330v(jSONObject, "content_alignment_horizontal", function13, f34328a, parsingEnvironment, expression2, DivContainer.f34901e0);
            if (m17330v != null) {
                expression2 = m17330v;
            }
            DivContentAlignmentVertical.Converter converter4 = DivContentAlignmentVertical.f35204c;
            Function1<String, DivContentAlignmentVertical> function14 = DivContentAlignmentVertical.f35205d;
            Expression<DivContentAlignmentVertical> expression3 = DivContainer.f34890T;
            Expression<DivContentAlignmentVertical> m17330v2 = JsonParser.m17330v(jSONObject, "content_alignment_vertical", function14, f34328a, parsingEnvironment, expression3, DivContainer.f34902f0);
            if (m17330v2 != null) {
                expression3 = m17330v2;
            }
            DivDisappearAction.Companion companion7 = DivDisappearAction.f35537a;
            List m17333y3 = JsonParser.m17333y(jSONObject, "disappear_actions", DivDisappearAction.f35545i, DivContainer.f34910n0, f34328a, parsingEnvironment);
            List m17333y4 = JsonParser.m17333y(jSONObject, "doubletap_actions", function2, DivContainer.f34911o0, f34328a, parsingEnvironment);
            DivExtension.Companion companion8 = DivExtension.f35659c;
            List m17333y5 = JsonParser.m17333y(jSONObject, "extensions", DivExtension.f35660d, DivContainer.f34912p0, f34328a, parsingEnvironment);
            DivFocus.Companion companion9 = DivFocus.f35813f;
            DivFocus divFocus = (DivFocus) JsonParser.m17322n(jSONObject, "focus", DivFocus.f35818k, f34328a, parsingEnvironment);
            DivSize.Companion companion10 = DivSize.f38833a;
            Function2<ParsingEnvironment, JSONObject, DivSize> function22 = DivSize.f38834b;
            DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject, "height", function22, f34328a, parsingEnvironment);
            if (divSize == null) {
                divSize = DivContainer.f34891U;
            }
            DivSize divSize2 = divSize;
            Intrinsics.m32178g(divSize2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            String str = (String) JsonParser.m17323o(jSONObject, "id", DivContainer.f34913q0, f34328a, parsingEnvironment);
            Div.Companion companion11 = Div.f34418a;
            List m17321m = JsonParser.m17321m(jSONObject, "items", Div.f34419b, DivContainer.f34914r0, f34328a, parsingEnvironment);
            Intrinsics.m32178g(m17321m, "readList(json, \"items\", …S_VALIDATOR, logger, env)");
            LayoutMode.Converter converter5 = LayoutMode.f34968c;
            Function1<String, LayoutMode> function15 = LayoutMode.f34969d;
            Expression<LayoutMode> expression4 = DivContainer.f34892V;
            Expression<LayoutMode> m17330v3 = JsonParser.m17330v(jSONObject, "layout_mode", function15, f34328a, parsingEnvironment, expression4, DivContainer.f34903g0);
            if (m17330v3 != null) {
                expression4 = m17330v3;
            }
            Separator.Companion companion12 = Separator.f34983e;
            Function2<ParsingEnvironment, JSONObject, Separator> function23 = Separator.f34988j;
            Separator separator = (Separator) JsonParser.m17322n(jSONObject, "line_separator", function23, f34328a, parsingEnvironment);
            List m17333y6 = JsonParser.m17333y(jSONObject, "longtap_actions", function2, DivContainer.f34915s0, f34328a, parsingEnvironment);
            DivEdgeInsets.Companion companion13 = DivEdgeInsets.f35607f;
            Function2<ParsingEnvironment, JSONObject, DivEdgeInsets> function24 = DivEdgeInsets.f35618q;
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "margins", function24, f34328a, parsingEnvironment);
            if (divEdgeInsets == null) {
                divEdgeInsets = DivContainer.f34893W;
            }
            DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
            Intrinsics.m32178g(divEdgeInsets2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            Orientation.Converter converter6 = Orientation.f34975c;
            Function1<String, Orientation> function16 = Orientation.f34976d;
            Expression<Orientation> expression5 = DivContainer.f34894X;
            Expression<Orientation> m17330v4 = JsonParser.m17330v(jSONObject, "orientation", function16, f34328a, parsingEnvironment, expression5, DivContainer.f34904h0);
            if (m17330v4 != null) {
                expression5 = m17330v4;
            }
            DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "paddings", function24, f34328a, parsingEnvironment);
            if (divEdgeInsets3 == null) {
                divEdgeInsets3 = DivContainer.f34895Y;
            }
            DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
            Intrinsics.m32178g(divEdgeInsets4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            Expression m17327s2 = JsonParser.m17327s(jSONObject, "row_span", function12, DivContainer.f34916t0, f34328a, parsingEnvironment, typeHelper);
            List m17333y7 = JsonParser.m17333y(jSONObject, "selected_actions", function2, DivContainer.f34917u0, f34328a, parsingEnvironment);
            Separator separator2 = (Separator) JsonParser.m17322n(jSONObject, "separator", function23, f34328a, parsingEnvironment);
            DivTooltip.Companion companion14 = DivTooltip.f40492h;
            List m17333y8 = JsonParser.m17333y(jSONObject, "tooltips", DivTooltip.f40497m, DivContainer.f34918v0, f34328a, parsingEnvironment);
            DivTransform.Companion companion15 = DivTransform.f40551d;
            DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject, "transform", DivTransform.f40554g, f34328a, parsingEnvironment);
            if (divTransform == null) {
                divTransform = DivContainer.f34896Z;
            }
            DivTransform divTransform2 = divTransform;
            Intrinsics.m32178g(divTransform2, "JsonParser.readOptional(…: TRANSFORM_DEFAULT_VALUE");
            DivChangeTransition.Companion companion16 = DivChangeTransition.f34856a;
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonParser.m17322n(jSONObject, "transition_change", DivChangeTransition.f34857b, f34328a, parsingEnvironment);
            DivAppearanceTransition.Companion companion17 = DivAppearanceTransition.f34726a;
            Function2<ParsingEnvironment, JSONObject, DivAppearanceTransition> function25 = DivAppearanceTransition.f34727b;
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonParser.m17322n(jSONObject, "transition_in", function25, f34328a, parsingEnvironment);
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonParser.m17322n(jSONObject, "transition_out", function25, f34328a, parsingEnvironment);
            DivTransitionTrigger.Converter converter7 = DivTransitionTrigger.f40582c;
            List m17332x = JsonParser.m17332x(jSONObject, "transition_triggers", DivTransitionTrigger.f40583d, DivContainer.f34919w0, f34328a, parsingEnvironment);
            DivVisibility.Converter converter8 = DivVisibility.f40930c;
            Function1<String, DivVisibility> function17 = DivVisibility.f40931d;
            Expression<DivVisibility> expression6 = DivContainer.f34897a0;
            Expression<DivVisibility> m17330v5 = JsonParser.m17330v(jSONObject, "visibility", function17, f34328a, parsingEnvironment, expression6, DivContainer.f34905i0);
            Expression<DivVisibility> expression7 = m17330v5 == null ? expression6 : m17330v5;
            DivVisibilityAction.Companion companion18 = DivVisibilityAction.f40938i;
            Function2<ParsingEnvironment, JSONObject, DivVisibilityAction> function26 = DivVisibilityAction.f40946q;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonParser.m17322n(jSONObject, "visibility_action", function26, f34328a, parsingEnvironment);
            List m17333y9 = JsonParser.m17333y(jSONObject, "visibility_actions", function26, DivContainer.f34920x0, f34328a, parsingEnvironment);
            DivSize divSize3 = (DivSize) JsonParser.m17322n(jSONObject, "width", function22, f34328a, parsingEnvironment);
            if (divSize3 == null) {
                divSize3 = DivContainer.f34898b0;
            }
            Intrinsics.m32178g(divSize3, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new DivContainer(divAccessibility2, divAction, divAnimation2, m17333y, m17329u, m17329u2, expression, divAspect, m17333y2, divBorder2, m17327s, expression2, expression3, m17333y3, m17333y4, m17333y5, divFocus, divSize2, str, m17321m, expression4, separator, m17333y6, divEdgeInsets2, expression5, divEdgeInsets4, m17327s2, m17333y7, separator2, m17333y8, divTransform2, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17332x, expression7, divVisibilityAction, m17333y9, divSize3);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivContainer.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivContainer$LayoutMode;", "", "Converter", "NO_WRAP", "WRAP", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public enum LayoutMode {
        NO_WRAP("no_wrap"),
        WRAP("wrap");


        /* renamed from: c */
        @NotNull
        public static final Converter f34968c = new Converter(null);

        /* renamed from: d */
        @NotNull
        public static final Function1<String, LayoutMode> f34969d = new Function1<String, LayoutMode>() { // from class: com.yandex.div2.DivContainer$LayoutMode$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            public DivContainer.LayoutMode invoke(String str) {
                String string = str;
                Intrinsics.m32179h(string, "string");
                DivContainer.LayoutMode layoutMode = DivContainer.LayoutMode.NO_WRAP;
                if (Intrinsics.m32174c(string, "no_wrap")) {
                    return layoutMode;
                }
                DivContainer.LayoutMode layoutMode2 = DivContainer.LayoutMode.WRAP;
                if (Intrinsics.m32174c(string, "wrap")) {
                    return layoutMode2;
                }
                return null;
            }
        };

        /* renamed from: b */
        @NotNull
        public final String f34973b;

        /* compiled from: DivContainer.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivContainer$LayoutMode$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Converter {
            public Converter() {
            }

            public Converter(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        LayoutMode(String str) {
            this.f34973b = str;
        }
    }

    /* compiled from: DivContainer.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div2/DivContainer$Orientation;", "", "Converter", "VERTICAL", "HORIZONTAL", "OVERLAP", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public enum Orientation {
        VERTICAL("vertical"),
        HORIZONTAL("horizontal"),
        OVERLAP("overlap");


        /* renamed from: c */
        @NotNull
        public static final Converter f34975c = new Converter(null);

        /* renamed from: d */
        @NotNull
        public static final Function1<String, Orientation> f34976d = new Function1<String, Orientation>() { // from class: com.yandex.div2.DivContainer$Orientation$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            public DivContainer.Orientation invoke(String str) {
                String string = str;
                Intrinsics.m32179h(string, "string");
                DivContainer.Orientation orientation = DivContainer.Orientation.VERTICAL;
                if (Intrinsics.m32174c(string, "vertical")) {
                    return orientation;
                }
                DivContainer.Orientation orientation2 = DivContainer.Orientation.HORIZONTAL;
                if (Intrinsics.m32174c(string, "horizontal")) {
                    return orientation2;
                }
                DivContainer.Orientation orientation3 = DivContainer.Orientation.OVERLAP;
                if (Intrinsics.m32174c(string, "overlap")) {
                    return orientation3;
                }
                return null;
            }
        };

        /* renamed from: b */
        @NotNull
        public final String f34981b;

        /* compiled from: DivContainer.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivContainer$Orientation$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Converter {
            public Converter() {
            }

            public Converter(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        Orientation(String str) {
            this.f34981b = str;
        }
    }

    /* compiled from: DivContainer.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivContainer$Separator;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Separator implements JSONSerializable {

        /* renamed from: e */
        @NotNull
        public static final Companion f34983e = new Companion(null);

        /* renamed from: f */
        @NotNull
        public static final DivEdgeInsets f34984f = new DivEdgeInsets(null, null, null, null, null, 31);

        /* renamed from: g */
        @NotNull
        public static final Expression<Boolean> f34985g;

        /* renamed from: h */
        @NotNull
        public static final Expression<Boolean> f34986h;

        /* renamed from: i */
        @NotNull
        public static final Expression<Boolean> f34987i;

        /* renamed from: j */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, Separator> f34988j;

        /* renamed from: a */
        @JvmField
        @NotNull
        public final Expression<Boolean> f34989a;

        /* renamed from: b */
        @JvmField
        @NotNull
        public final Expression<Boolean> f34990b;

        /* renamed from: c */
        @JvmField
        @NotNull
        public final Expression<Boolean> f34991c;

        /* renamed from: d */
        @JvmField
        @NotNull
        public final DivDrawable f34992d;

        /* compiled from: DivContainer.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\u000b"}, m31884d2 = {"Lcom/yandex/div2/DivContainer$Separator$Companion;", "", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "Lcom/yandex/div/json/expressions/Expression;", "", "SHOW_AT_END_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "SHOW_AT_START_DEFAULT_VALUE", "SHOW_BETWEEN_DEFAULT_VALUE", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        static {
            Expression.Companion companion = Expression.f34334a;
            Boolean bool = Boolean.FALSE;
            f34985g = companion.m17539a(bool);
            f34986h = companion.m17539a(bool);
            f34987i = companion.m17539a(Boolean.TRUE);
            f34988j = new Function2<ParsingEnvironment, JSONObject, Separator>() { // from class: com.yandex.div2.DivContainer$Separator$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                public DivContainer.Separator invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    ParsingEnvironment env = parsingEnvironment;
                    JSONObject it = jSONObject;
                    Intrinsics.m32179h(env, "env");
                    Intrinsics.m32179h(it, "it");
                    DivContainer.Separator.Companion companion2 = DivContainer.Separator.f34983e;
                    ParsingErrorLogger f34328a = env.getF34328a();
                    DivEdgeInsets.Companion companion3 = DivEdgeInsets.f35607f;
                    DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(it, "margins", DivEdgeInsets.f35618q, f34328a, env);
                    if (divEdgeInsets == null) {
                        divEdgeInsets = DivContainer.Separator.f34984f;
                    }
                    DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
                    Intrinsics.m32178g(divEdgeInsets2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
                    Function1<Object, Boolean> function1 = ParsingConvertersKt.f33829c;
                    Expression<Boolean> expression = DivContainer.Separator.f34985g;
                    TypeHelper<Boolean> typeHelper = TypeHelpersKt.f33848a;
                    Expression<Boolean> m17330v = JsonParser.m17330v(it, "show_at_end", function1, f34328a, env, expression, typeHelper);
                    if (m17330v != null) {
                        expression = m17330v;
                    }
                    Expression<Boolean> expression2 = DivContainer.Separator.f34986h;
                    Expression<Boolean> m17330v2 = JsonParser.m17330v(it, "show_at_start", function1, f34328a, env, expression2, typeHelper);
                    if (m17330v2 != null) {
                        expression2 = m17330v2;
                    }
                    Expression<Boolean> expression3 = DivContainer.Separator.f34987i;
                    Expression<Boolean> m17330v3 = JsonParser.m17330v(it, "show_between", function1, f34328a, env, expression3, typeHelper);
                    Expression<Boolean> expression4 = m17330v3 == null ? expression3 : m17330v3;
                    DivDrawable.Companion companion4 = DivDrawable.f35599a;
                    return new DivContainer.Separator(divEdgeInsets2, expression, expression2, expression4, (DivDrawable) JsonParser.m17313e(it, "style", DivDrawable.f35600b, C2904b.f33858e, env));
                }
            };
        }

        @DivModelInternalApi
        public Separator(@NotNull DivEdgeInsets margins, @NotNull Expression<Boolean> showAtEnd, @NotNull Expression<Boolean> showAtStart, @NotNull Expression<Boolean> showBetween, @NotNull DivDrawable style) {
            Intrinsics.m32179h(margins, "margins");
            Intrinsics.m32179h(showAtEnd, "showAtEnd");
            Intrinsics.m32179h(showAtStart, "showAtStart");
            Intrinsics.m32179h(showBetween, "showBetween");
            Intrinsics.m32179h(style, "style");
            this.f34989a = showAtEnd;
            this.f34990b = showAtStart;
            this.f34991c = showBetween;
            this.f34992d = style;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression expression = null;
        f34885O = new DivAccessibility(null, null, null, expression, null, null, 63);
        Expression.Companion companion = Expression.f34334a;
        Expression m17539a = companion.m17539a(100L);
        Expression m17539a2 = companion.m17539a(Double.valueOf(0.6d));
        Expression m17539a3 = companion.m17539a(DivAnimation.Name.FADE);
        Double valueOf = Double.valueOf(1.0d);
        f34886P = new DivAnimation(m17539a, m17539a2, null, null, m17539a3, null, null, companion.m17539a(valueOf), C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
        f34887Q = companion.m17539a(valueOf);
        f34888R = new DivBorder(null, null == true ? 1 : 0, expression, null == true ? 1 : 0, null == true ? 1 : 0, 31);
        f34889S = companion.m17539a(DivContentAlignmentHorizontal.LEFT);
        f34890T = companion.m17539a(DivContentAlignmentVertical.TOP);
        int i2 = 7;
        f34891U = new DivSize.WrapContent(new DivWrapContentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, i2));
        f34892V = companion.m17539a(LayoutMode.NO_WRAP);
        Expression expression2 = null;
        Expression expression3 = null;
        int i3 = 31;
        f34893W = new DivEdgeInsets(expression, null == true ? 1 : 0, null == true ? 1 : 0, expression2, expression3, i3);
        f34894X = companion.m17539a(Orientation.VERTICAL);
        f34895Y = new DivEdgeInsets(expression, null == true ? 1 : 0, null == true ? 1 : 0, expression2, expression3, i3);
        f34896Z = new DivTransform(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, i2);
        f34897a0 = companion.m17539a(DivVisibility.VISIBLE);
        f34898b0 = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i4 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f34899c0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivContainer$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f34900d0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivContainer$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f34901e0 = companion2.m17372a(ArraysKt.m31926B(DivContentAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivContainer$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivContentAlignmentHorizontal);
            }
        });
        f34902f0 = companion2.m17372a(ArraysKt.m31926B(DivContentAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivContainer$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivContentAlignmentVertical);
            }
        });
        f34903g0 = companion2.m17372a(ArraysKt.m31926B(LayoutMode.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivContainer$Companion$TYPE_HELPER_LAYOUT_MODE$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivContainer.LayoutMode);
            }
        });
        f34904h0 = companion2.m17372a(ArraysKt.m31926B(Orientation.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivContainer$Companion$TYPE_HELPER_ORIENTATION$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivContainer.Orientation);
            }
        });
        f34905i0 = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivContainer$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f34906j0 = C3037c.f41172q;
        f34907k0 = C3039d.f41229r;
        f34908l0 = C3037c.f41179x;
        f34909m0 = C3039d.f41230s;
        f34910n0 = C3037c.f41180y;
        f34911o0 = C3037c.f41181z;
        f34912p0 = C3037c.f41152A;
        f34913q0 = C3039d.f41227p;
        f34914r0 = C3037c.f41173r;
        f34915s0 = C3037c.f41174s;
        f34916t0 = C3039d.f41228q;
        f34917u0 = C3037c.f41175t;
        f34918v0 = C3037c.f41176u;
        f34919w0 = C3037c.f41177v;
        f34920x0 = C3037c.f41178w;
        DivContainer$Companion$CREATOR$1 divContainer$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivContainer>() { // from class: com.yandex.div2.DivContainer$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivContainer invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivContainer.f34884N.m17600a(env, it);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @DivModelInternalApi
    public DivContainer(@NotNull DivAccessibility accessibility, @Nullable DivAction divAction, @NotNull DivAnimation actionAnimation, @Nullable List<? extends DivAction> list, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> alpha, @Nullable DivAspect divAspect, @Nullable List<? extends DivBackground> list2, @NotNull DivBorder border, @Nullable Expression<Long> expression3, @NotNull Expression<DivContentAlignmentHorizontal> contentAlignmentHorizontal, @NotNull Expression<DivContentAlignmentVertical> contentAlignmentVertical, @Nullable List<? extends DivDisappearAction> list3, @Nullable List<? extends DivAction> list4, @Nullable List<? extends DivExtension> list5, @Nullable DivFocus divFocus, @NotNull DivSize height, @Nullable String str, @NotNull List<? extends Div> items, @NotNull Expression<LayoutMode> layoutMode, @Nullable Separator separator, @Nullable List<? extends DivAction> list6, @NotNull DivEdgeInsets margins, @NotNull Expression<Orientation> orientation, @NotNull DivEdgeInsets paddings, @Nullable Expression<Long> expression4, @Nullable List<? extends DivAction> list7, @Nullable Separator separator2, @Nullable List<? extends DivTooltip> list8, @NotNull DivTransform transform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list9, @NotNull Expression<DivVisibility> visibility, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<? extends DivVisibilityAction> list10, @NotNull DivSize width) {
        Intrinsics.m32179h(accessibility, "accessibility");
        Intrinsics.m32179h(actionAnimation, "actionAnimation");
        Intrinsics.m32179h(alpha, "alpha");
        Intrinsics.m32179h(border, "border");
        Intrinsics.m32179h(contentAlignmentHorizontal, "contentAlignmentHorizontal");
        Intrinsics.m32179h(contentAlignmentVertical, "contentAlignmentVertical");
        Intrinsics.m32179h(height, "height");
        Intrinsics.m32179h(items, "items");
        Intrinsics.m32179h(layoutMode, "layoutMode");
        Intrinsics.m32179h(margins, "margins");
        Intrinsics.m32179h(orientation, "orientation");
        Intrinsics.m32179h(paddings, "paddings");
        Intrinsics.m32179h(transform, "transform");
        Intrinsics.m32179h(visibility, "visibility");
        Intrinsics.m32179h(width, "width");
        this.f34934a = accessibility;
        this.f34935b = divAction;
        this.f34936c = actionAnimation;
        this.f34937d = list;
        this.f34938e = expression;
        this.f34939f = expression2;
        this.f34940g = alpha;
        this.f34941h = divAspect;
        this.f34942i = list2;
        this.f34943j = border;
        this.f34944k = expression3;
        this.f34945l = contentAlignmentHorizontal;
        this.f34946m = contentAlignmentVertical;
        this.f34947n = list3;
        this.f34948o = list4;
        this.f34949p = list5;
        this.f34950q = divFocus;
        this.f34951r = height;
        this.f34952s = str;
        this.f34953t = items;
        this.f34954u = layoutMode;
        this.f34955v = separator;
        this.f34956w = list6;
        this.f34957x = margins;
        this.f34958y = orientation;
        this.f34959z = paddings;
        this.f34921A = expression4;
        this.f34922B = list7;
        this.f34923C = separator2;
        this.f34924D = list8;
        this.f34925E = transform;
        this.f34926F = divChangeTransition;
        this.f34927G = divAppearanceTransition;
        this.f34928H = divAppearanceTransition2;
        this.f34929I = list9;
        this.f34930J = visibility;
        this.f34931K = divVisibilityAction;
        this.f34932L = list10;
        this.f34933M = width;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: a, reason: from getter */
    public DivSize getF39520m() {
        return this.f34951r;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: b, reason: from getter */
    public DivTransform getF39499B() {
        return this.f34925E;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: c */
    public List<DivVisibilityAction> mo17569c() {
        return this.f34932L;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: d */
    public List<DivBackground> mo17570d() {
        return this.f34942i;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: e, reason: from getter */
    public DivAccessibility getF39508a() {
        return this.f34934a;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: f */
    public Expression<Long> mo17572f() {
        return this.f34944k;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: g, reason: from getter */
    public DivSize getF39507J() {
        return this.f34933M;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: getBorder, reason: from getter */
    public DivBorder getF39513f() {
        return this.f34943j;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: getId, reason: from getter */
    public String getF39521n() {
        return this.f34952s;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    public Expression<DivVisibility> getVisibility() {
        return this.f34930J;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: h, reason: from getter */
    public DivEdgeInsets getF39523p() {
        return this.f34957x;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: i */
    public Expression<Long> mo17575i() {
        return this.f34921A;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: j, reason: from getter */
    public DivEdgeInsets getF39524q() {
        return this.f34959z;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: k */
    public List<DivTransitionTrigger> mo17577k() {
        return this.f34929I;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: l */
    public List<DivAction> mo17578l() {
        return this.f34922B;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: m */
    public Expression<DivAlignmentHorizontal> mo17579m() {
        return this.f34938e;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: n */
    public List<DivExtension> mo17580n() {
        return this.f34949p;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: o */
    public List<DivTooltip> mo17581o() {
        return this.f34924D;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: p, reason: from getter */
    public DivVisibilityAction getF39505H() {
        return this.f34931K;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: q */
    public Expression<DivAlignmentVertical> mo17583q() {
        return this.f34939f;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: r, reason: from getter */
    public DivAppearanceTransition getF39501D() {
        return this.f34927G;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: s */
    public Expression<Double> mo17585s() {
        return this.f34940g;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: t, reason: from getter */
    public DivFocus getF39518k() {
        return this.f34950q;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: u, reason: from getter */
    public DivAppearanceTransition getF39502E() {
        return this.f34928H;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: v, reason: from getter */
    public DivChangeTransition getF39500C() {
        return this.f34926F;
    }
}
