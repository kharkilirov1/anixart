package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.C2903a;
import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivFixedLengthInputMask;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivFixedLengthInputMask.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivFixedLengthInputMask;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div2/DivInputMaskBase;", "Companion", "PatternElement", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivFixedLengthInputMask implements JSONSerializable, DivInputMaskBase {

    /* renamed from: e */
    @NotNull
    public static final Companion f35732e = new Companion(null);

    /* renamed from: f */
    @NotNull
    public static final Expression<Boolean> f35733f = Expression.f34334a.m17539a(Boolean.FALSE);

    /* renamed from: g */
    @NotNull
    public static final ValueValidator<String> f35734g = C3051j.f41535k;

    /* renamed from: h */
    @NotNull
    public static final ListValidator<PatternElement> f35735h = C3053k.f41587b;

    /* renamed from: i */
    @NotNull
    public static final ValueValidator<String> f35736i = C3051j.f41536l;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Expression<Boolean> f35737a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Expression<String> f35738b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final List<PatternElement> f35739c;

    /* renamed from: d */
    @NotNull
    public final String f35740d;

    /* compiled from: DivFixedLengthInputMask.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m31884d2 = {"Lcom/yandex/div2/DivFixedLengthInputMask$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "ALWAYS_VISIBLE_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivFixedLengthInputMask$PatternElement;", "PATTERN_ELEMENTS_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "PATTERN_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "PATTERN_VALIDATOR", "RAW_TEXT_VARIABLE_TEMPLATE_VALIDATOR", "RAW_TEXT_VARIABLE_VALIDATOR", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivFixedLengthInputMask m17618a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            Function1<Object, Boolean> function1 = ParsingConvertersKt.f33829c;
            Expression<Boolean> expression = DivFixedLengthInputMask.f35733f;
            Expression<Boolean> m17330v = JsonParser.m17330v(jSONObject, "always_visible", function1, f34328a, parsingEnvironment, expression, TypeHelpersKt.f33848a);
            if (m17330v != null) {
                expression = m17330v;
            }
            Expression m17314f = JsonParser.m17314f(jSONObject, "pattern", DivFixedLengthInputMask.f35734g, f34328a, parsingEnvironment, TypeHelpersKt.f33850c);
            PatternElement.Companion companion = PatternElement.f35742d;
            List m17321m = JsonParser.m17321m(jSONObject, "pattern_elements", PatternElement.f35746h, DivFixedLengthInputMask.f35735h, f34328a, parsingEnvironment);
            Intrinsics.m32178g(m17321m, "readList(json, \"pattern_…S_VALIDATOR, logger, env)");
            return new DivFixedLengthInputMask(expression, m17314f, m17321m, (String) JsonParser.m17311c(jSONObject, "raw_text_variable", DivFixedLengthInputMask.f35736i, f34328a, parsingEnvironment));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivFixedLengthInputMask.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivFixedLengthInputMask$PatternElement;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class PatternElement implements JSONSerializable {

        /* renamed from: d */
        @NotNull
        public static final Companion f35742d = new Companion(null);

        /* renamed from: e */
        @NotNull
        public static final Expression<String> f35743e = Expression.f34334a.m17539a("_");

        /* renamed from: f */
        @NotNull
        public static final ValueValidator<String> f35744f = C3051j.f41537m;

        /* renamed from: g */
        @NotNull
        public static final ValueValidator<String> f35745g = C3051j.f41538n;

        /* renamed from: h */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, PatternElement> f35746h = new Function2<ParsingEnvironment, JSONObject, PatternElement>() { // from class: com.yandex.div2.DivFixedLengthInputMask$PatternElement$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivFixedLengthInputMask.PatternElement invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                DivFixedLengthInputMask.PatternElement.Companion companion = DivFixedLengthInputMask.PatternElement.f35742d;
                ParsingErrorLogger f34328a = env.getF34328a();
                ValueValidator<String> valueValidator = DivFixedLengthInputMask.PatternElement.f35744f;
                TypeHelper<String> typeHelper = TypeHelpersKt.f33850c;
                Expression m17314f = JsonParser.m17314f(it, "key", valueValidator, f34328a, env, typeHelper);
                Expression<String> expression = DivFixedLengthInputMask.PatternElement.f35743e;
                Expression<String> m17328t = JsonParser.m17328t(it, "placeholder", C2903a.f33855b, C2904b.f33858e, f34328a, expression, typeHelper);
                if (m17328t != null) {
                    expression = m17328t;
                }
                return new DivFixedLengthInputMask.PatternElement(m17314f, expression, JsonParser.m17325q(it, "regex", DivFixedLengthInputMask.PatternElement.f35745g, f34328a, env, typeHelper));
            }
        };

        /* renamed from: a */
        @JvmField
        @NotNull
        public final Expression<String> f35747a;

        /* renamed from: b */
        @JvmField
        @NotNull
        public final Expression<String> f35748b;

        /* renamed from: c */
        @JvmField
        @Nullable
        public final Expression<String> f35749c;

        /* compiled from: DivFixedLengthInputMask.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005¨\u0006\f"}, m31884d2 = {"Lcom/yandex/div2/DivFixedLengthInputMask$PatternElement$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "KEY_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "KEY_VALIDATOR", "Lcom/yandex/div/json/expressions/Expression;", "PLACEHOLDER_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "REGEX_TEMPLATE_VALIDATOR", "REGEX_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        @DivModelInternalApi
        public PatternElement(@NotNull Expression<String> key, @NotNull Expression<String> placeholder, @Nullable Expression<String> expression) {
            Intrinsics.m32179h(key, "key");
            Intrinsics.m32179h(placeholder, "placeholder");
            this.f35747a = key;
            this.f35748b = placeholder;
            this.f35749c = expression;
        }
    }

    static {
        DivFixedLengthInputMask$Companion$CREATOR$1 divFixedLengthInputMask$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivFixedLengthInputMask>() { // from class: com.yandex.div2.DivFixedLengthInputMask$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivFixedLengthInputMask invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivFixedLengthInputMask.f35732e.m17618a(env, it);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @DivModelInternalApi
    public DivFixedLengthInputMask(@NotNull Expression<Boolean> alwaysVisible, @NotNull Expression<String> pattern, @NotNull List<? extends PatternElement> patternElements, @NotNull String rawTextVariable) {
        Intrinsics.m32179h(alwaysVisible, "alwaysVisible");
        Intrinsics.m32179h(pattern, "pattern");
        Intrinsics.m32179h(patternElements, "patternElements");
        Intrinsics.m32179h(rawTextVariable, "rawTextVariable");
        this.f35737a = alwaysVisible;
        this.f35738b = pattern;
        this.f35739c = patternElements;
        this.f35740d = rawTextVariable;
    }

    @Override // com.yandex.div2.DivInputMaskBase
    @NotNull
    /* renamed from: a, reason: from getter */
    public String getF35740d() {
        return this.f35740d;
    }
}
