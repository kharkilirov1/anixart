package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.a2 */
/* loaded from: classes2.dex */
public class C3808a2 {

    /* renamed from: com.yandex.metrica.impl.ob.a2$a */
    public class a implements InterfaceC3976ge {

        /* renamed from: a */
        public final /* synthetic */ C3950fe f44716a;

        public a(C3808a2 c3808a2, C3950fe c3950fe) {
            this.f44716a = c3950fe;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3976ge
        /* renamed from: a */
        public boolean mo19401a(@NonNull Context context) {
            Objects.requireNonNull(this.f44716a);
            return false;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.a2$b */
    public class b implements InterfaceC3976ge {

        /* renamed from: a */
        public final /* synthetic */ C3950fe f44717a;

        public b(C3808a2 c3808a2, C3950fe c3950fe) {
            this.f44717a = c3950fe;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3976ge
        /* renamed from: a */
        public boolean mo19401a(@NonNull Context context) {
            return this.f44717a.m19900a(context) && this.f44717a.m19902c(context);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.a2$c */
    public class c implements InterfaceC3976ge {

        /* renamed from: a */
        public final /* synthetic */ C3950fe f44718a;

        public c(C3808a2 c3808a2, C3950fe c3950fe) {
            this.f44718a = c3950fe;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3976ge
        /* renamed from: a */
        public boolean mo19401a(@NonNull Context context) {
            return this.f44718a.m19902c(context);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.a2$d */
    public class d implements InterfaceC3976ge {

        /* renamed from: a */
        public final /* synthetic */ C3950fe f44719a;

        public d(C3808a2 c3808a2, C3950fe c3950fe) {
            this.f44719a = c3950fe;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3976ge
        /* renamed from: a */
        public boolean mo19401a(@NonNull Context context) {
            Objects.requireNonNull(this.f44719a);
            return false;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.a2$e */
    public class e implements InterfaceC3976ge {

        /* renamed from: a */
        public final /* synthetic */ C3950fe f44720a;

        public e(C3808a2 c3808a2, C3950fe c3950fe) {
            this.f44720a = c3950fe;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3976ge
        /* renamed from: a */
        public boolean mo19401a(@NonNull Context context) {
            if (!this.f44720a.m19900a(context)) {
                return false;
            }
            Objects.requireNonNull(this.f44720a);
            return false;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.a2$f */
    public class f implements InterfaceC3976ge {

        /* renamed from: a */
        public final /* synthetic */ C3950fe f44721a;

        public f(C3808a2 c3808a2, C3950fe c3950fe) {
            this.f44721a = c3950fe;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3976ge
        /* renamed from: a */
        public boolean mo19401a(@NonNull Context context) {
            Objects.requireNonNull(this.f44721a);
            return false;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.a2$g */
    public class g implements InterfaceC3976ge {

        /* renamed from: a */
        public final /* synthetic */ C3950fe f44722a;

        public g(C3808a2 c3808a2, C3950fe c3950fe) {
            this.f44722a = c3950fe;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3976ge
        /* renamed from: a */
        public boolean mo19401a(@NonNull Context context) {
            Objects.requireNonNull(this.f44722a);
            return false;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.a2$h */
    public class h implements InterfaceC3976ge {

        /* renamed from: a */
        public final /* synthetic */ C3950fe f44723a;

        public h(C3808a2 c3808a2, C3950fe c3950fe) {
            this.f44723a = c3950fe;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3976ge
        /* renamed from: a */
        public boolean mo19401a(@NonNull Context context) {
            return this.f44723a.m19900a(context);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.a2$i */
    public class i implements InterfaceC3976ge {

        /* renamed from: a */
        public final /* synthetic */ C3950fe f44724a;

        public i(C3808a2 c3808a2, C3950fe c3950fe) {
            this.f44724a = c3950fe;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3976ge
        /* renamed from: a */
        public boolean mo19401a(@NonNull Context context) {
            return this.f44724a.m19900a(context);
        }
    }

    @NonNull
    /* renamed from: a */
    public InterfaceC3976ge m19563a(@NonNull C3950fe c3950fe) {
        return new i(this, c3950fe);
    }

    @NonNull
    /* renamed from: b */
    public InterfaceC3976ge m19564b(@NonNull C3950fe c3950fe) {
        return new h(this, c3950fe);
    }

    @NonNull
    /* renamed from: c */
    public InterfaceC3976ge m19565c(@NonNull C3950fe c3950fe) {
        return new g(this, c3950fe);
    }

    @NonNull
    /* renamed from: d */
    public InterfaceC3976ge m19566d(@NonNull C3950fe c3950fe) {
        return C3658U2.m19211a(29) ? new a(this, c3950fe) : C3658U2.m19211a(23) ? new b(this, c3950fe) : new c(this, c3950fe);
    }

    @NonNull
    /* renamed from: e */
    public InterfaceC3976ge m19567e(@NonNull C3950fe c3950fe) {
        return C3658U2.m19211a(29) ? new d(this, c3950fe) : C3658U2.m19211a(23) ? new e(this, c3950fe) : new f(this, c3950fe);
    }
}
