package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivCornersRadius;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivCornersRadius.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivCornersRadius;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivCornersRadius implements JSONSerializable {

    /* renamed from: e */
    @NotNull
    public static final Companion f35216e = new Companion(null);

    /* renamed from: f */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivCornersRadius> f35217f = new Function2<ParsingEnvironment, JSONObject, DivCornersRadius>() { // from class: com.yandex.div2.DivCornersRadius$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivCornersRadius invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivCornersRadius.Companion companion = DivCornersRadius.f35216e;
            ParsingErrorLogger f33840b = env.getF33840b();
            Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
            DivCornersRadius.Companion companion2 = DivCornersRadius.f35216e;
            C3043f c3043f = C3043f.f41326f;
            TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
            return new DivCornersRadius(JsonParser.m17327s(it, "bottom-left", function1, c3043f, f33840b, env, typeHelper), JsonParser.m17327s(it, "bottom-right", function1, C3043f.f41327g, f33840b, env, typeHelper), JsonParser.m17327s(it, "top-left", function1, C3043f.f41328h, f33840b, env, typeHelper), JsonParser.m17327s(it, "top-right", function1, C3043f.f41329i, f33840b, env, typeHelper));
        }
    };

    /* renamed from: a */
    @JvmField
    @Nullable
    public final Expression<Long> f35218a;

    /* renamed from: b */
    @JvmField
    @Nullable
    public final Expression<Long> f35219b;

    /* renamed from: c */
    @JvmField
    @Nullable
    public final Expression<Long> f35220c;

    /* renamed from: d */
    @JvmField
    @Nullable
    public final Expression<Long> f35221d;

    /* compiled from: DivCornersRadius.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005¨\u0006\r"}, m31884d2 = {"Lcom/yandex/div2/DivCornersRadius$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "BOTTOM_LEFT_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "BOTTOM_LEFT_VALIDATOR", "BOTTOM_RIGHT_TEMPLATE_VALIDATOR", "BOTTOM_RIGHT_VALIDATOR", "TOP_LEFT_TEMPLATE_VALIDATOR", "TOP_LEFT_VALIDATOR", "TOP_RIGHT_TEMPLATE_VALIDATOR", "TOP_RIGHT_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @DivModelInternalApi
    public DivCornersRadius(@Nullable Expression<Long> expression, @Nullable Expression<Long> expression2, @Nullable Expression<Long> expression3, @Nullable Expression<Long> expression4) {
        this.f35218a = expression;
        this.f35219b = expression2;
        this.f35220c = expression3;
        this.f35221d = expression4;
    }

    @DivModelInternalApi
    public DivCornersRadius() {
        this(null, null, null, null);
    }
}
