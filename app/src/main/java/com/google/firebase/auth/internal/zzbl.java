package com.google.firebase.auth.internal;

import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
public final class zzbl {

    /* renamed from: a */
    @VisibleForTesting
    public static final Map f22404a;

    static {
        HashMap hashMap = new HashMap();
        f22404a = hashMap;
        hashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        hashMap.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        hashMap.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        hashMap.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        hashMap.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    /* renamed from: a */
    public static Status m12312a(Intent intent) {
        Preconditions.m8126a(intent.hasExtra("com.google.firebase.auth.internal.STATUS"));
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.firebase.auth.internal.STATUS");
        return (Status) (byteArrayExtra == null ? null : SafeParcelableSerializer.m8176a(byteArrayExtra, creator));
    }

    /* renamed from: b */
    public static Status m12313b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString(ThrowableDeserializer.PROP_NAME_MESSAGE);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                Map map = f22404a;
                if (((HashMap) map).containsKey(string)) {
                    return zzai.m12298a(((String) ((HashMap) map).get(string)) + ":" + string2);
                }
            }
            return zzai.m12298a("WEB_INTERNAL_ERROR:" + str);
        } catch (JSONException e2) {
            return zzai.m12298a("WEB_INTERNAL_ERROR:" + str + "[ " + e2.getLocalizedMessage() + " ]");
        }
    }
}
