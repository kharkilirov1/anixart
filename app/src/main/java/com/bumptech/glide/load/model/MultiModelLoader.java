package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.model.ModelLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
class MultiModelLoader<Model, Data> implements ModelLoader<Model, Data> {

    /* renamed from: a */
    public final List<ModelLoader<Model, Data>> f8465a;

    /* renamed from: b */
    public final Pools.Pool<List<Throwable>> f8466b;

    public static class MultiFetcher<Data> implements DataFetcher<Data>, DataFetcher.DataCallback<Data> {

        /* renamed from: b */
        public final List<DataFetcher<Data>> f8467b;

        /* renamed from: c */
        public final Pools.Pool<List<Throwable>> f8468c;

        /* renamed from: d */
        public int f8469d;

        /* renamed from: e */
        public Priority f8470e;

        /* renamed from: f */
        public DataFetcher.DataCallback<? super Data> f8471f;

        /* renamed from: g */
        @Nullable
        public List<Throwable> f8472g;

        /* renamed from: h */
        public boolean f8473h;

        public MultiFetcher(@NonNull List<DataFetcher<Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
            this.f8468c = pool;
            if (list.isEmpty()) {
                throw new IllegalArgumentException("Must not be empty.");
            }
            this.f8467b = list;
            this.f8469d = 0;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        /* renamed from: a */
        public Class<Data> mo4965a() {
            return this.f8467b.get(0).mo4965a();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        /* renamed from: b */
        public void mo4968b() {
            List<Throwable> list = this.f8472g;
            if (list != null) {
                this.f8468c.mo2026a(list);
            }
            this.f8472g = null;
            Iterator<DataFetcher<Data>> it = this.f8467b.iterator();
            while (it.hasNext()) {
                it.next().mo4968b();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
        /* renamed from: c */
        public void mo4973c(@NonNull Exception exc) {
            List<Throwable> list = this.f8472g;
            Objects.requireNonNull(list, "Argument must not be null");
            list.add(exc);
            m5151g();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cancel() {
            this.f8473h = true;
            Iterator<DataFetcher<Data>> it = this.f8467b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        /* renamed from: d */
        public DataSource mo4970d() {
            return this.f8467b.get(0).mo4970d();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        /* renamed from: e */
        public void mo4971e(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super Data> dataCallback) {
            this.f8470e = priority;
            this.f8471f = dataCallback;
            this.f8472g = this.f8468c.mo2027b();
            this.f8467b.get(this.f8469d).mo4971e(priority, this);
            if (this.f8473h) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
        /* renamed from: f */
        public void mo4974f(@Nullable Data data) {
            if (data != null) {
                this.f8471f.mo4974f(data);
            } else {
                m5151g();
            }
        }

        /* renamed from: g */
        public final void m5151g() {
            if (this.f8473h) {
                return;
            }
            if (this.f8469d < this.f8467b.size() - 1) {
                this.f8469d++;
                mo4971e(this.f8470e, this.f8471f);
            } else {
                Objects.requireNonNull(this.f8472g, "Argument must not be null");
                this.f8471f.mo4973c(new GlideException("Fetch failed", new ArrayList(this.f8472g)));
            }
        }
    }

    public MultiModelLoader(@NonNull List<ModelLoader<Model, Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
        this.f8465a = list;
        this.f8466b = pool;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* renamed from: a */
    public boolean mo5127a(@NonNull Model model) {
        Iterator<ModelLoader<Model, Data>> it = this.f8465a.iterator();
        while (it.hasNext()) {
            if (it.next().mo5127a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* renamed from: b */
    public ModelLoader.LoadData<Data> mo5128b(@NonNull Model model, int i2, int i3, @NonNull Options options) {
        ModelLoader.LoadData<Data> mo5128b;
        int size = this.f8465a.size();
        ArrayList arrayList = new ArrayList(size);
        Key key = null;
        for (int i4 = 0; i4 < size; i4++) {
            ModelLoader<Model, Data> modelLoader = this.f8465a.get(i4);
            if (modelLoader.mo5127a(model) && (mo5128b = modelLoader.mo5128b(model, i2, i3, options)) != null) {
                key = mo5128b.f8458a;
                arrayList.add(mo5128b.f8460c);
            }
        }
        if (arrayList.isEmpty() || key == null) {
            return null;
        }
        return new ModelLoader.LoadData<>(key, new MultiFetcher(arrayList, this.f8466b));
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("MultiModelLoader{modelLoaders=");
        m24u.append(Arrays.toString(this.f8465a.toArray()));
        m24u.append('}');
        return m24u.toString();
    }
}
