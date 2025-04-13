package com.swiftsoft.anixartd.presentation.auth.signup.verify;

import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.database.entity.ProfileToken;
import com.swiftsoft.anixartd.database.entity.User;
import com.swiftsoft.anixartd.network.response.auth.ResendResponse;
import com.swiftsoft.anixartd.network.response.auth.VerifyResponse;
import com.swiftsoft.anixartd.presentation.auth.C2548c;
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
import org.jetbrains.annotations.Nullable;

/* compiled from: VerifyPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/auth/signup/verify/VerifyPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/auth/signup/verify/VerifyView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class VerifyPresenter extends MvpPresenter<VerifyView> {

    /* renamed from: a */
    @NotNull
    public AuthRepository f25902a;

    /* renamed from: b */
    public long f25903b;

    @Inject
    public VerifyPresenter(@NotNull AuthRepository authRepository) {
        Intrinsics.m32179h(authRepository, "authRepository");
        this.f25902a = authRepository;
    }

    /* renamed from: a */
    public final void m14267a(@NotNull String login, @NotNull String email, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String hash) {
        Intrinsics.m32179h(login, "login");
        Intrinsics.m32179h(email, "email");
        Intrinsics.m32179h(hash, "hash");
        final long currentTimeMillis = (System.currentTimeMillis() / 1000) - this.f25903b;
        if (currentTimeMillis < 0) {
            getViewState().mo14269B0(currentTimeMillis);
            return;
        }
        AuthRepository authRepository = this.f25902a;
        Objects.requireNonNull(authRepository);
        authRepository.f27325a.resend(login, email, str, str2, str3, hash).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2548c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyPresenter$onResend$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                VerifyPresenter.this.getViewState().mo14277h();
                return Unit.f63088a;
            }
        }, 26)).m31365g(new C2551a(this, 0)).m31370l(new C2548c(new Function1<ResendResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyPresenter$onResend$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(ResendResponse resendResponse) {
                ResendResponse resendResponse2 = resendResponse;
                if (resendResponse2.isSuccess()) {
                    VerifyPresenter.this.f25903b = resendResponse2.getTimestampExpires();
                    VerifyPresenter.this.getViewState().mo14275X0();
                } else if (resendResponse2.getCode() == 6) {
                    VerifyPresenter.this.getViewState().mo14269B0(currentTimeMillis);
                }
                return Unit.f63088a;
            }
        }, 27), new C2548c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyPresenter$onResend$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                Throwable th2 = th;
                VerifyView viewState = VerifyPresenter.this.getViewState();
                String localizedMessage = th2.getLocalizedMessage();
                Intrinsics.m32178g(localizedMessage, "it.localizedMessage");
                viewState.mo14271E(localizedMessage);
                th2.printStackTrace();
                return Unit.f63088a;
            }
        }, 28), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: b */
    public final void m14268b(@NotNull String login, @NotNull String email, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String hash, @NotNull String str4) {
        Intrinsics.m32179h(login, "login");
        Intrinsics.m32179h(email, "email");
        Intrinsics.m32179h(hash, "hash");
        AuthRepository authRepository = this.f25902a;
        Objects.requireNonNull(authRepository);
        authRepository.f27325a.verify(login, email, str, str2, str3, hash, str4).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2548c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyPresenter$onVerify$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                VerifyPresenter.this.getViewState().mo14277h();
                return Unit.f63088a;
            }
        }, 29)).m31365g(new C2551a(this, 1)).m31370l(new C2552b(new Function1<VerifyResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyPresenter$onVerify$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(VerifyResponse verifyResponse) {
                VerifyResponse verifyResponse2 = verifyResponse;
                if (verifyResponse2.isSuccess()) {
                    Profile profile = verifyResponse2.getProfile();
                    ProfileToken profileToken = verifyResponse2.getProfileToken();
                    if (verifyResponse2.isSuccess() && profile != null && profileToken != null) {
                        VerifyPresenter.this.f25902a.m15277d(profile.getId());
                        VerifyPresenter.this.f25902a.m15276c(profile.getPrivilegeLevel());
                        VerifyPresenter.this.f25902a.m15278e(profileToken.getToken());
                        VerifyPresenter.this.f25902a.m15275b(false);
                        User user = new User();
                        user.setName(profile.getLogin());
                        user.setAvatar(profile.getAvatar());
                        VerifyPresenter.this.f25902a.m15274a(user);
                        VerifyPresenter.this.getViewState().mo14281t();
                        return Unit.f63088a;
                    }
                }
                switch (verifyResponse2.getCode()) {
                    case 2:
                        VerifyPresenter.this.getViewState().mo14279r();
                        break;
                    case 3:
                        VerifyPresenter.this.getViewState().mo14282w();
                        break;
                    case 4:
                        VerifyPresenter.this.getViewState().mo14284z();
                        break;
                    case 5:
                        VerifyPresenter.this.getViewState().mo14283y();
                        break;
                    case 6:
                        VerifyPresenter.this.getViewState().mo14270C();
                        break;
                    case 7:
                        VerifyPresenter.this.getViewState().mo14280r0();
                        break;
                    case 8:
                        VerifyPresenter.this.getViewState().mo14276b1();
                        break;
                    case 9:
                        VerifyPresenter.this.getViewState().mo14273O0();
                        break;
                    case 10:
                        VerifyPresenter.this.getViewState().mo14274Q();
                        break;
                    case 11:
                        VerifyPresenter.this.getViewState().mo14272J();
                        break;
                }
                return Unit.f63088a;
            }
        }, 0), new C2552b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.signup.verify.VerifyPresenter$onVerify$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                Throwable th2 = th;
                VerifyView viewState = VerifyPresenter.this.getViewState();
                String localizedMessage = th2.getLocalizedMessage();
                Intrinsics.m32178g(localizedMessage, "it.localizedMessage");
                viewState.mo14271E(localizedMessage);
                th2.printStackTrace();
                return Unit.f63088a;
            }
        }, 1), Functions.f59621b, Functions.f59622c);
    }
}
