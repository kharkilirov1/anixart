package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.Resource;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class LruCache<T, Y> {

    /* renamed from: a */
    public final Map<T, Y> f8844a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    public long f8845b;

    /* renamed from: c */
    public long f8846c;

    public LruCache(long j2) {
        this.f8845b = j2;
    }

    /* renamed from: b */
    public void m5336b() {
        m5340j(0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* renamed from: c */
    public /* bridge */ /* synthetic */ Resource m5337c(@NonNull Key key, @Nullable Resource resource) {
        return (Resource) m5339i(key, resource);
    }

    @Nullable
    /* renamed from: f */
    public synchronized Y m5338f(@NonNull T t) {
        return this.f8844a.get(t);
    }

    /* renamed from: g */
    public int mo5113g(@Nullable Y y) {
        return 1;
    }

    /* renamed from: h */
    public void mo5114h(@NonNull T t, @Nullable Y y) {
    }

    @Nullable
    /* renamed from: i */
    public synchronized Y m5339i(@NonNull T t, @Nullable Y y) {
        long mo5113g = mo5113g(y);
        if (mo5113g >= this.f8845b) {
            mo5114h(t, y);
            return null;
        }
        if (y != null) {
            this.f8846c += mo5113g;
        }
        Y put = this.f8844a.put(t, y);
        if (put != null) {
            this.f8846c -= mo5113g(put);
            if (!put.equals(y)) {
                mo5114h(t, put);
            }
        }
        m5340j(this.f8845b);
        return put;
    }

    /* renamed from: j */
    public synchronized void m5340j(long j2) {
        while (this.f8846c > j2) {
            Iterator<Map.Entry<T, Y>> it = this.f8844a.entrySet().iterator();
            Map.Entry<T, Y> next = it.next();
            Y value = next.getValue();
            this.f8846c -= mo5113g(value);
            T key = next.getKey();
            it.remove();
            mo5114h(key, value);
        }
    }
}
