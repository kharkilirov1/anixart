package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.yandex.metrica.impl.p022ac.CrashpadServiceHelper;
import java.io.File;

@RequiresApi
/* renamed from: com.yandex.metrica.impl.ob.d8 */
/* loaded from: classes2.dex */
public class C3892d8 implements InterfaceC3489N7<C3788Z7> {

    /* renamed from: a */
    @NonNull
    private final C3938f2 f44911a;

    /* renamed from: com.yandex.metrica.impl.ob.d8$a */
    public class a implements InterfaceC3703Vm<String, C4066k0> {

        /* renamed from: a */
        public final /* synthetic */ C3788Z7 f44912a;

        public a(C3892d8 c3892d8, C3788Z7 c3788z7) {
            this.f44912a = c3788z7;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3703Vm
        /* renamed from: a */
        public C4066k0 mo17917a(String str) {
            return C3382J0.m18363a(str, AbstractC4478zm.m21313b(this.f44912a.f44632b.m17919a())).m20200c(this.f44912a.f44633c.f46062a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.d8$b */
    public class b implements InterfaceC3703Vm<String, C4066k0> {

        /* renamed from: a */
        public final /* synthetic */ C3788Z7 f44913a;

        public b(C3892d8 c3892d8, C3788Z7 c3788z7) {
            this.f44913a = c3788z7;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3703Vm
        /* renamed from: a */
        public C4066k0 mo17917a(String str) {
            return C3382J0.m18369b(str, AbstractC4478zm.m21313b(this.f44913a.f44632b.m17919a())).m20200c(this.f44913a.f44633c.f46062a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.d8$c */
    public static class c implements InterfaceC3678Um<File> {

        /* renamed from: a */
        @NonNull
        private final String f44914a;

        public c(@NonNull String str) {
            this.f44914a = str;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3678Um
        /* renamed from: b */
        public void mo17875b(File file) {
            CrashpadServiceHelper.m17803a(this.f44914a);
        }
    }

    public C3892d8(@NonNull C3938f2 c3938f2) {
        this.f44911a = c3938f2;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3489N7
    /* renamed from: a */
    public void mo18610a(@NonNull C3788Z7 c3788z7) {
        C3788Z7 c3788z72 = c3788z7;
        this.f44911a.m19840a(c3788z72, new b(this, c3788z72));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3489N7
    /* renamed from: b */
    public void mo18611b(@NonNull C3788Z7 c3788z7) {
        C3788Z7 c3788z72 = c3788z7;
        this.f44911a.m19840a(c3788z72, new a(this, c3788z72));
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    public void a2(@NonNull C3788Z7 c3788z7) {
        this.f44911a.m19840a(c3788z7, new a(this, c3788z7));
    }

    /* renamed from: b, reason: avoid collision after fix types in other method */
    public void b2(@NonNull C3788Z7 c3788z7) {
        this.f44911a.m19840a(c3788z7, new b(this, c3788z7));
    }
}
