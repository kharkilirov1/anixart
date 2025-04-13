package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.p025ad.error.InstreamAdPlayerError;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g50 {

    /* renamed from: com.yandex.mobile.ads.impl.g50$a */
    public /* synthetic */ class C5105a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f50509a;

        static {
            int[] iArr = new int[InstreamAdPlayerError.Reason.values().length];
            iArr[InstreamAdPlayerError.Reason.RENDERER_FAILED_DEQUEUE_OUTPUT_BUFFER.ordinal()] = 1;
            iArr[InstreamAdPlayerError.Reason.RENDERER_FAILED_DEQUEUE_INPUT_BUFFER.ordinal()] = 2;
            iArr[InstreamAdPlayerError.Reason.RENDERER_FAILED_STOP.ordinal()] = 3;
            iArr[InstreamAdPlayerError.Reason.RENDERER_FAILED_SET_SURFACE.ordinal()] = 4;
            iArr[InstreamAdPlayerError.Reason.RENDERER_FAILED_RELEASE_OUTPUT_BUFFER.ordinal()] = 5;
            iArr[InstreamAdPlayerError.Reason.RENDERER_FAILED_QUEUE_SECURE_INPUT_BUFFER.ordinal()] = 6;
            iArr[InstreamAdPlayerError.Reason.RENDERER_MEDIA_CODEC_UNKNOWN.ordinal()] = 7;
            iArr[InstreamAdPlayerError.Reason.TIMEOUT.ordinal()] = 8;
            iArr[InstreamAdPlayerError.Reason.ILLEGAL_SEEK_POSITION.ordinal()] = 9;
            iArr[InstreamAdPlayerError.Reason.DECODER_QUERY_ERROR.ordinal()] = 10;
            iArr[InstreamAdPlayerError.Reason.DECODER_INITIALIZATION_ERROR.ordinal()] = 11;
            iArr[InstreamAdPlayerError.Reason.DECODER_UNKNOWN_ERROR.ordinal()] = 12;
            iArr[InstreamAdPlayerError.Reason.BEHIND_LIVE_WINDOW_ERROR.ordinal()] = 13;
            iArr[InstreamAdPlayerError.Reason.DRM_KEYS_EXPIRED.ordinal()] = 14;
            iArr[InstreamAdPlayerError.Reason.DRM_MEDIA_RESOURCE_BUSY.ordinal()] = 15;
            iArr[InstreamAdPlayerError.Reason.DRM_SESSION_ERROR.ordinal()] = 16;
            iArr[InstreamAdPlayerError.Reason.HTTP_CLEARTEXT_NOT_PERMITTED.ordinal()] = 17;
            iArr[InstreamAdPlayerError.Reason.HTTP_CODE_UNAUTHORIZED.ordinal()] = 18;
            iArr[InstreamAdPlayerError.Reason.HTTP_CODE_FORBIDDEN.ordinal()] = 19;
            iArr[InstreamAdPlayerError.Reason.HTTP_CODE_NOT_FOUND.ordinal()] = 20;
            iArr[InstreamAdPlayerError.Reason.HTTP_CODE_UNKNOWN.ordinal()] = 21;
            iArr[InstreamAdPlayerError.Reason.SSL_HANDSHAKE_ERROR.ordinal()] = 22;
            iArr[InstreamAdPlayerError.Reason.NETWORK_UNAVAILABLE.ordinal()] = 23;
            iArr[InstreamAdPlayerError.Reason.CONTENT_PARSER_ERROR.ordinal()] = 24;
            iArr[InstreamAdPlayerError.Reason.LOADER_UNEXPECTED_ERROR.ordinal()] = 25;
            iArr[InstreamAdPlayerError.Reason.AUDIO_ERROR.ordinal()] = 26;
            iArr[InstreamAdPlayerError.Reason.SUBTITLE_ERROR.ordinal()] = 27;
            iArr[InstreamAdPlayerError.Reason.CACHE_ERROR.ordinal()] = 28;
            iArr[InstreamAdPlayerError.Reason.UNKNOWN.ordinal()] = 29;
            f50509a = iArr;
        }
    }

    @NotNull
    /* renamed from: a */
    public static ed1 m24806a(@NotNull InstreamAdPlayerError instreamAdPlayerError) {
        int i2;
        Intrinsics.m32179h(instreamAdPlayerError, "instreamAdPlayerError");
        switch (C5105a.f50509a[instreamAdPlayerError.getReason().ordinal()]) {
            case 1:
                i2 = 1;
                break;
            case 2:
                i2 = 2;
                break;
            case 3:
                i2 = 3;
                break;
            case 4:
                i2 = 4;
                break;
            case 5:
                i2 = 5;
                break;
            case 6:
                i2 = 6;
                break;
            case 7:
                i2 = 7;
                break;
            case 8:
                i2 = 8;
                break;
            case 9:
                i2 = 9;
                break;
            case 10:
                i2 = 10;
                break;
            case 11:
                i2 = 11;
                break;
            case 12:
                i2 = 12;
                break;
            case 13:
                i2 = 13;
                break;
            case 14:
                i2 = 14;
                break;
            case 15:
                i2 = 15;
                break;
            case 16:
                i2 = 16;
                break;
            case 17:
                i2 = 17;
                break;
            case 18:
                i2 = 18;
                break;
            case 19:
                i2 = 19;
                break;
            case 20:
                i2 = 20;
                break;
            case 21:
                i2 = 21;
                break;
            case 22:
                i2 = 22;
                break;
            case 23:
                i2 = 23;
                break;
            case 24:
                i2 = 24;
                break;
            case 25:
                i2 = 25;
                break;
            case 26:
                i2 = 26;
                break;
            case 27:
                i2 = 27;
                break;
            case 28:
                i2 = 28;
                break;
            case 29:
                i2 = 29;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new ed1(i2, instreamAdPlayerError.getUnderlyingError());
    }
}
