package com.yandex.mobile.ads.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class AdRequestError {

    /* renamed from: a */
    @NonNull
    private final String f47794a;

    /* renamed from: b */
    private final int f47795b;

    public static final class Code {
        public static final int INTERNAL_ERROR = 1;
        public static final int INVALID_REQUEST = 2;
        public static final int NETWORK_ERROR = 3;
        public static final int NO_FILL = 4;
        public static final int SYSTEM_ERROR = 5;
        public static final int UNKNOWN_ERROR = 0;
    }

    public AdRequestError(int i2, @Nullable String str) {
        this.f47795b = i2;
        this.f47794a = str == null ? "Unknown reason" : str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdRequestError.class != obj.getClass()) {
            return false;
        }
        AdRequestError adRequestError = (AdRequestError) obj;
        if (this.f47795b != adRequestError.f47795b) {
            return false;
        }
        return this.f47794a.equals(adRequestError.f47794a);
    }

    public int getCode() {
        return this.f47795b;
    }

    @NonNull
    public String getDescription() {
        return this.f47794a;
    }

    public int hashCode() {
        return (this.f47794a.hashCode() * 31) + this.f47795b;
    }

    @NonNull
    public String toString() {
        return String.format(Locale.US, "AdRequestError (code: %d, description: %s)", Integer.valueOf(this.f47795b), this.f47794a);
    }
}
