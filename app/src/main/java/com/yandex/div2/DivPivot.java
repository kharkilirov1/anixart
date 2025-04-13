package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivPivot;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivPivot.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivPivot;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "Fixed", "Percentage", "Lcom/yandex/div2/DivPivot$Fixed;", "Lcom/yandex/div2/DivPivot$Percentage;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivPivot implements JSONSerializable {

    /* renamed from: a */
    @NotNull
    public static final Companion f38028a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivPivot> f38029b = new Function2<ParsingEnvironment, JSONObject, DivPivot>() { // from class: com.yandex.div2.DivPivot$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivPivot invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivPivot.Companion companion = DivPivot.f38028a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF34328a(), env);
            String str = (String) m17338a;
            if (Intrinsics.m32174c(str, "pivot-fixed")) {
                return new DivPivot.Fixed(DivPivotFixed.f38033c.m17665a(env, it));
            }
            if (Intrinsics.m32174c(str, "pivot-percentage")) {
                return new DivPivot.Percentage(DivPivotPercentage.f38051b.m17667a(env, it));
            }
            JsonTemplate<?> mo17515a = env.mo17207b().mo17515a(str, it);
            DivPivotTemplate divPivotTemplate = mo17515a instanceof DivPivotTemplate ? (DivPivotTemplate) mo17515a : null;
            if (divPivotTemplate != null) {
                return divPivotTemplate.m17669b(env, it);
            }
            throw ParsingExceptionKt.m17528m(it, "type", str);
        }
    };

    /* compiled from: DivPivot.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivPivot$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivPivot.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivPivot$Fixed;", "Lcom/yandex/div2/DivPivot;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Fixed extends DivPivot {

        /* renamed from: c */
        @NotNull
        public final DivPivotFixed f38031c;

        public Fixed(@NotNull DivPivotFixed divPivotFixed) {
            super(null);
            this.f38031c = divPivotFixed;
        }
    }

    /* compiled from: DivPivot.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivPivot$Percentage;", "Lcom/yandex/div2/DivPivot;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Percentage extends DivPivot {

        /* renamed from: c */
        @NotNull
        public final DivPivotPercentage f38032c;

        public Percentage(@NotNull DivPivotPercentage divPivotPercentage) {
            super(null);
            this.f38032c = divPivotPercentage;
        }
    }

    public DivPivot() {
    }

    public DivPivot(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
