package com.yandex.div2;

import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivAppearanceTransitionTemplate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivAppearanceSetTransitionTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivAppearanceSetTransitionTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivAppearanceSetTransition;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivAppearanceSetTransitionTemplate implements JSONSerializable, JsonTemplate<DivAppearanceSetTransition> {

    /* renamed from: b */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAppearanceTransition>> f34721b = new Function3<String, JSONObject, ParsingEnvironment, List<DivAppearanceTransition>>() { // from class: com.yandex.div2.DivAppearanceSetTransitionTemplate$Companion$ITEMS_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public List<DivAppearanceTransition> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            DivAppearanceTransition.Companion companion = DivAppearanceTransition.f34726a;
            Function2<ParsingEnvironment, JSONObject, DivAppearanceTransition> function2 = DivAppearanceTransition.f34727b;
            Function3<String, JSONObject, ParsingEnvironment, List<DivAppearanceTransition>> function3 = DivAppearanceSetTransitionTemplate.f34721b;
            List<DivAppearanceTransition> m17321m = JsonParser.m17321m(jSONObject2, str2, function2, C3037c.f41167l, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            Intrinsics.m32178g(m17321m, "readList(json, key, DivA…LIDATOR, env.logger, env)");
            return m17321m;
        }
    };

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<List<DivAppearanceTransitionTemplate>> f34722a;

    /* compiled from: DivAppearanceSetTransitionTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m31884d2 = {"Lcom/yandex/div2/DivAppearanceSetTransitionTemplate$Companion;", "", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAppearanceTransitionTemplate;", "ITEMS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAppearanceTransition;", "ITEMS_VALIDATOR", "", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    static {
        DivAppearanceSetTransitionTemplate$Companion$TYPE_READER$1 divAppearanceSetTransitionTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivAppearanceSetTransitionTemplate$Companion$TYPE_READER$1
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
        DivAppearanceSetTransitionTemplate$Companion$CREATOR$1 divAppearanceSetTransitionTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivAppearanceSetTransitionTemplate>() { // from class: com.yandex.div2.DivAppearanceSetTransitionTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivAppearanceSetTransitionTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivAppearanceSetTransitionTemplate(env, null, false, it);
            }
        };
    }

    public DivAppearanceSetTransitionTemplate(@NotNull ParsingEnvironment env, @Nullable DivAppearanceSetTransitionTemplate divAppearanceSetTransitionTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        Field<List<DivAppearanceTransitionTemplate>> field = divAppearanceSetTransitionTemplate == null ? null : divAppearanceSetTransitionTemplate.f34722a;
        DivAppearanceTransitionTemplate.Companion companion = DivAppearanceTransitionTemplate.f34733a;
        this.f34722a = JsonTemplateParser.m17350k(json, "items", z, field, DivAppearanceTransitionTemplate.f34734b, C3037c.f41168m, f34328a, env);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivAppearanceSetTransition mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        return new DivAppearanceSetTransition(FieldKt.m17384j(this.f34722a, env, "items", data, C3037c.f41167l, f34721b));
    }
}
