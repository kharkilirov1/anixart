package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.api.internal.BackgroundDetector;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zabl implements BackgroundDetector.BackgroundStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ GoogleApiManager f15518a;

    public zabl(GoogleApiManager googleApiManager) {
        this.f15518a = googleApiManager;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    /* renamed from: a */
    public final void mo7970a(boolean z) {
        Handler handler = this.f15518a.f15427o;
        handler.sendMessage(handler.obtainMessage(1, Boolean.valueOf(z)));
    }
}
