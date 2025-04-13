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
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivFilter;
import com.yandex.div2.DivImageScale;
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

/* compiled from: DivImageBackground.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivImageBackground;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivImageBackground implements JSONSerializable {

    /* renamed from: h */
    @NotNull
    public static final Companion f36748h = new Companion(null);

    /* renamed from: i */
    @NotNull
    public static final Expression<Double> f36749i;

    /* renamed from: j */
    @NotNull
    public static final Expression<DivAlignmentHorizontal> f36750j;

    /* renamed from: k */
    @NotNull
    public static final Expression<DivAlignmentVertical> f36751k;

    /* renamed from: l */
    @NotNull
    public static final Expression<Boolean> f36752l;

    /* renamed from: m */
    @NotNull
    public static final Expression<DivImageScale> f36753m;

    /* renamed from: n */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f36754n;

    /* renamed from: o */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f36755o;

    /* renamed from: p */
    @NotNull
    public static final TypeHelper<DivImageScale> f36756p;

    /* renamed from: q */
    @NotNull
    public static final ValueValidator<Double> f36757q;

    /* renamed from: r */
    @NotNull
    public static final ListValidator<DivFilter> f36758r;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Expression<Double> f36759a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Expression<DivAlignmentHorizontal> f36760b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Expression<DivAlignmentVertical> f36761c;

    /* renamed from: d */
    @JvmField
    @Nullable
    public final List<DivFilter> f36762d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Expression<Uri> f36763e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final Expression<Boolean> f36764f;

    /* renamed from: g */
    @JvmField
    @NotNull
    public final Expression<DivImageScale> f36765g;

    /* compiled from: DivImageBackground.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0005R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0005R\u0014\u0010\u0017\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b¨\u0006\u001e"}, m31884d2 = {"Lcom/yandex/div2/DivImageBackground$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "Lcom/yandex/div2/DivAlignmentHorizontal;", "CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE", "Lcom/yandex/div2/DivAlignmentVertical;", "CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivFilter;", "FILTERS_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "", "PRELOAD_REQUIRED_DEFAULT_VALUE", "Lcom/yandex/div2/DivImageScale;", "SCALE_DEFAULT_VALUE", "", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL", "TYPE_HELPER_SCALE", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivImageBackground m17631a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
            ValueValidator<Double> valueValidator = DivImageBackground.f36757q;
            Expression<Double> expression = DivImageBackground.f36749i;
            Expression<Double> m17328t = JsonParser.m17328t(jSONObject, "alpha", function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
            Expression<Double> expression2 = m17328t == null ? expression : m17328t;
            DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
            Function1<String, DivAlignmentHorizontal> function12 = DivAlignmentHorizontal.f34618d;
            Expression<DivAlignmentHorizontal> expression3 = DivImageBackground.f36750j;
            Expression<DivAlignmentHorizontal> m17330v = JsonParser.m17330v(jSONObject, "content_alignment_horizontal", function12, f34328a, parsingEnvironment, expression3, DivImageBackground.f36754n);
            Expression<DivAlignmentHorizontal> expression4 = m17330v == null ? expression3 : m17330v;
            DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
            Function1<String, DivAlignmentVertical> function13 = DivAlignmentVertical.f34626d;
            Expression<DivAlignmentVertical> expression5 = DivImageBackground.f36751k;
            Expression<DivAlignmentVertical> m17330v2 = JsonParser.m17330v(jSONObject, "content_alignment_vertical", function13, f34328a, parsingEnvironment, expression5, DivImageBackground.f36755o);
            Expression<DivAlignmentVertical> expression6 = m17330v2 == null ? expression5 : m17330v2;
            DivFilter.Companion companion = DivFilter.f35717a;
            List m17333y = JsonParser.m17333y(jSONObject, "filters", DivFilter.f35718b, DivImageBackground.f36758r, f34328a, parsingEnvironment);
            Expression m17317i = JsonParser.m17317i(jSONObject, "image_url", ParsingConvertersKt.f33828b, f34328a, parsingEnvironment, TypeHelpersKt.f33852e);
            Function1<Object, Boolean> function14 = ParsingConvertersKt.f33829c;
            Expression<Boolean> expression7 = DivImageBackground.f36752l;
            Expression<Boolean> m17330v3 = JsonParser.m17330v(jSONObject, "preload_required", function14, f34328a, parsingEnvironment, expression7, TypeHelpersKt.f33848a);
            Expression<Boolean> expression8 = m17330v3 == null ? expression7 : m17330v3;
            DivImageScale.Converter converter3 = DivImageScale.f36808c;
            Function1<String, DivImageScale> function15 = DivImageScale.f36809d;
            Expression<DivImageScale> expression9 = DivImageBackground.f36753m;
            Expression<DivImageScale> m17330v4 = JsonParser.m17330v(jSONObject, "scale", function15, f34328a, parsingEnvironment, expression9, DivImageBackground.f36756p);
            return new DivImageBackground(expression2, expression4, expression6, m17333y, m17317i, expression8, m17330v4 == null ? expression9 : m17330v4);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f36749i = companion.m17539a(Double.valueOf(1.0d));
        f36750j = companion.m17539a(DivAlignmentHorizontal.CENTER);
        f36751k = companion.m17539a(DivAlignmentVertical.CENTER);
        f36752l = companion.m17539a(Boolean.FALSE);
        f36753m = companion.m17539a(DivImageScale.FILL);
        int i2 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f36754n = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivImageBackground$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f36755o = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivImageBackground$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f36756p = companion2.m17372a(ArraysKt.m31926B(DivImageScale.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivImageBackground$Companion$TYPE_HELPER_SCALE$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivImageScale);
            }
        });
        f36757q = C3067r.f41957i;
        f36758r = C3065q.f41926v;
        DivImageBackground$Companion$CREATOR$1 divImageBackground$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivImageBackground>() { // from class: com.yandex.div2.DivImageBackground$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivImageBackground invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivImageBackground.f36748h.m17631a(env, it);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @DivModelInternalApi
    public DivImageBackground(@NotNull Expression<Double> alpha, @NotNull Expression<DivAlignmentHorizontal> contentAlignmentHorizontal, @NotNull Expression<DivAlignmentVertical> contentAlignmentVertical, @Nullable List<? extends DivFilter> list, @NotNull Expression<Uri> imageUrl, @NotNull Expression<Boolean> preloadRequired, @NotNull Expression<DivImageScale> scale) {
        Intrinsics.m32179h(alpha, "alpha");
        Intrinsics.m32179h(contentAlignmentHorizontal, "contentAlignmentHorizontal");
        Intrinsics.m32179h(contentAlignmentVertical, "contentAlignmentVertical");
        Intrinsics.m32179h(imageUrl, "imageUrl");
        Intrinsics.m32179h(preloadRequired, "preloadRequired");
        Intrinsics.m32179h(scale, "scale");
        this.f36759a = alpha;
        this.f36760b = contentAlignmentHorizontal;
        this.f36761c = contentAlignmentVertical;
        this.f36762d = list;
        this.f36763e = imageUrl;
        this.f36764f = preloadRequired;
        this.f36765g = scale;
    }
}
