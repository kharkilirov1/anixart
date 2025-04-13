package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5169h7;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.p7 */
/* loaded from: classes3.dex */
public final class C5568p7 implements InterfaceC5662qz {

    /* renamed from: a */
    @NonNull
    private final List<InterfaceC5428m7> f53398a = m27177a();

    /* renamed from: b */
    @Nullable
    private InterfaceC5676r7 f53399b;

    /* renamed from: com.yandex.mobile.ads.impl.p7$a */
    public class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C5568p7.m27178b(C5568p7.this);
        }

        public /* synthetic */ a(C5568p7 c5568p7, int i2) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.p7$b */
    public class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C5568p7.this.f53399b != null) {
                C5169h7.m25071c(C5169h7.this);
            }
        }

        public /* synthetic */ b(C5568p7 c5568p7, int i2) {
            this();
        }
    }

    /* renamed from: b */
    public static void m27178b(C5568p7 c5568p7) {
        InterfaceC5880ur interfaceC5880ur;
        InterfaceC5676r7 interfaceC5676r7 = c5568p7.f53399b;
        if (interfaceC5676r7 != null) {
            C5169h7.a aVar = (C5169h7.a) interfaceC5676r7;
            interfaceC5880ur = C5169h7.this.f50860d;
            interfaceC5880ur.mo26794a();
            C5169h7.this.f50858b.dismiss();
        }
    }

    /* renamed from: a */
    public final void m27181a(@NonNull String str) {
        InterfaceC5880ur interfaceC5880ur;
        mo0 mo0Var;
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            for (InterfaceC5428m7 interfaceC5428m7 : this.f53398a) {
                if (interfaceC5428m7.mo26584a(scheme, host)) {
                    interfaceC5428m7.mo26583a();
                    return;
                }
            }
            InterfaceC5676r7 interfaceC5676r7 = this.f53399b;
            if (interfaceC5676r7 != null) {
                mo0Var = C5169h7.this.f50861e;
                mo0Var.mo23301a(str);
            }
        } catch (URISyntaxException unused) {
            n60.m26813f(um1.m29049a("Invalid URL: ", str), new Object[0]);
            InterfaceC5676r7 interfaceC5676r72 = this.f53399b;
            if (interfaceC5676r72 != null) {
                C5169h7.a aVar = (C5169h7.a) interfaceC5676r72;
                interfaceC5880ur = C5169h7.this.f50860d;
                interfaceC5880ur.mo26794a();
                C5169h7.this.f50858b.dismiss();
            }
        }
    }

    /* renamed from: a */
    public final void m27180a(@NonNull InterfaceC5676r7 interfaceC5676r7) {
        this.f53399b = interfaceC5676r7;
    }

    /* renamed from: a */
    public final void m27179a(int i2) {
        InterfaceC5676r7 interfaceC5676r7;
        InterfaceC5880ur interfaceC5880ur;
        if (!new C5623q7().m27648a(i2) || (interfaceC5676r7 = this.f53399b) == null) {
            return;
        }
        C5169h7.a aVar = (C5169h7.a) interfaceC5676r7;
        interfaceC5880ur = C5169h7.this.f50860d;
        interfaceC5880ur.mo26794a();
        C5169h7.this.f50858b.dismiss();
    }

    @NonNull
    /* renamed from: a */
    private List<InterfaceC5428m7> m27177a() {
        int i2 = 0;
        return Arrays.asList(new C5729s7("adtuneRendered", new b(this, i2)), new C5729s7("adtuneClosed", new a(this, i2)));
    }
}
