package io.grpc;

/* loaded from: classes3.dex */
public final class TlsServerCredentials extends ServerCredentials {

    public static final class Builder {
    }

    public enum ClientAuth {
        /* JADX INFO: Fake field, exist only in values array */
        NONE,
        /* JADX INFO: Fake field, exist only in values array */
        OPTIONAL,
        /* JADX INFO: Fake field, exist only in values array */
        REQUIRE
    }

    public enum Feature {
        /* JADX INFO: Fake field, exist only in values array */
        FAKE,
        /* JADX INFO: Fake field, exist only in values array */
        MTLS,
        /* JADX INFO: Fake field, exist only in values array */
        CUSTOM_MANAGERS
    }
}
