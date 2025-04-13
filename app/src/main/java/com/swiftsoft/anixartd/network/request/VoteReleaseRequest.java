package com.swiftsoft.anixartd.network.request;

import kotlin.Metadata;

/* compiled from: VoteReleaseRequest.kt */
@Metadata(m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/request/VoteReleaseRequest;", "Lcom/swiftsoft/anixartd/network/request/UserRequest;", "()V", "vote", "", "getVote", "()I", "setVote", "(I)V", "fill", "", "num", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class VoteReleaseRequest extends UserRequest {
    private int vote;

    public final void fill(int num) {
        this.vote = num;
    }

    public final int getVote() {
        return this.vote;
    }

    public final void setVote(int i2) {
        this.vote = i2;
    }
}
