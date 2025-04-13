package com.yandex.div.internal.parser;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: JsonParserInternals.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002*v\u0010\b\u001a\u0004\b\u0000\u0010\u0000\u001a\u0004\b\u0001\u0010\u0001\"2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00010\u000222\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00010\u0002*6\b\u0000\u0010\u000b\u001a\u0004\b\u0000\u0010\u0000\"\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\f"}, m31884d2 = {"T", "R", "Lkotlin/Function2;", "Lcom/yandex/div/json/ParsingEnvironment;", "Lkotlin/ParameterName;", "name", "env", "value", "Creator", "Lorg/json/JSONArray;", "", "ItemReader", "div-json_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class JsonParserInternalsKt {
    @PublishedApi
    @Nullable
    /* renamed from: a */
    public static final Object m17335a(@NotNull JSONArray jSONArray, int i2) {
        Object opt = jSONArray.opt(i2);
        if (Intrinsics.m32174c(opt, JSONObject.NULL)) {
            return null;
        }
        return opt;
    }

    @PublishedApi
    @Nullable
    /* renamed from: b */
    public static final Object m17336b(@NotNull JSONObject jSONObject, @NotNull String str) {
        Object opt = jSONObject.opt(str);
        if (Intrinsics.m32174c(opt, JSONObject.NULL)) {
            return null;
        }
        return opt;
    }

    @PublishedApi
    @Nullable
    /* renamed from: c */
    public static final <T, R extends JSONSerializable> R m17337c(@NotNull Function2<? super ParsingEnvironment, ? super T, ? extends R> function2, @NotNull ParsingEnvironment parsingEnvironment, T t, @NotNull ParsingErrorLogger parsingErrorLogger) {
        Intrinsics.m32179h(null, "<this>");
        throw null;
    }
}
