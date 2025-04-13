package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zaz implements zabz {

    /* renamed from: a */
    public final /* synthetic */ zaaa f15604a;

    @Override // com.google.android.gms.common.api.internal.zabz
    /* renamed from: a */
    public final void mo8038a(@Nullable Bundle bundle) {
        this.f15604a.f15449i.lock();
        try {
            zaaa zaaaVar = this.f15604a;
            zaaaVar.f15447g = ConnectionResult.f15313f;
            zaaa.m8012e(zaaaVar);
        } finally {
            this.f15604a.f15449i.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    /* renamed from: b */
    public final void mo8039b(int i2, boolean z) {
        this.f15604a.f15449i.lock();
        try {
            zaaa zaaaVar = this.f15604a;
            if (zaaaVar.f15448h) {
                zaaaVar.f15448h = false;
                zaaaVar.f15441a.mo8039b(i2, z);
                throw null;
            }
            zaaaVar.f15448h = true;
            zaaaVar.f15442b.mo7980i(i2);
        } finally {
            this.f15604a.f15449i.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    /* renamed from: c */
    public final void mo8040c(@NonNull ConnectionResult connectionResult) {
        this.f15604a.f15449i.lock();
        try {
            zaaa zaaaVar = this.f15604a;
            zaaaVar.f15447g = connectionResult;
            zaaa.m8012e(zaaaVar);
        } finally {
            this.f15604a.f15449i.unlock();
        }
    }
}
