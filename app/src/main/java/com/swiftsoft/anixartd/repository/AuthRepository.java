package com.swiftsoft.anixartd.repository;

import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.dao.EpisodeDao;
import com.swiftsoft.anixartd.database.dao.LastWatchedEpisodeDao;
import com.swiftsoft.anixartd.database.dao.UserDao;
import com.swiftsoft.anixartd.database.entity.User;
import com.swiftsoft.anixartd.network.api.AuthApi;
import com.yandex.div2.C3033a;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AuthRepository.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/repository/AuthRepository;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class AuthRepository {

    /* renamed from: a */
    @NotNull
    public AuthApi f27325a;

    /* renamed from: b */
    @NotNull
    public Prefs f27326b;

    /* renamed from: c */
    @NotNull
    public UserDao f27327c;

    /* renamed from: d */
    @NotNull
    public EpisodeDao f27328d;

    /* renamed from: e */
    @NotNull
    public LastWatchedEpisodeDao f27329e;

    public AuthRepository(@NotNull AuthApi authApi, @NotNull Prefs prefs, @NotNull UserDao userDao, @NotNull EpisodeDao episodeDao, @NotNull LastWatchedEpisodeDao lastWatchedEpisodeDao) {
        this.f27325a = authApi;
        this.f27326b = prefs;
        this.f27327c = userDao;
        this.f27328d = episodeDao;
        this.f27329e = lastWatchedEpisodeDao;
    }

    /* renamed from: a */
    public final void m15274a(@NotNull User user) {
        this.f27327c.save(user);
    }

    /* renamed from: b */
    public final void m15275b(boolean z) {
        C3033a.m17749k(this.f27326b.f25344a, "IS_GUEST", z);
    }

    /* renamed from: c */
    public final void m15276c(long j2) {
        C3033a.m17748j(this.f27326b.f25344a, "PRIVILEGE_LEVEL_ID", j2);
    }

    /* renamed from: d */
    public final void m15277d(long j2) {
        C3033a.m17748j(this.f27326b.f25344a, "ID", j2);
    }

    /* renamed from: e */
    public final void m15278e(@NotNull String token) {
        Intrinsics.m32179h(token, "token");
        Prefs prefs = this.f27326b;
        Objects.requireNonNull(prefs);
        C2052a.m12278m(prefs.f25344a, "TOKEN", token);
    }
}
