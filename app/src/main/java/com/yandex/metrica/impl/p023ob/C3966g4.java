package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3734X3;
import com.yandex.metrica.impl.p023ob.C3914e4;
import com.yandex.metrica.impl.p023ob.C4057jh;
import com.yandex.metrica.impl.p023ob.C4330u4;
import com.yandex.metrica.impl.p023ob.C4358v6;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.g4 */
/* loaded from: classes2.dex */
class C3966g4 {

    /* renamed from: a */
    @NonNull
    private final b f45160a;

    /* renamed from: b */
    @NonNull
    private final c f45161b;

    /* renamed from: c */
    @NonNull
    public final Context f45162c;

    /* renamed from: d */
    @NonNull
    private final C3862c4 f45163d;

    /* renamed from: e */
    @NonNull
    private final C3734X3.a f45164e;

    /* renamed from: f */
    @NonNull
    private final AbstractC3724Wi f45165f;

    /* renamed from: g */
    @NonNull
    public final C3575Qi f45166g;

    /* renamed from: h */
    @NonNull
    private final C4057jh.e f45167h;

    /* renamed from: i */
    @NonNull
    private final C4115ln f45168i;

    /* renamed from: j */
    @NonNull
    private final InterfaceExecutorC4297sn f45169j;

    /* renamed from: k */
    @NonNull
    private final C4171o1 f45170k;

    /* renamed from: l */
    private final int f45171l;

    /* renamed from: com.yandex.metrica.impl.ob.g4$a */
    public class a implements C4330u4.a {

        /* renamed from: a */
        public final /* synthetic */ C4120m2 f45172a;

