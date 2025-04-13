package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivCount;
import com.yandex.div2.DivCountTemplate;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivCountTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u0004\u0005\u0006\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m31884d2 = {"Lcom/yandex/div2/DivCountTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivCount;", "Companion", "Fixed", "Infinity", "Lcom/yandex/div2/DivCountTemplate$Infinity;", "Lcom/yandex/div2/DivCountTemplate$Fixed;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivCountTemplate implements JSONSerializable, JsonTemplate<DivCount> {

    /* renamed from: a */
    @NotNull
    public static final Companion f35241a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivCountTemplate> f35242b = new Function2<ParsingEnvironment, JSONObject, DivCountTemplate>() { // from class: com.yandex.div2.DivCountTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivCountTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            DivCountTemplate fixed;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivCountTemplate.Companion companion = DivCountTemplate.f35241a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF34328a(), env);
            String str = (String) m17338a;
            JsonTemplate<?> jsonTemplate = env.mo17207b().get(str);
            DivCountTemplate divCountTemplate = jsonTemplate instanceof DivCountTemplate ? (DivCountTemplate) jsonTemplate : null;
            if (divCountTemplate != null) {
                if (divCountTemplate instanceof DivCountTemplate.Infinity) {
                    str = "infinity";
                } else {
                    if (!(divCountTemplate instanceof DivCountTemplate.Fixed)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "fixed";
                }
            }
            if (Intrinsics.m32174c(str, "infinity")) {
                fixed = new DivCountTemplate.Infinity(new DivInfinityCountTemplate(env, it));
            } else {
                if (!Intrinsics.m32174c(str, "fixed")) {
                    throw ParsingExceptionKt.m17528m(it, "type", str);
                }
                fixed = new DivCountTemplate.Fixed(new DivFixedCountTemplate(env, (DivFixedCountTemplate) (divCountTemplate != null ? divCountTemplate.m17603c() : null), false, it));
            }
            return fixed;
        }
    };

    /* compiled from: DivCountTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivCountTemplate$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivCountTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivCountTemplate$Fixed;", "Lcom/yandex/div2/DivCountTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Fixed extends DivCountTemplate {

        /* renamed from: c */
        @NotNull
        public final DivFixedCountTemplate f35244c;

        public Fixed(@NotNull DivFixedCountTemplate divFixedCountTemplate) {
            super(null);
            this.f35244c = divFixedCountTemplate;
        }
    }

    /* compiled from: DivCountTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivCountTemplate$Infinity;", "Lcom/yandex/div2/DivCountTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Infinity extends DivCountTemplate {

        /* renamed from: c */
        @NotNull
        public final DivInfinityCountTemplate f35245c;

        public Infinity(@NotNull DivInfinityCountTemplate divInfinityCountTemplate) {
            super(null);
            this.f35245c = divInfinityCountTemplate;
        }
    }

    public DivCountTemplate() {
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivCount mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        if (this instanceof Infinity) {
            Objects.requireNonNull(((Infinity) this).f35245c);
            return new DivCount.Infinity(new DivInfinityCount());
        }
        if (this instanceof Fixed) {
            return new DivCount.Fixed(((Fixed) this).f35244c.mo17514a(env, data));
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    /* renamed from: c */
    public Object m17603c() {
        if (this instanceof Infinity) {
            return ((Infinity) this).f35245c;
        }
        if (this instanceof Fixed) {
            return ((Fixed) this).f35244c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public DivCountTemplate(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
