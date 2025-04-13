package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivBackground;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivBackground.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, m31884d2 = {"Lcom/yandex/div2/DivBackground;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "Image", "LinearGradient", "NinePatch", "RadialGradient", "Solid", "Lcom/yandex/div2/DivBackground$LinearGradient;", "Lcom/yandex/div2/DivBackground$RadialGradient;", "Lcom/yandex/div2/DivBackground$Image;", "Lcom/yandex/div2/DivBackground$Solid;", "Lcom/yandex/div2/DivBackground$NinePatch;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivBackground implements JSONSerializable {

    /* renamed from: a */
    @NotNull
    public static final Companion f34750a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivBackground> f34751b = new Function2<ParsingEnvironment, JSONObject, DivBackground>() { // from class: com.yandex.div2.DivBackground$Companion$CREATOR$1
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
        public DivBackground invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivBackground.Companion companion = DivBackground.f34750a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF34328a(), env);
            String str = (String) m17338a;
            switch (str.hashCode()) {
                case -30518633:
                    if (str.equals("nine_patch_image")) {
                        return new DivBackground.NinePatch(DivNinePatchBackground.f37726c.m17657a(env, it));
                    }
                    break;
                case 89650992:
                    if (str.equals("gradient")) {
                        return new DivBackground.LinearGradient(DivLinearGradient.f37690c.m17651a(env, it));
                    }
                    break;
                case 100313435:
                    if (str.equals("image")) {
                        return new DivBackground.Image(DivImageBackground.f36748h.m17631a(env, it));
                    }
                    break;
                case 109618859:
                    if (str.equals("solid")) {
                        return new DivBackground.Solid(DivSolidBackground.f39185b.m17705a(env, it));
                    }
                    break;
                case 1881846096:
                    if (str.equals("radial_gradient")) {
                        return new DivBackground.RadialGradient(DivRadialGradient.f38078e.m17671a(env, it));
                    }
                    break;
            }
            JsonTemplate<?> mo17515a = env.mo17207b().mo17515a(str, it);
            DivBackgroundTemplate divBackgroundTemplate = mo17515a instanceof DivBackgroundTemplate ? (DivBackgroundTemplate) mo17515a : null;
            if (divBackgroundTemplate != null) {
                return divBackgroundTemplate.m17565b(env, it);
            }
            throw ParsingExceptionKt.m17528m(it, "type", str);
        }
    };

    /* compiled from: DivBackground.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivBackground$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivBackground.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivBackground$Image;", "Lcom/yandex/div2/DivBackground;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Image extends DivBackground {

        /* renamed from: c */
        @NotNull
        public final DivImageBackground f34753c;

        public Image(@NotNull DivImageBackground divImageBackground) {
            super(null);
            this.f34753c = divImageBackground;
        }
    }

    /* compiled from: DivBackground.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivBackground$LinearGradient;", "Lcom/yandex/div2/DivBackground;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class LinearGradient extends DivBackground {

        /* renamed from: c */
        @NotNull
        public final DivLinearGradient f34754c;

        public LinearGradient(@NotNull DivLinearGradient divLinearGradient) {
            super(null);
            this.f34754c = divLinearGradient;
        }
    }

    /* compiled from: DivBackground.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivBackground$NinePatch;", "Lcom/yandex/div2/DivBackground;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class NinePatch extends DivBackground {

        /* renamed from: c */
        @NotNull
        public final DivNinePatchBackground f34755c;

        public NinePatch(@NotNull DivNinePatchBackground divNinePatchBackground) {
            super(null);
            this.f34755c = divNinePatchBackground;
        }
    }

    /* compiled from: DivBackground.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivBackground$RadialGradient;", "Lcom/yandex/div2/DivBackground;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class RadialGradient extends DivBackground {

        /* renamed from: c */
        @NotNull
        public final DivRadialGradient f34756c;

        public RadialGradient(@NotNull DivRadialGradient divRadialGradient) {
            super(null);
            this.f34756c = divRadialGradient;
        }
    }

    /* compiled from: DivBackground.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivBackground$Solid;", "Lcom/yandex/div2/DivBackground;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Solid extends DivBackground {

        /* renamed from: c */
        @NotNull
        public final DivSolidBackground f34757c;

        public Solid(@NotNull DivSolidBackground divSolidBackground) {
            super(null);
            this.f34757c = divSolidBackground;
        }
    }

    public DivBackground() {
    }

    public DivBackground(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
