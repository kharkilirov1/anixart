package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.IBinder;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final /* synthetic */ class zacg implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ NonGmsServiceBrokerClient f15560b;

    /* renamed from: c */
    public final /* synthetic */ IBinder f15561c;

    @Override // java.lang.Runnable
    public final void run() {
        NonGmsServiceBrokerClient nonGmsServiceBrokerClient = this.f15560b;
        IBinder iBinder = this.f15561c;
        Objects.requireNonNull(nonGmsServiceBrokerClient);
        nonGmsServiceBrokerClient.f15432b = iBinder;
        String.valueOf(iBinder);
        new Bundle();
        throw null;
    }
}
