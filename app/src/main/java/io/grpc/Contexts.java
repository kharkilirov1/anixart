package io.grpc;

import com.google.common.base.Preconditions;
import io.grpc.ForwardingServerCallListener;
import io.grpc.Status;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class Contexts {

    public static class ContextualizedServerCallListener<ReqT> extends ForwardingServerCallListener.SimpleForwardingServerCallListener<ReqT> {
        @Override // io.grpc.PartialForwardingServerCallListener, io.grpc.ServerCall.Listener
        /* renamed from: a */
        public void mo30846a() {
            throw null;
        }

        @Override // io.grpc.PartialForwardingServerCallListener, io.grpc.ServerCall.Listener
        /* renamed from: b */
        public void mo30847b() {
            throw null;
        }

        @Override // io.grpc.PartialForwardingServerCallListener, io.grpc.ServerCall.Listener
        /* renamed from: c */
        public void mo30848c() {
            throw null;
        }

        @Override // io.grpc.ForwardingServerCallListener, io.grpc.ServerCall.Listener
        /* renamed from: d */
        public void mo30849d(ReqT reqt) {
            throw null;
        }

        @Override // io.grpc.PartialForwardingServerCallListener, io.grpc.ServerCall.Listener
        /* renamed from: e */
        public void mo30850e() {
            throw null;
        }
    }

    @ExperimentalApi
    /* renamed from: a */
    public static Status m30845a(Context context) {
        Preconditions.m11187k(context, "context must not be null");
        if (!context.mo30835j()) {
            return null;
        }
        Throwable mo30832c = context.mo30832c();
        if (mo30832c == null) {
            return Status.f58279f.m30947g("io.grpc.Context was cancelled without error");
        }
        if (mo30832c instanceof TimeoutException) {
            return Status.f58281h.m30947g(mo30832c.getMessage()).m30946f(mo30832c);
        }
        Status m30943d = Status.m30943d(mo30832c);
        return (Status.Code.UNKNOWN.equals(m30943d.f58291a) && m30943d.f58293c == mo30832c) ? Status.f58279f.m30947g("Context cancelled").m30946f(mo30832c) : m30943d.m30946f(mo30832c);
    }
}
