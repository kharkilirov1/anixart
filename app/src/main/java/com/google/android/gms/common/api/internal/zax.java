package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zax implements zabz {

    /* renamed from: a */
    public final /* synthetic */ zaaa f15603a;

    @Override // com.google.android.gms.common.api.internal.zabz
    /* renamed from: a */
    public final void mo8038a(@Nullable Bundle bundle) {
        this.f15603a.f15449i.lock();
        try {
            zaaa zaaaVar = this.f15603a;
            Bundle bundle2 = zaaaVar.f15445e;
            if (bundle2 == null) {
                zaaaVar.f15445e = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            zaaa zaaaVar2 = this.f15603a;
            zaaaVar2.f15446f = ConnectionResult.f15313f;
            zaaa.m8012e(zaaaVar2);
        } finally {
            this.f15603a.f15449i.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    /* renamed from: b */
    public final void mo8039b(int i2, boolean z) {
        ConnectionResult connectionResult;
        this.f15603a.f15449i.lock();
        try {
            zaaa zaaaVar = this.f15603a;
            if (zaaaVar.f15448h || (connectionResult = zaaaVar.f15447g) == null || !connectionResult.m7914n()) {
                zaaa zaaaVar2 = this.f15603a;
                zaaaVar2.f15448h = false;
                zaaaVar2.f15441a.mo8039b(i2, z);
                throw null;
            }
            zaaa zaaaVar3 = this.f15603a;
            zaaaVar3.f15448h = true;
            zaaaVar3.f15443c.mo7980i(i2);
        } finally {
            this.f15603a.f15449i.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    /* renamed from: c */
    public final void mo8040c(@NonNull ConnectionResult connectionResult) {
        this.f15603a.f15449i.lock();
        try {
            zaaa zaaaVar = this.f15603a;
            zaaaVar.f15446f = connectionResult;
            zaaa.m8012e(zaaaVar);
        } finally {
            this.f15603a.f15449i.unlock();
        }
    }
}
