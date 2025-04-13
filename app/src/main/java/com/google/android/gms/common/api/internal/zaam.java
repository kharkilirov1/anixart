package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zaam extends zabg {

    /* renamed from: b */
    public final /* synthetic */ ConnectionResult f15466b;

    /* renamed from: c */
    public final /* synthetic */ zaao f15467c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaam(zaao zaaoVar, zabf zabfVar, ConnectionResult connectionResult) {
        super(zabfVar);
        this.f15467c = zaaoVar;
        this.f15466b = connectionResult;
    }

    @Override // com.google.android.gms.common.api.internal.zabg
    @GuardedBy
    /* renamed from: a */
    public final void mo8019a() {
        this.f15467c.f15470d.m8031i(this.f15466b);
    }
}
