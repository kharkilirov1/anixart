package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3256E;
import com.yandex.metrica.impl.p023ob.C3456M;
import com.yandex.metrica.impl.p023ob.C4082kg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.ta */
/* loaded from: classes2.dex */
public class C4310ta implements InterfaceC3920ea {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4082kg.k.b mo17818b(@NonNull C4027id c4027id) {
        C4082kg.k.b bVar = new C4082kg.k.b();
        bVar.f45748b = new int[c4027id.f45338a.size()];
        Iterator<C3456M.b.a> it = c4027id.f45338a.iterator();
        int i2 = 0;
        while (true) {
            int i3 = 3;
            if (!it.hasNext()) {
                break;
            }
            C3456M.b.a next = it.next();
            int[] iArr = bVar.f45748b;
            int ordinal = next.ordinal();
            if (ordinal == 1) {
                i3 = 0;
            } else if (ordinal == 2) {
                i3 = 1;
            } else if (ordinal == 3) {
                i3 = 2;
            } else if (ordinal != 4) {
                i3 = 4;
            }
            iArr[i2] = i3;
            i2++;
        }
        bVar.f45749c = new int[c4027id.f45339b.size()];
        int i4 = 0;
        for (C3256E.a aVar : c4027id.f45339b) {
            int[] iArr2 = bVar.f45749c;
            int ordinal2 = aVar.ordinal();
            iArr2[i4] = ordinal2 != 1 ? ordinal2 != 2 ? 3 : 2 : 0;
            i4++;
        }
        return bVar;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4027id mo17817a(@NonNull C4082kg.k.b bVar) {
        C3456M.b.a aVar;
        C3256E.a aVar2;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        if (bVar.f45748b.length != 0) {
            int i3 = 0;
            while (true) {
                int[] iArr = bVar.f45748b;
                if (i3 >= iArr.length) {
                    break;
                }
                int i4 = iArr[i3];
                if (i4 == 0) {
                    aVar = C3456M.b.a.NONE;
                } else if (i4 == 1) {
                    aVar = C3456M.b.a.USB;
                } else if (i4 == 2) {
                    aVar = C3456M.b.a.WIRELESS;
                } else if (i4 != 3) {
                    aVar = C3456M.b.a.UNKNOWN;
                } else {
                    aVar = C3456M.b.a.AC;
                }
                arrayList.add(aVar);
                i3++;
            }
        } else {
            arrayList.addAll(Arrays.asList(C3456M.b.a.values()));
        }
        ArrayList arrayList2 = new ArrayList();
        if (bVar.f45749c.length != 0) {
            while (true) {
                int[] iArr2 = bVar.f45749c;
                if (i2 >= iArr2.length) {
                    break;
                }
                int i5 = iArr2[i2];
                if (i5 == 0) {
                    aVar2 = C3256E.a.BACKGROUND;
                } else if (i5 != 2) {
                    aVar2 = C3256E.a.UNKNOWN;
                } else {
                    aVar2 = C3256E.a.VISIBLE;
                }
                arrayList2.add(aVar2);
                i2++;
            }
        } else {
            arrayList2.addAll(Arrays.asList(C3256E.a.values()));
        }
        return new C4027id(arrayList, arrayList2);
    }
}
