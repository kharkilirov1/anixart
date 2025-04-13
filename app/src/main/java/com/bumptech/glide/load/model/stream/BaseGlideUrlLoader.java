package com.bumptech.glide.load.model.stream;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.Headers;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.InputStream;
import java.util.Collections;

/* loaded from: classes.dex */
public abstract class BaseGlideUrlLoader<Model> implements ModelLoader<Model, InputStream> {
    @Override // com.bumptech.glide.load.model.ModelLoader
    @Nullable
    /* renamed from: b */
    public ModelLoader.LoadData<InputStream> mo5128b(@NonNull Model model, int i2, int i3, @NonNull Options options) {
        String m5157c = m5157c(model, i2, i3, options);
        if (TextUtils.isEmpty(m5157c)) {
            return null;
        }
        new GlideUrl(m5157c, Headers.f8442a);
        Collections.emptyList();
        throw null;
    }

    /* renamed from: c */
    public abstract String m5157c(Model model, int i2, int i3, Options options);
}
