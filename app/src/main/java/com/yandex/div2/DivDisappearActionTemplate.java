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

/* compiled from: DivDisappearActionTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivDisappearActionTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivDisappearAction;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivDisappearActionTemplate implements JSONSerializable, JsonTemplate<DivDisappearAction> {

    /* renamed from: A */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Uri>> f35547A;

    /* renamed from: B */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f35548B;

    /* renamed from: C */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivDisappearActionTemplate> f35549C;

    /* renamed from: i */
    @NotNull
    public static final Companion f35550i = new Companion(null);

    /* renamed from: j */
    @NotNull
    public static final Expression<Long> f35551j;

    /* renamed from: k */
    @NotNull
    public static final Expression<Long> f35552k;

    /* renamed from: l */
    @NotNull
    public static final Expression<Long> f35553l;

    /* renamed from: m */
    @NotNull
    public static final ValueValidator<Long> f35554m;

    /* renamed from: n */
    @NotNull
    public static final ValueValidator<Long> f35555n;

    /* renamed from: o */
    @NotNull
    public static final ValueValidator<String> f35556o;

    /* renamed from: p */
    @NotNull
    public static final ValueValidator<String> f35557p;

    /* renamed from: q */
    @NotNull
    public static final ValueValidator<Long> f35558q;

    /* renamed from: r */
    @NotNull
    public static final ValueValidator<Long> f35559r;

    /* renamed from: s */
    @NotNull
    public static final ValueValidator<Long> f35560s;

    /* renamed from: t */
    @NotNull
    public static final ValueValidator<Long> f35561t;

    /* renamed from: u */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f35562u;

    /* renamed from: v */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivDownloadCallbacks> f35563v;

    /* renamed from: w */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f35564w;

    /* renamed from: x */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f35565x;

    /* renamed from: y */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, JSONObject> f35566y;

    /* renamed from: z */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Uri>> f35567z;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f35568a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<DivDownloadCallbacksTemplate> f35569b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<String> f35570c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f35571d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Field<JSONObject> f35572e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final Field<Expression<Uri>> f35573f;

    /* renamed from: g */
    @JvmField
    @NotNull
    public final Field<Expression<Uri>> f35574g;

    /* renamed from: h */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f35575h;

    /* compiled from: DivDisappearActionTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\b¨\u0006\u0013"}, m31884d2 = {"Lcom/yandex/div2/DivDisappearActionTemplate$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "DISAPPEAR_DURATION_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "DISAPPEAR_DURATION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "DISAPPEAR_DURATION_VALIDATOR", "", "LOG_ID_TEMPLATE_VALIDATOR", "LOG_ID_VALIDATOR", "LOG_LIMIT_DEFAULT_VALUE", "LOG_LIMIT_TEMPLATE_VALIDATOR", "LOG_LIMIT_VALIDATOR", "VISIBILITY_PERCENTAGE_DEFAULT_VALUE", "VISIBILITY_PERCENTAGE_TEMPLATE_VALIDATOR", "VISIBILITY_PERCENTAGE_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f35551j = companion.m17539a(800L);
        f35552k = companion.m17539a(1L);
        f35553l = companion.m17539a(0L);
        f35554m = C3045g.f41387u;
        f35555n = C3045g.f41388v;
        f35556o = C3045g.f41389w;
        f35557p = C3045g.f41390x;
        f35558q = C3045g.f41391y;
        f35559r = C3049i.f41476c;
        f35560s = C3049i.f41477d;
        f35561t = C3049i.f41478e;
        f35562u = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivDisappearActionTemplate$Companion$DISAPPEAR_DURATION_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivDisappearActionTemplate.f35555n;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivDisappearActionTemplate.f35551j;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        f35563v = new Function3<String, JSONObject, ParsingEnvironment, DivDownloadCallbacks>() { // from class: com.yandex.div2.DivDisappearActionTemplate$Companion$DOWNLOAD_CALLBACKS_READER$1
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
        f35564w = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivDisappearActionTemplate$Companion$LOG_ID_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return (String) JsonParser.m17311c(jSONObject2, str2, DivDisappearActionTemplate.f35557p, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            }
        };
        f35565x = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivDisappearActionTemplate$Companion$LOG_LIMIT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivDisappearActionTemplate.f35559r;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivDisappearActionTemplate.f35552k;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        f35566y = new Function3<String, JSONObject, ParsingEnvironment, JSONObject>() { // from class: com.yandex.div2.DivDisappearActionTemplate$Companion$PAYLOAD_READER$1
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
        f35567z = new Function3<String, JSONObject, ParsingEnvironment, Expression<Uri>>() { // from class: com.yandex.div2.DivDisappearActionTemplate$Companion$REFERER_READER$1
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
        f35547A = new Function3<String, JSONObject, ParsingEnvironment, Expression<Uri>>() { // from class: com.yandex.div2.DivDisappearActionTemplate$Companion$URL_READER$1
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
        f35548B = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivDisappearActionTemplate$Companion$VISIBILITY_PERCENTAGE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivDisappearActionTemplate.f35561t;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<Long> expression = DivDisappearActionTemplate.f35553l;
                Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
                return m17328t == null ? expression : m17328t;
            }
        };
        f35549C = new Function2<ParsingEnvironment, JSONObject, DivDisappearActionTemplate>() { // from class: com.yandex.div2.DivDisappearActionTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivDisappearActionTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivDisappearActionTemplate(env, null, false, it, 6);
            }
        };
    }

    public DivDisappearActionTemplate(ParsingEnvironment parsingEnvironment, DivDisappearActionTemplate divDisappearActionTemplate, boolean z, JSONObject jSONObject, int i2) {
        boolean z2 = (i2 & 4) != 0 ? false : z;
        ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
        Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
        ValueValidator<Long> valueValidator = f35554m;
        TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
        this.f35568a = JsonTemplateParser.m17357r(jSONObject, "disappear_duration", z2, null, function1, valueValidator, f34328a, parsingEnvironment, typeHelper);
        DivDownloadCallbacksTemplate.Companion companion = DivDownloadCallbacksTemplate.f35590c;
        this.f35569b = JsonTemplateParser.m17354o(jSONObject, "download_callbacks", z2, null, DivDownloadCallbacksTemplate.f35593f, f34328a, parsingEnvironment);
        this.f35570c = JsonTemplateParser.m17341b(jSONObject, "log_id", z2, null, f35556o, f34328a, parsingEnvironment);
        this.f35571d = JsonTemplateParser.m17357r(jSONObject, "log_limit", z2, null, function1, f35558q, f34328a, parsingEnvironment, typeHelper);
        this.f35572e = JsonTemplateParser.m17352m(jSONObject, "payload", z2, null, f34328a, parsingEnvironment);
        Function1<String, Uri> function12 = ParsingConvertersKt.f33828b;
        TypeHelper<Uri> typeHelper2 = TypeHelpersKt.f33852e;
        this.f35573f = JsonTemplateParser.m17358s(jSONObject, "referer", z2, null, function12, f34328a, parsingEnvironment, typeHelper2);
        this.f35574g = JsonTemplateParser.m17358s(jSONObject, "url", z2, null, function12, f34328a, parsingEnvironment, typeHelper2);
        this.f35575h = JsonTemplateParser.m17357r(jSONObject, "visibility_percentage", z2, null, function1, f35560s, f34328a, parsingEnvironment, typeHelper);
    }

    @Override // com.yandex.div.json.JsonTemplate
    /* renamed from: a */
    public DivDisappearAction mo17514a(ParsingEnvironment env, JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        Expression<Long> expression = (Expression) FieldKt.m17378d(this.f35568a, env, "disappear_duration", data, f35562u);
        if (expression == null) {
            expression = f35551j;
        }
        Expression<Long> expression2 = expression;
        DivDownloadCallbacks divDownloadCallbacks = (DivDownloadCallbacks) FieldKt.m17381g(this.f35569b, env, "download_callbacks", data, f35563v);
        String str = (String) FieldKt.m17376b(this.f35570c, env, "log_id", data, f35564w);
        Expression<Long> expression3 = (Expression) FieldKt.m17378d(this.f35571d, env, "log_limit", data, f35565x);
        if (expression3 == null) {
            expression3 = f35552k;
        }
        Expression<Long> expression4 = expression3;
        JSONObject jSONObject = (JSONObject) FieldKt.m17378d(this.f35572e, env, "payload", data, f35566y);
        Expression expression5 = (Expression) FieldKt.m17378d(this.f35573f, env, "referer", data, f35567z);
        Expression expression6 = (Expression) FieldKt.m17378d(this.f35574g, env, "url", data, f35547A);
        Expression<Long> expression7 = (Expression) FieldKt.m17378d(this.f35575h, env, "visibility_percentage", data, f35548B);
        if (expression7 == null) {
            expression7 = f35553l;
        }
        return new DivDisappearAction(expression2, divDownloadCallbacks, str, expression4, jSONObject, expression5, expression6, expression7);
    }
}
