package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ModelLoaderRegistry {

    /* renamed from: a */
    public final MultiModelLoaderFactory f8461a;

    /* renamed from: b */
    public final ModelLoaderCache f8462b;

    public static class ModelLoaderCache {

        /* renamed from: a */
        public final Map<Class<?>, Entry<?>> f8463a = new HashMap();

        public static class Entry<Model> {

            /* renamed from: a */
            public final List<ModelLoader<Model, ?>> f8464a;

            public Entry(List<ModelLoader<Model, ?>> list) {
                this.f8464a = list;
            }
        }
    }

    public ModelLoaderRegistry(@NonNull Pools.Pool<List<Throwable>> pool) {
        MultiModelLoaderFactory multiModelLoaderFactory = new MultiModelLoaderFactory(pool);
        this.f8462b = new ModelLoaderCache();
        this.f8461a = multiModelLoaderFactory;
    }

    /* renamed from: a */
    public synchronized <Model, Data> void m5149a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        MultiModelLoaderFactory multiModelLoaderFactory = this.f8461a;
        synchronized (multiModelLoaderFactory) {
            MultiModelLoaderFactory.Entry<?, ?> entry = new MultiModelLoaderFactory.Entry<>(cls, cls2, modelLoaderFactory);
            List<MultiModelLoaderFactory.Entry<?, ?>> list = multiModelLoaderFactory.f8476a;
            list.add(list.size(), entry);
        }
        this.f8462b.f8463a.clear();
    }

    @NonNull
    /* renamed from: b */
    public <A> List<ModelLoader<A, ?>> m5150b(@NonNull A a2) {
        List<ModelLoader<?, ?>> list;
        Class<?> cls = a2.getClass();
        synchronized (this) {
            ModelLoaderCache.Entry<?> entry = this.f8462b.f8463a.get(cls);
            list = entry == null ? null : entry.f8464a;
            if (list == null) {
                list = Collections.unmodifiableList(this.f8461a.m5154c(cls));
                if (this.f8462b.f8463a.put(cls, new ModelLoaderCache.Entry<>(list)) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        int size = list.size();
        List<ModelLoader<A, ?>> emptyList = Collections.emptyList();
        boolean z = true;
        for (int i2 = 0; i2 < size; i2++) {
            ModelLoader<?, ?> modelLoader = list.get(i2);
            if (modelLoader.mo5127a(a2)) {
                if (z) {
                    emptyList = new ArrayList<>(size - i2);
                    z = false;
                }
                emptyList.add(modelLoader);
            }
        }
        return emptyList;
    }
}
