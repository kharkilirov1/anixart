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
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivFixedSizeTemplate;
import com.yandex.div2.DivStroke;
import com.yandex.div2.DivStrokeTemplate;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivCircleShapeTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivCircleShapeTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivCircleShape;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivCircleShapeTemplate implements JSONSerializable, JsonTemplate<DivCircleShape> {

    /* renamed from: d */
    @NotNull
    public static final DivFixedSize f34872d = new DivFixedSize(null, Expression.f34334a.m17539a(10L), 1);

    /* renamed from: e */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>> f34873e = new Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>>() { // from class: com.yandex.div2.DivCircleShapeTemplate$Companion$BACKGROUND_COLOR_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public Expression<Integer> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            return JsonParser.m17329u(jSONObject2, str2, ParsingConvertersKt.f33827a, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33853f);
        }
    };

    /* renamed from: f */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivFixedSize> f34874f = new Function3<String, JSONObject, ParsingEnvironment, DivFixedSize>() { // from class: com.yandex.div2.DivCircleShapeTemplate$Companion$RADIUS_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public DivFixedSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            DivFixedSize.Companion companion = DivFixedSize.f35789c;
            DivFixedSize divFixedSize = (DivFixedSize) JsonParser.m17322n(jSONObject2, str2, DivFixedSize.f35793g, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            return divFixedSize == null ? DivCircleShapeTemplate.f34872d : divFixedSize;
        }
    };

    /* renamed from: g */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivStroke> f34875g = new Function3<String, JSONObject, ParsingEnvironment, DivStroke>() { // from class: com.yandex.div2.DivCircleShapeTemplate$Companion$STROKE_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public DivStroke mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            DivStroke.Companion companion = DivStroke.f39434d;
            return (DivStroke) JsonParser.m17322n(jSONObject2, str2, DivStroke.f39439i, parsingEnvironment2.getF34328a(), parsingEnvironment2);
        }
    };

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<Expression<Integer>> f34876a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<DivFixedSizeTemplate> f34877b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<DivStrokeTemplate> f34878c;

    /* compiled from: DivCircleShapeTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31884d2 = {"Lcom/yandex/div2/DivCircleShapeTemplate$Companion;", "", "Lcom/yandex/div2/DivFixedSize;", "RADIUS_DEFAULT_VALUE", "Lcom/yandex/div2/DivFixedSize;", "", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    static {
        DivCircleShapeTemplate$Companion$TYPE_READER$1 divCircleShapeTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivCircleShapeTemplate$Companion$TYPE_READER$1
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
        DivCircleShapeTemplate$Companion$CREATOR$1 divCircleShapeTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivCircleShapeTemplate>() { // from class: com.yandex.div2.DivCircleShapeTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivCircleShapeTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivCircleShapeTemplate(env, null, false, it);
            }
        };
    }

    public DivCircleShapeTemplate(@NotNull ParsingEnvironment env, @Nullable DivCircleShapeTemplate divCircleShapeTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        this.f34876a = JsonTemplateParser.m17358s(json, "background_color", z, divCircleShapeTemplate == null ? null : divCircleShapeTemplate.f34876a, ParsingConvertersKt.f33827a, f34328a, env, TypeHelpersKt.f33853f);
        Field<DivFixedSizeTemplate> field = divCircleShapeTemplate == null ? null : divCircleShapeTemplate.f34877b;
        DivFixedSizeTemplate.Companion companion = DivFixedSizeTemplate.f35798c;
        this.f34877b = JsonTemplateParser.m17354o(json, "radius", z, field, DivFixedSizeTemplate.f35805j, f34328a, env);
        Field<DivStrokeTemplate> field2 = divCircleShapeTemplate == null ? null : divCircleShapeTemplate.f34878c;
        DivStrokeTemplate.Companion companion2 = DivStrokeTemplate.f39445d;
        this.f34878c = JsonTemplateParser.m17354o(json, "stroke", z, field2, DivStrokeTemplate.f39454m, f34328a, env);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivCircleShape mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        Expression expression = (Expression) FieldKt.m17378d(this.f34876a, env, "background_color", data, f34873e);
        DivFixedSize divFixedSize = (DivFixedSize) FieldKt.m17381g(this.f34877b, env, "radius", data, f34874f);
        if (divFixedSize == null) {
            divFixedSize = f34872d;
        }
        return new DivCircleShape(expression, divFixedSize, (DivStroke) FieldKt.m17381g(this.f34878c, env, "stroke", data, f34875g));
    }
}
