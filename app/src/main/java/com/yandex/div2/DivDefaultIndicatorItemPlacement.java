package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivFixedSize;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivDefaultIndicatorItemPlacement.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivDefaultIndicatorItemPlacement;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivDefaultIndicatorItemPlacement implements JSONSerializable {

    /* renamed from: b */
    @NotNull
    public static final Companion f35507b = new Companion(null);

    /* renamed from: c */
    @NotNull
    public static final DivFixedSize f35508c = new DivFixedSize(null, Expression.f34334a.m17539a(15L), 1);

    /* renamed from: a */
    @JvmField
    @NotNull
    public final DivFixedSize f35509a;

    /* compiled from: DivDefaultIndicatorItemPlacement.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31884d2 = {"Lcom/yandex/div2/DivDefaultIndicatorItemPlacement$Companion;", "", "Lcom/yandex/div2/DivFixedSize;", "SPACE_BETWEEN_CENTERS_DEFAULT_VALUE", "Lcom/yandex/div2/DivFixedSize;", "", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivDefaultIndicatorItemPlacement m17610a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            DivFixedSize.Companion companion = DivFixedSize.f35789c;
            DivFixedSize divFixedSize = (DivFixedSize) JsonParser.m17322n(jSONObject, "space_between_centers", DivFixedSize.f35793g, f34328a, parsingEnvironment);
            if (divFixedSize == null) {
                divFixedSize = DivDefaultIndicatorItemPlacement.f35508c;
            }
            Intrinsics.m32178g(divFixedSize, "JsonParser.readOptional(…EEN_CENTERS_DEFAULT_VALUE");
            return new DivDefaultIndicatorItemPlacement(divFixedSize);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        DivDefaultIndicatorItemPlacement$Companion$CREATOR$1 divDefaultIndicatorItemPlacement$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivDefaultIndicatorItemPlacement>() { // from class: com.yandex.div2.DivDefaultIndicatorItemPlacement$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivDefaultIndicatorItemPlacement invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivDefaultIndicatorItemPlacement.f35507b.m17610a(env, it);
            }
        };
    }

    @DivModelInternalApi
    public DivDefaultIndicatorItemPlacement(@NotNull DivFixedSize spaceBetweenCenters) {
        Intrinsics.m32179h(spaceBetweenCenters, "spaceBetweenCenters");
        this.f35509a = spaceBetweenCenters;
    }

    @DivModelInternalApi
    public DivDefaultIndicatorItemPlacement() {
        this(f35508c);
    }
}
