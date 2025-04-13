package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.ImageViewTargetFactory;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class GlideContext extends ContextWrapper {

    /* renamed from: j */
    @VisibleForTesting
    public static final TransitionOptions<?, ?> f7903j = new GenericTransitionOptions();

    /* renamed from: a */
    public final ArrayPool f7904a;

    /* renamed from: b */
    public final Registry f7905b;

    /* renamed from: c */
    public final ImageViewTargetFactory f7906c;

    /* renamed from: d */
    public final RequestOptions f7907d;

    /* renamed from: e */
    public final List<RequestListener<Object>> f7908e;

    /* renamed from: f */
    public final Map<Class<?>, TransitionOptions<?, ?>> f7909f;

    /* renamed from: g */
    public final Engine f7910g;

    /* renamed from: h */
    public final boolean f7911h;

    /* renamed from: i */
    public final int f7912i;

    public GlideContext(@NonNull Context context, @NonNull ArrayPool arrayPool, @NonNull Registry registry, @NonNull ImageViewTargetFactory imageViewTargetFactory, @NonNull RequestOptions requestOptions, @NonNull Map<Class<?>, TransitionOptions<?, ?>> map, @NonNull List<RequestListener<Object>> list, @NonNull Engine engine, boolean z, int i2) {
        super(context.getApplicationContext());
        this.f7904a = arrayPool;
        this.f7905b = registry;
        this.f7906c = imageViewTargetFactory;
        this.f7907d = requestOptions;
        this.f7908e = list;
        this.f7909f = map;
        this.f7910g = engine;
        this.f7911h = z;
        this.f7912i = i2;
    }
}
