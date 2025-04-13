package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.B8 */
/* loaded from: classes2.dex */
public class C3190B8 extends AbstractC4256r8 {
    public C3190B8(@NonNull C4386w8 c4386w8) {
        this(c4386w8, C3532P0.m18696i().m18722y().m18440a());
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC4256r8
    /* renamed from: a */
    public long mo17819a() {
        long optLong;
        C3340H8 m20651f = m20651f();
        synchronized (m20651f) {
            optLong = m20651f.m18391b().optLong("location_id", -1L);
        }
        return optLong;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC4256r8
    /* renamed from: b */
    public void mo17820b(long j2) {
        C3340H8 m20651f = m20651f();
        synchronized (m20651f) {
            JSONObject put = m20651f.m18391b().put("location_id", j2);
            Intrinsics.m32178g(put, "getOrLoadData().put(KEY_LOCATION_ID, value)");
            m20651f.m18390a(put);
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC4256r8
    @NonNull
    /* renamed from: e */
    public String mo17821e() {
        return "l_dat";
    }

    @VisibleForTesting
    public C3190B8(@NonNull C4386w8 c4386w8, @NonNull C3340H8 c3340h8) {
        super(c4386w8, c3340h8);
    }
}
