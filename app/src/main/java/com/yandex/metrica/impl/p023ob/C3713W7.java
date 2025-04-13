package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.yandex.metrica.impl.p022ac.NativeCrashesHelper;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.W7 */
/* loaded from: classes2.dex */
public class C3713W7 implements InterfaceC3613S7 {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3613S7
    @NonNull
    /* renamed from: a */
    public String mo19075a() {
        return "YandexMetricaNativeCrashes";
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3613S7
    /* renamed from: a */
    public void mo19076a(@Nullable String str) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3613S7
    @WorkerThread
    /* renamed from: a */
    public void mo19077a(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        NativeCrashesHelper.setUpNativeUncaughtExceptionHandler(str2);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3613S7
    /* renamed from: b */
    public void mo19079b() {
        NativeCrashesHelper.cancelSetUpNativeUncaughtExceptionHandler();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3613S7
    @NonNull
    /* renamed from: c */
    public String mo19080c() {
        return "YandexMetricaNativeModule";
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3613S7
    /* renamed from: a */
    public void mo19078a(boolean z) {
        NativeCrashesHelper.logsEnabled(z);
    }
}
