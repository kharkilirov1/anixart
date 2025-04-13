package com.yandex.mobile.ads.impl;

import android.text.Html;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class g70 {
    @Nullable
    /* renamed from: a */
    public static HashMap m24811a(@NonNull JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("bidding_info");
        if (optJSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = optJSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = optJSONObject.optString(next);
            if ((TextUtils.isEmpty(optString) || "null".equals(optString)) ? false : true) {
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public static String m24812b(@NonNull String str, @NonNull JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString(str);
        if ((TextUtils.isEmpty(string) || "null".equals(string)) ? false : true) {
            return String.valueOf(Html.fromHtml(string));
        }
        throw new JSONException("Json value can not be null or empty");
    }

    @Nullable
    /* renamed from: c */
    public static ArrayList m24813c(@NonNull String str, @NonNull JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            String optString = optJSONArray.optString(i2);
            if ((TextUtils.isEmpty(optString) || "null".equals(optString)) ? false : true) {
                arrayList.add(optJSONArray.optString(i2));
            }
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: a */
    public static String m24810a(@NonNull String str, @NonNull JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString(str);
        if (TextUtils.isEmpty(string) || "null".equals(string)) {
            throw new JSONException("Json has not required attributes");
        }
        return string;
    }
}