        public a(C3966g4 c3966g4, C4120m2 c4120m2) {
            this.f45172a = c4120m2;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.g4$b */
    public static class b {

        /* renamed from: a */
        @Nullable
        private final String f45173a;

        public b(@Nullable String str) {
            this.f45173a = str;
        }

        /* renamed from: a */
        public C4426xm m19942a() {
            return AbstractC4478zm.m21312a(this.f45173a);
        }

        /* renamed from: b */
        public C3379Im m19943b() {
            return AbstractC4478zm.m21313b(this.f45173a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.g4$c */
    public static class c {

        /* renamed from: a */
        @NonNull
        private final C3862c4 f45174a;

        /* renamed from: b */
        @NonNull
        private final C3567Qa f45175b;

        public c(@NonNull Context context, @NonNull C3862c4 c3862c4) {
            this(c3862c4, C3567Qa.m18783a(context));
        }

        @NonNull
        /* renamed from: a */
        public C3316G9 m19944a() {
            return new C3316G9(this.f45175b.m18793b(this.f45174a));
        }

        @NonNull
        /* renamed from: b */
        public C3266E9 m19945b() {
            return new C3266E9(this.f45175b.m18793b(this.f45174a));
        }

        @VisibleForTesting
        public c(@NonNull C3862c4 c3862c4, @NonNull C3567Qa c3567Qa) {
            this.f45174a = c3862c4;
            this.f45175b = c3567Qa;
        }
    }

    public C3966g4(@NonNull Context context, @NonNull C3862c4 c3862c4, @NonNull C3734X3.a aVar, @NonNull AbstractC3724Wi abstractC3724Wi, @NonNull C3575Qi c3575Qi, @NonNull C4057jh.e eVar, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, int i2, @NonNull C4171o1 c4171o1) {
        this(context, c3862c4, aVar, abstractC3724Wi, c3575Qi, eVar, interfaceExecutorC4297sn, new C4115ln(), i2, new b(aVar.f44447d), new c(context, c3862c4), c4171o1);
    }

    @NonNull
    /* renamed from: a */
    public C3968g6 m19931a() {
        return new C3968g6(this.f45162c, this.f45163d, this.f45171l);
    }

    @NonNull
    /* renamed from: b */
    public b m19935b() {
        return this.f45160a;
    }

    @NonNull
    /* renamed from: c */
    public c m19938c() {
        return this.f45161b;
    }

    @NonNull
    /* renamed from: d */
    public C3914e4.b m19940d(@NonNull C3940f4 c3940f4) {
        return new C3914e4.b(c3940f4);
    }

    @NonNull
    /* renamed from: e */
    public C4120m2<C3940f4> m19941e(@NonNull C3940f4 c3940f4) {
        C4120m2<C3940f4> c4120m2 = new C4120m2<>(c3940f4, this.f45165f.mo19363a(), this.f45169j);
        this.f45170k.m20469a(c4120m2);
        return c4120m2;
    }

    @VisibleForTesting
    public C3966g4(@NonNull Context context, @NonNull C3862c4 c3862c4, @NonNull C3734X3.a aVar, @NonNull AbstractC3724Wi abstractC3724Wi, @NonNull C3575Qi c3575Qi, @NonNull C4057jh.e eVar, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull C4115ln c4115ln, int i2, @NonNull b bVar, @NonNull c cVar, @NonNull C4171o1 c4171o1) {
        this.f45162c = context;
        this.f45163d = c3862c4;
        this.f45164e = aVar;
        this.f45165f = abstractC3724Wi;
        this.f45166g = c3575Qi;
        this.f45167h = eVar;
        this.f45169j = interfaceExecutorC4297sn;
        this.f45168i = c4115ln;
        this.f45171l = i2;
        this.f45160a = bVar;
        this.f45161b = cVar;
        this.f45170k = c4171o1;
    }

    @NonNull
    /* renamed from: a */
    public C4304t4 m19932a(@NonNull C3940f4 c3940f4) {
        return new C4304t4(new C4057jh.c(c3940f4, this.f45167h), this.f45166g, new C4057jh.a(this.f45164e));
    }

    @NonNull
    /* renamed from: b */
    public C4308t8 m19936b(@NonNull C3940f4 c3940f4) {
        return new C4308t8(c3940f4, C3567Qa.m18783a(this.f45162c).m18794c(this.f45163d), new C4282s8(c3940f4.mo19350s()));
    }

    @NonNull
    /* renamed from: c */
    public C3889d5 m19937c(@NonNull C3940f4 c3940f4) {
        return new C3889d5(c3940f4);
    }

    @NonNull
    /* renamed from: d */
    public C3365I8 m19939d() {
        return C3532P0.m18696i().m18722y().m18441a(this.f45163d.m19668a());
    }

    @NonNull
    /* renamed from: a */
    public C4358v6 m19934a(@NonNull C3940f4 c3940f4, @NonNull C3365I8 c3365i8, @NonNull C4358v6.a aVar) {
        return new C4358v6(c3940f4, new C4332u6(c3365i8), aVar);
    }

    @NonNull
    /* renamed from: a */
    public C4330u4 m19933a(@NonNull C3316G9 c3316g9, @NonNull C3365I8 c3365i8, @NonNull C4358v6 c4358v6, @NonNull C4308t8 c4308t8, @NonNull C3156A c3156a, @NonNull C4120m2 c4120m2) {
        return new C4330u4(c3316g9, c3365i8, c4358v6, c4308t8, c3156a, this.f45168i, this.f45171l, new a(this, c4120m2), new C4018i4(c3365i8, new C3216C9(c3365i8)), new C3504Nm());
    }

    @NonNull
    /* renamed from: a */
    public C3967g5<AbstractC4279s5, C3940f4> m19930a(@NonNull C3940f4 c3940f4, @NonNull C3889d5 c3889d5) {
        return new C3967g5<>(c3889d5, c3940f4);
    }

    @NonNull
    /* renamed from: a */
    public C3617Sb m19927a(@NonNull C4308t8 c4308t8) {
        return new C3617Sb(c4308t8);
    }

    @NonNull
    /* renamed from: a */
    public C3742Xb m19929a(@NonNull C4308t8 c4308t8, @NonNull C4304t4 c4304t4) {
        return new C3742Xb(c4308t8, c4304t4);
    }

    @NonNull
    /* renamed from: a */
    public C3692Vb m19928a(@NonNull List<InterfaceC3642Tb> list, @NonNull InterfaceC3717Wb interfaceC3717Wb) {
        return new C3692Vb(list, interfaceC3717Wb);
    }

    @NonNull
    /* renamed from: a */
    public C3531P m19926a(@NonNull C3316G9 c3316g9) {
        return new C3531P(this.f45162c, c3316g9);
    }
}
