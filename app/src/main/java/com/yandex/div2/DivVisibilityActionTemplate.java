package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
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
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivDownloadCallbacks;
import com.yandex.div2.DivDownloadCallbacksTemplate;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivVisibilityActionTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivVisibilityActionTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivVisibilityAction;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivVisibilityActionTemplate implements JSONSerializable, JsonTemplate<DivVisibilityAction> {

    /* renamed from: A */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f40956A;

    /* renamed from: B */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f40957B;

    /* renamed from: C */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivVisibilityActionTemplate> f40958C;

    /* renamed from: i */
    @NotNull
    public static final Companion f40959i = new Companion(null);

    /* renamed from: j */
    @NotNull
    public static final Expression<Long> f40960j;

    /* renamed from: k */
    @NotNull
    public static final Expression<Long> f40961k;

    /* renamed from: l */
    @NotNull
    public static final Expression<Long> f40962l;

    /* renamed from: m */
    @NotNull
    public static final ValueValidator<String> f40963m;

    /* renamed from: n */
    @NotNull
    public static final ValueValidator<String> f40964n;

    /* renamed from: o */
    @NotNull
    public static final ValueValidator<Long> f40965o;

    /* renamed from: p */
    @NotNull
    public static final ValueValidator<Long> f40966p;

    /* renamed from: q */
    @NotNull
    public static final ValueValidator<Long> f40967q;

    /* renamed from: r */
    @NotNull
    public static final ValueValidator<Long> f40968r;

    /* renamed from: s */
    @NotNull
    public static final ValueValidator<Long> f40969s;

    /* renamed from: t */
    @NotNull
    public static final ValueValidator<Long> f40970t;

    /* renamed from: u */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivDownloadCallbacks> f40971u;

    /* renamed from: v */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f40972v;

    /* renamed from: w */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f40973w;

    /* renamed from: x */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, JSONObject> f40974x;

    /* renamed from: y */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Uri>> f40975y;

    /* renamed from: z */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Uri>> f40976z;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<DivDownloadCallbacksTemplate> f40977a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<String> f40978b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f40979c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<JSONObject> f40980d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Field<Expression<Uri>> f40981e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final Field<Expression<Uri>> f40982f;

    /* renamed from: g */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f40983g;

    /* renamed from: h */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f40984h;

    /* compiled from: DivVisibilityActionTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0005R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005¨\u0006\u0013"}, m31884d2 = {"Lcom/yandex/div2/DivVisibilityActionTemplate$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "LOG_ID_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "LOG_ID_VALIDATOR", "Lcom/yandex/div/json/expressions/Expression;", "", "LOG_LIMIT_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "LOG_LIMIT_TEMPLATE_VALIDATOR", "LOG_LIMIT_VALIDATOR", "VISIBILITY_DURATION_DEFAULT_VALUE", "VISIBILITY_DURATION_TEMPLATE_VALIDATOR", "VISIBILITY_DURATION_VALIDATOR", "VISIBILITY_PERCENTAGE_DEFAULT_VALUE", "VISIBILITY_PERCENTAGE_TEMPLATE_VALIDATOR", "VISIBILITY_PERCENTAGE_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f40960j = companion.m17539a(1L);
        f40961k = companion.m17539a(800L);
        f40962l = companion.m17539a(50L);
        f40963m = C3068r0.f41980j;
        f40964n = C3068r0.f41981k;
        f40965o = C3068r0.f41982l;
        f40966p = C3068r0.f41983m;
        f40967q = C3068r0.f41984n;
        f40968r = C3068r0.f41985o;
        f40969s = C3068r0.f41986p;
        f40970t = C3068r0.f41987q;
        f40971u = new Function3<String, JSONObject, ParsingEnvironment, DivDownloadCallbacks>() { // from class: com.yandex.div2.DivVisibilityActionTemplate$Companion$DOWNLOAD_CALLBACKS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public DivDownloadCallbacks mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivDownloadCallbacks.Companion companion2 = DivDownloadCallbacks.f35585c;
                return (DivDownloadCallbacks) JsonParser.m17322n(jSONObject2, str2, DivDownloadCallbacks.f35586d, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40972v = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivVisibilityActionTemplate$Companion$LOG_ID_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return (String) JsonParser.m17311c(jSONObject2, str2, DivVisibilityActionTemplate.f40964n, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f40973w = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivVisibilityActionTemplate$Companion$LOG_LIMIT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivVisibilityActionTemplate.f40966p;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivVisibilityActionTemplate.f40960j;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        f40974x = new Function3<String, JSONObject, ParsingEnvironment, JSONObject>() { // from class: com.yandex.div2.DivVisibilityActionTemplate$Companion$PAYLOAD_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public JSONObject mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                Object m17742d = C3033a.m17742d(str2, "key", jSONObject2, "json", parsingEnvironment, "env", jSONObject2, str2);
                if (m17742d == null) {
                    m17742d = null;
                }
                return (JSONObject) m17742d;
            }
        };
        f40975y = new Function3<String, JSONObject, ParsingEnvironment, Expression<Uri>>() { // from class: com.yandex.div2.DivVisibilityActionTemplate$Companion$REFERER_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Uri> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17329u(jSONObject2, str2, ParsingConvertersKt.f33828b, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33852e);
            }
        };
        f40976z = new Function3<String, JSONObject, ParsingEnvironment, Expression<Uri>>() { // from class: com.yandex.div2.DivVisibilityActionTemplate$Companion$URL_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Uri> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17329u(jSONObject2, str2, ParsingConvertersKt.f33828b, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33852e);
            }
        };
        f40956A = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivVisibilityActionTemplate$Companion$VISIBILITY_DURATION_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivVisibilityActionTemplate.f40968r;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivVisibilityActionTemplate.f40961k;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        f40957B = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivVisibilityActionTemplate$Companion$VISIBILITY_PERCENTAGE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivVisibilityActionTemplate.f40970t;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivVisibilityActionTemplate.f40962l;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        f40958C = new Function2<ParsingEnvironment, JSONObject, DivVisibilityActionTemplate>() { // from class: com.yandex.div2.DivVisibilityActionTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivVisibilityActionTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivVisibilityActionTemplate(env, null, false, it, 6);
            }
        };
    }

    public DivVisibilityActionTemplate(ParsingEnvironment parsingEnvironment, DivVisibilityActionTemplate divVisibilityActionTemplate, boolean z, JSONObject jSONObject, int i2) {
        boolean z2 = (i2 & 4) != 0 ? false : z;
        ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
        DivDownloadCallbacksTemplate.Companion companion = DivDownloadCallbacksTemplate.f35590c;
        this.f40977a = JsonTemplateParser.m17354o(jSONObject, "download_callbacks", z2, null, DivDownloadCallbacksTemplate.f35593f, f34328a, parsingEnvironment);
        this.f40978b = JsonTemplateParser.m17341b(jSONObject, "log_id", z2, null, f40963m, f34328a, parsingEnvironment);
        Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
        ValueValidator<Long> valueValidator = f40965o;
        TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
        this.f40979c = JsonTemplateParser.m17357r(jSONObject, "log_limit", z2, null, function1, valueValidator, f34328a, parsingEnvironment, typeHelper);
        this.f40980d = JsonTemplateParser.m17352m(jSONObject, "payload", z2, null, f34328a, parsingEnvironment);
        Function1<String, Uri> function12 = ParsingConvertersKt.f33828b;
        TypeHelper<Uri> typeHelper2 = TypeHelpersKt.f33852e;
        this.f40981e = JsonTemplateParser.m17358s(jSONObject, "referer", z2, null, function12, f34328a, parsingEnvironment, typeHelper2);
        this.f40982f = JsonTemplateParser.m17358s(jSONObject, "url", z2, null, function12, f34328a, parsingEnvironment, typeHelper2);
        this.f40983g = JsonTemplateParser.m17357r(jSONObject, "visibility_duration", z2, null, function1, f40967q, f34328a, parsingEnvironment, typeHelper);
        this.f40984h = JsonTemplateParser.m17357r(jSONObject, "visibility_percentage", z2, null, function1, f40969s, f34328a, parsingEnvironment, typeHelper);
    }

    @Override // com.yandex.div.json.JsonTemplate
    /* renamed from: a */
    public DivVisibilityAction mo17514a(ParsingEnvironment env, JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        DivDownloadCallbacks divDownloadCallbacks = (DivDownloadCallbacks) FieldKt.m17381g(this.f40977a, env, "download_callbacks", data, f40971u);
        String str = (String) FieldKt.m17376b(this.f40978b, env, "log_id", data, f40972v);
        Expression<Long> expression = (Expression) FieldKt.m17378d(this.f40979c, env, "log_limit", data, f40973w);
        if (expression == null) {
            expression = f40960j;
        }
        Expression<Long> expression2 = expression;
        JSONObject jSONObject = (JSONObject) FieldKt.m17378d(this.f40980d, env, "payload", data, f40974x);
        Expression expression3 = (Expression) FieldKt.m17378d(this.f40981e, env, "referer", data, f40975y);
        Expression expression4 = (Expression) FieldKt.m17378d(this.f40982f, env, "url", data, f40976z);
        Expression<Long> expression5 = (Expression) FieldKt.m17378d(this.f40983g, env, "visibility_duration", data, f40956A);
        if (expression5 == null) {
            expression5 = f40961k;
        }
        Expression<Long> expression6 = expression5;
        Expression<Long> expression7 = (Expression) FieldKt.m17378d(this.f40984h, env, "visibility_percentage", data, f40957B);
        if (expression7 == null) {
            expression7 = f40962l;
        }
        return new DivVisibilityAction(divDownloadCallbacks, str, expression2, jSONObject, expression3, expression4, expression6, expression7);
    }
}
