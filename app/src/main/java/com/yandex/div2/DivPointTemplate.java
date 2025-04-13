package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div2.DivDimension;
import com.yandex.div2.DivDimensionTemplate;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivPointTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivPointTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivPoint;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivPointTemplate implements JSONSerializable, JsonTemplate<DivPoint> {

    /* renamed from: c */
    @NotNull
    public static final Companion f38069c = new Companion(null);

    /* renamed from: d */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivDimension> f38070d = new Function3<String, JSONObject, ParsingEnvironment, DivDimension>() { // from class: com.yandex.div2.DivPointTemplate$Companion$X_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public DivDimension mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            DivDimension.Companion companion = DivDimension.f35517c;
            Function2<ParsingEnvironment, JSONObject, DivDimension> function2 = DivDimension.f35520f;
            parsingEnvironment2.getF34328a();
            return (DivDimension) JsonParser.m17313e(jSONObject2, str2, function2, C2904b.f33858e, parsingEnvironment2);
        }
    };

    /* renamed from: e */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivDimension> f38071e = new Function3<String, JSONObject, ParsingEnvironment, DivDimension>() { // from class: com.yandex.div2.DivPointTemplate$Companion$Y_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public DivDimension mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            DivDimension.Companion companion = DivDimension.f35517c;
            Function2<ParsingEnvironment, JSONObject, DivDimension> function2 = DivDimension.f35520f;
            parsingEnvironment2.getF34328a();
            return (DivDimension) JsonParser.m17313e(jSONObject2, str2, function2, C2904b.f33858e, parsingEnvironment2);
        }
    };

    /* renamed from: f */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivPointTemplate> f38072f = new Function2<ParsingEnvironment, JSONObject, DivPointTemplate>() { // from class: com.yandex.div2.DivPointTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivPointTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            return new DivPointTemplate(env, null, false, it, 6);
        }
    };

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<DivDimensionTemplate> f38073a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<DivDimensionTemplate> f38074b;

    /* compiled from: DivPointTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivPointTemplate$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public DivPointTemplate(ParsingEnvironment parsingEnvironment, DivPointTemplate divPointTemplate, boolean z, JSONObject jSONObject, int i2) {
        z = (i2 & 4) != 0 ? false : z;
        ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
        DivDimensionTemplate.Companion companion = DivDimensionTemplate.f35525c;
        Function2<ParsingEnvironment, JSONObject, DivDimensionTemplate> function2 = DivDimensionTemplate.f35530h;
        this.f38073a = JsonTemplateParser.m17345f(jSONObject, "x", z, null, function2, f34328a, parsingEnvironment);
        this.f38074b = JsonTemplateParser.m17345f(jSONObject, "y", z, null, function2, f34328a, parsingEnvironment);
    }

    @Override // com.yandex.div.json.JsonTemplate
    /* renamed from: a */
    public DivPoint mo17514a(ParsingEnvironment env, JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        return new DivPoint((DivDimension) FieldKt.m17383i(this.f38073a, env, "x", data, f38070d), (DivDimension) FieldKt.m17383i(this.f38074b, env, "y", data, f38071e));
    }
}
