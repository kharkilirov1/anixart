package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivPagerLayoutMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivPagerLayoutMode.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivPagerLayoutMode;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "NeighbourPageSize", "PageSize", "Lcom/yandex/div2/DivPagerLayoutMode$PageSize;", "Lcom/yandex/div2/DivPagerLayoutMode$NeighbourPageSize;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivPagerLayoutMode implements JSONSerializable {

    /* renamed from: a */
    @NotNull
    public static final Companion f37823a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivPagerLayoutMode> f37824b = new Function2<ParsingEnvironment, JSONObject, DivPagerLayoutMode>() { // from class: com.yandex.div2.DivPagerLayoutMode$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivPagerLayoutMode invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivPagerLayoutMode.Companion companion = DivPagerLayoutMode.f37823a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF34328a(), env);
            String str = (String) m17338a;
            if (Intrinsics.m32174c(str, "percentage")) {
                return new DivPagerLayoutMode.PageSize(DivPageSize.f37740b.m17659a(env, it));
            }
            if (Intrinsics.m32174c(str, "fixed")) {
                return new DivPagerLayoutMode.NeighbourPageSize(DivNeighbourPageSize.f37718b.m17655a(env, it));
            }
            JsonTemplate<?> mo17515a = env.mo17207b().mo17515a(str, it);
            DivPagerLayoutModeTemplate divPagerLayoutModeTemplate = mo17515a instanceof DivPagerLayoutModeTemplate ? (DivPagerLayoutModeTemplate) mo17515a : null;
            if (divPagerLayoutModeTemplate != null) {
                return divPagerLayoutModeTemplate.m17662b(env, it);
            }
            throw ParsingExceptionKt.m17528m(it, "type", str);
        }
    };

    /* compiled from: DivPagerLayoutMode.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivPagerLayoutMode$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivPagerLayoutMode.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivPagerLayoutMode$NeighbourPageSize;", "Lcom/yandex/div2/DivPagerLayoutMode;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class NeighbourPageSize extends DivPagerLayoutMode {

        /* renamed from: c */
        @NotNull
        public final DivNeighbourPageSize f37826c;

        public NeighbourPageSize(@NotNull DivNeighbourPageSize divNeighbourPageSize) {
            super(null);
            this.f37826c = divNeighbourPageSize;
        }
    }

    /* compiled from: DivPagerLayoutMode.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivPagerLayoutMode$PageSize;", "Lcom/yandex/div2/DivPagerLayoutMode;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class PageSize extends DivPagerLayoutMode {

        /* renamed from: c */
        @NotNull
        public final DivPageSize f37827c;

        public PageSize(@NotNull DivPageSize divPageSize) {
            super(null);
            this.f37827c = divPageSize;
        }
    }

    public DivPagerLayoutMode() {
    }

    public DivPagerLayoutMode(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
