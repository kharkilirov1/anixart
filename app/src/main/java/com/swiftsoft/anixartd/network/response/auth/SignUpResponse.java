package com.swiftsoft.anixartd.network.response.auth;

import com.swiftsoft.anixartd.network.Response;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SignUpResponse.kt */
@Metadata(m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/response/auth/SignUpResponse;", "Lcom/swiftsoft/anixartd/network/Response;", "()V", "codeTimestampExpires", "", "getCodeTimestampExpires", "()J", "setCodeTimestampExpires", "(J)V", "hash", "", "getHash", "()Ljava/lang/String;", "setHash", "(Ljava/lang/String;)V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class SignUpResponse extends Response {
    public static final int CODE_ALREADY_SEND = 7;
    public static final int CODE_CANNOT_SEND = 8;
    public static final int EMAIL_ALREADY_TAKEN = 6;
    public static final int EMAIL_SERVICE_DISALLOWED = 9;
    public static final int INVALID_EMAIL = 3;
    public static final int INVALID_LOGIN = 2;
    public static final int INVALID_PASSWORD = 4;
    public static final int LOGIN_ALREADY_TAKEN = 5;
    public static final int TOO_MANY_REGISTRATIONS = 10;
    private long codeTimestampExpires;

    @NotNull
    private String hash = "";

    public final long getCodeTimestampExpires() {
        return this.codeTimestampExpires;
    }

    @NotNull
    public final String getHash() {
        return this.hash;
    }

    public final void setCodeTimestampExpires(long j2) {
        this.codeTimestampExpires = j2;
    }

    public final void setHash(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.hash = str;
    }
}
