package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivRadialGradientCenter;
import com.yandex.div2.DivRadialGradientCenterTemplate;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivRadialGradientCenterTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u0004\u0005\u0006\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m31884d2 = {"Lcom/yandex/div2/DivRadialGradientCenterTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivRadialGradientCenter;", "Companion", "Fixed", "Relative", "Lcom/yandex/div2/DivRadialGradientCenterTemplate$Fixed;", "Lcom/yandex/div2/DivRadialGradientCenterTemplate$Relative;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivRadialGradientCenterTemplate implements JSONSerializable, JsonTemplate<DivRadialGradientCenter> {

    /* renamed from: a */
    @NotNull
    public static final Companion f38093a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivRadialGradientCenterTemplate> f38094b = new Function2<ParsingEnvironment, JSONObject, DivRadialGradientCenterTemplate>() { // from class: com.yandex.div2.DivRadialGradientCenterTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivRadialGradientCenterTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            DivRadialGradientCenterTemplate relative;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivRadialGradientCenterTemplate.Companion companion = DivRadialGradientCenterTemplate.f38093a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF34328a(), env);
            String str = (String) m17338a;
            JsonTemplate<?> jsonTemplate = env.mo17207b().get(str);
            DivRadialGradientCenterTemplate divRadialGradientCenterTemplate = jsonTemplate instanceof DivRadialGradientCenterTemplate ? (DivRadialGradientCenterTemplate) jsonTemplate : null;
            if (divRadialGradientCenterTemplate != null) {
                if (divRadialGradientCenterTemplate instanceof DivRadialGradientCenterTemplate.Fixed) {
                    str = "fixed";
                } else {
                    if (!(divRadialGradientCenterTemplate instanceof DivRadialGradientCenterTemplate.Relative)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "relative";
                }
            }
            if (Intrinsics.m32174c(str, "fixed")) {
                relative = new DivRadialGradientCenterTemplate.Fixed(new DivRadialGradientFixedCenterTemplate(env, (DivRadialGradientFixedCenterTemplate) (divRadialGradientCenterTemplate != null ? divRadialGradientCenterTemplate.m17674c() : null), false, it));
            } else {
                if (!Intrinsics.m32174c(str, "relative")) {
                    throw ParsingExceptionKt.m17528m(it, "type", str);
                }
                relative = new DivRadialGradientCenterTemplate.Relative(new DivRadialGradientRelativeCenterTemplate(env, (DivRadialGradientRelativeCenterTemplate) (divRadialGradientCenterTemplate != null ? divRadialGradientCenterTemplate.m17674c() : null), false, it));
            }
            return relative;
        }
    };

    /* compiled from: DivRadialGradientCenterTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivRadialGradientCenterTemplate$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivRadialGradientCenterTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivRadialGradientCenterTemplate$Fixed;", "Lcom/yandex/div2/DivRadialGradientCenterTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Fixed extends DivRadialGradientCenterTemplate {

        /* renamed from: c */
        @NotNull
        public final DivRadialGradientFixedCenterTemplate f38096c;

        public Fixed(@NotNull DivRadialGradientFixedCenterTemplate divRadialGradientFixedCenterTemplate) {
            super(null);
            this.f38096c = divRadialGradientFixedCenterTemplate;
        }
    }

    /* compiled from: DivRadialGradientCenterTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivRadialGradientCenterTemplate$Relative;", "Lcom/yandex/div2/DivRadialGradientCenterTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Relative extends DivRadialGradientCenterTemplate {

        /* renamed from: c */
        @NotNull
        public final DivRadialGradientRelativeCenterTemplate f38097c;

        public Relative(@NotNull DivRadialGradientRelativeCenterTemplate divRadialGradientRelativeCenterTemplate) {
            super(null);
            this.f38097c = divRadialGradientRelativeCenterTemplate;
        }
    }

    public DivRadialGradientCenterTemplate() {
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivRadialGradientCenter mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        if (this instanceof Fixed) {
            return new DivRadialGradientCenter.Fixed(((Fixed) this).f38096c.mo17514a(env, data));
        }
        if (this instanceof Relative) {
            return new DivRadialGradientCenter.Relative(((Relative) this).f38097c.mo17514a(env, data));
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    /* renamed from: c */
    public Object m17674c() {
        if (this instanceof Fixed) {
            return ((Fixed) this).f38096c;
        }
        if (this instanceof Relative) {
            return ((Relative) this).f38097c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public DivRadialGradientCenterTemplate(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
