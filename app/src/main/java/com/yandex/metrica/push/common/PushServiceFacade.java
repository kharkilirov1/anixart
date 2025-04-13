package com.yandex.metrica.push.common;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.push.common.service.PushServiceControllerProvider;
import com.yandex.metrica.push.common.utils.TrackersHub;

/* loaded from: classes2.dex */
public class PushServiceFacade {
    public static final String COMMAND_INIT_PUSH_SERVICE = "com.yandex.metrica.push.command.INIT_PUSH_SERVICE";
    public static final String COMMAND_INIT_PUSH_TOKEN = "com.yandex.metrica.push.command.INIT_PUSH_TOKEN";
    public static final String COMMAND_PROCESS_PUSH = "com.yandex.metrica.push.command.PROCESS_PUSH";
    public static final String COMMAND_UPDATE_TOKEN = "com.yandex.metrica.push.command.REFRESH_TOKEN";
    public static final String EXTRA_COMMAND = "com.yandex.metrica.push.extra.COMMAND";
    public static final String EXTRA_COMMAND_RECEIVED_TIME = "com.yandex.metrica.push.extra.EXTRA_COMMAND_RECEIVED_TIME";
    public static final String REFRESH_TOKEN_INFO = "com.yandex.metrica.push.REFRESH_TOKEN_INFO";

    /* renamed from: a */
    @NonNull
    private static CommandServiceWrapper f47234a = new CommandServiceWrapper();

    public static class CommandServiceWrapper {

        /* renamed from: a */
        @Nullable
        private PushServiceControllerProvider f47235a;

        @NonNull
        /* renamed from: a */
        private synchronized PushServiceControllerProvider m21358a(@NonNull Context context) {
            if (this.f47235a == null) {
                this.f47235a = new PushServiceControllerProvider(context);
            }
            return this.f47235a;
        }

        public void startCommand(@NonNull Context context, @NonNull Bundle bundle) {
            try {
                m21358a(context).getPushServiceCommandLauncher().launchService(bundle);
            } catch (Throwable th) {
                TrackersHub.getInstance().reportError("Start failed", th);
            }
        }
    }

    @NonNull
    public static Bundle createBundleWithCommand(@NonNull String str) {
        Bundle bundle = new Bundle();
        bundle.putString(EXTRA_COMMAND, str);
        bundle.putLong(EXTRA_COMMAND_RECEIVED_TIME, System.currentTimeMillis());
        return bundle;
    }

    public static void initPushService(@NonNull Context context) {
        Bundle bundle = new Bundle();
        bundle.putAll(createBundleWithCommand(COMMAND_INIT_PUSH_SERVICE));
        f47234a.startCommand(context, bundle);
    }

    public static void initToken(@NonNull Context context) {
        initToken(context, false);
    }

    public static void processPush(@NonNull Context context, @NonNull Bundle bundle, @NonNull String str) {
        Bundle bundle2 = new Bundle();
        bundle2.putAll(createBundleWithCommand(COMMAND_PROCESS_PUSH));
        bundle2.putAll(bundle);
        bundle2.putString(CoreConstants.EXTRA_TRANSPORT, str);
        f47234a.startCommand(context, bundle2);
    }

    public static void refreshToken(@NonNull Context context) {
        refreshToken(context, false);
    }

    @VisibleForTesting
    public static void setJobIntentServiceWrapper(@NonNull CommandServiceWrapper commandServiceWrapper) {
        f47234a = commandServiceWrapper;
    }

    public static void initToken(@NonNull Context context, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putAll(createBundleWithCommand(COMMAND_INIT_PUSH_TOKEN));
        bundle.putBundle(REFRESH_TOKEN_INFO, new RefreshTokenInfo(z).toBundle());
        f47234a.startCommand(context, bundle);
    }

    public static void refreshToken(@NonNull Context context, boolean z) {
        refreshToken(context, new RefreshTokenInfo(z));
    }

    public static void refreshToken(@NonNull Context context, @NonNull RefreshTokenInfo refreshTokenInfo) {
        Bundle bundle = new Bundle();
        bundle.putAll(createBundleWithCommand(COMMAND_UPDATE_TOKEN));
        bundle.putBundle(REFRESH_TOKEN_INFO, refreshTokenInfo.toBundle());
        f47234a.startCommand(context, bundle);
    }
}
