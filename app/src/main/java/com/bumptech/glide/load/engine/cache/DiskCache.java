package com.bumptech.glide.load.engine.cache;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Key;
import java.io.File;

/* loaded from: classes.dex */
public interface DiskCache {

    public interface Factory {
        @Nullable
        /* renamed from: A */
        DiskCache mo5106A();
    }

    public interface Writer {
        /* renamed from: a */
        boolean mo4991a(@NonNull File file);
    }

    /* renamed from: a */
    void mo5104a(Key key, Writer writer);

    @Nullable
    /* renamed from: b */
    File mo5105b(Key key);
}
