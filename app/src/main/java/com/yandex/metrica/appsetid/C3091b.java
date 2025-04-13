package com.yandex.metrica.appsetid;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.internal.appset.zzr;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.metrica.appsetid.b */
/* loaded from: classes2.dex */
public final class C3091b implements InterfaceC3093d {

    /* renamed from: a */
    public final Object f42299a = new Object();

    /* renamed from: b */
    public final List<OnCompleteListener<AppSetIdInfo>> f42300b = new ArrayList();

    /* renamed from: com.yandex.metrica.appsetid.b$a */
    public static final class a<TResult> implements OnCompleteListener<AppSetIdInfo> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC3090a f42302b;

        public a(InterfaceC3090a interfaceC3090a) {
            this.f42302b = interfaceC3090a;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(@NotNull Task<AppSetIdInfo> it) {
            synchronized (C3091b.this.f42299a) {
                C3091b c3091b = C3091b.this;
                List<OnCompleteListener<AppSetIdInfo>> list = c3091b.f42300b;
                if (list == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
                }
                TypeIntrinsics.m32212a(list).remove(c3091b);
            }
            Intrinsics.m32178g(it, "it");
            if (!it.mo9712q()) {
                this.f42302b.mo17776a(it.mo9707l());
                return;
            }
            InterfaceC3090a interfaceC3090a = this.f42302b;
            AppSetIdInfo mo9708m = it.mo9708m();
            Intrinsics.m32178g(mo9708m, "it.result");
            String str = mo9708m.f15010a;
            C3091b c3091b2 = C3091b.this;
            AppSetIdInfo mo9708m2 = it.mo9708m();
            Intrinsics.m32178g(mo9708m2, "it.result");
            int i2 = mo9708m2.f15011b;
            Objects.requireNonNull(c3091b2);
            interfaceC3090a.mo17775a(str, i2 != 1 ? i2 != 2 ? EnumC3092c.UNKNOWN : EnumC3092c.DEVELOPER : EnumC3092c.APP);
        }
    }

    @Override // com.yandex.metrica.appsetid.InterfaceC3093d
    /* renamed from: a */
    public void mo17777a(@NotNull Context context, @NotNull InterfaceC3090a interfaceC3090a) throws Throwable {
        Task<AppSetIdInfo> mo7830a = new zzr(context).mo7830a();
        Intrinsics.m32178g(mo7830a, "client.appSetIdInfo");
        a aVar = new a(interfaceC3090a);
        synchronized (this.f42299a) {
            this.f42300b.add(aVar);
        }
        mo7830a.mo9698c(aVar);
    }
}
