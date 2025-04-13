package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.vl1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mm1 implements vl1 {

    /* renamed from: a */
    private final vl1 f52709a;

    public mm1(rm1 rm1Var) {
        this.f52709a = rm1Var;
    }

    @Override // com.yandex.mobile.ads.impl.vl1
    /* renamed from: a */
    public final JSONObject mo26692a(View view) {
        return gm1.m24943a(0, 0, 0, 0);
    }

    @Override // com.yandex.mobile.ads.impl.vl1
    /* renamed from: a */
    public final void mo26693a(View view, JSONObject jSONObject, vl1.InterfaceC5926a interfaceC5926a, boolean z, boolean z2) {
        View rootView;
        ArrayList arrayList = new ArrayList();
        ul1 m29042a = ul1.m29042a();
        if (m29042a != null) {
            Collection<tl1> m29046c = m29042a.m29046c();
            IdentityHashMap identityHashMap = new IdentityHashMap((m29046c.size() * 2) + 3);
            Iterator<tl1> it = m29046c.iterator();
            while (it.hasNext()) {
                View m28678e = it.next().m28678e();
                if (m28678e != null && an1.m22556b(m28678e) && (rootView = m28678e.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float m22555a = an1.m22555a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && an1.m22555a((View) arrayList.get(size - 1)) > m22555a) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((x71) interfaceC5926a).m29695a((View) it2.next(), this.f52709a, jSONObject, z2);
        }
    }
}
