package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivIndicatorItemPlacement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivIndicatorItemPlacement.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivIndicatorItemPlacement;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "Default", "Stretch", "Lcom/yandex/div2/DivIndicatorItemPlacement$Default;", "Lcom/yandex/div2/DivIndicatorItemPlacement$Stretch;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivIndicatorItemPlacement implements JSONSerializable {

    /* renamed from: a */
    @NotNull
    public static final Companion f37099a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivIndicatorItemPlacement> f37100b = new Function2<ParsingEnvironment, JSONObject, DivIndicatorItemPlacement>() { // from class: com.yandex.div2.DivIndicatorItemPlacement$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivIndicatorItemPlacement invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivIndicatorItemPlacement.Companion companion = DivIndicatorItemPlacement.f37099a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF34328a(), env);
            String str = (String) m17338a;
            if (Intrinsics.m32174c(str, "default")) {
                return new DivIndicatorItemPlacement.Default(DivDefaultIndicatorItemPlacement.f35507b.m17610a(env, it));
            }
            if (Intrinsics.m32174c(str, "stretch")) {
                return new DivIndicatorItemPlacement.Stretch(DivStretchIndicatorItemPlacement.f39415c.m17709a(env, it));
            }
            JsonTemplate<?> mo17515a = env.mo17207b().mo17515a(str, it);
            DivIndicatorItemPlacementTemplate divIndicatorItemPlacementTemplate = mo17515a instanceof DivIndicatorItemPlacementTemplate ? (DivIndicatorItemPlacementTemplate) mo17515a : null;
            if (divIndicatorItemPlacementTemplate != null) {
                return divIndicatorItemPlacementTemplate.m17636b(env, it);
            }
            throw ParsingExceptionKt.m17528m(it, "type", str);
        }
    };

    /* compiled from: DivIndicatorItemPlacement.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivIndicatorItemPlacement$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivIndicatorItemPlacement.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivIndicatorItemPlacement$Default;", "Lcom/yandex/div2/DivIndicatorItemPlacement;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Default extends DivIndicatorItemPlacement {

        /* renamed from: c */
        @NotNull
        public final DivDefaultIndicatorItemPlacement f37102c;

        public Default(@NotNull DivDefaultIndicatorItemPlacement divDefaultIndicatorItemPlacement) {
            super(null);
            this.f37102c = divDefaultIndicatorItemPlacement;
        }
    }

    /* compiled from: DivIndicatorItemPlacement.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivIndicatorItemPlacement$Stretch;", "Lcom/yandex/div2/DivIndicatorItemPlacement;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Stretch extends DivIndicatorItemPlacement {

        /* renamed from: c */
        @NotNull
        public final DivStretchIndicatorItemPlacement f37103c;

        public Stretch(@NotNull DivStretchIndicatorItemPlacement divStretchIndicatorItemPlacement) {
            super(null);
            this.f37103c = divStretchIndicatorItemPlacement;
        }
    }

    public DivIndicatorItemPlacement() {
    }

    public DivIndicatorItemPlacement(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
