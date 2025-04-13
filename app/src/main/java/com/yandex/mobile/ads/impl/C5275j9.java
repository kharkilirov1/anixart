package com.yandex.mobile.ads.impl;

import com.yandex.metrica.C4484p;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.j9 */
/* loaded from: classes3.dex */
public final class C5275j9 {

    /* renamed from: a */
    @NotNull
    private final Executor f51533a;

    /* renamed from: com.yandex.mobile.ads.impl.j9$a */
    public interface a {
        /* renamed from: a */
        void mo25820a(@Nullable String str);

        /* renamed from: b */
        void mo25821b(@Nullable String str);
    }

    public C5275j9(@NotNull Executor executor) {
        Intrinsics.m32179h(executor, "executor");
        this.f51533a = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m25817b(a listener) {
        Intrinsics.m32179h(listener, "$listener");
        try {
            C4484p.guc(new C4856bc(listener), true);
        } catch (Throwable th) {
            listener.mo25821b(th.getMessage());
        }
    }

    /* renamed from: a */
    public final void m25819a(@NotNull a listener) {
        Intrinsics.m32179h(listener, "listener");
        this.f51533a.execute(new gp1(listener, 6));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C5275j9() {
        /*
            r2 = this;
            com.yandex.mobile.ads.impl.o80 r0 = com.yandex.mobile.ads.impl.o80.m27018a()
            java.util.concurrent.Executor r0 = r0.m27019b()
            java.lang.String r1 = "getInstance().loadingExecutor"
            kotlin.jvm.internal.Intrinsics.m32178g(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5275j9.<init>():void");
    }
}
