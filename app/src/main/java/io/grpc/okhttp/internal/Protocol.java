package io.grpc.okhttp.internal;

/* loaded from: classes3.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");


    /* renamed from: b */
    public final String f59397b;

    Protocol(String str) {
        this.f59397b = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f59397b;
    }
}
