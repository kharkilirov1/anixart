package com.swiftsoft.anixartd.network.request;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.swiftsoft.anixartd.network.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: UserRequest.kt */
@Metadata(m31883d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/request/UserRequest;", "Lcom/swiftsoft/anixartd/network/Request;", "()V", FirebaseMessagingService.EXTRA_TOKEN, "", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "fillToken", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public abstract class UserRequest extends Request {

    @NotNull
    private String token = "";

    public final void fillToken(@NotNull String token) {
        Intrinsics.m32179h(token, "token");
        this.token = token;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public final void setToken(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.token = str;
    }
}
