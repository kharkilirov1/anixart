package com.yandex.mobile.ads.instream.player.p025ad.error;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class InstreamAdPlayerError {

    /* renamed from: a */
    @NonNull
    private final Reason f57458a;

    /* renamed from: b */
    @NonNull
    private final Throwable f57459b;

    public enum Reason {
        RENDERER_FAILED_DEQUEUE_OUTPUT_BUFFER,
        RENDERER_FAILED_DEQUEUE_INPUT_BUFFER,
        RENDERER_FAILED_STOP,
        RENDERER_FAILED_SET_SURFACE,
        RENDERER_FAILED_RELEASE_OUTPUT_BUFFER,
        RENDERER_FAILED_QUEUE_SECURE_INPUT_BUFFER,
        RENDERER_MEDIA_CODEC_UNKNOWN,
        TIMEOUT,
        ILLEGAL_SEEK_POSITION,
        DECODER_QUERY_ERROR,
        DECODER_INITIALIZATION_ERROR,
        DECODER_UNKNOWN_ERROR,
        BEHIND_LIVE_WINDOW_ERROR,
        DRM_KEYS_EXPIRED,
        DRM_MEDIA_RESOURCE_BUSY,
        DRM_SESSION_ERROR,
        HTTP_CLEARTEXT_NOT_PERMITTED,
        HTTP_CODE_UNAUTHORIZED,
        HTTP_CODE_FORBIDDEN,
        HTTP_CODE_NOT_FOUND,
        HTTP_CODE_UNKNOWN,
        SSL_HANDSHAKE_ERROR,
        NETWORK_UNAVAILABLE,
        CONTENT_PARSER_ERROR,
        LOADER_UNEXPECTED_ERROR,
        AUDIO_ERROR,
        SUBTITLE_ERROR,
        CACHE_ERROR,
        UNKNOWN;

        Reason() {
        }
    }

    public InstreamAdPlayerError(@NonNull Reason reason, @NonNull Throwable th) {
        this.f57458a = reason;
        this.f57459b = th;
    }

    @NonNull
    public Reason getReason() {
        return this.f57458a;
    }

    @NonNull
    public Throwable getUnderlyingError() {
        return this.f57459b;
    }
}
