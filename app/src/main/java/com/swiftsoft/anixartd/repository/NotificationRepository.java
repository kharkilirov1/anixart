package com.swiftsoft.anixartd.repository;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.network.api.NotificationApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: NotificationRepository.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/repository/NotificationRepository;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class NotificationRepository {

    /* renamed from: a */
    @NotNull
    public NotificationApi f27368a;

    /* renamed from: b */
    @NotNull
    public Prefs f27369b;

    public NotificationRepository(@NotNull NotificationApi notificationApi, @NotNull Prefs prefs) {
        this.f27368a = notificationApi;
        this.f27369b = prefs;
    }
}
