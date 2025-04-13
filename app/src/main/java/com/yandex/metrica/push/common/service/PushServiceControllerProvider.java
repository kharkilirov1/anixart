package com.yandex.metrica.push.common.service;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
public class PushServiceControllerProvider {

    /* renamed from: a */
    @NonNull
    private final InterfaceC4493b f47236a;

    @RequiresApi
    /* renamed from: com.yandex.metrica.push.common.service.PushServiceControllerProvider$a */
    public static class C4492a implements InterfaceC4493b {

        /* renamed from: a */
        @NonNull
        private final C4495a f47237a;

        public C4492a(@NonNull Context context) {
            this.f47237a = new C4495a(context);
        }

        @Override // com.yandex.metrica.push.common.service.PushServiceControllerProvider.InterfaceC4493b
        @NonNull
        /* renamed from: a */
        public PushServiceCommandLauncher mo21360a() {
            return this.f47237a;
        }
    }

    /* renamed from: com.yandex.metrica.push.common.service.PushServiceControllerProvider$b */
    public interface InterfaceC4493b {
        @NonNull
        /* renamed from: a */
        PushServiceCommandLauncher mo21360a();
    }

    /* renamed from: com.yandex.metrica.push.common.service.PushServiceControllerProvider$c */
    public static class C4494c implements InterfaceC4493b {

        /* renamed from: a */
        @NonNull
        private final C4496b f47238a;

        public C4494c(@NonNull Context context) {
            this.f47238a = new C4496b(context);
        }

        @Override // com.yandex.metrica.push.common.service.PushServiceControllerProvider.InterfaceC4493b
        @NonNull
        /* renamed from: a */
        public PushServiceCommandLauncher mo21360a() {
            return this.f47238a;
        }
    }

    public PushServiceControllerProvider(@NonNull Context context) {
        this.f47236a = m21359a(context);
    }

    @NonNull
    /* renamed from: a */
    private static InterfaceC4493b m21359a(@NonNull Context context) {
        return Build.VERSION.SDK_INT >= 26 ? new C4492a(context) : new C4494c(context);
    }

    @NonNull
    public PushServiceCommandLauncher getPushServiceCommandLauncher() {
        return this.f47236a.mo21360a();
    }
}
