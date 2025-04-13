package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivIndicatorItemPlacement;
import com.yandex.div2.DivIndicatorItemPlacementTemplate;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivIndicatorItemPlacementTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u0004\u0005\u0006\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m31884d2 = {"Lcom/yandex/div2/DivIndicatorItemPlacementTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivIndicatorItemPlacement;", "Companion", "Default", "Stretch", "Lcom/yandex/div2/DivIndicatorItemPlacementTemplate$Default;", "Lcom/yandex/div2/DivIndicatorItemPlacementTemplate$Stretch;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivIndicatorItemPlacementTemplate implements JSONSerializable, JsonTemplate<DivIndicatorItemPlacement> {

    /* renamed from: a */
    @NotNull
    public static final Companion f37104a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivIndicatorItemPlacementTemplate> f37105b = new Function2<ParsingEnvironment, JSONObject, DivIndicatorItemPlacementTemplate>() { // from class: com.yandex.div2.DivIndicatorItemPlacementTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivIndicatorItemPlacementTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            DivIndicatorItemPlacementTemplate stretch;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivIndicatorItemPlacementTemplate.Companion companion = DivIndicatorItemPlacementTemplate.f37104a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF34328a(), env);
            String str = (String) m17338a;
            JsonTemplate<?> jsonTemplate = env.mo17207b().get(str);
            DivIndicatorItemPlacementTemplate divIndicatorItemPlacementTemplate = jsonTemplate instanceof DivIndicatorItemPlacementTemplate ? (DivIndicatorItemPlacementTemplate) jsonTemplate : null;
            if (divIndicatorItemPlacementTemplate != null) {
                if (divIndicatorItemPlacementTemplate instanceof DivIndicatorItemPlacementTemplate.Default) {
                    str = "default";
                } else {
                    if (!(divIndicatorItemPlacementTemplate instanceof DivIndicatorItemPlacementTemplate.Stretch)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "stretch";
                }
            }
            if (Intrinsics.m32174c(str, "default")) {
                stretch = new DivIndicatorItemPlacementTemplate.Default(new DivDefaultIndicatorItemPlacementTemplate(env, (DivDefaultIndicatorItemPlacementTemplate) (divIndicatorItemPlacementTemplate != null ? divIndicatorItemPlacementTemplate.m17637c() : null), false, it));
            } else {
                if (!Intrinsics.m32174c(str, "stretch")) {
                    throw ParsingExceptionKt.m17528m(it, "type", str);
                }
                stretch = new DivIndicatorItemPlacementTemplate.Stretch(new DivStretchIndicatorItemPlacementTemplate(env, (DivStretchIndicatorItemPlacementTemplate) (divIndicatorItemPlacementTemplate != null ? divIndicatorItemPlacementTemplate.m17637c() : null), false, it));
            }
            return stretch;
        }
    };

    /* compiled from: DivIndicatorItemPlacementTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivIndicatorItemPlacementTemplate$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivIndicatorItemPlacementTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivIndicatorItemPlacementTemplate$Default;", "Lcom/yandex/div2/DivIndicatorItemPlacementTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Default extends DivIndicatorItemPlacementTemplate {

        /* renamed from: c */
        @NotNull
        public final DivDefaultIndicatorItemPlacementTemplate f37107c;

        public Default(@NotNull DivDefaultIndicatorItemPlacementTemplate divDefaultIndicatorItemPlacementTemplate) {
            super(null);
            this.f37107c = divDefaultIndicatorItemPlacementTemplate;
        }
    }

    /* compiled from: DivIndicatorItemPlacementTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivIndicatorItemPlacementTemplate$Stretch;", "Lcom/yandex/div2/DivIndicatorItemPlacementTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Stretch extends DivIndicatorItemPlacementTemplate {

        /* renamed from: c */
        @NotNull
        public final DivStretchIndicatorItemPlacementTemplate f37108c;

        public Stretch(@NotNull DivStretchIndicatorItemPlacementTemplate divStretchIndicatorItemPlacementTemplate) {
            super(null);
            this.f37108c = divStretchIndicatorItemPlacementTemplate;
        }
    }

    public DivIndicatorItemPlacementTemplate() {
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivIndicatorItemPlacement mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        if (this instanceof Default) {
            return new DivIndicatorItemPlacement.Default(((Default) this).f37107c.mo17514a(env, data));
        }
        if (this instanceof Stretch) {
            return new DivIndicatorItemPlacement.Stretch(((Stretch) this).f37108c.mo17514a(env, data));
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    /* renamed from: c */
    public Object m17637c() {
        if (this instanceof Default) {
            return ((Default) this).f37107c;
        }
        if (this instanceof Stretch) {
            return ((Stretch) this).f37108c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public DivIndicatorItemPlacementTemplate(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
