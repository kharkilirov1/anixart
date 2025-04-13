package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C4083kh;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.Fi */
/* loaded from: classes2.dex */
public class C3300Fi {

    /* renamed from: a */
    private final C3803Zm<String, InterfaceC3450Li> f42918a = new C3803Zm<>();

    /* renamed from: b */
    private final HashMap<String, C3624Si> f42919b = new HashMap<>();

    /* renamed from: c */
    private C3575Qi f42920c = null;

    /* renamed from: d */
    private final InterfaceC3550Pi f42921d = new a();

    /* renamed from: com.yandex.metrica.impl.ob.Fi$a */
    public class a implements InterfaceC3550Pi {
        public a() {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Fi$b */
    public static final class b {

        /* renamed from: a */
        public static final C3300Fi f42923a = new C3300Fi();
    }

    /* renamed from: a */
    public static final C3300Fi m18104a() {
        return b.f42923a;
    }

    /* renamed from: a */
    public C3624Si m18108a(@NonNull Context context, @NonNull C3862c4 c3862c4, @NonNull C4083kh.b bVar) {
        C3624Si c3624Si = this.f42919b.get(c3862c4.m19669b());
        boolean z = true;
        if (c3624Si == null) {
            synchronized (this.f42919b) {
                c3624Si = this.f42919b.get(c3862c4.m19669b());
                if (c3624Si == null) {
                    C3624Si c3624Si2 = new C3624Si(context, c3862c4.m19669b(), bVar, this.f42921d);
                    this.f42919b.put(c3862c4.m19669b(), c3624Si2);
                    c3624Si = c3624Si2;
                    z = false;
                }
            }
        }
        if (z) {
            c3624Si.m19099a(bVar);
        }
        return c3624Si;
    }

    /* renamed from: a */
    public void m18109a(@NonNull C3862c4 c3862c4, @NonNull InterfaceC3450Li interfaceC3450Li) {
        synchronized (this.f42919b) {
            this.f42918a.m19535a(c3862c4.m19669b(), interfaceC3450Li);
            C3575Qi c3575Qi = this.f42920c;
            if (c3575Qi != null) {
                interfaceC3450Li.mo18513a(c3575Qi);
            }
        }
    }
}
