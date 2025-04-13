package com.yandex.metrica.impl.p023ob;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.C3130i;
import com.yandex.metrica.C4483l;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.impl.p023ob.ResultReceiverC4144n0;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.d1 */
/* loaded from: classes2.dex */
public interface InterfaceC3885d1 extends InterfaceC4379w1, ResultReceiverC4144n0.a, InterfaceC3756Y0 {
    @NonNull
    @WorkerThread
    /* renamed from: a */
    InterfaceC3706W0 mo18759a(@NonNull C3130i c3130i);

    @Nullable
    @AnyThread
    /* renamed from: a */
    String mo18760a();

    @WorkerThread
    /* renamed from: a */
    void mo18761a(@NonNull AppMetricaDeviceIDListener appMetricaDeviceIDListener);

    @WorkerThread
    /* renamed from: a */
    void mo18762a(DeferredDeeplinkListener deferredDeeplinkListener);

    @WorkerThread
    /* renamed from: a */
    void mo18763a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener);

    @WorkerThread
    /* renamed from: a */
    void mo18764a(IIdentifierCallback iIdentifierCallback, @NonNull List<String> list);

    @WorkerThread
    /* renamed from: a */
    void mo18765a(@NonNull YandexMetricaConfig yandexMetricaConfig, @NonNull C4483l c4483l);

    @Nullable
    @AnyThread
    /* renamed from: c */
    String mo18766c();

    @WorkerThread
    /* renamed from: c */
    void mo18767c(@NonNull C3130i c3130i);

    @Nullable
    @AnyThread
    /* renamed from: d */
    C4301t1 mo18768d();
}
