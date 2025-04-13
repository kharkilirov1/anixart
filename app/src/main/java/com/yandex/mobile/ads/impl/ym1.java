package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jm1;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ym1 extends am1 {
    public ym1(jm1.InterfaceC5294b interfaceC5294b, HashSet<String> hashSet, JSONObject jSONObject, long j2) {
        super(interfaceC5294b, hashSet, jSONObject, j2);
    }

    @Override // com.yandex.mobile.ads.impl.jm1, android.os.AsyncTask
    /* renamed from: a */
    public final void onPostExecute(String str) {
        ul1 m29042a = ul1.m29042a();
        if (m29042a != null) {
            for (tl1 tl1Var : m29042a.m29044b()) {
                if (this.f48605c.contains(tl1Var.m28681h())) {
                    tl1Var.m28682i().m28893b(str, this.f48607e);
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final String doInBackground(Object[] objArr) {
        return this.f48606d.toString();
    }
}
