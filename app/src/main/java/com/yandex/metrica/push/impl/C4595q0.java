package com.yandex.metrica.push.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.C4484p;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.push.common.utils.TrackersHub;

/* renamed from: com.yandex.metrica.push.impl.q0 */
/* loaded from: classes2.dex */
public class C4595q0 implements InterfaceC4601t0 {
    @Override // com.yandex.metrica.push.impl.InterfaceC4601t0
    /* renamed from: a */
    public void mo21638a(@NonNull String str, @NonNull String str2) {
        try {
            m21637a(new C4597r0(str, str2));
        } catch (Exception e2) {
            TrackersHub.getInstance().reportError("Try to send PushTokenInited message before appmetrica activation", e2);
        }
    }

    @Override // com.yandex.metrica.push.impl.InterfaceC4601t0
    /* renamed from: b */
    public void mo21642b(@NonNull String str, @NonNull String str2) {
        try {
            m21637a(new C4597r0(str, str2));
        } catch (Exception e2) {
            TrackersHub.getInstance().reportError("Try to send PushTokenUpdated message before appmetrica activation", e2);
        }
    }

    @Override // com.yandex.metrica.push.impl.InterfaceC4601t0
    /* renamed from: c */
    public void mo21646c(@NonNull String str, @Nullable String str2, @NonNull String str3) {
        try {
            m21637a(C4591o0.m21572a(str, str3));
        } catch (Exception e2) {
            TrackersHub.getInstance().reportError("Try to send NotificationCleared message before appmetrica activation", e2);
        }
    }

    @Override // com.yandex.metrica.push.impl.InterfaceC4601t0
    /* renamed from: d */
    public void mo21648d(@NonNull String str, @Nullable String str2, @NonNull String str3) {
        try {
            m21637a(C4591o0.m21578c(str, str3));
        } catch (Exception e2) {
            TrackersHub.getInstance().reportError("Try to send SilentPushProcessed message before appmetrica activation", e2);
        }
    }

    @Override // com.yandex.metrica.push.impl.InterfaceC4601t0
    /* renamed from: e */
    public void mo21649e(@NonNull String str, @Nullable String str2, @NonNull String str3) {
        try {
            m21637a(C4591o0.m21575b(str, str3));
        } catch (Exception e2) {
            TrackersHub.getInstance().reportError("Try to send PushOpened message before appmetrica activation", e2);
        }
    }

    @Override // com.yandex.metrica.push.impl.InterfaceC4601t0
    /* renamed from: f */
    public void mo21650f(@NonNull String str, @Nullable String str2, @NonNull String str3) {
        try {
            m21637a(C4591o0.m21582e(str, str3));
        } catch (Exception e2) {
            TrackersHub.getInstance().reportError("Try to send NotificationShown message before appmetrica activation", e2);
        }
    }

    @Override // com.yandex.metrica.push.impl.InterfaceC4601t0
    /* renamed from: a */
    public void mo21640a(@NonNull String str, @Nullable String str2, @Nullable String str3, @NonNull String str4) {
        try {
            m21637a(C4591o0.m21576b(str, str2, str4));
        } catch (Exception e2) {
            TrackersHub.getInstance().reportError("Try to send NotificationTtl message before appmetrica activation", e2);
        }
    }

    @Override // com.yandex.metrica.push.impl.InterfaceC4601t0
    /* renamed from: b */
    public void mo21643b(@NonNull String str, @Nullable String str2, @NonNull String str3) {
        try {
            m21637a(C4591o0.m21581d(str, str3));
        } catch (Exception e2) {
            TrackersHub.getInstance().reportError("Try to send MessageReceived message before appmetrica activation", e2);
        }
    }

    @Override // com.yandex.metrica.push.impl.InterfaceC4601t0
    /* renamed from: c */
    public void mo21647c(@NonNull String str, @Nullable String str2, @Nullable String str3, @NonNull String str4, @NonNull String str5) {
        try {
            m21637a(C4591o0.m21577b(str, str2, str4, str5));
        } catch (Exception e2) {
            TrackersHub.getInstance().reportError("Try to send NotificationInlineAdditionalAction message before appmetrica activation", e2);
        }
    }

    @Override // com.yandex.metrica.push.impl.InterfaceC4601t0
    /* renamed from: a */
    public void mo21641a(@NonNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NonNull String str5) {
        try {
            m21637a(C4591o0.m21580c(str, str2, str3, str5));
        } catch (Exception e2) {
            TrackersHub.getInstance().reportError("Try to send RemovingSilentPushProcessed message before appmetrica activation", e2);
        }
    }

    @Override // com.yandex.metrica.push.impl.InterfaceC4601t0
    /* renamed from: b */
    public void mo21644b(@NonNull String str, @Nullable String str2, @Nullable String str3, @NonNull String str4) {
        try {
            m21637a(C4591o0.m21573a(str, str2, str4));
        } catch (Exception e2) {
            TrackersHub.getInstance().reportError("Try to send NotificationAdditionalAction message before appmetrica activation", e2);
        }
    }

    @Override // com.yandex.metrica.push.impl.InterfaceC4601t0
    /* renamed from: a */
    public void mo21639a(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        try {
            m21637a(C4591o0.m21579c(str, str2, str3));
        } catch (Exception e2) {
            TrackersHub.getInstance().reportError("Try to send NotificationHide message before appmetrica activation", e2);
        }
    }

    @Override // com.yandex.metrica.push.impl.InterfaceC4601t0
    /* renamed from: b */
    public void mo21645b(@NonNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NonNull String str5) {
        try {
            m21637a(C4591o0.m21574a(str, str2, str3, str5));
        } catch (Exception e2) {
            TrackersHub.getInstance().reportError("Try to send NotificationIgnored message before appmetrica activation", e2);
        }
    }

    /* renamed from: a */
    private void m21637a(@NonNull InterfaceC4589n0 interfaceC4589n0) {
        AbstractC4593p0 abstractC4593p0 = (AbstractC4593p0) interfaceC4589n0;
        C4484p.rce(abstractC4593p0.m21601d(), abstractC4593p0.m21600c(), abstractC4593p0.mo21558a(), abstractC4593p0.m21599b());
        if (YandexMetrica.getLibraryApiLevel() >= 68) {
            try {
                C4484p.seb();
            } catch (Exception unused) {
            }
        }
    }
}
