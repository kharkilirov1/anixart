package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C4082kg;
import com.yandex.metrica.impl.p023ob.C4452ym;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.sj */
/* loaded from: classes2.dex */
public class C4293sj {

    /* renamed from: a */
    @NonNull
    private final C3192Ba f46476a;

    public C4293sj() {
        this(new C3192Ba());
    }

    /* renamed from: a */
    public void m20766a(@NonNull C4371vj c4371vj, @NonNull C4452ym.a aVar) {
        C4082kg.o oVar = new C4082kg.o();
        JSONObject optJSONObject = aVar.optJSONObject("sdk_list");
        if (optJSONObject != null) {
            Long m21264d = C4452ym.m21264d(optJSONObject, "min_collecting_interval_seconds");
            TimeUnit timeUnit = TimeUnit.SECONDS;
            oVar.f45765b = C4452ym.m21231a(m21264d, timeUnit, oVar.f45765b);
            oVar.f45766c = C4452ym.m21231a(C4452ym.m21264d(optJSONObject, "min_first_collecting_delay_seconds"), timeUnit, oVar.f45766c);
            oVar.f45767d = C4452ym.m21231a(C4452ym.m21264d(optJSONObject, "min_collecting_delay_after_launch_seconds"), timeUnit, oVar.f45767d);
            oVar.f45768e = C4452ym.m21231a(C4452ym.m21264d(optJSONObject, "min_request_retry_interval_seconds"), timeUnit, oVar.f45768e);
        }
        c4371vj.m20999a(this.f46476a.mo17817a(oVar));
    }

    @VisibleForTesting
    public C4293sj(@NonNull C3192Ba c3192Ba) {
        this.f46476a = c3192Ba;
    }
}
