package com.bumptech.glide.request;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.CenterInside;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.DrawableTransformation;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.load.resource.gif.GifDrawableTransformation;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.signature.EmptySignature;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import com.bumptech.glide.util.Util;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class BaseRequestOptions<T extends BaseRequestOptions<T>> implements Cloneable {

    /* renamed from: A */
    public boolean f8705A;

    /* renamed from: b */
    public int f8706b;

    /* renamed from: f */
    @Nullable
    public Drawable f8710f;

    /* renamed from: g */
    public int f8711g;

    /* renamed from: h */
    @Nullable
    public Drawable f8712h;

    /* renamed from: i */
    public int f8713i;

    /* renamed from: n */
    public boolean f8718n;

    /* renamed from: p */
    @Nullable
    public Drawable f8720p;

    /* renamed from: q */
    public int f8721q;

    /* renamed from: u */
    public boolean f8725u;

    /* renamed from: v */
    @Nullable
    public Resources.Theme f8726v;

    /* renamed from: w */
    public boolean f8727w;

    /* renamed from: x */
    public boolean f8728x;

    /* renamed from: y */
    public boolean f8729y;

    /* renamed from: c */
    public float f8707c = 1.0f;

    /* renamed from: d */
    @NonNull
    public DiskCacheStrategy f8708d = DiskCacheStrategy.f8205c;

    /* renamed from: e */
    @NonNull
    public Priority f8709e = Priority.NORMAL;

    /* renamed from: j */
    public boolean f8714j = true;

    /* renamed from: k */
    public int f8715k = -1;

    /* renamed from: l */
    public int f8716l = -1;

    /* renamed from: m */
    @NonNull
    public Key f8717m = EmptySignature.f8826b;

    /* renamed from: o */
    public boolean f8719o = true;

    /* renamed from: r */
    @NonNull
    public Options f8722r = new Options();

    /* renamed from: s */
    @NonNull
    public Map<Class<?>, Transformation<?>> f8723s = new CachedHashCodeArrayMap();

    /* renamed from: t */
    @NonNull
    public Class<?> f8724t = Object.class;

    /* renamed from: z */
    public boolean f8730z = true;

    /* renamed from: h */
    public static boolean m5252h(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    @NonNull
    @CheckResult
    /* renamed from: D */
    public T mo5253D(boolean z) {
        if (this.f8727w) {
            return (T) clone().mo5253D(z);
        }
        this.f8705A = z;
        this.f8706b |= 1048576;
        m5268r();
        return this;
    }

    @NonNull
    @CheckResult
    /* renamed from: a */
    public T mo4892a(@NonNull BaseRequestOptions<?> baseRequestOptions) {
        if (this.f8727w) {
            return (T) clone().mo4892a(baseRequestOptions);
        }
        if (m5252h(baseRequestOptions.f8706b, 2)) {
            this.f8707c = baseRequestOptions.f8707c;
        }
        if (m5252h(baseRequestOptions.f8706b, PrimitiveArrayBuilder.MAX_CHUNK_SIZE)) {
            this.f8728x = baseRequestOptions.f8728x;
        }
        if (m5252h(baseRequestOptions.f8706b, 1048576)) {
            this.f8705A = baseRequestOptions.f8705A;
        }
        if (m5252h(baseRequestOptions.f8706b, 4)) {
            this.f8708d = baseRequestOptions.f8708d;
        }
        if (m5252h(baseRequestOptions.f8706b, 8)) {
            this.f8709e = baseRequestOptions.f8709e;
        }
        if (m5252h(baseRequestOptions.f8706b, 16)) {
            this.f8710f = baseRequestOptions.f8710f;
            this.f8711g = 0;
            this.f8706b &= -33;
        }
        if (m5252h(baseRequestOptions.f8706b, 32)) {
            this.f8711g = baseRequestOptions.f8711g;
            this.f8710f = null;
            this.f8706b &= -17;
        }
        if (m5252h(baseRequestOptions.f8706b, 64)) {
            this.f8712h = baseRequestOptions.f8712h;
            this.f8713i = 0;
            this.f8706b &= -129;
        }
        if (m5252h(baseRequestOptions.f8706b, 128)) {
            this.f8713i = baseRequestOptions.f8713i;
            this.f8712h = null;
            this.f8706b &= -65;
        }
        if (m5252h(baseRequestOptions.f8706b, 256)) {
            this.f8714j = baseRequestOptions.f8714j;
        }
        if (m5252h(baseRequestOptions.f8706b, RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN)) {
            this.f8716l = baseRequestOptions.f8716l;
            this.f8715k = baseRequestOptions.f8715k;
        }
        if (m5252h(baseRequestOptions.f8706b, RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE)) {
            this.f8717m = baseRequestOptions.f8717m;
        }
        if (m5252h(baseRequestOptions.f8706b, RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT)) {
            this.f8724t = baseRequestOptions.f8724t;
        }
        if (m5252h(baseRequestOptions.f8706b, RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST)) {
            this.f8720p = baseRequestOptions.f8720p;
            this.f8721q = 0;
            this.f8706b &= -16385;
        }
        if (m5252h(baseRequestOptions.f8706b, 16384)) {
            this.f8721q = baseRequestOptions.f8721q;
            this.f8720p = null;
            this.f8706b &= -8193;
        }
        if (m5252h(baseRequestOptions.f8706b, 32768)) {
            this.f8726v = baseRequestOptions.f8726v;
        }
        if (m5252h(baseRequestOptions.f8706b, TextBuffer.MAX_SEGMENT_LEN)) {
            this.f8719o = baseRequestOptions.f8719o;
        }
        if (m5252h(baseRequestOptions.f8706b, 131072)) {
            this.f8718n = baseRequestOptions.f8718n;
        }
        if (m5252h(baseRequestOptions.f8706b, RecyclerView.ViewHolder.FLAG_MOVED)) {
            this.f8723s.putAll(baseRequestOptions.f8723s);
            this.f8730z = baseRequestOptions.f8730z;
        }
        if (m5252h(baseRequestOptions.f8706b, 524288)) {
            this.f8729y = baseRequestOptions.f8729y;
        }
        if (!this.f8719o) {
            this.f8723s.clear();
            int i2 = this.f8706b & (-2049);
            this.f8706b = i2;
            this.f8718n = false;
            this.f8706b = i2 & (-131073);
            this.f8730z = true;
        }
        this.f8706b |= baseRequestOptions.f8706b;
        this.f8722r.m4961d(baseRequestOptions.f8722r);
        m5268r();
        return this;
    }

    @NonNull
    /* renamed from: b */
    public T mo5254b() {
        if (this.f8725u && !this.f8727w) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f8727w = true;
        return mo5259i();
    }

    @NonNull
    @CheckResult
    /* renamed from: c */
    public T mo5255c() {
        return m5274x(DownsampleStrategy.f8533c, new CircleCrop());
    }

    @Override // 
    @CheckResult
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public T clone() {
        try {
            T t = (T) super.clone();
            Options options = new Options();
            t.f8722r = options;
            options.m4961d(this.f8722r);
            CachedHashCodeArrayMap cachedHashCodeArrayMap = new CachedHashCodeArrayMap();
            t.f8723s = cachedHashCodeArrayMap;
            cachedHashCodeArrayMap.putAll(this.f8723s);
            t.f8725u = false;
            t.f8727w = false;
            return t;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    @NonNull
    @CheckResult
    /* renamed from: e */
    public T mo5256e(@NonNull Class<?> cls) {
        if (this.f8727w) {
            return (T) clone().mo5256e(cls);
        }
        Objects.requireNonNull(cls, "Argument must not be null");
        this.f8724t = cls;
        this.f8706b |= RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT;
        m5268r();
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BaseRequestOptions)) {
            return false;
        }
        BaseRequestOptions baseRequestOptions = (BaseRequestOptions) obj;
        return Float.compare(baseRequestOptions.f8707c, this.f8707c) == 0 && this.f8711g == baseRequestOptions.f8711g && Util.m5345b(this.f8710f, baseRequestOptions.f8710f) && this.f8713i == baseRequestOptions.f8713i && Util.m5345b(this.f8712h, baseRequestOptions.f8712h) && this.f8721q == baseRequestOptions.f8721q && Util.m5345b(this.f8720p, baseRequestOptions.f8720p) && this.f8714j == baseRequestOptions.f8714j && this.f8715k == baseRequestOptions.f8715k && this.f8716l == baseRequestOptions.f8716l && this.f8718n == baseRequestOptions.f8718n && this.f8719o == baseRequestOptions.f8719o && this.f8728x == baseRequestOptions.f8728x && this.f8729y == baseRequestOptions.f8729y && this.f8708d.equals(baseRequestOptions.f8708d) && this.f8709e == baseRequestOptions.f8709e && this.f8722r.equals(baseRequestOptions.f8722r) && this.f8723s.equals(baseRequestOptions.f8723s) && this.f8724t.equals(baseRequestOptions.f8724t) && Util.m5345b(this.f8717m, baseRequestOptions.f8717m) && Util.m5345b(this.f8726v, baseRequestOptions.f8726v);
    }

    @NonNull
    @CheckResult
    /* renamed from: f */
    public T mo5257f(@NonNull DiskCacheStrategy diskCacheStrategy) {
        if (this.f8727w) {
            return (T) clone().mo5257f(diskCacheStrategy);
        }
        Objects.requireNonNull(diskCacheStrategy, "Argument must not be null");
        this.f8708d = diskCacheStrategy;
        this.f8706b |= 4;
        m5268r();
        return this;
    }

    @NonNull
    @CheckResult
    /* renamed from: g */
    public T mo5258g(@NonNull DownsampleStrategy downsampleStrategy) {
        Option option = DownsampleStrategy.f8536f;
        Objects.requireNonNull(downsampleStrategy, "Argument must not be null");
        return mo5269s(option, downsampleStrategy);
    }

    public int hashCode() {
        float f2 = this.f8707c;
        char[] cArr = Util.f8851a;
        return Util.m5349f(this.f8726v, Util.m5349f(this.f8717m, Util.m5349f(this.f8724t, Util.m5349f(this.f8723s, Util.m5349f(this.f8722r, Util.m5349f(this.f8709e, Util.m5349f(this.f8708d, (((((((((((((Util.m5349f(this.f8720p, (Util.m5349f(this.f8712h, (Util.m5349f(this.f8710f, ((Float.floatToIntBits(f2) + 527) * 31) + this.f8711g) * 31) + this.f8713i) * 31) + this.f8721q) * 31) + (this.f8714j ? 1 : 0)) * 31) + this.f8715k) * 31) + this.f8716l) * 31) + (this.f8718n ? 1 : 0)) * 31) + (this.f8719o ? 1 : 0)) * 31) + (this.f8728x ? 1 : 0)) * 31) + (this.f8729y ? 1 : 0))))))));
    }

    @NonNull
    /* renamed from: i */
    public T mo5259i() {
        this.f8725u = true;
        return this;
    }

    @NonNull
    @CheckResult
    /* renamed from: j */
    public T mo5260j() {
        return m5263m(DownsampleStrategy.f8532b, new CenterCrop());
    }

    @NonNull
    @CheckResult
    /* renamed from: k */
    public T mo5261k() {
        T m5263m = m5263m(DownsampleStrategy.f8533c, new CenterInside());
        m5263m.f8730z = true;
        return m5263m;
    }

    @NonNull
    @CheckResult
    /* renamed from: l */
    public T mo5262l() {
        T m5263m = m5263m(DownsampleStrategy.f8531a, new FitCenter());
        m5263m.f8730z = true;
        return m5263m;
    }

    @NonNull
    /* renamed from: m */
    public final T m5263m(@NonNull DownsampleStrategy downsampleStrategy, @NonNull Transformation<Bitmap> transformation) {
        if (this.f8727w) {
            return (T) clone().m5263m(downsampleStrategy, transformation);
        }
        mo5258g(downsampleStrategy);
        return m5273w(transformation, false);
    }

    @NonNull
    @CheckResult
    /* renamed from: n */
    public T mo5264n(int i2) {
        return mo5265o(i2, i2);
    }

    @NonNull
    @CheckResult
    /* renamed from: o */
    public T mo5265o(int i2, int i3) {
        if (this.f8727w) {
            return (T) clone().mo5265o(i2, i3);
        }
        this.f8716l = i2;
        this.f8715k = i3;
        this.f8706b |= RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN;
        m5268r();
        return this;
    }

    @NonNull
    @CheckResult
    /* renamed from: p */
    public T mo5266p(@DrawableRes int i2) {
        if (this.f8727w) {
            return (T) clone().mo5266p(i2);
        }
        this.f8713i = i2;
        int i3 = this.f8706b | 128;
        this.f8706b = i3;
        this.f8712h = null;
        this.f8706b = i3 & (-65);
        m5268r();
        return this;
    }

    @NonNull
    @CheckResult
    /* renamed from: q */
    public T mo5267q(@NonNull Priority priority) {
        if (this.f8727w) {
            return (T) clone().mo5267q(priority);
        }
        Objects.requireNonNull(priority, "Argument must not be null");
        this.f8709e = priority;
        this.f8706b |= 8;
        m5268r();
        return this;
    }

    @NonNull
    /* renamed from: r */
    public final T m5268r() {
        if (this.f8725u) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return this;
    }

    @NonNull
    @CheckResult
    /* renamed from: s */
    public <Y> T mo5269s(@NonNull Option<Y> option, @NonNull Y y) {
        if (this.f8727w) {
            return (T) clone().mo5269s(option, y);
        }
        Objects.requireNonNull(option, "Argument must not be null");
        Objects.requireNonNull(y, "Argument must not be null");
        this.f8722r.f8062b.put(option, y);
        m5268r();
        return this;
    }

    @NonNull
    @CheckResult
    /* renamed from: t */
    public T mo5270t(@NonNull Key key) {
        if (this.f8727w) {
            return (T) clone().mo5270t(key);
        }
        Objects.requireNonNull(key, "Argument must not be null");
        this.f8717m = key;
        this.f8706b |= RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE;
        m5268r();
        return this;
    }

    @NonNull
    @CheckResult
    /* renamed from: u */
    public T mo5271u(boolean z) {
        if (this.f8727w) {
            return (T) clone().mo5271u(true);
        }
        this.f8714j = !z;
        this.f8706b |= 256;
        m5268r();
        return this;
    }

    @NonNull
    @CheckResult
    /* renamed from: v */
    public T mo5272v(@NonNull Transformation<Bitmap> transformation) {
        return m5273w(transformation, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    /* renamed from: w */
    public T m5273w(@NonNull Transformation<Bitmap> transformation, boolean z) {
        if (this.f8727w) {
            return (T) clone().m5273w(transformation, z);
        }
        DrawableTransformation drawableTransformation = new DrawableTransformation(transformation, z);
        m5275y(Bitmap.class, transformation, z);
        m5275y(Drawable.class, drawableTransformation, z);
        m5275y(BitmapDrawable.class, drawableTransformation, z);
        m5275y(GifDrawable.class, new GifDrawableTransformation(transformation), z);
        m5268r();
        return this;
    }

    @NonNull
    @CheckResult
    /* renamed from: x */
    public final T m5274x(@NonNull DownsampleStrategy downsampleStrategy, @NonNull Transformation<Bitmap> transformation) {
        if (this.f8727w) {
            return (T) clone().m5274x(downsampleStrategy, transformation);
        }
        mo5258g(downsampleStrategy);
        return mo5272v(transformation);
    }

    @NonNull
    /* renamed from: y */
    public <Y> T m5275y(@NonNull Class<Y> cls, @NonNull Transformation<Y> transformation, boolean z) {
        if (this.f8727w) {
            return (T) clone().m5275y(cls, transformation, z);
        }
        Objects.requireNonNull(cls, "Argument must not be null");
        Objects.requireNonNull(transformation, "Argument must not be null");
        this.f8723s.put(cls, transformation);
        int i2 = this.f8706b | RecyclerView.ViewHolder.FLAG_MOVED;
        this.f8706b = i2;
        this.f8719o = true;
        int i3 = i2 | TextBuffer.MAX_SEGMENT_LEN;
        this.f8706b = i3;
        this.f8730z = false;
        if (z) {
            this.f8706b = i3 | 131072;
            this.f8718n = true;
        }
        m5268r();
        return this;
    }

    @NonNull
    @CheckResult
    @Deprecated
    /* renamed from: z */
    public T mo5276z(@NonNull Transformation<Bitmap>... transformationArr) {
        return m5273w(new MultiTransformation(transformationArr), true);
    }
}
