package com.yandex.metrica.push.common;

/* loaded from: classes2.dex */
public class CoreConstants {
    public static final String EXCEPTION_MESSAGE_ERROR_ACTIVATE = "Metrica Push SDK is not activated correctly. Please, activate in accordance with the documentation: https://appmetrica.yandex.ru/docs/mobile-sdk-dg/push/android-initialize.html";
    public static final String EXTRA_TRANSPORT = "com.yandex.metrica.push.extra.TRANSPORT";
    public static final String LINK_TO_INTEGRATION_PUSH_SDK = "https://appmetrica.yandex.ru/docs/mobile-sdk-dg/push/android-initialize.html";

    public static class Transport {
        public static final String FIREBASE = "firebase";
        public static final String GCM = "gcm";
        public static final String HMS = "hms";
        public static final String UNKNOWN = "unknown";
    }
}
