package io.grpc;

/* loaded from: classes3.dex */
public class StatusException extends Exception {

    /* renamed from: b */
    public final Status f58315b;

    /* renamed from: c */
    public final Metadata f58316c;

    /* renamed from: d */
    public final boolean f58317d;

    public StatusException(Status status) {
        super(Status.m30941b(status), status.f58293c);
        this.f58315b = status;
        this.f58316c = null;
        this.f58317d = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.f58317d ? super.fillInStackTrace() : this;
    }
}
