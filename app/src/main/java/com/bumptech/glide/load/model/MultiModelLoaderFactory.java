package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.ModelLoader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public class MultiModelLoaderFactory {

    /* renamed from: e */
    public static final Factory f8474e = new Factory();

    /* renamed from: f */
    public static final ModelLoader<Object, Object> f8475f = new EmptyModelLoader();

    /* renamed from: a */
    public final List<Entry<?, ?>> f8476a;

    /* renamed from: b */
    public final Factory f8477b;

    /* renamed from: c */
    public final Set<Entry<?, ?>> f8478c;

    /* renamed from: d */
    public final Pools.Pool<List<Throwable>> f8479d;

    public static class EmptyModelLoader implements ModelLoader<Object, Object> {
        @Override // com.bumptech.glide.load.model.ModelLoader
        /* renamed from: a */
        public boolean mo5127a(@NonNull Object obj) {
            return false;
        }

        @Override // com.bumptech.glide.load.model.ModelLoader
        @Nullable
        /* renamed from: b */
        public ModelLoader.LoadData<Object> mo5128b(@NonNull Object obj, int i2, int i3, @NonNull Options options) {
            return null;
        }
    }

    public static class Entry<Model, Data> {

        /* renamed from: a */
        public final Class<Model> f8480a;

        /* renamed from: b */
        public final Class<Data> f8481b;

        /* renamed from: c */
        public final ModelLoaderFactory<? extends Model, ? extends Data> f8482c;

        public Entry(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
            this.f8480a = cls;
            this.f8481b = cls2;
            this.f8482c = modelLoaderFactory;
        }
    }

    public static class Factory {
    }

    public MultiModelLoaderFactory(@NonNull Pools.Pool<List<Throwable>> pool) {
        Factory factory = f8474e;
        this.f8476a = new ArrayList();
        this.f8478c = new HashSet();
        this.f8479d = pool;
        this.f8477b = factory;
    }

    @NonNull
    /* renamed from: a */
    public final <Model, Data> ModelLoader<Model, Data> m5152a(@NonNull Entry<?, ?> entry) {
        ModelLoader<Model, Data> modelLoader = (ModelLoader<Model, Data>) entry.f8482c.mo5130b(this);
        Objects.requireNonNull(modelLoader, "Argument must not be null");
        return modelLoader;
    }

    @NonNull
    /* renamed from: b */
    public synchronized <Model, Data> ModelLoader<Model, Data> m5153b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (Entry<?, ?> entry : this.f8476a) {
                if (this.f8478c.contains(entry)) {
                    z = true;
                } else if (entry.f8480a.isAssignableFrom(cls) && entry.f8481b.isAssignableFrom(cls2)) {
                    this.f8478c.add(entry);
                    arrayList.add(m5152a(entry));
                    this.f8478c.remove(entry);
                }
            }
            if (arrayList.size() > 1) {
                Factory factory = this.f8477b;
                Pools.Pool<List<Throwable>> pool = this.f8479d;
                Objects.requireNonNull(factory);
                return new MultiModelLoader(arrayList, pool);
            }
            if (arrayList.size() == 1) {
                return (ModelLoader) arrayList.get(0);
            }
            if (z) {
                return (ModelLoader<Model, Data>) f8475f;
            }
            throw new Registry.NoModelLoaderAvailableException(cls, cls2);
        } catch (Throwable th) {
            this.f8478c.clear();
            throw th;
        }
    }

    @NonNull
    /* renamed from: c */
    public synchronized <Model> List<ModelLoader<Model, ?>> m5154c(@NonNull Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Entry<?, ?> entry : this.f8476a) {
                if (!this.f8478c.contains(entry) && entry.f8480a.isAssignableFrom(cls)) {
                    this.f8478c.add(entry);
                    ModelLoader<? extends Object, ? extends Object> mo5130b = entry.f8482c.mo5130b(this);
                    Objects.requireNonNull(mo5130b, "Argument must not be null");
                    arrayList.add(mo5130b);
                    this.f8478c.remove(entry);
                }
            }
        } catch (Throwable th) {
            this.f8478c.clear();
            throw th;
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: d */
    public synchronized List<Class<?>> m5155d(@NonNull Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Entry<?, ?> entry : this.f8476a) {
            if (!arrayList.contains(entry.f8481b) && entry.f8480a.isAssignableFrom(cls)) {
                arrayList.add(entry.f8481b);
            }
        }
        return arrayList;
    }
}
