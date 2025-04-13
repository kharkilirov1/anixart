package com.yandex.metrica.push.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.impl.C4540O0;
import com.yandex.metrica.push.impl.C4592p;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.push.impl.j0 */
/* loaded from: classes2.dex */
public class C4581j0 implements C4540O0.a {

    /* renamed from: d */
    private static final long f47391d = TimeUnit.MINUTES.toSeconds(5);

    /* renamed from: e */
    private static final Location f47392e = new Location("");

    /* renamed from: a */
    @NonNull
    private Location f47393a = f47392e;

    /* renamed from: b */
    @NonNull
    private final C4588n f47394b;

    /* renamed from: c */
    @Nullable
    private final C4592p.a f47395c;

    public C4581j0(@NonNull C4588n c4588n, @Nullable C4592p.a aVar) {
        this.f47394b = c4588n;
        this.f47395c = aVar;
    }

    @Nullable
    /* renamed from: b */
    private Location m21553b() throws C4582k {
        C4588n c4588n = this.f47394b;
        C4592p.a aVar = this.f47395c;
        C4592p.a.EnumC7010a m21595c = aVar != null ? aVar.m21595c() : null;
        if (m21595c == null) {
            m21595c = C4592p.a.EnumC7010a.NETWORK;
        }
        String m21598a = m21595c.m21598a();
        C4592p.a aVar2 = this.f47395c;
        Long m21596d = aVar2 != null ? aVar2.m21596d() : null;
        long longValue = m21596d != null ? m21596d.longValue() : 30L;
        C4592p.a aVar3 = this.f47395c;
        Long m21594b = aVar3 != null ? aVar3.m21594b() : null;
        long longValue2 = m21594b != null ? m21594b.longValue() : f47391d;
        C4592p.a aVar4 = this.f47395c;
        Integer m21593a = aVar4 != null ? aVar4.m21593a() : null;
        return c4588n.m21557a(m21598a, longValue, longValue2, m21593a != null ? m21593a.intValue() : 500);
    }

    @Override // com.yandex.metrica.push.impl.C4540O0.a
    @NonNull
    /* renamed from: a */
    public List<String> mo21466a() {
        return Arrays.asList("lat", "lon");
    }

    @Override // com.yandex.metrica.push.impl.C4540O0.a
    @NonNull
    /* renamed from: a */
    public String mo21465a(@NonNull String str) {
        if (this.f47393a == f47392e) {
            try {
                Location m21553b = m21553b();
                if (m21553b == null) {
                    throw new C4537N("Unknown location for lazy push", null);
                }
                this.f47393a = m21553b;
            } catch (C4582k e2) {
                throw new C4537N("Unknown location for lazy push", e2.getMessage());
            }
        }
        if ("lat".equals(str)) {
            return this.f47393a.getLatitude() + "";
        }
        if (!"lon".equals(str)) {
            return "";
        }
        return this.f47393a.getLongitude() + "";
    }
}
