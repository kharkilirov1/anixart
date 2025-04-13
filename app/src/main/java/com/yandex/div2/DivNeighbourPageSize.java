package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div2.DivFixedSize;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivNeighbourPageSize.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivNeighbourPageSize;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivNeighbourPageSize implements JSONSerializable {

    /* renamed from: b */
    @NotNull
    public static final Companion f37718b = new Companion(null);

    /* renamed from: a */
    @JvmField
    @NotNull
    public final DivFixedSize f37719a;

    /* compiled from: DivNeighbourPageSize.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivNeighbourPageSize$Companion;", "", "", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivNeighbourPageSize m17655a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            parsingEnvironment.getF34328a();
            DivFixedSize.Companion companion = DivFixedSize.f35789c;
            return new DivNeighbourPageSize((DivFixedSize) JsonParser.m17313e(jSONObject, "neighbour_page_width", DivFixedSize.f35793g, C2904b.f33858e, parsingEnvironment));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        DivNeighbourPageSize$Companion$CREATOR$1 divNeighbourPageSize$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivNeighbourPageSize>() { // from class: com.yandex.div2.DivNeighbourPageSize$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivNeighbourPageSize invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivNeighbourPageSize.f37718b.m17655a(env, it);
            }
        };
    }

    @DivModelInternalApi
    public DivNeighbourPageSize(@NotNull DivFixedSize neighbourPageWidth) {
        Intrinsics.m32179h(neighbourPageWidth, "neighbourPageWidth");
        this.f37719a = neighbourPageWidth;
    }
}
