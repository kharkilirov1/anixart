package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivFixedSize;
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

/* compiled from: DivCircleShape.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivCircleShape;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivCircleShape implements JSONSerializable {

    /* renamed from: d */
    @NotNull
    public static final Companion f34866d = new Companion(null);

    /* renamed from: e */
    @NotNull
    public static final DivFixedSize f34867e = new DivFixedSize(null, Expression.f34334a.m17539a(10L), 1);

    /* renamed from: a */
    @JvmField
    @Nullable
    public final Expression<Integer> f34868a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final DivFixedSize f34869b;

    /* renamed from: c */
    @JvmField
    @Nullable
    public final DivStroke f34870c;

    /* compiled from: DivCircleShape.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31884d2 = {"Lcom/yandex/div2/DivCircleShape$Companion;", "", "Lcom/yandex/div2/DivFixedSize;", "RADIUS_DEFAULT_VALUE", "Lcom/yandex/div2/DivFixedSize;", "", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivCircleShape m17598a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            Expression m17329u = JsonParser.m17329u(jSONObject, "background_color", ParsingConvertersKt.f33827a, f34328a, parsingEnvironment, TypeHelpersKt.f33853f);
            DivFixedSize.Companion companion = DivFixedSize.f35789c;
            DivFixedSize divFixedSize = (DivFixedSize) JsonParser.m17322n(jSONObject, "radius", DivFixedSize.f35793g, f34328a, parsingEnvironment);
            if (divFixedSize == null) {
                divFixedSize = DivCircleShape.f34867e;
            }
            Intrinsics.m32178g(divFixedSize, "JsonParser.readOptional(…) ?: RADIUS_DEFAULT_VALUE");
            DivStroke.Companion companion2 = DivStroke.f39434d;
            return new DivCircleShape(m17329u, divFixedSize, (DivStroke) JsonParser.m17322n(jSONObject, "stroke", DivStroke.f39439i, f34328a, parsingEnvironment));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        DivCircleShape$Companion$CREATOR$1 divCircleShape$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivCircleShape>() { // from class: com.yandex.div2.DivCircleShape$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivCircleShape invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivCircleShape.f34866d.m17598a(env, it);
            }
        };
    }

    @DivModelInternalApi
    public DivCircleShape(@Nullable Expression<Integer> expression, @NotNull DivFixedSize radius, @Nullable DivStroke divStroke) {
        Intrinsics.m32179h(radius, "radius");
        this.f34868a = expression;
        this.f34869b = radius;
        this.f34870c = divStroke;
    }

    @DivModelInternalApi
    public DivCircleShape() {
        this(null, f34867e, null);
    }
}
