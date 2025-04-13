package com.yandex.div2;

import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivCornersRadiusTemplate;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivCornersRadiusTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivCornersRadiusTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivCornersRadius;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivCornersRadiusTemplate implements JSONSerializable, JsonTemplate<DivCornersRadius> {

    /* renamed from: e */
    @NotNull
    public static final Companion f35223e = new Companion(null);

    /* renamed from: f */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f35224f = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivCornersRadiusTemplate$Companion$BOTTOM_LEFT_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
            DivCornersRadiusTemplate.Companion companion = DivCornersRadiusTemplate.f35223e;
            return JsonParser.m17327s(jSONObject2, str2, function1, C3043f.f41331k, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
        }
    };

    /* renamed from: g */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f35225g = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivCornersRadiusTemplate$Companion$BOTTOM_RIGHT_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
            DivCornersRadiusTemplate.Companion companion = DivCornersRadiusTemplate.f35223e;
            return JsonParser.m17327s(jSONObject2, str2, function1, C3043f.f41333m, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
        }
    };

    /* renamed from: h */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f35226h = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivCornersRadiusTemplate$Companion$TOP_LEFT_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
            DivCornersRadiusTemplate.Companion companion = DivCornersRadiusTemplate.f35223e;
            return JsonParser.m17327s(jSONObject2, str2, function1, C3043f.f41335o, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
        }
    };

    /* renamed from: i */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f35227i = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivCornersRadiusTemplate$Companion$TOP_RIGHT_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
            DivCornersRadiusTemplate.Companion companion = DivCornersRadiusTemplate.f35223e;
            return JsonParser.m17327s(jSONObject2, str2, function1, C3043f.f41337q, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33849b);
        }
    };

    /* renamed from: j */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivCornersRadiusTemplate> f35228j = new Function2<ParsingEnvironment, JSONObject, DivCornersRadiusTemplate>() { // from class: com.yandex.div2.DivCornersRadiusTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivCornersRadiusTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            return new DivCornersRadiusTemplate(env, null, false, it, 6);
        }
    };

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f35229a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f35230b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f35231c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<Expression<Long>> f35232d;

    /* compiled from: DivCornersRadiusTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005¨\u0006\r"}, m31884d2 = {"Lcom/yandex/div2/DivCornersRadiusTemplate$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "BOTTOM_LEFT_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "BOTTOM_LEFT_VALIDATOR", "BOTTOM_RIGHT_TEMPLATE_VALIDATOR", "BOTTOM_RIGHT_VALIDATOR", "TOP_LEFT_TEMPLATE_VALIDATOR", "TOP_LEFT_VALIDATOR", "TOP_RIGHT_TEMPLATE_VALIDATOR", "TOP_RIGHT_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public DivCornersRadiusTemplate(ParsingEnvironment parsingEnvironment, DivCornersRadiusTemplate divCornersRadiusTemplate, boolean z, JSONObject jSONObject, int i2) {
        z = (i2 & 4) != 0 ? false : z;
        ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
        Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
        C3043f c3043f = C3043f.f41330j;
        TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
        this.f35229a = JsonTemplateParser.m17357r(jSONObject, "bottom-left", z, null, function1, c3043f, f34328a, parsingEnvironment, typeHelper);
        this.f35230b = JsonTemplateParser.m17357r(jSONObject, "bottom-right", z, null, function1, C3043f.f41332l, f34328a, parsingEnvironment, typeHelper);
        this.f35231c = JsonTemplateParser.m17357r(jSONObject, "top-left", z, null, function1, C3043f.f41334n, f34328a, parsingEnvironment, typeHelper);
        this.f35232d = JsonTemplateParser.m17357r(jSONObject, "top-right", z, null, function1, C3043f.f41336p, f34328a, parsingEnvironment, typeHelper);
    }

    @Override // com.yandex.div.json.JsonTemplate
    /* renamed from: a */
    public DivCornersRadius mo17514a(ParsingEnvironment env, JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        return new DivCornersRadius((Expression) FieldKt.m17378d(this.f35229a, env, "bottom-left", data, f35224f), (Expression) FieldKt.m17378d(this.f35230b, env, "bottom-right", data, f35225g), (Expression) FieldKt.m17378d(this.f35231c, env, "top-left", data, f35226h), (Expression) FieldKt.m17378d(this.f35232d, env, "top-right", data, f35227i));
    }
}
