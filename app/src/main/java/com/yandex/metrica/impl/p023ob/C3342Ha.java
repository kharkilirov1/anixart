package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3699Vi;
import com.yandex.metrica.impl.p023ob.C4082kg;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Ha */
/* loaded from: classes2.dex */
public class C3342Ha implements InterfaceC3920ea<C3699Vi, C4082kg.s> {

    /* renamed from: a */
    private static final EnumMap<C3699Vi.b, String> f43046a;

    /* renamed from: b */
    private static final Map<String, C3699Vi.b> f43047b;

    static {
        EnumMap<C3699Vi.b, String> enumMap = new EnumMap<>((Class<C3699Vi.b>) C3699Vi.b.class);
        f43046a = enumMap;
        HashMap hashMap = new HashMap();
        f43047b = hashMap;
        C3699Vi.b bVar = C3699Vi.b.WIFI;
        enumMap.put((EnumMap<C3699Vi.b, String>) bVar, (C3699Vi.b) "wifi");
        C3699Vi.b bVar2 = C3699Vi.b.CELL;
        enumMap.put((EnumMap<C3699Vi.b, String>) bVar2, (C3699Vi.b) "cell");
        hashMap.put("wifi", bVar);
        hashMap.put("cell", bVar2);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4082kg.s mo17818b(@NonNull C3699Vi c3699Vi) {
        C4082kg.s sVar = new C4082kg.s();
        if (c3699Vi.f44314a != null) {
            C4082kg.t tVar = new C4082kg.t();
            sVar.f45781b = tVar;
            C3699Vi.a aVar = c3699Vi.f44314a;
            tVar.f45783b = aVar.f44316a;
            tVar.f45784c = aVar.f44317b;
        }
        if (c3699Vi.f44315b != null) {
            C4082kg.t tVar2 = new C4082kg.t();
            sVar.f45782c = tVar2;
            C3699Vi.a aVar2 = c3699Vi.f44315b;
            tVar2.f45783b = aVar2.f44316a;
            tVar2.f45784c = aVar2.f44317b;
        }
        return sVar;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C3699Vi mo17817a(@NonNull C4082kg.s sVar) {
        C4082kg.t tVar = sVar.f45781b;
        C3699Vi.a aVar = tVar != null ? new C3699Vi.a(tVar.f45783b, tVar.f45784c) : null;
        C4082kg.t tVar2 = sVar.f45782c;
        return new C3699Vi(aVar, tVar2 != null ? new C3699Vi.a(tVar2.f45783b, tVar2.f45784c) : null);
    }
}
