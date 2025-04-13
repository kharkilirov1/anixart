package com.yandex.android.beacon;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.yandex.android.beacon.BeaconItem;
import com.yandex.android.beacon.SendBeaconWorkerImpl;
import com.yandex.div.core.annotations.PublicApi;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p033io.CloseableKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: SendBeaconManager.kt */
@PublicApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/android/beacon/SendBeaconManager;", "", "Companion", "beacon_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class SendBeaconManager {

    /* renamed from: a */
    @NotNull
    public final SendBeaconWorkerImpl f30814a;

    /* compiled from: SendBeaconManager.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/android/beacon/SendBeaconManager$Companion;", "", "", "TRY_IMMEDIATELY", "Z", "beacon_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    public SendBeaconManager(@NotNull Context context, @NotNull SendBeaconConfiguration sendBeaconConfiguration) {
        new SendBeaconWorkerImpl(context, sendBeaconConfiguration);
        throw null;
    }

    @JvmOverloads
    /* renamed from: a */
    public final void m16543a(@NotNull final Uri uri, @NotNull final Map<String, String> map, @Nullable final JSONObject jSONObject) {
        final SendBeaconWorkerImpl sendBeaconWorkerImpl = this.f30814a;
        Objects.requireNonNull(sendBeaconWorkerImpl);
        Intrinsics.m32187p("Adding url ", uri);
        final boolean z = true;
        sendBeaconWorkerImpl.f30822c.m17394b(new Runnable() { // from class: com.yandex.android.beacon.a
            @Override // java.lang.Runnable
            public final void run() {
                String sb;
                SendBeaconWorkerImpl this$0 = SendBeaconWorkerImpl.this;
                Uri url = uri;
                Map headers = map;
                JSONObject jSONObject2 = jSONObject;
                boolean z2 = z;
                int i2 = SendBeaconWorkerImpl.f30819f;
                Intrinsics.m32179h(this$0, "this$0");
                Intrinsics.m32179h(url, "$url");
                Intrinsics.m32179h(headers, "$headers");
                SendBeaconWorkerImpl.ImplThread implThread = this$0.f30823d;
                Objects.requireNonNull(implThread);
                long currentTimeMillis = System.currentTimeMillis();
                SendBeaconWorkerImpl.WorkerData workerData = (SendBeaconWorkerImpl.WorkerData) implThread.f30825a.getValue();
                Objects.requireNonNull(workerData);
                SendBeaconDb sendBeaconDb = workerData.f30828b;
                Objects.requireNonNull(sendBeaconDb);
                ContentValues contentValues = new ContentValues(3);
                contentValues.put("url", url.toString());
                if (headers.isEmpty()) {
                    sb = null;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    for (Map.Entry entry : headers.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        sb2.append(str);
                        sb2.append('\t');
                        sb2.append(str2);
                        sb2.append((char) 0);
                    }
                    sb = sb2.toString();
                }
                contentValues.put("headers", sb);
                contentValues.put("add_timestamp", Long.valueOf(currentTimeMillis));
                SQLiteDatabase writableDatabase = sendBeaconDb.getWritableDatabase();
                try {
                    long insert = writableDatabase.insert("items", null, contentValues);
                    CloseableKt.m32138a(writableDatabase, null);
                    BeaconItem.Persistent persistent = new BeaconItem.Persistent(url, headers, jSONObject2, currentTimeMillis, insert);
                    workerData.f30829c.push(persistent);
                    workerData.m16545b();
                    if (z2) {
                        Intrinsics.m32178g(new SendBeaconRequest(persistent.f30806a, persistent.f30807b, persistent.f30808c, null).f30815a.toString(), "request.url.toString()");
                        SendBeaconWorkerImpl.m16544a(implThread.f30826b);
                        throw null;
                    }
                    if (implThread.f30826b.f30824e.get() != null) {
                        return;
                    }
                    Objects.requireNonNull(implThread.f30826b.f30821b);
                    throw null;
                } finally {
                }
            }
        });
    }
}
