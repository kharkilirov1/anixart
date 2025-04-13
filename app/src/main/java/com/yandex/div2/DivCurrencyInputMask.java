package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivCurrencyInputMask.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div2/DivCurrencyInputMask;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div2/DivInputMaskBase;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivCurrencyInputMask implements JSONSerializable, DivInputMaskBase {

    /* renamed from: c */
    @NotNull
    public static final Companion f35246c = new Companion(null);

    /* renamed from: a */
    @JvmField
    @Nullable
    public final Expression<String> f35247a;

    /* renamed from: b */
    @NotNull
    public final String f35248b;

    /* compiled from: DivCurrencyInputMask.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m31884d2 = {"Lcom/yandex/div2/DivCurrencyInputMask$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "LOCALE_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "LOCALE_VALIDATOR", "RAW_TEXT_VARIABLE_TEMPLATE_VALIDATOR", "RAW_TEXT_VARIABLE_VALIDATOR", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivCurrencyInputMask m17605a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            Companion companion = DivCurrencyInputMask.f35246c;
            return new DivCurrencyInputMask(JsonParser.m17325q(jSONObject, "locale", C3043f.f41338r, f34328a, parsingEnvironment, TypeHelpersKt.f33850c), (String) JsonParser.m17311c(jSONObject, "raw_text_variable", C3043f.f41339s, f34328a, parsingEnvironment));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        DivCurrencyInputMask$Companion$CREATOR$1 divCurrencyInputMask$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivCurrencyInputMask>() { // from class: com.yandex.div2.DivCurrencyInputMask$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivCurrencyInputMask invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivCurrencyInputMask.f35246c.m17605a(env, it);
            }
        };
    }

    @DivModelInternalApi
    public DivCurrencyInputMask(@Nullable Expression<String> expression, @NotNull String rawTextVariable) {
        Intrinsics.m32179h(rawTextVariable, "rawTextVariable");
        this.f35247a = expression;
        this.f35248b = rawTextVariable;
    }

    @Override // com.yandex.div2.DivInputMaskBase
    @NotNull
    /* renamed from: a, reason: from getter */
    public String getF35248b() {
        return this.f35248b;
    }
}
