package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivRadialGradientRelativeRadius.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div2/DivRadialGradientRelativeRadius;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "Value", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivRadialGradientRelativeRadius implements JSONSerializable {

    /* renamed from: b */
    @NotNull
    public static final Companion f38134b = new Companion(null);

    /* renamed from: c */
    @NotNull
    public static final TypeHelper<Value> f38135c;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Expression<Value> f38136a;

    /* compiled from: DivRadialGradientRelativeRadius.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m31884d2 = {"Lcom/yandex/div2/DivRadialGradientRelativeRadius$Companion;", "", "", "TYPE", "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivRadialGradientRelativeRadius$Value;", "TYPE_HELPER_VALUE", "Lcom/yandex/div/internal/parser/TypeHelper;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivRadialGradientRelativeRadius m17682a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f33840b = parsingEnvironment.getF33840b();
            Value.Converter converter = Value.f38139c;
            return new DivRadialGradientRelativeRadius(JsonParser.m17317i(jSONObject, "value", Value.f38140d, f33840b, parsingEnvironment, DivRadialGradientRelativeRadius.f38135c));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivRadialGradientRelativeRadius.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivRadialGradientRelativeRadius$Value;", "", "Converter", "NEAREST_CORNER", "FARTHEST_CORNER", "NEAREST_SIDE", "FARTHEST_SIDE", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public enum Value {
        NEAREST_CORNER("nearest_corner"),
        FARTHEST_CORNER("farthest_corner"),
        NEAREST_SIDE("nearest_side"),
        FARTHEST_SIDE("farthest_side");


        /* renamed from: c */
        @NotNull
        public static final Converter f38139c = new Converter(null);

        /* renamed from: d */
        @NotNull
        public static final Function1<String, Value> f38140d = new Function1<String, Value>() { // from class: com.yandex.div2.DivRadialGradientRelativeRadius$Value$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            public DivRadialGradientRelativeRadius.Value invoke(String str) {
                String string = str;
                Intrinsics.m32179h(string, "string");
                DivRadialGradientRelativeRadius.Value value = DivRadialGradientRelativeRadius.Value.NEAREST_CORNER;
                if (Intrinsics.m32174c(string, "nearest_corner")) {
                    return value;
                }
                DivRadialGradientRelativeRadius.Value value2 = DivRadialGradientRelativeRadius.Value.FARTHEST_CORNER;
                if (Intrinsics.m32174c(string, "farthest_corner")) {
                    return value2;
                }
                DivRadialGradientRelativeRadius.Value value3 = DivRadialGradientRelativeRadius.Value.NEAREST_SIDE;
                if (Intrinsics.m32174c(string, "nearest_side")) {
                    return value3;
                }
                DivRadialGradientRelativeRadius.Value value4 = DivRadialGradientRelativeRadius.Value.FARTHEST_SIDE;
                if (Intrinsics.m32174c(string, "farthest_side")) {
                    return value4;
                }
                return null;
            }
        };

        /* renamed from: b */
        @NotNull
        public final String f38146b;

        /* compiled from: DivRadialGradientRelativeRadius.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivRadialGradientRelativeRadius$Value$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Converter {
            public Converter() {
            }

            public Converter(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        Value(String str) {
            this.f38146b = str;
        }
    }

    static {
        int i2 = TypeHelper.f33843a;
        f38135c = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(Value.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivRadialGradientRelativeRadius$Companion$TYPE_HELPER_VALUE$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivRadialGradientRelativeRadius.Value);
            }
        });
        DivRadialGradientRelativeRadius$Companion$CREATOR$1 divRadialGradientRelativeRadius$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivRadialGradientRelativeRadius>() { // from class: com.yandex.div2.DivRadialGradientRelativeRadius$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivRadialGradientRelativeRadius invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivRadialGradientRelativeRadius.f38134b.m17682a(env, it);
            }
        };
    }

    @DivModelInternalApi
    public DivRadialGradientRelativeRadius(@NotNull Expression<Value> value) {
        Intrinsics.m32179h(value, "value");
        this.f38136a = value;
    }
}
