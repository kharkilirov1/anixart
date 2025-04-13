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
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivIndicator;
import com.yandex.div2.DivIndicatorItemPlacement;
import com.yandex.div2.DivRoundedRectangleShape;
import com.yandex.div2.DivShape;
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

/* compiled from: DivIndicator.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivIndicator;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div2/DivBase;", "Animation", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivIndicator implements JSONSerializable, DivBase {

    /* renamed from: M */
    @NotNull
    public static final Companion f37014M = new Companion(null);

    /* renamed from: N */
    @NotNull
    public static final DivAccessibility f37015N;

    /* renamed from: O */
    @NotNull
    public static final Expression<Integer> f37016O;

    /* renamed from: P */
    @NotNull
    public static final Expression<Double> f37017P;

    /* renamed from: Q */
    @NotNull
    public static final Expression<Double> f37018Q;

    /* renamed from: R */
    @NotNull
    public static final Expression<Animation> f37019R;

    /* renamed from: S */
    @NotNull
    public static final DivBorder f37020S;

    /* renamed from: T */
    @NotNull
    public static final DivSize.WrapContent f37021T;

    /* renamed from: U */
    @NotNull
    public static final Expression<Integer> f37022U;

    /* renamed from: V */
    @NotNull
    public static final DivEdgeInsets f37023V;

    /* renamed from: W */
    @NotNull
    public static final Expression<Double> f37024W;

    /* renamed from: X */
    @NotNull
    public static final DivEdgeInsets f37025X;

    /* renamed from: Y */
    @NotNull
    public static final DivShape.RoundedRectangle f37026Y;

    /* renamed from: Z */
    @NotNull
    public static final DivFixedSize f37027Z;

    /* renamed from: a0 */
    @NotNull
    public static final DivTransform f37028a0;

    /* renamed from: b0 */
    @NotNull
    public static final Expression<DivVisibility> f37029b0;

    /* renamed from: c0 */
    @NotNull
    public static final DivSize.MatchParent f37030c0;

    /* renamed from: d0 */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f37031d0;

    /* renamed from: e0 */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f37032e0;

    /* renamed from: f0 */
    @NotNull
    public static final TypeHelper<Animation> f37033f0;

    /* renamed from: g0 */
    @NotNull
    public static final TypeHelper<DivVisibility> f37034g0;

    /* renamed from: h0 */
    @NotNull
    public static final ValueValidator<Double> f37035h0;

    /* renamed from: i0 */
    @NotNull
    public static final ValueValidator<Double> f37036i0;

    /* renamed from: j0 */
    @NotNull
    public static final ListValidator<DivBackground> f37037j0;

    /* renamed from: k0 */
    @NotNull
    public static final ValueValidator<Long> f37038k0;

    /* renamed from: l0 */
    @NotNull
    public static final ListValidator<DivDisappearAction> f37039l0;

    /* renamed from: m0 */
    @NotNull
    public static final ListValidator<DivExtension> f37040m0;

    /* renamed from: n0 */
    @NotNull
    public static final ValueValidator<String> f37041n0;

    /* renamed from: o0 */
    @NotNull
    public static final ValueValidator<Double> f37042o0;

    /* renamed from: p0 */
    @NotNull
    public static final ValueValidator<Long> f37043p0;

    /* renamed from: q0 */
    @NotNull
    public static final ListValidator<DivAction> f37044q0;

    /* renamed from: r0 */
    @NotNull
    public static final ListValidator<DivTooltip> f37045r0;

    /* renamed from: s0 */
    @NotNull
    public static final ListValidator<DivTransitionTrigger> f37046s0;

    /* renamed from: t0 */
    @NotNull
    public static final ListValidator<DivVisibilityAction> f37047t0;

    /* renamed from: A */
    @JvmField
    @NotNull
    public final DivShape f37048A;

    /* renamed from: B */
    @JvmField
    @NotNull
    public final DivFixedSize f37049B;

    /* renamed from: C */
    @Nullable
    public final List<DivTooltip> f37050C;

    /* renamed from: D */
    @NotNull
    public final DivTransform f37051D;

    /* renamed from: E */
    @Nullable
    public final DivChangeTransition f37052E;

    /* renamed from: F */
    @Nullable
    public final DivAppearanceTransition f37053F;

    /* renamed from: G */
    @Nullable
    public final DivAppearanceTransition f37054G;

    /* renamed from: H */
    @Nullable
    public final List<DivTransitionTrigger> f37055H;

    /* renamed from: I */
    @NotNull
    public final Expression<DivVisibility> f37056I;

    /* renamed from: J */
    @Nullable
    public final DivVisibilityAction f37057J;

    /* renamed from: K */
    @Nullable
    public final List<DivVisibilityAction> f37058K;

    /* renamed from: L */
    @NotNull
    public final DivSize f37059L;

    /* renamed from: a */
    @NotNull
    public final DivAccessibility f37060a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Expression<Integer> f37061b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Expression<Double> f37062c;

    /* renamed from: d */
    @JvmField
    @Nullable
    public final DivRoundedRectangleShape f37063d;

    /* renamed from: e */
    @Nullable
    public final Expression<DivAlignmentHorizontal> f37064e;

    /* renamed from: f */
    @Nullable
    public final Expression<DivAlignmentVertical> f37065f;

    /* renamed from: g */
    @NotNull
    public final Expression<Double> f37066g;

    /* renamed from: h */
    @JvmField
    @NotNull
    public final Expression<Animation> f37067h;

    /* renamed from: i */
    @Nullable
    public final List<DivBackground> f37068i;

    /* renamed from: j */
    @NotNull
    public final DivBorder f37069j;

    /* renamed from: k */
    @Nullable
    public final Expression<Long> f37070k;

    /* renamed from: l */
    @Nullable
    public final List<DivDisappearAction> f37071l;

    /* renamed from: m */
    @Nullable
    public final List<DivExtension> f37072m;

    /* renamed from: n */
    @Nullable
    public final DivFocus f37073n;

    /* renamed from: o */
    @NotNull
    public final DivSize f37074o;

    /* renamed from: p */
    @Nullable
    public final String f37075p;

    /* renamed from: q */
    @JvmField
    @NotNull
    public final Expression<Integer> f37076q;

    /* renamed from: r */
    @JvmField
    @Nullable
    public final DivRoundedRectangleShape f37077r;

    /* renamed from: s */
    @JvmField
    @Nullable
    public final DivRoundedRectangleShape f37078s;

    /* renamed from: t */
    @JvmField
    @Nullable
    public final DivIndicatorItemPlacement f37079t;

    /* renamed from: u */
    @NotNull
    public final DivEdgeInsets f37080u;

    /* renamed from: v */
    @JvmField
    @NotNull
    public final Expression<Double> f37081v;

    /* renamed from: w */
    @NotNull
    public final DivEdgeInsets f37082w;

    /* renamed from: x */
    @JvmField
    @Nullable
    public final String f37083x;

    /* renamed from: y */
    @Nullable
    public final Expression<Long> f37084y;

    /* renamed from: z */
    @Nullable
    public final List<DivAction> f37085z;

    /* compiled from: DivIndicator.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div2/DivIndicator$Animation;", "", "Converter", "SCALE", "WORM", "SLIDER", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public enum Animation {
        SCALE("scale"),
        WORM("worm"),
        SLIDER("slider");


        /* renamed from: c */
        @NotNull
        public static final Converter f37086c = new Converter(null);

        /* renamed from: d */
        @NotNull
        public static final Function1<String, Animation> f37087d = new Function1<String, Animation>() { // from class: com.yandex.div2.DivIndicator$Animation$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            public DivIndicator.Animation invoke(String str) {
                String string = str;
                Intrinsics.m32179h(string, "string");
                DivIndicator.Animation animation = DivIndicator.Animation.SCALE;
                if (Intrinsics.m32174c(string, "scale")) {
                    return animation;
                }
                DivIndicator.Animation animation2 = DivIndicator.Animation.WORM;
                if (Intrinsics.m32174c(string, "worm")) {
                    return animation2;
                }
                DivIndicator.Animation animation3 = DivIndicator.Animation.SLIDER;
                if (Intrinsics.m32174c(string, "slider")) {
                    return animation3;
                }
                return null;
            }
        };

        /* renamed from: b */
        @NotNull
        public final String f37092b;

        /* compiled from: DivIndicator.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivIndicator$Animation$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Converter {
            public Converter() {
            }

            public Converter(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        Animation(String str) {
            this.f37092b = str;
        }
    }

    /* compiled from: DivIndicator.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\bR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\rR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\rR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0017R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\rR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020%0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\rR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\bR\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\bR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\rR\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\rR\u0014\u0010/\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010+R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\rR\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\rR\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0017R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0017R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\u0017R\u0014\u0010A\u001a\u00020%8\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020D0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020G0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010FR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00120C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010FR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020J0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010FR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020L0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010\u0017R\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020J0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010\bR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006R"}, m31884d2 = {"Lcom/yandex/div2/DivIndicator$Companion;", "", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/json/expressions/Expression;", "", "ACTIVE_ITEM_COLOR_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "", "ACTIVE_ITEM_SIZE_DEFAULT_VALUE", "Lcom/yandex/div/internal/parser/ValueValidator;", "ACTIVE_ITEM_SIZE_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ACTIVE_ITEM_SIZE_VALIDATOR", "ALPHA_DEFAULT_VALUE", "ALPHA_TEMPLATE_VALIDATOR", "ALPHA_VALIDATOR", "Lcom/yandex/div2/DivIndicator$Animation;", "ANIMATION_DEFAULT_VALUE", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivDisappearAction;", "DISAPPEAR_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivExtension;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/DivSize$WrapContent;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$WrapContent;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "INACTIVE_ITEM_COLOR_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/DivEdgeInsets;", "MINIMUM_ITEM_SIZE_DEFAULT_VALUE", "MINIMUM_ITEM_SIZE_TEMPLATE_VALIDATOR", "MINIMUM_ITEM_SIZE_VALIDATOR", "PADDINGS_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "Lcom/yandex/div2/DivAction;", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivShape$RoundedRectangle;", "SHAPE_DEFAULT_VALUE", "Lcom/yandex/div2/DivShape$RoundedRectangle;", "Lcom/yandex/div2/DivFixedSize;", "SPACE_BETWEEN_CENTERS_DEFAULT_VALUE", "Lcom/yandex/div2/DivFixedSize;", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/DivTransform;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/DivTransform;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_VALIDATOR", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "TYPE_HELPER_ANIMATION", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/DivVisibilityAction;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/DivSize$MatchParent;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivIndicator m17635a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            DivAccessibility.Companion companion = DivAccessibility.f34479f;
            DivAccessibility divAccessibility = (DivAccessibility) JsonParser.m17322n(jSONObject, "accessibility", DivAccessibility.f34486m, f34328a, parsingEnvironment);
            if (divAccessibility == null) {
                divAccessibility = DivIndicator.f37015N;
            }
            DivAccessibility divAccessibility2 = divAccessibility;
            Intrinsics.m32178g(divAccessibility2, "JsonParser.readOptional(…CESSIBILITY_DEFAULT_VALUE");
            Function1<Object, Integer> function1 = ParsingConvertersKt.f33827a;
            Expression<Integer> expression = DivIndicator.f37016O;
            TypeHelper<Integer> typeHelper = TypeHelpersKt.f33853f;
            Expression<Integer> m17330v = JsonParser.m17330v(jSONObject, "active_item_color", function1, f34328a, parsingEnvironment, expression, typeHelper);
            if (m17330v != null) {
                expression = m17330v;
            }
            Function1<Number, Double> function12 = ParsingConvertersKt.f33830d;
            ValueValidator<Double> valueValidator = DivIndicator.f37035h0;
            Expression<Double> expression2 = DivIndicator.f37017P;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.f33851d;
            Expression<Double> m17328t = JsonParser.m17328t(jSONObject, "active_item_size", function12, valueValidator, f34328a, expression2, typeHelper2);
            if (m17328t != null) {
                expression2 = m17328t;
            }
            DivRoundedRectangleShape.Companion companion2 = DivRoundedRectangleShape.f38174f;
            Function2<ParsingEnvironment, JSONObject, DivRoundedRectangleShape> function2 = DivRoundedRectangleShape.f38178j;
            DivRoundedRectangleShape divRoundedRectangleShape = (DivRoundedRectangleShape) JsonParser.m17322n(jSONObject, "active_shape", function2, f34328a, parsingEnvironment);
            DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
            Expression m17329u = JsonParser.m17329u(jSONObject, "alignment_horizontal", DivAlignmentHorizontal.f34618d, f34328a, parsingEnvironment, DivIndicator.f37031d0);
            DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
            Expression m17329u2 = JsonParser.m17329u(jSONObject, "alignment_vertical", DivAlignmentVertical.f34626d, f34328a, parsingEnvironment, DivIndicator.f37032e0);
            ValueValidator<Double> valueValidator2 = DivIndicator.f37036i0;
            Expression<Double> expression3 = DivIndicator.f37018Q;
            Expression<Double> expression4 = expression2;
            Expression<Double> m17328t2 = JsonParser.m17328t(jSONObject, "alpha", function12, valueValidator2, f34328a, expression3, typeHelper2);
            if (m17328t2 != null) {
                expression3 = m17328t2;
            }
            Animation.Converter converter3 = Animation.f37086c;
            Function1<String, Animation> function13 = Animation.f37087d;
            Expression<Animation> expression5 = DivIndicator.f37019R;
            Expression<Animation> m17330v2 = JsonParser.m17330v(jSONObject, "animation", function13, f34328a, parsingEnvironment, expression5, DivIndicator.f37033f0);
            if (m17330v2 != null) {
                expression5 = m17330v2;
            }
            DivBackground.Companion companion3 = DivBackground.f34750a;
            List m17333y = JsonParser.m17333y(jSONObject, "background", DivBackground.f34751b, DivIndicator.f37037j0, f34328a, parsingEnvironment);
            DivBorder.Companion companion4 = DivBorder.f34785f;
            DivBorder divBorder = (DivBorder) JsonParser.m17322n(jSONObject, "border", DivBorder.f34788i, f34328a, parsingEnvironment);
            if (divBorder == null) {
                divBorder = DivIndicator.f37020S;
            }
            DivBorder divBorder2 = divBorder;
            Intrinsics.m32178g(divBorder2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            Function1<Number, Long> function14 = ParsingConvertersKt.f33831e;
            ValueValidator<Long> valueValidator3 = DivIndicator.f37038k0;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.f33849b;
            Expression m17327s = JsonParser.m17327s(jSONObject, "column_span", function14, valueValidator3, f34328a, parsingEnvironment, typeHelper3);
            DivDisappearAction.Companion companion5 = DivDisappearAction.f35537a;
            List m17333y2 = JsonParser.m17333y(jSONObject, "disappear_actions", DivDisappearAction.f35545i, DivIndicator.f37039l0, f34328a, parsingEnvironment);
            DivExtension.Companion companion6 = DivExtension.f35659c;
            List m17333y3 = JsonParser.m17333y(jSONObject, "extensions", DivExtension.f35660d, DivIndicator.f37040m0, f34328a, parsingEnvironment);
            DivFocus.Companion companion7 = DivFocus.f35813f;
            DivFocus divFocus = (DivFocus) JsonParser.m17322n(jSONObject, "focus", DivFocus.f35818k, f34328a, parsingEnvironment);
            DivSize.Companion companion8 = DivSize.f38833a;
            Function2<ParsingEnvironment, JSONObject, DivSize> function22 = DivSize.f38834b;
            DivSize divSize = (DivSize) JsonParser.m17322n(jSONObject, "height", function22, f34328a, parsingEnvironment);
            if (divSize == null) {
                divSize = DivIndicator.f37021T;
            }
            DivSize divSize2 = divSize;
            Intrinsics.m32178g(divSize2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            String str = (String) JsonParser.m17323o(jSONObject, "id", DivIndicator.f37041n0, f34328a, parsingEnvironment);
            Expression<Integer> expression6 = DivIndicator.f37022U;
            Expression<Integer> m17330v3 = JsonParser.m17330v(jSONObject, "inactive_item_color", function1, f34328a, parsingEnvironment, expression6, typeHelper);
            if (m17330v3 != null) {
                expression6 = m17330v3;
            }
            DivRoundedRectangleShape divRoundedRectangleShape2 = (DivRoundedRectangleShape) JsonParser.m17322n(jSONObject, "inactive_minimum_shape", function2, f34328a, parsingEnvironment);
            DivRoundedRectangleShape divRoundedRectangleShape3 = (DivRoundedRectangleShape) JsonParser.m17322n(jSONObject, "inactive_shape", function2, f34328a, parsingEnvironment);
            DivIndicatorItemPlacement.Companion companion9 = DivIndicatorItemPlacement.f37099a;
            DivIndicatorItemPlacement divIndicatorItemPlacement = (DivIndicatorItemPlacement) JsonParser.m17322n(jSONObject, "items_placement", DivIndicatorItemPlacement.f37100b, f34328a, parsingEnvironment);
            DivEdgeInsets.Companion companion10 = DivEdgeInsets.f35607f;
            Function2<ParsingEnvironment, JSONObject, DivEdgeInsets> function23 = DivEdgeInsets.f35618q;
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "margins", function23, f34328a, parsingEnvironment);
            if (divEdgeInsets == null) {
                divEdgeInsets = DivIndicator.f37023V;
            }
            DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
            Intrinsics.m32178g(divEdgeInsets2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            ValueValidator<Double> valueValidator4 = DivIndicator.f37042o0;
            Expression<Double> expression7 = DivIndicator.f37024W;
            Expression<Double> m17328t3 = JsonParser.m17328t(jSONObject, "minimum_item_size", function12, valueValidator4, f34328a, expression7, typeHelper2);
            if (m17328t3 != null) {
                expression7 = m17328t3;
            }
            DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) JsonParser.m17322n(jSONObject, "paddings", function23, f34328a, parsingEnvironment);
            if (divEdgeInsets3 == null) {
                divEdgeInsets3 = DivIndicator.f37025X;
            }
            DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
            Intrinsics.m32178g(divEdgeInsets4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            Object m17310b = JsonParser.m17310b(jSONObject, "pager_id");
            if (m17310b == null) {
                m17310b = null;
            }
            String str2 = (String) m17310b;
            Expression m17327s2 = JsonParser.m17327s(jSONObject, "row_span", function14, DivIndicator.f37043p0, f34328a, parsingEnvironment, typeHelper3);
            DivAction.Companion companion11 = DivAction.f34546g;
            List m17333y4 = JsonParser.m17333y(jSONObject, "selected_actions", DivAction.f34550k, DivIndicator.f37044q0, f34328a, parsingEnvironment);
            DivShape.Companion companion12 = DivShape.f38807a;
            DivShape divShape = (DivShape) JsonParser.m17322n(jSONObject, "shape", DivShape.f38808b, f34328a, parsingEnvironment);
            if (divShape == null) {
                divShape = DivIndicator.f37026Y;
            }
            DivShape divShape2 = divShape;
            Intrinsics.m32178g(divShape2, "JsonParser.readOptional(…v) ?: SHAPE_DEFAULT_VALUE");
            DivFixedSize.Companion companion13 = DivFixedSize.f35789c;
            DivFixedSize divFixedSize = (DivFixedSize) JsonParser.m17322n(jSONObject, "space_between_centers", DivFixedSize.f35793g, f34328a, parsingEnvironment);
            if (divFixedSize == null) {
                divFixedSize = DivIndicator.f37027Z;
            }
            DivFixedSize divFixedSize2 = divFixedSize;
            Intrinsics.m32178g(divFixedSize2, "JsonParser.readOptional(…EEN_CENTERS_DEFAULT_VALUE");
            DivTooltip.Companion companion14 = DivTooltip.f40492h;
            List m17333y5 = JsonParser.m17333y(jSONObject, "tooltips", DivTooltip.f40497m, DivIndicator.f37045r0, f34328a, parsingEnvironment);
            DivTransform.Companion companion15 = DivTransform.f40551d;
            DivTransform divTransform = (DivTransform) JsonParser.m17322n(jSONObject, "transform", DivTransform.f40554g, f34328a, parsingEnvironment);
            if (divTransform == null) {
                divTransform = DivIndicator.f37028a0;
            }
            DivTransform divTransform2 = divTransform;
            Intrinsics.m32178g(divTransform2, "JsonParser.readOptional(…: TRANSFORM_DEFAULT_VALUE");
            DivChangeTransition.Companion companion16 = DivChangeTransition.f34856a;
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonParser.m17322n(jSONObject, "transition_change", DivChangeTransition.f34857b, f34328a, parsingEnvironment);
            DivAppearanceTransition.Companion companion17 = DivAppearanceTransition.f34726a;
            Function2<ParsingEnvironment, JSONObject, DivAppearanceTransition> function24 = DivAppearanceTransition.f34727b;
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonParser.m17322n(jSONObject, "transition_in", function24, f34328a, parsingEnvironment);
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonParser.m17322n(jSONObject, "transition_out", function24, f34328a, parsingEnvironment);
            DivTransitionTrigger.Converter converter4 = DivTransitionTrigger.f40582c;
            List m17332x = JsonParser.m17332x(jSONObject, "transition_triggers", DivTransitionTrigger.f40583d, DivIndicator.f37046s0, f34328a, parsingEnvironment);
            DivVisibility.Converter converter5 = DivVisibility.f40930c;
            Function1<String, DivVisibility> function15 = DivVisibility.f40931d;
            Expression<DivVisibility> expression8 = DivIndicator.f37029b0;
            Expression<DivVisibility> m17330v4 = JsonParser.m17330v(jSONObject, "visibility", function15, f34328a, parsingEnvironment, expression8, DivIndicator.f37034g0);
            Expression<DivVisibility> expression9 = m17330v4 == null ? expression8 : m17330v4;
            DivVisibilityAction.Companion companion18 = DivVisibilityAction.f40938i;
            Function2<ParsingEnvironment, JSONObject, DivVisibilityAction> function25 = DivVisibilityAction.f40946q;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonParser.m17322n(jSONObject, "visibility_action", function25, f34328a, parsingEnvironment);
            List m17333y6 = JsonParser.m17333y(jSONObject, "visibility_actions", function25, DivIndicator.f37047t0, f34328a, parsingEnvironment);
            DivSize divSize3 = (DivSize) JsonParser.m17322n(jSONObject, "width", function22, f34328a, parsingEnvironment);
            if (divSize3 == null) {
                divSize3 = DivIndicator.f37030c0;
            }
            Intrinsics.m32178g(divSize3, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new DivIndicator(divAccessibility2, expression, expression4, divRoundedRectangleShape, m17329u, m17329u2, expression3, expression5, m17333y, divBorder2, m17327s, m17333y2, m17333y3, divFocus, divSize2, str, expression6, divRoundedRectangleShape2, divRoundedRectangleShape3, divIndicatorItemPlacement, divEdgeInsets2, expression7, divEdgeInsets4, str2, m17327s2, m17333y4, divShape2, divFixedSize2, m17333y5, divTransform2, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, m17332x, expression9, divVisibilityAction, m17333y6, divSize3);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression expression = null;
        Expression expression2 = null;
        f37015N = new DivAccessibility(null, expression, null, expression2, null, null, 63);
        Expression.Companion companion = Expression.f34334a;
        f37016O = companion.m17539a(16768096);
        f37017P = companion.m17539a(Double.valueOf(1.3d));
        f37018Q = companion.m17539a(Double.valueOf(1.0d));
        f37019R = companion.m17539a(Animation.SCALE);
        f37020S = new DivBorder(expression, null == true ? 1 : 0, expression2, null == true ? 1 : 0, null == true ? 1 : 0, 31);
        int i2 = 7;
        f37021T = new DivSize.WrapContent(new DivWrapContentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, i2));
        f37022U = companion.m17539a(865180853);
        int i3 = 31;
        f37023V = new DivEdgeInsets(expression2, null == true ? 1 : 0, null == true ? 1 : 0, null, null, i3);
        f37024W = companion.m17539a(Double.valueOf(0.5d));
        f37025X = new DivEdgeInsets(expression2, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, i3);
        f37026Y = new DivShape.RoundedRectangle(new DivRoundedRectangleShape(expression2, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, i3));
        f37027Z = new DivFixedSize(null == true ? 1 : 0, companion.m17539a(15L), 1);
        f37028a0 = new DivTransform(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, i2);
        f37029b0 = companion.m17539a(DivVisibility.VISIBLE);
        f37030c0 = new DivSize.MatchParent(new DivMatchParentSize(null, 1));
        int i4 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f37031d0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivIndicator$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f37032e0 = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivIndicator$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f37033f0 = companion2.m17372a(ArraysKt.m31926B(Animation.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivIndicator$Companion$TYPE_HELPER_ANIMATION$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivIndicator.Animation);
            }
        });
        f37034g0 = companion2.m17372a(ArraysKt.m31926B(DivVisibility.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivIndicator$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivVisibility);
            }
        });
        f37035h0 = C3071t.f42039d;
        f37036i0 = C3071t.f42040e;
        f37037j0 = C3069s.f42021u;
        f37038k0 = C3071t.f42041f;
        f37039l0 = C3069s.f42022v;
        f37040m0 = C3069s.f42023w;
        f37041n0 = C3067r.f41970v;
        f37042o0 = C3067r.f41971w;
        f37043p0 = C3071t.f42038c;
        f37044q0 = C3069s.f42017q;
        f37045r0 = C3069s.f42018r;
        f37046s0 = C3069s.f42019s;
        f37047t0 = C3069s.f42020t;
        DivIndicator$Companion$CREATOR$1 divIndicator$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivIndicator>() { // from class: com.yandex.div2.DivIndicator$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivIndicator invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivIndicator.f37014M.m17635a(env, it);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @DivModelInternalApi
    public DivIndicator(@NotNull DivAccessibility accessibility, @NotNull Expression<Integer> activeItemColor, @NotNull Expression<Double> activeItemSize, @Nullable DivRoundedRectangleShape divRoundedRectangleShape, @Nullable Expression<DivAlignmentHorizontal> expression, @Nullable Expression<DivAlignmentVertical> expression2, @NotNull Expression<Double> alpha, @NotNull Expression<Animation> animation, @Nullable List<? extends DivBackground> list, @NotNull DivBorder border, @Nullable Expression<Long> expression3, @Nullable List<? extends DivDisappearAction> list2, @Nullable List<? extends DivExtension> list3, @Nullable DivFocus divFocus, @NotNull DivSize height, @Nullable String str, @NotNull Expression<Integer> inactiveItemColor, @Nullable DivRoundedRectangleShape divRoundedRectangleShape2, @Nullable DivRoundedRectangleShape divRoundedRectangleShape3, @Nullable DivIndicatorItemPlacement divIndicatorItemPlacement, @NotNull DivEdgeInsets margins, @NotNull Expression<Double> minimumItemSize, @NotNull DivEdgeInsets paddings, @Nullable String str2, @Nullable Expression<Long> expression4, @Nullable List<? extends DivAction> list4, @NotNull DivShape shape, @NotNull DivFixedSize spaceBetweenCenters, @Nullable List<? extends DivTooltip> list5, @NotNull DivTransform transform, @Nullable DivChangeTransition divChangeTransition, @Nullable DivAppearanceTransition divAppearanceTransition, @Nullable DivAppearanceTransition divAppearanceTransition2, @Nullable List<? extends DivTransitionTrigger> list6, @NotNull Expression<DivVisibility> visibility, @Nullable DivVisibilityAction divVisibilityAction, @Nullable List<? extends DivVisibilityAction> list7, @NotNull DivSize width) {
        Intrinsics.m32179h(accessibility, "accessibility");
        Intrinsics.m32179h(activeItemColor, "activeItemColor");
        Intrinsics.m32179h(activeItemSize, "activeItemSize");
        Intrinsics.m32179h(alpha, "alpha");
        Intrinsics.m32179h(animation, "animation");
        Intrinsics.m32179h(border, "border");
        Intrinsics.m32179h(height, "height");
        Intrinsics.m32179h(inactiveItemColor, "inactiveItemColor");
        Intrinsics.m32179h(margins, "margins");
        Intrinsics.m32179h(minimumItemSize, "minimumItemSize");
        Intrinsics.m32179h(paddings, "paddings");
        Intrinsics.m32179h(shape, "shape");
        Intrinsics.m32179h(spaceBetweenCenters, "spaceBetweenCenters");
        Intrinsics.m32179h(transform, "transform");
        Intrinsics.m32179h(visibility, "visibility");
        Intrinsics.m32179h(width, "width");
        this.f37060a = accessibility;
        this.f37061b = activeItemColor;
        this.f37062c = activeItemSize;
        this.f37063d = divRoundedRectangleShape;
        this.f37064e = expression;
        this.f37065f = expression2;
        this.f37066g = alpha;
        this.f37067h = animation;
        this.f37068i = list;
        this.f37069j = border;
        this.f37070k = expression3;
        this.f37071l = list2;
        this.f37072m = list3;
        this.f37073n = divFocus;
        this.f37074o = height;
        this.f37075p = str;
        this.f37076q = inactiveItemColor;
        this.f37077r = divRoundedRectangleShape2;
        this.f37078s = divRoundedRectangleShape3;
        this.f37079t = divIndicatorItemPlacement;
        this.f37080u = margins;
        this.f37081v = minimumItemSize;
        this.f37082w = paddings;
        this.f37083x = str2;
        this.f37084y = expression4;
        this.f37085z = list4;
        this.f37048A = shape;
        this.f37049B = spaceBetweenCenters;
        this.f37050C = list5;
        this.f37051D = transform;
        this.f37052E = divChangeTransition;
        this.f37053F = divAppearanceTransition;
        this.f37054G = divAppearanceTransition2;
        this.f37055H = list6;
        this.f37056I = visibility;
        this.f37057J = divVisibilityAction;
        this.f37058K = list7;
        this.f37059L = width;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: a, reason: from getter */
    public DivSize getF35953o() {
        return this.f37074o;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: b, reason: from getter */
    public DivTransform getF35930A() {
        return this.f37051D;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: c */
    public List<DivVisibilityAction> mo17569c() {
        return this.f37058K;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: d */
    public List<DivBackground> mo17570d() {
        return this.f37068i;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: e, reason: from getter */
    public DivAccessibility getF35939a() {
        return this.f37060a;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: f */
    public Expression<Long> mo17572f() {
        return this.f37070k;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: g, reason: from getter */
    public DivSize getF35938I() {
        return this.f37059L;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: getBorder, reason: from getter */
    public DivBorder getF35944f() {
        return this.f37069j;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: getId, reason: from getter */
    public String getF35954p() {
        return this.f37075p;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    public Expression<DivVisibility> getVisibility() {
        return this.f37056I;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: h, reason: from getter */
    public DivEdgeInsets getF35957s() {
        return this.f37080u;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: i */
    public Expression<Long> mo17575i() {
        return this.f37084y;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: j, reason: from getter */
    public DivEdgeInsets getF35959u() {
        return this.f37082w;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: k */
    public List<DivTransitionTrigger> mo17577k() {
        return this.f37055H;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: l */
    public List<DivAction> mo17578l() {
        return this.f37085z;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: m */
    public Expression<DivAlignmentHorizontal> mo17579m() {
        return this.f37064e;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: n */
    public List<DivExtension> mo17580n() {
        return this.f37072m;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: o */
    public List<DivTooltip> mo17581o() {
        return this.f37050C;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: p, reason: from getter */
    public DivVisibilityAction getF35936G() {
        return this.f37057J;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: q */
    public Expression<DivAlignmentVertical> mo17583q() {
        return this.f37065f;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: r, reason: from getter */
    public DivAppearanceTransition getF35932C() {
        return this.f37053F;
    }

    @Override // com.yandex.div2.DivBase
    @NotNull
    /* renamed from: s */
    public Expression<Double> mo17585s() {
        return this.f37066g;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: t, reason: from getter */
    public DivFocus getF35952n() {
        return this.f37073n;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: u, reason: from getter */
    public DivAppearanceTransition getF35933D() {
        return this.f37054G;
    }

    @Override // com.yandex.div2.DivBase
    @Nullable
    /* renamed from: v, reason: from getter */
    public DivChangeTransition getF35931B() {
        return this.f37052E;
    }

    @DivModelInternalApi
    public DivIndicator() {
        this(f37015N, f37016O, f37017P, null, null, null, f37018Q, f37019R, null, f37020S, null, null, null, null, f37021T, null, f37022U, null, null, null, f37023V, f37024W, f37025X, null, null, null, f37026Y, f37027Z, null, f37028a0, null, null, null, null, f37029b0, null, null, f37030c0);
    }
}
