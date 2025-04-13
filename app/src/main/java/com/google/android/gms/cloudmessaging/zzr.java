package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
final class zzr extends zzp<Bundle> {
    public zzr(int i2, Bundle bundle) {
        super(i2, 1, bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.zzp
    /* renamed from: a */
    public final void mo7903a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        m7906d(bundle2);
    }

    @Override // com.google.android.gms.cloudmessaging.zzp
    /* renamed from: b */
    public final boolean mo7904b() {
        return false;
    }
}
