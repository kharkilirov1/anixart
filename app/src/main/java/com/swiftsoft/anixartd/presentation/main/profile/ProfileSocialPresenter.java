package com.swiftsoft.anixartd.presentation.main.profile;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.network.response.profile.ProfileSocialResponse;
import com.swiftsoft.anixartd.p015ui.logic.main.profile.ProfileSocialUiLogic;
import com.swiftsoft.anixartd.repository.AuthRepository;
import com.swiftsoft.anixartd.repository.ProfilePreferenceRepository;
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

/* compiled from: ProfileSocialPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/ProfileSocialPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/profile/ProfileSocialView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfileSocialPresenter extends MvpPresenter<ProfileSocialView> {

    /* renamed from: a */
    @NotNull
    public ProfilePreferenceRepository f26667a;

    /* renamed from: b */
    @NotNull
    public Prefs f26668b;

    /* renamed from: c */
    @NotNull
    public ProfileSocialUiLogic f26669c;

    @Inject
    public ProfileSocialPresenter(@NotNull AuthRepository authRepository, @NotNull ProfilePreferenceRepository profilePreferenceRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(authRepository, "authRepository");
        Intrinsics.m32179h(profilePreferenceRepository, "profilePreferenceRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26667a = profilePreferenceRepository;
        this.f26668b = prefs;
        this.f26669c = new ProfileSocialUiLogic();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0164 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0080  */
    /* JADX WARN: Type inference failed for: r0v31, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v30, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v37, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v39, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v43, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v45, types: [T, java.lang.Object] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m14829a(@org.jetbrains.annotations.NotNull java.lang.String r20, @org.jetbrains.annotations.NotNull java.lang.String r21, @org.jetbrains.annotations.NotNull java.lang.String r22, @org.jetbrains.annotations.NotNull java.lang.String r23, @org.jetbrains.annotations.NotNull java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.presentation.main.profile.ProfileSocialPresenter.m14829a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    public final void m14830b() {
        ProfilePreferenceRepository profilePreferenceRepository = this.f26667a;
        profilePreferenceRepository.f27370a.social(profilePreferenceRepository.f27371b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2600c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfileSocialPresenter$onSocial$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                ProfileSocialPresenter.this.getViewState().mo14837b();
                return Unit.f63088a;
            }
        }, 16)).m31368j(new C2602d(this, 1)).m31370l(new C2600c(new Function1<ProfileSocialResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfileSocialPresenter$onSocial$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(ProfileSocialResponse profileSocialResponse) {
                ProfileSocialResponse profileSocialResponse2 = profileSocialResponse;
                String vkPage = profileSocialResponse2.getVkPage();
                String tgPage = profileSocialResponse2.getTgPage();
                String instPage = profileSocialResponse2.getInstPage();
                String ttPage = profileSocialResponse2.getTtPage();
                String discordPage = profileSocialResponse2.getDiscordPage();
                ProfileSocialUiLogic profileSocialUiLogic = ProfileSocialPresenter.this.f26669c;
                Objects.requireNonNull(profileSocialUiLogic);
                Intrinsics.m32179h(vkPage, "vkPage");
                Intrinsics.m32179h(tgPage, "tgPage");
                Intrinsics.m32179h(instPage, "instPage");
                Intrinsics.m32179h(ttPage, "ttPage");
                Intrinsics.m32179h(discordPage, "discordPage");
                profileSocialUiLogic.f29167b = vkPage;
                profileSocialUiLogic.f29168c = tgPage;
                profileSocialUiLogic.f29169d = instPage;
                profileSocialUiLogic.f29170e = ttPage;
                profileSocialUiLogic.f29171f = discordPage;
                profileSocialUiLogic.f28956a = true;
                ProfileSocialPresenter.this.getViewState().mo14832O();
                return Unit.f63088a;
            }
        }, 17), new C2600c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.ProfileSocialPresenter$onSocial$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ProfileSocialPresenter.this.getViewState().mo14839c();
                return Unit.f63088a;
            }
        }, 18), Functions.f59621b, Functions.f59622c);
    }
}
