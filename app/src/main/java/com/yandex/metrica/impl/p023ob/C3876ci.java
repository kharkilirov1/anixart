package com.yandex.metrica.impl.p023ob;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ci */
/* loaded from: classes2.dex */
class C3876ci {

    /* renamed from: a */
    @NonNull
    private final Socket f44882a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC3980gi f44883b;

    /* renamed from: c */
    @NonNull
    private final Map<String, InterfaceC3850bi> f44884c;

    /* renamed from: d */
    @NonNull
    private final C4006hi f44885d;

    public C3876ci(@NonNull Socket socket, @NonNull InterfaceC3980gi interfaceC3980gi, @NonNull Map<String, InterfaceC3850bi> map, @NonNull C4006hi c4006hi) {
        this.f44882a = socket;
        this.f44883b = interfaceC3980gi;
        this.f44884c = map;
        this.f44885d = c4006hi;
    }

    /* renamed from: a */
    public void m19680a() {
        BufferedReader bufferedReader;
        int indexOf;
        int indexOf2;
        BufferedReader bufferedReader2 = null;
        String str = null;
        try {
            try {
                this.f44882a.setSoTimeout(1000);
                bufferedReader = new BufferedReader(new InputStreamReader(this.f44882a.getInputStream()));
            } catch (Throwable unused) {
                return;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f44885d.m20018a();
            String readLine = bufferedReader.readLine();
            if (TextUtils.isEmpty(readLine) || (!(readLine.startsWith("GET /") || readLine.startsWith("POST /")) || (indexOf2 = readLine.indexOf(32, (indexOf = readLine.indexOf(47) + 1))) <= 0)) {
                ((RunnableC4058ji) this.f44883b).m20151a("invalid_route", readLine);
            } else {
                str = readLine.substring(indexOf, indexOf2);
            }
            if (str != null) {
                Uri parse = Uri.parse(str);
                InterfaceC3850bi interfaceC3850bi = this.f44884c.get(parse.getPath());
                if (interfaceC3850bi != null) {
                    AbstractC3824ai mo19661a = interfaceC3850bi.mo19661a(this.f44882a, parse, this.f44885d);
                    if (mo19661a.f44758c.f42816b.equals(mo19661a.f44759d.getQueryParameter("t"))) {
                        mo19661a.mo18818a();
                    } else {
                        ((RunnableC4058ji) mo19661a.f44757b).m20149a("request_with_wrong_token");
                    }
                } else {
                    ((RunnableC4058ji) this.f44883b).m20151a("request_to_unknown_path", str);
                }
            }
            bufferedReader.close();
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            try {
                ((RunnableC4058ji) this.f44883b).m20152a("LocalHttpServer exception", th);
                if (bufferedReader2 != null) {
                    bufferedReader2.close();
                }
            } catch (Throwable th3) {
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th3;
            }
        }
    }
}
