package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.H8 */
/* loaded from: classes2.dex */
public final class C3340H8 extends AbstractC3390J8 {

    /* renamed from: e */
    @NotNull
    private final Set<String> f43043e;

    @VisibleForTesting
    public C3340H8(@NotNull Context context, @NotNull C3432L0 c3432l0) {
        super(context, "appmetrica_vital.dat", c3432l0);
        this.f43043e = SetsKt.m32080g("device_id", "device_id_hash", "location_id", "lbs_id", "referrer", "referrer_checked", "location_request_id", "last_migration_api_level");
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3390J8
    @NotNull
    /* renamed from: a */
    public Set<String> mo18201a() {
        return this.f43043e;
    }

    @WorkerThread
    /* renamed from: b */
    public final synchronized void m18208b(@Nullable String str) {
        JSONObject put = m18391b().put("device_id_hash", str);
        Intrinsics.m32178g(put, "getOrLoadData().put(KEY_DEVICE_ID_HASH, value)");
        m18390a(put);
    }

    @WorkerThread
    @Nullable
    /* renamed from: c */
    public final synchronized String m18209c() {
        return C4452ym.m21267e(m18391b(), "device_id");
    }

    @WorkerThread
    @Nullable
    /* renamed from: d */
    public final synchronized String m18210d() {
        return C4452ym.m21267e(m18391b(), "device_id_hash");
    }

    @WorkerThread
    /* renamed from: e */
    public final synchronized int m18211e() {
        return m18391b().optInt("last_migration_api_level", -1);
    }

    @WorkerThread
    /* renamed from: f */
    public final synchronized long m18212f() {
        return m18391b().optLong("location_request_id", -1L);
    }

    @WorkerThread
    @Nullable
    /* renamed from: g */
    public final synchronized C3298Fg m18213g() {
        C3298Fg m18102a;
        String m21267e = C4452ym.m21267e(m18391b(), "referrer");
        if (m21267e != null) {
            try {
                byte[] bytes = m21267e.getBytes(Charsets.f66855b);
                Intrinsics.m32178g(bytes, "(this as java.lang.String).getBytes(charset)");
                m18102a = C3298Fg.m18102a(Base64.decode(bytes, 0));
            } catch (Throwable unused) {
            }
        }
        m18102a = null;
        return m18102a;
    }

    @WorkerThread
    /* renamed from: h */
    public final synchronized boolean m18214h() {
        return m18391b().optBoolean("referrer_checked", false);
    }

    @WorkerThread
    /* renamed from: a */
    public final synchronized void m18205a(@Nullable String str) {
        JSONObject put = m18391b().put("device_id", str);
        Intrinsics.m32178g(put, "getOrLoadData().put(KEY_DEVICE_ID, value)");
        m18390a(put);
    }

    @WorkerThread
    /* renamed from: a */
    public final synchronized void m18204a(@Nullable C3298Fg c3298Fg) {
        String str;
        JSONObject m18391b = m18391b();
        if (c3298Fg != null) {
            byte[] encode = Base64.encode(c3298Fg.m18103a(), 0);
            Intrinsics.m32178g(encode, "Base64.encode(toProto(), 0)");
            str = new String(encode, Charsets.f66855b);
        } else {
            str = null;
        }
        JSONObject put = m18391b.put("referrer", str);
        Intrinsics.m32178g(put, "getOrLoadData().put(KEY_…value?.toEncodedString())");
        m18390a(put);
    }

    @WorkerThread
    /* renamed from: a */
    public final synchronized void m18207a(boolean z) {
        JSONObject put = m18391b().put("referrer_checked", z);
        Intrinsics.m32178g(put, "getOrLoadData().put(KEY_REFERRER_CHECKED, value)");
        m18390a(put);
    }

    @WorkerThread
    /* renamed from: a */
    public final synchronized void m18203a(long j2) {
        JSONObject put = m18391b().put("location_request_id", j2);
        Intrinsics.m32178g(put, "getOrLoadData().put(KEY_…CATION_REQUEST_ID, value)");
        m18390a(put);
    }

    @WorkerThread
    /* renamed from: a */
    public final synchronized void m18202a(int i2) {
        JSONObject put = m18391b().put("last_migration_api_level", i2);
        Intrinsics.m32178g(put, "getOrLoadData().put(KEY_…GRATION_API_LEVEL, value)");
        m18390a(put);
    }

    @WorkerThread
    /* renamed from: a */
    public final synchronized void m18206a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @Nullable Integer num) {
        JSONObject json = new JSONObject().put("device_id", str).put("device_id_hash", str2).put("referrer", str3).put("referrer_checked", bool).put("location_id", l2).put("lbs_id", l3).put("location_request_id", l4).put("last_migration_api_level", num);
        Intrinsics.m32178g(json, "json");
        m18390a(json);
    }
}
