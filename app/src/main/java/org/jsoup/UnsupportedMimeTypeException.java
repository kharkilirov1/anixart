package org.jsoup;

import java.io.IOException;

/* loaded from: classes3.dex */
public class UnsupportedMimeTypeException extends IOException {

    /* renamed from: b */
    public final String f68891b;

    /* renamed from: c */
    public final String f68892c;

    public UnsupportedMimeTypeException(String str, String str2, String str3) {
        super(str);
        this.f68891b = str2;
        this.f68892c = str3;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + ". Mimetype=" + this.f68891b + ", URL=" + this.f68892c;
    }
}
