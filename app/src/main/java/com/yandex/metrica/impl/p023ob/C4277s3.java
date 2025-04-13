package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.billing_interface.C3115a;
import com.yandex.metrica.impl.p023ob.C3874cg;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.s3 */
/* loaded from: classes2.dex */
public class C4277s3 implements InterfaceC3920ea<C4251r3, C3874cg> {

    /* renamed from: a */
    @NonNull
    private final C4329u3 f46341a;

    public C4277s3() {
        this(new C4329u3());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a */
    public C4251r3 mo17817a(@NonNull C3874cg c3874cg) {
        C3874cg c3874cg2 = c3874cg;
        ArrayList arrayList = new ArrayList(c3874cg2.f44874b.length);
        for (C3874cg.a aVar : c3874cg2.f44874b) {
            arrayList.add(this.f46341a.mo17817a(aVar));
        }
        return new C4251r3(arrayList, c3874cg2.f44875c);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: b */
    public C3874cg mo17818b(@NonNull C4251r3 c4251r3) {
        C4251r3 c4251r32 = c4251r3;
        C3874cg c3874cg = new C3874cg();
        c3874cg.f44874b = new C3874cg.a[c4251r32.f46267a.size()];
        Iterator<C3115a> it = c4251r32.f46267a.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            c3874cg.f44874b[i2] = this.f46341a.mo17818b(it.next());
            i2++;
        }
        c3874cg.f44875c = c4251r32.f46268b;
        return c3874cg;
    }

    @VisibleForTesting
    public C4277s3(@NonNull C4329u3 c4329u3) {
        this.f46341a = c4329u3;
    }
}
