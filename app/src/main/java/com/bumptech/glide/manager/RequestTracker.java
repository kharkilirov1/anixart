package com.bumptech.glide.manager;

import androidx.annotation.Nullable;
import com.bumptech.glide.request.Request;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class RequestTracker {

    /* renamed from: a */
    public final Set<Request> f8677a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public final List<Request> f8678b = new ArrayList();

    /* renamed from: c */
    public boolean f8679c;

    /* renamed from: a */
    public final boolean m5236a(@Nullable Request request, boolean z) {
        boolean z2 = true;
        if (request == null) {
            return true;
        }
        boolean remove = this.f8677a.remove(request);
        if (!this.f8678b.remove(request) && !remove) {
            z2 = false;
        }
        if (z2) {
            request.clear();
            if (z) {
                request.mo5279c();
            }
        }
        return z2;
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f8677a.size() + ", isPaused=" + this.f8679c + "}";
    }
}
