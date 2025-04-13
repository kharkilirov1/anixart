package com.yandex.metrica.push.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import com.yandex.metrica.push.InterfaceC4508d;
import com.yandex.metrica.push.impl.C4590o;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.push.impl.U */
/* loaded from: classes2.dex */
class C4550U implements InterfaceC4508d {

    /* renamed from: b */
    private static final long f47312b = TimeUnit.DAYS.toSeconds(1);

    /* renamed from: a */
    @NonNull
    private final C4562a f47313a;

    public C4550U(@NonNull C4562a c4562a) {
        this.f47313a = c4562a;
    }

    @Override // com.yandex.metrica.push.InterfaceC4508d
    @NonNull
    /* renamed from: a */
    public InterfaceC4508d.a mo21412a(@NonNull C4596r c4596r) {
        C4590o m21655a = c4596r.m21655a();
        C4590o.a m21561b = m21655a == null ? null : m21655a.m21561b();
        List<Location> m21571a = m21561b == null ? null : m21561b.m21571a();
        if (m21571a == null || m21571a.isEmpty()) {
            return InterfaceC4508d.a.m21413a();
        }
        this.f47313a.m21490a();
        return InterfaceC4508d.a.m21414a("Not found location provider", null);
    }
}
