package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zabi implements zaca, zau {

    /* renamed from: a */
    public final Lock f15507a;

    /* renamed from: b */
    public final Condition f15508b;

    /* renamed from: c */
    public final zabh f15509c;

    /* renamed from: d */
    public final Map<Api.AnyClientKey<?>, Api.Client> f15510d;

    /* renamed from: e */
    public final Map<Api.AnyClientKey<?>, ConnectionResult> f15511e;

    /* renamed from: f */
    @NotOnlyInitialized
    public volatile zabf f15512f;

    /* renamed from: g */
    public int f15513g;

    /* renamed from: h */
    public final zabe f15514h;

    /* renamed from: i */
    public final zabz f15515i;

    @Override // com.google.android.gms.common.api.internal.zau
    /* renamed from: S0 */
    public final void mo8043S0(@NonNull ConnectionResult connectionResult, @NonNull Api<?> api, boolean z) {
        this.f15507a.lock();
        try {
            this.f15512f.mo8021b(connectionResult, null, z);
        } finally {
            this.f15507a.unlock();
        }
    }

    /* renamed from: a */
    public final void m8044a(@Nullable ConnectionResult connectionResult) {
        this.f15507a.lock();
        try {
            this.f15512f = new zaax(this);
            this.f15512f.mo8023d();
            this.f15508b.signalAll();
        } finally {
            this.f15507a.unlock();
        }
    }

    @GuardedBy
    /* renamed from: b */
    public final void m8045b() {
        if (this.f15512f.mo8024e()) {
            this.f15511e.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    /* renamed from: i */
    public final void mo7980i(int i2) {
        this.f15507a.lock();
        try {
            this.f15512f.mo8022c(i2);
        } finally {
            this.f15507a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    /* renamed from: t */
    public final void mo7981t(@Nullable Bundle bundle) {
        this.f15507a.lock();
        try {
            this.f15512f.mo8020a(bundle);
        } finally {
            this.f15507a.unlock();
        }
    }
}
