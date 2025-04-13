package com.yandex.div2;

import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivRadialGradientRelativeRadius;
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

/* compiled from: DivRadialGradientRelativeRadiusTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivRadialGradientRelativeRadiusTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivRadialGradientRelativeRadius;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivRadialGradientRelativeRadiusTemplate implements JSONSerializable, JsonTemplate<DivRadialGradientRelativeRadius> {

    /* renamed from: b */
    @NotNull
    public static final TypeHelper<DivRadialGradientRelativeRadius.Value> f38148b;

    /* renamed from: c */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivRadialGradientRelativeRadius.Value>> f38149c;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<Expression<DivRadialGradientRelativeRadius.Value>> f38150a;

    /* compiled from: DivRadialGradientRelativeRadiusTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m31884d2 = {"Lcom/yandex/div2/DivRadialGradientRelativeRadiusTemplate$Companion;", "", "", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivRadialGradientRelativeRadius$Value;", "TYPE_HELPER_VALUE", "Lcom/yandex/div/internal/parser/TypeHelper;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    static {
        int i2 = TypeHelper.f33843a;
        f38148b = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(DivRadialGradientRelativeRadius.Value.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivRadialGradientRelativeRadiusTemplate$Companion$TYPE_HELPER_VALUE$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivRadialGradientRelativeRadius.Value);
            }
        });
        DivRadialGradientRelativeRadiusTemplate$Companion$TYPE_READER$1 divRadialGradientRelativeRadiusTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivRadialGradientRelativeRadiusTemplate$Companion$TYPE_READER$1
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
        f38149c = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivRadialGradientRelativeRadius.Value>>() { // from class: com.yandex.div2.DivRadialGradientRelativeRadiusTemplate$Companion$VALUE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<DivRadialGradientRelativeRadius.Value> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                DivRadialGradientRelativeRadius.Value.Converter converter = DivRadialGradientRelativeRadius.Value.f38139c;
                return JsonParser.m17317i(jSONObject2, str2, DivRadialGradientRelativeRadius.Value.f38140d, parsingEnvironment2.getF34328a(), parsingEnvironment2, DivRadialGradientRelativeRadiusTemplate.f38148b);
            }
        };
        DivRadialGradientRelativeRadiusTemplate$Companion$CREATOR$1 divRadialGradientRelativeRadiusTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivRadialGradientRelativeRadiusTemplate>() { // from class: com.yandex.div2.DivRadialGradientRelativeRadiusTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivRadialGradientRelativeRadiusTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivRadialGradientRelativeRadiusTemplate(env, null, false, it);
            }
        };
    }

    public DivRadialGradientRelativeRadiusTemplate(@NotNull ParsingEnvironment env, @Nullable DivRadialGradientRelativeRadiusTemplate divRadialGradientRelativeRadiusTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        Field<Expression<DivRadialGradientRelativeRadius.Value>> field = divRadialGradientRelativeRadiusTemplate == null ? null : divRadialGradientRelativeRadiusTemplate.f38150a;
        DivRadialGradientRelativeRadius.Value.Converter converter = DivRadialGradientRelativeRadius.Value.f38139c;
        this.f38150a = JsonTemplateParser.m17349j(json, "value", z, field, DivRadialGradientRelativeRadius.Value.f38140d, f34328a, env, f38148b);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivRadialGradientRelativeRadius mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        return new DivRadialGradientRelativeRadius((Expression) FieldKt.m17376b(this.f38150a, env, "value", data, f38149c));
    }
}
