package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzh extends zzg<ReviewInfo> {
    @Override // com.google.android.play.core.review.zzg, com.google.android.play.core.internal.zzae
    /* renamed from: m */
    public final void mo10831m(Bundle bundle) throws RemoteException {
        Objects.requireNonNull(this.f20184c);
        this.f20182a.m10837d("onGetLaunchReviewFlowInfo", new Object[0]);
        this.f20183b.m11015d(new zza((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
