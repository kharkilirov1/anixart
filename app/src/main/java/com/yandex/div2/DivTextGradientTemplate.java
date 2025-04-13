package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivTextGradient;
import com.yandex.div2.DivTextGradientTemplate;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTextGradientTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u0004\u0005\u0006\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m31884d2 = {"Lcom/yandex/div2/DivTextGradientTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivTextGradient;", "Companion", "Linear", "Radial", "Lcom/yandex/div2/DivTextGradientTemplate$Linear;", "Lcom/yandex/div2/DivTextGradientTemplate$Radial;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivTextGradientTemplate implements JSONSerializable, JsonTemplate<DivTextGradient> {

    /* renamed from: a */
    @NotNull
    public static final Companion f40060a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivTextGradientTemplate> f40061b = new Function2<ParsingEnvironment, JSONObject, DivTextGradientTemplate>() { // from class: com.yandex.div2.DivTextGradientTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivTextGradientTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            DivTextGradientTemplate radial;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivTextGradientTemplate.Companion companion = DivTextGradientTemplate.f40060a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF34328a(), env);
            String str = (String) m17338a;
            JsonTemplate<?> jsonTemplate = env.mo17207b().get(str);
            DivTextGradientTemplate divTextGradientTemplate = jsonTemplate instanceof DivTextGradientTemplate ? (DivTextGradientTemplate) jsonTemplate : null;
            if (divTextGradientTemplate != null) {
                if (divTextGradientTemplate instanceof DivTextGradientTemplate.Linear) {
                    str = "gradient";
                } else {
                    if (!(divTextGradientTemplate instanceof DivTextGradientTemplate.Radial)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "radial_gradient";
                }
            }
            if (Intrinsics.m32174c(str, "gradient")) {
                radial = new DivTextGradientTemplate.Linear(new DivLinearGradientTemplate(env, (DivLinearGradientTemplate) (divTextGradientTemplate != null ? divTextGradientTemplate.m17719c() : null), false, it));
            } else {
                if (!Intrinsics.m32174c(str, "radial_gradient")) {
                    throw ParsingExceptionKt.m17528m(it, "type", str);
                }
                radial = new DivTextGradientTemplate.Radial(new DivRadialGradientTemplate(env, (DivRadialGradientTemplate) (divTextGradientTemplate != null ? divTextGradientTemplate.m17719c() : null), false, it));
            }
            return radial;
        }
    };

    /* compiled from: DivTextGradientTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivTextGradientTemplate$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivTextGradientTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivTextGradientTemplate$Linear;", "Lcom/yandex/div2/DivTextGradientTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Linear extends DivTextGradientTemplate {

        /* renamed from: c */
        @NotNull
        public final DivLinearGradientTemplate f40063c;

        public Linear(@NotNull DivLinearGradientTemplate divLinearGradientTemplate) {
            super(null);
            this.f40063c = divLinearGradientTemplate;
        }
    }

    /* compiled from: DivTextGradientTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivTextGradientTemplate$Radial;", "Lcom/yandex/div2/DivTextGradientTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Radial extends DivTextGradientTemplate {

        /* renamed from: c */
        @NotNull
        public final DivRadialGradientTemplate f40064c;

        public Radial(@NotNull DivRadialGradientTemplate divRadialGradientTemplate) {
            super(null);
            this.f40064c = divRadialGradientTemplate;
        }
    }

    public DivTextGradientTemplate() {
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivTextGradient mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        if (this instanceof Linear) {
            return new DivTextGradient.Linear(((Linear) this).f40063c.mo17514a(env, data));
        }
        if (this instanceof Radial) {
            return new DivTextGradient.Radial(((Radial) this).f40064c.mo17514a(env, data));
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    /* renamed from: c */
    public Object m17719c() {
        if (this instanceof Linear) {
            return ((Linear) this).f40063c;
        }
        if (this instanceof Radial) {
            return ((Radial) this).f40064c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public DivTextGradientTemplate(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
