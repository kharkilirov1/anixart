package com.yandex.div2;

import com.yandex.div.internal.C2900a;
import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: BoolVariableTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/BoolVariableTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/BoolVariable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class BoolVariableTemplate implements JSONSerializable, JsonTemplate<BoolVariable> {

    /* renamed from: c */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f34386c = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.BoolVariableTemplate$Companion$NAME_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            Function3<String, JSONObject, ParsingEnvironment, String> function3 = BoolVariableTemplate.f34386c;
            return (String) JsonParser.m17311c(jSONObject2, str2, C2900a.f33722f, parsingEnvironment2.getF34328a(), parsingEnvironment2);
        }
    };

    /* renamed from: d */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Boolean> f34387d;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<String> f34388a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Boolean> f34389b;

    /* compiled from: BoolVariableTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m31884d2 = {"Lcom/yandex/div2/BoolVariableTemplate$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "NAME_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "NAME_VALIDATOR", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    static {
        BoolVariableTemplate$Companion$TYPE_READER$1 boolVariableTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.BoolVariableTemplate$Companion$TYPE_READER$1
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
        f34387d = new Function3<String, JSONObject, ParsingEnvironment, Boolean>() { // from class: com.yandex.div2.BoolVariableTemplate$Companion$VALUE_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Boolean mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                Function1<Object, Boolean> function1 = ParsingConvertersKt.f33829c;
                parsingEnvironment2.getF34328a();
                return (Boolean) JsonParser.m17312d(jSONObject2, str2, function1, C2904b.f33858e);
            }
        };
        BoolVariableTemplate$Companion$CREATOR$1 boolVariableTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, BoolVariableTemplate>() { // from class: com.yandex.div2.BoolVariableTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public BoolVariableTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new BoolVariableTemplate(env, null, false, it);
            }
        };
    }

    public BoolVariableTemplate(@NotNull ParsingEnvironment env, @Nullable BoolVariableTemplate boolVariableTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        this.f34388a = JsonTemplateParser.m17341b(json, "name", z, boolVariableTemplate == null ? null : boolVariableTemplate.f34388a, C2900a.f33721e, f34328a, env);
        this.f34389b = JsonTemplateParser.m17344e(json, "value", z, boolVariableTemplate == null ? null : boolVariableTemplate.f34389b, ParsingConvertersKt.f33829c, f34328a, env);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public BoolVariable mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        return new BoolVariable((String) FieldKt.m17376b(this.f34388a, env, "name", data, f34386c), ((Boolean) FieldKt.m17376b(this.f34389b, env, "value", data, f34387d)).booleanValue());
    }
}
