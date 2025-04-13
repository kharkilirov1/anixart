package io.grpc.inprocess;

import java.net.SocketAddress;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class InProcessSocketAddress extends SocketAddress {
    public boolean equals(Object obj) {
        if (!(obj instanceof InProcessSocketAddress)) {
            return false;
        }
        Objects.requireNonNull((InProcessSocketAddress) obj);
        throw null;
    }

    public int hashCode() {
        throw null;
    }

    public String toString() {
        return null;
    }
}
