package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.remote.Stream;
import com.google.firestore.p012v1.WriteRequest;
import com.google.firestore.p012v1.WriteResponse;
import com.google.protobuf.ByteString;

/* loaded from: classes2.dex */
public class WriteStream extends AbstractStream<WriteRequest, WriteResponse, Callback> {

    public interface Callback extends Stream.StreamCallback {
    }

    static {
        ByteString byteString = ByteString.f23981c;
    }
}
