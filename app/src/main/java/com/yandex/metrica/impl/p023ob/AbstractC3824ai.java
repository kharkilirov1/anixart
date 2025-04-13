package com.yandex.metrica.impl.p023ob;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ai */
/* loaded from: classes2.dex */
public abstract class AbstractC3824ai {

    /* renamed from: a */
    @NonNull
    public final Socket f44756a;

    /* renamed from: b */
    @NonNull
    public final InterfaceC3980gi f44757b;

    /* renamed from: c */
    @NonNull
    public final C3275Ei f44758c;

    /* renamed from: d */
    @NonNull
    public final Uri f44759d;

    /* renamed from: e */
    @NonNull
    public final C4006hi f44760e;

    public AbstractC3824ai(@NonNull Socket socket, @NonNull Uri uri, @NonNull InterfaceC3980gi interfaceC3980gi, @NonNull C3275Ei c3275Ei, @NonNull C4006hi c4006hi) {
        this.f44756a = socket;
        this.f44759d = uri;
        this.f44757b = interfaceC3980gi;
        this.f44758c = c3275Ei;
        this.f44760e = c4006hi;
    }

    /* renamed from: a */
    public abstract void mo18818a();

    /* renamed from: a */
    public void m19584a(@NonNull String str, @NonNull Map<String, String> map, @NonNull byte[] bArr) {
        BufferedOutputStream bufferedOutputStream;
        this.f44760e.m20019b();
        OutputStream outputStream = null;
        OutputStream outputStream2 = null;
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(this.f44756a.getOutputStream());
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e2) {
            e = e2;
        }
        try {
            bufferedOutputStream.write(str.getBytes());
            m19582a(bufferedOutputStream);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                m19583a(bufferedOutputStream, key, entry.getValue());
                outputStream2 = key;
            }
            m19582a(bufferedOutputStream);
            bufferedOutputStream.write(bArr);
            bufferedOutputStream.flush();
            this.f44760e.m20020c();
            ((RunnableC4058ji) this.f44757b).m20155b(this.f44756a.getLocalPort(), this.f44760e);
            outputStream = outputStream2;
        } catch (IOException e3) {
            e = e3;
            bufferedOutputStream2 = bufferedOutputStream;
            ((RunnableC4058ji) this.f44757b).m20152a("io_exception_during_sync", e);
            bufferedOutputStream = bufferedOutputStream2;
            outputStream = bufferedOutputStream2;
            C3658U2.m19209a((Closeable) bufferedOutputStream);
        } catch (Throwable th2) {
            th = th2;
            outputStream = bufferedOutputStream;
            C3658U2.m19209a((Closeable) outputStream);
            throw th;
        }
        C3658U2.m19209a((Closeable) bufferedOutputStream);
    }

    /* renamed from: a */
    private void m19583a(@NonNull OutputStream outputStream, @NonNull String str, @NonNull String str2) throws IOException {
        outputStream.write((str + ": " + str2).getBytes());
        m19582a(outputStream);
    }

    /* renamed from: a */
    private void m19582a(@NonNull OutputStream outputStream) throws IOException {
        outputStream.write("\r\n".getBytes());
    }
}
