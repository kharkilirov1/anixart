package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div2.DivChangeTransition;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivChangeSetTransition.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivChangeSetTransition;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivChangeSetTransition implements JSONSerializable {

    /* renamed from: b */
    @NotNull
    public static final Companion f34848b = new Companion(null);

    /* renamed from: a */
    @JvmField
    @NotNull
    public final List<DivChangeTransition> f34849a;

    /* compiled from: DivChangeSetTransition.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m31884d2 = {"Lcom/yandex/div2/DivChangeSetTransition$Companion;", "", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivChangeTransition;", "ITEMS_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivChangeSetTransition m17594a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            DivChangeTransition.Companion companion = DivChangeTransition.f34856a;
            Function2<ParsingEnvironment, JSONObject, DivChangeTransition> function2 = DivChangeTransition.f34857b;
            Companion companion2 = DivChangeSetTransition.f34848b;
            List m17321m = JsonParser.m17321m(jSONObject, "items", function2, C3037c.f41169n, f34328a, parsingEnvironment);
            Intrinsics.m32178g(m17321m, "readList(json, \"items\", …S_VALIDATOR, logger, env)");
            return new DivChangeSetTransition(m17321m);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        DivChangeSetTransition$Companion$CREATOR$1 divChangeSetTransition$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivChangeSetTransition>() { // from class: com.yandex.div2.DivChangeSetTransition$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivChangeSetTransition invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivChangeSetTransition.f34848b.m17594a(env, it);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @DivModelInternalApi
    public DivChangeSetTransition(@NotNull List<? extends DivChangeTransition> items) {
        Intrinsics.m32179h(items, "items");
        this.f34849a = items;
    }
}
