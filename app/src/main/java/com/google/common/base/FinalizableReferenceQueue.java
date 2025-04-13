package com.google.common.base;

import com.fasterxml.jackson.core.JsonPointer;
import com.google.common.annotations.GwtIncompatible;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: classes.dex */
public class FinalizableReferenceQueue implements Closeable {

    /* renamed from: e */
    public static final Logger f20511e = Logger.getLogger(FinalizableReferenceQueue.class.getName());

    /* renamed from: f */
    public static final Method f20512f;

    /* renamed from: b */
    public final ReferenceQueue<Object> f20513b;

    /* renamed from: c */
    public final PhantomReference<Object> f20514c;

    /* renamed from: d */
    public final boolean f20515d;

    public static class DecoupledLoader implements FinalizerLoader {
        @Override // com.google.common.base.FinalizableReferenceQueue.FinalizerLoader
        @NullableDecl
        /* renamed from: a */
        public Class<?> mo11156a() {
            try {
                return new URLClassLoader(new URL[]{m11157b()}, null).loadClass("com.google.common.base.internal.Finalizer");
            } catch (Exception e2) {
                FinalizableReferenceQueue.f20511e.log(Level.WARNING, "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.", (Throwable) e2);
                return null;
            }
        }

        /* renamed from: b */
        public URL m11157b() throws IOException {
            String concat = String.valueOf("com.google.common.base.internal.Finalizer".replace('.', JsonPointer.SEPARATOR)).concat(".class");
            URL resource = getClass().getClassLoader().getResource(concat);
            if (resource == null) {
                throw new FileNotFoundException(concat);
            }
            String url = resource.toString();
            if (url.endsWith(concat)) {
                return new URL(resource, url.substring(0, url.length() - concat.length()));
            }
            throw new IOException(url.length() != 0 ? "Unsupported path style: ".concat(url) : new String("Unsupported path style: "));
        }
    }

    public static class DirectLoader implements FinalizerLoader {
        @Override // com.google.common.base.FinalizableReferenceQueue.FinalizerLoader
        /* renamed from: a */
        public Class<?> mo11156a() {
            try {
                return Class.forName("com.google.common.base.internal.Finalizer");
            } catch (ClassNotFoundException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public interface FinalizerLoader {
        @NullableDecl
        /* renamed from: a */
        Class<?> mo11156a();
    }

    public static class SystemLoader implements FinalizerLoader {
        @Override // com.google.common.base.FinalizableReferenceQueue.FinalizerLoader
        @NullableDecl
        /* renamed from: a */
        public Class<?> mo11156a() {
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (systemClassLoader == null) {
                    return null;
                }
                try {
                    return systemClassLoader.loadClass("com.google.common.base.internal.Finalizer");
                } catch (ClassNotFoundException unused) {
                    return null;
                }
            } catch (SecurityException unused2) {
                FinalizableReferenceQueue.f20511e.info("Not allowed to access system class loader.");
                return null;
            }
        }
    }

    static {
        FinalizerLoader[] finalizerLoaderArr = {new SystemLoader(), new DecoupledLoader(), new DirectLoader()};
        for (int i2 = 0; i2 < 3; i2++) {
            Class<?> mo11156a = finalizerLoaderArr[i2].mo11156a();
            if (mo11156a != null) {
                try {
                    f20512f = mo11156a.getMethod("startFinalizer", Class.class, ReferenceQueue.class, PhantomReference.class);
                    return;
                } catch (NoSuchMethodException e2) {
                    throw new AssertionError(e2);
                }
            }
        }
        throw new AssertionError();
    }

    public FinalizableReferenceQueue() {
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f20513b = referenceQueue;
        PhantomReference<Object> phantomReference = new PhantomReference<>(this, referenceQueue);
        this.f20514c = phantomReference;
        boolean z = true;
        try {
            f20512f.invoke(null, FinalizableReference.class, referenceQueue, phantomReference);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (Throwable th) {
            f20511e.log(Level.INFO, "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created.", th);
            z = false;
        }
        this.f20515d = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f20514c.enqueue();
        if (this.f20515d) {
            return;
        }
        while (true) {
            Reference<? extends Object> poll = this.f20513b.poll();
            if (poll == 0) {
                return;
            }
            poll.clear();
            try {
                ((FinalizableReference) poll).m11155a();
            } catch (Throwable th) {
                f20511e.log(Level.SEVERE, "Error cleaning up after reference.", th);
            }
        }
    }
}
