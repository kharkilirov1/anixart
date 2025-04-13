package io.grpc.stub;

import io.grpc.stub.AbstractStub;
import javax.annotation.CheckReturnValue;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@CheckReturnValue
/* loaded from: classes3.dex */
public abstract class AbstractStub<S extends AbstractStub<S>> {

    public interface StubFactory<T extends AbstractStub<T>> {
    }
}
