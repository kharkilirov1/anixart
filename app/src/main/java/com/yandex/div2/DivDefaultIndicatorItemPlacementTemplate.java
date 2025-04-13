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
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivFixedSizeTemplate;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivDefaultIndicatorItemPlacementTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivDefaultIndicatorItemPlacementTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivDefaultIndicatorItemPlacement;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivDefaultIndicatorItemPlacementTemplate implements JSONSerializable, JsonTemplate<DivDefaultIndicatorItemPlacement> {

    /* renamed from: b */
    @NotNull
    public static final DivFixedSize f35511b = new DivFixedSize(null, Expression.f34334a.m17539a(15L), 1);

    /* renamed from: c */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivFixedSize> f35512c = new Function3<String, JSONObject, ParsingEnvironment, DivFixedSize>() { // from class: com.yandex.div2.DivDefaultIndicatorItemPlacementTemplate$Companion$SPACE_BETWEEN_CENTERS_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public DivFixedSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            DivFixedSize.Companion companion = DivFixedSize.f35789c;
            DivFixedSize divFixedSize = (DivFixedSize) JsonParser.m17322n(jSONObject2, str2, DivFixedSize.f35793g, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            return divFixedSize == null ? DivDefaultIndicatorItemPlacementTemplate.f35511b : divFixedSize;
        }
    };

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<DivFixedSizeTemplate> f35513a;

    /* compiled from: DivDefaultIndicatorItemPlacementTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31884d2 = {"Lcom/yandex/div2/DivDefaultIndicatorItemPlacementTemplate$Companion;", "", "Lcom/yandex/div2/DivFixedSize;", "SPACE_BETWEEN_CENTERS_DEFAULT_VALUE", "Lcom/yandex/div2/DivFixedSize;", "", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    static {
        DivDefaultIndicatorItemPlacementTemplate$Companion$TYPE_READER$1 divDefaultIndicatorItemPlacementTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivDefaultIndicatorItemPlacementTemplate$Companion$TYPE_READER$1
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
        DivDefaultIndicatorItemPlacementTemplate$Companion$CREATOR$1 divDefaultIndicatorItemPlacementTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivDefaultIndicatorItemPlacementTemplate>() { // from class: com.yandex.div2.DivDefaultIndicatorItemPlacementTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivDefaultIndicatorItemPlacementTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivDefaultIndicatorItemPlacementTemplate(env, null, false, it);
            }
        };
    }

    public DivDefaultIndicatorItemPlacementTemplate(@NotNull ParsingEnvironment env, @Nullable DivDefaultIndicatorItemPlacementTemplate divDefaultIndicatorItemPlacementTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        Field<DivFixedSizeTemplate> field = divDefaultIndicatorItemPlacementTemplate == null ? null : divDefaultIndicatorItemPlacementTemplate.f35513a;
        DivFixedSizeTemplate.Companion companion = DivFixedSizeTemplate.f35798c;
        this.f35513a = JsonTemplateParser.m17354o(json, "space_between_centers", z, field, DivFixedSizeTemplate.f35805j, f34328a, env);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivDefaultIndicatorItemPlacement mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        DivFixedSize divFixedSize = (DivFixedSize) FieldKt.m17381g(this.f35513a, env, "space_between_centers", data, f35512c);
        if (divFixedSize == null) {
            divFixedSize = f35511b;
        }
        return new DivDefaultIndicatorItemPlacement(divFixedSize);
    }
}
