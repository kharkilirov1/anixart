package com.yandex.mobile.ads.impl;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* renamed from: com.yandex.mobile.ads.impl.wb */
/* loaded from: classes3.dex */
final class C5966wb {

    /* renamed from: a */
    @Nullable
    private final a f56076a;

    /* renamed from: b */
    private int f56077b;

    /* renamed from: c */
    private long f56078c;

    /* renamed from: d */
    private long f56079d;

    /* renamed from: e */
    private long f56080e;

    /* renamed from: f */
    private long f56081f;

    @RequiresApi
    /* renamed from: com.yandex.mobile.ads.impl.wb$a */
    public static final class a {

        /* renamed from: a */
        private final AudioTrack f56082a;

        /* renamed from: b */
        private final AudioTimestamp f56083b = new AudioTimestamp();

        /* renamed from: c */
        private long f56084c;

        /* renamed from: d */
        private long f56085d;

        /* renamed from: e */
        private long f56086e;

        public a(AudioTrack audioTrack) {
            this.f56082a = audioTrack;
        }

        /* renamed from: a */
        public final long m29435a() {
            return this.f56086e;
        }

        /* renamed from: b */
        public final long m29436b() {
            return this.f56083b.nanoTime / 1000;
        }

        /* renamed from: c */
        public final boolean m29437c() {
            boolean timestamp = this.f56082a.getTimestamp(this.f56083b);
            if (timestamp) {
                long j2 = this.f56083b.framePosition;
                if (this.f56085d > j2) {
                    this.f56084c++;
                }
                this.f56085d = j2;
                this.f56086e = j2 + (this.f56084c << 32);
            }
            return timestamp;
        }
    }

    public C5966wb(AudioTrack audioTrack) {
        if (s91.f54530a >= 19) {
            this.f56076a = new a(audioTrack);
            m29434f();
        } else {
            this.f56076a = null;
            m29427a(3);
        }
    }

    @TargetApi
    /* renamed from: a */
    public final boolean m29429a(long j2) {
        a aVar = this.f56076a;
        if (aVar == null || j2 - this.f56080e < this.f56079d) {
            return false;
        }
        this.f56080e = j2;
        boolean m29437c = aVar.m29437c();
        int i2 = this.f56077b;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (m29437c) {
                        m29434f();
                    }
                } else if (!m29437c) {
                    m29434f();
                }
            } else if (!m29437c) {
                m29434f();
            } else if (this.f56076a.m29435a() > this.f56081f) {
                m29427a(2);
            }
        } else if (m29437c) {
            if (this.f56076a.m29436b() < this.f56078c) {
                return false;
            }
            this.f56081f = this.f56076a.m29435a();
            m29427a(1);
        } else if (j2 - this.f56078c > 500000) {
            m29427a(3);
        }
        return m29437c;
    }

    @TargetApi
    /* renamed from: b */
    public final long m29430b() {
        a aVar = this.f56076a;
        if (aVar != null) {
            return aVar.m29435a();
        }
        return -1L;
    }

    @TargetApi
    /* renamed from: c */
    public final long m29431c() {
        a aVar = this.f56076a;
        if (aVar != null) {
            return aVar.m29436b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: d */
    public final boolean m29432d() {
        return this.f56077b == 2;
    }

    /* renamed from: e */
    public final void m29433e() {
        m29427a(4);
    }

    /* renamed from: f */
    public final void m29434f() {
        if (this.f56076a != null) {
            m29427a(0);
        }
    }

    /* renamed from: a */
    public final void m29428a() {
        if (this.f56077b == 4) {
            m29434f();
        }
    }

    /* renamed from: a */
    private void m29427a(int i2) {
        this.f56077b = i2;
        if (i2 == 0) {
            this.f56080e = 0L;
            this.f56081f = -1L;
            this.f56078c = System.nanoTime() / 1000;
            this.f56079d = 10000L;
            return;
        }
        if (i2 == 1) {
            this.f56079d = 10000L;
            return;
        }
        if (i2 == 2 || i2 == 3) {
            this.f56079d = 10000000L;
        } else {
            if (i2 == 4) {
                this.f56079d = 500000L;
                return;
            }
            throw new IllegalStateException();
        }
    }
}
