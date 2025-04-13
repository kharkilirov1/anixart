package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ks0 implements InterfaceC5338ki {

    /* renamed from: a */
    @NotNull
    private final View f52128a;

    /* renamed from: b */
    @NotNull
    private final ProgressBar f52129b;

    /* renamed from: c */
    @NotNull
    private final InterfaceC5187hi f52130c;

    /* renamed from: d */
    @NotNull
    private final C5691ri f52131d;

    /* renamed from: e */
    @NotNull
    private final InterfaceC5449mm f52132e;

    /* renamed from: f */
    private final long f52133f;

    /* renamed from: g */
    @NotNull
    private final lp0 f52134g;

    /* renamed from: h */
    @NotNull
    private final mp0 f52135h;

    /* renamed from: i */
    @NotNull
    private final n61 f52136i;

    /* renamed from: com.yandex.mobile.ads.impl.ks0$a */
    public static final class C5355a implements n61 {

        /* renamed from: a */
        @NotNull
        private final C5691ri f52137a;

        /* renamed from: b */
        private final long f52138b;

        /* renamed from: c */
        @NotNull
        private final WeakReference<ProgressBar> f52139c;

        public C5355a(@NotNull ProgressBar progressView, @NotNull C5691ri closeProgressAppearanceController, long j2) {
            Intrinsics.m32179h(progressView, "progressView");
            Intrinsics.m32179h(closeProgressAppearanceController, "closeProgressAppearanceController");
            this.f52137a = closeProgressAppearanceController;
            this.f52138b = j2;
            this.f52139c = new WeakReference<>(progressView);
        }

        @Override // com.yandex.mobile.ads.impl.n61
        /* renamed from: a */
        public final void mo26253a(long j2) {
            ProgressBar progressBar = this.f52139c.get();
            if (progressBar != null) {
                C5691ri c5691ri = this.f52137a;
                long j3 = this.f52138b;
                c5691ri.m27927a(progressBar, j3, j3 - j2);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ks0$b */
    public static final class C5356b implements mp0 {

        /* renamed from: a */
        @NotNull
        private final InterfaceC5187hi f52140a;

        /* renamed from: b */
        @NotNull
        private final InterfaceC5449mm f52141b;

        /* renamed from: c */
        @NotNull
        private final WeakReference<View> f52142c;

        public C5356b(@NotNull View closeView, @NotNull C5197hr closeAppearanceController, @NotNull InterfaceC5449mm debugEventsReporter) {
            Intrinsics.m32179h(closeView, "closeView");
            Intrinsics.m32179h(closeAppearanceController, "closeAppearanceController");
            Intrinsics.m32179h(debugEventsReporter, "debugEventsReporter");
            this.f52140a = closeAppearanceController;
            this.f52141b = debugEventsReporter;
            this.f52142c = new WeakReference<>(closeView);
        }

        @Override // com.yandex.mobile.ads.impl.mp0
        /* renamed from: a */
        public final void mo24218a() {
            View view = this.f52142c.get();
            if (view != null) {
                this.f52140a.mo22526b(view);
                this.f52141b.mo26690a(EnumC5404lm.f52454d);
            }
        }
    }

    public ks0(@NotNull View closeButton, @NotNull ProgressBar closeProgressView, @NotNull C5197hr closeAppearanceController, @NotNull C5691ri closeProgressAppearanceController, @NotNull InterfaceC5449mm debugEventsReporter, long j2) {
        Intrinsics.m32179h(closeButton, "closeButton");
        Intrinsics.m32179h(closeProgressView, "closeProgressView");
        Intrinsics.m32179h(closeAppearanceController, "closeAppearanceController");
        Intrinsics.m32179h(closeProgressAppearanceController, "closeProgressAppearanceController");
        Intrinsics.m32179h(debugEventsReporter, "debugEventsReporter");
        this.f52128a = closeButton;
        this.f52129b = closeProgressView;
        this.f52130c = closeAppearanceController;
        this.f52131d = closeProgressAppearanceController;
        this.f52132e = debugEventsReporter;
        this.f52133f = j2;
        this.f52134g = new lp0(true);
        this.f52135h = new C5356b(closeButton, closeAppearanceController, debugEventsReporter);
        this.f52136i = new C5355a(closeProgressView, closeProgressAppearanceController, j2);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5338ki
    /* renamed from: a */
    public final void mo25880a() {
        this.f52134g.m26517d();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5338ki
    /* renamed from: a */
    public final void mo25881a(boolean z) {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5338ki
    /* renamed from: b */
    public final void mo25882b() {
        this.f52134g.m26516b();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5338ki
    /* renamed from: c */
    public final void mo25883c() {
        C5691ri c5691ri = this.f52131d;
        ProgressBar progressBar = this.f52129b;
        int i2 = (int) this.f52133f;
        Objects.requireNonNull(c5691ri);
        C5691ri.m27926a(progressBar, i2);
        this.f52130c.mo22525a(this.f52128a);
        this.f52134g.m26515a(this.f52136i);
        this.f52134g.m26514a(this.f52133f, this.f52135h);
        this.f52132e.mo26690a(EnumC5404lm.f52453c);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5338ki
    @NotNull
    /* renamed from: d */
    public final View mo25884d() {
        return this.f52128a;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5338ki
    public final void invalidate() {
        this.f52134g.m26513a();
    }
}
