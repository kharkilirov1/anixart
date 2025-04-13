package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
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

/* compiled from: DivMatchParentSize.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivMatchParentSize;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivMatchParentSize implements JSONSerializable {

    /* renamed from: b */
    @NotNull
    public static final Companion f37710b = new Companion(null);

    /* renamed from: a */
    @JvmField
    @Nullable
    public final Expression<Double> f37711a;

    /* compiled from: DivMatchParentSize.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, m31884d2 = {"Lcom/yandex/div2/DivMatchParentSize$Companion;", "", "", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "WEIGHT_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "WEIGHT_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivMatchParentSize m17653a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            Function1<Number, Double> function1 = ParsingConvertersKt.f33830d;
            Companion companion = DivMatchParentSize.f37710b;
            return new DivMatchParentSize(JsonParser.m17327s(jSONObject, "weight", function1, C3076y.f42173d, f34328a, parsingEnvironment, TypeHelpersKt.f33851d));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        DivMatchParentSize$Companion$CREATOR$1 divMatchParentSize$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivMatchParentSize>() { // from class: com.yandex.div2.DivMatchParentSize$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivMatchParentSize invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivMatchParentSize.f37710b.m17653a(env, it);
            }
        };
    }

    @DivModelInternalApi
    public DivMatchParentSize() {
        this(null, 1);
    }

    @DivModelInternalApi
    public DivMatchParentSize(@Nullable Expression<Double> expression) {
        this.f37711a = expression;
    }

    public DivMatchParentSize(Expression expression, int i2) {
        this.f37711a = null;
    }
}
