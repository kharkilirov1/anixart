package com.yandex.div2;

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
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivChangeTransition;
import com.yandex.div2.DivDisappearAction;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivExtension;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivFontFamily;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivInput;
import com.yandex.div2.DivInputMask;
import com.yandex.div2.DivInputValidator;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivTooltip;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
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

/* compiled from: DivInput.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div2/DivInput;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div2/DivBase;", "Companion", "KeyboardType", "NativeInterface", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivInput implements JSONSerializable, DivBase {

    /* renamed from: A0 */
    @NotNull
    public static final ValueValidator<Long> f37279A0;

    /* renamed from: B0 */
    @NotNull
    public static final ValueValidator<Long> f37280B0;

    /* renamed from: C0 */
    @NotNull
    public static final ListValidator<DivAction> f37281C0;

    /* renamed from: D0 */
    @NotNull
    public static final ValueValidator<String> f37282D0;

    /* renamed from: E0 */
    @NotNull
    public static final ListValidator<DivTooltip> f37283E0;

    /* renamed from: F0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f37284F0;

    /* renamed from: G0 */
    @NotNull
    public static final ListValidator<DivInputValidator> f37285G0;

    /* renamed from: H0 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f37286H0;

    /* renamed from: R */
    @NotNull
    public static final Companion f37287R = new Companion(null);

    /* renamed from: S */
    @NotNull
    public static final DivAccessibility f37288S;

    /* renamed from: T */
    @NotNull
    public static final Expression<Double> f37289T;

    /* renamed from: U */
    @NotNull
    public static final DivBorder f37290U;

    /* renamed from: V */
    @NotNull
    public static final Expression<DivFontFamily> f37291V;

    /* renamed from: W */
    @NotNull
    public static final Expression<Long> f37292W;

    /* renamed from: X */
    @NotNull
    public static final Expression<DivSizeUnit> f37293X;

    /* renamed from: Y */
    @NotNull
    public static final Expression<DivFontWeight> f37294Y;

    /* renamed from: Z */
    @NotNull
    public static final DivSize.WrapContent f37295Z;

    /* renamed from: a0 */
    @NotNull
    public static final Expression<Integer> f37296a0;

    /* renamed from: b0 */
    @NotNull
    public static final Expression<KeyboardType> f37297b0;

    /* renamed from: c0 */
    @NotNull
    public static final Expression<Double> f37298c0;

    /* renamed from: d0 */
    @NotNull
    public static final DivEdgeInsets f37299d0;

    /* renamed from: e0 */
    @NotNull
    public static final DivEdgeInsets f37300e0;

    /* renamed from: f0 */
    @NotNull
    public static final Expression<Boolean> f37301f0;

    /* renamed from: g0 */
    @NotNull
    public static final Expression<Integer> f37302g0;

    /* renamed from: h0 */
    @NotNull
    public static final DivTransform f37303h0;

    /* renamed from: i0 */
    @NotNull
    public static final Expression<DivVisibility> f37304i0;

    /* renamed from: j0 */
    @NotNull
    public static final DivSize.MatchParent f37305j0;

    /* renamed from: k0 */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f37306k0;

    /* renamed from: l0 */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f37307l0;

    /* renamed from: m0 */
    @NotNull
    public static final TypeHelper<DivFontFamily> f37308m0;

    /* renamed from: n0 */
    @NotNull
    public static final TypeHelper<DivSizeUnit> f37309n0;

    /* renamed from: o0 */
    @NotNull
    public static final TypeHelper<DivFontWeight> f37310o0;

    /* renamed from: p0 */
    @NotNull
    public static final TypeHelper<KeyboardType> f37311p0;

    /* renamed from: q0 */
    @NotNull
    public static final TypeHelper<DivVisibility> f37312q0;

    /* renamed from: r0 */
    @NotNull
    public static final ValueValidator<Double> f37313r0;

    /* renamed from: s0 */
    @NotNull
    public static final ListValidator<DivBackground> f37314s0;

    /* renamed from: t0 */
    @NotNull
    public static final ValueValidator<Long> f37315t0;

    /* renamed from: u0 */
    @NotNull
    public static final ListValidator<DivDisappearAction> f37316u0;

    /* renamed from: v0 */
    @NotNull
    public static final ListValidator<DivExtension> f37317v0;

    /* renamed from: w0 */
    @NotNull
    public static final ValueValidator<Long> f37318w0;

    /* renamed from: x0 */
    @NotNull
    public static final ValueValidator<String> f37319x0;

    /* renamed from: y0 */
    @NotNull
    public static final ValueValidator<String> f37320y0;

    /* renamed from: z0 */
    @NotNull
    public static final ValueValidator<Long> f37321z0;

    /* renamed from: A */
    @NotNull
    public final DivEdgeInsets f37322A;

    /* renamed from: B */
    @Nullable
    public final Expression<Long> f37323B;

    /* renamed from: C */
    @JvmField
    @NotNull
    public final Expression<Boolean> f37324C;

    /* renamed from: D */
    @Nullable
    public final List<DivAction> f37325D;

    /* renamed from: E */
    @JvmField
    @NotNull
    public final Expression<Integer> f37326E;

    /* renamed from: F */
    @JvmField
    @NotNull
    public final String f37327F;

    /* renamed from: G */
    @Nullable
    public final List<DivTooltip> f37328G;

    /* renamed from: H */
    @NotNull
    public final DivTransform f37329H;

    /* renamed from: I */
    @Nullable
    public final DivChangeTransition f37330I;

    /* renamed from: J */
    @Nullable
    public final DivAppearanceTransition f37331J;

    /* renamed from: K */
    @Nullable
    public final DivAppearanceTransition f37332K;

    /* renamed from: L */
    @Nullable
    public final List<DivTransitionTrigger> f37333L;

    /* renamed from: M */
    @JvmField
    @Nullable
    public final List<DivInputValidator> f37334M;

    /* renamed from: N */
    @NotNull
    public final Expression<DivVisibility> f37335N;

    /* renamed from: O */
    @Nullable
    public final DivVisibilityAction f37336O;

    /* renamed from: P */
    @Nullable
    public final List<DivVisibilityAction> f37337P;

    /* renamed from: Q */
    @NotNull
    public final DivSize f37338Q;

    /* renamed from: a */
    @NotNull
    public final DivAccessibility f37339a;

    /* renamed from: b */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f37340b;

    /* renamed from: c */
    @Nullable
    public final Expression<DivAlignmentVertical> f37341c;

    /* renamed from: d */
    @NotNull
    public final Expression<Double> f37342d;

    /* renamed from: e */
    @Nullable
    public final List<DivBackground> f37343e;

    /* renamed from: f */
    @NotNull
    public final DivBorder f37344f;

    /* renamed from: g */
    @Nullable
    public final Expression<Long> f37345g;

    /* renamed from: h */
    @Nullable
    public final List<DivDisappearAction> f37346h;

    /* renamed from: i */
    @Nullable
    public final List<DivExtension> f37347i;

    /* renamed from: j */
    @Nullable
    public final DivFocus f37348j;

    /* renamed from: k */
    @JvmField
    @NotNull
    public final Expression<DivFontFamily> f37349k;

    /* renamed from: l */
    @JvmField
    @NotNull
    public final Expression<Long> f37350l;

    /* renamed from: m */
    @JvmField
    @NotNull
    public final Expression<DivSizeUnit> f37351m;

    /* renamed from: n */
    @JvmField
    @NotNull
    public final Expression<DivFontWeight> f37352n;

    /* renamed from: o */
    @NotNull
    public final DivSize f37353o;

    /* renamed from: p */
    @JvmField
    @Nullable
    public final Expression<Integer> f37354p;

    /* renamed from: q */
    @JvmField
    @NotNull
    public final Expression<Integer> f37355q;

    /* renamed from: r */
    @JvmField
    @Nullable
    public final Expression<String> f37356r;

    /* renamed from: s */
    @Nullable
    public final String f37357s;

    /* renamed from: t */
    @JvmField
    @NotNull
    public final Expression<KeyboardType> f37358t;

    /* renamed from: u */
    @JvmField
    @NotNull
    public final Expression<Double> f37359u;

    /* renamed from: v */
    @JvmField
    @Nullable
    public final Expression<Long> f37360v;

    /* renamed from: w */
    @NotNull
    public final DivEdgeInsets f37361w;

    /* renamed from: x */
    @JvmField
    @Nullable
    public final DivInputMask f37362x;

    /* renamed from: y */
    @JvmField
    @Nullable
    public final Expression<Long> f37363y;

    /* renamed from: z */
    @JvmField
    @Nullable
    public final NativeInterface f37364z;

    /* compiled from: DivInput.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u000bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u000bR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\bR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\bR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u000bR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020)0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u000bR\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020)0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u000bR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020)0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u000bR\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\bR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\bR\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u000bR\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u000bR\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u000bR\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\u000bR\u0014\u00108\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00105R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\u000bR\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\u000bR\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\u0010R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010\bR\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020'0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\bR\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020)0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\u000bR\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020)0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010\u000bR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010\u0010R\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010\u0010R\u0014\u0010I\u001a\u00020)8\u0006X\u0086T¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020L0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020O0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010NR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u001b0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010NR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\u001f0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010NR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020\"0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010NR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020.0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010NR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020U0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010NR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020W0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010\u0010R\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010\u0010R\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020U0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\bR\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^¨\u0006_"}, m31884d2 = {"Lcom/yandex/div2/DivInput$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/DivFontFamily;", "FONT_FAMILY_DEFAULT_VALUE", "FONT_SIZE_DEFAULT_VALUE", "FONT_SIZE_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivSizeUnit;", "FONT_SIZE_UNIT_DEFAULT_VALUE", "FONT_SIZE_VALIDATOR", "Lcom/yandex/div2/DivFontWeight;", "FONT_WEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "", "HINT_COLOR_DEFAULT_VALUE", "", "HINT_TEXT_TEMPLATE_VALIDATOR", "HINT_TEXT_VALIDATOR", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div2/DivInput$KeyboardType;", "KEYBOARD_TYPE_DEFAULT_VALUE", "LETTER_SPACING_DEFAULT_VALUE", "LINE_HEIGHT_TEMPLATE_VALIDATOR", "LINE_HEIGHT_VALIDATOR", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "MAX_VISIBLE_LINES_TEMPLATE_VALIDATOR", "MAX_VISIBLE_LINES_VALIDATOR", "PADDINGS_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "Lcom/yandex/div2/DivAction;", "SELECTED_ACTIONS_VALIDATOR", "", "SELECT_ALL_ON_FOCUS_DEFAULT_VALUE", "TEXT_COLOR_DEFAULT_VALUE", "TEXT_VARIABLE_TEMPLATE_VALIDATOR", "TEXT_VARIABLE_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "TYPE_HELPER_FONT_FAMILY", "TYPE_HELPER_FONT_SIZE_UNIT", "TYPE_HELPER_FONT_WEIGHT", "TYPE_HELPER_KEYBOARD_TYPE", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/DivInputValidator;", "VALIDATORS_VALIDATOR", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivInput m17639a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            DivAccessibility.Companion companion = DivAccessibility.f34479f;
            DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject, "accessibility", DivAccessibility.f34486m, f34328a, parsingEnvironment);
            if (divAccessibility == null) {
                divAccessibility = DivInput.f37288S;
            }
            DivAccessibility divAccessibility2 = divAccessibility;
            Intrinsics.m32178g(divAccessibility2, "JsonParser.readOptional(…CESSIBILITY_DEFAULT_VALUE");
            DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
            Expression m17329u = JsonParser.m17329u(jSONObject, "alignment_horizontal", DivAlignmentHorizontal.f34618d, f34328a, parsingEnvironment, DivInput.f37306k0);
            DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
            Expression m17329u2 = JsonParser.m17329u(jSONObject, "alignment_vertical", DivAlignmentVertical.f34626d, f34328a, parsingEnvironment, DivInput.f37307l0);
            Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
            ValueValidator<Double> valueValidator = DivInput.f37313r0;
            Expression<Double> expression = DivInput.f37289T;
            TypeHelper<Double> typeHelper = TypeHelpersKt.f33851d;
            Expression<Double> m17328t = JsonParser.m17328t(jSONObject, "alpha", function1, valueValidator, f34328a, expression, typeHelper);
            if (m17328t != null) {
                expression = m17328t;
            }
            DivBackground.Companion companion2 = DivBackground.f34750a;
            List m17333y = JsonParser.m17333y(jSONObject, "background", DivBackground.f34751b, DivInput.f37314s0, f34328a, parsingEnvironment);
            DivBorder.Companion companion3 = DivBorder.f34785f;
            DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject, "border", DivBorder.f34788i, f34328a, parsingEnvironment);
            if (divBorder == null) {
                divBorder = DivInput.f37290U;
            }
            DivBorder divBorder2 = divBorder;
            Intrinsics.m32178g(divBorder2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            Function1<Number, Long> function12 = ParsingConvertersKt.f33831e;
            ValueValidator<Long> valueValidator2 = DivInput.f37315t0;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.f33849b;
            Expression m17327s = JsonParser.m17327s(jSONObject, "column_span", function12, valueValidator2, f34328a, parsingEnvironment, typeHelper2);
            DivDisappearAction.Companion companion4 = DivDisappearAction.f35537a;
            List m17333y2 = JsonParser.m17333y(jSONObject, "disappear_actions", DivDisappearAction.f35545i, DivInput.f37316u0, f34328a, parsingEnvironment);
            DivExtension.Companion companion5 = DivExtension.f35659c;
            List m17333y3 = JsonParser.m17333y(jSONObject, "extensions", DivExtension.f35660d, DivInput.f37317v0, f34328a, parsingEnvironment);
            DivFocus.Companion companion6 = DivFocus.f35813f;
            DivFocus divFocus = (DivFocus) JsonParser.m17322n(jSONObject, "focus", DivFocus.f35818k, f34328a, parsingEnvironment);
            DivFontFamily.Converter converter3 = DivFontFamily.f35876c;
            Function1<String, DivFontFamily> function13 = DivFontFamily.f35877d;
            Expression<DivFontFamily> expression2 = DivInput.f37291V;
            Expression<DivFontFamily> m17330v = JsonParser.m17330v(jSONObject, "font_family", function13, f34328a, parsingEnvironment, expression2, DivInput.f37308m0);
            if (m17330v != null) {
                expression2 = m17330v;
            }
            ValueValidator<Long> valueValidator3 = DivInput.f37318w0;
            Expression<Long> expression3 = DivInput.f37292W;
            Expression<Long> m17328t2 = JsonParser.m17328t(jSONObject, "font_size", function12, valueValidator3, f34328a, expression3, typeHelper2);
            if (m17328t2 != null) {
                expression3 = m17328t2;
            }
            DivSizeUnit.Converter converter4 = DivSizeUnit.f38845c;
            Function1<String, DivSizeUnit> function14 = DivSizeUnit.f38846d;
            Expression<DivSizeUnit> expression4 = DivInput.f37293X;
            Expression<DivSizeUnit> m17330v2 = JsonParser.m17330v(jSONObject, "font_size_unit", function14, f34328a, parsingEnvironment, expression4, DivInput.f37309n0);
            if (m17330v2 != null) {
                expression4 = m17330v2;
            }
            DivFontWeight.Converter converter5 = DivFontWeight.f35883c;
            Function1<String, DivFontWeight> function15 = DivFontWeight.f35884d;
            Expression<DivFontWeight> expression5 = DivInput.f37294Y;
            Expression<DivFontWeight> m17330v3 = JsonParser.m17330v(jSONObject, "font_weight", function15, f34328a, parsingEnvironment, expression5, DivInput.f37310o0);
            if (m17330v3 != null) {
                expression5 = m17330v3;
            }
            DivSize.Companion companion7 = DivSize.f38833a;
            Function2<ParsingEnvironment, JSONObject, DivSize> function2 = DivSize.f38834b;
            DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject, "height", function2, f34328a, parsingEnvironment);
            if (divSize == null) {
                divSize = DivInput.f37295Z;
            }
            DivSize divSize2 = divSize;
            Intrinsics.m32178g(divSize2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            Function1<Object, Integer> function16 = ParsingConvertersKt.f33827a;
            TypeHelper<Integer> typeHelper3 = TypeHelpersKt.f33853f;
            Expression m17329u3 = JsonParser.m17329u(jSONObject, "highlight_color", function16, f34328a, parsingEnvironment, typeHelper3);
            Expression<Integer> expression6 = DivInput.f37296a0;
            Expression<Double> expression7 = expression;
            Expression<Integer> m17330v4 = JsonParser.m17330v(jSONObject, "hint_color", function16, f34328a, parsingEnvironment, expression6, typeHelper3);
            if (m17330v4 != null) {
                expression6 = m17330v4;
            }
            Expression m17325q = JsonParser.m17325q(jSONObject, "hint_text", DivInput.f37319x0, f34328a, parsingEnvironment, TypeHelpersKt.f33850c);
            String str = (String) JsonParser.m17323o(jSONObject, "id", DivInput.f37320y0, f34328a, parsingEnvironment);
            KeyboardType.Converter converter6 = KeyboardType.f37373c;
            Function1<String, KeyboardType> function17 = KeyboardType.f37374d;
            Expression<KeyboardType> expression8 = DivInput.f37297b0;
            Expression<KeyboardType> m17330v5 = JsonParser.m17330v(jSONObject, "keyboard_type", function17, f34328a, parsingEnvironment, expression8, DivInput.f37311p0);
            if (m17330v5 != null) {
                expression8 = m17330v5;
            }
            Expression<Double> expression9 = DivInput.f37298c0;
            Expression<Double> m17330v6 = JsonParser.m17330v(jSONObject, "letter_spacing", function1, f34328a, parsingEnvironment, expression9, typeHelper);
            if (m17330v6 != null) {
                expression9 = m17330v6;
            }
            Expression m17327s2 = JsonParser.m17327s(jSONObject, "line_height", function12, DivInput.f37321z0, f34328a, parsingEnvironment, typeHelper2);
            DivEdgeInsets.Companion companion8 = DivEdgeInsets.f35607f;
            Function2<ParsingEnvironment, JSONObject, DivEdgeInsets> function22 = DivEdgeInsets.f35618q;
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "margins", function22, f34328a, parsingEnvironment);
            if (divEdgeInsets == null) {
                divEdgeInsets = DivInput.f37299d0;
            }
            DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
            Intrinsics.m32178g(divEdgeInsets2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            DivInputMask.Companion companion9 = DivInputMask.f37388a;
            DivInputMask divInputMask = (DivInputMask) JsonParser.m17322n(jSONObject, "mask", DivInputMask.f37389b, f34328a, parsingEnvironment);
            Expression m17327s3 = JsonParser.m17327s(jSONObject, "max_visible_lines", function12, DivInput.f37279A0, f34328a, parsingEnvironment, typeHelper2);
            NativeInterface.Companion companion10 = NativeInterface.f37384b;
            NativeInterface nativeInterface = (NativeInterface) JsonParser.m17322n(jSONObject, "native_interface", NativeInterface.f37385c, f34328a, parsingEnvironment);
            DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "paddings", function22, f34328a, parsingEnvironment);
            if (divEdgeInsets3 == null) {
                divEdgeInsets3 = DivInput.f37300e0;
            }
            DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
            Intrinsics.m32178g(divEdgeInsets4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            Expression m17327s4 = JsonParser.m17327s(jSONObject, "row_span", function12, DivInput.f37280B0, f34328a, parsingEnvironment, typeHelper2);
            Function1<Object, Boolean> function18 = ParsingConvertersKt.f33829c;
            Expression<Boolean> expression10 = DivInput.f37301f0;
            Expression<Boolean> m17330v7 = JsonParser.m17330v(jSONObject, "select_all_on_focus", function18, f34328a, parsingEnvironment, expression10, TypeHelpersKt.f33848a);
            Expression<Boolean> expression11 = m17330v7 == null ? expression10 : m17330v7;
            DivAction.Companion companion11 = DivAction.f34546g;
            List m17333y4 = JsonParser.m17333y(jSONObject, "selected_actions", DivAction.f34550k, DivInput.f37281C0, f34328a, parsingEnvironment);
            Expression<Integer> expression12 = DivInput.f37302g0;
            Expression<Integer> m17330v8 = JsonParser.m17330v(jSONObject, "text_color", function16, f34328a, parsingEnvironment, expression12, typeHelper3);
            Expression<Integer> expression13 = m17330v8 == null ? expression12 : m17330v8;
            String str2 = (String) JsonParser.m17311c(jSONObject, "text_variable", DivInput.f37282D0, f34328a, parsingEnvironment);
            DivTooltip.Companion companion12 = DivTooltip.f40492h;
            List m17333y5 = JsonParser.m17333y(jSONObject, "tooltips", DivTooltip.f40497m, DivInput.f37283E0, f34328a, parsingEnvironment);
            DivTransform.Companion companion13 = DivTransform.f40551d;
            DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject, "transform", DivTransform.f40554g, f34328a, parsingEnvironment);
            if (divTransform == null) {
                divTransform = DivInput.f37303h0;
            }
            DivTransform divTransform2 = divTransform;
            Intrinsics.m32178g(divTransform2, "JsonParser.readOptional(…: TRANSFORM_DEFAULT_VALUE");
            DivChangeTransition.Companion companion14 = DivChangeTransition.f34856a;
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonParser.m17322n(jSONObject, "transition_change", DivChangeTransition.f34857b, f34328a, parsingEnvironment);
            DivAppearanceTransition.Companion companion15 = DivAppearanceTransition.f34726a;
            Function2<ParsingEnvironment, JSONObject, DivAppearanceTransition> function23 = DivAppearanceTransition.f34727b;
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonParser.m17322n(jSONObject, "transition_in", function23, f34328a, parsingEnvironment);
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonParser.m17322n(jSONObject, "transition_out", function23, f34328a, parsingEnvironment);
            DivTransitionTrigger.Converter converter7 = DivTransitionTrigger.f40582c;
            List m17332x = JsonParser.m17332x(jSONObject, "transition_triggers", DivTransitionTrigger.f40583d, DivInput.f37284F0, f34328a, parsingEnvironment);
            DivInputValidator.Companion companion16 = DivInputValidator.f37601a;
            List m17333y6 = JsonParser.m17333y(jSONObject, "validators", DivInputValidator.f37602b, DivInput.f37285G0, f34328a, parsingEnvironment);
            DivVisibility.Converter converter8 = DivVisibility.f40930c;
            Function1<String, DivVisibility> function19 = DivVisibility.f40931d;
            Expression<DivVisibility> expression14 = DivInput.f37304i0;
            Expression<DivVisibility> m17330v9 = JsonParser.m17330v(jSONObject, "visibility", function19, f34328a, parsingEnvironment, expression14, DivInput.f37312q0);
            Expression<DivVisibility> expression15 = m17330v9 == null ? expression14 : m17330v9;
            DivVisibilityAction.Companion companion17 = DivVisibilityAction.f40938i;
            Function2<ParsingEnvironment, JSONObject, DivVisibilityAction> function24 = DivVisibilityAction.f40946q;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonParser.m17322n(jSONObject, "visibility_action", function24, f34328a, parsingEnvironment);
            List m17333y7 = JsonParser.m17333y(jSONObject, "visibility_actions", function24, DivInput.f37286H0, f34328a, parsingEnvironment);
            DivSize divSize3 = (DivSize) JsonParser.m17322n(jSONObject, "width", function2, f34328a, parsingEnvironment);
            if (divSize3 == null) {
                divSize3 = DivInput.f37305j0;
            }
            Intrinsics.m32178g(divSize3, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new DivInput(divAccessibility2, m17329u, m17329u2, expression7, m17333y, divBorder2, m17327s, m17333y2, m17333y3, divFocus, expression2, expression3, expression4, expression5, divSize2, m17329u3, expression6, m17325q, str, expression8, expression9, m17327s2, divEdgeInsets2, divInputMask, m17327s3, nativeInterface, divEdgeInsets4, m17327s4, expression11, m17333y4, expression13, str2, m17333y5, divTransform2, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17332x, m17333y6, expression15, divVisibilityAction, m17333y7, divSize3);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivInput.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m31884d2 = {"Lcom/yandex/div2/DivInput$KeyboardType;", "", "Converter", "SINGLE_LINE_TEXT", "MULTI_LINE_TEXT", "PHONE", "NUMBER", "EMAIL", "URI", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public enum KeyboardType {
        SINGLE_LINE_TEXT("single_line_text"),
        MULTI_LINE_TEXT("multi_line_text"),
        PHONE("phone"),
        NUMBER("number"),
        EMAIL("email"),
        URI("uri");


        /* renamed from: c */
        @NotNull
        public static final Converter f37373c = new Converter(null);

        /* renamed from: d */
        @NotNull
        public static final Function1<String, KeyboardType> f37374d = new Function1<String, KeyboardType>() { // from class: com.yandex.div2.DivInput$KeyboardType$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            public DivInput.KeyboardType invoke(String str) {
                String string = str;
                Intrinsics.m32179h(string, "string");
                DivInput.KeyboardType keyboardType = DivInput.KeyboardType.SINGLE_LINE_TEXT;
                if (Intrinsics.m32174c(string, "single_line_text")) {
                    return keyboardType;
                }
                DivInput.KeyboardType keyboardType2 = DivInput.KeyboardType.MULTI_LINE_TEXT;
                if (Intrinsics.m32174c(string, "multi_line_text")) {
                    return keyboardType2;
                }
                DivInput.KeyboardType keyboardType3 = DivInput.KeyboardType.PHONE;
                if (Intrinsics.m32174c(string, "phone")) {
                    return keyboardType3;
                }
                DivInput.KeyboardType keyboardType4 = DivInput.KeyboardType.NUMBER;
                if (Intrinsics.m32174c(string, "number")) {
                    return keyboardType4;
                }
                DivInput.KeyboardType keyboardType5 = DivInput.KeyboardType.EMAIL;
                if (Intrinsics.m32174c(string, "email")) {
                    return keyboardType5;
                }
                DivInput.KeyboardType keyboardType6 = DivInput.KeyboardType.URI;
                if (Intrinsics.m32174c(string, "uri")) {
                    return keyboardType6;
                }
                return null;
            }
        };

        /* renamed from: b */
        @NotNull
        public final String f37382b;

        /* compiled from: DivInput.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivInput$KeyboardType$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Converter {
            public Converter() {
            }

            public Converter(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        KeyboardType(String str) {
            this.f37382b = str;
        }
    }

    /* compiled from: DivInput.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivInput$NativeInterface;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class NativeInterface implements JSONSerializable {

        /* renamed from: b */
        @NotNull
        public static final Companion f37384b = new Companion(null);

        /* renamed from: c */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, NativeInterface> f37385c = new Function2<ParsingEnvironment, JSONObject, NativeInterface>() { // from class: com.yandex.div2.DivInput$NativeInterface$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivInput.NativeInterface invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                DivInput.NativeInterface.Companion companion = DivInput.NativeInterface.f37384b;
                return new DivInput.NativeInterface(JsonParser.m17317i(it, "color", ParsingConvertersKt.f33827a, env.getF34328a(), env, TypeHelpersKt.f33853f));
            }
        };

        /* renamed from: a */
        @JvmField
        @NotNull
        public final Expression<Integer> f37386a;

        /* compiled from: DivInput.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivInput$NativeInterface$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        @DivModelInternalApi
        public NativeInterface(@NotNull Expression<Integer> color) {
            Intrinsics.m32179h(color, "color");
            this.f37386a = color;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression expression = null;
        Expression expression2 = null;
        f37288S = new DivAccessibility(null, expression, null, expression2, null, null, 63);
        Expression.Companion companion = Expression.f34334a;
        f37289T = companion.m17539a(Double.valueOf(1.0d));
        f37290U = new DivBorder(expression, null == true ? 1 : 0, expression2, null == true ? 1 : 0, null == true ? 1 : 0, 31);
        f37291V = companion.m17539a(DivFontFamily.TEXT);
        f37292W = companion.m17539a(12L);
        f37293X = companion.m17539a(DivSizeUnit.SP);
        f37294Y = companion.m17539a(DivFontWeight.REGULAR);
        int i2 = 7;
        f37295Z = new DivSize.WrapContent(new DivWrapContentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, i2));
        f37296a0 = companion.m17539a(1929379840);
        f37297b0 = companion.m17539a(KeyboardType.MULTI_LINE_TEXT);
        f37298c0 = companion.m17539a(Double.valueOf(0.0d));
        f37299d0 = new DivEdgeInsets(expression2, null == true ? 1 : 0, null == true ? 1 : 0, null, null, 31);
        f37300e0 = new DivEdgeInsets(null, null, null, null, null, 31);
        f37301f0 = companion.m17539a(Boolean.FALSE);
        f37302g0 = companion.m17539a(-16777216);
        f37303h0 = new DivTransform(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, i2);
        f37304i0 = companion.m17539a(DivVisibility.VISIBLE);
        f37305j0 = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i3 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f37306k0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivInput$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f37307l0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivInput$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f37308m0 = companion2.m17372a(ArraysKt.m31926B(DivFontFamily.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivInput$Companion$TYPE_HELPER_FONT_FAMILY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivFontFamily);
            }
        });
        f37309n0 = companion2.m17372a(ArraysKt.m31926B(DivSizeUnit.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivInput$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivSizeUnit);
            }
        });
        f37310o0 = companion2.m17372a(ArraysKt.m31926B(DivFontWeight.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivInput$Companion$TYPE_HELPER_FONT_WEIGHT$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivFontWeight);
            }
        });
        f37311p0 = companion2.m17372a(ArraysKt.m31926B(KeyboardType.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivInput$Companion$TYPE_HELPER_KEYBOARD_TYPE$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivInput.KeyboardType);
            }
        });
        f37312q0 = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivInput$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f37313r0 = C3071t.f42059x;
        f37314s0 = C3072u.f42077m;
        f37315t0 = C3073v.f42093d;
        f37316u0 = C3072u.f42078n;
        f37317v0 = C3072u.f42079o;
        f37318w0 = C3073v.f42094e;
        f37319x0 = C3071t.f42054s;
        f37320y0 = C3071t.f42055t;
        f37321z0 = C3071t.f42056u;
        f37279A0 = C3071t.f42057v;
        f37280B0 = C3071t.f42058w;
        f37281C0 = C3072u.f42072h;
        f37282D0 = C3073v.f42092c;
        f37283E0 = C3072u.f42073i;
        f37284F0 = C3072u.f42074j;
        f37285G0 = C3072u.f42075k;
        f37286H0 = C3072u.f42076l;
        DivInput$Companion$CREATOR$1 divInput$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivInput>() { // from class: com.yandex.div2.DivInput$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivInput invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivInput.f37287R.m17639a(env, it);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @DivModelInternalApi
    public DivInput(@NotNull DivAccessibility accessibility, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> alpha, @Nullable List<? extends DivBackground> list, @NotNull DivBorder border, @Nullable Expression<Long> expression3, @Nullable List<? extends DivDisappearAction> list2, @Nullable List<? extends DivExtension> list3, @Nullable DivFocus divFocus, @NotNull Expression<DivFontFamily> fontFamily, @NotNull Expression<Long> fontSize, @NotNull Expression<DivSizeUnit> fontSizeUnit, @NotNull Expression<DivFontWeight> fontWeight, @NotNull DivSize height, @Nullable Expression<Integer> expression4, @NotNull Expression<Integer> hintColor, @Nullable Expression<String> expression5, @Nullable String str, @NotNull Expression<KeyboardType> keyboardType, @NotNull Expression<Double> letterSpacing, @Nullable Expression<Long> expression6, @NotNull DivEdgeInsets margins, @Nullable DivInputMask divInputMask, @Nullable Expression<Long> expression7, @Nullable NativeInterface nativeInterface, @NotNull DivEdgeInsets paddings, @Nullable Expression<Long> expression8, @NotNull Expression<Boolean> selectAllOnFocus, @Nullable List<? extends DivAction> list4, @NotNull Expression<Integer> textColor, @NotNull String textVariable, @Nullable List<? extends DivTooltip> list5, @NotNull DivTransform transform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list6, @Nullable List<? extends DivInputValidator> list7, @NotNull Expression<DivVisibility> visibility, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<? extends DivVisibilityAction> list8, @NotNull DivSize width) {
        Intrinsics.m32179h(accessibility, "accessibility");
        Intrinsics.m32179h(alpha, "alpha");
        Intrinsics.m32179h(border, "border");
        Intrinsics.m32179h(fontFamily, "fontFamily");
        Intrinsics.m32179h(fontSize, "fontSize");
        Intrinsics.m32179h(fontSizeUnit, "fontSizeUnit");
        Intrinsics.m32179h(fontWeight, "fontWeight");
        Intrinsics.m32179h(height, "height");
        Intrinsics.m32179h(hintColor, "hintColor");
        Intrinsics.m32179h(keyboardType, "keyboardType");
        Intrinsics.m32179h(letterSpacing, "letterSpacing");
        Intrinsics.m32179h(margins, "margins");
        Intrinsics.m32179h(paddings, "paddings");
        Intrinsics.m32179h(selectAllOnFocus, "selectAllOnFocus");
        Intrinsics.m32179h(textColor, "textColor");
        Intrinsics.m32179h(textVariable, "textVariable");
        Intrinsics.m32179h(transform, "transform");
        Intrinsics.m32179h(visibility, "visibility");
        Intrinsics.m32179h(width, "width");
        this.f37339a = accessibility;
        this.f37340b = expression;
        this.f37341c = expression2;
        this.f37342d = alpha;
        this.f37343e = list;
        this.f37344f = border;
        this.f37345g = expression3;
        this.f37346h = list2;
        this.f37347i = list3;
        this.f37348j = divFocus;
        this.f37349k = fontFamily;
        this.f37350l = fontSize;
        this.f37351m = fontSizeUnit;
        this.f37352n = fontWeight;
        this.f37353o = height;
        this.f37354p = expression4;
        this.f37355q = hintColor;
        this.f37356r = expression5;
        this.f37357s = str;
        this.f37358t = keyboardType;
        this.f37359u = letterSpacing;
        this.f37360v = expression6;
        this.f37361w = margins;
        this.f37362x = divInputMask;
        this.f37363y = expression7;
        this.f37364z = nativeInterface;
        this.f37322A = paddings;
        this.f37323B = expression8;
        this.f37324C = selectAllOnFocus;
        this.f37325D = list4;
        this.f37326E = textColor;
        this.f37327F = textVariable;
        this.f37328G = list5;
        this.f37329H = transform;
        this.f37330I = divChangeTransition;
        this.f37331J = divAppearanceTransition;
        this.f37332K = divAppearanceTransition2;
        this.f37333L = list6;
        this.f37334M = list7;
        this.f37335N = visibility;
        this.f37336O = divVisibilityAction;
        this.f37337P = list8;
        this.f37338Q = width;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: a, reason: from getter */
    public DivSize getF37074o() {
        return this.f37353o;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: b, reason: from getter */
    public DivTransform getF37051D() {
        return this.f37329H;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: c */
    public List<DivVisibilityAction> mo17569c() {
        return this.f37337P;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: d */
    public List<DivBackground> mo17570d() {
        return this.f37343e;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: e, reason: from getter */
    public DivAccessibility getF37060a() {
        return this.f37339a;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: f */
    public Expression<Long> mo17572f() {
        return this.f37345g;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: g, reason: from getter */
    public DivSize getF37059L() {
        return this.f37338Q;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: getBorder, reason: from getter */
    public DivBorder getF37069j() {
        return this.f37344f;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: getId, reason: from getter */
    public String getF37075p() {
        return this.f37357s;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    public Expression<DivVisibility> getVisibility() {
        return this.f37335N;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: h, reason: from getter */
    public DivEdgeInsets getF37080u() {
        return this.f37361w;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: i */
    public Expression<Long> mo17575i() {
        return this.f37323B;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: j, reason: from getter */
    public DivEdgeInsets getF37082w() {
        return this.f37322A;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: k */
    public List<DivTransitionTrigger> mo17577k() {
        return this.f37333L;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: l */
    public List<DivAction> mo17578l() {
        return this.f37325D;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: m */
    public Expression<DivAlignmentHorizontal> mo17579m() {
        return this.f37340b;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: n */
    public List<DivExtension> mo17580n() {
        return this.f37347i;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: o */
    public List<DivTooltip> mo17581o() {
        return this.f37328G;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: p, reason: from getter */
    public DivVisibilityAction getF37057J() {
        return this.f37336O;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: q */
    public Expression<DivAlignmentVertical> mo17583q() {
        return this.f37341c;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: r, reason: from getter */
    public DivAppearanceTransition getF37053F() {
        return this.f37331J;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: s */
    public Expression<Double> mo17585s() {
        return this.f37342d;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: t, reason: from getter */
    public DivFocus getF37073n() {
        return this.f37348j;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: u, reason: from getter */
    public DivAppearanceTransition getF37054G() {
        return this.f37332K;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: v, reason: from getter */
    public DivChangeTransition getF37052E() {
        return this.f37330I;
    }
}
