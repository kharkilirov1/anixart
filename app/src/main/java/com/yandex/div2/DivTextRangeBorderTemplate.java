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
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivStroke;
import com.yandex.div2.DivStrokeTemplate;
import com.yandex.div2.DivTextRangeBorderTemplate;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTextRangeBorderTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivTextRangeBorderTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivTextRangeBorder;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivTextRangeBorderTemplate implements JSONSerializable, JsonTemplate<DivTextRangeBorder> {

    /* renamed from: c */
    @NotNull
    public static final Companion f40078c = new Companion(null);

    /* renamed from: d */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f40079d = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivTextRangeBorderTemplate$Companion$CORNER_RADIUS_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
            DivTextRangeBorderTemplate.Companion companion = DivTextRangeBorderTemplate.f40078c;
            return JsonParser.m17327s(jSONObject2, str2, function1, C3056l0.f41657e, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
        }
    };

    /* renamed from: e */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivStroke> f40080e = new Function3<String, JSONObject, ParsingEnvironment, DivStroke>() { // from class: com.yandex.div2.DivTextRangeBorderTemplate$Companion$STROKE_READER$1
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

    /* renamed from: f */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivTextRangeBorderTemplate> f40081f = new Function2<ParsingEnvironment, JSONObject, DivTextRangeBorderTemplate>() { // from class: com.yandex.div2.DivTextRangeBorderTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivTextRangeBorderTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            return new DivTextRangeBorderTemplate(env, null, false, it, 6);
        }
    };

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f40082a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<DivStrokeTemplate> f40083b;

    /* compiled from: DivTextRangeBorderTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivTextRangeBorderTemplate$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "CORNER_RADIUS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "CORNER_RADIUS_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public DivTextRangeBorderTemplate(ParsingEnvironment parsingEnvironment, DivTextRangeBorderTemplate divTextRangeBorderTemplate, boolean z, JSONObject jSONObject, int i2) {
        z = (i2 & 4) != 0 ? false : z;
        ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
        this.f40082a = JsonTemplateParser.m17357r(jSONObject, "corner_radius", z, null, ParsingConvertersKt.f33831e, C3056l0.f41656d, f34328a, parsingEnvironment, TypeHelpersKt.f33849b);
        DivStrokeTemplate.Companion companion = DivStrokeTemplate.f39445d;
        this.f40083b = JsonTemplateParser.m17354o(jSONObject, "stroke", z, null, DivStrokeTemplate.f39454m, f34328a, parsingEnvironment);
    }

    @Override // com.yandex.div.json.JsonTemplate
    /* renamed from: a */
    public DivTextRangeBorder mo17514a(ParsingEnvironment env, JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        return new DivTextRangeBorder((Expression) FieldKt.m17378d(this.f40082a, env, "corner_radius", data, f40079d), (DivStroke) FieldKt.m17381g(this.f40083b, env, "stroke", data, f40080e));
    }
}
