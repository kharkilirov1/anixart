package com.google.firestore.p012v1;

import io.grpc.BindableService;
import io.grpc.stub.AbstractAsyncStub;
import io.grpc.stub.AbstractBlockingStub;
import io.grpc.stub.AbstractFutureStub;
import io.grpc.stub.AbstractStub;
import io.grpc.stub.ServerCalls;
import io.grpc.stub.annotations.GrpcGenerated;

@GrpcGenerated
/* loaded from: classes2.dex */
public final class FirestoreGrpc {

    /* renamed from: com.google.firestore.v1.FirestoreGrpc$1 */
    class C22021 implements AbstractStub.StubFactory<FirestoreStub> {
    }

    /* renamed from: com.google.firestore.v1.FirestoreGrpc$2 */
    class C22032 implements AbstractStub.StubFactory<FirestoreBlockingStub> {
    }

    /* renamed from: com.google.firestore.v1.FirestoreGrpc$3 */
    class C22043 implements AbstractStub.StubFactory<FirestoreFutureStub> {
    }

    public static final class FirestoreBlockingStub extends AbstractBlockingStub<FirestoreBlockingStub> {
    }

    public static final class FirestoreFutureStub extends AbstractFutureStub<FirestoreFutureStub> {
    }

    public static abstract class FirestoreImplBase implements BindableService {
    }

    public static final class FirestoreStub extends AbstractAsyncStub<FirestoreStub> {
    }

    public static final class MethodHandlers<Req, Resp> implements ServerCalls.UnaryMethod<Req, Resp>, ServerCalls.ServerStreamingMethod<Req, Resp>, ServerCalls.ClientStreamingMethod<Req, Resp>, ServerCalls.BidiStreamingMethod<Req, Resp> {
    }
}
