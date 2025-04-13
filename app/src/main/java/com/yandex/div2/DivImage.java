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
import com.yandex.div2.DivBlendMode;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivChangeTransition;
import com.yandex.div2.DivDisappearAction;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivExtension;
import com.yandex.div2.DivFadeTransition;
import com.yandex.div2.DivFilter;
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

/* compiled from: DivImage.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div2/DivImage;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div2/DivBase;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivImage implements JSONSerializable, DivBase {

    /* renamed from: A0 */
    @NotNull
    public static final ListValidator<DivAction> f36655A0;

    /* renamed from: B0 */
    @NotNull
    public static final ValueValidator<String> f36656B0;

    /* renamed from: C0 */
    @NotNull
    public static final ValueValidator<Long> f36657C0;

    /* renamed from: D0 */
    @NotNull
    public static final ListValidator<DivAction> f36658D0;

    /* renamed from: E0 */
    @NotNull
    public static final ListValidator<DivTooltip> f36659E0;

    /* renamed from: F0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f36660F0;

    /* renamed from: G0 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f36661G0;

    /* renamed from: S */
    @NotNull
    public static final Companion f36662S = new Companion(null);

    /* renamed from: T */
    @NotNull
    public static final DivAccessibility f36663T;

    /* renamed from: U */
    @NotNull
    public static final DivAnimation f36664U;

    /* renamed from: V */
    @NotNull
    public static final Expression<Double> f36665V;

    /* renamed from: W */
    @NotNull
    public static final DivBorder f36666W;

    /* renamed from: X */
    @NotNull
    public static final Expression<DivAlignmentHorizontal> f36667X;

    /* renamed from: Y */
    @NotNull
    public static final Expression<DivAlignmentVertical> f36668Y;

    /* renamed from: Z */
    @NotNull
    public static final DivSize.WrapContent f36669Z;

    /* renamed from: a0 */
    @NotNull
    public static final Expression<Boolean> f36670a0;

    /* renamed from: b0 */
    @NotNull
    public static final DivEdgeInsets f36671b0;

    /* renamed from: c0 */
    @NotNull
    public static final DivEdgeInsets f36672c0;

    /* renamed from: d0 */
    @NotNull
    public static final Expression<Integer> f36673d0;

    /* renamed from: e0 */
    @NotNull
    public static final Expression<Boolean> f36674e0;

    /* renamed from: f0 */
    @NotNull
    public static final Expression<DivImageScale> f36675f0;

    /* renamed from: g0 */
    @NotNull
    public static final Expression<DivBlendMode> f36676g0;

    /* renamed from: h0 */
    @NotNull
    public static final DivTransform f36677h0;

    /* renamed from: i0 */
    @NotNull
    public static final Expression<DivVisibility> f36678i0;

    /* renamed from: j0 */
    @NotNull
    public static final DivSize.MatchParent f36679j0;

    /* renamed from: k0 */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f36680k0;

    /* renamed from: l0 */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f36681l0;

    /* renamed from: m0 */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f36682m0;

    /* renamed from: n0 */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f36683n0;

    /* renamed from: o0 */
    @NotNull
    public static final TypeHelper<DivImageScale> f36684o0;

    /* renamed from: p0 */
    @NotNull
    public static final TypeHelper<DivBlendMode> f36685p0;

    /* renamed from: q0 */
    @NotNull
    public static final TypeHelper<DivVisibility> f36686q0;

    /* renamed from: r0 */
    @NotNull
    public static final ListValidator<DivAction> f36687r0;

    /* renamed from: s0 */
    @NotNull
    public static final ValueValidator<Double> f36688s0;

    /* renamed from: t0 */
    @NotNull
    public static final ListValidator<DivBackground> f36689t0;

    /* renamed from: u0 */
    @NotNull
    public static final ValueValidator<Long> f36690u0;

    /* renamed from: v0 */
    @NotNull
    public static final ListValidator<DivDisappearAction> f36691v0;

    /* renamed from: w0 */
    @NotNull
    public static final ListValidator<DivAction> f36692w0;

    /* renamed from: x0 */
    @NotNull
    public static final ListValidator<DivExtension> f36693x0;

    /* renamed from: y0 */
    @NotNull
    public static final ListValidator<DivFilter> f36694y0;

    /* renamed from: z0 */
    @NotNull
    public static final ValueValidator<String> f36695z0;

    /* renamed from: A */
    @JvmField
    @NotNull
    public final Expression<Integer> f36696A;

    /* renamed from: B */
    @JvmField
    @NotNull
    public final Expression<Boolean> f36697B;

    /* renamed from: C */
    @JvmField
    @Nullable
    public final Expression<String> f36698C;

    /* renamed from: D */
    @Nullable
    public final Expression<Long> f36699D;

    /* renamed from: E */
    @JvmField
    @NotNull
    public final Expression<DivImageScale> f36700E;

    /* renamed from: F */
    @Nullable
    public final List<DivAction> f36701F;

    /* renamed from: G */
    @JvmField
    @Nullable
    public final Expression<Integer> f36702G;

    /* renamed from: H */
    @JvmField
    @NotNull
    public final Expression<DivBlendMode> f36703H;

    /* renamed from: I */
    @Nullable
    public final List<DivTooltip> f36704I;

    /* renamed from: J */
    @NotNull
    public final DivTransform f36705J;

    /* renamed from: K */
    @Nullable
    public final DivChangeTransition f36706K;

    /* renamed from: L */
    @Nullable
    public final DivAppearanceTransition f36707L;

    /* renamed from: M */
    @Nullable
    public final DivAppearanceTransition f36708M;

    /* renamed from: N */
    @Nullable
    public final List<DivTransitionTrigger> f36709N;

    /* renamed from: O */
    @NotNull
    public final Expression<DivVisibility> f36710O;

    /* renamed from: P */
    @Nullable
    public final DivVisibilityAction f36711P;

    /* renamed from: Q */
    @Nullable
    public final List<DivVisibilityAction> f36712Q;

    /* renamed from: R */
    @NotNull
    public final DivSize f36713R;

    /* renamed from: a */
    @NotNull
    public final DivAccessibility f36714a;

    /* renamed from: b */
    @JvmField
    @Nullable
    public final DivAction f36715b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final DivAnimation f36716c;

    /* renamed from: d */
    @JvmField
    @Nullable
    public final List<DivAction> f36717d;

    /* renamed from: e */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f36718e;

    /* renamed from: f */
    @Nullable
    public final Expression<DivAlignmentVertical> f36719f;

    /* renamed from: g */
    @NotNull
    public final Expression<Double> f36720g;

    /* renamed from: h */
    @JvmField
    @Nullable
    public final DivFadeTransition f36721h;

    /* renamed from: i */
    @JvmField
    @Nullable
    public final DivAspect f36722i;

    /* renamed from: j */
    @Nullable
    public final List<DivBackground> f36723j;

    /* renamed from: k */
    @NotNull
    public final DivBorder f36724k;

    /* renamed from: l */
    @Nullable
    public final Expression<Long> f36725l;

    /* renamed from: m */
    @JvmField
    @NotNull
    public final Expression<DivAlignmentHorizontal> f36726m;

    /* renamed from: n */
    @JvmField
    @NotNull
    public final Expression<DivAlignmentVertical> f36727n;

    /* renamed from: o */
    @Nullable
    public final List<DivDisappearAction> f36728o;

    /* renamed from: p */
    @JvmField
    @Nullable
    public final List<DivAction> f36729p;

    /* renamed from: q */
    @Nullable
    public final List<DivExtension> f36730q;

    /* renamed from: r */
    @JvmField
    @Nullable
    public final List<DivFilter> f36731r;

    /* renamed from: s */
    @Nullable
    public final DivFocus f36732s;

    /* renamed from: t */
    @NotNull
    public final DivSize f36733t;

    /* renamed from: u */
    @JvmField
    @NotNull
    public final Expression<Boolean> f36734u;

    /* renamed from: v */
    @Nullable
    public final String f36735v;

    /* renamed from: w */
    @JvmField
    @NotNull
    public final Expression<Uri> f36736w;

    /* renamed from: x */
    @JvmField
    @Nullable
    public final List<DivAction> f36737x;

    /* renamed from: y */
    @NotNull
    public final DivEdgeInsets f36738y;

    /* renamed from: z */
    @NotNull
    public final DivEdgeInsets f36739z;

    /* compiled from: DivImage.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\bR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u000fR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u000fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\bR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\bR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\bR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\bR\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u000fR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0012R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020,0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0012R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\bR\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u000fR\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020*0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u000fR\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020,0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\u0012R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020,0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0012R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0012R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0012R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\u000fR\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010\bR\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\u000fR\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010\bR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010\bR\u0014\u0010G\u001a\u00020,8\u0006X\u0086T¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001c0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u001e0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010KR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001c0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010KR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001e0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010KR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020;0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010KR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020>0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010KR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010KR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020S0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010\bR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020Q0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010\u000fR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010X¨\u0006Y"}, m31884d2 = {"Lcom/yandex/div2/DivImage$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAction;", "ACTIONS_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAnimation;", "ACTION_ANIMATION_DEFAULT_VALUE", "Lcom/yandex/div2/DivAnimation;", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivAlignmentHorizontal;", "CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE", "Lcom/yandex/div2/DivAlignmentVertical;", "CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "DOUBLETAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/DivFilter;", "FILTERS_VALIDATOR", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "", "HIGH_PRIORITY_PREVIEW_SHOW_DEFAULT_VALUE", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "LONGTAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "PADDINGS_DEFAULT_VALUE", "", "PLACEHOLDER_COLOR_DEFAULT_VALUE", "PRELOAD_REQUIRED_DEFAULT_VALUE", "PREVIEW_TEMPLATE_VALIDATOR", "PREVIEW_VALIDATOR", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "Lcom/yandex/div2/DivImageScale;", "SCALE_DEFAULT_VALUE", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivBlendMode;", "TINT_MODE_DEFAULT_VALUE", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL", "TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL", "TYPE_HELPER_SCALE", "TYPE_HELPER_TINT_MODE", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivImage m17630a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            DivAccessibility.Companion companion = DivAccessibility.f34479f;
            DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject, "accessibility", DivAccessibility.f34486m, f34328a, parsingEnvironment);
            if (divAccessibility == null) {
                divAccessibility = DivImage.f36663T;
            }
            DivAccessibility divAccessibility2 = divAccessibility;
            Intrinsics.m32178g(divAccessibility2, "JsonParser.readOptional(…CESSIBILITY_DEFAULT_VALUE");
            DivAction.Companion companion2 = DivAction.f34546g;
            Function2<ParsingEnvironment, JSONObject, DivAction> function2 = DivAction.f34550k;
            DivAction divAction = (DivAction) JsonParser.m17322n(jSONObject, "action", function2, f34328a, parsingEnvironment);
            DivAnimation.Companion companion3 = DivAnimation.f34634h;
            DivAnimation divAnimation = (DivAnimation) JsonParser.m17322n(jSONObject, "action_animation", DivAnimation.f34644r, f34328a, parsingEnvironment);
            if (divAnimation == null) {
                divAnimation = DivImage.f36664U;
            }
            DivAnimation divAnimation2 = divAnimation;
            Intrinsics.m32178g(divAnimation2, "JsonParser.readOptional(…N_ANIMATION_DEFAULT_VALUE");
            List m17333y = JsonParser.m17333y(jSONObject, "actions", function2, DivImage.f36687r0, f34328a, parsingEnvironment);
            DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
            Function1<String, DivAlignmentHorizontal> function1 = DivAlignmentHorizontal.f34618d;
            Expression m17329u = JsonParser.m17329u(jSONObject, "alignment_horizontal", function1, f34328a, parsingEnvironment, DivImage.f36680k0);
            DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
            Function1<String, DivAlignmentVertical> function12 = DivAlignmentVertical.f34626d;
            Expression m17329u2 = JsonParser.m17329u(jSONObject, "alignment_vertical", function12, f34328a, parsingEnvironment, DivImage.f36681l0);
            Function1<Number, Double> function13 = ParsingConvertersKt.f33830d;
            ValueValidator<Double> valueValidator = DivImage.f36688s0;
            Expression<Double> expression = DivImage.f36665V;
            Expression<Double> m17328t = JsonParser.m17328t(jSONObject, "alpha", function13, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
            if (m17328t != null) {
                expression = m17328t;
            }
            DivFadeTransition.Companion companion4 = DivFadeTransition.f35673e;
            DivFadeTransition divFadeTransition = (DivFadeTransition) JsonParser.m17322n(jSONObject, "appearance_animation", DivFadeTransition.f35682n, f34328a, parsingEnvironment);
            DivAspect.Companion companion5 = DivAspect.f34740b;
            DivAspect divAspect = (DivAspect) JsonParser.m17322n(jSONObject, "aspect", DivAspect.f34741c, f34328a, parsingEnvironment);
            DivBackground.Companion companion6 = DivBackground.f34750a;
            List m17333y2 = JsonParser.m17333y(jSONObject, "background", DivBackground.f34751b, DivImage.f36689t0, f34328a, parsingEnvironment);
            DivBorder.Companion companion7 = DivBorder.f34785f;
            DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject, "border", DivBorder.f34788i, f34328a, parsingEnvironment);
            if (divBorder == null) {
                divBorder = DivImage.f36666W;
            }
            DivBorder divBorder2 = divBorder;
            Intrinsics.m32178g(divBorder2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            Function1<Number, Long> function14 = ParsingConvertersKt.f33831e;
            ValueValidator<Long> valueValidator2 = DivImage.f36690u0;
            TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
            Expression m17327s = JsonParser.m17327s(jSONObject, "column_span", function14, valueValidator2, f34328a, parsingEnvironment, typeHelper);
            Expression<DivAlignmentHorizontal> expression2 = DivImage.f36667X;
            Expression<DivAlignmentHorizontal> m17330v = JsonParser.m17330v(jSONObject, "content_alignment_horizontal", function1, f34328a, parsingEnvironment, expression2, DivImage.f36682m0);
            if (m17330v != null) {
                expression2 = m17330v;
            }
            Expression<DivAlignmentVertical> expression3 = DivImage.f36668Y;
            Expression<DivAlignmentVertical> m17330v2 = JsonParser.m17330v(jSONObject, "content_alignment_vertical", function12, f34328a, parsingEnvironment, expression3, DivImage.f36683n0);
            Expression<DivAlignmentVertical> expression4 = m17330v2 == null ? expression3 : m17330v2;
            DivDisappearAction.Companion companion8 = DivDisappearAction.f35537a;
            List m17333y3 = JsonParser.m17333y(jSONObject, "disappear_actions", DivDisappearAction.f35545i, DivImage.f36691v0, f34328a, parsingEnvironment);
            List m17333y4 = JsonParser.m17333y(jSONObject, "doubletap_actions", function2, DivImage.f36692w0, f34328a, parsingEnvironment);
            DivExtension.Companion companion9 = DivExtension.f35659c;
            List m17333y5 = JsonParser.m17333y(jSONObject, "extensions", DivExtension.f35660d, DivImage.f36693x0, f34328a, parsingEnvironment);
            DivFilter.Companion companion10 = DivFilter.f35717a;
            List m17333y6 = JsonParser.m17333y(jSONObject, "filters", DivFilter.f35718b, DivImage.f36694y0, f34328a, parsingEnvironment);
            DivFocus.Companion companion11 = DivFocus.f35813f;
            DivFocus divFocus = (DivFocus) JsonParser.m17322n(jSONObject, "focus", DivFocus.f35818k, f34328a, parsingEnvironment);
            DivSize.Companion companion12 = DivSize.f38833a;
            Function2<ParsingEnvironment, JSONObject, DivSize> function22 = DivSize.f38834b;
            DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject, "height", function22, f34328a, parsingEnvironment);
            if (divSize == null) {
                divSize = DivImage.f36669Z;
            }
            DivSize divSize2 = divSize;
            Intrinsics.m32178g(divSize2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            Function1<Object, Boolean> function15 = ParsingConvertersKt.f33829c;
            Expression<Boolean> expression5 = DivImage.f36670a0;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.f33848a;
            Expression<Boolean> m17330v3 = JsonParser.m17330v(jSONObject, "high_priority_preview_show", function15, f34328a, parsingEnvironment, expression5, typeHelper2);
            if (m17330v3 != null) {
                expression5 = m17330v3;
            }
            String str = (String) JsonParser.m17323o(jSONObject, "id", DivImage.f36695z0, f34328a, parsingEnvironment);
            Expression m17317i = JsonParser.m17317i(jSONObject, "image_url", ParsingConvertersKt.f33828b, f34328a, parsingEnvironment, TypeHelpersKt.f33852e);
            List m17333y7 = JsonParser.m17333y(jSONObject, "longtap_actions", function2, DivImage.f36655A0, f34328a, parsingEnvironment);
            DivEdgeInsets.Companion companion13 = DivEdgeInsets.f35607f;
            Function2<ParsingEnvironment, JSONObject, DivEdgeInsets> function23 = DivEdgeInsets.f35618q;
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "margins", function23, f34328a, parsingEnvironment);
            if (divEdgeInsets == null) {
                divEdgeInsets = DivImage.f36671b0;
            }
            DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
            Intrinsics.m32178g(divEdgeInsets2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "paddings", function23, f34328a, parsingEnvironment);
            if (divEdgeInsets3 == null) {
                divEdgeInsets3 = DivImage.f36672c0;
            }
            DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
            Intrinsics.m32178g(divEdgeInsets4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            Function1<Object, Integer> function16 = ParsingConvertersKt.f33827a;
            Expression<Integer> expression6 = DivImage.f36673d0;
            TypeHelper<Integer> typeHelper3 = TypeHelpersKt.f33853f;
            Expression<Integer> m17330v4 = JsonParser.m17330v(jSONObject, "placeholder_color", function16, f34328a, parsingEnvironment, expression6, typeHelper3);
            if (m17330v4 != null) {
                expression6 = m17330v4;
            }
            Expression<Boolean> expression7 = DivImage.f36674e0;
            Expression<Boolean> m17330v5 = JsonParser.m17330v(jSONObject, "preload_required", function15, f34328a, parsingEnvironment, expression7, typeHelper2);
            if (m17330v5 != null) {
                expression7 = m17330v5;
            }
            Expression m17325q = JsonParser.m17325q(jSONObject, "preview", DivImage.f36656B0, f34328a, parsingEnvironment, TypeHelpersKt.f33850c);
            Expression m17327s2 = JsonParser.m17327s(jSONObject, "row_span", function14, DivImage.f36657C0, f34328a, parsingEnvironment, typeHelper);
            DivImageScale.Converter converter3 = DivImageScale.f36808c;
            Function1<String, DivImageScale> function17 = DivImageScale.f36809d;
            Expression<DivImageScale> expression8 = DivImage.f36675f0;
            Expression<DivImageScale> m17330v6 = JsonParser.m17330v(jSONObject, "scale", function17, f34328a, parsingEnvironment, expression8, DivImage.f36684o0);
            Expression<DivImageScale> expression9 = m17330v6 == null ? expression8 : m17330v6;
            List m17333y8 = JsonParser.m17333y(jSONObject, "selected_actions", function2, DivImage.f36658D0, f34328a, parsingEnvironment);
            Expression m17329u3 = JsonParser.m17329u(jSONObject, "tint_color", function16, f34328a, parsingEnvironment, typeHelper3);
            DivBlendMode.Converter converter4 = DivBlendMode.f34766c;
            Function1<String, DivBlendMode> function18 = DivBlendMode.f34767d;
            Expression<DivBlendMode> expression10 = DivImage.f36676g0;
            Expression<DivBlendMode> m17330v7 = JsonParser.m17330v(jSONObject, "tint_mode", function18, f34328a, parsingEnvironment, expression10, DivImage.f36685p0);
            Expression<DivBlendMode> expression11 = m17330v7 == null ? expression10 : m17330v7;
            DivTooltip.Companion companion14 = DivTooltip.f40492h;
            List m17333y9 = JsonParser.m17333y(jSONObject, "tooltips", DivTooltip.f40497m, DivImage.f36659E0, f34328a, parsingEnvironment);
            DivTransform.Companion companion15 = DivTransform.f40551d;
            DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject, "transform", DivTransform.f40554g, f34328a, parsingEnvironment);
            if (divTransform == null) {
                divTransform = DivImage.f36677h0;
            }
            DivTransform divTransform2 = divTransform;
            Intrinsics.m32178g(divTransform2, "JsonParser.readOptional(…: TRANSFORM_DEFAULT_VALUE");
            DivChangeTransition.Companion companion16 = DivChangeTransition.f34856a;
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonParser.m17322n(jSONObject, "transition_change", DivChangeTransition.f34857b, f34328a, parsingEnvironment);
            DivAppearanceTransition.Companion companion17 = DivAppearanceTransition.f34726a;
            Function2<ParsingEnvironment, JSONObject, DivAppearanceTransition> function24 = DivAppearanceTransition.f34727b;
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonParser.m17322n(jSONObject, "transition_in", function24, f34328a, parsingEnvironment);
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonParser.m17322n(jSONObject, "transition_out", function24, f34328a, parsingEnvironment);
            DivTransitionTrigger.Converter converter5 = DivTransitionTrigger.f40582c;
            List m17332x = JsonParser.m17332x(jSONObject, "transition_triggers", DivTransitionTrigger.f40583d, DivImage.f36660F0, f34328a, parsingEnvironment);
            DivVisibility.Converter converter6 = DivVisibility.f40930c;
            Function1<String, DivVisibility> function19 = DivVisibility.f40931d;
            Expression<DivVisibility> expression12 = DivImage.f36678i0;
            Expression<DivVisibility> m17330v8 = JsonParser.m17330v(jSONObject, "visibility", function19, f34328a, parsingEnvironment, expression12, DivImage.f36686q0);
            Expression<DivVisibility> expression13 = m17330v8 == null ? expression12 : m17330v8;
            DivVisibilityAction.Companion companion18 = DivVisibilityAction.f40938i;
            Function2<ParsingEnvironment, JSONObject, DivVisibilityAction> function25 = DivVisibilityAction.f40946q;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonParser.m17322n(jSONObject, "visibility_action", function25, f34328a, parsingEnvironment);
            List m17333y10 = JsonParser.m17333y(jSONObject, "visibility_actions", function25, DivImage.f36661G0, f34328a, parsingEnvironment);
            DivSize divSize3 = (DivSize) JsonParser.m17322n(jSONObject, "width", function22, f34328a, parsingEnvironment);
            if (divSize3 == null) {
                divSize3 = DivImage.f36679j0;
            }
            Intrinsics.m32178g(divSize3, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new DivImage(divAccessibility2, divAction, divAnimation2, m17333y, m17329u, m17329u2, expression, divFadeTransition, divAspect, m17333y2, divBorder2, m17327s, expression2, expression4, m17333y3, m17333y4, m17333y5, m17333y6, divFocus, divSize2, expression5, str, m17317i, m17333y7, divEdgeInsets2, divEdgeInsets4, expression6, expression7, m17325q, m17327s2, expression9, m17333y8, m17329u3, expression11, m17333y9, divTransform2, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17332x, expression13, divVisibilityAction, m17333y10, divSize3);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression expression = null;
        f36663T = new DivAccessibility(null, null, null, expression, null, null, 63);
        Expression.Companion companion = Expression.f34334a;
        Expression m17539a = companion.m17539a(100L);
        Expression m17539a2 = companion.m17539a(Double.valueOf(0.6d));
        Expression m17539a3 = companion.m17539a(DivAnimation.Name.FADE);
        Double valueOf = Double.valueOf(1.0d);
        Expression expression2 = null;
        Expression expression3 = null;
        f36664U = new DivAnimation(m17539a, m17539a2, expression2, null, m17539a3, null, expression3, companion.m17539a(valueOf), C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
        f36665V = companion.m17539a(valueOf);
        f36666W = new DivBorder(null, null == true ? 1 : 0, expression, null == true ? 1 : 0, null == true ? 1 : 0, 31);
        f36667X = companion.m17539a(DivAlignmentHorizontal.CENTER);
        f36668Y = companion.m17539a(DivAlignmentVertical.CENTER);
        int i2 = 7;
        f36669Z = new DivSize.WrapContent(new DivWrapContentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, i2));
        Boolean bool = Boolean.FALSE;
        f36670a0 = companion.m17539a(bool);
        f36671b0 = new DivEdgeInsets(expression, null == true ? 1 : 0, null == true ? 1 : 0, null, null, 31);
        f36672c0 = new DivEdgeInsets(expression2, null == true ? 1 : 0, null, null == true ? 1 : 0, expression3, 31);
        f36673d0 = companion.m17539a(335544320);
        f36674e0 = companion.m17539a(bool);
        f36675f0 = companion.m17539a(DivImageScale.FILL);
        f36676g0 = companion.m17539a(DivBlendMode.SOURCE_IN);
        f36677h0 = new DivTransform(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, i2);
        f36678i0 = companion.m17539a(DivVisibility.VISIBLE);
        f36679j0 = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i3 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f36680k0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivImage$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f36681l0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivImage$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f36682m0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivImage$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f36683n0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivImage$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f36684o0 = companion2.m17372a(ArraysKt.m31926B(DivImageScale.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivImage$Companion$TYPE_HELPER_SCALE$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivImageScale);
            }
        });
        f36685p0 = companion2.m17372a(ArraysKt.m31926B(DivBlendMode.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivImage$Companion$TYPE_HELPER_TINT_MODE$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivBlendMode);
            }
        });
        f36686q0 = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivImage$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f36687r0 = C3065q.f41915k;
        f36688s0 = C3067r.f41955g;
        f36689t0 = C3065q.f41921q;
        f36690u0 = C3067r.f41956h;
        f36691v0 = C3065q.f41922r;
        f36692w0 = C3065q.f41923s;
        f36693x0 = C3065q.f41924t;
        f36694y0 = C3065q.f41925u;
        f36695z0 = C3067r.f41952d;
        f36655A0 = C3065q.f41916l;
        f36656B0 = C3067r.f41953e;
        f36657C0 = C3067r.f41954f;
        f36658D0 = C3065q.f41917m;
        f36659E0 = C3065q.f41918n;
        f36660F0 = C3065q.f41919o;
        f36661G0 = C3065q.f41920p;
        DivImage$Companion$CREATOR$1 divImage$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivImage>() { // from class: com.yandex.div2.DivImage$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivImage invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivImage.f36662S.m17630a(env, it);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @DivModelInternalApi
    public DivImage(@NotNull DivAccessibility accessibility, @Nullable DivAction divAction, @NotNull DivAnimation actionAnimation, @Nullable List<? extends DivAction> list, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> alpha, @Nullable DivFadeTransition divFadeTransition, @Nullable DivAspect divAspect, @Nullable List<? extends DivBackground> list2, @NotNull DivBorder border, @Nullable Expression<Long> expression3, @NotNull Expression<DivAlignmentHorizontal> contentAlignmentHorizontal, @NotNull Expression<DivAlignmentVertical> contentAlignmentVertical, @Nullable List<? extends DivDisappearAction> list3, @Nullable List<? extends DivAction> list4, @Nullable List<? extends DivExtension> list5, @Nullable List<? extends DivFilter> list6, @Nullable DivFocus divFocus, @NotNull DivSize height, @NotNull Expression<Boolean> highPriorityPreviewShow, @Nullable String str, @NotNull Expression<Uri> imageUrl, @Nullable List<? extends DivAction> list7, @NotNull DivEdgeInsets margins, @NotNull DivEdgeInsets paddings, @NotNull Expression<Integer> placeholderColor, @NotNull Expression<Boolean> preloadRequired, @Nullable Expression<String> expression4, @Nullable Expression<Long> expression5, @NotNull Expression<DivImageScale> scale, @Nullable List<? extends DivAction> list8, @Nullable Expression<Integer> expression6, @NotNull Expression<DivBlendMode> tintMode, @Nullable List<? extends DivTooltip> list9, @NotNull DivTransform transform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list10, @NotNull Expression<DivVisibility> visibility, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<? extends DivVisibilityAction> list11, @NotNull DivSize width) {
        Intrinsics.m32179h(accessibility, "accessibility");
        Intrinsics.m32179h(actionAnimation, "actionAnimation");
        Intrinsics.m32179h(alpha, "alpha");
        Intrinsics.m32179h(border, "border");
        Intrinsics.m32179h(contentAlignmentHorizontal, "contentAlignmentHorizontal");
        Intrinsics.m32179h(contentAlignmentVertical, "contentAlignmentVertical");
        Intrinsics.m32179h(height, "height");
        Intrinsics.m32179h(highPriorityPreviewShow, "highPriorityPreviewShow");
        Intrinsics.m32179h(imageUrl, "imageUrl");
        Intrinsics.m32179h(margins, "margins");
        Intrinsics.m32179h(paddings, "paddings");
        Intrinsics.m32179h(placeholderColor, "placeholderColor");
        Intrinsics.m32179h(preloadRequired, "preloadRequired");
        Intrinsics.m32179h(scale, "scale");
        Intrinsics.m32179h(tintMode, "tintMode");
        Intrinsics.m32179h(transform, "transform");
        Intrinsics.m32179h(visibility, "visibility");
        Intrinsics.m32179h(width, "width");
        this.f36714a = accessibility;
        this.f36715b = divAction;
        this.f36716c = actionAnimation;
        this.f36717d = list;
        this.f36718e = expression;
        this.f36719f = expression2;
        this.f36720g = alpha;
        this.f36721h = divFadeTransition;
        this.f36722i = divAspect;
        this.f36723j = list2;
        this.f36724k = border;
        this.f36725l = expression3;
        this.f36726m = contentAlignmentHorizontal;
        this.f36727n = contentAlignmentVertical;
        this.f36728o = list3;
        this.f36729p = list4;
        this.f36730q = list5;
        this.f36731r = list6;
        this.f36732s = divFocus;
        this.f36733t = height;
        this.f36734u = highPriorityPreviewShow;
        this.f36735v = str;
        this.f36736w = imageUrl;
        this.f36737x = list7;
        this.f36738y = margins;
        this.f36739z = paddings;
        this.f36696A = placeholderColor;
        this.f36697B = preloadRequired;
        this.f36698C = expression4;
        this.f36699D = expression5;
        this.f36700E = scale;
        this.f36701F = list8;
        this.f36702G = expression6;
        this.f36703H = tintMode;
        this.f36704I = list9;
        this.f36705J = transform;
        this.f36706K = divChangeTransition;
        this.f36707L = divAppearanceTransition;
        this.f36708M = divAppearanceTransition2;
        this.f36709N = list10;
        this.f36710O = visibility;
        this.f36711P = divVisibilityAction;
        this.f36712Q = list11;
        this.f36713R = width;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: a, reason: from getter */
    public DivSize getF36479r() {
        return this.f36733t;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: b, reason: from getter */
    public DivTransform getF36453A() {
        return this.f36705J;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: c */
    public List<DivVisibilityAction> mo17569c() {
        return this.f36712Q;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: d */
    public List<DivBackground> mo17570d() {
        return this.f36723j;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: e, reason: from getter */
    public DivAccessibility getF36462a() {
        return this.f36714a;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: f */
    public Expression<Long> mo17572f() {
        return this.f36725l;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: g, reason: from getter */
    public DivSize getF36461I() {
        return this.f36713R;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: getBorder, reason: from getter */
    public DivBorder getF36470i() {
        return this.f36724k;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: getId, reason: from getter */
    public String getF36480s() {
        return this.f36735v;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    public Expression<DivVisibility> getVisibility() {
        return this.f36710O;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: h, reason: from getter */
    public DivEdgeInsets getF36483v() {
        return this.f36738y;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: i */
    public Expression<Long> mo17575i() {
        return this.f36699D;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: j, reason: from getter */
    public DivEdgeInsets getF36484w() {
        return this.f36739z;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: k */
    public List<DivTransitionTrigger> mo17577k() {
        return this.f36709N;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: l */
    public List<DivAction> mo17578l() {
        return this.f36701F;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: m */
    public Expression<DivAlignmentHorizontal> mo17579m() {
        return this.f36718e;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: n */
    public List<DivExtension> mo17580n() {
        return this.f36730q;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: o */
    public List<DivTooltip> mo17581o() {
        return this.f36704I;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: p, reason: from getter */
    public DivVisibilityAction getF36459G() {
        return this.f36711P;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: q */
    public Expression<DivAlignmentVertical> mo17583q() {
        return this.f36719f;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: r, reason: from getter */
    public DivAppearanceTransition getF36455C() {
        return this.f36707L;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: s */
    public Expression<Double> mo17585s() {
        return this.f36720g;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: t, reason: from getter */
    public DivFocus getF36478q() {
        return this.f36732s;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: u, reason: from getter */
    public DivAppearanceTransition getF36456D() {
        return this.f36708M;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: v, reason: from getter */
    public DivChangeTransition getF36454B() {
        return this.f36706K;
    }
}
