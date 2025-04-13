package com.google.android.gms.common.server.response;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.Stack;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes.dex */
public class FastParser<T extends FastJsonResponse> {

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @ShowFirstParty
    @KeepForSdk
    public static class ParseException extends Exception {
    }

    public FastParser() {
        new Stack();
    }
}
