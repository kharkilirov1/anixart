package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;

/* loaded from: classes.dex */
public class UnitDrawableDecoder implements ResourceDecoder<Drawable, Drawable> {
    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo4962a(@NonNull Drawable drawable, @NonNull Options options) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    @Nullable
    /* renamed from: b */
    public Resource<Drawable> mo4963b(@NonNull Drawable drawable, int i2, int i3, @NonNull Options options) throws IOException {
        Drawable drawable2 = drawable;
        if (drawable2 != null) {
            return new NonOwnedDrawableResource(drawable2);
        }
        return null;
    }
}
