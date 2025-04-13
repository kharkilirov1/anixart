package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Util;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
public class ModelCache<A, B> {

    /* renamed from: a */
    public final LruCache<ModelKey<A>, B> f8453a;

    @VisibleForTesting
    public static final class ModelKey<A> {

        /* renamed from: d */
        public static final Queue<ModelKey<?>> f8454d;

        /* renamed from: a */
        public int f8455a;

        /* renamed from: b */
        public int f8456b;

        /* renamed from: c */
        public A f8457c;

        static {
            char[] cArr = Util.f8851a;
            f8454d = new ArrayDeque(0);
        }

        /* renamed from: a */
        public static <A> ModelKey<A> m5147a(A a2, int i2, int i3) {
            ModelKey<A> modelKey;
            Queue<ModelKey<?>> queue = f8454d;
            synchronized (queue) {
                modelKey = (ModelKey) ((ArrayDeque) queue).poll();
            }
            if (modelKey == null) {
                modelKey = new ModelKey<>();
            }
            modelKey.f8457c = a2;
            modelKey.f8456b = i2;
            modelKey.f8455a = i3;
            return modelKey;
        }

        /* renamed from: b */
        public void m5148b() {
            Queue<ModelKey<?>> queue = f8454d;
            synchronized (queue) {
                ((ArrayDeque) queue).offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ModelKey)) {
                return false;
            }
            ModelKey modelKey = (ModelKey) obj;
            return this.f8456b == modelKey.f8456b && this.f8455a == modelKey.f8455a && this.f8457c.equals(modelKey.f8457c);
        }

        public int hashCode() {
            return this.f8457c.hashCode() + (((this.f8455a * 31) + this.f8456b) * 31);
        }
    }

    public ModelCache() {
        this.f8453a = new LruCache<ModelKey<A>, B>(this, 250L) { // from class: com.bumptech.glide.load.model.ModelCache.1
            @Override // com.bumptech.glide.util.LruCache
            /* renamed from: h */
            public void mo5114h(@NonNull Object obj, @Nullable Object obj2) {
                ((ModelKey) obj).m5148b();
            }
        };
    }

    @Nullable
    /* renamed from: a */
    public B m5145a(A a2, int i2, int i3) {
        ModelKey<A> m5147a = ModelKey.m5147a(a2, i2, i3);
        B m5338f = this.f8453a.m5338f(m5147a);
        m5147a.m5148b();
        return m5338f;
    }

    /* renamed from: b */
    public void m5146b(A a2, int i2, int i3, B b) {
        this.f8453a.m5339i(ModelKey.m5147a(a2, i2, i3), b);
    }

    public ModelCache(long j2) {
        this.f8453a = new LruCache<ModelKey<A>, B>(this, j2) { // from class: com.bumptech.glide.load.model.ModelCache.1
            @Override // com.bumptech.glide.util.LruCache
            /* renamed from: h */
            public void mo5114h(@NonNull Object obj, @Nullable Object obj2) {
                ((ModelKey) obj).m5148b();
            }
        };
    }
}
