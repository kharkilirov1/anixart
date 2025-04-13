package io.grpc;

import io.grpc.CallCredentials;

@ExperimentalApi
/* loaded from: classes3.dex */
public final class CompositeCallCredentials extends CallCredentials {

    public static final class CombiningMetadataApplier extends CallCredentials.MetadataApplier {
    }

    public final class WrappingMetadataApplier extends CallCredentials.MetadataApplier {
    }
}
