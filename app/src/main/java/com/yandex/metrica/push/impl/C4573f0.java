package com.yandex.metrica.push.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.annotation.NonNull;
import com.yandex.metrica.push.InterfaceC4508d;
import com.yandex.metrica.push.common.utils.InternalLogger;
import java.util.Locale;

/* renamed from: com.yandex.metrica.push.impl.f0 */
/* loaded from: classes2.dex */
public class C4573f0 implements InterfaceC4508d {

    /* renamed from: a */
    private final Context f47374a;

    public C4573f0(@NonNull Context context) {
        this.f47374a = context;
    }

    @Override // com.yandex.metrica.push.InterfaceC4508d
    @NonNull
    /* renamed from: a */
    public InterfaceC4508d.a mo21412a(@NonNull C4596r c4596r) {
        C4590o m21655a = c4596r.m21655a();
        if (m21655a == null) {
            return InterfaceC4508d.a.m21413a();
        }
        Context context = this.f47374a;
        PackageInfo packageInfo = null;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable th) {
            InternalLogger.m21369e(th, th.getMessage(), new Object[0]);
        }
        int i2 = packageInfo == null ? -1 : packageInfo.versionCode;
        Integer m21567h = m21655a.m21567h();
        Integer m21565f = m21655a.m21565f();
        return ((m21567h == null || i2 >= m21567h.intValue()) && (m21565f == null || i2 <= m21565f.intValue())) ? InterfaceC4508d.a.m21413a() : InterfaceC4508d.a.m21414a("Wrong app version code", String.format(Locale.US, "Got app version code [%d], allowed min [%d], allowed max [%d]", Integer.valueOf(i2), m21567h, m21565f));
    }
}
