package com.squareup.okhttp.internal.http;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class RequestException extends Exception {
    @Override // java.lang.Throwable
    public Throwable getCause() {
        return (IOException) super.getCause();
    }
}
