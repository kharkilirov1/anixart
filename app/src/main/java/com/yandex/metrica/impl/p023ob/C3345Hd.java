package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3671Uf;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* renamed from: com.yandex.metrica.impl.ob.Hd */
/* loaded from: classes2.dex */
public class C3345Hd {
    @NonNull
    /* renamed from: a */
    public C3671Uf.a m18232a(@NonNull C3643Tc c3643Tc) {
        C3671Uf.a aVar = new C3671Uf.a();
        aVar.f44152b = c3643Tc.m19157f() == null ? aVar.f44152b : c3643Tc.m19157f().longValue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aVar.f44153c = timeUnit.toSeconds(c3643Tc.m19155d());
        aVar.f44156f = timeUnit.toSeconds(c3643Tc.m19154c());
        aVar.f44157g = c3643Tc.m19151b() == null ? 0 : C3886d2.m19691a(c3643Tc.m19151b());
        aVar.f44158h = c3643Tc.m19156e() == null ? 3 : C3886d2.m19692a(c3643Tc.m19156e());
        JSONArray m19145a = c3643Tc.m19145a();
        if (m19145a != null) {
            aVar.f44154d = C3886d2.m19701b(m19145a);
        }
        JSONArray m19158g = c3643Tc.m19158g();
        if (m19158g != null) {
            aVar.f44155e = C3886d2.m19698a(m19158g);
        }
        return aVar;
    }
}
