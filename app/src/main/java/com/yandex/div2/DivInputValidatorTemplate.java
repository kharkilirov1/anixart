package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivInputValidator;
import com.yandex.div2.DivInputValidatorTemplate;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivInputValidatorTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u0004\u0005\u0006\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m31884d2 = {"Lcom/yandex/div2/DivInputValidatorTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivInputValidator;", "Companion", "Expression", "Regex", "Lcom/yandex/div2/DivInputValidatorTemplate$Regex;", "Lcom/yandex/div2/DivInputValidatorTemplate$Expression;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivInputValidatorTemplate implements JSONSerializable, JsonTemplate<DivInputValidator> {

    /* renamed from: a */
    @NotNull
    public static final Companion f37678a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivInputValidatorTemplate> f37679b = new Function2<ParsingEnvironment, JSONObject, DivInputValidatorTemplate>() { // from class: com.yandex.div2.DivInputValidatorTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivInputValidatorTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            DivInputValidatorTemplate expression;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivInputValidatorTemplate.Companion companion = DivInputValidatorTemplate.f37678a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF34328a(), env);
            String str = (String) m17338a;
            JsonTemplate<?> jsonTemplate = env.mo17207b().get(str);
            DivInputValidatorTemplate divInputValidatorTemplate = jsonTemplate instanceof DivInputValidatorTemplate ? (DivInputValidatorTemplate) jsonTemplate : null;
            if (divInputValidatorTemplate != null) {
                if (divInputValidatorTemplate instanceof DivInputValidatorTemplate.Regex) {
                    str = "regex";
                } else {
                    if (!(divInputValidatorTemplate instanceof DivInputValidatorTemplate.Expression)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "expression";
                }
            }
            if (Intrinsics.m32174c(str, "regex")) {
                expression = new DivInputValidatorTemplate.Regex(new DivInputValidatorRegexTemplate(env, (DivInputValidatorRegexTemplate) (divInputValidatorTemplate != null ? divInputValidatorTemplate.m17649c() : null), false, it));
            } else {
                if (!Intrinsics.m32174c(str, "expression")) {
                    throw ParsingExceptionKt.m17528m(it, "type", str);
                }
                expression = new DivInputValidatorTemplate.Expression(new DivInputValidatorExpressionTemplate(env, (DivInputValidatorExpressionTemplate) (divInputValidatorTemplate != null ? divInputValidatorTemplate.m17649c() : null), false, it));
            }
            return expression;
        }
    };

    /* compiled from: DivInputValidatorTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivInputValidatorTemplate$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivInputValidatorTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivInputValidatorTemplate$Expression;", "Lcom/yandex/div2/DivInputValidatorTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Expression extends DivInputValidatorTemplate {

        /* renamed from: c */
        @NotNull
        public final DivInputValidatorExpressionTemplate f37681c;

        public Expression(@NotNull DivInputValidatorExpressionTemplate divInputValidatorExpressionTemplate) {
            super(null);
            this.f37681c = divInputValidatorExpressionTemplate;
        }
    }

    /* compiled from: DivInputValidatorTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivInputValidatorTemplate$Regex;", "Lcom/yandex/div2/DivInputValidatorTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Regex extends DivInputValidatorTemplate {

        /* renamed from: c */
        @NotNull
        public final DivInputValidatorRegexTemplate f37682c;

        public Regex(@NotNull DivInputValidatorRegexTemplate divInputValidatorRegexTemplate) {
            super(null);
            this.f37682c = divInputValidatorRegexTemplate;
        }
    }

    public DivInputValidatorTemplate() {
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivInputValidator mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        if (this instanceof Regex) {
            return new DivInputValidator.Regex(((Regex) this).f37682c.mo17514a(env, data));
        }
        if (this instanceof Expression) {
            return new DivInputValidator.Expression(((Expression) this).f37681c.mo17514a(env, data));
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    /* renamed from: c */
    public Object m17649c() {
        if (this instanceof Regex) {
            return ((Regex) this).f37682c;
        }
        if (this instanceof Expression) {
            return ((Expression) this).f37681c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public DivInputValidatorTemplate(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
