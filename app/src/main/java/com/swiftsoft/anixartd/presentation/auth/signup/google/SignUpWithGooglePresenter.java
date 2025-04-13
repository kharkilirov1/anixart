package com.swiftsoft.anixartd.presentation.auth.signup.google;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.database.entity.ProfileToken;
import com.swiftsoft.anixartd.database.entity.User;
import com.swiftsoft.anixartd.network.response.auth.GoogleResponse;
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

/* compiled from: SignUpWithGooglePresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/auth/signup/google/SignUpWithGooglePresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/auth/signup/google/SignUpWithGoogleView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SignUpWithGooglePresenter extends MvpPresenter<SignUpWithGoogleView> {

    /* renamed from: a */
    @NotNull
    public AuthRepository f25888a;

    @Inject
    public SignUpWithGooglePresenter(@NotNull AuthRepository authRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(authRepository, "authRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f25888a = authRepository;
    }

    /* renamed from: a */
    public final void m14252a(@NotNull final String str, @NotNull final String str2, @NotNull final String googleIdToken) {
        boolean z;
        Intrinsics.m32179h(googleIdToken, "googleIdToken");
        boolean z2 = false;
        if (str.length() == 0) {
            getViewState().mo14256L();
            z = false;
        } else {
            z = true;
        }
        if (str2.length() == 0) {
            getViewState().mo14260b0();
        } else {
            z2 = z;
        }
        if (z2) {
            AuthRepository authRepository = this.f25888a;
            Objects.requireNonNull(authRepository);
            authRepository.f27325a.signUpWithGoogle(str, str2, googleIdToken).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2548c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGooglePresenter$onSignUpWithGoogle$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Disposable disposable) {
                    SignUpWithGooglePresenter.this.getViewState().mo14261h();
                    return Unit.f63088a;
                }
            }, 23)).m31365g(new C2549a(this, 3)).m31370l(new C2548c(new Function1<GoogleResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGooglePresenter$onSignUpWithGoogle$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(GoogleResponse googleResponse) {
                    GoogleResponse googleResponse2 = googleResponse;
                    if (googleResponse2.isSuccess()) {
                        Profile profile = googleResponse2.getProfile();
                        ProfileToken profileToken = googleResponse2.getProfileToken();
                        if (googleResponse2.isSuccess() && profile != null && profileToken != null) {
                            SignUpWithGooglePresenter.this.f25888a.m15277d(profile.getId());
                            SignUpWithGooglePresenter.this.f25888a.m15276c(profile.getId());
                            SignUpWithGooglePresenter.this.f25888a.m15278e(profileToken.getToken());
                            SignUpWithGooglePresenter.this.f25888a.m15275b(false);
                            User user = new User();
                            user.setName(profile.getLogin());
                            user.setAvatar(profile.getAvatar());
                            SignUpWithGooglePresenter.this.f25888a.m15274a(user);
                            SignUpWithGooglePresenter.this.getViewState().mo14264t();
                            return Unit.f63088a;
                        }
                    }
                    int code = googleResponse2.getCode();
                    switch (code) {
                        case 2:
                            SignUpWithGooglePresenter.this.getViewState().mo14257P();
                            break;
                        case 4:
                            SignUpWithGooglePresenter.this.getViewState().mo14263r();
                            break;
                        case 5:
                            SignUpWithGooglePresenter.this.getViewState().mo14265w();
                            break;
                        case 6:
                            SignUpWithGooglePresenter.this.getViewState().mo14266y();
                            break;
                        case 7:
                            SignUpWithGooglePresenter.this.getViewState().mo14253C();
                            break;
                        case 8:
                        case 9:
                            if (code == 9) {
                                SignUpWithGooglePresenter.this.getViewState().mo14254I();
                            }
                            SignUpWithGooglePresenter.this.getViewState().mo14259R(str, str2, googleIdToken, googleResponse2.getHash(), googleResponse2.getCodeTimestampExpires());
                            break;
                        case 10:
                            SignUpWithGooglePresenter.this.getViewState().mo14258Q();
                            break;
                        case 11:
                            SignUpWithGooglePresenter.this.getViewState().mo14255J();
                            break;
                    }
                    return Unit.f63088a;
                }
            }, 24), new C2548c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.signup.google.SignUpWithGooglePresenter$onSignUpWithGoogle$4
                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Throwable th) {
                    th.printStackTrace();
                    return Unit.f63088a;
                }
            }, 25), Functions.f59621b, Functions.f59622c);
        }
    }
}
