package com.yandex.android.beacon;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.yandex.div.internal.util.SingleThreadExecutor;
import java.util.Deque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: SendBeaconWorkerImpl.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/android/beacon/SendBeaconWorkerImpl;", "Lcom/yandex/android/beacon/SendBeaconWorker;", "Companion", "ImplThread", "RunningJob", "WorkerData", "WorkerThreadExecutor", "beacon_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class SendBeaconWorkerImpl implements SendBeaconWorker {

    /* renamed from: f */
    public static final /* synthetic */ int f30819f = 0;

    /* renamed from: a */
    @NotNull
    public final Context f30820a;

    /* renamed from: b */
    @NotNull
    public final SendBeaconConfiguration f30821b;

    /* renamed from: c */
    @NotNull
    public final WorkerThreadExecutor f30822c;

    /* renamed from: d */
    @NotNull
    public final ImplThread f30823d;

    /* renamed from: e */
    @NotNull
    public final AtomicReference<RunningJob> f30824e;

    /* compiled from: SendBeaconWorkerImpl.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\b\u0010\t¨\u0006\n"}, m31884d2 = {"Lcom/yandex/android/beacon/SendBeaconWorkerImpl$Companion;", "", "", "TAG", "Ljava/lang/String;", "", "URL_EXPIRE_PERIOD_MS", "J", "getURL_EXPIRE_PERIOD_MS$beacon_release$annotations", "()V", "beacon_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: SendBeaconWorkerImpl.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0083\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/android/beacon/SendBeaconWorkerImpl$ImplThread;", "", "beacon_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    @WorkerThread
    public final class ImplThread {

        /* renamed from: a */
        @NotNull
        public final Lazy f30825a;

        /* renamed from: b */
        public final /* synthetic */ SendBeaconWorkerImpl f30826b;
    }

    /* compiled from: SendBeaconWorkerImpl.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/android/beacon/SendBeaconWorkerImpl$RunningJob;", "", "beacon_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class RunningJob {
    }

    /* compiled from: SendBeaconWorkerImpl.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\b\u0083\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/android/beacon/SendBeaconWorkerImpl$WorkerData;", "", "Lcom/yandex/android/beacon/BeaconItem;", "beacon_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    @WorkerThread
    public final class WorkerData implements Iterable<BeaconItem>, KMappedMarker {

        /* renamed from: b */
        @NotNull
        public final SendBeaconDb f30828b;

        /* renamed from: c */
        @NotNull
        public final Deque<BeaconItem> f30829c;

        /* renamed from: d */
        public final /* synthetic */ SendBeaconWorkerImpl f30830d;

        public WorkerData(@NotNull SendBeaconWorkerImpl this$0, @NotNull Context context, String str) {
            Intrinsics.m32179h(this$0, "this$0");
            Intrinsics.m32179h(context, "context");
            Intrinsics.m32179h(null, "databaseName");
            throw null;
        }

        /* renamed from: b */
        public final void m16545b() {
            SendBeaconWorkerImpl sendBeaconWorkerImpl = this.f30830d;
            this.f30829c.isEmpty();
            int i2 = SendBeaconWorkerImpl.f30819f;
            Objects.requireNonNull(sendBeaconWorkerImpl);
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<BeaconItem> iterator() {
            Iterator<BeaconItem> it = this.f30829c.iterator();
            Intrinsics.m32178g(it, "itemCache.iterator()");
            return new SendBeaconWorkerImpl$WorkerData$iterator$1(it, this);
        }
    }

    /* compiled from: SendBeaconWorkerImpl.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/android/beacon/SendBeaconWorkerImpl$WorkerThreadExecutor;", "Lcom/yandex/div/internal/util/SingleThreadExecutor;", "beacon_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class WorkerThreadExecutor extends SingleThreadExecutor {
        public WorkerThreadExecutor(@NotNull Executor executor) {
            Intrinsics.m32179h(null, "executor");
            throw null;
        }

        @Override // com.yandex.div.internal.util.SingleThreadExecutor
        /* renamed from: a */
        public void mo16546a(@NotNull RuntimeException runtimeException) {
        }
    }

    static {
        TimeUnit.DAYS.toMillis(1L);
    }

    public SendBeaconWorkerImpl(@NotNull Context context, @NotNull SendBeaconConfiguration sendBeaconConfiguration) {
        this.f30820a = context;
        this.f30821b = sendBeaconConfiguration;
        new WorkerThreadExecutor(null);
        throw null;
    }

    /* renamed from: a */
    public static final SendBeaconPerWorkerLogger m16544a(SendBeaconWorkerImpl sendBeaconWorkerImpl) {
        Objects.requireNonNull(sendBeaconWorkerImpl.f30821b);
        return null;
    }
}
