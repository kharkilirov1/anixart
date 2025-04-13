package com.yandex.metrica;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public class FeaturesResult {

    @Nullable
    private final Boolean libSslEnabled;

    public FeaturesResult(@Nullable Boolean bool) {
        this.libSslEnabled = bool;
    }

    @Nullable
    public Boolean getLibSslEnabled() {
        return this.libSslEnabled;
    }
}
