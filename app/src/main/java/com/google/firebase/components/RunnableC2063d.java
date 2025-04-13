package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Map;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.firebase.components.d */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2063d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f22528b;

    /* renamed from: c */
    public final /* synthetic */ Object f22529c;

    /* renamed from: d */
    public final /* synthetic */ Object f22530d;

    public /* synthetic */ RunnableC2063d(Object obj, Object obj2, int i2) {
        this.f22528b = i2;
        this.f22530d = obj;
        this.f22529c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Deferred.DeferredHandler<T> deferredHandler;
        switch (this.f22528b) {
            case 0:
                OptionalProvider optionalProvider = (OptionalProvider) this.f22530d;
                Provider<T> provider = (Provider) this.f22529c;
                Provider<Set<Object>> provider2 = ComponentRuntime.f22484g;
                if (optionalProvider.f22513b != C2065f.f22532b) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (optionalProvider) {
                    deferredHandler = optionalProvider.f22512a;
                    optionalProvider.f22512a = null;
                    optionalProvider.f22513b = provider;
                }
                deferredHandler.mo12351a(provider);
                return;
            case 1:
                LazySet lazySet = (LazySet) this.f22530d;
                Provider provider3 = (Provider) this.f22529c;
                Provider<Set<Object>> provider4 = ComponentRuntime.f22484g;
                synchronized (lazySet) {
                    if (lazySet.f22510b == null) {
                        lazySet.f22509a.add(provider3);
                    } else {
                        lazySet.f22510b.add(provider3.get());
                    }
                }
                return;
            default:
                Map.Entry entry = (Map.Entry) this.f22530d;
                ((EventHandler) entry.getKey()).mo12387a((Event) this.f22529c);
                return;
        }
    }
}
