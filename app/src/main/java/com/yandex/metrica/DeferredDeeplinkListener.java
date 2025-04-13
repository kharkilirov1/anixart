package com.yandex.metrica;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public interface DeferredDeeplinkListener {

    public enum Error {
        NOT_A_FIRST_LAUNCH("Deferred deeplink can be requested during first launch only."),
        PARSE_ERROR("Google Play referrer did not contain deferred deeplink."),
        NO_REFERRER("No referrer was found"),
        UNKNOWN("Unknown error");

        private final String mDescription;

        Error(String str) {
            this.mDescription = str;
        }

        public String getDescription() {
            return this.mDescription;
        }
    }

    void onDeeplinkLoaded(@NonNull String str);

    void onError(@NonNull Error error, @Nullable String str);
}
