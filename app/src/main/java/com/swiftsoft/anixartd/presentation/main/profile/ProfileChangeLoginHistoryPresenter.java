package com.swiftsoft.anixartd.presentation.main.profile;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.ChangeLogin;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.profile.ProfileChangeLoginHistoryUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.profile.ProfileChangeLoginHistoryUiLogic;
import com.swiftsoft.anixartd.presentation.comments.C2553a;
import com.swiftsoft.anixartd.repository.ProfileRepository;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import moxy.InjectViewState;
import moxy.MvpPresenter;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProfileChangeLoginHistoryPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/ProfileChangeLoginHistoryPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/profile/ProfileChangeLoginHistoryView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfileChangeLoginHistoryPresenter extends MvpPresenter<ProfileChangeLoginHistoryView> {

    /* renamed from: a */
    @NotNull
    public ProfileRepository f26583a;

    /* renamed from: b */
    @NotNull
    public ProfileChangeLoginHistoryUiLogic f26584b;

    /* renamed from: c */
    @NotNull
    public ProfileChangeLoginHistoryUiController f26585c;

    /* compiled from: ProfileChangeLoginHistoryPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/ProfileChangeLoginHistoryPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/profile/ProfileChangeLoginHistoryUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ProfileChangeLoginHistoryUiController.Listener {
    }

    @Inject
    public ProfileChangeLoginHistoryPresenter(@NotNull ProfileRepository profileRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(profileRepository, "profileRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26583a = profileRepository;
        this.f26584b = new ProfileChangeLoginHistoryUiLogic();
        this.f26585c = new ProfileChangeLoginHistoryUiController();
    }

    /* renamed from: a */
    public final void m14785a(final boolean z, final boolean z2) {
        ProfileRepository profileRepository = this.f26583a;
        ProfileChangeLoginHistoryUiLogic profileChangeLoginHistoryUiLogic = this.f26584b;
        profileRepository.m15301a(profileChangeLoginHistoryUiLogic.f29152b, profileChangeLoginHistoryUiLogic.f29153c).m31367i(new C2598a(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfileChangeLoginHistoryPresenter$onChangeLoginInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    this.getViewState().mo14787b();
                }
                if (z2) {
                    this.getViewState().mo14789d();
                }
                return Unit.f63088a;
            }
        }, 1)).m31368j(new C2553a(z, this, z2, 10)).m31370l(new C2598a(new Function1<PageableResponse<ChangeLogin>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfileChangeLoginHistoryPresenter$onChangeLoginInfo$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(PageableResponse<ChangeLogin> pageableResponse) {
                PageableResponse<ChangeLogin> pageableResponse2 = pageableResponse;
                ProfileChangeLoginHistoryUiLogic profileChangeLoginHistoryUiLogic2 = ProfileChangeLoginHistoryPresenter.this.f26584b;
                List<ChangeLogin> changeLoginHistory = pageableResponse2.getContent();
                pageableResponse2.getTotalCount();
                Objects.requireNonNull(profileChangeLoginHistoryUiLogic2);
                Intrinsics.m32179h(changeLoginHistory, "changeLoginHistory");
                boolean z3 = profileChangeLoginHistoryUiLogic2.f29155e;
                if (z3) {
                    profileChangeLoginHistoryUiLogic2.f29154d.addAll(changeLoginHistory);
                } else {
                    if (z3) {
                        profileChangeLoginHistoryUiLogic2.f29154d.clear();
                    }
                    profileChangeLoginHistoryUiLogic2.f29154d.addAll(changeLoginHistory);
                    profileChangeLoginHistoryUiLogic2.f29155e = true;
                }
                ProfileChangeLoginHistoryPresenter profileChangeLoginHistoryPresenter = ProfileChangeLoginHistoryPresenter.this;
                profileChangeLoginHistoryPresenter.f26585c.setData(profileChangeLoginHistoryPresenter.f26584b.f29154d, Boolean.valueOf(pageableResponse2.getContent().size() >= 25));
                return Unit.f63088a;
            }
        }, 2), new C2598a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfileChangeLoginHistoryPresenter$onChangeLoginInfo$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ProfileChangeLoginHistoryPresenter.this.getViewState().mo14788c();
                return Unit.f63088a;
            }
        }, 3), Functions.f59621b, Functions.f59622c);
    }
}
