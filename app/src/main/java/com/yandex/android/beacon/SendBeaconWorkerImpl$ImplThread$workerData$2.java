package com.yandex.android.beacon;

import android.content.Context;
import com.yandex.android.beacon.SendBeaconWorkerImpl;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: SendBeaconWorkerImpl.kt */
@Metadata(m31883d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m31884d2 = {"<anonymous>", "Lcom/yandex/android/beacon/SendBeaconWorkerImpl$WorkerData;", "Lcom/yandex/android/beacon/SendBeaconWorkerImpl;", "invoke"}, m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
final class SendBeaconWorkerImpl$ImplThread$workerData$2 extends Lambda implements Function0<SendBeaconWorkerImpl.WorkerData> {

    /* renamed from: b */
    public final /* synthetic */ SendBeaconWorkerImpl f30827b;

    @Override // kotlin.jvm.functions.Function0
    public SendBeaconWorkerImpl.WorkerData invoke() {
        SendBeaconWorkerImpl sendBeaconWorkerImpl = this.f30827b;
        Context context = sendBeaconWorkerImpl.f30820a;
        Objects.requireNonNull(sendBeaconWorkerImpl.f30821b);
        return new SendBeaconWorkerImpl.WorkerData(sendBeaconWorkerImpl, context, null);
    }
}
