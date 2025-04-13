package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes.dex */
public final class NonGmsServiceBrokerClient implements Api.Client, ServiceConnection {

    /* renamed from: b */
    @Nullable
    public IBinder f15432b;

    @Override // com.google.android.gms.common.api.Api.Client
    @NonNull
    /* renamed from: a */
    public final Set<Scope> mo7934a() {
        return Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @WorkerThread
    /* renamed from: b */
    public final void mo7935b() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    /* renamed from: c */
    public final void mo7936c(@Nullable IAccountAccessor iAccountAccessor, @Nullable Set<Scope> set) {
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @WorkerThread
    /* renamed from: d */
    public final void mo7937d(@NonNull String str) {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @WorkerThread
    /* renamed from: e */
    public final boolean mo7938e() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @NonNull
    /* renamed from: f */
    public final String mo7939f() {
        Objects.requireNonNull((Object) null, "null reference");
        throw null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @WorkerThread
    /* renamed from: g */
    public final void mo7940g(@NonNull BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    /* renamed from: h */
    public final void mo7941h(@NonNull BaseGmsClient.SignOutCallbacks signOutCallbacks) {
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @WorkerThread
    /* renamed from: i */
    public final boolean mo7942i() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    /* renamed from: j */
    public final boolean mo7943j() {
        return false;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    /* renamed from: l */
    public final int mo7877l() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @NonNull
    /* renamed from: m */
    public final Feature[] mo7944m() {
        return new Feature[0];
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        throw null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@NonNull ComponentName componentName) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @Nullable
    /* renamed from: p */
    public final String mo7945p() {
        return null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    /* renamed from: q */
    public final boolean mo7946q() {
        return false;
    }
}
