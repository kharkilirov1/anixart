package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3581R0;

/* renamed from: com.yandex.metrica.impl.ob.Q0 */
/* loaded from: classes2.dex */
public abstract class AbstractC3557Q0<T> implements C3581R0.d {

    /* renamed from: a */
    @NonNull
    public final C3506O<T> f43657a;

    /* renamed from: b */
    @Nullable
    private C3581R0 f43658b;

    public AbstractC3557Q0(long j2, long j3) {
        this.f43657a = new C3506O<>(j2, j3);
    }

    /* renamed from: a */
    public abstract long mo18770a(@NonNull C4214pi c4214pi);

    @Nullable
    /* renamed from: a */
    public T mo18725a() {
        C3581R0 c3581r0;
        if (mo18727b() && (c3581r0 = this.f43658b) != null) {
            c3581r0.m18931b();
        }
        if (this.f43657a.m18651c()) {
            this.f43657a.m18649a(null);
        }
        return this.f43657a.m18647a();
    }

    /* renamed from: a */
    public abstract boolean mo18772a(@NonNull T t);

    /* renamed from: b */
    public abstract long mo18773b(@NonNull C4214pi c4214pi);

    /* renamed from: b */
    public void mo18726b(@NonNull T t) {
        if (mo18772a((AbstractC3557Q0<T>) t)) {
            this.f43657a.m18649a(t);
            C3581R0 c3581r0 = this.f43658b;
            if (c3581r0 != null) {
                c3581r0.m18930a();
            }
        }
    }

    /* renamed from: b */
    public abstract boolean mo18727b();

    /* renamed from: c */
    public void m18774c(@NonNull C4214pi c4214pi) {
        this.f43657a.m18648a(mo18773b(c4214pi), mo18770a(c4214pi));
    }

    /* renamed from: a */
    public void m18771a(@NonNull C3581R0 c3581r0) {
        this.f43658b = c3581r0;
    }
}
