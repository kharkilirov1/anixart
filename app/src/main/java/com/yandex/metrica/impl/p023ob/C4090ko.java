package com.yandex.metrica.impl.p023ob;

/* renamed from: com.yandex.metrica.impl.ob.ko */
/* loaded from: classes2.dex */
class C4090ko extends AbstractC3908do<C3783Z2> {
    public C4090ko(C4116lo c4116lo, C3783Z2 c3783z2) {
        super(c3783z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.metrica.impl.p023ob.AbstractC3908do
    /* renamed from: a */
    public boolean mo19488a(AbstractC3908do<C3783Z2> abstractC3908do) {
        String str = ((C3783Z2) this.f44975a).f44602a;
        if (str == null ? abstractC3908do.f44975a.f44602a != null : !str.equals(abstractC3908do.f44975a.f44602a)) {
            return false;
        }
        String str2 = ((C3783Z2) this.f44975a).f44603b;
        return str2 != null ? str2.equals(abstractC3908do.f44975a.f44603b) : abstractC3908do.f44975a.f44603b == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = ((C3783Z2) this.f44975a).f44602a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = ((C3783Z2) this.f44975a).f44603b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
