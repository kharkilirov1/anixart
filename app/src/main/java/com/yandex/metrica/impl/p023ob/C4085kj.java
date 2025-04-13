package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C4082kg;
import com.yandex.metrica.impl.p023ob.C4452ym;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.kj */
/* loaded from: classes2.dex */
public class C4085kj {

    /* renamed from: a */
    @NonNull
    private final C4206pa f45838a;

    public C4085kj() {
        this(new C4206pa());
    }

    /* renamed from: a */
    public void m20304a(@NonNull C4371vj c4371vj, @NonNull C4452ym.a aVar) {
        if (c4371vj.m21033e().f46406f) {
            C4082kg.j jVar = new C4082kg.j();
            JSONObject optJSONObject = aVar.optJSONObject("identity_light_collecting");
            if (optJSONObject != null) {
                jVar.f45716b = optJSONObject.optLong("min_interval_seconds", jVar.f45716b);
            }
            c4371vj.m21015a(this.f45838a.mo17817a(jVar));
        }
    }

    @VisibleForTesting
    public C4085kj(@NonNull C4206pa c4206pa) {
        this.f45838a = c4206pa;
    }
}
