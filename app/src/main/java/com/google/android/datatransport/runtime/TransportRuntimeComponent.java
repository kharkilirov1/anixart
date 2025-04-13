package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.Component;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import java.io.Closeable;
import java.io.IOException;
import javax.inject.Singleton;

@Singleton
@Component
/* loaded from: classes.dex */
abstract class TransportRuntimeComponent implements Closeable {

    @Component.Builder
    public interface Builder {
    }

    /* renamed from: a */
    public abstract EventStore mo5511a();

    /* renamed from: b */
    public abstract TransportRuntime mo5512b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        mo5511a().close();
    }
}
