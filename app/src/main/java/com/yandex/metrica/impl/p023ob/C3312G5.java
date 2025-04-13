package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.yandex.metrica.C4482k;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.G5 */
/* loaded from: classes2.dex */
public class C3312G5 extends AbstractC4279s5 {
    public C3312G5(C3940f4 c3940f4) {
        super(c3940f4);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4149n5
    /* renamed from: a */
    public boolean mo17815a(@NonNull C4066k0 c4066k0) {
        String m20213o = c4066k0.m20213o();
        C4482k m20030a = C4013i.m20030a(m20213o);
        String m19877h = m20685a().m19877h();
        C4482k m20030a2 = C4013i.m20030a(m19877h);
        if (!m20030a.equals(m20030a2)) {
            boolean z = false;
            if (TextUtils.isEmpty(m20030a.f47164a) && !TextUtils.isEmpty(m20030a2.f47164a)) {
                c4066k0.mo19070e(m19877h);
                m18127a(c4066k0, EnumC3579Qm.LOGOUT);
            } else {
                if (!TextUtils.isEmpty(m20030a.f47164a) && TextUtils.isEmpty(m20030a2.f47164a)) {
                    m18127a(c4066k0, EnumC3579Qm.LOGIN);
                } else {
                    if (!TextUtils.isEmpty(m20030a.f47164a) && !m20030a.f47164a.equals(m20030a2.f47164a)) {
                        z = true;
                    }
                    if (z) {
                        m18127a(c4066k0, EnumC3579Qm.SWITCH);
                    } else {
                        m18127a(c4066k0, EnumC3579Qm.UPDATE);
                    }
                }
            }
            m20685a().m19868a(m20213o);
        }
        return true;
    }

    /* renamed from: a */
    private void m18127a(C4066k0 c4066k0, EnumC3579Qm enumC3579Qm) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("action", enumC3579Qm.toString());
            str = jSONObject.toString();
        } catch (Throwable unused) {
            str = null;
        }
        c4066k0.mo19071f(str);
        m20685a().m19887r().m20860b(c4066k0);
    }
}
