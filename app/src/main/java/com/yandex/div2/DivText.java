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
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivBlendMode;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivChangeTransition;
import com.yandex.div2.DivDisappearAction;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivExtension;
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivFontFamily;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivLineStyle;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivText;
import com.yandex.div2.DivTextGradient;
import com.yandex.div2.DivTextRangeBackground;
import com.yandex.div2.DivTextRangeBorder;
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

/* compiled from: DivText.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivText;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div2/DivBase;", "Companion", "Ellipsis", "Image", "Range", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivText implements JSONSerializable, DivBase {

    /* renamed from: A0 */
    @NotNull
    public static final TypeHelper<DivFontWeight> f39883A0;

    /* renamed from: B0 */
    @NotNull
    public static final TypeHelper<DivLineStyle> f39884B0;

    /* renamed from: C0 */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f39885C0;

    /* renamed from: D0 */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f39886D0;

    /* renamed from: E0 */
    @NotNull
    public static final TypeHelper<DivLineStyle> f39887E0;

    /* renamed from: F0 */
    @NotNull
    public static final TypeHelper<DivVisibility> f39888F0;

    /* renamed from: G0 */
    @NotNull
    public static final ListValidator<DivAction> f39889G0;

    /* renamed from: H0 */
    @NotNull
    public static final ValueValidator<Double> f39890H0;

    /* renamed from: I0 */
    @NotNull
    public static final ListValidator<DivBackground> f39891I0;

    /* renamed from: J0 */
    @NotNull
    public static final ValueValidator<Long> f39892J0;

    /* renamed from: K0 */
    @NotNull
    public static final ListValidator<DivDisappearAction> f39893K0;

    /* renamed from: L0 */
    @NotNull
    public static final ListValidator<DivAction> f39894L0;

    /* renamed from: M0 */
    @NotNull
    public static final ListValidator<DivExtension> f39895M0;

    /* renamed from: N0 */
    @NotNull
    public static final ValueValidator<Long> f39896N0;

    /* renamed from: O0 */
    @NotNull
    public static final ValueValidator<String> f39897O0;

    /* renamed from: P0 */
    @NotNull
    public static final ListValidator<Image> f39898P0;

    /* renamed from: Q0 */
    @NotNull
    public static final ValueValidator<Long> f39899Q0;

    /* renamed from: R0 */
    @NotNull
    public static final ListValidator<DivAction> f39900R0;

    /* renamed from: S0 */
    @NotNull
    public static final ValueValidator<Long> f39901S0;

    /* renamed from: T0 */
    @NotNull
    public static final ValueValidator<Long> f39902T0;

    /* renamed from: U0 */
    @NotNull
    public static final ListValidator<Range> f39903U0;

    /* renamed from: V0 */
    @NotNull
    public static final ValueValidator<Long> f39904V0;

    /* renamed from: W0 */
    @NotNull
    public static final ListValidator<DivAction> f39905W0;

    /* renamed from: X0 */
    @NotNull
    public static final ValueValidator<String> f39906X0;

    /* renamed from: Y0 */
    @NotNull
    public static final ListValidator<DivTooltip> f39907Y0;

    /* renamed from: Z0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f39908Z0;

    /* renamed from: a0 */
    @NotNull
    public static final Companion f39909a0 = new Companion(null);

    /* renamed from: a1 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f39910a1;

    /* renamed from: b0 */
    @NotNull
    public static final DivAccessibility f39911b0;

    /* renamed from: c0 */
    @NotNull
    public static final DivAnimation f39912c0;

    /* renamed from: d0 */
    @NotNull
    public static final Expression<Double> f39913d0;

    /* renamed from: e0 */
    @NotNull
    public static final DivBorder f39914e0;

    /* renamed from: f0 */
    @NotNull
    public static final Expression<DivFontFamily> f39915f0;

    /* renamed from: g0 */
    @NotNull
    public static final Expression<Long> f39916g0;

    /* renamed from: h0 */
    @NotNull
    public static final Expression<DivSizeUnit> f39917h0;

    /* renamed from: i0 */
    @NotNull
    public static final Expression<DivFontWeight> f39918i0;

    /* renamed from: j0 */
    @NotNull
    public static final DivSize.WrapContent f39919j0;

    /* renamed from: k0 */
    @NotNull
    public static final Expression<Double> f39920k0;

    /* renamed from: l0 */
    @NotNull
    public static final DivEdgeInsets f39921l0;

    /* renamed from: m0 */
    @NotNull
    public static final DivEdgeInsets f39922m0;

    /* renamed from: n0 */
    @NotNull
    public static final Expression<Boolean> f39923n0;

    /* renamed from: o0 */
    @NotNull
    public static final Expression<DivLineStyle> f39924o0;

    /* renamed from: p0 */
    @NotNull
    public static final Expression<DivAlignmentHorizontal> f39925p0;

    /* renamed from: q0 */
    @NotNull
    public static final Expression<DivAlignmentVertical> f39926q0;

    /* renamed from: r0 */
    @NotNull
    public static final Expression<Integer> f39927r0;

    /* renamed from: s0 */
    @NotNull
    public static final DivTransform f39928s0;

    /* renamed from: t0 */
    @NotNull
    public static final Expression<DivLineStyle> f39929t0;

    /* renamed from: u0 */
    @NotNull
    public static final Expression<DivVisibility> f39930u0;

    /* renamed from: v0 */
    @NotNull
    public static final DivSize.MatchParent f39931v0;

    /* renamed from: w0 */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f39932w0;

    /* renamed from: x0 */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f39933x0;

    /* renamed from: y0 */
    @NotNull
    public static final TypeHelper<DivFontFamily> f39934y0;

    /* renamed from: z0 */
    @NotNull
    public static final TypeHelper<DivSizeUnit> f39935z0;

    /* renamed from: A */
    @JvmField
    @Nullable
    public final List<DivAction> f39936A;

    /* renamed from: B */
    @NotNull
    public final DivEdgeInsets f39937B;

    /* renamed from: C */
    @JvmField
    @Nullable
    public final Expression<Long> f39938C;

    /* renamed from: D */
    @JvmField
    @Nullable
    public final Expression<Long> f39939D;

    /* renamed from: E */
    @NotNull
    public final DivEdgeInsets f39940E;

    /* renamed from: F */
    @JvmField
    @Nullable
    public final List<Range> f39941F;

    /* renamed from: G */
    @Nullable
    public final Expression<Long> f39942G;

    /* renamed from: H */
    @JvmField
    @NotNull
    public final Expression<Boolean> f39943H;

    /* renamed from: I */
    @Nullable
    public final List<DivAction> f39944I;

    /* renamed from: J */
    @JvmField
    @NotNull
    public final Expression<DivLineStyle> f39945J;

    /* renamed from: K */
    @JvmField
    @NotNull
    public final Expression<String> f39946K;

    /* renamed from: L */
    @JvmField
    @NotNull
    public final Expression<DivAlignmentHorizontal> f39947L;

    /* renamed from: M */
    @JvmField
    @NotNull
    public final Expression<DivAlignmentVertical> f39948M;

    /* renamed from: N */
    @JvmField
    @NotNull
    public final Expression<Integer> f39949N;

    /* renamed from: O */
    @JvmField
    @Nullable
    public final DivTextGradient f39950O;

    /* renamed from: P */
    @Nullable
    public final List<DivTooltip> f39951P;

    /* renamed from: Q */
    @NotNull
    public final DivTransform f39952Q;

    /* renamed from: R */
    @Nullable
    public final DivChangeTransition f39953R;

    /* renamed from: S */
    @Nullable
    public final DivAppearanceTransition f39954S;

    /* renamed from: T */
    @Nullable
    public final DivAppearanceTransition f39955T;

    /* renamed from: U */
    @Nullable
    public final List<DivTransitionTrigger> f39956U;

    /* renamed from: V */
    @JvmField
    @NotNull
    public final Expression<DivLineStyle> f39957V;

    /* renamed from: W */
    @NotNull
    public final Expression<DivVisibility> f39958W;

    /* renamed from: X */
    @Nullable
    public final DivVisibilityAction f39959X;

    /* renamed from: Y */
    @Nullable
    public final List<DivVisibilityAction> f39960Y;

    /* renamed from: Z */
    @NotNull
    public final DivSize f39961Z;

    /* renamed from: a */
    @NotNull
    public final DivAccessibility f39962a;

    /* renamed from: b */
    @JvmField
    @Nullable
    public final DivAction f39963b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final DivAnimation f39964c;

    /* renamed from: d */
    @JvmField
    @Nullable
    public final List<DivAction> f39965d;

    /* renamed from: e */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f39966e;

    /* renamed from: f */
    @Nullable
    public final Expression<DivAlignmentVertical> f39967f;

    /* renamed from: g */
    @NotNull
    public final Expression<Double> f39968g;

    /* renamed from: h */
    @JvmField
    @Nullable
    public final Expression<Boolean> f39969h;

    /* renamed from: i */
    @Nullable
    public final List<DivBackground> f39970i;

    /* renamed from: j */
    @NotNull
    public final DivBorder f39971j;

    /* renamed from: k */
    @Nullable
    public final Expression<Long> f39972k;

    /* renamed from: l */
    @Nullable
    public final List<DivDisappearAction> f39973l;

    /* renamed from: m */
    @JvmField
    @Nullable
    public final List<DivAction> f39974m;

    /* renamed from: n */
    @JvmField
    @Nullable
    public final Ellipsis f39975n;

    /* renamed from: o */
    @Nullable
    public final List<DivExtension> f39976o;

    /* renamed from: p */
    @Nullable
    public final DivFocus f39977p;

    /* renamed from: q */
    @JvmField
    @Nullable
    public final Expression<Integer> f39978q;

    /* renamed from: r */
    @JvmField
    @NotNull
    public final Expression<DivFontFamily> f39979r;

    /* renamed from: s */
    @JvmField
    @NotNull
    public final Expression<Long> f39980s;

    /* renamed from: t */
    @JvmField
    @NotNull
    public final Expression<DivSizeUnit> f39981t;

    /* renamed from: u */
    @JvmField
    @NotNull
    public final Expression<DivFontWeight> f39982u;

    /* renamed from: v */
    @NotNull
    public final DivSize f39983v;

    /* renamed from: w */
    @Nullable
    public final String f39984w;

    /* renamed from: x */
    @JvmField
    @Nullable
    public final List<Image> f39985x;

    /* renamed from: y */
    @JvmField
    @NotNull
    public final Expression<Double> f39986y;

    /* renamed from: z */
    @JvmField
    @Nullable
    public final Expression<Long> f39987z;

    /* compiled from: DivText.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\bR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\bR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u000fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u000fR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0012R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u000fR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0012R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u000fR\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0012R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020-0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0012R\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\bR\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u000fR\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0012R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0012R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\bR\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0012R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0012R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0012R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\u0012R\u0014\u0010=\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00108R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\bR\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\u0012R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010\u0012R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010\u000fR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010\bR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010\u000fR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010\u000fR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010\u000fR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010\u000fR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020-0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010\u0012R\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020-0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010\u0012R\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020O0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010\bR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020T0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010\bR\u0014\u0010V\u001a\u00020-8\u0006X\u0086T¢\u0006\u0006\n\u0004\bV\u0010WR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020G0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020I0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010ZR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020!0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010ZR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020%0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010ZR\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020(0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010ZR\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020E0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010ZR\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020G0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010ZR\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020I0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010ZR\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020E0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010ZR\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020c0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010ZR\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020E0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010\u000fR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020f0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010\bR\u001a\u0010h\u001a\b\u0012\u0004\u0012\u00020c0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010\u000fR\u0014\u0010j\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010k¨\u0006l"}, m31884d2 = {"Lcom/yandex/div2/DivText$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAction;", "ACTIONS_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAnimation;", "ACTION_ANIMATION_DEFAULT_VALUE", "Lcom/yandex/div2/DivAnimation;", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "DOUBLETAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/DivFontFamily;", "FONT_FAMILY_DEFAULT_VALUE", "FONT_SIZE_DEFAULT_VALUE", "FONT_SIZE_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivSizeUnit;", "FONT_SIZE_UNIT_DEFAULT_VALUE", "FONT_SIZE_VALIDATOR", "Lcom/yandex/div2/DivFontWeight;", "FONT_WEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div2/DivText$Image;", "IMAGES_VALIDATOR", "LETTER_SPACING_DEFAULT_VALUE", "LINE_HEIGHT_TEMPLATE_VALIDATOR", "LINE_HEIGHT_VALIDATOR", "LONGTAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "MAX_LINES_TEMPLATE_VALIDATOR", "MAX_LINES_VALIDATOR", "MIN_HIDDEN_LINES_TEMPLATE_VALIDATOR", "MIN_HIDDEN_LINES_VALIDATOR", "PADDINGS_DEFAULT_VALUE", "Lcom/yandex/div2/DivText$Range;", "RANGES_VALIDATOR", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "", "SELECTABLE_DEFAULT_VALUE", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivLineStyle;", "STRIKE_DEFAULT_VALUE", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TEXT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE", "Lcom/yandex/div2/DivAlignmentVertical;", "TEXT_ALIGNMENT_VERTICAL_DEFAULT_VALUE", "", "TEXT_COLOR_DEFAULT_VALUE", "TEXT_TEMPLATE_VALIDATOR", "TEXT_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "TYPE_HELPER_FONT_FAMILY", "TYPE_HELPER_FONT_SIZE_UNIT", "TYPE_HELPER_FONT_WEIGHT", "TYPE_HELPER_STRIKE", "TYPE_HELPER_TEXT_ALIGNMENT_HORIZONTAL", "TYPE_HELPER_TEXT_ALIGNMENT_VERTICAL", "TYPE_HELPER_UNDERLINE", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "UNDERLINE_DEFAULT_VALUE", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivText m17716a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            DivAccessibility.Companion companion = DivAccessibility.f34479f;
            DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject, "accessibility", DivAccessibility.f34486m, f34328a, parsingEnvironment);
            if (divAccessibility == null) {
                divAccessibility = DivText.f39911b0;
            }
            DivAccessibility divAccessibility2 = divAccessibility;
            Intrinsics.m32178g(divAccessibility2, "JsonParser.readOptional(…CESSIBILITY_DEFAULT_VALUE");
            DivAction.Companion companion2 = DivAction.f34546g;
            Function2<ParsingEnvironment, JSONObject, DivAction> function2 = DivAction.f34550k;
            DivAction divAction = (DivAction) JsonParser.m17322n(jSONObject, "action", function2, f34328a, parsingEnvironment);
            DivAnimation.Companion companion3 = DivAnimation.f34634h;
            DivAnimation divAnimation = (DivAnimation) JsonParser.m17322n(jSONObject, "action_animation", DivAnimation.f34644r, f34328a, parsingEnvironment);
            if (divAnimation == null) {
                divAnimation = DivText.f39912c0;
            }
            DivAnimation divAnimation2 = divAnimation;
            Intrinsics.m32178g(divAnimation2, "JsonParser.readOptional(…N_ANIMATION_DEFAULT_VALUE");
            List m17333y = JsonParser.m17333y(jSONObject, "actions", function2, DivText.f39889G0, f34328a, parsingEnvironment);
            DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
            Function1<String, DivAlignmentHorizontal> function1 = DivAlignmentHorizontal.f34618d;
            Expression m17329u = JsonParser.m17329u(jSONObject, "alignment_horizontal", function1, f34328a, parsingEnvironment, DivText.f39932w0);
            DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
            Function1<String, DivAlignmentVertical> function12 = DivAlignmentVertical.f34626d;
            Expression m17329u2 = JsonParser.m17329u(jSONObject, "alignment_vertical", function12, f34328a, parsingEnvironment, DivText.f39933x0);
            Function1<Number, Double> function13 = ParsingConvertersKt.f33830d;
            ValueValidator<Double> valueValidator = DivText.f39890H0;
            Expression<Double> expression = DivText.f39913d0;
            TypeHelper<Double> typeHelper = TypeHelpersKt.f33851d;
            Expression<Double> m17328t = JsonParser.m17328t(jSONObject, "alpha", function13, valueValidator, f34328a, expression, typeHelper);
            if (m17328t != null) {
                expression = m17328t;
            }
            Function1<Object, Boolean> function14 = ParsingConvertersKt.f33829c;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.f33848a;
            Expression m17329u3 = JsonParser.m17329u(jSONObject, "auto_ellipsize", function14, f34328a, parsingEnvironment, typeHelper2);
            DivBackground.Companion companion4 = DivBackground.f34750a;
            List m17333y2 = JsonParser.m17333y(jSONObject, "background", DivBackground.f34751b, DivText.f39891I0, f34328a, parsingEnvironment);
            DivBorder.Companion companion5 = DivBorder.f34785f;
            DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject, "border", DivBorder.f34788i, f34328a, parsingEnvironment);
            if (divBorder == null) {
                divBorder = DivText.f39914e0;
            }
            DivBorder divBorder2 = divBorder;
            Intrinsics.m32178g(divBorder2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            Function1<Number, Long> function15 = ParsingConvertersKt.f33831e;
            ValueValidator<Long> valueValidator2 = DivText.f39892J0;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.f33849b;
            Expression m17327s = JsonParser.m17327s(jSONObject, "column_span", function15, valueValidator2, f34328a, parsingEnvironment, typeHelper3);
            DivDisappearAction.Companion companion6 = DivDisappearAction.f35537a;
            List m17333y3 = JsonParser.m17333y(jSONObject, "disappear_actions", DivDisappearAction.f35545i, DivText.f39893K0, f34328a, parsingEnvironment);
            List m17333y4 = JsonParser.m17333y(jSONObject, "doubletap_actions", function2, DivText.f39894L0, f34328a, parsingEnvironment);
            Ellipsis.Companion companion7 = Ellipsis.f39999e;
            Ellipsis ellipsis = (Ellipsis) JsonParser.m17322n(jSONObject, "ellipsis", Ellipsis.f40000f, f34328a, parsingEnvironment);
            DivExtension.Companion companion8 = DivExtension.f35659c;
            List m17333y5 = JsonParser.m17333y(jSONObject, "extensions", DivExtension.f35660d, DivText.f39895M0, f34328a, parsingEnvironment);
            DivFocus.Companion companion9 = DivFocus.f35813f;
            DivFocus divFocus = (DivFocus) JsonParser.m17322n(jSONObject, "focus", DivFocus.f35818k, f34328a, parsingEnvironment);
            Function1<Object, Integer> function16 = ParsingConvertersKt.f33827a;
            TypeHelper<Integer> typeHelper4 = TypeHelpersKt.f33853f;
            Expression m17329u4 = JsonParser.m17329u(jSONObject, "focused_text_color", function16, f34328a, parsingEnvironment, typeHelper4);
            DivFontFamily.Converter converter3 = DivFontFamily.f35876c;
            Function1<String, DivFontFamily> function17 = DivFontFamily.f35877d;
            Expression<DivFontFamily> expression2 = DivText.f39915f0;
            Expression<DivFontFamily> m17330v = JsonParser.m17330v(jSONObject, "font_family", function17, f34328a, parsingEnvironment, expression2, DivText.f39934y0);
            if (m17330v != null) {
                expression2 = m17330v;
            }
            ValueValidator<Long> valueValidator3 = DivText.f39896N0;
            Expression<Long> expression3 = DivText.f39916g0;
            Expression<Long> m17328t2 = JsonParser.m17328t(jSONObject, "font_size", function15, valueValidator3, f34328a, expression3, typeHelper3);
            if (m17328t2 != null) {
                expression3 = m17328t2;
            }
            DivSizeUnit.Converter converter4 = DivSizeUnit.f38845c;
            Function1<String, DivSizeUnit> function18 = DivSizeUnit.f38846d;
            Expression<DivSizeUnit> expression4 = DivText.f39917h0;
            Expression<DivSizeUnit> m17330v2 = JsonParser.m17330v(jSONObject, "font_size_unit", function18, f34328a, parsingEnvironment, expression4, DivText.f39935z0);
            if (m17330v2 != null) {
                expression4 = m17330v2;
            }
            DivFontWeight.Converter converter5 = DivFontWeight.f35883c;
            Function1<String, DivFontWeight> function19 = DivFontWeight.f35884d;
            Expression<DivFontWeight> expression5 = DivText.f39918i0;
            Expression<DivFontWeight> m17330v3 = JsonParser.m17330v(jSONObject, "font_weight", function19, f34328a, parsingEnvironment, expression5, DivText.f39883A0);
            if (m17330v3 != null) {
                expression5 = m17330v3;
            }
            DivSize.Companion companion10 = DivSize.f38833a;
            Function2<ParsingEnvironment, JSONObject, DivSize> function22 = DivSize.f38834b;
            DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject, "height", function22, f34328a, parsingEnvironment);
            if (divSize == null) {
                divSize = DivText.f39919j0;
            }
            DivSize divSize2 = divSize;
            Intrinsics.m32178g(divSize2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            String str = (String) JsonParser.m17323o(jSONObject, "id", DivText.f39897O0, f34328a, parsingEnvironment);
            Image.Companion companion11 = Image.f40006g;
            List m17333y6 = JsonParser.m17333y(jSONObject, "images", Image.f40012m, DivText.f39898P0, f34328a, parsingEnvironment);
            Expression<Double> expression6 = DivText.f39920k0;
            Expression<Double> m17330v4 = JsonParser.m17330v(jSONObject, "letter_spacing", function13, f34328a, parsingEnvironment, expression6, typeHelper);
            if (m17330v4 != null) {
                expression6 = m17330v4;
            }
            Expression m17327s2 = JsonParser.m17327s(jSONObject, "line_height", function15, DivText.f39899Q0, f34328a, parsingEnvironment, typeHelper3);
            List m17333y7 = JsonParser.m17333y(jSONObject, "longtap_actions", function2, DivText.f39900R0, f34328a, parsingEnvironment);
            DivEdgeInsets.Companion companion12 = DivEdgeInsets.f35607f;
            Function2<ParsingEnvironment, JSONObject, DivEdgeInsets> function23 = DivEdgeInsets.f35618q;
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "margins", function23, f34328a, parsingEnvironment);
            if (divEdgeInsets == null) {
                divEdgeInsets = DivText.f39921l0;
            }
            DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
            Intrinsics.m32178g(divEdgeInsets2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            Expression m17327s3 = JsonParser.m17327s(jSONObject, "max_lines", function15, DivText.f39901S0, f34328a, parsingEnvironment, typeHelper3);
            Expression m17327s4 = JsonParser.m17327s(jSONObject, "min_hidden_lines", function15, DivText.f39902T0, f34328a, parsingEnvironment, typeHelper3);
            DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "paddings", function23, f34328a, parsingEnvironment);
            if (divEdgeInsets3 == null) {
                divEdgeInsets3 = DivText.f39922m0;
            }
            DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
            Intrinsics.m32178g(divEdgeInsets4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            Range.Companion companion13 = Range.f40023o;
            List m17333y8 = JsonParser.m17333y(jSONObject, "ranges", Range.f40022B, DivText.f39903U0, f34328a, parsingEnvironment);
            Expression m17327s5 = JsonParser.m17327s(jSONObject, "row_span", function15, DivText.f39904V0, f34328a, parsingEnvironment, typeHelper3);
            Expression<Boolean> expression7 = DivText.f39923n0;
            Expression<Boolean> m17330v5 = JsonParser.m17330v(jSONObject, "selectable", function14, f34328a, parsingEnvironment, expression7, typeHelper2);
            Expression<Boolean> expression8 = m17330v5 == null ? expression7 : m17330v5;
            List m17333y9 = JsonParser.m17333y(jSONObject, "selected_actions", function2, DivText.f39905W0, f34328a, parsingEnvironment);
            DivLineStyle.Converter converter6 = DivLineStyle.f37683c;
            Function1<String, DivLineStyle> function110 = DivLineStyle.f37684d;
            Expression<DivLineStyle> expression9 = DivText.f39924o0;
            Expression<DivLineStyle> m17330v6 = JsonParser.m17330v(jSONObject, "strike", function110, f34328a, parsingEnvironment, expression9, DivText.f39884B0);
            Expression<DivLineStyle> expression10 = m17330v6 == null ? expression9 : m17330v6;
            Expression m17314f = JsonParser.m17314f(jSONObject, "text", DivText.f39906X0, f34328a, parsingEnvironment, TypeHelpersKt.f33850c);
            Expression<DivAlignmentHorizontal> expression11 = DivText.f39925p0;
            Expression<DivAlignmentHorizontal> m17330v7 = JsonParser.m17330v(jSONObject, "text_alignment_horizontal", function1, f34328a, parsingEnvironment, expression11, DivText.f39885C0);
            Expression<DivAlignmentHorizontal> expression12 = m17330v7 == null ? expression11 : m17330v7;
            Expression<DivAlignmentVertical> expression13 = DivText.f39926q0;
            Expression<DivAlignmentVertical> m17330v8 = JsonParser.m17330v(jSONObject, "text_alignment_vertical", function12, f34328a, parsingEnvironment, expression13, DivText.f39886D0);
            Expression<DivAlignmentVertical> expression14 = m17330v8 == null ? expression13 : m17330v8;
            Expression<Integer> expression15 = DivText.f39927r0;
            Expression<Integer> m17330v9 = JsonParser.m17330v(jSONObject, "text_color", function16, f34328a, parsingEnvironment, expression15, typeHelper4);
            Expression<Integer> expression16 = m17330v9 == null ? expression15 : m17330v9;
            DivTextGradient.Companion companion14 = DivTextGradient.f40055a;
            DivTextGradient divTextGradient = (DivTextGradient) JsonParser.m17322n(jSONObject, "text_gradient", DivTextGradient.f40056b, f34328a, parsingEnvironment);
            DivTooltip.Companion companion15 = DivTooltip.f40492h;
            List m17333y10 = JsonParser.m17333y(jSONObject, "tooltips", DivTooltip.f40497m, DivText.f39907Y0, f34328a, parsingEnvironment);
            DivTransform.Companion companion16 = DivTransform.f40551d;
            DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject, "transform", DivTransform.f40554g, f34328a, parsingEnvironment);
            if (divTransform == null) {
                divTransform = DivText.f39928s0;
            }
            DivTransform divTransform2 = divTransform;
            Intrinsics.m32178g(divTransform2, "JsonParser.readOptional(…: TRANSFORM_DEFAULT_VALUE");
            DivChangeTransition.Companion companion17 = DivChangeTransition.f34856a;
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonParser.m17322n(jSONObject, "transition_change", DivChangeTransition.f34857b, f34328a, parsingEnvironment);
            DivAppearanceTransition.Companion companion18 = DivAppearanceTransition.f34726a;
            Function2<ParsingEnvironment, JSONObject, DivAppearanceTransition> function24 = DivAppearanceTransition.f34727b;
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonParser.m17322n(jSONObject, "transition_in", function24, f34328a, parsingEnvironment);
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonParser.m17322n(jSONObject, "transition_out", function24, f34328a, parsingEnvironment);
            DivTransitionTrigger.Converter converter7 = DivTransitionTrigger.f40582c;
            List m17332x = JsonParser.m17332x(jSONObject, "transition_triggers", DivTransitionTrigger.f40583d, DivText.f39908Z0, f34328a, parsingEnvironment);
            Expression<DivLineStyle> expression17 = DivText.f39929t0;
            Expression<DivLineStyle> m17330v10 = JsonParser.m17330v(jSONObject, "underline", function110, f34328a, parsingEnvironment, expression17, DivText.f39887E0);
            Expression<DivLineStyle> expression18 = m17330v10 == null ? expression17 : m17330v10;
            DivVisibility.Converter converter8 = DivVisibility.f40930c;
            Function1<String, DivVisibility> function111 = DivVisibility.f40931d;
            Expression<DivVisibility> expression19 = DivText.f39930u0;
            Expression<DivVisibility> m17330v11 = JsonParser.m17330v(jSONObject, "visibility", function111, f34328a, parsingEnvironment, expression19, DivText.f39888F0);
            Expression<DivVisibility> expression20 = m17330v11 == null ? expression19 : m17330v11;
            DivVisibilityAction.Companion companion19 = DivVisibilityAction.f40938i;
            Function2<ParsingEnvironment, JSONObject, DivVisibilityAction> function25 = DivVisibilityAction.f40946q;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonParser.m17322n(jSONObject, "visibility_action", function25, f34328a, parsingEnvironment);
            List m17333y11 = JsonParser.m17333y(jSONObject, "visibility_actions", function25, DivText.f39910a1, f34328a, parsingEnvironment);
            DivSize divSize3 = (DivSize) JsonParser.m17322n(jSONObject, "width", function22, f34328a, parsingEnvironment);
            if (divSize3 == null) {
                divSize3 = DivText.f39931v0;
            }
            Intrinsics.m32178g(divSize3, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new DivText(divAccessibility2, divAction, divAnimation2, m17333y, m17329u, m17329u2, expression, m17329u3, m17333y2, divBorder2, m17327s, m17333y3, m17333y4, ellipsis, m17333y5, divFocus, m17329u4, expression2, expression3, expression4, expression5, divSize2, str, m17333y6, expression6, m17327s2, m17333y7, divEdgeInsets2, m17327s3, m17327s4, divEdgeInsets4, m17333y8, m17327s5, expression8, m17333y9, expression10, m17314f, expression12, expression14, expression16, divTextGradient, m17333y10, divTransform2, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17332x, expression18, expression20, divVisibilityAction, m17333y11, divSize3);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivText.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivText$Ellipsis;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Ellipsis implements JSONSerializable {

        /* renamed from: e */
        @NotNull
        public static final Companion f39999e = new Companion(null);

        /* renamed from: f */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, Ellipsis> f40000f = new Function2<ParsingEnvironment, JSONObject, Ellipsis>() { // from class: com.yandex.div2.DivText$Ellipsis$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivText.Ellipsis invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                DivText.Ellipsis.Companion companion = DivText.Ellipsis.f39999e;
                ParsingErrorLogger f34328a = env.getF34328a();
                DivAction.Companion companion2 = DivAction.f34546g;
                Function2<ParsingEnvironment, JSONObject, DivAction> function2 = DivAction.f34550k;
                DivText.Ellipsis.Companion companion3 = DivText.Ellipsis.f39999e;
                List m17333y = JsonParser.m17333y(it, "actions", function2, C3052j0.f41580z, f34328a, env);
                DivText.Image.Companion companion4 = DivText.Image.f40006g;
                List m17333y2 = JsonParser.m17333y(it, "images", DivText.Image.f40012m, C3052j0.f41551A, f34328a, env);
                DivText.Range.Companion companion5 = DivText.Range.f40023o;
                return new DivText.Ellipsis(m17333y, m17333y2, JsonParser.m17333y(it, "ranges", DivText.Range.f40022B, C3052j0.f41552B, f34328a, env), JsonParser.m17314f(it, "text", C3054k0.f41621k, f34328a, env, TypeHelpersKt.f33850c));
            }
        };

        /* renamed from: a */
        @JvmField
        @Nullable
        public final List<DivAction> f40001a;

        /* renamed from: b */
        @JvmField
        @Nullable
        public final List<Image> f40002b;

        /* renamed from: c */
        @JvmField
        @Nullable
        public final List<Range> f40003c;

        /* renamed from: d */
        @JvmField
        @NotNull
        public final Expression<String> f40004d;

        /* compiled from: DivText.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, m31884d2 = {"Lcom/yandex/div2/DivText$Ellipsis$Companion;", "", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAction;", "ACTIONS_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivText$Image;", "IMAGES_VALIDATOR", "Lcom/yandex/div2/DivText$Range;", "RANGES_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "TEXT_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "TEXT_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @DivModelInternalApi
        public Ellipsis(@Nullable List<? extends DivAction> list, @Nullable List<? extends Image> list2, @Nullable List<? extends Range> list3, @NotNull Expression<String> text) {
            Intrinsics.m32179h(text, "text");
            this.f40001a = list;
            this.f40002b = list2;
            this.f40003c = list3;
            this.f40004d = text;
        }
    }

    /* compiled from: DivText.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivText$Image;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Image implements JSONSerializable {

        /* renamed from: g */
        @NotNull
        public static final Companion f40006g = new Companion(null);

        /* renamed from: h */
        @NotNull
        public static final DivFixedSize f40007h;

        /* renamed from: i */
        @NotNull
        public static final Expression<DivBlendMode> f40008i;

        /* renamed from: j */
        @NotNull
        public static final DivFixedSize f40009j;

        /* renamed from: k */
        @NotNull
        public static final TypeHelper<DivBlendMode> f40010k;

        /* renamed from: l */
        @NotNull
        public static final ValueValidator<Long> f40011l;

        /* renamed from: m */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, Image> f40012m;

        /* renamed from: a */
        @JvmField
        @NotNull
        public final DivFixedSize f40013a;

        /* renamed from: b */
        @JvmField
        @NotNull
        public final Expression<Long> f40014b;

        /* renamed from: c */
        @JvmField
        @Nullable
        public final Expression<Integer> f40015c;

        /* renamed from: d */
        @JvmField
        @NotNull
        public final Expression<DivBlendMode> f40016d;

        /* renamed from: e */
        @JvmField
        @NotNull
        public final Expression<Uri> f40017e;

        /* renamed from: f */
        @JvmField
        @NotNull
        public final DivFixedSize f40018f;

        /* compiled from: DivText.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004¨\u0006\u0012"}, m31884d2 = {"Lcom/yandex/div2/DivText$Image$Companion;", "", "Lcom/yandex/div2/DivFixedSize;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivFixedSize;", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "START_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "START_VALIDATOR", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div2/DivBlendMode;", "TINT_MODE_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_TINT_MODE", "Lcom/yandex/div/internal/parser/TypeHelper;", "WIDTH_DEFAULT_VALUE", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        static {
            Expression expression = null;
            Expression.Companion companion = Expression.f34334a;
            int i2 = 1;
            f40007h = new DivFixedSize(expression, companion.m17539a(20L), i2);
            f40008i = companion.m17539a(DivBlendMode.SOURCE_IN);
            f40009j = new DivFixedSize(expression, companion.m17539a(20L), i2);
            int i3 = TypeHelper.f33843a;
            f40010k = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(DivBlendMode.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivText$Image$Companion$TYPE_HELPER_TINT_MODE$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivBlendMode);
                }
            });
            f40011l = C3054k0.f41622l;
            f40012m = new Function2<ParsingEnvironment, JSONObject, Image>() { // from class: com.yandex.div2.DivText$Image$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                public DivText.Image invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    ParsingEnvironment env = parsingEnvironment;
                    JSONObject it = jSONObject;
                    Intrinsics.m32179h(env, "env");
                    Intrinsics.m32179h(it, "it");
                    DivText.Image.Companion companion2 = DivText.Image.f40006g;
                    ParsingErrorLogger f34328a = env.getF34328a();
                    DivFixedSize.Companion companion3 = DivFixedSize.f35789c;
                    Function2<ParsingEnvironment, JSONObject, DivFixedSize> function2 = DivFixedSize.f35793g;
                    DivFixedSize divFixedSize = (DivFixedSize) JsonParser.m17322n(it, "height", function2, f34328a, env);
                    if (divFixedSize == null) {
                        divFixedSize = DivText.Image.f40007h;
                    }
                    DivFixedSize divFixedSize2 = divFixedSize;
                    Intrinsics.m32178g(divFixedSize2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
                    Expression m17316h = JsonParser.m17316h(it, "start", ParsingConvertersKt.f33831e, DivText.Image.f40011l, f34328a, TypeHelpersKt.f33849b);
                    Expression m17329u = JsonParser.m17329u(it, "tint_color", ParsingConvertersKt.f33827a, f34328a, env, TypeHelpersKt.f33853f);
                    DivBlendMode.Converter converter = DivBlendMode.f34766c;
                    Function1<String, DivBlendMode> function1 = DivBlendMode.f34767d;
                    Expression<DivBlendMode> expression2 = DivText.Image.f40008i;
                    Expression<DivBlendMode> m17330v = JsonParser.m17330v(it, "tint_mode", function1, f34328a, env, expression2, DivText.Image.f40010k);
                    if (m17330v != null) {
                        expression2 = m17330v;
                    }
                    Expression m17317i = JsonParser.m17317i(it, "url", ParsingConvertersKt.f33828b, f34328a, env, TypeHelpersKt.f33852e);
                    DivFixedSize divFixedSize3 = (DivFixedSize) JsonParser.m17322n(it, "width", function2, f34328a, env);
                    if (divFixedSize3 == null) {
                        divFixedSize3 = DivText.Image.f40009j;
                    }
                    DivFixedSize divFixedSize4 = divFixedSize3;
                    Intrinsics.m32178g(divFixedSize4, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
                    return new DivText.Image(divFixedSize2, m17316h, m17329u, expression2, m17317i, divFixedSize4);
                }
            };
        }

        @DivModelInternalApi
        public Image(@NotNull DivFixedSize height, @NotNull Expression<Long> start, @Nullable Expression<Integer> expression, @NotNull Expression<DivBlendMode> tintMode, @NotNull Expression<Uri> url, @NotNull DivFixedSize width) {
            Intrinsics.m32179h(height, "height");
            Intrinsics.m32179h(start, "start");
            Intrinsics.m32179h(tintMode, "tintMode");
            Intrinsics.m32179h(url, "url");
            Intrinsics.m32179h(width, "width");
            this.f40013a = height;
            this.f40014b = start;
            this.f40015c = expression;
            this.f40016d = tintMode;
            this.f40017e = url;
            this.f40018f = width;
        }
    }

    /* compiled from: DivText.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivText$Range;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Range implements JSONSerializable {

        /* renamed from: A */
        @NotNull
        public static final ValueValidator<Long> f40021A;

        /* renamed from: B */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, Range> f40022B;

        /* renamed from: o */
        @NotNull
        public static final Companion f40023o = new Companion(null);

        /* renamed from: p */
        @NotNull
        public static final Expression<DivSizeUnit> f40024p = Expression.f34334a.m17539a(DivSizeUnit.SP);

        /* renamed from: q */
        @NotNull
        public static final TypeHelper<DivFontFamily> f40025q;

        /* renamed from: r */
        @NotNull
        public static final TypeHelper<DivSizeUnit> f40026r;

        /* renamed from: s */
        @NotNull
        public static final TypeHelper<DivFontWeight> f40027s;

        /* renamed from: t */
        @NotNull
        public static final TypeHelper<DivLineStyle> f40028t;

        /* renamed from: u */
        @NotNull
        public static final TypeHelper<DivLineStyle> f40029u;

        /* renamed from: v */
        @NotNull
        public static final ListValidator<DivAction> f40030v;

        /* renamed from: w */
        @NotNull
        public static final ValueValidator<Long> f40031w;

        /* renamed from: x */
        @NotNull
        public static final ValueValidator<Long> f40032x;

        /* renamed from: y */
        @NotNull
        public static final ValueValidator<Long> f40033y;

        /* renamed from: z */
        @NotNull
        public static final ValueValidator<Long> f40034z;

        /* renamed from: a */
        @JvmField
        @Nullable
        public final List<DivAction> f40035a;

        /* renamed from: b */
        @JvmField
        @Nullable
        public final DivTextRangeBackground f40036b;

        /* renamed from: c */
        @JvmField
        @Nullable
        public final DivTextRangeBorder f40037c;

        /* renamed from: d */
        @JvmField
        @NotNull
        public final Expression<Long> f40038d;

        /* renamed from: e */
        @JvmField
        @Nullable
        public final Expression<Long> f40039e;

        /* renamed from: f */
        @JvmField
        @NotNull
        public final Expression<DivSizeUnit> f40040f;

        /* renamed from: g */
        @JvmField
        @Nullable
        public final Expression<DivFontWeight> f40041g;

        /* renamed from: h */
        @JvmField
        @Nullable
        public final Expression<Double> f40042h;

        /* renamed from: i */
        @JvmField
        @Nullable
        public final Expression<Long> f40043i;

        /* renamed from: j */
        @JvmField
        @NotNull
        public final Expression<Long> f40044j;

        /* renamed from: k */
        @JvmField
        @Nullable
        public final Expression<DivLineStyle> f40045k;

        /* renamed from: l */
        @JvmField
        @Nullable
        public final Expression<Integer> f40046l;

        /* renamed from: m */
        @JvmField
        @Nullable
        public final Expression<Long> f40047m;

        /* renamed from: n */
        @JvmField
        @Nullable
        public final Expression<DivLineStyle> f40048n;

        /* compiled from: DivText.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\tR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\tR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\tR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001a¨\u0006!"}, m31884d2 = {"Lcom/yandex/div2/DivText$Range$Companion;", "", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAction;", "ACTIONS_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "END_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "END_VALIDATOR", "FONT_SIZE_TEMPLATE_VALIDATOR", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div2/DivSizeUnit;", "FONT_SIZE_UNIT_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "FONT_SIZE_VALIDATOR", "LINE_HEIGHT_TEMPLATE_VALIDATOR", "LINE_HEIGHT_VALIDATOR", "START_TEMPLATE_VALIDATOR", "START_VALIDATOR", "TOP_OFFSET_TEMPLATE_VALIDATOR", "TOP_OFFSET_VALIDATOR", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivFontFamily;", "TYPE_HELPER_FONT_FAMILY", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_FONT_SIZE_UNIT", "Lcom/yandex/div2/DivFontWeight;", "TYPE_HELPER_FONT_WEIGHT", "Lcom/yandex/div2/DivLineStyle;", "TYPE_HELPER_STRIKE", "TYPE_HELPER_UNDERLINE", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        static {
            int i2 = TypeHelper.f33843a;
            TypeHelper.Companion companion = TypeHelper.Companion.f33844a;
            f40025q = companion.m17372a(ArraysKt.m31926B(DivFontFamily.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivText$Range$Companion$TYPE_HELPER_FONT_FAMILY$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivFontFamily);
                }
            });
            f40026r = companion.m17372a(ArraysKt.m31926B(DivSizeUnit.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivText$Range$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivSizeUnit);
                }
            });
            f40027s = companion.m17372a(ArraysKt.m31926B(DivFontWeight.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivText$Range$Companion$TYPE_HELPER_FONT_WEIGHT$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivFontWeight);
                }
            });
            f40028t = companion.m17372a(ArraysKt.m31926B(DivLineStyle.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivText$Range$Companion$TYPE_HELPER_STRIKE$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivLineStyle);
                }
            });
            f40029u = companion.m17372a(ArraysKt.m31926B(DivLineStyle.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivText$Range$Companion$TYPE_HELPER_UNDERLINE$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivLineStyle);
                }
            });
            f40030v = C3052j0.f41553C;
            f40031w = C3054k0.f41624n;
            f40032x = C3054k0.f41625o;
            f40033y = C3054k0.f41626p;
            f40034z = C3054k0.f41627q;
            f40021A = C3054k0.f41623m;
            f40022B = new Function2<ParsingEnvironment, JSONObject, Range>() { // from class: com.yandex.div2.DivText$Range$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                public DivText.Range invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    ParsingEnvironment env = parsingEnvironment;
                    JSONObject it = jSONObject;
                    Intrinsics.m32179h(env, "env");
                    Intrinsics.m32179h(it, "it");
                    DivText.Range.Companion companion2 = DivText.Range.f40023o;
                    ParsingErrorLogger f34328a = env.getF34328a();
                    DivAction.Companion companion3 = DivAction.f34546g;
                    List m17333y = JsonParser.m17333y(it, "actions", DivAction.f34550k, DivText.Range.f40030v, f34328a, env);
                    DivTextRangeBackground.Companion companion4 = DivTextRangeBackground.f40065a;
                    DivTextRangeBackground divTextRangeBackground = (DivTextRangeBackground) JsonParser.m17322n(it, "background", DivTextRangeBackground.f40066b, f34328a, env);
                    DivTextRangeBorder.Companion companion5 = DivTextRangeBorder.f40073c;
                    DivTextRangeBorder divTextRangeBorder = (DivTextRangeBorder) JsonParser.m17322n(it, "border", DivTextRangeBorder.f40074d, f34328a, env);
                    Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                    ValueValidator<Long> valueValidator = DivText.Range.f40031w;
                    TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
                    Expression m17316h = JsonParser.m17316h(it, "end", function1, valueValidator, f34328a, typeHelper);
                    DivFontFamily.Converter converter = DivFontFamily.f35876c;
                    Expression m17329u = JsonParser.m17329u(it, "font_family", DivFontFamily.f35877d, f34328a, env, DivText.Range.f40025q);
                    Expression m17327s = JsonParser.m17327s(it, "font_size", function1, DivText.Range.f40032x, f34328a, env, typeHelper);
                    DivSizeUnit.Converter converter2 = DivSizeUnit.f38845c;
                    Function1<String, DivSizeUnit> function12 = DivSizeUnit.f38846d;
                    Expression<DivSizeUnit> expression = DivText.Range.f40024p;
                    Expression<DivSizeUnit> m17330v = JsonParser.m17330v(it, "font_size_unit", function12, f34328a, env, expression, DivText.Range.f40026r);
                    if (m17330v != null) {
                        expression = m17330v;
                    }
                    DivFontWeight.Converter converter3 = DivFontWeight.f35883c;
                    Expression m17329u2 = JsonParser.m17329u(it, "font_weight", DivFontWeight.f35884d, f34328a, env, DivText.Range.f40027s);
                    Expression m17329u3 = JsonParser.m17329u(it, "letter_spacing", ParsingConvertersKt.f33830d, f34328a, env, TypeHelpersKt.f33851d);
                    Expression m17327s2 = JsonParser.m17327s(it, "line_height", function1, DivText.Range.f40033y, f34328a, env, typeHelper);
                    Expression m17316h2 = JsonParser.m17316h(it, "start", function1, DivText.Range.f40034z, f34328a, typeHelper);
                    DivLineStyle.Converter converter4 = DivLineStyle.f37683c;
                    Function1<String, DivLineStyle> function13 = DivLineStyle.f37684d;
                    return new DivText.Range(m17333y, divTextRangeBackground, divTextRangeBorder, m17316h, m17329u, m17327s, expression, m17329u2, m17329u3, m17327s2, m17316h2, JsonParser.m17329u(it, "strike", function13, f34328a, env, DivText.Range.f40028t), JsonParser.m17329u(it, "text_color", ParsingConvertersKt.f33827a, f34328a, env, TypeHelpersKt.f33853f), JsonParser.m17327s(it, "top_offset", function1, DivText.Range.f40021A, f34328a, env, typeHelper), JsonParser.m17329u(it, "underline", function13, f34328a, env, DivText.Range.f40029u));
                }
            };
        }

        /* JADX WARN: Multi-variable type inference failed */
        @DivModelInternalApi
        public Range(@Nullable List<? extends DivAction> list, @Nullable DivTextRangeBackground divTextRangeBackground, @Nullable DivTextRangeBorder divTextRangeBorder, @NotNull Expression<Long> end, @Nullable Expression<DivFontFamily> expression, @Nullable Expression<Long> expression2, @NotNull Expression<DivSizeUnit> fontSizeUnit, @Nullable Expression<DivFontWeight> expression3, @Nullable Expression<Double> expression4, @Nullable Expression<Long> expression5, @NotNull Expression<Long> start, @Nullable Expression<DivLineStyle> expression6, @Nullable Expression<Integer> expression7, @Nullable Expression<Long> expression8, @Nullable Expression<DivLineStyle> expression9) {
            Intrinsics.m32179h(end, "end");
            Intrinsics.m32179h(fontSizeUnit, "fontSizeUnit");
            Intrinsics.m32179h(start, "start");
            this.f40035a = list;
            this.f40036b = divTextRangeBackground;
            this.f40037c = divTextRangeBorder;
            this.f40038d = end;
            this.f40039e = expression2;
            this.f40040f = fontSizeUnit;
            this.f40041g = expression3;
            this.f40042h = expression4;
            this.f40043i = expression5;
            this.f40044j = start;
            this.f40045k = expression6;
            this.f40046l = expression7;
            this.f40047m = expression8;
            this.f40048n = expression9;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression expression = null;
        f39911b0 = new DivAccessibility(null, null, null, expression, null, null, 63);
        Expression.Companion companion = Expression.f34334a;
        Expression m17539a = companion.m17539a(100L);
        Expression m17539a2 = companion.m17539a(Double.valueOf(0.6d));
        Expression m17539a3 = companion.m17539a(DivAnimation.Name.FADE);
        Double valueOf = Double.valueOf(1.0d);
        Expression expression2 = null;
        Expression expression3 = null;
        f39912c0 = new DivAnimation(m17539a, m17539a2, expression2, null, m17539a3, null, expression3, companion.m17539a(valueOf), C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
        f39913d0 = companion.m17539a(valueOf);
        f39914e0 = new DivBorder(null, null == true ? 1 : 0, expression, null == true ? 1 : 0, null == true ? 1 : 0, 31);
        f39915f0 = companion.m17539a(DivFontFamily.TEXT);
        f39916g0 = companion.m17539a(12L);
        f39917h0 = companion.m17539a(DivSizeUnit.SP);
        f39918i0 = companion.m17539a(DivFontWeight.REGULAR);
        int i2 = 7;
        f39919j0 = new DivSize.WrapContent(new DivWrapContentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, i2));
        f39920k0 = companion.m17539a(Double.valueOf(0.0d));
        f39921l0 = new DivEdgeInsets(null, null == true ? 1 : 0, null == true ? 1 : 0, null, null, 31);
        f39922m0 = new DivEdgeInsets(expression2, null == true ? 1 : 0, null, null == true ? 1 : 0, expression3, 31);
        f39923n0 = companion.m17539a(Boolean.FALSE);
        DivLineStyle divLineStyle = DivLineStyle.NONE;
        f39924o0 = companion.m17539a(divLineStyle);
        f39925p0 = companion.m17539a(DivAlignmentHorizontal.LEFT);
        f39926q0 = companion.m17539a(DivAlignmentVertical.TOP);
        f39927r0 = companion.m17539a(-16777216);
        f39928s0 = new DivTransform(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, i2);
        f39929t0 = companion.m17539a(divLineStyle);
        f39930u0 = companion.m17539a(DivVisibility.VISIBLE);
        f39931v0 = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i3 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f39932w0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivText$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f39933x0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivText$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f39934y0 = companion2.m17372a(ArraysKt.m31926B(DivFontFamily.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivText$Companion$TYPE_HELPER_FONT_FAMILY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivFontFamily);
            }
        });
        f39935z0 = companion2.m17372a(ArraysKt.m31926B(DivSizeUnit.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivText$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivSizeUnit);
            }
        });
        f39883A0 = companion2.m17372a(ArraysKt.m31926B(DivFontWeight.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivText$Companion$TYPE_HELPER_FONT_WEIGHT$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivFontWeight);
            }
        });
        f39884B0 = companion2.m17372a(ArraysKt.m31926B(DivLineStyle.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivText$Companion$TYPE_HELPER_STRIKE$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivLineStyle);
            }
        });
        f39885C0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivText$Companion$TYPE_HELPER_TEXT_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f39886D0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivText$Companion$TYPE_HELPER_TEXT_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f39887E0 = companion2.m17372a(ArraysKt.m31926B(DivLineStyle.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivText$Companion$TYPE_HELPER_UNDERLINE$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivLineStyle);
            }
        });
        f39888F0 = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivText$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f39889G0 = C3052j0.f41568n;
        f39890H0 = C3054k0.f41619i;
        f39891I0 = C3052j0.f41576v;
        f39892J0 = C3054k0.f41620j;
        f39893K0 = C3052j0.f41577w;
        f39894L0 = C3052j0.f41578x;
        f39895M0 = C3052j0.f41579y;
        f39896N0 = C3050i0.f41501C;
        f39897O0 = C3054k0.f41613c;
        f39898P0 = C3052j0.f41569o;
        f39899Q0 = C3054k0.f41614d;
        f39900R0 = C3052j0.f41570p;
        f39901S0 = C3054k0.f41615e;
        f39902T0 = C3054k0.f41616f;
        f39903U0 = C3052j0.f41571q;
        f39904V0 = C3054k0.f41617g;
        f39905W0 = C3052j0.f41572r;
        f39906X0 = C3054k0.f41618h;
        f39907Y0 = C3052j0.f41573s;
        f39908Z0 = C3052j0.f41574t;
        f39910a1 = C3052j0.f41575u;
        DivText$Companion$CREATOR$1 divText$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivText>() { // from class: com.yandex.div2.DivText$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivText invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivText.f39909a0.m17716a(env, it);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @DivModelInternalApi
    public DivText(@NotNull DivAccessibility accessibility, @Nullable DivAction divAction, @NotNull DivAnimation actionAnimation, @Nullable List<? extends DivAction> list, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> alpha, @Nullable Expression<Boolean> expression3, @Nullable List<? extends DivBackground> list2, @NotNull DivBorder border, @Nullable Expression<Long> expression4, @Nullable List<? extends DivDisappearAction> list3, @Nullable List<? extends DivAction> list4, @Nullable Ellipsis ellipsis, @Nullable List<? extends DivExtension> list5, @Nullable DivFocus divFocus, @Nullable Expression<Integer> expression5, @NotNull Expression<DivFontFamily> fontFamily, @NotNull Expression<Long> fontSize, @NotNull Expression<DivSizeUnit> fontSizeUnit, @NotNull Expression<DivFontWeight> fontWeight, @NotNull DivSize height, @Nullable String str, @Nullable List<? extends Image> list6, @NotNull Expression<Double> letterSpacing, @Nullable Expression<Long> expression6, @Nullable List<? extends DivAction> list7, @NotNull DivEdgeInsets margins, @Nullable Expression<Long> expression7, @Nullable Expression<Long> expression8, @NotNull DivEdgeInsets paddings, @Nullable List<? extends Range> list8, @Nullable Expression<Long> expression9, @NotNull Expression<Boolean> selectable, @Nullable List<? extends DivAction> list9, @NotNull Expression<DivLineStyle> strike, @NotNull Expression<String> text, @NotNull Expression<DivAlignmentHorizontal> textAlignmentHorizontal, @NotNull Expression<DivAlignmentVertical> textAlignmentVertical, @NotNull Expression<Integer> textColor, @Nullable DivTextGradient divTextGradient, @Nullable List<? extends DivTooltip> list10, @NotNull DivTransform transform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list11, @NotNull Expression<DivLineStyle> underline, @NotNull Expression<DivVisibility> visibility, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<? extends DivVisibilityAction> list12, @NotNull DivSize width) {
        Intrinsics.m32179h(accessibility, "accessibility");
        Intrinsics.m32179h(actionAnimation, "actionAnimation");
        Intrinsics.m32179h(alpha, "alpha");
        Intrinsics.m32179h(border, "border");
        Intrinsics.m32179h(fontFamily, "fontFamily");
        Intrinsics.m32179h(fontSize, "fontSize");
        Intrinsics.m32179h(fontSizeUnit, "fontSizeUnit");
        Intrinsics.m32179h(fontWeight, "fontWeight");
        Intrinsics.m32179h(height, "height");
        Intrinsics.m32179h(letterSpacing, "letterSpacing");
        Intrinsics.m32179h(margins, "margins");
        Intrinsics.m32179h(paddings, "paddings");
        Intrinsics.m32179h(selectable, "selectable");
        Intrinsics.m32179h(strike, "strike");
        Intrinsics.m32179h(text, "text");
        Intrinsics.m32179h(textAlignmentHorizontal, "textAlignmentHorizontal");
        Intrinsics.m32179h(textAlignmentVertical, "textAlignmentVertical");
        Intrinsics.m32179h(textColor, "textColor");
        Intrinsics.m32179h(transform, "transform");
        Intrinsics.m32179h(underline, "underline");
        Intrinsics.m32179h(visibility, "visibility");
        Intrinsics.m32179h(width, "width");
        this.f39962a = accessibility;
        this.f39963b = divAction;
        this.f39964c = actionAnimation;
        this.f39965d = list;
        this.f39966e = expression;
        this.f39967f = expression2;
        this.f39968g = alpha;
        this.f39969h = expression3;
        this.f39970i = list2;
        this.f39971j = border;
        this.f39972k = expression4;
        this.f39973l = list3;
        this.f39974m = list4;
        this.f39975n = ellipsis;
        this.f39976o = list5;
        this.f39977p = divFocus;
        this.f39978q = expression5;
        this.f39979r = fontFamily;
        this.f39980s = fontSize;
        this.f39981t = fontSizeUnit;
        this.f39982u = fontWeight;
        this.f39983v = height;
        this.f39984w = str;
        this.f39985x = list6;
        this.f39986y = letterSpacing;
        this.f39987z = expression6;
        this.f39936A = list7;
        this.f39937B = margins;
        this.f39938C = expression7;
        this.f39939D = expression8;
        this.f39940E = paddings;
        this.f39941F = list8;
        this.f39942G = expression9;
        this.f39943H = selectable;
        this.f39944I = list9;
        this.f39945J = strike;
        this.f39946K = text;
        this.f39947L = textAlignmentHorizontal;
        this.f39948M = textAlignmentVertical;
        this.f39949N = textColor;
        this.f39950O = divTextGradient;
        this.f39951P = list10;
        this.f39952Q = transform;
        this.f39953R = divChangeTransition;
        this.f39954S = divAppearanceTransition;
        this.f39955T = divAppearanceTransition2;
        this.f39956U = list11;
        this.f39957V = underline;
        this.f39958W = visibility;
        this.f39959X = divVisibilityAction;
        this.f39960Y = list12;
        this.f39961Z = width;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: a, reason: from getter */
    public DivSize getF34951r() {
        return this.f39983v;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: b, reason: from getter */
    public DivTransform getF34925E() {
        return this.f39952Q;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: c */
    public List<DivVisibilityAction> mo17569c() {
        return this.f39960Y;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: d */
    public List<DivBackground> mo17570d() {
        return this.f39970i;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: e, reason: from getter */
    public DivAccessibility getF34934a() {
        return this.f39962a;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: f */
    public Expression<Long> mo17572f() {
        return this.f39972k;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: g, reason: from getter */
    public DivSize getF34933M() {
        return this.f39961Z;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: getBorder, reason: from getter */
    public DivBorder getF34943j() {
        return this.f39971j;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: getId, reason: from getter */
    public String getF34952s() {
        return this.f39984w;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    public Expression<DivVisibility> getVisibility() {
        return this.f39958W;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: h, reason: from getter */
    public DivEdgeInsets getF34957x() {
        return this.f39937B;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: i */
    public Expression<Long> mo17575i() {
        return this.f39942G;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: j, reason: from getter */
    public DivEdgeInsets getF34959z() {
        return this.f39940E;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: k */
    public List<DivTransitionTrigger> mo17577k() {
        return this.f39956U;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: l */
    public List<DivAction> mo17578l() {
        return this.f39944I;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: m */
    public Expression<DivAlignmentHorizontal> mo17579m() {
        return this.f39966e;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: n */
    public List<DivExtension> mo17580n() {
        return this.f39976o;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: o */
    public List<DivTooltip> mo17581o() {
        return this.f39951P;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: p, reason: from getter */
    public DivVisibilityAction getF34931K() {
        return this.f39959X;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: q */
    public Expression<DivAlignmentVertical> mo17583q() {
        return this.f39967f;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: r, reason: from getter */
    public DivAppearanceTransition getF34927G() {
        return this.f39954S;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: s */
    public Expression<Double> mo17585s() {
        return this.f39968g;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: t, reason: from getter */
    public DivFocus getF34950q() {
        return this.f39977p;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: u, reason: from getter */
    public DivAppearanceTransition getF34928H() {
        return this.f39955T;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: v, reason: from getter */
    public DivChangeTransition getF34926F() {
        return this.f39953R;
    }
}
