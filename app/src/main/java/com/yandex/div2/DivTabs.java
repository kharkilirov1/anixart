package com.yandex.div2;

import androidx.recyclerview.widget.RecyclerView;
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
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivChangeTransition;
import com.yandex.div2.DivCornersRadius;
import com.yandex.div2.DivDisappearAction;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivExtension;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivFontFamily;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivTabs;
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

/* compiled from: DivTabs.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div2/DivTabs;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div2/DivBase;", "Companion", "Item", "TabTitleStyle", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivTabs implements JSONSerializable, DivBase {

    /* renamed from: K */
    @NotNull
    public static final Companion f39463K = new Companion(null);

    /* renamed from: L */
    @NotNull
    public static final DivAccessibility f39464L;

    /* renamed from: M */
    @NotNull
    public static final Expression<Double> f39465M;

    /* renamed from: N */
    @NotNull
    public static final DivBorder f39466N;

    /* renamed from: O */
    @NotNull
    public static final Expression<Boolean> f39467O;

    /* renamed from: P */
    @NotNull
    public static final Expression<Boolean> f39468P;

    /* renamed from: Q */
    @NotNull
    public static final DivSize.WrapContent f39469Q;

    /* renamed from: R */
    @NotNull
    public static final DivEdgeInsets f39470R;

    /* renamed from: S */
    @NotNull
    public static final DivEdgeInsets f39471S;

    /* renamed from: T */
    @NotNull
    public static final Expression<Boolean> f39472T;

    /* renamed from: U */
    @NotNull
    public static final Expression<Long> f39473U;

    /* renamed from: V */
    @NotNull
    public static final Expression<Integer> f39474V;

    /* renamed from: W */
    @NotNull
    public static final DivEdgeInsets f39475W;

    /* renamed from: X */
    @NotNull
    public static final Expression<Boolean> f39476X;

    /* renamed from: Y */
    @NotNull
    public static final TabTitleStyle f39477Y;

    /* renamed from: Z */
    @NotNull
    public static final DivEdgeInsets f39478Z;

    /* renamed from: a0 */
    @NotNull
    public static final DivTransform f39479a0;

    /* renamed from: b0 */
    @NotNull
    public static final Expression<DivVisibility> f39480b0;

    /* renamed from: c0 */
    @NotNull
    public static final DivSize.MatchParent f39481c0;

    /* renamed from: d0 */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f39482d0;

    /* renamed from: e0 */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f39483e0;

    /* renamed from: f0 */
    @NotNull
    public static final TypeHelper<DivVisibility> f39484f0;

    /* renamed from: g0 */
    @NotNull
    public static final ValueValidator<Double> f39485g0;

    /* renamed from: h0 */
    @NotNull
    public static final ListValidator<DivBackground> f39486h0;

    /* renamed from: i0 */
    @NotNull
    public static final ValueValidator<Long> f39487i0;

    /* renamed from: j0 */
    @NotNull
    public static final ListValidator<DivDisappearAction> f39488j0;

    /* renamed from: k0 */
    @NotNull
    public static final ListValidator<DivExtension> f39489k0;

    /* renamed from: l0 */
    @NotNull
    public static final ValueValidator<String> f39490l0;

    /* renamed from: m0 */
    @NotNull
    public static final ListValidator<Item> f39491m0;

    /* renamed from: n0 */
    @NotNull
    public static final ValueValidator<Long> f39492n0;

    /* renamed from: o0 */
    @NotNull
    public static final ListValidator<DivAction> f39493o0;

    /* renamed from: p0 */
    @NotNull
    public static final ValueValidator<Long> f39494p0;

    /* renamed from: q0 */
    @NotNull
    public static final ListValidator<DivTooltip> f39495q0;

    /* renamed from: r0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f39496r0;

    /* renamed from: s0 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f39497s0;

    /* renamed from: A */
    @Nullable
    public final List<DivTooltip> f39498A;

    /* renamed from: B */
    @NotNull
    public final DivTransform f39499B;

    /* renamed from: C */
    @Nullable
    public final DivChangeTransition f39500C;

    /* renamed from: D */
    @Nullable
    public final DivAppearanceTransition f39501D;

    /* renamed from: E */
    @Nullable
    public final DivAppearanceTransition f39502E;

    /* renamed from: F */
    @Nullable
    public final List<DivTransitionTrigger> f39503F;

    /* renamed from: G */
    @NotNull
    public final Expression<DivVisibility> f39504G;

    /* renamed from: H */
    @Nullable
    public final DivVisibilityAction f39505H;

    /* renamed from: I */
    @Nullable
    public final List<DivVisibilityAction> f39506I;

    /* renamed from: J */
    @NotNull
    public final DivSize f39507J;

    /* renamed from: a */
    @NotNull
    public final DivAccessibility f39508a;

    /* renamed from: b */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f39509b;

    /* renamed from: c */
    @Nullable
    public final Expression<DivAlignmentVertical> f39510c;

    /* renamed from: d */
    @NotNull
    public final Expression<Double> f39511d;

    /* renamed from: e */
    @Nullable
    public final List<DivBackground> f39512e;

    /* renamed from: f */
    @NotNull
    public final DivBorder f39513f;

    /* renamed from: g */
    @Nullable
    public final Expression<Long> f39514g;

    /* renamed from: h */
    @Nullable
    public final List<DivDisappearAction> f39515h;

    /* renamed from: i */
    @JvmField
    @NotNull
    public final Expression<Boolean> f39516i;

    /* renamed from: j */
    @Nullable
    public final List<DivExtension> f39517j;

    /* renamed from: k */
    @Nullable
    public final DivFocus f39518k;

    /* renamed from: l */
    @JvmField
    @NotNull
    public final Expression<Boolean> f39519l;

    /* renamed from: m */
    @NotNull
    public final DivSize f39520m;

    /* renamed from: n */
    @Nullable
    public final String f39521n;

    /* renamed from: o */
    @JvmField
    @NotNull
    public final List<Item> f39522o;

    /* renamed from: p */
    @NotNull
    public final DivEdgeInsets f39523p;

    /* renamed from: q */
    @NotNull
    public final DivEdgeInsets f39524q;

    /* renamed from: r */
    @JvmField
    @NotNull
    public final Expression<Boolean> f39525r;

    /* renamed from: s */
    @Nullable
    public final Expression<Long> f39526s;

    /* renamed from: t */
    @Nullable
    public final List<DivAction> f39527t;

    /* renamed from: u */
    @JvmField
    @NotNull
    public final Expression<Long> f39528u;

    /* renamed from: v */
    @JvmField
    @NotNull
    public final Expression<Integer> f39529v;

    /* renamed from: w */
    @JvmField
    @NotNull
    public final DivEdgeInsets f39530w;

    /* renamed from: x */
    @JvmField
    @NotNull
    public final Expression<Boolean> f39531x;

    /* renamed from: y */
    @JvmField
    @NotNull
    public final TabTitleStyle f39532y;

    /* renamed from: z */
    @JvmField
    @NotNull
    public final DivEdgeInsets f39533z;

    /* compiled from: DivTabs.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\bR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u000bR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u000bR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0010R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00190\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\bR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u000bR\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u000bR\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0010R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\bR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u000bR\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u000bR\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\bR\u0014\u00104\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010(R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00190\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\bR\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010(R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0010R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\u0010R\u0014\u0010A\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020D0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020G0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010FR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020I0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010FR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010\u0010R\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020I0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010\bR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006Q"}, m31884d2 = {"Lcom/yandex/div2/DivTabs$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "", "DYNAMIC_HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "HAS_SEPARATOR_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div2/DivTabs$Item;", "ITEMS_VALIDATOR", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "PADDINGS_DEFAULT_VALUE", "RESTRICT_PARENT_SCROLL_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "Lcom/yandex/div2/DivAction;", "SELECTED_ACTIONS_VALIDATOR", "SELECTED_TAB_DEFAULT_VALUE", "SELECTED_TAB_TEMPLATE_VALIDATOR", "SELECTED_TAB_VALIDATOR", "", "SEPARATOR_COLOR_DEFAULT_VALUE", "SEPARATOR_PADDINGS_DEFAULT_VALUE", "SWITCH_TABS_BY_CONTENT_SWIPE_ENABLED_DEFAULT_VALUE", "Lcom/yandex/div2/DivTabs$TabTitleStyle;", "TAB_TITLE_STYLE_DEFAULT_VALUE", "Lcom/yandex/div2/DivTabs$TabTitleStyle;", "TITLE_PADDINGS_DEFAULT_VALUE", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivTabs m17711a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            DivAccessibility.Companion companion = DivAccessibility.f34479f;
            DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject, "accessibility", DivAccessibility.f34486m, f34328a, parsingEnvironment);
            if (divAccessibility == null) {
                divAccessibility = DivTabs.f39464L;
            }
            DivAccessibility divAccessibility2 = divAccessibility;
            Intrinsics.m32178g(divAccessibility2, "JsonParser.readOptional(…CESSIBILITY_DEFAULT_VALUE");
            DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
            Expression m17329u = JsonParser.m17329u(jSONObject, "alignment_horizontal", DivAlignmentHorizontal.f34618d, f34328a, parsingEnvironment, DivTabs.f39482d0);
            DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
            Expression m17329u2 = JsonParser.m17329u(jSONObject, "alignment_vertical", DivAlignmentVertical.f34626d, f34328a, parsingEnvironment, DivTabs.f39483e0);
            Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
            ValueValidator<Double> valueValidator = DivTabs.f39485g0;
            Expression<Double> expression = DivTabs.f39465M;
            Expression<Double> m17328t = JsonParser.m17328t(jSONObject, "alpha", function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
            Expression<Double> expression2 = m17328t == null ? expression : m17328t;
            DivBackground.Companion companion2 = DivBackground.f34750a;
            List m17333y = JsonParser.m17333y(jSONObject, "background", DivBackground.f34751b, DivTabs.f39486h0, f34328a, parsingEnvironment);
            DivBorder.Companion companion3 = DivBorder.f34785f;
            DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject, "border", DivBorder.f34788i, f34328a, parsingEnvironment);
            if (divBorder == null) {
                divBorder = DivTabs.f39466N;
            }
            DivBorder divBorder2 = divBorder;
            Intrinsics.m32178g(divBorder2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            Function1<Number, Long> function12 = ParsingConvertersKt.f33831e;
            ValueValidator<Long> valueValidator2 = DivTabs.f39487i0;
            TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
            Expression m17327s = JsonParser.m17327s(jSONObject, "column_span", function12, valueValidator2, f34328a, parsingEnvironment, typeHelper);
            DivDisappearAction.Companion companion4 = DivDisappearAction.f35537a;
            List m17333y2 = JsonParser.m17333y(jSONObject, "disappear_actions", DivDisappearAction.f35545i, DivTabs.f39488j0, f34328a, parsingEnvironment);
            Function1<Object, Boolean> function13 = ParsingConvertersKt.f33829c;
            Expression<Boolean> expression3 = DivTabs.f39467O;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.f33848a;
            Expression<Boolean> m17330v = JsonParser.m17330v(jSONObject, "dynamic_height", function13, f34328a, parsingEnvironment, expression3, typeHelper2);
            if (m17330v != null) {
                expression3 = m17330v;
            }
            DivExtension.Companion companion5 = DivExtension.f35659c;
            List m17333y3 = JsonParser.m17333y(jSONObject, "extensions", DivExtension.f35660d, DivTabs.f39489k0, f34328a, parsingEnvironment);
            DivFocus.Companion companion6 = DivFocus.f35813f;
            DivFocus divFocus = (DivFocus) JsonParser.m17322n(jSONObject, "focus", DivFocus.f35818k, f34328a, parsingEnvironment);
            Expression<Boolean> expression4 = DivTabs.f39468P;
            Expression<Boolean> m17330v2 = JsonParser.m17330v(jSONObject, "has_separator", function13, f34328a, parsingEnvironment, expression4, typeHelper2);
            if (m17330v2 != null) {
                expression4 = m17330v2;
            }
            DivSize.Companion companion7 = DivSize.f38833a;
            Function2<ParsingEnvironment, JSONObject, DivSize> function2 = DivSize.f38834b;
            DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject, "height", function2, f34328a, parsingEnvironment);
            if (divSize == null) {
                divSize = DivTabs.f39469Q;
            }
            DivSize divSize2 = divSize;
            Intrinsics.m32178g(divSize2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            String str = (String) JsonParser.m17323o(jSONObject, "id", DivTabs.f39490l0, f34328a, parsingEnvironment);
            Item.Companion companion8 = Item.f39538d;
            List m17321m = JsonParser.m17321m(jSONObject, "items", Item.f39539e, DivTabs.f39491m0, f34328a, parsingEnvironment);
            Intrinsics.m32178g(m17321m, "readList(json, \"items\", …S_VALIDATOR, logger, env)");
            DivEdgeInsets.Companion companion9 = DivEdgeInsets.f35607f;
            Function2<ParsingEnvironment, JSONObject, DivEdgeInsets> function22 = DivEdgeInsets.f35618q;
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "margins", function22, f34328a, parsingEnvironment);
            if (divEdgeInsets == null) {
                divEdgeInsets = DivTabs.f39470R;
            }
            DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
            Intrinsics.m32178g(divEdgeInsets2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "paddings", function22, f34328a, parsingEnvironment);
            if (divEdgeInsets3 == null) {
                divEdgeInsets3 = DivTabs.f39471S;
            }
            DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
            Intrinsics.m32178g(divEdgeInsets4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            Expression<Boolean> expression5 = DivTabs.f39472T;
            Expression<Boolean> m17330v3 = JsonParser.m17330v(jSONObject, "restrict_parent_scroll", function13, f34328a, parsingEnvironment, expression5, typeHelper2);
            if (m17330v3 != null) {
                expression5 = m17330v3;
            }
            Expression m17327s2 = JsonParser.m17327s(jSONObject, "row_span", function12, DivTabs.f39492n0, f34328a, parsingEnvironment, typeHelper);
            DivAction.Companion companion10 = DivAction.f34546g;
            List m17333y4 = JsonParser.m17333y(jSONObject, "selected_actions", DivAction.f34550k, DivTabs.f39493o0, f34328a, parsingEnvironment);
            ValueValidator<Long> valueValidator3 = DivTabs.f39494p0;
            Expression<Long> expression6 = DivTabs.f39473U;
            Expression<Long> m17328t2 = JsonParser.m17328t(jSONObject, "selected_tab", function12, valueValidator3, f34328a, expression6, typeHelper);
            if (m17328t2 != null) {
                expression6 = m17328t2;
            }
            Function1<Object, Integer> function14 = ParsingConvertersKt.f33827a;
            Expression<Integer> expression7 = DivTabs.f39474V;
            Expression<Integer> m17330v4 = JsonParser.m17330v(jSONObject, "separator_color", function14, f34328a, parsingEnvironment, expression7, TypeHelpersKt.f33853f);
            Expression<Integer> expression8 = m17330v4 == null ? expression7 : m17330v4;
            DivEdgeInsets divEdgeInsets5 = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "separator_paddings", function22, f34328a, parsingEnvironment);
            if (divEdgeInsets5 == null) {
                divEdgeInsets5 = DivTabs.f39475W;
            }
            DivEdgeInsets divEdgeInsets6 = divEdgeInsets5;
            Intrinsics.m32178g(divEdgeInsets6, "JsonParser.readOptional(…OR_PADDINGS_DEFAULT_VALUE");
            Expression<Boolean> expression9 = DivTabs.f39476X;
            Expression<Boolean> m17330v5 = JsonParser.m17330v(jSONObject, "switch_tabs_by_content_swipe_enabled", function13, f34328a, parsingEnvironment, expression9, typeHelper2);
            Expression<Boolean> expression10 = m17330v5 == null ? expression9 : m17330v5;
            TabTitleStyle.Companion companion11 = TabTitleStyle.f39560r;
            TabTitleStyle tabTitleStyle = (TabTitleStyle) JsonParser.m17322n(jSONObject, "tab_title_style", TabTitleStyle.f39559P, f34328a, parsingEnvironment);
            if (tabTitleStyle == null) {
                tabTitleStyle = DivTabs.f39477Y;
            }
            TabTitleStyle tabTitleStyle2 = tabTitleStyle;
            Intrinsics.m32178g(tabTitleStyle2, "JsonParser.readOptional(…TITLE_STYLE_DEFAULT_VALUE");
            DivEdgeInsets divEdgeInsets7 = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "title_paddings", function22, f34328a, parsingEnvironment);
            if (divEdgeInsets7 == null) {
                divEdgeInsets7 = DivTabs.f39478Z;
            }
            DivEdgeInsets divEdgeInsets8 = divEdgeInsets7;
            Intrinsics.m32178g(divEdgeInsets8, "JsonParser.readOptional(…LE_PADDINGS_DEFAULT_VALUE");
            DivTooltip.Companion companion12 = DivTooltip.f40492h;
            List m17333y5 = JsonParser.m17333y(jSONObject, "tooltips", DivTooltip.f40497m, DivTabs.f39495q0, f34328a, parsingEnvironment);
            DivTransform.Companion companion13 = DivTransform.f40551d;
            DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject, "transform", DivTransform.f40554g, f34328a, parsingEnvironment);
            if (divTransform == null) {
                divTransform = DivTabs.f39479a0;
            }
            DivTransform divTransform2 = divTransform;
            Intrinsics.m32178g(divTransform2, "JsonParser.readOptional(…: TRANSFORM_DEFAULT_VALUE");
            DivChangeTransition.Companion companion14 = DivChangeTransition.f34856a;
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonParser.m17322n(jSONObject, "transition_change", DivChangeTransition.f34857b, f34328a, parsingEnvironment);
            DivAppearanceTransition.Companion companion15 = DivAppearanceTransition.f34726a;
            Function2<ParsingEnvironment, JSONObject, DivAppearanceTransition> function23 = DivAppearanceTransition.f34727b;
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonParser.m17322n(jSONObject, "transition_in", function23, f34328a, parsingEnvironment);
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonParser.m17322n(jSONObject, "transition_out", function23, f34328a, parsingEnvironment);
            DivTransitionTrigger.Converter converter3 = DivTransitionTrigger.f40582c;
            List m17332x = JsonParser.m17332x(jSONObject, "transition_triggers", DivTransitionTrigger.f40583d, DivTabs.f39496r0, f34328a, parsingEnvironment);
            DivVisibility.Converter converter4 = DivVisibility.f40930c;
            Function1<String, DivVisibility> function15 = DivVisibility.f40931d;
            Expression<DivVisibility> expression11 = DivTabs.f39480b0;
            Expression<DivVisibility> m17330v6 = JsonParser.m17330v(jSONObject, "visibility", function15, f34328a, parsingEnvironment, expression11, DivTabs.f39484f0);
            Expression<DivVisibility> expression12 = m17330v6 == null ? expression11 : m17330v6;
            DivVisibilityAction.Companion companion16 = DivVisibilityAction.f40938i;
            Function2<ParsingEnvironment, JSONObject, DivVisibilityAction> function24 = DivVisibilityAction.f40946q;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonParser.m17322n(jSONObject, "visibility_action", function24, f34328a, parsingEnvironment);
            List m17333y6 = JsonParser.m17333y(jSONObject, "visibility_actions", function24, DivTabs.f39497s0, f34328a, parsingEnvironment);
            DivSize divSize3 = (DivSize) JsonParser.m17322n(jSONObject, "width", function2, f34328a, parsingEnvironment);
            if (divSize3 == null) {
                divSize3 = DivTabs.f39481c0;
            }
            Intrinsics.m32178g(divSize3, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new DivTabs(divAccessibility2, m17329u, m17329u2, expression2, m17333y, divBorder2, m17327s, m17333y2, expression3, m17333y3, divFocus, expression4, divSize2, str, m17321m, divEdgeInsets2, divEdgeInsets4, expression5, m17327s2, m17333y4, expression6, expression8, divEdgeInsets6, expression10, tabTitleStyle2, divEdgeInsets8, m17333y5, divTransform2, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17332x, expression12, divVisibilityAction, m17333y6, divSize3);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivTabs.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivTabs$Item;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Item implements JSONSerializable {

        /* renamed from: d */
        @NotNull
        public static final Companion f39538d = new Companion(null);

        /* renamed from: e */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, Item> f39539e = new Function2<ParsingEnvironment, JSONObject, Item>() { // from class: com.yandex.div2.DivTabs$Item$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivTabs.Item invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                DivTabs.Item.Companion companion = DivTabs.Item.f39538d;
                ParsingErrorLogger f34328a = env.getF34328a();
                Div.Companion companion2 = Div.f34418a;
                Div div = (Div) JsonParser.m17313e(it, "div", Div.f34419b, C2904b.f33858e, env);
                DivTabs.Item.Companion companion3 = DivTabs.Item.f39538d;
                Expression m17314f = JsonParser.m17314f(it, "title", C3048h0.f41473u, f34328a, env, TypeHelpersKt.f33850c);
                DivAction.Companion companion4 = DivAction.f34546g;
                return new DivTabs.Item(div, m17314f, (DivAction) JsonParser.m17322n(it, "title_click_action", DivAction.f34550k, f34328a, env));
            }
        };

        /* renamed from: a */
        @JvmField
        @NotNull
        public final Div f39540a;

        /* renamed from: b */
        @JvmField
        @NotNull
        public final Expression<String> f39541b;

        /* renamed from: c */
        @JvmField
        @Nullable
        public final DivAction f39542c;

        /* compiled from: DivTabs.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivTabs$Item$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "TITLE_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "TITLE_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        @DivModelInternalApi
        public Item(@NotNull Div div, @NotNull Expression<String> title, @Nullable DivAction divAction) {
            Intrinsics.m32179h(div, "div");
            Intrinsics.m32179h(title, "title");
            this.f39540a = div;
            this.f39541b = title;
            this.f39542c = divAction;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression expression = null;
        Expression expression2 = null;
        f39464L = new DivAccessibility(null, expression, null, expression2, null, null, 63);
        Expression.Companion companion = Expression.f34334a;
        f39465M = companion.m17539a(Double.valueOf(1.0d));
        f39466N = new DivBorder(expression, null == true ? 1 : 0, expression2, null == true ? 1 : 0, null == true ? 1 : 0, 31);
        Boolean bool = Boolean.FALSE;
        f39467O = companion.m17539a(bool);
        f39468P = companion.m17539a(bool);
        int i2 = 7;
        f39469Q = new DivSize.WrapContent(new DivWrapContentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, i2));
        Expression expression3 = null;
        f39470R = new DivEdgeInsets(null == true ? 1 : 0, null == true ? 1 : 0, null, null, expression3, 31);
        Expression expression4 = null;
        Expression expression5 = null;
        Expression expression6 = null;
        Expression expression7 = null;
        Expression expression8 = null;
        f39471S = new DivEdgeInsets(expression4, expression5, expression6, expression7, expression8, 31);
        f39472T = companion.m17539a(bool);
        f39473U = companion.m17539a(0L);
        f39474V = companion.m17539a(335544320);
        f39475W = new DivEdgeInsets(companion.m17539a(0L), companion.m17539a(12L), companion.m17539a(12L), companion.m17539a(0L), expression3, 16);
        f39476X = companion.m17539a(Boolean.TRUE);
        f39477Y = new TabTitleStyle(null, null, null, null, expression3, null, null, expression4, expression5, expression6, expression7, expression8, null, null, null, null, null, null, 262143);
        f39478Z = new DivEdgeInsets(companion.m17539a(8L), companion.m17539a(12L), companion.m17539a(12L), companion.m17539a(0L), null, 16);
        f39479a0 = new DivTransform(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, i2);
        f39480b0 = companion.m17539a(DivVisibility.VISIBLE);
        f39481c0 = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i3 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f39482d0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTabs$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f39483e0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTabs$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f39484f0 = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTabs$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f39485g0 = C3048h0.f41470r;
        f39486h0 = C3046g0.f41420x;
        f39487i0 = C3048h0.f41471s;
        f39488j0 = C3046g0.f41421y;
        f39489k0 = C3046g0.f41422z;
        f39490l0 = C3048h0.f41472t;
        f39491m0 = C3046g0.f41393A;
        f39492n0 = C3048h0.f41468p;
        f39493o0 = C3046g0.f41416t;
        f39494p0 = C3048h0.f41469q;
        f39495q0 = C3046g0.f41417u;
        f39496r0 = C3046g0.f41418v;
        f39497s0 = C3046g0.f41419w;
        DivTabs$Companion$CREATOR$1 divTabs$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivTabs>() { // from class: com.yandex.div2.DivTabs$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivTabs invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivTabs.f39463K.m17711a(env, it);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @DivModelInternalApi
    public DivTabs(@NotNull DivAccessibility accessibility, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> alpha, @Nullable List<? extends DivBackground> list, @NotNull DivBorder border, @Nullable Expression<Long> expression3, @Nullable List<? extends DivDisappearAction> list2, @NotNull Expression<Boolean> dynamicHeight, @Nullable List<? extends DivExtension> list3, @Nullable DivFocus divFocus, @NotNull Expression<Boolean> hasSeparator, @NotNull DivSize height, @Nullable String str, @NotNull List<? extends Item> items, @NotNull DivEdgeInsets margins, @NotNull DivEdgeInsets paddings, @NotNull Expression<Boolean> restrictParentScroll, @Nullable Expression<Long> expression4, @Nullable List<? extends DivAction> list4, @NotNull Expression<Long> selectedTab, @NotNull Expression<Integer> separatorColor, @NotNull DivEdgeInsets separatorPaddings, @NotNull Expression<Boolean> switchTabsByContentSwipeEnabled, @NotNull TabTitleStyle tabTitleStyle, @NotNull DivEdgeInsets titlePaddings, @Nullable List<? extends DivTooltip> list5, @NotNull DivTransform transform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list6, @NotNull Expression<DivVisibility> visibility, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<? extends DivVisibilityAction> list7, @NotNull DivSize width) {
        Intrinsics.m32179h(accessibility, "accessibility");
        Intrinsics.m32179h(alpha, "alpha");
        Intrinsics.m32179h(border, "border");
        Intrinsics.m32179h(dynamicHeight, "dynamicHeight");
        Intrinsics.m32179h(hasSeparator, "hasSeparator");
        Intrinsics.m32179h(height, "height");
        Intrinsics.m32179h(items, "items");
        Intrinsics.m32179h(margins, "margins");
        Intrinsics.m32179h(paddings, "paddings");
        Intrinsics.m32179h(restrictParentScroll, "restrictParentScroll");
        Intrinsics.m32179h(selectedTab, "selectedTab");
        Intrinsics.m32179h(separatorColor, "separatorColor");
        Intrinsics.m32179h(separatorPaddings, "separatorPaddings");
        Intrinsics.m32179h(switchTabsByContentSwipeEnabled, "switchTabsByContentSwipeEnabled");
        Intrinsics.m32179h(tabTitleStyle, "tabTitleStyle");
        Intrinsics.m32179h(titlePaddings, "titlePaddings");
        Intrinsics.m32179h(transform, "transform");
        Intrinsics.m32179h(visibility, "visibility");
        Intrinsics.m32179h(width, "width");
        this.f39508a = accessibility;
        this.f39509b = expression;
        this.f39510c = expression2;
        this.f39511d = alpha;
        this.f39512e = list;
        this.f39513f = border;
        this.f39514g = expression3;
        this.f39515h = list2;
        this.f39516i = dynamicHeight;
        this.f39517j = list3;
        this.f39518k = divFocus;
        this.f39519l = hasSeparator;
        this.f39520m = height;
        this.f39521n = str;
        this.f39522o = items;
        this.f39523p = margins;
        this.f39524q = paddings;
        this.f39525r = restrictParentScroll;
        this.f39526s = expression4;
        this.f39527t = list4;
        this.f39528u = selectedTab;
        this.f39529v = separatorColor;
        this.f39530w = separatorPaddings;
        this.f39531x = switchTabsByContentSwipeEnabled;
        this.f39532y = tabTitleStyle;
        this.f39533z = titlePaddings;
        this.f39498A = list5;
        this.f39499B = transform;
        this.f39500C = divChangeTransition;
        this.f39501D = divAppearanceTransition;
        this.f39502E = divAppearanceTransition2;
        this.f39503F = list6;
        this.f39504G = visibility;
        this.f39505H = divVisibilityAction;
        this.f39506I = list7;
        this.f39507J = width;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: a, reason: from getter */
    public DivSize getF37353o() {
        return this.f39520m;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: b, reason: from getter */
    public DivTransform getF37329H() {
        return this.f39499B;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: c */
    public List<DivVisibilityAction> mo17569c() {
        return this.f39506I;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: d */
    public List<DivBackground> mo17570d() {
        return this.f39512e;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: e, reason: from getter */
    public DivAccessibility getF37339a() {
        return this.f39508a;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: f */
    public Expression<Long> mo17572f() {
        return this.f39514g;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: g, reason: from getter */
    public DivSize getF37338Q() {
        return this.f39507J;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: getBorder, reason: from getter */
    public DivBorder getF37344f() {
        return this.f39513f;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: getId, reason: from getter */
    public String getF37357s() {
        return this.f39521n;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    public Expression<DivVisibility> getVisibility() {
        return this.f39504G;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: h, reason: from getter */
    public DivEdgeInsets getF37361w() {
        return this.f39523p;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: i */
    public Expression<Long> mo17575i() {
        return this.f39526s;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: j, reason: from getter */
    public DivEdgeInsets getF37322A() {
        return this.f39524q;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: k */
    public List<DivTransitionTrigger> mo17577k() {
        return this.f39503F;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: l */
    public List<DivAction> mo17578l() {
        return this.f39527t;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: m */
    public Expression<DivAlignmentHorizontal> mo17579m() {
        return this.f39509b;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: n */
    public List<DivExtension> mo17580n() {
        return this.f39517j;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: o */
    public List<DivTooltip> mo17581o() {
        return this.f39498A;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: p, reason: from getter */
    public DivVisibilityAction getF37336O() {
        return this.f39505H;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: q */
    public Expression<DivAlignmentVertical> mo17583q() {
        return this.f39510c;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: r, reason: from getter */
    public DivAppearanceTransition getF37331J() {
        return this.f39501D;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: s */
    public Expression<Double> mo17585s() {
        return this.f39511d;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: t, reason: from getter */
    public DivFocus getF37348j() {
        return this.f39518k;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: u, reason: from getter */
    public DivAppearanceTransition getF37332K() {
        return this.f39502E;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: v, reason: from getter */
    public DivChangeTransition getF37330I() {
        return this.f39500C;
    }

    /* compiled from: DivTabs.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div2/DivTabs$TabTitleStyle;", "Lcom/yandex/div/json/JSONSerializable;", "AnimationType", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class TabTitleStyle implements JSONSerializable {

        /* renamed from: A */
        @NotNull
        public static final Expression<Integer> f39544A;

        /* renamed from: B */
        @NotNull
        public static final Expression<Long> f39545B;

        /* renamed from: C */
        @NotNull
        public static final Expression<Double> f39546C;

        /* renamed from: D */
        @NotNull
        public static final DivEdgeInsets f39547D;

        /* renamed from: E */
        @NotNull
        public static final TypeHelper<DivFontWeight> f39548E;

        /* renamed from: F */
        @NotNull
        public static final TypeHelper<AnimationType> f39549F;

        /* renamed from: G */
        @NotNull
        public static final TypeHelper<DivFontFamily> f39550G;

        /* renamed from: H */
        @NotNull
        public static final TypeHelper<DivSizeUnit> f39551H;

        /* renamed from: I */
        @NotNull
        public static final TypeHelper<DivFontWeight> f39552I;

        /* renamed from: J */
        @NotNull
        public static final TypeHelper<DivFontWeight> f39553J;

        /* renamed from: K */
        @NotNull
        public static final ValueValidator<Long> f39554K;

        /* renamed from: L */
        @NotNull
        public static final ValueValidator<Long> f39555L;

        /* renamed from: M */
        @NotNull
        public static final ValueValidator<Long> f39556M;

        /* renamed from: N */
        @NotNull
        public static final ValueValidator<Long> f39557N;

        /* renamed from: O */
        @NotNull
        public static final ValueValidator<Long> f39558O;

        /* renamed from: P */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, TabTitleStyle> f39559P;

        /* renamed from: r */
        @NotNull
        public static final Companion f39560r = new Companion(null);

        /* renamed from: s */
        @NotNull
        public static final Expression<Integer> f39561s;

        /* renamed from: t */
        @NotNull
        public static final Expression<Integer> f39562t;

        /* renamed from: u */
        @NotNull
        public static final Expression<Long> f39563u;

        /* renamed from: v */
        @NotNull
        public static final Expression<AnimationType> f39564v;

        /* renamed from: w */
        @NotNull
        public static final Expression<DivFontFamily> f39565w;

        /* renamed from: x */
        @NotNull
        public static final Expression<Long> f39566x;

        /* renamed from: y */
        @NotNull
        public static final Expression<DivSizeUnit> f39567y;

        /* renamed from: z */
        @NotNull
        public static final Expression<DivFontWeight> f39568z;

        /* renamed from: a */
        @JvmField
        @NotNull
        public final Expression<Integer> f39569a;

        /* renamed from: b */
        @JvmField
        @Nullable
        public final Expression<DivFontWeight> f39570b;

        /* renamed from: c */
        @JvmField
        @NotNull
        public final Expression<Integer> f39571c;

        /* renamed from: d */
        @JvmField
        @NotNull
        public final Expression<Long> f39572d;

        /* renamed from: e */
        @JvmField
        @NotNull
        public final Expression<AnimationType> f39573e;

        /* renamed from: f */
        @JvmField
        @Nullable
        public final Expression<Long> f39574f;

        /* renamed from: g */
        @JvmField
        @Nullable
        public final DivCornersRadius f39575g;

        /* renamed from: h */
        @JvmField
        @NotNull
        public final Expression<Long> f39576h;

        /* renamed from: i */
        @JvmField
        @NotNull
        public final Expression<DivSizeUnit> f39577i;

        /* renamed from: j */
        @JvmField
        @NotNull
        public final Expression<DivFontWeight> f39578j;

        /* renamed from: k */
        @JvmField
        @Nullable
        public final Expression<Integer> f39579k;

        /* renamed from: l */
        @JvmField
        @Nullable
        public final Expression<DivFontWeight> f39580l;

        /* renamed from: m */
        @JvmField
        @NotNull
        public final Expression<Integer> f39581m;

        /* renamed from: n */
        @JvmField
        @NotNull
        public final Expression<Long> f39582n;

        /* renamed from: o */
        @JvmField
        @NotNull
        public final Expression<Double> f39583o;

        /* renamed from: p */
        @JvmField
        @Nullable
        public final Expression<Long> f39584p;

        /* renamed from: q */
        @JvmField
        @NotNull
        public final DivEdgeInsets f39585q;

        /* compiled from: DivTabs.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div2/DivTabs$TabTitleStyle$AnimationType;", "", "Converter", "SLIDE", "FADE", "NONE", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public enum AnimationType {
            SLIDE("slide"),
            FADE("fade"),
            NONE("none");


            /* renamed from: c */
            @NotNull
            public static final Converter f39586c = new Converter(null);

            /* renamed from: d */
            @NotNull
            public static final Function1<String, AnimationType> f39587d = new Function1<String, AnimationType>() { // from class: com.yandex.div2.DivTabs$TabTitleStyle$AnimationType$Converter$FROM_STRING$1
                @Override // kotlin.jvm.functions.Function1
                public DivTabs.TabTitleStyle.AnimationType invoke(String str) {
                    String string = str;
                    Intrinsics.m32179h(string, "string");
                    DivTabs.TabTitleStyle.AnimationType animationType = DivTabs.TabTitleStyle.AnimationType.SLIDE;
                    if (Intrinsics.m32174c(string, "slide")) {
                        return animationType;
                    }
                    DivTabs.TabTitleStyle.AnimationType animationType2 = DivTabs.TabTitleStyle.AnimationType.FADE;
                    if (Intrinsics.m32174c(string, "fade")) {
                        return animationType2;
                    }
                    DivTabs.TabTitleStyle.AnimationType animationType3 = DivTabs.TabTitleStyle.AnimationType.NONE;
                    if (Intrinsics.m32174c(string, "none")) {
                        return animationType3;
                    }
                    return null;
                }
            };

            /* renamed from: b */
            @NotNull
            public final String f39592b;

            /* compiled from: DivTabs.kt */
            @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivTabs$TabTitleStyle$AnimationType$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
            public static final class Converter {
                public Converter() {
                }

                public Converter(DefaultConstructorMarker defaultConstructorMarker) {
                }
            }

            AnimationType(String str) {
                this.f39592b = str;
            }
        }

        /* compiled from: DivTabs.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0005R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0005R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0005R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0005R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0005R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u000bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u000bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0005R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u000bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u000bR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00180%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00150%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00180%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010'R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00180%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010'¨\u0006-"}, m31884d2 = {"Lcom/yandex/div2/DivTabs$TabTitleStyle$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "ACTIVE_BACKGROUND_COLOR_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "ACTIVE_TEXT_COLOR_DEFAULT_VALUE", "", "ANIMATION_DURATION_DEFAULT_VALUE", "Lcom/yandex/div/internal/parser/ValueValidator;", "ANIMATION_DURATION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ANIMATION_DURATION_VALIDATOR", "Lcom/yandex/div2/DivTabs$TabTitleStyle$AnimationType;", "ANIMATION_TYPE_DEFAULT_VALUE", "CORNER_RADIUS_TEMPLATE_VALIDATOR", "CORNER_RADIUS_VALIDATOR", "Lcom/yandex/div2/DivFontFamily;", "FONT_FAMILY_DEFAULT_VALUE", "FONT_SIZE_DEFAULT_VALUE", "FONT_SIZE_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivSizeUnit;", "FONT_SIZE_UNIT_DEFAULT_VALUE", "FONT_SIZE_VALIDATOR", "Lcom/yandex/div2/DivFontWeight;", "FONT_WEIGHT_DEFAULT_VALUE", "INACTIVE_TEXT_COLOR_DEFAULT_VALUE", "ITEM_SPACING_DEFAULT_VALUE", "ITEM_SPACING_TEMPLATE_VALIDATOR", "ITEM_SPACING_VALIDATOR", "", "LETTER_SPACING_DEFAULT_VALUE", "LINE_HEIGHT_TEMPLATE_VALIDATOR", "LINE_HEIGHT_VALIDATOR", "Lcom/yandex/div2/DivEdgeInsets;", "PADDINGS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_ACTIVE_FONT_WEIGHT", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_ANIMATION_TYPE", "TYPE_HELPER_FONT_FAMILY", "TYPE_HELPER_FONT_SIZE_UNIT", "TYPE_HELPER_FONT_WEIGHT", "TYPE_HELPER_INACTIVE_FONT_WEIGHT", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        static {
            Expression.Companion companion = Expression.f34334a;
            f39561s = companion.m17539a(-9120);
            f39562t = companion.m17539a(-872415232);
            f39563u = companion.m17539a(300L);
            f39564v = companion.m17539a(AnimationType.SLIDE);
            f39565w = companion.m17539a(DivFontFamily.TEXT);
            f39566x = companion.m17539a(12L);
            f39567y = companion.m17539a(DivSizeUnit.SP);
            f39568z = companion.m17539a(DivFontWeight.REGULAR);
            f39544A = companion.m17539a(Integer.MIN_VALUE);
            f39545B = companion.m17539a(0L);
            f39546C = companion.m17539a(Double.valueOf(0.0d));
            f39547D = new DivEdgeInsets(companion.m17539a(6L), companion.m17539a(8L), companion.m17539a(8L), companion.m17539a(6L), null, 16);
            int i2 = TypeHelper.f33843a;
            TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
            f39548E = companion2.m17372a(ArraysKt.m31926B(DivFontWeight.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTabs$TabTitleStyle$Companion$TYPE_HELPER_ACTIVE_FONT_WEIGHT$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivFontWeight);
                }
            });
            f39549F = companion2.m17372a(ArraysKt.m31926B(AnimationType.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTabs$TabTitleStyle$Companion$TYPE_HELPER_ANIMATION_TYPE$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivTabs.TabTitleStyle.AnimationType);
                }
            });
            f39550G = companion2.m17372a(ArraysKt.m31926B(DivFontFamily.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTabs$TabTitleStyle$Companion$TYPE_HELPER_FONT_FAMILY$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivFontFamily);
                }
            });
            f39551H = companion2.m17372a(ArraysKt.m31926B(DivSizeUnit.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTabs$TabTitleStyle$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivSizeUnit);
                }
            });
            f39552I = companion2.m17372a(ArraysKt.m31926B(DivFontWeight.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTabs$TabTitleStyle$Companion$TYPE_HELPER_FONT_WEIGHT$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivFontWeight);
                }
            });
            f39553J = companion2.m17372a(ArraysKt.m31926B(DivFontWeight.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTabs$TabTitleStyle$Companion$TYPE_HELPER_INACTIVE_FONT_WEIGHT$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivFontWeight);
                }
            });
            f39554K = C3048h0.f41474v;
            f39555L = C3050i0.f41502c;
            f39556M = C3050i0.f41503d;
            f39557N = C3050i0.f41504e;
            f39558O = C3050i0.f41505f;
            f39559P = new Function2<ParsingEnvironment, JSONObject, TabTitleStyle>() { // from class: com.yandex.div2.DivTabs$TabTitleStyle$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                public DivTabs.TabTitleStyle invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    ParsingEnvironment env = parsingEnvironment;
                    JSONObject it = jSONObject;
                    Intrinsics.m32179h(env, "env");
                    Intrinsics.m32179h(it, "it");
                    DivTabs.TabTitleStyle.Companion companion3 = DivTabs.TabTitleStyle.f39560r;
                    ParsingErrorLogger f34328a = env.getF34328a();
                    Function1<Object, Integer> function1 = ParsingConvertersKt.f33827a;
                    Expression<Integer> expression = DivTabs.TabTitleStyle.f39561s;
                    TypeHelper<Integer> typeHelper = TypeHelpersKt.f33853f;
                    Expression<Integer> m17330v = JsonParser.m17330v(it, "active_background_color", function1, f34328a, env, expression, typeHelper);
                    if (m17330v != null) {
                        expression = m17330v;
                    }
                    DivFontWeight.Converter converter = DivFontWeight.f35883c;
                    Function1<String, DivFontWeight> function12 = DivFontWeight.f35884d;
                    Expression m17329u = JsonParser.m17329u(it, "active_font_weight", function12, f34328a, env, DivTabs.TabTitleStyle.f39548E);
                    Expression<Integer> expression2 = DivTabs.TabTitleStyle.f39562t;
                    Expression<Integer> m17330v2 = JsonParser.m17330v(it, "active_text_color", function1, f34328a, env, expression2, typeHelper);
                    if (m17330v2 != null) {
                        expression2 = m17330v2;
                    }
                    Function1<Number, Long> function13 = ParsingConvertersKt.f33831e;
                    ValueValidator<Long> valueValidator = DivTabs.TabTitleStyle.f39554K;
                    Expression<Long> expression3 = DivTabs.TabTitleStyle.f39563u;
                    TypeHelper<Long> typeHelper2 = TypeHelpersKt.f33849b;
                    Expression<Long> m17328t = JsonParser.m17328t(it, "animation_duration", function13, valueValidator, f34328a, expression3, typeHelper2);
                    if (m17328t != null) {
                        expression3 = m17328t;
                    }
                    DivTabs.TabTitleStyle.AnimationType.Converter converter2 = DivTabs.TabTitleStyle.AnimationType.f39586c;
                    Function1<String, DivTabs.TabTitleStyle.AnimationType> function14 = DivTabs.TabTitleStyle.AnimationType.f39587d;
                    Expression<DivTabs.TabTitleStyle.AnimationType> expression4 = DivTabs.TabTitleStyle.f39564v;
                    Expression<DivTabs.TabTitleStyle.AnimationType> m17330v3 = JsonParser.m17330v(it, "animation_type", function14, f34328a, env, expression4, DivTabs.TabTitleStyle.f39549F);
                    if (m17330v3 != null) {
                        expression4 = m17330v3;
                    }
                    Expression m17327s = JsonParser.m17327s(it, "corner_radius", function13, DivTabs.TabTitleStyle.f39555L, f34328a, env, typeHelper2);
                    DivCornersRadius.Companion companion4 = DivCornersRadius.f35216e;
                    DivCornersRadius divCornersRadius = (DivCornersRadius) JsonParser.m17322n(it, "corners_radius", DivCornersRadius.f35217f, f34328a, env);
                    DivFontFamily.Converter converter3 = DivFontFamily.f35876c;
                    Function1<String, DivFontFamily> function15 = DivFontFamily.f35877d;
                    Expression<DivFontFamily> expression5 = DivTabs.TabTitleStyle.f39565w;
                    Expression<DivFontFamily> m17330v4 = JsonParser.m17330v(it, "font_family", function15, f34328a, env, expression5, DivTabs.TabTitleStyle.f39550G);
                    if (m17330v4 != null) {
                        expression5 = m17330v4;
                    }
                    ValueValidator<Long> valueValidator2 = DivTabs.TabTitleStyle.f39556M;
                    Expression<Long> expression6 = DivTabs.TabTitleStyle.f39566x;
                    Expression<Long> m17328t2 = JsonParser.m17328t(it, "font_size", function13, valueValidator2, f34328a, expression6, typeHelper2);
                    if (m17328t2 != null) {
                        expression6 = m17328t2;
                    }
                    DivSizeUnit.Converter converter4 = DivSizeUnit.f38845c;
                    Function1<String, DivSizeUnit> function16 = DivSizeUnit.f38846d;
                    Expression<DivSizeUnit> expression7 = DivTabs.TabTitleStyle.f39567y;
                    Expression<DivSizeUnit> m17330v5 = JsonParser.m17330v(it, "font_size_unit", function16, f34328a, env, expression7, DivTabs.TabTitleStyle.f39551H);
                    if (m17330v5 != null) {
                        expression7 = m17330v5;
                    }
                    Expression<DivFontWeight> expression8 = DivTabs.TabTitleStyle.f39568z;
                    Expression<DivFontWeight> m17330v6 = JsonParser.m17330v(it, "font_weight", function12, f34328a, env, expression8, DivTabs.TabTitleStyle.f39552I);
                    if (m17330v6 != null) {
                        expression8 = m17330v6;
                    }
                    Expression m17329u2 = JsonParser.m17329u(it, "inactive_background_color", function1, f34328a, env, typeHelper);
                    Expression m17329u3 = JsonParser.m17329u(it, "inactive_font_weight", function12, f34328a, env, DivTabs.TabTitleStyle.f39553J);
                    Expression<Integer> expression9 = DivTabs.TabTitleStyle.f39544A;
                    Expression<Integer> m17330v7 = JsonParser.m17330v(it, "inactive_text_color", function1, f34328a, env, expression9, typeHelper);
                    Expression<Integer> expression10 = m17330v7 == null ? expression9 : m17330v7;
                    ValueValidator<Long> valueValidator3 = DivTabs.TabTitleStyle.f39557N;
                    Expression<Long> expression11 = DivTabs.TabTitleStyle.f39545B;
                    Expression<Long> m17328t3 = JsonParser.m17328t(it, "item_spacing", function13, valueValidator3, f34328a, expression11, typeHelper2);
                    Expression<Long> expression12 = m17328t3 == null ? expression11 : m17328t3;
                    Function1<Number, Double> function17 = ParsingConvertersKt.f33830d;
                    Expression<Double> expression13 = DivTabs.TabTitleStyle.f39546C;
                    Expression<Double> m17330v8 = JsonParser.m17330v(it, "letter_spacing", function17, f34328a, env, expression13, TypeHelpersKt.f33851d);
                    Expression<Double> expression14 = m17330v8 == null ? expression13 : m17330v8;
                    Expression m17327s2 = JsonParser.m17327s(it, "line_height", function13, DivTabs.TabTitleStyle.f39558O, f34328a, env, typeHelper2);
                    DivEdgeInsets.Companion companion5 = DivEdgeInsets.f35607f;
                    DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(it, "paddings", DivEdgeInsets.f35618q, f34328a, env);
                    if (divEdgeInsets == null) {
                        divEdgeInsets = DivTabs.TabTitleStyle.f39547D;
                    }
                    Intrinsics.m32178g(divEdgeInsets, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
                    return new DivTabs.TabTitleStyle(expression, m17329u, expression2, expression3, expression4, m17327s, divCornersRadius, expression5, expression6, expression7, expression8, m17329u2, m17329u3, expression10, expression12, expression14, m17327s2, divEdgeInsets);
                }
            };
        }

        @DivModelInternalApi
        public TabTitleStyle() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143);
        }

        @DivModelInternalApi
        public TabTitleStyle(@NotNull Expression<Integer> activeBackgroundColor, @Nullable Expression<DivFontWeight> expression, @NotNull Expression<Integer> activeTextColor, @NotNull Expression<Long> animationDuration, @NotNull Expression<AnimationType> animationType, @Nullable Expression<Long> expression2, @Nullable DivCornersRadius divCornersRadius, @NotNull Expression<DivFontFamily> fontFamily, @NotNull Expression<Long> fontSize, @NotNull Expression<DivSizeUnit> fontSizeUnit, @NotNull Expression<DivFontWeight> fontWeight, @Nullable Expression<Integer> expression3, @Nullable Expression<DivFontWeight> expression4, @NotNull Expression<Integer> inactiveTextColor, @NotNull Expression<Long> itemSpacing, @NotNull Expression<Double> letterSpacing, @Nullable Expression<Long> expression5, @NotNull DivEdgeInsets paddings) {
            Intrinsics.m32179h(activeBackgroundColor, "activeBackgroundColor");
            Intrinsics.m32179h(activeTextColor, "activeTextColor");
            Intrinsics.m32179h(animationDuration, "animationDuration");
            Intrinsics.m32179h(animationType, "animationType");
            Intrinsics.m32179h(fontFamily, "fontFamily");
            Intrinsics.m32179h(fontSize, "fontSize");
            Intrinsics.m32179h(fontSizeUnit, "fontSizeUnit");
            Intrinsics.m32179h(fontWeight, "fontWeight");
            Intrinsics.m32179h(inactiveTextColor, "inactiveTextColor");
            Intrinsics.m32179h(itemSpacing, "itemSpacing");
            Intrinsics.m32179h(letterSpacing, "letterSpacing");
            Intrinsics.m32179h(paddings, "paddings");
            this.f39569a = activeBackgroundColor;
            this.f39570b = expression;
            this.f39571c = activeTextColor;
            this.f39572d = animationDuration;
            this.f39573e = animationType;
            this.f39574f = expression2;
            this.f39575g = divCornersRadius;
            this.f39576h = fontSize;
            this.f39577i = fontSizeUnit;
            this.f39578j = fontWeight;
            this.f39579k = expression3;
            this.f39580l = expression4;
            this.f39581m = inactiveTextColor;
            this.f39582n = itemSpacing;
            this.f39583o = letterSpacing;
            this.f39584p = expression5;
            this.f39585q = paddings;
        }

        public /* synthetic */ TabTitleStyle(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, DivCornersRadius divCornersRadius, Expression expression7, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, Expression expression13, Expression expression14, Expression expression15, Expression expression16, DivEdgeInsets divEdgeInsets, int i2) {
            this((i2 & 1) != 0 ? f39561s : null, null, (i2 & 4) != 0 ? f39562t : null, (i2 & 8) != 0 ? f39563u : null, (i2 & 16) != 0 ? f39564v : null, null, null, (i2 & 128) != 0 ? f39565w : null, (i2 & 256) != 0 ? f39566x : null, (i2 & RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? f39567y : null, (i2 & RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE) != 0 ? f39568z : null, null, null, (i2 & RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST) != 0 ? f39544A : null, (i2 & 16384) != 0 ? f39545B : null, (i2 & 32768) != 0 ? f39546C : null, null, (i2 & 131072) != 0 ? f39547D : null);
        }
    }
}
