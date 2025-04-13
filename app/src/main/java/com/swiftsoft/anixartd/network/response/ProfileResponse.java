package com.swiftsoft.anixartd.network.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.network.Response;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProfileResponse.kt */
@Metadata(m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/response/ProfileResponse;", "Lcom/swiftsoft/anixartd/network/Response;", "()V", "isMyProfile", "", "()Z", "setMyProfile", "(Z)V", "profile", "Lcom/swiftsoft/anixartd/database/entity/Profile;", "getProfile", "()Lcom/swiftsoft/anixartd/database/entity/Profile;", "setProfile", "(Lcom/swiftsoft/anixartd/database/entity/Profile;)V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ProfileResponse extends Response {

    @JsonProperty("is_my_profile")
    private boolean isMyProfile;

    @Nullable
    private Profile profile;

    @Nullable
    public final Profile getProfile() {
        return this.profile;
    }

    /* renamed from: isMyProfile, reason: from getter */
    public final boolean getIsMyProfile() {
        return this.isMyProfile;
    }

    public final void setMyProfile(boolean z) {
        this.isMyProfile = z;
    }

    public final void setProfile(@Nullable Profile profile) {
        this.profile = profile;
    }
}
