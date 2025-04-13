package com.bumptech.glide.request;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class ErrorRequestCoordinator implements RequestCoordinator, Request {

    /* renamed from: b */
    @Nullable
    public final RequestCoordinator f8731b;

    /* renamed from: c */
    public Request f8732c;

    /* renamed from: d */
    public Request f8733d;

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: a */
    public void mo5277a(Request request) {
        if (!request.equals(this.f8733d)) {
            if (this.f8733d.isRunning()) {
                return;
            }
            this.f8733d.mo5285i();
        } else {
            RequestCoordinator requestCoordinator = this.f8731b;
            if (requestCoordinator != null) {
                requestCoordinator.mo5277a(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: b */
    public boolean mo5278b() {
        RequestCoordinator requestCoordinator = this.f8731b;
        return (requestCoordinator != null && requestCoordinator.mo5278b()) || mo5280d();
    }

    @Override // com.bumptech.glide.request.Request
    /* renamed from: c */
    public void mo5279c() {
        this.f8732c.mo5279c();
        this.f8733d.mo5279c();
    }

    @Override // com.bumptech.glide.request.Request
    public void clear() {
        this.f8732c.clear();
        if (this.f8733d.isRunning()) {
            this.f8733d.clear();
        }
    }

    @Override // com.bumptech.glide.request.Request
    /* renamed from: d */
    public boolean mo5280d() {
        return (this.f8732c.mo5282f() ? this.f8733d : this.f8732c).mo5280d();
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: e */
    public boolean mo5281e(Request request) {
        RequestCoordinator requestCoordinator = this.f8731b;
        return (requestCoordinator == null || requestCoordinator.mo5281e(this)) && m5289m(request);
    }

    @Override // com.bumptech.glide.request.Request
    /* renamed from: f */
    public boolean mo5282f() {
        return this.f8732c.mo5282f() && this.f8733d.mo5282f();
    }

    @Override // com.bumptech.glide.request.Request
    /* renamed from: g */
    public boolean mo5283g() {
        return (this.f8732c.mo5282f() ? this.f8733d : this.f8732c).mo5283g();
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: h */
    public boolean mo5284h(Request request) {
        RequestCoordinator requestCoordinator = this.f8731b;
        return (requestCoordinator == null || requestCoordinator.mo5284h(this)) && m5289m(request);
    }

    @Override // com.bumptech.glide.request.Request
    /* renamed from: i */
    public void mo5285i() {
        if (this.f8732c.isRunning()) {
            return;
        }
        this.f8732c.mo5285i();
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isRunning() {
        return (this.f8732c.mo5282f() ? this.f8733d : this.f8732c).isRunning();
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: j */
    public void mo5286j(Request request) {
        RequestCoordinator requestCoordinator = this.f8731b;
        if (requestCoordinator != null) {
            requestCoordinator.mo5286j(this);
        }
    }

    @Override // com.bumptech.glide.request.Request
    /* renamed from: k */
    public boolean mo5287k() {
        return (this.f8732c.mo5282f() ? this.f8733d : this.f8732c).mo5287k();
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: l */
    public boolean mo5288l(Request request) {
        RequestCoordinator requestCoordinator = this.f8731b;
        return (requestCoordinator == null || requestCoordinator.mo5288l(this)) && m5289m(request);
    }

    /* renamed from: m */
    public final boolean m5289m(Request request) {
        return request.equals(this.f8732c) || (this.f8732c.mo5282f() && request.equals(this.f8733d));
    }
}
