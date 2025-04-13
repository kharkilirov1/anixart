package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.I8 */
/* loaded from: classes2.dex */
public final class C3365I8 extends AbstractC3390J8 {

    /* renamed from: e */
    @NotNull
    private final Set<String> f43097e;

    @VisibleForTesting
    public C3365I8(@NotNull Context context, @NotNull String str, @NotNull C3432L0 c3432l0) {
        super(context, C0000a.m16m("appmetrica_vital_", str, ".dat"), c3432l0);
        this.f43097e = SetsKt.m32080g("first_event_done", "init_event_done", "report_request_id", "global_number", "numbers_of_type", "session_id", "referrer_handled", "open_id", "attribution_id", "last_migration_api_level");
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3390J8
    @NotNull
    /* renamed from: a */
    public Set<String> mo18201a() {
        return this.f43097e;
    }

    @WorkerThread
    /* renamed from: b */
    public final synchronized void m18257b(boolean z) {
        JSONObject put = m18391b().put("init_event_done", z);
        Intrinsics.m32178g(put, "getOrLoadData().put(INIT_EVENT_DONE, value)");
        m18390a(put);
    }

    @WorkerThread
    /* renamed from: c */
    public final synchronized void m18259c(int i2) {
        JSONObject put = m18391b().put("report_request_id", i2);
        Intrinsics.m32178g(put, "getOrLoadData().put(KEY_REPORT_REQUEST_ID, value)");
        m18390a(put);
    }

    @WorkerThread
    /* renamed from: d */
    public final synchronized int m18261d() {
        return m18391b().optInt("global_number", 0);
    }

    @WorkerThread
    /* renamed from: e */
    public final synchronized int m18262e() {
        return m18391b().optInt("last_migration_api_level", 0);
    }

    @WorkerThread
    @Nullable
    /* renamed from: f */
    public final synchronized JSONObject m18263f() {
        return m18391b().optJSONObject("numbers_of_type");
    }

    @WorkerThread
    /* renamed from: g */
    public final synchronized int m18264g() {
        return m18391b().optInt("open_id", 1);
    }

    @WorkerThread
    /* renamed from: h */
    public final synchronized boolean m18265h() {
        return m18391b().optBoolean("referrer_handled", false);
    }

    @WorkerThread
    /* renamed from: i */
    public final synchronized int m18266i() {
        return m18391b().optInt("report_request_id", -1);
    }

    @WorkerThread
    /* renamed from: j */
    public final synchronized long m18267j() {
        return m18391b().optLong("session_id", -1L);
    }

    @WorkerThread
    /* renamed from: k */
    public final synchronized void m18268k() {
        synchronized (this) {
        }
        int optInt = m18391b().optInt("attribution_id", 1) + 1;
        synchronized (this) {
            JSONObject put = m18391b().put("attribution_id", optInt);
            Intrinsics.m32178g(put, "getOrLoadData().put(KEY_ATTRIBUTION_ID, value)");
            m18390a(put);
        }
    }

    @WorkerThread
    /* renamed from: l */
    public final synchronized void m18269l() {
        synchronized (this) {
        }
        int optInt = m18391b().optInt("open_id", 1) + 1;
        synchronized (this) {
            JSONObject put = m18391b().put("open_id", optInt);
            Intrinsics.m32178g(put, "getOrLoadData().put(KEY_OPEN_ID, value)");
            m18390a(put);
        }
    }

    @WorkerThread
    /* renamed from: m */
    public final synchronized boolean m18270m() {
        return m18391b().optBoolean("first_event_done", false);
    }

    @WorkerThread
    /* renamed from: n */
    public final synchronized boolean m18271n() {
        return m18391b().optBoolean("init_event_done", false);
    }

    @WorkerThread
    /* renamed from: a */
    public final synchronized void m18253a(boolean z) {
        JSONObject put = m18391b().put("first_event_done", z);
        Intrinsics.m32178g(put, "getOrLoadData().put(FIRST_EVENT_DONE, value)");
        m18390a(put);
    }

    @WorkerThread
    /* renamed from: b */
    public final synchronized void m18256b(@Nullable JSONObject jSONObject) {
        JSONObject put = m18391b().put("numbers_of_type", jSONObject);
        Intrinsics.m32178g(put, "getOrLoadData().put(KEY_NUMBERS_OF_TYPE, value)");
        m18390a(put);
    }

    @WorkerThread
    /* renamed from: c */
    public final synchronized void m18260c(boolean z) {
        JSONObject put = m18391b().put("referrer_handled", z);
        Intrinsics.m32178g(put, "getOrLoadData().put(KEY_REFERRER_HANDLED, value)");
        m18390a(put);
    }

    @WorkerThread
    /* renamed from: a */
    public final synchronized void m18251a(int i2) {
        JSONObject put = m18391b().put("global_number", i2);
        Intrinsics.m32178g(put, "getOrLoadData().put(KEY_GLOBAL_NUMBER, value)");
        m18390a(put);
    }

    @WorkerThread
    /* renamed from: b */
    public final synchronized void m18255b(int i2) {
        JSONObject put = m18391b().put("last_migration_api_level", i2);
        Intrinsics.m32178g(put, "getOrLoadData().put(KEY_…GRATION_API_LEVEL, value)");
        m18390a(put);
    }

    @WorkerThread
    /* renamed from: c */
    public final synchronized int m18258c() {
        return m18391b().optInt("attribution_id", 1);
    }

    @WorkerThread
    /* renamed from: a */
    public final synchronized void m18252a(long j2) {
        JSONObject put = m18391b().put("session_id", j2);
        Intrinsics.m32178g(put, "getOrLoadData().put(KEY_SESSION_ID, value)");
        m18390a(put);
    }

    @WorkerThread
    /* renamed from: a */
    public final synchronized void m18254a(boolean z, boolean z2, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l2, @Nullable Boolean bool, @Nullable JSONObject jSONObject, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5) {
        JSONObject json = new JSONObject().put("first_event_done", z).put("init_event_done", z2).put("report_request_id", num).put("global_number", num2).put("session_id", l2).put("referrer_handled", bool).put("open_id", num3).put("attribution_id", num4).put("numbers_of_type", jSONObject).put("last_migration_api_level", num5);
        Intrinsics.m32178g(json, "json");
        m18390a(json);
    }
}
