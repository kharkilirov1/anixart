package com.swiftsoft.anixartd.presentation.auth.signup.p014vk;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.network.response.auth.VkResponse;
import com.swiftsoft.anixartd.presentation.auth.restore.C2549a;
import com.swiftsoft.anixartd.presentation.auth.signup.verify.C2552b;
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

/* compiled from: SignUpWithVkPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/auth/signup/vk/SignUpWithVkPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/auth/signup/vk/SignUpWithVkView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SignUpWithVkPresenter extends MvpPresenter<SignUpWithVkView> {

    /* renamed from: a */
    @NotNull
    public AuthRepository f25918a;

    @Inject
    public SignUpWithVkPresenter(@NotNull AuthRepository authRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(authRepository, "authRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f25918a = authRepository;
    }

    /* renamed from: a */
    public final void m14285a(@NotNull final String str, @NotNull final String str2, @NotNull final String vkAccessToken) {
        boolean z;
        Intrinsics.m32179h(vkAccessToken, "vkAccessToken");
        boolean z2 = false;
        if (str.length() == 0) {
            getViewState().mo14289L();
            z = false;
        } else {
            z = true;
        }
        if (str2.length() == 0) {
            getViewState().mo14293b0();
        } else {
            z2 = z;
        }
        if (z2) {
            AuthRepository authRepository = this.f25918a;
            Objects.requireNonNull(authRepository);
            authRepository.f27325a.signUpWithVk(str, str2, vkAccessToken).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2552b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.signup.vk.SignUpWithVkPresenter$onSignUpWithVk$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Disposable disposable) {
                    SignUpWithVkPresenter.this.getViewState().mo14294h();
                    return Unit.f63088a;
                }
            }, 2)).m31365g(new C2549a(this, 4)).m31370l(new C2552b(new Function1<VkResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.signup.vk.SignUpWithVkPresenter$onSignUpWithVk$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(VkResponse vkResponse) {
                    VkResponse vkResponse2 = vkResponse;
                    if (vkResponse2.isSuccess() || vkResponse2.getCode() == 8) {
                        if (vkResponse2.getCode() == 8) {
                            SignUpWithVkPresenter.this.getViewState().mo14287I();
                        }
                        SignUpWithVkPresenter.this.getViewState().mo14292R(str, str2, vkAccessToken, vkResponse2.getHash(), vkResponse2.getCodeTimestampExpires());
                    } else {
                        int code = vkResponse2.getCode();
                        if (code == 2) {
                            SignUpWithVkPresenter.this.getViewState().mo14290P();
                        } else if (code == 4) {
                            SignUpWithVkPresenter.this.getViewState().mo14296r();
                        } else if (code == 5) {
                            SignUpWithVkPresenter.this.getViewState().mo14298w();
                        } else if (code == 6) {
                            SignUpWithVkPresenter.this.getViewState().mo14299y();
                        } else if (code == 7) {
                            SignUpWithVkPresenter.this.getViewState().mo14286C();
                        } else if (code == 9) {
                            SignUpWithVkPresenter.this.getViewState().mo14291Q();
                        } else if (code == 10) {
                            SignUpWithVkPresenter.this.getViewState().mo14288J();
                        }
                    }
                    return Unit.f63088a;
                }
            }, 3), new C2552b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.auth.signup.vk.SignUpWithVkPresenter$onSignUpWithVk$4
                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Throwable th) {
                    th.printStackTrace();
                    return Unit.f63088a;
                }
            }, 4), Functions.f59621b, Functions.f59622c);
        }
    }
}
