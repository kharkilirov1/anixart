package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivDownloadCallbacks;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivDownloadCallbacks.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivDownloadCallbacks;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivDownloadCallbacks implements JSONSerializable {

    /* renamed from: c */
    @NotNull
    public static final Companion f35585c = new Companion(null);

    /* renamed from: d */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivDownloadCallbacks> f35586d = new Function2<ParsingEnvironment, JSONObject, DivDownloadCallbacks>() { // from class: com.yandex.div2.DivDownloadCallbacks$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivDownloadCallbacks invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivDownloadCallbacks.Companion companion = DivDownloadCallbacks.f35585c;
            ParsingErrorLogger f33097d = env.getF33097d();
            DivAction.Companion companion2 = DivAction.f34546g;
            Function2<ParsingEnvironment, JSONObject, DivAction> function2 = DivAction.f34550k;
            DivDownloadCallbacks.Companion companion3 = DivDownloadCallbacks.f35585c;
            return new DivDownloadCallbacks(JsonParser.m17333y(it, "on_fail_actions", function2, C3047h.f41453z, f33097d, env), JsonParser.m17333y(it, "on_success_actions", function2, C3047h.f41424A, f33097d, env));
        }
    };

    /* renamed from: a */
    @JvmField
    @Nullable
    public final List<DivAction> f35587a;

    /* renamed from: b */
    @JvmField
    @Nullable
    public final List<DivAction> f35588b;

    /* compiled from: DivDownloadCallbacks.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivDownloadCallbacks$Companion;", "", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAction;", "ON_FAIL_ACTIONS_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "ON_SUCCESS_ACTIONS_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @DivModelInternalApi
    public DivDownloadCallbacks(@Nullable List<? extends DivAction> list, @Nullable List<? extends DivAction> list2) {
        this.f35587a = list;
        this.f35588b = list2;
    }

    @DivModelInternalApi
    public DivDownloadCallbacks() {
        this(null, null);
    }
}
