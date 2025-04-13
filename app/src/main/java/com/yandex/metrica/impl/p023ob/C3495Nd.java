package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3671Uf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Nd */
/* loaded from: classes2.dex */
public class C3495Nd {

    /* renamed from: a */
    @NonNull
    private final C3190B8 f43467a;

    /* renamed from: b */
    @NonNull
    private final C3165A8 f43468b;

    /* renamed from: c */
    @NonNull
    private final C3420Kd f43469c;

    /* renamed from: d */
    @NonNull
    private final C3370Id f43470d;

    public C3495Nd(@NonNull Context context) {
        this(C3567Qa.m18783a(context).m18798f(), C3567Qa.m18783a(context).m18797e(), new C3219Cc(context), new C3395Jd(), new C3345Hd());
    }

    /* renamed from: a */
    public C3470Md m18613a(int i2) {
        Map<Long, String> m20645a = this.f43467a.m20645a(i2);
        Map<Long, String> m20645a2 = this.f43468b.m20645a(i2);
        C3671Uf c3671Uf = new C3671Uf();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = (LinkedHashMap) m20645a;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C3671Uf.b m18444a = this.f43469c.m18444a(((Long) entry.getKey()).longValue(), (String) entry.getValue());
            if (m18444a != null) {
                arrayList.add(m18444a);
            }
        }
        c3671Uf.f44149b = (C3671Uf.b[]) arrayList.toArray(new C3671Uf.b[arrayList.size()]);
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) m20645a2;
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            C3671Uf.a m18309a = this.f43470d.m18309a(((Long) entry2.getKey()).longValue(), (String) entry2.getValue());
            if (m18309a != null) {
                arrayList2.add(m18309a);
            }
        }
        c3671Uf.f44150c = (C3671Uf.a[]) arrayList2.toArray(new C3671Uf.a[arrayList2.size()]);
        return new C3470Md(m20645a.isEmpty() ? -1L : ((Long) Collections.max(linkedHashMap.keySet())).longValue(), m20645a2.isEmpty() ? -1L : ((Long) Collections.max(linkedHashMap2.keySet())).longValue(), c3671Uf);
    }

    @VisibleForTesting
    public C3495Nd(@NonNull C3190B8 c3190b8, @NonNull C3165A8 c3165a8, @NonNull C3219Cc c3219Cc, @NonNull C3395Jd c3395Jd, @NonNull C3345Hd c3345Hd) {
        this(c3190b8, c3165a8, new C3420Kd(c3219Cc, c3395Jd), new C3370Id(c3219Cc, c3345Hd));
    }

    @VisibleForTesting
    public C3495Nd(@NonNull C3190B8 c3190b8, @NonNull C3165A8 c3165a8, @NonNull C3420Kd c3420Kd, @NonNull C3370Id c3370Id) {
        this.f43467a = c3190b8;
        this.f43468b = c3165a8;
        this.f43469c = c3420Kd;
        this.f43470d = c3370Id;
    }

    /* renamed from: a */
    public void m18614a(C3470Md c3470Md) {
        long j2 = c3470Md.f43426a;
        if (j2 >= 0) {
            this.f43467a.m20649c(j2);
        }
        long j3 = c3470Md.f43427b;
        if (j3 >= 0) {
            this.f43468b.m20649c(j3);
        }
    }
}
