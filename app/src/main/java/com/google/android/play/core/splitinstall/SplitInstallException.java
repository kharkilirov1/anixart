package com.google.android.play.core.splitinstall;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public class SplitInstallException extends com.google.android.play.core.tasks.zzj {

    /* renamed from: b */
    @SplitInstallErrorCode
    public final int f20216b;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SplitInstallException(@com.google.android.play.core.splitinstall.model.SplitInstallErrorCode int r7) {
        /*
            r6 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r2 = 0
            r0[r2] = r1
            java.util.Map<java.lang.Integer, java.lang.String> r1 = com.google.android.play.core.splitinstall.model.zza.f20217a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            java.util.HashMap r1 = (java.util.HashMap) r1
            boolean r3 = r1.containsKey(r2)
            if (r3 == 0) goto L50
            java.util.Map<java.lang.Integer, java.lang.String> r3 = com.google.android.play.core.splitinstall.model.zza.f20218b
            java.util.HashMap r3 = (java.util.HashMap) r3
            boolean r4 = r3.containsKey(r2)
            if (r4 != 0) goto L23
            goto L50
        L23:
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 118
            int r3 = r3 + r4
            r5.<init>(r3)
            java.lang.String r3 = " (https://developer.android.com/reference/com/google/android/play/core/splitinstall/model/SplitInstallErrorCode.html#"
            java.lang.String r4 = ")"
            java.lang.String r1 = p000a.C0000a.m22s(r5, r1, r3, r2, r4)
            goto L52
        L50:
            java.lang.String r1 = ""
        L52:
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "Split Install Error(%d): %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r6.<init>(r0)
            if (r7 == 0) goto L63
            r6.f20216b = r7
            return
        L63:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "errorCode should not be 0."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitinstall.SplitInstallException.<init>(int):void");
    }

    @Override // com.google.android.play.core.tasks.zzj
    @SplitInstallErrorCode
    /* renamed from: a */
    public int mo10669a() {
        return this.f20216b;
    }
}
