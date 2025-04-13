package com.swiftsoft.anixartd.network.response.profile;

import com.swiftsoft.anixartd.network.Response;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChangeEmailConfirmResponse.kt */
@Metadata(m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/response/profile/ChangeEmailConfirmResponse;", "Lcom/swiftsoft/anixartd/network/Response;", "()V", "emailHint", "", "getEmailHint", "()Ljava/lang/String;", "setEmailHint", "(Ljava/lang/String;)V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ChangeEmailConfirmResponse extends Response {
    public static final int INVALID_PASSWORD = 2;

    @Nullable
    private String emailHint;

    @Nullable
    public final String getEmailHint() {
        return this.emailHint;
    }

    public final void setEmailHint(@Nullable String str) {
        this.emailHint = str;
    }
}
