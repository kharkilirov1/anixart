package com.yandex.android.beacon;

import kotlin.Metadata;

/* compiled from: SendBeaconPerWorkerLogger.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/android/beacon/SendBeaconPerWorkerLogger;", "", "Companion", "Logcat", "NoOp", "beacon_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public interface SendBeaconPerWorkerLogger {

    /* compiled from: SendBeaconPerWorkerLogger.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/android/beacon/SendBeaconPerWorkerLogger$Companion;", "", "beacon_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: SendBeaconPerWorkerLogger.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/android/beacon/SendBeaconPerWorkerLogger$Logcat;", "Lcom/yandex/android/beacon/SendBeaconPerWorkerLogger;", "beacon_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Logcat implements SendBeaconPerWorkerLogger {
    }

    /* compiled from: SendBeaconPerWorkerLogger.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/android/beacon/SendBeaconPerWorkerLogger$NoOp;", "Lcom/yandex/android/beacon/SendBeaconPerWorkerLogger;", "beacon_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class NoOp implements SendBeaconPerWorkerLogger {
    }
}
