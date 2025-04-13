package com.swiftsoft.anixartd.network.response.auth;

import com.swiftsoft.anixartd.network.Response;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: FirebaseResponse.kt */
@Metadata(m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/response/auth/FirebaseResponse;", "Lcom/swiftsoft/anixartd/network/Response;", "()V", "topicName", "", "getTopicName", "()Ljava/lang/String;", "setTopicName", "(Ljava/lang/String;)V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class FirebaseResponse extends Response {

    @Nullable
    private String topicName;

    @Nullable
    public final String getTopicName() {
        return this.topicName;
    }

    public final void setTopicName(@Nullable String str) {
        this.topicName = str;
    }
}
