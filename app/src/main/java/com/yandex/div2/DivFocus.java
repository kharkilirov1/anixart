package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivFocus;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivFocus.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div2/DivFocus;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "NextFocusIds", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivFocus implements JSONSerializable {

    /* renamed from: f */
    @NotNull
    public static final Companion f35813f = new Companion(null);

    /* renamed from: g */
    @NotNull
    public static final DivBorder f35814g = new DivBorder(null, null, null, null, null, 31);

    /* renamed from: h */
    @NotNull
    public static final ListValidator<DivBackground> f35815h = C3053k.f41590e;

    /* renamed from: i */
    @NotNull
    public static final ListValidator<DivAction> f35816i = C3053k.f41591f;

    /* renamed from: j */
    @NotNull
    public static final ListValidator<DivAction> f35817j = C3053k.f41592g;

    /* renamed from: k */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivFocus> f35818k = new Function2<ParsingEnvironment, JSONObject, DivFocus>() { // from class: com.yandex.div2.DivFocus$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivFocus invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivFocus.Companion companion = DivFocus.f35813f;
            ParsingErrorLogger f34328a = env.getF34328a();
            DivBackground.Companion companion2 = DivBackground.f34750a;
            List m17333y = JsonParser.m17333y(it, "background", DivBackground.f34751b, DivFocus.f35815h, f34328a, env);
            DivBorder.Companion companion3 = DivBorder.f34785f;
            DivBorder divBorder = (DivBorder) JsonParser.m17322n(it, "border", DivBorder.f34788i, f34328a, env);
            if (divBorder == null) {
                divBorder = DivFocus.f35814g;
            }
            DivBorder divBorder2 = divBorder;
            Intrinsics.m32178g(divBorder2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            DivFocus.NextFocusIds.Companion companion4 = DivFocus.NextFocusIds.f35825f;
            DivFocus.NextFocusIds nextFocusIds = (DivFocus.NextFocusIds) JsonParser.m17322n(it, "next_focus_ids", DivFocus.NextFocusIds.f35826g, f34328a, env);
            DivAction.Companion companion5 = DivAction.f34546g;
            Function2<ParsingEnvironment, JSONObject, DivAction> function2 = DivAction.f34550k;
            return new DivFocus(m17333y, divBorder2, nextFocusIds, JsonParser.m17333y(it, "on_blur", function2, DivFocus.f35816i, f34328a, env), JsonParser.m17333y(it, "on_focus", function2, DivFocus.f35817j, f34328a, env));
        }
    };

    /* renamed from: a */
    @JvmField
    @Nullable
    public final List<DivBackground> f35819a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final DivBorder f35820b;

    /* renamed from: c */
    @JvmField
    @Nullable
    public final NextFocusIds f35821c;

    /* renamed from: d */
    @JvmField
    @Nullable
    public final List<DivAction> f35822d;

    /* renamed from: e */
    @JvmField
    @Nullable
    public final List<DivAction> f35823e;

    /* compiled from: DivFocus.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005¨\u0006\f"}, m31884d2 = {"Lcom/yandex/div2/DivFocus$Companion;", "", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBackground;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivBorder;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/DivBorder;", "Lcom/yandex/div2/DivAction;", "ON_BLUR_VALIDATOR", "ON_FOCUS_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @DivModelInternalApi
    public DivFocus(@Nullable List<? extends DivBackground> list, @NotNull DivBorder border, @Nullable NextFocusIds nextFocusIds, @Nullable List<? extends DivAction> list2, @Nullable List<? extends DivAction> list3) {
        Intrinsics.m32179h(border, "border");
        this.f35819a = list;
        this.f35820b = border;
        this.f35821c = nextFocusIds;
        this.f35822d = list2;
        this.f35823e = list3;
    }

    /* compiled from: DivFocus.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivFocus$NextFocusIds;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class NextFocusIds implements JSONSerializable {

        /* renamed from: f */
        @NotNull
        public static final Companion f35825f = new Companion(null);

        /* renamed from: g */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, NextFocusIds> f35826g = new Function2<ParsingEnvironment, JSONObject, NextFocusIds>() { // from class: com.yandex.div2.DivFocus$NextFocusIds$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivFocus.NextFocusIds invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                DivFocus.NextFocusIds.Companion companion = DivFocus.NextFocusIds.f35825f;
                ParsingErrorLogger f34328a = env.getF34328a();
                DivFocus.NextFocusIds.Companion companion2 = DivFocus.NextFocusIds.f35825f;
                C3055l c3055l = C3055l.f41629c;
                TypeHelper<String> typeHelper = TypeHelpersKt.f33850c;
                return new DivFocus.NextFocusIds(JsonParser.m17325q(it, "down", c3055l, f34328a, env, typeHelper), JsonParser.m17325q(it, "forward", C3055l.f41630d, f34328a, env, typeHelper), JsonParser.m17325q(it, "left", C3055l.f41631e, f34328a, env, typeHelper), JsonParser.m17325q(it, "right", C3055l.f41632f, f34328a, env, typeHelper), JsonParser.m17325q(it, "up", C3055l.f41633g, f34328a, env, typeHelper));
            }
        };

        /* renamed from: a */
        @JvmField
        @Nullable
        public final Expression<String> f35827a;

        /* renamed from: b */
        @JvmField
        @Nullable
        public final Expression<String> f35828b;

        /* renamed from: c */
        @JvmField
        @Nullable
        public final Expression<String> f35829c;

        /* renamed from: d */
        @JvmField
        @Nullable
        public final Expression<String> f35830d;

        /* renamed from: e */
        @JvmField
        @Nullable
        public final Expression<String> f35831e;

        /* compiled from: DivFocus.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005¨\u0006\u000f"}, m31884d2 = {"Lcom/yandex/div2/DivFocus$NextFocusIds$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "DOWN_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "DOWN_VALIDATOR", "FORWARD_TEMPLATE_VALIDATOR", "FORWARD_VALIDATOR", "LEFT_TEMPLATE_VALIDATOR", "LEFT_VALIDATOR", "RIGHT_TEMPLATE_VALIDATOR", "RIGHT_VALIDATOR", "UP_TEMPLATE_VALIDATOR", "UP_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        @DivModelInternalApi
        public NextFocusIds(@Nullable Expression<String> expression, @Nullable Expression<String> expression2, @Nullable Expression<String> expression3, @Nullable Expression<String> expression4, @Nullable Expression<String> expression5) {
            this.f35827a = expression;
            this.f35828b = expression2;
            this.f35829c = expression3;
            this.f35830d = expression4;
            this.f35831e = expression5;
        }

        @DivModelInternalApi
        public NextFocusIds() {
            this(null, null, null, null, null);
        }
    }

    @DivModelInternalApi
    public DivFocus() {
        this(null, f35814g, null, null, null);
    }
}
