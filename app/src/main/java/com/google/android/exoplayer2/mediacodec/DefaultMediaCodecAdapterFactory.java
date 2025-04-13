package com.google.android.exoplayer2.mediacodec;

import android.util.Log;
import com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;
import com.google.android.exoplayer2.mediacodec.SynchronousMediaCodecAdapter;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* loaded from: classes.dex */
public final class DefaultMediaCodecAdapterFactory implements MediaCodecAdapter.Factory {
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory
    /* renamed from: a */
    public MediaCodecAdapter mo6621a(MediaCodecAdapter.Configuration configuration) throws IOException {
        String str;
        if (Util.f14736a < 31) {
            return new SynchronousMediaCodecAdapter.Factory().mo6621a(configuration);
        }
        int m7601i = MimeTypes.m7601i(configuration.f11875c.f9659m);
        switch (m7601i) {
            case -2:
                str = "none";
                break;
            case -1:
            default:
                if (m7601i < 10000) {
                    str = "?";
                    break;
                } else {
                    StringBuilder sb = new StringBuilder(20);
                    sb.append("custom (");
                    sb.append(m7601i);
                    sb.append(")");
                    str = sb.toString();
                    break;
                }
            case 0:
                str = "default";
                break;
            case 1:
                str = "audio";
                break;
            case 2:
                str = "video";
                break;
            case 3:
                str = "text";
                break;
            case 4:
                str = "image";
                break;
            case 5:
                str = "metadata";
                break;
            case 6:
                str = "camera motion";
                break;
        }
        String valueOf = String.valueOf(str);
        Log.i("DefaultMediaCodecAdapterFactory", valueOf.length() != 0 ? "Creating an asynchronous MediaCodec adapter for track type ".concat(valueOf) : new String("Creating an asynchronous MediaCodec adapter for track type "));
        return new AsynchronousMediaCodecAdapter.Factory(m7601i, false, true).mo6621a(configuration);
    }
}
