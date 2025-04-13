package com.yandex.metrica.impl.p023ob;

import com.yandex.metrica.impl.p023ob.C3196Be;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.Ae */
/* loaded from: classes2.dex */
public final class C3171Ae implements InterfaceC3633T2<C3196Be.a, C3446Le> {

    /* renamed from: a */
    private final boolean f42550a;

    public C3171Ae(@NotNull C3196Be c3196Be) {
        List<C3196Be.a> list = c3196Be.f42624b;
        Intrinsics.m32178g(list, "stateFromDisk.candidates");
        boolean z = false;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C3196Be.a) it.next()).f42627c == EnumC3257E0.APP) {
                    break;
                }
            }
        }
        z = true;
        this.f42550a = z;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3633T2, kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<C3196Be.a> invoke(@NotNull List<? extends C3196Be.a> list, @NotNull C3446Le c3446Le) {
        C3196Be.a aVar = new C3196Be.a(c3446Le.f43331a, c3446Le.f43332b, c3446Le.f43335e);
        boolean z = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C3196Be.a) it.next()).f42627c == c3446Le.f43335e) {
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            return CollectionsKt.m32003P(list, aVar);
        }
        if (aVar.f42627c == EnumC3257E0.APP && this.f42550a) {
            return CollectionsKt.m32003P(list, aVar);
        }
        return null;
    }
}
