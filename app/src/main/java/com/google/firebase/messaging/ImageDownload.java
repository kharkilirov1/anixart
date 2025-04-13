package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.ByteStreams;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ImageDownload implements Closeable {

    /* renamed from: b */
    public final URL f23292b;

    /* renamed from: c */
    @Nullable
    public volatile Future<?> f23293c;

    /* renamed from: d */
    @Nullable
    public Task<Bitmap> f23294d;

    public ImageDownload(URL url) {
        this.f23292b = url;
    }

    /* renamed from: a */
    public Bitmap m12661a() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            StringBuilder m24u = C0000a.m24u("Starting download of: ");
            m24u.append(this.f23292b);
            Log.i("FirebaseMessaging", m24u.toString());
        }
        URLConnection openConnection = this.f23292b.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            byte[] m12635b = ByteStreams.m12635b(new ByteStreams.LimitedInputStream(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                StringBuilder m24u2 = C0000a.m24u("Downloaded ");
                m24u2.append(m12635b.length);
                m24u2.append(" bytes from ");
                m24u2.append(this.f23292b);
                Log.v("FirebaseMessaging", m24u2.toString());
            }
            if (m12635b.length > 1048576) {
                throw new IOException("Image exceeds max size of 1048576");
            }
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(m12635b, 0, m12635b.length);
            if (decodeByteArray == null) {
                StringBuilder m24u3 = C0000a.m24u("Failed to decode image: ");
                m24u3.append(this.f23292b);
                throw new IOException(m24u3.toString());
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder m24u4 = C0000a.m24u("Successfully downloaded image: ");
                m24u4.append(this.f23292b);
                Log.d("FirebaseMessaging", m24u4.toString());
            }
            return decodeByteArray;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f23293c.cancel(true);
    }
}
