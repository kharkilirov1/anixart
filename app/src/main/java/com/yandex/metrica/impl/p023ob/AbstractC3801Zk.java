package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.Zk */
/* loaded from: classes2.dex */
abstract class AbstractC3801Zk<T> {

    /* renamed from: a */
    @NonNull
    private List<Object> f44696a;

    /* renamed from: b */
    @NonNull
    private final C3726Wk f44697b;

    public AbstractC3801Zk(@Nullable T t, @NonNull C3726Wk c3726Wk) {
        this.f44696a = m19526c(t);
        this.f44697b = c3726Wk;
    }

    @NonNull
    /* renamed from: c */
    private List<Object> m19526c(@Nullable T t) {
        Pattern pattern;
        Pattern pattern2;
        ArrayList arrayList = new ArrayList();
        if (t == null) {
            return arrayList;
        }
        int mo18519b = mo18519b(t);
        List<C3932em> mo18518a = mo18518a(t);
        arrayList.add(new C3228Cl(mo18519b));
        for (C3932em c3932em : mo18518a) {
            int ordinal = c3932em.f45067a.ordinal();
            InterfaceC4010hm interfaceC4010hm = null;
            if (ordinal == 0) {
                interfaceC4010hm = new C3676Uk(c3932em.f45068b);
            } else if (ordinal == 1) {
                interfaceC4010hm = new C3427Kk(c3932em.f45068b);
            } else if (ordinal == 2) {
                try {
                    pattern = Pattern.compile(c3932em.f45068b);
                } catch (Throwable unused) {
                    pattern = null;
                }
                if (pattern != null) {
                    interfaceC4010hm = new C4217pl(pattern);
                }
            } else if (ordinal == 3) {
                try {
                    pattern2 = Pattern.compile(c3932em.f45068b);
                } catch (Throwable unused2) {
                    pattern2 = null;
                }
                if (pattern2 != null) {
                    interfaceC4010hm = new C3552Pk(pattern2);
                }
            }
            if (interfaceC4010hm != null) {
                arrayList.add(interfaceC4010hm);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    @NonNull
    /* renamed from: a */
    public C3726Wk m19527a() {
        return this.f44697b;
    }

    /* renamed from: a */
    public abstract List<C3932em> mo18518a(@NonNull T t);

    /* renamed from: b */
    public abstract int mo18519b(@NonNull T t);

    @NonNull
    /* renamed from: b */
    public List<Object> m19528b() {
        return this.f44696a;
    }

    /* renamed from: d */
    public void m19529d(@Nullable T t) {
        this.f44697b.m19365a();
        this.f44696a = m19526c(t);
    }
}
