package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivDrawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivDrawable.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivDrawable;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "Shape", "Lcom/yandex/div2/DivDrawable$Shape;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivDrawable implements JSONSerializable {

    /* renamed from: a */
    @NotNull
    public static final Companion f35599a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivDrawable> f35600b = new Function2<ParsingEnvironment, JSONObject, DivDrawable>() { // from class: com.yandex.div2.DivDrawable$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivDrawable invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivDrawable.Companion companion = DivDrawable.f35599a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF33097d(), env);
            String str = (String) m17338a;
            if (Intrinsics.m32174c(str, "shape_drawable")) {
                return new DivDrawable.Shape(DivShapeDrawable.f38812d.m17693a(env, it));
            }
            JsonTemplate<?> mo17515a = env.mo17207b().mo17515a(str, it);
            DivDrawableTemplate divDrawableTemplate = mo17515a instanceof DivDrawableTemplate ? (DivDrawableTemplate) mo17515a : null;
            if (divDrawableTemplate != null) {
                return divDrawableTemplate.m17612b(env, it);
            }
            throw ParsingExceptionKt.m17528m(it, "type", str);
        }
    };

    /* compiled from: DivDrawable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivDrawable$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivDrawable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivDrawable$Shape;", "Lcom/yandex/div2/DivDrawable;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Shape extends DivDrawable {

        /* renamed from: c */
        @NotNull
        public final DivShapeDrawable f35602c;

        public Shape(@NotNull DivShapeDrawable divShapeDrawable) {
            super(null);
            this.f35602c = divShapeDrawable;
        }
    }

    public DivDrawable() {
    }

    public DivDrawable(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
