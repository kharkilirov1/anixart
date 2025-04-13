package com.bumptech.glide.request;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* loaded from: classes.dex */
public class ThumbnailRequestCoordinator implements RequestCoordinator, Request {

    /* renamed from: b */
    @Nullable
    public final RequestCoordinator f8783b = null;

    /* renamed from: c */
    public Request f8784c;

    /* renamed from: d */
    public Request f8785d;

    /* renamed from: e */
    public boolean f8786e;

    @VisibleForTesting
    public ThumbnailRequestCoordinator() {
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: a */
    public void mo5277a(Request request) {
        RequestCoordinator requestCoordinator;
        if (request.equals(this.f8784c) && (requestCoordinator = this.f8783b) != null) {
            requestCoordinator.mo5277a(this);
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: b */
    public boolean mo5278b() {
        RequestCoordinator requestCoordinator = this.f8783b;
        return (requestCoordinator != null && requestCoordinator.mo5278b()) || mo5280d();
    }

    @Override // com.bumptech.glide.request.Request
    /* renamed from: c */
    public void mo5279c() {
        this.f8784c.mo5279c();
        this.f8785d.mo5279c();
    }

    @Override // com.bumptech.glide.request.Request
    public void clear() {
        this.f8786e = false;
        this.f8785d.clear();
        this.f8784c.clear();
    }

    @Override // com.bumptech.glide.request.Request
    /* renamed from: d */
    public boolean mo5280d() {
        return this.f8784c.mo5280d() || this.f8785d.mo5280d();
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: e */
    public boolean mo5281e(Request request) {
        RequestCoordinator requestCoordinator = this.f8783b;
        return (requestCoordinator == null || requestCoordinator.mo5281e(this)) && request.equals(this.f8784c) && !mo5278b();
    }

    @Override // com.bumptech.glide.request.Request
    /* renamed from: f */
    public boolean mo5282f() {
        return this.f8784c.mo5282f();
    }

    @Override // com.bumptech.glide.request.Request
    /* renamed from: g */
    public boolean mo5283g() {
        return this.f8784c.mo5283g();
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: h */
    public boolean mo5284h(Request request) {
        RequestCoordinator requestCoordinator = this.f8783b;
        return (requestCoordinator == null || requestCoordinator.mo5284h(this)) && (request.equals(this.f8784c) || !this.f8784c.mo5280d());
    }

    @Override // com.bumptech.glide.request.Request
    /* renamed from: i */
    public void mo5285i() {
        this.f8786e = true;
        if (!this.f8784c.mo5287k() && !this.f8785d.isRunning()) {
            this.f8785d.mo5285i();
        }
        if (!this.f8786e || this.f8784c.isRunning()) {
            return;
        }
        this.f8784c.mo5285i();
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isRunning() {
        return this.f8784c.isRunning();
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: j */
    public void mo5286j(Request request) {
        if (request.equals(this.f8785d)) {
            return;
        }
        RequestCoordinator requestCoordinator = this.f8783b;
        if (requestCoordinator != null) {
            requestCoordinator.mo5286j(this);
        }
        if (this.f8785d.mo5287k()) {
            return;
        }
        this.f8785d.clear();
    }

    @Override // com.bumptech.glide.request.Request
    /* renamed from: k */
    public boolean mo5287k() {
        return this.f8784c.mo5287k() || this.f8785d.mo5287k();
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    /* renamed from: l */
    public boolean mo5288l(Request request) {
        RequestCoordinator requestCoordinator = this.f8783b;
        return (requestCoordinator == null || requestCoordinator.mo5288l(this)) && request.equals(this.f8784c);
    }
}
