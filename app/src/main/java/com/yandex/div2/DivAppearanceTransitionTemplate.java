package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivAppearanceTransitionTemplate;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivAppearanceTransitionTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0005\u0004\u0005\u0006\u0007\b\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, m31884d2 = {"Lcom/yandex/div2/DivAppearanceTransitionTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivAppearanceTransition;", "Companion", "Fade", "Scale", "Set", "Slide", "Lcom/yandex/div2/DivAppearanceTransitionTemplate$Set;", "Lcom/yandex/div2/DivAppearanceTransitionTemplate$Fade;", "Lcom/yandex/div2/DivAppearanceTransitionTemplate$Scale;", "Lcom/yandex/div2/DivAppearanceTransitionTemplate$Slide;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivAppearanceTransitionTemplate implements JSONSerializable, JsonTemplate<DivAppearanceTransition> {

    /* renamed from: a */
    @NotNull
    public static final Companion f34733a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivAppearanceTransitionTemplate> f34734b = new Function2<ParsingEnvironment, JSONObject, DivAppearanceTransitionTemplate>() { // from class: com.yandex.div2.DivAppearanceTransitionTemplate$Companion$CREATOR$1
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
         */
        @Override // kotlin.jvm.functions.Function2
        public DivAppearanceTransitionTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            DivAppearanceTransitionTemplate set;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivAppearanceTransitionTemplate.Companion companion = DivAppearanceTransitionTemplate.f34733a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF34328a(), env);
            String str = (String) m17338a;
            JsonTemplate<?> jsonTemplate = env.mo17207b().get(str);
            DivAppearanceTransitionTemplate divAppearanceTransitionTemplate = jsonTemplate instanceof DivAppearanceTransitionTemplate ? (DivAppearanceTransitionTemplate) jsonTemplate : null;
            if (divAppearanceTransitionTemplate != null) {
                if (divAppearanceTransitionTemplate instanceof DivAppearanceTransitionTemplate.Set) {
                    str = "set";
                } else if (divAppearanceTransitionTemplate instanceof DivAppearanceTransitionTemplate.Fade) {
                    str = "fade";
                } else if (divAppearanceTransitionTemplate instanceof DivAppearanceTransitionTemplate.Scale) {
                    str = "scale";
                } else {
                    if (!(divAppearanceTransitionTemplate instanceof DivAppearanceTransitionTemplate.Slide)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "slide";
                }
            }
            switch (str.hashCode()) {
                case 113762:
                    if (str.equals("set")) {
                        set = new DivAppearanceTransitionTemplate.Set(new DivAppearanceSetTransitionTemplate(env, (DivAppearanceSetTransitionTemplate) (divAppearanceTransitionTemplate != null ? divAppearanceTransitionTemplate.m17564c() : null), false, it));
                        return set;
                    }
                    break;
                case 3135100:
                    if (str.equals("fade")) {
                        set = new DivAppearanceTransitionTemplate.Fade(new DivFadeTransitionTemplate(env, (DivFadeTransitionTemplate) (divAppearanceTransitionTemplate != null ? divAppearanceTransitionTemplate.m17564c() : null), false, it));
                        return set;
                    }
                    break;
                case 109250890:
                    if (str.equals("scale")) {
                        set = new DivAppearanceTransitionTemplate.Scale(new DivScaleTransitionTemplate(env, (DivScaleTransitionTemplate) (divAppearanceTransitionTemplate != null ? divAppearanceTransitionTemplate.m17564c() : null), false, it));
                        return set;
                    }
                    break;
                case 109526449:
                    if (str.equals("slide")) {
                        set = new DivAppearanceTransitionTemplate.Slide(new DivSlideTransitionTemplate(env, (DivSlideTransitionTemplate) (divAppearanceTransitionTemplate != null ? divAppearanceTransitionTemplate.m17564c() : null), false, it));
                        return set;
                    }
                    break;
            }
            throw ParsingExceptionKt.m17528m(it, "type", str);
        }
    };

    /* compiled from: DivAppearanceTransitionTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivAppearanceTransitionTemplate$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivAppearanceTransitionTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivAppearanceTransitionTemplate$Fade;", "Lcom/yandex/div2/DivAppearanceTransitionTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Fade extends DivAppearanceTransitionTemplate {

        /* renamed from: c */
        @NotNull
        public final DivFadeTransitionTemplate f34736c;

        public Fade(@NotNull DivFadeTransitionTemplate divFadeTransitionTemplate) {
            super(null);
            this.f34736c = divFadeTransitionTemplate;
        }
    }

    /* compiled from: DivAppearanceTransitionTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivAppearanceTransitionTemplate$Scale;", "Lcom/yandex/div2/DivAppearanceTransitionTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Scale extends DivAppearanceTransitionTemplate {

        /* renamed from: c */
        @NotNull
        public final DivScaleTransitionTemplate f34737c;

        public Scale(@NotNull DivScaleTransitionTemplate divScaleTransitionTemplate) {
            super(null);
            this.f34737c = divScaleTransitionTemplate;
        }
    }

    /* compiled from: DivAppearanceTransitionTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivAppearanceTransitionTemplate$Set;", "Lcom/yandex/div2/DivAppearanceTransitionTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Set extends DivAppearanceTransitionTemplate {

        /* renamed from: c */
        @NotNull
        public final DivAppearanceSetTransitionTemplate f34738c;

        public Set(@NotNull DivAppearanceSetTransitionTemplate divAppearanceSetTransitionTemplate) {
            super(null);
            this.f34738c = divAppearanceSetTransitionTemplate;
        }
    }

    /* compiled from: DivAppearanceTransitionTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivAppearanceTransitionTemplate$Slide;", "Lcom/yandex/div2/DivAppearanceTransitionTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Slide extends DivAppearanceTransitionTemplate {

        /* renamed from: c */
        @NotNull
        public final DivSlideTransitionTemplate f34739c;

        public Slide(@NotNull DivSlideTransitionTemplate divSlideTransitionTemplate) {
            super(null);
            this.f34739c = divSlideTransitionTemplate;
        }
    }

    public DivAppearanceTransitionTemplate() {
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivAppearanceTransition mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        if (this instanceof Set) {
            return new DivAppearanceTransition.Set(((Set) this).f34738c.mo17514a(env, data));
        }
        if (this instanceof Fade) {
            return new DivAppearanceTransition.Fade(((Fade) this).f34736c.mo17514a(env, data));
        }
        if (this instanceof Scale) {
            return new DivAppearanceTransition.Scale(((Scale) this).f34737c.mo17514a(env, data));
        }
        if (this instanceof Slide) {
            return new DivAppearanceTransition.Slide(((Slide) this).f34739c.mo17514a(env, data));
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    /* renamed from: c */
    public Object m17564c() {
        if (this instanceof Set) {
            return ((Set) this).f34738c;
        }
        if (this instanceof Fade) {
            return ((Fade) this).f34736c;
        }
        if (this instanceof Scale) {
            return ((Scale) this).f34737c;
        }
        if (this instanceof Slide) {
            return ((Slide) this).f34739c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public DivAppearanceTransitionTemplate(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
