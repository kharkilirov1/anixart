package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivRadialGradientRelativeCenter.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivRadialGradientRelativeCenter;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivRadialGradientRelativeCenter implements JSONSerializable {

    /* renamed from: b */
    @NotNull
    public static final Companion f38126b = new Companion(null);

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Expression<Double> f38127a;

    /* compiled from: DivRadialGradientRelativeCenter.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivRadialGradientRelativeCenter$Companion;", "", "", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivRadialGradientRelativeCenter m17680a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivRadialGradientRelativeCenter(JsonParser.m17317i(jSONObject, "value", ParsingConvertersKt.f33830d, parsingEnvironment.getF34328a(), parsingEnvironment, TypeHelpersKt.f33851d));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        DivRadialGradientRelativeCenter$Companion$CREATOR$1 divRadialGradientRelativeCenter$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivRadialGradientRelativeCenter>() { // from class: com.yandex.div2.DivRadialGradientRelativeCenter$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivRadialGradientRelativeCenter invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivRadialGradientRelativeCenter.f38126b.m17680a(env, it);
            }
        };
    }

    @DivModelInternalApi
    public DivRadialGradientRelativeCenter(@NotNull Expression<Double> value) {
        Intrinsics.m32179h(value, "value");
        this.f38127a = value;
    }
}
