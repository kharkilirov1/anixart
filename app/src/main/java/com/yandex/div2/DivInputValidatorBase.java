package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivInputValidatorBase;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivInputValidatorBase.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivInputValidatorBase;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivInputValidatorBase implements JSONSerializable {

    /* renamed from: a */
    @NotNull
    public static final Companion f37604a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Expression<Boolean> f37605b = Expression.f34334a.m17539a(Boolean.FALSE);

    /* renamed from: c */
    @NotNull
    public static final ValueValidator<String> f37606c = C3073v.f42113x;

    /* renamed from: d */
    @NotNull
    public static final ValueValidator<String> f37607d = C3073v.f42114y;

    /* compiled from: DivInputValidatorBase.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\t¨\u0006\r"}, m31884d2 = {"Lcom/yandex/div2/DivInputValidatorBase$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "ALLOW_EMPTY_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "LABEL_ID_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "LABEL_ID_VALIDATOR", "VARIABLE_TEMPLATE_VALIDATOR", "VARIABLE_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        DivInputValidatorBase$Companion$CREATOR$1 divInputValidatorBase$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivInputValidatorBase>() { // from class: com.yandex.div2.DivInputValidatorBase$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivInputValidatorBase invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                DivInputValidatorBase.Companion companion = DivInputValidatorBase.f37604a;
                ParsingErrorLogger f34328a = env.getF34328a();
                Function1<Object, Boolean> function1 = ParsingConvertersKt.f33829c;
                Expression<Boolean> expression = DivInputValidatorBase.f37605b;
                Expression<Boolean> m17330v = JsonParser.m17330v(it, "allow_empty", function1, f34328a, env, expression, TypeHelpersKt.f33848a);
                if (m17330v != null) {
                    expression = m17330v;
                }
                return new DivInputValidatorBase(expression, JsonParser.m17325q(it, "label_id", DivInputValidatorBase.f37606c, f34328a, env, TypeHelpersKt.f33850c), (String) JsonParser.m17323o(it, "variable", DivInputValidatorBase.f37607d, f34328a, env));
            }
        };
    }

    @DivModelInternalApi
    public DivInputValidatorBase(@NotNull Expression<Boolean> allowEmpty, @Nullable Expression<String> expression, @Nullable String str) {
        Intrinsics.m32179h(allowEmpty, "allowEmpty");
    }

    @DivModelInternalApi
    public DivInputValidatorBase() {
        this(f37605b, null, null);
    }
}
