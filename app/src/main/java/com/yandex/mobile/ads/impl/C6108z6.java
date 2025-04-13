package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaDrmResetException;
import android.media.ResourceBusyException;
import android.os.Build;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoTimeoutException;
import com.google.android.exoplayer2.IllegalSeekPositionException;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.KeysExpiredException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.google.android.exoplayer2.video.MediaCodecVideoDecoderException;
import com.yandex.mobile.ads.instream.player.p025ad.error.InstreamAdPlayerError;
import javax.net.ssl.SSLHandshakeException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.z6 */
/* loaded from: classes3.dex */
public final class C6108z6 {
    /* renamed from: a */
    private static InstreamAdPlayerError.Reason m30063a(Throwable th) {
        InstreamAdPlayerError.Reason reason;
        if (th instanceof ExoPlaybackException) {
            InstreamAdPlayerError.Reason m30064b = m30064b(th);
            if (m30064b != null) {
                return m30064b;
            }
            Throwable cause = th.getCause();
            InstreamAdPlayerError.Reason m30063a = cause != null ? m30063a(cause) : null;
            if (m30063a != null) {
                return m30063a;
            }
            reason = InstreamAdPlayerError.Reason.UNKNOWN;
        } else if (th instanceof ExoTimeoutException) {
            reason = InstreamAdPlayerError.Reason.TIMEOUT;
        } else if (th instanceof IllegalSeekPositionException) {
            reason = InstreamAdPlayerError.Reason.ILLEGAL_SEEK_POSITION;
        } else if (th instanceof MediaCodecUtil.DecoderQueryException) {
            reason = InstreamAdPlayerError.Reason.DECODER_QUERY_ERROR;
        } else if (th instanceof MediaCodecRenderer.DecoderInitializationException) {
            reason = InstreamAdPlayerError.Reason.DECODER_INITIALIZATION_ERROR;
        } else if (th instanceof MediaCodecVideoDecoderException) {
            InstreamAdPlayerError.Reason m30064b2 = m30064b(th);
            if (m30064b2 != null) {
                return m30064b2;
            }
            reason = InstreamAdPlayerError.Reason.DECODER_UNKNOWN_ERROR;
        } else if (th instanceof BehindLiveWindowException) {
            reason = InstreamAdPlayerError.Reason.BEHIND_LIVE_WINDOW_ERROR;
        } else if (th instanceof MediaCodec.CryptoException) {
            reason = InstreamAdPlayerError.Reason.DRM_KEYS_EXPIRED;
        } else if (th instanceof DrmSession.DrmSessionException) {
            Throwable cause2 = ((DrmSession.DrmSessionException) th).getCause();
            reason = cause2 == null ? InstreamAdPlayerError.Reason.DRM_SESSION_ERROR : ((Build.VERSION.SDK_INT < 23 || !(cause2 instanceof MediaDrmResetException)) && !(cause2 instanceof ResourceBusyException)) ? ((cause2 instanceof MediaCodec.CryptoException) || (cause2 instanceof KeysExpiredException)) ? InstreamAdPlayerError.Reason.DRM_KEYS_EXPIRED : InstreamAdPlayerError.Reason.DRM_SESSION_ERROR : InstreamAdPlayerError.Reason.DRM_MEDIA_RESOURCE_BUSY;
        } else if (th instanceof HttpDataSource.CleartextNotPermittedException) {
            reason = InstreamAdPlayerError.Reason.HTTP_CLEARTEXT_NOT_PERMITTED;
        } else if (th instanceof HttpDataSource.InvalidResponseCodeException) {
            int i2 = ((HttpDataSource.InvalidResponseCodeException) th).f14458d;
            reason = i2 != 401 ? i2 != 403 ? i2 != 404 ? InstreamAdPlayerError.Reason.HTTP_CODE_UNKNOWN : InstreamAdPlayerError.Reason.HTTP_CODE_NOT_FOUND : InstreamAdPlayerError.Reason.HTTP_CODE_FORBIDDEN : InstreamAdPlayerError.Reason.HTTP_CODE_UNAUTHORIZED;
        } else if (th instanceof HttpDataSource.HttpDataSourceException) {
            reason = ((HttpDataSource.HttpDataSourceException) th).getCause() instanceof SSLHandshakeException ? InstreamAdPlayerError.Reason.SSL_HANDSHAKE_ERROR : InstreamAdPlayerError.Reason.NETWORK_UNAVAILABLE;
        } else if (th instanceof ParserException) {
            reason = InstreamAdPlayerError.Reason.CONTENT_PARSER_ERROR;
        } else if (th instanceof Loader.UnexpectedLoaderException) {
            reason = InstreamAdPlayerError.Reason.LOADER_UNEXPECTED_ERROR;
        } else {
            if (th instanceof AudioSink.ConfigurationException ? true : th instanceof AudioSink.InitializationException ? true : th instanceof DefaultAudioSink.InvalidAudioTrackTimestampException) {
                reason = InstreamAdPlayerError.Reason.AUDIO_ERROR;
            } else if (th instanceof SubtitleDecoderException) {
                reason = InstreamAdPlayerError.Reason.SUBTITLE_ERROR;
            } else {
                reason = th instanceof Cache.CacheException ? true : th instanceof CacheDataSink.CacheDataSinkException ? InstreamAdPlayerError.Reason.CACHE_ERROR : InstreamAdPlayerError.Reason.UNKNOWN;
            }
        }
        return reason;
    }

