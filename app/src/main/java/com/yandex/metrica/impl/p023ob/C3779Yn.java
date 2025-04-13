package com.yandex.metrica.impl.p023ob;

/* renamed from: com.yandex.metrica.impl.ob.Yn */
/* loaded from: classes2.dex */
public class C3779Yn extends AbstractC3908do<C3700Vj> {

    /* renamed from: com.yandex.metrica.impl.ob.Yn$a */
    public static class a implements InterfaceC3934eo<C3700Vj> {
        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3934eo
        /* renamed from: a */
        public AbstractC3908do mo19489a(C3700Vj c3700Vj) {
            return new C3779Yn(c3700Vj);
        }
    }

    public C3779Yn(C3700Vj c3700Vj) {
        super(c3700Vj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.metrica.impl.p023ob.AbstractC3908do
    /* renamed from: a */
    public boolean mo19488a(AbstractC3908do<C3700Vj> abstractC3908do) {
        C3700Vj c3700Vj = abstractC3908do.f44975a;
        T t = this.f44975a;
        if (t == c3700Vj) {
            return true;
        }
        if (((C3700Vj) t).m19298c() != c3700Vj.m19298c()) {
            return false;
        }
        if (((C3700Vj) this.f44975a).m19306k() == null ? c3700Vj.m19306k() != null : !((C3700Vj) this.f44975a).m19306k().equals(c3700Vj.m19306k())) {
            return false;
        }
        if (((C3700Vj) this.f44975a).m19307l() == null ? c3700Vj.m19307l() != null : !((C3700Vj) this.f44975a).m19307l().equals(c3700Vj.m19307l())) {
            return false;
        }
        if (((C3700Vj) this.f44975a).m19300e() == null ? c3700Vj.m19300e() != null : !((C3700Vj) this.f44975a).m19300e().equals(c3700Vj.m19300e())) {
            return false;
        }
        if (((C3700Vj) this.f44975a).m19297b() == null ? c3700Vj.m19297b() != null : !((C3700Vj) this.f44975a).m19297b().equals(c3700Vj.m19297b())) {
            return false;
        }
        if (((C3700Vj) this.f44975a).m19308m() == null ? c3700Vj.m19308m() == null : ((C3700Vj) this.f44975a).m19308m().equals(c3700Vj.m19308m())) {
            return ((C3700Vj) this.f44975a).m19310o() != null ? ((C3700Vj) this.f44975a).m19310o().equals(c3700Vj.m19310o()) : c3700Vj.m19310o() == null;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        return ((((C3700Vj) this.f44975a).m19298c() + ((((((((((((C3700Vj) this.f44975a).m19306k() != null ? ((C3700Vj) this.f44975a).m19306k().hashCode() : 0) * 31) + (((C3700Vj) this.f44975a).m19307l() != null ? ((C3700Vj) this.f44975a).m19307l().hashCode() : 0)) * 31) + (((C3700Vj) this.f44975a).m19300e() != null ? ((C3700Vj) this.f44975a).m19300e().hashCode() : 0)) * 31) + (((C3700Vj) this.f44975a).m19297b() != null ? ((C3700Vj) this.f44975a).m19297b().hashCode() : 0)) * 31) + (((C3700Vj) this.f44975a).m19308m() != null ? ((C3700Vj) this.f44975a).m19308m().hashCode() : 0)) * 31)) * 31) + (((C3700Vj) this.f44975a).m19310o() != null ? ((C3700Vj) this.f44975a).m19310o().hashCode() : 0);
    }
}
