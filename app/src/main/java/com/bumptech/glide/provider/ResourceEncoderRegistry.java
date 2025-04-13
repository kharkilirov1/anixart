package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.ResourceEncoder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ResourceEncoderRegistry {

    /* renamed from: a */
    public final List<Entry<?>> f8702a = new ArrayList();

    public static final class Entry<T> {

        /* renamed from: a */
        public final Class<T> f8703a;

        /* renamed from: b */
        public final ResourceEncoder<T> f8704b;

        public Entry(@NonNull Class<T> cls, @NonNull ResourceEncoder<T> resourceEncoder) {
            this.f8703a = cls;
            this.f8704b = resourceEncoder;
        }
    }

    /* renamed from: a */
    public synchronized <Z> void m5250a(@NonNull Class<Z> cls, @NonNull ResourceEncoder<Z> resourceEncoder) {
        this.f8702a.add(new Entry<>(cls, resourceEncoder));
    }

    @Nullable
    /* renamed from: b */
    public synchronized <Z> ResourceEncoder<Z> m5251b(@NonNull Class<Z> cls) {
        int size = this.f8702a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Entry<?> entry = this.f8702a.get(i2);
            if (entry.f8703a.isAssignableFrom(cls)) {
                return (ResourceEncoder<Z>) entry.f8704b;
            }
        }
        return null;
    }
}
