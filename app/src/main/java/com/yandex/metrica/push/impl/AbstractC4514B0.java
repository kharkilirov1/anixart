package com.yandex.metrica.push.impl;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.yandex.metrica.push.common.PushServiceFacade;
import com.yandex.metrica.push.common.RefreshTokenInfo;
import java.util.Map;

/* renamed from: com.yandex.metrica.push.impl.B0 */
/* loaded from: classes2.dex */
abstract class AbstractC4514B0 implements InterfaceC4607w0 {
    @Override // com.yandex.metrica.push.impl.InterfaceC4607w0
    /* renamed from: a */
    public void mo21417a(@NonNull Context context, @NonNull Bundle bundle) {
        RefreshTokenInfo fromBundle = RefreshTokenInfo.fromBundle(bundle.getBundle(PushServiceFacade.REFRESH_TOKEN_INFO));
        if (C4562a.m21488a(context).m21507m()) {
            mo21419a(context, C4562a.m21488a(context).m21502h().m21538b(), fromBundle);
        }
    }

    /* renamed from: a */
    public abstract void mo21419a(@NonNull Context context, @NonNull Map<String, String> map, @NonNull RefreshTokenInfo refreshTokenInfo);

    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m21420a(@androidx.annotation.NonNull android.content.Context r12, boolean r13, @androidx.annotation.NonNull java.util.Map<java.lang.String, java.lang.String> r14, @androidx.annotation.NonNull com.yandex.metrica.push.impl.InterfaceC4559Y0<java.util.Map<java.lang.String, java.lang.String>> r15) {
        /*
            r11 = this;
            com.yandex.metrica.push.impl.a r12 = com.yandex.metrica.push.impl.C4562a.m21488a(r12)
            com.yandex.metrica.push.impl.c r12 = r12.m21499e()
            android.content.SharedPreferences r0 = r12.m21524a()
            java.lang.String r1 = "com.yandex.metrica.push.all_tokens"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            java.util.Map r0 = com.yandex.metrica.push.impl.C4587m0.m21556a(r0)
            long r3 = java.lang.System.currentTimeMillis()
            r5 = 1
            r6 = 0
            if (r13 != 0) goto L89
            if (r0 == 0) goto L89
            int r13 = r14.size()
            int r7 = r0.size()
            if (r13 == r7) goto L2c
            goto L7a
        L2c:
            java.util.Set r13 = r0.entrySet()
            java.util.Iterator r13 = r13.iterator()
        L34:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r13.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r7 = r0.getKey()
            boolean r7 = r14.containsKey(r7)
            if (r7 != 0) goto L4b
            goto L7a
        L4b:
            java.lang.Object r7 = r0.getValue()
            com.yandex.metrica.push.impl.m0 r7 = (com.yandex.metrica.push.impl.C4587m0) r7
            java.lang.String r7 = r7.f47397a
            java.lang.Object r8 = r0.getKey()
            java.lang.Object r8 = r14.get(r8)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r7 = android.text.TextUtils.equals(r7, r8)
            if (r7 != 0) goto L64
            goto L7a
        L64:
            java.lang.Object r0 = r0.getValue()
            com.yandex.metrica.push.impl.m0 r0 = (com.yandex.metrica.push.impl.C4587m0) r0
            long r7 = r0.f47398b
            long r7 = r3 - r7
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            r9 = 1
            long r9 = r0.toMillis(r9)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 <= 0) goto L34
        L7a:
            r13 = 1
            goto L7d
        L7c:
            r13 = 0
        L7d:
            if (r13 == 0) goto L80
            goto L89
        L80:
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.String r13 = "Received old tokens"
            com.yandex.metrica.push.common.utils.InternalLogger.m21370i(r13, r12)
            goto L109
        L89:
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lc7
            r13.<init>()     // Catch: org.json.JSONException -> Lc7
            java.util.Set r0 = r14.entrySet()     // Catch: org.json.JSONException -> Lc7
            java.util.Iterator r0 = r0.iterator()     // Catch: org.json.JSONException -> Lc7
        L96:
            boolean r7 = r0.hasNext()     // Catch: org.json.JSONException -> Lc7
            if (r7 == 0) goto Lc3
            java.lang.Object r7 = r0.next()     // Catch: org.json.JSONException -> Lc7
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: org.json.JSONException -> Lc7
            java.lang.Object r8 = r7.getKey()     // Catch: org.json.JSONException -> Lc7
            java.lang.String r8 = (java.lang.String) r8     // Catch: org.json.JSONException -> Lc7
            java.lang.Object r7 = r7.getValue()     // Catch: org.json.JSONException -> Lc7
            java.lang.String r7 = (java.lang.String) r7     // Catch: org.json.JSONException -> Lc7
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lc7
            r9.<init>()     // Catch: org.json.JSONException -> Lc7
            java.lang.String r10 = "token"
            org.json.JSONObject r7 = r9.put(r10, r7)     // Catch: org.json.JSONException -> Lc7
            java.lang.String r9 = "lastUpdateTime"
            org.json.JSONObject r7 = r7.put(r9, r3)     // Catch: org.json.JSONException -> Lc7
            r13.put(r8, r7)     // Catch: org.json.JSONException -> Lc7
            goto L96
        Lc3:
            java.lang.String r2 = r13.toString()     // Catch: org.json.JSONException -> Lc7
        Lc7:
            android.content.SharedPreferences r12 = r12.m21524a()
            android.content.SharedPreferences$Editor r12 = r12.edit()
            android.content.SharedPreferences$Editor r12 = r12.putString(r1, r2)
            r12.apply()
            r15.mo21421a(r14)
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.String r13 = "New tokens were saved to PreferenceManager and sent:"
            com.yandex.metrica.push.common.utils.InternalLogger.m21370i(r13, r12)
            java.util.Set r12 = r14.entrySet()
            java.util.Iterator r12 = r12.iterator()
        Le8:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L109
            java.lang.Object r13 = r12.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            r14 = 2
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.Object r15 = r13.getKey()
            r14[r6] = r15
            java.lang.Object r13 = r13.getValue()
            r14[r5] = r13
            java.lang.String r13 = "token from %s is %s"
            com.yandex.metrica.push.common.utils.InternalLogger.m21370i(r13, r14)
            goto Le8
        L109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.push.impl.AbstractC4514B0.m21420a(android.content.Context, boolean, java.util.Map, com.yandex.metrica.push.impl.Y0):void");
    }
}
