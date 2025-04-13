package com.swiftsoft.anixartd.network.response.auth;

import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.database.entity.ProfileToken;
import com.swiftsoft.anixartd.network.Response;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GoogleResponse.kt */
@Metadata(m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/response/auth/GoogleResponse;", "Lcom/swiftsoft/anixartd/network/Response;", "()V", "codeTimestampExpires", "", "getCodeTimestampExpires", "()J", "setCodeTimestampExpires", "(J)V", "hash", "", "getHash", "()Ljava/lang/String;", "setHash", "(Ljava/lang/String;)V", "profile", "Lcom/swiftsoft/anixartd/database/entity/Profile;", "getProfile", "()Lcom/swiftsoft/anixartd/database/entity/Profile;", "setProfile", "(Lcom/swiftsoft/anixartd/database/entity/Profile;)V", "profileToken", "Lcom/swiftsoft/anixartd/database/entity/ProfileToken;", "getProfileToken", "()Lcom/swiftsoft/anixartd/database/entity/ProfileToken;", "setProfileToken", "(Lcom/swiftsoft/anixartd/database/entity/ProfileToken;)V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class GoogleResponse extends Response {
    public static final int EMAIL_ALREADY_TAKEN = 7;
    public static final int EMAIL_CHANGED = 8;
    public static final int EMAIL_CHANGED_AND_CODE_ALREADY_SEND = 9;
    public static final int EMAIL_SERVICE_DISALLOWED = 10;
    public static final int INVALID_EMAIL = 5;
    public static final int INVALID_LOGIN = 4;
    public static final int INVALID_REQUEST = 2;
    public static final int LOGIN_ALREADY_TAKEN = 6;
    public static final int NOT_REGISTERED = 3;
    public static final int TOO_MANY_REGISTRATIONS = 11;
    private long codeTimestampExpires;

    @NotNull
    private String hash = "";

    @Nullable
    private Profile profile;

    @Nullable
    private ProfileToken profileToken;

    public final long getCodeTimestampExpires() {
        return this.codeTimestampExpires;
    }

    @NotNull
    public final String getHash() {
        return this.hash;
    }

    @Nullable
    public final Profile getProfile() {
        return this.profile;
    }

    @Nullable
    public final ProfileToken getProfileToken() {
        return this.profileToken;
    }

    public final void setCodeTimestampExpires(long j2) {
        this.codeTimestampExpires = j2;
    }

    public final void setHash(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.hash = str;
    }

    public final void setProfile(@Nullable Profile profile) {
        this.profile = profile;
    }

    public final void setProfileToken(@Nullable ProfileToken profileToken) {
        this.profileToken = profileToken;
    }
}
