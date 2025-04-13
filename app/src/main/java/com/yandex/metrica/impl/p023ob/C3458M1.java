package com.yandex.metrica.impl.p023ob;

import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.M1 */
/* loaded from: classes2.dex */
public class C3458M1 implements InterfaceC3508O1 {

    /* renamed from: a */
    private final C3803Zm<String, Integer> f43387a = new C3803Zm<>();

    /* renamed from: b */
    private final Map<e, d> f43388b = new LinkedHashMap();

    /* renamed from: c */
    private final Map<e, d> f43389c = new LinkedHashMap();

    /* renamed from: com.yandex.metrica.impl.ob.M1$a */
    public class a implements d {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p023ob.C3458M1.d
        /* renamed from: a */
        public boolean mo18560a(@NonNull Intent intent, @NonNull C3458M1 c3458m1) {
            return C3458M1.m18550a(C3458M1.this, intent);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.M1$b */
    public class b implements d {
        public b() {
        }

        @Override // com.yandex.metrica.impl.p023ob.C3458M1.d
        /* renamed from: a */
        public boolean mo18560a(@NonNull Intent intent, @NonNull C3458M1 c3458m1) {
            return C3458M1.this.m18554e(intent);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.M1$c */
    public class c implements d {
        public c() {
        }

        @Override // com.yandex.metrica.impl.p023ob.C3458M1.d
        /* renamed from: a */
        public boolean mo18560a(@NonNull Intent intent, @NonNull C3458M1 c3458m1) {
            return C3458M1.this.m18554e(intent) && C3458M1.m18549a(C3458M1.this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.M1$d */
    public interface d {
        /* renamed from: a */
        boolean mo18560a(@NonNull Intent intent, @NonNull C3458M1 c3458m1);
    }

    /* renamed from: com.yandex.metrica.impl.ob.M1$e */
    public interface e {
        /* renamed from: a */
        void mo18023a(@NonNull Intent intent);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3508O1
    /* renamed from: a */
    public void mo17864a(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f43387a.m19535a(action, Integer.valueOf(m18553d(intent)));
            }
            m18548a(intent, this.f43388b);
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3508O1
    /* renamed from: c */
    public void mo17874c(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f43387a.m19535a(action, Integer.valueOf(m18553d(intent)));
            }
            m18548a(intent, this.f43388b);
        }
    }

    /* renamed from: d */
    public void m18558d(@NonNull e eVar) {
        this.f43388b.put(eVar, new a());
    }

    /* renamed from: e */
    public void m18559e(@NonNull e eVar) {
        this.f43388b.put(eVar, new b());
    }

    /* renamed from: d */
    private int m18553d(@NonNull Intent intent) {
        Uri data = intent.getData();
        if (data != null && data.getPath().equals("/client")) {
            try {
                return Integer.parseInt(data.getQueryParameter("pid"));
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public boolean m18554e(@NonNull Intent intent) {
        if ("com.yandex.metrica.IMetricaService".equals(intent.getAction())) {
            return !(m18553d(intent) == Process.myPid());
        }
        return false;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3508O1
    /* renamed from: b */
    public void mo17872b(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f43387a.m19538b(action, Integer.valueOf(m18553d(intent)));
            }
            m18548a(intent, this.f43389c);
        }
    }

    /* renamed from: a */
    private void m18548a(@NonNull Intent intent, @NonNull Map<e, d> map) {
        for (Map.Entry<e, d> entry : map.entrySet()) {
            if (entry.getValue().mo18560a(intent, this)) {
                entry.getKey().mo18023a(intent);
            }
        }
    }

    /* renamed from: c */
    public void m18557c(@NonNull e eVar) {
        this.f43389c.put(eVar, new C3483N1(this));
    }

    /* renamed from: b */
    public void m18556b(@NonNull e eVar) {
        this.f43388b.put(eVar, new C3483N1(this));
    }

    /* renamed from: c */
    private int m18552c() {
        Collection<Integer> m19534a = this.f43387a.m19534a("com.yandex.metrica.IMetricaService");
        if (C3658U2.m19217b(m19534a)) {
            return 0;
        }
        Iterator<Integer> it = m19534a.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (!(it.next().intValue() == Process.myPid())) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public void m18555a(@NonNull e eVar) {
        this.f43389c.put(eVar, new c());
    }

    /* renamed from: a */
    public static boolean m18550a(C3458M1 c3458m1, Intent intent) {
        if (c3458m1.m18554e(intent)) {
            return c3458m1.m18552c() == 1;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m18549a(C3458M1 c3458m1) {
        return c3458m1.m18552c() == 0;
    }
}
