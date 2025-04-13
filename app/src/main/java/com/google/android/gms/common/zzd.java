package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzd implements Callable {

    /* renamed from: b */
    public final /* synthetic */ boolean f15919b;

    /* renamed from: c */
    public final /* synthetic */ String f15920c;

    /* renamed from: d */
    public final /* synthetic */ zzi f15921d;

    public /* synthetic */ zzd(boolean z, String str, zzi zziVar) {
        this.f15919b = z;
        this.f15920c = str;
        this.f15921d = zziVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f A[LOOP:0: B:17:0x009c->B:19:0x009f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object call() {
        /*
            r12 = this;
            boolean r0 = r12.f15919b
            java.lang.String r1 = r12.f15920c
            com.google.android.gms.common.zzi r2 = r12.f15921d
            com.google.android.gms.common.zzk r3 = com.google.android.gms.common.zzm.f15927a
            java.lang.String r3 = "null reference"
            r4 = 0
            r5 = 1
            if (r0 != 0) goto L76
            java.lang.String r6 = "Failed to get Google certificates from remote"
            java.lang.String r7 = "GoogleCertificates"
            com.google.android.gms.common.zzm.m8255a()     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L4c
            android.content.Context r8 = com.google.android.gms.common.zzm.f15933g
            java.util.Objects.requireNonNull(r8, r3)
            com.google.android.gms.common.zzs r8 = new com.google.android.gms.common.zzs
            r8.<init>(r1, r2, r5, r4)
            com.google.android.gms.common.internal.zzaf r9 = com.google.android.gms.common.zzm.f15931e     // Catch: android.os.RemoteException -> L40
            android.content.Context r10 = com.google.android.gms.common.zzm.f15933g     // Catch: android.os.RemoteException -> L40
            android.content.pm.PackageManager r10 = r10.getPackageManager()     // Catch: android.os.RemoteException -> L40
            com.google.android.gms.dynamic.ObjectWrapper r11 = new com.google.android.gms.dynamic.ObjectWrapper     // Catch: android.os.RemoteException -> L40
            r11.<init>(r10)     // Catch: android.os.RemoteException -> L40
            boolean r6 = r9.mo8196P0(r8, r11)     // Catch: android.os.RemoteException -> L40
            if (r6 == 0) goto L35
            com.google.android.gms.common.zzw r6 = com.google.android.gms.common.zzw.f15947b
            goto L70
        L35:
            com.google.android.gms.common.zzd r6 = new com.google.android.gms.common.zzd
            r6.<init>(r5, r1, r2)
            com.google.android.gms.common.zzv r7 = new com.google.android.gms.common.zzv
            r7.<init>(r6)
            goto L6f
        L40:
            r8 = move-exception
            android.util.Log.e(r7, r6, r8)
            com.google.android.gms.common.zzw r6 = new com.google.android.gms.common.zzw
            java.lang.String r7 = "module call"
            r6.<init>(r4, r7, r8)
            goto L70
        L4c:
            r8 = move-exception
            android.util.Log.e(r7, r6, r8)
            java.lang.String r6 = r8.getMessage()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "module init: "
            int r9 = r6.length()
            if (r9 == 0) goto L65
            java.lang.String r6 = r7.concat(r6)
            goto L6a
        L65:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r7)
        L6a:
            com.google.android.gms.common.zzw r7 = new com.google.android.gms.common.zzw
            r7.<init>(r4, r6, r8)
        L6f:
            r6 = r7
        L70:
            boolean r6 = r6.f15948a
            if (r6 == 0) goto L76
            r6 = 1
            goto L77
        L76:
            r6 = 0
        L77:
            if (r5 == r6) goto L7c
            java.lang.String r6 = "not allowed"
            goto L7e
        L7c:
            java.lang.String r6 = "debug cert rejected"
        L7e:
            r7 = 5
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r4] = r6
            r7[r5] = r1
            java.lang.String r1 = "SHA-1"
            java.security.MessageDigest r1 = com.google.android.gms.common.util.AndroidUtilsLight.m8233b(r1)
            java.util.Objects.requireNonNull(r1, r3)
            r3 = 2
            byte[] r2 = r2.mo8254t()
            byte[] r1 = r1.digest(r2)
            int r2 = r1.length
            int r2 = r2 + r2
            char[] r2 = new char[r2]
            r5 = 0
        L9c:
            int r6 = r1.length
            if (r4 >= r6) goto Lb8
            r6 = r1[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r8 = r5 + 1
            char[] r9 = com.google.android.gms.common.util.Hex.f15900b
            int r10 = r6 >>> 4
            char r10 = r9[r10]
            r2[r5] = r10
            int r5 = r8 + 1
            r6 = r6 & 15
            char r6 = r9[r6]
            r2[r8] = r6
            int r4 = r4 + 1
            goto L9c
        Lb8:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            r7[r3] = r1
            r1 = 3
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7[r1] = r0
            r0 = 4
            java.lang.String r1 = "12451000.false"
            r7[r0] = r1
            java.lang.String r0 = "%s: pkg=%s, sha1=%s, atk=%s, ver=%s"
            java.lang.String r0 = java.lang.String.format(r0, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.zzd.call():java.lang.Object");
    }
}
