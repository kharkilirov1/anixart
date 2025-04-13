package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.drawable.DrawableResource;
import com.bumptech.glide.load.resource.gif.GifFrameLoader;
import com.bumptech.glide.util.Util;

/* loaded from: classes.dex */
public class GifDrawableResource extends DrawableResource<GifDrawable> {
    public GifDrawableResource(GifDrawable gifDrawable) {
        super(gifDrawable);
    }

    @Override // com.bumptech.glide.load.resource.drawable.DrawableResource, com.bumptech.glide.load.engine.Initializable
    /* renamed from: a */
    public void mo5053a() {
        ((GifDrawable) this.f8592b).m5204c().prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    /* renamed from: c */
    public void mo5044c() {
        ((GifDrawable) this.f8592b).stop();
        GifDrawable gifDrawable = (GifDrawable) this.f8592b;
        gifDrawable.f8607e = true;
        GifFrameLoader gifFrameLoader = gifDrawable.f8604b.f8614a;
        gifFrameLoader.f8618c.clear();
        Bitmap bitmap = gifFrameLoader.f8627l;
        if (bitmap != null) {
            gifFrameLoader.f8620e.mo5078c(bitmap);
            gifFrameLoader.f8627l = null;
        }
        gifFrameLoader.f8621f = false;
        GifFrameLoader.DelayTarget delayTarget = gifFrameLoader.f8624i;
        if (delayTarget != null) {
            gifFrameLoader.f8619d.m4899n(delayTarget);
            gifFrameLoader.f8624i = null;
        }
        GifFrameLoader.DelayTarget delayTarget2 = gifFrameLoader.f8626k;
        if (delayTarget2 != null) {
            gifFrameLoader.f8619d.m4899n(delayTarget2);
            gifFrameLoader.f8626k = null;
        }
        GifFrameLoader.DelayTarget delayTarget3 = gifFrameLoader.f8629n;
        if (delayTarget3 != null) {
            gifFrameLoader.f8619d.m4899n(delayTarget3);
            gifFrameLoader.f8629n = null;
        }
        gifFrameLoader.f8616a.clear();
        gifFrameLoader.f8625j = true;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    /* renamed from: d */
    public int mo5045d() {
        GifFrameLoader gifFrameLoader = ((GifDrawable) this.f8592b).f8604b.f8614a;
        return Util.m5346c(gifFrameLoader.m5208a().getWidth(), gifFrameLoader.m5208a().getHeight(), gifFrameLoader.m5208a().getConfig()) + gifFrameLoader.f8616a.mo4933g();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    /* renamed from: e */
    public Class<GifDrawable> mo5046e() {
        return GifDrawable.class;
    }
}
