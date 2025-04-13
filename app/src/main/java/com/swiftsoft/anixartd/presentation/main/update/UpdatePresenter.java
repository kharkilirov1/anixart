package com.swiftsoft.anixartd.presentation.main.update;

import com.swiftsoft.anixartd.BuildConfig;
import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.network.response.TogglesResponse;
import com.swiftsoft.anixartd.presentation.auth.restore.C2549a;
import com.swiftsoft.anixartd.presentation.main.search.C2622b;
import com.swiftsoft.anixartd.repository.ConfigRepository;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import moxy.InjectViewState;
import moxy.MvpPresenter;
import org.jetbrains.annotations.NotNull;

/* compiled from: UpdatePresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/update/UpdatePresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/update/UpdateView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class UpdatePresenter extends MvpPresenter<UpdateView> {

    /* renamed from: a */
    @NotNull
    public ConfigRepository f27272a;

    /* renamed from: b */
    @NotNull
    public Prefs f27273b;

    @Inject
    public UpdatePresenter(@NotNull ConfigRepository configRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(configRepository, "configRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f27272a = configRepository;
        this.f27273b = prefs;
    }

    /* renamed from: a */
    public final void m15250a() {
        this.f27272a.m15287a().m31367i(new C2622b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.update.UpdatePresenter$onUpdate$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                UpdatePresenter.this.getViewState().mo15252b();
                return Unit.f63088a;
            }
        }, 10)).m31365g(new C2549a(this, 20)).m31370l(new C2622b(new Function1<TogglesResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.update.UpdatePresenter$onUpdate$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(TogglesResponse togglesResponse) {
                TogglesResponse togglesResponse2 = togglesResponse;
                boolean overrideGPVersion = togglesResponse2.getOverrideGPVersion();
                int i2 = BuildConfig.f25343a;
                Boolean EXTENDED_MODE = Boolean.TRUE;
                Intrinsics.m32178g(EXTENDED_MODE, "EXTENDED_MODE");
                int minVersionCode = togglesResponse2.getMinVersionCode();
                int lastVersionCode = togglesResponse2.getLastVersionCode();
                String whatsNew = togglesResponse2.getWhatsNew();
                String downloadLink = togglesResponse2.getDownloadLink();
                UpdatePresenter.this.f27273b.m14054J(lastVersionCode);
                UpdatePresenter.this.getViewState().mo15254g4(overrideGPVersion, minVersionCode, lastVersionCode, whatsNew, downloadLink);
                return Unit.f63088a;
            }
        }, 11), new C2622b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.update.UpdatePresenter$onUpdate$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                UpdatePresenter.this.getViewState().mo15253c();
                return Unit.f63088a;
            }
        }, 12), Functions.f59621b, Functions.f59622c);
    }
}
