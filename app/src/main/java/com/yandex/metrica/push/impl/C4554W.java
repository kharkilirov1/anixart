package com.yandex.metrica.push.impl;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationManagerCompat;
import com.yandex.metrica.push.InterfaceC4508d;

/* renamed from: com.yandex.metrica.push.impl.W */
/* loaded from: classes2.dex */
class C4554W implements InterfaceC4508d {

    /* renamed from: a */
    @NonNull
    private final NotificationManager f47321a;

    /* renamed from: b */
    @NonNull
    private final NotificationManagerCompat f47322b;

    public C4554W(@NonNull Context context) {
        this((NotificationManager) context.getSystemService("notification"), new NotificationManagerCompat(context));
    }

    @Override // com.yandex.metrica.push.InterfaceC4508d
    @NonNull
    /* renamed from: a */
    public InterfaceC4508d.a mo21412a(@NonNull C4596r c4596r) {
        C4598s m21658c = c4596r.m21658c();
        String m21684d = m21658c == null ? null : m21658c.m21684d();
        if (TextUtils.isEmpty(m21684d)) {
            m21684d = "yandex_metrica_push_v2";
        }
        if (!this.f47322b.m1627a()) {
            return InterfaceC4508d.a.m21414a("Disabled system notification", "Disabled all notifications");
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            if (C4520E0.m21431b(this.f47321a, m21684d) == 0) {
                return InterfaceC4508d.a.m21414a("Disabled system notification", String.format("Disabled notifications for \"%s\" channel", m21684d));
            }
            if (i2 >= 28 && C4522F0.m21434a(this.f47321a, m21684d)) {
                return InterfaceC4508d.a.m21414a("Disabled system notification", String.format("Disabled notifications for \"%s\" group", C4520E0.m21427a(this.f47321a, m21684d)));
            }
        }
        return InterfaceC4508d.a.m21413a();
    }

    @VisibleForTesting
    public C4554W(@NonNull NotificationManager notificationManager, @NonNull NotificationManagerCompat notificationManagerCompat) {
        this.f47321a = notificationManager;
        this.f47322b = notificationManagerCompat;
    }
}
