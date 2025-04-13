package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3447Lf;
import java.util.EnumMap;

/* renamed from: com.yandex.metrica.impl.ob.x7 */
/* loaded from: classes2.dex */
public class C4411x7 implements InterfaceC3920ea<C3439L7, C3447Lf> {

    /* renamed from: a */
    private static final EnumMap<EnumC3514O7, Integer> f46927a;

    static {
        EnumMap<EnumC3514O7, Integer> enumMap = new EnumMap<>((Class<EnumC3514O7>) EnumC3514O7.class);
        f46927a = enumMap;
        enumMap.put((EnumMap<EnumC3514O7, Integer>) EnumC3514O7.UNKNOWN, (EnumC3514O7) 0);
        enumMap.put((EnumMap<EnumC3514O7, Integer>) EnumC3514O7.BREAKPAD, (EnumC3514O7) 2);
        enumMap.put((EnumMap<EnumC3514O7, Integer>) EnumC3514O7.CRASHPAD, (EnumC3514O7) 3);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a */
    public C3439L7 mo17817a(@NonNull C3447Lf c3447Lf) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3447Lf mo17818b(@NonNull C3439L7 c3439l7) {
        C3447Lf c3447Lf = new C3447Lf();
        c3447Lf.f43343g = 1;
        C3447Lf.a aVar = new C3447Lf.a();
        c3447Lf.f43344h = aVar;
        aVar.f43348b = c3439l7.m18479a();
        C3414K7 m18480b = c3439l7.m18480b();
        c3447Lf.f43344h.f43349c = new C3497Nf();
        Integer num = f46927a.get(m18480b.m18438b());
        if (num != null) {
            c3447Lf.f43344h.f43349c.f43471b = num.intValue();
        }
        C3497Nf c3497Nf = c3447Lf.f43344h.f43349c;
        String m18437a = m18480b.m18437a();
        if (m18437a == null) {
            m18437a = "";
        }
        c3497Nf.f43472c = m18437a;
        return c3447Lf;
    }
}
