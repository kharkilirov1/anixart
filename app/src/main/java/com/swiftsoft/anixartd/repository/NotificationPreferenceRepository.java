package com.swiftsoft.anixartd.repository;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.network.Response;
import com.swiftsoft.anixartd.network.api.NotificationPreferenceApi;
import com.swiftsoft.anixartd.network.request.preferences.ProfileReleaseTypeNotificationPreferencesEditRequest;
import com.swiftsoft.anixartd.network.response.preferences.NotificationPreferenceResponse;
import com.swiftsoft.anixartd.network.response.preferences.ProfileReleaseTypeNotificationPreferencesResponse;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: NotificationPreferenceRepository.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/repository/NotificationPreferenceRepository;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class NotificationPreferenceRepository {

    /* renamed from: a */
    @NotNull
    public NotificationPreferenceApi f27366a;

    /* renamed from: b */
    @NotNull
    public Prefs f27367b;

    public NotificationPreferenceRepository(@NotNull NotificationPreferenceApi notificationPreferenceApi, @NotNull Prefs prefs) {
        this.f27366a = notificationPreferenceApi;
        this.f27367b = prefs;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<NotificationPreferenceResponse> m15298a() {
        return this.f27366a.m14169my(this.f27367b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
    }

    @NotNull
    /* renamed from: b */
    public final Observable<ProfileReleaseTypeNotificationPreferencesResponse> m15299b(long j2) {
        return this.f27366a.profileReleaseTypeNotificationPreferences(j2, this.f27367b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
    }

    @NotNull
    /* renamed from: c */
    public final Observable<Response> m15300c(long j2, @NotNull Set<Long> profileTypeNotificationPreferences) {
        Intrinsics.m32179h(profileTypeNotificationPreferences, "profileTypeNotificationPreferences");
        return this.f27366a.profileReleaseTypeNotificationPreferencesEdit(new ProfileReleaseTypeNotificationPreferencesEditRequest(j2, profileTypeNotificationPreferences), this.f27367b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
    }
}
