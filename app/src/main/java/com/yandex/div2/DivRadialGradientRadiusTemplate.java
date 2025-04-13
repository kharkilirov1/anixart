package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivRadialGradientRadius;
import com.yandex.div2.DivRadialGradientRadiusTemplate;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivRadialGradientRadiusTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u0004\u0005\u0006\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m31884d2 = {"Lcom/yandex/div2/DivRadialGradientRadiusTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivRadialGradientRadius;", "Companion", "FixedSize", "Relative", "Lcom/yandex/div2/DivRadialGradientRadiusTemplate$FixedSize;", "Lcom/yandex/div2/DivRadialGradientRadiusTemplate$Relative;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivRadialGradientRadiusTemplate implements JSONSerializable, JsonTemplate<DivRadialGradientRadius> {

    /* renamed from: a */
    @NotNull
    public static final Companion f38121a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivRadialGradientRadiusTemplate> f38122b = new Function2<ParsingEnvironment, JSONObject, DivRadialGradientRadiusTemplate>() { // from class: com.yandex.div2.DivRadialGradientRadiusTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivRadialGradientRadiusTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            DivRadialGradientRadiusTemplate relative;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivRadialGradientRadiusTemplate.Companion companion = DivRadialGradientRadiusTemplate.f38121a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF34328a(), env);
            String str = (String) m17338a;
            JsonTemplate<?> jsonTemplate = env.mo17207b().get(str);
            DivRadialGradientRadiusTemplate divRadialGradientRadiusTemplate = jsonTemplate instanceof DivRadialGradientRadiusTemplate ? (DivRadialGradientRadiusTemplate) jsonTemplate : null;
            if (divRadialGradientRadiusTemplate != null) {
                if (divRadialGradientRadiusTemplate instanceof DivRadialGradientRadiusTemplate.FixedSize) {
                    str = "fixed";
                } else {
                    if (!(divRadialGradientRadiusTemplate instanceof DivRadialGradientRadiusTemplate.Relative)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "relative";
                }
            }
            if (Intrinsics.m32174c(str, "fixed")) {
                relative = new DivRadialGradientRadiusTemplate.FixedSize(new DivFixedSizeTemplate(env, (DivFixedSizeTemplate) (divRadialGradientRadiusTemplate != null ? divRadialGradientRadiusTemplate.m17679c() : null), false, it));
            } else {
                if (!Intrinsics.m32174c(str, "relative")) {
                    throw ParsingExceptionKt.m17528m(it, "type", str);
                }
                relative = new DivRadialGradientRadiusTemplate.Relative(new DivRadialGradientRelativeRadiusTemplate(env, (DivRadialGradientRelativeRadiusTemplate) (divRadialGradientRadiusTemplate != null ? divRadialGradientRadiusTemplate.m17679c() : null), false, it));
            }
            return relative;
        }
    };

    /* compiled from: DivRadialGradientRadiusTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivRadialGradientRadiusTemplate$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivRadialGradientRadiusTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivRadialGradientRadiusTemplate$FixedSize;", "Lcom/yandex/div2/DivRadialGradientRadiusTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class FixedSize extends DivRadialGradientRadiusTemplate {

        /* renamed from: c */
        @NotNull
        public final DivFixedSizeTemplate f38124c;

        public FixedSize(@NotNull DivFixedSizeTemplate divFixedSizeTemplate) {
            super(null);
            this.f38124c = divFixedSizeTemplate;
        }
    }

    /* compiled from: DivRadialGradientRadiusTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivRadialGradientRadiusTemplate$Relative;", "Lcom/yandex/div2/DivRadialGradientRadiusTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Relative extends DivRadialGradientRadiusTemplate {

        /* renamed from: c */
        @NotNull
        public final DivRadialGradientRelativeRadiusTemplate f38125c;

        public Relative(@NotNull DivRadialGradientRelativeRadiusTemplate divRadialGradientRelativeRadiusTemplate) {
            super(null);
            this.f38125c = divRadialGradientRelativeRadiusTemplate;
        }
    }

    public DivRadialGradientRadiusTemplate() {
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivRadialGradientRadius mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        if (this instanceof FixedSize) {
            return new DivRadialGradientRadius.FixedSize(((FixedSize) this).f38124c.mo17514a(env, data));
        }
        if (this instanceof Relative) {
            return new DivRadialGradientRadius.Relative(((Relative) this).f38125c.mo17514a(env, data));
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    /* renamed from: c */
    public Object m17679c() {
        if (this instanceof FixedSize) {
            return ((FixedSize) this).f38124c;
        }
        if (this instanceof Relative) {
            return ((Relative) this).f38125c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public DivRadialGradientRadiusTemplate(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
