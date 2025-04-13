package com.squareup.okhttp;

import com.squareup.okhttp.Call;
import java.util.ArrayDeque;
import java.util.Deque;

/* loaded from: classes2.dex */
public final class Dispatcher {

    /* renamed from: a */
    public final Deque<Call.AsyncCall> f24844a = new ArrayDeque();

    /* renamed from: b */
    public final Deque<Call.AsyncCall> f24845b = new ArrayDeque();

    public Dispatcher() {
        new ArrayDeque();
    }
}
