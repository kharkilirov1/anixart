package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C5194ho;
import com.yandex.mobile.ads.impl.InterfaceC5624q8;
import com.yandex.mobile.ads.impl.f80;
import com.yandex.mobile.ads.impl.j10;
import com.yandex.mobile.ads.impl.wz0;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class pn1 implements f80.InterfaceC5063a, f80.InterfaceC5064b, C5194ho.g.a, qf1, InterfaceC5588pe, j10.InterfaceC5261a {

    /* renamed from: b */
    public final /* synthetic */ int f53595b;

    /* renamed from: c */
    public final /* synthetic */ Object f53596c;

    /* renamed from: d */
    public final /* synthetic */ Object f53597d;

    public /* synthetic */ pn1(Object obj, Object obj2, int i2) {
        this.f53595b = i2;
        this.f53596c = obj;
        this.f53597d = obj2;
    }

    @Override // com.yandex.mobile.ads.impl.C5194ho.g.a
    /* renamed from: a */
    public List mo25345a(int i2, w61 w61Var, int[] iArr) {
        List m25276a;
        List m25274a;
        switch (this.f53595b) {
            case 11:
                m25274a = C5194ho.m25274a((C5194ho.c) this.f53596c, (String) this.f53597d, i2, w61Var, iArr);
                return m25274a;
            default:
                m25276a = C5194ho.m25276a((C5194ho.c) this.f53596c, (int[]) this.f53597d, i2, w61Var, iArr);
                return m25276a;
        }
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    /* renamed from: a */
    public Map mo22451a() {
        Map m26493a;
        m26493a = C5403ll.m26493a((C5403ll) this.f53596c, (C5083fl) this.f53597d);
        return m26493a;
    }

    @Override // com.yandex.mobile.ads.impl.j10.InterfaceC5261a
    /* renamed from: a */
    public void mo25759a(h10 h10Var) {
        ((wz0) this.f53596c).m29592a((wz0.InterfaceC5998a) this.f53597d, h10Var);
    }

    @Override // com.yandex.mobile.ads.impl.f80.InterfaceC5064b
    /* renamed from: a */
    public void mo23918a(Object obj, C5201hv c5201hv) {
        ((C4932cn) this.f53596c).m23378a((rq0) this.f53597d, (InterfaceC5624q8) obj, c5201hv);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5588pe
    /* renamed from: a */
    public void mo27320a(String str) {
        ((AbstractC5794td) this.f53596c).m28598a((d91) this.f53597d, str);
    }

    @Override // com.yandex.mobile.ads.impl.f80.InterfaceC5063a
    public void invoke(Object obj) {
        switch (this.f53595b) {
            case 0:
                Objects.requireNonNull((InterfaceC5624q8) obj);
                break;
            case 1:
                Objects.requireNonNull((InterfaceC5624q8) obj);
                break;
            case 2:
                Objects.requireNonNull((InterfaceC5624q8) obj);
                break;
            case 3:
            default:
                Objects.requireNonNull((InterfaceC5624q8) obj);
                break;
            case 4:
                Objects.requireNonNull((InterfaceC5624q8) obj);
                break;
            case 5:
                Objects.requireNonNull((InterfaceC5624q8) obj);
                break;
            case 6:
                C4932cn.m23358a((InterfaceC5624q8.a) this.f53596c, (lf1) this.f53597d, (InterfaceC5624q8) obj);
                break;
            case 7:
                Objects.requireNonNull((InterfaceC5624q8) obj);
                break;
            case 8:
                C4932cn.m23364a((InterfaceC5624q8.a) this.f53596c, (rb0) this.f53597d, (InterfaceC5624q8) obj);
                break;
            case 9:
                Objects.requireNonNull((InterfaceC5624q8) obj);
                break;
        }
    }
}
