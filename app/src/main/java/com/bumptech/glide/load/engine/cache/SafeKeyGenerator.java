package com.bumptech.glide.load.engine.cache;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

/* loaded from: classes.dex */
public class SafeKeyGenerator {

    /* renamed from: a */
    public final LruCache<Key, String> f8399a = new LruCache<>(1000);

    /* renamed from: b */
    public final Pools.Pool<PoolableDigestContainer> f8400b = FactoryPools.m5353a(10, new FactoryPools.Factory<PoolableDigestContainer>(this) { // from class: com.bumptech.glide.load.engine.cache.SafeKeyGenerator.1
        @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
        /* renamed from: a */
        public PoolableDigestContainer mo5033a() {
            try {
                return new PoolableDigestContainer(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2);
            }
        }
    });

    public static final class PoolableDigestContainer implements FactoryPools.Poolable {

        /* renamed from: b */
        public final MessageDigest f8401b;

        /* renamed from: c */
        public final StateVerifier f8402c = StateVerifier.m5356a();

        public PoolableDigestContainer(MessageDigest messageDigest) {
            this.f8401b = messageDigest;
        }

        @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
        @NonNull
        /* renamed from: h */
        public StateVerifier mo5005h() {
            return this.f8402c;
        }
    }

    /* renamed from: a */
    public String m5120a(Key key) {
        String m5338f;
        synchronized (this.f8399a) {
            m5338f = this.f8399a.m5338f(key);
        }
        if (m5338f == null) {
            PoolableDigestContainer mo2027b = this.f8400b.mo2027b();
            Objects.requireNonNull(mo2027b, "Argument must not be null");
            PoolableDigestContainer poolableDigestContainer = mo2027b;
            try {
                key.mo4956a(poolableDigestContainer.f8401b);
                byte[] digest = poolableDigestContainer.f8401b.digest();
                char[] cArr = Util.f8852b;
                synchronized (cArr) {
                    for (int i2 = 0; i2 < digest.length; i2++) {
                        int i3 = digest[i2] & 255;
                        int i4 = i2 * 2;
                        char[] cArr2 = Util.f8851a;
                        cArr[i4] = cArr2[i3 >>> 4];
                        cArr[i4 + 1] = cArr2[i3 & 15];
                    }
                    m5338f = new String(cArr);
                }
            } finally {
                this.f8400b.mo2026a(poolableDigestContainer);
            }
        }
        synchronized (this.f8399a) {
            this.f8399a.m5339i(key, m5338f);
        }
        return m5338f;
    }
}
