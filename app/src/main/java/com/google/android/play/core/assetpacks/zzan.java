package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzan extends zzal<ParcelFileDescriptor> {
    public zzan(zzaw zzawVar, com.google.android.play.core.tasks.zzi<ParcelFileDescriptor> zziVar) {
        super(zzawVar, zziVar);
    }

    @Override // com.google.android.play.core.assetpacks.zzal, com.google.android.play.core.internal.zzw
    /* renamed from: y */
    public final void mo10701y(Bundle bundle, Bundle bundle2) throws RemoteException {
        this.f19683b.f19701d.m10843c(this.f19682a);
        zzaw.f19696g.m10837d("onGetChunkFileDescriptor", new Object[0]);
        this.f19682a.m11015d((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
