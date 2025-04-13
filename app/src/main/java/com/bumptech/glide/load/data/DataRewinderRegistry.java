package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.DataRewinder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class DataRewinderRegistry {

    /* renamed from: b */
    public static final DataRewinder.Factory<?> f8070b = new DataRewinder.Factory<Object>() { // from class: com.bumptech.glide.load.data.DataRewinderRegistry.1
        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        @NonNull
        /* renamed from: a */
        public Class<Object> mo4977a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        @NonNull
        /* renamed from: b */
        public DataRewinder<Object> mo4978b(@NonNull Object obj) {
            return new DefaultRewinder(obj);
        }
    };

    /* renamed from: a */
    public final Map<Class<?>, DataRewinder.Factory<?>> f8071a = new HashMap();

    public static final class DefaultRewinder implements DataRewinder<Object> {

        /* renamed from: a */
        public final Object f8072a;

        public DefaultRewinder(@NonNull Object obj) {
            this.f8072a = obj;
        }

        @Override // com.bumptech.glide.load.data.DataRewinder
        @NonNull
        /* renamed from: a */
        public Object mo4975a() {
            return this.f8072a;
        }

        @Override // com.bumptech.glide.load.data.DataRewinder
        /* renamed from: b */
        public void mo4976b() {
        }
    }
}
