package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zah extends zad<Boolean> {

    /* renamed from: c */
    public final ListenerHolder.ListenerKey<?> f15588c;

    public zah(ListenerHolder.ListenerKey<?> listenerKey, TaskCompletionSource<Boolean> taskCompletionSource) {
        super(4, taskCompletionSource);
        this.f15588c = listenerKey;
    }

    @Override // com.google.android.gms.common.api.internal.zad, com.google.android.gms.common.api.internal.zai
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8075d(@NonNull zaad zaadVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.zac
    /* renamed from: f */
    public final boolean mo8069f(zabq<?> zabqVar) {
        if (zabqVar.f15529f.get(this.f15588c) == null) {
            return false;
        }
        Objects.requireNonNull(null);
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    @Nullable
    /* renamed from: g */
    public final Feature[] mo8070g(zabq<?> zabqVar) {
        if (zabqVar.f15529f.get(this.f15588c) == null) {
            return null;
        }
        Objects.requireNonNull(null);
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zad
    /* renamed from: h */
    public final void mo8076h(zabq<?> zabqVar) throws RemoteException {
        if (zabqVar.f15529f.remove(this.f15588c) != null) {
            throw null;
        }
        this.f15580b.m9718d(Boolean.FALSE);
    }
}
