package com.swiftsoft.anixartd.database.entity.notification.silent;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;
import com.swiftsoft.anixartd.database.entity.notification.SilentPush;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ApiSilentPush.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/notification/silent/ApiSilentPush;", "Lcom/swiftsoft/anixartd/database/entity/notification/SilentPush;", "()V", "apiAltUrl", "", "getApiAltUrl", "()Ljava/lang/String;", "setApiAltUrl", "(Ljava/lang/String;)V", "apiUrl", "getApiUrl", "setApiUrl", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ApiSilentPush extends SilentPush {

    @SerializedName("api_url")
    @NotNull
    private String apiUrl = "";

    @SerializedName("api_alt_url")
    @NotNull
    private String apiAltUrl = "";

    @NotNull
    public final String getApiAltUrl() {
        return this.apiAltUrl;
    }

    @NotNull
    public final String getApiUrl() {
        return this.apiUrl;
    }

    public final void setApiAltUrl(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.apiAltUrl = str;
    }

    public final void setApiUrl(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.apiUrl = str;
    }
}
