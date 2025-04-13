package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Mj */
/* loaded from: classes2.dex */
class C3476Mj implements InterfaceC3706W0 {

    /* renamed from: a */
    private final C3451Lj f43445a = new C3451Lj();

    /* renamed from: a */
    public void mo18344a(@NonNull C3917e7 c3917e7) {
    }

    /* renamed from: a */
    public void mo18346a(@NonNull C4203p7 c4203p7) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3706W0
    /* renamed from: a */
    public void mo18348a(@NonNull String str, @NonNull JSONObject jSONObject) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3706W0
    /* renamed from: b */
    public void mo18350b() {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3706W0, com.yandex.metrica.InterfaceC3126g
    /* renamed from: b */
    public void mo17792b(@Nullable String str, @Nullable String str2) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3706W0, com.yandex.metrica.InterfaceC3126g
    /* renamed from: d */
    public void mo17793d(@NonNull String str, @Nullable String str2) {
    }

    @Override // com.yandex.metrica.IReporter
    @NonNull
    public IPluginReporter getPluginExtension() {
        return this.f43445a;
    }

    @Override // com.yandex.metrica.IReporter
    public void pauseSession() {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(@NonNull String str, @Nullable String str2) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(@NonNull String str, @Nullable String str2, @Nullable Throwable th) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(@NonNull String str, @Nullable Throwable th) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(@NonNull String str) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(@NonNull String str, @Nullable String str2) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportRevenue(@NonNull Revenue revenue) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUnhandledException(@NonNull Throwable th) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUserProfile(@NonNull UserProfile userProfile) {
    }

    @Override // com.yandex.metrica.IReporter
    public void resumeSession() {
    }

    @Override // com.yandex.metrica.IReporter
    public void sendEventsBuffer() {
    }

    @Override // com.yandex.metrica.IReporter
    public void setStatisticsSending(boolean z) {
    }

    @Override // com.yandex.metrica.IReporter
    public void setUserProfileID(@Nullable String str) {
    }
}
