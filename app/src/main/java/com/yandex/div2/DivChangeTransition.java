package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivChangeTransition;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivChangeTransition.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivChangeTransition;", "Lcom/yandex/div/json/JSONSerializable;", "Bounds", "Companion", "Set", "Lcom/yandex/div2/DivChangeTransition$Set;", "Lcom/yandex/div2/DivChangeTransition$Bounds;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivChangeTransition implements JSONSerializable {

    /* renamed from: a */
    @NotNull
    public static final Companion f34856a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivChangeTransition> f34857b = new Function2<ParsingEnvironment, JSONObject, DivChangeTransition>() { // from class: com.yandex.div2.DivChangeTransition$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivChangeTransition invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivChangeTransition.Companion companion = DivChangeTransition.f34856a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF34328a(), env);
            String str = (String) m17338a;
            if (Intrinsics.m32174c(str, "set")) {
                return new DivChangeTransition.Set(DivChangeSetTransition.f34848b.m17594a(env, it));
            }
            if (Intrinsics.m32174c(str, "change_bounds")) {
                return new DivChangeTransition.Bounds(DivChangeBoundsTransition.f34816d.m17592a(env, it));
            }
            JsonTemplate<?> mo17515a = env.mo17207b().mo17515a(str, it);
            DivChangeTransitionTemplate divChangeTransitionTemplate = mo17515a instanceof DivChangeTransitionTemplate ? (DivChangeTransitionTemplate) mo17515a : null;
            if (divChangeTransitionTemplate != null) {
                return divChangeTransitionTemplate.m17596b(env, it);
            }
            throw ParsingExceptionKt.m17528m(it, "type", str);
        }
    };

    /* compiled from: DivChangeTransition.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivChangeTransition$Bounds;", "Lcom/yandex/div2/DivChangeTransition;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Bounds extends DivChangeTransition {

        /* renamed from: c */
        @NotNull
        public final DivChangeBoundsTransition f34858c;

        public Bounds(@NotNull DivChangeBoundsTransition divChangeBoundsTransition) {
            super(null);
            this.f34858c = divChangeBoundsTransition;
        }
    }

    /* compiled from: DivChangeTransition.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivChangeTransition$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivChangeTransition.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivChangeTransition$Set;", "Lcom/yandex/div2/DivChangeTransition;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Set extends DivChangeTransition {

        /* renamed from: c */
        @NotNull
        public final DivChangeSetTransition f34860c;

        public Set(@NotNull DivChangeSetTransition divChangeSetTransition) {
            super(null);
            this.f34860c = divChangeSetTransition;
        }
    }

    public DivChangeTransition() {
    }

    public DivChangeTransition(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
