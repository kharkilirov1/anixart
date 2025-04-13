package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes.dex */
public abstract class GmsClient<T extends IInterface> extends BaseGmsClient<T> implements Api.Client, zaj {

    /* renamed from: D */
    public final ClientSettings f15713D;

    /* renamed from: E */
    public final Set<Scope> f15714E;

    /* renamed from: F */
    @Nullable
    public final Account f15715F;

    /* JADX WARN: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GmsClient(@androidx.annotation.NonNull android.content.Context r12, @androidx.annotation.NonNull android.os.Looper r13, int r14, @androidx.annotation.NonNull com.google.android.gms.common.internal.ClientSettings r15, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.ConnectionCallbacks r16, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.OnConnectionFailedListener r17) {
        /*
            r11 = this;
            r10 = r11
            r0 = r15
            r1 = r16
            r2 = r17
            java.lang.Object r3 = com.google.android.gms.common.internal.GmsClientSupervisor.f15716a
            monitor-enter(r3)
            com.google.android.gms.common.internal.zzr r4 = com.google.android.gms.common.internal.GmsClientSupervisor.f15717b     // Catch: java.lang.Throwable -> L6a
            if (r4 != 0) goto L1c
            com.google.android.gms.common.internal.zzr r4 = new com.google.android.gms.common.internal.zzr     // Catch: java.lang.Throwable -> L6a
            android.content.Context r5 = r12.getApplicationContext()     // Catch: java.lang.Throwable -> L6a
            android.os.Looper r6 = r12.getMainLooper()     // Catch: java.lang.Throwable -> L6a
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L6a
            com.google.android.gms.common.internal.GmsClientSupervisor.f15717b = r4     // Catch: java.lang.Throwable -> L6a
        L1c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6a
            com.google.android.gms.common.internal.zzr r4 = com.google.android.gms.common.internal.GmsClientSupervisor.f15717b
            int r3 = com.google.android.gms.common.GoogleApiAvailability.f15324c
            com.google.android.gms.common.GoogleApiAvailability r5 = com.google.android.gms.common.GoogleApiAvailability.f15326e
            java.lang.String r3 = "null reference"
            java.util.Objects.requireNonNull(r1, r3)
            java.lang.String r3 = "null reference"
            java.util.Objects.requireNonNull(r2, r3)
            com.google.android.gms.common.internal.zah r7 = new com.google.android.gms.common.internal.zah
            r7.<init>(r1)
            com.google.android.gms.common.internal.zai r8 = new com.google.android.gms.common.internal.zai
            r8.<init>(r2)
            java.lang.String r9 = r0.f15686f
            r1 = r11
            r2 = r12
            r3 = r13
            r6 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f15713D = r0
            android.accounts.Account r1 = r0.f15681a
            r10.f15715F = r1
            java.util.Set<com.google.android.gms.common.api.Scope> r0 = r0.f15683c
            java.util.Iterator r1 = r0.iterator()
        L4c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L67
            java.lang.Object r2 = r1.next()
            com.google.android.gms.common.api.Scope r2 = (com.google.android.gms.common.api.Scope) r2
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L5f
            goto L4c
        L5f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Expanding scopes is not permitted, use implied scopes instead"
            r0.<init>(r1)
            throw r0
        L67:
            r10.f15714E = r0
            return
        L6a:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.GmsClient.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.ClientSettings, com.google.android.gms.common.api.internal.ConnectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener):void");
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public Set<Scope> mo7934a() {
        return mo7946q() ? this.f15714E : Collections.emptySet();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @Nullable
    /* renamed from: t */
    public final Account mo8106t() {
        return this.f15715F;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @Nullable
    /* renamed from: v */
    public final Executor mo8108v() {
        return null;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    @KeepForSdk
    /* renamed from: x */
    public final Set<Scope> mo8110x() {
        return this.f15714E;
    }
}
