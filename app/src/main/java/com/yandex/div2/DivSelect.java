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
import com.yandex.div2.DivSelect;
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

/* compiled from: DivSelect.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivSelect;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div2/DivBase;", "Companion", "Option", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivSelect implements JSONSerializable, DivBase {

    /* renamed from: L */
    @NotNull
    public static final Companion f38266L = new Companion(null);

    /* renamed from: M */
    @NotNull
    public static final DivAccessibility f38267M;

    /* renamed from: N */
    @NotNull
    public static final Expression<Double> f38268N;

    /* renamed from: O */
    @NotNull
    public static final DivBorder f38269O;

    /* renamed from: P */
    @NotNull
    public static final Expression<DivFontFamily> f38270P;

    /* renamed from: Q */
    @NotNull
    public static final Expression<Long> f38271Q;

    /* renamed from: R */
    @NotNull
    public static final Expression<DivSizeUnit> f38272R;

    /* renamed from: S */
    @NotNull
    public static final Expression<DivFontWeight> f38273S;

    /* renamed from: T */
    @NotNull
    public static final DivSize.WrapContent f38274T;

    /* renamed from: U */
    @NotNull
    public static final Expression<Integer> f38275U;

    /* renamed from: V */
    @NotNull
    public static final Expression<Double> f38276V;

    /* renamed from: W */
    @NotNull
    public static final DivEdgeInsets f38277W;

    /* renamed from: X */
    @NotNull
    public static final DivEdgeInsets f38278X;

    /* renamed from: Y */
    @NotNull
    public static final Expression<Integer> f38279Y;

    /* renamed from: Z */
    @NotNull
    public static final DivTransform f38280Z;

    /* renamed from: a0 */
    @NotNull
    public static final Expression<DivVisibility> f38281a0;

    /* renamed from: b0 */
    @NotNull
    public static final DivSize.MatchParent f38282b0;

    /* renamed from: c0 */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f38283c0;

    /* renamed from: d0 */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f38284d0;

    /* renamed from: e0 */
    @NotNull
    public static final TypeHelper<DivFontFamily> f38285e0;

    /* renamed from: f0 */
    @NotNull
    public static final TypeHelper<DivSizeUnit> f38286f0;

    /* renamed from: g0 */
    @NotNull
    public static final TypeHelper<DivFontWeight> f38287g0;

    /* renamed from: h0 */
    @NotNull
    public static final TypeHelper<DivVisibility> f38288h0;

    /* renamed from: i0 */
    @NotNull
    public static final ValueValidator<Double> f38289i0;

    /* renamed from: j0 */
    @NotNull
    public static final ListValidator<DivBackground> f38290j0;

    /* renamed from: k0 */
    @NotNull
    public static final ValueValidator<Long> f38291k0;

    /* renamed from: l0 */
    @NotNull
    public static final ListValidator<DivDisappearAction> f38292l0;

    /* renamed from: m0 */
    @NotNull
    public static final ListValidator<DivExtension> f38293m0;

    /* renamed from: n0 */
    @NotNull
    public static final ValueValidator<Long> f38294n0;

    /* renamed from: o0 */
    @NotNull
    public static final ValueValidator<String> f38295o0;

    /* renamed from: p0 */
    @NotNull
    public static final ValueValidator<String> f38296p0;

    /* renamed from: q0 */
    @NotNull
    public static final ValueValidator<Long> f38297q0;

    /* renamed from: r0 */
    @NotNull
    public static final ListValidator<Option> f38298r0;

    /* renamed from: s0 */
    @NotNull
    public static final ValueValidator<Long> f38299s0;

    /* renamed from: t0 */
    @NotNull
    public static final ListValidator<DivAction> f38300t0;

    /* renamed from: u0 */
    @NotNull
    public static final ListValidator<DivTooltip> f38301u0;

    /* renamed from: v0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f38302v0;

    /* renamed from: w0 */
    @NotNull
    public static final ValueValidator<String> f38303w0;

    /* renamed from: x0 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f38304x0;

    /* renamed from: A */
    @Nullable
    public final List<DivTooltip> f38305A;

    /* renamed from: B */
    @NotNull
    public final DivTransform f38306B;

    /* renamed from: C */
    @Nullable
    public final DivChangeTransition f38307C;

    /* renamed from: D */
    @Nullable
    public final DivAppearanceTransition f38308D;

    /* renamed from: E */
    @Nullable
    public final DivAppearanceTransition f38309E;

    /* renamed from: F */
    @Nullable
    public final List<DivTransitionTrigger> f38310F;

    /* renamed from: G */
    @JvmField
    @NotNull
    public final String f38311G;

    /* renamed from: H */
    @NotNull
    public final Expression<DivVisibility> f38312H;

    /* renamed from: I */
    @Nullable
    public final DivVisibilityAction f38313I;

    /* renamed from: J */
    @Nullable
    public final List<DivVisibilityAction> f38314J;

    /* renamed from: K */
    @NotNull
    public final DivSize f38315K;

    /* renamed from: a */
    @NotNull
    public final DivAccessibility f38316a;

    /* renamed from: b */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f38317b;

    /* renamed from: c */
    @Nullable
    public final Expression<DivAlignmentVertical> f38318c;

    /* renamed from: d */
    @NotNull
    public final Expression<Double> f38319d;

    /* renamed from: e */
    @Nullable
    public final List<DivBackground> f38320e;

    /* renamed from: f */
    @NotNull
    public final DivBorder f38321f;

    /* renamed from: g */
    @Nullable
    public final Expression<Long> f38322g;

    /* renamed from: h */
    @Nullable
    public final List<DivDisappearAction> f38323h;

    /* renamed from: i */
    @Nullable
    public final List<DivExtension> f38324i;

    /* renamed from: j */
    @Nullable
    public final DivFocus f38325j;

    /* renamed from: k */
    @JvmField
    @NotNull
    public final Expression<DivFontFamily> f38326k;

    /* renamed from: l */
    @JvmField
    @NotNull
    public final Expression<Long> f38327l;

    /* renamed from: m */
    @JvmField
    @NotNull
    public final Expression<DivSizeUnit> f38328m;

    /* renamed from: n */
    @JvmField
    @NotNull
    public final Expression<DivFontWeight> f38329n;

    /* renamed from: o */
    @NotNull
    public final DivSize f38330o;

    /* renamed from: p */
    @JvmField
    @NotNull
    public final Expression<Integer> f38331p;

    /* renamed from: q */
    @JvmField
    @Nullable
    public final Expression<String> f38332q;

    /* renamed from: r */
    @Nullable
    public final String f38333r;

    /* renamed from: s */
    @JvmField
    @NotNull
    public final Expression<Double> f38334s;

    /* renamed from: t */
    @JvmField
    @Nullable
    public final Expression<Long> f38335t;

    /* renamed from: u */
    @NotNull
    public final DivEdgeInsets f38336u;

    /* renamed from: v */
    @JvmField
    @NotNull
    public final List<Option> f38337v;

    /* renamed from: w */
    @NotNull
    public final DivEdgeInsets f38338w;

    /* renamed from: x */
    @Nullable
    public final Expression<Long> f38339x;

    /* renamed from: y */
    @Nullable
    public final List<DivAction> f38340y;

    /* renamed from: z */
    @JvmField
    @NotNull
    public final Expression<Integer> f38341z;

    /* compiled from: DivSelect.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u000bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u000bR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\bR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\bR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u000bR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020)0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u000bR\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020)0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u000bR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020)0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u000bR\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\bR\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u000bR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u000bR\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0010R\u0014\u00106\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00103R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\u000bR\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\u000bR\u001a\u0010:\u001a\b\u0012\u0004\u0012\u0002090\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0010R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020'0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\bR\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010\u0010R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0010R\u0014\u0010C\u001a\u00020)8\u0006X\u0086T¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020F0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020I0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010HR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001b0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010HR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u001f0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010HR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\"0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010HR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020N0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010HR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020)0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010\u000bR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020)0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010\u000bR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020R0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010\u0010R\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020N0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010\bR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006X"}, m31884d2 = {"Lcom/yandex/div2/DivSelect$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/DivFontFamily;", "FONT_FAMILY_DEFAULT_VALUE", "FONT_SIZE_DEFAULT_VALUE", "FONT_SIZE_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivSizeUnit;", "FONT_SIZE_UNIT_DEFAULT_VALUE", "FONT_SIZE_VALIDATOR", "Lcom/yandex/div2/DivFontWeight;", "FONT_WEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "", "HINT_COLOR_DEFAULT_VALUE", "", "HINT_TEXT_TEMPLATE_VALIDATOR", "HINT_TEXT_VALIDATOR", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "LETTER_SPACING_DEFAULT_VALUE", "LINE_HEIGHT_TEMPLATE_VALIDATOR", "LINE_HEIGHT_VALIDATOR", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "Lcom/yandex/div2/DivSelect$Option;", "OPTIONS_VALIDATOR", "PADDINGS_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "Lcom/yandex/div2/DivAction;", "SELECTED_ACTIONS_VALIDATOR", "TEXT_COLOR_DEFAULT_VALUE", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "TYPE_HELPER_FONT_FAMILY", "TYPE_HELPER_FONT_SIZE_UNIT", "TYPE_HELPER_FONT_WEIGHT", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "VALUE_VARIABLE_TEMPLATE_VALIDATOR", "VALUE_VARIABLE_VALIDATOR", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivSelect m17689a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            DivAccessibility.Companion companion = DivAccessibility.f34479f;
            DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject, "accessibility", DivAccessibility.f34486m, f34328a, parsingEnvironment);
            if (divAccessibility == null) {
                divAccessibility = DivSelect.f38267M;
            }
            DivAccessibility divAccessibility2 = divAccessibility;
            Intrinsics.m32178g(divAccessibility2, "JsonParser.readOptional(…CESSIBILITY_DEFAULT_VALUE");
            DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
            Expression m17329u = JsonParser.m17329u(jSONObject, "alignment_horizontal", DivAlignmentHorizontal.f34618d, f34328a, parsingEnvironment, DivSelect.f38283c0);
            DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
            Expression m17329u2 = JsonParser.m17329u(jSONObject, "alignment_vertical", DivAlignmentVertical.f34626d, f34328a, parsingEnvironment, DivSelect.f38284d0);
            Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
            ValueValidator<Double> valueValidator = DivSelect.f38289i0;
            Expression<Double> expression = DivSelect.f38268N;
            TypeHelper<Double> typeHelper = TypeHelpersKt.f33851d;
            Expression<Double> m17328t = JsonParser.m17328t(jSONObject, "alpha", function1, valueValidator, f34328a, expression, typeHelper);
            if (m17328t != null) {
                expression = m17328t;
            }
            DivBackground.Companion companion2 = DivBackground.f34750a;
            List m17333y = JsonParser.m17333y(jSONObject, "background", DivBackground.f34751b, DivSelect.f38290j0, f34328a, parsingEnvironment);
            DivBorder.Companion companion3 = DivBorder.f34785f;
            DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject, "border", DivBorder.f34788i, f34328a, parsingEnvironment);
            if (divBorder == null) {
                divBorder = DivSelect.f38269O;
            }
            DivBorder divBorder2 = divBorder;
            Intrinsics.m32178g(divBorder2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            Function1<Number, Long> function12 = ParsingConvertersKt.f33831e;
            ValueValidator<Long> valueValidator2 = DivSelect.f38291k0;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.f33849b;
            Expression m17327s = JsonParser.m17327s(jSONObject, "column_span", function12, valueValidator2, f34328a, parsingEnvironment, typeHelper2);
            DivDisappearAction.Companion companion4 = DivDisappearAction.f35537a;
            List m17333y2 = JsonParser.m17333y(jSONObject, "disappear_actions", DivDisappearAction.f35545i, DivSelect.f38292l0, f34328a, parsingEnvironment);
            DivExtension.Companion companion5 = DivExtension.f35659c;
            List m17333y3 = JsonParser.m17333y(jSONObject, "extensions", DivExtension.f35660d, DivSelect.f38293m0, f34328a, parsingEnvironment);
            DivFocus.Companion companion6 = DivFocus.f35813f;
            DivFocus divFocus = (DivFocus) JsonParser.m17322n(jSONObject, "focus", DivFocus.f35818k, f34328a, parsingEnvironment);
            DivFontFamily.Converter converter3 = DivFontFamily.f35876c;
            Function1<String, DivFontFamily> function13 = DivFontFamily.f35877d;
            Expression<DivFontFamily> expression2 = DivSelect.f38270P;
            Expression<DivFontFamily> m17330v = JsonParser.m17330v(jSONObject, "font_family", function13, f34328a, parsingEnvironment, expression2, DivSelect.f38285e0);
            if (m17330v != null) {
                expression2 = m17330v;
            }
            ValueValidator<Long> valueValidator3 = DivSelect.f38294n0;
            Expression<Long> expression3 = DivSelect.f38271Q;
            Expression<Long> m17328t2 = JsonParser.m17328t(jSONObject, "font_size", function12, valueValidator3, f34328a, expression3, typeHelper2);
            if (m17328t2 != null) {
                expression3 = m17328t2;
            }
            DivSizeUnit.Converter converter4 = DivSizeUnit.f38845c;
            Function1<String, DivSizeUnit> function14 = DivSizeUnit.f38846d;
            Expression<DivSizeUnit> expression4 = DivSelect.f38272R;
            Expression<DivSizeUnit> m17330v2 = JsonParser.m17330v(jSONObject, "font_size_unit", function14, f34328a, parsingEnvironment, expression4, DivSelect.f38286f0);
            if (m17330v2 != null) {
                expression4 = m17330v2;
            }
            DivFontWeight.Converter converter5 = DivFontWeight.f35883c;
            Function1<String, DivFontWeight> function15 = DivFontWeight.f35884d;
            Expression<DivFontWeight> expression5 = DivSelect.f38273S;
            Expression<DivFontWeight> m17330v3 = JsonParser.m17330v(jSONObject, "font_weight", function15, f34328a, parsingEnvironment, expression5, DivSelect.f38287g0);
            if (m17330v3 != null) {
                expression5 = m17330v3;
            }
            DivSize.Companion companion7 = DivSize.f38833a;
            Function2<ParsingEnvironment, JSONObject, DivSize> function2 = DivSize.f38834b;
            DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject, "height", function2, f34328a, parsingEnvironment);
            if (divSize == null) {
                divSize = DivSelect.f38274T;
            }
            DivSize divSize2 = divSize;
            Intrinsics.m32178g(divSize2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            Function1<Object, Integer> function16 = ParsingConvertersKt.f33827a;
            Expression<Integer> expression6 = DivSelect.f38275U;
            TypeHelper<Integer> typeHelper3 = TypeHelpersKt.f33853f;
            Expression<Double> expression7 = expression;
            Expression<Integer> m17330v4 = JsonParser.m17330v(jSONObject, "hint_color", function16, f34328a, parsingEnvironment, expression6, typeHelper3);
            if (m17330v4 != null) {
                expression6 = m17330v4;
            }
            Expression m17325q = JsonParser.m17325q(jSONObject, "hint_text", DivSelect.f38295o0, f34328a, parsingEnvironment, TypeHelpersKt.f33850c);
            String str = (String) JsonParser.m17323o(jSONObject, "id", DivSelect.f38296p0, f34328a, parsingEnvironment);
            Expression<Double> expression8 = DivSelect.f38276V;
            Expression<Double> m17330v5 = JsonParser.m17330v(jSONObject, "letter_spacing", function1, f34328a, parsingEnvironment, expression8, typeHelper);
            if (m17330v5 != null) {
                expression8 = m17330v5;
            }
            Expression m17327s2 = JsonParser.m17327s(jSONObject, "line_height", function12, DivSelect.f38297q0, f34328a, parsingEnvironment, typeHelper2);
            DivEdgeInsets.Companion companion8 = DivEdgeInsets.f35607f;
            Function2<ParsingEnvironment, JSONObject, DivEdgeInsets> function22 = DivEdgeInsets.f35618q;
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "margins", function22, f34328a, parsingEnvironment);
            if (divEdgeInsets == null) {
                divEdgeInsets = DivSelect.f38277W;
            }
            DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
            Intrinsics.m32178g(divEdgeInsets2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            Option.Companion companion9 = Option.f38349c;
            List m17321m = JsonParser.m17321m(jSONObject, "options", Option.f38350d, DivSelect.f38298r0, f34328a, parsingEnvironment);
            Intrinsics.m32178g(m17321m, "readList(json, \"options\"…S_VALIDATOR, logger, env)");
            DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "paddings", function22, f34328a, parsingEnvironment);
            if (divEdgeInsets3 == null) {
                divEdgeInsets3 = DivSelect.f38278X;
            }
            DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
            Intrinsics.m32178g(divEdgeInsets4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            Expression m17327s3 = JsonParser.m17327s(jSONObject, "row_span", function12, DivSelect.f38299s0, f34328a, parsingEnvironment, typeHelper2);
            DivAction.Companion companion10 = DivAction.f34546g;
            List m17333y4 = JsonParser.m17333y(jSONObject, "selected_actions", DivAction.f34550k, DivSelect.f38300t0, f34328a, parsingEnvironment);
            Expression<Integer> expression9 = DivSelect.f38279Y;
            Expression<Integer> m17330v6 = JsonParser.m17330v(jSONObject, "text_color", function16, f34328a, parsingEnvironment, expression9, typeHelper3);
            Expression<Integer> expression10 = m17330v6 == null ? expression9 : m17330v6;
            DivTooltip.Companion companion11 = DivTooltip.f40492h;
            List m17333y5 = JsonParser.m17333y(jSONObject, "tooltips", DivTooltip.f40497m, DivSelect.f38301u0, f34328a, parsingEnvironment);
            DivTransform.Companion companion12 = DivTransform.f40551d;
            DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject, "transform", DivTransform.f40554g, f34328a, parsingEnvironment);
            if (divTransform == null) {
                divTransform = DivSelect.f38280Z;
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
            List m17332x = JsonParser.m17332x(jSONObject, "transition_triggers", DivTransitionTrigger.f40583d, DivSelect.f38302v0, f34328a, parsingEnvironment);
            String str2 = (String) JsonParser.m17311c(jSONObject, "value_variable", DivSelect.f38303w0, f34328a, parsingEnvironment);
            DivVisibility.Converter converter7 = DivVisibility.f40930c;
            Function1<String, DivVisibility> function17 = DivVisibility.f40931d;
            Expression<DivVisibility> expression11 = DivSelect.f38281a0;
            Expression<DivVisibility> m17330v7 = JsonParser.m17330v(jSONObject, "visibility", function17, f34328a, parsingEnvironment, expression11, DivSelect.f38288h0);
            Expression<DivVisibility> expression12 = m17330v7 == null ? expression11 : m17330v7;
            DivVisibilityAction.Companion companion15 = DivVisibilityAction.f40938i;
            Function2<ParsingEnvironment, JSONObject, DivVisibilityAction> function24 = DivVisibilityAction.f40946q;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonParser.m17322n(jSONObject, "visibility_action", function24, f34328a, parsingEnvironment);
            List m17333y6 = JsonParser.m17333y(jSONObject, "visibility_actions", function24, DivSelect.f38304x0, f34328a, parsingEnvironment);
            DivSize divSize3 = (DivSize) JsonParser.m17322n(jSONObject, "width", function2, f34328a, parsingEnvironment);
            if (divSize3 == null) {
                divSize3 = DivSelect.f38282b0;
            }
            Intrinsics.m32178g(divSize3, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new DivSelect(divAccessibility2, m17329u, m17329u2, expression7, m17333y, divBorder2, m17327s, m17333y2, m17333y3, divFocus, expression2, expression3, expression4, expression5, divSize2, expression6, m17325q, str, expression8, m17327s2, divEdgeInsets2, m17321m, divEdgeInsets4, m17327s3, m17333y4, expression10, m17333y5, divTransform2, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17332x, str2, expression12, divVisibilityAction, m17333y6, divSize3);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivSelect.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivSelect$Option;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Option implements JSONSerializable {

        /* renamed from: c */
        @NotNull
        public static final Companion f38349c = new Companion(null);

        /* renamed from: d */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, Option> f38350d = new Function2<ParsingEnvironment, JSONObject, Option>() { // from class: com.yandex.div2.DivSelect$Option$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivSelect.Option invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                DivSelect.Option.Companion companion = DivSelect.Option.f38349c;
                ParsingErrorLogger f34328a = env.getF34328a();
                TypeHelper<String> typeHelper = TypeHelpersKt.f33850c;
                return new DivSelect.Option(JsonParser.m17326r(it, "text", f34328a, env, typeHelper), JsonParser.m17315g(it, "value", f34328a, env, typeHelper));
            }
        };

        /* renamed from: a */
        @JvmField
        @Nullable
        public final Expression<String> f38351a;

        /* renamed from: b */
        @JvmField
        @NotNull
        public final Expression<String> f38352b;

        /* compiled from: DivSelect.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivSelect$Option$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        @DivModelInternalApi
        public Option(@Nullable Expression<String> expression, @NotNull Expression<String> value) {
            Intrinsics.m32179h(value, "value");
            this.f38351a = expression;
            this.f38352b = value;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression expression = null;
        Expression expression2 = null;
        f38267M = new DivAccessibility(null, expression, null, expression2, null, null, 63);
        Expression.Companion companion = Expression.f34334a;
        f38268N = companion.m17539a(Double.valueOf(1.0d));
        f38269O = new DivBorder(expression, null == true ? 1 : 0, expression2, null == true ? 1 : 0, null == true ? 1 : 0, 31);
        f38270P = companion.m17539a(DivFontFamily.TEXT);
        f38271Q = companion.m17539a(12L);
        f38272R = companion.m17539a(DivSizeUnit.SP);
        f38273S = companion.m17539a(DivFontWeight.REGULAR);
        int i2 = 7;
        f38274T = new DivSize.WrapContent(new DivWrapContentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, i2));
        f38275U = companion.m17539a(1929379840);
        f38276V = companion.m17539a(Double.valueOf(0.0d));
        f38277W = new DivEdgeInsets(expression2, null == true ? 1 : 0, null == true ? 1 : 0, null, null, 31);
        f38278X = new DivEdgeInsets(null, null, null, null, null, 31);
        f38279Y = companion.m17539a(-16777216);
        f38280Z = new DivTransform(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, i2);
        f38281a0 = companion.m17539a(DivVisibility.VISIBLE);
        f38282b0 = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i3 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f38283c0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSelect$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f38284d0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSelect$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f38285e0 = companion2.m17372a(ArraysKt.m31926B(DivFontFamily.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSelect$Companion$TYPE_HELPER_FONT_FAMILY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivFontFamily);
            }
        });
        f38286f0 = companion2.m17372a(ArraysKt.m31926B(DivSizeUnit.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSelect$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivSizeUnit);
            }
        });
        f38287g0 = companion2.m17372a(ArraysKt.m31926B(DivFontWeight.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSelect$Companion$TYPE_HELPER_FONT_WEIGHT$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivFontWeight);
            }
        });
        f38288h0 = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivSelect$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f38289i0 = C3034a0.f41101v;
        f38290j0 = C3077z.f42211m;
        f38291k0 = C3036b0.f41128c;
        f38292l0 = C3077z.f42212n;
        f38293m0 = C3077z.f42213o;
        f38294n0 = C3036b0.f41129d;
        f38295o0 = C3034a0.f41097r;
        f38296p0 = C3034a0.f41098s;
        f38297q0 = C3034a0.f41099t;
        f38298r0 = C3077z.f42206h;
        f38299s0 = C3034a0.f41100u;
        f38300t0 = C3077z.f42207i;
        f38301u0 = C3077z.f42208j;
        f38302v0 = C3077z.f42209k;
        f38303w0 = C3034a0.f41102w;
        f38304x0 = C3077z.f42210l;
        DivSelect$Companion$CREATOR$1 divSelect$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivSelect>() { // from class: com.yandex.div2.DivSelect$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivSelect invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivSelect.f38266L.m17689a(env, it);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @DivModelInternalApi
    public DivSelect(@NotNull DivAccessibility accessibility, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> alpha, @Nullable List<? extends DivBackground> list, @NotNull DivBorder border, @Nullable Expression<Long> expression3, @Nullable List<? extends DivDisappearAction> list2, @Nullable List<? extends DivExtension> list3, @Nullable DivFocus divFocus, @NotNull Expression<DivFontFamily> fontFamily, @NotNull Expression<Long> fontSize, @NotNull Expression<DivSizeUnit> fontSizeUnit, @NotNull Expression<DivFontWeight> fontWeight, @NotNull DivSize height, @NotNull Expression<Integer> hintColor, @Nullable Expression<String> expression4, @Nullable String str, @NotNull Expression<Double> letterSpacing, @Nullable Expression<Long> expression5, @NotNull DivEdgeInsets margins, @NotNull List<? extends Option> options, @NotNull DivEdgeInsets paddings, @Nullable Expression<Long> expression6, @Nullable List<? extends DivAction> list4, @NotNull Expression<Integer> textColor, @Nullable List<? extends DivTooltip> list5, @NotNull DivTransform transform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list6, @NotNull String valueVariable, @NotNull Expression<DivVisibility> visibility, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<? extends DivVisibilityAction> list7, @NotNull DivSize width) {
        Intrinsics.m32179h(accessibility, "accessibility");
        Intrinsics.m32179h(alpha, "alpha");
        Intrinsics.m32179h(border, "border");
        Intrinsics.m32179h(fontFamily, "fontFamily");
        Intrinsics.m32179h(fontSize, "fontSize");
        Intrinsics.m32179h(fontSizeUnit, "fontSizeUnit");
        Intrinsics.m32179h(fontWeight, "fontWeight");
        Intrinsics.m32179h(height, "height");
        Intrinsics.m32179h(hintColor, "hintColor");
        Intrinsics.m32179h(letterSpacing, "letterSpacing");
        Intrinsics.m32179h(margins, "margins");
        Intrinsics.m32179h(options, "options");
        Intrinsics.m32179h(paddings, "paddings");
        Intrinsics.m32179h(textColor, "textColor");
        Intrinsics.m32179h(transform, "transform");
        Intrinsics.m32179h(valueVariable, "valueVariable");
        Intrinsics.m32179h(visibility, "visibility");
        Intrinsics.m32179h(width, "width");
        this.f38316a = accessibility;
        this.f38317b = expression;
        this.f38318c = expression2;
        this.f38319d = alpha;
        this.f38320e = list;
        this.f38321f = border;
        this.f38322g = expression3;
        this.f38323h = list2;
        this.f38324i = list3;
        this.f38325j = divFocus;
        this.f38326k = fontFamily;
        this.f38327l = fontSize;
        this.f38328m = fontSizeUnit;
        this.f38329n = fontWeight;
        this.f38330o = height;
        this.f38331p = hintColor;
        this.f38332q = expression4;
        this.f38333r = str;
        this.f38334s = letterSpacing;
        this.f38335t = expression5;
        this.f38336u = margins;
        this.f38337v = options;
        this.f38338w = paddings;
        this.f38339x = expression6;
        this.f38340y = list4;
        this.f38341z = textColor;
        this.f38305A = list5;
        this.f38306B = transform;
        this.f38307C = divChangeTransition;
        this.f38308D = divAppearanceTransition;
        this.f38309E = divAppearanceTransition2;
        this.f38310F = list6;
        this.f38311G = valueVariable;
        this.f38312H = visibility;
        this.f38313I = divVisibilityAction;
        this.f38314J = list7;
        this.f38315K = width;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: a, reason: from getter */
    public DivSize getF40705p() {
        return this.f38330o;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: b, reason: from getter */
    public DivTransform getF40680B() {
        return this.f38306B;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: c */
    public List<DivVisibilityAction> mo17569c() {
        return this.f38314J;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: d */
    public List<DivBackground> mo17570d() {
        return this.f38320e;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: e, reason: from getter */
    public DivAccessibility getF40690a() {
        return this.f38316a;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: f */
    public Expression<Long> mo17572f() {
        return this.f38322g;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: g, reason: from getter */
    public DivSize getF40689K() {
        return this.f38315K;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: getBorder, reason: from getter */
    public DivBorder getF40696g() {
        return this.f38321f;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: getId, reason: from getter */
    public String getF40706q() {
        return this.f38333r;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    public Expression<DivVisibility> getVisibility() {
        return this.f38312H;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: h, reason: from getter */
    public DivEdgeInsets getF40707r() {
        return this.f38336u;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: i */
    public Expression<Long> mo17575i() {
        return this.f38339x;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: j, reason: from getter */
    public DivEdgeInsets getF40709t() {
        return this.f38338w;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: k */
    public List<DivTransitionTrigger> mo17577k() {
        return this.f38310F;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: l */
    public List<DivAction> mo17578l() {
        return this.f38340y;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: m */
    public Expression<DivAlignmentHorizontal> mo17579m() {
        return this.f38317b;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: n */
    public List<DivExtension> mo17580n() {
        return this.f38324i;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: o */
    public List<DivTooltip> mo17581o() {
        return this.f38305A;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: p, reason: from getter */
    public DivVisibilityAction getF40687I() {
        return this.f38313I;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: q */
    public Expression<DivAlignmentVertical> mo17583q() {
        return this.f38318c;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: r, reason: from getter */
    public DivAppearanceTransition getF40682D() {
        return this.f38308D;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: s */
    public Expression<Double> mo17585s() {
        return this.f38319d;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: t, reason: from getter */
    public DivFocus getF40704o() {
        return this.f38325j;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: u, reason: from getter */
    public DivAppearanceTransition getF40683E() {
        return this.f38309E;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: v, reason: from getter */
    public DivChangeTransition getF40681C() {
        return this.f38307C;
    }
}
