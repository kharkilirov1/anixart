package com.yandex.div2;

import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivWrapContentSize;
import com.yandex.div2.DivWrapContentSizeTemplate;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivWrapContentSizeTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div2/DivWrapContentSizeTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivWrapContentSize;", "Companion", "ConstraintSizeTemplate", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivWrapContentSizeTemplate implements JSONSerializable, JsonTemplate<DivWrapContentSize> {

    /* renamed from: d */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>> f41008d = new Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>>() { // from class: com.yandex.div2.DivWrapContentSizeTemplate$Companion$CONSTRAINED_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public Expression<Boolean> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            return JsonParser.m17329u(jSONObject2, str2, ParsingConvertersKt.f33829c, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33848a);
        }
    };

    /* renamed from: e */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivWrapContentSize.ConstraintSize> f41009e = new Function3<String, JSONObject, ParsingEnvironment, DivWrapContentSize.ConstraintSize>() { // from class: com.yandex.div2.DivWrapContentSizeTemplate$Companion$MAX_SIZE_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public DivWrapContentSize.ConstraintSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            DivWrapContentSize.ConstraintSize.Companion companion = DivWrapContentSize.ConstraintSize.f40999c;
            return (DivWrapContentSize.ConstraintSize) JsonParser.m17322n(jSONObject2, str2, DivWrapContentSize.ConstraintSize.f41003g, parsingEnvironment2.getF34328a(), parsingEnvironment2);
        }
    };

    /* renamed from: f */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, DivWrapContentSize.ConstraintSize> f41010f = new Function3<String, JSONObject, ParsingEnvironment, DivWrapContentSize.ConstraintSize>() { // from class: com.yandex.div2.DivWrapContentSizeTemplate$Companion$MIN_SIZE_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public DivWrapContentSize.ConstraintSize mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            DivWrapContentSize.ConstraintSize.Companion companion = DivWrapContentSize.ConstraintSize.f40999c;
            return (DivWrapContentSize.ConstraintSize) JsonParser.m17322n(jSONObject2, str2, DivWrapContentSize.ConstraintSize.f41003g, parsingEnvironment2.getF34328a(), parsingEnvironment2);
        }
    };

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<Expression<Boolean>> f41011a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<ConstraintSizeTemplate> f41012b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<ConstraintSizeTemplate> f41013c;

    /* compiled from: DivWrapContentSizeTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivWrapContentSizeTemplate$Companion;", "", "", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: DivWrapContentSizeTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivWrapContentSizeTemplate$ConstraintSizeTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivWrapContentSize$ConstraintSize;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class ConstraintSizeTemplate implements JSONSerializable, JsonTemplate<DivWrapContentSize.ConstraintSize> {

        /* renamed from: c */
        @NotNull
        public static final Companion f41019c = new Companion(null);

        /* renamed from: d */
        @NotNull
        public static final Expression<DivSizeUnit> f41020d = Expression.f34334a.m17539a(DivSizeUnit.DP);

        /* renamed from: e */
        @NotNull
        public static final TypeHelper<DivSizeUnit> f41021e;

        /* renamed from: f */
        @NotNull
        public static final ValueValidator<Long> f41022f;

        /* renamed from: g */
        @NotNull
        public static final ValueValidator<Long> f41023g;

        /* renamed from: h */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<DivSizeUnit>> f41024h;

        /* renamed from: i */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> f41025i;

        /* renamed from: j */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, ConstraintSizeTemplate> f41026j;

        /* renamed from: a */
        @JvmField
        @NotNull
        public final Field<Expression<DivSizeUnit>> f41027a;

        /* renamed from: b */
        @JvmField
        @NotNull
        public final Field<Expression<Long>> f41028b;

        /* compiled from: DivWrapContentSizeTemplate.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, m31884d2 = {"Lcom/yandex/div2/DivWrapContentSizeTemplate$ConstraintSizeTemplate$Companion;", "", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivSizeUnit;", "TYPE_HELPER_UNIT", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div/json/expressions/Expression;", "UNIT_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "VALUE_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "VALUE_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        static {
            int i2 = TypeHelper.f33843a;
            f41021e = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(DivSizeUnit.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivWrapContentSizeTemplate$ConstraintSizeTemplate$Companion$TYPE_HELPER_UNIT$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(Object it) {
                    Intrinsics.m32179h(it, "it");
                    return Boolean.valueOf(it instanceof DivSizeUnit);
                }
            });
            f41022f = C3068r0.f41989s;
            f41023g = C3068r0.f41990t;
            f41024h = new Function3<String, JSONObject, ParsingEnvironment, Expression<DivSizeUnit>>() { // from class: com.yandex.div2.DivWrapContentSizeTemplate$ConstraintSizeTemplate$Companion$UNIT_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<DivSizeUnit> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    DivSizeUnit.Converter converter = DivSizeUnit.f38845c;
                    Function1<String, DivSizeUnit> function1 = DivSizeUnit.f38846d;
                    ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
                    Expression<DivSizeUnit> expression = DivWrapContentSizeTemplate.ConstraintSizeTemplate.f41020d;
                    Expression<DivSizeUnit> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, DivWrapContentSizeTemplate.ConstraintSizeTemplate.f41021e);
                    return m17330v == null ? expression : m17330v;
                }
            };
            f41025i = new Function3<String, JSONObject, ParsingEnvironment, Expression<Long>>() { // from class: com.yandex.div2.DivWrapContentSizeTemplate$ConstraintSizeTemplate$Companion$VALUE_READER$1
                @Override // kotlin.jvm.functions.Function3
                /* renamed from: k */
                public Expression<Long> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                    String str2 = str;
                    JSONObject jSONObject2 = jSONObject;
                    ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                    C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                    return JsonParser.m17316h(jSONObject2, str2, ParsingConvertersKt.f33831e, DivWrapContentSizeTemplate.ConstraintSizeTemplate.f41023g, parsingEnvironment2.getF34328a(), TypeHelpersKt.f33849b);
                }
            };
            f41026j = new Function2<ParsingEnvironment, JSONObject, ConstraintSizeTemplate>() { // from class: com.yandex.div2.DivWrapContentSizeTemplate$ConstraintSizeTemplate$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                public DivWrapContentSizeTemplate.ConstraintSizeTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    ParsingEnvironment env = parsingEnvironment;
                    JSONObject it = jSONObject;
                    Intrinsics.m32179h(env, "env");
                    Intrinsics.m32179h(it, "it");
                    return new DivWrapContentSizeTemplate.ConstraintSizeTemplate(env, null, false, it, 6);
                }
            };
        }

        public ConstraintSizeTemplate(ParsingEnvironment parsingEnvironment, ConstraintSizeTemplate constraintSizeTemplate, boolean z, JSONObject jSONObject, int i2) {
            z = (i2 & 4) != 0 ? false : z;
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            DivSizeUnit.Converter converter = DivSizeUnit.f38845c;
            this.f41027a = JsonTemplateParser.m17358s(jSONObject, "unit", z, null, DivSizeUnit.f38846d, f34328a, parsingEnvironment, f41021e);
            this.f41028b = JsonTemplateParser.m17348i(jSONObject, "value", z, null, ParsingConvertersKt.f33831e, f41022f, f34328a, parsingEnvironment, TypeHelpersKt.f33849b);
        }

        @Override // com.yandex.div.json.JsonTemplate
        /* renamed from: a */
        public DivWrapContentSize.ConstraintSize mo17514a(ParsingEnvironment env, JSONObject data) {
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(data, "data");
            Expression<DivSizeUnit> expression = (Expression) FieldKt.m17378d(this.f41027a, env, "unit", data, f41024h);
            if (expression == null) {
                expression = f41020d;
            }
            return new DivWrapContentSize.ConstraintSize(expression, (Expression) FieldKt.m17376b(this.f41028b, env, "value", data, f41025i));
        }
    }

    static {
        DivWrapContentSizeTemplate$Companion$TYPE_READER$1 divWrapContentSizeTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivWrapContentSizeTemplate$Companion$TYPE_READER$1
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
        DivWrapContentSizeTemplate$Companion$CREATOR$1 divWrapContentSizeTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivWrapContentSizeTemplate>() { // from class: com.yandex.div2.DivWrapContentSizeTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivWrapContentSizeTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivWrapContentSizeTemplate(env, null, false, it);
            }
        };
    }

    public DivWrapContentSizeTemplate(@NotNull ParsingEnvironment env, @Nullable DivWrapContentSizeTemplate divWrapContentSizeTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        this.f41011a = JsonTemplateParser.m17358s(json, "constrained", z, divWrapContentSizeTemplate == null ? null : divWrapContentSizeTemplate.f41011a, ParsingConvertersKt.f33829c, f34328a, env, TypeHelpersKt.f33848a);
        Field<ConstraintSizeTemplate> field = divWrapContentSizeTemplate == null ? null : divWrapContentSizeTemplate.f41012b;
        ConstraintSizeTemplate.Companion companion = ConstraintSizeTemplate.f41019c;
        Function2<ParsingEnvironment, JSONObject, ConstraintSizeTemplate> function2 = ConstraintSizeTemplate.f41026j;
        this.f41012b = JsonTemplateParser.m17354o(json, "max_size", z, field, function2, f34328a, env);
        this.f41013c = JsonTemplateParser.m17354o(json, "min_size", z, divWrapContentSizeTemplate == null ? null : divWrapContentSizeTemplate.f41013c, function2, f34328a, env);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivWrapContentSize mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        return new DivWrapContentSize((Expression) FieldKt.m17378d(this.f41011a, env, "constrained", data, f41008d), (DivWrapContentSize.ConstraintSize) FieldKt.m17381g(this.f41012b, env, "max_size", data, f41009e), (DivWrapContentSize.ConstraintSize) FieldKt.m17381g(this.f41013c, env, "min_size", data, f41010f));
    }
}
