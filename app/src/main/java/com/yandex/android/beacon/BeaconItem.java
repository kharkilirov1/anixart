package com.yandex.android.beacon;

import android.net.Uri;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p000a.C0000a;

/* compiled from: BeaconItem.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/android/beacon/BeaconItem;", "", "NonPersistent", "Persistent", "beacon_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class BeaconItem {

    /* renamed from: a */
    @NotNull
    public final Uri f30806a;

    /* renamed from: b */
    @NotNull
    public final Map<String, String> f30807b;

    /* renamed from: c */
    @Nullable
    public final JSONObject f30808c;

    /* renamed from: d */
    public final long f30809d;

    /* compiled from: BeaconItem.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/android/beacon/BeaconItem$NonPersistent;", "Lcom/yandex/android/beacon/BeaconItem;", "beacon_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class NonPersistent extends BeaconItem {
        @Override // com.yandex.android.beacon.BeaconItem
        @Nullable
        /* renamed from: a */
        public Persistent mo16541a() {
            return null;
        }
    }

    /* compiled from: BeaconItem.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/android/beacon/BeaconItem$Persistent;", "Lcom/yandex/android/beacon/BeaconItem;", "beacon_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Persistent extends BeaconItem {

        /* renamed from: e */
        public final long f30810e;

        public Persistent(@NotNull Uri uri, @NotNull Map<String, String> map, @Nullable JSONObject jSONObject, long j2, long j3) {
            super(uri, map, jSONObject, j2);
            this.f30810e = j3;
        }

        @Override // com.yandex.android.beacon.BeaconItem
        @NotNull
        /* renamed from: a */
        public Persistent mo16541a() {
            return this;
        }
    }

    public BeaconItem(@NotNull Uri uri, @NotNull Map<String, String> map, @Nullable JSONObject jSONObject, long j2) {
        this.f30806a = uri;
        this.f30807b = map;
        this.f30808c = jSONObject;
        this.f30809d = j2;
    }

    @Nullable
    /* renamed from: a */
    public abstract Persistent mo16541a();

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("BeaconItem{url=");
        m24u.append(this.f30806a);
        m24u.append(", headers=");
        m24u.append(this.f30807b);
        m24u.append(", addTimestamp=");
        m24u.append(this.f30809d);
        return m24u.toString();
    }
}
