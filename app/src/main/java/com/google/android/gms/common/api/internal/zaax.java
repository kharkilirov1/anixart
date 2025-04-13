package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.Iterator;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zaax implements zabf {

    /* renamed from: a */
    @NotOnlyInitialized
    public final zabi f15499a;

    public zaax(zabi zabiVar) {
        this.f15499a = zabiVar;
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
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    /* renamed from: d */
    public final void mo8023d() {
        Iterator<Api.Client> it = this.f15499a.f15510d.values().iterator();
        while (it.hasNext()) {
            it.next().mo7935b();
        }
        this.f15499a.f15514h.f15504c = Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    /* renamed from: e */
    public final boolean mo8024e() {
        return true;
    }
}
