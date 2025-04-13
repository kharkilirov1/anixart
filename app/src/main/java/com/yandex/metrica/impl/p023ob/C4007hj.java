package com.yandex.metrica.impl.p023ob;

import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C4082kg;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.hj */
/* loaded from: classes2.dex */
public final class C4007hj {

    /* renamed from: a */
    private final C4050ja f45302a;

    @VisibleForTesting
    public C4007hj(@NotNull C4050ja c4050ja) {
        this.f45302a = c4050ja;
    }

    /* renamed from: a */
    public final void m20024a(@NotNull C4371vj c4371vj, @NotNull JSONObject jSONObject) {
        C4082kg.h hVar = new C4082kg.h();
        JSONObject optJSONObject = jSONObject.optJSONObject("egress");
        if (optJSONObject != null) {
            hVar.f45686b = optJSONObject.optString("url", hVar.f45686b);
            hVar.f45687c = optJSONObject.optInt("repeated_delay", hVar.f45687c);
            hVar.f45688d = optJSONObject.optInt("random_delay_window", hVar.f45688d);
            hVar.f45689e = optJSONObject.optBoolean("background_allowed", hVar.f45689e);
            hVar.f45690f = optJSONObject.optBoolean("diagnostic_enabled", hVar.f45690f);
        }
        c4371vj.m21013a(this.f45302a.mo17817a(hVar));
    }

    public C4007hj() {
        this(new C4050ja());
    }
}
