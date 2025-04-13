package com.yandex.metrica.profile;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.InterfaceC3347Hf;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public class UserProfile {

    /* renamed from: a */
    @NonNull
    public final List<UserProfileUpdate<? extends InterfaceC3347Hf>> f47222a;

    public static class Builder {

        /* renamed from: a */
        public final LinkedList<UserProfileUpdate<? extends InterfaceC3347Hf>> f47223a = new LinkedList<>();

        public Builder apply(@NonNull UserProfileUpdate<? extends InterfaceC3347Hf> userProfileUpdate) {
            this.f47223a.add(userProfileUpdate);
            return this;
        }

        @NonNull
        public UserProfile build() {
            return new UserProfile(this.f47223a, null);
        }
    }

    public UserProfile(List list, C4487a c4487a) {
        this.f47222a = Collections.unmodifiableList(list);
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    @NonNull
    public List<UserProfileUpdate<? extends InterfaceC3347Hf>> getUserProfileUpdates() {
        return this.f47222a;
    }
}
