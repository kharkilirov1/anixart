package com.yandex.metrica.push.impl;

import androidx.annotation.NonNull;
import com.yandex.metrica.push.InterfaceC4508d;
import com.yandex.metrica.push.common.utils.InternalLogger;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.push.impl.d0 */
/* loaded from: classes2.dex */
class C4569d0 implements InterfaceC4508d {

    /* renamed from: a */
    @NonNull
    private final C4568d f47370a;

    public C4569d0(@NonNull C4568d c4568d) {
        this.f47370a = c4568d;
    }

    @Override // com.yandex.metrica.push.InterfaceC4508d
    @NonNull
    /* renamed from: a */
    public InterfaceC4508d.a mo21412a(@NonNull C4596r c4596r) {
        long longValue;
        C4590o m21655a = c4596r.m21655a();
        Integer m21568i = m21655a == null ? null : m21655a.m21568i();
        if (m21568i == null) {
            return InterfaceC4508d.a.m21413a();
        }
        C4598s m21658c = c4596r.m21658c();
        List<Long> m21530a = this.f47370a.m21530a(m21658c != null ? m21658c.m21684d() : null);
        if (m21530a.isEmpty()) {
            longValue = 0;
        } else {
            LinkedList linkedList = (LinkedList) m21530a;
            longValue = ((Long) linkedList.get(linkedList.size() - 1)).longValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (longValue > currentTimeMillis) {
            InternalLogger.m21371w("%s Last push was shown in future", "[SinglePushPerPeriodFilter]");
            return InterfaceC4508d.a.m21413a();
        }
        long j2 = currentTimeMillis - longValue;
        return j2 < TimeUnit.MINUTES.toMillis((long) m21568i.intValue()) ? InterfaceC4508d.a.m21414a("Already have shown push in this period", String.format(Locale.US, "Previous push was shown [%d] minutes ago, min period is [%d]", Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j2)), m21568i)) : InterfaceC4508d.a.m21413a();
    }
}
