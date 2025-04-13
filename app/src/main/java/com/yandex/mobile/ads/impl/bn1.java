package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.yandex.mobile.ads.impl.jm1;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bn1 extends am1 {
    public bn1(jm1.InterfaceC5294b interfaceC5294b, HashSet<String> hashSet, JSONObject jSONObject, long j2) {
        super(interfaceC5294b, hashSet, jSONObject, j2);
    }

    @Override // com.yandex.mobile.ads.impl.jm1, android.os.AsyncTask
    /* renamed from: a */
    public final void onPostExecute(String str) {
        ul1 m29042a;
        if (!TextUtils.isEmpty(str) && (m29042a = ul1.m29042a()) != null) {
            for (tl1 tl1Var : m29042a.m29044b()) {
                if (this.f48605c.contains(tl1Var.m28681h())) {
                    tl1Var.m28682i().m28891a(str, this.f48607e);
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final String doInBackground(Object[] objArr) {
        if (gm1.m24947a(this.f48606d, ((im1) this.f51653b).m25571b())) {
            return null;
        }
        ((im1) this.f51653b).m25569a(this.f48606d);
        return this.f48606d.toString();
    }
}
