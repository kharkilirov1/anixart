package com.p017vk.api.sdk.internal;

import android.util.JsonReader;
import android.util.JsonToken;
import android.util.MalformedJsonException;
import java.io.StringReader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: JsonUtils.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/vk/api/sdk/internal/JsonUtils;", "", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class JsonUtils {

    /* renamed from: a */
    public static final JsonUtils f30702a = new JsonUtils();

    /* renamed from: a */
    public final boolean m16508a(@NotNull String str, @NotNull String str2) {
        try {
            return m16509b(str, str2);
        } catch (MalformedJsonException e2) {
            throw new MalformedJsonException(e2.getMessage() + ". Json: '" + str + '\'');
        }
    }

    /* renamed from: b */
    public final boolean m16509b(String str, String str2) {
        JsonToken peek;
        if (str.length() == 0) {
            return false;
        }
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        if (jsonReader.hasNext() && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
            jsonReader.beginObject();
            while (jsonReader.hasNext() && (peek = jsonReader.peek()) != JsonToken.END_DOCUMENT) {
                if (peek != JsonToken.NAME) {
                    jsonReader.skipValue();
                } else if (Intrinsics.m32174c(str2, jsonReader.nextName())) {
                    return true;
                }
            }
        }
        return false;
    }
}
