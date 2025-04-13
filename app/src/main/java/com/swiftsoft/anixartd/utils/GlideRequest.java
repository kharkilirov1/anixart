package com.swiftsoft.anixartd.utils;

import android.content.Context;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestListener;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class GlideRequest<TranscodeType> extends RequestBuilder<TranscodeType> {
    public GlideRequest(@NonNull Glide glide, @NonNull RequestManager requestManager, @NonNull Class<TranscodeType> cls, @NonNull Context context) {
        super(glide, requestManager, cls, context);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: D */
    public BaseRequestOptions mo5253D(boolean z) {
        return (GlideRequest) super.mo5253D(z);
    }

    @Override // com.bumptech.glide.RequestBuilder
    @NonNull
    @CheckResult
    /* renamed from: E */
    public RequestBuilder mo4881E(@Nullable RequestListener requestListener) {
        if (requestListener != null) {
            if (this.f7940H == null) {
                this.f7940H = new ArrayList();
            }
            this.f7940H.add(requestListener);
        }
        return this;
    }

    @Override // com.bumptech.glide.RequestBuilder
    @NonNull
    @CheckResult
    /* renamed from: F */
    public RequestBuilder mo4892a(@NonNull BaseRequestOptions baseRequestOptions) {
        return (GlideRequest) super.mo4892a(baseRequestOptions);
    }

    @Override // com.bumptech.glide.RequestBuilder
    @NonNull
    @CheckResult
    /* renamed from: L */
    public RequestBuilder mo4888L(@Nullable Object obj) {
        this.f7939G = obj;
        this.f7941I = true;
        return this;
    }

    @Override // com.bumptech.glide.RequestBuilder
    @NonNull
    @CheckResult
    /* renamed from: M */
    public RequestBuilder mo4889M(@Nullable String str) {
        this.f7939G = str;
        this.f7941I = true;
        return this;
    }

    @NonNull
    @CheckResult
    /* renamed from: P */
    public GlideRequest<TranscodeType> m16335P(@NonNull BaseRequestOptions<?> baseRequestOptions) {
        return (GlideRequest) super.mo4892a(baseRequestOptions);
    }

    @NonNull
    @CheckResult
    /* renamed from: Q */
    public GlideRequest<TranscodeType> m16336Q() {
        return (GlideRequest) m5274x(DownsampleStrategy.f8532b, new CenterCrop());
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public GlideRequest<TranscodeType> clone() {
        return (GlideRequest) super.clone();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public GlideRequest<TranscodeType> mo5266p(@DrawableRes int i2) {
        return (GlideRequest) super.mo5266p(i2);
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: a */
    public BaseRequestOptions mo4892a(@NonNull BaseRequestOptions baseRequestOptions) {
        return (GlideRequest) super.mo4892a(baseRequestOptions);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: e */
    public BaseRequestOptions mo5256e(@NonNull Class cls) {
        return (GlideRequest) super.mo5256e(cls);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: f */
    public BaseRequestOptions mo5257f(@NonNull DiskCacheStrategy diskCacheStrategy) {
        return (GlideRequest) super.mo5257f(diskCacheStrategy);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: g */
    public BaseRequestOptions mo5258g(@NonNull DownsampleStrategy downsampleStrategy) {
        return (GlideRequest) super.mo5258g(downsampleStrategy);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: j */
    public BaseRequestOptions mo5260j() {
        return (GlideRequest) super.mo5260j();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: k */
    public BaseRequestOptions mo5261k() {
        return (GlideRequest) super.mo5261k();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: l */
    public BaseRequestOptions mo5262l() {
        return (GlideRequest) super.mo5262l();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: n */
    public BaseRequestOptions mo5264n(int i2) {
        return (GlideRequest) mo5265o(i2, i2);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: o */
    public BaseRequestOptions mo5265o(int i2, int i3) {
        return (GlideRequest) super.mo5265o(i2, i3);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: q */
    public BaseRequestOptions mo5267q(@NonNull Priority priority) {
        return (GlideRequest) super.mo5267q(priority);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: s */
    public BaseRequestOptions mo5269s(@NonNull Option option, @NonNull Object obj) {
        return (GlideRequest) super.mo5269s(option, obj);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: t */
    public BaseRequestOptions mo5270t(@NonNull Key key) {
        return (GlideRequest) super.mo5270t(key);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: u */
    public BaseRequestOptions mo5271u(boolean z) {
        return (GlideRequest) super.mo5271u(z);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: v */
    public BaseRequestOptions mo5272v(@NonNull Transformation transformation) {
        return (GlideRequest) m5273w(transformation, true);
    }
}
