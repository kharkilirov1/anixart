package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAbsoluteEdgeInsets;
import com.yandex.div2.DivAbsoluteEdgeInsetsTemplate;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivNinePatchBackgroundTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivNinePatchBackgroundTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivNinePatchBackground;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivNinePatchBackgroundTemplate implements JSONSerializable, JsonTemplate<DivNinePatchBackground> {

    /* renamed from: c */
    @NotNull
    public static final DivAbsoluteEdgeInsets f37731c = new DivAbsoluteEdgeInsets(null, null, null, null, 15);

    /* renamed from: d */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Uri>> f37732d = new Function3<String, JSONObject, ParsingEnvironment, Expression<Uri>>() { // from class: com.yandex.div2.DivNinePatchBackgroundTemplate$Companion$IMAGE_URL_READER$1
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

    /* renamed from: e */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivAbsoluteEdgeInsets> f37733e = new Function3<String, JSONObject, ParsingEnvironment, DivAbsoluteEdgeInsets>() { // from class: com.yandex.div2.DivNinePatchBackgroundTemplate$Companion$INSETS_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public DivAbsoluteEdgeInsets mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            DivAbsoluteEdgeInsets.Companion companion = DivAbsoluteEdgeInsets.f34437e;
            DivAbsoluteEdgeInsets divAbsoluteEdgeInsets = (DivAbsoluteEdgeInsets) JsonParser.m17322n(jSONObject2, str2, DivAbsoluteEdgeInsets.f34446n, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            return divAbsoluteEdgeInsets == null ? DivNinePatchBackgroundTemplate.f37731c : divAbsoluteEdgeInsets;
        }
    };

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<Expression<Uri>> f37734a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<DivAbsoluteEdgeInsetsTemplate> f37735b;

    /* compiled from: DivNinePatchBackgroundTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31884d2 = {"Lcom/yandex/div2/DivNinePatchBackgroundTemplate$Companion;", "", "Lcom/yandex/div2/DivAbsoluteEdgeInsets;", "INSETS_DEFAULT_VALUE", "Lcom/yandex/div2/DivAbsoluteEdgeInsets;", "", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    static {
        DivNinePatchBackgroundTemplate$Companion$TYPE_READER$1 divNinePatchBackgroundTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivNinePatchBackgroundTemplate$Companion$TYPE_READER$1
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
        DivNinePatchBackgroundTemplate$Companion$CREATOR$1 divNinePatchBackgroundTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivNinePatchBackgroundTemplate>() { // from class: com.yandex.div2.DivNinePatchBackgroundTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivNinePatchBackgroundTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivNinePatchBackgroundTemplate(env, null, false, it);
            }
        };
    }

    public DivNinePatchBackgroundTemplate(@NotNull ParsingEnvironment env, @Nullable DivNinePatchBackgroundTemplate divNinePatchBackgroundTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        this.f37734a = JsonTemplateParser.m17349j(json, "image_url", z, divNinePatchBackgroundTemplate == null ? null : divNinePatchBackgroundTemplate.f37734a, ParsingConvertersKt.f33828b, f34328a, env, TypeHelpersKt.f33852e);
        Field<DivAbsoluteEdgeInsetsTemplate> field = divNinePatchBackgroundTemplate == null ? null : divNinePatchBackgroundTemplate.f37735b;
        DivAbsoluteEdgeInsetsTemplate.Companion companion = DivAbsoluteEdgeInsetsTemplate.f34452e;
        this.f37735b = JsonTemplateParser.m17354o(json, "insets", z, field, DivAbsoluteEdgeInsetsTemplate.f34469v, f34328a, env);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivNinePatchBackground mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        Expression expression = (Expression) FieldKt.m17376b(this.f37734a, env, "image_url", data, f37732d);
        DivAbsoluteEdgeInsets divAbsoluteEdgeInsets = (DivAbsoluteEdgeInsets) FieldKt.m17383i(this.f37735b, env, "insets", data, f37733e);
        if (divAbsoluteEdgeInsets == null) {
            divAbsoluteEdgeInsets = f37731c;
        }
        return new DivNinePatchBackground(expression, divAbsoluteEdgeInsets);
    }
}
