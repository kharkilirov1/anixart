package com.google.android.gms.internal.safetynet;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;

/* loaded from: classes.dex */
public interface zzg extends IInterface {
    /* renamed from: H1 */
    void mo9667H1(Status status) throws RemoteException;

    /* renamed from: I0 */
    void mo9668I0(Status status, SafeBrowsingData safeBrowsingData) throws RemoteException;

    /* renamed from: R */
    void mo9669R(Status status, com.google.android.gms.safetynet.zza zzaVar) throws RemoteException;

    /* renamed from: S1 */
    void mo9670S1(Status status, com.google.android.gms.safetynet.zzd zzdVar) throws RemoteException;

    /* renamed from: d1 */
    void mo9671d1(Status status, com.google.android.gms.safetynet.zzf zzfVar) throws RemoteException;

    /* renamed from: r2 */
    void mo9672r2(Status status, boolean z) throws RemoteException;
}
