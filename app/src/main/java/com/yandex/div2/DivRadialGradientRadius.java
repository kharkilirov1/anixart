package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivRadialGradientRadius;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivRadialGradientRadius.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivRadialGradientRadius;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "FixedSize", "Relative", "Lcom/yandex/div2/DivRadialGradientRadius$FixedSize;", "Lcom/yandex/div2/DivRadialGradientRadius$Relative;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivRadialGradientRadius implements JSONSerializable {

    /* renamed from: a */
    @NotNull
    public static final Companion f38116a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivRadialGradientRadius> f38117b = new Function2<ParsingEnvironment, JSONObject, DivRadialGradientRadius>() { // from class: com.yandex.div2.DivRadialGradientRadius$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivRadialGradientRadius invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivRadialGradientRadius.Companion companion = DivRadialGradientRadius.f38116a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF34328a(), env);
            String str = (String) m17338a;
            if (Intrinsics.m32174c(str, "fixed")) {
                return new DivRadialGradientRadius.FixedSize(DivFixedSize.f35789c.m17620a(env, it));
            }
            if (Intrinsics.m32174c(str, "relative")) {
                return new DivRadialGradientRadius.Relative(DivRadialGradientRelativeRadius.f38134b.m17682a(env, it));
            }
            JsonTemplate<?> mo17515a = env.mo17207b().mo17515a(str, it);
            DivRadialGradientRadiusTemplate divRadialGradientRadiusTemplate = mo17515a instanceof DivRadialGradientRadiusTemplate ? (DivRadialGradientRadiusTemplate) mo17515a : null;
            if (divRadialGradientRadiusTemplate != null) {
                return divRadialGradientRadiusTemplate.m17678b(env, it);
            }
            throw ParsingExceptionKt.m17528m(it, "type", str);
        }
    };

    /* compiled from: DivRadialGradientRadius.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivRadialGradientRadius$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivRadialGradientRadius.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivRadialGradientRadius$FixedSize;", "Lcom/yandex/div2/DivRadialGradientRadius;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class FixedSize extends DivRadialGradientRadius {

        /* renamed from: c */
        @NotNull
        public final DivFixedSize f38119c;

        public FixedSize(@NotNull DivFixedSize divFixedSize) {
            super(null);
            this.f38119c = divFixedSize;
        }
    }

    /* compiled from: DivRadialGradientRadius.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivRadialGradientRadius$Relative;", "Lcom/yandex/div2/DivRadialGradientRadius;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Relative extends DivRadialGradientRadius {

        /* renamed from: c */
        @NotNull
        public final DivRadialGradientRelativeRadius f38120c;

        public Relative(@NotNull DivRadialGradientRelativeRadius divRadialGradientRelativeRadius) {
            super(null);
            this.f38120c = divRadialGradientRelativeRadius;
        }
    }

    public DivRadialGradientRadius() {
    }

    @NotNull
    /* renamed from: a */
    public Object m17677a() {
        if (this instanceof FixedSize) {
            return ((FixedSize) this).f38119c;
        }
        if (this instanceof Relative) {
            return ((Relative) this).f38120c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public DivRadialGradientRadius(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
