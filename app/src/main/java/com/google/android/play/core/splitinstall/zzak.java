package com.google.android.play.core.splitinstall;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.play.core.internal.zzby;
import com.google.android.play.core.internal.zzbz;
import com.google.android.play.core.internal.zzca;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzak implements com.google.android.play.core.internal.zzan {

    /* renamed from: a */
    public static final /* synthetic */ zzak f20276a = new zzak();

    @Override // com.google.android.play.core.internal.zzan
    /* renamed from: a */
    public final Object mo10661a(IBinder iBinder) {
        int i2 = zzbz.f20137a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        return queryLocalInterface instanceof zzca ? (zzca) queryLocalInterface : new zzby(iBinder);
    }
}
