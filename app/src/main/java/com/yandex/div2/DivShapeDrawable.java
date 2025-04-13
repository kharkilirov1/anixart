package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivShape;
import com.yandex.div2.DivStroke;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivShapeDrawable.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivShapeDrawable;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivShapeDrawable implements JSONSerializable {

    /* renamed from: d */
    @NotNull
    public static final Companion f38812d = new Companion(null);

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Expression<Integer> f38813a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final DivShape f38814b;

    /* renamed from: c */
    @JvmField
    @Nullable
    public final DivStroke f38815c;

    /* compiled from: DivShapeDrawable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivShapeDrawable$Companion;", "", "", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivShapeDrawable m17693a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f33097d = parsingEnvironment.getF33097d();
            Expression m17317i = JsonParser.m17317i(jSONObject, "color", ParsingConvertersKt.f33827a, f33097d, parsingEnvironment, TypeHelpersKt.f33853f);
            DivShape.Companion companion = DivShape.f38807a;
            DivShape divShape = (DivShape) JsonParser.m17313e(jSONObject, "shape", DivShape.f38808b, C2904b.f33858e, parsingEnvironment);
            DivStroke.Companion companion2 = DivStroke.f39434d;
            return new DivShapeDrawable(m17317i, divShape, (DivStroke) JsonParser.m17322n(jSONObject, "stroke", DivStroke.f39439i, f33097d, parsingEnvironment));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        DivShapeDrawable$Companion$CREATOR$1 divShapeDrawable$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivShapeDrawable>() { // from class: com.yandex.div2.DivShapeDrawable$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivShapeDrawable invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivShapeDrawable.f38812d.m17693a(env, it);
            }
        };
    }

    @DivModelInternalApi
    public DivShapeDrawable(@NotNull Expression<Integer> color, @NotNull DivShape shape, @Nullable DivStroke divStroke) {
        Intrinsics.m32179h(color, "color");
        Intrinsics.m32179h(shape, "shape");
        this.f38813a = color;
        this.f38814b = shape;
        this.f38815c = divStroke;
    }
}
