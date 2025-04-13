package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import androidx.room.util.C0576a;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zaz extends RemoteCreator<zam> {

    /* renamed from: c */
    public static final zaz f15784c = new zaz();

    public zaz() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    /* renamed from: c */
    public static View m8190c(Context context, int i2, int i3) throws RemoteCreator.RemoteCreatorException {
        zaz zazVar = f15784c;
        try {
            zax zaxVar = new zax(1, i2, i3, null);
            return (View) ObjectWrapper.m8284t(zazVar.m8285b(context).m8188t(new ObjectWrapper(context), zaxVar));
        } catch (Exception e2) {
            throw new RemoteCreator.RemoteCreatorException(C0576a.m4112k(64, "Could not get button with size ", i2, " and color ", i3), e2);
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    /* renamed from: a */
    public final /* synthetic */ zam mo8191a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return queryLocalInterface instanceof zam ? (zam) queryLocalInterface : new zam(iBinder);
    }
}
