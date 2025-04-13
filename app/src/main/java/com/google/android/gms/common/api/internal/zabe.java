package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zabe extends GoogleApiClient implements zabz {

    /* renamed from: d */
    public static final /* synthetic */ int f15502d = 0;

    /* renamed from: b */
    public volatile boolean f15503b;

    /* renamed from: c */
    public Set<Scope> f15504c;

    @Override // com.google.android.gms.common.api.internal.zabz
    @GuardedBy
    /* renamed from: a */
    public final void mo8038a(@Nullable Bundle bundle) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    @GuardedBy
    /* renamed from: b */
    public final void mo8039b(int i2, boolean z) {
        if (i2 != 1) {
            throw null;
        }
        if (z) {
            throw null;
        }
        if (this.f15503b) {
            throw null;
        }
        this.f15503b = true;
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    @GuardedBy
    /* renamed from: c */
    public final void mo8040c(ConnectionResult connectionResult) {
        int i2 = connectionResult.f15315c;
        throw null;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: d */
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo7951d(@NonNull T t) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: e */
    public final Looper mo7952e() {
        return null;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: f */
    public final boolean mo7953f(SignInConnectionListener signInConnectionListener) {
        return false;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: g */
    public final void mo7954g() {
    }

    /* renamed from: h */
    public final void m8041h(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println((Object) null);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f15503b);
        printWriter.append(" mWorkQueue.size()=");
        throw null;
    }

    @GuardedBy
    /* renamed from: i */
    public final boolean m8042i() {
        if (!this.f15503b) {
            return false;
        }
        this.f15503b = false;
        throw null;
    }
}
