package com.yandex.metrica.impl.p023ob;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3458M1;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.N1 */
/* loaded from: classes2.dex */
class C3483N1 implements C3458M1.d {

    /* renamed from: a */
    public final /* synthetic */ C3458M1 f43454a;

    public C3483N1(C3458M1 c3458m1) {
        this.f43454a = c3458m1;
    }

    @Override // com.yandex.metrica.impl.p023ob.C3458M1.d
    /* renamed from: a */
    public boolean mo18560a(@NonNull Intent intent, @NonNull C3458M1 c3458m1) {
        C3458M1 c3458m12 = this.f43454a;
        String action = intent.getAction();
        Objects.requireNonNull(c3458m12);
        return "com.yandex.metrica.ACTION_C_BG_L".equals(action);
    }
}
