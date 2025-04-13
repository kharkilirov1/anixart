package com.yandex.div.internal.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: JsonUtils.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div-json_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class JsonUtilsKt {
    /* renamed from: a */
    public static String m17389a(JSONArray jSONArray, int i2, int i3) {
        String jSONArray2;
        String str;
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        JSONArray m17387a = new JsonPrinter(i2, 1).m17387a(jSONArray, 1);
        if (i2 == 0) {
            jSONArray2 = m17387a.toString();
            str = "copy.toString()";
        } else {
            jSONArray2 = m17387a.toString(i2);
            str = "copy.toString(indentSpaces)";
        }
        Intrinsics.m32178g(jSONArray2, str);
        return jSONArray2;
    }

    /* renamed from: b */
    public static String m17390b(JSONObject jSONObject, int i2, int i3) {
        String jSONObject2;
        String str;
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        JSONObject m17388b = new JsonPrinter(i2, 1).m17388b(jSONObject, 1);
        if (i2 == 0) {
            jSONObject2 = m17388b.toString();
            str = "copy.toString()";
        } else {
            jSONObject2 = m17388b.toString(i2);
            str = "copy.toString(indentSpaces)";
        }
        Intrinsics.m32178g(jSONObject2, str);
        return jSONObject2;
    }
}
