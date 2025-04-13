package com.google.firebase.iid;

import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.UserAgentPublisher;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class GmsRpc {

    /* renamed from: a */
    public final FirebaseApp f23083a;

    /* renamed from: b */
    public final Metadata f23084b;

    /* renamed from: c */
    public final Rpc f23085c;

    /* renamed from: d */
    public final Provider<UserAgentPublisher> f23086d;

    /* renamed from: e */
    public final Provider<HeartBeatInfo> f23087e;

    /* renamed from: f */
    public final FirebaseInstallationsApi f23088f;

    public GmsRpc(FirebaseApp firebaseApp, Metadata metadata, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        firebaseApp.m12217a();
        Rpc rpc = new Rpc(firebaseApp.f22259a);
        this.f23083a = firebaseApp;
        this.f23084b = metadata;
        this.f23085c = rpc;
        this.f23086d = provider;
        this.f23087e = provider2;
        this.f23088f = firebaseInstallationsApi;
    }
}
