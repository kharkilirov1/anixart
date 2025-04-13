package io.grpc.stub;

import io.grpc.Internal;
import io.grpc.stub.ClientCalls;

@Internal
/* loaded from: classes3.dex */
public final class InternalClientCalls {

    public enum StubType {
        /* JADX INFO: Fake field, exist only in values array */
        BLOCKING(ClientCalls.StubType.BLOCKING),
        /* JADX INFO: Fake field, exist only in values array */
        ASYNC(ClientCalls.StubType.ASYNC),
        /* JADX INFO: Fake field, exist only in values array */
        FUTURE(ClientCalls.StubType.FUTURE);

        StubType(ClientCalls.StubType stubType) {
        }
    }
}
