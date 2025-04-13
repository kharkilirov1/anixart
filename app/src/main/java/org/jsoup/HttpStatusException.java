package org.jsoup;

import java.io.IOException;

/* loaded from: classes3.dex */
public class HttpStatusException extends IOException {
    public HttpStatusException(String str, int i2, String str2) {
        super(str + ". Status=" + i2 + ", URL=[" + str2 + "]");
    }
}
