package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.load.engine.bitmap_recycle.Poolable;
import com.bumptech.glide.util.Util;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
abstract class BaseKeyPool<T extends Poolable> {

    /* renamed from: a */
    public final Queue<T> f8329a;

    public BaseKeyPool() {
        char[] cArr = Util.f8851a;
        this.f8329a = new ArrayDeque(20);
    }

    /* renamed from: a */
    public abstract T mo5073a();

    /* renamed from: b */
    public T m5074b() {
        T poll = this.f8329a.poll();
        return poll == null ? mo5073a() : poll;
    }

    /* renamed from: c */
    public void m5075c(T t) {
        if (this.f8329a.size() < 20) {
            this.f8329a.offer(t);
        }
    }
}
