package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.tf1;
import com.yandex.mobile.ads.impl.uf1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ib1 implements uf1 {

    /* renamed from: a */
    @NotNull
    private final Context f51269a;

    /* renamed from: b */
    @NotNull
    private final hc1<?> f51270b;

    /* renamed from: c */
    @NotNull
    private final EnumC5778t1 f51271c;

    /* renamed from: d */
    @NotNull
    private final rf1 f51272d;

    /* renamed from: e */
    @Nullable
    private AbstractC5566p5 f51273e;

    /* renamed from: f */
    @Nullable
    private ib0 f51274f;

    /* renamed from: g */
    @Nullable
    private C5263j2 f51275g;

    /* renamed from: h */
    private boolean f51276h;

    public ib1(@NotNull Context context, @NotNull hc1<?> videoAdInfo, @NotNull EnumC5778t1 adBreakPosition, @NotNull rf1 eventsTracker) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        Intrinsics.m32179h(adBreakPosition, "adBreakPosition");
        Intrinsics.m32179h(eventsTracker, "eventsTracker");
        this.f51269a = context;
        this.f51270b = videoAdInfo;
        this.f51271c = adBreakPosition;
        this.f51272d = eventsTracker;
    }

    /* renamed from: a */
    public static final void m25501a(ib1 ib1Var, cb1 cb1Var) {
        Objects.requireNonNull(ib1Var);
        Map<String, String> m32063h = MapsKt.m32063h(new Pair("[REASON]", String.valueOf(bb1.m22787a(cb1Var.m23187a()))));
        rf1 rf1Var = ib1Var.f51272d;
        ab1 m23188b = cb1Var.m23188b();
        Intrinsics.m32178g(m23188b, "exception.verification");
        rf1Var.m27920a(m23188b, "verificationNotExecuted", m32063h);
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: a */
    public final void mo25502a() {
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: b */
    public final void mo25509b() {
        ib0 ib0Var = this.f51274f;
        if (ib0Var != null) {
            try {
                if (this.f51276h) {
                    return;
                }
                ib0Var.m25494d();
            } catch (Exception e2) {
                n60.m26808a(e2, e2.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: c */
    public final void mo25510c() {
        ib0 ib0Var = this.f51274f;
        if (ib0Var != null) {
            try {
                if (this.f51276h) {
                    return;
                }
                ib0Var.m25498h();
            } catch (Exception e2) {
                n60.m26808a(e2, e2.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: d */
    public final void mo25511d() {
        ib0 ib0Var = this.f51274f;
        if (ib0Var != null) {
            try {
                if (this.f51276h) {
                    return;
                }
                ib0Var.m25497g();
            } catch (Exception e2) {
                n60.m26808a(e2, e2.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: e */
    public final void mo25512e() {
        ib0 ib0Var = this.f51274f;
        if (ib0Var != null) {
            try {
                if (this.f51276h) {
                    return;
                }
                ib0Var.m25499i();
            } catch (Exception e2) {
                n60.m26808a(e2, e2.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: f */
    public final void mo25513f() {
        ib0 ib0Var = this.f51274f;
        if (ib0Var != null) {
            try {
                if (this.f51276h) {
                    return;
                }
                ib0Var.m25493c();
            } catch (Exception e2) {
                n60.m26808a(e2, e2.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: g */
    public final void mo25514g() {
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: h */
    public final void mo25515h() {
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: i */
    public final void mo25516i() {
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: j */
    public final void mo25517j() {
        ib0 ib0Var = this.f51274f;
        if (ib0Var != null) {
            try {
                if (this.f51276h) {
                    return;
                }
                ib0Var.m25491b();
            } catch (Exception e2) {
                n60.m26808a(e2, e2.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: k */
    public final void mo25518k() {
        AbstractC5566p5 abstractC5566p5 = this.f51273e;
        if (abstractC5566p5 != null) {
            try {
                if (this.f51276h) {
                    return;
                }
                abstractC5566p5.mo27165a();
                this.f51273e = null;
                this.f51274f = null;
                this.f51275g = null;
                this.f51276h = true;
            } catch (Exception e2) {
                n60.m26808a(e2, e2.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: l */
    public final void mo25519l() {
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: m */
    public final void mo25520m() {
        ib0 ib0Var = this.f51274f;
        if (ib0Var != null) {
            try {
                if (this.f51276h) {
                    return;
                }
                ib0Var.m25489a();
            } catch (Exception e2) {
                n60.m26808a(e2, e2.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: n */
    public final void mo25521n() {
        C5263j2 c5263j2 = this.f51275g;
        if (c5263j2 != null) {
            try {
                if (this.f51276h) {
                    return;
                }
                c5263j2.m25762a();
            } catch (Exception e2) {
                n60.m26808a(e2, e2.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: a */
    public final void mo25506a(@NotNull ed1 ed1Var) {
        uf1.C5859a.m28991a(ed1Var);
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: a */
    public final void mo25505a(@NotNull View view, @NotNull List<fc1> friendlyOverlays) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(friendlyOverlays, "friendlyOverlays");
        mo25518k();
        this.f51276h = false;
        hc1<?> hc1Var = this.f51270b;
        try {
            Context context = this.f51269a;
            ArrayList m27265d = hc1Var.m25120e().m27265d();
            Intrinsics.m32178g(m27265d, "videoAdInfo.vastVideoAd.adVerifications");
            eo0 m24719a = new fo0(context, new hb1(this)).m24719a(m27265d);
            if (m24719a != null) {
                AbstractC5566p5 m24222b = m24719a.m24222b();
                m24222b.mo27166a(view);
                this.f51273e = m24222b;
                this.f51274f = m24719a.m24223c();
                this.f51275g = m24719a.m24221a();
            }
        } catch (Exception e2) {
            n60.m26808a(e2, e2.getMessage(), new Object[0]);
        }
        AbstractC5566p5 abstractC5566p5 = this.f51273e;
        if (abstractC5566p5 != null) {
            for (fc1 fc1Var : friendlyOverlays) {
                View m24545c = fc1Var.m24545c();
                if (m24545c != null) {
                    try {
                        abstractC5566p5.mo27167a(m24545c, tn0.m28693a(fc1Var.m24544b()), fc1Var.m24543a());
                    } catch (Exception e3) {
                        n60.m26808a(e3, e3.getMessage(), new Object[0]);
                    }
                }
            }
        }
        AbstractC5566p5 abstractC5566p52 = this.f51273e;
        if (abstractC5566p52 != null) {
            try {
                if (!this.f51276h) {
                    abstractC5566p52.mo27168b();
                }
            } catch (Exception e4) {
                n60.m26808a(e4, e4.getMessage(), new Object[0]);
            }
        }
        hc1<?> hc1Var2 = this.f51270b;
        C5263j2 c5263j2 = this.f51275g;
        if (c5263j2 != null) {
            try {
                if (this.f51276h) {
                    return;
                }
                oa1 m25352a = ho0.m25352a(hc1Var2.m25116a(), this.f51271c);
                Intrinsics.m32178g(m25352a, "create(videoAdInfo.creative, adBreakPosition)");
                c5263j2.m25763a(m25352a);
            } catch (Exception e5) {
                n60.m26808a(e5, e5.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: a */
    public final void mo25508a(@NotNull String assetName) {
        Intrinsics.m32179h(assetName, "assetName");
        mo25520m();
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: a */
    public final void mo25504a(long j2) {
        ib0 ib0Var = this.f51274f;
        if (ib0Var != null) {
            try {
                if (this.f51276h) {
                    return;
                }
                ib0Var.m25490a(j2 / 1000);
            } catch (Exception e2) {
                n60.m26808a(e2, e2.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: a */
    public final void mo25507a(@NotNull tf1.EnumC5800a quartile) {
        Intrinsics.m32179h(quartile, "quartile");
        ib0 ib0Var = this.f51274f;
        if (ib0Var != null) {
            try {
                if (!this.f51276h) {
                    int ordinal = quartile.ordinal();
                    if (ordinal == 0) {
                        ib0Var.m25495e();
                    } else if (ordinal == 1) {
                        ib0Var.m25496f();
                    } else if (ordinal == 2) {
                        ib0Var.m25500j();
                    }
                }
            } catch (Exception e2) {
                n60.m26808a(e2, e2.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: a */
    public final void mo25503a(float f2) {
        ib0 ib0Var = this.f51274f;
        if (ib0Var != null) {
            try {
                if (this.f51276h) {
                    return;
                }
                ib0Var.m25492b(f2);
            } catch (Exception e2) {
                n60.m26808a(e2, e2.getMessage(), new Object[0]);
            }
        }
    }
}
