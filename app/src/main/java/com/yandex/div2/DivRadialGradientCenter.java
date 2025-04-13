package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivRadialGradientCenter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivRadialGradientCenter.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivRadialGradientCenter;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "Fixed", "Relative", "Lcom/yandex/div2/DivRadialGradientCenter$Fixed;", "Lcom/yandex/div2/DivRadialGradientCenter$Relative;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivRadialGradientCenter implements JSONSerializable {

    /* renamed from: a */
    @NotNull
    public static final Companion f38088a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivRadialGradientCenter> f38089b = new Function2<ParsingEnvironment, JSONObject, DivRadialGradientCenter>() { // from class: com.yandex.div2.DivRadialGradientCenter$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivRadialGradientCenter invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivRadialGradientCenter.Companion companion = DivRadialGradientCenter.f38088a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF34328a(), env);
            String str = (String) m17338a;
            if (Intrinsics.m32174c(str, "fixed")) {
                return new DivRadialGradientCenter.Fixed(DivRadialGradientFixedCenter.f38098c.m17675a(env, it));
            }
            if (Intrinsics.m32174c(str, "relative")) {
                return new DivRadialGradientCenter.Relative(DivRadialGradientRelativeCenter.f38126b.m17680a(env, it));
            }
            JsonTemplate<?> mo17515a = env.mo17207b().mo17515a(str, it);
            DivRadialGradientCenterTemplate divRadialGradientCenterTemplate = mo17515a instanceof DivRadialGradientCenterTemplate ? (DivRadialGradientCenterTemplate) mo17515a : null;
            if (divRadialGradientCenterTemplate != null) {
                return divRadialGradientCenterTemplate.m17673b(env, it);
            }
            throw ParsingExceptionKt.m17528m(it, "type", str);
        }
    };

    /* compiled from: DivRadialGradientCenter.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivRadialGradientCenter$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivRadialGradientCenter.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivRadialGradientCenter$Fixed;", "Lcom/yandex/div2/DivRadialGradientCenter;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Fixed extends DivRadialGradientCenter {

        /* renamed from: c */
        @NotNull
        public final DivRadialGradientFixedCenter f38091c;

        public Fixed(@NotNull DivRadialGradientFixedCenter divRadialGradientFixedCenter) {
            super(null);
            this.f38091c = divRadialGradientFixedCenter;
        }
    }

    /* compiled from: DivRadialGradientCenter.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivRadialGradientCenter$Relative;", "Lcom/yandex/div2/DivRadialGradientCenter;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Relative extends DivRadialGradientCenter {

        /* renamed from: c */
        @NotNull
        public final DivRadialGradientRelativeCenter f38092c;

        public Relative(@NotNull DivRadialGradientRelativeCenter divRadialGradientRelativeCenter) {
            super(null);
            this.f38092c = divRadialGradientRelativeCenter;
        }
    }

    public DivRadialGradientCenter() {
    }

    @NotNull
    /* renamed from: a */
    public Object m17672a() {
        if (this instanceof Fixed) {
            return ((Fixed) this).f38091c;
        }
        if (this instanceof Relative) {
            return ((Relative) this).f38092c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public DivRadialGradientCenter(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
