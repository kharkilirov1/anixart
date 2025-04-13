package com.yandex.android.beacon;

import com.yandex.android.beacon.SendBeaconWorkerImpl;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.Nullable;

/* compiled from: SendBeaconWorkerImpl.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000f\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"com/yandex/android/beacon/SendBeaconWorkerImpl$WorkerData$iterator$1", "", "Lcom/yandex/android/beacon/BeaconItem;", "beacon_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class SendBeaconWorkerImpl$WorkerData$iterator$1 implements Iterator<BeaconItem>, KMutableIterator {

    /* renamed from: b */
    @Nullable
    public BeaconItem f30831b;

    /* renamed from: c */
    public final /* synthetic */ Iterator<BeaconItem> f30832c;

    /* renamed from: d */
    public final /* synthetic */ SendBeaconWorkerImpl.WorkerData f30833d;

    /* JADX WARN: Multi-variable type inference failed */
    public SendBeaconWorkerImpl$WorkerData$iterator$1(Iterator<? extends BeaconItem> it, SendBeaconWorkerImpl.WorkerData workerData) {
        this.f30832c = it;
        this.f30833d = workerData;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f30832c.hasNext();
    }

    @Override // java.util.Iterator
    public BeaconItem next() {
        BeaconItem item = this.f30832c.next();
        this.f30831b = item;
        Intrinsics.m32178g(item, "item");
        return item;
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f30832c.remove();
        SendBeaconDb sendBeaconDb = this.f30833d.f30828b;
        BeaconItem beaconItem = this.f30831b;
        sendBeaconDb.m16542a(beaconItem == null ? null : beaconItem.mo16541a());
        this.f30833d.m16545b();
    }
}
