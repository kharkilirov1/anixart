package com.swiftsoft.anixartd.network.request.auth;

import com.swiftsoft.anixartd.network.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: RegisterRequest.kt */
@Metadata(m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0010"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/request/auth/RegisterRequest;", "Lcom/swiftsoft/anixartd/network/Request;", "()V", "email", "", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "login", "getLogin", "setLogin", "password", "getPassword", "setPassword", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class RegisterRequest extends Request {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private String login = "";

    @NotNull
    private String email = "";

    @NotNull
    private String password = "";

    /* compiled from: RegisterRequest.kt */
    @Metadata(m31883d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/request/auth/RegisterRequest$Companion;", "", "()V", "create", "Lcom/swiftsoft/anixartd/network/request/auth/RegisterRequest;", "login", "", "email", "password", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RegisterRequest create(@NotNull String login, @NotNull String email, @NotNull String password) {
            Intrinsics.m32179h(login, "login");
            Intrinsics.m32179h(email, "email");
            Intrinsics.m32179h(password, "password");
            RegisterRequest registerRequest = new RegisterRequest();
            registerRequest.setLogin(login);
            registerRequest.setEmail(email);
            registerRequest.setPassword(password);
            return registerRequest;
        }
    }

    @NotNull
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    public final String getLogin() {
        return this.login;
    }

    @NotNull
    public final String getPassword() {
        return this.password;
    }

    public final void setEmail(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.email = str;
    }

    public final void setLogin(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.login = str;
    }

    public final void setPassword(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.password = str;
    }
}
