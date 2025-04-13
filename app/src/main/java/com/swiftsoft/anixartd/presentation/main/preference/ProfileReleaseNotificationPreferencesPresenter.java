package com.swiftsoft.anixartd.presentation.main.preference;

import androidx.core.view.inputmethod.C0273a;
import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.ProfileReleaseTypeNotificationPreference;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.Response;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.network.response.common.TypeResponse;
import com.swiftsoft.anixartd.network.response.preferences.ProfileReleaseTypeNotificationPreferencesResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.preference.ProfileReleaseTypeNotificationPreferenceUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.preference.ProfileReleaseTypeNotificationPreferenceUiLogic;
import com.swiftsoft.anixartd.presentation.main.notifications.C2588a;
import com.swiftsoft.anixartd.repository.NotificationPreferenceRepository;
import com.swiftsoft.anixartd.repository.TypeRepository;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnBottomSheet;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import moxy.InjectViewState;
import moxy.MvpPresenter;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProfileReleaseNotificationPreferencesPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/preference/ProfileReleaseNotificationPreferencesPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/preference/ProfileReleaseNotificationPreferencesView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfileReleaseNotificationPreferencesPresenter extends MvpPresenter<ProfileReleaseNotificationPreferencesView> {

    /* renamed from: a */
    @NotNull
    public TypeRepository f26545a;

    /* renamed from: b */
    @NotNull
    public NotificationPreferenceRepository f26546b;

    /* renamed from: c */
    @NotNull
    public Listener f26547c;

    /* renamed from: d */
    @NotNull
    public ProfileReleaseTypeNotificationPreferenceUiLogic f26548d;

    /* renamed from: e */
    @NotNull
    public ProfileReleaseTypeNotificationPreferenceUiController f26549e;

    /* compiled from: ProfileReleaseNotificationPreferencesPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/preference/ProfileReleaseNotificationPreferencesPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/preference/ProfileReleaseTypeNotificationPreferenceUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ProfileReleaseTypeNotificationPreferenceUiController.Listener {
    }

    @Inject
    public ProfileReleaseNotificationPreferencesPresenter(@NotNull TypeRepository typeRepository, @NotNull NotificationPreferenceRepository notificationPreferenceRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(typeRepository, "typeRepository");
        Intrinsics.m32179h(notificationPreferenceRepository, "notificationPreferenceRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26545a = typeRepository;
        this.f26546b = notificationPreferenceRepository;
        this.f26547c = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.preference.ProfileReleaseNotificationPreferencesPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.common.ErrorModel.Listener
            /* renamed from: c */
            public void mo14387c() {
                ProfileReleaseNotificationPreferencesPresenter.this.m14755a(true, false);
                ProfileReleaseNotificationPreferencesPresenter.m14754d(ProfileReleaseNotificationPreferencesPresenter.this, false, false, 3);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.preference.ReleaseNotificationPreferenceModel.Listener
            /* renamed from: e1 */
            public void mo14758e1(final long j2) {
                Object obj;
                Iterator<T> it = ProfileReleaseNotificationPreferencesPresenter.this.f26548d.f29144e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((Release) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                if (((Release) obj) != null) {
                    ProfileReleaseTypeNotificationPreferenceUiLogic profileReleaseTypeNotificationPreferenceUiLogic = ProfileReleaseNotificationPreferencesPresenter.this.f26548d;
                    profileReleaseTypeNotificationPreferenceUiLogic.f29145f = j2;
                    if (profileReleaseTypeNotificationPreferenceUiLogic.f29146g.containsKey(Long.valueOf(j2))) {
                        ProfileReleaseNotificationPreferencesPresenter.this.getViewState().mo14766e1(j2);
                    } else {
                        final ProfileReleaseNotificationPreferencesPresenter profileReleaseNotificationPreferencesPresenter = ProfileReleaseNotificationPreferencesPresenter.this;
                        profileReleaseNotificationPreferencesPresenter.f26546b.m15299b(j2).m31367i(new C2588a(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.preference.ProfileReleaseNotificationPreferencesPresenter$onReleaseTypeNotificationPreferences$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public Unit invoke(Disposable disposable) {
                                ProfileReleaseNotificationPreferencesPresenter.this.getViewState().mo14767h();
                                return Unit.f63088a;
                            }
                        }, 21)).m31365g(new C2597a(profileReleaseNotificationPreferencesPresenter, 1)).m31370l(new C2588a(new Function1<ProfileReleaseTypeNotificationPreferencesResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.preference.ProfileReleaseNotificationPreferencesPresenter$onReleaseTypeNotificationPreferences$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public Unit invoke(ProfileReleaseTypeNotificationPreferencesResponse profileReleaseTypeNotificationPreferencesResponse) {
                                List<ProfileReleaseTypeNotificationPreference> profileReleaseTypeNotificationPreferences = profileReleaseTypeNotificationPreferencesResponse.getProfileReleaseTypeNotificationPreferences();
                                Map<Long, Set<Long>> map = ProfileReleaseNotificationPreferencesPresenter.this.f26548d.f29146g;
                                Long valueOf = Long.valueOf(j2);
                                ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(profileReleaseTypeNotificationPreferences, 10));
                                Iterator<T> it2 = profileReleaseTypeNotificationPreferences.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(Long.valueOf(((ProfileReleaseTypeNotificationPreference) it2.next()).getType().getId()));
                                }
                                map.put(valueOf, CollectionsKt.m32033m0(arrayList));
                                ProfileReleaseNotificationPreferencesPresenter.this.getViewState().mo14766e1(j2);
                                return Unit.f63088a;
                            }
                        }, 22), new C2588a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.preference.ProfileReleaseNotificationPreferencesPresenter$onReleaseTypeNotificationPreferences$4
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public Unit invoke(Throwable th) {
                                th.printStackTrace();
                                ProfileReleaseNotificationPreferencesPresenter.this.getViewState().mo14763c();
                                return Unit.f63088a;
                            }
                        }, 23), Functions.f59621b, Functions.f59622c);
                    }
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.preference.ReleaseNotificationPreferenceModel.Listener
            /* renamed from: g */
            public void mo14759g(long j2) {
                Object obj;
                Iterator<T> it = ProfileReleaseNotificationPreferencesPresenter.this.f26548d.f29144e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((Release) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                Release release = (Release) obj;
                if (release != null) {
                    ProfileReleaseNotificationPreferencesPresenter.this.getViewState().mo14768i(release);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.preference.ReleaseNotificationPreferenceModel.Listener
            /* renamed from: k */
            public void mo14760k(long j2) {
                Object obj;
                Iterator<T> it = ProfileReleaseNotificationPreferencesPresenter.this.f26548d.f29144e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((Release) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                Release release = (Release) obj;
                if (release != null) {
                    EventBusKt.m16327a(new OnBottomSheet(release));
                }
            }
        };
        this.f26548d = new ProfileReleaseTypeNotificationPreferenceUiLogic();
        this.f26549e = new ProfileReleaseTypeNotificationPreferenceUiController();
    }

    /* renamed from: b */
    public static /* synthetic */ void m14753b(ProfileReleaseNotificationPreferencesPresenter profileReleaseNotificationPreferencesPresenter, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        profileReleaseNotificationPreferencesPresenter.m14755a(z, z2);
    }

    /* renamed from: d */
    public static void m14754d(ProfileReleaseNotificationPreferencesPresenter profileReleaseNotificationPreferencesPresenter, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = profileReleaseNotificationPreferencesPresenter.f26549e.isEmpty();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        profileReleaseNotificationPreferencesPresenter.m14756c(z, z2);
    }

    /* renamed from: a */
    public final void m14755a(boolean z, boolean z2) {
        ProfileReleaseTypeNotificationPreferenceUiController profileReleaseTypeNotificationPreferenceUiController = this.f26549e;
        ProfileReleaseTypeNotificationPreferenceUiLogic profileReleaseTypeNotificationPreferenceUiLogic = this.f26548d;
        profileReleaseTypeNotificationPreferenceUiController.setData(profileReleaseTypeNotificationPreferenceUiLogic.f29144e, Integer.valueOf(profileReleaseTypeNotificationPreferenceUiLogic.f29142c.length), Boolean.valueOf(z), Boolean.valueOf(z2), this.f26547c);
    }

    /* renamed from: c */
    public final void m14756c(final boolean z, final boolean z2) {
        int i2 = this.f26548d.f29141b;
        Observable<TypeResponse> m15316a = this.f26545a.m15316a();
        NotificationPreferenceRepository notificationPreferenceRepository = this.f26546b;
        Observable<PageableResponse<Release>> m31369k = notificationPreferenceRepository.f27366a.profileReleaseNotificationPreferences(i2, notificationPreferenceRepository.f27367b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        if (this.f26548d.f29142c.length == 0) {
            m31369k = Observables.f62894a.m31860a(m15316a, m31369k);
        }
        m31369k.m31367i(new C2588a(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.preference.ProfileReleaseNotificationPreferencesPresenter$onProfileReleaseNotificationPreferences$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    this.getViewState().mo14762b();
                }
                if (z2) {
                    this.getViewState().mo14764d();
                }
                return Unit.f63088a;
            }
        }, 19)).m31368j(new C2597a(this, 0)).m31370l(new C0273a(this, 10), new C2588a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.preference.ProfileReleaseNotificationPreferencesPresenter$onProfileReleaseNotificationPreferences$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ProfileReleaseNotificationPreferencesPresenter.this.getViewState().mo14763c();
                return Unit.f63088a;
            }
        }, 20), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: e */
    public final void m14757e() {
        ProfileReleaseTypeNotificationPreferenceUiLogic profileReleaseTypeNotificationPreferenceUiLogic = this.f26548d;
        Set<Long> set = profileReleaseTypeNotificationPreferenceUiLogic.f29146g.get(Long.valueOf(profileReleaseTypeNotificationPreferenceUiLogic.f29145f));
        if (set == null) {
            return;
        }
        m14753b(this, false, false, 3);
        this.f26546b.m15300c(this.f26548d.f29145f, set).m31370l(new C2588a(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.preference.ProfileReleaseNotificationPreferencesPresenter$onProfileReleaseTypeNotificationPreferencesEdit$1
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Response response) {
                response.isSuccess();
                return Unit.f63088a;
            }
        }, 24), new C2588a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.preference.ProfileReleaseNotificationPreferencesPresenter$onProfileReleaseTypeNotificationPreferencesEdit$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ProfileReleaseNotificationPreferencesPresenter.this.getViewState().mo14763c();
                return Unit.f63088a;
            }
        }, 25), Functions.f59621b, Functions.f59622c);
    }
}
