package com.yandex.mobile.ads.exo.drm;

import android.media.MediaDrm;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.impl.s91;

@RequiresApi
/* renamed from: com.yandex.mobile.ads.exo.drm.i */
/* loaded from: classes2.dex */
final class C4722i {
    @DoNotInline
    /* renamed from: a */
    public static boolean m22188a(@Nullable Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    @DoNotInline
    /* renamed from: b */
    public static int m22189b(Throwable th) {
        int m28093a = s91.m28093a(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo());
        if (m28093a != 2 && m28093a != 4) {
            if (m28093a != 10) {
                if (m28093a != 7) {
                    if (m28093a != 8) {
                        switch (m28093a) {
                            case 15:
                                break;
                            case 16:
                            case 18:
                                break;
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                break;
                            default:
                                switch (m28093a) {
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                        return 6002;
                                    default:
                                        return 6006;
                                }
                        }
                    }
                    return 6003;
                }
            }
            return 6004;
        }
        return 6005;
    }
}
