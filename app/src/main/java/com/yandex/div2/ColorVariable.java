package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.C2900a;
import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: ColorVariable.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/ColorVariable;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class ColorVariable implements JSONSerializable {

    /* renamed from: c */
    @NotNull
    public static final Companion f34394c = new Companion(null);

    /* renamed from: a */
    @JvmField
    @NotNull
    public final String f34395a;

    /* renamed from: b */
    @JvmField
    public final int f34396b;

    /* compiled from: ColorVariable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m31884d2 = {"Lcom/yandex/div2/ColorVariable$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "NAME_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "NAME_VALIDATOR", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final ColorVariable m17553a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            Companion companion = ColorVariable.f34394c;
            return new ColorVariable((String) JsonParser.m17311c(jSONObject, "name", C2900a.f33723g, f34328a, parsingEnvironment), ((Number) JsonParser.m17312d(jSONObject, "value", ParsingConvertersKt.f33827a, C2904b.f33858e)).intValue());
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        ColorVariable$Companion$CREATOR$1 colorVariable$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, ColorVariable>() { // from class: com.yandex.div2.ColorVariable$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public ColorVariable invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return ColorVariable.f34394c.m17553a(env, it);
            }
        };
    }

    @DivModelInternalApi
    public ColorVariable(@NotNull String name, int i2) {
        Intrinsics.m32179h(name, "name");
        this.f34395a = name;
        this.f34396b = i2;
    }
}
