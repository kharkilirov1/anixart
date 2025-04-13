package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jm1;
import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class om1 implements jm1.InterfaceC5293a {

    /* renamed from: b */
    private final ArrayDeque<jm1> f53294b = new ArrayDeque<>();

    /* renamed from: c */
    private jm1 f53295c = null;

    /* renamed from: a */
    private final ThreadPoolExecutor f53293a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: b */
    private void m27093b() {
        jm1 poll = this.f53294b.poll();
        this.f53295c = poll;
        if (poll != null) {
            poll.executeOnExecutor(this.f53293a, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void m27094a() {
        this.f53295c = null;
        m27093b();
    }

    /* renamed from: a */
    public final void m27095a(jm1 jm1Var) {
        jm1Var.m25912a(this);
        this.f53294b.add(jm1Var);
        if (this.f53295c == null) {
            m27093b();
        }
    }
}
