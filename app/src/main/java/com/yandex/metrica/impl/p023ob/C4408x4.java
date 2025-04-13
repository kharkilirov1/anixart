package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3734X3;

/* renamed from: com.yandex.metrica.impl.ob.x4 */
/* loaded from: classes2.dex */
public class C4408x4 extends C3940f4 {

    /* renamed from: A */
    private final C3459M2 f46924A;

    /* renamed from: z */
    private final String f46925z;

    public C4408x4(@NonNull Context context, @NonNull C3862c4 c3862c4, @NonNull C3734X3.a aVar, @NonNull C3459M2 c3459m2, @NonNull C3575Qi c3575Qi, @NonNull AbstractC3724Wi abstractC3724Wi) {
        this(context, c3862c4, new C3684V3(), new C3583R2(), new C3966g4(context, c3862c4, aVar, abstractC3724Wi, c3575Qi, new C4356v4(c3459m2), C3532P0.m18696i().m18716s().m21320e(), C3658U2.m19216b(context, c3862c4.m19669b()), C3532P0.m18696i().m18707j()), c3459m2);
    }

    @Override // com.yandex.metrica.impl.p023ob.C3940f4, com.yandex.metrica.impl.p023ob.InterfaceC4122m4
    /* renamed from: a */
    public synchronized void mo19138a(@NonNull C3734X3.a aVar) {
        super.mo19138a(aVar);
        this.f46924A.m18563a(this.f46925z, aVar.f44455l);
    }

    @VisibleForTesting
    public C4408x4(@NonNull Context context, @NonNull C3862c4 c3862c4, @NonNull C3684V3 c3684v3, @NonNull C3583R2 c3583r2, @NonNull C3966g4 c3966g4, @NonNull C3459M2 c3459m2) {
        super(context, c3862c4, c3684v3, c3583r2, c3966g4);
        this.f46925z = c3862c4.m19668a();
        this.f46924A = c3459m2;
    }
}
