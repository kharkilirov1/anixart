package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivInputValidator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivInputValidator.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivInputValidator;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "Expression", "Regex", "Lcom/yandex/div2/DivInputValidator$Regex;", "Lcom/yandex/div2/DivInputValidator$Expression;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivInputValidator implements JSONSerializable {

    /* renamed from: a */
    @NotNull
    public static final Companion f37601a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivInputValidator> f37602b = new Function2<ParsingEnvironment, JSONObject, DivInputValidator>() { // from class: com.yandex.div2.DivInputValidator$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivInputValidator invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivInputValidator.Companion companion = DivInputValidator.f37601a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF34328a(), env);
            String str = (String) m17338a;
            if (Intrinsics.m32174c(str, "regex")) {
                return new DivInputValidator.Regex(DivInputValidatorRegex.f37651a.m17646a(env, it));
            }
            if (Intrinsics.m32174c(str, "expression")) {
                return new DivInputValidator.Expression(DivInputValidatorExpression.f37624a.m17644a(env, it));
            }
            JsonTemplate<?> mo17515a = env.mo17207b().mo17515a(str, it);
            DivInputValidatorTemplate divInputValidatorTemplate = mo17515a instanceof DivInputValidatorTemplate ? (DivInputValidatorTemplate) mo17515a : null;
            if (divInputValidatorTemplate != null) {
                return divInputValidatorTemplate.m17648b(env, it);
            }
            throw ParsingExceptionKt.m17528m(it, "type", str);
        }
    };

    /* compiled from: DivInputValidator.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivInputValidator$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivInputValidator.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivInputValidator$Expression;", "Lcom/yandex/div2/DivInputValidator;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Expression extends DivInputValidator {
        public Expression(@NotNull DivInputValidatorExpression divInputValidatorExpression) {
            super(null);
        }
    }

    /* compiled from: DivInputValidator.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivInputValidator$Regex;", "Lcom/yandex/div2/DivInputValidator;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Regex extends DivInputValidator {
        public Regex(@NotNull DivInputValidatorRegex divInputValidatorRegex) {
            super(null);
        }
    }

    public DivInputValidator() {
    }

    public DivInputValidator(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
