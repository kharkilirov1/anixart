package com.google.android.gms.common.api.internal;

import androidx.annotation.BinderThread;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zaar extends com.google.android.gms.signin.internal.zac {

    /* renamed from: a */
    public final WeakReference<zaaw> f15475a;

    public zaar(zaaw zaawVar) {
        this.f15475a = new WeakReference<>(zaawVar);
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    @BinderThread
    /* renamed from: k0 */
    public final void mo8027k0(com.google.android.gms.signin.internal.zak zakVar) {
        zaaw zaawVar = this.f15475a.get();
        if (zaawVar == null) {
            return;
        }
        zabi zabiVar = zaawVar.f15478a;
        zabiVar.f15509c.sendMessage(zabiVar.f15509c.obtainMessage(1, new zaaq(zaawVar, zaawVar, zakVar)));
    }
}
