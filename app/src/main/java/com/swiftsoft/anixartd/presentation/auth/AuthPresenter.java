package com.swiftsoft.anixartd.presentation.auth;

import android.util.Patterns;
import android.webkit.URLUtil;
import com.swiftsoft.anixartd.BuildConfig;
import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.database.entity.ProfileToken;
import com.swiftsoft.anixartd.database.entity.User;
import com.swiftsoft.anixartd.network.response.TogglesResponse;
import com.swiftsoft.anixartd.network.response.auth.VkResponse;
import com.swiftsoft.anixartd.p015ui.logic.main.auth.AuthUiLogic;
import com.swiftsoft.anixartd.repository.AuthRepository;
import com.swiftsoft.anixartd.repository.ConfigRepository;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.Schedulers;
import java.util.HashMap;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import moxy.InjectViewState;
import moxy.MvpPresenter;
import org.jetbrains.annotations.NotNull;

/* compiled from: AuthPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/auth/AuthPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/auth/AuthView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class AuthPresenter extends MvpPresenter<AuthView> {

    /* renamed from: a */
    @NotNull
    public AuthRepository f25809a;

    /* renamed from: b */
    @NotNull
    public ConfigRepository f25810b;

    /* renamed from: c */
    @NotNull
    public Prefs f25811c;

    /* renamed from: d */
    @NotNull
    public AuthUiLogic f25812d;

    @Inject
    public AuthPresenter(@NotNull AuthRepository authRepository, @NotNull ConfigRepository configRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(authRepository, "authRepository");
        Intrinsics.m32179h(configRepository, "configRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f25809a = authRepository;
        this.f25810b = configRepository;
        this.f25811c = prefs;
        this.f25812d = new AuthUiLogic();
    }

    /* renamed from: a */
    public final void m14187a() {
        this.f25810b.m15287a().m31370l(new C2548c(new Function1<TogglesResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.AuthPresenter$onUpdateInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(TogglesResponse togglesResponse) {
                TogglesResponse togglesResponse2 = togglesResponse;
                togglesResponse2.getOverrideGPVersion();
                String apiUrl = togglesResponse2.getApiUrl();
                String apiAltUrl = togglesResponse2.getApiAltUrl();
                boolean apiAltAvailable = togglesResponse2.getApiAltAvailable();
                boolean inAppUpdates = togglesResponse2.getInAppUpdates();
                boolean inAppUpdatesImmediate = togglesResponse2.getInAppUpdatesImmediate();
                long inAppUpdatesFlexibleDelay = togglesResponse2.getInAppUpdatesFlexibleDelay();
                int i2 = 0;
                boolean z = URLUtil.isValidUrl(apiUrl) && Patterns.WEB_URL.matcher(apiUrl).matches();
                boolean z2 = URLUtil.isValidUrl(apiAltUrl) && Patterns.WEB_URL.matcher(apiAltUrl).matches();
                AuthPresenter.this.f25811c.m14050F(apiAltAvailable);
                if (z) {
                    AuthPresenter.this.f25811c.m14052H(apiUrl);
                    AuthPresenter.this.f25811c.m14049E(!Intrinsics.m32174c(apiUrl, "https://api.anixart.tv/"));
                }
                if (z2) {
                    AuthPresenter.this.f25811c.m14051G(apiAltUrl);
                    if (!Intrinsics.m32174c(apiAltUrl, "https://api-s2.anixart.tv/") && AuthPresenter.this.f25811c.m14082y()) {
                        AuthPresenter.this.f25811c.m14050F(true);
                    }
                }
                int i3 = BuildConfig.f25343a;
                Boolean EXTENDED_MODE = Boolean.TRUE;
                Intrinsics.m32178g(EXTENDED_MODE, "EXTENDED_MODE");
                int minVersionCode = togglesResponse2.getMinVersionCode();
                int lastVersionCode = togglesResponse2.getLastVersionCode();
                AuthPresenter authPresenter = AuthPresenter.this;
                AuthUiLogic authUiLogic = authPresenter.f25812d;
                if (inAppUpdatesImmediate) {
                    i2 = 1;
                } else if (inAppUpdatesImmediate) {
                    throw new NoWhenBranchMatchedException();
                }
                authUiLogic.f28962b = i2;
                authUiLogic.f28963c = inAppUpdatesFlexibleDelay;
                if (24111318 < minVersionCode) {
                    authPresenter.getViewState().mo14191e0();
                }
                AuthPresenter.this.f25811c.m14054J(lastVersionCode);
                if (inAppUpdates) {
                    AuthPresenter.this.getViewState().mo14192f1();
                }
                return Unit.f63088a;
            }
        }, 0), new C2548c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.AuthPresenter$onUpdateInfo$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 1), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: b */
    public final void m14188b(@NotNull final HashMap<String, Object> hashMap) {
        AuthRepository authRepository = this.f25809a;
        String valueOf = String.valueOf(hashMap.get("accessToken"));
        Objects.requireNonNull(authRepository);
        authRepository.f27325a.signInWithVk(valueOf).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2548c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.AuthPresenter$signInWithVk$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                AuthPresenter.this.getViewState().mo14193h();
                return Unit.f63088a;
            }
        }, 2)).m31365g(new C2547b(this, 0)).m31370l(new C2548c(new Function1<VkResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.AuthPresenter$signInWithVk$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(VkResponse vkResponse) {
                VkResponse vkResponse2 = vkResponse;
                if (vkResponse2.isSuccess()) {
                    Profile profile = vkResponse2.getProfile();
                    ProfileToken profileToken = vkResponse2.getProfileToken();
                    if (profile != null && profileToken != null) {
                        AuthPresenter.this.f25809a.m15277d(profile.getId());
                        AuthPresenter.this.f25809a.m15276c(profile.getPrivilegeLevel());
                        AuthPresenter.this.f25809a.m15278e(profileToken.getToken());
                        AuthPresenter.this.f25809a.m15275b(false);
                        User user = new User();
                        user.setName(profile.getLogin());
                        user.setAvatar(profile.getAvatar());
                        AuthPresenter.this.f25809a.m15274a(user);
                        AuthPresenter.this.getViewState().mo14197t();
                        return Unit.f63088a;
                    }
                }
                int code = vkResponse2.getCode();
                if (code == 2) {
                    AuthPresenter.this.getViewState().mo14190P();
                } else if (code == 3) {
                    AuthPresenter.this.getViewState().mo14189M1(hashMap);
                }
                return Unit.f63088a;
            }
        }, 3), new C2548c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.AuthPresenter$signInWithVk$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                AuthPresenter.this.getViewState().mo14190P();
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 4), Functions.f59621b, Functions.f59622c);
    }
}
