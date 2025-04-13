package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.util.Util;
import p000a.C0000a;

/* loaded from: classes.dex */
class AttributeStrategy implements LruPoolStrategy {

    /* renamed from: a */
    public final KeyPool f8323a = new KeyPool();

    /* renamed from: b */
    public final GroupedLinkedMap<Key, Bitmap> f8324b = new GroupedLinkedMap<>();

    @VisibleForTesting
    public static class Key implements Poolable {

        /* renamed from: a */
        public final KeyPool f8325a;

        /* renamed from: b */
        public int f8326b;

        /* renamed from: c */
        public int f8327c;

        /* renamed from: d */
        public Bitmap.Config f8328d;

        public Key(KeyPool keyPool) {
            this.f8325a = keyPool;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.Poolable
        /* renamed from: a */
        public void mo5072a() {
            this.f8325a.m5075c(this);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return this.f8326b == key.f8326b && this.f8327c == key.f8327c && this.f8328d == key.f8328d;
        }

        public int hashCode() {
            int i2 = ((this.f8326b * 31) + this.f8327c) * 31;
            Bitmap.Config config = this.f8328d;
            return i2 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return AttributeStrategy.m5066f(this.f8326b, this.f8327c, this.f8328d);
        }
    }

    @VisibleForTesting
    public static class KeyPool extends BaseKeyPool<Key> {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.BaseKeyPool
        /* renamed from: a */
        public Key mo5073a() {
            return new Key(this);
        }
    }

    /* renamed from: f */
    public static String m5066f(int i2, int i3, Bitmap.Config config) {
        StringBuilder m26w = C0000a.m26w("[", i2, "x", i3, "], ");
        m26w.append(config);
        return m26w.toString();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    /* renamed from: a */
    public String mo5067a(int i2, int i3, Bitmap.Config config) {
        return m5066f(i2, i3, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    /* renamed from: b */
    public int mo5068b(Bitmap bitmap) {
        return Util.m5347d(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    /* renamed from: c */
    public void mo5069c(Bitmap bitmap) {
        KeyPool keyPool = this.f8323a;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        Key m5074b = keyPool.m5074b();
        m5074b.f8326b = width;
        m5074b.f8327c = height;
        m5074b.f8328d = config;
        this.f8324b.m5082b(m5074b, bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    /* renamed from: d */
    public Bitmap mo5070d(int i2, int i3, Bitmap.Config config) {
        Key m5074b = this.f8323a.m5074b();
        m5074b.f8326b = i2;
        m5074b.f8327c = i3;
        m5074b.f8328d = config;
        return this.f8324b.m5081a(m5074b);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    /* renamed from: e */
    public String mo5071e(Bitmap bitmap) {
        return m5066f(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    public Bitmap removeLast() {
        return this.f8324b.m5083c();
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("AttributeStrategy:\n  ");
        m24u.append(this.f8324b);
        return m24u.toString();
    }
}
