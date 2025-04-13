package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivCount;
import com.yandex.div2.DivInfinityCount;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivCount.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivCount;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "Fixed", "Infinity", "Lcom/yandex/div2/DivCount$Infinity;", "Lcom/yandex/div2/DivCount$Fixed;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivCount implements JSONSerializable {

    /* renamed from: a */
    @NotNull
    public static final Companion f35238a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivCount> f35239b = new Function2<ParsingEnvironment, JSONObject, DivCount>() { // from class: com.yandex.div2.DivCount$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivCount invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivCount.Companion companion = DivCount.f35238a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF33097d(), env);
            String str = (String) m17338a;
            if (Intrinsics.m32174c(str, "infinity")) {
                DivInfinityCount.Companion companion2 = DivInfinityCount.f37275a;
                env.getF33097d();
                return new DivCount.Infinity(new DivInfinityCount());
            }
            if (Intrinsics.m32174c(str, "fixed")) {
                return new DivCount.Fixed(DivFixedCount.f35725a.m17616a(env, it));
            }
            JsonTemplate<?> mo17515a = env.mo17207b().mo17515a(str, it);
            DivCountTemplate divCountTemplate = mo17515a instanceof DivCountTemplate ? (DivCountTemplate) mo17515a : null;
            if (divCountTemplate != null) {
                return divCountTemplate.m17602b(env, it);
            }
            throw ParsingExceptionKt.m17528m(it, "type", str);
        }
    };

    /* compiled from: DivCount.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivCount$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivCount.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivCount$Fixed;", "Lcom/yandex/div2/DivCount;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Fixed extends DivCount {
        public Fixed(@NotNull DivFixedCount divFixedCount) {
            super(null);
        }
    }

    /* compiled from: DivCount.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivCount$Infinity;", "Lcom/yandex/div2/DivCount;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Infinity extends DivCount {
        public Infinity(@NotNull DivInfinityCount divInfinityCount) {
            super(null);
        }
    }

    public DivCount() {
    }

    public DivCount(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
