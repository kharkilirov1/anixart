package io.grpc.internal;

import java.util.logging.Logger;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes3.dex */
public final class AtomicBackoff {

    /* renamed from: a */
    public static final Logger f58449a = Logger.getLogger(AtomicBackoff.class.getName());

    @ThreadSafe
    public final class State {

        /* renamed from: a */
        public final long f58450a;

        /* renamed from: b */
        public final /* synthetic */ AtomicBackoff f58451b;
    }
}
