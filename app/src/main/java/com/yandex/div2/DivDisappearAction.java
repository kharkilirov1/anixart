package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivDisappearAction;
import com.yandex.div2.DivDownloadCallbacks;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivDisappearAction.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivDisappearAction;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivDisappearAction implements JSONSerializable {

    /* renamed from: a */
    @NotNull
    public static final Companion f35537a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Expression<Long> f35538b;

    /* renamed from: c */
    @NotNull
    public static final Expression<Long> f35539c;

    /* renamed from: d */
    @NotNull
    public static final Expression<Long> f35540d;

    /* renamed from: e */
    @NotNull
    public static final ValueValidator<Long> f35541e;

    /* renamed from: f */
    @NotNull
    public static final ValueValidator<String> f35542f;

    /* renamed from: g */
    @NotNull
    public static final ValueValidator<Long> f35543g;

    /* renamed from: h */
    @NotNull
    public static final ValueValidator<Long> f35544h;

    /* renamed from: i */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivDisappearAction> f35545i;

    /* compiled from: DivDisappearAction.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\b¨\u0006\u0013"}, m31884d2 = {"Lcom/yandex/div2/DivDisappearAction$Companion;", "", "Lcom/yandex/div/json/expressions/Expression;", "", "DISAPPEAR_DURATION_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/ValueValidator;", "DISAPPEAR_DURATION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "DISAPPEAR_DURATION_VALIDATOR", "", "LOG_ID_TEMPLATE_VALIDATOR", "LOG_ID_VALIDATOR", "LOG_LIMIT_DEFAULT_VALUE", "LOG_LIMIT_TEMPLATE_VALIDATOR", "LOG_LIMIT_VALIDATOR", "VISIBILITY_PERCENTAGE_DEFAULT_VALUE", "VISIBILITY_PERCENTAGE_TEMPLATE_VALIDATOR", "VISIBILITY_PERCENTAGE_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f35538b = companion.m17539a(800L);
        f35539c = companion.m17539a(1L);
        f35540d = companion.m17539a(0L);
        f35541e = C3045g.f41383q;
        f35542f = C3045g.f41384r;
        f35543g = C3045g.f41385s;
        f35544h = C3045g.f41386t;
        f35545i = new Function2<ParsingEnvironment, JSONObject, DivDisappearAction>() { // from class: com.yandex.div2.DivDisappearAction$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivDisappearAction invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                DivDisappearAction.Companion companion2 = DivDisappearAction.f35537a;
                ParsingErrorLogger f34328a = env.getF34328a();
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivDisappearAction.f35541e;
                Expression<Long> expression = DivDisappearAction.f35538b;
                TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
                Expression<Long> m17328t = JsonParser.m17328t(it, "disappear_duration", function1, valueValidator, f34328a, expression, typeHelper);
                Expression<Long> expression2 = m17328t == null ? expression : m17328t;
                DivDownloadCallbacks.Companion companion3 = DivDownloadCallbacks.f35585c;
                DivDownloadCallbacks divDownloadCallbacks = (DivDownloadCallbacks) JsonParser.m17322n(it, "download_callbacks", DivDownloadCallbacks.f35586d, f34328a, env);
                String str = (String) JsonParser.m17311c(it, "log_id", DivDisappearAction.f35542f, f34328a, env);
                ValueValidator<Long> valueValidator2 = DivDisappearAction.f35543g;
                Expression<Long> expression3 = DivDisappearAction.f35539c;
                Expression<Long> m17328t2 = JsonParser.m17328t(it, "log_limit", function1, valueValidator2, f34328a, expression3, typeHelper);
                Expression<Long> expression4 = m17328t2 == null ? expression3 : m17328t2;
                Object m17310b = JsonParser.m17310b(it, "payload");
                if (m17310b == null) {
                    m17310b = null;
                }
                JSONObject jSONObject2 = (JSONObject) m17310b;
                Function1<String, Uri> function12 = ParsingConvertersKt.f33828b;
                TypeHelper<Uri> typeHelper2 = TypeHelpersKt.f33852e;
                Expression m17329u = JsonParser.m17329u(it, "referer", function12, f34328a, env, typeHelper2);
                Expression m17329u2 = JsonParser.m17329u(it, "url", function12, f34328a, env, typeHelper2);
                ValueValidator<Long> valueValidator3 = DivDisappearAction.f35544h;
                Expression<Long> expression5 = DivDisappearAction.f35540d;
                Expression<Long> m17328t3 = JsonParser.m17328t(it, "visibility_percentage", function1, valueValidator3, f34328a, expression5, typeHelper);
                return new DivDisappearAction(expression2, divDownloadCallbacks, str, expression4, jSONObject2, m17329u, m17329u2, m17328t3 == null ? expression5 : m17328t3);
            }
        };
    }

    @DivModelInternalApi
    public DivDisappearAction(@NotNull Expression<Long> disappearDuration, @Nullable DivDownloadCallbacks divDownloadCallbacks, @NotNull String logId, @NotNull Expression<Long> logLimit, @Nullable JSONObject jSONObject, @Nullable Expression<Uri> expression, @Nullable Expression<Uri> expression2, @NotNull Expression<Long> visibilityPercentage) {
        Intrinsics.m32179h(disappearDuration, "disappearDuration");
        Intrinsics.m32179h(logId, "logId");
        Intrinsics.m32179h(logLimit, "logLimit");
        Intrinsics.m32179h(visibilityPercentage, "visibilityPercentage");
    }
}
