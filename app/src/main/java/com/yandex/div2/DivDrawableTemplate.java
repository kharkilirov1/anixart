package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivDrawable;
import com.yandex.div2.DivDrawableTemplate;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivDrawableTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0004\u0005\u0082\u0001\u0001\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivDrawableTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivDrawable;", "Companion", "Shape", "Lcom/yandex/div2/DivDrawableTemplate$Shape;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivDrawableTemplate implements JSONSerializable, JsonTemplate<DivDrawable> {

    /* renamed from: a */
    @NotNull
    public static final Companion f35603a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivDrawableTemplate> f35604b = new Function2<ParsingEnvironment, JSONObject, DivDrawableTemplate>() { // from class: com.yandex.div2.DivDrawableTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivDrawableTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivDrawableTemplate.Companion companion = DivDrawableTemplate.f35603a;
            DivShapeDrawableTemplate divShapeDrawableTemplate = null;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF34328a(), env);
            String str = (String) m17338a;
            JsonTemplate<?> jsonTemplate = env.mo17207b().get(str);
            DivDrawableTemplate divDrawableTemplate = jsonTemplate instanceof DivDrawableTemplate ? (DivDrawableTemplate) jsonTemplate : null;
            if (divDrawableTemplate != null) {
                if (!(divDrawableTemplate instanceof DivDrawableTemplate.Shape)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "shape_drawable";
            }
            if (!Intrinsics.m32174c(str, "shape_drawable")) {
                throw ParsingExceptionKt.m17528m(it, "type", str);
            }
            if (divDrawableTemplate != null) {
                if (!(divDrawableTemplate instanceof DivDrawableTemplate.Shape)) {
                    throw new NoWhenBranchMatchedException();
                }
                divShapeDrawableTemplate = ((DivDrawableTemplate.Shape) divDrawableTemplate).f35606c;
            }
            return new DivDrawableTemplate.Shape(new DivShapeDrawableTemplate(env, divShapeDrawableTemplate, false, it));
        }
    };

    /* compiled from: DivDrawableTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivDrawableTemplate$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivDrawableTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivDrawableTemplate$Shape;", "Lcom/yandex/div2/DivDrawableTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Shape extends DivDrawableTemplate {

        /* renamed from: c */
        @NotNull
        public final DivShapeDrawableTemplate f35606c;

        public Shape(@NotNull DivShapeDrawableTemplate divShapeDrawableTemplate) {
            super(null);
            this.f35606c = divShapeDrawableTemplate;
        }
    }

    public DivDrawableTemplate() {
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivDrawable mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        if (this instanceof Shape) {
            return new DivDrawable.Shape(((Shape) this).f35606c.mo17514a(env, data));
        }
        throw new NoWhenBranchMatchedException();
    }

    public DivDrawableTemplate(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
