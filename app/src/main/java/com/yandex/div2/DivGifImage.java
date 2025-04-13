package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.data.DivModelInternalApi;
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
import com.yandex.div2.DivDisappearAction;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivExtension;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivImageScale;
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

/* compiled from: DivGifImage.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div2/DivGifImage;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div2/DivBase;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivGifImage implements JSONSerializable, DivBase {

    /* renamed from: N */
    @NotNull
    public static final Companion f36160N = new Companion(null);

    /* renamed from: O */
    @NotNull
    public static final DivAccessibility f36161O;

    /* renamed from: P */
    @NotNull
    public static final DivAnimation f36162P;

    /* renamed from: Q */
    @NotNull
    public static final Expression<Double> f36163Q;

    /* renamed from: R */
    @NotNull
    public static final DivBorder f36164R;

    /* renamed from: S */
    @NotNull
    public static final Expression<DivAlignmentHorizontal> f36165S;

    /* renamed from: T */
    @NotNull
    public static final Expression<DivAlignmentVertical> f36166T;

    /* renamed from: U */
    @NotNull
    public static final DivSize.WrapContent f36167U;

    /* renamed from: V */
    @NotNull
    public static final DivEdgeInsets f36168V;

    /* renamed from: W */
    @NotNull
    public static final DivEdgeInsets f36169W;

    /* renamed from: X */
    @NotNull
    public static final Expression<Integer> f36170X;

    /* renamed from: Y */
    @NotNull
    public static final Expression<Boolean> f36171Y;

    /* renamed from: Z */
    @NotNull
    public static final Expression<DivImageScale> f36172Z;

    /* renamed from: a0 */
    @NotNull
    public static final DivTransform f36173a0;

    /* renamed from: b0 */
    @NotNull
    public static final Expression<DivVisibility> f36174b0;

    /* renamed from: c0 */
    @NotNull
    public static final DivSize.MatchParent f36175c0;

    /* renamed from: d0 */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f36176d0;

    /* renamed from: e0 */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f36177e0;

    /* renamed from: f0 */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f36178f0;

    /* renamed from: g0 */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f36179g0;

    /* renamed from: h0 */
    @NotNull
    public static final TypeHelper<DivImageScale> f36180h0;

    /* renamed from: i0 */
    @NotNull
    public static final TypeHelper<DivVisibility> f36181i0;

    /* renamed from: j0 */
    @NotNull
    public static final ListValidator<DivAction> f36182j0;

    /* renamed from: k0 */
    @NotNull
    public static final ValueValidator<Double> f36183k0;

    /* renamed from: l0 */
    @NotNull
    public static final ListValidator<DivBackground> f36184l0;

    /* renamed from: m0 */
    @NotNull
    public static final ValueValidator<Long> f36185m0;

    /* renamed from: n0 */
    @NotNull
    public static final ListValidator<DivDisappearAction> f36186n0;

    /* renamed from: o0 */
    @NotNull
    public static final ListValidator<DivAction> f36187o0;

    /* renamed from: p0 */
    @NotNull
    public static final ListValidator<DivExtension> f36188p0;

    /* renamed from: q0 */
    @NotNull
    public static final ValueValidator<String> f36189q0;

    /* renamed from: r0 */
    @NotNull
    public static final ListValidator<DivAction> f36190r0;

    /* renamed from: s0 */
    @NotNull
    public static final ValueValidator<String> f36191s0;

    /* renamed from: t0 */
    @NotNull
    public static final ValueValidator<Long> f36192t0;

    /* renamed from: u0 */
    @NotNull
    public static final ListValidator<DivAction> f36193u0;

    /* renamed from: v0 */
    @NotNull
    public static final ListValidator<DivTooltip> f36194v0;

    /* renamed from: w0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f36195w0;

    /* renamed from: x0 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f36196x0;

    /* renamed from: A */
    @Nullable
    public final Expression<Long> f36197A;

    /* renamed from: B */
    @JvmField
    @NotNull
    public final Expression<DivImageScale> f36198B;

    /* renamed from: C */
    @Nullable
    public final List<DivAction> f36199C;

    /* renamed from: D */
    @Nullable
    public final List<DivTooltip> f36200D;

    /* renamed from: E */
    @NotNull
    public final DivTransform f36201E;

    /* renamed from: F */
    @Nullable
    public final DivChangeTransition f36202F;

    /* renamed from: G */
    @Nullable
    public final DivAppearanceTransition f36203G;

    /* renamed from: H */
    @Nullable
    public final DivAppearanceTransition f36204H;

    /* renamed from: I */
    @Nullable
    public final List<DivTransitionTrigger> f36205I;

    /* renamed from: J */
    @NotNull
    public final Expression<DivVisibility> f36206J;

    /* renamed from: K */
    @Nullable
    public final DivVisibilityAction f36207K;

    /* renamed from: L */
    @Nullable
    public final List<DivVisibilityAction> f36208L;

    /* renamed from: M */
    @NotNull
    public final DivSize f36209M;

    /* renamed from: a */
    @NotNull
    public final DivAccessibility f36210a;

    /* renamed from: b */
    @JvmField
    @Nullable
    public final DivAction f36211b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final DivAnimation f36212c;

    /* renamed from: d */
    @JvmField
    @Nullable
    public final List<DivAction> f36213d;

    /* renamed from: e */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f36214e;

    /* renamed from: f */
    @Nullable
    public final Expression<DivAlignmentVertical> f36215f;

    /* renamed from: g */
    @NotNull
    public final Expression<Double> f36216g;

    /* renamed from: h */
    @JvmField
    @Nullable
    public final DivAspect f36217h;

    /* renamed from: i */
    @Nullable
    public final List<DivBackground> f36218i;

    /* renamed from: j */
    @NotNull
    public final DivBorder f36219j;

    /* renamed from: k */
    @Nullable
    public final Expression<Long> f36220k;

    /* renamed from: l */
    @JvmField
    @NotNull
    public final Expression<DivAlignmentHorizontal> f36221l;

    /* renamed from: m */
    @JvmField
    @NotNull
    public final Expression<DivAlignmentVertical> f36222m;

    /* renamed from: n */
    @Nullable
    public final List<DivDisappearAction> f36223n;

    /* renamed from: o */
    @JvmField
    @Nullable
    public final List<DivAction> f36224o;

    /* renamed from: p */
    @Nullable
    public final List<DivExtension> f36225p;

    /* renamed from: q */
    @Nullable
    public final DivFocus f36226q;

    /* renamed from: r */
    @JvmField
    @NotNull
    public final Expression<Uri> f36227r;

    /* renamed from: s */
    @NotNull
    public final DivSize f36228s;

    /* renamed from: t */
    @Nullable
    public final String f36229t;

    /* renamed from: u */
    @JvmField
    @Nullable
    public final List<DivAction> f36230u;

    /* renamed from: v */
    @NotNull
    public final DivEdgeInsets f36231v;

    /* renamed from: w */
    @NotNull
    public final DivEdgeInsets f36232w;

    /* renamed from: x */
    @JvmField
    @NotNull
    public final Expression<Integer> f36233x;

    /* renamed from: y */
    @JvmField
    @NotNull
    public final Expression<Boolean> f36234y;

    /* renamed from: z */
    @JvmField
    @Nullable
    public final Expression<String> f36235z;

    /* compiled from: DivGifImage.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\bR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u000fR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u000fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\bR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\bR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\bR\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0012R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0012R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\bR\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u000fR\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u000fR\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020(0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0012R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020(0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0012R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0012R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\u0012R\u001a\u00109\u001a\b\u0012\u0004\u0012\u0002080\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\u000fR\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\bR\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\bR\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010\bR\u0014\u0010B\u001a\u00020(8\u0006X\u0086T¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001c0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001e0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010FR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001c0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010FR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001e0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010FR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u0002080D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010FR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020K0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010FR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010\bR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020K0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010\u000fR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006S"}, m31884d2 = {"Lcom/yandex/div2/DivGifImage$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAction;", "ACTIONS_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAnimation;", "ACTION_ANIMATION_DEFAULT_VALUE", "Lcom/yandex/div2/DivAnimation;", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivAlignmentHorizontal;", "CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE", "Lcom/yandex/div2/DivAlignmentVertical;", "CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "DOUBLETAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "LONGTAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "PADDINGS_DEFAULT_VALUE", "", "PLACEHOLDER_COLOR_DEFAULT_VALUE", "", "PRELOAD_REQUIRED_DEFAULT_VALUE", "PREVIEW_TEMPLATE_VALIDATOR", "PREVIEW_VALIDATOR", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "Lcom/yandex/div2/DivImageScale;", "SCALE_DEFAULT_VALUE", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL", "TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL", "TYPE_HELPER_SCALE", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivGifImage m17626a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            DivAccessibility.Companion companion = DivAccessibility.f34479f;
            DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject, "accessibility", DivAccessibility.f34486m, f34328a, parsingEnvironment);
            if (divAccessibility == null) {
                divAccessibility = DivGifImage.f36161O;
            }
            DivAccessibility divAccessibility2 = divAccessibility;
            Intrinsics.m32178g(divAccessibility2, "JsonParser.readOptional(…CESSIBILITY_DEFAULT_VALUE");
            DivAction.Companion companion2 = DivAction.f34546g;
            Function2<ParsingEnvironment, JSONObject, DivAction> function2 = DivAction.f34550k;
            DivAction divAction = (DivAction) JsonParser.m17322n(jSONObject, "action", function2, f34328a, parsingEnvironment);
            DivAnimation.Companion companion3 = DivAnimation.f34634h;
            DivAnimation divAnimation = (DivAnimation) JsonParser.m17322n(jSONObject, "action_animation", DivAnimation.f34644r, f34328a, parsingEnvironment);
            if (divAnimation == null) {
                divAnimation = DivGifImage.f36162P;
            }
            DivAnimation divAnimation2 = divAnimation;
            Intrinsics.m32178g(divAnimation2, "JsonParser.readOptional(…N_ANIMATION_DEFAULT_VALUE");
            List m17333y = JsonParser.m17333y(jSONObject, "actions", function2, DivGifImage.f36182j0, f34328a, parsingEnvironment);
            DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
            Function1<String, DivAlignmentHorizontal> function1 = DivAlignmentHorizontal.f34618d;
            Expression m17329u = JsonParser.m17329u(jSONObject, "alignment_horizontal", function1, f34328a, parsingEnvironment, DivGifImage.f36176d0);
            DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
            Function1<String, DivAlignmentVertical> function12 = DivAlignmentVertical.f34626d;
            Expression m17329u2 = JsonParser.m17329u(jSONObject, "alignment_vertical", function12, f34328a, parsingEnvironment, DivGifImage.f36177e0);
            Function1<Number, Double> function13 = ParsingConvertersKt.f33830d;
            ValueValidator<Double> valueValidator = DivGifImage.f36183k0;
            Expression<Double> expression = DivGifImage.f36163Q;
            Expression<Double> m17328t = JsonParser.m17328t(jSONObject, "alpha", function13, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
            if (m17328t != null) {
                expression = m17328t;
            }
            DivAspect.Companion companion4 = DivAspect.f34740b;
            DivAspect divAspect = (DivAspect) JsonParser.m17322n(jSONObject, "aspect", DivAspect.f34741c, f34328a, parsingEnvironment);
            DivBackground.Companion companion5 = DivBackground.f34750a;
            List m17333y2 = JsonParser.m17333y(jSONObject, "background", DivBackground.f34751b, DivGifImage.f36184l0, f34328a, parsingEnvironment);
            DivBorder.Companion companion6 = DivBorder.f34785f;
            DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject, "border", DivBorder.f34788i, f34328a, parsingEnvironment);
            if (divBorder == null) {
                divBorder = DivGifImage.f36164R;
            }
            DivBorder divBorder2 = divBorder;
            Intrinsics.m32178g(divBorder2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            Function1<Number, Long> function14 = ParsingConvertersKt.f33831e;
            ValueValidator<Long> valueValidator2 = DivGifImage.f36185m0;
            TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
            Expression m17327s = JsonParser.m17327s(jSONObject, "column_span", function14, valueValidator2, f34328a, parsingEnvironment, typeHelper);
            Expression<DivAlignmentHorizontal> expression2 = DivGifImage.f36165S;
            Expression<DivAlignmentHorizontal> m17330v = JsonParser.m17330v(jSONObject, "content_alignment_horizontal", function1, f34328a, parsingEnvironment, expression2, DivGifImage.f36178f0);
            if (m17330v != null) {
                expression2 = m17330v;
            }
            Expression<DivAlignmentVertical> expression3 = DivGifImage.f36166T;
            Expression<DivAlignmentVertical> m17330v2 = JsonParser.m17330v(jSONObject, "content_alignment_vertical", function12, f34328a, parsingEnvironment, expression3, DivGifImage.f36179g0);
            Expression<DivAlignmentVertical> expression4 = m17330v2 == null ? expression3 : m17330v2;
            DivDisappearAction.Companion companion7 = DivDisappearAction.f35537a;
            List m17333y3 = JsonParser.m17333y(jSONObject, "disappear_actions", DivDisappearAction.f35545i, DivGifImage.f36186n0, f34328a, parsingEnvironment);
            List m17333y4 = JsonParser.m17333y(jSONObject, "doubletap_actions", function2, DivGifImage.f36187o0, f34328a, parsingEnvironment);
            DivExtension.Companion companion8 = DivExtension.f35659c;
            List m17333y5 = JsonParser.m17333y(jSONObject, "extensions", DivExtension.f35660d, DivGifImage.f36188p0, f34328a, parsingEnvironment);
            DivFocus.Companion companion9 = DivFocus.f35813f;
            DivFocus divFocus = (DivFocus) JsonParser.m17322n(jSONObject, "focus", DivFocus.f35818k, f34328a, parsingEnvironment);
            Expression m17317i = JsonParser.m17317i(jSONObject, "gif_url", ParsingConvertersKt.f33828b, f34328a, parsingEnvironment, TypeHelpersKt.f33852e);
            DivSize.Companion companion10 = DivSize.f38833a;
            Function2<ParsingEnvironment, JSONObject, DivSize> function22 = DivSize.f38834b;
            DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject, "height", function22, f34328a, parsingEnvironment);
            if (divSize == null) {
                divSize = DivGifImage.f36167U;
            }
            DivSize divSize2 = divSize;
            Intrinsics.m32178g(divSize2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            String str = (String) JsonParser.m17323o(jSONObject, "id", DivGifImage.f36189q0, f34328a, parsingEnvironment);
            List m17333y6 = JsonParser.m17333y(jSONObject, "longtap_actions", function2, DivGifImage.f36190r0, f34328a, parsingEnvironment);
            DivEdgeInsets.Companion companion11 = DivEdgeInsets.f35607f;
            Function2<ParsingEnvironment, JSONObject, DivEdgeInsets> function23 = DivEdgeInsets.f35618q;
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "margins", function23, f34328a, parsingEnvironment);
            if (divEdgeInsets == null) {
                divEdgeInsets = DivGifImage.f36168V;
            }
            DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
            Intrinsics.m32178g(divEdgeInsets2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "paddings", function23, f34328a, parsingEnvironment);
            if (divEdgeInsets3 == null) {
                divEdgeInsets3 = DivGifImage.f36169W;
            }
            DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
            Intrinsics.m32178g(divEdgeInsets4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            Function1<Object, Integer> function15 = ParsingConvertersKt.f33827a;
            Expression<Integer> expression5 = DivGifImage.f36170X;
            Expression<Integer> m17330v3 = JsonParser.m17330v(jSONObject, "placeholder_color", function15, f34328a, parsingEnvironment, expression5, TypeHelpersKt.f33853f);
            Expression<Integer> expression6 = m17330v3 == null ? expression5 : m17330v3;
            Function1<Object, Boolean> function16 = ParsingConvertersKt.f33829c;
            Expression<Boolean> expression7 = DivGifImage.f36171Y;
            Expression<Boolean> m17330v4 = JsonParser.m17330v(jSONObject, "preload_required", function16, f34328a, parsingEnvironment, expression7, TypeHelpersKt.f33848a);
            Expression<Boolean> expression8 = m17330v4 == null ? expression7 : m17330v4;
            Expression m17325q = JsonParser.m17325q(jSONObject, "preview", DivGifImage.f36191s0, f34328a, parsingEnvironment, TypeHelpersKt.f33850c);
            Expression m17327s2 = JsonParser.m17327s(jSONObject, "row_span", function14, DivGifImage.f36192t0, f34328a, parsingEnvironment, typeHelper);
            DivImageScale.Converter converter3 = DivImageScale.f36808c;
            Function1<String, DivImageScale> function17 = DivImageScale.f36809d;
            Expression<DivImageScale> expression9 = DivGifImage.f36172Z;
            Expression<DivImageScale> m17330v5 = JsonParser.m17330v(jSONObject, "scale", function17, f34328a, parsingEnvironment, expression9, DivGifImage.f36180h0);
            Expression<DivImageScale> expression10 = m17330v5 == null ? expression9 : m17330v5;
            List m17333y7 = JsonParser.m17333y(jSONObject, "selected_actions", function2, DivGifImage.f36193u0, f34328a, parsingEnvironment);
            DivTooltip.Companion companion12 = DivTooltip.f40492h;
            List m17333y8 = JsonParser.m17333y(jSONObject, "tooltips", DivTooltip.f40497m, DivGifImage.f36194v0, f34328a, parsingEnvironment);
            DivTransform.Companion companion13 = DivTransform.f40551d;
            DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject, "transform", DivTransform.f40554g, f34328a, parsingEnvironment);
            if (divTransform == null) {
                divTransform = DivGifImage.f36173a0;
            }
            DivTransform divTransform2 = divTransform;
            Intrinsics.m32178g(divTransform2, "JsonParser.readOptional(…: TRANSFORM_DEFAULT_VALUE");
            DivChangeTransition.Companion companion14 = DivChangeTransition.f34856a;
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonParser.m17322n(jSONObject, "transition_change", DivChangeTransition.f34857b, f34328a, parsingEnvironment);
            DivAppearanceTransition.Companion companion15 = DivAppearanceTransition.f34726a;
            Function2<ParsingEnvironment, JSONObject, DivAppearanceTransition> function24 = DivAppearanceTransition.f34727b;
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonParser.m17322n(jSONObject, "transition_in", function24, f34328a, parsingEnvironment);
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonParser.m17322n(jSONObject, "transition_out", function24, f34328a, parsingEnvironment);
            DivTransitionTrigger.Converter converter4 = DivTransitionTrigger.f40582c;
            List m17332x = JsonParser.m17332x(jSONObject, "transition_triggers", DivTransitionTrigger.f40583d, DivGifImage.f36195w0, f34328a, parsingEnvironment);
            DivVisibility.Converter converter5 = DivVisibility.f40930c;
            Function1<String, DivVisibility> function18 = DivVisibility.f40931d;
            Expression<DivVisibility> expression11 = DivGifImage.f36174b0;
            Expression<DivVisibility> m17330v6 = JsonParser.m17330v(jSONObject, "visibility", function18, f34328a, parsingEnvironment, expression11, DivGifImage.f36181i0);
            Expression<DivVisibility> expression12 = m17330v6 == null ? expression11 : m17330v6;
            DivVisibilityAction.Companion companion16 = DivVisibilityAction.f40938i;
            Function2<ParsingEnvironment, JSONObject, DivVisibilityAction> function25 = DivVisibilityAction.f40946q;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonParser.m17322n(jSONObject, "visibility_action", function25, f34328a, parsingEnvironment);
            List m17333y9 = JsonParser.m17333y(jSONObject, "visibility_actions", function25, DivGifImage.f36196x0, f34328a, parsingEnvironment);
            DivSize divSize3 = (DivSize) JsonParser.m17322n(jSONObject, "width", function22, f34328a, parsingEnvironment);
            if (divSize3 == null) {
                divSize3 = DivGifImage.f36175c0;
            }
            Intrinsics.m32178g(divSize3, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new DivGifImage(divAccessibility2, divAction, divAnimation2, m17333y, m17329u, m17329u2, expression, divAspect, m17333y2, divBorder2, m17327s, expression2, expression4, m17333y3, m17333y4, m17333y5, divFocus, m17317i, divSize2, str, m17333y6, divEdgeInsets2, divEdgeInsets4, expression6, expression8, m17325q, m17327s2, expression10, m17333y7, m17333y8, divTransform2, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17332x, expression12, divVisibilityAction, m17333y9, divSize3);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression expression = null;
        f36161O = new DivAccessibility(null, null, null, expression, null, null, 63);
        Expression.Companion companion = Expression.f34334a;
        Expression m17539a = companion.m17539a(100L);
        Expression m17539a2 = companion.m17539a(Double.valueOf(0.6d));
        Expression m17539a3 = companion.m17539a(DivAnimation.Name.FADE);
        Double valueOf = Double.valueOf(1.0d);
        Expression expression2 = null;
        Expression expression3 = null;
        f36162P = new DivAnimation(m17539a, m17539a2, expression2, null, m17539a3, null, expression3, companion.m17539a(valueOf), C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
        f36163Q = companion.m17539a(valueOf);
        f36164R = new DivBorder(null, null == true ? 1 : 0, expression, null == true ? 1 : 0, null == true ? 1 : 0, 31);
        f36165S = companion.m17539a(DivAlignmentHorizontal.CENTER);
        f36166T = companion.m17539a(DivAlignmentVertical.CENTER);
        int i2 = 7;
        f36167U = new DivSize.WrapContent(new DivWrapContentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, i2));
        f36168V = new DivEdgeInsets(expression, null == true ? 1 : 0, null == true ? 1 : 0, null, null, 31);
        f36169W = new DivEdgeInsets(expression2, null == true ? 1 : 0, null, null == true ? 1 : 0, expression3, 31);
        f36170X = companion.m17539a(335544320);
        f36171Y = companion.m17539a(Boolean.FALSE);
        f36172Z = companion.m17539a(DivImageScale.FILL);
        f36173a0 = new DivTransform(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, i2);
        f36174b0 = companion.m17539a(DivVisibility.VISIBLE);
        f36175c0 = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i3 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f36176d0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGifImage$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f36177e0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGifImage$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f36178f0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGifImage$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f36179g0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGifImage$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f36180h0 = companion2.m17372a(ArraysKt.m31926B(DivImageScale.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGifImage$Companion$TYPE_HELPER_SCALE$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivImageScale);
            }
        });
        f36181i0 = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGifImage$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f36182j0 = C3059n.f41746h;
        f36183k0 = C3057m.f41701x;
        f36184l0 = C3059n.f41752n;
        f36185m0 = C3057m.f41702y;
        f36186n0 = C3059n.f41753o;
        f36187o0 = C3059n.f41754p;
        f36188p0 = C3059n.f41755q;
        f36189q0 = C3057m.f41698u;
        f36190r0 = C3059n.f41747i;
        f36191s0 = C3057m.f41699v;
        f36192t0 = C3057m.f41700w;
        f36193u0 = C3059n.f41748j;
        f36194v0 = C3059n.f41749k;
        f36195w0 = C3059n.f41750l;
        f36196x0 = C3059n.f41751m;
        DivGifImage$Companion$CREATOR$1 divGifImage$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivGifImage>() { // from class: com.yandex.div2.DivGifImage$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivGifImage invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivGifImage.f36160N.m17626a(env, it);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @DivModelInternalApi
    public DivGifImage(@NotNull DivAccessibility accessibility, @Nullable DivAction divAction, @NotNull DivAnimation actionAnimation, @Nullable List<? extends DivAction> list, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> alpha, @Nullable DivAspect divAspect, @Nullable List<? extends DivBackground> list2, @NotNull DivBorder border, @Nullable Expression<Long> expression3, @NotNull Expression<DivAlignmentHorizontal> contentAlignmentHorizontal, @NotNull Expression<DivAlignmentVertical> contentAlignmentVertical, @Nullable List<? extends DivDisappearAction> list3, @Nullable List<? extends DivAction> list4, @Nullable List<? extends DivExtension> list5, @Nullable DivFocus divFocus, @NotNull Expression<Uri> gifUrl, @NotNull DivSize height, @Nullable String str, @Nullable List<? extends DivAction> list6, @NotNull DivEdgeInsets margins, @NotNull DivEdgeInsets paddings, @NotNull Expression<Integer> placeholderColor, @NotNull Expression<Boolean> preloadRequired, @Nullable Expression<String> expression4, @Nullable Expression<Long> expression5, @NotNull Expression<DivImageScale> scale, @Nullable List<? extends DivAction> list7, @Nullable List<? extends DivTooltip> list8, @NotNull DivTransform transform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list9, @NotNull Expression<DivVisibility> visibility, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<? extends DivVisibilityAction> list10, @NotNull DivSize width) {
        Intrinsics.m32179h(accessibility, "accessibility");
        Intrinsics.m32179h(actionAnimation, "actionAnimation");
        Intrinsics.m32179h(alpha, "alpha");
        Intrinsics.m32179h(border, "border");
        Intrinsics.m32179h(contentAlignmentHorizontal, "contentAlignmentHorizontal");
        Intrinsics.m32179h(contentAlignmentVertical, "contentAlignmentVertical");
        Intrinsics.m32179h(gifUrl, "gifUrl");
        Intrinsics.m32179h(height, "height");
        Intrinsics.m32179h(margins, "margins");
        Intrinsics.m32179h(paddings, "paddings");
        Intrinsics.m32179h(placeholderColor, "placeholderColor");
        Intrinsics.m32179h(preloadRequired, "preloadRequired");
        Intrinsics.m32179h(scale, "scale");
        Intrinsics.m32179h(transform, "transform");
        Intrinsics.m32179h(visibility, "visibility");
        Intrinsics.m32179h(width, "width");
        this.f36210a = accessibility;
        this.f36211b = divAction;
        this.f36212c = actionAnimation;
        this.f36213d = list;
        this.f36214e = expression;
        this.f36215f = expression2;
        this.f36216g = alpha;
        this.f36217h = divAspect;
        this.f36218i = list2;
        this.f36219j = border;
        this.f36220k = expression3;
        this.f36221l = contentAlignmentHorizontal;
        this.f36222m = contentAlignmentVertical;
        this.f36223n = list3;
        this.f36224o = list4;
        this.f36225p = list5;
        this.f36226q = divFocus;
        this.f36227r = gifUrl;
        this.f36228s = height;
        this.f36229t = str;
        this.f36230u = list6;
        this.f36231v = margins;
        this.f36232w = paddings;
        this.f36233x = placeholderColor;
        this.f36234y = preloadRequired;
        this.f36235z = expression4;
        this.f36197A = expression5;
        this.f36198B = scale;
        this.f36199C = list7;
        this.f36200D = list8;
        this.f36201E = transform;
        this.f36202F = divChangeTransition;
        this.f36203G = divAppearanceTransition;
        this.f36204H = divAppearanceTransition2;
        this.f36205I = list9;
        this.f36206J = visibility;
        this.f36207K = divVisibilityAction;
        this.f36208L = list10;
        this.f36209M = width;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: a, reason: from getter */
    public DivSize getF40705p() {
        return this.f36228s;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: b, reason: from getter */
    public DivTransform getF40680B() {
        return this.f36201E;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: c */
    public List<DivVisibilityAction> mo17569c() {
        return this.f36208L;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: d */
    public List<DivBackground> mo17570d() {
        return this.f36218i;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: e, reason: from getter */
    public DivAccessibility getF40690a() {
        return this.f36210a;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: f */
    public Expression<Long> mo17572f() {
        return this.f36220k;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: g, reason: from getter */
    public DivSize getF40689K() {
        return this.f36209M;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: getBorder, reason: from getter */
    public DivBorder getF40696g() {
        return this.f36219j;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: getId, reason: from getter */
    public String getF40706q() {
        return this.f36229t;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    public Expression<DivVisibility> getVisibility() {
        return this.f36206J;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: h, reason: from getter */
    public DivEdgeInsets getF40707r() {
        return this.f36231v;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: i */
    public Expression<Long> mo17575i() {
        return this.f36197A;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: j, reason: from getter */
    public DivEdgeInsets getF40709t() {
        return this.f36232w;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: k */
    public List<DivTransitionTrigger> mo17577k() {
        return this.f36205I;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: l */
    public List<DivAction> mo17578l() {
        return this.f36199C;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: m */
    public Expression<DivAlignmentHorizontal> mo17579m() {
        return this.f36214e;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: n */
    public List<DivExtension> mo17580n() {
        return this.f36225p;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: o */
    public List<DivTooltip> mo17581o() {
        return this.f36200D;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: p, reason: from getter */
    public DivVisibilityAction getF40687I() {
        return this.f36207K;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: q */
    public Expression<DivAlignmentVertical> mo17583q() {
        return this.f36215f;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: r, reason: from getter */
    public DivAppearanceTransition getF40682D() {
        return this.f36203G;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: s */
    public Expression<Double> mo17585s() {
        return this.f36216g;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: t, reason: from getter */
    public DivFocus getF40704o() {
        return this.f36226q;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: u, reason: from getter */
    public DivAppearanceTransition getF40683E() {
        return this.f36204H;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: v, reason: from getter */
    public DivChangeTransition getF40681C() {
        return this.f36202F;
    }
}
