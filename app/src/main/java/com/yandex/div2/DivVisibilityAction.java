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
import com.yandex.div2.DivDownloadCallbacks;
import com.yandex.div2.DivVisibilityAction;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivVisibilityAction.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivVisibilityAction;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivVisibilityAction implements JSONSerializable {

    /* renamed from: i */
    @NotNull
    public static final Companion f40938i = new Companion(null);

    /* renamed from: j */
    @NotNull
    public static final Expression<Long> f40939j;

    /* renamed from: k */
    @NotNull
    public static final Expression<Long> f40940k;

    /* renamed from: l */
    @NotNull
    public static final Expression<Long> f40941l;

    /* renamed from: m */
    @NotNull
    public static final ValueValidator<String> f40942m;

    /* renamed from: n */
    @NotNull
    public static final ValueValidator<Long> f40943n;

    /* renamed from: o */
    @NotNull
    public static final ValueValidator<Long> f40944o;

    /* renamed from: p */
    @NotNull
    public static final ValueValidator<Long> f40945p;

    /* renamed from: q */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivVisibilityAction> f40946q;

    /* renamed from: a */
    @JvmField
    @Nullable
    public final DivDownloadCallbacks f40947a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final String f40948b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Expression<Long> f40949c;

    /* renamed from: d */
    @JvmField
    @Nullable
    public final JSONObject f40950d;

    /* renamed from: e */
    @JvmField
    @Nullable
    public final Expression<Uri> f40951e;

    /* renamed from: f */
    @JvmField
    @Nullable
    public final Expression<Uri> f40952f;

    /* renamed from: g */
    @JvmField
    @NotNull
    public final Expression<Long> f40953g;

    /* renamed from: h */
    @JvmField
    @NotNull
    public final Expression<Long> f40954h;

    /* compiled from: DivVisibilityAction.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0005R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005¨\u0006\u0013"}, m31884d2 = {"Lcom/yandex/div2/DivVisibilityAction$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "LOG_ID_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "LOG_ID_VALIDATOR", "Lcom/yandex/div/json/expressions/Expression;", "", "LOG_LIMIT_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "LOG_LIMIT_TEMPLATE_VALIDATOR", "LOG_LIMIT_VALIDATOR", "VISIBILITY_DURATION_DEFAULT_VALUE", "VISIBILITY_DURATION_TEMPLATE_VALIDATOR", "VISIBILITY_DURATION_VALIDATOR", "VISIBILITY_PERCENTAGE_DEFAULT_VALUE", "VISIBILITY_PERCENTAGE_TEMPLATE_VALIDATOR", "VISIBILITY_PERCENTAGE_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f40939j = companion.m17539a(1L);
        f40940k = companion.m17539a(800L);
        f40941l = companion.m17539a(50L);
        f40942m = C3068r0.f41976f;
        f40943n = C3068r0.f41977g;
        f40944o = C3068r0.f41978h;
        f40945p = C3068r0.f41979i;
        f40946q = new Function2<ParsingEnvironment, JSONObject, DivVisibilityAction>() { // from class: com.yandex.div2.DivVisibilityAction$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivVisibilityAction invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                DivVisibilityAction.Companion companion2 = DivVisibilityAction.f40938i;
                ParsingErrorLogger f33840b = env.getF33840b();
                DivDownloadCallbacks.Companion companion3 = DivDownloadCallbacks.f35585c;
                DivDownloadCallbacks divDownloadCallbacks = (DivDownloadCallbacks) JsonParser.m17322n(it, "download_callbacks", DivDownloadCallbacks.f35586d, f33840b, env);
                String str = (String) JsonParser.m17311c(it, "log_id", DivVisibilityAction.f40942m, f33840b, env);
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                ValueValidator<Long> valueValidator = DivVisibilityAction.f40943n;
                Expression<Long> expression = DivVisibilityAction.f40939j;
                TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
                Expression<Long> m17328t = JsonParser.m17328t(it, "log_limit", function1, valueValidator, f33840b, expression, typeHelper);
                Expression<Long> expression2 = m17328t == null ? expression : m17328t;
                Object m17310b = JsonParser.m17310b(it, "payload");
                if (m17310b == null) {
                    m17310b = null;
                }
                JSONObject jSONObject2 = (JSONObject) m17310b;
                Function1<String, Uri> function12 = ParsingConvertersKt.f33828b;
                TypeHelper<Uri> typeHelper2 = TypeHelpersKt.f33852e;
                Expression m17329u = JsonParser.m17329u(it, "referer", function12, f33840b, env, typeHelper2);
                Expression m17329u2 = JsonParser.m17329u(it, "url", function12, f33840b, env, typeHelper2);
                ValueValidator<Long> valueValidator2 = DivVisibilityAction.f40944o;
                Expression<Long> expression3 = DivVisibilityAction.f40940k;
                Expression<Long> m17328t2 = JsonParser.m17328t(it, "visibility_duration", function1, valueValidator2, f33840b, expression3, typeHelper);
                Expression<Long> expression4 = m17328t2 == null ? expression3 : m17328t2;
                ValueValidator<Long> valueValidator3 = DivVisibilityAction.f40945p;
                Expression<Long> expression5 = DivVisibilityAction.f40941l;
                Expression<Long> m17328t3 = JsonParser.m17328t(it, "visibility_percentage", function1, valueValidator3, f33840b, expression5, typeHelper);
                return new DivVisibilityAction(divDownloadCallbacks, str, expression2, jSONObject2, m17329u, m17329u2, expression4, m17328t3 == null ? expression5 : m17328t3);
            }
        };
    }

    @DivModelInternalApi
    public DivVisibilityAction(@Nullable DivDownloadCallbacks divDownloadCallbacks, @NotNull String logId, @NotNull Expression<Long> logLimit, @Nullable JSONObject jSONObject, @Nullable Expression<Uri> expression, @Nullable Expression<Uri> expression2, @NotNull Expression<Long> visibilityDuration, @NotNull Expression<Long> visibilityPercentage) {
        Intrinsics.m32179h(logId, "logId");
        Intrinsics.m32179h(logLimit, "logLimit");
        Intrinsics.m32179h(visibilityDuration, "visibilityDuration");
        Intrinsics.m32179h(visibilityPercentage, "visibilityPercentage");
        this.f40947a = divDownloadCallbacks;
        this.f40948b = logId;
        this.f40949c = logLimit;
        this.f40950d = jSONObject;
        this.f40951e = expression;
        this.f40952f = expression2;
        this.f40953g = visibilityDuration;
        this.f40954h = visibilityPercentage;
    }
}
