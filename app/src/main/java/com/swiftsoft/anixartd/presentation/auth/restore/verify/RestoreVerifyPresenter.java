package com.swiftsoft.anixartd.presentation.auth.restore.verify;

import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.database.entity.ProfileToken;
import com.swiftsoft.anixartd.database.entity.User;
import com.swiftsoft.anixartd.network.response.auth.RestoreResendResponse;
import com.swiftsoft.anixartd.network.response.auth.RestoreVerifyResponse;
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

/* compiled from: RestoreVerifyPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/auth/restore/verify/RestoreVerifyPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/auth/restore/verify/RestoreVerifyView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class RestoreVerifyPresenter extends MvpPresenter<RestoreVerifyView> {

    /* renamed from: a */
    @NotNull
    public AuthRepository f25851a;

    /* renamed from: b */
    public long f25852b;

    @Inject
    public RestoreVerifyPresenter(@NotNull AuthRepository authRepository) {
        Intrinsics.m32179h(authRepository, "authRepository");
        this.f25851a = authRepository;
    }

    /* renamed from: a */
    public final void m14211a(@NotNull String data, @NotNull String password, @NotNull String hash) {
        Intrinsics.m32179h(data, "data");
        Intrinsics.m32179h(password, "password");
        Intrinsics.m32179h(hash, "hash");
        final long currentTimeMillis = (System.currentTimeMillis() / 1000) - this.f25852b;
        if (currentTimeMillis < 0) {
            getViewState().mo14213B0(currentTimeMillis);
            return;
        }
        AuthRepository authRepository = this.f25851a;
        Objects.requireNonNull(authRepository);
        authRepository.f27325a.restoreResend(data, password, hash).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2548c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyPresenter$onResend$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                RestoreVerifyPresenter.this.getViewState().mo14218h();
                return Unit.f63088a;
            }
        }, 11)).m31365g(new C2550a(this, 0)).m31370l(new C2548c(new Function1<RestoreResendResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyPresenter$onResend$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(RestoreResendResponse restoreResendResponse) {
                RestoreResendResponse restoreResendResponse2 = restoreResendResponse;
                if (restoreResendResponse2.isSuccess()) {
                    RestoreVerifyPresenter.this.f25852b = restoreResendResponse2.getTimestampExpires();
                    RestoreVerifyPresenter.this.getViewState().mo14216X0();
                } else if (restoreResendResponse2.getCode() == 4) {
                    RestoreVerifyPresenter.this.getViewState().mo14213B0(currentTimeMillis);
                }
                return Unit.f63088a;
            }
        }, 12), new C2548c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyPresenter$onResend$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                Throwable th2 = th;
                RestoreVerifyView viewState = RestoreVerifyPresenter.this.getViewState();
                String localizedMessage = th2.getLocalizedMessage();
                Intrinsics.m32178g(localizedMessage, "it.localizedMessage");
                viewState.mo14214E(localizedMessage);
                th2.printStackTrace();
                return Unit.f63088a;
            }
        }, 13), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: b */
    public final void m14212b(@NotNull String data, @NotNull String password, @NotNull String hash, @NotNull String str) {
        Intrinsics.m32179h(data, "data");
        Intrinsics.m32179h(password, "password");
        Intrinsics.m32179h(hash, "hash");
        AuthRepository authRepository = this.f25851a;
        Objects.requireNonNull(authRepository);
        authRepository.f27325a.restoreVerify(data, password, hash, str).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2548c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyPresenter$onVerify$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                RestoreVerifyPresenter.this.getViewState().mo14218h();
                return Unit.f63088a;
            }
        }, 14)).m31365g(new C2550a(this, 1)).m31370l(new C2548c(new Function1<RestoreVerifyResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyPresenter$onVerify$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(RestoreVerifyResponse restoreVerifyResponse) {
                RestoreVerifyResponse restoreVerifyResponse2 = restoreVerifyResponse;
                Profile profile = restoreVerifyResponse2.getProfile();
                ProfileToken profileToken = restoreVerifyResponse2.getProfileToken();
                if (!restoreVerifyResponse2.isSuccess() || profile == null || profileToken == null) {
                    int code = restoreVerifyResponse2.getCode();
                    if (code == 2) {
                        RestoreVerifyPresenter.this.getViewState().mo14220k0();
                    } else if (code == 3) {
                        RestoreVerifyPresenter.this.getViewState().mo14223z();
                    } else if (code == 4) {
                        RestoreVerifyPresenter.this.getViewState().mo14221r0();
                    } else if (code == 5) {
                        RestoreVerifyPresenter.this.getViewState().mo14217b1();
                    } else if (code == 6) {
                        RestoreVerifyPresenter.this.getViewState().mo14215O0();
                    }
                } else {
                    RestoreVerifyPresenter.this.f25851a.m15277d(profile.getId());
                    RestoreVerifyPresenter.this.f25851a.m15276c(profile.getPrivilegeLevel());
                    RestoreVerifyPresenter.this.f25851a.m15278e(profileToken.getToken());
                    RestoreVerifyPresenter.this.f25851a.m15275b(false);
                    User user = new User();
                    user.setName(profile.getLogin());
                    user.setAvatar(profile.getAvatar());
                    RestoreVerifyPresenter.this.f25851a.m15274a(user);
                    RestoreVerifyPresenter.this.getViewState().mo14222t();
                }
                return Unit.f63088a;
            }
        }, 15), new C2548c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.restore.verify.RestoreVerifyPresenter$onVerify$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                Throwable th2 = th;
                RestoreVerifyView viewState = RestoreVerifyPresenter.this.getViewState();
                String localizedMessage = th2.getLocalizedMessage();
                Intrinsics.m32178g(localizedMessage, "it.localizedMessage");
                viewState.mo14214E(localizedMessage);
                th2.printStackTrace();
                return Unit.f63088a;
            }
        }, 16), Functions.f59621b, Functions.f59622c);
    }
}
