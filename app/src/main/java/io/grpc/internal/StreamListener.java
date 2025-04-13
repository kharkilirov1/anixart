package io.grpc.internal;

import java.io.InputStream;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public interface StreamListener {

    public interface MessageProducer {
        @Nullable
        InputStream next();
    }

    /* renamed from: a */
    void mo31052a(MessageProducer messageProducer);

    /* renamed from: e */
    void mo31054e();
}
