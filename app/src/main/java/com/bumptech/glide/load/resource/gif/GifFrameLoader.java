package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.signature.ObjectKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
class GifFrameLoader {

    /* renamed from: a */
    public final GifDecoder f8616a;

    /* renamed from: b */
    public final Handler f8617b;

    /* renamed from: c */
    public final List<FrameCallback> f8618c;

    /* renamed from: d */
    public final RequestManager f8619d;

    /* renamed from: e */
    public final BitmapPool f8620e;

    /* renamed from: f */
    public boolean f8621f;

    /* renamed from: g */
    public boolean f8622g;

    /* renamed from: h */
    public RequestBuilder<Bitmap> f8623h;

    /* renamed from: i */
    public DelayTarget f8624i;

    /* renamed from: j */
    public boolean f8625j;

    /* renamed from: k */
    public DelayTarget f8626k;

    /* renamed from: l */
    public Bitmap f8627l;

    /* renamed from: m */
    public Transformation<Bitmap> f8628m;

    /* renamed from: n */
    public DelayTarget f8629n;

    @VisibleForTesting
    public static class DelayTarget extends SimpleTarget<Bitmap> {

        /* renamed from: e */
        public final Handler f8630e;

        /* renamed from: f */
        public final int f8631f;

        /* renamed from: g */
        public final long f8632g;

        /* renamed from: h */
        public Bitmap f8633h;

        public DelayTarget(Handler handler, int i2, long j2) {
            this.f8630e = handler;
            this.f8631f = i2;
            this.f8632g = j2;
        }

        @Override // com.bumptech.glide.request.target.Target
        /* renamed from: c */
        public void mo4877c(@NonNull Object obj, @Nullable Transition transition) {
            this.f8633h = (Bitmap) obj;
            this.f8630e.sendMessageAtTime(this.f8630e.obtainMessage(1, this), this.f8632g);
        }
    }

    public interface FrameCallback {
        /* renamed from: a */
        void mo5202a();
    }

    public class FrameLoaderCallback implements Handler.Callback {
        public FrameLoaderCallback() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                GifFrameLoader.this.m5210c((DelayTarget) message.obj);
                return true;
            }
            if (i2 != 2) {
                return false;
            }
            GifFrameLoader.this.f8619d.m4899n((DelayTarget) message.obj);
            return false;
        }
    }

    @VisibleForTesting
    public interface OnEveryFrameListener {
    }

    public GifFrameLoader(Glide glide, GifDecoder gifDecoder, int i2, int i3, Transformation<Bitmap> transformation, Bitmap bitmap) {
        BitmapPool bitmapPool = glide.f7881b;
        RequestManager m4874e = Glide.m4874e(glide.f7883d.getBaseContext());
        RequestBuilder<Bitmap> mo4892a = Glide.m4874e(glide.f7883d.getBaseContext()).mo4897h().mo4892a(new RequestOptions().mo5257f(DiskCacheStrategy.f8203a).mo5253D(true).mo5271u(true).mo5265o(i2, i3));
        this.f8618c = new ArrayList();
        this.f8619d = m4874e;
        Handler handler = new Handler(Looper.getMainLooper(), new FrameLoaderCallback());
        this.f8620e = bitmapPool;
        this.f8617b = handler;
        this.f8623h = mo4892a;
        this.f8616a = gifDecoder;
        m5211d(transformation, bitmap);
    }

    /* renamed from: a */
    public Bitmap m5208a() {
        DelayTarget delayTarget = this.f8624i;
        return delayTarget != null ? delayTarget.f8633h : this.f8627l;
    }

    /* renamed from: b */
    public final void m5209b() {
        if (!this.f8621f || this.f8622g) {
            return;
        }
        DelayTarget delayTarget = this.f8629n;
        if (delayTarget != null) {
            this.f8629n = null;
            m5210c(delayTarget);
            return;
        }
        this.f8622g = true;
        long uptimeMillis = SystemClock.uptimeMillis() + this.f8616a.mo4931e();
        this.f8616a.mo4929c();
        this.f8626k = new DelayTarget(this.f8617b, this.f8616a.mo4932f(), uptimeMillis);
        this.f8623h.mo4892a(new RequestOptions().mo5270t(new ObjectKey(Double.valueOf(Math.random())))).mo4888L(this.f8616a).m4885I(this.f8626k);
    }

    @VisibleForTesting
    /* renamed from: c */
    public void m5210c(DelayTarget delayTarget) {
        this.f8622g = false;
        if (this.f8625j) {
            this.f8617b.obtainMessage(2, delayTarget).sendToTarget();
            return;
        }
        if (!this.f8621f) {
            this.f8629n = delayTarget;
            return;
        }
        if (delayTarget.f8633h != null) {
            Bitmap bitmap = this.f8627l;
            if (bitmap != null) {
                this.f8620e.mo5078c(bitmap);
                this.f8627l = null;
            }
            DelayTarget delayTarget2 = this.f8624i;
            this.f8624i = delayTarget;
            int size = this.f8618c.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    this.f8618c.get(size).mo5202a();
                }
            }
            if (delayTarget2 != null) {
                this.f8617b.obtainMessage(2, delayTarget2).sendToTarget();
            }
        }
        m5209b();
    }

    /* renamed from: d */
    public void m5211d(Transformation<Bitmap> transformation, Bitmap bitmap) {
        Objects.requireNonNull(transformation, "Argument must not be null");
        this.f8628m = transformation;
        Objects.requireNonNull(bitmap, "Argument must not be null");
        this.f8627l = bitmap;
        this.f8623h = this.f8623h.mo4892a(new RequestOptions().m5273w(transformation, true));
    }
}
