package com.swiftsoft.anixartd.presentation.main.preference;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.ChangeLogin;
import com.swiftsoft.anixartd.database.entity.User;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.network.response.profile.ChangeLoginInfoResponse;
import com.swiftsoft.anixartd.network.response.profile.ChangeLoginResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.preference.ChangeLoginPreferenceUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.preference.ChangeLoginPreferenceUiLogic;
import com.swiftsoft.anixartd.presentation.comments.C2553a;
import com.swiftsoft.anixartd.presentation.main.notifications.C2588a;
import com.swiftsoft.anixartd.repository.AuthRepository;
import com.swiftsoft.anixartd.repository.ProfilePreferenceRepository;
import com.swiftsoft.anixartd.repository.ProfileRepository;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnFetchProfileLogin;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import moxy.InjectViewState;
import moxy.MvpPresenter;
import org.jetbrains.annotations.NotNull;

/* compiled from: ChangeLoginPreferencePresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/preference/ChangeLoginPreferencePresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/preference/ChangeLoginPreferenceView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ChangeLoginPreferencePresenter extends MvpPresenter<ChangeLoginPreferenceView> {

    /* renamed from: a */
    @NotNull
    public ProfilePreferenceRepository f26505a;

    /* renamed from: b */
    @NotNull
    public AuthRepository f26506b;

    /* renamed from: c */
    @NotNull
    public ProfileRepository f26507c;

    /* renamed from: d */
    @NotNull
    public Prefs f26508d;

    /* renamed from: e */
    @NotNull
    public Listener f26509e;

    /* renamed from: f */
    @NotNull
    public ChangeLoginPreferenceUiLogic f26510f;

    /* renamed from: g */
    @NotNull
    public ChangeLoginPreferenceUiController f26511g;

    /* compiled from: ChangeLoginPreferencePresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/preference/ChangeLoginPreferencePresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/preference/ChangeLoginPreferenceUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ChangeLoginPreferenceUiController.Listener {
    }

    @Inject
    public ChangeLoginPreferencePresenter(@NotNull ProfilePreferenceRepository profilePreferenceRepository, @NotNull AuthRepository authRepository, @NotNull ProfileRepository profileRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(profilePreferenceRepository, "profilePreferenceRepository");
        Intrinsics.m32179h(authRepository, "authRepository");
        Intrinsics.m32179h(profileRepository, "profileRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26505a = profilePreferenceRepository;
        this.f26506b = authRepository;
        this.f26507c = profileRepository;
        this.f26508d = prefs;
        this.f26509e = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.preference.ChangeLoginPreferencePresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.preference.LoginChangeHeaderModel.Listener
            /* renamed from: F0 */
            public void mo14735F0() {
                ChangeLoginPreferencePresenter.this.getViewState().mo14736F0();
            }
        };
        this.f26510f = new ChangeLoginPreferenceUiLogic();
        this.f26511g = new ChangeLoginPreferenceUiController();
    }

    /* renamed from: c */
    public static void m14732c(ChangeLoginPreferencePresenter changeLoginPreferencePresenter, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = changeLoginPreferencePresenter.f26511g.isEmpty();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        changeLoginPreferencePresenter.m14734b(z, z2);
    }

    /* renamed from: a */
    public final void m14733a() {
        final String login = this.f26510f.f29137e;
        ProfilePreferenceRepository profilePreferenceRepository = this.f26505a;
        Objects.requireNonNull(profilePreferenceRepository);
        Intrinsics.m32179h(login, "login");
        profilePreferenceRepository.f27370a.changeLogin(login, profilePreferenceRepository.f27371b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2588a(new Function1<ChangeLoginResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.preference.ChangeLoginPreferencePresenter$onChangeLogin$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(ChangeLoginResponse changeLoginResponse) {
                ChangeLoginResponse changeLoginResponse2 = changeLoginResponse;
                if (changeLoginResponse2.isSuccess()) {
                    User findFirst = ChangeLoginPreferencePresenter.this.f26506b.f27327c.findFirst();
                    findFirst.setName(login);
                    ChangeLoginPreferencePresenter.this.f26506b.m15274a(findFirst);
                    ChangeLoginPreferenceUiLogic changeLoginPreferenceUiLogic = ChangeLoginPreferencePresenter.this.f26510f;
                    String str = login;
                    Objects.requireNonNull(changeLoginPreferenceUiLogic);
                    Intrinsics.m32179h(str, "<set-?>");
                    changeLoginPreferenceUiLogic.f29136d = str;
                    EventBusKt.m16327a(new OnFetchProfileLogin(ChangeLoginPreferencePresenter.this.f26508d.m14061d(), login));
                    ChangeLoginPreferencePresenter.this.getViewState().mo14743w2();
                    ChangeLoginPreferencePresenter changeLoginPreferencePresenter = ChangeLoginPreferencePresenter.this;
                    ChangeLoginPreferenceUiLogic changeLoginPreferenceUiLogic2 = changeLoginPreferencePresenter.f26510f;
                    if (changeLoginPreferenceUiLogic2.f28956a) {
                        changeLoginPreferenceUiLogic2.f29134b = 0;
                        changeLoginPreferenceUiLogic2.f29136d = "";
                        changeLoginPreferenceUiLogic2.f29138f = false;
                        changeLoginPreferenceUiLogic2.f29139g = 0L;
                        changeLoginPreferenceUiLogic2.f29135c.clear();
                        ChangeLoginPreferencePresenter.m14732c(changeLoginPreferencePresenter, false, false, 2);
                    }
                }
                int code = changeLoginResponse2.getCode();
                if (code == 2) {
                    ChangeLoginPreferencePresenter.this.getViewState().mo14742r();
                } else if (code == 3) {
                    ChangeLoginPreferencePresenter.this.getViewState().mo14744y();
                }
                return Unit.f63088a;
            }
        }, 11), new C2588a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.preference.ChangeLoginPreferencePresenter$onChangeLogin$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ChangeLoginPreferencePresenter.this.getViewState().mo14739c();
                return Unit.f63088a;
            }
        }, 12), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: b */
    public final void m14734b(final boolean z, final boolean z2) {
        ProfilePreferenceRepository profilePreferenceRepository = this.f26505a;
        Observables.f62894a.m31860a(profilePreferenceRepository.f27370a.changeLoginInfo(profilePreferenceRepository.f27371b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()), this.f26507c.m15301a(this.f26508d.m14061d(), this.f26510f.f29134b)).m31367i(new C2588a(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.preference.ChangeLoginPreferencePresenter$onChangeLoginInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    this.getViewState().mo14738b();
                }
                if (z2) {
                    this.getViewState().mo14740d();
                }
                return Unit.f63088a;
            }
        }, 8)).m31368j(new C2553a(z, this, z2, 8)).m31370l(new C2588a(new Function1<Pair<? extends ChangeLoginInfoResponse, ? extends PageableResponse<ChangeLogin>>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.preference.ChangeLoginPreferencePresenter$onChangeLoginInfo$3
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Pair<? extends ChangeLoginInfoResponse, ? extends PageableResponse<ChangeLogin>> pair) {
                Pair<? extends ChangeLoginInfoResponse, ? extends PageableResponse<ChangeLogin>> pair2 = pair;
                ChangeLoginInfoResponse changeLoginInfoResponse = (ChangeLoginInfoResponse) pair2.f63055b;
                PageableResponse pageableResponse = (PageableResponse) pair2.f63056c;
                ChangeLoginPreferenceUiLogic changeLoginPreferenceUiLogic = ChangeLoginPreferencePresenter.this.f26510f;
                List changeLoginHistory = pageableResponse.getContent();
                pageableResponse.getTotalCount();
                String login = changeLoginInfoResponse.getLogin();
                String avatar = changeLoginInfoResponse.getAvatar();
                boolean isChangeAvailable = changeLoginInfoResponse.getIsChangeAvailable();
                changeLoginInfoResponse.getLastChangeAt();
                long nextChangeAvailableAt = changeLoginInfoResponse.getNextChangeAvailableAt();
                Objects.requireNonNull(changeLoginPreferenceUiLogic);
                Intrinsics.m32179h(changeLoginHistory, "changeLoginHistory");
                Intrinsics.m32179h(login, "login");
                Intrinsics.m32179h(avatar, "avatar");
                boolean z3 = changeLoginPreferenceUiLogic.f29140h;
                if (z3) {
                    changeLoginPreferenceUiLogic.f29135c.addAll(changeLoginHistory);
                    changeLoginPreferenceUiLogic.f29136d = login;
                    changeLoginPreferenceUiLogic.f29138f = isChangeAvailable;
                    changeLoginPreferenceUiLogic.f29139g = nextChangeAvailableAt;
                } else {
                    if (z3) {
                        changeLoginPreferenceUiLogic.f29135c.clear();
                    }
                    changeLoginPreferenceUiLogic.f29135c.addAll(changeLoginHistory);
                    changeLoginPreferenceUiLogic.f29136d = login;
                    changeLoginPreferenceUiLogic.f29138f = isChangeAvailable;
                    changeLoginPreferenceUiLogic.f29139g = nextChangeAvailableAt;
                    changeLoginPreferenceUiLogic.f29140h = true;
                }
                ChangeLoginPreferencePresenter changeLoginPreferencePresenter = ChangeLoginPreferencePresenter.this;
                ChangeLoginPreferenceUiController changeLoginPreferenceUiController = changeLoginPreferencePresenter.f26511g;
                ChangeLoginPreferenceUiLogic changeLoginPreferenceUiLogic2 = changeLoginPreferencePresenter.f26510f;
                changeLoginPreferenceUiController.setData(changeLoginPreferenceUiLogic2.f29135c, changeLoginPreferenceUiLogic2.f29136d, Boolean.valueOf(changeLoginPreferenceUiLogic2.f29138f), Long.valueOf(ChangeLoginPreferencePresenter.this.f26510f.f29139g), Boolean.valueOf(pageableResponse.getContent().size() >= 25), ChangeLoginPreferencePresenter.this.f26509e);
                return Unit.f63088a;
            }
        }, 9), new C2588a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.preference.ChangeLoginPreferencePresenter$onChangeLoginInfo$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ChangeLoginPreferencePresenter.this.getViewState().mo14739c();
                return Unit.f63088a;
            }
        }, 10), Functions.f59621b, Functions.f59622c);
    }
}
