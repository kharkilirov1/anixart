package com.yandex.metrica.impl.p023ob;

import android.location.Location;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3671Uf;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.Jd */
/* loaded from: classes2.dex */
public class C3395Jd {
    @NonNull
    /* renamed from: a */
    public C3671Uf.b m18408a(@NonNull C4209pd c4209pd) {
        C3671Uf.b bVar = new C3671Uf.b();
        Location m20546c = c4209pd.m20546c();
        bVar.f44160b = c4209pd.m20545b() == null ? bVar.f44160b : c4209pd.m20545b().longValue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bVar.f44162d = timeUnit.toSeconds(m20546c.getTime());
        bVar.f44170l = C3886d2.m19692a(c4209pd.f46135a);
        bVar.f44161c = timeUnit.toSeconds(c4209pd.m20548e());
        bVar.f44171m = timeUnit.toSeconds(c4209pd.m20547d());
        bVar.f44163e = m20546c.getLatitude();
        bVar.f44164f = m20546c.getLongitude();
        bVar.f44165g = Math.round(m20546c.getAccuracy());
        bVar.f44166h = Math.round(m20546c.getBearing());
        bVar.f44167i = Math.round(m20546c.getSpeed());
        bVar.f44168j = (int) Math.round(m20546c.getAltitude());
        String provider = m20546c.getProvider();
        int i2 = 0;
        if ("gps".equals(provider)) {
            i2 = 1;
        } else if ("network".equals(provider)) {
            i2 = 2;
        } else if ("fused".equals(provider)) {
            i2 = 3;
        }
        bVar.f44169k = i2;
        bVar.f44172n = C3886d2.m19691a(c4209pd.m20544a());
        return bVar;
    }
}
