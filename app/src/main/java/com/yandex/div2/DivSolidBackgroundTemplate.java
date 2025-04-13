package com.yandex.div2;

import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.Expression;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivSolidBackgroundTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivSolidBackgroundTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivSolidBackground;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivSolidBackgroundTemplate implements JSONSerializable, JsonTemplate<DivSolidBackground> {

    /* renamed from: b */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>> f39188b = new Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>>() { // from class: com.yandex.div2.DivSolidBackgroundTemplate$Companion$COLOR_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public Expression<Integer> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            return JsonParser.m17317i(jSONObject2, str2, ParsingConvertersKt.f33827a, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33853f);
        }
    };

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<Expression<Integer>> f39189a;

    /* compiled from: DivSolidBackgroundTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivSolidBackgroundTemplate$Companion;", "", "", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    static {
        DivSolidBackgroundTemplate$Companion$TYPE_READER$1 divSolidBackgroundTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivSolidBackgroundTemplate$Companion$TYPE_READER$1
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
        DivSolidBackgroundTemplate$Companion$CREATOR$1 divSolidBackgroundTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivSolidBackgroundTemplate>() { // from class: com.yandex.div2.DivSolidBackgroundTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivSolidBackgroundTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivSolidBackgroundTemplate(env, null, false, it);
            }
        };
    }

    public DivSolidBackgroundTemplate(@NotNull ParsingEnvironment env, @Nullable DivSolidBackgroundTemplate divSolidBackgroundTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        this.f39189a = JsonTemplateParser.m17349j(json, "color", z, divSolidBackgroundTemplate == null ? null : divSolidBackgroundTemplate.f39189a, ParsingConvertersKt.f33827a, env.getF34328a(), env, TypeHelpersKt.f33853f);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivSolidBackground mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        return new DivSolidBackground((Expression) FieldKt.m17376b(this.f39189a, env, "color", data, f39188b));
    }
}
