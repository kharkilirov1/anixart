package com.google.firebase.firestore.remote;

import io.grpc.CallCredentials;
import io.grpc.Metadata;

/* loaded from: classes2.dex */
final class FirestoreCallCredentials extends CallCredentials {

    /* renamed from: a */
    public static final Metadata.Key<String> f22936a;

    /* renamed from: b */
    public static final Metadata.Key<String> f22937b;

    static {
        Metadata.AsciiMarshaller<String> asciiMarshaller = Metadata.f58205d;
        f22936a = Metadata.Key.m30914a("Authorization", asciiMarshaller);
        f22937b = Metadata.Key.m30914a("x-firebase-appcheck", asciiMarshaller);
    }
}
