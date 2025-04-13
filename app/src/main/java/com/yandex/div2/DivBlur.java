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
import org.json.JSONObject;

/* compiled from: DivBlur.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivBlur;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivBlur implements JSONSerializable {

    /* renamed from: b */
    @NotNull
    public static final Companion f34777b = new Companion(null);

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Expression<Long> f34778a;

    /* compiled from: DivBlur.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, m31884d2 = {"Lcom/yandex/div2/DivBlur$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "RADIUS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "RADIUS_VALIDATOR", "", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivBlur m17590a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f33840b = parsingEnvironment.getF33840b();
            Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
            Companion companion = DivBlur.f34777b;
            return new DivBlur(JsonParser.m17316h(jSONObject, "radius", function1, C3039d.f41215d, f33840b, TypeHelpersKt.f33849b));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        DivBlur$Companion$CREATOR$1 divBlur$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivBlur>() { // from class: com.yandex.div2.DivBlur$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivBlur invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivBlur.f34777b.m17590a(env, it);
            }
        };
    }

    @DivModelInternalApi
    public DivBlur(@NotNull Expression<Long> radius) {
        Intrinsics.m32179h(radius, "radius");
        this.f34778a = radius;
    }
}
