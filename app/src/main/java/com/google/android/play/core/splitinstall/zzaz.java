package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzaz extends zzbb<List<SplitInstallSessionState>> {
    @Override // com.google.android.play.core.splitinstall.zzbb, com.google.android.play.core.internal.zzcc
    /* renamed from: H */
    public final void mo10876H(List<Bundle> list) throws RemoteException {
        this.f20278b.f20281a.m10843c(this.f20277a);
        zzbc.f20279b.m10837d("onGetSessionStates", new Object[0]);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Bundle> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(SplitInstallSessionState.m10959m(it.next()));
        }
        this.f20277a.m11015d(arrayList);
    }
}
