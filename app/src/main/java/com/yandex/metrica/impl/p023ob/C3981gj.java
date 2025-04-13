package com.yandex.metrica.impl.p023ob;

import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C4082kg;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.gj */
/* loaded from: classes2.dex */
public final class C3981gj {

    /* renamed from: a */
    private final C4024ia f45222a;

    @VisibleForTesting
    public C3981gj(@NotNull C4024ia c4024ia) {
        this.f45222a = c4024ia;
    }

    /* renamed from: a */
    public final void m19973a(@NotNull C4371vj c4371vj, @NotNull JSONObject jSONObject) {
        C4082kg.g gVar = new C4082kg.g();
        JSONObject optJSONObject = jSONObject.optJSONObject("easy_collecting");
        if (optJSONObject != null) {
            gVar.f45685b = optJSONObject.optLong("first_delay_seconds", gVar.f45685b);
        }
        c4371vj.m21002a(this.f45222a.mo17817a(gVar));
    }

    public C3981gj() {
        this(new C4024ia());
    }
}
