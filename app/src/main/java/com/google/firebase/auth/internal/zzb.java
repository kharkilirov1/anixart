package com.google.firebase.auth.internal;

import com.google.android.gms.tasks.OnSuccessListener;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
final class zzb implements OnSuccessListener {
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    @Override // com.google.android.gms.tasks.OnSuccessListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onSuccess(java.lang.Object r8) {
        /*
            r7 = this;
            com.google.android.gms.safetynet.SafetyNetApi$AttestationResponse r8 = (com.google.android.gms.safetynet.SafetyNetApi.AttestationResponse) r8
            java.lang.String r0 = "zzbf"
            r1 = 1
            r2 = 0
            r3 = 0
            if (r8 == 0) goto L77
            java.lang.String r4 = r8.m9683b()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L14
            goto L77
        L14:
            java.lang.String r4 = r8.m9683b()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L1f
            goto L4c
        L1f:
            java.util.Map r4 = com.google.firebase.auth.internal.zzaz.m12305b(r4)
            com.google.firebase.auth.internal.zzbe r5 = new com.google.firebase.auth.internal.zzbe     // Catch: java.lang.ClassCastException -> L4c
            r5.<init>()     // Catch: java.lang.ClassCastException -> L4c
            java.lang.String r6 = "basicIntegrity"
            java.lang.Object r6 = r4.get(r6)     // Catch: java.lang.ClassCastException -> L4c
            if (r6 == 0) goto L3a
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.ClassCastException -> L4c
            boolean r6 = r6.booleanValue()     // Catch: java.lang.ClassCastException -> L4c
            if (r6 == 0) goto L3a
            r6 = 1
            goto L3b
        L3a:
            r6 = 0
        L3b:
            r5.f22396a = r6     // Catch: java.lang.ClassCastException -> L4c
            java.lang.String r6 = "advice"
            java.lang.Object r4 = r4.get(r6)     // Catch: java.lang.ClassCastException -> L4c
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.ClassCastException -> L4c
            if (r4 != 0) goto L49
            java.lang.String r4 = ""
        L49:
            r5.f22397b = r4     // Catch: java.lang.ClassCastException -> L4c
            goto L4d
        L4c:
            r5 = r3
        L4d:
            if (r5 != 0) goto L55
            java.lang.String r1 = "Unable to parse SafetyNet AttestationResponse"
            android.util.Log.e(r0, r1)
            goto L7c
        L55:
            boolean r4 = r5.f22396a
            if (r4 != 0) goto L5f
            java.lang.String r1 = "SafetyNet Attestation fails basic integrity."
            android.util.Log.e(r0, r1)
            goto L7c
        L5f:
            java.lang.String r4 = r5.f22397b
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L7d
            java.lang.String r1 = r5.f22397b
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r4 = "SafetyNet Attestation has advice: \n"
            java.lang.String r1 = r4.concat(r1)
            android.util.Log.e(r0, r1)
            goto L7c
        L77:
            java.lang.String r1 = "No SafetyNet AttestationResponse passed."
            android.util.Log.e(r0, r1)
        L7c:
            r1 = 0
        L7d:
            if (r1 == 0) goto L83
            r8.m9683b()
            throw r3
        L83:
            com.google.firebase.auth.internal.zzf.m12316a(r3, r3, r3, r3, r3)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.internal.zzb.onSuccess(java.lang.Object):void");
    }
}
