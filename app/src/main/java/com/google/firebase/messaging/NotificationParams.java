package com.google.firebase.messaging;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class NotificationParams {

    /* renamed from: a */
    @NonNull
    public final Bundle f23300a;

    public NotificationParams(@NonNull Bundle bundle) {
        this.f23300a = new Bundle(bundle);
    }

    /* renamed from: f */
    public static boolean m12670f(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    /* renamed from: h */
    public static String m12671h(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    /* renamed from: a */
    public boolean m12672a(String str) {
        String m12676e = m12676e(str);
        return "1".equals(m12676e) || Boolean.parseBoolean(m12676e);
    }

    /* renamed from: b */
    public Integer m12673b(String str) {
        String m12676e = m12676e(str);
        if (TextUtils.isEmpty(m12676e)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(m12676e));
        } catch (NumberFormatException unused) {
            StringBuilder m24u = C0000a.m24u("Couldn't parse value of ");
            m24u.append(m12671h(str));
            m24u.append("(");
            m24u.append(m12676e);
            m24u.append(") into an int");
            Log.w("NotificationParams", m24u.toString());
            return null;
        }
    }

    @Nullable
    /* renamed from: c */
    public JSONArray m12674c(String str) {
        String m12676e = m12676e(str);
        if (TextUtils.isEmpty(m12676e)) {
            return null;
        }
        try {
            return new JSONArray(m12676e);
        } catch (JSONException unused) {
            StringBuilder m24u = C0000a.m24u("Malformed JSON for key ");
            m24u.append(m12671h(str));
            m24u.append(": ");
            m24u.append(m12676e);
            m24u.append(", falling back to default");
            Log.w("NotificationParams", m24u.toString());
            return null;
        }
    }

    /* renamed from: d */
    public String m12675d(Resources resources, String str, String str2) {
        String[] strArr;
        String m12676e = m12676e(str2);
        if (!TextUtils.isEmpty(m12676e)) {
            return m12676e;
        }
        String m12676e2 = m12676e(str2 + "_loc_key");
        if (TextUtils.isEmpty(m12676e2)) {
            return null;
        }
        int identifier = resources.getIdentifier(m12676e2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", m12671h(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray m12674c = m12674c(str2 + "_loc_args");
        if (m12674c == null) {
            strArr = null;
        } else {
            int length = m12674c.length();
            strArr = new String[length];
            for (int i2 = 0; i2 < length; i2++) {
                strArr[i2] = m12674c.optString(i2);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e2) {
            StringBuilder m24u = C0000a.m24u("Missing format argument for ");
            m24u.append(m12671h(str2));
            m24u.append(": ");
            m24u.append(Arrays.toString(strArr));
            m24u.append(" Default value will be used.");
            Log.w("NotificationParams", m24u.toString(), e2);
            return null;
        }
    }

    /* renamed from: e */
    public String m12676e(String str) {
        Bundle bundle = this.f23300a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (this.f23300a.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    /* renamed from: g */
    public Bundle m12677g() {
        Bundle bundle = new Bundle(this.f23300a);
        for (String str : this.f23300a.keySet()) {
            if (!(str.startsWith("google.c.a.") || str.equals("from"))) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
