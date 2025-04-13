package com.bumptech.glide.load.engine;

import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.resource.UnitTransformation;
import com.bumptech.glide.provider.LoadPathCache;
import com.bumptech.glide.util.MultiClassKey;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
final class DecodeHelper<Transcode> {

    /* renamed from: a */
    public final List<ModelLoader.LoadData<?>> f8127a = new ArrayList();

    /* renamed from: b */
    public final List<Key> f8128b = new ArrayList();

    /* renamed from: c */
    public GlideContext f8129c;

    /* renamed from: d */
    public Object f8130d;

    /* renamed from: e */
    public int f8131e;

    /* renamed from: f */
    public int f8132f;

    /* renamed from: g */
    public Class<?> f8133g;

    /* renamed from: h */
    public DecodeJob.DiskCacheProvider f8134h;

    /* renamed from: i */
    public Options f8135i;

    /* renamed from: j */
    public Map<Class<?>, Transformation<?>> f8136j;

    /* renamed from: k */
    public Class<Transcode> f8137k;

    /* renamed from: l */
    public boolean f8138l;

    /* renamed from: m */
    public boolean f8139m;

    /* renamed from: n */
    public Key f8140n;

    /* renamed from: o */
    public Priority f8141o;

    /* renamed from: p */
    public DiskCacheStrategy f8142p;

    /* renamed from: q */
    public boolean f8143q;

    /* renamed from: r */
    public boolean f8144r;

    /* renamed from: a */
    public List<Key> m4995a() {
        if (!this.f8139m) {
            this.f8139m = true;
            this.f8128b.clear();
            List<ModelLoader.LoadData<?>> m4997c = m4997c();
            int size = m4997c.size();
            for (int i2 = 0; i2 < size; i2++) {
                ModelLoader.LoadData<?> loadData = m4997c.get(i2);
                if (!this.f8128b.contains(loadData.f8458a)) {
                    this.f8128b.add(loadData.f8458a);
                }
                for (int i3 = 0; i3 < loadData.f8459b.size(); i3++) {
                    if (!this.f8128b.contains(loadData.f8459b.get(i3))) {
                        this.f8128b.add(loadData.f8459b.get(i3));
                    }
                }
            }
        }
        return this.f8128b;
    }

    /* renamed from: b */
    public DiskCache m4996b() {
        return this.f8134h.mo5018a();
    }

    /* renamed from: c */
    public List<ModelLoader.LoadData<?>> m4997c() {
        if (!this.f8138l) {
            this.f8138l = true;
            this.f8127a.clear();
            Registry registry = this.f8129c.f7905b;
            Object obj = this.f8130d;
            List m5150b = registry.f7924a.m5150b(obj);
            if (m5150b.isEmpty()) {
                throw new Registry.NoModelLoaderAvailableException(obj);
            }
            int size = m5150b.size();
            for (int i2 = 0; i2 < size; i2++) {
                ModelLoader.LoadData<?> mo5128b = ((ModelLoader) m5150b.get(i2)).mo5128b(this.f8130d, this.f8131e, this.f8132f, this.f8135i);
                if (mo5128b != null) {
                    this.f8127a.add(mo5128b);
                }
            }
        }
        return this.f8127a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public <Data> LoadPath<Data, ?, Transcode> m4998d(Class<Data> cls) {
        LoadPath<Data, ?, Transcode> loadPath;
        Registry registry = this.f8129c.f7905b;
        Class<?> cls2 = this.f8133g;
        Class<Transcode> cls3 = this.f8137k;
        LoadPathCache loadPathCache = registry.f7932i;
        MultiClassKey andSet = loadPathCache.f8694b.getAndSet(null);
        if (andSet == null) {
            andSet = new MultiClassKey();
        }
        andSet.f8848a = cls;
        andSet.f8849b = cls2;
        andSet.f8850c = cls3;
        synchronized (loadPathCache.f8693a) {
            loadPath = (LoadPath) loadPathCache.f8693a.get(andSet);
        }
        loadPathCache.f8694b.set(andSet);
        Objects.requireNonNull(registry.f7932i);
        if (LoadPathCache.f8692c.equals(loadPath)) {
            return null;
        }
        if (loadPath != null) {
            return loadPath;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) registry.f7926c.m5248d(cls, cls2)).iterator();
        while (it.hasNext()) {
            Class cls4 = (Class) it.next();
            Iterator it2 = ((ArrayList) registry.f7929f.m5214b(cls4, cls3)).iterator();
            while (it2.hasNext()) {
                Class cls5 = (Class) it2.next();
                arrayList.add(new DecodePath(cls, cls4, cls5, registry.f7926c.m5246b(cls, cls4), registry.f7929f.m5213a(cls4, cls5), registry.f7933j));
            }
        }
        LoadPath<Data, ?, Transcode> loadPath2 = arrayList.isEmpty() ? null : new LoadPath<>(cls, cls2, cls3, arrayList, registry.f7933j);
        LoadPathCache loadPathCache2 = registry.f7932i;
        synchronized (loadPathCache2.f8693a) {
            loadPathCache2.f8693a.put(new MultiClassKey(cls, cls2, cls3), loadPath2 != null ? loadPath2 : LoadPathCache.f8692c);
        }
        return loadPath2;
    }

    /* renamed from: e */
    public List<ModelLoader<File, ?>> m4999e(File file) throws Registry.NoModelLoaderAvailableException {
        List<ModelLoader<File, ?>> m5150b = this.f8129c.f7905b.f7924a.m5150b(file);
        if (m5150b.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(file);
        }
        return m5150b;
    }

    /* renamed from: f */
    public <Z> Transformation<Z> m5000f(Class<Z> cls) {
        Transformation<Z> transformation = (Transformation) this.f8136j.get(cls);
        if (transformation == null) {
            Iterator<Map.Entry<Class<?>, Transformation<?>>> it = this.f8136j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, Transformation<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    transformation = (Transformation) next.getValue();
                    break;
                }
            }
        }
        if (transformation != null) {
            return transformation;
        }
        if (!this.f8136j.isEmpty() || !this.f8143q) {
            return (UnitTransformation) UnitTransformation.f8512b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public boolean m5001g(Class<?> cls) {
        return m4998d(cls) != null;
    }
}
