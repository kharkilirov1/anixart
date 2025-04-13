package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.C2900a;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingExceptionKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DictVariable.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DictVariable;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DictVariable implements JSONSerializable {

    /* renamed from: c */
    @NotNull
    public static final Companion f34406c = new Companion(null);

    /* renamed from: a */
    @JvmField
    @NotNull
    public final String f34407a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final JSONObject f34408b;

    /* compiled from: DictVariable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m31884d2 = {"Lcom/yandex/div2/DictVariable$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "NAME_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "NAME_VALIDATOR", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DictVariable m17555a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            Companion companion = DictVariable.f34406c;
            String str = (String) JsonParser.m17311c(jSONObject, "name", C2900a.f33726j, f34328a, parsingEnvironment);
            Object m17310b = JsonParser.m17310b(jSONObject, "value");
            if (m17310b != null) {
                return new DictVariable(str, (JSONObject) m17310b);
            }
            throw ParsingExceptionKt.m17523h(jSONObject, "value");
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        DictVariable$Companion$CREATOR$1 dictVariable$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DictVariable>() { // from class: com.yandex.div2.DictVariable$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DictVariable invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DictVariable.f34406c.m17555a(env, it);
            }
        };
    }

    @DivModelInternalApi
    public DictVariable(@NotNull String name, @NotNull JSONObject value) {
        Intrinsics.m32179h(name, "name");
        Intrinsics.m32179h(value, "value");
        this.f34407a = name;
        this.f34408b = value;
    }
}
