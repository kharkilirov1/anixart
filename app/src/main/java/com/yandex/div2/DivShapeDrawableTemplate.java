package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
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
import com.yandex.div2.DivShape;
import com.yandex.div2.DivShapeTemplate;
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

/* compiled from: DivShapeDrawableTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivShapeDrawableTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivShapeDrawable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivShapeDrawableTemplate implements JSONSerializable, JsonTemplate<DivShapeDrawable> {

    /* renamed from: d */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>> f38817d = new Function3<String, JSONObject, ParsingEnvironment, Expression<Integer>>() { // from class: com.yandex.div2.DivShapeDrawableTemplate$Companion$COLOR_READER$1
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

    /* renamed from: e */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivShape> f38818e = new Function3<String, JSONObject, ParsingEnvironment, DivShape>() { // from class: com.yandex.div2.DivShapeDrawableTemplate$Companion$SHAPE_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public DivShape mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            DivShape.Companion companion = DivShape.f38807a;
            Function2<ParsingEnvironment, JSONObject, DivShape> function2 = DivShape.f38808b;
            parsingEnvironment2.getF34328a();
            return (DivShape) JsonParser.m17313e(jSONObject2, str2, function2, C2904b.f33858e, parsingEnvironment2);
        }
    };

    /* renamed from: f */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivStroke> f38819f = new Function3<String, JSONObject, ParsingEnvironment, DivStroke>() { // from class: com.yandex.div2.DivShapeDrawableTemplate$Companion$STROKE_READER$1
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
    public final Field<Expression<Integer>> f38820a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<DivShapeTemplate> f38821b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<DivStrokeTemplate> f38822c;

    /* compiled from: DivShapeDrawableTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivShapeDrawableTemplate$Companion;", "", "", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    static {
        DivShapeDrawableTemplate$Companion$TYPE_READER$1 divShapeDrawableTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivShapeDrawableTemplate$Companion$TYPE_READER$1
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
        DivShapeDrawableTemplate$Companion$CREATOR$1 divShapeDrawableTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivShapeDrawableTemplate>() { // from class: com.yandex.div2.DivShapeDrawableTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivShapeDrawableTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivShapeDrawableTemplate(env, null, false, it);
            }
        };
    }

    public DivShapeDrawableTemplate(@NotNull ParsingEnvironment env, @Nullable DivShapeDrawableTemplate divShapeDrawableTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        this.f38820a = JsonTemplateParser.m17349j(json, "color", z, divShapeDrawableTemplate == null ? null : divShapeDrawableTemplate.f38820a, ParsingConvertersKt.f33827a, f34328a, env, TypeHelpersKt.f33853f);
        Field<DivShapeTemplate> field = divShapeDrawableTemplate == null ? null : divShapeDrawableTemplate.f38821b;
        DivShapeTemplate.Companion companion = DivShapeTemplate.f38828a;
        this.f38821b = JsonTemplateParser.m17345f(json, "shape", z, field, DivShapeTemplate.f38829b, f34328a, env);
        Field<DivStrokeTemplate> field2 = divShapeDrawableTemplate == null ? null : divShapeDrawableTemplate.f38822c;
        DivStrokeTemplate.Companion companion2 = DivStrokeTemplate.f39445d;
        this.f38822c = JsonTemplateParser.m17354o(json, "stroke", z, field2, DivStrokeTemplate.f39454m, f34328a, env);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivShapeDrawable mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        return new DivShapeDrawable((Expression) FieldKt.m17376b(this.f38820a, env, "color", data, f38817d), (DivShape) FieldKt.m17383i(this.f38821b, env, "shape", data, f38818e), (DivStroke) FieldKt.m17381g(this.f38822c, env, "stroke", data, f38819f));
    }
}
