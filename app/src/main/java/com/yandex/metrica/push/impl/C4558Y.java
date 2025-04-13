package com.yandex.metrica.push.impl;

import androidx.annotation.NonNull;
import com.yandex.metrica.push.InterfaceC4508d;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.yandex.metrica.push.impl.Y */
/* loaded from: classes2.dex */
class C4558Y implements InterfaceC4508d {

    /* renamed from: a */
    @NonNull
    private final C4568d f47329a;

    public C4558Y(@NonNull C4568d c4568d) {
        this.f47329a = c4568d;
    }

    @Override // com.yandex.metrica.push.InterfaceC4508d
    @NonNull
    /* renamed from: a */
    public InterfaceC4508d.a mo21412a(@NonNull C4596r c4596r) {
        C4590o m21655a = c4596r.m21655a();
        Integer m21564e = m21655a == null ? null : m21655a.m21564e();
        if (m21564e == null) {
            return InterfaceC4508d.a.m21413a();
        }
        C4598s m21658c = c4596r.m21658c();
        List<Long> m21530a = this.f47329a.m21530a(m21658c != null ? m21658c.m21684d() : null);
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        Iterator<Long> it = m21530a.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            calendar.setTimeInMillis(it.next().longValue());
            if ((calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) && (i2 = i2 + 1) >= m21564e.intValue()) {
                return InterfaceC4508d.a.m21414a("Reached max per day pushes for current topic", String.format(Locale.US, "Was shown [%d], max allowed [%d]", Integer.valueOf(i2), m21564e));
            }
        }
        return InterfaceC4508d.a.m21413a();
    }
}
