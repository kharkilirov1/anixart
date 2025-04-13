package com.yandex.metrica.identifiers;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.yandex.metrica.identifiers.impl.C3137f;
import com.yandex.metrica.identifiers.impl.C3138g;
import com.yandex.metrica.identifiers.impl.C3139h;
import com.yandex.metrica.identifiers.impl.InterfaceC3140i;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

@Keep
/* loaded from: classes2.dex */
public class AdsIdentifiersProvider {

    /* renamed from: a */
    public static final /* synthetic */ int f42483a = 0;
    private static final C3139h retriever = new C3139h(null, 1);

    public static Bundle requestIdentifiers(@NonNull Context context, @NonNull Bundle bundle) {
        C3138g mo17799a;
        String string = bundle.getString("com.yandex.metrica.identifiers.extra.PROVIDER");
        C3139h c3139h = retriever;
        Objects.requireNonNull(c3139h);
        Intrinsics.m32179h(context, "context");
        InterfaceC3140i interfaceC3140i = (InterfaceC3140i) c3139h.f42499a.get(string);
        if (interfaceC3140i == null || (mo17799a = interfaceC3140i.mo17799a(context)) == null) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        C3137f c3137f = mo17799a.f42497b;
        if (c3137f != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("com.yandex.metrica.identifiers.extra.PROVIDER", c3137f.f42493a);
            bundle3.putString("com.yandex.metrica.identifiers.extra.ID", c3137f.f42494b);
            Boolean bool = c3137f.f42495c;
            if (bool != null) {
                bundle3.putBoolean("com.yandex.metrica.identifiers.extra.LIMITED", bool.booleanValue());
            }
            bundle2.putBundle("com.yandex.metrica.identifiers.extra.TRACKING_INFO", bundle3);
        }
        bundle2.putString("com.yandex.metrica.identifiers.extra.STATUS", mo17799a.f42496a.f42503b);
        bundle2.putString("com.yandex.metrica.identifiers.extra.ERROR_MESSAGE", mo17799a.f42498c);
        return bundle2;
    }
}
