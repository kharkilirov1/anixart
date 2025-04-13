package com.yandex.metrica.rtm.wrapper;

import androidx.annotation.NonNull;
import com.yandex.metrica.rtm.client.DataSender;
import com.yandex.metrica.rtm.client.ReporterDescriptor;

/* renamed from: com.yandex.metrica.rtm.wrapper.g */
/* loaded from: classes2.dex */
public class C4623g implements InterfaceC4620d {
    public C4623g(@NonNull InterfaceC4627k interfaceC4627k, @NonNull String str, boolean z) throws Throwable {
        new DataSender(new C4629m(), new ReporterDescriptor(str, z));
    }
}
