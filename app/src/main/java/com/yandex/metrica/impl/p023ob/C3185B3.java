package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.billing_interface.C3117c;
import com.yandex.metrica.billing_interface.C3118d;
import com.yandex.metrica.billing_interface.EnumC3119e;
import com.yandex.metrica.impl.p023ob.C3796Zf;
import java.util.Currency;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.B3 */
/* loaded from: classes2.dex */
public class C3185B3 {

    /* renamed from: a */
    @NonNull
    private final C3118d f42611a;

    public C3185B3(@NonNull C3118d c3118d) {
        this.f42611a = c3118d;
    }

    @NonNull
    /* renamed from: a */
    public byte[] m17887a() {
        String str;
        C3118d c3118d = this.f42611a;
        C3796Zf c3796Zf = new C3796Zf();
        c3796Zf.f44650b = c3118d.f42412c;
        c3796Zf.f44656h = c3118d.f42413d;
        try {
            str = Currency.getInstance(c3118d.f42414e).getCurrencyCode();
        } catch (Throwable unused) {
            str = "";
        }
        c3796Zf.f44652d = str.getBytes();
        c3796Zf.f44653e = c3118d.f42411b.getBytes();
        C3796Zf.a aVar = new C3796Zf.a();
        aVar.f44662b = c3118d.f42423n.getBytes();
        aVar.f44663c = c3118d.f42419j.getBytes();
        c3796Zf.f44655g = aVar;
        c3796Zf.f44657i = true;
        c3796Zf.f44658j = 1;
        c3796Zf.f44659k = c3118d.f42410a.ordinal() == 1 ? 2 : 1;
        C3796Zf.c cVar = new C3796Zf.c();
        cVar.f44673b = c3118d.f42420k.getBytes();
        cVar.f44674c = TimeUnit.MILLISECONDS.toSeconds(c3118d.f42421l);
        c3796Zf.f44660l = cVar;
        if (c3118d.f42410a == EnumC3119e.SUBS) {
            C3796Zf.b bVar = new C3796Zf.b();
            bVar.f44664b = c3118d.f42422m;
            C3117c c3117c = c3118d.f42418i;
            if (c3117c != null) {
                bVar.f44665c = m17886a(c3117c);
            }
            C3796Zf.b.a aVar2 = new C3796Zf.b.a();
            aVar2.f44667b = c3118d.f42415f;
            C3117c c3117c2 = c3118d.f42416g;
            if (c3117c2 != null) {
                aVar2.f44668c = m17886a(c3117c2);
            }
            aVar2.f44669d = c3118d.f42417h;
            bVar.f44666d = aVar2;
            c3796Zf.f44661m = bVar;
        }
        return AbstractC3909e.m19777a(c3796Zf);
    }

    @NonNull
    /* renamed from: a */
    private C3796Zf.b.C7000b m17886a(@NonNull C3117c c3117c) {
        C3796Zf.b.C7000b c7000b = new C3796Zf.b.C7000b();
        c7000b.f44671b = c3117c.f42402a;
        int ordinal = c3117c.f42403b.ordinal();
        int i2 = 4;
        if (ordinal == 1) {
            i2 = 1;
        } else if (ordinal == 2) {
            i2 = 2;
        } else if (ordinal == 3) {
            i2 = 3;
        } else if (ordinal != 4) {
            i2 = 0;
        }
        c7000b.f44672c = i2;
        return c7000b;
    }
}
