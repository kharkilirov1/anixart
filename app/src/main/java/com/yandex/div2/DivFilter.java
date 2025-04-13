package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivFilter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivFilter.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivFilter;", "Lcom/yandex/div/json/JSONSerializable;", "Blur", "Companion", "Lcom/yandex/div2/DivFilter$Blur;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivFilter implements JSONSerializable {

    /* renamed from: a */
    @NotNull
    public static final Companion f35717a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivFilter> f35718b = new Function2<ParsingEnvironment, JSONObject, DivFilter>() { // from class: com.yandex.div2.DivFilter$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivFilter invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivFilter.Companion companion = DivFilter.f35717a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF33840b(), env);
            String str = (String) m17338a;
            if (Intrinsics.m32174c(str, "blur")) {
                return new DivFilter.Blur(DivBlur.f34777b.m17590a(env, it));
            }
            JsonTemplate<?> mo17515a = env.mo17207b().mo17515a(str, it);
            DivFilterTemplate divFilterTemplate = mo17515a instanceof DivFilterTemplate ? (DivFilterTemplate) mo17515a : null;
            if (divFilterTemplate != null) {
                return divFilterTemplate.m17615b(env, it);
            }
            throw ParsingExceptionKt.m17528m(it, "type", str);
        }
    };

    /* compiled from: DivFilter.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivFilter$Blur;", "Lcom/yandex/div2/DivFilter;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Blur extends DivFilter {

        /* renamed from: c */
        @NotNull
        public final DivBlur f35719c;

        public Blur(@NotNull DivBlur divBlur) {
            super(null);
            this.f35719c = divBlur;
        }
    }

    /* compiled from: DivFilter.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivFilter$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public DivFilter() {
    }

    public DivFilter(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
