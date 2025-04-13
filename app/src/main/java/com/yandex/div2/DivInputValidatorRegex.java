package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivInputValidatorRegex.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivInputValidatorRegex;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivInputValidatorRegex implements JSONSerializable {

    /* renamed from: a */
    @NotNull
    public static final Companion f37651a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Expression<Boolean> f37652b = Expression.f34334a.m17539a(Boolean.FALSE);

    /* renamed from: c */
    @NotNull
    public static final ValueValidator<String> f37653c = C3074w.f42129o;

    /* renamed from: d */
    @NotNull
    public static final ValueValidator<String> f37654d = C3074w.f42130p;

    /* renamed from: e */
    @NotNull
    public static final ValueValidator<String> f37655e = C3074w.f42131q;

    /* compiled from: DivInputValidatorRegex.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\t¨\u0006\u0011"}, m31884d2 = {"Lcom/yandex/div2/DivInputValidatorRegex$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "ALLOW_EMPTY_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "LABEL_ID_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "LABEL_ID_VALIDATOR", "PATTERN_TEMPLATE_VALIDATOR", "PATTERN_VALIDATOR", "TYPE", "Ljava/lang/String;", "VARIABLE_TEMPLATE_VALIDATOR", "VARIABLE_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivInputValidatorRegex m17646a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            Function1<Object, Boolean> function1 = ParsingConvertersKt.f33829c;
            Expression<Boolean> expression = DivInputValidatorRegex.f37652b;
            Expression<Boolean> m17330v = JsonParser.m17330v(jSONObject, "allow_empty", function1, f34328a, parsingEnvironment, expression, TypeHelpersKt.f33848a);
            if (m17330v != null) {
                expression = m17330v;
            }
            ValueValidator<String> valueValidator = DivInputValidatorRegex.f37653c;
            TypeHelper<String> typeHelper = TypeHelpersKt.f33850c;
            return new DivInputValidatorRegex(expression, JsonParser.m17314f(jSONObject, "label_id", valueValidator, f34328a, parsingEnvironment, typeHelper), JsonParser.m17314f(jSONObject, "pattern", DivInputValidatorRegex.f37654d, f34328a, parsingEnvironment, typeHelper), (String) JsonParser.m17311c(jSONObject, "variable", DivInputValidatorRegex.f37655e, f34328a, parsingEnvironment));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        DivInputValidatorRegex$Companion$CREATOR$1 divInputValidatorRegex$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivInputValidatorRegex>() { // from class: com.yandex.div2.DivInputValidatorRegex$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivInputValidatorRegex invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivInputValidatorRegex.f37651a.m17646a(env, it);
            }
        };
    }

    @DivModelInternalApi
    public DivInputValidatorRegex(@NotNull Expression<Boolean> allowEmpty, @NotNull Expression<String> labelId, @NotNull Expression<String> pattern, @NotNull String variable) {
        Intrinsics.m32179h(allowEmpty, "allowEmpty");
        Intrinsics.m32179h(labelId, "labelId");
        Intrinsics.m32179h(pattern, "pattern");
        Intrinsics.m32179h(variable, "variable");
    }
}
