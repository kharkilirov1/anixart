package com.swiftsoft.anixartd.presentation.main.profile;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.User;
import com.swiftsoft.anixartd.network.Response;
import com.swiftsoft.anixartd.network.request.profile.PrivacyEditRequest;
import com.swiftsoft.anixartd.network.request.profile.StatusEditRequest;
import com.swiftsoft.anixartd.network.response.profile.ChangeEmailConfirmResponse;
import com.swiftsoft.anixartd.network.response.profile.ChangeEmailResponse;
import com.swiftsoft.anixartd.network.response.profile.ProfilePreferenceResponse;
import com.swiftsoft.anixartd.p015ui.logic.main.profile.ProfilePreferenceUiLogic;
import com.swiftsoft.anixartd.repository.AuthRepository;
import com.swiftsoft.anixartd.repository.ProfilePreferenceRepository;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnFetchProfileAvatar;
import com.swiftsoft.anixartd.utils.OnFetchProfileStatus;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import moxy.InjectViewState;
import moxy.MvpPresenter;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProfilePreferencePresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/ProfilePreferencePresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/profile/ProfilePreferenceView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfilePreferencePresenter extends MvpPresenter<ProfilePreferenceView> {

    /* renamed from: a */
    @NotNull
    public AuthRepository f26593a;

    /* renamed from: b */
    @NotNull
    public ProfilePreferenceRepository f26594b;

    /* renamed from: c */
    @NotNull
    public Prefs f26595c;

    /* renamed from: d */
    @NotNull
    public ProfilePreferenceUiLogic f26596d;

    @Inject
    public ProfilePreferencePresenter(@NotNull AuthRepository authRepository, @NotNull ProfilePreferenceRepository profilePreferenceRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(authRepository, "authRepository");
        Intrinsics.m32179h(profilePreferenceRepository, "profilePreferenceRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26593a = authRepository;
        this.f26594b = profilePreferenceRepository;
        this.f26595c = prefs;
        this.f26596d = new ProfilePreferenceUiLogic();
    }

    /* renamed from: a */
    public final boolean m14791a(String str) {
        return str.length() >= 6 && str.length() <= 32;
    }

    /* renamed from: b */
    public final void m14792b(@NotNull File file) {
        ProfilePreferenceRepository profilePreferenceRepository = this.f26594b;
        Objects.requireNonNull(profilePreferenceRepository);
        RequestBody.Companion companion = RequestBody.INSTANCE;
        MediaType.Companion companion2 = MediaType.INSTANCE;
        profilePreferenceRepository.f27370a.avatarEdit(profilePreferenceRepository.f27371b.m14080w(), MultipartBody.Part.INSTANCE.createFormData("image", file.getName(), companion.create(file, companion2.parse("image/*"))), companion.create("image", companion2.parse("text/plain"))).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2598a(new Function1<ProfilePreferenceResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferencePresenter$onAvatarEdit$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(ProfilePreferenceResponse profilePreferenceResponse) {
                ProfilePreferenceResponse profilePreferenceResponse2 = profilePreferenceResponse;
                if (profilePreferenceResponse2.isSuccess()) {
                    User findFirst = ProfilePreferencePresenter.this.f26593a.f27327c.findFirst();
                    String login = ProfilePreferencePresenter.this.f26593a.f27327c.getLogin();
                    if (login == null) {
                        login = "Гость";
                    }
                    findFirst.setName(login);
                    findFirst.setAvatar(profilePreferenceResponse2.getAvatar());
                    ProfilePreferencePresenter.this.f26593a.m15274a(findFirst);
                    EventBusKt.m16327a(new OnFetchProfileAvatar(ProfilePreferencePresenter.this.f26595c.m14061d(), profilePreferenceResponse2.getAvatar()));
                } else {
                    ProfilePreferencePresenter.this.getViewState().mo14811c();
                }
                return Unit.f63088a;
            }
        }, 15), new C2598a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferencePresenter$onAvatarEdit$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ProfilePreferencePresenter.this.getViewState().mo14811c();
                return Unit.f63088a;
            }
        }, 16), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: c */
    public final void m14793c(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        ProfilePreferenceRepository profilePreferenceRepository = this.f26594b;
        Objects.requireNonNull(profilePreferenceRepository);
        profilePreferenceRepository.f27370a.changeEmail(str, str2, str3, profilePreferenceRepository.f27371b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2598a(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferencePresenter$onChangeEmail$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                ProfilePreferencePresenter.this.getViewState().mo14812h();
                return Unit.f63088a;
            }
        }, 4)).m31365g(new C2599b(this, 0)).m31370l(new C2598a(new Function1<ChangeEmailResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferencePresenter$onChangeEmail$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(ChangeEmailResponse changeEmailResponse) {
                ChangeEmailResponse changeEmailResponse2 = changeEmailResponse;
                if (changeEmailResponse2.isSuccess()) {
                    ProfilePreferencePresenter.this.getViewState().mo14804D3();
                }
                int code = changeEmailResponse2.getCode();
                if (code == 2) {
                    ProfilePreferencePresenter.this.getViewState().mo14817w();
                } else if (code == 3) {
                    ProfilePreferencePresenter.this.getViewState().mo14808U3();
                } else if (code == 4) {
                    ProfilePreferencePresenter.this.getViewState().mo14802C();
                }
                return Unit.f63088a;
            }
        }, 5), new C2598a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferencePresenter$onChangeEmail$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ProfilePreferencePresenter.this.getViewState().mo14811c();
                return Unit.f63088a;
            }
        }, 6), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: d */
    public final void m14794d(@NotNull final String str) {
        if (m14791a(str)) {
            ProfilePreferenceRepository profilePreferenceRepository = this.f26594b;
            Objects.requireNonNull(profilePreferenceRepository);
            profilePreferenceRepository.f27370a.changeEmailConfirm(str, profilePreferenceRepository.f27371b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2598a(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferencePresenter$onChangeEmailConfirm$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Disposable disposable) {
                    ProfilePreferencePresenter.this.getViewState().mo14812h();
                    return Unit.f63088a;
                }
            }, 7)).m31365g(new C2599b(this, 1)).m31370l(new C2598a(new Function1<ChangeEmailConfirmResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferencePresenter$onChangeEmailConfirm$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(ChangeEmailConfirmResponse changeEmailConfirmResponse) {
                    ChangeEmailConfirmResponse changeEmailConfirmResponse2 = changeEmailConfirmResponse;
                    String emailHint = changeEmailConfirmResponse2.getEmailHint();
                    if (changeEmailConfirmResponse2.isSuccess() && emailHint != null) {
                        ProfilePreferencePresenter.this.getViewState().mo14803D2(emailHint, str);
                    }
                    if (changeEmailConfirmResponse2.getCode() == 2) {
                        ProfilePreferencePresenter.this.getViewState().mo14806Q3();
                    }
                    return Unit.f63088a;
                }
            }, 8), new C2598a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferencePresenter$onChangeEmailConfirm$4
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Throwable th) {
                    th.printStackTrace();
                    ProfilePreferencePresenter.this.getViewState().mo14811c();
                    return Unit.f63088a;
                }
            }, 9), Functions.f59621b, Functions.f59622c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m14795e(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.String r5) {
        /*
            r2 = this;
            boolean r0 = r2.m14791a(r3)
            if (r0 != 0) goto L10
            moxy.MvpView r5 = r2.getViewState()
            com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView r5 = (com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView) r5
            r5.mo14806Q3()
            goto L2f
        L10:
            boolean r0 = r2.m14791a(r4)
            if (r0 != 0) goto L20
            moxy.MvpView r5 = r2.getViewState()
            com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView r5 = (com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView) r5
            r5.mo14816u2()
            goto L2f
        L20:
            boolean r5 = kotlin.jvm.internal.Intrinsics.m32174c(r4, r5)
            if (r5 != 0) goto L31
            moxy.MvpView r5 = r2.getViewState()
            com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView r5 = (com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferenceView) r5
            r5.mo14807S()
        L2f:
            r5 = 0
            goto L32
        L31:
            r5 = 1
        L32:
            if (r5 == 0) goto L8c
            com.swiftsoft.anixartd.repository.ProfilePreferenceRepository r5 = r2.f26594b
            java.util.Objects.requireNonNull(r5)
            com.swiftsoft.anixartd.network.api.ProfilePreferenceApi r0 = r5.f27370a
            com.swiftsoft.anixartd.Prefs r5 = r5.f27371b
            java.lang.String r5 = r5.m14080w()
            io.reactivex.Observable r3 = r0.changePassword(r3, r4, r5)
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.f62901c
            io.reactivex.Observable r3 = r3.m31372n(r4)
            io.reactivex.Scheduler r4 = io.reactivex.android.schedulers.AndroidSchedulers.m31390a()
            io.reactivex.Observable r3 = r3.m31369k(r4)
            com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferencePresenter$onChangePassword$1 r4 = new com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferencePresenter$onChangePassword$1
            r4.<init>()
            com.swiftsoft.anixartd.presentation.main.profile.a r5 = new com.swiftsoft.anixartd.presentation.main.profile.a
            r0 = 17
            r5.<init>(r4, r0)
            io.reactivex.Observable r3 = r3.m31367i(r5)
            com.swiftsoft.anixartd.presentation.main.profile.b r4 = new com.swiftsoft.anixartd.presentation.main.profile.b
            r5 = 3
            r4.<init>(r2, r5)
            io.reactivex.Observable r3 = r3.m31365g(r4)
            com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferencePresenter$onChangePassword$3 r4 = new com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferencePresenter$onChangePassword$3
            r4.<init>()
            com.swiftsoft.anixartd.presentation.main.profile.a r5 = new com.swiftsoft.anixartd.presentation.main.profile.a
            r0 = 18
            r5.<init>(r4, r0)
            com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferencePresenter$onChangePassword$4 r4 = new com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferencePresenter$onChangePassword$4
            r4.<init>()
            com.swiftsoft.anixartd.presentation.main.profile.a r0 = new com.swiftsoft.anixartd.presentation.main.profile.a
            r1 = 19
            r0.<init>(r4, r1)
            io.reactivex.functions.Action r4 = io.reactivex.internal.functions.Functions.f59621b
            io.reactivex.functions.Consumer<java.lang.Object> r1 = io.reactivex.internal.functions.Functions.f59622c
            r3.m31370l(r5, r0, r4, r1)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferencePresenter.m14795e(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: f */
    public final void m14796f() {
        ProfilePreferenceRepository profilePreferenceRepository = this.f26594b;
        profilePreferenceRepository.f27370a.m14170my(profilePreferenceRepository.f27371b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2598a(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferencePresenter$onMySettings$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                ProfilePreferencePresenter.this.getViewState().mo14810b();
                return Unit.f63088a;
            }
        }, 10)).m31368j(new C2599b(this, 2)).m31370l(new C2598a(new Function1<ProfilePreferenceResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferencePresenter$onMySettings$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(ProfilePreferenceResponse profilePreferenceResponse) {
                ProfilePreferenceResponse profilePreferenceResponse2 = profilePreferenceResponse;
                String avatar = profilePreferenceResponse2.getAvatar();
                String status = profilePreferenceResponse2.getStatus();
                String vkPage = profilePreferenceResponse2.getVkPage();
                String tgPage = profilePreferenceResponse2.getTgPage();
                int privacyStats = profilePreferenceResponse2.getPrivacyStats();
                int privacyCounts = profilePreferenceResponse2.getPrivacyCounts();
                int privacySocial = profilePreferenceResponse2.getPrivacySocial();
                int privacyFriendRequests = profilePreferenceResponse2.getPrivacyFriendRequests();
                boolean isVkBound = profilePreferenceResponse2.getIsVkBound();
                boolean isGoogleBound = profilePreferenceResponse2.getIsGoogleBound();
                boolean isChangeLoginBanned = profilePreferenceResponse2.getIsChangeLoginBanned();
                long banChangeLoginExpires = profilePreferenceResponse2.getBanChangeLoginExpires();
                boolean isChangeAvatarBanned = profilePreferenceResponse2.getIsChangeAvatarBanned();
                long banChangeAvatarExpires = profilePreferenceResponse2.getBanChangeAvatarExpires();
                ProfilePreferenceUiLogic profilePreferenceUiLogic = ProfilePreferencePresenter.this.f26596d;
                Objects.requireNonNull(profilePreferenceUiLogic);
                Intrinsics.m32179h(avatar, "avatar");
                Intrinsics.m32179h(status, "status");
                Intrinsics.m32179h(vkPage, "vkPage");
                Intrinsics.m32179h(tgPage, "tgPage");
                profilePreferenceUiLogic.f29156b = status;
                profilePreferenceUiLogic.f29157c = privacyStats;
                profilePreferenceUiLogic.f29158d = privacyCounts;
                profilePreferenceUiLogic.f29159e = privacySocial;
                profilePreferenceUiLogic.f29160f = privacyFriendRequests;
                profilePreferenceUiLogic.f29161g = isVkBound;
                profilePreferenceUiLogic.f29162h = isGoogleBound;
                profilePreferenceUiLogic.f29163i = isChangeLoginBanned;
                profilePreferenceUiLogic.f29164j = banChangeLoginExpires;
                profilePreferenceUiLogic.f29165k = isChangeAvatarBanned;
                profilePreferenceUiLogic.f29166l = banChangeAvatarExpires;
                profilePreferenceUiLogic.f28956a = true;
                ProfilePreferencePresenter.this.getViewState().mo14815j1(avatar, status, privacyStats, privacyCounts, privacySocial, privacyFriendRequests, isVkBound, isGoogleBound);
                return Unit.f63088a;
            }
        }, 11), new C2598a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferencePresenter$onMySettings$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ProfilePreferencePresenter.this.getViewState().mo14811c();
                return Unit.f63088a;
            }
        }, 12), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: g */
    public final void m14797g(int i2) {
        ProfilePreferenceRepository profilePreferenceRepository = this.f26594b;
        profilePreferenceRepository.f27370a.privacyCountsEdit(new PrivacyEditRequest(i2), profilePreferenceRepository.f27371b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2598a(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferencePresenter$onPrivacyCountsEdit$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Response response) {
                if (response.isFailed()) {
                    ProfilePreferencePresenter.this.getViewState().mo14811c();
                }
                return Unit.f63088a;
            }
        }, 26), new C2598a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferencePresenter$onPrivacyCountsEdit$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ProfilePreferencePresenter.this.getViewState().mo14811c();
                return Unit.f63088a;
            }
        }, 27), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: h */
    public final void m14798h(int i2) {
        ProfilePreferenceRepository profilePreferenceRepository = this.f26594b;
        profilePreferenceRepository.f27370a.privacyFriendRequestsEdit(new PrivacyEditRequest(i2), profilePreferenceRepository.f27371b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2598a(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferencePresenter$onPrivacyFriendRequestsEdit$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Response response) {
                if (response.isFailed()) {
                    ProfilePreferencePresenter.this.getViewState().mo14811c();
                }
                return Unit.f63088a;
            }
        }, 24), new C2598a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferencePresenter$onPrivacyFriendRequestsEdit$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ProfilePreferencePresenter.this.getViewState().mo14811c();
                return Unit.f63088a;
            }
        }, 25), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: i */
    public final void m14799i(int i2) {
        ProfilePreferenceRepository profilePreferenceRepository = this.f26594b;
        profilePreferenceRepository.f27370a.privacySocialEdit(new PrivacyEditRequest(i2), profilePreferenceRepository.f27371b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2598a(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferencePresenter$onPrivacySocialEdit$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Response response) {
                if (response.isFailed()) {
                    ProfilePreferencePresenter.this.getViewState().mo14811c();
                }
                return Unit.f63088a;
            }
        }, 22), new C2598a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferencePresenter$onPrivacySocialEdit$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ProfilePreferencePresenter.this.getViewState().mo14811c();
                return Unit.f63088a;
            }
        }, 23), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: j */
    public final void m14800j(int i2) {
        ProfilePreferenceRepository profilePreferenceRepository = this.f26594b;
        profilePreferenceRepository.f27370a.privacyStatsEdit(new PrivacyEditRequest(i2), profilePreferenceRepository.f27371b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2598a(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferencePresenter$onPrivacyStatsEdit$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Response response) {
                if (response.isFailed()) {
                    ProfilePreferencePresenter.this.getViewState().mo14811c();
                }
                return Unit.f63088a;
            }
        }, 20), new C2598a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferencePresenter$onPrivacyStatsEdit$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ProfilePreferencePresenter.this.getViewState().mo14811c();
                return Unit.f63088a;
            }
        }, 21), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: k */
    public final void m14801k() {
        final String status = this.f26596d.f29156b;
        ProfilePreferenceRepository profilePreferenceRepository = this.f26594b;
        Objects.requireNonNull(profilePreferenceRepository);
        Intrinsics.m32179h(status, "status");
        profilePreferenceRepository.f27370a.statusEdit(new StatusEditRequest(status), profilePreferenceRepository.f27371b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2598a(new Function1<ProfilePreferenceResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferencePresenter$onStatusEdit$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(ProfilePreferenceResponse profilePreferenceResponse) {
                if (profilePreferenceResponse.isSuccess()) {
                    EventBusKt.m16327a(new OnFetchProfileStatus(ProfilePreferencePresenter.this.f26595c.m14061d(), status));
                }
                return Unit.f63088a;
            }
        }, 13), new C2598a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfilePreferencePresenter$onStatusEdit$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ProfilePreferencePresenter.this.getViewState().mo14811c();
                return Unit.f63088a;
            }
        }, 14), Functions.f59621b, Functions.f59622c);
    }
}
