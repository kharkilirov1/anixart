package com.p017vk.api.sdk.okhttp;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.p017vk.api.sdk.exceptions.VKLocalIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FileFullRequestBody.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/vk/api/sdk/okhttp/FileFullRequestBody;", "Lokhttp3/RequestBody;", "Companion", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class FileFullRequestBody extends RequestBody {

    /* renamed from: a */
    public final Context f30709a;

    /* renamed from: b */
    public final Uri f30710b;

    /* compiled from: FileFullRequestBody.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/vk/api/sdk/okhttp/FileFullRequestBody$Companion;", "", "", "CHUNK", "I", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        ContentResolver contentResolver;
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            try {
                Context context = this.f30709a;
                if (context != null && (contentResolver = context.getContentResolver()) != null) {
                    assetFileDescriptor = contentResolver.openAssetFileDescriptor(this.f30710b, "r");
                }
                if (assetFileDescriptor != null) {
                    long length = assetFileDescriptor.getLength();
                    try {
                        assetFileDescriptor.close();
                    } catch (Exception unused) {
                    }
                    return length;
                }
                throw new FileNotFoundException("Cannot open uri: " + this.f30710b);
            } catch (FileNotFoundException e2) {
                throw new VKLocalIOException(e2);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    assetFileDescriptor.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    @Override // okhttp3.RequestBody
    @Nullable
    /* renamed from: contentType */
    public MediaType get$contentType() {
        Uri uri = this.f30710b;
        String str = null;
        String lastPathSegment = uri != null ? uri.getLastPathSegment() : null;
        if (lastPathSegment != null) {
            try {
                str = URLConnection.guessContentTypeFromName(lastPathSegment);
            } catch (Exception unused) {
            }
        }
        if (str == null) {
            str = "application/octet-stream";
        }
        return MediaType.parse(str);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(@NotNull BufferedSink sink) throws IOException {
        ContentResolver contentResolver;
        Intrinsics.m32180i(sink, "sink");
        OutputStream mo34548i1 = sink.mo34548i1();
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            try {
                Context context = this.f30709a;
                if (context != null && (contentResolver = context.getContentResolver()) != null) {
                    assetFileDescriptor = contentResolver.openAssetFileDescriptor(this.f30710b, "r");
                }
                if (assetFileDescriptor == null) {
                    throw new FileNotFoundException("Cannot open uri: " + this.f30710b);
                }
                FileInputStream createInputStream = assetFileDescriptor.createInputStream();
                Intrinsics.m32175d(createInputStream, "fileDescriptor.createInputStream()");
                byte[] bArr = new byte[RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST];
                while (createInputStream.available() > 0) {
                    try {
                        int read = createInputStream.read(bArr);
                        if (read != -1) {
                            mo34548i1.write(bArr, 0, read);
                            mo34548i1.flush();
                        }
                    } catch (IOException e2) {
                        throw new VKLocalIOException(e2);
                    }
                }
                try {
                    assetFileDescriptor.close();
                } catch (Exception unused) {
                }
            } catch (IOException e3) {
                throw new VKLocalIOException(e3);
            }
        } catch (Throwable th) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }
}
