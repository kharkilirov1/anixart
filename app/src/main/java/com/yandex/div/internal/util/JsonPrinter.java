package com.yandex.div.internal.util;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: JsonPrinter.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/internal/util/JsonPrinter;", "", "Companion", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class JsonPrinter {

    /* renamed from: a */
    public final int f33886a;

    /* renamed from: b */
    public final int f33887b;

    /* compiled from: JsonPrinter.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/internal/util/JsonPrinter$Companion;", "", "", "ELLIPSIS", "Ljava/lang/String;", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    public JsonPrinter(int i2, int i3) {
        this.f33886a = i2;
        this.f33887b = i3;
    }

    /* renamed from: a */
    public final JSONArray m17387a(JSONArray jSONArray, int i2) {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        int i3 = 0;
        while (i3 < length) {
            int i4 = i3 + 1;
            Object opt = jSONArray.opt(i3);
            if (opt instanceof JSONObject) {
                if (i2 != 0) {
                    opt = m17388b((JSONObject) opt, i2 - 1);
                    jSONArray2.put(opt);
                    i3 = i4;
                }
                opt = "...";
                jSONArray2.put(opt);
                i3 = i4;
            } else {
                if (opt instanceof JSONArray) {
                    if (i2 != 0) {
                        opt = m17387a((JSONArray) opt, i2 - 1);
                    }
                    opt = "...";
                }
                jSONArray2.put(opt);
                i3 = i4;
            }
        }
        return jSONArray2;
    }

    /* renamed from: b */
    public final JSONObject m17388b(JSONObject jSONObject, int i2) {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.m32178g(keys, "keys");
        while (keys.hasNext()) {
            String key = keys.next();
            Object opt = jSONObject.opt(key);
            Intrinsics.m32178g(key, "key");
            if (opt instanceof JSONObject) {
                if (i2 != 0) {
                    opt = m17388b((JSONObject) opt, i2 - 1);
                    jSONObject2.put(key, opt);
                }
                opt = "...";
                jSONObject2.put(key, opt);
            } else {
                if (opt instanceof JSONArray) {
                    if (i2 != 0) {
                        opt = m17387a((JSONArray) opt, i2 - 1);
                    }
                    opt = "...";
                }
                jSONObject2.put(key, opt);
            }
        }
        return jSONObject2;
    }
}
