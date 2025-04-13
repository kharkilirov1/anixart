package com.yandex.metrica.push.impl;

import android.app.NotificationManager;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.common.utils.CoreUtils;
import com.yandex.metrica.push.impl.C4568d;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.yandex.metrica.push.impl.H */
/* loaded from: classes2.dex */
public class C4525H implements InterfaceC4523G {
    @Override // com.yandex.metrica.push.impl.InterfaceC4523G
    /* renamed from: a */
    public void mo21433a(@NonNull Context context, @NonNull C4596r c4596r) {
        C4568d.a aVar;
        if (CoreUtils.isEmpty(c4596r.m21659d())) {
            return;
        }
        C4568d m21501g = C4562a.m21488a(context).m21501g();
        String m21661f = c4596r.m21661f();
        if (m21661f != null) {
            Iterator<C4568d.a> it = m21501g.m21536c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                } else {
                    aVar = it.next();
                    if (aVar.f47366a.equals(m21661f)) {
                        break;
                    }
                }
            }
            if (aVar != null) {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    if (C4530J0.m21447a(23) ? !C4538N0.m21462a(notificationManager, aVar.f47368c, aVar.f47367b.intValue()) : false) {
                        m21435a(c4596r, "Notification not found", "Removed by user");
                    } else {
                        notificationManager.cancel(aVar.f47368c, aVar.f47367b.intValue());
                    }
                    m21435a(c4596r, "Ok", null);
                    C4562a.m21488a(context).m21501g().m21533a(aVar.f47366a, false);
                    return;
                }
                return;
            }
        }
        if (((LinkedList) m21501g.m21534b()).contains(m21661f)) {
            m21435a(c4596r, "Notification not found", "Notification was replaced");
        } else {
            m21435a(c4596r, "Notification not found", null);
        }
    }

    /* renamed from: a */
    private void m21435a(@NonNull C4596r c4596r, @NonNull String str, @Nullable String str2) {
        C4603u0.m21732a().mo21641a(c4596r.m21659d(), str, str2, c4596r.m21660e(), c4596r.m21664i());
    }
}
