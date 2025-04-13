package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivFilter;
import com.yandex.div2.DivFilterTemplate;
import com.yandex.div2.DivImageScale;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivImageBackgroundTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivImageBackgroundTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivImageBackground;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivImageBackgroundTemplate implements JSONSerializable, JsonTemplate<DivImageBackground> {

    /* renamed from: h */
    @NotNull
    public static final Expression<Double> f36770h;

    /* renamed from: i */
    @NotNull
    public static final Expression<DivAlignmentHorizontal> f36771i;

    /* renamed from: j */
    @NotNull
    public static final Expression<DivAlignmentVertical> f36772j;

    /* renamed from: k */
    @NotNull
    public static final Expression<Boolean> f36773k;

    /* renamed from: l */
    @NotNull
    public static final Expression<DivImageScale> f36774l;

    /* renamed from: m */
    @NotNull
    public static final TypeHelper<DivAlignmentHorizontal> f36775m;

    /* renamed from: n */
    @NotNull
    public static final TypeHelper<DivAlignmentVertical> f36776n;

    /* renamed from: o */
    @NotNull
    public static final TypeHelper<DivImageScale> f36777o;

    /* renamed from: p */
    @NotNull
    public static final ValueValidator<Double> f36778p;

    /* renamed from: q */
    @NotNull
    public static final ValueValidator<Double> f36779q;

    /* renamed from: r */
    @NotNull
    public static final ListValidator<DivFilter> f36780r;

    /* renamed from: s */
    @NotNull
    public static final ListValidator<DivFilterTemplate> f36781s;

    /* renamed from: t */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f36782t;

    /* renamed from: u */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>> f36783u;

    /* renamed from: v */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>> f36784v;

    /* renamed from: w */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivFilter>> f36785w;

    /* renamed from: x */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Uri>> f36786x;

    /* renamed from: y */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>> f36787y;

    /* renamed from: z */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivImageScale>> f36788z;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f36789a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentHorizontal>> f36790b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<Expression<DivAlignmentVertical>> f36791c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<List<DivFilterTemplate>> f36792d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Field<Expression<Uri>> f36793e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final Field<Expression<Boolean>> f36794f;

    /* renamed from: g */
    @JvmField
    @NotNull
    public final Field<Expression<DivImageScale>> f36795g;

    /* compiled from: DivImageBackgroundTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0005R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0005R\u0014\u0010\u0019\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d¨\u0006 "}, m31884d2 = {"Lcom/yandex/div2/DivImageBackgroundTemplate$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ALPHA_VALIDATOR", "Lcom/yandex/div2/DivAlignmentHorizontal;", "CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE", "Lcom/yandex/div2/DivAlignmentVertical;", "CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivFilterTemplate;", "FILTERS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivFilter;", "FILTERS_VALIDATOR", "", "PRELOAD_REQUIRED_DEFAULT_VALUE", "Lcom/yandex/div2/DivImageScale;", "SCALE_DEFAULT_VALUE", "", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL", "TYPE_HELPER_SCALE", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f36770h = companion.m17539a(Double.valueOf(1.0d));
        f36771i = companion.m17539a(DivAlignmentHorizontal.CENTER);
        f36772j = companion.m17539a(DivAlignmentVertical.CENTER);
        f36773k = companion.m17539a(Boolean.FALSE);
        f36774l = companion.m17539a(DivImageScale.FILL);
        int i2 = TypeHelper.f33843a;
        TypeHelper.Companion companion2 = TypeHelper.Companion.f33844a;
        f36775m = companion2.m17372a(ArraysKt.m31926B(DivAlignmentHorizontal.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivImageBackgroundTemplate$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentHorizontal);
            }
        });
        f36776n = companion2.m17372a(ArraysKt.m31926B(DivAlignmentVertical.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivImageBackgroundTemplate$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAlignmentVertical);
            }
        });
        f36777o = companion2.m17372a(ArraysKt.m31926B(DivImageScale.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivImageBackgroundTemplate$Companion$TYPE_HELPER_SCALE$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivImageScale);
            }
        });
        f36778p = C3067r.f41958j;
        f36779q = C3067r.f41959k;
        f36780r = C3065q.f41927w;
        f36781s = C3065q.f41928x;
        f36782t = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivImageBackgroundTemplate$Companion$ALPHA_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
                ValueValidator<Double> valueValidator = DivImageBackgroundTemplate.f36779q;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Double> expression = DivImageBackgroundTemplate.f36770h;
                Expression<Double> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33851d);
                return m17328t == null ? expression : m17328t;
            }
        };
        f36783u = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentHorizontal>>() { // from class: com.yandex.div2.DivImageBackgroundTemplate$Companion$CONTENT_ALIGNMENT_HORIZONTAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentHorizontal> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
                Function1<String, DivAlignmentHorizontal> function1 = DivAlignmentHorizontal.f34618d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivAlignmentHorizontal> expression = DivImageBackgroundTemplate.f36771i;
                Expression<DivAlignmentHorizontal> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivImageBackgroundTemplate.f36775m);
                return m17330v == null ? expression : m17330v;
            }
        };
        f36784v = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivAlignmentVertical>>() { // from class: com.yandex.div2.DivImageBackgroundTemplate$Companion$CONTENT_ALIGNMENT_VERTICAL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivAlignmentVertical> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAlignmentVertical.Converter converter = DivAlignmentVertical.f34625c;
                Function1<String, DivAlignmentVertical> function1 = DivAlignmentVertical.f34626d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivAlignmentVertical> expression = DivImageBackgroundTemplate.f36772j;
                Expression<DivAlignmentVertical> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivImageBackgroundTemplate.f36776n);
                return m17330v == null ? expression : m17330v;
            }
        };
        f36785w = new Function3<String, JSONObject, ParsingEnvironment, List<DivFilter>>() { // from class: com.yandex.div2.DivImageBackgroundTemplate$Companion$FILTERS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivFilter> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivFilter.Companion companion3 = DivFilter.f35717a;
                return JsonParser.m17333y(jSONObject2, str2, DivFilter.f35718b, DivImageBackgroundTemplate.f36780r, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f36786x = new Function3<String, JSONObject, ParsingEnvironment, Expression<Uri>>() { // from class: com.yandex.div2.DivImageBackgroundTemplate$Companion$IMAGE_URL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Uri> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17317i(jSONObject2, str2, ParsingConvertersKt.f33828b, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33852e);
            }
        };
        f36787y = new Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>>() { // from class: com.yandex.div2.DivImageBackgroundTemplate$Companion$PRELOAD_REQUIRED_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Boolean> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Object, Boolean> function1 = ParsingConvertersKt.f33829c;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Boolean> expression = DivImageBackgroundTemplate.f36773k;
                Expression<Boolean> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33848a);
                return m17330v == null ? expression : m17330v;
            }
        };
        f36788z = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivImageScale>>() { // from class: com.yandex.div2.DivImageBackgroundTemplate$Companion$SCALE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivImageScale> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivImageScale.Converter converter = DivImageScale.f36808c;
                Function1<String, DivImageScale> function1 = DivImageScale.f36809d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivImageScale> expression = DivImageBackgroundTemplate.f36774l;
                Expression<DivImageScale> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivImageBackgroundTemplate.f36777o);
                return m17330v == null ? expression : m17330v;
            }
        };
        DivImageBackgroundTemplate$Companion$TYPE_READER$1 divImageBackgroundTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivImageBackgroundTemplate$Companion$TYPE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                Object m17742d = C3033a.m17742d(str2, "key", jSONObject2, "json", parsingEnvironment, "env", jSONObject2, str2);
                if (m17742d != null) {
                    return (String) m17742d;
                }
                throw ParsingExceptionKt.m17523h(jSONObject2, str2);
            }
        };
        DivImageBackgroundTemplate$Companion$CREATOR$1 divImageBackgroundTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivImageBackgroundTemplate>() { // from class: com.yandex.div2.DivImageBackgroundTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivImageBackgroundTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivImageBackgroundTemplate(env, null, false, it);
            }
        };
    }

    public DivImageBackgroundTemplate(@NotNull ParsingEnvironment env, @Nullable DivImageBackgroundTemplate divImageBackgroundTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        this.f36789a = JsonTemplateParser.m17357r(json, "alpha", z, divImageBackgroundTemplate == null ? null : divImageBackgroundTemplate.f36789a, ParsingConvertersKt.f33830d, f36778p, f34328a, env, TypeHelpersKt.f33851d);
        Field<Expression<DivAlignmentHorizontal>> field = divImageBackgroundTemplate == null ? null : divImageBackgroundTemplate.f36790b;
        DivAlignmentHorizontal.Converter converter = DivAlignmentHorizontal.f34617c;
        this.f36790b = JsonTemplateParser.m17358s(json, "content_alignment_horizontal", z, field, DivAlignmentHorizontal.f34618d, f34328a, env, f36775m);
        Field<Expression<DivAlignmentVertical>> field2 = divImageBackgroundTemplate == null ? null : divImageBackgroundTemplate.f36791c;
        DivAlignmentVertical.Converter converter2 = DivAlignmentVertical.f34625c;
        this.f36791c = JsonTemplateParser.m17358s(json, "content_alignment_vertical", z, field2, DivAlignmentVertical.f34626d, f34328a, env, f36776n);
        Field<List<DivFilterTemplate>> field3 = divImageBackgroundTemplate == null ? null : divImageBackgroundTemplate.f36792d;
        DivFilterTemplate.Companion companion = DivFilterTemplate.f35721a;
        this.f36792d = JsonTemplateParser.m17360u(json, "filters", z, field3, DivFilterTemplate.f35722b, f36781s, f34328a, env);
        this.f36793e = JsonTemplateParser.m17349j(json, "image_url", z, divImageBackgroundTemplate == null ? null : divImageBackgroundTemplate.f36793e, ParsingConvertersKt.f33828b, f34328a, env, TypeHelpersKt.f33852e);
        this.f36794f = JsonTemplateParser.m17358s(json, "preload_required", z, divImageBackgroundTemplate == null ? null : divImageBackgroundTemplate.f36794f, ParsingConvertersKt.f33829c, f34328a, env, TypeHelpersKt.f33848a);
        Field<Expression<DivImageScale>> field4 = divImageBackgroundTemplate == null ? null : divImageBackgroundTemplate.f36795g;
        DivImageScale.Converter converter3 = DivImageScale.f36808c;
        this.f36795g = JsonTemplateParser.m17358s(json, "scale", z, field4, DivImageScale.f36809d, f34328a, env, f36777o);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivImageBackground mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        Expression<Double> expression = (Expression) FieldKt.m17378d(this.f36789a, env, "alpha", data, f36782t);
        if (expression == null) {
            expression = f36770h;
        }
        Expression<Double> expression2 = expression;
        Expression<DivAlignmentHorizontal> expression3 = (Expression) FieldKt.m17378d(this.f36790b, env, "content_alignment_horizontal", data, f36783u);
        if (expression3 == null) {
            expression3 = f36771i;
        }
        Expression<DivAlignmentHorizontal> expression4 = expression3;
        Expression<DivAlignmentVertical> expression5 = (Expression) FieldKt.m17378d(this.f36791c, env, "content_alignment_vertical", data, f36784v);
        if (expression5 == null) {
            expression5 = f36772j;
        }
        Expression<DivAlignmentVertical> expression6 = expression5;
        List m17382h = FieldKt.m17382h(this.f36792d, env, "filters", data, f36780r, f36785w);
        Expression expression7 = (Expression) FieldKt.m17376b(this.f36793e, env, "image_url", data, f36786x);
        Expression<Boolean> expression8 = (Expression) FieldKt.m17378d(this.f36794f, env, "preload_required", data, f36787y);
        if (expression8 == null) {
            expression8 = f36773k;
        }
        Expression<Boolean> expression9 = expression8;
        Expression<DivImageScale> expression10 = (Expression) FieldKt.m17378d(this.f36795g, env, "scale", data, f36788z);
        if (expression10 == null) {
            expression10 = f36774l;
        }
        return new DivImageBackground(expression2, expression4, expression6, m17382h, expression7, expression9, expression10);
    }
}
