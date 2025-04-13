package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3848bg;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.X9 */
/* loaded from: classes2.dex */
public class C3740X9 implements InterfaceC3920ea<C3820ae, C3848bg> {

    /* renamed from: a */
    @NonNull
    private final C3816aa f44473a;

    public C3740X9() {
        this(new C3816aa());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a */
    public C3820ae mo17817a(@NonNull C3848bg c3848bg) {
        C3848bg c3848bg2 = c3848bg;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            C3848bg.b[] bVarArr = c3848bg2.f44830b;
            if (i3 >= bVarArr.length) {
                break;
            }
            C3848bg.b bVar = bVarArr[i3];
            arrayList.add(new C4028ie(bVar.f44836b, bVar.f44837c));
            i3++;
        }
        C3848bg.a aVar = c3848bg2.f44831c;
        C3331H mo17817a = aVar != null ? this.f44473a.mo17817a(aVar) : null;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            String[] strArr = c3848bg2.f44832d;
            if (i2 >= strArr.length) {
                return new C3820ae(arrayList, mo17817a, arrayList2);
            }
            arrayList2.add(strArr[i2]);
            i2++;
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: b */
    public C3848bg mo17818b(@NonNull C3820ae c3820ae) {
        C3820ae c3820ae2 = c3820ae;
        C3848bg c3848bg = new C3848bg();
        c3848bg.f44830b = new C3848bg.b[c3820ae2.f44741a.size()];
        int i2 = 0;
        int i3 = 0;
        for (C4028ie c4028ie : c3820ae2.f44741a) {
            C3848bg.b[] bVarArr = c3848bg.f44830b;
            C3848bg.b bVar = new C3848bg.b();
            bVar.f44836b = c4028ie.f45340a;
            bVar.f44837c = c4028ie.f45341b;
            bVarArr[i3] = bVar;
            i3++;
        }
        C3331H c3331h = c3820ae2.f44742b;
        if (c3331h != null) {
            c3848bg.f44831c = this.f44473a.mo17818b(c3331h);
        }
        c3848bg.f44832d = new String[c3820ae2.f44743c.size()];
        Iterator<String> it = c3820ae2.f44743c.iterator();
        while (it.hasNext()) {
            c3848bg.f44832d[i2] = it.next();
            i2++;
        }
        return c3848bg;
    }

    @VisibleForTesting
    public C3740X9(@NonNull C3816aa c3816aa) {
        this.f44473a = c3816aa;
    }
}
