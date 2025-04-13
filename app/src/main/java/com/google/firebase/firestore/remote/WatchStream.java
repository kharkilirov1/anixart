package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.remote.Stream;
import com.google.firestore.p012v1.ListenRequest;
import com.google.firestore.p012v1.ListenResponse;
import com.google.protobuf.ByteString;

/* loaded from: classes2.dex */
public class WatchStream extends AbstractStream<ListenRequest, ListenResponse, Callback> {

    /* renamed from: b */
    public static final ByteString f22998b = ByteString.f23981c;

    public interface Callback extends Stream.StreamCallback {
    }
}
