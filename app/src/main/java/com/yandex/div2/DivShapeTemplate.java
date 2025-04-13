package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivShape;
import com.yandex.div2.DivShapeTemplate;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivShapeTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u0004\u0005\u0006\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m31884d2 = {"Lcom/yandex/div2/DivShapeTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivShape;", "Circle", "Companion", "RoundedRectangle", "Lcom/yandex/div2/DivShapeTemplate$RoundedRectangle;", "Lcom/yandex/div2/DivShapeTemplate$Circle;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivShapeTemplate implements JSONSerializable, JsonTemplate<DivShape> {

    /* renamed from: a */
    @NotNull
    public static final Companion f38828a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivShapeTemplate> f38829b = new Function2<ParsingEnvironment, JSONObject, DivShapeTemplate>() { // from class: com.yandex.div2.DivShapeTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivShapeTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            DivShapeTemplate circle;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivShapeTemplate.Companion companion = DivShapeTemplate.f38828a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF34328a(), env);
            String str = (String) m17338a;
            JsonTemplate<?> jsonTemplate = env.mo17207b().get(str);
            DivShapeTemplate divShapeTemplate = jsonTemplate instanceof DivShapeTemplate ? (DivShapeTemplate) jsonTemplate : null;
            if (divShapeTemplate != null) {
                if (divShapeTemplate instanceof DivShapeTemplate.RoundedRectangle) {
                    str = "rounded_rectangle";
                } else {
                    if (!(divShapeTemplate instanceof DivShapeTemplate.Circle)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "circle";
                }
            }
            if (Intrinsics.m32174c(str, "rounded_rectangle")) {
                circle = new DivShapeTemplate.RoundedRectangle(new DivRoundedRectangleShapeTemplate(env, (DivRoundedRectangleShapeTemplate) (divShapeTemplate != null ? divShapeTemplate.m17696c() : null), false, it));
            } else {
                if (!Intrinsics.m32174c(str, "circle")) {
                    throw ParsingExceptionKt.m17528m(it, "type", str);
                }
                circle = new DivShapeTemplate.Circle(new DivCircleShapeTemplate(env, (DivCircleShapeTemplate) (divShapeTemplate != null ? divShapeTemplate.m17696c() : null), false, it));
            }
            return circle;
        }
    };

    /* compiled from: DivShapeTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivShapeTemplate$Circle;", "Lcom/yandex/div2/DivShapeTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Circle extends DivShapeTemplate {

        /* renamed from: c */
        @NotNull
        public final DivCircleShapeTemplate f38830c;

        public Circle(@NotNull DivCircleShapeTemplate divCircleShapeTemplate) {
            super(null);
            this.f38830c = divCircleShapeTemplate;
        }
    }

    /* compiled from: DivShapeTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivShapeTemplate$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivShapeTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivShapeTemplate$RoundedRectangle;", "Lcom/yandex/div2/DivShapeTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class RoundedRectangle extends DivShapeTemplate {

        /* renamed from: c */
        @NotNull
        public final DivRoundedRectangleShapeTemplate f38832c;

        public RoundedRectangle(@NotNull DivRoundedRectangleShapeTemplate divRoundedRectangleShapeTemplate) {
            super(null);
            this.f38832c = divRoundedRectangleShapeTemplate;
        }
    }

    public DivShapeTemplate() {
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivShape mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        if (this instanceof RoundedRectangle) {
            return new DivShape.RoundedRectangle(((RoundedRectangle) this).f38832c.mo17514a(env, data));
        }
        if (this instanceof Circle) {
            return new DivShape.Circle(((Circle) this).f38830c.mo17514a(env, data));
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    /* renamed from: c */
    public Object m17696c() {
        if (this instanceof RoundedRectangle) {
            return ((RoundedRectangle) this).f38832c;
        }
        if (this instanceof Circle) {
            return ((Circle) this).f38830c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public DivShapeTemplate(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
