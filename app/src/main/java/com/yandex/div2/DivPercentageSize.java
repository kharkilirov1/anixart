package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivPercentageSize;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivPercentageSize.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivPercentageSize;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivPercentageSize implements JSONSerializable {

    /* renamed from: b */
    @NotNull
    public static final Companion f38017b = new Companion(null);

    /* renamed from: c */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivPercentageSize> f38018c = new Function2<ParsingEnvironment, JSONObject, DivPercentageSize>() { // from class: com.yandex.div2.DivPercentageSize$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivPercentageSize invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivPercentageSize.Companion companion = DivPercentageSize.f38017b;
            ParsingErrorLogger f33097d = env.getF33097d();
            Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
            DivPercentageSize.Companion companion2 = DivPercentageSize.f38017b;
            return new DivPercentageSize(JsonParser.m17316h(it, "value", function1, C3076y.f42191v, f33097d, TypeHelpersKt.f33851d));
        }
    };

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Expression<Double> f38019a;

    /* compiled from: DivPercentageSize.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, m31884d2 = {"Lcom/yandex/div2/DivPercentageSize$Companion;", "", "", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "VALUE_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "VALUE_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @DivModelInternalApi
    public DivPercentageSize(@NotNull Expression<Double> value) {
        Intrinsics.m32179h(value, "value");
        this.f38019a = value;
    }
}
