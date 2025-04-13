package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivTextRangeBackground;
import com.yandex.div2.DivTextRangeBackgroundTemplate;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTextRangeBackgroundTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0004\u0005\u0082\u0001\u0001\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivTextRangeBackgroundTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivTextRangeBackground;", "Companion", "Solid", "Lcom/yandex/div2/DivTextRangeBackgroundTemplate$Solid;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivTextRangeBackgroundTemplate implements JSONSerializable, JsonTemplate<DivTextRangeBackground> {

    /* renamed from: a */
    @NotNull
    public static final Companion f40069a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivTextRangeBackgroundTemplate> f40070b = new Function2<ParsingEnvironment, JSONObject, DivTextRangeBackgroundTemplate>() { // from class: com.yandex.div2.DivTextRangeBackgroundTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivTextRangeBackgroundTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivTextRangeBackgroundTemplate.Companion companion = DivTextRangeBackgroundTemplate.f40069a;
            DivSolidBackgroundTemplate divSolidBackgroundTemplate = null;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF34328a(), env);
            String str = (String) m17338a;
            JsonTemplate<?> jsonTemplate = env.mo17207b().get(str);
            DivTextRangeBackgroundTemplate divTextRangeBackgroundTemplate = jsonTemplate instanceof DivTextRangeBackgroundTemplate ? (DivTextRangeBackgroundTemplate) jsonTemplate : null;
            if (divTextRangeBackgroundTemplate != null) {
                if (!(divTextRangeBackgroundTemplate instanceof DivTextRangeBackgroundTemplate.Solid)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "solid";
            }
            if (!Intrinsics.m32174c(str, "solid")) {
                throw ParsingExceptionKt.m17528m(it, "type", str);
            }
            if (divTextRangeBackgroundTemplate != null) {
                if (!(divTextRangeBackgroundTemplate instanceof DivTextRangeBackgroundTemplate.Solid)) {
                    throw new NoWhenBranchMatchedException();
                }
                divSolidBackgroundTemplate = ((DivTextRangeBackgroundTemplate.Solid) divTextRangeBackgroundTemplate).f40072c;
            }
            return new DivTextRangeBackgroundTemplate.Solid(new DivSolidBackgroundTemplate(env, divSolidBackgroundTemplate, false, it));
        }
    };

    /* compiled from: DivTextRangeBackgroundTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivTextRangeBackgroundTemplate$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivTextRangeBackgroundTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivTextRangeBackgroundTemplate$Solid;", "Lcom/yandex/div2/DivTextRangeBackgroundTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Solid extends DivTextRangeBackgroundTemplate {

        /* renamed from: c */
        @NotNull
        public final DivSolidBackgroundTemplate f40072c;

        public Solid(@NotNull DivSolidBackgroundTemplate divSolidBackgroundTemplate) {
            super(null);
            this.f40072c = divSolidBackgroundTemplate;
        }
    }

    public DivTextRangeBackgroundTemplate() {
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivTextRangeBackground mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        if (this instanceof Solid) {
            return new DivTextRangeBackground.Solid(((Solid) this).f40072c.mo17514a(env, data));
        }
        throw new NoWhenBranchMatchedException();
    }

    public DivTextRangeBackgroundTemplate(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
