package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivStroke;
import com.yandex.div2.DivTextRangeBorder;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivTextRangeBorder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivTextRangeBorder;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivTextRangeBorder implements JSONSerializable {

    /* renamed from: c */
    @NotNull
    public static final Companion f40073c = new Companion(null);

    /* renamed from: d */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivTextRangeBorder> f40074d = new Function2<ParsingEnvironment, JSONObject, DivTextRangeBorder>() { // from class: com.yandex.div2.DivTextRangeBorder$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivTextRangeBorder invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivTextRangeBorder.Companion companion = DivTextRangeBorder.f40073c;
            ParsingErrorLogger f33840b = env.getF33840b();
            Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
            DivTextRangeBorder.Companion companion2 = DivTextRangeBorder.f40073c;
            Expression m17327s = JsonParser.m17327s(it, "corner_radius", function1, C3056l0.f41655c, f33840b, env, TypeHelpersKt.f33849b);
            DivStroke.Companion companion3 = DivStroke.f39434d;
            return new DivTextRangeBorder(m17327s, (DivStroke) JsonParser.m17322n(it, "stroke", DivStroke.f39439i, f33840b, env));
        }
    };

    /* renamed from: a */
    @JvmField
    @Nullable
    public final Expression<Long> f40075a;

    /* renamed from: b */
    @JvmField
    @Nullable
    public final DivStroke f40076b;

    /* compiled from: DivTextRangeBorder.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivTextRangeBorder$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "CORNER_RADIUS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "CORNER_RADIUS_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @DivModelInternalApi
    public DivTextRangeBorder(@Nullable Expression<Long> expression, @Nullable DivStroke divStroke) {
        this.f40075a = expression;
        this.f40076b = divStroke;
    }

    @DivModelInternalApi
    public DivTextRangeBorder() {
        this(null, null);
    }
}
