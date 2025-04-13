package com.yandex.metrica.impl.p023ob;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.yandex.metrica.uiaccessor.C4630a;
import com.yandex.metrica.uiaccessor.InterfaceC4631b;

/* renamed from: com.yandex.metrica.impl.ob.fl */
/* loaded from: classes2.dex */
class C3957fl {

    /* renamed from: com.yandex.metrica.impl.ob.fl$a */
    public class a implements C4630a.a {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC3678Um f45140a;

        public a(C3957fl c3957fl, InterfaceC3678Um interfaceC3678Um) {
            this.f45140a = interfaceC3678Um;
        }

        @Override // com.yandex.metrica.uiaccessor.C4630a.a
        public void fragmentAttached(@NonNull Activity activity) {
            this.f45140a.mo17875b(activity);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.fl$b */
    public class b implements InterfaceC4631b {
        public b(C3957fl c3957fl) {
        }

        @Override // com.yandex.metrica.uiaccessor.InterfaceC4631b
        public void subscribe(@NonNull Activity activity) throws Throwable {
        }

        @Override // com.yandex.metrica.uiaccessor.InterfaceC4631b
        public void unsubscribe(@NonNull Activity activity) throws Throwable {
        }
    }

    @NonNull
    /* renamed from: a */
    public InterfaceC4631b m19916a(@NonNull InterfaceC3678Um<Activity> interfaceC3678Um) {
        C4630a c4630a;
        try {
            c4630a = new C4630a(new a(this, interfaceC3678Um));
        } catch (Throwable unused) {
            c4630a = null;
        }
        return c4630a == null ? new b(this) : c4630a;
    }
}
