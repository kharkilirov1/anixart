package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.IdTokenListener;
import com.google.firebase.internal.InternalTokenResult;
import java.util.Iterator;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
final class zzl implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ FirebaseAuth f22458b;

    /* renamed from: c */
    public final /* synthetic */ InternalTokenResult f22459c;

    public zzl(FirebaseAuth firebaseAuth, InternalTokenResult internalTokenResult) {
        this.f22458b = firebaseAuth;
        this.f22459c = internalTokenResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f22458b.f22308c.iterator();
        while (it.hasNext()) {
            ((IdTokenListener) it.next()).m12295a(this.f22459c);
        }
        Iterator it2 = this.f22458b.f22307b.iterator();
        while (it2.hasNext()) {
            ((FirebaseAuth.IdTokenListener) it2.next()).m12242a(this.f22458b);
        }
    }
}
