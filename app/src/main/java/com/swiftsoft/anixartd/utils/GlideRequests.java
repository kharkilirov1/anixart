package com.swiftsoft.anixartd.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import com.bumptech.glide.request.RequestOptions;

/* loaded from: classes2.dex */
public class GlideRequests extends RequestManager {
    public GlideRequests(@NonNull Glide glide, @NonNull Lifecycle lifecycle, @NonNull RequestManagerTreeNode requestManagerTreeNode, @NonNull Context context) {
        super(glide, lifecycle, requestManagerTreeNode, context);
    }

    @Override // com.bumptech.glide.RequestManager
    @NonNull
    @CheckResult
    /* renamed from: e */
    public RequestBuilder mo4895e(@NonNull Class cls) {
        return new GlideRequest(this.f7945b, this, cls, this.f7946c);
    }

    @Override // com.bumptech.glide.RequestManager
    @NonNull
    @CheckResult
    /* renamed from: h */
    public RequestBuilder mo4897h() {
        return (GlideRequest) super.mo4897h();
    }

    @Override // com.bumptech.glide.RequestManager
    @NonNull
    @CheckResult
    /* renamed from: m */
    public RequestBuilder mo4898m() {
        return (GlideRequest) super.mo4898m();
    }

    @Override // com.bumptech.glide.RequestManager
    /* renamed from: q */
    public void mo4902q(@NonNull RequestOptions requestOptions) {
        if (requestOptions instanceof GlideOptions) {
            super.mo4902q(requestOptions);
        } else {
            super.mo4902q(new GlideOptions().m16334F(requestOptions));
        }
    }

    @NonNull
    @CheckResult
    /* renamed from: t */
    public GlideRequest<Drawable> m16339t(@Nullable String str) {
        RequestBuilder mo4898m = mo4898m();
        mo4898m.mo4889M(str);
        return (GlideRequest) mo4898m;
    }
}
