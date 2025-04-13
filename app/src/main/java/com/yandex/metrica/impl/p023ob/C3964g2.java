package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.rtm.wrapper.InterfaceC4622f;

/* renamed from: com.yandex.metrica.impl.ob.g2 */
/* loaded from: classes2.dex */
class C3964g2 {

    /* renamed from: a */
    private final InterfaceC4431y1 f45158a;

    /* renamed from: b */
    private final InterfaceC4622f f45159b;

    public C3964g2(@NonNull InterfaceC4431y1 interfaceC4431y1, @NonNull Context context) {
        this(interfaceC4431y1, new C4421xh().m21155b(context));
    }

    /* renamed from: a */
    public void m19924a(int i2, Bundle bundle) {
        if (i2 == 1) {
            this.f45158a.reportData(bundle);
        } else {
            if (i2 != 2) {
                return;
            }
            this.f45159b.reportData(bundle);
        }
    }

    @VisibleForTesting
    public C3964g2(@NonNull InterfaceC4431y1 interfaceC4431y1, @NonNull InterfaceC4622f interfaceC4622f) {
        this.f45158a = interfaceC4431y1;
        this.f45159b = interfaceC4622f;
    }
}
