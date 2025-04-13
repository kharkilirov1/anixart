package com.swiftsoft.anixartd.utils;

import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;

/* loaded from: classes2.dex */
public final class GlideOptions extends RequestOptions {
    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: D */
    public RequestOptions mo5253D(boolean z) {
        return (GlideOptions) super.mo5253D(z);
    }

    @NonNull
    @CheckResult
    /* renamed from: F */
    public GlideOptions m16334F(@NonNull BaseRequestOptions<?> baseRequestOptions) {
        return (GlideOptions) super.mo4892a(baseRequestOptions);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: a */
    public RequestOptions mo4892a(@NonNull BaseRequestOptions baseRequestOptions) {
        return (GlideOptions) super.mo4892a(baseRequestOptions);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    /* renamed from: b */
    public RequestOptions mo5254b() {
        return (GlideOptions) super.mo5254b();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: c */
    public RequestOptions mo5255c() {
        return (GlideOptions) super.mo5255c();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    public Object clone() throws CloneNotSupportedException {
        return (GlideOptions) super.clone();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    /* renamed from: d */
    public RequestOptions clone() {
        return (GlideOptions) super.clone();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: e */
    public RequestOptions mo5256e(@NonNull Class cls) {
        return (GlideOptions) super.mo5256e(cls);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: f */
    public RequestOptions mo5257f(@NonNull DiskCacheStrategy diskCacheStrategy) {
        return (GlideOptions) super.mo5257f(diskCacheStrategy);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: g */
    public RequestOptions mo5258g(@NonNull DownsampleStrategy downsampleStrategy) {
        return (GlideOptions) super.mo5258g(downsampleStrategy);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    /* renamed from: i */
    public RequestOptions mo5259i() {
        this.f8725u = true;
        return this;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: j */
    public RequestOptions mo5260j() {
        return (GlideOptions) super.mo5260j();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: k */
    public RequestOptions mo5261k() {
        return (GlideOptions) super.mo5261k();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: l */
    public RequestOptions mo5262l() {
        return (GlideOptions) super.mo5262l();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: o */
    public RequestOptions mo5265o(int i2, int i3) {
        return (GlideOptions) super.mo5265o(i2, i3);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: p */
    public RequestOptions mo5266p(@DrawableRes int i2) {
        return (GlideOptions) super.mo5266p(i2);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: q */
    public RequestOptions mo5267q(@NonNull Priority priority) {
        return (GlideOptions) super.mo5267q(priority);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: s */
    public RequestOptions mo5269s(@NonNull Option option, @NonNull Object obj) {
        return (GlideOptions) super.mo5269s(option, obj);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: t */
    public RequestOptions mo5270t(@NonNull Key key) {
        return (GlideOptions) super.mo5270t(key);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: u */
    public RequestOptions mo5271u(boolean z) {
        return (GlideOptions) super.mo5271u(z);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: v */
    public RequestOptions mo5272v(@NonNull Transformation transformation) {
        return (GlideOptions) m5273w(transformation, true);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @Deprecated
    @SafeVarargs
    @CheckResult
    /* renamed from: z */
    public RequestOptions mo5276z(@NonNull Transformation[] transformationArr) {
        return (GlideOptions) super.mo5276z(transformationArr);
    }
}
