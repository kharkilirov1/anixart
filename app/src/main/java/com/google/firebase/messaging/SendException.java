package com.google.firebase.messaging;

import java.util.Locale;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class SendException extends Exception {
    public SendException(String str) {
        super(str);
        if (str == null) {
            return;
        }
        Objects.requireNonNull(str.toLowerCase(Locale.US));
    }
}
