package io.grpc;

import com.google.common.base.Preconditions;

@ExperimentalApi
/* loaded from: classes3.dex */
public final class ConnectivityStateInfo {

    /* renamed from: a */
    public final ConnectivityState f58096a;

    /* renamed from: b */
    public final Status f58097b;

    public ConnectivityStateInfo(ConnectivityState connectivityState, Status status) {
        Preconditions.m11187k(connectivityState, "state is null");
        this.f58096a = connectivityState;
        Preconditions.m11187k(status, "status is null");
        this.f58097b = status;
    }

    /* renamed from: a */
    public static ConnectivityStateInfo m30827a(ConnectivityState connectivityState) {
        Preconditions.m11179c(connectivityState != ConnectivityState.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new ConnectivityStateInfo(connectivityState, Status.f58278e);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ConnectivityStateInfo)) {
            return false;
        }
        ConnectivityStateInfo connectivityStateInfo = (ConnectivityStateInfo) obj;
        return this.f58096a.equals(connectivityStateInfo.f58096a) && this.f58097b.equals(connectivityStateInfo.f58097b);
    }

    public int hashCode() {
        return this.f58096a.hashCode() ^ this.f58097b.hashCode();
    }

    public String toString() {
        if (this.f58097b.m30945e()) {
            return this.f58096a.toString();
        }
        return this.f58096a + "(" + this.f58097b + ")";
    }
}
