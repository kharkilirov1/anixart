package com.yandex.metrica.impl.p023ob;

import com.yandex.metrica.impl.p023ob.C3535P3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.L3 */
/* loaded from: classes2.dex */
public final class C3435L3 implements InterfaceC3633T2<C3535P3.a, C3535P3.a> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3633T2, kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<C3535P3.a> invoke(@NotNull List<C3535P3.a> list, @NotNull C3535P3.a aVar) {
        boolean z;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C3535P3.a) it.next()).mo18022a() == aVar.mo18022a()) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            return CollectionsKt.m32003P(list, aVar);
        }
        if (aVar.mo18022a() != EnumC3257E0.APP) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(((C3535P3.a) obj).mo18022a() == EnumC3257E0.APP)) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.m32003P(arrayList, aVar);
    }
}
