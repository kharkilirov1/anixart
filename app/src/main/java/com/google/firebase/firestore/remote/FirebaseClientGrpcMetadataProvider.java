package com.google.firebase.firestore.remote;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.platforminfo.UserAgentPublisher;
import io.grpc.Metadata;

/* loaded from: classes2.dex */
public class FirebaseClientGrpcMetadataProvider implements GrpcMetadataProvider {

    /* renamed from: d */
    public static final Metadata.Key<String> f22930d;

    /* renamed from: e */
    public static final Metadata.Key<String> f22931e;

    /* renamed from: f */
    public static final Metadata.Key<String> f22932f;

    /* renamed from: a */
    public final Provider<HeartBeatInfo> f22933a;

    /* renamed from: b */
    public final Provider<UserAgentPublisher> f22934b;

    /* renamed from: c */
    public final FirebaseOptions f22935c;

    static {
        Metadata.AsciiMarshaller<String> asciiMarshaller = Metadata.f58205d;
        f22930d = Metadata.Key.m30914a("x-firebase-client-log-type", asciiMarshaller);
        f22931e = Metadata.Key.m30914a("x-firebase-client", asciiMarshaller);
        f22932f = Metadata.Key.m30914a("x-firebase-gmpid", asciiMarshaller);
    }

    public FirebaseClientGrpcMetadataProvider(@NonNull Provider<UserAgentPublisher> provider, @NonNull Provider<HeartBeatInfo> provider2, @Nullable FirebaseOptions firebaseOptions) {
        this.f22934b = provider;
        this.f22933a = provider2;
        this.f22935c = firebaseOptions;
    }
}
