package com.yandex.div.json;

import androidx.room.util.C0576a;
import com.yandex.div.internal.util.JsonArray;
import com.yandex.div.internal.util.JsonObject;
import com.yandex.div.internal.util.JsonUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p000a.C0000a;

/* compiled from: ParsingException.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div-json_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ParsingExceptionKt {
    @NotNull
    /* renamed from: a */
    public static final ParsingException m17516a(@NotNull JSONObject jSONObject, @NotNull String key, @NotNull ParsingException parsingException) {
        Intrinsics.m32179h(key, "key");
        return new ParsingException(ParsingExceptionReason.DEPENDENCY_FAILED, C0000a.m16m("Value for key '", key, "' is failed to create"), parsingException, new JsonObject(jSONObject), JsonUtilsKt.m17390b(jSONObject, 0, 1));
    }

    @NotNull
    /* renamed from: b */
    public static final <T> ParsingException m17517b(@NotNull String path, T t) {
        Intrinsics.m32179h(path, "path");
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.INVALID_VALUE;
        StringBuilder m24u = C0000a.m24u("Value '");
        m24u.append(m17525j(t));
        m24u.append("' at path '");
        m24u.append(path);
        m24u.append("' is not valid");
        return new ParsingException(parsingExceptionReason, m24u.toString(), null, null, null, 28);
    }

    @NotNull
    /* renamed from: c */
    public static final <T> ParsingException m17518c(@NotNull JSONArray jSONArray, @NotNull String key, int i2, T t) {
        Intrinsics.m32179h(key, "key");
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.INVALID_VALUE;
        StringBuilder m24u = C0000a.m24u("Value '");
        m24u.append(m17525j(t));
        m24u.append("' at ");
        m24u.append(i2);
        m24u.append(" position of '");
        m24u.append(key);
        m24u.append("' is not valid");
        return new ParsingException(parsingExceptionReason, m24u.toString(), null, new JsonArray(jSONArray), JsonUtilsKt.m17389a(jSONArray, 0, 1), 4);
    }

    @NotNull
    /* renamed from: d */
    public static final <T> ParsingException m17519d(@NotNull JSONArray jSONArray, @NotNull String key, int i2, T t, @NotNull Throwable th) {
        Intrinsics.m32179h(key, "key");
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.INVALID_VALUE;
        StringBuilder m24u = C0000a.m24u("Value '");
        m24u.append(m17525j(t));
        m24u.append("' at ");
        m24u.append(i2);
        m24u.append(" position of '");
        m24u.append(key);
        m24u.append("' is not valid");
        return new ParsingException(parsingExceptionReason, m24u.toString(), th, new JsonArray(jSONArray), null, 16);
    }

    @NotNull
    /* renamed from: e */
    public static final <T> ParsingException m17520e(@NotNull JSONObject json, @NotNull String key, T t) {
        Intrinsics.m32179h(json, "json");
        Intrinsics.m32179h(key, "key");
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.INVALID_VALUE;
        StringBuilder m24u = C0000a.m24u("Value '");
        m24u.append(m17525j(t));
        m24u.append("' for key '");
        m24u.append(key);
        m24u.append("' is not valid");
        return new ParsingException(parsingExceptionReason, m24u.toString(), null, new JsonObject(json), JsonUtilsKt.m17390b(json, 0, 1), 4);
    }

    @NotNull
    /* renamed from: f */
    public static final <T> ParsingException m17521f(@NotNull JSONObject jSONObject, @NotNull String key, T t, @NotNull Throwable th) {
        Intrinsics.m32179h(key, "key");
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.INVALID_VALUE;
        StringBuilder m24u = C0000a.m24u("Value '");
        m24u.append(m17525j(t));
        m24u.append("' for key '");
        m24u.append(key);
        m24u.append("' is not valid");
        return new ParsingException(parsingExceptionReason, m24u.toString(), th, new JsonObject(jSONObject), null, 16);
    }

    @NotNull
    /* renamed from: g */
    public static final ParsingException m17522g(@NotNull JSONArray jSONArray, @NotNull String key, int i2) {
        Intrinsics.m32179h(key, "key");
        return new ParsingException(ParsingExceptionReason.MISSING_VALUE, "Value at " + i2 + " position of '" + key + "' is missing", null, new JsonArray(jSONArray), JsonUtilsKt.m17389a(jSONArray, 0, 1), 4);
    }

    @NotNull
    /* renamed from: h */
    public static final ParsingException m17523h(@NotNull JSONObject jSONObject, @NotNull String key) {
        Intrinsics.m32179h(key, "key");
        return new ParsingException(ParsingExceptionReason.MISSING_VALUE, C0000a.m16m("Value for key '", key, "' is missing"), null, new JsonObject(jSONObject), JsonUtilsKt.m17390b(jSONObject, 0, 1), 4);
    }

    @NotNull
    /* renamed from: i */
    public static final <T> ParsingException m17524i(@NotNull String key, T t, @Nullable Throwable th) {
        Intrinsics.m32179h(key, "key");
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.INVALID_VALUE;
        StringBuilder m24u = C0000a.m24u("Value '");
        m24u.append(m17525j(t));
        m24u.append("' for key '");
        m24u.append(key);
        m24u.append("' could not be resolved");
        return new ParsingException(parsingExceptionReason, m24u.toString(), th, null, null, 24);
    }

    /* renamed from: j */
    public static final String m17525j(Object obj) {
        String valueOf = String.valueOf(obj);
        return valueOf.length() > 100 ? Intrinsics.m32187p(StringsKt.m33907g0(valueOf, 97), "...") : valueOf;
    }

    @NotNull
    /* renamed from: k */
    public static final ParsingException m17526k(@NotNull String expressionKey, @NotNull String rawExpression, @Nullable Object obj, @Nullable Throwable th) {
        Intrinsics.m32179h(expressionKey, "expressionKey");
        Intrinsics.m32179h(rawExpression, "rawExpression");
        return new ParsingException(ParsingExceptionReason.TYPE_MISMATCH, C0576a.m4117p(C0000a.m29z("Expression '", expressionKey, "': '", rawExpression, "' received value of wrong type: '"), obj, '\''), th, null, null, 24);
    }

    @NotNull
    /* renamed from: l */
    public static final ParsingException m17527l(@NotNull JSONArray jSONArray, @NotNull String key, int i2, @NotNull Object obj) {
        Intrinsics.m32179h(key, "key");
        return new ParsingException(ParsingExceptionReason.TYPE_MISMATCH, "Value at " + i2 + " position of '" + key + "' has wrong type " + ((Object) obj.getClass().getName()), null, new JsonArray(jSONArray), JsonUtilsKt.m17389a(jSONArray, 0, 1), 4);
    }

    @NotNull
    /* renamed from: m */
    public static final ParsingException m17528m(@NotNull JSONObject jSONObject, @NotNull String key, @NotNull Object value) {
        Intrinsics.m32179h(key, "key");
        Intrinsics.m32179h(value, "value");
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.TYPE_MISMATCH;
        StringBuilder m28y = C0000a.m28y("Value for key '", key, "' has wrong type ");
        m28y.append((Object) value.getClass().getName());
        return new ParsingException(parsingExceptionReason, m28y.toString(), null, new JsonObject(jSONObject), JsonUtilsKt.m17390b(jSONObject, 0, 1), 4);
    }
}
