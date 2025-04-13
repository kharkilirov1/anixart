package com.yandex.div.internal.parser;

import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingExceptionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: JsonParser.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div-json_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class JsonParserKt {
    @NotNull
    /* renamed from: a */
    public static final <T> T m17338a(@NotNull JSONObject jSONObject, @NotNull String key, @NotNull ValueValidator<T> validator, @NotNull ParsingErrorLogger logger, @NotNull ParsingEnvironment env) {
        Intrinsics.m32179h(jSONObject, "<this>");
        Intrinsics.m32179h(key, "key");
        Intrinsics.m32179h(validator, "validator");
        Intrinsics.m32179h(logger, "logger");
        Intrinsics.m32179h(env, "env");
        T t = (T) JsonParserInternalsKt.m17336b(jSONObject, key);
        if (t == null) {
            throw ParsingExceptionKt.m17523h(jSONObject, key);
        }
        if (validator.mo17302a(t)) {
            return t;
        }
        throw ParsingExceptionKt.m17520e(jSONObject, key, t);
    }
}
