package com.bumptech.glide.util.pool;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class StateVerifier {

    public static class DebugStateVerifier extends StateVerifier {

        /* renamed from: a */
        public volatile RuntimeException f8859a;

        public DebugStateVerifier() {
            super(null);
        }

        @Override // com.bumptech.glide.util.pool.StateVerifier
        /* renamed from: b */
        public void mo5357b(boolean z) {
            if (z) {
                this.f8859a = new RuntimeException("Released");
            } else {
                this.f8859a = null;
            }
        }

        @Override // com.bumptech.glide.util.pool.StateVerifier
        /* renamed from: c */
        public void mo5358c() {
            if (this.f8859a != null) {
                throw new IllegalStateException("Already released", this.f8859a);
            }
        }
    }

    public static class DefaultStateVerifier extends StateVerifier {

        /* renamed from: a */
        public volatile boolean f8860a;

        public DefaultStateVerifier() {
            super(null);
        }

        @Override // com.bumptech.glide.util.pool.StateVerifier
        /* renamed from: b */
        public void mo5357b(boolean z) {
            this.f8860a = z;
        }

        @Override // com.bumptech.glide.util.pool.StateVerifier
        /* renamed from: c */
        public void mo5358c() {
            if (this.f8860a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public StateVerifier() {
    }

    @NonNull
    /* renamed from: a */
    public static StateVerifier m5356a() {
        return new DefaultStateVerifier();
    }

    /* renamed from: b */
    public abstract void mo5357b(boolean z);

    /* renamed from: c */
    public abstract void mo5358c();

    public StateVerifier(C08321 c08321) {
    }
}
