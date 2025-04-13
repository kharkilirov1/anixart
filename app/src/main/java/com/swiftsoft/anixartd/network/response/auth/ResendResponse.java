package com.swiftsoft.anixartd.network.response.auth;

import com.swiftsoft.anixartd.network.Response;
import kotlin.Metadata;

/* compiled from: ResendResponse.kt */
@Metadata(m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/response/auth/ResendResponse;", "Lcom/swiftsoft/anixartd/network/Response;", "()V", "timestampExpires", "", "getTimestampExpires", "()J", "setTimestampExpires", "(J)V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ResendResponse extends Response {
    public static final int CODE_CANNOT_SEND = 6;
    public static final int INVALID_EMAIL = 3;
    public static final int INVALID_HASH = 5;
    public static final int INVALID_LOGIN = 2;
    public static final int INVALID_PASSWORD = 4;
    private long timestampExpires;

    public final long getTimestampExpires() {
        return this.timestampExpires;
    }

    public final void setTimestampExpires(long j2) {
        this.timestampExpires = j2;
    }
}
