package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivShape;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivShape.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivShape;", "Lcom/yandex/div/json/JSONSerializable;", "Circle", "Companion", "RoundedRectangle", "Lcom/yandex/div2/DivShape$RoundedRectangle;", "Lcom/yandex/div2/DivShape$Circle;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivShape implements JSONSerializable {

    /* renamed from: a */
    @NotNull
    public static final Companion f38807a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivShape> f38808b = new Function2<ParsingEnvironment, JSONObject, DivShape>() { // from class: com.yandex.div2.DivShape$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivShape invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivShape.Companion companion = DivShape.f38807a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF34328a(), env);
            String str = (String) m17338a;
            if (Intrinsics.m32174c(str, "rounded_rectangle")) {
                return new DivShape.RoundedRectangle(DivRoundedRectangleShape.f38174f.m17685a(env, it));
            }
            if (Intrinsics.m32174c(str, "circle")) {
                return new DivShape.Circle(DivCircleShape.f34866d.m17598a(env, it));
            }
            JsonTemplate<?> mo17515a = env.mo17207b().mo17515a(str, it);
            DivShapeTemplate divShapeTemplate = mo17515a instanceof DivShapeTemplate ? (DivShapeTemplate) mo17515a : null;
            if (divShapeTemplate != null) {
                return divShapeTemplate.m17695b(env, it);
            }
            throw ParsingExceptionKt.m17528m(it, "type", str);
        }
    };

    /* compiled from: DivShape.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivShape$Circle;", "Lcom/yandex/div2/DivShape;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Circle extends DivShape {

        /* renamed from: c */
        @NotNull
        public final DivCircleShape f38809c;

        public Circle(@NotNull DivCircleShape divCircleShape) {
            super(null);
            this.f38809c = divCircleShape;
        }
    }

    /* compiled from: DivShape.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivShape$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivShape.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivShape$RoundedRectangle;", "Lcom/yandex/div2/DivShape;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class RoundedRectangle extends DivShape {

        /* renamed from: c */
        @NotNull
        public final DivRoundedRectangleShape f38811c;

        public RoundedRectangle(@NotNull DivRoundedRectangleShape divRoundedRectangleShape) {
            super(null);
            this.f38811c = divRoundedRectangleShape;
        }
    }

    public DivShape() {
    }

    public DivShape(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
