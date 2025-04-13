package com.google.android.gms.internal.auth;

import android.net.Uri;
import androidx.collection.ArrayMap;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final class zzhm implements zzhk {
    static {
        Uri orDefault;
        ArrayMap<String, Uri> arrayMap = zzcq.f16062a;
        synchronized (zzcq.class) {
            ArrayMap<String, Uri> arrayMap2 = zzcq.f16062a;
            orDefault = arrayMap2.getOrDefault("com.google.android.gms.auth_account", null);
            if (orDefault == null) {
                String valueOf = String.valueOf(Uri.encode("com.google.android.gms.auth_account"));
                orDefault = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                arrayMap2.put("com.google.android.gms.auth_account", orDefault);
            }
        }
        zzcx zzcxVar = new zzcx(null, orDefault, true);
        new zzcv(zzcxVar, "getTokenRefactor__account_data_service_sample_percentage", Double.valueOf(0.0d));
        zzcxVar.m8342b("getTokenRefactor__account_data_service_tokenAPI_usable", true);
        zzcxVar.m8341a("getTokenRefactor__account_manager_timeout_seconds", 20L);
        zzcxVar.m8341a("getTokenRefactor__android_id_shift", 0L);
        zzcxVar.m8342b("getTokenRefactor__authenticator_logic_improved", false);
        try {
            new zzcw(zzcxVar, zzhi.m8533f(new byte[]{10, 19, 99, 111, 109, 46, 97, 110, 100, 114, 111, 105, 100, 46, 118, 101, 110, 100, 105, 110, 103, 10, 32, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 97, 112, 112, 115, 46, 109, 101, 101, 116, 105, 110, 103, 115, 10, 33, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 97, 112, 112, 115, 46, 109, 101, 115, 115, 97, 103, 105, 110, 103}), new Object() { // from class: com.google.android.gms.internal.auth.zzhl
            });
            zzcxVar.m8342b("getTokenRefactor__chimera_get_token_evolved", true);
            zzcxVar.m8341a("getTokenRefactor__clear_token_timeout_seconds", 20L);
            zzcxVar.m8341a("getTokenRefactor__default_task_timeout_seconds", 20L);
            zzcxVar.m8342b("getTokenRefactor__gaul_accounts_api_evolved", false);
            zzcxVar.m8342b("getTokenRefactor__gaul_token_api_evolved", false);
            zzcxVar.m8341a("getTokenRefactor__get_token_timeout_seconds", 120L);
            zzcxVar.m8342b("getTokenRefactor__gms_account_authenticator_evolved", true);
            new zzcv(zzcxVar, "getTokenRefactor__gms_account_authenticator_sample_percentage", Double.valueOf(0.0d));
        } catch (zzew e2) {
            throw new AssertionError("Could not parse proto flag \"getTokenRefactor__blocked_packages\"", e2);
        }
    }
}
