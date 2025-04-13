package com.yandex.mobile.ads.exo.metadata.scte35;

import com.yandex.mobile.ads.exo.metadata.C4740b;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.C5606pv;
import com.yandex.mobile.ads.impl.l60;
import com.yandex.mobile.ads.impl.sb0;

/* loaded from: classes2.dex */
public abstract class SpliceCommand implements Metadata.Entry {
    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    /* renamed from: a */
    public /* synthetic */ C5606pv mo22238a() {
        return C4740b.m22250a(this);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    /* renamed from: a */
    public /* synthetic */ void mo22239a(sb0.C5738a c5738a) {
        C4740b.m22251b(this, c5738a);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    /* renamed from: b */
    public /* synthetic */ byte[] mo22240b() {
        return C4740b.m22252c(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder m26356a = l60.m26356a("SCTE-35 splice command: type=");
        m26356a.append(getClass().getSimpleName());
        return m26356a.toString();
    }
}
