package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.dl0;
import com.yandex.mobile.ads.impl.dm0;
import com.yandex.mobile.ads.impl.qk0;
import com.yandex.mobile.ads.impl.wj0;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class bk0 {

    /* renamed from: a */
    @NonNull
    private final wj0 f48911a;

    /* renamed from: b */
    @NonNull
    private final dl0 f48912b;

    /* renamed from: c */
    @NonNull
    private final dm0 f48913c = new dm0();

    @AnyThread
    /* renamed from: com.yandex.mobile.ads.impl.bk0$a */
    public interface InterfaceC4873a {
        /* renamed from: b */
        void mo22854b();
    }

    /* renamed from: com.yandex.mobile.ads.impl.bk0$b */
    public static class C4874b implements wj0.InterfaceC5975a, dl0.InterfaceC4976a, qk0.InterfaceC5645b, dm0.InterfaceC4979a {

        /* renamed from: a */
        @NonNull
        private final AtomicInteger f48914a = new AtomicInteger(3);

        /* renamed from: b */
        @NonNull
        private final InterfaceC4873a f48915b;

        public C4874b(@NonNull fk0 fk0Var) {
            this.f48915b = fk0Var;
        }

        @Override // com.yandex.mobile.ads.impl.qk0.InterfaceC5645b
        /* renamed from: a */
        public final void mo22855a() {
            if (this.f48914a.decrementAndGet() == 0) {
                this.f48915b.mo22854b();
            }
        }

        /* renamed from: b */
        public final void m22856b() {
            if (this.f48914a.decrementAndGet() == 0) {
                this.f48915b.mo22854b();
            }
        }

        /* renamed from: c */
        public final void m22857c() {
            if (this.f48914a.decrementAndGet() == 0) {
                this.f48915b.mo22854b();
            }
        }

        /* renamed from: d */
        public final void m22858d() {
            if (this.f48914a.decrementAndGet() == 0) {
                this.f48915b.mo22854b();
            }
        }
    }

    public bk0(@NonNull Context context, @NonNull C5724s3 c5724s3) {
        this.f48911a = new wj0(context, c5724s3);
        this.f48912b = new dl0(context, c5724s3);
    }

    /* renamed from: a */
    public final void m22853a(@NonNull Context context, @NonNull kh0 kh0Var, @NonNull sp0 sp0Var, @NonNull fk0 fk0Var) {
        C4874b c4874b = new C4874b(fk0Var);
        this.f48912b.m23906a(kh0Var, c4874b);
        this.f48911a.m29489a(kh0Var, sp0Var, c4874b);
        this.f48913c.m23907a(context, kh0Var, c4874b);
    }

    /* renamed from: a */
    public final void m22852a() {
        this.f48912b.m23905a();
        Objects.requireNonNull(this.f48911a);
        Objects.requireNonNull(this.f48913c);
    }
}
