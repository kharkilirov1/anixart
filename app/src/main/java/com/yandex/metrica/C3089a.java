package com.yandex.metrica;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3755Y;
import com.yandex.metrica.impl.p023ob.C4271rn;
import com.yandex.metrica.impl.p023ob.InterfaceExecutorC4297sn;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.yandex.metrica.a */
/* loaded from: classes2.dex */
public class C3089a {

    /* renamed from: a */
    @NonNull
    public final InterfaceExecutorC4297sn f42291a;

    /* renamed from: b */
    public final Set<b> f42292b;

    /* renamed from: com.yandex.metrica.a$a */
    public interface a {
        /* renamed from: a */
        void mo17773a();

        /* renamed from: b */
        void mo17774b();
    }

    /* renamed from: com.yandex.metrica.a$b */
    public class b {

        /* renamed from: a */
        @NonNull
        public final InterfaceExecutorC4297sn f42293a;

        /* renamed from: b */
        @NonNull
        public final a f42294b;

        /* renamed from: c */
        public final long f42295c;

        /* renamed from: d */
        public boolean f42296d = true;

        /* renamed from: e */
        public final Runnable f42297e = new a();

        /* renamed from: com.yandex.metrica.a$b$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f42294b.mo17773a();
            }
        }

        public b(@NonNull C3089a c3089a, @NonNull a aVar, InterfaceExecutorC4297sn interfaceExecutorC4297sn, long j2) {
            this.f42294b = aVar;
            this.f42293a = interfaceExecutorC4297sn;
            this.f42295c = j2;
        }
    }

    public C3089a(long j2) {
        C4271rn m20607b = C3755Y.m19410g().m19414d().m20607b();
        this.f42292b = new HashSet();
        this.f42291a = m20607b;
    }

    /* renamed from: a */
    public synchronized void m17770a() {
        for (b bVar : this.f42292b) {
            if (!bVar.f42296d) {
                bVar.f42296d = true;
                ((C4271rn) bVar.f42293a).m20673a(bVar.f42297e, bVar.f42295c);
            }
        }
    }

    /* renamed from: b */
    public synchronized void m17771b(@NonNull a aVar, long j2) {
        this.f42292b.add(new b(this, aVar, this.f42291a, j2));
    }

    /* renamed from: c */
    public synchronized void m17772c() {
        for (b bVar : this.f42292b) {
            if (bVar.f42296d) {
                bVar.f42296d = false;
                ((C4271rn) bVar.f42293a).m20672a(bVar.f42297e);
                bVar.f42294b.mo17774b();
            }
        }
    }
}
