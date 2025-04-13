package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Encoder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class EncoderRegistry {

    /* renamed from: a */
    public final List<Entry<?>> f8688a = new ArrayList();

    public static final class Entry<T> {

        /* renamed from: a */
        public final Class<T> f8689a;

        /* renamed from: b */
        public final Encoder<T> f8690b;

        public Entry(@NonNull Class<T> cls, @NonNull Encoder<T> encoder) {
            this.f8689a = cls;
            this.f8690b = encoder;
        }
    }

    /* renamed from: a */
    public synchronized <T> void m5243a(@NonNull Class<T> cls, @NonNull Encoder<T> encoder) {
        this.f8688a.add(new Entry<>(cls, encoder));
    }

    @Nullable
    /* renamed from: b */
    public synchronized <T> Encoder<T> m5244b(@NonNull Class<T> cls) {
        for (Entry<?> entry : this.f8688a) {
            if (entry.f8689a.isAssignableFrom(cls)) {
                return (Encoder<T>) entry.f8690b;
            }
        }
        return null;
    }
}
