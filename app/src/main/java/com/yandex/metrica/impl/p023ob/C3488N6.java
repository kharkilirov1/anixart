package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3438L6;
import com.yandex.metrica.impl.p023ob.C3575Qi;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.N6 */
/* loaded from: classes2.dex */
public class C3488N6 {

    /* renamed from: a */
    @NonNull
    private final Context f43456a;

    /* renamed from: b */
    @NonNull
    private final C3438L6 f43457b;

    /* renamed from: c */
    @NonNull
    private final C3463M6 f43458c;

    /* renamed from: d */
    @NonNull
    private final b f43459d;

    /* renamed from: e */
    @NonNull
    private final C3363I6 f43460e;

    /* renamed from: com.yandex.metrica.impl.ob.N6$a */
    public class a implements C3438L6.b {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC3513O6 f43461a;

        public a(InterfaceC3513O6 interfaceC3513O6) {
            this.f43461a = interfaceC3513O6;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.N6$b */
    public static class b {
    }

    public C3488N6(@NonNull Context context, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull InterfaceC3338H6 interfaceC3338H6) {
        this(context, interfaceExecutorC4297sn, interfaceC3338H6, new C3463M6(context));
    }

    private C3488N6(@NonNull Context context, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull InterfaceC3338H6 interfaceC3338H6, @NonNull C3463M6 c3463m6) {
        this(context, new C3438L6(interfaceExecutorC4297sn, interfaceC3338H6), c3463m6, new b(), new C3363I6());
    }

    /* renamed from: a */
    public void m18608a() {
        b bVar = this.f43459d;
        Context context = this.f43456a;
        Objects.requireNonNull(bVar);
        m18607a(new C3575Qi.b(context).m18918a());
    }

    @VisibleForTesting
    public C3488N6(@NonNull Context context, @NonNull C3438L6 c3438l6, @NonNull C3463M6 c3463m6, @NonNull b bVar, @NonNull C3363I6 c3363i6) {
        this.f43456a = context;
        this.f43457b = c3438l6;
        this.f43458c = c3463m6;
        this.f43459d = bVar;
        this.f43460e = c3363i6;
    }

    /* renamed from: a */
    private void m18607a(@NonNull C3575Qi c3575Qi) {
        if (c3575Qi.m18842W() != null) {
            boolean z = c3575Qi.m18842W().f42807b;
            Long m18250a = this.f43460e.m18250a(c3575Qi.m18842W().f42808c);
            if (c3575Qi.m18848f().f46409i && m18250a != null && m18250a.longValue() > 0) {
                this.f43457b.m18478a(m18250a.longValue(), z);
            } else {
                this.f43457b.m18476a();
            }
        }
    }

    /* renamed from: a */
    public void m18609a(@Nullable InterfaceC3513O6 interfaceC3513O6) {
        b bVar = this.f43459d;
        Context context = this.f43456a;
        Objects.requireNonNull(bVar);
        C3575Qi m18918a = new C3575Qi.b(context).m18918a();
        if (m18918a.m18842W() != null) {
            long j2 = m18918a.m18842W().f42806a;
            if (j2 > 0) {
                this.f43458c.m18572a(this.f43456a.getPackageName());
                this.f43457b.m18477a(j2, new a(interfaceC3513O6));
            } else if (interfaceC3513O6 != null) {
                interfaceC3513O6.mo17790a();
            }
        } else if (interfaceC3513O6 != null) {
            interfaceC3513O6.mo17790a();
        }
        m18607a(m18918a);
    }
}
