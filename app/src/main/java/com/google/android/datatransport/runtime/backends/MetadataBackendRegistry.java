package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* loaded from: classes.dex */
class MetadataBackendRegistry implements BackendRegistry {

    /* renamed from: a */
    public final BackendFactoryProvider f9196a;

    /* renamed from: b */
    public final CreationContextFactory f9197b;

    /* renamed from: c */
    public final Map<String, TransportBackend> f9198c;

    public static class BackendFactoryProvider {

        /* renamed from: a */
        public final Context f9199a;

        /* renamed from: b */
        public Map<String, String> f9200b = null;

        public BackendFactoryProvider(Context context) {
            this.f9199a = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
        @androidx.annotation.Nullable
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.google.android.datatransport.runtime.backends.BackendFactory m5540a(java.lang.String r15) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.backends.MetadataBackendRegistry.BackendFactoryProvider.m5540a(java.lang.String):com.google.android.datatransport.runtime.backends.BackendFactory");
        }
    }

    @Inject
    public MetadataBackendRegistry(Context context, CreationContextFactory creationContextFactory) {
        BackendFactoryProvider backendFactoryProvider = new BackendFactoryProvider(context);
        this.f9198c = new HashMap();
        this.f9196a = backendFactoryProvider;
        this.f9197b = creationContextFactory;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRegistry
    @Nullable
    public synchronized TransportBackend get(String str) {
        if (this.f9198c.containsKey(str)) {
            return this.f9198c.get(str);
        }
        BackendFactory m5540a = this.f9196a.m5540a(str);
        if (m5540a == null) {
            return null;
        }
        CreationContextFactory creationContextFactory = this.f9197b;
        TransportBackend create = m5540a.create(new AutoValue_CreationContext(creationContextFactory.f9190a, creationContextFactory.f9191b, creationContextFactory.f9192c, str));
        this.f9198c.put(str, create);
        return create;
    }
}
