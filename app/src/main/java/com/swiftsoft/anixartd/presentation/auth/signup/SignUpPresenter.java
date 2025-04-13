package com.swiftsoft.anixartd.presentation.auth.signup;

import com.swiftsoft.anixartd.network.response.auth.SignUpResponse;
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

/* compiled from: SignUpPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/auth/signup/SignUpPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/auth/signup/SignUpView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SignUpPresenter extends MvpPresenter<SignUpView> {

    /* renamed from: a */
    @NotNull
    public AuthRepository f25874a;

    @Inject
    public SignUpPresenter(@NotNull AuthRepository authRepository) {
        Intrinsics.m32179h(authRepository, "authRepository");
        this.f25874a = authRepository;
    }

    /* renamed from: a */
    public final void m14233a(@NotNull final String str, @NotNull final String str2, @NotNull final String str3, @NotNull String str4) {
        boolean z;
        boolean z2 = false;
        if (str.length() == 0) {
            getViewState().mo14239L();
            z = false;
        } else {
            z = true;
        }
        if (str2.length() == 0) {
            getViewState().mo14245b0();
            z = false;
        }
        if (str3.length() < 6 || str3.length() > 32) {
            getViewState().mo14243Z();
            z = false;
        }
        if (str4.length() < 6 || str4.length() > 32) {
            getViewState().mo14236G0();
        } else if (Intrinsics.m32174c(str3, str4)) {
            z2 = z;
        } else {
            getViewState().mo14242S();
        }
        if (z2) {
            AuthRepository authRepository = this.f25874a;
            Objects.requireNonNull(authRepository);
            authRepository.f27325a.signUp(str, str2, str3).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2548c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.signup.SignUpPresenter$onSignUp$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Disposable disposable) {
                    SignUpPresenter.this.getViewState().mo14246h();
                    return Unit.f63088a;
                }
            }, 20)).m31365g(new C2549a(this, 2)).m31370l(new C2548c(new Function1<SignUpResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.signup.SignUpPresenter$onSignUp$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(SignUpResponse signUpResponse) {
                    SignUpResponse signUpResponse2 = signUpResponse;
                    if (!signUpResponse2.isSuccess() && signUpResponse2.getCode() != 7) {
                        switch (signUpResponse2.getCode()) {
                            case 2:
                                SignUpPresenter.this.getViewState().mo14248r();
                                break;
                            case 3:
                                SignUpPresenter.this.getViewState().mo14249w();
                                break;
                            case 4:
                                SignUpPresenter.this.getViewState().mo14251z();
                                break;
                            case 5:
                                SignUpPresenter.this.getViewState().mo14250y();
                                break;
                            case 6:
                                SignUpPresenter.this.getViewState().mo14234C();
                                break;
                            case 8:
                                SignUpPresenter.this.getViewState().mo14244Z0();
                                break;
                            case 9:
                                SignUpPresenter.this.getViewState().mo14240Q();
                                break;
                            case 10:
                                SignUpPresenter.this.getViewState().mo14238J();
                                break;
                        }
                    } else {
                        if (signUpResponse2.getCode() == 7) {
                            SignUpPresenter.this.getViewState().mo14237I();
                        }
                        SignUpPresenter.this.getViewState().mo14241R(str, str2, str3, signUpResponse2.getHash(), signUpResponse2.getCodeTimestampExpires());
                    }
                    return Unit.f63088a;
                }
            }, 21), new C2548c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.signup.SignUpPresenter$onSignUp$4
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Throwable th) {
                    Throwable th2 = th;
                    SignUpView viewState = SignUpPresenter.this.getViewState();
                    String localizedMessage = th2.getLocalizedMessage();
                    Intrinsics.m32178g(localizedMessage, "it.localizedMessage");
                    viewState.mo14235E(localizedMessage);
                    th2.printStackTrace();
                    return Unit.f63088a;
                }
            }, 22), Functions.f59621b, Functions.f59622c);
        }
    }
}
