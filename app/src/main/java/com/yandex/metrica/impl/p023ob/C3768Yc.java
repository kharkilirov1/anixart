package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3256E;
import com.yandex.metrica.impl.p023ob.C3456M;
import com.yandex.metrica.impl.p023ob.C3575Qi;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.Yc */
/* loaded from: classes2.dex */
public class C3768Yc implements C3456M.c, C3256E.b {

    /* renamed from: a */
    @NonNull
    private List<C3718Wc> f44563a;

    /* renamed from: b */
    @NonNull
    private final C3456M f44564b;

    /* renamed from: c */
    @NonNull
    private final C3897dd f44565c;

    /* renamed from: d */
    @NonNull
    private final C3256E f44566d;

    /* renamed from: e */
    @Nullable
    private volatile C3668Uc f44567e;

    /* renamed from: f */
    @NonNull
    private final Set<InterfaceC3693Vc> f44568f;

    /* renamed from: g */
    private final Object f44569g;

    public C3768Yc(@NonNull Context context) {
        this(C3532P0.m18696i().m18702d(), C3897dd.m19718a(context), new C3575Qi.b(context), C3532P0.m18696i().m18701c());
    }

    @AnyThread
    /* renamed from: d */
    private void m19449d() {
        C3668Uc m19448a = m19448a();
        if (C3658U2.m19213a(this.f44567e, m19448a)) {
            return;
        }
        this.f44565c.m19724a(m19448a);
        this.f44567e = m19448a;
        C3668Uc c3668Uc = this.f44567e;
        Iterator<InterfaceC3693Vc> it = this.f44568f.iterator();
        while (it.hasNext()) {
            it.next().mo19274a(c3668Uc);
        }
    }

    @AnyThread
    /* renamed from: a */
    public synchronized void m19451a(@NonNull InterfaceC3693Vc interfaceC3693Vc) {
        this.f44568f.add(interfaceC3693Vc);
    }

    /* renamed from: b */
    public void m19452b() {
        synchronized (this.f44569g) {
            this.f44564b.m18534a(this);
            this.f44566d.m17987a(this);
        }
    }

    /* renamed from: c */
    public synchronized void m19453c() {
        m19449d();
    }

    @AnyThread
    /* renamed from: a */
    public synchronized void m19450a(@NonNull C3575Qi c3575Qi) {
        this.f44563a = c3575Qi.m18866x();
        this.f44567e = m19448a();
        this.f44565c.m19723a(c3575Qi, this.f44567e);
        C3668Uc c3668Uc = this.f44567e;
        Iterator<InterfaceC3693Vc> it = this.f44568f.iterator();
        while (it.hasNext()) {
            it.next().mo19274a(c3668Uc);
        }
    }

    @VisibleForTesting
    public C3768Yc(@NonNull C3456M c3456m, @NonNull C3897dd c3897dd, @NonNull C3575Qi.b bVar, @NonNull C3256E c3256e) {
        this.f44568f = new HashSet();
        this.f44569g = new Object();
        this.f44564b = c3456m;
        this.f44565c = c3897dd;
        this.f44566d = c3256e;
        this.f44563a = bVar.m18918a().m18866x();
    }

    @Override // com.yandex.metrica.impl.p023ob.C3256E.b
    /* renamed from: a */
    public synchronized void mo17994a(@NonNull C3256E.a aVar) {
        m19449d();
    }

    @Override // com.yandex.metrica.impl.p023ob.C3456M.c
    /* renamed from: a */
    public synchronized void mo18538a(@NonNull C3456M.b.a aVar) {
        m19449d();
    }

    @Nullable
    /* renamed from: a */
    private C3668Uc m19448a() {
        C3256E.a m17992c = this.f44566d.m17992c();
        C3456M.b.a m18535b = this.f44564b.m18535b();
        for (C3718Wc c3718Wc : this.f44563a) {
            if (c3718Wc.f44377b.f45338a.contains(m18535b) && c3718Wc.f44377b.f45339b.contains(m17992c)) {
                return c3718Wc.f44376a;
            }
        }
        return null;
    }
}
