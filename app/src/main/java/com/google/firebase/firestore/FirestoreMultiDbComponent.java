package com.google.firebase.firestore;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseAppLifecycleListener;
import com.google.firebase.appcheck.interop.InternalAppCheckTokenProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.remote.GrpcMetadataProvider;
import com.google.firebase.inject.Deferred;
import java.util.HashMap;

/* loaded from: classes2.dex */
class FirestoreMultiDbComponent implements FirebaseAppLifecycleListener, FirebaseFirestore.InstanceRegistry {

    /* renamed from: a */
    public final Deferred<InternalAuthProvider> f22648a;

    /* renamed from: b */
    public final Deferred<InternalAppCheckTokenProvider> f22649b;

    /* renamed from: c */
    public final GrpcMetadataProvider f22650c;

    public FirestoreMultiDbComponent(@NonNull Context context, @NonNull FirebaseApp firebaseApp, @NonNull Deferred<InternalAuthProvider> deferred, @NonNull Deferred<InternalAppCheckTokenProvider> deferred2, @Nullable GrpcMetadataProvider grpcMetadataProvider) {
        new HashMap();
        this.f22648a = deferred;
        this.f22649b = deferred2;
        this.f22650c = grpcMetadataProvider;
        firebaseApp.m12217a();
        firebaseApp.f22268j.add(this);
    }
}
