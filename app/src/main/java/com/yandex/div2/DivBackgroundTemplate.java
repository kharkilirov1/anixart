package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivBackgroundTemplate;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivBackgroundTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0006\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, m31884d2 = {"Lcom/yandex/div2/DivBackgroundTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivBackground;", "Companion", "Image", "LinearGradient", "NinePatch", "RadialGradient", "Solid", "Lcom/yandex/div2/DivBackgroundTemplate$LinearGradient;", "Lcom/yandex/div2/DivBackgroundTemplate$RadialGradient;", "Lcom/yandex/div2/DivBackgroundTemplate$Image;", "Lcom/yandex/div2/DivBackgroundTemplate$Solid;", "Lcom/yandex/div2/DivBackgroundTemplate$NinePatch;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivBackgroundTemplate implements JSONSerializable, JsonTemplate<DivBackground> {

    /* renamed from: a */
    @NotNull
    public static final Companion f34758a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivBackgroundTemplate> f34759b = new Function2<ParsingEnvironment, JSONObject, DivBackgroundTemplate>() { // from class: com.yandex.div2.DivBackgroundTemplate$Companion$CREATOR$1
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
        public DivBackgroundTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            DivBackgroundTemplate ninePatch;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivBackgroundTemplate.Companion companion = DivBackgroundTemplate.f34758a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF34328a(), env);
            String str = (String) m17338a;
            JsonTemplate<?> jsonTemplate = env.mo17207b().get(str);
            DivBackgroundTemplate divBackgroundTemplate = jsonTemplate instanceof DivBackgroundTemplate ? (DivBackgroundTemplate) jsonTemplate : null;
            if (divBackgroundTemplate != null) {
                if (divBackgroundTemplate instanceof DivBackgroundTemplate.LinearGradient) {
                    str = "gradient";
                } else if (divBackgroundTemplate instanceof DivBackgroundTemplate.RadialGradient) {
                    str = "radial_gradient";
                } else if (divBackgroundTemplate instanceof DivBackgroundTemplate.Image) {
                    str = "image";
                } else if (divBackgroundTemplate instanceof DivBackgroundTemplate.Solid) {
                    str = "solid";
                } else {
                    if (!(divBackgroundTemplate instanceof DivBackgroundTemplate.NinePatch)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "nine_patch_image";
                }
            }
            switch (str.hashCode()) {
                case -30518633:
                    if (str.equals("nine_patch_image")) {
                        ninePatch = new DivBackgroundTemplate.NinePatch(new DivNinePatchBackgroundTemplate(env, (DivNinePatchBackgroundTemplate) (divBackgroundTemplate != null ? divBackgroundTemplate.m17566c() : null), false, it));
                        return ninePatch;
                    }
                    break;
                case 89650992:
                    if (str.equals("gradient")) {
                        ninePatch = new DivBackgroundTemplate.LinearGradient(new DivLinearGradientTemplate(env, (DivLinearGradientTemplate) (divBackgroundTemplate != null ? divBackgroundTemplate.m17566c() : null), false, it));
                        return ninePatch;
                    }
                    break;
                case 100313435:
                    if (str.equals("image")) {
                        ninePatch = new DivBackgroundTemplate.Image(new DivImageBackgroundTemplate(env, (DivImageBackgroundTemplate) (divBackgroundTemplate != null ? divBackgroundTemplate.m17566c() : null), false, it));
                        return ninePatch;
                    }
                    break;
                case 109618859:
                    if (str.equals("solid")) {
                        ninePatch = new DivBackgroundTemplate.Solid(new DivSolidBackgroundTemplate(env, (DivSolidBackgroundTemplate) (divBackgroundTemplate != null ? divBackgroundTemplate.m17566c() : null), false, it));
                        return ninePatch;
                    }
                    break;
                case 1881846096:
                    if (str.equals("radial_gradient")) {
                        ninePatch = new DivBackgroundTemplate.RadialGradient(new DivRadialGradientTemplate(env, (DivRadialGradientTemplate) (divBackgroundTemplate != null ? divBackgroundTemplate.m17566c() : null), false, it));
                        return ninePatch;
                    }
                    break;
            }
            throw ParsingExceptionKt.m17528m(it, "type", str);
        }
    };

    /* compiled from: DivBackgroundTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivBackgroundTemplate$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivBackgroundTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivBackgroundTemplate$Image;", "Lcom/yandex/div2/DivBackgroundTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Image extends DivBackgroundTemplate {

        /* renamed from: c */
        @NotNull
        public final DivImageBackgroundTemplate f34761c;

        public Image(@NotNull DivImageBackgroundTemplate divImageBackgroundTemplate) {
            super(null);
            this.f34761c = divImageBackgroundTemplate;
        }
    }

    /* compiled from: DivBackgroundTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivBackgroundTemplate$LinearGradient;", "Lcom/yandex/div2/DivBackgroundTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class LinearGradient extends DivBackgroundTemplate {

        /* renamed from: c */
        @NotNull
        public final DivLinearGradientTemplate f34762c;

        public LinearGradient(@NotNull DivLinearGradientTemplate divLinearGradientTemplate) {
            super(null);
            this.f34762c = divLinearGradientTemplate;
        }
    }

    /* compiled from: DivBackgroundTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivBackgroundTemplate$NinePatch;", "Lcom/yandex/div2/DivBackgroundTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class NinePatch extends DivBackgroundTemplate {

        /* renamed from: c */
        @NotNull
        public final DivNinePatchBackgroundTemplate f34763c;

        public NinePatch(@NotNull DivNinePatchBackgroundTemplate divNinePatchBackgroundTemplate) {
            super(null);
            this.f34763c = divNinePatchBackgroundTemplate;
        }
    }

    /* compiled from: DivBackgroundTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivBackgroundTemplate$RadialGradient;", "Lcom/yandex/div2/DivBackgroundTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class RadialGradient extends DivBackgroundTemplate {

        /* renamed from: c */
        @NotNull
        public final DivRadialGradientTemplate f34764c;

        public RadialGradient(@NotNull DivRadialGradientTemplate divRadialGradientTemplate) {
            super(null);
            this.f34764c = divRadialGradientTemplate;
        }
    }

    /* compiled from: DivBackgroundTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivBackgroundTemplate$Solid;", "Lcom/yandex/div2/DivBackgroundTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Solid extends DivBackgroundTemplate {

        /* renamed from: c */
        @NotNull
        public final DivSolidBackgroundTemplate f34765c;

        public Solid(@NotNull DivSolidBackgroundTemplate divSolidBackgroundTemplate) {
            super(null);
            this.f34765c = divSolidBackgroundTemplate;
        }
    }

    public DivBackgroundTemplate() {
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivBackground mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        if (this instanceof LinearGradient) {
            return new DivBackground.LinearGradient(((LinearGradient) this).f34762c.mo17514a(env, data));
        }
        if (this instanceof RadialGradient) {
            return new DivBackground.RadialGradient(((RadialGradient) this).f34764c.mo17514a(env, data));
        }
        if (this instanceof Image) {
            return new DivBackground.Image(((Image) this).f34761c.mo17514a(env, data));
        }
        if (this instanceof Solid) {
            return new DivBackground.Solid(((Solid) this).f34765c.mo17514a(env, data));
        }
        if (this instanceof NinePatch) {
            return new DivBackground.NinePatch(((NinePatch) this).f34763c.mo17514a(env, data));
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    /* renamed from: c */
    public Object m17566c() {
        if (this instanceof LinearGradient) {
            return ((LinearGradient) this).f34762c;
        }
        if (this instanceof RadialGradient) {
            return ((RadialGradient) this).f34764c;
        }
        if (this instanceof Image) {
            return ((Image) this).f34761c;
        }
        if (this instanceof Solid) {
            return ((Solid) this).f34765c;
        }
        if (this instanceof NinePatch) {
            return ((NinePatch) this).f34763c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public DivBackgroundTemplate(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
