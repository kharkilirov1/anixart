package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div2.DivInfinityCount;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivInfinityCount.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivInfinityCount;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivInfinityCount implements JSONSerializable {

    /* renamed from: a */
    @NotNull
    public static final Companion f37275a = new Companion(null);

    /* compiled from: DivInfinityCount.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivInfinityCount$Companion;", "", "", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        DivInfinityCount$Companion$CREATOR$1 divInfinityCount$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivInfinityCount>() { // from class: com.yandex.div2.DivInfinityCount$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivInfinityCount invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                DivInfinityCount.Companion companion = DivInfinityCount.f37275a;
                env.mo17208a();
                return new DivInfinityCount();
            }
        };
    }

    @DivModelInternalApi
    public DivInfinityCount() {
    }
}
