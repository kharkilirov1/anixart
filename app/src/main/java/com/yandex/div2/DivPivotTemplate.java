package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivPivot;
import com.yandex.div2.DivPivotTemplate;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivPivotTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u0004\u0005\u0006\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m31884d2 = {"Lcom/yandex/div2/DivPivotTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivPivot;", "Companion", "Fixed", "Percentage", "Lcom/yandex/div2/DivPivotTemplate$Fixed;", "Lcom/yandex/div2/DivPivotTemplate$Percentage;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivPivotTemplate implements JSONSerializable, JsonTemplate<DivPivot> {

    /* renamed from: a */
    @NotNull
    public static final Companion f38059a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivPivotTemplate> f38060b = new Function2<ParsingEnvironment, JSONObject, DivPivotTemplate>() { // from class: com.yandex.div2.DivPivotTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivPivotTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            DivPivotTemplate percentage;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivPivotTemplate.Companion companion = DivPivotTemplate.f38059a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF34328a(), env);
            String str = (String) m17338a;
            JsonTemplate<?> jsonTemplate = env.mo17207b().get(str);
            DivPivotTemplate divPivotTemplate = jsonTemplate instanceof DivPivotTemplate ? (DivPivotTemplate) jsonTemplate : null;
            if (divPivotTemplate != null) {
                if (divPivotTemplate instanceof DivPivotTemplate.Fixed) {
                    str = "pivot-fixed";
                } else {
                    if (!(divPivotTemplate instanceof DivPivotTemplate.Percentage)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "pivot-percentage";
                }
            }
            if (Intrinsics.m32174c(str, "pivot-fixed")) {
                percentage = new DivPivotTemplate.Fixed(new DivPivotFixedTemplate(env, (DivPivotFixedTemplate) (divPivotTemplate != null ? divPivotTemplate.m17670c() : null), false, it));
            } else {
                if (!Intrinsics.m32174c(str, "pivot-percentage")) {
                    throw ParsingExceptionKt.m17528m(it, "type", str);
                }
                percentage = new DivPivotTemplate.Percentage(new DivPivotPercentageTemplate(env, (DivPivotPercentageTemplate) (divPivotTemplate != null ? divPivotTemplate.m17670c() : null), false, it));
            }
            return percentage;
        }
    };

    /* compiled from: DivPivotTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivPivotTemplate$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivPivotTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivPivotTemplate$Fixed;", "Lcom/yandex/div2/DivPivotTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Fixed extends DivPivotTemplate {

        /* renamed from: c */
        @NotNull
        public final DivPivotFixedTemplate f38062c;

        public Fixed(@NotNull DivPivotFixedTemplate divPivotFixedTemplate) {
            super(null);
            this.f38062c = divPivotFixedTemplate;
        }
    }

    /* compiled from: DivPivotTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivPivotTemplate$Percentage;", "Lcom/yandex/div2/DivPivotTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Percentage extends DivPivotTemplate {

        /* renamed from: c */
        @NotNull
        public final DivPivotPercentageTemplate f38063c;

        public Percentage(@NotNull DivPivotPercentageTemplate divPivotPercentageTemplate) {
            super(null);
            this.f38063c = divPivotPercentageTemplate;
        }
    }

    public DivPivotTemplate() {
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivPivot mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        if (this instanceof Fixed) {
            return new DivPivot.Fixed(((Fixed) this).f38062c.mo17514a(env, data));
        }
        if (this instanceof Percentage) {
            return new DivPivot.Percentage(((Percentage) this).f38063c.mo17514a(env, data));
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    /* renamed from: c */
    public Object m17670c() {
        if (this instanceof Fixed) {
            return ((Fixed) this).f38062c;
        }
        if (this instanceof Percentage) {
            return ((Percentage) this).f38063c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public DivPivotTemplate(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
