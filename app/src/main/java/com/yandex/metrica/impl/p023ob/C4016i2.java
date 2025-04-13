package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p023ob.C3696Vf;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.i2 */
/* loaded from: classes2.dex */
class C4016i2 implements InterfaceC3202Bk {

    /* renamed from: a */
    public final /* synthetic */ C3696Vf f45315a;

    /* renamed from: b */
    public final /* synthetic */ C4042j2 f45316b;

    public C4016i2(C4042j2 c4042j2, C3696Vf c3696Vf) {
        this.f45316b = c4042j2;
        this.f45315a = c3696Vf;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3202Bk
    /* renamed from: a */
    public void mo17805a(C3177Ak c3177Ak) {
        C3696Vf c3696Vf = this.f45315a;
        List<C4346uk> m17841c = c3177Ak.m17841c();
        if (C3658U2.m19217b(m17841c)) {
            return;
        }
        c3696Vf.f44233e = new C3696Vf.e[m17841c.size()];
        for (int i2 = 0; i2 < m17841c.size(); i2++) {
            C4346uk c4346uk = m17841c.get(i2);
            C3696Vf.e[] eVarArr = c3696Vf.f44233e;
            int i3 = C3886d2.f44899e;
            C3696Vf.e eVar = new C3696Vf.e();
            if (c4346uk.m20900b() != null) {
                eVar.f44302b = c4346uk.m20900b().intValue();
            }
            if (c4346uk.m20901c() != null) {
                eVar.f44303c = c4346uk.m20901c().intValue();
            }
            if (!TextUtils.isEmpty(c4346uk.m20899a())) {
                eVar.f44304d = c4346uk.m20899a();
            }
            eVar.f44305e = c4346uk.m20902d();
            eVarArr[i2] = eVar;
            C4042j2 c4042j2 = this.f45316b;
            c4042j2.f45378x = C3831b.m19603a(c3696Vf.f44233e[i2]) + c4042j2.f45378x;
            C4042j2 c4042j22 = this.f45316b;
            c4042j22.f45378x = C3831b.m19609c(10) + c4042j22.f45378x;
        }
    }
}
