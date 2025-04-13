package com.yandex.metrica.push.impl;

import androidx.annotation.NonNull;
import com.yandex.metrica.push.InterfaceC4508d;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.yandex.metrica.push.impl.e0 */
/* loaded from: classes2.dex */
public class C4571e0 implements InterfaceC4508d {
    @Override // com.yandex.metrica.push.InterfaceC4508d
    @NonNull
    /* renamed from: a */
    public InterfaceC4508d.a mo21412a(@NonNull C4596r c4596r) {
        Long m21662g = c4596r.m21662g();
        Long m21675E = c4596r.m21658c() == null ? null : c4596r.m21658c().m21675E();
        long currentTimeMillis = System.currentTimeMillis();
        return (m21662g == null || m21662g.longValue() >= currentTimeMillis) ? (m21675E == null || m21675E.longValue() >= currentTimeMillis) ? InterfaceC4508d.a.m21413a() : InterfaceC4508d.a.m21414a("Time to live is up", String.format(Locale.US, "Cur time: %s. Time to hide: %s", m21540a(currentTimeMillis), m21540a(m21675E.longValue()))) : InterfaceC4508d.a.m21414a("Time to live is up", String.format(Locale.US, "Cur time: %s. Time to show: %s", m21540a(currentTimeMillis), m21540a(m21662g.longValue())));
    }

    @NonNull
    /* renamed from: a */
    private String m21540a(long j2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date(j2));
    }
}
