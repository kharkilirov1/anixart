package com.swiftsoft.anixartd.repository;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.ChangeLogin;
import com.swiftsoft.anixartd.network.Response;
import com.swiftsoft.anixartd.network.api.ProfileApi;
import com.swiftsoft.anixartd.network.api.ProfileBlockListApi;
import com.swiftsoft.anixartd.network.api.ProfileFriendApi;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.network.response.ProfileResponse;
import com.swiftsoft.anixartd.network.response.profile.RemoveFriendRequestResponse;
import com.swiftsoft.anixartd.network.response.profile.SendFriendRequestResponse;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProfileRepository.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/repository/ProfileRepository;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfileRepository {

    /* renamed from: a */
    @NotNull
    public ProfileApi f27374a;

    /* renamed from: b */
    @NotNull
    public ProfileFriendApi f27375b;

    /* renamed from: c */
    @NotNull
    public ProfileBlockListApi f27376c;

    /* renamed from: d */
    @NotNull
    public Prefs f27377d;

    public ProfileRepository(@NotNull ProfileApi profileApi, @NotNull ProfileFriendApi profileFriendApi, @NotNull ProfileBlockListApi profileBlockListApi, @NotNull Prefs prefs) {
        this.f27374a = profileApi;
        this.f27375b = profileFriendApi;
        this.f27376c = profileBlockListApi;
        this.f27377d = prefs;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<PageableResponse<ChangeLogin>> m15301a(long j2, int i2) {
        return this.f27374a.changeLoginHistory(j2, i2, this.f27377d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
    }

    @NotNull
    /* renamed from: b */
    public final Observable<ProfileResponse> m15302b(long j2) {
        return this.f27374a.profile(j2, this.f27377d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
    }

    @NotNull
    /* renamed from: c */
    public final Observable<Response> m15303c(long j2) {
        return this.f27376c.removeFromBlockList(j2, this.f27377d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
    }

    @NotNull
    /* renamed from: d */
    public final Observable<Response> m15304d(long j2) {
        return this.f27375b.requestHide(j2, this.f27377d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
    }

    @NotNull
    /* renamed from: e */
    public final Observable<RemoveFriendRequestResponse> m15305e(long j2) {
        return this.f27375b.requestRemove(j2, this.f27377d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
    }

    @NotNull
    /* renamed from: f */
    public final Observable<SendFriendRequestResponse> m15306f(long j2) {
        return this.f27375b.requestSend(j2, this.f27377d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
    }
}
