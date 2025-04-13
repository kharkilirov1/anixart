package com.yandex.metrica.impl.p023ob;

import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.C3130i;
import com.yandex.metrica.C4483l;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Pj */
/* loaded from: classes2.dex */
public class C3551Pj implements InterfaceC3885d1 {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3885d1
    @NonNull
    /* renamed from: a */
    public InterfaceC3706W0 mo18759a(@NonNull C3130i c3130i) {
        return new C3476Mj();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3885d1
    @Nullable
    /* renamed from: a */
    public String mo18760a() {
        return null;
    }

    @Override // com.yandex.metrica.impl.p023ob.ResultReceiverC4144n0.a
    /* renamed from: a */
    public void mo18335a(int i2, @NonNull Bundle bundle) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4379w1
    /* renamed from: a */
    public void mo18452a(@Nullable Location location) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3885d1
    /* renamed from: a */
    public void mo18761a(@NonNull AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3885d1
    /* renamed from: a */
    public void mo18762a(DeferredDeeplinkListener deferredDeeplinkListener) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3885d1
    /* renamed from: a */
    public void mo18763a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3885d1
    /* renamed from: a */
    public void mo18765a(@NonNull YandexMetricaConfig yandexMetricaConfig, @NonNull C4483l c4483l) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4379w1
    /* renamed from: a */
    public void mo18459a(boolean z) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3756Y0
    @NonNull
    /* renamed from: b */
    public InterfaceC3731X0 mo18639b() {
        return new C3501Nj();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4379w1
    /* renamed from: b */
    public void mo18462b(boolean z) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3885d1
    @Nullable
    /* renamed from: c */
    public String mo18766c() {
        return null;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3885d1
    /* renamed from: c */
    public void mo18767c(@NonNull C3130i c3130i) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4379w1
    /* renamed from: c */
    public void mo18354c(String str, String str2) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3885d1
    @Nullable
    /* renamed from: d */
    public C4301t1 mo18768d() {
        return new C4301t1(new C3426Kj());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4379w1
    public void setStatisticsSending(boolean z) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4379w1
    public void setUserProfileID(@Nullable String str) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3885d1
    /* renamed from: a */
    public void mo18764a(IIdentifierCallback iIdentifierCallback, @NonNull List<String> list) {
        iIdentifierCallback.onRequestError(IIdentifierCallback.Reason.UNKNOWN);
    }
}
