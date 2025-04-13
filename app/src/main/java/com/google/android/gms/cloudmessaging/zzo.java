package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
final class zzo extends zzp<Void> {
    public zzo(int i2, Bundle bundle) {
        super(i2, 2, bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.zzp
    /* renamed from: a */
    public final void mo7903a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            m7906d(null);
        } else {
            m7905c(new zzq("Invalid response to one way request", null));
        }
    }

    @Override // com.google.android.gms.cloudmessaging.zzp
    /* renamed from: b */
    public final boolean mo7904b() {
        return true;
    }
}
