package com.yandex.metrica.rtm.wrapper;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.rtm.client.ExceptionProcessor;

/* renamed from: com.yandex.metrica.rtm.wrapper.h */
/* loaded from: classes2.dex */
public class C4624h implements InterfaceC4621e {

    /* renamed from: a */
    @NonNull
    public final ExceptionProcessor f47600a;

    public C4624h(@NonNull InterfaceC4625i interfaceC4625i, @NonNull Context context) throws Throwable {
        this.f47600a = new ExceptionProcessor(context, new C4617a());
    }

    @Override // com.yandex.metrica.rtm.wrapper.InterfaceC4621e
    public void reportException(@Nullable String str, @Nullable Throwable th) {
        try {
            this.f47600a.onException(str, th);
        } catch (Throwable unused) {
        }
    }
}
