package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.billing_interface.C3115a;
import com.yandex.metrica.impl.p023ob.InterfaceC3467Ma;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.w3 */
/* loaded from: classes2.dex */
public class C4381w3 implements InterfaceC4325u {

    /* renamed from: a */
    @NonNull
    private final C3566Q9 f46849a;

    /* renamed from: b */
    @NonNull
    private C4251r3 f46850b;

    public C4381w3(@NonNull Context context) {
        this(InterfaceC3467Ma.b.m18577a(C4251r3.class).mo18575a(context));
    }

    /* renamed from: a */
    public void m21081a(@NonNull List<C3115a> list, boolean z) {
        for (C3115a c3115a : list) {
        }
        C4251r3 c4251r3 = new C4251r3(list, z);
        this.f46850b = c4251r3;
        this.f46849a.m18781a(c4251r3);
    }

    /* renamed from: b */
    public boolean m21082b() {
        return this.f46850b.f46268b;
    }

    @VisibleForTesting
    public C4381w3(@NonNull C3566Q9 c3566q9) {
        this.f46849a = c3566q9;
        this.f46850b = (C4251r3) c3566q9.m18782b();
    }

    @NonNull
    /* renamed from: a */
    public List<C3115a> m21080a() {
        return this.f46850b.f46267a;
    }
}
