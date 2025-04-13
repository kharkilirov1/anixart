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
import com.yandex.div2.DivSize;
import com.yandex.div2.DivTooltip;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVideoSource;
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

/* compiled from: DivVideo.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div2/DivVideo;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div2/DivBase;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivVideo implements JSONSerializable, DivBase {

    /* renamed from: L */
    @NotNull
    public static final Companion f40644L = new Companion(null);

    /* renamed from: M */
    @NotNull
    public static final DivAccessibility f40645M;

    /* renamed from: N */
    @NotNull
    public static final Expression<Double> f40646N;

    /* renamed from: O */
    @NotNull
    public static final Expression<Boolean> f40647O;

    /* renamed from: P */
    @NotNull
    public static final DivBorder f40648P;

    /* renamed from: Q */
    @NotNull
    public static final DivSize.WrapContent f40649Q;

    /* renamed from: R */
    @NotNull
    public static final DivEdgeInsets f40650R;

    /* renamed from: S */
    @NotNull
    public static final Expression<Boolean> f40651S;

    /* renamed from: T */
    @NotNull
    public static final DivEdgeInsets f40652T;

    /* renamed from: U */
    @NotNull
    public static final Expression<Boolean> f40653U;

    /* renamed from: V */
    @NotNull
    public static final DivTransform f40654V;

    /* renamed from: W */
    @NotNull
    public static final Expression<DivVisibility> f40655W;

    /* renamed from: X */
    @NotNull
    public static final DivSize.MatchParent f40656X;

    /* renamed from: Y */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f40657Y;

    /* renamed from: Z */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f40658Z;

    /* renamed from: a0 */
    @NotNull
    public static final TypeHelper<DivVisibility> f40659a0;

    /* renamed from: b0 */
    @NotNull
    public static final ValueValidator<Double> f40660b0;

    /* renamed from: c0 */
    @NotNull
    public static final ListValidator<DivBackground> f40661c0;

    /* renamed from: d0 */
    @NotNull
    public static final ListValidator<DivAction> f40662d0;

    /* renamed from: e0 */
    @NotNull
    public static final ValueValidator<Long> f40663e0;

    /* renamed from: f0 */
    @NotNull
    public static final ListValidator<DivDisappearAction> f40664f0;

    /* renamed from: g0 */
    @NotNull
    public static final ValueValidator<String> f40665g0;

    /* renamed from: h0 */
    @NotNull
    public static final ListValidator<DivAction> f40666h0;

    /* renamed from: i0 */
    @NotNull
    public static final ListValidator<DivExtension> f40667i0;

    /* renamed from: j0 */
    @NotNull
    public static final ListValidator<DivAction> f40668j0;

    /* renamed from: k0 */
    @NotNull
    public static final ValueValidator<String> f40669k0;

    /* renamed from: l0 */
    @NotNull
    public static final ListValidator<DivAction> f40670l0;

    /* renamed from: m0 */
    @NotNull
    public static final ValueValidator<String> f40671m0;

    /* renamed from: n0 */
    @NotNull
    public static final ListValidator<DivAction> f40672n0;

    /* renamed from: o0 */
    @NotNull
    public static final ValueValidator<Long> f40673o0;

    /* renamed from: p0 */
    @NotNull
    public static final ListValidator<DivAction> f40674p0;

    /* renamed from: q0 */
    @NotNull
    public static final ListValidator<DivTooltip> f40675q0;

    /* renamed from: r0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f40676r0;

    /* renamed from: s0 */
    @NotNull
    public static final ListValidator<DivVideoSource> f40677s0;

    /* renamed from: t0 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f40678t0;

    /* renamed from: A */
    @Nullable
    public final List<DivTooltip> f40679A;

    /* renamed from: B */
    @NotNull
    public final DivTransform f40680B;

    /* renamed from: C */
    @Nullable
    public final DivChangeTransition f40681C;

    /* renamed from: D */
    @Nullable
    public final DivAppearanceTransition f40682D;

    /* renamed from: E */
    @Nullable
    public final DivAppearanceTransition f40683E;

    /* renamed from: F */
    @Nullable
    public final List<DivTransitionTrigger> f40684F;

    /* renamed from: G */
    @JvmField
    @NotNull
    public final List<DivVideoSource> f40685G;

    /* renamed from: H */
    @NotNull
    public final Expression<DivVisibility> f40686H;

    /* renamed from: I */
    @Nullable
    public final DivVisibilityAction f40687I;

    /* renamed from: J */
    @Nullable
    public final List<DivVisibilityAction> f40688J;

    /* renamed from: K */
    @NotNull
    public final DivSize f40689K;

    /* renamed from: a */
    @NotNull
    public final DivAccessibility f40690a;

    /* renamed from: b */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f40691b;

    /* renamed from: c */
    @Nullable
    public final Expression<DivAlignmentVertical> f40692c;

    /* renamed from: d */
    @NotNull
    public final Expression<Double> f40693d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Expression<Boolean> f40694e;

    /* renamed from: f */
    @Nullable
    public final List<DivBackground> f40695f;

    /* renamed from: g */
    @NotNull
    public final DivBorder f40696g;

    /* renamed from: h */
    @JvmField
    @Nullable
    public final List<DivAction> f40697h;

    /* renamed from: i */
    @Nullable
    public final Expression<Long> f40698i;

    /* renamed from: j */
    @Nullable
    public final List<DivDisappearAction> f40699j;

    /* renamed from: k */
    @JvmField
    @Nullable
    public final String f40700k;

    /* renamed from: l */
    @JvmField
    @Nullable
    public final List<DivAction> f40701l;

    /* renamed from: m */
    @Nullable
    public final List<DivExtension> f40702m;

    /* renamed from: n */
    @JvmField
    @Nullable
    public final List<DivAction> f40703n;

    /* renamed from: o */
    @Nullable
    public final DivFocus f40704o;

    /* renamed from: p */
    @NotNull
    public final DivSize f40705p;

    /* renamed from: q */
    @Nullable
    public final String f40706q;

    /* renamed from: r */
    @NotNull
    public final DivEdgeInsets f40707r;

    /* renamed from: s */
    @JvmField
    @NotNull
    public final Expression<Boolean> f40708s;

    /* renamed from: t */
    @NotNull
    public final DivEdgeInsets f40709t;

    /* renamed from: u */
    @JvmField
    @Nullable
    public final List<DivAction> f40710u;

    /* renamed from: v */
    @JvmField
    @Nullable
    public final JSONObject f40711v;

    /* renamed from: w */
    @JvmField
    @NotNull
    public final Expression<Boolean> f40712w;

    /* renamed from: x */
    @JvmField
    @Nullable
    public final List<DivAction> f40713x;

    /* renamed from: y */
    @Nullable
    public final Expression<Long> f40714y;

    /* renamed from: z */
    @Nullable
    public final List<DivAction> f40715z;

    /* compiled from: DivVideo.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u000bR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u000bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0012R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u000bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u000bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0012R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0012R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0012R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001d0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u000bR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001d0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u000bR\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\bR\u0014\u0010-\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0012R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001d0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u000bR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u001d0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u000bR\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\r0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\bR\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0012R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00180\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u000bR\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00180\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u000bR\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0012R\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002060\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\u0012R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\u0012R\u0014\u0010=\u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020@0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020C0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010BR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020E0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010BR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010\u0012R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010\u0012R\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020E0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010\bR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006O"}, m31884d2 = {"Lcom/yandex/div2/DivVideo$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "", "AUTOSTART_DEFAULT_VALUE", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "Lcom/yandex/div2/DivAction;", "BUFFERING_ACTIONS_VALIDATOR", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "", "ELAPSED_TIME_VARIABLE_TEMPLATE_VALIDATOR", "ELAPSED_TIME_VARIABLE_VALIDATOR", "END_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "FATAL_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "MUTED_DEFAULT_VALUE", "PADDINGS_DEFAULT_VALUE", "PAUSE_ACTIONS_VALIDATOR", "PREVIEW_TEMPLATE_VALIDATOR", "PREVIEW_VALIDATOR", "REPEATABLE_DEFAULT_VALUE", "RESUME_ACTIONS_VALIDATOR", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/DivVideoSource;", "VIDEO_SOURCES_VALIDATOR", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivVideo m17726a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            DivAccessibility.Companion companion = DivAccessibility.f34479f;
            DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject, "accessibility", DivAccessibility.f34486m, f34328a, parsingEnvironment);
            if (divAccessibility == null) {
                divAccessibility = DivVideo.f40645M;
            }
            DivAccessibility divAccessibility2 = divAccessibility;
            Intrinsics.m32178g(divAccessibility2, "JsonParser.readOptional(…CESSIBILITY_DEFAULT_VALUE");
            DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
            Expression m17329u = JsonParser.m17329u(jSONObject, "alignment_horizontal", DivAlignmentHorizontal.f34618d, f34328a, parsingEnvironment, DivVideo.f40657Y);
            DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
            Expression m17329u2 = JsonParser.m17329u(jSONObject, "alignment_vertical", DivAlignmentVertical.f34626d, f34328a, parsingEnvironment, DivVideo.f40658Z);
            Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
            ValueValidator<Double> valueValidator = DivVideo.f40660b0;
            Expression<Double> expression = DivVideo.f40646N;
            Expression<Double> m17328t = JsonParser.m17328t(jSONObject, "alpha", function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
            Expression<Double> expression2 = m17328t == null ? expression : m17328t;
            Function1<Object, Boolean> function12 = ParsingConvertersKt.f33829c;
            Expression<Boolean> expression3 = DivVideo.f40647O;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.f33848a;
            Expression<Boolean> m17330v = JsonParser.m17330v(jSONObject, "autostart", function12, f34328a, parsingEnvironment, expression3, typeHelper);
            if (m17330v != null) {
                expression3 = m17330v;
            }
            DivBackground.Companion companion2 = DivBackground.f34750a;
            List m17333y = JsonParser.m17333y(jSONObject, "background", DivBackground.f34751b, DivVideo.f40661c0, f34328a, parsingEnvironment);
            DivBorder.Companion companion3 = DivBorder.f34785f;
            DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject, "border", DivBorder.f34788i, f34328a, parsingEnvironment);
            if (divBorder == null) {
                divBorder = DivVideo.f40648P;
            }
            DivBorder divBorder2 = divBorder;
            Intrinsics.m32178g(divBorder2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            DivAction.Companion companion4 = DivAction.f34546g;
            Function2<ParsingEnvironment, JSONObject, DivAction> function2 = DivAction.f34550k;
            List m17333y2 = JsonParser.m17333y(jSONObject, "buffering_actions", function2, DivVideo.f40662d0, f34328a, parsingEnvironment);
            Function1<Number, Long> function13 = ParsingConvertersKt.f33831e;
            ValueValidator<Long> valueValidator2 = DivVideo.f40663e0;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.f33849b;
            Expression m17327s = JsonParser.m17327s(jSONObject, "column_span", function13, valueValidator2, f34328a, parsingEnvironment, typeHelper2);
            DivDisappearAction.Companion companion5 = DivDisappearAction.f35537a;
            List m17333y3 = JsonParser.m17333y(jSONObject, "disappear_actions", DivDisappearAction.f35545i, DivVideo.f40664f0, f34328a, parsingEnvironment);
            String str = (String) JsonParser.m17323o(jSONObject, "elapsed_time_variable", DivVideo.f40665g0, f34328a, parsingEnvironment);
            List m17333y4 = JsonParser.m17333y(jSONObject, "end_actions", function2, DivVideo.f40666h0, f34328a, parsingEnvironment);
            DivExtension.Companion companion6 = DivExtension.f35659c;
            List m17333y5 = JsonParser.m17333y(jSONObject, "extensions", DivExtension.f35660d, DivVideo.f40667i0, f34328a, parsingEnvironment);
            List m17333y6 = JsonParser.m17333y(jSONObject, "fatal_actions", function2, DivVideo.f40668j0, f34328a, parsingEnvironment);
            DivFocus.Companion companion7 = DivFocus.f35813f;
            DivFocus divFocus = (DivFocus) JsonParser.m17322n(jSONObject, "focus", DivFocus.f35818k, f34328a, parsingEnvironment);
            DivSize.Companion companion8 = DivSize.f38833a;
            Function2<ParsingEnvironment, JSONObject, DivSize> function22 = DivSize.f38834b;
            DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject, "height", function22, f34328a, parsingEnvironment);
            if (divSize == null) {
                divSize = DivVideo.f40649Q;
            }
            DivSize divSize2 = divSize;
            Intrinsics.m32178g(divSize2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            String str2 = (String) JsonParser.m17323o(jSONObject, "id", DivVideo.f40669k0, f34328a, parsingEnvironment);
            DivEdgeInsets.Companion companion9 = DivEdgeInsets.f35607f;
            Function2<ParsingEnvironment, JSONObject, DivEdgeInsets> function23 = DivEdgeInsets.f35618q;
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "margins", function23, f34328a, parsingEnvironment);
            if (divEdgeInsets == null) {
                divEdgeInsets = DivVideo.f40650R;
            }
            DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
            Intrinsics.m32178g(divEdgeInsets2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            Expression<Boolean> expression4 = DivVideo.f40651S;
            Expression<Boolean> expression5 = expression3;
            Expression<Double> expression6 = expression2;
            Expression<Boolean> m17330v2 = JsonParser.m17330v(jSONObject, "muted", function12, f34328a, parsingEnvironment, expression4, typeHelper);
            if (m17330v2 != null) {
                expression4 = m17330v2;
            }
            DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "paddings", function23, f34328a, parsingEnvironment);
            if (divEdgeInsets3 == null) {
                divEdgeInsets3 = DivVideo.f40652T;
            }
            DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
            Intrinsics.m32178g(divEdgeInsets4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            List m17333y7 = JsonParser.m17333y(jSONObject, "pause_actions", function2, DivVideo.f40670l0, f34328a, parsingEnvironment);
            Object m17310b = JsonParser.m17310b(jSONObject, "player_settings_payload");
            if (m17310b == null) {
                m17310b = null;
            }
            JSONObject jSONObject2 = (JSONObject) m17310b;
            Expression m17325q = JsonParser.m17325q(jSONObject, "preview", DivVideo.f40671m0, f34328a, parsingEnvironment, TypeHelpersKt.f33850c);
            Expression<Boolean> expression7 = DivVideo.f40653U;
            Expression<Boolean> m17330v3 = JsonParser.m17330v(jSONObject, "repeatable", function12, f34328a, parsingEnvironment, expression7, typeHelper);
            if (m17330v3 != null) {
                expression7 = m17330v3;
            }
            List m17333y8 = JsonParser.m17333y(jSONObject, "resume_actions", function2, DivVideo.f40672n0, f34328a, parsingEnvironment);
            Expression m17327s2 = JsonParser.m17327s(jSONObject, "row_span", function13, DivVideo.f40673o0, f34328a, parsingEnvironment, typeHelper2);
            List m17333y9 = JsonParser.m17333y(jSONObject, "selected_actions", function2, DivVideo.f40674p0, f34328a, parsingEnvironment);
            DivTooltip.Companion companion10 = DivTooltip.f40492h;
            List m17333y10 = JsonParser.m17333y(jSONObject, "tooltips", DivTooltip.f40497m, DivVideo.f40675q0, f34328a, parsingEnvironment);
            DivTransform.Companion companion11 = DivTransform.f40551d;
            DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject, "transform", DivTransform.f40554g, f34328a, parsingEnvironment);
            if (divTransform == null) {
                divTransform = DivVideo.f40654V;
            }
            DivTransform divTransform2 = divTransform;
            Intrinsics.m32178g(divTransform2, "JsonParser.readOptional(…: TRANSFORM_DEFAULT_VALUE");
            DivChangeTransition.Companion companion12 = DivChangeTransition.f34856a;
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonParser.m17322n(jSONObject, "transition_change", DivChangeTransition.f34857b, f34328a, parsingEnvironment);
            DivAppearanceTransition.Companion companion13 = DivAppearanceTransition.f34726a;
            Function2<ParsingEnvironment, JSONObject, DivAppearanceTransition> function24 = DivAppearanceTransition.f34727b;
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonParser.m17322n(jSONObject, "transition_in", function24, f34328a, parsingEnvironment);
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonParser.m17322n(jSONObject, "transition_out", function24, f34328a, parsingEnvironment);
            DivTransitionTrigger.Converter converter3 = DivTransitionTrigger.f40582c;
            List m17332x = JsonParser.m17332x(jSONObject, "transition_triggers", DivTransitionTrigger.f40583d, DivVideo.f40676r0, f34328a, parsingEnvironment);
            DivVideoSource.Companion companion14 = DivVideoSource.f40720e;
            List m17321m = JsonParser.m17321m(jSONObject, "video_sources", DivVideoSource.f40721f, DivVideo.f40677s0, f34328a, parsingEnvironment);
            Intrinsics.m32178g(m17321m, "readList(json, \"video_so…S_VALIDATOR, logger, env)");
            DivVisibility.Converter converter4 = DivVisibility.f40930c;
            Function1<String, DivVisibility> function14 = DivVisibility.f40931d;
            Expression<DivVisibility> expression8 = DivVideo.f40655W;
            Expression<DivVisibility> m17330v4 = JsonParser.m17330v(jSONObject, "visibility", function14, f34328a, parsingEnvironment, expression8, DivVideo.f40659a0);
            Expression<DivVisibility> expression9 = m17330v4 == null ? expression8 : m17330v4;
            DivVisibilityAction.Companion companion15 = DivVisibilityAction.f40938i;
            Function2<ParsingEnvironment, JSONObject, DivVisibilityAction> function25 = DivVisibilityAction.f40946q;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonParser.m17322n(jSONObject, "visibility_action", function25, f34328a, parsingEnvironment);
            List m17333y11 = JsonParser.m17333y(jSONObject, "visibility_actions", function25, DivVideo.f40678t0, f34328a, parsingEnvironment);
            DivSize divSize3 = (DivSize) JsonParser.m17322n(jSONObject, "width", function22, f34328a, parsingEnvironment);
            if (divSize3 == null) {
                divSize3 = DivVideo.f40656X;
            }
            Intrinsics.m32178g(divSize3, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new DivVideo(divAccessibility2, m17329u, m17329u2, expression6, expression5, m17333y, divBorder2, m17333y2, m17327s, m17333y3, str, m17333y4, m17333y5, m17333y6, divFocus, divSize2, str2, divEdgeInsets2, expression4, divEdgeInsets4, m17333y7, jSONObject2, m17325q, expression7, m17333y8, m17327s2, m17333y9, m17333y10, divTransform2, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17332x, m17321m, expression9, divVisibilityAction, m17333y11, divSize3);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression expression = null;
        Expression expression2 = null;
        f40645M = new DivAccessibility(null, null, expression, null, expression2, null, 63);
        Expression.Companion companion = Expression.f34334a;
        f40646N = companion.m17539a(Double.valueOf(1.0d));
        Boolean bool = Boolean.FALSE;
        f40647O = companion.m17539a(bool);
        f40648P = new DivBorder(expression, 0 == true ? 1 : 0, expression2, 0 == true ? 1 : 0, null, 31);
        int i2 = 7;
        f40649Q = new DivSize.WrapContent(new DivWrapContentSize(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i2));
        Expression expression3 = null;
        Expression expression4 = null;
        int i3 = 31;
        f40650R = new DivEdgeInsets(expression2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, expression3, expression4, i3);
        f40651S = companion.m17539a(bool);
        f40652T = new DivEdgeInsets(expression2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, expression3, expression4, i3);
        f40653U = companion.m17539a(bool);
        f40654V = new DivTransform(0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i2);
        f40655W = companion.m17539a(DivVisibility.VISIBLE);
        f40656X = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i4 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f40657Y = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivVideo$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f40658Z = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivVideo$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f40659a0 = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivVideo$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f40660b0 = C3064p0.f41882g;
        f40661c0 = C3062o0.f41839t;
        f40662d0 = C3062o0.f41840u;
        f40663e0 = C3064p0.f41883h;
        f40664f0 = C3062o0.f41841v;
        f40665g0 = C3064p0.f41884i;
        f40666h0 = C3062o0.f41842w;
        f40667i0 = C3062o0.f41830k;
        f40668j0 = C3062o0.f41831l;
        f40669k0 = C3064p0.f41879d;
        f40670l0 = C3062o0.f41832m;
        f40671m0 = C3064p0.f41880e;
        f40672n0 = C3062o0.f41833n;
        f40673o0 = C3064p0.f41881f;
        f40674p0 = C3062o0.f41834o;
        f40675q0 = C3062o0.f41835p;
        f40676r0 = C3062o0.f41836q;
        f40677s0 = C3062o0.f41837r;
        f40678t0 = C3062o0.f41838s;
        DivVideo$Companion$CREATOR$1 divVideo$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivVideo>() { // from class: com.yandex.div2.DivVideo$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivVideo invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivVideo.f40644L.m17726a(env, it);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @DivModelInternalApi
    public DivVideo(@NotNull DivAccessibility accessibility, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> alpha, @NotNull Expression<Boolean> autostart, @Nullable List<? extends DivBackground> list, @NotNull DivBorder border, @Nullable List<? extends DivAction> list2, @Nullable Expression<Long> expression3, @Nullable List<? extends DivDisappearAction> list3, @Nullable String str, @Nullable List<? extends DivAction> list4, @Nullable List<? extends DivExtension> list5, @Nullable List<? extends DivAction> list6, @Nullable DivFocus divFocus, @NotNull DivSize height, @Nullable String str2, @NotNull DivEdgeInsets margins, @NotNull Expression<Boolean> muted, @NotNull DivEdgeInsets paddings, @Nullable List<? extends DivAction> list7, @Nullable JSONObject jSONObject, @Nullable Expression<String> expression4, @NotNull Expression<Boolean> repeatable, @Nullable List<? extends DivAction> list8, @Nullable Expression<Long> expression5, @Nullable List<? extends DivAction> list9, @Nullable List<? extends DivTooltip> list10, @NotNull DivTransform transform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list11, @NotNull List<? extends DivVideoSource> videoSources, @NotNull Expression<DivVisibility> visibility, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<? extends DivVisibilityAction> list12, @NotNull DivSize width) {
        Intrinsics.m32179h(accessibility, "accessibility");
        Intrinsics.m32179h(alpha, "alpha");
        Intrinsics.m32179h(autostart, "autostart");
        Intrinsics.m32179h(border, "border");
        Intrinsics.m32179h(height, "height");
        Intrinsics.m32179h(margins, "margins");
        Intrinsics.m32179h(muted, "muted");
        Intrinsics.m32179h(paddings, "paddings");
        Intrinsics.m32179h(repeatable, "repeatable");
        Intrinsics.m32179h(transform, "transform");
        Intrinsics.m32179h(videoSources, "videoSources");
        Intrinsics.m32179h(visibility, "visibility");
        Intrinsics.m32179h(width, "width");
        this.f40690a = accessibility;
        this.f40691b = expression;
        this.f40692c = expression2;
        this.f40693d = alpha;
        this.f40694e = autostart;
        this.f40695f = list;
        this.f40696g = border;
        this.f40697h = list2;
        this.f40698i = expression3;
        this.f40699j = list3;
        this.f40700k = str;
        this.f40701l = list4;
        this.f40702m = list5;
        this.f40703n = list6;
        this.f40704o = divFocus;
        this.f40705p = height;
        this.f40706q = str2;
        this.f40707r = margins;
        this.f40708s = muted;
        this.f40709t = paddings;
        this.f40710u = list7;
        this.f40711v = jSONObject;
        this.f40712w = repeatable;
        this.f40713x = list8;
        this.f40714y = expression5;
        this.f40715z = list9;
        this.f40679A = list10;
        this.f40680B = transform;
        this.f40681C = divChangeTransition;
        this.f40682D = divAppearanceTransition;
        this.f40683E = divAppearanceTransition2;
        this.f40684F = list11;
        this.f40685G = videoSources;
        this.f40686H = visibility;
        this.f40687I = divVisibilityAction;
        this.f40688J = list12;
        this.f40689K = width;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: a, reason: from getter */
    public DivSize getF38959k() {
        return this.f40705p;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: b, reason: from getter */
    public DivTransform getF38940D() {
        return this.f40680B;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: c */
    public List<DivVisibilityAction> mo17569c() {
        return this.f40688J;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: d */
    public List<DivBackground> mo17570d() {
        return this.f40695f;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: e, reason: from getter */
    public DivAccessibility getF38949a() {
        return this.f40690a;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: f */
    public Expression<Long> mo17572f() {
        return this.f40698i;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: g, reason: from getter */
    public DivSize getF38948L() {
        return this.f40689K;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: getBorder, reason: from getter */
    public DivBorder getF38954f() {
        return this.f40696g;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: getId, reason: from getter */
    public String getF38960l() {
        return this.f40706q;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    public Expression<DivVisibility> getVisibility() {
        return this.f40686H;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: h, reason: from getter */
    public DivEdgeInsets getF38961m() {
        return this.f40707r;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: i */
    public Expression<Long> mo17575i() {
        return this.f40714y;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: j, reason: from getter */
    public DivEdgeInsets getF38964p() {
        return this.f40709t;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: k */
    public List<DivTransitionTrigger> mo17577k() {
        return this.f40684F;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: l */
    public List<DivAction> mo17578l() {
        return this.f40715z;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: m */
    public Expression<DivAlignmentHorizontal> mo17579m() {
        return this.f40691b;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: n */
    public List<DivExtension> mo17580n() {
        return this.f40702m;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: o */
    public List<DivTooltip> mo17581o() {
        return this.f40679A;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: p, reason: from getter */
    public DivVisibilityAction getF38946J() {
        return this.f40687I;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: q */
    public Expression<DivAlignmentVertical> mo17583q() {
        return this.f40692c;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: r, reason: from getter */
    public DivAppearanceTransition getF38942F() {
        return this.f40682D;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: s */
    public Expression<Double> mo17585s() {
        return this.f40693d;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: t, reason: from getter */
    public DivFocus getF38958j() {
        return this.f40704o;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: u, reason: from getter */
    public DivAppearanceTransition getF38943G() {
        return this.f40683E;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: v, reason: from getter */
    public DivChangeTransition getF38941E() {
        return this.f40681C;
    }
}
