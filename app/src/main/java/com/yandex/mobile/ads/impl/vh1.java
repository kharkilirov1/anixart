package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.AbstractC4967de;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class vh1 {
    /* renamed from: a */
    public static aq0 m29226a(@NonNull Context context, @NonNull String str) {
        return new aq0(context, str, new C5920a());
    }

    /* renamed from: com.yandex.mobile.ads.impl.vh1$b */
    public static class C5921b<T> implements AbstractC4967de.a<T> {

        /* renamed from: a */
        private final hw0<T> f55817a;

        public C5921b(hw0<T> hw0Var) {
            this.f55817a = hw0Var;
        }

        @Override // com.yandex.mobile.ads.impl.tw0.InterfaceC5822b
        /* renamed from: a */
        public final void mo22924a(T t) {
            hw0<T> hw0Var = this.f55817a;
            if (hw0Var != null) {
                hw0Var.mo22374a((hw0<T>) t);
            }
        }

        @Override // com.yandex.mobile.ads.impl.tw0.InterfaceC5821a
        /* renamed from: a */
        public final void mo22923a(@NonNull qh1 qh1Var) {
            ac1 m22462b;
            if (this.f55817a != null) {
                if (qh1Var instanceof C5143gr) {
                    m22462b = ac1.m22459a((C5143gr) qh1Var);
                } else if (qh1Var instanceof cp0) {
                    m22462b = ac1.m22458a();
                } else {
                    km0 km0Var = qh1Var.f54052a;
                    if (km0Var == null) {
                        m22462b = ac1.m22460a(qh1Var.getMessage());
                    } else if (km0Var.f52032a >= 500) {
                        m22462b = ac1.m22461b();
                    } else {
                        StringBuilder m27x = C0000a.m27x(C0000a.m18o(C0000a.m27x("Network Error. ", " Code: "), km0Var.f52032a, "."), " Data: \n");
                        m27x.append(new String(km0Var.f52033b));
                        String sb = m27x.toString();
                        n60.m26808a(qh1Var, sb, new Object[0]);
                        m22462b = ac1.m22462b(sb);
                    }
                }
                this.f55817a.mo22373a(m22462b);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vh1$a */
    public static class C5920a implements AbstractC4967de.a<km0> {

        /* renamed from: a */
        @Nullable
        private final hw0<km0> f55816a = null;

        @Override // com.yandex.mobile.ads.impl.tw0.InterfaceC5822b
        /* renamed from: a */
        public final void mo22924a(Object obj) {
            km0 km0Var = (km0) obj;
            hw0<km0> hw0Var = this.f55816a;
            if (hw0Var != null) {
                hw0Var.mo22374a((hw0<km0>) km0Var);
            }
        }

        @Override // com.yandex.mobile.ads.impl.tw0.InterfaceC5821a
        /* renamed from: a */
        public final void mo22923a(@NonNull qh1 qh1Var) {
            ac1 m22462b;
            if (this.f55816a != null) {
                if (qh1Var.f54052a == null) {
                    m22462b = ac1.m22460a(qh1Var.getMessage());
                } else {
                    m22462b = ac1.m22462b("Ping error");
                }
                this.f55816a.mo22373a(m22462b);
            }
        }
    }
}
