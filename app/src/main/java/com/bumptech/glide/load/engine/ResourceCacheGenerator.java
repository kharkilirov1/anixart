package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.engine.DataFetcherGenerator;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderRegistry;
import com.bumptech.glide.provider.ModelToResourceClassCache;
import com.bumptech.glide.util.MultiClassKey;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes.dex */
class ResourceCacheGenerator implements DataFetcherGenerator, DataFetcher.DataCallback<Object> {

    /* renamed from: b */
    public final DataFetcherGenerator.FetcherReadyCallback f8295b;

    /* renamed from: c */
    public final DecodeHelper<?> f8296c;

    /* renamed from: d */
    public int f8297d;

    /* renamed from: e */
    public int f8298e = -1;

    /* renamed from: f */
    public Key f8299f;

    /* renamed from: g */
    public List<ModelLoader<File, ?>> f8300g;

    /* renamed from: h */
    public int f8301h;

    /* renamed from: i */
    public volatile ModelLoader.LoadData<?> f8302i;

    /* renamed from: j */
    public File f8303j;

    /* renamed from: k */
    public ResourceCacheKey f8304k;

    public ResourceCacheGenerator(DecodeHelper<?> decodeHelper, DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback) {
        this.f8296c = decodeHelper;
        this.f8295b = fetcherReadyCallback;
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    /* renamed from: b */
    public boolean mo4990b() {
        List<Class<?>> list;
        List<Class<?>> m5155d;
        List<Key> m4995a = this.f8296c.m4995a();
        if (m4995a.isEmpty()) {
            return false;
        }
        DecodeHelper<?> decodeHelper = this.f8296c;
        Registry registry = decodeHelper.f8129c.f7905b;
        Class<?> cls = decodeHelper.f8130d.getClass();
        Class<?> cls2 = decodeHelper.f8133g;
        Class<?> cls3 = decodeHelper.f8137k;
        ModelToResourceClassCache modelToResourceClassCache = registry.f7931h;
        MultiClassKey andSet = modelToResourceClassCache.f8695a.getAndSet(null);
        if (andSet == null) {
            andSet = new MultiClassKey(cls, cls2, cls3);
        } else {
            andSet.f8848a = cls;
            andSet.f8849b = cls2;
            andSet.f8850c = cls3;
        }
        synchronized (modelToResourceClassCache.f8696b) {
            list = modelToResourceClassCache.f8696b.get(andSet);
        }
        modelToResourceClassCache.f8695a.set(andSet);
        List<Class<?>> list2 = list;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            ModelLoaderRegistry modelLoaderRegistry = registry.f7924a;
            synchronized (modelLoaderRegistry) {
                m5155d = modelLoaderRegistry.f8461a.m5155d(cls);
            }
            Iterator it = ((ArrayList) m5155d).iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ArrayList) registry.f7926c.m5248d((Class) it.next(), cls2)).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!((ArrayList) registry.f7929f.m5214b(cls4, cls3)).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            ModelToResourceClassCache modelToResourceClassCache2 = registry.f7931h;
            List<Class<?>> unmodifiableList = Collections.unmodifiableList(arrayList);
            synchronized (modelToResourceClassCache2.f8696b) {
                modelToResourceClassCache2.f8696b.put(new MultiClassKey(cls, cls2, cls3), unmodifiableList);
            }
            list2 = arrayList;
        }
        if (list2.isEmpty()) {
            if (File.class.equals(this.f8296c.f8137k)) {
                return false;
            }
            StringBuilder m24u = C0000a.m24u("Failed to find any load path from ");
            m24u.append(this.f8296c.f8130d.getClass());
            m24u.append(" to ");
            m24u.append(this.f8296c.f8137k);
            throw new IllegalStateException(m24u.toString());
        }
        while (true) {
            List<ModelLoader<File, ?>> list3 = this.f8300g;
            if (list3 != null) {
                if (this.f8301h < list3.size()) {
                    this.f8302i = null;
                    boolean z = false;
                    while (!z) {
                        if (!(this.f8301h < this.f8300g.size())) {
                            break;
                        }
                        List<ModelLoader<File, ?>> list4 = this.f8300g;
                        int i2 = this.f8301h;
                        this.f8301h = i2 + 1;
                        ModelLoader<File, ?> modelLoader = list4.get(i2);
                        File file = this.f8303j;
                        DecodeHelper<?> decodeHelper2 = this.f8296c;
                        this.f8302i = modelLoader.mo5128b(file, decodeHelper2.f8131e, decodeHelper2.f8132f, decodeHelper2.f8135i);
                        if (this.f8302i != null && this.f8296c.m5001g(this.f8302i.f8460c.mo4965a())) {
                            this.f8302i.f8460c.mo4971e(this.f8296c.f8141o, this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
            int i3 = this.f8298e + 1;
            this.f8298e = i3;
            if (i3 >= list2.size()) {
                int i4 = this.f8297d + 1;
                this.f8297d = i4;
                if (i4 >= m4995a.size()) {
                    return false;
                }
                this.f8298e = 0;
            }
            Key key = m4995a.get(this.f8297d);
            Class<?> cls5 = list2.get(this.f8298e);
            Transformation<Z> m5000f = this.f8296c.m5000f(cls5);
            DecodeHelper<?> decodeHelper3 = this.f8296c;
            this.f8304k = new ResourceCacheKey(decodeHelper3.f8129c.f7904a, key, decodeHelper3.f8140n, decodeHelper3.f8131e, decodeHelper3.f8132f, m5000f, cls5, decodeHelper3.f8135i);
            File mo5105b = decodeHelper3.m4996b().mo5105b(this.f8304k);
            this.f8303j = mo5105b;
            if (mo5105b != null) {
                this.f8299f = key;
                this.f8300g = this.f8296c.m4999e(mo5105b);
                this.f8301h = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    /* renamed from: c */
    public void mo4973c(@NonNull Exception exc) {
        this.f8295b.mo4992a(this.f8304k, exc, this.f8302i.f8460c, DataSource.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public void cancel() {
        ModelLoader.LoadData<?> loadData = this.f8302i;
        if (loadData != null) {
            loadData.f8460c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    /* renamed from: f */
    public void mo4974f(Object obj) {
        this.f8295b.mo4994e(this.f8299f, obj, this.f8302i.f8460c, DataSource.RESOURCE_DISK_CACHE, this.f8304k);
    }
}
