package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivTextGradient;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTextGradient.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivTextGradient;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "Linear", "Radial", "Lcom/yandex/div2/DivTextGradient$Linear;", "Lcom/yandex/div2/DivTextGradient$Radial;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivTextGradient implements JSONSerializable {

    /* renamed from: a */
    @NotNull
    public static final Companion f40055a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivTextGradient> f40056b = new Function2<ParsingEnvironment, JSONObject, DivTextGradient>() { // from class: com.yandex.div2.DivTextGradient$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivTextGradient invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivTextGradient.Companion companion = DivTextGradient.f40055a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF34328a(), env);
            String str = (String) m17338a;
            if (Intrinsics.m32174c(str, "gradient")) {
                return new DivTextGradient.Linear(DivLinearGradient.f37690c.m17651a(env, it));
            }
            if (Intrinsics.m32174c(str, "radial_gradient")) {
                return new DivTextGradient.Radial(DivRadialGradient.f38078e.m17671a(env, it));
            }
            JsonTemplate<?> mo17515a = env.mo17207b().mo17515a(str, it);
            DivTextGradientTemplate divTextGradientTemplate = mo17515a instanceof DivTextGradientTemplate ? (DivTextGradientTemplate) mo17515a : null;
            if (divTextGradientTemplate != null) {
                return divTextGradientTemplate.m17718b(env, it);
            }
            throw ParsingExceptionKt.m17528m(it, "type", str);
        }
    };

    /* compiled from: DivTextGradient.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivTextGradient$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivTextGradient.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivTextGradient$Linear;", "Lcom/yandex/div2/DivTextGradient;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Linear extends DivTextGradient {

        /* renamed from: c */
        @NotNull
        public final DivLinearGradient f40058c;

        public Linear(@NotNull DivLinearGradient divLinearGradient) {
            super(null);
            this.f40058c = divLinearGradient;
        }
    }

    /* compiled from: DivTextGradient.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivTextGradient$Radial;", "Lcom/yandex/div2/DivTextGradient;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Radial extends DivTextGradient {

        /* renamed from: c */
        @NotNull
        public final DivRadialGradient f40059c;

        public Radial(@NotNull DivRadialGradient divRadialGradient) {
            super(null);
            this.f40059c = divRadialGradient;
        }
    }

    public DivTextGradient() {
    }

    @NotNull
    /* renamed from: a */
    public Object m17717a() {
        if (this instanceof Linear) {
            return ((Linear) this).f40058c;
        }
        if (this instanceof Radial) {
            return ((Radial) this).f40059c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public DivTextGradient(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
