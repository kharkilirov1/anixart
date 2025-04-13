package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public abstract class zzab extends com.google.android.gms.internal.common.zzb implements IGmsCallbacks {
    public zzab() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if (r4.f15739b >= r2.f15739b) goto L24;
     */
    @Override // com.google.android.gms.internal.common.zzb
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo8121i(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) throws android.os.RemoteException {
        /*
            r6 = this;
            r10 = 1
            if (r7 == r10) goto L73
            r0 = 2
            if (r7 == r0) goto L5b
            r0 = 3
            if (r7 == r0) goto Lb
            r7 = 0
            return r7
        Lb:
            int r7 = r8.readInt()
            android.os.IBinder r0 = r8.readStrongBinder()
            android.os.Parcelable$Creator<com.google.android.gms.common.internal.zzj> r1 = com.google.android.gms.common.internal.zzj.CREATOR
            android.os.Parcelable r8 = com.google.android.gms.internal.common.zzc.m8558a(r8, r1)
            com.google.android.gms.common.internal.zzj r8 = (com.google.android.gms.common.internal.zzj) r8
            r1 = r6
            com.google.android.gms.common.internal.zzd r1 = (com.google.android.gms.common.internal.zzd) r1
            com.google.android.gms.common.internal.BaseGmsClient r2 = r1.f15798a
            java.lang.String r3 = "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService"
            com.google.android.gms.common.internal.Preconditions.m8132g(r2, r3)
            java.lang.String r3 = "null reference"
            java.util.Objects.requireNonNull(r8, r3)
            r2.f15650A = r8
            boolean r2 = r2.mo8093D()
            if (r2 == 0) goto L55
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r2 = r8.f15808e
            com.google.android.gms.common.internal.RootTelemetryConfigManager r3 = com.google.android.gms.common.internal.RootTelemetryConfigManager.m8135a()
            if (r2 != 0) goto L3c
            r2 = 0
            goto L3e
        L3c:
            com.google.android.gms.common.internal.RootTelemetryConfiguration r2 = r2.f15693b
        L3e:
            monitor-enter(r3)
            if (r2 != 0) goto L44
            com.google.android.gms.common.internal.RootTelemetryConfiguration r2 = com.google.android.gms.common.internal.RootTelemetryConfigManager.f15737c     // Catch: java.lang.Throwable -> L52
            goto L4e
        L44:
            com.google.android.gms.common.internal.RootTelemetryConfiguration r4 = r3.f15738a     // Catch: java.lang.Throwable -> L52
            if (r4 == 0) goto L4e
            int r4 = r4.f15739b     // Catch: java.lang.Throwable -> L52
            int r5 = r2.f15739b     // Catch: java.lang.Throwable -> L52
            if (r4 >= r5) goto L50
        L4e:
            r3.f15738a = r2     // Catch: java.lang.Throwable -> L52
        L50:
            monitor-exit(r3)
            goto L55
        L52:
            r7 = move-exception
            monitor-exit(r3)
            throw r7
        L55:
            android.os.Bundle r8 = r8.f15805b
            r1.m8199q(r7, r0, r8)
            goto L89
        L5b:
            r8.readInt()
            android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.common.zzc.m8558a(r8, r7)
            android.os.Bundle r7 = (android.os.Bundle) r7
            java.lang.Exception r7 = new java.lang.Exception
            r7.<init>()
            java.lang.String r8 = "GmsClient"
            java.lang.String r0 = "received deprecated onAccountValidationComplete callback, ignoring"
            android.util.Log.wtf(r8, r0, r7)
            goto L89
        L73:
            int r7 = r8.readInt()
            android.os.IBinder r0 = r8.readStrongBinder()
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r8 = com.google.android.gms.internal.common.zzc.m8558a(r8, r1)
            android.os.Bundle r8 = (android.os.Bundle) r8
            r1 = r6
            com.google.android.gms.common.internal.zzd r1 = (com.google.android.gms.common.internal.zzd) r1
            r1.m8199q(r7, r0, r8)
        L89:
            r9.writeNoException()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzab.mo8121i(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
