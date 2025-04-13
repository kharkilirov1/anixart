package com.bumptech.glide.request;

import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class RequestOptions extends BaseRequestOptions<RequestOptions> {

    /* renamed from: B */
    @Nullable
    public static RequestOptions f8745B;

    @NonNull
    @CheckResult
    /* renamed from: E */
    public static RequestOptions m5298E() {
        if (f8745B == null) {
            f8745B = new RequestOptions().mo5255c().mo5254b();
        }
        return f8745B;
    }
}
