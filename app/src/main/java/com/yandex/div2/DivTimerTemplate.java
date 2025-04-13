package com.yandex.div2;

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
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivActionTemplate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTimerTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivTimerTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivTimer;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivTimerTemplate implements JSONSerializable, JsonTemplate<DivTimer> {

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f40479a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f40480b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<String> f40481c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f40482d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f40483e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final Field<String> f40484f;

    /* renamed from: g */
    @NotNull
    public static final Companion f40459g = new Companion(null);

    /* renamed from: h */
    @NotNull
    public static final Expression<Long> f40460h = Expression.f34334a.m17539a(0L);

    /* renamed from: i */
    @NotNull
    public static final ValueValidator<Long> f40461i = C3060n0.f41777n;

    /* renamed from: j */
    @NotNull
    public static final ValueValidator<Long> f40462j = C3060n0.f41780q;

    /* renamed from: k */
    @NotNull
    public static final ListValidator<DivAction> f40463k = C3062o0.f41823d;

    /* renamed from: l */
    @NotNull
    public static final ListValidator<DivActionTemplate> f40464l = C3062o0.f41824e;

    /* renamed from: m */
    @NotNull
    public static final ValueValidator<String> f40465m = C3060n0.f41781r;

    /* renamed from: n */
    @NotNull
    public static final ValueValidator<String> f40466n = C3060n0.f41782s;

    /* renamed from: o */
    @NotNull
    public static final ListValidator<DivAction> f40467o = C3062o0.f41825f;

    /* renamed from: p */
    @NotNull
    public static final ListValidator<DivActionTemplate> f40468p = C3062o0.f41826g;

    /* renamed from: q */
    @NotNull
    public static final ValueValidator<Long> f40469q = C3060n0.f41783t;

    /* renamed from: r */
    @NotNull
    public static final ValueValidator<Long> f40470r = C3060n0.f41784u;

    /* renamed from: s */
    @NotNull
    public static final ValueValidator<String> f40471s = C3060n0.f41778o;

    /* renamed from: t */
    @NotNull
    public static final ValueValidator<String> f40472t = C3060n0.f41779p;

    /* renamed from: u */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f40473u = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivTimerTemplate$Companion$DURATION_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
            ValueValidator<Long> valueValidator = DivTimerTemplate.f40462j;
            ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
            Expression<Long> expression = DivTimerTemplate.f40460h;
            Expression<Long> m17328t = JsonParser.m17328t(jSONObject2, str2, function1, valueValidator, f34328a, expression, TypeHelpersKt.f33849b);
            return m17328t == null ? expression : m17328t;
        }
    };

    /* renamed from: v */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f40474v = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivTimerTemplate$Companion$END_ACTIONS_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            DivAction.Companion companion = DivAction.f34546g;
            return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivTimerTemplate.f40463k, parsingEnvironment2.getF34328a(), parsingEnvironment2);
        }
    };

    /* renamed from: w */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f40475w = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivTimerTemplate$Companion$ID_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            return (String) JsonParser.m17311c(jSONObject2, str2, DivTimerTemplate.f40466n, parsingEnvironment2.getF34328a(), parsingEnvironment2);
        }
    };

    /* renamed from: x */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f40476x = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivTimerTemplate$Companion$TICK_ACTIONS_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            DivAction.Companion companion = DivAction.f34546g;
            return JsonParser.m17333y(jSONObject2, str2, DivAction.f34550k, DivTimerTemplate.f40467o, parsingEnvironment2.getF34328a(), parsingEnvironment2);
        }
    };

    /* renamed from: y */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f40477y = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivTimerTemplate$Companion$TICK_INTERVAL_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            return JsonParser.m17327s(jSONObject2, str2, ParsingConvertersKt.f33831e, DivTimerTemplate.f40470r, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
        }
    };

    /* renamed from: z */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f40478z = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivTimerTemplate$Companion$VALUE_VARIABLE_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            return (String) JsonParser.m17323o(jSONObject2, str2, DivTimerTemplate.f40472t, parsingEnvironment2.getF34328a(), parsingEnvironment2);
        }
    };

    /* renamed from: A */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivTimerTemplate> f40458A = new Function2<ParsingEnvironment, JSONObject, DivTimerTemplate>() { // from class: com.yandex.div2.DivTimerTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivTimerTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            return new DivTimerTemplate(env, null, false, it, 6);
        }
    };

    /* compiled from: DivTimerTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\bR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\b¨\u0006\u0019"}, m31884d2 = {"Lcom/yandex/div2/DivTimerTemplate$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "DURATION_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "DURATION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "DURATION_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivActionTemplate;", "END_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAction;", "END_ACTIONS_VALIDATOR", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "TICK_ACTIONS_TEMPLATE_VALIDATOR", "TICK_ACTIONS_VALIDATOR", "TICK_INTERVAL_TEMPLATE_VALIDATOR", "TICK_INTERVAL_VALIDATOR", "VALUE_VARIABLE_TEMPLATE_VALIDATOR", "VALUE_VARIABLE_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public DivTimerTemplate(ParsingEnvironment parsingEnvironment, DivTimerTemplate divTimerTemplate, boolean z, JSONObject jSONObject, int i2) {
        z = (i2 & 4) != 0 ? false : z;
        ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
        Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
        ValueValidator<Long> valueValidator = f40461i;
        TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
        this.f40479a = JsonTemplateParser.m17357r(jSONObject, "duration", z, null, function1, valueValidator, f34328a, parsingEnvironment, typeHelper);
        DivActionTemplate.Companion companion = DivActionTemplate.f34572i;
        Function2<ParsingEnvironment, JSONObject, DivActionTemplate> function2 = DivActionTemplate.f34586w;
        this.f40480b = JsonTemplateParser.m17360u(jSONObject, "end_actions", z, null, function2, f40464l, f34328a, parsingEnvironment);
        this.f40481c = JsonTemplateParser.m17341b(jSONObject, "id", z, null, f40465m, f34328a, parsingEnvironment);
        this.f40482d = JsonTemplateParser.m17360u(jSONObject, "tick_actions", z, null, function2, f40468p, f34328a, parsingEnvironment);
        this.f40483e = JsonTemplateParser.m17357r(jSONObject, "tick_interval", z, null, function1, f40469q, f34328a, parsingEnvironment, typeHelper);
        this.f40484f = JsonTemplateParser.m17351l(jSONObject, "value_variable", z, null, f40471s, f34328a, parsingEnvironment);
    }

    @Override // com.yandex.div.json.JsonTemplate
    /* renamed from: a */
    public DivTimer mo17514a(ParsingEnvironment env, JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        Expression<Long> expression = (Expression) FieldKt.m17378d(this.f40479a, env, "duration", data, f40473u);
        if (expression == null) {
            expression = f40460h;
        }
        return new DivTimer(expression, FieldKt.m17382h(this.f40480b, env, "end_actions", data, f40463k, f40474v), (String) FieldKt.m17376b(this.f40481c, env, "id", data, f40475w), FieldKt.m17382h(this.f40482d, env, "tick_actions", data, f40467o, f40476x), (Expression) FieldKt.m17378d(this.f40483e, env, "tick_interval", data, f40477y), (String) FieldKt.m17378d(this.f40484f, env, "value_variable", data, f40478z));
    }
}
