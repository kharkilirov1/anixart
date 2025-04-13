package com.yandex.div2;

import com.yandex.div.internal.parser.C2903a;
import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
import com.yandex.div.internal.parser.ListValidator;
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
import com.yandex.div2.DivFixedLengthInputMask;
import com.yandex.div2.DivFixedLengthInputMaskTemplate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivFixedLengthInputMaskTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div2/DivFixedLengthInputMaskTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivFixedLengthInputMask;", "Companion", "PatternElementTemplate", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivFixedLengthInputMaskTemplate implements JSONSerializable, JsonTemplate<DivFixedLengthInputMask> {

    /* renamed from: e */
    @NotNull
    public static final Expression<Boolean> f35751e = Expression.f34334a.m17539a(Boolean.FALSE);

    /* renamed from: f */
    @NotNull
    public static final ValueValidator<String> f35752f = C3051j.f41539o;

    /* renamed from: g */
    @NotNull
    public static final ValueValidator<String> f35753g = C3051j.f41540p;

    /* renamed from: h */
    @NotNull
    public static final ListValidator<DivFixedLengthInputMask.PatternElement> f35754h = C3053k.f41588c;

    /* renamed from: i */
    @NotNull
    public static final ListValidator<PatternElementTemplate> f35755i = C3053k.f41589d;

    /* renamed from: j */
    @NotNull
    public static final ValueValidator<String> f35756j = C3051j.f41541q;

    /* renamed from: k */
    @NotNull
    public static final ValueValidator<String> f35757k = C3051j.f41542r;

    /* renamed from: l */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>> f35758l = new Function3<String, JSONObject, ParsingEnvironment, Expression<Boolean>>() { // from class: com.yandex.div2.DivFixedLengthInputMaskTemplate$Companion$ALWAYS_VISIBLE_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public Expression<Boolean> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            Function1<Object, Boolean> function1 = ParsingConvertersKt.f33829c;
            ParsingErrorLogger f34328a = parsingEnvironment2.getF34328a();
            Expression<Boolean> expression = DivFixedLengthInputMaskTemplate.f35751e;
            Expression<Boolean> m17330v = JsonParser.m17330v(jSONObject2, str2, function1, f34328a, parsingEnvironment2, expression, TypeHelpersKt.f33848a);
            return m17330v == null ? expression : m17330v;
        }
    };

    /* renamed from: m */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, Expression<String>> f35759m = new Function3<String, JSONObject, ParsingEnvironment, Expression<String>>() { // from class: com.yandex.div2.DivFixedLengthInputMaskTemplate$Companion$PATTERN_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public Expression<String> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            return JsonParser.m17314f(jSONObject2, str2, DivFixedLengthInputMaskTemplate.f35753g, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33850c);
        }
    };

    /* renamed from: n */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivFixedLengthInputMask.PatternElement>> f35760n = new Function3<String, JSONObject, ParsingEnvironment, List<DivFixedLengthInputMask.PatternElement>>() { // from class: com.yandex.div2.DivFixedLengthInputMaskTemplate$Companion$PATTERN_ELEMENTS_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public List<DivFixedLengthInputMask.PatternElement> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            DivFixedLengthInputMask.PatternElement.Companion companion = DivFixedLengthInputMask.PatternElement.f35742d;
            List<DivFixedLengthInputMask.PatternElement> m17321m = JsonParser.m17321m(jSONObject2, str2, DivFixedLengthInputMask.PatternElement.f35746h, DivFixedLengthInputMaskTemplate.f35754h, parsingEnvironment2.getF34328a(), parsingEnvironment2);
            Intrinsics.m32178g(m17321m, "readList(json, key, DivF…LIDATOR, env.logger, env)");
            return m17321m;
        }
    };

    /* renamed from: o */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, String> f35761o = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivFixedLengthInputMaskTemplate$Companion$RAW_TEXT_VARIABLE_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public String mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            return (String) JsonParser.m17311c(jSONObject2, str2, DivFixedLengthInputMaskTemplate.f35757k, parsingEnvironment2.getF34328a(), parsingEnvironment2);
        }
    };

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<Expression<Boolean>> f35762a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<Expression<String>> f35763b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Field<List<PatternElementTemplate>> f35764c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Field<String> f35765d;

    /* compiled from: DivFixedLengthInputMaskTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m31884d2 = {"Lcom/yandex/div2/DivFixedLengthInputMaskTemplate$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "ALWAYS_VISIBLE_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivFixedLengthInputMaskTemplate$PatternElementTemplate;", "PATTERN_ELEMENTS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivFixedLengthInputMask$PatternElement;", "PATTERN_ELEMENTS_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "PATTERN_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "PATTERN_VALIDATOR", "RAW_TEXT_VARIABLE_TEMPLATE_VALIDATOR", "RAW_TEXT_VARIABLE_VALIDATOR", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: DivFixedLengthInputMaskTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivFixedLengthInputMaskTemplate$PatternElementTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivFixedLengthInputMask$PatternElement;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class PatternElementTemplate implements JSONSerializable, JsonTemplate<DivFixedLengthInputMask.PatternElement> {

        /* renamed from: d */
        @NotNull
        public static final Companion f35772d = new Companion(null);

        /* renamed from: e */
        @NotNull
        public static final Expression<String> f35773e = Expression.f34334a.m17539a("_");

        /* renamed from: f */
        @NotNull
        public static final ValueValidator<String> f35774f = C3051j.f41543s;

        /* renamed from: g */
        @NotNull
        public static final ValueValidator<String> f35775g = C3051j.f41544t;

        /* renamed from: h */
        @NotNull
        public static final ValueValidator<String> f35776h = C3051j.f41545u;

        /* renamed from: i */
        @NotNull
        public static final ValueValidator<String> f35777i = C3051j.f41546v;

        /* renamed from: j */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<String>> f35778j = new Function3<String, JSONObject, ParsingEnvironment, Expression<String>>() { // from class: com.yandex.div2.DivFixedLengthInputMaskTemplate$PatternElementTemplate$Companion$KEY_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<String> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17314f(jSONObject2, str2, DivFixedLengthInputMaskTemplate.PatternElementTemplate.f35775g, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33850c);
            }
        };

        /* renamed from: k */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<String>> f35779k = new Function3<String, JSONObject, ParsingEnvironment, Expression<String>>() { // from class: com.yandex.div2.DivFixedLengthInputMaskTemplate$PatternElementTemplate$Companion$PLACEHOLDER_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<String> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String key = str;
                JSONObject json = jSONObject;
                ParsingEnvironment env = parsingEnvironment;
                Intrinsics.m32179h(key, "key");
                Intrinsics.m32179h(json, "json");
                Intrinsics.m32179h(env, "env");
                ParsingErrorLogger f34328a = env.getF34328a();
                Expression<String> expression = DivFixedLengthInputMaskTemplate.PatternElementTemplate.f35773e;
                Expression<String> m17328t = JsonParser.m17328t(json, key, C2903a.f33855b, C2904b.f33858e, f34328a, expression, TypeHelpersKt.f33850c);
                return m17328t == null ? expression : m17328t;
            }
        };

        /* renamed from: l */
        @NotNull
        public static final Function3<String, JSONObject, ParsingEnvironment, Expression<String>> f35780l = new Function3<String, JSONObject, ParsingEnvironment, Expression<String>>() { // from class: com.yandex.div2.DivFixedLengthInputMaskTemplate$PatternElementTemplate$Companion$REGEX_READER$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public Expression<String> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
                C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
                return JsonParser.m17325q(jSONObject2, str2, DivFixedLengthInputMaskTemplate.PatternElementTemplate.f35777i, parsingEnvironment2.getF34328a(), parsingEnvironment2, TypeHelpersKt.f33850c);
            }
        };

        /* renamed from: m */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, PatternElementTemplate> f35781m = new Function2<ParsingEnvironment, JSONObject, PatternElementTemplate>() { // from class: com.yandex.div2.DivFixedLengthInputMaskTemplate$PatternElementTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivFixedLengthInputMaskTemplate.PatternElementTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivFixedLengthInputMaskTemplate.PatternElementTemplate(env, null, false, it, 6);
            }
        };

        /* renamed from: a */
        @JvmField
        @NotNull
        public final Field<Expression<String>> f35782a;

        /* renamed from: b */
        @JvmField
        @NotNull
        public final Field<Expression<String>> f35783b;

        /* renamed from: c */
        @JvmField
        @NotNull
        public final Field<Expression<String>> f35784c;

        /* compiled from: DivFixedLengthInputMaskTemplate.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005¨\u0006\f"}, m31884d2 = {"Lcom/yandex/div2/DivFixedLengthInputMaskTemplate$PatternElementTemplate$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "KEY_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "KEY_VALIDATOR", "Lcom/yandex/div/json/expressions/Expression;", "PLACEHOLDER_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "REGEX_TEMPLATE_VALIDATOR", "REGEX_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        public PatternElementTemplate(ParsingEnvironment parsingEnvironment, PatternElementTemplate patternElementTemplate, boolean z, JSONObject jSONObject, int i2) {
            z = (i2 & 4) != 0 ? false : z;
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            ValueValidator<String> valueValidator = f35774f;
            TypeHelper<String> typeHelper = TypeHelpersKt.f33850c;
            this.f35782a = JsonTemplateParser.m17346g(jSONObject, "key", z, null, valueValidator, f34328a, parsingEnvironment, typeHelper);
            this.f35783b = JsonTemplateParser.m17356q(jSONObject, "placeholder", z, null, f34328a, parsingEnvironment, typeHelper);
            this.f35784c = JsonTemplateParser.m17355p(jSONObject, "regex", z, null, f35776h, f34328a, parsingEnvironment, typeHelper);
        }

        @Override // com.yandex.div.json.JsonTemplate
        /* renamed from: a */
        public DivFixedLengthInputMask.PatternElement mo17514a(ParsingEnvironment env, JSONObject data) {
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(data, "data");
            Expression expression = (Expression) FieldKt.m17376b(this.f35782a, env, "key", data, f35778j);
            Expression<String> expression2 = (Expression) FieldKt.m17378d(this.f35783b, env, "placeholder", data, f35779k);
            if (expression2 == null) {
                expression2 = f35773e;
            }
            return new DivFixedLengthInputMask.PatternElement(expression, expression2, (Expression) FieldKt.m17378d(this.f35784c, env, "regex", data, f35780l));
        }
    }

    static {
        DivFixedLengthInputMaskTemplate$Companion$TYPE_READER$1 divFixedLengthInputMaskTemplate$Companion$TYPE_READER$1 = new Function3<String, JSONObject, ParsingEnvironment, String>() { // from class: com.yandex.div2.DivFixedLengthInputMaskTemplate$Companion$TYPE_READER$1
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
        DivFixedLengthInputMaskTemplate$Companion$CREATOR$1 divFixedLengthInputMaskTemplate$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivFixedLengthInputMaskTemplate>() { // from class: com.yandex.div2.DivFixedLengthInputMaskTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivFixedLengthInputMaskTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return new DivFixedLengthInputMaskTemplate(env, null, false, it);
            }
        };
    }

    public DivFixedLengthInputMaskTemplate(@NotNull ParsingEnvironment env, @Nullable DivFixedLengthInputMaskTemplate divFixedLengthInputMaskTemplate, boolean z, @NotNull JSONObject json) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(json, "json");
        ParsingErrorLogger f34328a = env.getF34328a();
        this.f35762a = JsonTemplateParser.m17358s(json, "always_visible", z, divFixedLengthInputMaskTemplate == null ? null : divFixedLengthInputMaskTemplate.f35762a, ParsingConvertersKt.f33829c, f34328a, env, TypeHelpersKt.f33848a);
        this.f35763b = JsonTemplateParser.m17346g(json, "pattern", z, divFixedLengthInputMaskTemplate == null ? null : divFixedLengthInputMaskTemplate.f35763b, f35752f, f34328a, env, TypeHelpersKt.f33850c);
        Field<List<PatternElementTemplate>> field = divFixedLengthInputMaskTemplate == null ? null : divFixedLengthInputMaskTemplate.f35764c;
        PatternElementTemplate.Companion companion = PatternElementTemplate.f35772d;
        this.f35764c = JsonTemplateParser.m17350k(json, "pattern_elements", z, field, PatternElementTemplate.f35781m, f35755i, f34328a, env);
        this.f35765d = JsonTemplateParser.m17341b(json, "raw_text_variable", z, divFixedLengthInputMaskTemplate == null ? null : divFixedLengthInputMaskTemplate.f35765d, f35756j, f34328a, env);
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivFixedLengthInputMask mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        Expression<Boolean> expression = (Expression) FieldKt.m17378d(this.f35762a, env, "always_visible", data, f35758l);
        if (expression == null) {
            expression = f35751e;
        }
        return new DivFixedLengthInputMask(expression, (Expression) FieldKt.m17376b(this.f35763b, env, "pattern", data, f35759m), FieldKt.m17384j(this.f35764c, env, "pattern_elements", data, f35754h, f35760n), (String) FieldKt.m17376b(this.f35765d, env, "raw_text_variable", data, f35761o));
    }
}
