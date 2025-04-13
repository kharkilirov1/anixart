package com.swiftsoft.anixartd.presentation.auth.signin;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.database.entity.ProfileToken;
import com.swiftsoft.anixartd.database.entity.User;
import com.swiftsoft.anixartd.network.response.auth.SignInResponse;
import com.swiftsoft.anixartd.presentation.auth.C2548c;
import com.swiftsoft.anixartd.presentation.auth.restore.C2549a;
import com.swiftsoft.anixartd.repository.AuthRepository;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.Schedulers;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import moxy.InjectViewState;
import moxy.MvpPresenter;
import org.jetbrains.annotations.NotNull;

/* compiled from: SignInPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/auth/signin/SignInPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/auth/signin/SignInView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SignInPresenter extends MvpPresenter<SignInView> {

    /* renamed from: a */
    @NotNull
    public AuthRepository f25865a;

    /* renamed from: b */
    @NotNull
    public Prefs f25866b;

    @Inject
    public SignInPresenter(@NotNull AuthRepository authRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(authRepository, "authRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f25865a = authRepository;
        this.f25866b = prefs;
    }

    /* renamed from: a */
    public final void m14224a(@NotNull String str, @NotNull String str2) {
        boolean z;
        int i2 = 1;
        boolean z2 = false;
        if (str.length() == 0) {
            getViewState().mo14226L();
            z = false;
        } else {
            z = true;
        }
        if (str2.length() < 6 || str2.length() > 32) {
            getViewState().mo14227Z();
        } else {
            z2 = z;
        }
        if (z2) {
            AuthRepository authRepository = this.f25865a;
            Objects.requireNonNull(authRepository);
            authRepository.f27325a.signIn(str, str2).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2548c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.signin.SignInPresenter$onSignIn$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Disposable disposable) {
                    SignInPresenter.this.getViewState().mo14228h();
                    return Unit.f63088a;
                }
            }, 17)).m31365g(new C2549a(this, i2)).m31370l(new C2548c(new Function1<SignInResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.signin.SignInPresenter$onSignIn$3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(SignInResponse signInResponse) {
                    SignInResponse signInResponse2 = signInResponse;
                    Profile profile = signInResponse2.getProfile();
                    ProfileToken profileToken = signInResponse2.getProfileToken();
                    if (!signInResponse2.isSuccess() || profile == null || profileToken == null) {
                        int code = signInResponse2.getCode();
                        if (code == 2) {
                            SignInPresenter.this.getViewState().mo14230r();
                        } else if (code == 3) {
                            SignInPresenter.this.getViewState().mo14231z();
                        }
                    } else {
                        SignInPresenter.this.f25865a.m15277d(profile.getId());
                        SignInPresenter.this.f25865a.m15276c(profile.getId());
                        SignInPresenter.this.f25865a.m15278e(profileToken.getToken());
                        SignInPresenter.this.f25865a.m15275b(false);
                        User user = new User();
                        user.setName(profile.getLogin());
                        user.setAvatar(profile.getAvatar());
                        SignInPresenter.this.f25865a.m15274a(user);
                        SignInView viewState = SignInPresenter.this.getViewState();
                        Intrinsics.m32178g(viewState, "viewState");
                        viewState.mo14232z3(false);
                    }
                    return Unit.f63088a;
                }
            }, 18), new C2548c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.signin.SignInPresenter$onSignIn$4
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Throwable th) {
                    Throwable th2 = th;
                    SignInView viewState = SignInPresenter.this.getViewState();
                    String localizedMessage = th2.getLocalizedMessage();
                    Intrinsics.m32178g(localizedMessage, "it.localizedMessage");
                    viewState.mo14225E(localizedMessage);
                    th2.printStackTrace();
                    return Unit.f63088a;
                }
            }, 19), Functions.f59621b, Functions.f59622c);
        }
    }
}
