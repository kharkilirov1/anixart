package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAspect;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivAspect.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivAspect;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivAspect implements JSONSerializable {

    /* renamed from: b */
    @NotNull
    public static final Companion f34740b = new Companion(null);

    /* renamed from: c */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivAspect> f34741c = new Function2<ParsingEnvironment, JSONObject, DivAspect>() { // from class: com.yandex.div2.DivAspect$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivAspect invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivAspect.Companion companion = DivAspect.f34740b;
            ParsingErrorLogger f33097d = env.getF33097d();
            Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
            DivAspect.Companion companion2 = DivAspect.f34740b;
            return new DivAspect(JsonParser.m17316h(it, "ratio", function1, C3035b.f41125x, f33097d, TypeHelpersKt.f33851d));
        }
    };

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Expression<Double> f34742a;

    /* compiled from: DivAspect.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivAspect$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "RATIO_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "RATIO_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @DivModelInternalApi
    public DivAspect(@NotNull Expression<Double> ratio) {
        Intrinsics.m32179h(ratio, "ratio");
        this.f34742a = ratio;
    }
}
