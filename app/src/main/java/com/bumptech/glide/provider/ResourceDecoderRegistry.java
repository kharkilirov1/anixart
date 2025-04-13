package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ResourceDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ResourceDecoderRegistry {

    /* renamed from: a */
    public final List<String> f8697a = new ArrayList();

    /* renamed from: b */
    public final Map<String, List<Entry<?, ?>>> f8698b = new HashMap();

    public static class Entry<T, R> {

        /* renamed from: a */
        public final Class<T> f8699a;

        /* renamed from: b */
        public final Class<R> f8700b;

        /* renamed from: c */
        public final ResourceDecoder<T, R> f8701c;

        public Entry(@NonNull Class<T> cls, @NonNull Class<R> cls2, ResourceDecoder<T, R> resourceDecoder) {
            this.f8699a = cls;
            this.f8700b = cls2;
            this.f8701c = resourceDecoder;
        }

        /* renamed from: a */
        public boolean m5249a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.f8699a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f8700b);
        }
    }

    /* renamed from: a */
    public synchronized <T, R> void m5245a(@NonNull String str, @NonNull ResourceDecoder<T, R> resourceDecoder, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
        m5247c(str).add(new Entry<>(cls, cls2, resourceDecoder));
    }

    @NonNull
    /* renamed from: b */
    public synchronized <T, R> List<ResourceDecoder<T, R>> m5246b(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f8697a.iterator();
        while (it.hasNext()) {
            List<Entry<?, ?>> list = this.f8698b.get(it.next());
            if (list != null) {
                for (Entry<?, ?> entry : list) {
                    if (entry.m5249a(cls, cls2)) {
                        arrayList.add(entry.f8701c);
                    }
                }
            }
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: c */
    public final synchronized List<Entry<?, ?>> m5247c(@NonNull String str) {
        List<Entry<?, ?>> list;
        if (!this.f8697a.contains(str)) {
            this.f8697a.add(str);
        }
        list = this.f8698b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f8698b.put(str, list);
        }
        return list;
    }

    @NonNull
    /* renamed from: d */
    public synchronized <T, R> List<Class<R>> m5248d(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f8697a.iterator();
        while (it.hasNext()) {
            List<Entry<?, ?>> list = this.f8698b.get(it.next());
            if (list != null) {
                for (Entry<?, ?> entry : list) {
                    if (entry.m5249a(cls, cls2) && !arrayList.contains(entry.f8700b)) {
                        arrayList.add(entry.f8700b);
                    }
                }
            }
        }
        return arrayList;
    }
}
