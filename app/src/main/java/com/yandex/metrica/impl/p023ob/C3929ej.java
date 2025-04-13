package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C4082kg;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ej */
/* loaded from: classes2.dex */
public class C3929ej {

    /* renamed from: a */
    @NonNull
    private final C3868ca f45064a;

    public C3929ej() {
        this(new C3868ca());
    }

    @NonNull
    /* renamed from: a */
    public C4214pi m19825a(@NonNull JSONObject jSONObject) {
        C4082kg.c cVar = new C4082kg.c();
        JSONObject optJSONObject = jSONObject.optJSONObject("cache_control");
        if (optJSONObject != null) {
            Long m21264d = C4452ym.m21264d(optJSONObject, "cells_around_ttl");
            TimeUnit timeUnit = TimeUnit.SECONDS;
            cVar.f45673b = C4452ym.m21231a(m21264d, timeUnit, cVar.f45673b);
            cVar.f45674c = C4452ym.m21231a(C4452ym.m21264d(optJSONObject, "wifi_networks_ttl"), timeUnit, cVar.f45674c);
            cVar.f45675d = C4452ym.m21231a(C4452ym.m21264d(optJSONObject, "last_known_location_ttl"), timeUnit, cVar.f45675d);
            cVar.f45676e = C4452ym.m21231a(C4452ym.m21264d(optJSONObject, "net_interfaces_ttl"), timeUnit, cVar.f45676e);
        }
        return this.f45064a.mo17817a(cVar);
    }

    @VisibleForTesting
    public C3929ej(@NonNull C3868ca c3868ca) {
        this.f45064a = c3868ca;
    }
}
