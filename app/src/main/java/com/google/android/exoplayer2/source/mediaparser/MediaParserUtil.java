package com.google.android.exoplayer2.source.mediaparser;

import android.media.MediaFormat;
import com.google.android.exoplayer2.Format;

/* loaded from: classes.dex */
public final class MediaParserUtil {
    /* renamed from: a */
    public static MediaFormat m7171a(Format format) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", format.f9659m);
        int i2 = format.f9645E;
        if (i2 != -1) {
            mediaFormat.setInteger("caption-service-number", i2);
        }
        return mediaFormat;
    }
}
