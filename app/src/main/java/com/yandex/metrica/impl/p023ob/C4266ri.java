package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3535P3;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ri */
/* loaded from: classes2.dex */
public class C4266ri {
    /* renamed from: a */
    public boolean m20665a(@Nullable Map<String, String> map, @NonNull C3575Qi c3575Qi, @NonNull C3556Q c3556q) {
        Map<String, String> m18729b = c3556q.m17846a(new C3535P3.a(map, EnumC3257E0.APP)).m18729b();
        if (C3658U2.m19218b(m18729b)) {
            return true;
        }
        return m18729b.equals(C4452ym.m21241a(c3575Qi.m18864v()));
    }
}
