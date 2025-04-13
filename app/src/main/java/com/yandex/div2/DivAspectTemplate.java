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
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAspectTemplate;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivAspectTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivAspectTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivAspect;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivAspectTemplate implements JSONSerializable, JsonTemplate<DivAspect> {

    /* renamed from: b */
    @NotNull
    public static final Companion f34744b = new Companion(null);

    /* renamed from: c */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> f34745c = new Function3<String, JSONObject, ParsingEnvironment, Expression<Double>>() { // from class: com.yandex.div2.DivAspectTemplate$Companion$RATIO_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public Expression<Double> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
            DivAspectTemplate.Companion companion = DivAspectTemplate.f34744b;
            return JsonParser.m17316h(jSONObject2, str2, function1, C3039d.f41214c, parsingEnvironment2.getF34328a(), TypeHelpersKt.f33851d);
        }
    };

    /* renamed from: d */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivAspectTemplate> f34746d = new Function2<ParsingEnvironment, JSONObject, DivAspectTemplate>() { // from class: com.yandex.div2.DivAspectTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivAspectTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            return new DivAspectTemplate(env, null, false, it, 6);
        }
    };

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<Expression<Double>> f34747a;

    /* compiled from: DivAspectTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivAspectTemplate$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "RATIO_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "RATIO_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public DivAspectTemplate(ParsingEnvironment parsingEnvironment, DivAspectTemplate divAspectTemplate, boolean z, JSONObject jSONObject, int i2) {
        this.f34747a = JsonTemplateParser.m17348i(jSONObject, "ratio", (i2 & 4) != 0 ? false : z, null, ParsingConvertersKt.f33830d, C3035b.f41126y, parsingEnvironment.getF34328a(), parsingEnvironment, TypeHelpersKt.f33851d);
    }

    @Override // com.yandex.div.json.JsonTemplate
    /* renamed from: a */
    public DivAspect mo17514a(ParsingEnvironment env, JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        return new DivAspect((Expression) FieldKt.m17376b(this.f34747a, env, "ratio", data, f34745c));
    }
}
