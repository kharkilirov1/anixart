package io.grpc;

import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public class StatusRuntimeException extends RuntimeException {

    /* renamed from: b */
    public final Status f58318b;

    /* renamed from: c */
    public final Metadata f58319c;

    /* renamed from: d */
    public final boolean f58320d;

    public StatusRuntimeException(Status status) {
        super(Status.m30941b(status), status.f58293c);
        this.f58318b = status;
        this.f58319c = null;
        this.f58320d = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.f58320d ? super.fillInStackTrace() : this;
    }

    public StatusRuntimeException(Status status, @Nullable Metadata metadata) {
        super(Status.m30941b(status), status.f58293c);
        this.f58318b = status;
        this.f58319c = metadata;
        this.f58320d = true;
        fillInStackTrace();
    }
}
