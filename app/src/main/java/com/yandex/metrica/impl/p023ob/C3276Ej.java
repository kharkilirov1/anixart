package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.Ej */
/* loaded from: classes2.dex */
public class C3276Ej {

    /* renamed from: a */
    @NonNull
    private final InterfaceC3226Cj f42825a;

    /* renamed from: b */
    @NonNull
    private final C3829an f42826b;

    /* renamed from: c */
    @NonNull
    private final C3326Gj f42827c;

    /* renamed from: d */
    @NonNull
    private final InterfaceC3251Dj f42828d;

    @VisibleForTesting
    public C3276Ej(@NonNull InterfaceC3226Cj interfaceC3226Cj, @NonNull InterfaceC3251Dj interfaceC3251Dj, @NonNull C3829an c3829an, @NonNull C3326Gj c3326Gj) {
        this.f42825a = interfaceC3226Cj;
        this.f42828d = interfaceC3251Dj;
        this.f42826b = c3829an;
        this.f42827c = c3326Gj;
    }

    @NonNull
    /* renamed from: a */
    public C3963g1 m18014a() {
        String str;
        try {
            this.f42826b.m19590a();
            str = this.f42827c.m18173a();
            try {
                if (TextUtils.isEmpty(str)) {
                    str = this.f42825a.mo17939a();
                    if (!TextUtils.isEmpty(str) || this.f42828d.mo17905a()) {
                        str = this.f42827c.m18174a(str);
                    }
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str = null;
        }
        this.f42826b.m19591b();
        return str == null ? new C3963g1(null, EnumC3911e1.UNKNOWN, "Uuid must be obtained via async API YandexMetricaInternal#requestStartupIdentifiers(@NonNull Context context, @NonNull IIdentifierCallback callback,@NonNull String... identifiers)") : new C3963g1(str, EnumC3911e1.OK, null);
    }
}