    /* renamed from: b */
    private static InstreamAdPlayerError.Reason m30064b(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null) {
            return null;
        }
        if (!(cause instanceof MediaCodec.CodecException) && !(cause instanceof IllegalStateException) && !(cause instanceof IllegalArgumentException)) {
            return null;
        }
        StackTraceElement[] stackTrace = cause.getStackTrace();
        Intrinsics.m32178g(stackTrace, "stackTrace");
        if (!(!(stackTrace.length == 0)) || !stackTrace[0].isNativeMethod() || !Intrinsics.m32174c(stackTrace[0].getClassName(), "android.media.MediaCodec")) {
            return null;
        }
        String methodName = stackTrace[0].getMethodName();
        if (methodName == null) {
            methodName = "";
        }
        if (Intrinsics.m32174c(methodName, "native_dequeueOutputBuffer")) {
            return InstreamAdPlayerError.Reason.RENDERER_FAILED_DEQUEUE_OUTPUT_BUFFER;
        }
        if (Intrinsics.m32174c(methodName, "native_dequeueInputBuffer")) {
            return InstreamAdPlayerError.Reason.RENDERER_FAILED_DEQUEUE_INPUT_BUFFER;
        }
        if (Intrinsics.m32174c(methodName, "native_stop")) {
            return InstreamAdPlayerError.Reason.RENDERER_FAILED_STOP;
        }
        if (Intrinsics.m32174c(methodName, "native_setSurface")) {
            return InstreamAdPlayerError.Reason.RENDERER_FAILED_SET_SURFACE;
        }
        if (Intrinsics.m32174c(methodName, "releaseOutputBuffer")) {
            return InstreamAdPlayerError.Reason.RENDERER_FAILED_RELEASE_OUTPUT_BUFFER;
        }
        if (Intrinsics.m32174c(methodName, "native_queueSecureInputBuffer")) {
            return InstreamAdPlayerError.Reason.RENDERER_FAILED_QUEUE_SECURE_INPUT_BUFFER;
        }
        if (cause instanceof MediaCodec.CodecException) {
            return InstreamAdPlayerError.Reason.RENDERER_MEDIA_CODEC_UNKNOWN;
        }
        return null;
    }

    @NotNull
    /* renamed from: c */
    public static InstreamAdPlayerError m30065c(@NotNull Throwable throwable) {
        Intrinsics.m32179h(throwable, "throwable");
        return new InstreamAdPlayerError(m30063a(throwable), throwable);
    }
}
