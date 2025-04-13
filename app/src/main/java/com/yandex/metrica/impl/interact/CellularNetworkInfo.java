package com.yandex.metrica.impl.interact;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.metrica.impl.p023ob.C3177Ak;
import com.yandex.metrica.impl.p023ob.C3700Vj;
import com.yandex.metrica.impl.p023ob.C3755Y;
import com.yandex.metrica.impl.p023ob.C4450yk;
import com.yandex.metrica.impl.p023ob.InterfaceC3202Bk;
import java.util.HashMap;
import java.util.Map;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class CellularNetworkInfo {

    /* renamed from: a */
    public String f42512a = "";

    /* renamed from: com.yandex.metrica.impl.interact.CellularNetworkInfo$a */
    public class C3155a implements InterfaceC3202Bk {
        public C3155a() {
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3202Bk
        /* renamed from: a */
        public void mo17805a(C3177Ak c3177Ak) {
            C3700Vj m17840b = c3177Ak.m17840b();
            if (m17840b != null) {
                String m19308m = m17840b.m19308m();
                String m19309n = m17840b.m19309n();
                Integer m19307l = m17840b.m19307l();
                Integer m19306k = m17840b.m19306k();
                Integer m19297b = m17840b.m19297b();
                Integer m19300e = m17840b.m19300e();
                Integer m19311p = m17840b.m19311p();
                HashMap hashMap = new HashMap();
                hashMap.put("network_type", m19308m);
                hashMap.put("operator_name", m19309n);
                hashMap.put("country_code", m19306k != null ? String.valueOf(m19306k) : null);
                hashMap.put("operator_id", m19307l != null ? String.valueOf(m19307l) : null);
                hashMap.put("cell_id", m19297b != null ? String.valueOf(m19297b) : null);
                hashMap.put("lac", m19300e != null ? String.valueOf(m19300e) : null);
                hashMap.put("signal_strength", m19311p != null ? String.valueOf(m19311p) : null);
                StringBuilder sb = new StringBuilder();
                String str = "";
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getValue();
                    if (!TextUtils.isEmpty(str2)) {
                        sb.append(str);
                        C0000a.m1B(sb, (String) entry.getKey(), "=", str2);
                        str = "&";
                    }
                }
                CellularNetworkInfo.this.f42512a = sb.toString();
            }
        }
    }

    public CellularNetworkInfo(Context context) {
        new C4450yk(context, C3755Y.m19410g().m19414d().m20607b()).mo19050a(new C3155a());
    }

    public String getCelluralInfo() {
        return this.f42512a;
    }
}
