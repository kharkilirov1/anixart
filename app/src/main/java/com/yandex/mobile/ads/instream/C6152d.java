package com.yandex.mobile.ads.instream;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5782t5;
import com.yandex.mobile.ads.impl.nf1;
import com.yandex.mobile.ads.impl.ve1;
import com.yandex.mobile.ads.instream.player.content.VideoPlayerListener;

/* renamed from: com.yandex.mobile.ads.instream.d */
/* loaded from: classes3.dex */
public final class C6152d implements VideoPlayerListener {

    /* renamed from: a */
    @NonNull
    private final C6153e f57445a;

    /* renamed from: b */
    @NonNull
    private final nf1 f57446b;

    /* renamed from: c */
    @NonNull
    private final C6150b f57447c;

    /* renamed from: d */
    @Nullable
    private ve1 f57448d;

    public C6152d(@NonNull C6153e c6153e, @NonNull C6150b c6150b) {
        this.f57445a = c6153e;
        this.f57446b = c6153e.m30392a();
        this.f57447c = c6150b;
    }

    /* renamed from: a */
    public final void m30386a(@Nullable ve1 ve1Var) {
        this.f57448d = ve1Var;
    }

    /* renamed from: b */
    public final void m30387b() {
        int m28463a = C5782t5.m28463a(this.f57446b.m26883a());
        if (m28463a == 1 || m28463a == 2 || m28463a == 3 || m28463a == 4 || m28463a == 6 || m28463a == 7) {
            this.f57446b.m26884a(1);
            ve1 ve1Var = this.f57448d;
            if (ve1Var != null) {
                ve1Var.mo24869a();
            }
        }
    }

    /* renamed from: c */
    public final void m30388c() {
        int m28463a = C5782t5.m28463a(this.f57446b.m26883a());
        if (m28463a == 2 || m28463a == 3) {
            this.f57445a.m30396d();
        }
    }

    /* renamed from: d */
    public final void m30389d() {
        this.f57446b.m26884a(2);
        this.f57445a.m30397e();
    }

    /* renamed from: e */
    public final void m30390e() {
        int m28463a = C5782t5.m28463a(this.f57446b.m26883a());
        if (m28463a == 2 || m28463a == 6) {
            this.f57445a.m30398f();
        }
    }

    /* renamed from: f */
    public final void m30391f() {
        int m28463a = C5782t5.m28463a(this.f57446b.m26883a());
        if (m28463a == 1) {
            this.f57446b.m26884a(1);
        } else if (m28463a == 2 || m28463a == 3 || m28463a == 6) {
            this.f57446b.m26884a(5);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoCompleted() {
        this.f57446b.m26884a(6);
        ve1 ve1Var = this.f57448d;
        if (ve1Var != null) {
            ve1Var.onVideoCompleted();
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoError() {
        this.f57446b.m26884a(8);
        ve1 ve1Var = this.f57448d;
        if (ve1Var != null) {
            ve1Var.onVideoError();
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoPaused() {
        this.f57446b.m26884a(7);
        ve1 ve1Var = this.f57448d;
        if (ve1Var != null) {
            ve1Var.onVideoPaused();
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoPrepared() {
        if (C5782t5.m28464a(2, this.f57446b.m26883a())) {
            this.f57446b.m26884a(3);
            this.f57447c.m30373f();
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoResumed() {
        this.f57446b.m26884a(4);
        ve1 ve1Var = this.f57448d;
        if (ve1Var != null) {
            ve1Var.onVideoResumed();
        }
    }

    /* renamed from: a */
    public final void m30385a() {
        int m28463a = C5782t5.m28463a(this.f57446b.m26883a());
        if (m28463a == 0) {
            this.f57447c.m30374g();
            return;
        }
        if (m28463a == 7) {
            this.f57447c.m30372e();
            return;
        }
        if (m28463a == 4) {
            this.f57445a.m30396d();
            this.f57447c.m30376i();
        } else {
            if (m28463a != 5) {
                return;
            }
            this.f57447c.m30369b();
        }
    }
}
