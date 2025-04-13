package com.yandex.metrica.impl.p023ob;

import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C4082kg;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.wj */
/* loaded from: classes2.dex */
public final class C4397wj {

    /* renamed from: a */
    private final C3292Fa f46898a;

    @VisibleForTesting
    public C4397wj(@NotNull C3292Fa c3292Fa) {
        this.f46898a = c3292Fa;
    }

    /* renamed from: a */
    public final void m21115a(@NotNull C4371vj c4371vj, @NotNull JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("startup_update");
        C4082kg.q qVar = new C4082kg.q();
        Integer m21260c = C4452ym.m21260c(optJSONObject, "interval_seconds");
        if (m21260c != null) {
            qVar.f45779b = m21260c.intValue();
        }
        c4371vj.m21004a(this.f46898a.mo17817a(qVar));
    }

    public C4397wj() {
        this(new C3292Fa());
    }
}
