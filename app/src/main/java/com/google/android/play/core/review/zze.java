package com.google.android.play.core.review;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.play.core.internal.zzaa;
import com.google.android.play.core.internal.zzab;
import com.google.android.play.core.internal.zzac;
import com.google.android.play.core.internal.zzan;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final /* synthetic */ class zze implements zzan {
    @Override // com.google.android.play.core.internal.zzan
    /* renamed from: a */
    public final Object mo10661a(IBinder iBinder) {
        int i2 = zzab.f20092a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        return queryLocalInterface instanceof zzac ? (zzac) queryLocalInterface : new zzaa(iBinder);
    }
}
