package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.identifiers.AdsIdentifiersProvider;
import com.yandex.metrica.impl.p023ob.C3818ac;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.rc */
/* loaded from: classes2.dex */
public class C4260rc implements InterfaceC3870cc {

    /* renamed from: a */
    @NonNull
    private final String f46303a;

    /* renamed from: b */
    @NonNull
    private final C4234qc f46304b;

    public C4260rc(@NonNull String str) {
        this(str, new C4234qc());
    }

    @Nullable
    /* renamed from: b */
    private C3844bc m20654b(@NonNull Context context) throws Throwable {
        int i2 = AdsIdentifiersProvider.f42483a;
        Method method = AdsIdentifiersProvider.class.getMethod("requestIdentifiers", Context.class, Bundle.class);
        Bundle bundle = new Bundle();
        bundle.putString("com.yandex.metrica.identifiers.extra.PROVIDER", this.f46303a);
        C4234qc c4234qc = this.f46304b;
        Object[] objArr = {context, bundle};
        C3818ac c3818ac = null;
        Bundle bundle2 = (Bundle) method.invoke(null, objArr);
        Objects.requireNonNull(c4234qc);
        if (bundle2 == null) {
            return null;
        }
        Bundle bundle3 = bundle2.getBundle("com.yandex.metrica.identifiers.extra.TRACKING_INFO");
        if (bundle3 != null) {
            C3818ac.a aVar = C4208pc.f46134a.get(bundle3.getString("com.yandex.metrica.identifiers.extra.PROVIDER"));
            if (aVar == null) {
                StringBuilder m24u = C0000a.m24u("Provider ");
                m24u.append(bundle3.getString("com.yandex.metrica.identifiers.extra.PROVIDER"));
                m24u.append(" is invalid");
                throw new IllegalArgumentException(m24u.toString().toString());
            }
            c3818ac = new C3818ac(aVar, bundle3.getString("com.yandex.metrica.identifiers.extra.ID"), bundle3.containsKey("com.yandex.metrica.identifiers.extra.LIMITED") ? Boolean.valueOf(bundle3.getBoolean("com.yandex.metrica.identifiers.extra.LIMITED")) : null);
        }
        return new C3844bc(c3818ac, EnumC3911e1.m19778a(bundle2.getString("com.yandex.metrica.identifiers.extra.STATUS")), bundle2.getString("com.yandex.metrica.identifiers.extra.ERROR_MESSAGE"));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3870cc
    @NonNull
    /* renamed from: a */
    public C3844bc mo19674a(@NonNull Context context) {
        return mo19675a(context, new C4130mc());
    }

    @VisibleForTesting
    public C4260rc(@NonNull String str, @NonNull C4234qc c4234qc) {
        this.f46303a = str;
        this.f46304b = c4234qc;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3870cc
    @NonNull
    /* renamed from: a */
    public C3844bc mo19675a(@NonNull Context context, @NonNull InterfaceC4156nc interfaceC4156nc) {
        C3844bc c3844bc;
        interfaceC4156nc.mo20456c();
        C3844bc c3844bc2 = null;
        while (interfaceC4156nc.mo20455b()) {
            try {
                return m20654b(context);
            } catch (InvocationTargetException e2) {
                c3844bc = new C3844bc(null, EnumC3911e1.UNKNOWN, C0000a.m21r(C0000a.m24u("exception while fetching "), this.f46303a, " adv_id: ", e2.getTargetException() != null ? e2.getTargetException().getMessage() : null));
                c3844bc2 = c3844bc;
                try {
                    Thread.sleep(interfaceC4156nc.mo20454a());
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                EnumC3911e1 enumC3911e1 = EnumC3911e1.UNKNOWN;
                StringBuilder m24u = C0000a.m24u("exception while fetching ");
                m24u.append(this.f46303a);
                m24u.append(" adv_id: ");
                m24u.append(th.getMessage());
                c3844bc = new C3844bc(null, enumC3911e1, m24u.toString());
                c3844bc2 = c3844bc;
                Thread.sleep(interfaceC4156nc.mo20454a());
            }
        }
        return c3844bc2 == null ? new C3844bc() : c3844bc2;
    }
}
