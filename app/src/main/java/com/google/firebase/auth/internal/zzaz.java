package com.google.firebase.auth.internal;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.p041firebaseauthapi.zznp;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
final class zzaz {

    /* renamed from: a */
    public static final Logger f22392a = new Logger("JSONParser", new String[0]);

    @VisibleForTesting
    /* renamed from: a */
    public static List m12304a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            Object obj = jSONArray.get(i2);
            if (obj instanceof JSONArray) {
                obj = m12304a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m12307d((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: b */
    public static Map m12305b(String str) {
        Preconditions.m8129d(str);
        List m8814c = com.google.android.gms.internal.p041firebaseauthapi.zzaf.m8812a('.').m8814c(str);
        if (m8814c.size() < 2) {
            f22392a.m8205b("Invalid idToken ".concat(str), new Object[0]);
            return new HashMap();
        }
        String str2 = (String) m8814c.get(1);
        try {
            Map m12306c = m12306c(new String(str2 == null ? null : Base64.decode(str2, 11), "UTF-8"));
            return m12306c == null ? new HashMap() : m12306c;
        } catch (UnsupportedEncodingException e2) {
            Logger logger = f22392a;
            Log.e(logger.f15834a, logger.m8206c("Unable to decode token", new Object[0]), e2);
            return new HashMap();
        }
    }

    @Nullable
    /* renamed from: c */
    public static Map m12306c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return m12307d(jSONObject);
            }
            return null;
        } catch (Exception e2) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zznp(e2);
        }
    }

    @VisibleForTesting
    /* renamed from: d */
    public static Map m12307d(JSONObject jSONObject) throws JSONException {
        ArrayMap arrayMap = new ArrayMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = m12304a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m12307d((JSONObject) obj);
            }
            arrayMap.put(next, obj);
        }
        return arrayMap;
    }
}
