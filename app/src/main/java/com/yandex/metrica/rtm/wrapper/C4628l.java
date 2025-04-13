package com.yandex.metrica.rtm.wrapper;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.yandex.metrica.rtm.service.EventToReporterProxy;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.rtm.wrapper.l */
/* loaded from: classes2.dex */
public class C4628l implements InterfaceC4622f {

    /* renamed from: a */
    @NonNull
    public final EventToReporterProxy f47601a;

    public C4628l(@NonNull InterfaceC4625i interfaceC4625i, @NonNull Context context, @NonNull Executor executor, @NonNull InterfaceC4626j interfaceC4626j) {
        this.f47601a = new EventToReporterProxy(new C4617a(), context, executor, new C4619c());
    }

    @Override // com.yandex.metrica.rtm.wrapper.InterfaceC4622f
    public void reportData(@NonNull Bundle bundle) {
        try {
            this.f47601a.reportData(bundle);
        } catch (Throwable unused) {
        }
    }
}
