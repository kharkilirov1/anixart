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
import com.yandex.div2.Div;
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
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivSize;
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

/* compiled from: DivGallery.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivGallery;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div2/DivBase;", "Companion", "CrossContentAlignment", "Orientation", "ScrollMode", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivGallery implements JSONSerializable, DivBase {

    /* renamed from: J */
    @NotNull
    public static final Companion f35892J = new Companion(null);

    /* renamed from: K */
    @NotNull
    public static final DivAccessibility f35893K;

    /* renamed from: L */
    @NotNull
    public static final Expression<Double> f35894L;

    /* renamed from: M */
    @NotNull
    public static final DivBorder f35895M;

    /* renamed from: N */
    @NotNull
    public static final Expression<CrossContentAlignment> f35896N;

    /* renamed from: O */
    @NotNull
    public static final Expression<Long> f35897O;

    /* renamed from: P */
    @NotNull
    public static final DivSize.WrapContent f35898P;

    /* renamed from: Q */
    @NotNull
    public static final Expression<Long> f35899Q;

    /* renamed from: R */
    @NotNull
    public static final DivEdgeInsets f35900R;

    /* renamed from: S */
    @NotNull
    public static final Expression<Orientation> f35901S;

    /* renamed from: T */
    @NotNull
    public static final DivEdgeInsets f35902T;

    /* renamed from: U */
    @NotNull
    public static final Expression<Boolean> f35903U;

    /* renamed from: V */
    @NotNull
    public static final Expression<ScrollMode> f35904V;

    /* renamed from: W */
    @NotNull
    public static final DivTransform f35905W;

    /* renamed from: X */
    @NotNull
    public static final Expression<DivVisibility> f35906X;

    /* renamed from: Y */
    @NotNull
    public static final DivSize.MatchParent f35907Y;

    /* renamed from: Z */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f35908Z;

    /* renamed from: a0 */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f35909a0;

    /* renamed from: b0 */
    @NotNull
    public static final TypeHelper<CrossContentAlignment> f35910b0;

    /* renamed from: c0 */
    @NotNull
    public static final TypeHelper<Orientation> f35911c0;

    /* renamed from: d0 */
    @NotNull
    public static final TypeHelper<ScrollMode> f35912d0;

    /* renamed from: e0 */
    @NotNull
    public static final TypeHelper<DivVisibility> f35913e0;

    /* renamed from: f0 */
    @NotNull
    public static final ValueValidator<Double> f35914f0;

    /* renamed from: g0 */
    @NotNull
    public static final ListValidator<DivBackground> f35915g0;

    /* renamed from: h0 */
    @NotNull
    public static final ValueValidator<Long> f35916h0;

    /* renamed from: i0 */
    @NotNull
    public static final ValueValidator<Long> f35917i0;

    /* renamed from: j0 */
    @NotNull
    public static final ValueValidator<Long> f35918j0;

    /* renamed from: k0 */
    @NotNull
    public static final ValueValidator<Long> f35919k0;

    /* renamed from: l0 */
    @NotNull
    public static final ListValidator<DivDisappearAction> f35920l0;

    /* renamed from: m0 */
    @NotNull
    public static final ListValidator<DivExtension> f35921m0;

    /* renamed from: n0 */
    @NotNull
    public static final ValueValidator<String> f35922n0;

    /* renamed from: o0 */
    @NotNull
    public static final ValueValidator<Long> f35923o0;

    /* renamed from: p0 */
    @NotNull
    public static final ListValidator<Div> f35924p0;

    /* renamed from: q0 */
    @NotNull
    public static final ValueValidator<Long> f35925q0;

    /* renamed from: r0 */
    @NotNull
    public static final ListValidator<DivAction> f35926r0;

    /* renamed from: s0 */
    @NotNull
    public static final ListValidator<DivTooltip> f35927s0;

    /* renamed from: t0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f35928t0;

    /* renamed from: u0 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f35929u0;

    /* renamed from: A */
    @NotNull
    public final DivTransform f35930A;

    /* renamed from: B */
    @Nullable
    public final DivChangeTransition f35931B;

    /* renamed from: C */
    @Nullable
    public final DivAppearanceTransition f35932C;

    /* renamed from: D */
    @Nullable
    public final DivAppearanceTransition f35933D;

    /* renamed from: E */
    @Nullable
    public final List<DivTransitionTrigger> f35934E;

    /* renamed from: F */
    @NotNull
    public final Expression<DivVisibility> f35935F;

    /* renamed from: G */
    @Nullable
    public final DivVisibilityAction f35936G;

    /* renamed from: H */
    @Nullable
    public final List<DivVisibilityAction> f35937H;

    /* renamed from: I */
    @NotNull
    public final DivSize f35938I;

    /* renamed from: a */
    @NotNull
    public final DivAccessibility f35939a;

    /* renamed from: b */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f35940b;

    /* renamed from: c */
    @Nullable
    public final Expression<DivAlignmentVertical> f35941c;

    /* renamed from: d */
    @NotNull
    public final Expression<Double> f35942d;

    /* renamed from: e */
    @Nullable
    public final List<DivBackground> f35943e;

    /* renamed from: f */
    @NotNull
    public final DivBorder f35944f;

    /* renamed from: g */
    @JvmField
    @Nullable
    public final Expression<Long> f35945g;

    /* renamed from: h */
    @Nullable
    public final Expression<Long> f35946h;

    /* renamed from: i */
    @JvmField
    @NotNull
    public final Expression<CrossContentAlignment> f35947i;

    /* renamed from: j */
    @JvmField
    @Nullable
    public final Expression<Long> f35948j;

    /* renamed from: k */
    @JvmField
    @NotNull
    public final Expression<Long> f35949k;

    /* renamed from: l */
    @Nullable
    public final List<DivDisappearAction> f35950l;

    /* renamed from: m */
    @Nullable
    public final List<DivExtension> f35951m;

    /* renamed from: n */
    @Nullable
    public final DivFocus f35952n;

    /* renamed from: o */
    @NotNull
    public final DivSize f35953o;

    /* renamed from: p */
    @Nullable
    public final String f35954p;

    /* renamed from: q */
    @JvmField
    @NotNull
    public final Expression<Long> f35955q;

    /* renamed from: r */
    @JvmField
    @NotNull
    public final List<Div> f35956r;

    /* renamed from: s */
    @NotNull
    public final DivEdgeInsets f35957s;

    /* renamed from: t */
    @JvmField
    @NotNull
    public final Expression<Orientation> f35958t;

    /* renamed from: u */
    @NotNull
    public final DivEdgeInsets f35959u;

    /* renamed from: v */
    @JvmField
    @NotNull
    public final Expression<Boolean> f35960v;

    /* renamed from: w */
    @Nullable
    public final Expression<Long> f35961w;

    /* renamed from: x */
    @JvmField
    @NotNull
    public final Expression<ScrollMode> f35962x;

    /* renamed from: y */
    @Nullable
    public final List<DivAction> f35963y;

    /* renamed from: z */
    @Nullable
    public final List<DivTooltip> f35964z;

    /* compiled from: DivGallery.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000bR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u000bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u000bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u000bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u000bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0010R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0010R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u000bR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u000bR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0010R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00140\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\bR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u000bR\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u000bR\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\bR\u0014\u00104\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00101R\u001a\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\bR\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\u000bR\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\u000bR\u001a\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\bR\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\u0010R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010\u0010R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010\u0010R\u0014\u0010D\u001a\u00020'8\u0006X\u0086T¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020G0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020J0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010IR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00190F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010IR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u0002020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010IR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u0002090F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010IR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020O0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010IR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010\u0010R\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020O0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010\bR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006W"}, m31884d2 = {"Lcom/yandex/div2/DivGallery$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "", "COLUMN_COUNT_TEMPLATE_VALIDATOR", "COLUMN_COUNT_VALIDATOR", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivGallery$CrossContentAlignment;", "CROSS_CONTENT_ALIGNMENT_DEFAULT_VALUE", "CROSS_SPACING_TEMPLATE_VALIDATOR", "CROSS_SPACING_VALIDATOR", "DEFAULT_ITEM_DEFAULT_VALUE", "DEFAULT_ITEM_TEMPLATE_VALIDATOR", "DEFAULT_ITEM_VALIDATOR", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div2/Div;", "ITEMS_VALIDATOR", "ITEM_SPACING_DEFAULT_VALUE", "ITEM_SPACING_TEMPLATE_VALIDATOR", "ITEM_SPACING_VALIDATOR", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "Lcom/yandex/div2/DivGallery$Orientation;", "ORIENTATION_DEFAULT_VALUE", "PADDINGS_DEFAULT_VALUE", "", "RESTRICT_PARENT_SCROLL_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "Lcom/yandex/div2/DivGallery$ScrollMode;", "SCROLL_MODE_DEFAULT_VALUE", "Lcom/yandex/div2/DivAction;", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "TYPE_HELPER_CROSS_CONTENT_ALIGNMENT", "TYPE_HELPER_ORIENTATION", "TYPE_HELPER_SCROLL_MODE", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivGallery m17624a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            DivAccessibility.Companion companion = DivAccessibility.f34479f;
            DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject, "accessibility", DivAccessibility.f34486m, f34328a, parsingEnvironment);
            if (divAccessibility == null) {
                divAccessibility = DivGallery.f35893K;
            }
            DivAccessibility divAccessibility2 = divAccessibility;
            Intrinsics.m32178g(divAccessibility2, "JsonParser.readOptional(…CESSIBILITY_DEFAULT_VALUE");
            DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
            Expression m17329u = JsonParser.m17329u(jSONObject, "alignment_horizontal", DivAlignmentHorizontal.f34618d, f34328a, parsingEnvironment, DivGallery.f35908Z);
            DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
            Expression m17329u2 = JsonParser.m17329u(jSONObject, "alignment_vertical", DivAlignmentVertical.f34626d, f34328a, parsingEnvironment, DivGallery.f35909a0);
            Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
            ValueValidator<Double> valueValidator = DivGallery.f35914f0;
            Expression<Double> expression = DivGallery.f35894L;
            Expression<Double> m17328t = JsonParser.m17328t(jSONObject, "alpha", function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
            Expression<Double> expression2 = m17328t == null ? expression : m17328t;
            DivBackground.Companion companion2 = DivBackground.f34750a;
            List m17333y = JsonParser.m17333y(jSONObject, "background", DivBackground.f34751b, DivGallery.f35915g0, f34328a, parsingEnvironment);
            DivBorder.Companion companion3 = DivBorder.f34785f;
            DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject, "border", DivBorder.f34788i, f34328a, parsingEnvironment);
            if (divBorder == null) {
                divBorder = DivGallery.f35895M;
            }
            DivBorder divBorder2 = divBorder;
            Intrinsics.m32178g(divBorder2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            Function1<Number, Long> function12 = ParsingConvertersKt.f33831e;
            ValueValidator<Long> valueValidator2 = DivGallery.f35916h0;
            TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
            Expression m17327s = JsonParser.m17327s(jSONObject, "column_count", function12, valueValidator2, f34328a, parsingEnvironment, typeHelper);
            Expression m17327s2 = JsonParser.m17327s(jSONObject, "column_span", function12, DivGallery.f35917i0, f34328a, parsingEnvironment, typeHelper);
            CrossContentAlignment.Converter converter3 = CrossContentAlignment.f35972c;
            Function1<String, CrossContentAlignment> function13 = CrossContentAlignment.f35973d;
            Expression<CrossContentAlignment> expression3 = DivGallery.f35896N;
            Expression<CrossContentAlignment> m17330v = JsonParser.m17330v(jSONObject, "cross_content_alignment", function13, f34328a, parsingEnvironment, expression3, DivGallery.f35910b0);
            if (m17330v != null) {
                expression3 = m17330v;
            }
            Expression m17327s3 = JsonParser.m17327s(jSONObject, "cross_spacing", function12, DivGallery.f35918j0, f34328a, parsingEnvironment, typeHelper);
            ValueValidator<Long> valueValidator3 = DivGallery.f35919k0;
            Expression<Long> expression4 = DivGallery.f35897O;
            Expression<Long> m17328t2 = JsonParser.m17328t(jSONObject, "default_item", function12, valueValidator3, f34328a, expression4, typeHelper);
            if (m17328t2 != null) {
                expression4 = m17328t2;
            }
            DivDisappearAction.Companion companion4 = DivDisappearAction.f35537a;
            List m17333y2 = JsonParser.m17333y(jSONObject, "disappear_actions", DivDisappearAction.f35545i, DivGallery.f35920l0, f34328a, parsingEnvironment);
            DivExtension.Companion companion5 = DivExtension.f35659c;
            List m17333y3 = JsonParser.m17333y(jSONObject, "extensions", DivExtension.f35660d, DivGallery.f35921m0, f34328a, parsingEnvironment);
            DivFocus.Companion companion6 = DivFocus.f35813f;
            DivFocus divFocus = (DivFocus) JsonParser.m17322n(jSONObject, "focus", DivFocus.f35818k, f34328a, parsingEnvironment);
            DivSize.Companion companion7 = DivSize.f38833a;
            Function2<ParsingEnvironment, JSONObject, DivSize> function2 = DivSize.f38834b;
            DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject, "height", function2, f34328a, parsingEnvironment);
            if (divSize == null) {
                divSize = DivGallery.f35898P;
            }
            DivSize divSize2 = divSize;
            Intrinsics.m32178g(divSize2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            String str = (String) JsonParser.m17323o(jSONObject, "id", DivGallery.f35922n0, f34328a, parsingEnvironment);
            ValueValidator<Long> valueValidator4 = DivGallery.f35923o0;
            Expression<Long> expression5 = DivGallery.f35899Q;
            Expression<Long> m17328t3 = JsonParser.m17328t(jSONObject, "item_spacing", function12, valueValidator4, f34328a, expression5, typeHelper);
            if (m17328t3 != null) {
                expression5 = m17328t3;
            }
            Div.Companion companion8 = Div.f34418a;
            List m17321m = JsonParser.m17321m(jSONObject, "items", Div.f34419b, DivGallery.f35924p0, f34328a, parsingEnvironment);
            Intrinsics.m32178g(m17321m, "readList(json, \"items\", …S_VALIDATOR, logger, env)");
            DivEdgeInsets.Companion companion9 = DivEdgeInsets.f35607f;
            Function2<ParsingEnvironment, JSONObject, DivEdgeInsets> function22 = DivEdgeInsets.f35618q;
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "margins", function22, f34328a, parsingEnvironment);
            if (divEdgeInsets == null) {
                divEdgeInsets = DivGallery.f35900R;
            }
            DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
            Intrinsics.m32178g(divEdgeInsets2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            Orientation.Converter converter4 = Orientation.f35980c;
            Function1<String, Orientation> function14 = Orientation.f35981d;
            Expression<Orientation> expression6 = DivGallery.f35901S;
            Expression<Orientation> m17330v2 = JsonParser.m17330v(jSONObject, "orientation", function14, f34328a, parsingEnvironment, expression6, DivGallery.f35911c0);
            if (m17330v2 != null) {
                expression6 = m17330v2;
            }
            DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "paddings", function22, f34328a, parsingEnvironment);
            if (divEdgeInsets3 == null) {
                divEdgeInsets3 = DivGallery.f35902T;
            }
            DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
            Intrinsics.m32178g(divEdgeInsets4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            Function1<Object, Boolean> function15 = ParsingConvertersKt.f33829c;
            Expression<Boolean> expression7 = DivGallery.f35903U;
            Expression<Boolean> m17330v3 = JsonParser.m17330v(jSONObject, "restrict_parent_scroll", function15, f34328a, parsingEnvironment, expression7, TypeHelpersKt.f33848a);
            Expression<Boolean> expression8 = m17330v3 == null ? expression7 : m17330v3;
            Expression m17327s4 = JsonParser.m17327s(jSONObject, "row_span", function12, DivGallery.f35925q0, f34328a, parsingEnvironment, typeHelper);
            ScrollMode.Converter converter5 = ScrollMode.f35987c;
            Function1<String, ScrollMode> function16 = ScrollMode.f35988d;
            Expression<ScrollMode> expression9 = DivGallery.f35904V;
            Expression<ScrollMode> m17330v4 = JsonParser.m17330v(jSONObject, "scroll_mode", function16, f34328a, parsingEnvironment, expression9, DivGallery.f35912d0);
            Expression<ScrollMode> expression10 = m17330v4 == null ? expression9 : m17330v4;
            DivAction.Companion companion10 = DivAction.f34546g;
            List m17333y4 = JsonParser.m17333y(jSONObject, "selected_actions", DivAction.f34550k, DivGallery.f35926r0, f34328a, parsingEnvironment);
            DivTooltip.Companion companion11 = DivTooltip.f40492h;
            List m17333y5 = JsonParser.m17333y(jSONObject, "tooltips", DivTooltip.f40497m, DivGallery.f35927s0, f34328a, parsingEnvironment);
            DivTransform.Companion companion12 = DivTransform.f40551d;
            DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject, "transform", DivTransform.f40554g, f34328a, parsingEnvironment);
            if (divTransform == null) {
                divTransform = DivGallery.f35905W;
            }
            DivTransform divTransform2 = divTransform;
            Intrinsics.m32178g(divTransform2, "JsonParser.readOptional(…: TRANSFORM_DEFAULT_VALUE");
            DivChangeTransition.Companion companion13 = DivChangeTransition.f34856a;
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonParser.m17322n(jSONObject, "transition_change", DivChangeTransition.f34857b, f34328a, parsingEnvironment);
            DivAppearanceTransition.Companion companion14 = DivAppearanceTransition.f34726a;
            Function2<ParsingEnvironment, JSONObject, DivAppearanceTransition> function23 = DivAppearanceTransition.f34727b;
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonParser.m17322n(jSONObject, "transition_in", function23, f34328a, parsingEnvironment);
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonParser.m17322n(jSONObject, "transition_out", function23, f34328a, parsingEnvironment);
            DivTransitionTrigger.Converter converter6 = DivTransitionTrigger.f40582c;
            List m17332x = JsonParser.m17332x(jSONObject, "transition_triggers", DivTransitionTrigger.f40583d, DivGallery.f35928t0, f34328a, parsingEnvironment);
            DivVisibility.Converter converter7 = DivVisibility.f40930c;
            Function1<String, DivVisibility> function17 = DivVisibility.f40931d;
            Expression<DivVisibility> expression11 = DivGallery.f35906X;
            Expression<DivVisibility> m17330v5 = JsonParser.m17330v(jSONObject, "visibility", function17, f34328a, parsingEnvironment, expression11, DivGallery.f35913e0);
            Expression<DivVisibility> expression12 = m17330v5 == null ? expression11 : m17330v5;
            DivVisibilityAction.Companion companion15 = DivVisibilityAction.f40938i;
            Function2<ParsingEnvironment, JSONObject, DivVisibilityAction> function24 = DivVisibilityAction.f40946q;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonParser.m17322n(jSONObject, "visibility_action", function24, f34328a, parsingEnvironment);
            List m17333y6 = JsonParser.m17333y(jSONObject, "visibility_actions", function24, DivGallery.f35929u0, f34328a, parsingEnvironment);
            DivSize divSize3 = (DivSize) JsonParser.m17322n(jSONObject, "width", function2, f34328a, parsingEnvironment);
            if (divSize3 == null) {
                divSize3 = DivGallery.f35907Y;
            }
            Intrinsics.m32178g(divSize3, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new DivGallery(divAccessibility2, m17329u, m17329u2, expression2, m17333y, divBorder2, m17327s, m17327s2, expression3, m17327s3, expression4, m17333y2, m17333y3, divFocus, divSize2, str, expression5, m17321m, divEdgeInsets2, expression6, divEdgeInsets4, expression8, m17327s4, expression10, m17333y4, m17333y5, divTransform2, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17332x, expression12, divVisibilityAction, m17333y6, divSize3);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivGallery.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div2/DivGallery$CrossContentAlignment;", "", "Converter", "START", "CENTER", "END", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public enum CrossContentAlignment {
        START("start"),
        CENTER("center"),
        END("end");


        /* renamed from: c */
        @NotNull
        public static final Converter f35972c = new Converter(null);

        /* renamed from: d */
        @NotNull
        public static final Function1<String, CrossContentAlignment> f35973d = new Function1<String, CrossContentAlignment>() { // from class: com.yandex.div2.DivGallery$CrossContentAlignment$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            public DivGallery.CrossContentAlignment invoke(String str) {
                String string = str;
                Intrinsics.m32179h(string, "string");
                DivGallery.CrossContentAlignment crossContentAlignment = DivGallery.CrossContentAlignment.START;
                if (Intrinsics.m32174c(string, "start")) {
                    return crossContentAlignment;
                }
                DivGallery.CrossContentAlignment crossContentAlignment2 = DivGallery.CrossContentAlignment.CENTER;
                if (Intrinsics.m32174c(string, "center")) {
                    return crossContentAlignment2;
                }
                DivGallery.CrossContentAlignment crossContentAlignment3 = DivGallery.CrossContentAlignment.END;
                if (Intrinsics.m32174c(string, "end")) {
                    return crossContentAlignment3;
                }
                return null;
            }
        };

        /* renamed from: b */
        @NotNull
        public final String f35978b;

        /* compiled from: DivGallery.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivGallery$CrossContentAlignment$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Converter {
            public Converter() {
            }

            public Converter(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        CrossContentAlignment(String str) {
            this.f35978b = str;
        }
    }

    /* compiled from: DivGallery.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivGallery$Orientation;", "", "Converter", "HORIZONTAL", "VERTICAL", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public enum Orientation {
        HORIZONTAL("horizontal"),
        VERTICAL("vertical");


        /* renamed from: c */
        @NotNull
        public static final Converter f35980c = new Converter(null);

        /* renamed from: d */
        @NotNull
        public static final Function1<String, Orientation> f35981d = new Function1<String, Orientation>() { // from class: com.yandex.div2.DivGallery$Orientation$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            public DivGallery.Orientation invoke(String str) {
                String string = str;
                Intrinsics.m32179h(string, "string");
                DivGallery.Orientation orientation = DivGallery.Orientation.HORIZONTAL;
                if (Intrinsics.m32174c(string, "horizontal")) {
                    return orientation;
                }
                DivGallery.Orientation orientation2 = DivGallery.Orientation.VERTICAL;
                if (Intrinsics.m32174c(string, "vertical")) {
                    return orientation2;
                }
                return null;
            }
        };

        /* renamed from: b */
        @NotNull
        public final String f35985b;

        /* compiled from: DivGallery.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivGallery$Orientation$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Converter {
            public Converter() {
            }

            public Converter(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        Orientation(String str) {
            this.f35985b = str;
        }
    }

    /* compiled from: DivGallery.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivGallery$ScrollMode;", "", "Converter", "PAGING", "DEFAULT", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public enum ScrollMode {
        PAGING("paging"),
        DEFAULT("default");


        /* renamed from: c */
        @NotNull
        public static final Converter f35987c = new Converter(null);

        /* renamed from: d */
        @NotNull
        public static final Function1<String, ScrollMode> f35988d = new Function1<String, ScrollMode>() { // from class: com.yandex.div2.DivGallery$ScrollMode$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            public DivGallery.ScrollMode invoke(String str) {
                String string = str;
                Intrinsics.m32179h(string, "string");
                DivGallery.ScrollMode scrollMode = DivGallery.ScrollMode.PAGING;
                if (Intrinsics.m32174c(string, "paging")) {
                    return scrollMode;
                }
                DivGallery.ScrollMode scrollMode2 = DivGallery.ScrollMode.DEFAULT;
                if (Intrinsics.m32174c(string, "default")) {
                    return scrollMode2;
                }
                return null;
            }
        };

        /* renamed from: b */
        @NotNull
        public final String f35992b;

        /* compiled from: DivGallery.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivGallery$ScrollMode$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Converter {
            public Converter() {
            }

            public Converter(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        ScrollMode(String str) {
            this.f35992b = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression expression = null;
        Expression expression2 = null;
        f35893K = new DivAccessibility(null, expression, null, expression2, null, null, 63);
        Expression.Companion companion = Expression.f34334a;
        f35894L = companion.m17539a(Double.valueOf(1.0d));
        f35895M = new DivBorder(expression, null == true ? 1 : 0, expression2, null == true ? 1 : 0, null == true ? 1 : 0, 31);
        f35896N = companion.m17539a(CrossContentAlignment.START);
        f35897O = companion.m17539a(0L);
        int i2 = 7;
        f35898P = new DivSize.WrapContent(new DivWrapContentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, i2));
        f35899Q = companion.m17539a(8L);
        Expression expression3 = null;
        Expression expression4 = null;
        int i3 = 31;
        f35900R = new DivEdgeInsets(expression2, null == true ? 1 : 0, null == true ? 1 : 0, expression3, expression4, i3);
        f35901S = companion.m17539a(Orientation.HORIZONTAL);
        f35902T = new DivEdgeInsets(expression2, null == true ? 1 : 0, null == true ? 1 : 0, expression3, expression4, i3);
        f35903U = companion.m17539a(Boolean.FALSE);
        f35904V = companion.m17539a(ScrollMode.DEFAULT);
        f35905W = new DivTransform(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, i2);
        f35906X = companion.m17539a(DivVisibility.VISIBLE);
        f35907Y = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i4 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f35908Z = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGallery$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f35909a0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGallery$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f35910b0 = companion2.m17372a(ArraysKt.m31926B(CrossContentAlignment.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGallery$Companion$TYPE_HELPER_CROSS_CONTENT_ALIGNMENT$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivGallery.CrossContentAlignment);
            }
        });
        f35911c0 = companion2.m17372a(ArraysKt.m31926B(Orientation.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGallery$Companion$TYPE_HELPER_ORIENTATION$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivGallery.Orientation);
            }
        });
        f35912d0 = companion2.m17372a(ArraysKt.m31926B(ScrollMode.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGallery$Companion$TYPE_HELPER_SCROLL_MODE$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivGallery.ScrollMode);
            }
        });
        f35913e0 = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivGallery$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f35914f0 = C3055l.f41648v;
        f35915g0 = C3053k.f41606u;
        f35916h0 = C3055l.f41649w;
        f35917i0 = C3057m.f41680c;
        f35918j0 = C3057m.f41681d;
        f35919k0 = C3055l.f41644r;
        f35920l0 = C3053k.f41599n;
        f35921m0 = C3053k.f41600o;
        f35922n0 = C3055l.f41645s;
        f35923o0 = C3055l.f41646t;
        f35924p0 = C3053k.f41601p;
        f35925q0 = C3055l.f41647u;
        f35926r0 = C3053k.f41602q;
        f35927s0 = C3053k.f41603r;
        f35928t0 = C3053k.f41604s;
        f35929u0 = C3053k.f41605t;
        DivGallery$Companion$CREATOR$1 divGallery$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivGallery>() { // from class: com.yandex.div2.DivGallery$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivGallery invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivGallery.f35892J.m17624a(env, it);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @DivModelInternalApi
    public DivGallery(@NotNull DivAccessibility accessibility, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> alpha, @Nullable List<? extends DivBackground> list, @NotNull DivBorder border, @Nullable Expression<Long> expression3, @Nullable Expression<Long> expression4, @NotNull Expression<CrossContentAlignment> crossContentAlignment, @Nullable Expression<Long> expression5, @NotNull Expression<Long> defaultItem, @Nullable List<? extends DivDisappearAction> list2, @Nullable List<? extends DivExtension> list3, @Nullable DivFocus divFocus, @NotNull DivSize height, @Nullable String str, @NotNull Expression<Long> itemSpacing, @NotNull List<? extends Div> items, @NotNull DivEdgeInsets margins, @NotNull Expression<Orientation> orientation, @NotNull DivEdgeInsets paddings, @NotNull Expression<Boolean> restrictParentScroll, @Nullable Expression<Long> expression6, @NotNull Expression<ScrollMode> scrollMode, @Nullable List<? extends DivAction> list4, @Nullable List<? extends DivTooltip> list5, @NotNull DivTransform transform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list6, @NotNull Expression<DivVisibility> visibility, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<? extends DivVisibilityAction> list7, @NotNull DivSize width) {
        Intrinsics.m32179h(accessibility, "accessibility");
        Intrinsics.m32179h(alpha, "alpha");
        Intrinsics.m32179h(border, "border");
        Intrinsics.m32179h(crossContentAlignment, "crossContentAlignment");
        Intrinsics.m32179h(defaultItem, "defaultItem");
        Intrinsics.m32179h(height, "height");
        Intrinsics.m32179h(itemSpacing, "itemSpacing");
        Intrinsics.m32179h(items, "items");
        Intrinsics.m32179h(margins, "margins");
        Intrinsics.m32179h(orientation, "orientation");
        Intrinsics.m32179h(paddings, "paddings");
        Intrinsics.m32179h(restrictParentScroll, "restrictParentScroll");
        Intrinsics.m32179h(scrollMode, "scrollMode");
        Intrinsics.m32179h(transform, "transform");
        Intrinsics.m32179h(visibility, "visibility");
        Intrinsics.m32179h(width, "width");
        this.f35939a = accessibility;
        this.f35940b = expression;
        this.f35941c = expression2;
        this.f35942d = alpha;
        this.f35943e = list;
        this.f35944f = border;
        this.f35945g = expression3;
        this.f35946h = expression4;
        this.f35947i = crossContentAlignment;
        this.f35948j = expression5;
        this.f35949k = defaultItem;
        this.f35950l = list2;
        this.f35951m = list3;
        this.f35952n = divFocus;
        this.f35953o = height;
        this.f35954p = str;
        this.f35955q = itemSpacing;
        this.f35956r = items;
        this.f35957s = margins;
        this.f35958t = orientation;
        this.f35959u = paddings;
        this.f35960v = restrictParentScroll;
        this.f35961w = expression6;
        this.f35962x = scrollMode;
        this.f35963y = list4;
        this.f35964z = list5;
        this.f35930A = transform;
        this.f35931B = divChangeTransition;
        this.f35932C = divAppearanceTransition;
        this.f35933D = divAppearanceTransition2;
        this.f35934E = list6;
        this.f35935F = visibility;
        this.f35936G = divVisibilityAction;
        this.f35937H = list7;
        this.f35938I = width;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: a, reason: from getter */
    public DivSize getF37796l() {
        return this.f35953o;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: b, reason: from getter */
    public DivTransform getF37808x() {
        return this.f35930A;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: c */
    public List<DivVisibilityAction> mo17569c() {
        return this.f35937H;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: d */
    public List<DivBackground> mo17570d() {
        return this.f35943e;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: e, reason: from getter */
    public DivAccessibility getF37785a() {
        return this.f35939a;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: f */
    public Expression<Long> mo17572f() {
        return this.f35946h;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: g, reason: from getter */
    public DivSize getF37784F() {
        return this.f35938I;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: getBorder, reason: from getter */
    public DivBorder getF37790f() {
        return this.f35944f;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: getId, reason: from getter */
    public String getF37797m() {
        return this.f35954p;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    public Expression<DivVisibility> getVisibility() {
        return this.f35935F;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: h, reason: from getter */
    public DivEdgeInsets getF37801q() {
        return this.f35957s;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: i */
    public Expression<Long> mo17575i() {
        return this.f35961w;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: j, reason: from getter */
    public DivEdgeInsets getF37803s() {
        return this.f35959u;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: k */
    public List<DivTransitionTrigger> mo17577k() {
        return this.f35934E;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: l */
    public List<DivAction> mo17578l() {
        return this.f35963y;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: m */
    public Expression<DivAlignmentHorizontal> mo17579m() {
        return this.f35940b;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: n */
    public List<DivExtension> mo17580n() {
        return this.f35951m;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: o */
    public List<DivTooltip> mo17581o() {
        return this.f35964z;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: p, reason: from getter */
    public DivVisibilityAction getF37782D() {
        return this.f35936G;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: q */
    public Expression<DivAlignmentVertical> mo17583q() {
        return this.f35941c;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: r, reason: from getter */
    public DivAppearanceTransition getF37810z() {
        return this.f35932C;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: s */
    public Expression<Double> mo17585s() {
        return this.f35942d;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: t, reason: from getter */
    public DivFocus getF37795k() {
        return this.f35952n;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: u, reason: from getter */
    public DivAppearanceTransition getF37779A() {
        return this.f35933D;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: v, reason: from getter */
    public DivChangeTransition getF37809y() {
        return this.f35931B;
    }
}
