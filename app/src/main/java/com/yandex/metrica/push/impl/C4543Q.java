package com.yandex.metrica.push.impl;

import android.os.Build;
import androidx.annotation.NonNull;
import com.yandex.metrica.push.InterfaceC4508d;
import java.util.Locale;

/* renamed from: com.yandex.metrica.push.impl.Q */
/* loaded from: classes2.dex */
public class C4543Q implements InterfaceC4508d {
    @Override // com.yandex.metrica.push.InterfaceC4508d
    @NonNull
    /* renamed from: a */
    public InterfaceC4508d.a mo21412a(@NonNull C4596r c4596r) {
        C4590o m21655a = c4596r.m21655a();
        if (m21655a == null) {
            return InterfaceC4508d.a.m21413a();
        }
        int i2 = Build.VERSION.SDK_INT;
        Integer m21566g = m21655a.m21566g();
        Integer m21563d = m21655a.m21563d();
        return ((m21566g == null || i2 >= m21566g.intValue()) && (m21563d == null || i2 <= m21563d.intValue())) ? InterfaceC4508d.a.m21413a() : InterfaceC4508d.a.m21414a("Wrong android os version", String.format(Locale.US, "Got android os level [%d], allowed min [%d], allowed max [%d]", Integer.valueOf(i2), m21566g, m21563d));
    }
}
