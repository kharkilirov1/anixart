package com.bumptech.glide.request;

import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.target.Target;

/* loaded from: classes.dex */
public interface RequestListener<R> {
    /* renamed from: e */
    boolean mo5291e(@Nullable GlideException glideException, Object obj, Target<R> target, boolean z);

    /* renamed from: h */
    boolean mo5293h(R r, Object obj, Target<R> target, DataSource dataSource, boolean z);
}
