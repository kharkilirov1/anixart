package com.swiftsoft.anixartd.network;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kotlin.Metadata;

/* compiled from: Response.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0017\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/Response;", "", "()V", "code", "", "getCode", "()I", "setCode", "(I)V", "isFailed", "", "isPermBanned", "isSuccess", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public class Response {
    public static final int BANNED = 402;
    public static final int FAILED = 1;
    public static final int PERM_BANNED = 403;
    public static final int SUCCESSFUL = 0;
    private int code;

    public final int getCode() {
        return this.code;
    }

    public final boolean isFailed() {
        return this.code == 1;
    }

    public final boolean isPermBanned() {
        return this.code == 403;
    }

    public final boolean isSuccess() {
        return this.code == 0;
    }

    public final void setCode(int i2) {
        this.code = i2;
    }
}
