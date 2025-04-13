package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivAppearanceTransition;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivAppearanceTransition.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, m31884d2 = {"Lcom/yandex/div2/DivAppearanceTransition;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "Fade", "Scale", "Set", "Slide", "Lcom/yandex/div2/DivAppearanceTransition$Set;", "Lcom/yandex/div2/DivAppearanceTransition$Fade;", "Lcom/yandex/div2/DivAppearanceTransition$Scale;", "Lcom/yandex/div2/DivAppearanceTransition$Slide;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivAppearanceTransition implements JSONSerializable {

    /* renamed from: a */
    @NotNull
    public static final Companion f34726a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivAppearanceTransition> f34727b = new Function2<ParsingEnvironment, JSONObject, DivAppearanceTransition>() { // from class: com.yandex.div2.DivAppearanceTransition$Companion$CREATOR$1
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
        public DivAppearanceTransition invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivAppearanceTransition.Companion companion = DivAppearanceTransition.f34726a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF34328a(), env);
            String str = (String) m17338a;
            switch (str.hashCode()) {
                case 113762:
                    if (str.equals("set")) {
                        return new DivAppearanceTransition.Set(DivAppearanceSetTransition.f34718b.m17561a(env, it));
                    }
                    break;
                case 3135100:
                    if (str.equals("fade")) {
                        return new DivAppearanceTransition.Fade(DivFadeTransition.f35673e.m17613a(env, it));
                    }
                    break;
                case 109250890:
                    if (str.equals("scale")) {
                        return new DivAppearanceTransition.Scale(DivScaleTransition.f38207g.m17687a(env, it));
                    }
                    break;
                case 109526449:
                    if (str.equals("slide")) {
                        return new DivAppearanceTransition.Slide(DivSlideTransition.f38853f.m17701a(env, it));
                    }
                    break;
            }
            JsonTemplate<?> mo17515a = env.mo17207b().mo17515a(str, it);
            DivAppearanceTransitionTemplate divAppearanceTransitionTemplate = mo17515a instanceof DivAppearanceTransitionTemplate ? (DivAppearanceTransitionTemplate) mo17515a : null;
            if (divAppearanceTransitionTemplate != null) {
                return divAppearanceTransitionTemplate.m17563b(env, it);
            }
            throw ParsingExceptionKt.m17528m(it, "type", str);
        }
    };

    /* compiled from: DivAppearanceTransition.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivAppearanceTransition$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivAppearanceTransition.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivAppearanceTransition$Fade;", "Lcom/yandex/div2/DivAppearanceTransition;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Fade extends DivAppearanceTransition {

        /* renamed from: c */
        @NotNull
        public final DivFadeTransition f34729c;

        public Fade(@NotNull DivFadeTransition divFadeTransition) {
            super(null);
            this.f34729c = divFadeTransition;
        }
    }

    /* compiled from: DivAppearanceTransition.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivAppearanceTransition$Scale;", "Lcom/yandex/div2/DivAppearanceTransition;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Scale extends DivAppearanceTransition {

        /* renamed from: c */
        @NotNull
        public final DivScaleTransition f34730c;

        public Scale(@NotNull DivScaleTransition divScaleTransition) {
            super(null);
            this.f34730c = divScaleTransition;
        }
    }

    /* compiled from: DivAppearanceTransition.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivAppearanceTransition$Set;", "Lcom/yandex/div2/DivAppearanceTransition;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Set extends DivAppearanceTransition {

        /* renamed from: c */
        @NotNull
        public final DivAppearanceSetTransition f34731c;

        public Set(@NotNull DivAppearanceSetTransition divAppearanceSetTransition) {
            super(null);
            this.f34731c = divAppearanceSetTransition;
        }
    }

    /* compiled from: DivAppearanceTransition.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivAppearanceTransition$Slide;", "Lcom/yandex/div2/DivAppearanceTransition;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Slide extends DivAppearanceTransition {

        /* renamed from: c */
        @NotNull
        public final DivSlideTransition f34732c;

        public Slide(@NotNull DivSlideTransition divSlideTransition) {
            super(null);
            this.f34732c = divSlideTransition;
        }
    }

    public DivAppearanceTransition() {
    }

    public DivAppearanceTransition(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
