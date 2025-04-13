package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div2.DivDimension;
import com.yandex.div2.DivPoint;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivPoint.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivPoint;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivPoint implements JSONSerializable {

    /* renamed from: c */
    @NotNull
    public static final Companion f38064c = new Companion(null);

    /* renamed from: d */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivPoint> f38065d = new Function2<ParsingEnvironment, JSONObject, DivPoint>() { // from class: com.yandex.div2.DivPoint$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivPoint invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivPoint.Companion companion = DivPoint.f38064c;
            env.getF33840b();
            DivDimension.Companion companion2 = DivDimension.f35517c;
            Function2<ParsingEnvironment, JSONObject, DivDimension> function2 = DivDimension.f35520f;
            C2904b c2904b = C2904b.f33858e;
            return new DivPoint((DivDimension) JsonParser.m17313e(it, "x", function2, c2904b, env), (DivDimension) JsonParser.m17313e(it, "y", function2, c2904b, env));
        }
    };

    /* renamed from: a */
    @JvmField
    @NotNull
    public final DivDimension f38066a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final DivDimension f38067b;

    /* compiled from: DivPoint.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivPoint$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @DivModelInternalApi
    public DivPoint(@NotNull DivDimension x, @NotNull DivDimension y) {
        Intrinsics.m32179h(x, "x");
        Intrinsics.m32179h(y, "y");
        this.f38066a = x;
        this.f38067b = y;
    }
}
