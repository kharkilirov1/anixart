package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zaaj implements zabf {

    /* renamed from: a */
    public final zabi f15461a;

    public zaaj(zabi zabiVar) {
        this.f15461a = zabiVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    /* renamed from: a */
    public final void mo8020a(@Nullable Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    /* renamed from: b */
    public final void mo8021b(ConnectionResult connectionResult, Api<?> api, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    /* renamed from: c */
    public final void mo8022c(int i2) {
        this.f15461a.m8044a(null);
        this.f15461a.f15515i.mo8039b(i2, false);
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    /* renamed from: d */
    public final void mo8023d() {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    /* renamed from: e */
    public final boolean mo8024e() {
        Objects.requireNonNull(this.f15461a.f15514h);
        this.f15461a.m8044a(null);
        return true;
    }
}
