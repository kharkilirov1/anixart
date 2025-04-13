package io.grpc;

import io.grpc.Context;
import java.util.logging.Logger;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes3.dex */
public abstract class Server {

    /* renamed from: a */
    public static final Context.Key<Server> f58267a;

    static {
        Logger logger = Context.f58098e;
        f58267a = new Context.Key<>("io.grpc.Server");
    }
}
