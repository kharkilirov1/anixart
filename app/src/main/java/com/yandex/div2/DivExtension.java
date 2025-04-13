package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div2.DivExtension;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivExtension.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivExtension;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivExtension implements JSONSerializable {

    /* renamed from: c */
    @NotNull
    public static final Companion f35659c = new Companion(null);

    /* renamed from: d */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivExtension> f35660d = new Function2<ParsingEnvironment, JSONObject, DivExtension>() { // from class: com.yandex.div2.DivExtension$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivExtension invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivExtension.Companion companion = DivExtension.f35659c;
            ParsingErrorLogger mo17208a = env.mo17208a();
            DivExtension.Companion companion2 = DivExtension.f35659c;
            String str = (String) JsonParser.m17311c(it, "id", C3049i.f41491r, mo17208a, env);
            Object m17310b = JsonParser.m17310b(it, "params");
            if (m17310b == null) {
                m17310b = null;
            }
            return new DivExtension(str, (JSONObject) m17310b);
        }
    };

    /* renamed from: a */
    @JvmField
    @NotNull
    public final String f35661a;

    /* renamed from: b */
    @JvmField
    @Nullable
    public final JSONObject f35662b;

    /* compiled from: DivExtension.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivExtension$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "ID_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "ID_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @DivModelInternalApi
    public DivExtension(@NotNull String id2, @Nullable JSONObject jSONObject) {
        Intrinsics.m32179h(id2, "id");
        this.f35661a = id2;
        this.f35662b = jSONObject;
    }
}
