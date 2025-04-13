package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.banner.AbstractC4633a;
import com.yandex.mobile.ads.banner.AdSize;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.impl.AbstractC4992dx;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.mw */
/* loaded from: classes3.dex */
public abstract class AbstractC5462mw<T extends AbstractC4992dx<T>> extends AbstractC4945cz {

    /* renamed from: A */
    private T f52818A;

    /* renamed from: B */
    @NonNull
    private final InterfaceC5943vw<T> f52819B;

    /* renamed from: C */
    @NonNull
    private final C5097fz f52820C;

    /* renamed from: w */
    @NonNull
    private final C5252iw f52821w;

    /* renamed from: x */
    @Nullable
    private InterfaceC5148gw<T> f52822x;

    /* renamed from: y */
    @Nullable
    private InterfaceC5148gw<T> f52823y;

    /* renamed from: z */
    @NonNull
    private final InterfaceC5513nw<T> f52824z;

    public AbstractC5462mw(@NonNull Context context, @NonNull EnumC5007e6 enumC5007e6, @NonNull InterfaceC5513nw<T> interfaceC5513nw, @NonNull C5724s3 c5724s3, @NonNull InterfaceC5943vw<T> interfaceC5943vw, @NonNull C5097fz c5097fz) {
        super(context, enumC5007e6, c5724s3);
        this.f52820C = c5097fz;
        this.f52819B = interfaceC5943vw;
        this.f52824z = interfaceC5513nw;
        this.f52821w = new C5252iw();
        m28605a(AbstractC4633a.m21748a(AdSize.FULL_SCREEN));
    }

    @NonNull
    /* renamed from: a */
    public abstract InterfaceC5148gw<T> mo23082a(@NonNull InterfaceC5202hw interfaceC5202hw);

    @Override // com.yandex.mobile.ads.impl.AbstractC5794td
    /* renamed from: a */
    public final void mo26772a(@NonNull C5563p2 c5563p2) {
        this.f52824z.mo23938a(c5563p2);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5794td
    /* renamed from: b */
    public final void mo26773b(@NonNull AdRequest adRequest) {
        super.mo26773b(adRequest);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5794td
    /* renamed from: m */
    public final void mo26774m() {
        this.f52824z.mo23938a(AbstractC5524o4.f53160l);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5794td
    /* renamed from: n */
    public final void mo21798n() {
        T t = this.f52818A;
        if (t != null) {
            this.f52824z.mo23937a(t);
        } else {
            this.f52824z.mo23938a(AbstractC5524o4.f53151c);
        }
    }

    /* renamed from: u */
    public final void m26775u() {
        if (C5427m6.m26579a((InterfaceC5538oh) this)) {
            return;
        }
        Context context = this.f55053b;
        Iterator it = new HashSet(Arrays.asList(this.f52823y, this.f52822x)).iterator();
        while (it.hasNext()) {
            InterfaceC5148gw interfaceC5148gw = (InterfaceC5148gw) it.next();
            if (interfaceC5148gw != null) {
                interfaceC5148gw.mo24989a(context);
            }
        }
        mo21779c();
        n60.m26811d("onDestroy(), clazz = " + getClass(), new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.AbstractC5794td
    /* renamed from: a */
    public void mo22924a(@NonNull AdResponse<String> adResponse) {
        super.mo22924a((AdResponse) adResponse);
        this.f52820C.m24758a(adResponse);
        Objects.requireNonNull(this.f52821w);
        InterfaceC5148gw<T> mo23082a = mo23082a(C5252iw.m25738a(adResponse));
        mo23082a.mo24990a(this.f55053b, adResponse);
        this.f52823y = this.f52822x;
        this.f52822x = mo23082a;
        this.f52818A = this.f52819B.mo22753a(adResponse, m28616d(), mo23082a);
    }
}
