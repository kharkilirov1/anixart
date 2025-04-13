package com.yandex.div2;

import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivActionTemplate;
import com.yandex.div2.DivTrigger;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTriggerTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivTriggerTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivTrigger;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivTriggerTemplate implements JSONSerializable, JsonTemplate<DivTrigger> {

    /* renamed from: d */
    @NotNull
    public static final Companion f40607d = new Companion(null);

    /* renamed from: e */
    @NotNull
    public static final Expression<DivTrigger.Mode> f40608e = Expression.f34334a.m17539a(DivTrigger.Mode.ON_CONDITION);

    /* renamed from: f */
    @NotNull
    public static final TypeHelper<DivTrigger.Mode> f40609f;

    /* renamed from: g */
    @NotNull
    public static final ListValidator<DivAction> f40610g;

    /* renamed from: h */
    @NotNull
    public static final ListValidator<DivActionTemplate> f40611h;

    /* renamed from: i */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f40612i;

    /* renamed from: j */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>> f40613j;

    /* renamed from: k */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivTrigger.Mode>> f40614k;

    /* renamed from: l */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivTriggerTemplate> f40615l;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f40616a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Expression<Boolean>> f40617b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<Expression<DivTrigger.Mode>> f40618c;

    /* compiled from: DivTriggerTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31884d2 = {"Lcom/yandex/div2/DivTriggerTemplate$Companion;", "", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivActionTemplate;", "ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAction;", "ACTIONS_VALIDATOR", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div2/DivTrigger$Mode;", "MODE_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_MODE", "Lcom/yandex/div/internal/parser/TypeHelper;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        int i2 = TypeHelper.f33843a;
        f40609f = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(DivTrigger.Mode.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivTriggerTemplate$Companion$TYPE_HELPER_MODE$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivTrigger.Mode);
            }
        });
        f40610g = C3062o0.f41828i;
        f40611h = C3062o0.f41829j;
        f40612i = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivTriggerTemplate$Companion$ACTIONS_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivAction.Companion companion = DivAction.f34546g;
                List<DivAction> m17321m = JsonParser.m17321m(jSONObject2, str2, DivAction.f34550k, DivTriggerTemplate.f40610g, parsingEnvironment2.getF34328a(), parsingEnvironment2);
                Intrinsics.m32178g(m17321m, "readList(json, key, DivA…LIDATOR, env.logger, env)");
                return m17321m;
            }
        };
        f40613j = new Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>>() { // from class: com.yandex.div2.DivTriggerTemplate$Companion$CONDITION_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Boolean> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17317i(jSONObject2, str2, ParsingConvertersKt.f33829c, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33848a);
            }
        };
        f40614k = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivTrigger.Mode>>() { // from class: com.yandex.div2.DivTriggerTemplate$Companion$MODE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivTrigger.Mode> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivTrigger.Mode.Converter converter = DivTrigger.Mode.f40600c;
                Function1<String, DivTrigger.Mode> function1 = DivTrigger.Mode.f40601d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivTrigger.Mode> expression = DivTriggerTemplate.f40608e;
                Expression<DivTrigger.Mode> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivTriggerTemplate.f40609f);
                return m17330v == null ? expression : m17330v;
            }
        };
        f40615l = new Function2<ParsingEnvironment, JSONObject, DivTriggerTemplate>() { // from class: com.yandex.div2.DivTriggerTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivTriggerTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivTriggerTemplate(env, null, false, it, 6);
            }
        };
    }

    public DivTriggerTemplate(ParsingEnvironment parsingEnvironment, DivTriggerTemplate divTriggerTemplate, boolean z, JSONObject jSONObject, int i2) {
        z = (i2 & 4) != 0 ? false : z;
        ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
        DivActionTemplate.Companion companion = DivActionTemplate.f34572i;
        this.f40616a = JsonTemplateParser.m17350k(jSONObject, "actions", z, null, DivActionTemplate.f34586w, f40611h, f34328a, parsingEnvironment);
        this.f40617b = JsonTemplateParser.m17349j(jSONObject, "condition", z, null, ParsingConvertersKt.f33829c, f34328a, parsingEnvironment, TypeHelpersKt.f33848a);
        DivTrigger.Mode.Converter converter = DivTrigger.Mode.f40600c;
        this.f40618c = JsonTemplateParser.m17358s(jSONObject, "mode", z, null, DivTrigger.Mode.f40601d, f34328a, parsingEnvironment, f40609f);
    }

    @Override // com.yandex.div.json.JsonTemplate
    /* renamed from: a */
    public DivTrigger mo17514a(ParsingEnvironment env, JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        List m17384j = FieldKt.m17384j(this.f40616a, env, "actions", data, f40610g, f40612i);
        Expression expression = (Expression) FieldKt.m17376b(this.f40617b, env, "condition", data, f40613j);
        Expression<DivTrigger.Mode> expression2 = (Expression) FieldKt.m17378d(this.f40618c, env, "mode", data, f40614k);
        if (expression2 == null) {
            expression2 = f40608e;
        }
        return new DivTrigger(m17384j, expression, expression2);
    }
}
