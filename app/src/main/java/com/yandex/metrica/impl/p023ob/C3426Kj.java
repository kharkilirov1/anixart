package com.yandex.metrica.impl.p023ob;

import android.app.Activity;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.impl.p023ob.C4429y;
import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Kj */
/* loaded from: classes2.dex */
public class C3426Kj extends C3476Mj implements InterfaceC3656U0 {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3606S0
    /* renamed from: a */
    public void mo18343a(int i2, String str, String str2, Map<String, String> map) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3656U0
    /* renamed from: a */
    public void mo18451a(@Nullable Activity activity) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4379w1
    /* renamed from: a */
    public void mo18452a(@Nullable Location location) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3656U0
    /* renamed from: a */
    public void mo18453a(@NonNull InterfaceC3528Ol interfaceC3528Ol, boolean z) {
        interfaceC3528Ol.onError("Device user is in locked state");
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3656U0
    /* renamed from: a */
    public void mo18454a(@NonNull C3733X2 c3733x2) {
    }

    @Override // com.yandex.metrica.impl.p023ob.C3476Mj, com.yandex.metrica.impl.p023ob.InterfaceC3833b1
    /* renamed from: a */
    public void mo18344a(@NonNull C3917e7 c3917e7) {
    }

    @Override // com.yandex.metrica.impl.p023ob.C3476Mj, com.yandex.metrica.impl.p023ob.InterfaceC3833b1
    /* renamed from: a */
    public void mo18346a(@NonNull C4203p7 c4203p7) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3656U0
    /* renamed from: a */
    public void mo18455a(@NonNull C4429y.c cVar) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3656U0
    /* renamed from: a */
    public void mo18456a(@NonNull String str) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3606S0
    /* renamed from: a */
    public void mo18347a(@NonNull String str, @Nullable String str2) {
    }

    @Override // com.yandex.metrica.impl.p023ob.C3476Mj, com.yandex.metrica.impl.p023ob.InterfaceC3706W0
    /* renamed from: a */
    public void mo18348a(@NonNull String str, @NonNull JSONObject jSONObject) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3656U0
    /* renamed from: a */
    public void mo18457a(@NonNull String str, boolean z) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4062jm
    /* renamed from: a */
    public void mo18458a(@NonNull JSONObject jSONObject) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4379w1
    /* renamed from: a */
    public void mo18459a(boolean z) {
    }

    @Override // com.yandex.metrica.impl.p023ob.C3476Mj, com.yandex.metrica.impl.p023ob.InterfaceC3706W0
    /* renamed from: b */
    public void mo18350b() {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3656U0
    /* renamed from: b */
    public void mo18460b(@Nullable Activity activity) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3606S0
    /* renamed from: b */
    public void mo18352b(@NonNull String str) {
    }

    @Override // com.yandex.metrica.impl.p023ob.C3476Mj, com.yandex.metrica.impl.p023ob.InterfaceC3706W0, com.yandex.metrica.InterfaceC3126g
    /* renamed from: b */
    public void mo17792b(@Nullable String str, @Nullable String str2) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4062jm
    /* renamed from: b */
    public void mo18461b(@NonNull JSONObject jSONObject) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4379w1
    /* renamed from: b */
    public void mo18462b(boolean z) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3606S0
    /* renamed from: c */
    public void mo18353c(@Nullable String str) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4379w1
    /* renamed from: c */
    public void mo18354c(String str, String str2) {
    }

    @Override // com.yandex.metrica.impl.p023ob.C3476Mj, com.yandex.metrica.impl.p023ob.InterfaceC3706W0, com.yandex.metrica.InterfaceC3126g
    /* renamed from: d */
    public void mo17793d(@NonNull String str, @Nullable String str2) {
    }

    @Override // com.yandex.metrica.impl.p023ob.C3476Mj, com.yandex.metrica.IReporter
    public void pauseSession() {
    }

    @Override // com.yandex.metrica.impl.p023ob.C3476Mj, com.yandex.metrica.IReporter
    public void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(@NonNull PluginErrorDetails pluginErrorDetails, @Nullable String str) {
    }

    @Override // com.yandex.metrica.impl.p023ob.C3476Mj, com.yandex.metrica.IReporter
    public void reportError(@NonNull String str, @Nullable String str2) {
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(@NonNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
    }

    @Override // com.yandex.metrica.impl.p023ob.C3476Mj, com.yandex.metrica.IReporter
    public void reportError(@NonNull String str, @Nullable String str2, @Nullable Throwable th) {
    }

    @Override // com.yandex.metrica.impl.p023ob.C3476Mj, com.yandex.metrica.IReporter
    public void reportError(@NonNull String str, @Nullable Throwable th) {
    }

    @Override // com.yandex.metrica.impl.p023ob.C3476Mj, com.yandex.metrica.IReporter
    public void reportEvent(@NonNull String str) {
    }

    @Override // com.yandex.metrica.impl.p023ob.C3476Mj, com.yandex.metrica.IReporter
    public void reportEvent(@NonNull String str, @Nullable String str2) {
    }

    @Override // com.yandex.metrica.impl.p023ob.C3476Mj, com.yandex.metrica.IReporter
    public void reportEvent(@NonNull String str, @Nullable Map map) {
    }

    @Override // com.yandex.metrica.impl.p023ob.C3476Mj, com.yandex.metrica.IReporter
    public void reportRevenue(@NonNull Revenue revenue) {
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
    }

    @Override // com.yandex.metrica.impl.p023ob.C3476Mj, com.yandex.metrica.IReporter
    public void reportUnhandledException(@NonNull Throwable th) {
    }

    @Override // com.yandex.metrica.impl.p023ob.C3476Mj, com.yandex.metrica.IReporter
    public void reportUserProfile(@NonNull UserProfile userProfile) {
    }

    @Override // com.yandex.metrica.impl.p023ob.C3476Mj, com.yandex.metrica.IReporter
    public void resumeSession() {
    }

    @Override // com.yandex.metrica.impl.p023ob.C3476Mj, com.yandex.metrica.IReporter
    public void sendEventsBuffer() {
    }

    @Override // com.yandex.metrica.impl.p023ob.C3476Mj, com.yandex.metrica.IReporter
    public void setStatisticsSending(boolean z) {
    }

    @Override // com.yandex.metrica.impl.p023ob.C3476Mj, com.yandex.metrica.IReporter
    public void setUserProfileID(@Nullable String str) {
    }
}
