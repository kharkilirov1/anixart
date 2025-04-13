package com.yandex.mobile.ads.impl;

import android.view.Display;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.AbstractC4865bh;
import com.yandex.mobile.ads.impl.AbstractC5742se;
import com.yandex.mobile.ads.impl.AbstractC5809tm;
import com.yandex.mobile.ads.impl.AbstractC5814tr;
import com.yandex.mobile.ads.impl.C5246is;
import com.yandex.mobile.ads.impl.bb0;
import com.yandex.mobile.ads.impl.f80;
import com.yandex.mobile.ads.impl.ne1;
import com.yandex.mobile.ads.impl.rq0;
import com.yandex.mobile.ads.impl.ts0;
import com.yandex.mobile.ads.impl.ws0;
import java.util.List;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class en1 implements bb0.InterfaceC4855f, AbstractC5809tm.a, f80.InterfaceC5063a, AbstractC5742se.d, qf1, mp0, ne1.InterfaceC5488b.a, AbstractC5814tr.b, InterfaceC5416lx, ts0.InterfaceC5816a {

    /* renamed from: b */
    public final /* synthetic */ int f50021b;

    /* renamed from: c */
    public final /* synthetic */ Object f50022c;

    public /* synthetic */ en1(Object obj, int i2) {
        this.f50021b = i2;
        this.f50022c = obj;
    }

    @Override // com.yandex.mobile.ads.impl.bb0.InterfaceC4855f
    /* renamed from: a */
    public int mo22786a(Object obj) {
        int m22764a;
        m22764a = bb0.m22764a((C5606pv) this.f50022c, (wa0) obj);
        return m22764a;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5742se.d
    /* renamed from: a */
    public long mo24215a(long j2) {
        return ((C5147gv) this.f50022c).m24982a(j2);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5814tr.b
    /* renamed from: a */
    public AbstractC5814tr mo24216a(InterfaceC5537og interfaceC5537og) {
        AbstractC5814tr m28499a;
        m28499a = t91.m28499a((AbstractC5814tr) this.f50022c, interfaceC5537og);
        return m28499a;
    }

    @Override // com.yandex.mobile.ads.impl.ts0.InterfaceC5816a
    /* renamed from: a */
    public ts0 mo24217a(uq0 uq0Var) {
        ts0 m29560a;
        m29560a = ws0.C5988a.m29560a((InterfaceC5604pt) this.f50022c, uq0Var);
        return m29560a;
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    /* renamed from: a */
    public Map mo22451a() {
        Map m24112b;
        m24112b = ec1.m24112b((pb1) this.f50022c);
        return m24112b;
    }

    @Override // com.yandex.mobile.ads.impl.mp0
    /* renamed from: a */
    public void mo24218a() {
        nd1.m26847b((nd1) this.f50022c);
    }

    @Override // com.yandex.mobile.ads.impl.ne1.InterfaceC5488b.a
    /* renamed from: a */
    public void mo24219a(Display display) {
        ((ne1) this.f50022c).m26859a(display);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5809tm.a
    /* renamed from: a */
    public void mo24220a(AbstractC5809tm abstractC5809tm) {
        ((AbstractC4865bh) this.f50022c).m22819a((AbstractC4865bh.b) abstractC5809tm);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5416lx
    public Object apply(Object obj) {
        return ((C5819tv) this.f50022c).m28744a((t61) obj);
    }

    @Override // com.yandex.mobile.ads.impl.f80.InterfaceC5063a
    public void invoke(Object obj) {
        switch (this.f50021b) {
            case 2:
                ((rq0.InterfaceC5706b) obj).mo23454a((sb0) this.f50022c);
                break;
            case 3:
                ((rq0.InterfaceC5706b) obj).mo23457a((C5871ul) this.f50022c);
                break;
            case 4:
                ((C5246is.b) this.f50022c).m25694a((rq0.InterfaceC5706b) obj);
                break;
            case 5:
                ((rq0.InterfaceC5706b) obj).mo23443a((Metadata) this.f50022c);
                break;
            case 6:
                ((rq0.InterfaceC5706b) obj).onCues((List) this.f50022c);
                break;
            case 7:
                ((rq0.InterfaceC5706b) obj).mo23445a((lf1) this.f50022c);
                break;
            default:
                ((rq0.InterfaceC5706b) obj).mo23458a((C5875uo) this.f50022c);
                break;
        }
    }
}
