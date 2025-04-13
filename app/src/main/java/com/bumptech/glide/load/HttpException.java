package com.bumptech.glide.load;

import java.io.IOException;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class HttpException extends IOException {
    public HttpException(int i2) {
        super(C0000a.m7d("Http request failed with status code: ", i2), null);
    }

    public HttpException(String str) {
        super(str, null);
    }

    public HttpException(String str, int i2) {
        super(str, null);
    }
}
