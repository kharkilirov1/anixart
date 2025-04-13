package io.grpc;

import io.grpc.Context;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
final class ThreadLocalContextStorage extends Context.Storage {

    /* renamed from: a */
    public static final Logger f58332a = Logger.getLogger(ThreadLocalContextStorage.class.getName());

    /* renamed from: b */
    public static final ThreadLocal<Context> f58333b = new ThreadLocal<>();

    @Override // io.grpc.Context.Storage
    /* renamed from: a */
    public Context mo30842a() {
        Context context = f58333b.get();
        return context == null ? Context.f58099f : context;
    }

    @Override // io.grpc.Context.Storage
    /* renamed from: b */
    public void mo30843b(Context context, Context context2) {
        if (mo30842a() != context) {
            f58332a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (context2 != Context.f58099f) {
            f58333b.set(context2);
        } else {
            f58333b.set(null);
        }
    }

    @Override // io.grpc.Context.Storage
    /* renamed from: c */
    public Context mo30844c(Context context) {
        Context mo30842a = mo30842a();
        f58333b.set(context);
        return mo30842a;
    }
}
