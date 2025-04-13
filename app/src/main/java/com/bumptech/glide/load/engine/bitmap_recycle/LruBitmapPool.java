package com.bumptech.glide.load.engine.bitmap_recycle;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p000a.C0000a;

/* loaded from: classes.dex */
public class LruBitmapPool implements BitmapPool {

    /* renamed from: j */
    public static final Bitmap.Config f8345j = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public final LruPoolStrategy f8346a;

    /* renamed from: b */
    public final Set<Bitmap.Config> f8347b;

    /* renamed from: c */
    public final BitmapTracker f8348c;

    /* renamed from: d */
    public long f8349d;

    /* renamed from: e */
    public long f8350e;

    /* renamed from: f */
    public int f8351f;

    /* renamed from: g */
    public int f8352g;

    /* renamed from: h */
    public int f8353h;

    /* renamed from: i */
    public int f8354i;

    public interface BitmapTracker {
        /* renamed from: a */
        void mo5095a(Bitmap bitmap);

        /* renamed from: b */
        void mo5096b(Bitmap bitmap);
    }

    public static final class NullBitmapTracker implements BitmapTracker {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.BitmapTracker
        /* renamed from: a */
        public void mo5095a(Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.BitmapTracker
        /* renamed from: b */
        public void mo5096b(Bitmap bitmap) {
        }
    }

    public static class ThrowingBitmapTracker implements BitmapTracker {

        /* renamed from: a */
        public final Set<Bitmap> f8355a = Collections.synchronizedSet(new HashSet());

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.BitmapTracker
        /* renamed from: a */
        public void mo5095a(Bitmap bitmap) {
            if (!this.f8355a.contains(bitmap)) {
                throw new IllegalStateException("Cannot remove bitmap not in tracker");
            }
            this.f8355a.remove(bitmap);
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.BitmapTracker
        /* renamed from: b */
        public void mo5096b(Bitmap bitmap) {
            if (!this.f8355a.contains(bitmap)) {
                this.f8355a.add(bitmap);
                return;
            }
            throw new IllegalStateException("Can't add already added bitmap: " + bitmap + " [" + bitmap.getWidth() + "x" + bitmap.getHeight() + "]");
        }
    }

    public LruBitmapPool(long j2) {
        SizeConfigStrategy sizeConfigStrategy = new SizeConfigStrategy();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i2 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i2 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f8349d = j2;
        this.f8346a = sizeConfigStrategy;
        this.f8347b = unmodifiableSet;
        this.f8348c = new NullBitmapTracker();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    @SuppressLint
    /* renamed from: a */
    public void mo5076a(int i2) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            C0000a.m0A("trimMemory, level=", i2, "LruBitmapPool");
        }
        if (i2 >= 40) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "clearMemory");
            }
            m5094i(0L);
        } else if (i2 >= 20 || i2 == 15) {
            m5094i(this.f8349d / 2);
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    /* renamed from: b */
    public void mo5077b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m5094i(0L);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    /* renamed from: c */
    public synchronized void mo5078c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f8346a.mo5068b(bitmap) <= this.f8349d && this.f8347b.contains(bitmap.getConfig())) {
                int mo5068b = this.f8346a.mo5068b(bitmap);
                this.f8346a.mo5069c(bitmap);
                this.f8348c.mo5096b(bitmap);
                this.f8353h++;
                this.f8350e += mo5068b;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f8346a.mo5071e(bitmap));
                }
                m5091f();
                m5094i(this.f8349d);
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f8346a.mo5071e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f8347b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    @NonNull
    /* renamed from: d */
    public Bitmap mo5079d(int i2, int i3, Bitmap.Config config) {
        Bitmap m5093h = m5093h(i2, i3, config);
        if (m5093h != null) {
            m5093h.eraseColor(0);
            return m5093h;
        }
        if (config == null) {
            config = f8345j;
        }
        return Bitmap.createBitmap(i2, i3, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    @NonNull
    /* renamed from: e */
    public Bitmap mo5080e(int i2, int i3, Bitmap.Config config) {
        Bitmap m5093h = m5093h(i2, i3, config);
        if (m5093h != null) {
            return m5093h;
        }
        if (config == null) {
            config = f8345j;
        }
        return Bitmap.createBitmap(i2, i3, config);
    }

    /* renamed from: f */
    public final void m5091f() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m5092g();
        }
    }

    /* renamed from: g */
    public final void m5092g() {
        StringBuilder m24u = C0000a.m24u("Hits=");
        m24u.append(this.f8351f);
        m24u.append(", misses=");
        m24u.append(this.f8352g);
        m24u.append(", puts=");
        m24u.append(this.f8353h);
        m24u.append(", evictions=");
        m24u.append(this.f8354i);
        m24u.append(", currentSize=");
        m24u.append(this.f8350e);
        m24u.append(", maxSize=");
        m24u.append(this.f8349d);
        m24u.append("\nStrategy=");
        m24u.append(this.f8346a);
        Log.v("LruBitmapPool", m24u.toString());
    }

    @Nullable
    /* renamed from: h */
    public final synchronized Bitmap m5093h(int i2, int i3, @Nullable Bitmap.Config config) {
        Bitmap mo5070d;
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
        mo5070d = this.f8346a.mo5070d(i2, i3, config != null ? config : f8345j);
        if (mo5070d == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=" + this.f8346a.mo5067a(i2, i3, config));
            }
            this.f8352g++;
        } else {
            this.f8351f++;
            this.f8350e -= this.f8346a.mo5068b(mo5070d);
            this.f8348c.mo5095a(mo5070d);
            mo5070d.setHasAlpha(true);
            mo5070d.setPremultiplied(true);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=" + this.f8346a.mo5067a(i2, i3, config));
        }
        m5091f();
        return mo5070d;
    }

    /* renamed from: i */
    public final synchronized void m5094i(long j2) {
        while (this.f8350e > j2) {
            Bitmap removeLast = this.f8346a.removeLast();
            if (removeLast == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m5092g();
                }
                this.f8350e = 0L;
                return;
            }
            this.f8348c.mo5095a(removeLast);
            this.f8350e -= this.f8346a.mo5068b(removeLast);
            this.f8354i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + this.f8346a.mo5071e(removeLast));
            }
            m5091f();
            removeLast.recycle();
        }
    }
}
