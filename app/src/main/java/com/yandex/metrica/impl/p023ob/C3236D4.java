package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.D4 */
/* loaded from: classes2.dex */
public class C3236D4 {

    /* renamed from: a */
    private final Object f42689a;

    /* renamed from: b */
    private final C3386J4 f42690b;

    /* renamed from: c */
    private final HashMap<C3211C4, InterfaceC3261E4> f42691c;

    /* renamed from: d */
    private final C3803Zm<a, C3211C4> f42692d;

    /* renamed from: e */
    @NonNull
    private final Context f42693e;

    /* renamed from: f */
    private volatile int f42694f;

    /* renamed from: g */
    @NonNull
    private final C3311G4 f42695g;

    /* renamed from: com.yandex.metrica.impl.ob.D4$a */
    public static final class a {

        /* renamed from: a */
        @NonNull
        private final String f42696a;

        /* renamed from: b */
        @Nullable
        private final Integer f42697b;

        /* renamed from: c */
        @Nullable
        private final String f42698c;

        public a(@NonNull String str, @Nullable Integer num, @Nullable String str2) {
            this.f42696a = str;
            this.f42697b = num;
            this.f42698c = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f42696a.equals(aVar.f42696a)) {
                return false;
            }
            Integer num = this.f42697b;
            if (num == null ? aVar.f42697b != null : !num.equals(aVar.f42697b)) {
                return false;
            }
            String str = this.f42698c;
            String str2 = aVar.f42698c;
            return str != null ? str.equals(str2) : str2 == null;
        }

        public int hashCode() {
            int hashCode = this.f42696a.hashCode() * 31;
            Integer num = this.f42697b;
            int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
            String str = this.f42698c;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }
    }

    public C3236D4(@NonNull Context context, @NonNull C3386J4 c3386j4) {
        this(context, c3386j4, new C3311G4());
    }

    /* renamed from: a */
    public InterfaceC3261E4 m17949a(@NonNull C3211C4 c3211c4, @NonNull C3734X3 c3734x3) {
        InterfaceC3261E4 interfaceC3261E4;
        synchronized (this.f42689a) {
            interfaceC3261E4 = this.f42691c.get(c3211c4);
            if (interfaceC3261E4 == null) {
                interfaceC3261E4 = this.f42695g.m18126a(c3211c4).mo18031a(this.f42693e, this.f42690b, c3211c4, c3734x3);
                this.f42691c.put(c3211c4, interfaceC3261E4);
                this.f42692d.m19535a(new a(c3211c4.m17920b(), c3211c4.m17921c(), c3211c4.m17922d()), c3211c4);
                this.f42694f++;
            }
        }
        return interfaceC3261E4;
    }

    @VisibleForTesting
    public C3236D4(@NonNull Context context, @NonNull C3386J4 c3386j4, @NonNull C3311G4 c3311g4) {
        this.f42689a = new Object();
        this.f42691c = new HashMap<>();
        this.f42692d = new C3803Zm<>();
        this.f42694f = 0;
        this.f42693e = context.getApplicationContext();
        this.f42690b = c3386j4;
        this.f42695g = c3311g4;
    }

    /* renamed from: a */
    public void m17950a(@NonNull String str, int i2, String str2) {
        Integer valueOf = Integer.valueOf(i2);
        synchronized (this.f42689a) {
            Collection<C3211C4> m19537b = this.f42692d.m19537b(new a(str, valueOf, str2));
            if (!C3658U2.m19217b(m19537b)) {
                this.f42694f -= m19537b.size();
                ArrayList arrayList = new ArrayList(m19537b.size());
                Iterator<C3211C4> it = m19537b.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.f42691c.remove(it.next()));
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC3261E4) it2.next()).mo17810a();
                }
            }
        }
    }
}
