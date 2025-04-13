package com.google.android.gms.common;

import android.content.Context;
import com.google.android.gms.common.internal.zzaf;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
final class zzm {

    /* renamed from: e */
    public static volatile zzaf f15931e;

    /* renamed from: g */
    public static Context f15933g;

    /* renamed from: a */
    public static final zzk f15927a = new zze(zzi.m8253q("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b */
    public static final zzk f15928b = new zzf(zzi.m8253q("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c */
    public static final zzk f15929c = new zzg(zzi.m8253q("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d */
    public static final zzk f15930d = new zzh(zzi.m8253q("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: f */
    public static final Object f15932f = new Object();

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:8:0x000f, B:10:0x0013, B:12:0x001f, B:13:0x002f, B:16:0x004b, B:17:0x0035, B:19:0x003f, B:20:0x0045, B:23:0x0053, B:25:0x005d, B:26:0x0067, B:27:0x006a, B:28:0x0062, B:33:0x006b), top: B:7:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:8:0x000f, B:10:0x0013, B:12:0x001f, B:13:0x002f, B:16:0x004b, B:17:0x0035, B:19:0x003f, B:20:0x0045, B:23:0x0053, B:25:0x005d, B:26:0x0067, B:27:0x006a, B:28:0x0062, B:33:0x006b), top: B:7:0x000f }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m8255a() throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            com.google.android.gms.common.internal.zzaf r0 = com.google.android.gms.common.zzm.f15931e
            if (r0 == 0) goto L5
            return
        L5:
            android.content.Context r0 = com.google.android.gms.common.zzm.f15933g
            java.lang.String r1 = "null reference"
            java.util.Objects.requireNonNull(r0, r1)
            java.lang.Object r0 = com.google.android.gms.common.zzm.f15932f
            monitor-enter(r0)
            com.google.android.gms.common.internal.zzaf r1 = com.google.android.gms.common.zzm.f15931e     // Catch: java.lang.Throwable -> L43
            if (r1 != 0) goto L6b
            android.content.Context r1 = com.google.android.gms.common.zzm.f15933g     // Catch: java.lang.Throwable -> L43
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r2 = com.google.android.gms.dynamite.DynamiteModule.f15958b     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = "com.google.android.gms.googlecertificates"
            com.google.android.gms.dynamite.DynamiteModule r1 = com.google.android.gms.dynamite.DynamiteModule.m8287b(r1, r2, r3)     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = "com.google.android.gms.common.GoogleCertificatesImpl"
            android.content.Context r1 = r1.f15968a     // Catch: java.lang.Throwable -> L43 java.lang.IllegalAccessException -> L4e java.lang.InstantiationException -> L50 java.lang.ClassNotFoundException -> L52
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L43 java.lang.IllegalAccessException -> L4e java.lang.InstantiationException -> L50 java.lang.ClassNotFoundException -> L52
            java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.Throwable -> L43 java.lang.IllegalAccessException -> L4e java.lang.InstantiationException -> L50 java.lang.ClassNotFoundException -> L52
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Throwable -> L43 java.lang.IllegalAccessException -> L4e java.lang.InstantiationException -> L50 java.lang.ClassNotFoundException -> L52
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch: java.lang.Throwable -> L43 java.lang.IllegalAccessException -> L4e java.lang.InstantiationException -> L50 java.lang.ClassNotFoundException -> L52
            int r2 = com.google.android.gms.common.internal.zzae.f15789a     // Catch: java.lang.Throwable -> L43
            if (r1 != 0) goto L35
            r1 = 0
            goto L4b
        L35:
            java.lang.String r2 = "com.google.android.gms.common.internal.IGoogleCertificatesApi"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch: java.lang.Throwable -> L43
            boolean r3 = r2 instanceof com.google.android.gms.common.internal.zzaf     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L45
            r1 = r2
            com.google.android.gms.common.internal.zzaf r1 = (com.google.android.gms.common.internal.zzaf) r1     // Catch: java.lang.Throwable -> L43
            goto L4b
        L43:
            r1 = move-exception
            goto L6d
        L45:
            com.google.android.gms.common.internal.zzad r2 = new com.google.android.gms.common.internal.zzad     // Catch: java.lang.Throwable -> L43
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L43
            r1 = r2
        L4b:
            com.google.android.gms.common.zzm.f15931e = r1     // Catch: java.lang.Throwable -> L43
            goto L6b
        L4e:
            r1 = move-exception
            goto L53
        L50:
            r1 = move-exception
            goto L53
        L52:
            r1 = move-exception
        L53:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r3 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = "Failed to instantiate module class: "
            int r5 = r2.length()     // Catch: java.lang.Throwable -> L43
            if (r5 == 0) goto L62
            java.lang.String r2 = r4.concat(r2)     // Catch: java.lang.Throwable -> L43
            goto L67
        L62:
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L43
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L43
        L67:
            r3.<init>(r2, r1)     // Catch: java.lang.Throwable -> L43
            throw r3     // Catch: java.lang.Throwable -> L43
        L6b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            return
        L6d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.zzm.m8255a():void");
    }
}
