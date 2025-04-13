package com.yandex.metrica.impl.p023ob;

import android.util.Pair;
import androidx.annotation.NonNull;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.impl.p023ob.C3796Zf;

/* renamed from: com.yandex.metrica.impl.ob.q2 */
/* loaded from: classes2.dex */
class C4224q2 {

    /* renamed from: a */
    @NonNull
    private final Revenue f46222a;

    /* renamed from: b */
    private final InterfaceC3555Pn<String> f46223b;

    /* renamed from: c */
    private final InterfaceC3555Pn<String> f46224c;

    /* renamed from: d */
    private final InterfaceC3555Pn<String> f46225d;

    /* renamed from: e */
    @NonNull
    private final C3379Im f46226e;

    public C4224q2(@NonNull Revenue revenue, @NonNull C3379Im c3379Im) {
        this.f46226e = c3379Im;
        this.f46222a = revenue;
        this.f46223b = new C3480Mn(30720, "revenue payload", c3379Im);
        this.f46224c = new C3530On(new C3480Mn(184320, "receipt data", c3379Im), "<truncated data was not sent, see METRIKALIB-4568>");
        this.f46225d = new C3530On(new C3505Nn(1000, "receipt signature", c3379Im), "<truncated data was not sent, see METRIKALIB-4568>");
    }

    @NonNull
    /* renamed from: a */
    public Pair<byte[], Integer> m20568a() {
        C3796Zf c3796Zf = new C3796Zf();
        c3796Zf.f44652d = this.f46222a.currency.getCurrencyCode().getBytes();
        if (C3658U2.m19212a(this.f46222a.price)) {
            c3796Zf.f44651c = this.f46222a.price.doubleValue();
        }
        if (C3658U2.m19212a(this.f46222a.priceMicros)) {
            c3796Zf.f44656h = this.f46222a.priceMicros.longValue();
        }
        c3796Zf.f44653e = C3509O2.m18659d(new C3505Nn(DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER, "revenue productID", this.f46226e).mo17985a(this.f46222a.productID));
        Integer num = this.f46222a.quantity;
        if (num == null) {
            num = 1;
        }
        c3796Zf.f44650b = num.intValue();
        c3796Zf.f44654f = C3509O2.m18659d(this.f46223b.mo17985a(this.f46222a.payload));
        if (C3658U2.m19212a(this.f46222a.receipt)) {
            C3796Zf.a aVar = new C3796Zf.a();
            String mo17985a = this.f46224c.mo17985a(this.f46222a.receipt.data);
            r2 = C4013i.m20036a(this.f46222a.receipt.data, mo17985a) ? this.f46222a.receipt.data.length() + 0 : 0;
            String mo17985a2 = this.f46225d.mo17985a(this.f46222a.receipt.signature);
            aVar.f44662b = C3509O2.m18659d(mo17985a);
            aVar.f44663c = C3509O2.m18659d(mo17985a2);
            c3796Zf.f44655g = aVar;
        }
        return new Pair<>(AbstractC3909e.m19777a(c3796Zf), Integer.valueOf(r2));
    }
}
