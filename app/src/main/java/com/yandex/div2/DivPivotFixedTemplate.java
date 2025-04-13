package com.yandex.div2;

import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
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
import com.yandex.div2.DivSizeUnit;
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

/* compiled from: DivPivotFixedTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivPivotFixedTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivPivotFixed;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivPivotFixedTemplate implements JSONSerializable, JsonTemplate<DivPivotFixed> {

    /* renamed from: c */
    @NotNull
    public static final Expression<DivSizeUnit> f38040c = Expression.f34334a.m17539a(DivSizeUnit.DP);

    /* renamed from: d */
    @NotNull
    public static final TypeHelper<DivSizeUnit> f38041d;

    /* renamed from: e */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivSizeUnit>> f38042e;

    /* renamed from: f */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f38043f;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<Expression<DivSizeUnit>> f38044a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f38045b;

    /* compiled from: DivPivotFixedTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m31884d2 = {"Lcom/yandex/div2/DivPivotFixedTemplate$Companion;", "", "", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivSizeUnit;", "TYPE_HELPER_UNIT", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div/json/expressions/Expression;", "UNIT_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    static {
        int i2 = TypeHelper.f33843a;
        f38041d = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(DivSizeUnit.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivPivotFixedTemplate$Companion$TYPE_HELPER_UNIT$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivSizeUnit);
            }
        });
        DivPivotFixedTemplate$Companion$TYPE_READER$1 divPivotFixedTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivPivotFixedTemplate$Companion$TYPE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                Object m17742d = C3033a.m17742d(str2, "key", jSONObject2, "json", parsingEnvironment, "env", jSONObject2, str2);
                if (m17742d == null) {
                    m17742d = null;
                }
                return (String) m17742d;
            }
        };
        f38042e = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivSizeUnit>>() { // from class: com.yandex.div2.DivPivotFixedTemplate$Companion$UNIT_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivSizeUnit> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivSizeUnit.Converter converter = DivSizeUnit.f38845c;
                Function1<String, DivSizeUnit> function1 = DivSizeUnit.f38846d;
                ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                Expression<DivSizeUnit> expression = DivPivotFixedTemplate.f38040c;
                Expression<DivSizeUnit> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivPivotFixedTemplate.f38041d);
                return m17330v == null ? expression : m17330v;
            }
        };
        f38043f = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivPivotFixedTemplate$Companion$VALUE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17329u(jSONObject2, str2, ParsingConvertersKt.f33831e, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
            }
        };
        DivPivotFixedTemplate$Companion$CREATOR$1 divPivotFixedTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivPivotFixedTemplate>() { // from class: com.yandex.div2.DivPivotFixedTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivPivotFixedTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivPivotFixedTemplate(env, null, false, it);
            }
        };
    }

    public DivPivotFixedTemplate(@NotNull ParsingEnvironment env, @Nullable DivPivotFixedTemplate divPivotFixedTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        Field<Expression<DivSizeUnit>> field = divPivotFixedTemplate == null ? null : divPivotFixedTemplate.f38044a;
        DivSizeUnit.Converter converter = DivSizeUnit.f38845c;
        this.f38044a = JsonTemplateParser.m17358s(json, "unit", z, field, DivSizeUnit.f38846d, f34328a, env, f38041d);
        this.f38045b = JsonTemplateParser.m17358s(json, "value", z, divPivotFixedTemplate == null ? null : divPivotFixedTemplate.f38045b, ParsingConvertersKt.f33831e, f34328a, env, TypeHelpersKt.f33849b);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivPivotFixed mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        Expression<DivSizeUnit> expression = (Expression) FieldKt.m17378d(this.f38044a, env, "unit", data, f38042e);
        if (expression == null) {
            expression = f38040c;
        }
        return new DivPivotFixed(expression, (Expression) FieldKt.m17378d(this.f38045b, env, "value", data, f38043f));
    }
}
